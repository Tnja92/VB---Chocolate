// $ANTLR 3.5 C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g 2013-07-05 18:31:37

package SyntacticAnalyzer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class ChocolateParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ASSIGN", "BOOLEAN", "BOOLEAN_OPERATOR", 
		"CHAR", "CHAR_OPERATOR", "COLON", "COMMA", "COMMENT", "CONSTANT", "DIGIT", 
		"DIV", "DQUOTATION", "ELSE", "EQ", "GREAT", "GREATEQ", "IDENTIFIER", "IF", 
		"INTEGER", "LCURLY", "LESS", "LESSEQ", "LETTER", "LOWER", "LPAREN", "MIN", 
		"MOD", "MULT", "NOT", "NOTEQ", "NUMBER", "OR", "PLUS", "PRINT", "PROGRAM", 
		"QUOTATION", "RCURLY", "READ", "RPAREN", "SEMICOLON", "THEN", "UPPER", 
		"VAR", "WS"
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
	public static final int NOT=33;
	public static final int NOTEQ=34;
	public static final int NUMBER=35;
	public static final int OR=36;
	public static final int PLUS=37;
	public static final int PRINT=38;
	public static final int PROGRAM=39;
	public static final int QUOTATION=40;
	public static final int RCURLY=41;
	public static final int READ=42;
	public static final int RPAREN=43;
	public static final int SEMICOLON=44;
	public static final int THEN=45;
	public static final int UPPER=46;
	public static final int VAR=47;
	public static final int WS=48;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public ChocolateParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public ChocolateParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return ChocolateParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g"; }


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:61:1: program : ( ( declarations )* statements )+ EOF -> ^( PROGRAM ( ( declarations )* statements )+ ) ;
	public final ChocolateParser.program_return program() throws RecognitionException {
		ChocolateParser.program_return retval = new ChocolateParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EOF3=null;
		ParserRuleReturnScope declarations1 =null;
		ParserRuleReturnScope statements2 =null;

		Object EOF3_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
		RewriteRuleSubtreeStream stream_declarations=new RewriteRuleSubtreeStream(adaptor,"rule declarations");

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:62:5: ( ( ( declarations )* statements )+ EOF -> ^( PROGRAM ( ( declarations )* statements )+ ) )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:62:10: ( ( declarations )* statements )+ EOF
			{
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:62:10: ( ( declarations )* statements )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==CONSTANT||(LA2_0 >= IDENTIFIER && LA2_0 <= IF)||LA2_0==PRINT||LA2_0==READ||LA2_0==VAR) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:62:11: ( declarations )* statements
					{
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:62:11: ( declarations )*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( (LA1_0==CONSTANT||LA1_0==VAR) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:62:11: declarations
							{
							pushFollow(FOLLOW_declarations_in_program983);
							declarations1=declarations();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_declarations.add(declarations1.getTree());
							}
							break;

						default :
							break loop1;
						}
					}

					pushFollow(FOLLOW_statements_in_program986);
					statements2=statements();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statements.add(statements2.getTree());
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_program990); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EOF.add(EOF3);

			// AST REWRITE
			// elements: statements, declarations
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 63:13: -> ^( PROGRAM ( ( declarations )* statements )+ )
			{
				// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:63:17: ^( PROGRAM ( ( declarations )* statements )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				if ( !(stream_statements.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_statements.hasNext() ) {
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:63:28: ( declarations )*
					while ( stream_declarations.hasNext() ) {
						adaptor.addChild(root_1, stream_declarations.nextTree());
					}
					stream_declarations.reset();

					adaptor.addChild(root_1, stream_statements.nextTree());
				}
				stream_statements.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class declarations_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "declarations"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:68:1: declarations : declaration SEMICOLON !;
	public final ChocolateParser.declarations_return declarations() throws RecognitionException {
		ChocolateParser.declarations_return retval = new ChocolateParser.declarations_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMICOLON5=null;
		ParserRuleReturnScope declaration4 =null;

		Object SEMICOLON5_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:69:5: ( declaration SEMICOLON !)
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:69:9: declaration SEMICOLON !
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_declaration_in_declarations1053);
			declaration4=declaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration4.getTree());

			SEMICOLON5=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_declarations1055); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declarations"


	public static class declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "declaration"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:72:1: declaration : ( constant | variable ) ;
	public final ChocolateParser.declaration_return declaration() throws RecognitionException {
		ChocolateParser.declaration_return retval = new ChocolateParser.declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope constant6 =null;
		ParserRuleReturnScope variable7 =null;


		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:73:5: ( ( constant | variable ) )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:73:9: ( constant | variable )
			{
			root_0 = (Object)adaptor.nil();


			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:73:9: ( constant | variable )
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
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:73:10: constant
					{
					pushFollow(FOLLOW_constant_in_declaration1077);
					constant6=constant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constant6.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:73:21: variable
					{
					pushFollow(FOLLOW_variable_in_declaration1081);
					variable7=variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variable7.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declaration"


	public static class constant_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constant"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:76:1: constant : CONSTANT ^ decl_extension ;
	public final ChocolateParser.constant_return constant() throws RecognitionException {
		ChocolateParser.constant_return retval = new ChocolateParser.constant_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token CONSTANT8=null;
		ParserRuleReturnScope decl_extension9 =null;

		Object CONSTANT8_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:77:5: ( CONSTANT ^ decl_extension )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:77:9: CONSTANT ^ decl_extension
			{
			root_0 = (Object)adaptor.nil();


			CONSTANT8=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_constant1108); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			CONSTANT8_tree = (Object)adaptor.create(CONSTANT8);
			root_0 = (Object)adaptor.becomeRoot(CONSTANT8_tree, root_0);
			}

			pushFollow(FOLLOW_decl_extension_in_constant1111);
			decl_extension9=decl_extension();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, decl_extension9.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constant"


	public static class variable_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variable"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:80:1: variable : VAR ^ decl_extension ;
	public final ChocolateParser.variable_return variable() throws RecognitionException {
		ChocolateParser.variable_return retval = new ChocolateParser.variable_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VAR10=null;
		ParserRuleReturnScope decl_extension11 =null;

		Object VAR10_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:81:5: ( VAR ^ decl_extension )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:81:9: VAR ^ decl_extension
			{
			root_0 = (Object)adaptor.nil();


			VAR10=(Token)match(input,VAR,FOLLOW_VAR_in_variable1134); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			VAR10_tree = (Object)adaptor.create(VAR10);
			root_0 = (Object)adaptor.becomeRoot(VAR10_tree, root_0);
			}

			pushFollow(FOLLOW_decl_extension_in_variable1137);
			decl_extension11=decl_extension();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, decl_extension11.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "variable"


	public static class decl_extension_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "decl_extension"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:84:1: decl_extension : ( INTEGER IDENTIFIER ( ASSIGN ( single_expr | closed_compound_expr ) )? | CHAR IDENTIFIER ( ASSIGN CHAR_OPERATOR )? | BOOLEAN IDENTIFIER ( ASSIGN BOOLEAN_OPERATOR )? );
	public final ChocolateParser.decl_extension_return decl_extension() throws RecognitionException {
		ChocolateParser.decl_extension_return retval = new ChocolateParser.decl_extension_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INTEGER12=null;
		Token IDENTIFIER13=null;
		Token ASSIGN14=null;
		Token CHAR17=null;
		Token IDENTIFIER18=null;
		Token ASSIGN19=null;
		Token CHAR_OPERATOR20=null;
		Token BOOLEAN21=null;
		Token IDENTIFIER22=null;
		Token ASSIGN23=null;
		Token BOOLEAN_OPERATOR24=null;
		ParserRuleReturnScope single_expr15 =null;
		ParserRuleReturnScope closed_compound_expr16 =null;

		Object INTEGER12_tree=null;
		Object IDENTIFIER13_tree=null;
		Object ASSIGN14_tree=null;
		Object CHAR17_tree=null;
		Object IDENTIFIER18_tree=null;
		Object ASSIGN19_tree=null;
		Object CHAR_OPERATOR20_tree=null;
		Object BOOLEAN21_tree=null;
		Object IDENTIFIER22_tree=null;
		Object ASSIGN23_tree=null;
		Object BOOLEAN_OPERATOR24_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:85:5: ( INTEGER IDENTIFIER ( ASSIGN ( single_expr | closed_compound_expr ) )? | CHAR IDENTIFIER ( ASSIGN CHAR_OPERATOR )? | BOOLEAN IDENTIFIER ( ASSIGN BOOLEAN_OPERATOR )? )
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
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:85:9: INTEGER IDENTIFIER ( ASSIGN ( single_expr | closed_compound_expr ) )?
					{
					root_0 = (Object)adaptor.nil();


					INTEGER12=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_decl_extension1160); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INTEGER12_tree = (Object)adaptor.create(INTEGER12);
					adaptor.addChild(root_0, INTEGER12_tree);
					}

					IDENTIFIER13=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_decl_extension1162); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER13_tree = (Object)adaptor.create(IDENTIFIER13);
					adaptor.addChild(root_0, IDENTIFIER13_tree);
					}

					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:85:28: ( ASSIGN ( single_expr | closed_compound_expr ) )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==ASSIGN) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:85:29: ASSIGN ( single_expr | closed_compound_expr )
							{
							ASSIGN14=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_decl_extension1165); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							ASSIGN14_tree = (Object)adaptor.create(ASSIGN14);
							adaptor.addChild(root_0, ASSIGN14_tree);
							}

							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:85:36: ( single_expr | closed_compound_expr )
							int alt4=2;
							int LA4_0 = input.LA(1);
							if ( (LA4_0==BOOLEAN_OPERATOR||LA4_0==CHAR_OPERATOR||LA4_0==IDENTIFIER||(LA4_0 >= LPAREN && LA4_0 <= MIN)||LA4_0==NOT||LA4_0==NUMBER||LA4_0==PLUS) ) {
								alt4=1;
							}
							else if ( (LA4_0==LCURLY) ) {
								alt4=2;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								NoViableAltException nvae =
									new NoViableAltException("", 4, 0, input);
								throw nvae;
							}

							switch (alt4) {
								case 1 :
									// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:85:37: single_expr
									{
									pushFollow(FOLLOW_single_expr_in_decl_extension1168);
									single_expr15=single_expr();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, single_expr15.getTree());

									}
									break;
								case 2 :
									// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:85:51: closed_compound_expr
									{
									pushFollow(FOLLOW_closed_compound_expr_in_decl_extension1172);
									closed_compound_expr16=closed_compound_expr();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, closed_compound_expr16.getTree());

									}
									break;

							}

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:86:9: CHAR IDENTIFIER ( ASSIGN CHAR_OPERATOR )?
					{
					root_0 = (Object)adaptor.nil();


					CHAR17=(Token)match(input,CHAR,FOLLOW_CHAR_in_decl_extension1185); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CHAR17_tree = (Object)adaptor.create(CHAR17);
					adaptor.addChild(root_0, CHAR17_tree);
					}

					IDENTIFIER18=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_decl_extension1187); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER18_tree = (Object)adaptor.create(IDENTIFIER18);
					adaptor.addChild(root_0, IDENTIFIER18_tree);
					}

					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:86:25: ( ASSIGN CHAR_OPERATOR )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==ASSIGN) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:86:26: ASSIGN CHAR_OPERATOR
							{
							ASSIGN19=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_decl_extension1190); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							ASSIGN19_tree = (Object)adaptor.create(ASSIGN19);
							adaptor.addChild(root_0, ASSIGN19_tree);
							}

							CHAR_OPERATOR20=(Token)match(input,CHAR_OPERATOR,FOLLOW_CHAR_OPERATOR_in_decl_extension1192); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							CHAR_OPERATOR20_tree = (Object)adaptor.create(CHAR_OPERATOR20);
							adaptor.addChild(root_0, CHAR_OPERATOR20_tree);
							}

							}
							break;

					}

					}
					break;
				case 3 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:87:9: BOOLEAN IDENTIFIER ( ASSIGN BOOLEAN_OPERATOR )?
					{
					root_0 = (Object)adaptor.nil();


					BOOLEAN21=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_decl_extension1204); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BOOLEAN21_tree = (Object)adaptor.create(BOOLEAN21);
					adaptor.addChild(root_0, BOOLEAN21_tree);
					}

					IDENTIFIER22=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_decl_extension1206); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER22_tree = (Object)adaptor.create(IDENTIFIER22);
					adaptor.addChild(root_0, IDENTIFIER22_tree);
					}

					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:87:28: ( ASSIGN BOOLEAN_OPERATOR )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==ASSIGN) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:87:29: ASSIGN BOOLEAN_OPERATOR
							{
							ASSIGN23=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_decl_extension1209); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							ASSIGN23_tree = (Object)adaptor.create(ASSIGN23);
							adaptor.addChild(root_0, ASSIGN23_tree);
							}

							BOOLEAN_OPERATOR24=(Token)match(input,BOOLEAN_OPERATOR,FOLLOW_BOOLEAN_OPERATOR_in_decl_extension1211); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							BOOLEAN_OPERATOR24_tree = (Object)adaptor.create(BOOLEAN_OPERATOR24);
							adaptor.addChild(root_0, BOOLEAN_OPERATOR24_tree);
							}

							}
							break;

					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "decl_extension"


	public static class statements_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statements"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:91:1: statements : statement SEMICOLON !;
	public final ChocolateParser.statements_return statements() throws RecognitionException {
		ChocolateParser.statements_return retval = new ChocolateParser.statements_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMICOLON26=null;
		ParserRuleReturnScope statement25 =null;

		Object SEMICOLON26_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:92:5: ( statement SEMICOLON !)
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:92:7: statement SEMICOLON !
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_statement_in_statements1234);
			statement25=statement();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, statement25.getTree());

			SEMICOLON26=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statements1236); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statements"


	public static class statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:95:1: statement : ( read | print | assign | ifelsethen );
	public final ChocolateParser.statement_return statement() throws RecognitionException {
		ChocolateParser.statement_return retval = new ChocolateParser.statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope read27 =null;
		ParserRuleReturnScope print28 =null;
		ParserRuleReturnScope assign29 =null;
		ParserRuleReturnScope ifelsethen30 =null;


		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:96:5: ( read | print | assign | ifelsethen )
			int alt9=4;
			switch ( input.LA(1) ) {
			case READ:
				{
				alt9=1;
				}
				break;
			case PRINT:
				{
				alt9=2;
				}
				break;
			case IDENTIFIER:
				{
				alt9=3;
				}
				break;
			case IF:
				{
				alt9=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:96:9: read
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_read_in_statement1260);
					read27=read();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, read27.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:97:9: print
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_print_in_statement1271);
					print28=print();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, print28.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:98:9: assign
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_assign_in_statement1282);
					assign29=assign();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assign29.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:99:9: ifelsethen
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_ifelsethen_in_statement1295);
					ifelsethen30=ifelsethen();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ifelsethen30.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class read_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "read"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:102:1: read : READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !;
	public final ChocolateParser.read_return read() throws RecognitionException {
		ChocolateParser.read_return retval = new ChocolateParser.read_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token READ31=null;
		Token LPAREN32=null;
		Token IDENTIFIER33=null;
		Token COMMA34=null;
		Token IDENTIFIER35=null;
		Token RPAREN36=null;

		Object READ31_tree=null;
		Object LPAREN32_tree=null;
		Object IDENTIFIER33_tree=null;
		Object COMMA34_tree=null;
		Object IDENTIFIER35_tree=null;
		Object RPAREN36_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:103:5: ( READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !)
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:103:9: READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			READ31=(Token)match(input,READ,FOLLOW_READ_in_read1314); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			READ31_tree = (Object)adaptor.create(READ31);
			root_0 = (Object)adaptor.becomeRoot(READ31_tree, root_0);
			}

			LPAREN32=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_read1317); if (state.failed) return retval;
			IDENTIFIER33=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read1320); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER33_tree = (Object)adaptor.create(IDENTIFIER33);
			adaptor.addChild(root_0, IDENTIFIER33_tree);
			}

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:103:34: ( COMMA ! IDENTIFIER )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==COMMA) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:103:35: COMMA ! IDENTIFIER
					{
					COMMA34=(Token)match(input,COMMA,FOLLOW_COMMA_in_read1323); if (state.failed) return retval;
					IDENTIFIER35=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read1326); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER35_tree = (Object)adaptor.create(IDENTIFIER35);
					adaptor.addChild(root_0, IDENTIFIER35_tree);
					}

					}
					break;

				default :
					break loop10;
				}
			}

			RPAREN36=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_read1330); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "read"


	public static class assign_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assign"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:106:1: assign : IDENTIFIER ASSIGN ^ ( assignexpr ) ;
	public final ChocolateParser.assign_return assign() throws RecognitionException {
		ChocolateParser.assign_return retval = new ChocolateParser.assign_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER37=null;
		Token ASSIGN38=null;
		ParserRuleReturnScope assignexpr39 =null;

		Object IDENTIFIER37_tree=null;
		Object ASSIGN38_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:107:5: ( IDENTIFIER ASSIGN ^ ( assignexpr ) )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:107:9: IDENTIFIER ASSIGN ^ ( assignexpr )
			{
			root_0 = (Object)adaptor.nil();


			IDENTIFIER37=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assign1350); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER37_tree = (Object)adaptor.create(IDENTIFIER37);
			adaptor.addChild(root_0, IDENTIFIER37_tree);
			}

			ASSIGN38=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign1352); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ASSIGN38_tree = (Object)adaptor.create(ASSIGN38);
			root_0 = (Object)adaptor.becomeRoot(ASSIGN38_tree, root_0);
			}

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:107:28: ( assignexpr )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:107:29: assignexpr
			{
			pushFollow(FOLLOW_assignexpr_in_assign1356);
			assignexpr39=assignexpr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, assignexpr39.getTree());

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assign"


	public static class assignexpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assignexpr"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:110:1: assignexpr : ( ( IDENTIFIER ASSIGN ^)=> ( IDENTIFIER ASSIGN ^ assignexpr ) | single_expr | closed_compound_expr );
	public final ChocolateParser.assignexpr_return assignexpr() throws RecognitionException {
		ChocolateParser.assignexpr_return retval = new ChocolateParser.assignexpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER40=null;
		Token ASSIGN41=null;
		ParserRuleReturnScope assignexpr42 =null;
		ParserRuleReturnScope single_expr43 =null;
		ParserRuleReturnScope closed_compound_expr44 =null;

		Object IDENTIFIER40_tree=null;
		Object ASSIGN41_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:111:5: ( ( IDENTIFIER ASSIGN ^)=> ( IDENTIFIER ASSIGN ^ assignexpr ) | single_expr | closed_compound_expr )
			int alt11=3;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				int LA11_1 = input.LA(2);
				if ( (synpred1_Chocolate()) ) {
					alt11=1;
				}
				else if ( (true) ) {
					alt11=2;
				}

				}
				break;
			case BOOLEAN_OPERATOR:
			case CHAR_OPERATOR:
			case LPAREN:
			case MIN:
			case NOT:
			case NUMBER:
			case PLUS:
				{
				alt11=2;
				}
				break;
			case LCURLY:
				{
				alt11=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:111:9: ( IDENTIFIER ASSIGN ^)=> ( IDENTIFIER ASSIGN ^ assignexpr )
					{
					root_0 = (Object)adaptor.nil();


					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:111:33: ( IDENTIFIER ASSIGN ^ assignexpr )
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:111:34: IDENTIFIER ASSIGN ^ assignexpr
					{
					IDENTIFIER40=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assignexpr1390); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER40_tree = (Object)adaptor.create(IDENTIFIER40);
					adaptor.addChild(root_0, IDENTIFIER40_tree);
					}

					ASSIGN41=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignexpr1392); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ASSIGN41_tree = (Object)adaptor.create(ASSIGN41);
					root_0 = (Object)adaptor.becomeRoot(ASSIGN41_tree, root_0);
					}

					pushFollow(FOLLOW_assignexpr_in_assignexpr1395);
					assignexpr42=assignexpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignexpr42.getTree());

					}

					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:112:9: single_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_single_expr_in_assignexpr1406);
					single_expr43=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, single_expr43.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:113:9: closed_compound_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_closed_compound_expr_in_assignexpr1416);
					closed_compound_expr44=closed_compound_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, closed_compound_expr44.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignexpr"


	public static class print_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "print"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:116:1: print : PRINT ^ LPAREN ! ( closed_compound_expr | IDENTIFIER | string ) ( COMMA ! ( closed_compound_expr | IDENTIFIER | string ) )* RPAREN !;
	public final ChocolateParser.print_return print() throws RecognitionException {
		ChocolateParser.print_return retval = new ChocolateParser.print_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PRINT45=null;
		Token LPAREN46=null;
		Token IDENTIFIER48=null;
		Token COMMA50=null;
		Token IDENTIFIER52=null;
		Token RPAREN54=null;
		ParserRuleReturnScope closed_compound_expr47 =null;
		ParserRuleReturnScope string49 =null;
		ParserRuleReturnScope closed_compound_expr51 =null;
		ParserRuleReturnScope string53 =null;

		Object PRINT45_tree=null;
		Object LPAREN46_tree=null;
		Object IDENTIFIER48_tree=null;
		Object COMMA50_tree=null;
		Object IDENTIFIER52_tree=null;
		Object RPAREN54_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:117:5: ( PRINT ^ LPAREN ! ( closed_compound_expr | IDENTIFIER | string ) ( COMMA ! ( closed_compound_expr | IDENTIFIER | string ) )* RPAREN !)
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:117:9: PRINT ^ LPAREN ! ( closed_compound_expr | IDENTIFIER | string ) ( COMMA ! ( closed_compound_expr | IDENTIFIER | string ) )* RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			PRINT45=(Token)match(input,PRINT,FOLLOW_PRINT_in_print1439); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			PRINT45_tree = (Object)adaptor.create(PRINT45);
			root_0 = (Object)adaptor.becomeRoot(PRINT45_tree, root_0);
			}

			LPAREN46=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_print1442); if (state.failed) return retval;
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:117:24: ( closed_compound_expr | IDENTIFIER | string )
			int alt12=3;
			switch ( input.LA(1) ) {
			case LCURLY:
				{
				alt12=1;
				}
				break;
			case IDENTIFIER:
				{
				alt12=2;
				}
				break;
			case DQUOTATION:
				{
				alt12=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:117:25: closed_compound_expr
					{
					pushFollow(FOLLOW_closed_compound_expr_in_print1446);
					closed_compound_expr47=closed_compound_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, closed_compound_expr47.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:117:48: IDENTIFIER
					{
					IDENTIFIER48=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_print1450); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER48_tree = (Object)adaptor.create(IDENTIFIER48);
					adaptor.addChild(root_0, IDENTIFIER48_tree);
					}

					}
					break;
				case 3 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:117:61: string
					{
					pushFollow(FOLLOW_string_in_print1454);
					string49=string();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, string49.getTree());

					}
					break;

			}

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:117:69: ( COMMA ! ( closed_compound_expr | IDENTIFIER | string ) )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==COMMA) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:117:70: COMMA ! ( closed_compound_expr | IDENTIFIER | string )
					{
					COMMA50=(Token)match(input,COMMA,FOLLOW_COMMA_in_print1458); if (state.failed) return retval;
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:117:77: ( closed_compound_expr | IDENTIFIER | string )
					int alt13=3;
					switch ( input.LA(1) ) {
					case LCURLY:
						{
						alt13=1;
						}
						break;
					case IDENTIFIER:
						{
						alt13=2;
						}
						break;
					case DQUOTATION:
						{
						alt13=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 13, 0, input);
						throw nvae;
					}
					switch (alt13) {
						case 1 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:117:78: closed_compound_expr
							{
							pushFollow(FOLLOW_closed_compound_expr_in_print1462);
							closed_compound_expr51=closed_compound_expr();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, closed_compound_expr51.getTree());

							}
							break;
						case 2 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:117:101: IDENTIFIER
							{
							IDENTIFIER52=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_print1466); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							IDENTIFIER52_tree = (Object)adaptor.create(IDENTIFIER52);
							adaptor.addChild(root_0, IDENTIFIER52_tree);
							}

							}
							break;
						case 3 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:117:114: string
							{
							pushFollow(FOLLOW_string_in_print1470);
							string53=string();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, string53.getTree());

							}
							break;

					}

					}
					break;

				default :
					break loop14;
				}
			}

			RPAREN54=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_print1475); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "print"


	public static class compound_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "compound_expr"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:121:1: compound_expr : ( unclosed_compound_expr | closed_compound_expr );
	public final ChocolateParser.compound_expr_return compound_expr() throws RecognitionException {
		ChocolateParser.compound_expr_return retval = new ChocolateParser.compound_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope unclosed_compound_expr55 =null;
		ParserRuleReturnScope closed_compound_expr56 =null;


		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:122:5: ( unclosed_compound_expr | closed_compound_expr )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==CONSTANT||(LA15_0 >= IDENTIFIER && LA15_0 <= IF)||LA15_0==PRINT||LA15_0==READ||LA15_0==VAR) ) {
				alt15=1;
			}
			else if ( (LA15_0==LCURLY) ) {
				alt15=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:122:9: unclosed_compound_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_unclosed_compound_expr_in_compound_expr1500);
					unclosed_compound_expr55=unclosed_compound_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unclosed_compound_expr55.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:123:9: closed_compound_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_closed_compound_expr_in_compound_expr1510);
					closed_compound_expr56=closed_compound_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, closed_compound_expr56.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "compound_expr"


	public static class unclosed_compound_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unclosed_compound_expr"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:126:1: unclosed_compound_expr : ( ( declarations )* statements )+ ;
	public final ChocolateParser.unclosed_compound_expr_return unclosed_compound_expr() throws RecognitionException {
		ChocolateParser.unclosed_compound_expr_return retval = new ChocolateParser.unclosed_compound_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope declarations57 =null;
		ParserRuleReturnScope statements58 =null;


		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:127:5: ( ( ( declarations )* statements )+ )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:127:9: ( ( declarations )* statements )+
			{
			root_0 = (Object)adaptor.nil();


			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:127:9: ( ( declarations )* statements )+
			int cnt17=0;
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==CONSTANT||(LA17_0 >= IDENTIFIER && LA17_0 <= IF)||LA17_0==PRINT||LA17_0==READ||LA17_0==VAR) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:127:10: ( declarations )* statements
					{
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:127:10: ( declarations )*
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( (LA16_0==CONSTANT||LA16_0==VAR) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:127:10: declarations
							{
							pushFollow(FOLLOW_declarations_in_unclosed_compound_expr1534);
							declarations57=declarations();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, declarations57.getTree());

							}
							break;

						default :
							break loop16;
						}
					}

					pushFollow(FOLLOW_statements_in_unclosed_compound_expr1537);
					statements58=statements();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statements58.getTree());

					}
					break;

				default :
					if ( cnt17 >= 1 ) break loop17;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(17, input);
					throw eee;
				}
				cnt17++;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unclosed_compound_expr"


	public static class closed_compound_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "closed_compound_expr"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:130:1: closed_compound_expr : LCURLY ! ( ( declarations )* statements )+ RCURLY !;
	public final ChocolateParser.closed_compound_expr_return closed_compound_expr() throws RecognitionException {
		ChocolateParser.closed_compound_expr_return retval = new ChocolateParser.closed_compound_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LCURLY59=null;
		Token RCURLY62=null;
		ParserRuleReturnScope declarations60 =null;
		ParserRuleReturnScope statements61 =null;

		Object LCURLY59_tree=null;
		Object RCURLY62_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:131:5: ( LCURLY ! ( ( declarations )* statements )+ RCURLY !)
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:131:9: LCURLY ! ( ( declarations )* statements )+ RCURLY !
			{
			root_0 = (Object)adaptor.nil();


			LCURLY59=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_closed_compound_expr1559); if (state.failed) return retval;
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:131:17: ( ( declarations )* statements )+
			int cnt19=0;
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==CONSTANT||(LA19_0 >= IDENTIFIER && LA19_0 <= IF)||LA19_0==PRINT||LA19_0==READ||LA19_0==VAR) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:131:18: ( declarations )* statements
					{
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:131:18: ( declarations )*
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( (LA18_0==CONSTANT||LA18_0==VAR) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:131:18: declarations
							{
							pushFollow(FOLLOW_declarations_in_closed_compound_expr1563);
							declarations60=declarations();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, declarations60.getTree());

							}
							break;

						default :
							break loop18;
						}
					}

					pushFollow(FOLLOW_statements_in_closed_compound_expr1566);
					statements61=statements();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statements61.getTree());

					}
					break;

				default :
					if ( cnt19 >= 1 ) break loop19;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(19, input);
					throw eee;
				}
				cnt19++;
			}

			RCURLY62=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_closed_compound_expr1570); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "closed_compound_expr"


	public static class single_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "single_expr"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:134:1: single_expr : arithmetic ;
	public final ChocolateParser.single_expr_return single_expr() throws RecognitionException {
		ChocolateParser.single_expr_return retval = new ChocolateParser.single_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope arithmetic63 =null;


		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:135:5: ( arithmetic )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:135:9: arithmetic
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_in_single_expr1594);
			arithmetic63=arithmetic();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic63.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "single_expr"


	public static class arithmetic_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arithmetic"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:138:1: arithmetic : arith2 ( OR ^ arith2 )* ;
	public final ChocolateParser.arithmetic_return arithmetic() throws RecognitionException {
		ChocolateParser.arithmetic_return retval = new ChocolateParser.arithmetic_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token OR65=null;
		ParserRuleReturnScope arith264 =null;
		ParserRuleReturnScope arith266 =null;

		Object OR65_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:139:5: ( arith2 ( OR ^ arith2 )* )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:139:9: arith2 ( OR ^ arith2 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arith2_in_arithmetic1613);
			arith264=arith2();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arith264.getTree());

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:139:16: ( OR ^ arith2 )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==OR) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:139:17: OR ^ arith2
					{
					OR65=(Token)match(input,OR,FOLLOW_OR_in_arithmetic1616); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					OR65_tree = (Object)adaptor.create(OR65);
					root_0 = (Object)adaptor.becomeRoot(OR65_tree, root_0);
					}

					pushFollow(FOLLOW_arith2_in_arithmetic1619);
					arith266=arith2();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arith266.getTree());

					}
					break;

				default :
					break loop20;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arithmetic"


	public static class arith2_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arith2"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:142:1: arith2 : arith3 ( AND ^ arith3 )* ;
	public final ChocolateParser.arith2_return arith2() throws RecognitionException {
		ChocolateParser.arith2_return retval = new ChocolateParser.arith2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AND68=null;
		ParserRuleReturnScope arith367 =null;
		ParserRuleReturnScope arith369 =null;

		Object AND68_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:143:5: ( arith3 ( AND ^ arith3 )* )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:143:9: arith3 ( AND ^ arith3 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arith3_in_arith21644);
			arith367=arith3();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arith367.getTree());

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:143:16: ( AND ^ arith3 )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==AND) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:143:17: AND ^ arith3
					{
					AND68=(Token)match(input,AND,FOLLOW_AND_in_arith21647); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AND68_tree = (Object)adaptor.create(AND68);
					root_0 = (Object)adaptor.becomeRoot(AND68_tree, root_0);
					}

					pushFollow(FOLLOW_arith3_in_arith21650);
					arith369=arith3();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arith369.getTree());

					}
					break;

				default :
					break loop21;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arith2"


	public static class arith3_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arith3"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:146:1: arith3 : arith4 ( ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^) arith4 )* ;
	public final ChocolateParser.arith3_return arith3() throws RecognitionException {
		ChocolateParser.arith3_return retval = new ChocolateParser.arith3_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LESS71=null;
		Token LESSEQ72=null;
		Token GREATEQ73=null;
		Token GREAT74=null;
		Token EQ75=null;
		Token NOTEQ76=null;
		ParserRuleReturnScope arith470 =null;
		ParserRuleReturnScope arith477 =null;

		Object LESS71_tree=null;
		Object LESSEQ72_tree=null;
		Object GREATEQ73_tree=null;
		Object GREAT74_tree=null;
		Object EQ75_tree=null;
		Object NOTEQ76_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:147:5: ( arith4 ( ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^) arith4 )* )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:147:9: arith4 ( ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^) arith4 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arith4_in_arith31675);
			arith470=arith4();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arith470.getTree());

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:147:16: ( ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^) arith4 )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( ((LA23_0 >= EQ && LA23_0 <= GREATEQ)||(LA23_0 >= LESS && LA23_0 <= LESSEQ)||LA23_0==NOTEQ) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:147:17: ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^) arith4
					{
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:147:17: ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^)
					int alt22=6;
					switch ( input.LA(1) ) {
					case LESS:
						{
						alt22=1;
						}
						break;
					case LESSEQ:
						{
						alt22=2;
						}
						break;
					case GREATEQ:
						{
						alt22=3;
						}
						break;
					case GREAT:
						{
						alt22=4;
						}
						break;
					case EQ:
						{
						alt22=5;
						}
						break;
					case NOTEQ:
						{
						alt22=6;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 22, 0, input);
						throw nvae;
					}
					switch (alt22) {
						case 1 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:147:18: LESS ^
							{
							LESS71=(Token)match(input,LESS,FOLLOW_LESS_in_arith31679); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							LESS71_tree = (Object)adaptor.create(LESS71);
							root_0 = (Object)adaptor.becomeRoot(LESS71_tree, root_0);
							}

							}
							break;
						case 2 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:147:26: LESSEQ ^
							{
							LESSEQ72=(Token)match(input,LESSEQ,FOLLOW_LESSEQ_in_arith31684); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							LESSEQ72_tree = (Object)adaptor.create(LESSEQ72);
							root_0 = (Object)adaptor.becomeRoot(LESSEQ72_tree, root_0);
							}

							}
							break;
						case 3 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:147:36: GREATEQ ^
							{
							GREATEQ73=(Token)match(input,GREATEQ,FOLLOW_GREATEQ_in_arith31689); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							GREATEQ73_tree = (Object)adaptor.create(GREATEQ73);
							root_0 = (Object)adaptor.becomeRoot(GREATEQ73_tree, root_0);
							}

							}
							break;
						case 4 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:147:47: GREAT ^
							{
							GREAT74=(Token)match(input,GREAT,FOLLOW_GREAT_in_arith31694); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							GREAT74_tree = (Object)adaptor.create(GREAT74);
							root_0 = (Object)adaptor.becomeRoot(GREAT74_tree, root_0);
							}

							}
							break;
						case 5 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:147:56: EQ ^
							{
							EQ75=(Token)match(input,EQ,FOLLOW_EQ_in_arith31699); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							EQ75_tree = (Object)adaptor.create(EQ75);
							root_0 = (Object)adaptor.becomeRoot(EQ75_tree, root_0);
							}

							}
							break;
						case 6 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:147:62: NOTEQ ^
							{
							NOTEQ76=(Token)match(input,NOTEQ,FOLLOW_NOTEQ_in_arith31704); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							NOTEQ76_tree = (Object)adaptor.create(NOTEQ76);
							root_0 = (Object)adaptor.becomeRoot(NOTEQ76_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_arith4_in_arith31708);
					arith477=arith4();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arith477.getTree());

					}
					break;

				default :
					break loop23;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arith3"


	public static class arith4_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arith4"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:150:1: arith4 : arith5 ( ( PLUS ^| MIN ^) arith5 )* ;
	public final ChocolateParser.arith4_return arith4() throws RecognitionException {
		ChocolateParser.arith4_return retval = new ChocolateParser.arith4_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS79=null;
		Token MIN80=null;
		ParserRuleReturnScope arith578 =null;
		ParserRuleReturnScope arith581 =null;

		Object PLUS79_tree=null;
		Object MIN80_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:151:5: ( arith5 ( ( PLUS ^| MIN ^) arith5 )* )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:151:9: arith5 ( ( PLUS ^| MIN ^) arith5 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arith5_in_arith41738);
			arith578=arith5();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arith578.getTree());

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:151:16: ( ( PLUS ^| MIN ^) arith5 )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==MIN||LA25_0==PLUS) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:151:17: ( PLUS ^| MIN ^) arith5
					{
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:151:17: ( PLUS ^| MIN ^)
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==PLUS) ) {
						alt24=1;
					}
					else if ( (LA24_0==MIN) ) {
						alt24=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 24, 0, input);
						throw nvae;
					}

					switch (alt24) {
						case 1 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:151:18: PLUS ^
							{
							PLUS79=(Token)match(input,PLUS,FOLLOW_PLUS_in_arith41742); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							PLUS79_tree = (Object)adaptor.create(PLUS79);
							root_0 = (Object)adaptor.becomeRoot(PLUS79_tree, root_0);
							}

							}
							break;
						case 2 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:151:26: MIN ^
							{
							MIN80=(Token)match(input,MIN,FOLLOW_MIN_in_arith41747); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							MIN80_tree = (Object)adaptor.create(MIN80);
							root_0 = (Object)adaptor.becomeRoot(MIN80_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_arith5_in_arith41751);
					arith581=arith5();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arith581.getTree());

					}
					break;

				default :
					break loop25;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arith4"


	public static class arith5_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arith5"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:154:1: arith5 : arith6 ( ( MULT ^| DIV ^| MOD ^) arith6 )* ;
	public final ChocolateParser.arith5_return arith5() throws RecognitionException {
		ChocolateParser.arith5_return retval = new ChocolateParser.arith5_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MULT83=null;
		Token DIV84=null;
		Token MOD85=null;
		ParserRuleReturnScope arith682 =null;
		ParserRuleReturnScope arith686 =null;

		Object MULT83_tree=null;
		Object DIV84_tree=null;
		Object MOD85_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:155:5: ( arith6 ( ( MULT ^| DIV ^| MOD ^) arith6 )* )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:155:9: arith6 ( ( MULT ^| DIV ^| MOD ^) arith6 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arith6_in_arith51782);
			arith682=arith6();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arith682.getTree());

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:155:16: ( ( MULT ^| DIV ^| MOD ^) arith6 )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==DIV||(LA27_0 >= MOD && LA27_0 <= MULT)) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:155:17: ( MULT ^| DIV ^| MOD ^) arith6
					{
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:155:17: ( MULT ^| DIV ^| MOD ^)
					int alt26=3;
					switch ( input.LA(1) ) {
					case MULT:
						{
						alt26=1;
						}
						break;
					case DIV:
						{
						alt26=2;
						}
						break;
					case MOD:
						{
						alt26=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 26, 0, input);
						throw nvae;
					}
					switch (alt26) {
						case 1 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:155:18: MULT ^
							{
							MULT83=(Token)match(input,MULT,FOLLOW_MULT_in_arith51786); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							MULT83_tree = (Object)adaptor.create(MULT83);
							root_0 = (Object)adaptor.becomeRoot(MULT83_tree, root_0);
							}

							}
							break;
						case 2 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:155:26: DIV ^
							{
							DIV84=(Token)match(input,DIV,FOLLOW_DIV_in_arith51791); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							DIV84_tree = (Object)adaptor.create(DIV84);
							root_0 = (Object)adaptor.becomeRoot(DIV84_tree, root_0);
							}

							}
							break;
						case 3 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:155:33: MOD ^
							{
							MOD85=(Token)match(input,MOD,FOLLOW_MOD_in_arith51796); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							MOD85_tree = (Object)adaptor.create(MOD85);
							root_0 = (Object)adaptor.becomeRoot(MOD85_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_arith6_in_arith51800);
					arith686=arith6();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arith686.getTree());

					}
					break;

				default :
					break loop27;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arith5"


	public static class arith6_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arith6"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:158:1: arith6 : ( ( PLUS ^| MIN ^| NOT ^)? operand ) ;
	public final ChocolateParser.arith6_return arith6() throws RecognitionException {
		ChocolateParser.arith6_return retval = new ChocolateParser.arith6_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS87=null;
		Token MIN88=null;
		Token NOT89=null;
		ParserRuleReturnScope operand90 =null;

		Object PLUS87_tree=null;
		Object MIN88_tree=null;
		Object NOT89_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:159:5: ( ( ( PLUS ^| MIN ^| NOT ^)? operand ) )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:159:9: ( ( PLUS ^| MIN ^| NOT ^)? operand )
			{
			root_0 = (Object)adaptor.nil();


			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:159:9: ( ( PLUS ^| MIN ^| NOT ^)? operand )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:159:10: ( PLUS ^| MIN ^| NOT ^)? operand
			{
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:159:10: ( PLUS ^| MIN ^| NOT ^)?
			int alt28=4;
			switch ( input.LA(1) ) {
				case PLUS:
					{
					alt28=1;
					}
					break;
				case MIN:
					{
					alt28=2;
					}
					break;
				case NOT:
					{
					alt28=3;
					}
					break;
			}
			switch (alt28) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:159:11: PLUS ^
					{
					PLUS87=(Token)match(input,PLUS,FOLLOW_PLUS_in_arith61835); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					PLUS87_tree = (Object)adaptor.create(PLUS87);
					root_0 = (Object)adaptor.becomeRoot(PLUS87_tree, root_0);
					}

					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:159:19: MIN ^
					{
					MIN88=(Token)match(input,MIN,FOLLOW_MIN_in_arith61840); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					MIN88_tree = (Object)adaptor.create(MIN88);
					root_0 = (Object)adaptor.becomeRoot(MIN88_tree, root_0);
					}

					}
					break;
				case 3 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:159:26: NOT ^
					{
					NOT89=(Token)match(input,NOT,FOLLOW_NOT_in_arith61845); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NOT89_tree = (Object)adaptor.create(NOT89);
					root_0 = (Object)adaptor.becomeRoot(NOT89_tree, root_0);
					}

					}
					break;

			}

			pushFollow(FOLLOW_operand_in_arith61850);
			operand90=operand();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, operand90.getTree());

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arith6"


	public static class ifelsethen_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ifelsethen"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:162:1: ifelsethen : IF ^ single_expr THEN ! LCURLY ! unclosed_compound_expr RCURLY ! ( ELSE ! LCURLY ! unclosed_compound_expr RCURLY !)? ;
	public final ChocolateParser.ifelsethen_return ifelsethen() throws RecognitionException {
		ChocolateParser.ifelsethen_return retval = new ChocolateParser.ifelsethen_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IF91=null;
		Token THEN93=null;
		Token LCURLY94=null;
		Token RCURLY96=null;
		Token ELSE97=null;
		Token LCURLY98=null;
		Token RCURLY100=null;
		ParserRuleReturnScope single_expr92 =null;
		ParserRuleReturnScope unclosed_compound_expr95 =null;
		ParserRuleReturnScope unclosed_compound_expr99 =null;

		Object IF91_tree=null;
		Object THEN93_tree=null;
		Object LCURLY94_tree=null;
		Object RCURLY96_tree=null;
		Object ELSE97_tree=null;
		Object LCURLY98_tree=null;
		Object RCURLY100_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:163:5: ( IF ^ single_expr THEN ! LCURLY ! unclosed_compound_expr RCURLY ! ( ELSE ! LCURLY ! unclosed_compound_expr RCURLY !)? )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:163:9: IF ^ single_expr THEN ! LCURLY ! unclosed_compound_expr RCURLY ! ( ELSE ! LCURLY ! unclosed_compound_expr RCURLY !)?
			{
			root_0 = (Object)adaptor.nil();


			IF91=(Token)match(input,IF,FOLLOW_IF_in_ifelsethen1874); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IF91_tree = (Object)adaptor.create(IF91);
			root_0 = (Object)adaptor.becomeRoot(IF91_tree, root_0);
			}

			pushFollow(FOLLOW_single_expr_in_ifelsethen1877);
			single_expr92=single_expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, single_expr92.getTree());

			THEN93=(Token)match(input,THEN,FOLLOW_THEN_in_ifelsethen1879); if (state.failed) return retval;
			LCURLY94=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_ifelsethen1882); if (state.failed) return retval;
			pushFollow(FOLLOW_unclosed_compound_expr_in_ifelsethen1885);
			unclosed_compound_expr95=unclosed_compound_expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, unclosed_compound_expr95.getTree());

			RCURLY96=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_ifelsethen1887); if (state.failed) return retval;
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:163:70: ( ELSE ! LCURLY ! unclosed_compound_expr RCURLY !)?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==ELSE) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:163:71: ELSE ! LCURLY ! unclosed_compound_expr RCURLY !
					{
					ELSE97=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifelsethen1891); if (state.failed) return retval;
					LCURLY98=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_ifelsethen1894); if (state.failed) return retval;
					pushFollow(FOLLOW_unclosed_compound_expr_in_ifelsethen1897);
					unclosed_compound_expr99=unclosed_compound_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unclosed_compound_expr99.getTree());

					RCURLY100=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_ifelsethen1899); if (state.failed) return retval;
					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ifelsethen"


	public static class operand_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "operand"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:167:1: operand : ( IDENTIFIER | NUMBER | LPAREN ! single_expr RPAREN !| BOOLEAN_OPERATOR | CHAR_OPERATOR );
	public final ChocolateParser.operand_return operand() throws RecognitionException {
		ChocolateParser.operand_return retval = new ChocolateParser.operand_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER101=null;
		Token NUMBER102=null;
		Token LPAREN103=null;
		Token RPAREN105=null;
		Token BOOLEAN_OPERATOR106=null;
		Token CHAR_OPERATOR107=null;
		ParserRuleReturnScope single_expr104 =null;

		Object IDENTIFIER101_tree=null;
		Object NUMBER102_tree=null;
		Object LPAREN103_tree=null;
		Object RPAREN105_tree=null;
		Object BOOLEAN_OPERATOR106_tree=null;
		Object CHAR_OPERATOR107_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:168:5: ( IDENTIFIER | NUMBER | LPAREN ! single_expr RPAREN !| BOOLEAN_OPERATOR | CHAR_OPERATOR )
			int alt30=5;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt30=1;
				}
				break;
			case NUMBER:
				{
				alt30=2;
				}
				break;
			case LPAREN:
				{
				alt30=3;
				}
				break;
			case BOOLEAN_OPERATOR:
				{
				alt30=4;
				}
				break;
			case CHAR_OPERATOR:
				{
				alt30=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}
			switch (alt30) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:168:9: IDENTIFIER
					{
					root_0 = (Object)adaptor.nil();


					IDENTIFIER101=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand1922); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER101_tree = (Object)adaptor.create(IDENTIFIER101);
					adaptor.addChild(root_0, IDENTIFIER101_tree);
					}

					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:169:9: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER102=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_operand1932); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NUMBER102_tree = (Object)adaptor.create(NUMBER102);
					adaptor.addChild(root_0, NUMBER102_tree);
					}

					}
					break;
				case 3 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:170:9: LPAREN ! single_expr RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					LPAREN103=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operand1942); if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_operand1945);
					single_expr104=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, single_expr104.getTree());

					RPAREN105=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operand1947); if (state.failed) return retval;
					}
					break;
				case 4 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:171:9: BOOLEAN_OPERATOR
					{
					root_0 = (Object)adaptor.nil();


					BOOLEAN_OPERATOR106=(Token)match(input,BOOLEAN_OPERATOR,FOLLOW_BOOLEAN_OPERATOR_in_operand1958); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BOOLEAN_OPERATOR106_tree = (Object)adaptor.create(BOOLEAN_OPERATOR106);
					adaptor.addChild(root_0, BOOLEAN_OPERATOR106_tree);
					}

					}
					break;
				case 5 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:172:9: CHAR_OPERATOR
					{
					root_0 = (Object)adaptor.nil();


					CHAR_OPERATOR107=(Token)match(input,CHAR_OPERATOR,FOLLOW_CHAR_OPERATOR_in_operand1968); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CHAR_OPERATOR107_tree = (Object)adaptor.create(CHAR_OPERATOR107);
					adaptor.addChild(root_0, CHAR_OPERATOR107_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "operand"


	public static class type_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:175:1: type : ( INTEGER | CHAR | BOOLEAN );
	public final ChocolateParser.type_return type() throws RecognitionException {
		ChocolateParser.type_return retval = new ChocolateParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set108=null;

		Object set108_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:176:5: ( INTEGER | CHAR | BOOLEAN )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:
			{
			root_0 = (Object)adaptor.nil();


			set108=input.LT(1);
			if ( input.LA(1)==BOOLEAN||input.LA(1)==CHAR||input.LA(1)==INTEGER ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set108));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type"


	public static class string_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "string"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:179:1: string : DQUOTATION ! ( graphic )* DQUOTATION !;
	public final ChocolateParser.string_return string() throws RecognitionException {
		ChocolateParser.string_return retval = new ChocolateParser.string_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token DQUOTATION109=null;
		Token DQUOTATION111=null;
		ParserRuleReturnScope graphic110 =null;

		Object DQUOTATION109_tree=null;
		Object DQUOTATION111_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:180:5: ( DQUOTATION ! ( graphic )* DQUOTATION !)
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:180:9: DQUOTATION ! ( graphic )* DQUOTATION !
			{
			root_0 = (Object)adaptor.nil();


			DQUOTATION109=(Token)match(input,DQUOTATION,FOLLOW_DQUOTATION_in_string2018); if (state.failed) return retval;
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:180:21: ( graphic )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==DIGIT||LA31_0==LETTER) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:180:21: graphic
					{
					pushFollow(FOLLOW_graphic_in_string2021);
					graphic110=graphic();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, graphic110.getTree());

					}
					break;

				default :
					break loop31;
				}
			}

			DQUOTATION111=(Token)match(input,DQUOTATION,FOLLOW_DQUOTATION_in_string2024); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "string"


	public static class graphic_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "graphic"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:183:1: graphic : ( LETTER | DIGIT );
	public final ChocolateParser.graphic_return graphic() throws RecognitionException {
		ChocolateParser.graphic_return retval = new ChocolateParser.graphic_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set112=null;

		Object set112_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:184:5: ( LETTER | DIGIT )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:
			{
			root_0 = (Object)adaptor.nil();


			set112=input.LT(1);
			if ( input.LA(1)==DIGIT||input.LA(1)==LETTER ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set112));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "graphic"

	// $ANTLR start synpred1_Chocolate
	public final void synpred1_Chocolate_fragment() throws RecognitionException {
		// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:111:9: ( IDENTIFIER ASSIGN ^)
		// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:111:10: IDENTIFIER ASSIGN ^
		{
		match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred1_Chocolate1381); if (state.failed) return;

		match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred1_Chocolate1383); if (state.failed) return;

		}

	}
	// $ANTLR end synpred1_Chocolate

	// Delegated rules

	public final boolean synpred1_Chocolate() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_Chocolate_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_declarations_in_program983 = new BitSet(new long[]{0x0000844000602000L});
	public static final BitSet FOLLOW_statements_in_program986 = new BitSet(new long[]{0x0000844000602000L});
	public static final BitSet FOLLOW_EOF_in_program990 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_declarations1053 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_declarations1055 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_declaration1077 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_declaration1081 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONSTANT_in_constant1108 = new BitSet(new long[]{0x0000000000800140L});
	public static final BitSet FOLLOW_decl_extension_in_constant1111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_variable1134 = new BitSet(new long[]{0x0000000000800140L});
	public static final BitSet FOLLOW_decl_extension_in_variable1137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_decl_extension1160 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_decl_extension1162 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_ASSIGN_in_decl_extension1165 = new BitSet(new long[]{0x0000002A61200280L});
	public static final BitSet FOLLOW_single_expr_in_decl_extension1168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_closed_compound_expr_in_decl_extension1172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_decl_extension1185 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_decl_extension1187 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_ASSIGN_in_decl_extension1190 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CHAR_OPERATOR_in_decl_extension1192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_decl_extension1204 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_decl_extension1206 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_ASSIGN_in_decl_extension1209 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BOOLEAN_OPERATOR_in_decl_extension1211 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statements1234 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_statements1236 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_in_statement1260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_in_statement1271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assign_in_statement1282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifelsethen_in_statement1295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read1314 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_LPAREN_in_read1317 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read1320 = new BitSet(new long[]{0x0000080000000800L});
	public static final BitSet FOLLOW_COMMA_in_read1323 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read1326 = new BitSet(new long[]{0x0000080000000800L});
	public static final BitSet FOLLOW_RPAREN_in_read1330 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_assign1350 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_assign1352 = new BitSet(new long[]{0x0000002A61200280L});
	public static final BitSet FOLLOW_assignexpr_in_assign1356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_assignexpr1390 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_assignexpr1392 = new BitSet(new long[]{0x0000002A61200280L});
	public static final BitSet FOLLOW_assignexpr_in_assignexpr1395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_single_expr_in_assignexpr1406 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_closed_compound_expr_in_assignexpr1416 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print1439 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_LPAREN_in_print1442 = new BitSet(new long[]{0x0000000001210000L});
	public static final BitSet FOLLOW_closed_compound_expr_in_print1446 = new BitSet(new long[]{0x0000080000000800L});
	public static final BitSet FOLLOW_IDENTIFIER_in_print1450 = new BitSet(new long[]{0x0000080000000800L});
	public static final BitSet FOLLOW_string_in_print1454 = new BitSet(new long[]{0x0000080000000800L});
	public static final BitSet FOLLOW_COMMA_in_print1458 = new BitSet(new long[]{0x0000000001210000L});
	public static final BitSet FOLLOW_closed_compound_expr_in_print1462 = new BitSet(new long[]{0x0000080000000800L});
	public static final BitSet FOLLOW_IDENTIFIER_in_print1466 = new BitSet(new long[]{0x0000080000000800L});
	public static final BitSet FOLLOW_string_in_print1470 = new BitSet(new long[]{0x0000080000000800L});
	public static final BitSet FOLLOW_RPAREN_in_print1475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unclosed_compound_expr_in_compound_expr1500 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_closed_compound_expr_in_compound_expr1510 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declarations_in_unclosed_compound_expr1534 = new BitSet(new long[]{0x0000844000602000L});
	public static final BitSet FOLLOW_statements_in_unclosed_compound_expr1537 = new BitSet(new long[]{0x0000844000602002L});
	public static final BitSet FOLLOW_LCURLY_in_closed_compound_expr1559 = new BitSet(new long[]{0x0000844000602000L});
	public static final BitSet FOLLOW_declarations_in_closed_compound_expr1563 = new BitSet(new long[]{0x0000844000602000L});
	public static final BitSet FOLLOW_statements_in_closed_compound_expr1566 = new BitSet(new long[]{0x0000864000602000L});
	public static final BitSet FOLLOW_RCURLY_in_closed_compound_expr1570 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_in_single_expr1594 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arith2_in_arithmetic1613 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_OR_in_arithmetic1616 = new BitSet(new long[]{0x0000002A60200280L});
	public static final BitSet FOLLOW_arith2_in_arithmetic1619 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_arith3_in_arith21644 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_AND_in_arith21647 = new BitSet(new long[]{0x0000002A60200280L});
	public static final BitSet FOLLOW_arith3_in_arith21650 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_arith4_in_arith31675 = new BitSet(new long[]{0x00000004061C0002L});
	public static final BitSet FOLLOW_LESS_in_arith31679 = new BitSet(new long[]{0x0000002A60200280L});
	public static final BitSet FOLLOW_LESSEQ_in_arith31684 = new BitSet(new long[]{0x0000002A60200280L});
	public static final BitSet FOLLOW_GREATEQ_in_arith31689 = new BitSet(new long[]{0x0000002A60200280L});
	public static final BitSet FOLLOW_GREAT_in_arith31694 = new BitSet(new long[]{0x0000002A60200280L});
	public static final BitSet FOLLOW_EQ_in_arith31699 = new BitSet(new long[]{0x0000002A60200280L});
	public static final BitSet FOLLOW_NOTEQ_in_arith31704 = new BitSet(new long[]{0x0000002A60200280L});
	public static final BitSet FOLLOW_arith4_in_arith31708 = new BitSet(new long[]{0x00000004061C0002L});
	public static final BitSet FOLLOW_arith5_in_arith41738 = new BitSet(new long[]{0x0000002040000002L});
	public static final BitSet FOLLOW_PLUS_in_arith41742 = new BitSet(new long[]{0x0000002A60200280L});
	public static final BitSet FOLLOW_MIN_in_arith41747 = new BitSet(new long[]{0x0000002A60200280L});
	public static final BitSet FOLLOW_arith5_in_arith41751 = new BitSet(new long[]{0x0000002040000002L});
	public static final BitSet FOLLOW_arith6_in_arith51782 = new BitSet(new long[]{0x0000000180008002L});
	public static final BitSet FOLLOW_MULT_in_arith51786 = new BitSet(new long[]{0x0000002A60200280L});
	public static final BitSet FOLLOW_DIV_in_arith51791 = new BitSet(new long[]{0x0000002A60200280L});
	public static final BitSet FOLLOW_MOD_in_arith51796 = new BitSet(new long[]{0x0000002A60200280L});
	public static final BitSet FOLLOW_arith6_in_arith51800 = new BitSet(new long[]{0x0000000180008002L});
	public static final BitSet FOLLOW_PLUS_in_arith61835 = new BitSet(new long[]{0x0000000820200280L});
	public static final BitSet FOLLOW_MIN_in_arith61840 = new BitSet(new long[]{0x0000000820200280L});
	public static final BitSet FOLLOW_NOT_in_arith61845 = new BitSet(new long[]{0x0000000820200280L});
	public static final BitSet FOLLOW_operand_in_arith61850 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifelsethen1874 = new BitSet(new long[]{0x0000002A60200280L});
	public static final BitSet FOLLOW_single_expr_in_ifelsethen1877 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_THEN_in_ifelsethen1879 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_LCURLY_in_ifelsethen1882 = new BitSet(new long[]{0x0000844000602000L});
	public static final BitSet FOLLOW_unclosed_compound_expr_in_ifelsethen1885 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_RCURLY_in_ifelsethen1887 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_ELSE_in_ifelsethen1891 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_LCURLY_in_ifelsethen1894 = new BitSet(new long[]{0x0000844000602000L});
	public static final BitSet FOLLOW_unclosed_compound_expr_in_ifelsethen1897 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_RCURLY_in_ifelsethen1899 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand1922 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand1932 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand1942 = new BitSet(new long[]{0x0000002A60200280L});
	public static final BitSet FOLLOW_single_expr_in_operand1945 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_RPAREN_in_operand1947 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_OPERATOR_in_operand1958 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_OPERATOR_in_operand1968 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DQUOTATION_in_string2018 = new BitSet(new long[]{0x0000000008014000L});
	public static final BitSet FOLLOW_graphic_in_string2021 = new BitSet(new long[]{0x0000000008014000L});
	public static final BitSet FOLLOW_DQUOTATION_in_string2024 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_synpred1_Chocolate1381 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_synpred1_Chocolate1383 = new BitSet(new long[]{0x0000000000000002L});
}
