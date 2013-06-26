// $ANTLR 3.5 C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g 2013-06-26 21:00:40

package SyntacticAnalyzer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class ChocolateParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ASSIGN", "BECOMES", "BOOLEAN", 
		"BOOLEAN_OPERATOR", "CHAR", "CHAR_OPERATOR", "COLON", "COMMA", "COMMENT", 
		"CONSTANT", "DIGIT", "DIV", "DQUOTATION", "ELSE", "EQ", "FALSE", "GREAT", 
		"GREATEQ", "IDENTIFIER", "IF", "INTEGER", "LCURLY", "LESS", "LESSEQ", 
		"LETTER", "LOWER", "LPAREN", "MIN", "MOD", "MULT", "NOT", "NOTEQ", "NUMBER", 
		"OR", "PLUS", "PRINT", "PROGRAM", "QUOTATION", "RCURLY", "READ", "RPAREN", 
		"SEMICOLON", "THEN", "TRUE", "UPPER", "VAR", "WS"
	};
	public static final int EOF=-1;
	public static final int AND=4;
	public static final int ASSIGN=5;
	public static final int BECOMES=6;
	public static final int BOOLEAN=7;
	public static final int BOOLEAN_OPERATOR=8;
	public static final int CHAR=9;
	public static final int CHAR_OPERATOR=10;
	public static final int COLON=11;
	public static final int COMMA=12;
	public static final int COMMENT=13;
	public static final int CONSTANT=14;
	public static final int DIGIT=15;
	public static final int DIV=16;
	public static final int DQUOTATION=17;
	public static final int ELSE=18;
	public static final int EQ=19;
	public static final int FALSE=20;
	public static final int GREAT=21;
	public static final int GREATEQ=22;
	public static final int IDENTIFIER=23;
	public static final int IF=24;
	public static final int INTEGER=25;
	public static final int LCURLY=26;
	public static final int LESS=27;
	public static final int LESSEQ=28;
	public static final int LETTER=29;
	public static final int LOWER=30;
	public static final int LPAREN=31;
	public static final int MIN=32;
	public static final int MOD=33;
	public static final int MULT=34;
	public static final int NOT=35;
	public static final int NOTEQ=36;
	public static final int NUMBER=37;
	public static final int OR=38;
	public static final int PLUS=39;
	public static final int PRINT=40;
	public static final int PROGRAM=41;
	public static final int QUOTATION=42;
	public static final int RCURLY=43;
	public static final int READ=44;
	public static final int RPAREN=45;
	public static final int SEMICOLON=46;
	public static final int THEN=47;
	public static final int TRUE=48;
	public static final int UPPER=49;
	public static final int VAR=50;
	public static final int WS=51;

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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:64:1: program : ( ( declarations )* statements )+ EOF -> ^( PROGRAM ( ( declarations )* statements )+ ) ;
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
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:65:5: ( ( ( declarations )* statements )+ EOF -> ^( PROGRAM ( ( declarations )* statements )+ ) )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:65:10: ( ( declarations )* statements )+ EOF
			{
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:65:10: ( ( declarations )* statements )+
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
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:65:11: ( declarations )* statements
					{
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:65:11: ( declarations )*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( (LA1_0==CONSTANT||LA1_0==VAR) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:65:11: declarations
							{
							pushFollow(FOLLOW_declarations_in_program1055);
							declarations1=declarations();
							state._fsp--;

							stream_declarations.add(declarations1.getTree());
							}
							break;

						default :
							break loop1;
						}
					}

					pushFollow(FOLLOW_statements_in_program1058);
					statements2=statements();
					state._fsp--;

					stream_statements.add(statements2.getTree());
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_program1062);  
			stream_EOF.add(EOF3);

			// AST REWRITE
			// elements: statements, declarations
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 66:13: -> ^( PROGRAM ( ( declarations )* statements )+ )
			{
				// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:66:17: ^( PROGRAM ( ( declarations )* statements )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				if ( !(stream_statements.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_statements.hasNext() ) {
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:66:28: ( declarations )*
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

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:71:1: declarations : declaration SEMICOLON !;
	public final ChocolateParser.declarations_return declarations() throws RecognitionException {
		ChocolateParser.declarations_return retval = new ChocolateParser.declarations_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMICOLON5=null;
		ParserRuleReturnScope declaration4 =null;

		Object SEMICOLON5_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:72:5: ( declaration SEMICOLON !)
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:72:9: declaration SEMICOLON !
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_declaration_in_declarations1125);
			declaration4=declaration();
			state._fsp--;

			adaptor.addChild(root_0, declaration4.getTree());

			SEMICOLON5=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_declarations1127); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:75:1: declaration : ( constant | variable ) ;
	public final ChocolateParser.declaration_return declaration() throws RecognitionException {
		ChocolateParser.declaration_return retval = new ChocolateParser.declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope constant6 =null;
		ParserRuleReturnScope variable7 =null;


		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:76:5: ( ( constant | variable ) )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:76:9: ( constant | variable )
			{
			root_0 = (Object)adaptor.nil();


			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:76:9: ( constant | variable )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==CONSTANT) ) {
				alt3=1;
			}
			else if ( (LA3_0==VAR) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:76:10: constant
					{
					pushFollow(FOLLOW_constant_in_declaration1149);
					constant6=constant();
					state._fsp--;

					adaptor.addChild(root_0, constant6.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:76:21: variable
					{
					pushFollow(FOLLOW_variable_in_declaration1153);
					variable7=variable();
					state._fsp--;

					adaptor.addChild(root_0, variable7.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:79:1: constant : CONSTANT ^ type IDENTIFIER ( ASSIGN ( single_expr | closed_compound_expr ) )? ;
	public final ChocolateParser.constant_return constant() throws RecognitionException {
		ChocolateParser.constant_return retval = new ChocolateParser.constant_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token CONSTANT8=null;
		Token IDENTIFIER10=null;
		Token ASSIGN11=null;
		ParserRuleReturnScope type9 =null;
		ParserRuleReturnScope single_expr12 =null;
		ParserRuleReturnScope closed_compound_expr13 =null;

		Object CONSTANT8_tree=null;
		Object IDENTIFIER10_tree=null;
		Object ASSIGN11_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:80:5: ( CONSTANT ^ type IDENTIFIER ( ASSIGN ( single_expr | closed_compound_expr ) )? )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:80:9: CONSTANT ^ type IDENTIFIER ( ASSIGN ( single_expr | closed_compound_expr ) )?
			{
			root_0 = (Object)adaptor.nil();


			CONSTANT8=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_constant1180); 
			CONSTANT8_tree = (Object)adaptor.create(CONSTANT8);
			root_0 = (Object)adaptor.becomeRoot(CONSTANT8_tree, root_0);

			pushFollow(FOLLOW_type_in_constant1183);
			type9=type();
			state._fsp--;

			adaptor.addChild(root_0, type9.getTree());

			IDENTIFIER10=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant1185); 
			IDENTIFIER10_tree = (Object)adaptor.create(IDENTIFIER10);
			adaptor.addChild(root_0, IDENTIFIER10_tree);

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:80:35: ( ASSIGN ( single_expr | closed_compound_expr ) )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ASSIGN) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:80:36: ASSIGN ( single_expr | closed_compound_expr )
					{
					ASSIGN11=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_constant1188); 
					ASSIGN11_tree = (Object)adaptor.create(ASSIGN11);
					adaptor.addChild(root_0, ASSIGN11_tree);

					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:80:43: ( single_expr | closed_compound_expr )
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==BOOLEAN_OPERATOR||LA4_0==CHAR_OPERATOR||LA4_0==IDENTIFIER||(LA4_0 >= LPAREN && LA4_0 <= MIN)||LA4_0==NOT||LA4_0==NUMBER||LA4_0==PLUS) ) {
						alt4=1;
					}
					else if ( (LA4_0==LCURLY) ) {
						alt4=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 4, 0, input);
						throw nvae;
					}

					switch (alt4) {
						case 1 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:80:44: single_expr
							{
							pushFollow(FOLLOW_single_expr_in_constant1191);
							single_expr12=single_expr();
							state._fsp--;

							adaptor.addChild(root_0, single_expr12.getTree());

							}
							break;
						case 2 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:80:58: closed_compound_expr
							{
							pushFollow(FOLLOW_closed_compound_expr_in_constant1195);
							closed_compound_expr13=closed_compound_expr();
							state._fsp--;

							adaptor.addChild(root_0, closed_compound_expr13.getTree());

							}
							break;

					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:83:1: variable : VAR ^ type IDENTIFIER ( ASSIGN ( single_expr | closed_compound_expr ) )? ;
	public final ChocolateParser.variable_return variable() throws RecognitionException {
		ChocolateParser.variable_return retval = new ChocolateParser.variable_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VAR14=null;
		Token IDENTIFIER16=null;
		Token ASSIGN17=null;
		ParserRuleReturnScope type15 =null;
		ParserRuleReturnScope single_expr18 =null;
		ParserRuleReturnScope closed_compound_expr19 =null;

		Object VAR14_tree=null;
		Object IDENTIFIER16_tree=null;
		Object ASSIGN17_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:84:5: ( VAR ^ type IDENTIFIER ( ASSIGN ( single_expr | closed_compound_expr ) )? )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:84:9: VAR ^ type IDENTIFIER ( ASSIGN ( single_expr | closed_compound_expr ) )?
			{
			root_0 = (Object)adaptor.nil();


			VAR14=(Token)match(input,VAR,FOLLOW_VAR_in_variable1221); 
			VAR14_tree = (Object)adaptor.create(VAR14);
			root_0 = (Object)adaptor.becomeRoot(VAR14_tree, root_0);

			pushFollow(FOLLOW_type_in_variable1224);
			type15=type();
			state._fsp--;

			adaptor.addChild(root_0, type15.getTree());

			IDENTIFIER16=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variable1226); 
			IDENTIFIER16_tree = (Object)adaptor.create(IDENTIFIER16);
			adaptor.addChild(root_0, IDENTIFIER16_tree);

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:84:30: ( ASSIGN ( single_expr | closed_compound_expr ) )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==ASSIGN) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:84:31: ASSIGN ( single_expr | closed_compound_expr )
					{
					ASSIGN17=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_variable1229); 
					ASSIGN17_tree = (Object)adaptor.create(ASSIGN17);
					adaptor.addChild(root_0, ASSIGN17_tree);

					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:84:38: ( single_expr | closed_compound_expr )
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==BOOLEAN_OPERATOR||LA6_0==CHAR_OPERATOR||LA6_0==IDENTIFIER||(LA6_0 >= LPAREN && LA6_0 <= MIN)||LA6_0==NOT||LA6_0==NUMBER||LA6_0==PLUS) ) {
						alt6=1;
					}
					else if ( (LA6_0==LCURLY) ) {
						alt6=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 6, 0, input);
						throw nvae;
					}

					switch (alt6) {
						case 1 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:84:39: single_expr
							{
							pushFollow(FOLLOW_single_expr_in_variable1232);
							single_expr18=single_expr();
							state._fsp--;

							adaptor.addChild(root_0, single_expr18.getTree());

							}
							break;
						case 2 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:84:53: closed_compound_expr
							{
							pushFollow(FOLLOW_closed_compound_expr_in_variable1236);
							closed_compound_expr19=closed_compound_expr();
							state._fsp--;

							adaptor.addChild(root_0, closed_compound_expr19.getTree());

							}
							break;

					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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


	public static class statements_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statements"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:88:1: statements : statement SEMICOLON !;
	public final ChocolateParser.statements_return statements() throws RecognitionException {
		ChocolateParser.statements_return retval = new ChocolateParser.statements_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMICOLON21=null;
		ParserRuleReturnScope statement20 =null;

		Object SEMICOLON21_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:89:5: ( statement SEMICOLON !)
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:89:7: statement SEMICOLON !
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_statement_in_statements1260);
			statement20=statement();
			state._fsp--;

			adaptor.addChild(root_0, statement20.getTree());

			SEMICOLON21=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statements1262); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:92:1: statement : ( read | print | assign | ifelsethen );
	public final ChocolateParser.statement_return statement() throws RecognitionException {
		ChocolateParser.statement_return retval = new ChocolateParser.statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope read22 =null;
		ParserRuleReturnScope print23 =null;
		ParserRuleReturnScope assign24 =null;
		ParserRuleReturnScope ifelsethen25 =null;


		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:93:5: ( read | print | assign | ifelsethen )
			int alt8=4;
			switch ( input.LA(1) ) {
			case READ:
				{
				alt8=1;
				}
				break;
			case PRINT:
				{
				alt8=2;
				}
				break;
			case IDENTIFIER:
				{
				alt8=3;
				}
				break;
			case IF:
				{
				alt8=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:93:9: read
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_read_in_statement1286);
					read22=read();
					state._fsp--;

					adaptor.addChild(root_0, read22.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:94:9: print
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_print_in_statement1297);
					print23=print();
					state._fsp--;

					adaptor.addChild(root_0, print23.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:95:9: assign
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_assign_in_statement1308);
					assign24=assign();
					state._fsp--;

					adaptor.addChild(root_0, assign24.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:96:9: ifelsethen
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_ifelsethen_in_statement1321);
					ifelsethen25=ifelsethen();
					state._fsp--;

					adaptor.addChild(root_0, ifelsethen25.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:99:1: read : READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !;
	public final ChocolateParser.read_return read() throws RecognitionException {
		ChocolateParser.read_return retval = new ChocolateParser.read_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token READ26=null;
		Token LPAREN27=null;
		Token IDENTIFIER28=null;
		Token COMMA29=null;
		Token IDENTIFIER30=null;
		Token RPAREN31=null;

		Object READ26_tree=null;
		Object LPAREN27_tree=null;
		Object IDENTIFIER28_tree=null;
		Object COMMA29_tree=null;
		Object IDENTIFIER30_tree=null;
		Object RPAREN31_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:100:5: ( READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !)
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:100:9: READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			READ26=(Token)match(input,READ,FOLLOW_READ_in_read1340); 
			READ26_tree = (Object)adaptor.create(READ26);
			root_0 = (Object)adaptor.becomeRoot(READ26_tree, root_0);

			LPAREN27=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_read1343); 
			IDENTIFIER28=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read1346); 
			IDENTIFIER28_tree = (Object)adaptor.create(IDENTIFIER28);
			adaptor.addChild(root_0, IDENTIFIER28_tree);

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:100:34: ( COMMA ! IDENTIFIER )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==COMMA) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:100:35: COMMA ! IDENTIFIER
					{
					COMMA29=(Token)match(input,COMMA,FOLLOW_COMMA_in_read1349); 
					IDENTIFIER30=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read1352); 
					IDENTIFIER30_tree = (Object)adaptor.create(IDENTIFIER30);
					adaptor.addChild(root_0, IDENTIFIER30_tree);

					}
					break;

				default :
					break loop9;
				}
			}

			RPAREN31=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_read1356); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:103:1: assign : IDENTIFIER ASSIGN ^ ( options {greedy=true; } : assign2 ) ;
	public final ChocolateParser.assign_return assign() throws RecognitionException {
		ChocolateParser.assign_return retval = new ChocolateParser.assign_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER32=null;
		Token ASSIGN33=null;
		ParserRuleReturnScope assign234 =null;

		Object IDENTIFIER32_tree=null;
		Object ASSIGN33_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:104:5: ( IDENTIFIER ASSIGN ^ ( options {greedy=true; } : assign2 ) )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:104:9: IDENTIFIER ASSIGN ^ ( options {greedy=true; } : assign2 )
			{
			root_0 = (Object)adaptor.nil();


			IDENTIFIER32=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assign1376); 
			IDENTIFIER32_tree = (Object)adaptor.create(IDENTIFIER32);
			adaptor.addChild(root_0, IDENTIFIER32_tree);

			ASSIGN33=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign1378); 
			ASSIGN33_tree = (Object)adaptor.create(ASSIGN33);
			root_0 = (Object)adaptor.becomeRoot(ASSIGN33_tree, root_0);

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:104:28: ( options {greedy=true; } : assign2 )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:104:53: assign2
			{
			pushFollow(FOLLOW_assign2_in_assign1391);
			assign234=assign2();
			state._fsp--;

			adaptor.addChild(root_0, assign234.getTree());

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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


	public static class assign2_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assign2"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:107:1: assign2 : ( IDENTIFIER ( ASSIGN ^ assign2 )? | single_expr | closed_compound_expr );
	public final ChocolateParser.assign2_return assign2() throws RecognitionException {
		ChocolateParser.assign2_return retval = new ChocolateParser.assign2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER35=null;
		Token ASSIGN36=null;
		ParserRuleReturnScope assign237 =null;
		ParserRuleReturnScope single_expr38 =null;
		ParserRuleReturnScope closed_compound_expr39 =null;

		Object IDENTIFIER35_tree=null;
		Object ASSIGN36_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:108:5: ( IDENTIFIER ( ASSIGN ^ assign2 )? | single_expr | closed_compound_expr )
			int alt11=3;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt11=1;
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
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:108:9: IDENTIFIER ( ASSIGN ^ assign2 )?
					{
					root_0 = (Object)adaptor.nil();


					IDENTIFIER35=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assign21415); 
					IDENTIFIER35_tree = (Object)adaptor.create(IDENTIFIER35);
					adaptor.addChild(root_0, IDENTIFIER35_tree);

					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:108:20: ( ASSIGN ^ assign2 )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==ASSIGN) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:108:21: ASSIGN ^ assign2
							{
							ASSIGN36=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign21418); 
							ASSIGN36_tree = (Object)adaptor.create(ASSIGN36);
							root_0 = (Object)adaptor.becomeRoot(ASSIGN36_tree, root_0);

							pushFollow(FOLLOW_assign2_in_assign21421);
							assign237=assign2();
							state._fsp--;

							adaptor.addChild(root_0, assign237.getTree());

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:109:9: single_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_single_expr_in_assign21433);
					single_expr38=single_expr();
					state._fsp--;

					adaptor.addChild(root_0, single_expr38.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:110:9: closed_compound_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_closed_compound_expr_in_assign21443);
					closed_compound_expr39=closed_compound_expr();
					state._fsp--;

					adaptor.addChild(root_0, closed_compound_expr39.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// $ANTLR end "assign2"


	public static class print_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "print"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:113:1: print : PRINT ^ LPAREN ! ( unclosed_compound_expr | string ) ( COMMA ! ( unclosed_compound_expr | string ) )* RPAREN !;
	public final ChocolateParser.print_return print() throws RecognitionException {
		ChocolateParser.print_return retval = new ChocolateParser.print_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PRINT40=null;
		Token LPAREN41=null;
		Token COMMA44=null;
		Token RPAREN47=null;
		ParserRuleReturnScope unclosed_compound_expr42 =null;
		ParserRuleReturnScope string43 =null;
		ParserRuleReturnScope unclosed_compound_expr45 =null;
		ParserRuleReturnScope string46 =null;

		Object PRINT40_tree=null;
		Object LPAREN41_tree=null;
		Object COMMA44_tree=null;
		Object RPAREN47_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:114:5: ( PRINT ^ LPAREN ! ( unclosed_compound_expr | string ) ( COMMA ! ( unclosed_compound_expr | string ) )* RPAREN !)
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:114:9: PRINT ^ LPAREN ! ( unclosed_compound_expr | string ) ( COMMA ! ( unclosed_compound_expr | string ) )* RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			PRINT40=(Token)match(input,PRINT,FOLLOW_PRINT_in_print1466); 
			PRINT40_tree = (Object)adaptor.create(PRINT40);
			root_0 = (Object)adaptor.becomeRoot(PRINT40_tree, root_0);

			LPAREN41=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_print1469); 
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:114:24: ( unclosed_compound_expr | string )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==CONSTANT||(LA12_0 >= IDENTIFIER && LA12_0 <= IF)||LA12_0==PRINT||LA12_0==READ||LA12_0==VAR) ) {
				alt12=1;
			}
			else if ( (LA12_0==DQUOTATION) ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:114:25: unclosed_compound_expr
					{
					pushFollow(FOLLOW_unclosed_compound_expr_in_print1473);
					unclosed_compound_expr42=unclosed_compound_expr();
					state._fsp--;

					adaptor.addChild(root_0, unclosed_compound_expr42.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:114:50: string
					{
					pushFollow(FOLLOW_string_in_print1477);
					string43=string();
					state._fsp--;

					adaptor.addChild(root_0, string43.getTree());

					}
					break;

			}

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:114:58: ( COMMA ! ( unclosed_compound_expr | string ) )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==COMMA) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:114:59: COMMA ! ( unclosed_compound_expr | string )
					{
					COMMA44=(Token)match(input,COMMA,FOLLOW_COMMA_in_print1481); 
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:114:66: ( unclosed_compound_expr | string )
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==CONSTANT||(LA13_0 >= IDENTIFIER && LA13_0 <= IF)||LA13_0==PRINT||LA13_0==READ||LA13_0==VAR) ) {
						alt13=1;
					}
					else if ( (LA13_0==DQUOTATION) ) {
						alt13=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 13, 0, input);
						throw nvae;
					}

					switch (alt13) {
						case 1 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:114:67: unclosed_compound_expr
							{
							pushFollow(FOLLOW_unclosed_compound_expr_in_print1485);
							unclosed_compound_expr45=unclosed_compound_expr();
							state._fsp--;

							adaptor.addChild(root_0, unclosed_compound_expr45.getTree());

							}
							break;
						case 2 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:114:92: string
							{
							pushFollow(FOLLOW_string_in_print1489);
							string46=string();
							state._fsp--;

							adaptor.addChild(root_0, string46.getTree());

							}
							break;

					}

					}
					break;

				default :
					break loop14;
				}
			}

			RPAREN47=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_print1494); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:118:1: compound_expr : ( unclosed_compound_expr | closed_compound_expr );
	public final ChocolateParser.compound_expr_return compound_expr() throws RecognitionException {
		ChocolateParser.compound_expr_return retval = new ChocolateParser.compound_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope unclosed_compound_expr48 =null;
		ParserRuleReturnScope closed_compound_expr49 =null;


		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:119:5: ( unclosed_compound_expr | closed_compound_expr )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==CONSTANT||(LA15_0 >= IDENTIFIER && LA15_0 <= IF)||LA15_0==PRINT||LA15_0==READ||LA15_0==VAR) ) {
				alt15=1;
			}
			else if ( (LA15_0==LCURLY) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:119:9: unclosed_compound_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_unclosed_compound_expr_in_compound_expr1519);
					unclosed_compound_expr48=unclosed_compound_expr();
					state._fsp--;

					adaptor.addChild(root_0, unclosed_compound_expr48.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:120:9: closed_compound_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_closed_compound_expr_in_compound_expr1529);
					closed_compound_expr49=closed_compound_expr();
					state._fsp--;

					adaptor.addChild(root_0, closed_compound_expr49.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:123:1: unclosed_compound_expr : ( ( declarations )* statements )+ ;
	public final ChocolateParser.unclosed_compound_expr_return unclosed_compound_expr() throws RecognitionException {
		ChocolateParser.unclosed_compound_expr_return retval = new ChocolateParser.unclosed_compound_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope declarations50 =null;
		ParserRuleReturnScope statements51 =null;


		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:124:5: ( ( ( declarations )* statements )+ )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:124:9: ( ( declarations )* statements )+
			{
			root_0 = (Object)adaptor.nil();


			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:124:9: ( ( declarations )* statements )+
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
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:124:10: ( declarations )* statements
					{
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:124:10: ( declarations )*
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( (LA16_0==CONSTANT||LA16_0==VAR) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:124:10: declarations
							{
							pushFollow(FOLLOW_declarations_in_unclosed_compound_expr1553);
							declarations50=declarations();
							state._fsp--;

							adaptor.addChild(root_0, declarations50.getTree());

							}
							break;

						default :
							break loop16;
						}
					}

					pushFollow(FOLLOW_statements_in_unclosed_compound_expr1556);
					statements51=statements();
					state._fsp--;

					adaptor.addChild(root_0, statements51.getTree());

					}
					break;

				default :
					if ( cnt17 >= 1 ) break loop17;
					EarlyExitException eee = new EarlyExitException(17, input);
					throw eee;
				}
				cnt17++;
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:127:1: closed_compound_expr : LCURLY ! ( ( declarations )* statements )+ RCURLY !;
	public final ChocolateParser.closed_compound_expr_return closed_compound_expr() throws RecognitionException {
		ChocolateParser.closed_compound_expr_return retval = new ChocolateParser.closed_compound_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LCURLY52=null;
		Token RCURLY55=null;
		ParserRuleReturnScope declarations53 =null;
		ParserRuleReturnScope statements54 =null;

		Object LCURLY52_tree=null;
		Object RCURLY55_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:128:5: ( LCURLY ! ( ( declarations )* statements )+ RCURLY !)
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:128:9: LCURLY ! ( ( declarations )* statements )+ RCURLY !
			{
			root_0 = (Object)adaptor.nil();


			LCURLY52=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_closed_compound_expr1578); 
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:128:17: ( ( declarations )* statements )+
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
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:128:18: ( declarations )* statements
					{
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:128:18: ( declarations )*
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( (LA18_0==CONSTANT||LA18_0==VAR) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:128:18: declarations
							{
							pushFollow(FOLLOW_declarations_in_closed_compound_expr1582);
							declarations53=declarations();
							state._fsp--;

							adaptor.addChild(root_0, declarations53.getTree());

							}
							break;

						default :
							break loop18;
						}
					}

					pushFollow(FOLLOW_statements_in_closed_compound_expr1585);
					statements54=statements();
					state._fsp--;

					adaptor.addChild(root_0, statements54.getTree());

					}
					break;

				default :
					if ( cnt19 >= 1 ) break loop19;
					EarlyExitException eee = new EarlyExitException(19, input);
					throw eee;
				}
				cnt19++;
			}

			RCURLY55=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_closed_compound_expr1589); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:131:1: single_expr : arithmetic ;
	public final ChocolateParser.single_expr_return single_expr() throws RecognitionException {
		ChocolateParser.single_expr_return retval = new ChocolateParser.single_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope arithmetic56 =null;


		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:132:5: ( arithmetic )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:132:9: arithmetic
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_in_single_expr1613);
			arithmetic56=arithmetic();
			state._fsp--;

			adaptor.addChild(root_0, arithmetic56.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:135:1: arithmetic : arith2 ( OR ^ arith2 )* ;
	public final ChocolateParser.arithmetic_return arithmetic() throws RecognitionException {
		ChocolateParser.arithmetic_return retval = new ChocolateParser.arithmetic_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token OR58=null;
		ParserRuleReturnScope arith257 =null;
		ParserRuleReturnScope arith259 =null;

		Object OR58_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:136:5: ( arith2 ( OR ^ arith2 )* )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:136:9: arith2 ( OR ^ arith2 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arith2_in_arithmetic1632);
			arith257=arith2();
			state._fsp--;

			adaptor.addChild(root_0, arith257.getTree());

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:136:16: ( OR ^ arith2 )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==OR) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:136:17: OR ^ arith2
					{
					OR58=(Token)match(input,OR,FOLLOW_OR_in_arithmetic1635); 
					OR58_tree = (Object)adaptor.create(OR58);
					root_0 = (Object)adaptor.becomeRoot(OR58_tree, root_0);

					pushFollow(FOLLOW_arith2_in_arithmetic1638);
					arith259=arith2();
					state._fsp--;

					adaptor.addChild(root_0, arith259.getTree());

					}
					break;

				default :
					break loop20;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:139:1: arith2 : arith3 ( AND ^ arith3 )* ;
	public final ChocolateParser.arith2_return arith2() throws RecognitionException {
		ChocolateParser.arith2_return retval = new ChocolateParser.arith2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AND61=null;
		ParserRuleReturnScope arith360 =null;
		ParserRuleReturnScope arith362 =null;

		Object AND61_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:140:5: ( arith3 ( AND ^ arith3 )* )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:140:9: arith3 ( AND ^ arith3 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arith3_in_arith21663);
			arith360=arith3();
			state._fsp--;

			adaptor.addChild(root_0, arith360.getTree());

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:140:16: ( AND ^ arith3 )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==AND) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:140:17: AND ^ arith3
					{
					AND61=(Token)match(input,AND,FOLLOW_AND_in_arith21666); 
					AND61_tree = (Object)adaptor.create(AND61);
					root_0 = (Object)adaptor.becomeRoot(AND61_tree, root_0);

					pushFollow(FOLLOW_arith3_in_arith21669);
					arith362=arith3();
					state._fsp--;

					adaptor.addChild(root_0, arith362.getTree());

					}
					break;

				default :
					break loop21;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:143:1: arith3 : arith4 ( ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^) arith4 )* ;
	public final ChocolateParser.arith3_return arith3() throws RecognitionException {
		ChocolateParser.arith3_return retval = new ChocolateParser.arith3_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LESS64=null;
		Token LESSEQ65=null;
		Token GREATEQ66=null;
		Token GREAT67=null;
		Token EQ68=null;
		Token NOTEQ69=null;
		ParserRuleReturnScope arith463 =null;
		ParserRuleReturnScope arith470 =null;

		Object LESS64_tree=null;
		Object LESSEQ65_tree=null;
		Object GREATEQ66_tree=null;
		Object GREAT67_tree=null;
		Object EQ68_tree=null;
		Object NOTEQ69_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:144:5: ( arith4 ( ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^) arith4 )* )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:144:9: arith4 ( ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^) arith4 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arith4_in_arith31694);
			arith463=arith4();
			state._fsp--;

			adaptor.addChild(root_0, arith463.getTree());

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:144:16: ( ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^) arith4 )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==EQ||(LA23_0 >= GREAT && LA23_0 <= GREATEQ)||(LA23_0 >= LESS && LA23_0 <= LESSEQ)||LA23_0==NOTEQ) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:144:17: ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^) arith4
					{
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:144:17: ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^)
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
						NoViableAltException nvae =
							new NoViableAltException("", 22, 0, input);
						throw nvae;
					}
					switch (alt22) {
						case 1 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:144:18: LESS ^
							{
							LESS64=(Token)match(input,LESS,FOLLOW_LESS_in_arith31698); 
							LESS64_tree = (Object)adaptor.create(LESS64);
							root_0 = (Object)adaptor.becomeRoot(LESS64_tree, root_0);

							}
							break;
						case 2 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:144:26: LESSEQ ^
							{
							LESSEQ65=(Token)match(input,LESSEQ,FOLLOW_LESSEQ_in_arith31703); 
							LESSEQ65_tree = (Object)adaptor.create(LESSEQ65);
							root_0 = (Object)adaptor.becomeRoot(LESSEQ65_tree, root_0);

							}
							break;
						case 3 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:144:36: GREATEQ ^
							{
							GREATEQ66=(Token)match(input,GREATEQ,FOLLOW_GREATEQ_in_arith31708); 
							GREATEQ66_tree = (Object)adaptor.create(GREATEQ66);
							root_0 = (Object)adaptor.becomeRoot(GREATEQ66_tree, root_0);

							}
							break;
						case 4 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:144:47: GREAT ^
							{
							GREAT67=(Token)match(input,GREAT,FOLLOW_GREAT_in_arith31713); 
							GREAT67_tree = (Object)adaptor.create(GREAT67);
							root_0 = (Object)adaptor.becomeRoot(GREAT67_tree, root_0);

							}
							break;
						case 5 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:144:56: EQ ^
							{
							EQ68=(Token)match(input,EQ,FOLLOW_EQ_in_arith31718); 
							EQ68_tree = (Object)adaptor.create(EQ68);
							root_0 = (Object)adaptor.becomeRoot(EQ68_tree, root_0);

							}
							break;
						case 6 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:144:62: NOTEQ ^
							{
							NOTEQ69=(Token)match(input,NOTEQ,FOLLOW_NOTEQ_in_arith31723); 
							NOTEQ69_tree = (Object)adaptor.create(NOTEQ69);
							root_0 = (Object)adaptor.becomeRoot(NOTEQ69_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_arith4_in_arith31727);
					arith470=arith4();
					state._fsp--;

					adaptor.addChild(root_0, arith470.getTree());

					}
					break;

				default :
					break loop23;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:147:1: arith4 : arith5 ( ( PLUS ^| MIN ^) arith5 )* ;
	public final ChocolateParser.arith4_return arith4() throws RecognitionException {
		ChocolateParser.arith4_return retval = new ChocolateParser.arith4_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS72=null;
		Token MIN73=null;
		ParserRuleReturnScope arith571 =null;
		ParserRuleReturnScope arith574 =null;

		Object PLUS72_tree=null;
		Object MIN73_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:148:5: ( arith5 ( ( PLUS ^| MIN ^) arith5 )* )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:148:9: arith5 ( ( PLUS ^| MIN ^) arith5 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arith5_in_arith41757);
			arith571=arith5();
			state._fsp--;

			adaptor.addChild(root_0, arith571.getTree());

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:148:16: ( ( PLUS ^| MIN ^) arith5 )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==MIN||LA25_0==PLUS) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:148:17: ( PLUS ^| MIN ^) arith5
					{
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:148:17: ( PLUS ^| MIN ^)
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==PLUS) ) {
						alt24=1;
					}
					else if ( (LA24_0==MIN) ) {
						alt24=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 24, 0, input);
						throw nvae;
					}

					switch (alt24) {
						case 1 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:148:18: PLUS ^
							{
							PLUS72=(Token)match(input,PLUS,FOLLOW_PLUS_in_arith41761); 
							PLUS72_tree = (Object)adaptor.create(PLUS72);
							root_0 = (Object)adaptor.becomeRoot(PLUS72_tree, root_0);

							}
							break;
						case 2 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:148:26: MIN ^
							{
							MIN73=(Token)match(input,MIN,FOLLOW_MIN_in_arith41766); 
							MIN73_tree = (Object)adaptor.create(MIN73);
							root_0 = (Object)adaptor.becomeRoot(MIN73_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_arith5_in_arith41770);
					arith574=arith5();
					state._fsp--;

					adaptor.addChild(root_0, arith574.getTree());

					}
					break;

				default :
					break loop25;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:151:1: arith5 : arith6 ( ( MULT ^| DIV ^| MOD ^) arith6 )* ;
	public final ChocolateParser.arith5_return arith5() throws RecognitionException {
		ChocolateParser.arith5_return retval = new ChocolateParser.arith5_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MULT76=null;
		Token DIV77=null;
		Token MOD78=null;
		ParserRuleReturnScope arith675 =null;
		ParserRuleReturnScope arith679 =null;

		Object MULT76_tree=null;
		Object DIV77_tree=null;
		Object MOD78_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:152:5: ( arith6 ( ( MULT ^| DIV ^| MOD ^) arith6 )* )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:152:9: arith6 ( ( MULT ^| DIV ^| MOD ^) arith6 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arith6_in_arith51801);
			arith675=arith6();
			state._fsp--;

			adaptor.addChild(root_0, arith675.getTree());

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:152:16: ( ( MULT ^| DIV ^| MOD ^) arith6 )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==DIV||(LA27_0 >= MOD && LA27_0 <= MULT)) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:152:17: ( MULT ^| DIV ^| MOD ^) arith6
					{
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:152:17: ( MULT ^| DIV ^| MOD ^)
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
						NoViableAltException nvae =
							new NoViableAltException("", 26, 0, input);
						throw nvae;
					}
					switch (alt26) {
						case 1 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:152:18: MULT ^
							{
							MULT76=(Token)match(input,MULT,FOLLOW_MULT_in_arith51805); 
							MULT76_tree = (Object)adaptor.create(MULT76);
							root_0 = (Object)adaptor.becomeRoot(MULT76_tree, root_0);

							}
							break;
						case 2 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:152:26: DIV ^
							{
							DIV77=(Token)match(input,DIV,FOLLOW_DIV_in_arith51810); 
							DIV77_tree = (Object)adaptor.create(DIV77);
							root_0 = (Object)adaptor.becomeRoot(DIV77_tree, root_0);

							}
							break;
						case 3 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:152:33: MOD ^
							{
							MOD78=(Token)match(input,MOD,FOLLOW_MOD_in_arith51815); 
							MOD78_tree = (Object)adaptor.create(MOD78);
							root_0 = (Object)adaptor.becomeRoot(MOD78_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_arith6_in_arith51819);
					arith679=arith6();
					state._fsp--;

					adaptor.addChild(root_0, arith679.getTree());

					}
					break;

				default :
					break loop27;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:155:1: arith6 : ( ( PLUS ^| MIN ^| NOT ^)? operand ) ;
	public final ChocolateParser.arith6_return arith6() throws RecognitionException {
		ChocolateParser.arith6_return retval = new ChocolateParser.arith6_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS80=null;
		Token MIN81=null;
		Token NOT82=null;
		ParserRuleReturnScope operand83 =null;

		Object PLUS80_tree=null;
		Object MIN81_tree=null;
		Object NOT82_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:156:5: ( ( ( PLUS ^| MIN ^| NOT ^)? operand ) )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:156:9: ( ( PLUS ^| MIN ^| NOT ^)? operand )
			{
			root_0 = (Object)adaptor.nil();


			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:156:9: ( ( PLUS ^| MIN ^| NOT ^)? operand )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:156:10: ( PLUS ^| MIN ^| NOT ^)? operand
			{
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:156:10: ( PLUS ^| MIN ^| NOT ^)?
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
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:156:11: PLUS ^
					{
					PLUS80=(Token)match(input,PLUS,FOLLOW_PLUS_in_arith61854); 
					PLUS80_tree = (Object)adaptor.create(PLUS80);
					root_0 = (Object)adaptor.becomeRoot(PLUS80_tree, root_0);

					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:156:19: MIN ^
					{
					MIN81=(Token)match(input,MIN,FOLLOW_MIN_in_arith61859); 
					MIN81_tree = (Object)adaptor.create(MIN81);
					root_0 = (Object)adaptor.becomeRoot(MIN81_tree, root_0);

					}
					break;
				case 3 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:156:26: NOT ^
					{
					NOT82=(Token)match(input,NOT,FOLLOW_NOT_in_arith61864); 
					NOT82_tree = (Object)adaptor.create(NOT82);
					root_0 = (Object)adaptor.becomeRoot(NOT82_tree, root_0);

					}
					break;

			}

			pushFollow(FOLLOW_operand_in_arith61869);
			operand83=operand();
			state._fsp--;

			adaptor.addChild(root_0, operand83.getTree());

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:159:1: ifelsethen : IF ^ single_expr THEN ! LCURLY ! unclosed_compound_expr RCURLY ! ( ELSE ! LCURLY ! unclosed_compound_expr RCURLY !)? ;
	public final ChocolateParser.ifelsethen_return ifelsethen() throws RecognitionException {
		ChocolateParser.ifelsethen_return retval = new ChocolateParser.ifelsethen_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IF84=null;
		Token THEN86=null;
		Token LCURLY87=null;
		Token RCURLY89=null;
		Token ELSE90=null;
		Token LCURLY91=null;
		Token RCURLY93=null;
		ParserRuleReturnScope single_expr85 =null;
		ParserRuleReturnScope unclosed_compound_expr88 =null;
		ParserRuleReturnScope unclosed_compound_expr92 =null;

		Object IF84_tree=null;
		Object THEN86_tree=null;
		Object LCURLY87_tree=null;
		Object RCURLY89_tree=null;
		Object ELSE90_tree=null;
		Object LCURLY91_tree=null;
		Object RCURLY93_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:160:5: ( IF ^ single_expr THEN ! LCURLY ! unclosed_compound_expr RCURLY ! ( ELSE ! LCURLY ! unclosed_compound_expr RCURLY !)? )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:160:9: IF ^ single_expr THEN ! LCURLY ! unclosed_compound_expr RCURLY ! ( ELSE ! LCURLY ! unclosed_compound_expr RCURLY !)?
			{
			root_0 = (Object)adaptor.nil();


			IF84=(Token)match(input,IF,FOLLOW_IF_in_ifelsethen1893); 
			IF84_tree = (Object)adaptor.create(IF84);
			root_0 = (Object)adaptor.becomeRoot(IF84_tree, root_0);

			pushFollow(FOLLOW_single_expr_in_ifelsethen1896);
			single_expr85=single_expr();
			state._fsp--;

			adaptor.addChild(root_0, single_expr85.getTree());

			THEN86=(Token)match(input,THEN,FOLLOW_THEN_in_ifelsethen1898); 
			LCURLY87=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_ifelsethen1901); 
			pushFollow(FOLLOW_unclosed_compound_expr_in_ifelsethen1904);
			unclosed_compound_expr88=unclosed_compound_expr();
			state._fsp--;

			adaptor.addChild(root_0, unclosed_compound_expr88.getTree());

			RCURLY89=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_ifelsethen1906); 
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:160:70: ( ELSE ! LCURLY ! unclosed_compound_expr RCURLY !)?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==ELSE) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:160:71: ELSE ! LCURLY ! unclosed_compound_expr RCURLY !
					{
					ELSE90=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifelsethen1910); 
					LCURLY91=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_ifelsethen1913); 
					pushFollow(FOLLOW_unclosed_compound_expr_in_ifelsethen1916);
					unclosed_compound_expr92=unclosed_compound_expr();
					state._fsp--;

					adaptor.addChild(root_0, unclosed_compound_expr92.getTree());

					RCURLY93=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_ifelsethen1918); 
					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:164:1: operand : ( IDENTIFIER | NUMBER | LPAREN ! single_expr RPAREN !| BOOLEAN_OPERATOR | CHAR_OPERATOR );
	public final ChocolateParser.operand_return operand() throws RecognitionException {
		ChocolateParser.operand_return retval = new ChocolateParser.operand_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER94=null;
		Token NUMBER95=null;
		Token LPAREN96=null;
		Token RPAREN98=null;
		Token BOOLEAN_OPERATOR99=null;
		Token CHAR_OPERATOR100=null;
		ParserRuleReturnScope single_expr97 =null;

		Object IDENTIFIER94_tree=null;
		Object NUMBER95_tree=null;
		Object LPAREN96_tree=null;
		Object RPAREN98_tree=null;
		Object BOOLEAN_OPERATOR99_tree=null;
		Object CHAR_OPERATOR100_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:165:5: ( IDENTIFIER | NUMBER | LPAREN ! single_expr RPAREN !| BOOLEAN_OPERATOR | CHAR_OPERATOR )
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
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}
			switch (alt30) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:165:9: IDENTIFIER
					{
					root_0 = (Object)adaptor.nil();


					IDENTIFIER94=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand1941); 
					IDENTIFIER94_tree = (Object)adaptor.create(IDENTIFIER94);
					adaptor.addChild(root_0, IDENTIFIER94_tree);

					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:166:9: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER95=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_operand1951); 
					NUMBER95_tree = (Object)adaptor.create(NUMBER95);
					adaptor.addChild(root_0, NUMBER95_tree);

					}
					break;
				case 3 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:167:9: LPAREN ! single_expr RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					LPAREN96=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operand1961); 
					pushFollow(FOLLOW_single_expr_in_operand1964);
					single_expr97=single_expr();
					state._fsp--;

					adaptor.addChild(root_0, single_expr97.getTree());

					RPAREN98=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operand1966); 
					}
					break;
				case 4 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:168:9: BOOLEAN_OPERATOR
					{
					root_0 = (Object)adaptor.nil();


					BOOLEAN_OPERATOR99=(Token)match(input,BOOLEAN_OPERATOR,FOLLOW_BOOLEAN_OPERATOR_in_operand1977); 
					BOOLEAN_OPERATOR99_tree = (Object)adaptor.create(BOOLEAN_OPERATOR99);
					adaptor.addChild(root_0, BOOLEAN_OPERATOR99_tree);

					}
					break;
				case 5 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:169:9: CHAR_OPERATOR
					{
					root_0 = (Object)adaptor.nil();


					CHAR_OPERATOR100=(Token)match(input,CHAR_OPERATOR,FOLLOW_CHAR_OPERATOR_in_operand1987); 
					CHAR_OPERATOR100_tree = (Object)adaptor.create(CHAR_OPERATOR100);
					adaptor.addChild(root_0, CHAR_OPERATOR100_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:172:1: type : ( INTEGER | CHAR | BOOLEAN );
	public final ChocolateParser.type_return type() throws RecognitionException {
		ChocolateParser.type_return retval = new ChocolateParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set101=null;

		Object set101_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:173:5: ( INTEGER | CHAR | BOOLEAN )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:
			{
			root_0 = (Object)adaptor.nil();


			set101=input.LT(1);
			if ( input.LA(1)==BOOLEAN||input.LA(1)==CHAR||input.LA(1)==INTEGER ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set101));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:176:1: string : DQUOTATION ! ( graphic )* DQUOTATION !;
	public final ChocolateParser.string_return string() throws RecognitionException {
		ChocolateParser.string_return retval = new ChocolateParser.string_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token DQUOTATION102=null;
		Token DQUOTATION104=null;
		ParserRuleReturnScope graphic103 =null;

		Object DQUOTATION102_tree=null;
		Object DQUOTATION104_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:177:5: ( DQUOTATION ! ( graphic )* DQUOTATION !)
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:177:9: DQUOTATION ! ( graphic )* DQUOTATION !
			{
			root_0 = (Object)adaptor.nil();


			DQUOTATION102=(Token)match(input,DQUOTATION,FOLLOW_DQUOTATION_in_string2037); 
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:177:21: ( graphic )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==DIGIT||LA31_0==LETTER) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:177:21: graphic
					{
					pushFollow(FOLLOW_graphic_in_string2040);
					graphic103=graphic();
					state._fsp--;

					adaptor.addChild(root_0, graphic103.getTree());

					}
					break;

				default :
					break loop31;
				}
			}

			DQUOTATION104=(Token)match(input,DQUOTATION,FOLLOW_DQUOTATION_in_string2043); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:180:1: graphic : ( LETTER | DIGIT );
	public final ChocolateParser.graphic_return graphic() throws RecognitionException {
		ChocolateParser.graphic_return retval = new ChocolateParser.graphic_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set105=null;

		Object set105_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:181:5: ( LETTER | DIGIT )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:
			{
			root_0 = (Object)adaptor.nil();


			set105=input.LT(1);
			if ( input.LA(1)==DIGIT||input.LA(1)==LETTER ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set105));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

	// Delegated rules



	public static final BitSet FOLLOW_declarations_in_program1055 = new BitSet(new long[]{0x0004110001804000L});
	public static final BitSet FOLLOW_statements_in_program1058 = new BitSet(new long[]{0x0004110001804000L});
	public static final BitSet FOLLOW_EOF_in_program1062 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_declarations1125 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_declarations1127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_declaration1149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_declaration1153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONSTANT_in_constant1180 = new BitSet(new long[]{0x0000000002000280L});
	public static final BitSet FOLLOW_type_in_constant1183 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_constant1185 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_ASSIGN_in_constant1188 = new BitSet(new long[]{0x000000A984800500L});
	public static final BitSet FOLLOW_single_expr_in_constant1191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_closed_compound_expr_in_constant1195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_variable1221 = new BitSet(new long[]{0x0000000002000280L});
	public static final BitSet FOLLOW_type_in_variable1224 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_variable1226 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_ASSIGN_in_variable1229 = new BitSet(new long[]{0x000000A984800500L});
	public static final BitSet FOLLOW_single_expr_in_variable1232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_closed_compound_expr_in_variable1236 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statements1260 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_statements1262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_in_statement1286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_in_statement1297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assign_in_statement1308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifelsethen_in_statement1321 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read1340 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_LPAREN_in_read1343 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read1346 = new BitSet(new long[]{0x0000200000001000L});
	public static final BitSet FOLLOW_COMMA_in_read1349 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read1352 = new BitSet(new long[]{0x0000200000001000L});
	public static final BitSet FOLLOW_RPAREN_in_read1356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_assign1376 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_assign1378 = new BitSet(new long[]{0x000000A984800500L});
	public static final BitSet FOLLOW_assign2_in_assign1391 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_assign21415 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_ASSIGN_in_assign21418 = new BitSet(new long[]{0x000000A984800500L});
	public static final BitSet FOLLOW_assign2_in_assign21421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_single_expr_in_assign21433 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_closed_compound_expr_in_assign21443 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print1466 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_LPAREN_in_print1469 = new BitSet(new long[]{0x0004110001824000L});
	public static final BitSet FOLLOW_unclosed_compound_expr_in_print1473 = new BitSet(new long[]{0x0000200000001000L});
	public static final BitSet FOLLOW_string_in_print1477 = new BitSet(new long[]{0x0000200000001000L});
	public static final BitSet FOLLOW_COMMA_in_print1481 = new BitSet(new long[]{0x0004110001824000L});
	public static final BitSet FOLLOW_unclosed_compound_expr_in_print1485 = new BitSet(new long[]{0x0000200000001000L});
	public static final BitSet FOLLOW_string_in_print1489 = new BitSet(new long[]{0x0000200000001000L});
	public static final BitSet FOLLOW_RPAREN_in_print1494 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unclosed_compound_expr_in_compound_expr1519 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_closed_compound_expr_in_compound_expr1529 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declarations_in_unclosed_compound_expr1553 = new BitSet(new long[]{0x0004110001804000L});
	public static final BitSet FOLLOW_statements_in_unclosed_compound_expr1556 = new BitSet(new long[]{0x0004110001804002L});
	public static final BitSet FOLLOW_LCURLY_in_closed_compound_expr1578 = new BitSet(new long[]{0x0004110001804000L});
	public static final BitSet FOLLOW_declarations_in_closed_compound_expr1582 = new BitSet(new long[]{0x0004110001804000L});
	public static final BitSet FOLLOW_statements_in_closed_compound_expr1585 = new BitSet(new long[]{0x0004190001804000L});
	public static final BitSet FOLLOW_RCURLY_in_closed_compound_expr1589 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_in_single_expr1613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arith2_in_arithmetic1632 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_OR_in_arithmetic1635 = new BitSet(new long[]{0x000000A980800500L});
	public static final BitSet FOLLOW_arith2_in_arithmetic1638 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_arith3_in_arith21663 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_AND_in_arith21666 = new BitSet(new long[]{0x000000A980800500L});
	public static final BitSet FOLLOW_arith3_in_arith21669 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_arith4_in_arith31694 = new BitSet(new long[]{0x0000001018680002L});
	public static final BitSet FOLLOW_LESS_in_arith31698 = new BitSet(new long[]{0x000000A980800500L});
	public static final BitSet FOLLOW_LESSEQ_in_arith31703 = new BitSet(new long[]{0x000000A980800500L});
	public static final BitSet FOLLOW_GREATEQ_in_arith31708 = new BitSet(new long[]{0x000000A980800500L});
	public static final BitSet FOLLOW_GREAT_in_arith31713 = new BitSet(new long[]{0x000000A980800500L});
	public static final BitSet FOLLOW_EQ_in_arith31718 = new BitSet(new long[]{0x000000A980800500L});
	public static final BitSet FOLLOW_NOTEQ_in_arith31723 = new BitSet(new long[]{0x000000A980800500L});
	public static final BitSet FOLLOW_arith4_in_arith31727 = new BitSet(new long[]{0x0000001018680002L});
	public static final BitSet FOLLOW_arith5_in_arith41757 = new BitSet(new long[]{0x0000008100000002L});
	public static final BitSet FOLLOW_PLUS_in_arith41761 = new BitSet(new long[]{0x000000A980800500L});
	public static final BitSet FOLLOW_MIN_in_arith41766 = new BitSet(new long[]{0x000000A980800500L});
	public static final BitSet FOLLOW_arith5_in_arith41770 = new BitSet(new long[]{0x0000008100000002L});
	public static final BitSet FOLLOW_arith6_in_arith51801 = new BitSet(new long[]{0x0000000600010002L});
	public static final BitSet FOLLOW_MULT_in_arith51805 = new BitSet(new long[]{0x000000A980800500L});
	public static final BitSet FOLLOW_DIV_in_arith51810 = new BitSet(new long[]{0x000000A980800500L});
	public static final BitSet FOLLOW_MOD_in_arith51815 = new BitSet(new long[]{0x000000A980800500L});
	public static final BitSet FOLLOW_arith6_in_arith51819 = new BitSet(new long[]{0x0000000600010002L});
	public static final BitSet FOLLOW_PLUS_in_arith61854 = new BitSet(new long[]{0x0000002080800500L});
	public static final BitSet FOLLOW_MIN_in_arith61859 = new BitSet(new long[]{0x0000002080800500L});
	public static final BitSet FOLLOW_NOT_in_arith61864 = new BitSet(new long[]{0x0000002080800500L});
	public static final BitSet FOLLOW_operand_in_arith61869 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifelsethen1893 = new BitSet(new long[]{0x000000A980800500L});
	public static final BitSet FOLLOW_single_expr_in_ifelsethen1896 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_THEN_in_ifelsethen1898 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LCURLY_in_ifelsethen1901 = new BitSet(new long[]{0x0004110001804000L});
	public static final BitSet FOLLOW_unclosed_compound_expr_in_ifelsethen1904 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_RCURLY_in_ifelsethen1906 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_ELSE_in_ifelsethen1910 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LCURLY_in_ifelsethen1913 = new BitSet(new long[]{0x0004110001804000L});
	public static final BitSet FOLLOW_unclosed_compound_expr_in_ifelsethen1916 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_RCURLY_in_ifelsethen1918 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand1941 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand1951 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand1961 = new BitSet(new long[]{0x000000A980800500L});
	public static final BitSet FOLLOW_single_expr_in_operand1964 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_RPAREN_in_operand1966 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_OPERATOR_in_operand1977 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_OPERATOR_in_operand1987 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DQUOTATION_in_string2037 = new BitSet(new long[]{0x0000000020028000L});
	public static final BitSet FOLLOW_graphic_in_string2040 = new BitSet(new long[]{0x0000000020028000L});
	public static final BitSet FOLLOW_DQUOTATION_in_string2043 = new BitSet(new long[]{0x0000000000000002L});
}