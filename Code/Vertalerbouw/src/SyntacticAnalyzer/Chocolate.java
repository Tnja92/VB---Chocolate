package SyntacticAnalyzer;

import AST.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.EnumSet;
import java.util.Set;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.BufferedTreeNodeStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.runtime.tree.TreeNodeStream;
import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;

import ContextualAnalyzer.*;
import CodeGenerator.*;

/**
 * Program that creates all big components of the translator and starts tehe translator
 * @author Tanja de Jong & Kim Beunder
 */
public class Chocolate {
	/** A set of options which can be indicated by user to add or remove at the start of program */
    private static final Set<Option> options = EnumSet.noneOf(Option.class);
    
    /** Name of source file */
    private static String inputFile;
    
    /** Name of destination file */
    private static String outputFile;
    
    /**
     * Request for source filename
     * @return filename of source
     */
    public static String getFileName(){
    	return inputFile;
    }
    
    /**
     * Request for source classname
     * @return classname of source
     */
    public static String getClassName(){
    	String fname = getFileName();
    	String[] pieces = fname.split("\\.");
    	String classn = pieces[0].substring(0,1).toUpperCase()+pieces[0].toLowerCase().substring(1);
    	return classn;
    }

    /**
     * Reads all given arguments and tries to determine which options the user wants and 
     * what the input and output files are
     * @param args, arguments given by user to run program
     */
    public static void parseOptions(String[] args) {
        if (args.length == 0) {
            System.err.println(USAGE_MESSAGE);
            System.exit(1);
        }
        for (int i=0; i<args.length; i++) {
            try {
                Option option = getOption(args[i]);
                if (option == null) {
                	if (options.contains(Option.CODE_GENERATOR)) {
                		if (i == args.length - 2) {
                			inputFile = args[i];
                		} else if (i == args.length - 1) {
                			outputFile = args[i];
                		} else {
                			System.out.println(i + " :  " +args[i]);
                			System.err.println("File names '%s' should be last arguments1");
                            System.exit(1);
                		}
                	} else if (i < args.length - 1) {
                		System.err.println("Input file name '%s' should be last argument2");
                        System.exit(1);
            		} else {
            			inputFile = args[i];
            		}
                } else {
                    options.add(option);
                }
            } catch (IllegalArgumentException exc) {
                System.err.println(exc.getMessage());
                System.err.println(USAGE_MESSAGE);
                System.exit(1);
            }
        }
    }

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        parseOptions(args);

        try {
            InputStream in = inputFile == null ? System.in : new FileInputStream(inputFile);
            OutputStream outStream = outputFile == null ? System.out : new FileOutputStream(outputFile);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(outStream));
            
            ChocolateLexer lexer = new ChocolateLexer(new ANTLRInputStream(in));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ChocolateParser parser = new ChocolateParser(tokens);
            parser.setTreeAdaptor(new ChocolateTreeAdaptor());
            
            ChocolateParser.program_return result = parser.program();
            CommonTree tree = (CommonTree) result.getTree();

            /* if (!options.contains(Option.NO_CHECKER)) {      // check the AST
                CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
                ChocolateChecker checker = new ChocolateChecker(nodes);
                tree = checker.program().getTree();
            } */

           /* if (options.contains(Option.CODE_GENERATOR)) {
            	  TreeNodeStream nodes = new BufferedTreeNodeStream(tree);
                  ChocolateCodeGenerator generator = new ChocolateCodeGenerator(nodes);
                  StringTemplateGroup stg = new StringTemplateGroup("GenTemplates",new File(".").getCanonicalPath()+"/stringTemplates");
                  generator.setTemplateLib(stg);
                  String genout = generator.program().st.toString();
                  out.write(genout);
            }*/

            if (options.contains(Option.AST)) {          // print the AST as string
                System.out.println(tree.toStringTree());
            }

            if (options.contains(Option.DOT)) {   // print the AST as DOT specification
                DOTTreeGenerator gen = new DOTTreeGenerator();
                StringTemplate st = gen.toDOT(tree);
                System.out.println(st);
            }

        } catch (ChocolateException e) {
            System.err.print("ERROR: ChocolateException thrown by compiler: ");
            System.err.println(e.getMessage());
        } catch (RecognitionException e) {
            System.err.print("ERROR: recognition exception thrown by compiler: ");
            System.err.println(e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.print("ERROR: uncaught exception thrown by compiler: ");
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Determines the option by means of given text
     * @param text, the text that is supposed to represent an option
     * @return the recognized option; returns null if option does not exist
     * @throws IllegalArgumentException
     */
    private static Option getOption(String text) throws IllegalArgumentException {
        if (!text.startsWith(OPTION_PREFIX)) {
            return null;
        }
        String stripped = text.substring(OPTION_PREFIX.length());
        for (Option option: Option.values()) {
            if (option.getText().equals(stripped)) {
                return option;
            }
        }
        throw new IllegalArgumentException(String.format("Illegal option value '%s'", text));
    }

    /**
     * 
     */
    private static final String USAGE_MESSAGE;

    static {
        StringBuilder message = new StringBuilder("Usage:");
        for (Option option: Option.values()) {
            message.append(" [");
            message.append(option.getText());
            message.append("]");
        }
        message.append(" [filename]");
        USAGE_MESSAGE = message.toString();
    }

    /**
     * Represents an option
     */
    private static enum Option {
        DOT,
        AST,
        NO_CHECKER,
        CODE_GENERATOR;

        /** Makes a new option */
        private Option() {
            this.text = name().toLowerCase();
        }

        /** Returns the option text of this option. */
        public String getText() {
            return this.text;
        }

        /** The text representation of the option */
        private final String text;
    }

    /** The option prefix, all options must start with this prefix */
    private static final String OPTION_PREFIX = "-";
}
