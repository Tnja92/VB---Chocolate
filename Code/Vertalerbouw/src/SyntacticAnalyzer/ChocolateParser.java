// $ANTLR 3.5 C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g 2013-07-06 21:03:13

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
	@Override public String getGrammarFileName() { return "C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g"; }


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:61:1: program : ( ( declarations )* statements )+ EOF -> ^( PROGRAM ( ( declarations )* statements )+ ) ;
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
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:62:5: ( ( ( declarations )* statements )+ EOF -> ^( PROGRAM ( ( declarations )* statements )+ ) )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:62:10: ( ( declarations )* statements )+ EOF
			{
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:62:10: ( ( declarations )* statements )+
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
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:62:11: ( declarations )* statements
					{
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:62:11: ( declarations )*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( (LA1_0==CONSTANT||LA1_0==VAR) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:62:11: declarations
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
			// elements: declarations, statements
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
				// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:63:17: ^( PROGRAM ( ( declarations )* statements )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				if ( !(stream_statements.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_statements.hasNext() ) {
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:63:28: ( declarations )*
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:68:1: declarations : declaration SEMICOLON !;
	public final ChocolateParser.declarations_return declarations() throws RecognitionException {
		ChocolateParser.declarations_return retval = new ChocolateParser.declarations_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMICOLON5=null;
		ParserRuleReturnScope declaration4 =null;

		Object SEMICOLON5_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:69:5: ( declaration SEMICOLON !)
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:69:9: declaration SEMICOLON !
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:72:1: declaration : ( CONSTANT ^ constant_extension | VAR ^ var_extension );
	public final ChocolateParser.declaration_return declaration() throws RecognitionException {
		ChocolateParser.declaration_return retval = new ChocolateParser.declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token CONSTANT6=null;
		Token VAR8=null;
		ParserRuleReturnScope constant_extension7 =null;
		ParserRuleReturnScope var_extension9 =null;

		Object CONSTANT6_tree=null;
		Object VAR8_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:73:5: ( CONSTANT ^ constant_extension | VAR ^ var_extension )
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
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:73:9: CONSTANT ^ constant_extension
					{
					root_0 = (Object)adaptor.nil();


					CONSTANT6=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_declaration1076); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CONSTANT6_tree = (Object)adaptor.create(CONSTANT6);
					root_0 = (Object)adaptor.becomeRoot(CONSTANT6_tree, root_0);
					}

					pushFollow(FOLLOW_constant_extension_in_declaration1079);
					constant_extension7=constant_extension();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constant_extension7.getTree());

					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:74:9: VAR ^ var_extension
					{
					root_0 = (Object)adaptor.nil();


					VAR8=(Token)match(input,VAR,FOLLOW_VAR_in_declaration1089); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VAR8_tree = (Object)adaptor.create(VAR8);
					root_0 = (Object)adaptor.becomeRoot(VAR8_tree, root_0);
					}

					pushFollow(FOLLOW_var_extension_in_declaration1092);
					var_extension9=var_extension();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, var_extension9.getTree());

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
	// $ANTLR end "declaration"


	public static class extra_decl_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "extra_decl"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:77:1: extra_decl : COMMA IDENTIFIER ;
	public final ChocolateParser.extra_decl_return extra_decl() throws RecognitionException {
		ChocolateParser.extra_decl_return retval = new ChocolateParser.extra_decl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token COMMA10=null;
		Token IDENTIFIER11=null;

		Object COMMA10_tree=null;
		Object IDENTIFIER11_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:78:5: ( COMMA IDENTIFIER )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:78:9: COMMA IDENTIFIER
			{
			root_0 = (Object)adaptor.nil();


			COMMA10=(Token)match(input,COMMA,FOLLOW_COMMA_in_extra_decl1115); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			COMMA10_tree = (Object)adaptor.create(COMMA10);
			adaptor.addChild(root_0, COMMA10_tree);
			}

			IDENTIFIER11=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_extra_decl1117); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER11_tree = (Object)adaptor.create(IDENTIFIER11);
			adaptor.addChild(root_0, IDENTIFIER11_tree);
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
	// $ANTLR end "extra_decl"


	public static class constant_extension_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constant_extension"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:81:1: constant_extension : ( INTEGER IDENTIFIER ( extra_decl )* ASSIGN ( single_expr | closed_compound_expr ) | CHAR IDENTIFIER ( extra_decl )* ASSIGN CHAR_OPERATOR | BOOLEAN IDENTIFIER ( extra_decl )* ASSIGN BOOLEAN_OPERATOR );
	public final ChocolateParser.constant_extension_return constant_extension() throws RecognitionException {
		ChocolateParser.constant_extension_return retval = new ChocolateParser.constant_extension_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INTEGER12=null;
		Token IDENTIFIER13=null;
		Token ASSIGN15=null;
		Token CHAR18=null;
		Token IDENTIFIER19=null;
		Token ASSIGN21=null;
		Token CHAR_OPERATOR22=null;
		Token BOOLEAN23=null;
		Token IDENTIFIER24=null;
		Token ASSIGN26=null;
		Token BOOLEAN_OPERATOR27=null;
		ParserRuleReturnScope extra_decl14 =null;
		ParserRuleReturnScope single_expr16 =null;
		ParserRuleReturnScope closed_compound_expr17 =null;
		ParserRuleReturnScope extra_decl20 =null;
		ParserRuleReturnScope extra_decl25 =null;

		Object INTEGER12_tree=null;
		Object IDENTIFIER13_tree=null;
		Object ASSIGN15_tree=null;
		Object CHAR18_tree=null;
		Object IDENTIFIER19_tree=null;
		Object ASSIGN21_tree=null;
		Object CHAR_OPERATOR22_tree=null;
		Object BOOLEAN23_tree=null;
		Object IDENTIFIER24_tree=null;
		Object ASSIGN26_tree=null;
		Object BOOLEAN_OPERATOR27_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:83:5: ( INTEGER IDENTIFIER ( extra_decl )* ASSIGN ( single_expr | closed_compound_expr ) | CHAR IDENTIFIER ( extra_decl )* ASSIGN CHAR_OPERATOR | BOOLEAN IDENTIFIER ( extra_decl )* ASSIGN BOOLEAN_OPERATOR )
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
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:83:9: INTEGER IDENTIFIER ( extra_decl )* ASSIGN ( single_expr | closed_compound_expr )
					{
					root_0 = (Object)adaptor.nil();


					INTEGER12=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_constant_extension1145); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INTEGER12_tree = (Object)adaptor.create(INTEGER12);
					adaptor.addChild(root_0, INTEGER12_tree);
					}

					IDENTIFIER13=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant_extension1147); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER13_tree = (Object)adaptor.create(IDENTIFIER13);
					adaptor.addChild(root_0, IDENTIFIER13_tree);
					}

					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:83:28: ( extra_decl )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==COMMA) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:83:29: extra_decl
							{
							pushFollow(FOLLOW_extra_decl_in_constant_extension1150);
							extra_decl14=extra_decl();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, extra_decl14.getTree());

							}
							break;

						default :
							break loop4;
						}
					}

					ASSIGN15=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_constant_extension1154); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ASSIGN15_tree = (Object)adaptor.create(ASSIGN15);
					adaptor.addChild(root_0, ASSIGN15_tree);
					}

					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:83:49: ( single_expr | closed_compound_expr )
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==BOOLEAN_OPERATOR||LA5_0==CHAR_OPERATOR||LA5_0==IDENTIFIER||(LA5_0 >= LPAREN && LA5_0 <= MIN)||LA5_0==NOT||LA5_0==NUMBER||LA5_0==PLUS) ) {
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
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:83:50: single_expr
							{
							pushFollow(FOLLOW_single_expr_in_constant_extension1157);
							single_expr16=single_expr();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, single_expr16.getTree());

							}
							break;
						case 2 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:83:64: closed_compound_expr
							{
							pushFollow(FOLLOW_closed_compound_expr_in_constant_extension1161);
							closed_compound_expr17=closed_compound_expr();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, closed_compound_expr17.getTree());

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:85:9: CHAR IDENTIFIER ( extra_decl )* ASSIGN CHAR_OPERATOR
					{
					root_0 = (Object)adaptor.nil();


					CHAR18=(Token)match(input,CHAR,FOLLOW_CHAR_in_constant_extension1177); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CHAR18_tree = (Object)adaptor.create(CHAR18);
					adaptor.addChild(root_0, CHAR18_tree);
					}

					IDENTIFIER19=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant_extension1179); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER19_tree = (Object)adaptor.create(IDENTIFIER19);
					adaptor.addChild(root_0, IDENTIFIER19_tree);
					}

					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:85:25: ( extra_decl )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==COMMA) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:85:26: extra_decl
							{
							pushFollow(FOLLOW_extra_decl_in_constant_extension1182);
							extra_decl20=extra_decl();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, extra_decl20.getTree());

							}
							break;

						default :
							break loop6;
						}
					}

					ASSIGN21=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_constant_extension1186); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ASSIGN21_tree = (Object)adaptor.create(ASSIGN21);
					adaptor.addChild(root_0, ASSIGN21_tree);
					}

					CHAR_OPERATOR22=(Token)match(input,CHAR_OPERATOR,FOLLOW_CHAR_OPERATOR_in_constant_extension1188); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CHAR_OPERATOR22_tree = (Object)adaptor.create(CHAR_OPERATOR22);
					adaptor.addChild(root_0, CHAR_OPERATOR22_tree);
					}

					}
					break;
				case 3 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:87:9: BOOLEAN IDENTIFIER ( extra_decl )* ASSIGN BOOLEAN_OPERATOR
					{
					root_0 = (Object)adaptor.nil();


					BOOLEAN23=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_constant_extension1203); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BOOLEAN23_tree = (Object)adaptor.create(BOOLEAN23);
					adaptor.addChild(root_0, BOOLEAN23_tree);
					}

					IDENTIFIER24=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant_extension1205); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER24_tree = (Object)adaptor.create(IDENTIFIER24);
					adaptor.addChild(root_0, IDENTIFIER24_tree);
					}

					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:87:28: ( extra_decl )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0==COMMA) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:87:29: extra_decl
							{
							pushFollow(FOLLOW_extra_decl_in_constant_extension1208);
							extra_decl25=extra_decl();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, extra_decl25.getTree());

							}
							break;

						default :
							break loop7;
						}
					}

					ASSIGN26=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_constant_extension1212); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ASSIGN26_tree = (Object)adaptor.create(ASSIGN26);
					adaptor.addChild(root_0, ASSIGN26_tree);
					}

					BOOLEAN_OPERATOR27=(Token)match(input,BOOLEAN_OPERATOR,FOLLOW_BOOLEAN_OPERATOR_in_constant_extension1214); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BOOLEAN_OPERATOR27_tree = (Object)adaptor.create(BOOLEAN_OPERATOR27);
					adaptor.addChild(root_0, BOOLEAN_OPERATOR27_tree);
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
	// $ANTLR end "constant_extension"


	public static class var_extension_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "var_extension"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:90:1: var_extension : ( INTEGER IDENTIFIER ( extra_decl )* ( ASSIGN ( single_expr | closed_compound_expr ) )? | CHAR IDENTIFIER ( extra_decl )* ( ASSIGN CHAR_OPERATOR )? | BOOLEAN IDENTIFIER ( extra_decl )* ( ASSIGN BOOLEAN_OPERATOR )? );
	public final ChocolateParser.var_extension_return var_extension() throws RecognitionException {
		ChocolateParser.var_extension_return retval = new ChocolateParser.var_extension_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INTEGER28=null;
		Token IDENTIFIER29=null;
		Token ASSIGN31=null;
		Token CHAR34=null;
		Token IDENTIFIER35=null;
		Token ASSIGN37=null;
		Token CHAR_OPERATOR38=null;
		Token BOOLEAN39=null;
		Token IDENTIFIER40=null;
		Token ASSIGN42=null;
		Token BOOLEAN_OPERATOR43=null;
		ParserRuleReturnScope extra_decl30 =null;
		ParserRuleReturnScope single_expr32 =null;
		ParserRuleReturnScope closed_compound_expr33 =null;
		ParserRuleReturnScope extra_decl36 =null;
		ParserRuleReturnScope extra_decl41 =null;

		Object INTEGER28_tree=null;
		Object IDENTIFIER29_tree=null;
		Object ASSIGN31_tree=null;
		Object CHAR34_tree=null;
		Object IDENTIFIER35_tree=null;
		Object ASSIGN37_tree=null;
		Object CHAR_OPERATOR38_tree=null;
		Object BOOLEAN39_tree=null;
		Object IDENTIFIER40_tree=null;
		Object ASSIGN42_tree=null;
		Object BOOLEAN_OPERATOR43_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:92:5: ( INTEGER IDENTIFIER ( extra_decl )* ( ASSIGN ( single_expr | closed_compound_expr ) )? | CHAR IDENTIFIER ( extra_decl )* ( ASSIGN CHAR_OPERATOR )? | BOOLEAN IDENTIFIER ( extra_decl )* ( ASSIGN BOOLEAN_OPERATOR )? )
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
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:92:9: INTEGER IDENTIFIER ( extra_decl )* ( ASSIGN ( single_expr | closed_compound_expr ) )?
					{
					root_0 = (Object)adaptor.nil();


					INTEGER28=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_var_extension1242); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INTEGER28_tree = (Object)adaptor.create(INTEGER28);
					adaptor.addChild(root_0, INTEGER28_tree);
					}

					IDENTIFIER29=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_var_extension1244); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER29_tree = (Object)adaptor.create(IDENTIFIER29);
					adaptor.addChild(root_0, IDENTIFIER29_tree);
					}

					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:92:28: ( extra_decl )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==COMMA) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:92:29: extra_decl
							{
							pushFollow(FOLLOW_extra_decl_in_var_extension1247);
							extra_decl30=extra_decl();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, extra_decl30.getTree());

							}
							break;

						default :
							break loop9;
						}
					}

					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:92:42: ( ASSIGN ( single_expr | closed_compound_expr ) )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==ASSIGN) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:92:43: ASSIGN ( single_expr | closed_compound_expr )
							{
							ASSIGN31=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_var_extension1252); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							ASSIGN31_tree = (Object)adaptor.create(ASSIGN31);
							adaptor.addChild(root_0, ASSIGN31_tree);
							}

							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:92:50: ( single_expr | closed_compound_expr )
							int alt10=2;
							int LA10_0 = input.LA(1);
							if ( (LA10_0==BOOLEAN_OPERATOR||LA10_0==CHAR_OPERATOR||LA10_0==IDENTIFIER||(LA10_0 >= LPAREN && LA10_0 <= MIN)||LA10_0==NOT||LA10_0==NUMBER||LA10_0==PLUS) ) {
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
									// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:92:51: single_expr
									{
									pushFollow(FOLLOW_single_expr_in_var_extension1255);
									single_expr32=single_expr();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, single_expr32.getTree());

									}
									break;
								case 2 :
									// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:92:65: closed_compound_expr
									{
									pushFollow(FOLLOW_closed_compound_expr_in_var_extension1259);
									closed_compound_expr33=closed_compound_expr();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, closed_compound_expr33.getTree());

									}
									break;

							}

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:94:9: CHAR IDENTIFIER ( extra_decl )* ( ASSIGN CHAR_OPERATOR )?
					{
					root_0 = (Object)adaptor.nil();


					CHAR34=(Token)match(input,CHAR,FOLLOW_CHAR_in_var_extension1277); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CHAR34_tree = (Object)adaptor.create(CHAR34);
					adaptor.addChild(root_0, CHAR34_tree);
					}

					IDENTIFIER35=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_var_extension1279); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER35_tree = (Object)adaptor.create(IDENTIFIER35);
					adaptor.addChild(root_0, IDENTIFIER35_tree);
					}

					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:94:25: ( extra_decl )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==COMMA) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:94:26: extra_decl
							{
							pushFollow(FOLLOW_extra_decl_in_var_extension1282);
							extra_decl36=extra_decl();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, extra_decl36.getTree());

							}
							break;

						default :
							break loop12;
						}
					}

					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:94:39: ( ASSIGN CHAR_OPERATOR )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==ASSIGN) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:94:40: ASSIGN CHAR_OPERATOR
							{
							ASSIGN37=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_var_extension1287); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							ASSIGN37_tree = (Object)adaptor.create(ASSIGN37);
							adaptor.addChild(root_0, ASSIGN37_tree);
							}

							CHAR_OPERATOR38=(Token)match(input,CHAR_OPERATOR,FOLLOW_CHAR_OPERATOR_in_var_extension1289); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							CHAR_OPERATOR38_tree = (Object)adaptor.create(CHAR_OPERATOR38);
							adaptor.addChild(root_0, CHAR_OPERATOR38_tree);
							}

							}
							break;

					}

					}
					break;
				case 3 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:96:9: BOOLEAN IDENTIFIER ( extra_decl )* ( ASSIGN BOOLEAN_OPERATOR )?
					{
					root_0 = (Object)adaptor.nil();


					BOOLEAN39=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_var_extension1306); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BOOLEAN39_tree = (Object)adaptor.create(BOOLEAN39);
					adaptor.addChild(root_0, BOOLEAN39_tree);
					}

					IDENTIFIER40=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_var_extension1308); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER40_tree = (Object)adaptor.create(IDENTIFIER40);
					adaptor.addChild(root_0, IDENTIFIER40_tree);
					}

					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:96:28: ( extra_decl )*
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==COMMA) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:96:29: extra_decl
							{
							pushFollow(FOLLOW_extra_decl_in_var_extension1311);
							extra_decl41=extra_decl();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, extra_decl41.getTree());

							}
							break;

						default :
							break loop14;
						}
					}

					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:96:42: ( ASSIGN BOOLEAN_OPERATOR )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==ASSIGN) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:96:43: ASSIGN BOOLEAN_OPERATOR
							{
							ASSIGN42=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_var_extension1316); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							ASSIGN42_tree = (Object)adaptor.create(ASSIGN42);
							adaptor.addChild(root_0, ASSIGN42_tree);
							}

							BOOLEAN_OPERATOR43=(Token)match(input,BOOLEAN_OPERATOR,FOLLOW_BOOLEAN_OPERATOR_in_var_extension1318); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							BOOLEAN_OPERATOR43_tree = (Object)adaptor.create(BOOLEAN_OPERATOR43);
							adaptor.addChild(root_0, BOOLEAN_OPERATOR43_tree);
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
	// $ANTLR end "var_extension"


	public static class statements_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statements"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:100:1: statements : statement SEMICOLON !;
	public final ChocolateParser.statements_return statements() throws RecognitionException {
		ChocolateParser.statements_return retval = new ChocolateParser.statements_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMICOLON45=null;
		ParserRuleReturnScope statement44 =null;

		Object SEMICOLON45_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:101:5: ( statement SEMICOLON !)
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:101:7: statement SEMICOLON !
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_statement_in_statements1341);
			statement44=statement();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, statement44.getTree());

			SEMICOLON45=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statements1343); if (state.failed) return retval;
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:104:1: statement : ( read | print | assign | ifelsethen );
	public final ChocolateParser.statement_return statement() throws RecognitionException {
		ChocolateParser.statement_return retval = new ChocolateParser.statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope read46 =null;
		ParserRuleReturnScope print47 =null;
		ParserRuleReturnScope assign48 =null;
		ParserRuleReturnScope ifelsethen49 =null;


		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:105:5: ( read | print | assign | ifelsethen )
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
			case IDENTIFIER:
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
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:105:9: read
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_read_in_statement1367);
					read46=read();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, read46.getTree());

					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:106:9: print
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_print_in_statement1378);
					print47=print();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, print47.getTree());

					}
					break;
				case 3 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:107:9: assign
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_assign_in_statement1389);
					assign48=assign();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assign48.getTree());

					}
					break;
				case 4 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:108:9: ifelsethen
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_ifelsethen_in_statement1402);
					ifelsethen49=ifelsethen();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ifelsethen49.getTree());

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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:111:1: read : READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !;
	public final ChocolateParser.read_return read() throws RecognitionException {
		ChocolateParser.read_return retval = new ChocolateParser.read_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token READ50=null;
		Token LPAREN51=null;
		Token IDENTIFIER52=null;
		Token COMMA53=null;
		Token IDENTIFIER54=null;
		Token RPAREN55=null;

		Object READ50_tree=null;
		Object LPAREN51_tree=null;
		Object IDENTIFIER52_tree=null;
		Object COMMA53_tree=null;
		Object IDENTIFIER54_tree=null;
		Object RPAREN55_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:112:5: ( READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !)
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:112:9: READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			READ50=(Token)match(input,READ,FOLLOW_READ_in_read1421); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			READ50_tree = (Object)adaptor.create(READ50);
			root_0 = (Object)adaptor.becomeRoot(READ50_tree, root_0);
			}

			LPAREN51=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_read1424); if (state.failed) return retval;
			IDENTIFIER52=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read1427); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER52_tree = (Object)adaptor.create(IDENTIFIER52);
			adaptor.addChild(root_0, IDENTIFIER52_tree);
			}

			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:112:34: ( COMMA ! IDENTIFIER )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==COMMA) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:112:35: COMMA ! IDENTIFIER
					{
					COMMA53=(Token)match(input,COMMA,FOLLOW_COMMA_in_read1430); if (state.failed) return retval;
					IDENTIFIER54=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read1433); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER54_tree = (Object)adaptor.create(IDENTIFIER54);
					adaptor.addChild(root_0, IDENTIFIER54_tree);
					}

					}
					break;

				default :
					break loop18;
				}
			}

			RPAREN55=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_read1437); if (state.failed) return retval;
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:115:1: assign : IDENTIFIER ASSIGN ^ ( assignexpr ) ;
	public final ChocolateParser.assign_return assign() throws RecognitionException {
		ChocolateParser.assign_return retval = new ChocolateParser.assign_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER56=null;
		Token ASSIGN57=null;
		ParserRuleReturnScope assignexpr58 =null;

		Object IDENTIFIER56_tree=null;
		Object ASSIGN57_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:116:5: ( IDENTIFIER ASSIGN ^ ( assignexpr ) )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:116:9: IDENTIFIER ASSIGN ^ ( assignexpr )
			{
			root_0 = (Object)adaptor.nil();


			IDENTIFIER56=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assign1457); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER56_tree = (Object)adaptor.create(IDENTIFIER56);
			adaptor.addChild(root_0, IDENTIFIER56_tree);
			}

			ASSIGN57=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign1459); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ASSIGN57_tree = (Object)adaptor.create(ASSIGN57);
			root_0 = (Object)adaptor.becomeRoot(ASSIGN57_tree, root_0);
			}

			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:116:28: ( assignexpr )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:116:29: assignexpr
			{
			pushFollow(FOLLOW_assignexpr_in_assign1463);
			assignexpr58=assignexpr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, assignexpr58.getTree());

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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:119:1: assignexpr : ( ( IDENTIFIER ASSIGN ^)=> ( IDENTIFIER ASSIGN ^ assignexpr ) | single_expr | closed_compound_expr );
	public final ChocolateParser.assignexpr_return assignexpr() throws RecognitionException {
		ChocolateParser.assignexpr_return retval = new ChocolateParser.assignexpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER59=null;
		Token ASSIGN60=null;
		ParserRuleReturnScope assignexpr61 =null;
		ParserRuleReturnScope single_expr62 =null;
		ParserRuleReturnScope closed_compound_expr63 =null;

		Object IDENTIFIER59_tree=null;
		Object ASSIGN60_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:120:5: ( ( IDENTIFIER ASSIGN ^)=> ( IDENTIFIER ASSIGN ^ assignexpr ) | single_expr | closed_compound_expr )
			int alt19=3;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				int LA19_1 = input.LA(2);
				if ( (synpred1_Chocolate()) ) {
					alt19=1;
				}
				else if ( (true) ) {
					alt19=2;
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
				alt19=2;
				}
				break;
			case LCURLY:
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
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:120:9: ( IDENTIFIER ASSIGN ^)=> ( IDENTIFIER ASSIGN ^ assignexpr )
					{
					root_0 = (Object)adaptor.nil();


					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:120:33: ( IDENTIFIER ASSIGN ^ assignexpr )
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:120:34: IDENTIFIER ASSIGN ^ assignexpr
					{
					IDENTIFIER59=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assignexpr1497); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER59_tree = (Object)adaptor.create(IDENTIFIER59);
					adaptor.addChild(root_0, IDENTIFIER59_tree);
					}

					ASSIGN60=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignexpr1499); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ASSIGN60_tree = (Object)adaptor.create(ASSIGN60);
					root_0 = (Object)adaptor.becomeRoot(ASSIGN60_tree, root_0);
					}

					pushFollow(FOLLOW_assignexpr_in_assignexpr1502);
					assignexpr61=assignexpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignexpr61.getTree());

					}

					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:121:9: single_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_single_expr_in_assignexpr1513);
					single_expr62=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, single_expr62.getTree());

					}
					break;
				case 3 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:122:9: closed_compound_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_closed_compound_expr_in_assignexpr1523);
					closed_compound_expr63=closed_compound_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, closed_compound_expr63.getTree());

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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:125:1: print : PRINT ^ LPAREN ! ( closed_compound_expr | IDENTIFIER | string ) ( COMMA ! ( closed_compound_expr | IDENTIFIER | string ) )* RPAREN !;
	public final ChocolateParser.print_return print() throws RecognitionException {
		ChocolateParser.print_return retval = new ChocolateParser.print_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PRINT64=null;
		Token LPAREN65=null;
		Token IDENTIFIER67=null;
		Token COMMA69=null;
		Token IDENTIFIER71=null;
		Token RPAREN73=null;
		ParserRuleReturnScope closed_compound_expr66 =null;
		ParserRuleReturnScope string68 =null;
		ParserRuleReturnScope closed_compound_expr70 =null;
		ParserRuleReturnScope string72 =null;

		Object PRINT64_tree=null;
		Object LPAREN65_tree=null;
		Object IDENTIFIER67_tree=null;
		Object COMMA69_tree=null;
		Object IDENTIFIER71_tree=null;
		Object RPAREN73_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:126:5: ( PRINT ^ LPAREN ! ( closed_compound_expr | IDENTIFIER | string ) ( COMMA ! ( closed_compound_expr | IDENTIFIER | string ) )* RPAREN !)
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:126:9: PRINT ^ LPAREN ! ( closed_compound_expr | IDENTIFIER | string ) ( COMMA ! ( closed_compound_expr | IDENTIFIER | string ) )* RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			PRINT64=(Token)match(input,PRINT,FOLLOW_PRINT_in_print1546); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			PRINT64_tree = (Object)adaptor.create(PRINT64);
			root_0 = (Object)adaptor.becomeRoot(PRINT64_tree, root_0);
			}

			LPAREN65=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_print1549); if (state.failed) return retval;
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:126:24: ( closed_compound_expr | IDENTIFIER | string )
			int alt20=3;
			switch ( input.LA(1) ) {
			case LCURLY:
				{
				alt20=1;
				}
				break;
			case IDENTIFIER:
				{
				alt20=2;
				}
				break;
			case DQUOTATION:
				{
				alt20=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}
			switch (alt20) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:126:25: closed_compound_expr
					{
					pushFollow(FOLLOW_closed_compound_expr_in_print1553);
					closed_compound_expr66=closed_compound_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, closed_compound_expr66.getTree());

					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:126:48: IDENTIFIER
					{
					IDENTIFIER67=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_print1557); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER67_tree = (Object)adaptor.create(IDENTIFIER67);
					adaptor.addChild(root_0, IDENTIFIER67_tree);
					}

					}
					break;
				case 3 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:126:61: string
					{
					pushFollow(FOLLOW_string_in_print1561);
					string68=string();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, string68.getTree());

					}
					break;

			}

			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:126:69: ( COMMA ! ( closed_compound_expr | IDENTIFIER | string ) )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==COMMA) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:126:70: COMMA ! ( closed_compound_expr | IDENTIFIER | string )
					{
					COMMA69=(Token)match(input,COMMA,FOLLOW_COMMA_in_print1565); if (state.failed) return retval;
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:126:77: ( closed_compound_expr | IDENTIFIER | string )
					int alt21=3;
					switch ( input.LA(1) ) {
					case LCURLY:
						{
						alt21=1;
						}
						break;
					case IDENTIFIER:
						{
						alt21=2;
						}
						break;
					case DQUOTATION:
						{
						alt21=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 21, 0, input);
						throw nvae;
					}
					switch (alt21) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:126:78: closed_compound_expr
							{
							pushFollow(FOLLOW_closed_compound_expr_in_print1569);
							closed_compound_expr70=closed_compound_expr();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, closed_compound_expr70.getTree());

							}
							break;
						case 2 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:126:101: IDENTIFIER
							{
							IDENTIFIER71=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_print1573); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							IDENTIFIER71_tree = (Object)adaptor.create(IDENTIFIER71);
							adaptor.addChild(root_0, IDENTIFIER71_tree);
							}

							}
							break;
						case 3 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:126:114: string
							{
							pushFollow(FOLLOW_string_in_print1577);
							string72=string();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, string72.getTree());

							}
							break;

					}

					}
					break;

				default :
					break loop22;
				}
			}

			RPAREN73=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_print1582); if (state.failed) return retval;
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:130:1: compound_expr : ( unclosed_compound_expr | closed_compound_expr );
	public final ChocolateParser.compound_expr_return compound_expr() throws RecognitionException {
		ChocolateParser.compound_expr_return retval = new ChocolateParser.compound_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope unclosed_compound_expr74 =null;
		ParserRuleReturnScope closed_compound_expr75 =null;


		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:131:5: ( unclosed_compound_expr | closed_compound_expr )
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==CONSTANT||(LA23_0 >= IDENTIFIER && LA23_0 <= IF)||LA23_0==PRINT||LA23_0==READ||LA23_0==VAR) ) {
				alt23=1;
			}
			else if ( (LA23_0==LCURLY) ) {
				alt23=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}

			switch (alt23) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:131:9: unclosed_compound_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_unclosed_compound_expr_in_compound_expr1607);
					unclosed_compound_expr74=unclosed_compound_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unclosed_compound_expr74.getTree());

					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:132:9: closed_compound_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_closed_compound_expr_in_compound_expr1617);
					closed_compound_expr75=closed_compound_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, closed_compound_expr75.getTree());

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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:135:1: unclosed_compound_expr : ( ( declarations )* statements )+ ;
	public final ChocolateParser.unclosed_compound_expr_return unclosed_compound_expr() throws RecognitionException {
		ChocolateParser.unclosed_compound_expr_return retval = new ChocolateParser.unclosed_compound_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope declarations76 =null;
		ParserRuleReturnScope statements77 =null;


		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:136:5: ( ( ( declarations )* statements )+ )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:136:9: ( ( declarations )* statements )+
			{
			root_0 = (Object)adaptor.nil();


			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:136:9: ( ( declarations )* statements )+
			int cnt25=0;
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==CONSTANT||(LA25_0 >= IDENTIFIER && LA25_0 <= IF)||LA25_0==PRINT||LA25_0==READ||LA25_0==VAR) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:136:10: ( declarations )* statements
					{
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:136:10: ( declarations )*
					loop24:
					while (true) {
						int alt24=2;
						int LA24_0 = input.LA(1);
						if ( (LA24_0==CONSTANT||LA24_0==VAR) ) {
							alt24=1;
						}

						switch (alt24) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:136:10: declarations
							{
							pushFollow(FOLLOW_declarations_in_unclosed_compound_expr1641);
							declarations76=declarations();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, declarations76.getTree());

							}
							break;

						default :
							break loop24;
						}
					}

					pushFollow(FOLLOW_statements_in_unclosed_compound_expr1644);
					statements77=statements();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statements77.getTree());

					}
					break;

				default :
					if ( cnt25 >= 1 ) break loop25;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(25, input);
					throw eee;
				}
				cnt25++;
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:139:1: closed_compound_expr : LCURLY ! ( ( declarations )* statements )+ RCURLY !;
	public final ChocolateParser.closed_compound_expr_return closed_compound_expr() throws RecognitionException {
		ChocolateParser.closed_compound_expr_return retval = new ChocolateParser.closed_compound_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LCURLY78=null;
		Token RCURLY81=null;
		ParserRuleReturnScope declarations79 =null;
		ParserRuleReturnScope statements80 =null;

		Object LCURLY78_tree=null;
		Object RCURLY81_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:140:5: ( LCURLY ! ( ( declarations )* statements )+ RCURLY !)
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:140:9: LCURLY ! ( ( declarations )* statements )+ RCURLY !
			{
			root_0 = (Object)adaptor.nil();


			LCURLY78=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_closed_compound_expr1666); if (state.failed) return retval;
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:140:17: ( ( declarations )* statements )+
			int cnt27=0;
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==CONSTANT||(LA27_0 >= IDENTIFIER && LA27_0 <= IF)||LA27_0==PRINT||LA27_0==READ||LA27_0==VAR) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:140:18: ( declarations )* statements
					{
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:140:18: ( declarations )*
					loop26:
					while (true) {
						int alt26=2;
						int LA26_0 = input.LA(1);
						if ( (LA26_0==CONSTANT||LA26_0==VAR) ) {
							alt26=1;
						}

						switch (alt26) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:140:18: declarations
							{
							pushFollow(FOLLOW_declarations_in_closed_compound_expr1670);
							declarations79=declarations();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, declarations79.getTree());

							}
							break;

						default :
							break loop26;
						}
					}

					pushFollow(FOLLOW_statements_in_closed_compound_expr1673);
					statements80=statements();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statements80.getTree());

					}
					break;

				default :
					if ( cnt27 >= 1 ) break loop27;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(27, input);
					throw eee;
				}
				cnt27++;
			}

			RCURLY81=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_closed_compound_expr1677); if (state.failed) return retval;
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:143:1: single_expr : arithmetic ;
	public final ChocolateParser.single_expr_return single_expr() throws RecognitionException {
		ChocolateParser.single_expr_return retval = new ChocolateParser.single_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope arithmetic82 =null;


		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:144:5: ( arithmetic )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:144:9: arithmetic
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_in_single_expr1701);
			arithmetic82=arithmetic();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic82.getTree());

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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:147:1: arithmetic : arith2 ( OR ^ arith2 )* ;
	public final ChocolateParser.arithmetic_return arithmetic() throws RecognitionException {
		ChocolateParser.arithmetic_return retval = new ChocolateParser.arithmetic_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token OR84=null;
		ParserRuleReturnScope arith283 =null;
		ParserRuleReturnScope arith285 =null;

		Object OR84_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:148:5: ( arith2 ( OR ^ arith2 )* )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:148:9: arith2 ( OR ^ arith2 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arith2_in_arithmetic1720);
			arith283=arith2();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arith283.getTree());

			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:148:16: ( OR ^ arith2 )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==OR) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:148:17: OR ^ arith2
					{
					OR84=(Token)match(input,OR,FOLLOW_OR_in_arithmetic1723); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					OR84_tree = (Object)adaptor.create(OR84);
					root_0 = (Object)adaptor.becomeRoot(OR84_tree, root_0);
					}

					pushFollow(FOLLOW_arith2_in_arithmetic1726);
					arith285=arith2();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arith285.getTree());

					}
					break;

				default :
					break loop28;
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:151:1: arith2 : arith3 ( AND ^ arith3 )* ;
	public final ChocolateParser.arith2_return arith2() throws RecognitionException {
		ChocolateParser.arith2_return retval = new ChocolateParser.arith2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AND87=null;
		ParserRuleReturnScope arith386 =null;
		ParserRuleReturnScope arith388 =null;

		Object AND87_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:152:5: ( arith3 ( AND ^ arith3 )* )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:152:9: arith3 ( AND ^ arith3 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arith3_in_arith21751);
			arith386=arith3();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arith386.getTree());

			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:152:16: ( AND ^ arith3 )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==AND) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:152:17: AND ^ arith3
					{
					AND87=(Token)match(input,AND,FOLLOW_AND_in_arith21754); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AND87_tree = (Object)adaptor.create(AND87);
					root_0 = (Object)adaptor.becomeRoot(AND87_tree, root_0);
					}

					pushFollow(FOLLOW_arith3_in_arith21757);
					arith388=arith3();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arith388.getTree());

					}
					break;

				default :
					break loop29;
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:155:1: arith3 : arith4 ( ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^) arith4 )* ;
	public final ChocolateParser.arith3_return arith3() throws RecognitionException {
		ChocolateParser.arith3_return retval = new ChocolateParser.arith3_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LESS90=null;
		Token LESSEQ91=null;
		Token GREATEQ92=null;
		Token GREAT93=null;
		Token EQ94=null;
		Token NOTEQ95=null;
		ParserRuleReturnScope arith489 =null;
		ParserRuleReturnScope arith496 =null;

		Object LESS90_tree=null;
		Object LESSEQ91_tree=null;
		Object GREATEQ92_tree=null;
		Object GREAT93_tree=null;
		Object EQ94_tree=null;
		Object NOTEQ95_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:156:5: ( arith4 ( ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^) arith4 )* )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:156:9: arith4 ( ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^) arith4 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arith4_in_arith31782);
			arith489=arith4();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arith489.getTree());

			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:156:16: ( ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^) arith4 )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( ((LA31_0 >= EQ && LA31_0 <= GREATEQ)||(LA31_0 >= LESS && LA31_0 <= LESSEQ)||LA31_0==NOTEQ) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:156:17: ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^) arith4
					{
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:156:17: ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^)
					int alt30=6;
					switch ( input.LA(1) ) {
					case LESS:
						{
						alt30=1;
						}
						break;
					case LESSEQ:
						{
						alt30=2;
						}
						break;
					case GREATEQ:
						{
						alt30=3;
						}
						break;
					case GREAT:
						{
						alt30=4;
						}
						break;
					case EQ:
						{
						alt30=5;
						}
						break;
					case NOTEQ:
						{
						alt30=6;
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
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:156:18: LESS ^
							{
							LESS90=(Token)match(input,LESS,FOLLOW_LESS_in_arith31786); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							LESS90_tree = (Object)adaptor.create(LESS90);
							root_0 = (Object)adaptor.becomeRoot(LESS90_tree, root_0);
							}

							}
							break;
						case 2 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:156:26: LESSEQ ^
							{
							LESSEQ91=(Token)match(input,LESSEQ,FOLLOW_LESSEQ_in_arith31791); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							LESSEQ91_tree = (Object)adaptor.create(LESSEQ91);
							root_0 = (Object)adaptor.becomeRoot(LESSEQ91_tree, root_0);
							}

							}
							break;
						case 3 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:156:36: GREATEQ ^
							{
							GREATEQ92=(Token)match(input,GREATEQ,FOLLOW_GREATEQ_in_arith31796); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							GREATEQ92_tree = (Object)adaptor.create(GREATEQ92);
							root_0 = (Object)adaptor.becomeRoot(GREATEQ92_tree, root_0);
							}

							}
							break;
						case 4 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:156:47: GREAT ^
							{
							GREAT93=(Token)match(input,GREAT,FOLLOW_GREAT_in_arith31801); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							GREAT93_tree = (Object)adaptor.create(GREAT93);
							root_0 = (Object)adaptor.becomeRoot(GREAT93_tree, root_0);
							}

							}
							break;
						case 5 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:156:56: EQ ^
							{
							EQ94=(Token)match(input,EQ,FOLLOW_EQ_in_arith31806); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							EQ94_tree = (Object)adaptor.create(EQ94);
							root_0 = (Object)adaptor.becomeRoot(EQ94_tree, root_0);
							}

							}
							break;
						case 6 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:156:62: NOTEQ ^
							{
							NOTEQ95=(Token)match(input,NOTEQ,FOLLOW_NOTEQ_in_arith31811); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							NOTEQ95_tree = (Object)adaptor.create(NOTEQ95);
							root_0 = (Object)adaptor.becomeRoot(NOTEQ95_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_arith4_in_arith31815);
					arith496=arith4();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arith496.getTree());

					}
					break;

				default :
					break loop31;
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:159:1: arith4 : arith5 ( ( PLUS ^| MIN ^) arith5 )* ;
	public final ChocolateParser.arith4_return arith4() throws RecognitionException {
		ChocolateParser.arith4_return retval = new ChocolateParser.arith4_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS98=null;
		Token MIN99=null;
		ParserRuleReturnScope arith597 =null;
		ParserRuleReturnScope arith5100 =null;

		Object PLUS98_tree=null;
		Object MIN99_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:160:5: ( arith5 ( ( PLUS ^| MIN ^) arith5 )* )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:160:9: arith5 ( ( PLUS ^| MIN ^) arith5 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arith5_in_arith41845);
			arith597=arith5();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arith597.getTree());

			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:160:16: ( ( PLUS ^| MIN ^) arith5 )*
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==MIN||LA33_0==PLUS) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:160:17: ( PLUS ^| MIN ^) arith5
					{
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:160:17: ( PLUS ^| MIN ^)
					int alt32=2;
					int LA32_0 = input.LA(1);
					if ( (LA32_0==PLUS) ) {
						alt32=1;
					}
					else if ( (LA32_0==MIN) ) {
						alt32=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 32, 0, input);
						throw nvae;
					}

					switch (alt32) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:160:18: PLUS ^
							{
							PLUS98=(Token)match(input,PLUS,FOLLOW_PLUS_in_arith41849); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							PLUS98_tree = (Object)adaptor.create(PLUS98);
							root_0 = (Object)adaptor.becomeRoot(PLUS98_tree, root_0);
							}

							}
							break;
						case 2 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:160:26: MIN ^
							{
							MIN99=(Token)match(input,MIN,FOLLOW_MIN_in_arith41854); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							MIN99_tree = (Object)adaptor.create(MIN99);
							root_0 = (Object)adaptor.becomeRoot(MIN99_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_arith5_in_arith41858);
					arith5100=arith5();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arith5100.getTree());

					}
					break;

				default :
					break loop33;
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:163:1: arith5 : arith6 ( ( MULT ^| DIV ^| MOD ^) arith6 )* ;
	public final ChocolateParser.arith5_return arith5() throws RecognitionException {
		ChocolateParser.arith5_return retval = new ChocolateParser.arith5_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MULT102=null;
		Token DIV103=null;
		Token MOD104=null;
		ParserRuleReturnScope arith6101 =null;
		ParserRuleReturnScope arith6105 =null;

		Object MULT102_tree=null;
		Object DIV103_tree=null;
		Object MOD104_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:164:5: ( arith6 ( ( MULT ^| DIV ^| MOD ^) arith6 )* )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:164:9: arith6 ( ( MULT ^| DIV ^| MOD ^) arith6 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arith6_in_arith51889);
			arith6101=arith6();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arith6101.getTree());

			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:164:16: ( ( MULT ^| DIV ^| MOD ^) arith6 )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==DIV||(LA35_0 >= MOD && LA35_0 <= MULT)) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:164:17: ( MULT ^| DIV ^| MOD ^) arith6
					{
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:164:17: ( MULT ^| DIV ^| MOD ^)
					int alt34=3;
					switch ( input.LA(1) ) {
					case MULT:
						{
						alt34=1;
						}
						break;
					case DIV:
						{
						alt34=2;
						}
						break;
					case MOD:
						{
						alt34=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 34, 0, input);
						throw nvae;
					}
					switch (alt34) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:164:18: MULT ^
							{
							MULT102=(Token)match(input,MULT,FOLLOW_MULT_in_arith51893); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							MULT102_tree = (Object)adaptor.create(MULT102);
							root_0 = (Object)adaptor.becomeRoot(MULT102_tree, root_0);
							}

							}
							break;
						case 2 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:164:26: DIV ^
							{
							DIV103=(Token)match(input,DIV,FOLLOW_DIV_in_arith51898); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							DIV103_tree = (Object)adaptor.create(DIV103);
							root_0 = (Object)adaptor.becomeRoot(DIV103_tree, root_0);
							}

							}
							break;
						case 3 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:164:33: MOD ^
							{
							MOD104=(Token)match(input,MOD,FOLLOW_MOD_in_arith51903); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							MOD104_tree = (Object)adaptor.create(MOD104);
							root_0 = (Object)adaptor.becomeRoot(MOD104_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_arith6_in_arith51907);
					arith6105=arith6();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arith6105.getTree());

					}
					break;

				default :
					break loop35;
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:167:1: arith6 : ( ( PLUS ^| MIN ^| NOT ^)? operand ) ;
	public final ChocolateParser.arith6_return arith6() throws RecognitionException {
		ChocolateParser.arith6_return retval = new ChocolateParser.arith6_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS106=null;
		Token MIN107=null;
		Token NOT108=null;
		ParserRuleReturnScope operand109 =null;

		Object PLUS106_tree=null;
		Object MIN107_tree=null;
		Object NOT108_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:168:5: ( ( ( PLUS ^| MIN ^| NOT ^)? operand ) )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:168:9: ( ( PLUS ^| MIN ^| NOT ^)? operand )
			{
			root_0 = (Object)adaptor.nil();


			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:168:9: ( ( PLUS ^| MIN ^| NOT ^)? operand )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:168:10: ( PLUS ^| MIN ^| NOT ^)? operand
			{
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:168:10: ( PLUS ^| MIN ^| NOT ^)?
			int alt36=4;
			switch ( input.LA(1) ) {
				case PLUS:
					{
					alt36=1;
					}
					break;
				case MIN:
					{
					alt36=2;
					}
					break;
				case NOT:
					{
					alt36=3;
					}
					break;
			}
			switch (alt36) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:168:11: PLUS ^
					{
					PLUS106=(Token)match(input,PLUS,FOLLOW_PLUS_in_arith61942); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					PLUS106_tree = (Object)adaptor.create(PLUS106);
					root_0 = (Object)adaptor.becomeRoot(PLUS106_tree, root_0);
					}

					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:168:19: MIN ^
					{
					MIN107=(Token)match(input,MIN,FOLLOW_MIN_in_arith61947); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					MIN107_tree = (Object)adaptor.create(MIN107);
					root_0 = (Object)adaptor.becomeRoot(MIN107_tree, root_0);
					}

					}
					break;
				case 3 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:168:26: NOT ^
					{
					NOT108=(Token)match(input,NOT,FOLLOW_NOT_in_arith61952); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NOT108_tree = (Object)adaptor.create(NOT108);
					root_0 = (Object)adaptor.becomeRoot(NOT108_tree, root_0);
					}

					}
					break;

			}

			pushFollow(FOLLOW_operand_in_arith61957);
			operand109=operand();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, operand109.getTree());

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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:171:1: ifelsethen : IF ^ single_expr THEN ! LCURLY ! unclosed_compound_expr RCURLY ! ( ELSE ! LCURLY ! unclosed_compound_expr RCURLY !)? ;
	public final ChocolateParser.ifelsethen_return ifelsethen() throws RecognitionException {
		ChocolateParser.ifelsethen_return retval = new ChocolateParser.ifelsethen_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IF110=null;
		Token THEN112=null;
		Token LCURLY113=null;
		Token RCURLY115=null;
		Token ELSE116=null;
		Token LCURLY117=null;
		Token RCURLY119=null;
		ParserRuleReturnScope single_expr111 =null;
		ParserRuleReturnScope unclosed_compound_expr114 =null;
		ParserRuleReturnScope unclosed_compound_expr118 =null;

		Object IF110_tree=null;
		Object THEN112_tree=null;
		Object LCURLY113_tree=null;
		Object RCURLY115_tree=null;
		Object ELSE116_tree=null;
		Object LCURLY117_tree=null;
		Object RCURLY119_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:172:5: ( IF ^ single_expr THEN ! LCURLY ! unclosed_compound_expr RCURLY ! ( ELSE ! LCURLY ! unclosed_compound_expr RCURLY !)? )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:172:9: IF ^ single_expr THEN ! LCURLY ! unclosed_compound_expr RCURLY ! ( ELSE ! LCURLY ! unclosed_compound_expr RCURLY !)?
			{
			root_0 = (Object)adaptor.nil();


			IF110=(Token)match(input,IF,FOLLOW_IF_in_ifelsethen1981); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IF110_tree = (Object)adaptor.create(IF110);
			root_0 = (Object)adaptor.becomeRoot(IF110_tree, root_0);
			}

			pushFollow(FOLLOW_single_expr_in_ifelsethen1984);
			single_expr111=single_expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, single_expr111.getTree());

			THEN112=(Token)match(input,THEN,FOLLOW_THEN_in_ifelsethen1986); if (state.failed) return retval;
			LCURLY113=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_ifelsethen1989); if (state.failed) return retval;
			pushFollow(FOLLOW_unclosed_compound_expr_in_ifelsethen1992);
			unclosed_compound_expr114=unclosed_compound_expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, unclosed_compound_expr114.getTree());

			RCURLY115=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_ifelsethen1994); if (state.failed) return retval;
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:172:70: ( ELSE ! LCURLY ! unclosed_compound_expr RCURLY !)?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==ELSE) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:172:71: ELSE ! LCURLY ! unclosed_compound_expr RCURLY !
					{
					ELSE116=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifelsethen1998); if (state.failed) return retval;
					LCURLY117=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_ifelsethen2001); if (state.failed) return retval;
					pushFollow(FOLLOW_unclosed_compound_expr_in_ifelsethen2004);
					unclosed_compound_expr118=unclosed_compound_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unclosed_compound_expr118.getTree());

					RCURLY119=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_ifelsethen2006); if (state.failed) return retval;
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:176:1: operand : ( IDENTIFIER | NUMBER | LPAREN ! single_expr RPAREN !| BOOLEAN_OPERATOR | CHAR_OPERATOR );
	public final ChocolateParser.operand_return operand() throws RecognitionException {
		ChocolateParser.operand_return retval = new ChocolateParser.operand_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER120=null;
		Token NUMBER121=null;
		Token LPAREN122=null;
		Token RPAREN124=null;
		Token BOOLEAN_OPERATOR125=null;
		Token CHAR_OPERATOR126=null;
		ParserRuleReturnScope single_expr123 =null;

		Object IDENTIFIER120_tree=null;
		Object NUMBER121_tree=null;
		Object LPAREN122_tree=null;
		Object RPAREN124_tree=null;
		Object BOOLEAN_OPERATOR125_tree=null;
		Object CHAR_OPERATOR126_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:177:5: ( IDENTIFIER | NUMBER | LPAREN ! single_expr RPAREN !| BOOLEAN_OPERATOR | CHAR_OPERATOR )
			int alt38=5;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt38=1;
				}
				break;
			case NUMBER:
				{
				alt38=2;
				}
				break;
			case LPAREN:
				{
				alt38=3;
				}
				break;
			case BOOLEAN_OPERATOR:
				{
				alt38=4;
				}
				break;
			case CHAR_OPERATOR:
				{
				alt38=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);
				throw nvae;
			}
			switch (alt38) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:177:9: IDENTIFIER
					{
					root_0 = (Object)adaptor.nil();


					IDENTIFIER120=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand2029); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER120_tree = (Object)adaptor.create(IDENTIFIER120);
					adaptor.addChild(root_0, IDENTIFIER120_tree);
					}

					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:178:9: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER121=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_operand2039); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NUMBER121_tree = (Object)adaptor.create(NUMBER121);
					adaptor.addChild(root_0, NUMBER121_tree);
					}

					}
					break;
				case 3 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:179:9: LPAREN ! single_expr RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					LPAREN122=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operand2049); if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_operand2052);
					single_expr123=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, single_expr123.getTree());

					RPAREN124=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operand2054); if (state.failed) return retval;
					}
					break;
				case 4 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:180:9: BOOLEAN_OPERATOR
					{
					root_0 = (Object)adaptor.nil();


					BOOLEAN_OPERATOR125=(Token)match(input,BOOLEAN_OPERATOR,FOLLOW_BOOLEAN_OPERATOR_in_operand2065); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BOOLEAN_OPERATOR125_tree = (Object)adaptor.create(BOOLEAN_OPERATOR125);
					adaptor.addChild(root_0, BOOLEAN_OPERATOR125_tree);
					}

					}
					break;
				case 5 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:181:9: CHAR_OPERATOR
					{
					root_0 = (Object)adaptor.nil();


					CHAR_OPERATOR126=(Token)match(input,CHAR_OPERATOR,FOLLOW_CHAR_OPERATOR_in_operand2075); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CHAR_OPERATOR126_tree = (Object)adaptor.create(CHAR_OPERATOR126);
					adaptor.addChild(root_0, CHAR_OPERATOR126_tree);
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:184:1: type : ( INTEGER | CHAR | BOOLEAN );
	public final ChocolateParser.type_return type() throws RecognitionException {
		ChocolateParser.type_return retval = new ChocolateParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set127=null;

		Object set127_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:185:5: ( INTEGER | CHAR | BOOLEAN )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:
			{
			root_0 = (Object)adaptor.nil();


			set127=input.LT(1);
			if ( input.LA(1)==BOOLEAN||input.LA(1)==CHAR||input.LA(1)==INTEGER ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set127));
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:188:1: string : DQUOTATION ! ( graphic )* DQUOTATION !;
	public final ChocolateParser.string_return string() throws RecognitionException {
		ChocolateParser.string_return retval = new ChocolateParser.string_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token DQUOTATION128=null;
		Token DQUOTATION130=null;
		ParserRuleReturnScope graphic129 =null;

		Object DQUOTATION128_tree=null;
		Object DQUOTATION130_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:189:5: ( DQUOTATION ! ( graphic )* DQUOTATION !)
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:189:9: DQUOTATION ! ( graphic )* DQUOTATION !
			{
			root_0 = (Object)adaptor.nil();


			DQUOTATION128=(Token)match(input,DQUOTATION,FOLLOW_DQUOTATION_in_string2125); if (state.failed) return retval;
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:189:21: ( graphic )*
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==DIGIT||LA39_0==LETTER) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:189:21: graphic
					{
					pushFollow(FOLLOW_graphic_in_string2128);
					graphic129=graphic();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, graphic129.getTree());

					}
					break;

				default :
					break loop39;
				}
			}

			DQUOTATION130=(Token)match(input,DQUOTATION,FOLLOW_DQUOTATION_in_string2131); if (state.failed) return retval;
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:192:1: graphic : ( LETTER | DIGIT );
	public final ChocolateParser.graphic_return graphic() throws RecognitionException {
		ChocolateParser.graphic_return retval = new ChocolateParser.graphic_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set131=null;

		Object set131_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:193:5: ( LETTER | DIGIT )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:
			{
			root_0 = (Object)adaptor.nil();


			set131=input.LT(1);
			if ( input.LA(1)==DIGIT||input.LA(1)==LETTER ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set131));
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
		// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:120:9: ( IDENTIFIER ASSIGN ^)
		// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:120:10: IDENTIFIER ASSIGN ^
		{
		match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred1_Chocolate1488); if (state.failed) return;

		match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred1_Chocolate1490); if (state.failed) return;

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
	public static final BitSet FOLLOW_CONSTANT_in_declaration1076 = new BitSet(new long[]{0x0000000000800140L});
	public static final BitSet FOLLOW_constant_extension_in_declaration1079 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_declaration1089 = new BitSet(new long[]{0x0000000000800140L});
	public static final BitSet FOLLOW_var_extension_in_declaration1092 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_extra_decl1115 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_extra_decl1117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_constant_extension1145 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_constant_extension1147 = new BitSet(new long[]{0x0000000000000820L});
	public static final BitSet FOLLOW_extra_decl_in_constant_extension1150 = new BitSet(new long[]{0x0000000000000820L});
	public static final BitSet FOLLOW_ASSIGN_in_constant_extension1154 = new BitSet(new long[]{0x0000002A61200280L});
	public static final BitSet FOLLOW_single_expr_in_constant_extension1157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_closed_compound_expr_in_constant_extension1161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_constant_extension1177 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_constant_extension1179 = new BitSet(new long[]{0x0000000000000820L});
	public static final BitSet FOLLOW_extra_decl_in_constant_extension1182 = new BitSet(new long[]{0x0000000000000820L});
	public static final BitSet FOLLOW_ASSIGN_in_constant_extension1186 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CHAR_OPERATOR_in_constant_extension1188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_constant_extension1203 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_constant_extension1205 = new BitSet(new long[]{0x0000000000000820L});
	public static final BitSet FOLLOW_extra_decl_in_constant_extension1208 = new BitSet(new long[]{0x0000000000000820L});
	public static final BitSet FOLLOW_ASSIGN_in_constant_extension1212 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BOOLEAN_OPERATOR_in_constant_extension1214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_var_extension1242 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_var_extension1244 = new BitSet(new long[]{0x0000000000000822L});
	public static final BitSet FOLLOW_extra_decl_in_var_extension1247 = new BitSet(new long[]{0x0000000000000822L});
	public static final BitSet FOLLOW_ASSIGN_in_var_extension1252 = new BitSet(new long[]{0x0000002A61200280L});
	public static final BitSet FOLLOW_single_expr_in_var_extension1255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_closed_compound_expr_in_var_extension1259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_var_extension1277 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_var_extension1279 = new BitSet(new long[]{0x0000000000000822L});
	public static final BitSet FOLLOW_extra_decl_in_var_extension1282 = new BitSet(new long[]{0x0000000000000822L});
	public static final BitSet FOLLOW_ASSIGN_in_var_extension1287 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CHAR_OPERATOR_in_var_extension1289 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_var_extension1306 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_var_extension1308 = new BitSet(new long[]{0x0000000000000822L});
	public static final BitSet FOLLOW_extra_decl_in_var_extension1311 = new BitSet(new long[]{0x0000000000000822L});
	public static final BitSet FOLLOW_ASSIGN_in_var_extension1316 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BOOLEAN_OPERATOR_in_var_extension1318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statements1341 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_statements1343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_in_statement1367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_in_statement1378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assign_in_statement1389 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifelsethen_in_statement1402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read1421 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_LPAREN_in_read1424 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read1427 = new BitSet(new long[]{0x0000080000000800L});
	public static final BitSet FOLLOW_COMMA_in_read1430 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read1433 = new BitSet(new long[]{0x0000080000000800L});
	public static final BitSet FOLLOW_RPAREN_in_read1437 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_assign1457 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_assign1459 = new BitSet(new long[]{0x0000002A61200280L});
	public static final BitSet FOLLOW_assignexpr_in_assign1463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_assignexpr1497 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_assignexpr1499 = new BitSet(new long[]{0x0000002A61200280L});
	public static final BitSet FOLLOW_assignexpr_in_assignexpr1502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_single_expr_in_assignexpr1513 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_closed_compound_expr_in_assignexpr1523 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print1546 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_LPAREN_in_print1549 = new BitSet(new long[]{0x0000000001210000L});
	public static final BitSet FOLLOW_closed_compound_expr_in_print1553 = new BitSet(new long[]{0x0000080000000800L});
	public static final BitSet FOLLOW_IDENTIFIER_in_print1557 = new BitSet(new long[]{0x0000080000000800L});
	public static final BitSet FOLLOW_string_in_print1561 = new BitSet(new long[]{0x0000080000000800L});
	public static final BitSet FOLLOW_COMMA_in_print1565 = new BitSet(new long[]{0x0000000001210000L});
	public static final BitSet FOLLOW_closed_compound_expr_in_print1569 = new BitSet(new long[]{0x0000080000000800L});
	public static final BitSet FOLLOW_IDENTIFIER_in_print1573 = new BitSet(new long[]{0x0000080000000800L});
	public static final BitSet FOLLOW_string_in_print1577 = new BitSet(new long[]{0x0000080000000800L});
	public static final BitSet FOLLOW_RPAREN_in_print1582 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unclosed_compound_expr_in_compound_expr1607 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_closed_compound_expr_in_compound_expr1617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declarations_in_unclosed_compound_expr1641 = new BitSet(new long[]{0x0000844000602000L});
	public static final BitSet FOLLOW_statements_in_unclosed_compound_expr1644 = new BitSet(new long[]{0x0000844000602002L});
	public static final BitSet FOLLOW_LCURLY_in_closed_compound_expr1666 = new BitSet(new long[]{0x0000844000602000L});
	public static final BitSet FOLLOW_declarations_in_closed_compound_expr1670 = new BitSet(new long[]{0x0000844000602000L});
	public static final BitSet FOLLOW_statements_in_closed_compound_expr1673 = new BitSet(new long[]{0x0000864000602000L});
	public static final BitSet FOLLOW_RCURLY_in_closed_compound_expr1677 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_in_single_expr1701 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arith2_in_arithmetic1720 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_OR_in_arithmetic1723 = new BitSet(new long[]{0x0000002A60200280L});
	public static final BitSet FOLLOW_arith2_in_arithmetic1726 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_arith3_in_arith21751 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_AND_in_arith21754 = new BitSet(new long[]{0x0000002A60200280L});
	public static final BitSet FOLLOW_arith3_in_arith21757 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_arith4_in_arith31782 = new BitSet(new long[]{0x00000004061C0002L});
	public static final BitSet FOLLOW_LESS_in_arith31786 = new BitSet(new long[]{0x0000002A60200280L});
	public static final BitSet FOLLOW_LESSEQ_in_arith31791 = new BitSet(new long[]{0x0000002A60200280L});
	public static final BitSet FOLLOW_GREATEQ_in_arith31796 = new BitSet(new long[]{0x0000002A60200280L});
	public static final BitSet FOLLOW_GREAT_in_arith31801 = new BitSet(new long[]{0x0000002A60200280L});
	public static final BitSet FOLLOW_EQ_in_arith31806 = new BitSet(new long[]{0x0000002A60200280L});
	public static final BitSet FOLLOW_NOTEQ_in_arith31811 = new BitSet(new long[]{0x0000002A60200280L});
	public static final BitSet FOLLOW_arith4_in_arith31815 = new BitSet(new long[]{0x00000004061C0002L});
	public static final BitSet FOLLOW_arith5_in_arith41845 = new BitSet(new long[]{0x0000002040000002L});
	public static final BitSet FOLLOW_PLUS_in_arith41849 = new BitSet(new long[]{0x0000002A60200280L});
	public static final BitSet FOLLOW_MIN_in_arith41854 = new BitSet(new long[]{0x0000002A60200280L});
	public static final BitSet FOLLOW_arith5_in_arith41858 = new BitSet(new long[]{0x0000002040000002L});
	public static final BitSet FOLLOW_arith6_in_arith51889 = new BitSet(new long[]{0x0000000180008002L});
	public static final BitSet FOLLOW_MULT_in_arith51893 = new BitSet(new long[]{0x0000002A60200280L});
	public static final BitSet FOLLOW_DIV_in_arith51898 = new BitSet(new long[]{0x0000002A60200280L});
	public static final BitSet FOLLOW_MOD_in_arith51903 = new BitSet(new long[]{0x0000002A60200280L});
	public static final BitSet FOLLOW_arith6_in_arith51907 = new BitSet(new long[]{0x0000000180008002L});
	public static final BitSet FOLLOW_PLUS_in_arith61942 = new BitSet(new long[]{0x0000000820200280L});
	public static final BitSet FOLLOW_MIN_in_arith61947 = new BitSet(new long[]{0x0000000820200280L});
	public static final BitSet FOLLOW_NOT_in_arith61952 = new BitSet(new long[]{0x0000000820200280L});
	public static final BitSet FOLLOW_operand_in_arith61957 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifelsethen1981 = new BitSet(new long[]{0x0000002A60200280L});
	public static final BitSet FOLLOW_single_expr_in_ifelsethen1984 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_THEN_in_ifelsethen1986 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_LCURLY_in_ifelsethen1989 = new BitSet(new long[]{0x0000844000602000L});
	public static final BitSet FOLLOW_unclosed_compound_expr_in_ifelsethen1992 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_RCURLY_in_ifelsethen1994 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_ELSE_in_ifelsethen1998 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_LCURLY_in_ifelsethen2001 = new BitSet(new long[]{0x0000844000602000L});
	public static final BitSet FOLLOW_unclosed_compound_expr_in_ifelsethen2004 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_RCURLY_in_ifelsethen2006 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand2029 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand2039 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand2049 = new BitSet(new long[]{0x0000002A60200280L});
	public static final BitSet FOLLOW_single_expr_in_operand2052 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_RPAREN_in_operand2054 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_OPERATOR_in_operand2065 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_OPERATOR_in_operand2075 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DQUOTATION_in_string2125 = new BitSet(new long[]{0x0000000008014000L});
	public static final BitSet FOLLOW_graphic_in_string2128 = new BitSet(new long[]{0x0000000008014000L});
	public static final BitSet FOLLOW_DQUOTATION_in_string2131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_synpred1_Chocolate1488 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_synpred1_Chocolate1490 = new BitSet(new long[]{0x0000000000000002L});
}
