// $ANTLR 3.5 C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g 2013-07-09 11:33:32

    package CodeGenerator;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
@SuppressWarnings("all")
public class ChocolateCodeGenerator extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ASSIGN", "BOOLEAN", "BOOLEAN_OPERATOR", 
		"CHAR", "CHAR_OPERATOR", "COLON", "COMMA", "COMMENT", "CONSTANT", "DIGIT", 
		"DIV", "DQUOTATION", "ELSE", "EQ", "GREAT", "GREATEQ", "IDENTIFIER", "IF", 
		"INTEGER", "LCURLY", "LESS", "LESSEQ", "LETTER", "LOWER", "LPAREN", "MIN", 
		"MOD", "MULT", "NEG", "NOT", "NOTEQ", "NUMBER", "OR", "PLUS", "POS", "PRINT", 
		"PROGRAM", "QUOTATION", "RCURLY", "READ", "RPAREN", "SEMICOLON", "THEN", 
		"UPPER", "VAR", "WS", "STRING"
	};
	public static final int EOF=-1;
	public static final int AND=4;
	public static final int ASSIGN=5;
	public static final int BOOLEAN=6;
	public static final int BOOLEAN_OPERATOR=7;
	public static final int CHAR=8;
	public static final int CHAR_OPERATOR=9;
	public static final int COLON=10;
	public static final int COMMA=11;
	public static final int COMMENT=12;
	public static final int CONSTANT=13;
	public static final int DIGIT=14;
	public static final int DIV=15;
	public static final int DQUOTATION=16;
	public static final int ELSE=17;
	public static final int EQ=18;
	public static final int GREAT=19;
	public static final int GREATEQ=20;
	public static final int IDENTIFIER=21;
	public static final int IF=22;
	public static final int INTEGER=23;
	public static final int LCURLY=24;
	public static final int LESS=25;
	public static final int LESSEQ=26;
	public static final int LETTER=27;
	public static final int LOWER=28;
	public static final int LPAREN=29;
	public static final int MIN=30;
	public static final int MOD=31;
	public static final int MULT=32;
	public static final int NEG=33;
	public static final int NOT=34;
	public static final int NOTEQ=35;
	public static final int NUMBER=36;
	public static final int OR=37;
	public static final int PLUS=38;
	public static final int POS=39;
	public static final int PRINT=40;
	public static final int PROGRAM=41;
	public static final int QUOTATION=42;
	public static final int RCURLY=43;
	public static final int READ=44;
	public static final int RPAREN=45;
	public static final int SEMICOLON=46;
	public static final int THEN=47;
	public static final int UPPER=48;
	public static final int VAR=49;
	public static final int WS=50;
	public static final int STRING=51;

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public ChocolateCodeGenerator(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public ChocolateCodeGenerator(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected StringTemplateGroup templateLib =
	  new StringTemplateGroup("ChocolateCodeGeneratorTemplates", AngleBracketTemplateLexer.class);

	public void setTemplateLib(StringTemplateGroup templateLib) {
	  this.templateLib = templateLib;
	}
	public StringTemplateGroup getTemplateLib() {
	  return templateLib;
	}
	/** allows convenient multi-value initialization:
	 *  "new STAttrMap().put(...).put(...)"
	 */
	@SuppressWarnings("serial")
	public static class STAttrMap extends HashMap<String, Object> {
		public STAttrMap put(String attrName, Object value) {
			super.put(attrName, value);
			return this;
		}
	}
	@Override public String[] getTokenNames() { return ChocolateCodeGenerator.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g"; }


	    private int LbNr = 0;
	    private int Lnr = 0;
	    private int getLbNr() { LbNr++; return LbNr; }
	    private int getLNr() { LNr++; return (LNr-1); }


	public static class program_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "program"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:21:1: program : ^( PROGRAM (lines+= line )+ ) -> program(sourceF=Chocolate.getFilename()classN=Chocolate.getClassname()lines=$lines);
	public final ChocolateCodeGenerator.program_return program() throws RecognitionException {
		ChocolateCodeGenerator.program_return retval = new ChocolateCodeGenerator.program_return();
		retval.start = input.LT(1);

		List<Object> list_lines=null;
		RuleReturnScope lines = null;
		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:22:5: ( ^( PROGRAM (lines+= line )+ ) -> program(sourceF=Chocolate.getFilename()classN=Chocolate.getClassname()lines=$lines))
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:22:9: ^( PROGRAM (lines+= line )+ )
			{
			match(input,PROGRAM,FOLLOW_PROGRAM_in_program100); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:22:19: (lines+= line )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ASSIGN||LA1_0==CONSTANT||LA1_0==IF||LA1_0==PRINT||LA1_0==READ||LA1_0==VAR) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:22:20: lines+= line
					{
					pushFollow(FOLLOW_line_in_program105);
					lines=line();
					state._fsp--;
					if (state.failed) return retval;
					if (list_lines==null) list_lines=new ArrayList<Object>();
					list_lines.add(lines.getTemplate());
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 22:45: -> program(sourceF=Chocolate.getFilename()classN=Chocolate.getClassname()lines=$lines)
			  {
			  	retval.st = templateLib.getInstanceOf("program",new STAttrMap().put("sourceF", Chocolate.getFilename()).put("classN", Chocolate.getClassname()).put("lines", list_lines));
			  }


			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class line_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "line"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:25:1: line : ( (decls+= declaration )* state= statement ) -> line(decls=$declsstate=$state.st);
	public final ChocolateCodeGenerator.line_return line() throws RecognitionException {
		ChocolateCodeGenerator.line_return retval = new ChocolateCodeGenerator.line_return();
		retval.start = input.LT(1);

		List<Object> list_decls=null;
		TreeRuleReturnScope state =null;
		RuleReturnScope decls = null;
		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:26:5: ( ( (decls+= declaration )* state= statement ) -> line(decls=$declsstate=$state.st))
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:26:7: ( (decls+= declaration )* state= statement )
			{
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:26:7: ( (decls+= declaration )* state= statement )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:26:8: (decls+= declaration )* state= statement
			{
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:26:13: (decls+= declaration )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==CONSTANT||LA2_0==VAR) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:26:13: decls+= declaration
					{
					pushFollow(FOLLOW_declaration_in_line159);
					decls=declaration();
					state._fsp--;
					if (state.failed) return retval;
					if (list_decls==null) list_decls=new ArrayList<Object>();
					list_decls.add(decls.getTemplate());
					}
					break;

				default :
					break loop2;
				}
			}

			pushFollow(FOLLOW_statement_in_line164);
			state=statement();
			state._fsp--;
			if (state.failed) return retval;
			}

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 26:45: -> line(decls=$declsstate=$state.st)
			  {
			  	retval.st = templateLib.getInstanceOf("line",new STAttrMap().put("decls", list_decls).put("state", (state!=null?((StringTemplate)state.getTemplate()):null)));
			  }


			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "line"


	public static class declaration_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "declaration"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:29:1: declaration : ( ^( CONSTANT ext= constant_extension ) -> constant(extension=$ext.stlnr=getLNr();)| ^( VAR ext= var_extension ) -> var(extension=$ext.stlnr=getLNr();));
	public final ChocolateCodeGenerator.declaration_return declaration() throws RecognitionException {
		ChocolateCodeGenerator.declaration_return retval = new ChocolateCodeGenerator.declaration_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope ext =null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:30:5: ( ^( CONSTANT ext= constant_extension ) -> constant(extension=$ext.stlnr=getLNr();)| ^( VAR ext= var_extension ) -> var(extension=$ext.stlnr=getLNr();))
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==CONSTANT) ) {
				alt3=1;
			}
			else if ( (LA3_0==VAR) ) {
				alt3=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:30:9: ^( CONSTANT ext= constant_extension )
					{
					match(input,CONSTANT,FOLLOW_CONSTANT_in_declaration198); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_constant_extension_in_declaration202);
					ext=constant_extension();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 30:45: -> constant(extension=$ext.stlnr=getLNr();)
					  {
					  	retval.st = templateLib.getInstanceOf("constant",new STAttrMap().put("extension", (ext!=null?((StringTemplate)ext.getTemplate()):null)).put("lnr", getLNr();));
					  }


					}

					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:31:9: ^( VAR ext= var_extension )
					{
					match(input,VAR,FOLLOW_VAR_in_declaration228); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_var_extension_in_declaration232);
					ext=var_extension();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 31:45: -> var(extension=$ext.stlnr=getLNr();)
					  {
					  	retval.st = templateLib.getInstanceOf("var",new STAttrMap().put("extension", (ext!=null?((StringTemplate)ext.getTemplate()):null)).put("lnr", getLNr();));
					  }


					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declaration"


	public static class constant_extension_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "constant_extension"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:34:1: constant_extension : (t= INTEGER (ids+= IDENTIFIER )+ ASSIGN e= ( single_expr | closed_compound_expr ) -> conInt(ids=$idse=$e.st)|t= CHAR (ids+= IDENTIFIER )+ ASSIGN co= CHAR_OPERATOR -> conChar(ids=$idsco=$co)|t= BOOLEAN (ids+= IDENTIFIER )+ ASSIGN bo= BOOLEAN_OPERATOR -> conBool(ids=idsbo=$bo));
	public final ChocolateCodeGenerator.constant_extension_return constant_extension() throws RecognitionException {
		ChocolateCodeGenerator.constant_extension_return retval = new ChocolateCodeGenerator.constant_extension_return();
		retval.start = input.LT(1);

		CommonTree t=null;
		CommonTree e=null;
		CommonTree co=null;
		CommonTree bo=null;
		CommonTree ids=null;
		List<Object> list_ids=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:35:5: (t= INTEGER (ids+= IDENTIFIER )+ ASSIGN e= ( single_expr | closed_compound_expr ) -> conInt(ids=$idse=$e.st)|t= CHAR (ids+= IDENTIFIER )+ ASSIGN co= CHAR_OPERATOR -> conChar(ids=$idsco=$co)|t= BOOLEAN (ids+= IDENTIFIER )+ ASSIGN bo= BOOLEAN_OPERATOR -> conBool(ids=idsbo=$bo))
			int alt8=3;
			switch ( input.LA(1) ) {
			case INTEGER:
				{
				alt8=1;
				}
				break;
			case CHAR:
				{
				alt8=2;
				}
				break;
			case BOOLEAN:
				{
				alt8=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:35:9: t= INTEGER (ids+= IDENTIFIER )+ ASSIGN e= ( single_expr | closed_compound_expr )
					{
					t=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_constant_extension286); if (state.failed) return retval;
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:35:22: (ids+= IDENTIFIER )+
					int cnt4=0;
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==IDENTIFIER) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:35:22: ids+= IDENTIFIER
							{
							ids=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant_extension290); if (state.failed) return retval;
							if (list_ids==null) list_ids=new ArrayList<Object>();
							list_ids.add(ids);
							}
							break;

						default :
							if ( cnt4 >= 1 ) break loop4;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(4, input);
							throw eee;
						}
						cnt4++;
					}

					match(input,ASSIGN,FOLLOW_ASSIGN_in_constant_extension293); if (state.failed) return retval;
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:35:45: ( single_expr | closed_compound_expr )
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==AND||LA5_0==BOOLEAN_OPERATOR||LA5_0==CHAR_OPERATOR||LA5_0==DIV||(LA5_0 >= EQ && LA5_0 <= IDENTIFIER)||(LA5_0 >= LESS && LA5_0 <= LESSEQ)||(LA5_0 >= LPAREN && LA5_0 <= POS)) ) {
						alt5=1;
					}
					else if ( (LA5_0==LCURLY) ) {
						alt5=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 5, 0, input);
						throw nvae;
					}

					switch (alt5) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:35:46: single_expr
							{
							pushFollow(FOLLOW_single_expr_in_constant_extension298);
							e=single_expr();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;
						case 2 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:35:60: closed_compound_expr
							{
							pushFollow(FOLLOW_closed_compound_expr_in_constant_extension302);
							e=closed_compound_expr();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

					}

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 35:85: -> conInt(ids=$idse=$e.st)
					  {
					  	retval.st = templateLib.getInstanceOf("conInt",new STAttrMap().put("ids", list_ids).put("e", e.st));
					  }


					}

					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:36:9: t= CHAR (ids+= IDENTIFIER )+ ASSIGN co= CHAR_OPERATOR
					{
					t=(CommonTree)match(input,CHAR,FOLLOW_CHAR_in_constant_extension331); if (state.failed) return retval;
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:36:19: (ids+= IDENTIFIER )+
					int cnt6=0;
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==IDENTIFIER) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:36:19: ids+= IDENTIFIER
							{
							ids=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant_extension335); if (state.failed) return retval;
							if (list_ids==null) list_ids=new ArrayList<Object>();
							list_ids.add(ids);
							}
							break;

						default :
							if ( cnt6 >= 1 ) break loop6;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(6, input);
							throw eee;
						}
						cnt6++;
					}

					match(input,ASSIGN,FOLLOW_ASSIGN_in_constant_extension338); if (state.failed) return retval;
					co=(CommonTree)match(input,CHAR_OPERATOR,FOLLOW_CHAR_OPERATOR_in_constant_extension342); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 36:85: -> conChar(ids=$idsco=$co)
					  {
					  	retval.st = templateLib.getInstanceOf("conChar",new STAttrMap().put("ids", list_ids).put("co", co));
					  }


					}

					}
					break;
				case 3 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:37:9: t= BOOLEAN (ids+= IDENTIFIER )+ ASSIGN bo= BOOLEAN_OPERATOR
					{
					t=(CommonTree)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_constant_extension395); if (state.failed) return retval;
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:37:22: (ids+= IDENTIFIER )+
					int cnt7=0;
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0==IDENTIFIER) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:37:22: ids+= IDENTIFIER
							{
							ids=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant_extension399); if (state.failed) return retval;
							if (list_ids==null) list_ids=new ArrayList<Object>();
							list_ids.add(ids);
							}
							break;

						default :
							if ( cnt7 >= 1 ) break loop7;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(7, input);
							throw eee;
						}
						cnt7++;
					}

					match(input,ASSIGN,FOLLOW_ASSIGN_in_constant_extension402); if (state.failed) return retval;
					bo=(CommonTree)match(input,BOOLEAN_OPERATOR,FOLLOW_BOOLEAN_OPERATOR_in_constant_extension406); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 37:85: -> conBool(ids=idsbo=$bo)
					  {
					  	retval.st = templateLib.getInstanceOf("conBool",new STAttrMap().put("ids", ids).put("bo", bo));
					  }


					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constant_extension"


	public static class var_extension_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "var_extension"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:40:1: var_extension : (t= INTEGER (ids+= IDENTIFIER )+ ( ASSIGN e= ( single_expr | closed_compound_expr ) )? -> varInt(ids=$idse=$e.st)|t= CHAR (ids+= IDENTIFIER )+ ( ASSIGN co= CHAR_OPERATOR )? -> varChar(ids=idsco=$co)|t= BOOLEAN (ids+= IDENTIFIER )+ ( ASSIGN bo= BOOLEAN_OPERATOR )? -> varBool(ids=idsbo=$bo));
	public final ChocolateCodeGenerator.var_extension_return var_extension() throws RecognitionException {
		ChocolateCodeGenerator.var_extension_return retval = new ChocolateCodeGenerator.var_extension_return();
		retval.start = input.LT(1);

		CommonTree t=null;
		CommonTree e=null;
		CommonTree co=null;
		CommonTree bo=null;
		CommonTree ids=null;
		List<Object> list_ids=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:41:5: (t= INTEGER (ids+= IDENTIFIER )+ ( ASSIGN e= ( single_expr | closed_compound_expr ) )? -> varInt(ids=$idse=$e.st)|t= CHAR (ids+= IDENTIFIER )+ ( ASSIGN co= CHAR_OPERATOR )? -> varChar(ids=idsco=$co)|t= BOOLEAN (ids+= IDENTIFIER )+ ( ASSIGN bo= BOOLEAN_OPERATOR )? -> varBool(ids=idsbo=$bo))
			int alt16=3;
			switch ( input.LA(1) ) {
			case INTEGER:
				{
				alt16=1;
				}
				break;
			case CHAR:
				{
				alt16=2;
				}
				break;
			case BOOLEAN:
				{
				alt16=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:41:9: t= INTEGER (ids+= IDENTIFIER )+ ( ASSIGN e= ( single_expr | closed_compound_expr ) )?
					{
					t=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_var_extension467); if (state.failed) return retval;
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:41:22: (ids+= IDENTIFIER )+
					int cnt9=0;
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==IDENTIFIER) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:41:22: ids+= IDENTIFIER
							{
							ids=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_var_extension471); if (state.failed) return retval;
							if (list_ids==null) list_ids=new ArrayList<Object>();
							list_ids.add(ids);
							}
							break;

						default :
							if ( cnt9 >= 1 ) break loop9;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(9, input);
							throw eee;
						}
						cnt9++;
					}

					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:41:36: ( ASSIGN e= ( single_expr | closed_compound_expr ) )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==ASSIGN) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:41:37: ASSIGN e= ( single_expr | closed_compound_expr )
							{
							match(input,ASSIGN,FOLLOW_ASSIGN_in_var_extension475); if (state.failed) return retval;
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:41:46: ( single_expr | closed_compound_expr )
							int alt10=2;
							int LA10_0 = input.LA(1);
							if ( (LA10_0==AND||LA10_0==BOOLEAN_OPERATOR||LA10_0==CHAR_OPERATOR||LA10_0==DIV||(LA10_0 >= EQ && LA10_0 <= IDENTIFIER)||(LA10_0 >= LESS && LA10_0 <= LESSEQ)||(LA10_0 >= LPAREN && LA10_0 <= POS)) ) {
								alt10=1;
							}
							else if ( (LA10_0==LCURLY) ) {
								alt10=2;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								NoViableAltException nvae =
									new NoViableAltException("", 10, 0, input);
								throw nvae;
							}

							switch (alt10) {
								case 1 :
									// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:41:47: single_expr
									{
									pushFollow(FOLLOW_single_expr_in_var_extension480);
									e=single_expr();
									state._fsp--;
									if (state.failed) return retval;
									}
									break;
								case 2 :
									// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:41:61: closed_compound_expr
									{
									pushFollow(FOLLOW_closed_compound_expr_in_var_extension484);
									e=closed_compound_expr();
									state._fsp--;
									if (state.failed) return retval;
									}
									break;

							}

							}
							break;

					}

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 41:85: -> varInt(ids=$idse=$e.st)
					  {
					  	retval.st = templateLib.getInstanceOf("varInt",new STAttrMap().put("ids", list_ids).put("e", e.st));
					  }


					}

					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:42:9: t= CHAR (ids+= IDENTIFIER )+ ( ASSIGN co= CHAR_OPERATOR )?
					{
					t=(CommonTree)match(input,CHAR,FOLLOW_CHAR_in_var_extension512); if (state.failed) return retval;
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:42:19: (ids+= IDENTIFIER )+
					int cnt12=0;
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==IDENTIFIER) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:42:19: ids+= IDENTIFIER
							{
							ids=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_var_extension516); if (state.failed) return retval;
							if (list_ids==null) list_ids=new ArrayList<Object>();
							list_ids.add(ids);
							}
							break;

						default :
							if ( cnt12 >= 1 ) break loop12;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(12, input);
							throw eee;
						}
						cnt12++;
					}

					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:42:33: ( ASSIGN co= CHAR_OPERATOR )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==ASSIGN) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:42:34: ASSIGN co= CHAR_OPERATOR
							{
							match(input,ASSIGN,FOLLOW_ASSIGN_in_var_extension520); if (state.failed) return retval;
							co=(CommonTree)match(input,CHAR_OPERATOR,FOLLOW_CHAR_OPERATOR_in_var_extension524); if (state.failed) return retval;
							}
							break;

					}

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 42:85: -> varChar(ids=idsco=$co)
					  {
					  	retval.st = templateLib.getInstanceOf("varChar",new STAttrMap().put("ids", ids).put("co", co));
					  }


					}

					}
					break;
				case 3 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:43:9: t= BOOLEAN (ids+= IDENTIFIER )+ ( ASSIGN bo= BOOLEAN_OPERATOR )?
					{
					t=(CommonTree)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_var_extension576); if (state.failed) return retval;
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:43:22: (ids+= IDENTIFIER )+
					int cnt14=0;
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==IDENTIFIER) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:43:22: ids+= IDENTIFIER
							{
							ids=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_var_extension580); if (state.failed) return retval;
							if (list_ids==null) list_ids=new ArrayList<Object>();
							list_ids.add(ids);
							}
							break;

						default :
							if ( cnt14 >= 1 ) break loop14;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(14, input);
							throw eee;
						}
						cnt14++;
					}

					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:43:36: ( ASSIGN bo= BOOLEAN_OPERATOR )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==ASSIGN) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:43:37: ASSIGN bo= BOOLEAN_OPERATOR
							{
							match(input,ASSIGN,FOLLOW_ASSIGN_in_var_extension584); if (state.failed) return retval;
							bo=(CommonTree)match(input,BOOLEAN_OPERATOR,FOLLOW_BOOLEAN_OPERATOR_in_var_extension588); if (state.failed) return retval;
							}
							break;

					}

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 43:85: -> varBool(ids=idsbo=$bo)
					  {
					  	retval.st = templateLib.getInstanceOf("varBool",new STAttrMap().put("ids", ids).put("bo", bo));
					  }


					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "var_extension"


	public static class statement_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "statement"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:46:1: statement : (r= read -> {$r.st}|p= print -> {$p.st}|a= assign -> {$a.st}|ite= ifthenelse -> {$ite.st});
	public final ChocolateCodeGenerator.statement_return statement() throws RecognitionException {
		ChocolateCodeGenerator.statement_return retval = new ChocolateCodeGenerator.statement_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope r =null;
		TreeRuleReturnScope p =null;
		TreeRuleReturnScope a =null;
		TreeRuleReturnScope ite =null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:47:5: (r= read -> {$r.st}|p= print -> {$p.st}|a= assign -> {$a.st}|ite= ifthenelse -> {$ite.st})
			int alt17=4;
			switch ( input.LA(1) ) {
			case READ:
				{
				alt17=1;
				}
				break;
			case PRINT:
				{
				alt17=2;
				}
				break;
			case ASSIGN:
				{
				alt17=3;
				}
				break;
			case IF:
				{
				alt17=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}
			switch (alt17) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:47:9: r= read
					{
					pushFollow(FOLLOW_read_in_statement647);
					r=read();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 47:27: -> {$r.st}
					  {
					  	retval.st = (r!=null?((StringTemplate)r.getTemplate()):null);
					  }


					}

					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:48:9: p= print
					{
					pushFollow(FOLLOW_print_in_statement674);
					p=print();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 48:27: -> {$p.st}
					  {
					  	retval.st = (p!=null?((StringTemplate)p.getTemplate()):null);
					  }


					}

					}
					break;
				case 3 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:49:9: a= assign
					{
					pushFollow(FOLLOW_assign_in_statement700);
					a=assign();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 49:27: -> {$a.st}
					  {
					  	retval.st = (a!=null?((StringTemplate)a.getTemplate()):null);
					  }


					}

					}
					break;
				case 4 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:50:9: ite= ifthenelse
					{
					pushFollow(FOLLOW_ifthenelse_in_statement725);
					ite=ifthenelse();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 50:27: -> {$ite.st}
					  {
					  	retval.st = (ite!=null?((StringTemplate)ite.getTemplate()):null);
					  }


					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class read_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "read"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:53:1: read : ^( READ (id+= IDENTIFIER )+ ) -> read(ids=$idlnr=getLNr(););
	public final ChocolateCodeGenerator.read_return read() throws RecognitionException {
		ChocolateCodeGenerator.read_return retval = new ChocolateCodeGenerator.read_return();
		retval.start = input.LT(1);

		CommonTree id=null;
		List<Object> list_id=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:54:5: ( ^( READ (id+= IDENTIFIER )+ ) -> read(ids=$idlnr=getLNr();))
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:54:9: ^( READ (id+= IDENTIFIER )+ )
			{
			match(input,READ,FOLLOW_READ_in_read756); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:54:16: (id+= IDENTIFIER )+
			int cnt18=0;
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==IDENTIFIER) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:54:17: id+= IDENTIFIER
					{
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read761); if (state.failed) return retval;
					if (list_id==null) list_id=new ArrayList<Object>();
					list_id.add(id);
					}
					break;

				default :
					if ( cnt18 >= 1 ) break loop18;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(18, input);
					throw eee;
				}
				cnt18++;
			}

			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 54:37: -> read(ids=$idlnr=getLNr();)
			  {
			  	retval.st = templateLib.getInstanceOf("read",new STAttrMap().put("ids", list_id).put("lnr", getLNr();));
			  }


			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "read"


	public static class print_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "print"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:57:1: print : ^( PRINT (l+= ( closed_compound_expr | IDENTIFIER | STRING ) )+ ) -> print(l=$llnr=getLNr(););
	public final ChocolateCodeGenerator.print_return print() throws RecognitionException {
		ChocolateCodeGenerator.print_return retval = new ChocolateCodeGenerator.print_return();
		retval.start = input.LT(1);

		CommonTree l=null;
		List<Object> list_l=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:58:5: ( ^( PRINT (l+= ( closed_compound_expr | IDENTIFIER | STRING ) )+ ) -> print(l=$llnr=getLNr();))
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:58:9: ^( PRINT (l+= ( closed_compound_expr | IDENTIFIER | STRING ) )+ )
			{
			match(input,PRINT,FOLLOW_PRINT_in_print803); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:58:17: (l+= ( closed_compound_expr | IDENTIFIER | STRING ) )+
			int cnt20=0;
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==IDENTIFIER||LA20_0==LCURLY||LA20_0==STRING) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:58:18: l+= ( closed_compound_expr | IDENTIFIER | STRING )
					{
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:58:21: ( closed_compound_expr | IDENTIFIER | STRING )
					int alt19=3;
					switch ( input.LA(1) ) {
					case LCURLY:
						{
						alt19=1;
						}
						break;
					case IDENTIFIER:
						{
						alt19=2;
						}
						break;
					case STRING:
						{
						alt19=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 19, 0, input);
						throw nvae;
					}
					switch (alt19) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:58:22: closed_compound_expr
							{
							pushFollow(FOLLOW_closed_compound_expr_in_print809);
							l=closed_compound_expr();
							state._fsp--;
							if (state.failed) return retval;
							if (list_l==null) list_l=new ArrayList<Object>();
							list_l.add(l.getTemplate());
							}
							break;
						case 2 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:58:45: IDENTIFIER
							{
							l=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_print813); if (state.failed) return retval;
							if (list_l==null) list_l=new ArrayList<Object>();
							list_l.add(l);
							}
							break;
						case 3 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:58:58: STRING
							{
							l=(CommonTree)match(input,STRING,FOLLOW_STRING_in_print817); if (state.failed) return retval;
							if (list_l==null) list_l=new ArrayList<Object>();
							list_l.add(l);
							}
							break;

					}

					}
					break;

				default :
					if ( cnt20 >= 1 ) break loop20;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(20, input);
					throw eee;
				}
				cnt20++;
			}

			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 58:72: -> print(l=$llnr=getLNr();)
			  {
			  	retval.st = templateLib.getInstanceOf("print",new STAttrMap().put("l", list_l).put("lnr", getLNr();));
			  }


			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "print"


	public static class assign_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "assign"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:61:1: assign : ASSIGN id= IDENTIFIER (aexpr= assignexpr ) -> assign(id=$idassexpr=$aexpr.stlnr=getLNr(););
	public final ChocolateCodeGenerator.assign_return assign() throws RecognitionException {
		ChocolateCodeGenerator.assign_return retval = new ChocolateCodeGenerator.assign_return();
		retval.start = input.LT(1);

		CommonTree id=null;
		TreeRuleReturnScope aexpr =null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:62:5: ( ASSIGN id= IDENTIFIER (aexpr= assignexpr ) -> assign(id=$idassexpr=$aexpr.stlnr=getLNr();))
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:62:9: ASSIGN id= IDENTIFIER (aexpr= assignexpr )
			{
			match(input,ASSIGN,FOLLOW_ASSIGN_in_assign864); if (state.failed) return retval;
			id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assign868); if (state.failed) return retval;
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:62:30: (aexpr= assignexpr )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:62:31: aexpr= assignexpr
			{
			pushFollow(FOLLOW_assignexpr_in_assign873);
			aexpr=assignexpr();
			state._fsp--;
			if (state.failed) return retval;
			}

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 62:52: -> assign(id=$idassexpr=$aexpr.stlnr=getLNr();)
			  {
			  	retval.st = templateLib.getInstanceOf("assign",new STAttrMap().put("id", id).put("assexpr", (aexpr!=null?((StringTemplate)aexpr.getTemplate()):null)).put("lnr", getLNr();));
			  }


			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assign"


	public static class assignexpr_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "assignexpr"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:65:1: assignexpr : ( ( IDENTIFIER ASSIGN )=> ( ASSIGN id= IDENTIFIER aexpr= assignexpr ) -> assign(id=$idaexpr=$aexpr.st)|s= single_expr -> {$s.st}|c= closed_compound_expr -> {$c.st});
	public final ChocolateCodeGenerator.assignexpr_return assignexpr() throws RecognitionException {
		ChocolateCodeGenerator.assignexpr_return retval = new ChocolateCodeGenerator.assignexpr_return();
		retval.start = input.LT(1);

		CommonTree id=null;
		TreeRuleReturnScope aexpr =null;
		TreeRuleReturnScope s =null;
		TreeRuleReturnScope c =null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:66:5: ( ( IDENTIFIER ASSIGN )=> ( ASSIGN id= IDENTIFIER aexpr= assignexpr ) -> assign(id=$idaexpr=$aexpr.st)|s= single_expr -> {$s.st}|c= closed_compound_expr -> {$c.st})
			int alt21=3;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==ASSIGN) && (synpred1_ChocolateCodeGenerator())) {
				alt21=1;
			}
			else if ( (LA21_0==AND||LA21_0==BOOLEAN_OPERATOR||LA21_0==CHAR_OPERATOR||LA21_0==DIV||(LA21_0 >= EQ && LA21_0 <= IDENTIFIER)||(LA21_0 >= LESS && LA21_0 <= LESSEQ)||(LA21_0 >= LPAREN && LA21_0 <= POS)) ) {
				alt21=2;
			}
			else if ( (LA21_0==LCURLY) ) {
				alt21=3;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:66:9: ( IDENTIFIER ASSIGN )=> ( ASSIGN id= IDENTIFIER aexpr= assignexpr )
					{
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:66:32: ( ASSIGN id= IDENTIFIER aexpr= assignexpr )
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:66:33: ASSIGN id= IDENTIFIER aexpr= assignexpr
					{
					match(input,ASSIGN,FOLLOW_ASSIGN_in_assignexpr926); if (state.failed) return retval;
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assignexpr930); if (state.failed) return retval;
					pushFollow(FOLLOW_assignexpr_in_assignexpr934);
					aexpr=assignexpr();
					state._fsp--;
					if (state.failed) return retval;
					}

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 66:75: -> assign(id=$idaexpr=$aexpr.st)
					  {
					  	retval.st = templateLib.getInstanceOf("assign",new STAttrMap().put("id", id).put("aexpr", (aexpr!=null?((StringTemplate)aexpr.getTemplate()):null)));
					  }


					}

					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:67:9: s= single_expr
					{
					pushFollow(FOLLOW_single_expr_in_assignexpr963);
					s=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 67:75: -> {$s.st}
					  {
					  	retval.st = (s!=null?((StringTemplate)s.getTemplate()):null);
					  }


					}

					}
					break;
				case 3 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:68:9: c= closed_compound_expr
					{
					pushFollow(FOLLOW_closed_compound_expr_in_assignexpr1031);
					c=closed_compound_expr();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 68:75: -> {$c.st}
					  {
					  	retval.st = (c!=null?((StringTemplate)c.getTemplate()):null);
					  }


					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignexpr"


	public static class ifthenelse_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "ifthenelse"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:71:1: ifthenelse : IF s= single_expr c1= closed_compound_expr c2= closed_compound_expr -> ifthenelse(s=$s.stc1=$c1.stc2=$c2.stlbl=getLbNr();lnr=getLNr(););
	public final ChocolateCodeGenerator.ifthenelse_return ifthenelse() throws RecognitionException {
		ChocolateCodeGenerator.ifthenelse_return retval = new ChocolateCodeGenerator.ifthenelse_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope s =null;
		TreeRuleReturnScope c1 =null;
		TreeRuleReturnScope c2 =null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:72:5: ( IF s= single_expr c1= closed_compound_expr c2= closed_compound_expr -> ifthenelse(s=$s.stc1=$c1.stc2=$c2.stlbl=getLbNr();lnr=getLNr();))
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:72:9: IF s= single_expr c1= closed_compound_expr c2= closed_compound_expr
			{
			match(input,IF,FOLLOW_IF_in_ifthenelse1101); if (state.failed) return retval;
			pushFollow(FOLLOW_single_expr_in_ifthenelse1105);
			s=single_expr();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_closed_compound_expr_in_ifthenelse1109);
			c1=closed_compound_expr();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_closed_compound_expr_in_ifthenelse1113);
			c2=closed_compound_expr();
			state._fsp--;
			if (state.failed) return retval;
			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 72:75: -> ifthenelse(s=$s.stc1=$c1.stc2=$c2.stlbl=getLbNr();lnr=getLNr();)
			  {
			  	retval.st = templateLib.getInstanceOf("ifthenelse",new STAttrMap().put("s", (s!=null?((StringTemplate)s.getTemplate()):null)).put("c1", (c1!=null?((StringTemplate)c1.getTemplate()):null)).put("c2", (c2!=null?((StringTemplate)c2.getTemplate()):null)).put("lbl", getLbNr();).put("lnr", getLNr();));
			  }


			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ifthenelse"


	public static class closed_compound_expr_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "closed_compound_expr"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:75:1: closed_compound_expr : ^( LCURLY (decls+= declaration )* (state= statement )+ ) -> compound(decls=$declsstate=$state.stlnr=getLNr(););
	public final ChocolateCodeGenerator.closed_compound_expr_return closed_compound_expr() throws RecognitionException {
		ChocolateCodeGenerator.closed_compound_expr_return retval = new ChocolateCodeGenerator.closed_compound_expr_return();
		retval.start = input.LT(1);

		List<Object> list_decls=null;
		TreeRuleReturnScope state =null;
		RuleReturnScope decls = null;
		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:76:5: ( ^( LCURLY (decls+= declaration )* (state= statement )+ ) -> compound(decls=$declsstate=$state.stlnr=getLNr();))
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:76:9: ^( LCURLY (decls+= declaration )* (state= statement )+ )
			{
			match(input,LCURLY,FOLLOW_LCURLY_in_closed_compound_expr1163); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:76:23: (decls+= declaration )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==CONSTANT||LA22_0==VAR) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:76:23: decls+= declaration
					{
					pushFollow(FOLLOW_declaration_in_closed_compound_expr1167);
					decls=declaration();
					state._fsp--;
					if (state.failed) return retval;
					if (list_decls==null) list_decls=new ArrayList<Object>();
					list_decls.add(decls.getTemplate());
					}
					break;

				default :
					break loop22;
				}
			}

			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:76:43: (state= statement )+
			int cnt23=0;
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==ASSIGN||LA23_0==IF||LA23_0==PRINT||LA23_0==READ) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:76:43: state= statement
					{
					pushFollow(FOLLOW_statement_in_closed_compound_expr1172);
					state=statement();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					if ( cnt23 >= 1 ) break loop23;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(23, input);
					throw eee;
				}
				cnt23++;
			}

			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 76:75: -> compound(decls=$declsstate=$state.stlnr=getLNr();)
			  {
			  	retval.st = templateLib.getInstanceOf("compound",new STAttrMap().put("decls", list_decls).put("state", (state!=null?((StringTemplate)state.getTemplate()):null)).put("lnr", getLNr();));
			  }


			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "closed_compound_expr"


	public static class single_expr_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "single_expr"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:79:1: single_expr : (o= operand -> {$o.st}| ^( OR x= single_expr y= single_expr ) -> or(ex1=$x.stex2=$y.st)| ^( AND x= single_expr y= single_expr ) -> and(ex1=$x.stex2=$y.st)| ^( LESS x= single_expr y= single_expr ) -> less(ex1=$x.stex2=$y.stlbl=getLbNr();)| ^( LESSEQ x= single_expr y= single_expr ) -> lesseq(ex1=$x.stex2=$y.stlbl=getLbNr();)| ^( GREATEQ x= single_expr y= single_expr ) -> greateq(ex1=$x.stex2=$y.stlbl=getLbNr();)| ^( GREAT x= single_expr y= single_expr ) -> great(ex1=$x.stex2=$y.stlbl=getLbNr();)| ^( EQ x= single_expr y= single_expr ) -> eq(ex1=$x.stex2=$y.stlbl=getLbNr();)| ^( NOTEQ x= single_expr y= single_expr ) -> noteq(ex1=$x.stex2=$y.stlbl=getLbNr();)| ^( PLUS x= single_expr y= single_expr ) -> plus(ex1=$x.stex2=$y.st)| ^( MIN x= single_expr y= single_expr ) -> min(ex1=$x.stex2=$y.st)| ^( MULT x= single_expr y= single_expr ) -> mult(ex1=$x.stex2=$y.st)| ^( DIV x= single_expr y= single_expr ) -> div(ex1=$x.stex2=$y.st)| ^( MOD x= single_expr y= single_expr ) -> mod(ex1=$x.stex2=$y.st)| ^( POS x= single_expr ) -> pos(ex1=$x.st)| ^( NEG x= single_expr ) -> neg(ex1=$x.st)| ^( NOT x= single_expr ) -> not(ex1=$x.st));
	public final ChocolateCodeGenerator.single_expr_return single_expr() throws RecognitionException {
		ChocolateCodeGenerator.single_expr_return retval = new ChocolateCodeGenerator.single_expr_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope o =null;
		TreeRuleReturnScope x =null;
		TreeRuleReturnScope y =null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:80:5: (o= operand -> {$o.st}| ^( OR x= single_expr y= single_expr ) -> or(ex1=$x.stex2=$y.st)| ^( AND x= single_expr y= single_expr ) -> and(ex1=$x.stex2=$y.st)| ^( LESS x= single_expr y= single_expr ) -> less(ex1=$x.stex2=$y.stlbl=getLbNr();)| ^( LESSEQ x= single_expr y= single_expr ) -> lesseq(ex1=$x.stex2=$y.stlbl=getLbNr();)| ^( GREATEQ x= single_expr y= single_expr ) -> greateq(ex1=$x.stex2=$y.stlbl=getLbNr();)| ^( GREAT x= single_expr y= single_expr ) -> great(ex1=$x.stex2=$y.stlbl=getLbNr();)| ^( EQ x= single_expr y= single_expr ) -> eq(ex1=$x.stex2=$y.stlbl=getLbNr();)| ^( NOTEQ x= single_expr y= single_expr ) -> noteq(ex1=$x.stex2=$y.stlbl=getLbNr();)| ^( PLUS x= single_expr y= single_expr ) -> plus(ex1=$x.stex2=$y.st)| ^( MIN x= single_expr y= single_expr ) -> min(ex1=$x.stex2=$y.st)| ^( MULT x= single_expr y= single_expr ) -> mult(ex1=$x.stex2=$y.st)| ^( DIV x= single_expr y= single_expr ) -> div(ex1=$x.stex2=$y.st)| ^( MOD x= single_expr y= single_expr ) -> mod(ex1=$x.stex2=$y.st)| ^( POS x= single_expr ) -> pos(ex1=$x.st)| ^( NEG x= single_expr ) -> neg(ex1=$x.st)| ^( NOT x= single_expr ) -> not(ex1=$x.st))
			int alt24=17;
			switch ( input.LA(1) ) {
			case BOOLEAN_OPERATOR:
			case CHAR_OPERATOR:
			case IDENTIFIER:
			case LPAREN:
			case NUMBER:
				{
				alt24=1;
				}
				break;
			case OR:
				{
				alt24=2;
				}
				break;
			case AND:
				{
				alt24=3;
				}
				break;
			case LESS:
				{
				alt24=4;
				}
				break;
			case LESSEQ:
				{
				alt24=5;
				}
				break;
			case GREATEQ:
				{
				alt24=6;
				}
				break;
			case GREAT:
				{
				alt24=7;
				}
				break;
			case EQ:
				{
				alt24=8;
				}
				break;
			case NOTEQ:
				{
				alt24=9;
				}
				break;
			case PLUS:
				{
				alt24=10;
				}
				break;
			case MIN:
				{
				alt24=11;
				}
				break;
			case MULT:
				{
				alt24=12;
				}
				break;
			case DIV:
				{
				alt24=13;
				}
				break;
			case MOD:
				{
				alt24=14;
				}
				break;
			case POS:
				{
				alt24=15;
				}
				break;
			case NEG:
				{
				alt24=16;
				}
				break;
			case NOT:
				{
				alt24=17;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}
			switch (alt24) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:80:9: o= operand
					{
					pushFollow(FOLLOW_operand_in_single_expr1239);
					o=operand();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 80:49: -> {$o.st}
					  {
					  	retval.st = (o!=null?((StringTemplate)o.getTemplate()):null);
					  }


					}

					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:81:9: ^( OR x= single_expr y= single_expr )
					{
					match(input,OR,FOLLOW_OR_in_single_expr1284); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1288);
					x=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1292);
					y=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 81:49: -> or(ex1=$x.stex2=$y.st)
					  {
					  	retval.st = templateLib.getInstanceOf("or",new STAttrMap().put("ex1", (x!=null?((StringTemplate)x.getTemplate()):null)).put("ex2", (y!=null?((StringTemplate)y.getTemplate()):null)));
					  }


					}

					}
					break;
				case 3 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:82:9: ^( AND x= single_expr y= single_expr )
					{
					match(input,AND,FOLLOW_AND_in_single_expr1323); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1327);
					x=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1331);
					y=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 82:49: -> and(ex1=$x.stex2=$y.st)
					  {
					  	retval.st = templateLib.getInstanceOf("and",new STAttrMap().put("ex1", (x!=null?((StringTemplate)x.getTemplate()):null)).put("ex2", (y!=null?((StringTemplate)y.getTemplate()):null)));
					  }


					}

					}
					break;
				case 4 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:83:9: ^( LESS x= single_expr y= single_expr )
					{
					match(input,LESS,FOLLOW_LESS_in_single_expr1361); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1365);
					x=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1369);
					y=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 83:49: -> less(ex1=$x.stex2=$y.stlbl=getLbNr();)
					  {
					  	retval.st = templateLib.getInstanceOf("less",new STAttrMap().put("ex1", (x!=null?((StringTemplate)x.getTemplate()):null)).put("ex2", (y!=null?((StringTemplate)y.getTemplate()):null)).put("lbl", getLbNr();));
					  }


					}

					}
					break;
				case 5 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:84:9: ^( LESSEQ x= single_expr y= single_expr )
					{
					match(input,LESSEQ,FOLLOW_LESSEQ_in_single_expr1402); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1406);
					x=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1410);
					y=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 84:49: -> lesseq(ex1=$x.stex2=$y.stlbl=getLbNr();)
					  {
					  	retval.st = templateLib.getInstanceOf("lesseq",new STAttrMap().put("ex1", (x!=null?((StringTemplate)x.getTemplate()):null)).put("ex2", (y!=null?((StringTemplate)y.getTemplate()):null)).put("lbl", getLbNr();));
					  }


					}

					}
					break;
				case 6 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:85:9: ^( GREATEQ x= single_expr y= single_expr )
					{
					match(input,GREATEQ,FOLLOW_GREATEQ_in_single_expr1441); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1445);
					x=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1449);
					y=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 85:49: -> greateq(ex1=$x.stex2=$y.stlbl=getLbNr();)
					  {
					  	retval.st = templateLib.getInstanceOf("greateq",new STAttrMap().put("ex1", (x!=null?((StringTemplate)x.getTemplate()):null)).put("ex2", (y!=null?((StringTemplate)y.getTemplate()):null)).put("lbl", getLbNr();));
					  }


					}

					}
					break;
				case 7 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:86:9: ^( GREAT x= single_expr y= single_expr )
					{
					match(input,GREAT,FOLLOW_GREAT_in_single_expr1479); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1483);
					x=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1487);
					y=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 86:49: -> great(ex1=$x.stex2=$y.stlbl=getLbNr();)
					  {
					  	retval.st = templateLib.getInstanceOf("great",new STAttrMap().put("ex1", (x!=null?((StringTemplate)x.getTemplate()):null)).put("ex2", (y!=null?((StringTemplate)y.getTemplate()):null)).put("lbl", getLbNr();));
					  }


					}

					}
					break;
				case 8 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:87:9: ^( EQ x= single_expr y= single_expr )
					{
					match(input,EQ,FOLLOW_EQ_in_single_expr1519); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1523);
					x=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1527);
					y=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 87:49: -> eq(ex1=$x.stex2=$y.stlbl=getLbNr();)
					  {
					  	retval.st = templateLib.getInstanceOf("eq",new STAttrMap().put("ex1", (x!=null?((StringTemplate)x.getTemplate()):null)).put("ex2", (y!=null?((StringTemplate)y.getTemplate()):null)).put("lbl", getLbNr();));
					  }


					}

					}
					break;
				case 9 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:88:9: ^( NOTEQ x= single_expr y= single_expr )
					{
					match(input,NOTEQ,FOLLOW_NOTEQ_in_single_expr1562); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1566);
					x=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1570);
					y=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 88:49: -> noteq(ex1=$x.stex2=$y.stlbl=getLbNr();)
					  {
					  	retval.st = templateLib.getInstanceOf("noteq",new STAttrMap().put("ex1", (x!=null?((StringTemplate)x.getTemplate()):null)).put("ex2", (y!=null?((StringTemplate)y.getTemplate()):null)).put("lbl", getLbNr();));
					  }


					}

					}
					break;
				case 10 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:89:9: ^( PLUS x= single_expr y= single_expr )
					{
					match(input,PLUS,FOLLOW_PLUS_in_single_expr1602); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1606);
					x=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1610);
					y=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 89:49: -> plus(ex1=$x.stex2=$y.st)
					  {
					  	retval.st = templateLib.getInstanceOf("plus",new STAttrMap().put("ex1", (x!=null?((StringTemplate)x.getTemplate()):null)).put("ex2", (y!=null?((StringTemplate)y.getTemplate()):null)));
					  }


					}

					}
					break;
				case 11 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:90:9: ^( MIN x= single_expr y= single_expr )
					{
					match(input,MIN,FOLLOW_MIN_in_single_expr1639); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1643);
					x=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1647);
					y=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 90:49: -> min(ex1=$x.stex2=$y.st)
					  {
					  	retval.st = templateLib.getInstanceOf("min",new STAttrMap().put("ex1", (x!=null?((StringTemplate)x.getTemplate()):null)).put("ex2", (y!=null?((StringTemplate)y.getTemplate()):null)));
					  }


					}

					}
					break;
				case 12 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:91:9: ^( MULT x= single_expr y= single_expr )
					{
					match(input,MULT,FOLLOW_MULT_in_single_expr1677); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1681);
					x=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1685);
					y=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 91:49: -> mult(ex1=$x.stex2=$y.st)
					  {
					  	retval.st = templateLib.getInstanceOf("mult",new STAttrMap().put("ex1", (x!=null?((StringTemplate)x.getTemplate()):null)).put("ex2", (y!=null?((StringTemplate)y.getTemplate()):null)));
					  }


					}

					}
					break;
				case 13 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:92:9: ^( DIV x= single_expr y= single_expr )
					{
					match(input,DIV,FOLLOW_DIV_in_single_expr1714); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1718);
					x=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1722);
					y=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 92:49: -> div(ex1=$x.stex2=$y.st)
					  {
					  	retval.st = templateLib.getInstanceOf("div",new STAttrMap().put("ex1", (x!=null?((StringTemplate)x.getTemplate()):null)).put("ex2", (y!=null?((StringTemplate)y.getTemplate()):null)));
					  }


					}

					}
					break;
				case 14 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:93:9: ^( MOD x= single_expr y= single_expr )
					{
					match(input,MOD,FOLLOW_MOD_in_single_expr1752); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1756);
					x=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1760);
					y=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 93:49: -> mod(ex1=$x.stex2=$y.st)
					  {
					  	retval.st = templateLib.getInstanceOf("mod",new STAttrMap().put("ex1", (x!=null?((StringTemplate)x.getTemplate()):null)).put("ex2", (y!=null?((StringTemplate)y.getTemplate()):null)));
					  }


					}

					}
					break;
				case 15 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:94:9: ^( POS x= single_expr )
					{
					match(input,POS,FOLLOW_POS_in_single_expr1790); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1794);
					x=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 94:49: -> pos(ex1=$x.st)
					  {
					  	retval.st = templateLib.getInstanceOf("pos",new STAttrMap().put("ex1", (x!=null?((StringTemplate)x.getTemplate()):null)));
					  }


					}

					}
					break;
				case 16 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:95:9: ^( NEG x= single_expr )
					{
					match(input,NEG,FOLLOW_NEG_in_single_expr1834); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1838);
					x=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 95:49: -> neg(ex1=$x.st)
					  {
					  	retval.st = templateLib.getInstanceOf("neg",new STAttrMap().put("ex1", (x!=null?((StringTemplate)x.getTemplate()):null)));
					  }


					}

					}
					break;
				case 17 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:96:9: ^( NOT x= single_expr )
					{
					match(input,NOT,FOLLOW_NOT_in_single_expr1878); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1882);
					x=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 96:49: -> not(ex1=$x.st)
					  {
					  	retval.st = templateLib.getInstanceOf("not",new STAttrMap().put("ex1", (x!=null?((StringTemplate)x.getTemplate()):null)));
					  }


					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "single_expr"


	public static class operand_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "operand"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:99:1: operand : (id= IDENTIFIER -> identifier(id=$id.text)|n= NUMBER -> number(n=$n.text)| ^( LPAREN s= single_expr ) -> {$s.st}|b= BOOLEAN_OPERATOR -> boolean(b=$b.text)|c= CHAR_OPERATOR -> char(c=$c.text));
	public final ChocolateCodeGenerator.operand_return operand() throws RecognitionException {
		ChocolateCodeGenerator.operand_return retval = new ChocolateCodeGenerator.operand_return();
		retval.start = input.LT(1);

		CommonTree id=null;
		CommonTree n=null;
		CommonTree b=null;
		CommonTree c=null;
		TreeRuleReturnScope s =null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:100:5: (id= IDENTIFIER -> identifier(id=$id.text)|n= NUMBER -> number(n=$n.text)| ^( LPAREN s= single_expr ) -> {$s.st}|b= BOOLEAN_OPERATOR -> boolean(b=$b.text)|c= CHAR_OPERATOR -> char(c=$c.text))
			int alt25=5;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt25=1;
				}
				break;
			case NUMBER:
				{
				alt25=2;
				}
				break;
			case LPAREN:
				{
				alt25=3;
				}
				break;
			case BOOLEAN_OPERATOR:
				{
				alt25=4;
				}
				break;
			case CHAR_OPERATOR:
				{
				alt25=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}
			switch (alt25) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:100:9: id= IDENTIFIER
					{
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand1936); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 100:33: -> identifier(id=$id.text)
					  {
					  	retval.st = templateLib.getInstanceOf("identifier",new STAttrMap().put("id", (id!=null?id.getText():null)));
					  }


					}

					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:101:9: n= NUMBER
					{
					n=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_operand1967); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 101:33: -> number(n=$n.text)
					  {
					  	retval.st = templateLib.getInstanceOf("number",new STAttrMap().put("n", (n!=null?n.getText():null)));
					  }


					}

					}
					break;
				case 3 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:102:9: ^( LPAREN s= single_expr )
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_operand2002); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_operand2006);
					s=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 102:33: -> {$s.st}
					  {
					  	retval.st = (s!=null?((StringTemplate)s.getTemplate()):null);
					  }


					}

					}
					break;
				case 4 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:103:9: b= BOOLEAN_OPERATOR
					{
					b=(CommonTree)match(input,BOOLEAN_OPERATOR,FOLLOW_BOOLEAN_OPERATOR_in_operand2023); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 103:33: -> boolean(b=$b.text)
					  {
					  	retval.st = templateLib.getInstanceOf("boolean",new STAttrMap().put("b", (b!=null?b.getText():null)));
					  }


					}

					}
					break;
				case 5 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:104:9: c= CHAR_OPERATOR
					{
					c=(CommonTree)match(input,CHAR_OPERATOR,FOLLOW_CHAR_OPERATOR_in_operand2049); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 104:33: -> char(c=$c.text)
					  {
					  	retval.st = templateLib.getInstanceOf("char",new STAttrMap().put("c", (c!=null?c.getText():null)));
					  }


					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "operand"

	// $ANTLR start synpred1_ChocolateCodeGenerator
	public final void synpred1_ChocolateCodeGenerator_fragment() throws RecognitionException {
		// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:66:9: ( IDENTIFIER ASSIGN )
		// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:66:10: IDENTIFIER ASSIGN
		{
		match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred1_ChocolateCodeGenerator918); if (state.failed) return;
		match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred1_ChocolateCodeGenerator920); if (state.failed) return;
		}

	}
	// $ANTLR end synpred1_ChocolateCodeGenerator

	// Delegated rules

	public final boolean synpred1_ChocolateCodeGenerator() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_ChocolateCodeGenerator_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_PROGRAM_in_program100 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_line_in_program105 = new BitSet(new long[]{0x0002110000402028L});
	public static final BitSet FOLLOW_declaration_in_line159 = new BitSet(new long[]{0x0002110000402020L});
	public static final BitSet FOLLOW_statement_in_line164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONSTANT_in_declaration198 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_constant_extension_in_declaration202 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VAR_in_declaration228 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_var_extension_in_declaration232 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INTEGER_in_constant_extension286 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_constant_extension290 = new BitSet(new long[]{0x0000000000200020L});
	public static final BitSet FOLLOW_ASSIGN_in_constant_extension293 = new BitSet(new long[]{0x000000FFE73C8290L});
	public static final BitSet FOLLOW_single_expr_in_constant_extension298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_closed_compound_expr_in_constant_extension302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_constant_extension331 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_constant_extension335 = new BitSet(new long[]{0x0000000000200020L});
	public static final BitSet FOLLOW_ASSIGN_in_constant_extension338 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CHAR_OPERATOR_in_constant_extension342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_constant_extension395 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_constant_extension399 = new BitSet(new long[]{0x0000000000200020L});
	public static final BitSet FOLLOW_ASSIGN_in_constant_extension402 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BOOLEAN_OPERATOR_in_constant_extension406 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_var_extension467 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_var_extension471 = new BitSet(new long[]{0x0000000000200022L});
	public static final BitSet FOLLOW_ASSIGN_in_var_extension475 = new BitSet(new long[]{0x000000FFE73C8290L});
	public static final BitSet FOLLOW_single_expr_in_var_extension480 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_closed_compound_expr_in_var_extension484 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_var_extension512 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_var_extension516 = new BitSet(new long[]{0x0000000000200022L});
	public static final BitSet FOLLOW_ASSIGN_in_var_extension520 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CHAR_OPERATOR_in_var_extension524 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_var_extension576 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_var_extension580 = new BitSet(new long[]{0x0000000000200022L});
	public static final BitSet FOLLOW_ASSIGN_in_var_extension584 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BOOLEAN_OPERATOR_in_var_extension588 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_in_statement647 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_in_statement674 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assign_in_statement700 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifthenelse_in_statement725 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read756 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read761 = new BitSet(new long[]{0x0000000000200008L});
	public static final BitSet FOLLOW_PRINT_in_print803 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_closed_compound_expr_in_print809 = new BitSet(new long[]{0x0008000001200008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_print813 = new BitSet(new long[]{0x0008000001200008L});
	public static final BitSet FOLLOW_STRING_in_print817 = new BitSet(new long[]{0x0008000001200008L});
	public static final BitSet FOLLOW_ASSIGN_in_assign864 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_assign868 = new BitSet(new long[]{0x000000FFE73C82B0L});
	public static final BitSet FOLLOW_assignexpr_in_assign873 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_in_assignexpr926 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_assignexpr930 = new BitSet(new long[]{0x000000FFE73C82B0L});
	public static final BitSet FOLLOW_assignexpr_in_assignexpr934 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_single_expr_in_assignexpr963 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_closed_compound_expr_in_assignexpr1031 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifthenelse1101 = new BitSet(new long[]{0x000000FFE63C8290L});
	public static final BitSet FOLLOW_single_expr_in_ifthenelse1105 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_closed_compound_expr_in_ifthenelse1109 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_closed_compound_expr_in_ifthenelse1113 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_closed_compound_expr1163 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_declaration_in_closed_compound_expr1167 = new BitSet(new long[]{0x0002110000402020L});
	public static final BitSet FOLLOW_statement_in_closed_compound_expr1172 = new BitSet(new long[]{0x0000110000400028L});
	public static final BitSet FOLLOW_operand_in_single_expr1239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OR_in_single_expr1284 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1288 = new BitSet(new long[]{0x000000FFE63C8290L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1292 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AND_in_single_expr1323 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1327 = new BitSet(new long[]{0x000000FFE63C8290L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1331 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LESS_in_single_expr1361 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1365 = new BitSet(new long[]{0x000000FFE63C8290L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1369 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LESSEQ_in_single_expr1402 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1406 = new BitSet(new long[]{0x000000FFE63C8290L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1410 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GREATEQ_in_single_expr1441 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1445 = new BitSet(new long[]{0x000000FFE63C8290L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1449 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GREAT_in_single_expr1479 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1483 = new BitSet(new long[]{0x000000FFE63C8290L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1487 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQ_in_single_expr1519 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1523 = new BitSet(new long[]{0x000000FFE63C8290L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1527 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NOTEQ_in_single_expr1562 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1566 = new BitSet(new long[]{0x000000FFE63C8290L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1570 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_in_single_expr1602 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1606 = new BitSet(new long[]{0x000000FFE63C8290L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1610 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MIN_in_single_expr1639 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1643 = new BitSet(new long[]{0x000000FFE63C8290L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1647 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MULT_in_single_expr1677 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1681 = new BitSet(new long[]{0x000000FFE63C8290L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1685 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIV_in_single_expr1714 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1718 = new BitSet(new long[]{0x000000FFE63C8290L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1722 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MOD_in_single_expr1752 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1756 = new BitSet(new long[]{0x000000FFE63C8290L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1760 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_POS_in_single_expr1790 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1794 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEG_in_single_expr1834 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1838 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NOT_in_single_expr1878 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1882 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand1936 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand1967 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand2002 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_operand2006 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BOOLEAN_OPERATOR_in_operand2023 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_OPERATOR_in_operand2049 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_synpred1_ChocolateCodeGenerator918 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_synpred1_ChocolateCodeGenerator920 = new BitSet(new long[]{0x0000000000000002L});
}
