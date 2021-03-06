package SyntacticAnalyzer;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;

public class ChocolateException extends RecognitionException {
    private String msg;
    public static final long serialVersionUID = 24162462L; // for Serializable

    // Ctor which only requires the error message to be printed.
    public ChocolateException(String msg) {
        super();
        this.msg = msg;
    }

    // Ctor that takes a node of the AST tree (i.e. IDENTIFIER) and
    // the error message to build a more informative error message.
    public ChocolateException(Tree tree, String msg) {
        super();
        this.msg = tree.getText() +
                " (" + tree.getLine() +
                ":" + tree.getCharPositionInLine() +
                ") " + msg;
    }

    @Override
    public String getMessage() {
        return this.msg;
    }
    
    /**
     * @param tree the tree to get a nicely formatted String representation from
     * @return a nicely formatted representation of this tree, including the textual representation and the line and position it was declared
     */
    public static String formatTree(Tree tree){
    	return "'" + tree.getText() + 
                "' (" + tree.getLine() + 
                ":" + tree.getCharPositionInLine() + 
                ") ";
    }
}
