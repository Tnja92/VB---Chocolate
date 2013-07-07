// $ANTLR 3.5 C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g 2013-07-07 01:03:28

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
		"MOD", "MULT", "NEG", "NOT", "NOTEQ", "NUMBER", "OR", "PLUS", "POS", "PRINT", 
		"PROGRAM", "QUOTATION", "RCURLY", "READ", "RPAREN", "SEMICOLON", "THEN", 
		"UPPER", "VAR", "WS"
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:63:1: program : ( ( declarations )* statements )+ EOF -> ^( PROGRAM ( ( declarations )* statements )+ ) ;
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
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:64:5: ( ( ( declarations )* statements )+ EOF -> ^( PROGRAM ( ( declarations )* statements )+ ) )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:64:10: ( ( declarations )* statements )+ EOF
			{
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:64:10: ( ( declarations )* statements )+
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
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:64:11: ( declarations )* statements
					{
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:64:11: ( declarations )*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( (LA1_0==CONSTANT||LA1_0==VAR) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:64:11: declarations
							{
							pushFollow(FOLLOW_declarations_in_program1039);
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

					pushFollow(FOLLOW_statements_in_program1042);
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

			EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_program1046); if (state.failed) return retval; 
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
			// 65:13: -> ^( PROGRAM ( ( declarations )* statements )+ )
			{
				// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:65:17: ^( PROGRAM ( ( declarations )* statements )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				if ( !(stream_statements.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_statements.hasNext() ) {
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:65:28: ( declarations )*
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:70:1: declarations : declaration SEMICOLON !;
	public final ChocolateParser.declarations_return declarations() throws RecognitionException {
		ChocolateParser.declarations_return retval = new ChocolateParser.declarations_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMICOLON5=null;
		ParserRuleReturnScope declaration4 =null;

		Object SEMICOLON5_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:71:5: ( declaration SEMICOLON !)
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:71:9: declaration SEMICOLON !
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_declaration_in_declarations1109);
			declaration4=declaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration4.getTree());

			SEMICOLON5=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_declarations1111); if (state.failed) return retval;
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:74:1: declaration : ( CONSTANT ^ constant_extension | VAR ^ var_extension );
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
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:75:5: ( CONSTANT ^ constant_extension | VAR ^ var_extension )
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
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:75:9: CONSTANT ^ constant_extension
					{
					root_0 = (Object)adaptor.nil();


					CONSTANT6=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_declaration1132); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CONSTANT6_tree = (Object)adaptor.create(CONSTANT6);
					root_0 = (Object)adaptor.becomeRoot(CONSTANT6_tree, root_0);
					}

					pushFollow(FOLLOW_constant_extension_in_declaration1135);
					constant_extension7=constant_extension();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constant_extension7.getTree());

					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:76:9: VAR ^ var_extension
					{
					root_0 = (Object)adaptor.nil();


					VAR8=(Token)match(input,VAR,FOLLOW_VAR_in_declaration1145); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VAR8_tree = (Object)adaptor.create(VAR8);
					root_0 = (Object)adaptor.becomeRoot(VAR8_tree, root_0);
					}

					pushFollow(FOLLOW_var_extension_in_declaration1148);
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:79:1: extra_decl : COMMA ! IDENTIFIER ;
	public final ChocolateParser.extra_decl_return extra_decl() throws RecognitionException {
		ChocolateParser.extra_decl_return retval = new ChocolateParser.extra_decl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token COMMA10=null;
		Token IDENTIFIER11=null;

		Object COMMA10_tree=null;
		Object IDENTIFIER11_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:80:5: ( COMMA ! IDENTIFIER )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:80:9: COMMA ! IDENTIFIER
			{
			root_0 = (Object)adaptor.nil();


			COMMA10=(Token)match(input,COMMA,FOLLOW_COMMA_in_extra_decl1171); if (state.failed) return retval;
			IDENTIFIER11=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_extra_decl1174); if (state.failed) return retval;
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:83:1: constant_extension : ( INTEGER IDENTIFIER ( extra_decl )* ASSIGN ( single_expr | closed_compound_expr ) | CHAR IDENTIFIER ( extra_decl )* ASSIGN CHAR_OPERATOR | BOOLEAN IDENTIFIER ( extra_decl )* ASSIGN BOOLEAN_OPERATOR );
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
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:85:5: ( INTEGER IDENTIFIER ( extra_decl )* ASSIGN ( single_expr | closed_compound_expr ) | CHAR IDENTIFIER ( extra_decl )* ASSIGN CHAR_OPERATOR | BOOLEAN IDENTIFIER ( extra_decl )* ASSIGN BOOLEAN_OPERATOR )
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
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:85:9: INTEGER IDENTIFIER ( extra_decl )* ASSIGN ( single_expr | closed_compound_expr )
					{
					root_0 = (Object)adaptor.nil();


					INTEGER12=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_constant_extension1202); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INTEGER12_tree = (Object)adaptor.create(INTEGER12);
					adaptor.addChild(root_0, INTEGER12_tree);
					}

					IDENTIFIER13=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant_extension1204); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER13_tree = (Object)adaptor.create(IDENTIFIER13);
					adaptor.addChild(root_0, IDENTIFIER13_tree);
					}

					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:85:28: ( extra_decl )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==COMMA) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:85:29: extra_decl
							{
							pushFollow(FOLLOW_extra_decl_in_constant_extension1207);
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

					ASSIGN15=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_constant_extension1211); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ASSIGN15_tree = (Object)adaptor.create(ASSIGN15);
					adaptor.addChild(root_0, ASSIGN15_tree);
					}

					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:85:49: ( single_expr | closed_compound_expr )
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
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:85:50: single_expr
							{
							pushFollow(FOLLOW_single_expr_in_constant_extension1214);
							single_expr16=single_expr();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, single_expr16.getTree());

							}
							break;
						case 2 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:85:64: closed_compound_expr
							{
							pushFollow(FOLLOW_closed_compound_expr_in_constant_extension1218);
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
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:87:9: CHAR IDENTIFIER ( extra_decl )* ASSIGN CHAR_OPERATOR
					{
					root_0 = (Object)adaptor.nil();


					CHAR18=(Token)match(input,CHAR,FOLLOW_CHAR_in_constant_extension1234); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CHAR18_tree = (Object)adaptor.create(CHAR18);
					adaptor.addChild(root_0, CHAR18_tree);
					}

					IDENTIFIER19=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant_extension1236); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER19_tree = (Object)adaptor.create(IDENTIFIER19);
					adaptor.addChild(root_0, IDENTIFIER19_tree);
					}

					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:87:25: ( extra_decl )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==COMMA) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:87:26: extra_decl
							{
							pushFollow(FOLLOW_extra_decl_in_constant_extension1239);
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

					ASSIGN21=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_constant_extension1243); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ASSIGN21_tree = (Object)adaptor.create(ASSIGN21);
					adaptor.addChild(root_0, ASSIGN21_tree);
					}

					CHAR_OPERATOR22=(Token)match(input,CHAR_OPERATOR,FOLLOW_CHAR_OPERATOR_in_constant_extension1245); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CHAR_OPERATOR22_tree = (Object)adaptor.create(CHAR_OPERATOR22);
					adaptor.addChild(root_0, CHAR_OPERATOR22_tree);
					}

					}
					break;
				case 3 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:89:9: BOOLEAN IDENTIFIER ( extra_decl )* ASSIGN BOOLEAN_OPERATOR
					{
					root_0 = (Object)adaptor.nil();


					BOOLEAN23=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_constant_extension1260); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BOOLEAN23_tree = (Object)adaptor.create(BOOLEAN23);
					adaptor.addChild(root_0, BOOLEAN23_tree);
					}

					IDENTIFIER24=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant_extension1262); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER24_tree = (Object)adaptor.create(IDENTIFIER24);
					adaptor.addChild(root_0, IDENTIFIER24_tree);
					}

					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:89:28: ( extra_decl )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0==COMMA) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:89:29: extra_decl
							{
							pushFollow(FOLLOW_extra_decl_in_constant_extension1265);
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

					ASSIGN26=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_constant_extension1269); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ASSIGN26_tree = (Object)adaptor.create(ASSIGN26);
					adaptor.addChild(root_0, ASSIGN26_tree);
					}

					BOOLEAN_OPERATOR27=(Token)match(input,BOOLEAN_OPERATOR,FOLLOW_BOOLEAN_OPERATOR_in_constant_extension1271); if (state.failed) return retval;
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:92:1: var_extension : ( INTEGER IDENTIFIER ( extra_decl )* ( ASSIGN ( single_expr | closed_compound_expr ) )? | CHAR IDENTIFIER ( extra_decl )* ( ASSIGN CHAR_OPERATOR )? | BOOLEAN IDENTIFIER ( extra_decl )* ( ASSIGN BOOLEAN_OPERATOR )? );
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
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:94:5: ( INTEGER IDENTIFIER ( extra_decl )* ( ASSIGN ( single_expr | closed_compound_expr ) )? | CHAR IDENTIFIER ( extra_decl )* ( ASSIGN CHAR_OPERATOR )? | BOOLEAN IDENTIFIER ( extra_decl )* ( ASSIGN BOOLEAN_OPERATOR )? )
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
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:94:9: INTEGER IDENTIFIER ( extra_decl )* ( ASSIGN ( single_expr | closed_compound_expr ) )?
					{
					root_0 = (Object)adaptor.nil();


					INTEGER28=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_var_extension1299); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INTEGER28_tree = (Object)adaptor.create(INTEGER28);
					adaptor.addChild(root_0, INTEGER28_tree);
					}

					IDENTIFIER29=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_var_extension1301); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER29_tree = (Object)adaptor.create(IDENTIFIER29);
					adaptor.addChild(root_0, IDENTIFIER29_tree);
					}

					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:94:28: ( extra_decl )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==COMMA) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:94:29: extra_decl
							{
							pushFollow(FOLLOW_extra_decl_in_var_extension1304);
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

					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:94:42: ( ASSIGN ( single_expr | closed_compound_expr ) )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==ASSIGN) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:94:43: ASSIGN ( single_expr | closed_compound_expr )
							{
							ASSIGN31=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_var_extension1309); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							ASSIGN31_tree = (Object)adaptor.create(ASSIGN31);
							adaptor.addChild(root_0, ASSIGN31_tree);
							}

							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:94:50: ( single_expr | closed_compound_expr )
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
									// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:94:51: single_expr
									{
									pushFollow(FOLLOW_single_expr_in_var_extension1312);
									single_expr32=single_expr();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, single_expr32.getTree());

									}
									break;
								case 2 :
									// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:94:65: closed_compound_expr
									{
									pushFollow(FOLLOW_closed_compound_expr_in_var_extension1316);
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
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:96:9: CHAR IDENTIFIER ( extra_decl )* ( ASSIGN CHAR_OPERATOR )?
					{
					root_0 = (Object)adaptor.nil();


					CHAR34=(Token)match(input,CHAR,FOLLOW_CHAR_in_var_extension1334); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CHAR34_tree = (Object)adaptor.create(CHAR34);
					adaptor.addChild(root_0, CHAR34_tree);
					}

					IDENTIFIER35=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_var_extension1336); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER35_tree = (Object)adaptor.create(IDENTIFIER35);
					adaptor.addChild(root_0, IDENTIFIER35_tree);
					}

					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:96:25: ( extra_decl )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==COMMA) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:96:26: extra_decl
							{
							pushFollow(FOLLOW_extra_decl_in_var_extension1339);
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

					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:96:39: ( ASSIGN CHAR_OPERATOR )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==ASSIGN) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:96:40: ASSIGN CHAR_OPERATOR
							{
							ASSIGN37=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_var_extension1344); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							ASSIGN37_tree = (Object)adaptor.create(ASSIGN37);
							adaptor.addChild(root_0, ASSIGN37_tree);
							}

							CHAR_OPERATOR38=(Token)match(input,CHAR_OPERATOR,FOLLOW_CHAR_OPERATOR_in_var_extension1346); if (state.failed) return retval;
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
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:98:9: BOOLEAN IDENTIFIER ( extra_decl )* ( ASSIGN BOOLEAN_OPERATOR )?
					{
					root_0 = (Object)adaptor.nil();


					BOOLEAN39=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_var_extension1363); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BOOLEAN39_tree = (Object)adaptor.create(BOOLEAN39);
					adaptor.addChild(root_0, BOOLEAN39_tree);
					}

					IDENTIFIER40=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_var_extension1365); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER40_tree = (Object)adaptor.create(IDENTIFIER40);
					adaptor.addChild(root_0, IDENTIFIER40_tree);
					}

					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:98:28: ( extra_decl )*
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==COMMA) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:98:29: extra_decl
							{
							pushFollow(FOLLOW_extra_decl_in_var_extension1368);
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

					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:98:42: ( ASSIGN BOOLEAN_OPERATOR )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==ASSIGN) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:98:43: ASSIGN BOOLEAN_OPERATOR
							{
							ASSIGN42=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_var_extension1373); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							ASSIGN42_tree = (Object)adaptor.create(ASSIGN42);
							adaptor.addChild(root_0, ASSIGN42_tree);
							}

							BOOLEAN_OPERATOR43=(Token)match(input,BOOLEAN_OPERATOR,FOLLOW_BOOLEAN_OPERATOR_in_var_extension1375); if (state.failed) return retval;
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:102:1: statements : statement SEMICOLON !;
	public final ChocolateParser.statements_return statements() throws RecognitionException {
		ChocolateParser.statements_return retval = new ChocolateParser.statements_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMICOLON45=null;
		ParserRuleReturnScope statement44 =null;

		Object SEMICOLON45_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:103:5: ( statement SEMICOLON !)
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:103:7: statement SEMICOLON !
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_statement_in_statements1398);
			statement44=statement();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, statement44.getTree());

			SEMICOLON45=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statements1400); if (state.failed) return retval;
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:106:1: statement : ( read | print | assign | ifthenelse );
	public final ChocolateParser.statement_return statement() throws RecognitionException {
		ChocolateParser.statement_return retval = new ChocolateParser.statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope read46 =null;
		ParserRuleReturnScope print47 =null;
		ParserRuleReturnScope assign48 =null;
		ParserRuleReturnScope ifthenelse49 =null;


		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:107:5: ( read | print | assign | ifthenelse )
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
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:107:9: read
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_read_in_statement1424);
					read46=read();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, read46.getTree());

					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:108:9: print
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_print_in_statement1435);
					print47=print();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, print47.getTree());

					}
					break;
				case 3 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:109:9: assign
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_assign_in_statement1446);
					assign48=assign();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assign48.getTree());

					}
					break;
				case 4 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:110:9: ifthenelse
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_ifthenelse_in_statement1459);
					ifthenelse49=ifthenelse();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ifthenelse49.getTree());

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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:113:1: read : READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !;
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
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:114:5: ( READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !)
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:114:9: READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			READ50=(Token)match(input,READ,FOLLOW_READ_in_read1478); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			READ50_tree = (Object)adaptor.create(READ50);
			root_0 = (Object)adaptor.becomeRoot(READ50_tree, root_0);
			}

			LPAREN51=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_read1481); if (state.failed) return retval;
			IDENTIFIER52=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read1484); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER52_tree = (Object)adaptor.create(IDENTIFIER52);
			adaptor.addChild(root_0, IDENTIFIER52_tree);
			}

			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:114:34: ( COMMA ! IDENTIFIER )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==COMMA) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:114:35: COMMA ! IDENTIFIER
					{
					COMMA53=(Token)match(input,COMMA,FOLLOW_COMMA_in_read1487); if (state.failed) return retval;
					IDENTIFIER54=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read1490); if (state.failed) return retval;
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

			RPAREN55=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_read1494); if (state.failed) return retval;
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:117:1: assign : IDENTIFIER ASSIGN ^ ( assignexpr ) ;
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
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:118:5: ( IDENTIFIER ASSIGN ^ ( assignexpr ) )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:118:9: IDENTIFIER ASSIGN ^ ( assignexpr )
			{
			root_0 = (Object)adaptor.nil();


			IDENTIFIER56=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assign1514); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER56_tree = (Object)adaptor.create(IDENTIFIER56);
			adaptor.addChild(root_0, IDENTIFIER56_tree);
			}

			ASSIGN57=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign1516); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ASSIGN57_tree = (Object)adaptor.create(ASSIGN57);
			root_0 = (Object)adaptor.becomeRoot(ASSIGN57_tree, root_0);
			}

			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:118:28: ( assignexpr )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:118:29: assignexpr
			{
			pushFollow(FOLLOW_assignexpr_in_assign1520);
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:121:1: assignexpr : ( ( IDENTIFIER ASSIGN ^)=> ( IDENTIFIER ASSIGN ^ assignexpr ) | single_expr | closed_compound_expr );
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
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:122:5: ( ( IDENTIFIER ASSIGN ^)=> ( IDENTIFIER ASSIGN ^ assignexpr ) | single_expr | closed_compound_expr )
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
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:122:9: ( IDENTIFIER ASSIGN ^)=> ( IDENTIFIER ASSIGN ^ assignexpr )
					{
					root_0 = (Object)adaptor.nil();


					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:122:33: ( IDENTIFIER ASSIGN ^ assignexpr )
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:122:34: IDENTIFIER ASSIGN ^ assignexpr
					{
					IDENTIFIER59=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assignexpr1554); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER59_tree = (Object)adaptor.create(IDENTIFIER59);
					adaptor.addChild(root_0, IDENTIFIER59_tree);
					}

					ASSIGN60=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignexpr1556); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ASSIGN60_tree = (Object)adaptor.create(ASSIGN60);
					root_0 = (Object)adaptor.becomeRoot(ASSIGN60_tree, root_0);
					}

					pushFollow(FOLLOW_assignexpr_in_assignexpr1559);
					assignexpr61=assignexpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignexpr61.getTree());

					}

					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:123:9: single_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_single_expr_in_assignexpr1570);
					single_expr62=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, single_expr62.getTree());

					}
					break;
				case 3 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:124:9: closed_compound_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_closed_compound_expr_in_assignexpr1580);
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:127:1: print : PRINT ^ LPAREN ! ( closed_compound_expr | IDENTIFIER | string ) ( COMMA ! ( closed_compound_expr | IDENTIFIER | string ) )* RPAREN !;
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
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:128:5: ( PRINT ^ LPAREN ! ( closed_compound_expr | IDENTIFIER | string ) ( COMMA ! ( closed_compound_expr | IDENTIFIER | string ) )* RPAREN !)
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:128:9: PRINT ^ LPAREN ! ( closed_compound_expr | IDENTIFIER | string ) ( COMMA ! ( closed_compound_expr | IDENTIFIER | string ) )* RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			PRINT64=(Token)match(input,PRINT,FOLLOW_PRINT_in_print1603); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			PRINT64_tree = (Object)adaptor.create(PRINT64);
			root_0 = (Object)adaptor.becomeRoot(PRINT64_tree, root_0);
			}

			LPAREN65=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_print1606); if (state.failed) return retval;
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:128:24: ( closed_compound_expr | IDENTIFIER | string )
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
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:128:25: closed_compound_expr
					{
					pushFollow(FOLLOW_closed_compound_expr_in_print1610);
					closed_compound_expr66=closed_compound_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, closed_compound_expr66.getTree());

					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:128:48: IDENTIFIER
					{
					IDENTIFIER67=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_print1614); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER67_tree = (Object)adaptor.create(IDENTIFIER67);
					adaptor.addChild(root_0, IDENTIFIER67_tree);
					}

					}
					break;
				case 3 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:128:61: string
					{
					pushFollow(FOLLOW_string_in_print1618);
					string68=string();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, string68.getTree());

					}
					break;

			}

			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:128:69: ( COMMA ! ( closed_compound_expr | IDENTIFIER | string ) )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==COMMA) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:128:70: COMMA ! ( closed_compound_expr | IDENTIFIER | string )
					{
					COMMA69=(Token)match(input,COMMA,FOLLOW_COMMA_in_print1622); if (state.failed) return retval;
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:128:77: ( closed_compound_expr | IDENTIFIER | string )
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
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:128:78: closed_compound_expr
							{
							pushFollow(FOLLOW_closed_compound_expr_in_print1626);
							closed_compound_expr70=closed_compound_expr();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, closed_compound_expr70.getTree());

							}
							break;
						case 2 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:128:101: IDENTIFIER
							{
							IDENTIFIER71=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_print1630); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							IDENTIFIER71_tree = (Object)adaptor.create(IDENTIFIER71);
							adaptor.addChild(root_0, IDENTIFIER71_tree);
							}

							}
							break;
						case 3 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:128:114: string
							{
							pushFollow(FOLLOW_string_in_print1634);
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

			RPAREN73=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_print1639); if (state.failed) return retval;
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


	public static class closed_compound_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "closed_compound_expr"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:134:1: closed_compound_expr : LCURLY ^ ( ( declarations )* statements )+ RCURLY !;
	public final ChocolateParser.closed_compound_expr_return closed_compound_expr() throws RecognitionException {
		ChocolateParser.closed_compound_expr_return retval = new ChocolateParser.closed_compound_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LCURLY74=null;
		Token RCURLY77=null;
		ParserRuleReturnScope declarations75 =null;
		ParserRuleReturnScope statements76 =null;

		Object LCURLY74_tree=null;
		Object RCURLY77_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:135:5: ( LCURLY ^ ( ( declarations )* statements )+ RCURLY !)
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:135:9: LCURLY ^ ( ( declarations )* statements )+ RCURLY !
			{
			root_0 = (Object)adaptor.nil();


			LCURLY74=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_closed_compound_expr1669); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LCURLY74_tree = (Object)adaptor.create(LCURLY74);
			root_0 = (Object)adaptor.becomeRoot(LCURLY74_tree, root_0);
			}

			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:135:17: ( ( declarations )* statements )+
			int cnt24=0;
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==CONSTANT||(LA24_0 >= IDENTIFIER && LA24_0 <= IF)||LA24_0==PRINT||LA24_0==READ||LA24_0==VAR) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:135:18: ( declarations )* statements
					{
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:135:18: ( declarations )*
					loop23:
					while (true) {
						int alt23=2;
						int LA23_0 = input.LA(1);
						if ( (LA23_0==CONSTANT||LA23_0==VAR) ) {
							alt23=1;
						}

						switch (alt23) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:135:18: declarations
							{
							pushFollow(FOLLOW_declarations_in_closed_compound_expr1673);
							declarations75=declarations();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, declarations75.getTree());

							}
							break;

						default :
							break loop23;
						}
					}

					pushFollow(FOLLOW_statements_in_closed_compound_expr1676);
					statements76=statements();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statements76.getTree());

					}
					break;

				default :
					if ( cnt24 >= 1 ) break loop24;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(24, input);
					throw eee;
				}
				cnt24++;
			}

			RCURLY77=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_closed_compound_expr1680); if (state.failed) return retval;
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:138:1: single_expr : arithmetic ;
	public final ChocolateParser.single_expr_return single_expr() throws RecognitionException {
		ChocolateParser.single_expr_return retval = new ChocolateParser.single_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope arithmetic78 =null;


		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:139:5: ( arithmetic )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:139:9: arithmetic
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_in_single_expr1704);
			arithmetic78=arithmetic();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic78.getTree());

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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:142:1: arithmetic : arith2 ( OR ^ arith2 )* ;
	public final ChocolateParser.arithmetic_return arithmetic() throws RecognitionException {
		ChocolateParser.arithmetic_return retval = new ChocolateParser.arithmetic_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token OR80=null;
		ParserRuleReturnScope arith279 =null;
		ParserRuleReturnScope arith281 =null;

		Object OR80_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:143:5: ( arith2 ( OR ^ arith2 )* )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:143:9: arith2 ( OR ^ arith2 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arith2_in_arithmetic1723);
			arith279=arith2();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arith279.getTree());

			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:143:16: ( OR ^ arith2 )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==OR) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:143:17: OR ^ arith2
					{
					OR80=(Token)match(input,OR,FOLLOW_OR_in_arithmetic1726); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					OR80_tree = (Object)adaptor.create(OR80);
					root_0 = (Object)adaptor.becomeRoot(OR80_tree, root_0);
					}

					pushFollow(FOLLOW_arith2_in_arithmetic1729);
					arith281=arith2();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arith281.getTree());

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
	// $ANTLR end "arithmetic"


	public static class arith2_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arith2"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:146:1: arith2 : arith3 ( AND ^ arith3 )* ;
	public final ChocolateParser.arith2_return arith2() throws RecognitionException {
		ChocolateParser.arith2_return retval = new ChocolateParser.arith2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AND83=null;
		ParserRuleReturnScope arith382 =null;
		ParserRuleReturnScope arith384 =null;

		Object AND83_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:147:5: ( arith3 ( AND ^ arith3 )* )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:147:9: arith3 ( AND ^ arith3 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arith3_in_arith21754);
			arith382=arith3();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arith382.getTree());

			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:147:16: ( AND ^ arith3 )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==AND) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:147:17: AND ^ arith3
					{
					AND83=(Token)match(input,AND,FOLLOW_AND_in_arith21757); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AND83_tree = (Object)adaptor.create(AND83);
					root_0 = (Object)adaptor.becomeRoot(AND83_tree, root_0);
					}

					pushFollow(FOLLOW_arith3_in_arith21760);
					arith384=arith3();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arith384.getTree());

					}
					break;

				default :
					break loop26;
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:150:1: arith3 : arith4 ( ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^) arith4 )* ;
	public final ChocolateParser.arith3_return arith3() throws RecognitionException {
		ChocolateParser.arith3_return retval = new ChocolateParser.arith3_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LESS86=null;
		Token LESSEQ87=null;
		Token GREATEQ88=null;
		Token GREAT89=null;
		Token EQ90=null;
		Token NOTEQ91=null;
		ParserRuleReturnScope arith485 =null;
		ParserRuleReturnScope arith492 =null;

		Object LESS86_tree=null;
		Object LESSEQ87_tree=null;
		Object GREATEQ88_tree=null;
		Object GREAT89_tree=null;
		Object EQ90_tree=null;
		Object NOTEQ91_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:151:5: ( arith4 ( ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^) arith4 )* )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:151:9: arith4 ( ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^) arith4 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arith4_in_arith31785);
			arith485=arith4();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arith485.getTree());

			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:151:16: ( ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^) arith4 )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( ((LA28_0 >= EQ && LA28_0 <= GREATEQ)||(LA28_0 >= LESS && LA28_0 <= LESSEQ)||LA28_0==NOTEQ) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:151:17: ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^) arith4
					{
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:151:17: ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^)
					int alt27=6;
					switch ( input.LA(1) ) {
					case LESS:
						{
						alt27=1;
						}
						break;
					case LESSEQ:
						{
						alt27=2;
						}
						break;
					case GREATEQ:
						{
						alt27=3;
						}
						break;
					case GREAT:
						{
						alt27=4;
						}
						break;
					case EQ:
						{
						alt27=5;
						}
						break;
					case NOTEQ:
						{
						alt27=6;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 27, 0, input);
						throw nvae;
					}
					switch (alt27) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:151:18: LESS ^
							{
							LESS86=(Token)match(input,LESS,FOLLOW_LESS_in_arith31789); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							LESS86_tree = (Object)adaptor.create(LESS86);
							root_0 = (Object)adaptor.becomeRoot(LESS86_tree, root_0);
							}

							}
							break;
						case 2 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:151:26: LESSEQ ^
							{
							LESSEQ87=(Token)match(input,LESSEQ,FOLLOW_LESSEQ_in_arith31794); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							LESSEQ87_tree = (Object)adaptor.create(LESSEQ87);
							root_0 = (Object)adaptor.becomeRoot(LESSEQ87_tree, root_0);
							}

							}
							break;
						case 3 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:151:36: GREATEQ ^
							{
							GREATEQ88=(Token)match(input,GREATEQ,FOLLOW_GREATEQ_in_arith31799); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							GREATEQ88_tree = (Object)adaptor.create(GREATEQ88);
							root_0 = (Object)adaptor.becomeRoot(GREATEQ88_tree, root_0);
							}

							}
							break;
						case 4 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:151:47: GREAT ^
							{
							GREAT89=(Token)match(input,GREAT,FOLLOW_GREAT_in_arith31804); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							GREAT89_tree = (Object)adaptor.create(GREAT89);
							root_0 = (Object)adaptor.becomeRoot(GREAT89_tree, root_0);
							}

							}
							break;
						case 5 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:151:56: EQ ^
							{
							EQ90=(Token)match(input,EQ,FOLLOW_EQ_in_arith31809); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							EQ90_tree = (Object)adaptor.create(EQ90);
							root_0 = (Object)adaptor.becomeRoot(EQ90_tree, root_0);
							}

							}
							break;
						case 6 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:151:62: NOTEQ ^
							{
							NOTEQ91=(Token)match(input,NOTEQ,FOLLOW_NOTEQ_in_arith31814); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							NOTEQ91_tree = (Object)adaptor.create(NOTEQ91);
							root_0 = (Object)adaptor.becomeRoot(NOTEQ91_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_arith4_in_arith31818);
					arith492=arith4();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arith492.getTree());

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
	// $ANTLR end "arith3"


	public static class arith4_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arith4"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:154:1: arith4 : arith5 ( ( PLUS ^| MIN ^) arith5 )* ;
	public final ChocolateParser.arith4_return arith4() throws RecognitionException {
		ChocolateParser.arith4_return retval = new ChocolateParser.arith4_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS94=null;
		Token MIN95=null;
		ParserRuleReturnScope arith593 =null;
		ParserRuleReturnScope arith596 =null;

		Object PLUS94_tree=null;
		Object MIN95_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:155:5: ( arith5 ( ( PLUS ^| MIN ^) arith5 )* )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:155:9: arith5 ( ( PLUS ^| MIN ^) arith5 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arith5_in_arith41848);
			arith593=arith5();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arith593.getTree());

			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:155:16: ( ( PLUS ^| MIN ^) arith5 )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==MIN||LA30_0==PLUS) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:155:17: ( PLUS ^| MIN ^) arith5
					{
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:155:17: ( PLUS ^| MIN ^)
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==PLUS) ) {
						alt29=1;
					}
					else if ( (LA29_0==MIN) ) {
						alt29=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 29, 0, input);
						throw nvae;
					}

					switch (alt29) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:155:18: PLUS ^
							{
							PLUS94=(Token)match(input,PLUS,FOLLOW_PLUS_in_arith41852); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							PLUS94_tree = (Object)adaptor.create(PLUS94);
							root_0 = (Object)adaptor.becomeRoot(PLUS94_tree, root_0);
							}

							}
							break;
						case 2 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:155:26: MIN ^
							{
							MIN95=(Token)match(input,MIN,FOLLOW_MIN_in_arith41857); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							MIN95_tree = (Object)adaptor.create(MIN95);
							root_0 = (Object)adaptor.becomeRoot(MIN95_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_arith5_in_arith41861);
					arith596=arith5();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arith596.getTree());

					}
					break;

				default :
					break loop30;
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:158:1: arith5 : arith6 ( ( MULT ^| DIV ^| MOD ^) arith6 )* ;
	public final ChocolateParser.arith5_return arith5() throws RecognitionException {
		ChocolateParser.arith5_return retval = new ChocolateParser.arith5_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MULT98=null;
		Token DIV99=null;
		Token MOD100=null;
		ParserRuleReturnScope arith697 =null;
		ParserRuleReturnScope arith6101 =null;

		Object MULT98_tree=null;
		Object DIV99_tree=null;
		Object MOD100_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:159:5: ( arith6 ( ( MULT ^| DIV ^| MOD ^) arith6 )* )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:159:9: arith6 ( ( MULT ^| DIV ^| MOD ^) arith6 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arith6_in_arith51892);
			arith697=arith6();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arith697.getTree());

			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:159:16: ( ( MULT ^| DIV ^| MOD ^) arith6 )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==DIV||(LA32_0 >= MOD && LA32_0 <= MULT)) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:159:17: ( MULT ^| DIV ^| MOD ^) arith6
					{
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:159:17: ( MULT ^| DIV ^| MOD ^)
					int alt31=3;
					switch ( input.LA(1) ) {
					case MULT:
						{
						alt31=1;
						}
						break;
					case DIV:
						{
						alt31=2;
						}
						break;
					case MOD:
						{
						alt31=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 31, 0, input);
						throw nvae;
					}
					switch (alt31) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:159:18: MULT ^
							{
							MULT98=(Token)match(input,MULT,FOLLOW_MULT_in_arith51896); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							MULT98_tree = (Object)adaptor.create(MULT98);
							root_0 = (Object)adaptor.becomeRoot(MULT98_tree, root_0);
							}

							}
							break;
						case 2 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:159:26: DIV ^
							{
							DIV99=(Token)match(input,DIV,FOLLOW_DIV_in_arith51901); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							DIV99_tree = (Object)adaptor.create(DIV99);
							root_0 = (Object)adaptor.becomeRoot(DIV99_tree, root_0);
							}

							}
							break;
						case 3 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:159:33: MOD ^
							{
							MOD100=(Token)match(input,MOD,FOLLOW_MOD_in_arith51906); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							MOD100_tree = (Object)adaptor.create(MOD100);
							root_0 = (Object)adaptor.becomeRoot(MOD100_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_arith6_in_arith51910);
					arith6101=arith6();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arith6101.getTree());

					}
					break;

				default :
					break loop32;
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:162:1: arith6 : ( PLUS operand -> ^( POS operand ) | MIN operand -> ^( NEG operand ) | NOT ^ operand | operand );
	public final ChocolateParser.arith6_return arith6() throws RecognitionException {
		ChocolateParser.arith6_return retval = new ChocolateParser.arith6_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS102=null;
		Token MIN104=null;
		Token NOT106=null;
		ParserRuleReturnScope operand103 =null;
		ParserRuleReturnScope operand105 =null;
		ParserRuleReturnScope operand107 =null;
		ParserRuleReturnScope operand108 =null;

		Object PLUS102_tree=null;
		Object MIN104_tree=null;
		Object NOT106_tree=null;
		RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
		RewriteRuleTokenStream stream_MIN=new RewriteRuleTokenStream(adaptor,"token MIN");
		RewriteRuleSubtreeStream stream_operand=new RewriteRuleSubtreeStream(adaptor,"rule operand");

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:163:5: ( PLUS operand -> ^( POS operand ) | MIN operand -> ^( NEG operand ) | NOT ^ operand | operand )
			int alt33=4;
			switch ( input.LA(1) ) {
			case PLUS:
				{
				alt33=1;
				}
				break;
			case MIN:
				{
				alt33=2;
				}
				break;
			case NOT:
				{
				alt33=3;
				}
				break;
			case BOOLEAN_OPERATOR:
			case CHAR_OPERATOR:
			case IDENTIFIER:
			case LPAREN:
			case NUMBER:
				{
				alt33=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}
			switch (alt33) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:163:9: PLUS operand
					{
					PLUS102=(Token)match(input,PLUS,FOLLOW_PLUS_in_arith61943); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PLUS.add(PLUS102);

					pushFollow(FOLLOW_operand_in_arith61945);
					operand103=operand();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_operand.add(operand103.getTree());
					// AST REWRITE
					// elements: operand
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 163:22: -> ^( POS operand )
					{
						// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:163:25: ^( POS operand )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(POS, "POS"), root_1);
						adaptor.addChild(root_1, stream_operand.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:164:9: MIN operand
					{
					MIN104=(Token)match(input,MIN,FOLLOW_MIN_in_arith61964); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MIN.add(MIN104);

					pushFollow(FOLLOW_operand_in_arith61966);
					operand105=operand();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_operand.add(operand105.getTree());
					// AST REWRITE
					// elements: operand
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 164:21: -> ^( NEG operand )
					{
						// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:164:24: ^( NEG operand )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NEG, "NEG"), root_1);
						adaptor.addChild(root_1, stream_operand.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:165:9: NOT ^ operand
					{
					root_0 = (Object)adaptor.nil();


					NOT106=(Token)match(input,NOT,FOLLOW_NOT_in_arith61984); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NOT106_tree = (Object)adaptor.create(NOT106);
					root_0 = (Object)adaptor.becomeRoot(NOT106_tree, root_0);
					}

					pushFollow(FOLLOW_operand_in_arith61987);
					operand107=operand();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, operand107.getTree());

					}
					break;
				case 4 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:166:9: operand
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_operand_in_arith61997);
					operand108=operand();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, operand108.getTree());

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
	// $ANTLR end "arith6"


	public static class ifthenelse_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ifthenelse"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:169:1: ifthenelse : IF ^ single_expr THEN ! closed_compound_expr ( ELSE ! closed_compound_expr )? ;
	public final ChocolateParser.ifthenelse_return ifthenelse() throws RecognitionException {
		ChocolateParser.ifthenelse_return retval = new ChocolateParser.ifthenelse_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IF109=null;
		Token THEN111=null;
		Token ELSE113=null;
		ParserRuleReturnScope single_expr110 =null;
		ParserRuleReturnScope closed_compound_expr112 =null;
		ParserRuleReturnScope closed_compound_expr114 =null;

		Object IF109_tree=null;
		Object THEN111_tree=null;
		Object ELSE113_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:170:5: ( IF ^ single_expr THEN ! closed_compound_expr ( ELSE ! closed_compound_expr )? )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:170:9: IF ^ single_expr THEN ! closed_compound_expr ( ELSE ! closed_compound_expr )?
			{
			root_0 = (Object)adaptor.nil();


			IF109=(Token)match(input,IF,FOLLOW_IF_in_ifthenelse2020); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IF109_tree = (Object)adaptor.create(IF109);
			root_0 = (Object)adaptor.becomeRoot(IF109_tree, root_0);
			}

			pushFollow(FOLLOW_single_expr_in_ifthenelse2023);
			single_expr110=single_expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, single_expr110.getTree());

			THEN111=(Token)match(input,THEN,FOLLOW_THEN_in_ifthenelse2025); if (state.failed) return retval;
			pushFollow(FOLLOW_closed_compound_expr_in_ifthenelse2028);
			closed_compound_expr112=closed_compound_expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, closed_compound_expr112.getTree());

			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:170:52: ( ELSE ! closed_compound_expr )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==ELSE) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:170:53: ELSE ! closed_compound_expr
					{
					ELSE113=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifthenelse2031); if (state.failed) return retval;
					pushFollow(FOLLOW_closed_compound_expr_in_ifthenelse2034);
					closed_compound_expr114=closed_compound_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, closed_compound_expr114.getTree());

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
	// $ANTLR end "ifthenelse"


	public static class operand_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "operand"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:174:1: operand : ( IDENTIFIER | NUMBER | LPAREN ^ single_expr RPAREN !| BOOLEAN_OPERATOR | CHAR_OPERATOR );
	public final ChocolateParser.operand_return operand() throws RecognitionException {
		ChocolateParser.operand_return retval = new ChocolateParser.operand_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER115=null;
		Token NUMBER116=null;
		Token LPAREN117=null;
		Token RPAREN119=null;
		Token BOOLEAN_OPERATOR120=null;
		Token CHAR_OPERATOR121=null;
		ParserRuleReturnScope single_expr118 =null;

		Object IDENTIFIER115_tree=null;
		Object NUMBER116_tree=null;
		Object LPAREN117_tree=null;
		Object RPAREN119_tree=null;
		Object BOOLEAN_OPERATOR120_tree=null;
		Object CHAR_OPERATOR121_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:175:5: ( IDENTIFIER | NUMBER | LPAREN ^ single_expr RPAREN !| BOOLEAN_OPERATOR | CHAR_OPERATOR )
			int alt35=5;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt35=1;
				}
				break;
			case NUMBER:
				{
				alt35=2;
				}
				break;
			case LPAREN:
				{
				alt35=3;
				}
				break;
			case BOOLEAN_OPERATOR:
				{
				alt35=4;
				}
				break;
			case CHAR_OPERATOR:
				{
				alt35=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}
			switch (alt35) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:175:9: IDENTIFIER
					{
					root_0 = (Object)adaptor.nil();


					IDENTIFIER115=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand2056); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER115_tree = (Object)adaptor.create(IDENTIFIER115);
					adaptor.addChild(root_0, IDENTIFIER115_tree);
					}

					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:176:9: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER116=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_operand2066); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NUMBER116_tree = (Object)adaptor.create(NUMBER116);
					adaptor.addChild(root_0, NUMBER116_tree);
					}

					}
					break;
				case 3 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:177:9: LPAREN ^ single_expr RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					LPAREN117=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operand2076); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LPAREN117_tree = (Object)adaptor.create(LPAREN117);
					root_0 = (Object)adaptor.becomeRoot(LPAREN117_tree, root_0);
					}

					pushFollow(FOLLOW_single_expr_in_operand2079);
					single_expr118=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, single_expr118.getTree());

					RPAREN119=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operand2081); if (state.failed) return retval;
					}
					break;
				case 4 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:178:9: BOOLEAN_OPERATOR
					{
					root_0 = (Object)adaptor.nil();


					BOOLEAN_OPERATOR120=(Token)match(input,BOOLEAN_OPERATOR,FOLLOW_BOOLEAN_OPERATOR_in_operand2092); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BOOLEAN_OPERATOR120_tree = (Object)adaptor.create(BOOLEAN_OPERATOR120);
					adaptor.addChild(root_0, BOOLEAN_OPERATOR120_tree);
					}

					}
					break;
				case 5 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:179:9: CHAR_OPERATOR
					{
					root_0 = (Object)adaptor.nil();


					CHAR_OPERATOR121=(Token)match(input,CHAR_OPERATOR,FOLLOW_CHAR_OPERATOR_in_operand2102); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CHAR_OPERATOR121_tree = (Object)adaptor.create(CHAR_OPERATOR121);
					adaptor.addChild(root_0, CHAR_OPERATOR121_tree);
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


	public static class string_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "string"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:182:1: string : DQUOTATION ! IDENTIFIER DQUOTATION !;
	public final ChocolateParser.string_return string() throws RecognitionException {
		ChocolateParser.string_return retval = new ChocolateParser.string_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token DQUOTATION122=null;
		Token IDENTIFIER123=null;
		Token DQUOTATION124=null;

		Object DQUOTATION122_tree=null;
		Object IDENTIFIER123_tree=null;
		Object DQUOTATION124_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:183:5: ( DQUOTATION ! IDENTIFIER DQUOTATION !)
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:183:9: DQUOTATION ! IDENTIFIER DQUOTATION !
			{
			root_0 = (Object)adaptor.nil();


			DQUOTATION122=(Token)match(input,DQUOTATION,FOLLOW_DQUOTATION_in_string2125); if (state.failed) return retval;
			IDENTIFIER123=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_string2128); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER123_tree = (Object)adaptor.create(IDENTIFIER123);
			adaptor.addChild(root_0, IDENTIFIER123_tree);
			}

			DQUOTATION124=(Token)match(input,DQUOTATION,FOLLOW_DQUOTATION_in_string2130); if (state.failed) return retval;
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:186:1: graphic : ( LETTER | DIGIT );
	public final ChocolateParser.graphic_return graphic() throws RecognitionException {
		ChocolateParser.graphic_return retval = new ChocolateParser.graphic_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set125=null;

		Object set125_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:187:5: ( LETTER | DIGIT )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:
			{
			root_0 = (Object)adaptor.nil();


			set125=input.LT(1);
			if ( input.LA(1)==DIGIT||input.LA(1)==LETTER ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set125));
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
		// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:122:9: ( IDENTIFIER ASSIGN ^)
		// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:122:10: IDENTIFIER ASSIGN ^
		{
		match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred1_Chocolate1545); if (state.failed) return;

		match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred1_Chocolate1547); if (state.failed) return;

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



	public static final BitSet FOLLOW_declarations_in_program1039 = new BitSet(new long[]{0x0002110000602000L});
	public static final BitSet FOLLOW_statements_in_program1042 = new BitSet(new long[]{0x0002110000602000L});
	public static final BitSet FOLLOW_EOF_in_program1046 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_declarations1109 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_declarations1111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONSTANT_in_declaration1132 = new BitSet(new long[]{0x0000000000800140L});
	public static final BitSet FOLLOW_constant_extension_in_declaration1135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_declaration1145 = new BitSet(new long[]{0x0000000000800140L});
	public static final BitSet FOLLOW_var_extension_in_declaration1148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_extra_decl1171 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_extra_decl1174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_constant_extension1202 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_constant_extension1204 = new BitSet(new long[]{0x0000000000000820L});
	public static final BitSet FOLLOW_extra_decl_in_constant_extension1207 = new BitSet(new long[]{0x0000000000000820L});
	public static final BitSet FOLLOW_ASSIGN_in_constant_extension1211 = new BitSet(new long[]{0x0000005461200280L});
	public static final BitSet FOLLOW_single_expr_in_constant_extension1214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_closed_compound_expr_in_constant_extension1218 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_constant_extension1234 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_constant_extension1236 = new BitSet(new long[]{0x0000000000000820L});
	public static final BitSet FOLLOW_extra_decl_in_constant_extension1239 = new BitSet(new long[]{0x0000000000000820L});
	public static final BitSet FOLLOW_ASSIGN_in_constant_extension1243 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CHAR_OPERATOR_in_constant_extension1245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_constant_extension1260 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_constant_extension1262 = new BitSet(new long[]{0x0000000000000820L});
	public static final BitSet FOLLOW_extra_decl_in_constant_extension1265 = new BitSet(new long[]{0x0000000000000820L});
	public static final BitSet FOLLOW_ASSIGN_in_constant_extension1269 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BOOLEAN_OPERATOR_in_constant_extension1271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_var_extension1299 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_var_extension1301 = new BitSet(new long[]{0x0000000000000822L});
	public static final BitSet FOLLOW_extra_decl_in_var_extension1304 = new BitSet(new long[]{0x0000000000000822L});
	public static final BitSet FOLLOW_ASSIGN_in_var_extension1309 = new BitSet(new long[]{0x0000005461200280L});
	public static final BitSet FOLLOW_single_expr_in_var_extension1312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_closed_compound_expr_in_var_extension1316 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_var_extension1334 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_var_extension1336 = new BitSet(new long[]{0x0000000000000822L});
	public static final BitSet FOLLOW_extra_decl_in_var_extension1339 = new BitSet(new long[]{0x0000000000000822L});
	public static final BitSet FOLLOW_ASSIGN_in_var_extension1344 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CHAR_OPERATOR_in_var_extension1346 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_var_extension1363 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_var_extension1365 = new BitSet(new long[]{0x0000000000000822L});
	public static final BitSet FOLLOW_extra_decl_in_var_extension1368 = new BitSet(new long[]{0x0000000000000822L});
	public static final BitSet FOLLOW_ASSIGN_in_var_extension1373 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BOOLEAN_OPERATOR_in_var_extension1375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statements1398 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_statements1400 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_in_statement1424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_in_statement1435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assign_in_statement1446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifthenelse_in_statement1459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read1478 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_LPAREN_in_read1481 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read1484 = new BitSet(new long[]{0x0000200000000800L});
	public static final BitSet FOLLOW_COMMA_in_read1487 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read1490 = new BitSet(new long[]{0x0000200000000800L});
	public static final BitSet FOLLOW_RPAREN_in_read1494 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_assign1514 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_assign1516 = new BitSet(new long[]{0x0000005461200280L});
	public static final BitSet FOLLOW_assignexpr_in_assign1520 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_assignexpr1554 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_assignexpr1556 = new BitSet(new long[]{0x0000005461200280L});
	public static final BitSet FOLLOW_assignexpr_in_assignexpr1559 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_single_expr_in_assignexpr1570 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_closed_compound_expr_in_assignexpr1580 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print1603 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_LPAREN_in_print1606 = new BitSet(new long[]{0x0000000001210000L});
	public static final BitSet FOLLOW_closed_compound_expr_in_print1610 = new BitSet(new long[]{0x0000200000000800L});
	public static final BitSet FOLLOW_IDENTIFIER_in_print1614 = new BitSet(new long[]{0x0000200000000800L});
	public static final BitSet FOLLOW_string_in_print1618 = new BitSet(new long[]{0x0000200000000800L});
	public static final BitSet FOLLOW_COMMA_in_print1622 = new BitSet(new long[]{0x0000000001210000L});
	public static final BitSet FOLLOW_closed_compound_expr_in_print1626 = new BitSet(new long[]{0x0000200000000800L});
	public static final BitSet FOLLOW_IDENTIFIER_in_print1630 = new BitSet(new long[]{0x0000200000000800L});
	public static final BitSet FOLLOW_string_in_print1634 = new BitSet(new long[]{0x0000200000000800L});
	public static final BitSet FOLLOW_RPAREN_in_print1639 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_closed_compound_expr1669 = new BitSet(new long[]{0x0002110000602000L});
	public static final BitSet FOLLOW_declarations_in_closed_compound_expr1673 = new BitSet(new long[]{0x0002110000602000L});
	public static final BitSet FOLLOW_statements_in_closed_compound_expr1676 = new BitSet(new long[]{0x0002190000602000L});
	public static final BitSet FOLLOW_RCURLY_in_closed_compound_expr1680 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_in_single_expr1704 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arith2_in_arithmetic1723 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_OR_in_arithmetic1726 = new BitSet(new long[]{0x0000005460200280L});
	public static final BitSet FOLLOW_arith2_in_arithmetic1729 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_arith3_in_arith21754 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_AND_in_arith21757 = new BitSet(new long[]{0x0000005460200280L});
	public static final BitSet FOLLOW_arith3_in_arith21760 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_arith4_in_arith31785 = new BitSet(new long[]{0x00000008061C0002L});
	public static final BitSet FOLLOW_LESS_in_arith31789 = new BitSet(new long[]{0x0000005460200280L});
	public static final BitSet FOLLOW_LESSEQ_in_arith31794 = new BitSet(new long[]{0x0000005460200280L});
	public static final BitSet FOLLOW_GREATEQ_in_arith31799 = new BitSet(new long[]{0x0000005460200280L});
	public static final BitSet FOLLOW_GREAT_in_arith31804 = new BitSet(new long[]{0x0000005460200280L});
	public static final BitSet FOLLOW_EQ_in_arith31809 = new BitSet(new long[]{0x0000005460200280L});
	public static final BitSet FOLLOW_NOTEQ_in_arith31814 = new BitSet(new long[]{0x0000005460200280L});
	public static final BitSet FOLLOW_arith4_in_arith31818 = new BitSet(new long[]{0x00000008061C0002L});
	public static final BitSet FOLLOW_arith5_in_arith41848 = new BitSet(new long[]{0x0000004040000002L});
	public static final BitSet FOLLOW_PLUS_in_arith41852 = new BitSet(new long[]{0x0000005460200280L});
	public static final BitSet FOLLOW_MIN_in_arith41857 = new BitSet(new long[]{0x0000005460200280L});
	public static final BitSet FOLLOW_arith5_in_arith41861 = new BitSet(new long[]{0x0000004040000002L});
	public static final BitSet FOLLOW_arith6_in_arith51892 = new BitSet(new long[]{0x0000000180008002L});
	public static final BitSet FOLLOW_MULT_in_arith51896 = new BitSet(new long[]{0x0000005460200280L});
	public static final BitSet FOLLOW_DIV_in_arith51901 = new BitSet(new long[]{0x0000005460200280L});
	public static final BitSet FOLLOW_MOD_in_arith51906 = new BitSet(new long[]{0x0000005460200280L});
	public static final BitSet FOLLOW_arith6_in_arith51910 = new BitSet(new long[]{0x0000000180008002L});
	public static final BitSet FOLLOW_PLUS_in_arith61943 = new BitSet(new long[]{0x0000001020200280L});
	public static final BitSet FOLLOW_operand_in_arith61945 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MIN_in_arith61964 = new BitSet(new long[]{0x0000001020200280L});
	public static final BitSet FOLLOW_operand_in_arith61966 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_arith61984 = new BitSet(new long[]{0x0000001020200280L});
	public static final BitSet FOLLOW_operand_in_arith61987 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operand_in_arith61997 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifthenelse2020 = new BitSet(new long[]{0x0000005460200280L});
	public static final BitSet FOLLOW_single_expr_in_ifthenelse2023 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_THEN_in_ifthenelse2025 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_closed_compound_expr_in_ifthenelse2028 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_ELSE_in_ifthenelse2031 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_closed_compound_expr_in_ifthenelse2034 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand2056 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand2066 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand2076 = new BitSet(new long[]{0x0000005460200280L});
	public static final BitSet FOLLOW_single_expr_in_operand2079 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_RPAREN_in_operand2081 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_OPERATOR_in_operand2092 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_OPERATOR_in_operand2102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DQUOTATION_in_string2125 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_string2128 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_DQUOTATION_in_string2130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_synpred1_Chocolate1545 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_synpred1_Chocolate1547 = new BitSet(new long[]{0x0000000000000002L});
}
