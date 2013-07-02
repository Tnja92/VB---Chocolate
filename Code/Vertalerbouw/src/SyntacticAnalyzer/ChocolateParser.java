// $ANTLR 3.5 C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g 2013-07-01 14:06:02

package SyntacticAnalyzer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class ChocolateParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ASSIGN", "BOOLEAN", "BOOLEAN_OPERATOR", 
		"CHAR", "CHAR_OPERATOR", "COLON", "COMMA", "COMMENT", "CONSTANT", "DIGIT", 
		"DIV", "DQUOTATION", "ELSE", "EQ", "FALSE", "GREAT", "GREATEQ", "IDENTIFIER", 
		"IF", "INTEGER", "LCURLY", "LESS", "LESSEQ", "LETTER", "LOWER", "LPAREN", 
		"MIN", "MOD", "MULT", "NOT", "NOTEQ", "NUMBER", "OR", "PLUS", "PRINT", 
		"PROGRAM", "QUOTATION", "RCURLY", "READ", "RPAREN", "SEMICOLON", "THEN", 
		"TRUE", "UPPER", "VAR", "WS"
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
	public static final int FALSE=19;
	public static final int GREAT=20;
	public static final int GREATEQ=21;
	public static final int IDENTIFIER=22;
	public static final int IF=23;
	public static final int INTEGER=24;
	public static final int LCURLY=25;
	public static final int LESS=26;
	public static final int LESSEQ=27;
	public static final int LETTER=28;
	public static final int LOWER=29;
	public static final int LPAREN=30;
	public static final int MIN=31;
	public static final int MOD=32;
	public static final int MULT=33;
	public static final int NOT=34;
	public static final int NOTEQ=35;
	public static final int NUMBER=36;
	public static final int OR=37;
	public static final int PLUS=38;
	public static final int PRINT=39;
	public static final int PROGRAM=40;
	public static final int QUOTATION=41;
	public static final int RCURLY=42;
	public static final int READ=43;
	public static final int RPAREN=44;
	public static final int SEMICOLON=45;
	public static final int THEN=46;
	public static final int TRUE=47;
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
	@Override public String getGrammarFileName() { return "C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g"; }


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:63:1: program : ( ( declarations )* statements )+ EOF -> ^( PROGRAM ( ( declarations )* statements )+ ) ;
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
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:64:5: ( ( ( declarations )* statements )+ EOF -> ^( PROGRAM ( ( declarations )* statements )+ ) )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:64:10: ( ( declarations )* statements )+ EOF
			{
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:64:10: ( ( declarations )* statements )+
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
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:64:11: ( declarations )* statements
					{
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:64:11: ( declarations )*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( (LA1_0==CONSTANT||LA1_0==VAR) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:64:11: declarations
							{
							pushFollow(FOLLOW_declarations_in_program1033);
							declarations1=declarations();
							state._fsp--;

							stream_declarations.add(declarations1.getTree());
							}
							break;

						default :
							break loop1;
						}
					}

					pushFollow(FOLLOW_statements_in_program1036);
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

			EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_program1040);  
			stream_EOF.add(EOF3);

			// AST REWRITE
			// elements: declarations, statements
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 65:13: -> ^( PROGRAM ( ( declarations )* statements )+ )
			{
				// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:65:17: ^( PROGRAM ( ( declarations )* statements )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				if ( !(stream_statements.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_statements.hasNext() ) {
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:65:28: ( declarations )*
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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:70:1: declarations : declaration SEMICOLON !;
	public final ChocolateParser.declarations_return declarations() throws RecognitionException {
		ChocolateParser.declarations_return retval = new ChocolateParser.declarations_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMICOLON5=null;
		ParserRuleReturnScope declaration4 =null;

		Object SEMICOLON5_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:71:5: ( declaration SEMICOLON !)
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:71:9: declaration SEMICOLON !
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_declaration_in_declarations1103);
			declaration4=declaration();
			state._fsp--;

			adaptor.addChild(root_0, declaration4.getTree());

			SEMICOLON5=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_declarations1105); 
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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:74:1: declaration : ( constant | variable ) ;
	public final ChocolateParser.declaration_return declaration() throws RecognitionException {
		ChocolateParser.declaration_return retval = new ChocolateParser.declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope constant6 =null;
		ParserRuleReturnScope variable7 =null;


		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:75:5: ( ( constant | variable ) )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:75:9: ( constant | variable )
			{
			root_0 = (Object)adaptor.nil();


			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:75:9: ( constant | variable )
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
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:75:10: constant
					{
					pushFollow(FOLLOW_constant_in_declaration1127);
					constant6=constant();
					state._fsp--;

					adaptor.addChild(root_0, constant6.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:75:21: variable
					{
					pushFollow(FOLLOW_variable_in_declaration1131);
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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:78:1: constant : CONSTANT ^ type IDENTIFIER ( ASSIGN ( single_expr | closed_compound_expr ) )? ;
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
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:79:5: ( CONSTANT ^ type IDENTIFIER ( ASSIGN ( single_expr | closed_compound_expr ) )? )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:79:9: CONSTANT ^ type IDENTIFIER ( ASSIGN ( single_expr | closed_compound_expr ) )?
			{
			root_0 = (Object)adaptor.nil();


			CONSTANT8=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_constant1158); 
			CONSTANT8_tree = (Object)adaptor.create(CONSTANT8);
			root_0 = (Object)adaptor.becomeRoot(CONSTANT8_tree, root_0);

			pushFollow(FOLLOW_type_in_constant1161);
			type9=type();
			state._fsp--;

			adaptor.addChild(root_0, type9.getTree());

			IDENTIFIER10=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant1163); 
			IDENTIFIER10_tree = (Object)adaptor.create(IDENTIFIER10);
			adaptor.addChild(root_0, IDENTIFIER10_tree);

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:79:35: ( ASSIGN ( single_expr | closed_compound_expr ) )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ASSIGN) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:79:36: ASSIGN ( single_expr | closed_compound_expr )
					{
					ASSIGN11=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_constant1166); 
					ASSIGN11_tree = (Object)adaptor.create(ASSIGN11);
					adaptor.addChild(root_0, ASSIGN11_tree);

					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:79:43: ( single_expr | closed_compound_expr )
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
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:79:44: single_expr
							{
							pushFollow(FOLLOW_single_expr_in_constant1169);
							single_expr12=single_expr();
							state._fsp--;

							adaptor.addChild(root_0, single_expr12.getTree());

							}
							break;
						case 2 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:79:58: closed_compound_expr
							{
							pushFollow(FOLLOW_closed_compound_expr_in_constant1173);
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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:82:1: variable : VAR ^ type IDENTIFIER ( ASSIGN ( single_expr | closed_compound_expr ) )? ;
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
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:83:5: ( VAR ^ type IDENTIFIER ( ASSIGN ( single_expr | closed_compound_expr ) )? )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:83:9: VAR ^ type IDENTIFIER ( ASSIGN ( single_expr | closed_compound_expr ) )?
			{
			root_0 = (Object)adaptor.nil();


			VAR14=(Token)match(input,VAR,FOLLOW_VAR_in_variable1199); 
			VAR14_tree = (Object)adaptor.create(VAR14);
			root_0 = (Object)adaptor.becomeRoot(VAR14_tree, root_0);

			pushFollow(FOLLOW_type_in_variable1202);
			type15=type();
			state._fsp--;

			adaptor.addChild(root_0, type15.getTree());

			IDENTIFIER16=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variable1204); 
			IDENTIFIER16_tree = (Object)adaptor.create(IDENTIFIER16);
			adaptor.addChild(root_0, IDENTIFIER16_tree);

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:83:30: ( ASSIGN ( single_expr | closed_compound_expr ) )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==ASSIGN) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:83:31: ASSIGN ( single_expr | closed_compound_expr )
					{
					ASSIGN17=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_variable1207); 
					ASSIGN17_tree = (Object)adaptor.create(ASSIGN17);
					adaptor.addChild(root_0, ASSIGN17_tree);

					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:83:38: ( single_expr | closed_compound_expr )
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
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:83:39: single_expr
							{
							pushFollow(FOLLOW_single_expr_in_variable1210);
							single_expr18=single_expr();
							state._fsp--;

							adaptor.addChild(root_0, single_expr18.getTree());

							}
							break;
						case 2 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:83:53: closed_compound_expr
							{
							pushFollow(FOLLOW_closed_compound_expr_in_variable1214);
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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:87:1: statements : statement SEMICOLON !;
	public final ChocolateParser.statements_return statements() throws RecognitionException {
		ChocolateParser.statements_return retval = new ChocolateParser.statements_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMICOLON21=null;
		ParserRuleReturnScope statement20 =null;

		Object SEMICOLON21_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:88:5: ( statement SEMICOLON !)
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:88:7: statement SEMICOLON !
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_statement_in_statements1238);
			statement20=statement();
			state._fsp--;

			adaptor.addChild(root_0, statement20.getTree());

			SEMICOLON21=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statements1240); 
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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:91:1: statement : ( read | print | assign | ifelsethen );
	public final ChocolateParser.statement_return statement() throws RecognitionException {
		ChocolateParser.statement_return retval = new ChocolateParser.statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope read22 =null;
		ParserRuleReturnScope print23 =null;
		ParserRuleReturnScope assign24 =null;
		ParserRuleReturnScope ifelsethen25 =null;


		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:92:5: ( read | print | assign | ifelsethen )
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
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:92:9: read
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_read_in_statement1264);
					read22=read();
					state._fsp--;

					adaptor.addChild(root_0, read22.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:93:9: print
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_print_in_statement1275);
					print23=print();
					state._fsp--;

					adaptor.addChild(root_0, print23.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:94:9: assign
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_assign_in_statement1286);
					assign24=assign();
					state._fsp--;

					adaptor.addChild(root_0, assign24.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:95:9: ifelsethen
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_ifelsethen_in_statement1299);
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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:98:1: read : READ ^ LPAREN ! IDENTIFIER ( readmultiple )? RPAREN !;
	public final ChocolateParser.read_return read() throws RecognitionException {
		ChocolateParser.read_return retval = new ChocolateParser.read_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token READ26=null;
		Token LPAREN27=null;
		Token IDENTIFIER28=null;
		Token RPAREN30=null;
		ParserRuleReturnScope readmultiple29 =null;

		Object READ26_tree=null;
		Object LPAREN27_tree=null;
		Object IDENTIFIER28_tree=null;
		Object RPAREN30_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:99:5: ( READ ^ LPAREN ! IDENTIFIER ( readmultiple )? RPAREN !)
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:99:9: READ ^ LPAREN ! IDENTIFIER ( readmultiple )? RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			READ26=(Token)match(input,READ,FOLLOW_READ_in_read1318); 
			READ26_tree = (Object)adaptor.create(READ26);
			root_0 = (Object)adaptor.becomeRoot(READ26_tree, root_0);

			LPAREN27=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_read1321); 
			IDENTIFIER28=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read1324); 
			IDENTIFIER28_tree = (Object)adaptor.create(IDENTIFIER28);
			adaptor.addChild(root_0, IDENTIFIER28_tree);

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:99:34: ( readmultiple )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==COMMA) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:99:34: readmultiple
					{
					pushFollow(FOLLOW_readmultiple_in_read1326);
					readmultiple29=readmultiple();
					state._fsp--;

					adaptor.addChild(root_0, readmultiple29.getTree());

					}
					break;

			}

			RPAREN30=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_read1329); 
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


	public static class readmultiple_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "readmultiple"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:102:1: readmultiple : COMMA ! IDENTIFIER ( readmultiple )? ;
	public final ChocolateParser.readmultiple_return readmultiple() throws RecognitionException {
		ChocolateParser.readmultiple_return retval = new ChocolateParser.readmultiple_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token COMMA31=null;
		Token IDENTIFIER32=null;
		ParserRuleReturnScope readmultiple33 =null;

		Object COMMA31_tree=null;
		Object IDENTIFIER32_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:103:5: ( COMMA ! IDENTIFIER ( readmultiple )? )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:103:9: COMMA ! IDENTIFIER ( readmultiple )?
			{
			root_0 = (Object)adaptor.nil();


			COMMA31=(Token)match(input,COMMA,FOLLOW_COMMA_in_readmultiple1353); 
			IDENTIFIER32=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_readmultiple1356); 
			IDENTIFIER32_tree = (Object)adaptor.create(IDENTIFIER32);
			adaptor.addChild(root_0, IDENTIFIER32_tree);

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:103:27: ( readmultiple )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==COMMA) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:103:27: readmultiple
					{
					pushFollow(FOLLOW_readmultiple_in_readmultiple1358);
					readmultiple33=readmultiple();
					state._fsp--;

					adaptor.addChild(root_0, readmultiple33.getTree());

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
	// $ANTLR end "readmultiple"


	public static class assign_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assign"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:106:1: assign : IDENTIFIER ASSIGN ^ assignchoice ;
	public final ChocolateParser.assign_return assign() throws RecognitionException {
		ChocolateParser.assign_return retval = new ChocolateParser.assign_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER34=null;
		Token ASSIGN35=null;
		ParserRuleReturnScope assignchoice36 =null;

		Object IDENTIFIER34_tree=null;
		Object ASSIGN35_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:107:5: ( IDENTIFIER ASSIGN ^ assignchoice )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:107:9: IDENTIFIER ASSIGN ^ assignchoice
			{
			root_0 = (Object)adaptor.nil();


			IDENTIFIER34=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assign1378); 
			IDENTIFIER34_tree = (Object)adaptor.create(IDENTIFIER34);
			adaptor.addChild(root_0, IDENTIFIER34_tree);

			ASSIGN35=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign1380); 
			ASSIGN35_tree = (Object)adaptor.create(ASSIGN35);
			root_0 = (Object)adaptor.becomeRoot(ASSIGN35_tree, root_0);

			pushFollow(FOLLOW_assignchoice_in_assign1383);
			assignchoice36=assignchoice();
			state._fsp--;

			adaptor.addChild(root_0, assignchoice36.getTree());

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


	public static class assignchoice_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assignchoice"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:110:1: assignchoice : ( IDENTIFIER ( ASSIGN ^ assignchoice )? | single_expr ~ IDENTIFIER | closed_compound_expr );
	public final ChocolateParser.assignchoice_return assignchoice() throws RecognitionException {
		ChocolateParser.assignchoice_return retval = new ChocolateParser.assignchoice_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER37=null;
		Token ASSIGN38=null;
		Token set41=null;
		ParserRuleReturnScope assignchoice39 =null;
		ParserRuleReturnScope single_expr40 =null;
		ParserRuleReturnScope closed_compound_expr42 =null;

		Object IDENTIFIER37_tree=null;
		Object ASSIGN38_tree=null;
		Object set41_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:111:5: ( IDENTIFIER ( ASSIGN ^ assignchoice )? | single_expr ~ IDENTIFIER | closed_compound_expr )
			int alt12=3;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt12=1;
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
				alt12=2;
				}
				break;
			case LCURLY:
				{
				alt12=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:111:9: IDENTIFIER ( ASSIGN ^ assignchoice )?
					{
					root_0 = (Object)adaptor.nil();


					IDENTIFIER37=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assignchoice1406); 
					IDENTIFIER37_tree = (Object)adaptor.create(IDENTIFIER37);
					adaptor.addChild(root_0, IDENTIFIER37_tree);

					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:111:20: ( ASSIGN ^ assignchoice )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==ASSIGN) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:111:21: ASSIGN ^ assignchoice
							{
							ASSIGN38=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignchoice1409); 
							ASSIGN38_tree = (Object)adaptor.create(ASSIGN38);
							root_0 = (Object)adaptor.becomeRoot(ASSIGN38_tree, root_0);

							pushFollow(FOLLOW_assignchoice_in_assignchoice1412);
							assignchoice39=assignchoice();
							state._fsp--;

							adaptor.addChild(root_0, assignchoice39.getTree());

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:112:9: single_expr ~ IDENTIFIER
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_single_expr_in_assignchoice1424);
					single_expr40=single_expr();
					state._fsp--;

					adaptor.addChild(root_0, single_expr40.getTree());

					set41=input.LT(1);
					if ( (input.LA(1) >= AND && input.LA(1) <= GREATEQ)||(input.LA(1) >= IF && input.LA(1) <= WS) ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set41));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;
				case 3 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:113:9: closed_compound_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_closed_compound_expr_in_assignchoice1437);
					closed_compound_expr42=closed_compound_expr();
					state._fsp--;

					adaptor.addChild(root_0, closed_compound_expr42.getTree());

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
	// $ANTLR end "assignchoice"


	public static class assignmultiple_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assignmultiple"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:116:1: assignmultiple : IDENTIFIER ( ASSIGN ^ assignmultiple )? ;
	public final ChocolateParser.assignmultiple_return assignmultiple() throws RecognitionException {
		ChocolateParser.assignmultiple_return retval = new ChocolateParser.assignmultiple_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER43=null;
		Token ASSIGN44=null;
		ParserRuleReturnScope assignmultiple45 =null;

		Object IDENTIFIER43_tree=null;
		Object ASSIGN44_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:117:5: ( IDENTIFIER ( ASSIGN ^ assignmultiple )? )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:117:9: IDENTIFIER ( ASSIGN ^ assignmultiple )?
			{
			root_0 = (Object)adaptor.nil();


			IDENTIFIER43=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assignmultiple1460); 
			IDENTIFIER43_tree = (Object)adaptor.create(IDENTIFIER43);
			adaptor.addChild(root_0, IDENTIFIER43_tree);

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:117:20: ( ASSIGN ^ assignmultiple )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==ASSIGN) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:117:21: ASSIGN ^ assignmultiple
					{
					ASSIGN44=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignmultiple1463); 
					ASSIGN44_tree = (Object)adaptor.create(ASSIGN44);
					root_0 = (Object)adaptor.becomeRoot(ASSIGN44_tree, root_0);

					pushFollow(FOLLOW_assignmultiple_in_assignmultiple1466);
					assignmultiple45=assignmultiple();
					state._fsp--;

					adaptor.addChild(root_0, assignmultiple45.getTree());

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
	// $ANTLR end "assignmultiple"


	public static class print_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "print"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:120:1: print : PRINT ^ LPAREN ! ( closed_compound_expr | string | IDENTIFIER ) ( printmultiple )? RPAREN !;
	public final ChocolateParser.print_return print() throws RecognitionException {
		ChocolateParser.print_return retval = new ChocolateParser.print_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PRINT46=null;
		Token LPAREN47=null;
		Token IDENTIFIER50=null;
		Token RPAREN52=null;
		ParserRuleReturnScope closed_compound_expr48 =null;
		ParserRuleReturnScope string49 =null;
		ParserRuleReturnScope printmultiple51 =null;

		Object PRINT46_tree=null;
		Object LPAREN47_tree=null;
		Object IDENTIFIER50_tree=null;
		Object RPAREN52_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:121:5: ( PRINT ^ LPAREN ! ( closed_compound_expr | string | IDENTIFIER ) ( printmultiple )? RPAREN !)
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:121:9: PRINT ^ LPAREN ! ( closed_compound_expr | string | IDENTIFIER ) ( printmultiple )? RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			PRINT46=(Token)match(input,PRINT,FOLLOW_PRINT_in_print1491); 
			PRINT46_tree = (Object)adaptor.create(PRINT46);
			root_0 = (Object)adaptor.becomeRoot(PRINT46_tree, root_0);

			LPAREN47=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_print1494); 
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:121:24: ( closed_compound_expr | string | IDENTIFIER )
			int alt14=3;
			switch ( input.LA(1) ) {
			case LCURLY:
				{
				alt14=1;
				}
				break;
			case DQUOTATION:
				{
				alt14=2;
				}
				break;
			case IDENTIFIER:
				{
				alt14=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:121:25: closed_compound_expr
					{
					pushFollow(FOLLOW_closed_compound_expr_in_print1498);
					closed_compound_expr48=closed_compound_expr();
					state._fsp--;

					adaptor.addChild(root_0, closed_compound_expr48.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:121:48: string
					{
					pushFollow(FOLLOW_string_in_print1502);
					string49=string();
					state._fsp--;

					adaptor.addChild(root_0, string49.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:121:57: IDENTIFIER
					{
					IDENTIFIER50=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_print1506); 
					IDENTIFIER50_tree = (Object)adaptor.create(IDENTIFIER50);
					adaptor.addChild(root_0, IDENTIFIER50_tree);

					}
					break;

			}

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:121:69: ( printmultiple )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==COMMA) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:121:69: printmultiple
					{
					pushFollow(FOLLOW_printmultiple_in_print1509);
					printmultiple51=printmultiple();
					state._fsp--;

					adaptor.addChild(root_0, printmultiple51.getTree());

					}
					break;

			}

			RPAREN52=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_print1512); 
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


	public static class printmultiple_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "printmultiple"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:124:1: printmultiple : COMMA ! ( closed_compound_expr | string | IDENTIFIER ) ( printmultiple )? ;
	public final ChocolateParser.printmultiple_return printmultiple() throws RecognitionException {
		ChocolateParser.printmultiple_return retval = new ChocolateParser.printmultiple_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token COMMA53=null;
		Token IDENTIFIER56=null;
		ParserRuleReturnScope closed_compound_expr54 =null;
		ParserRuleReturnScope string55 =null;
		ParserRuleReturnScope printmultiple57 =null;

		Object COMMA53_tree=null;
		Object IDENTIFIER56_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:125:5: ( COMMA ! ( closed_compound_expr | string | IDENTIFIER ) ( printmultiple )? )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:125:9: COMMA ! ( closed_compound_expr | string | IDENTIFIER ) ( printmultiple )?
			{
			root_0 = (Object)adaptor.nil();


			COMMA53=(Token)match(input,COMMA,FOLLOW_COMMA_in_printmultiple1536); 
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:125:16: ( closed_compound_expr | string | IDENTIFIER )
			int alt16=3;
			switch ( input.LA(1) ) {
			case LCURLY:
				{
				alt16=1;
				}
				break;
			case DQUOTATION:
				{
				alt16=2;
				}
				break;
			case IDENTIFIER:
				{
				alt16=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:125:17: closed_compound_expr
					{
					pushFollow(FOLLOW_closed_compound_expr_in_printmultiple1540);
					closed_compound_expr54=closed_compound_expr();
					state._fsp--;

					adaptor.addChild(root_0, closed_compound_expr54.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:125:40: string
					{
					pushFollow(FOLLOW_string_in_printmultiple1544);
					string55=string();
					state._fsp--;

					adaptor.addChild(root_0, string55.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:125:49: IDENTIFIER
					{
					IDENTIFIER56=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_printmultiple1548); 
					IDENTIFIER56_tree = (Object)adaptor.create(IDENTIFIER56);
					adaptor.addChild(root_0, IDENTIFIER56_tree);

					}
					break;

			}

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:125:61: ( printmultiple )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==COMMA) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:125:61: printmultiple
					{
					pushFollow(FOLLOW_printmultiple_in_printmultiple1551);
					printmultiple57=printmultiple();
					state._fsp--;

					adaptor.addChild(root_0, printmultiple57.getTree());

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
	// $ANTLR end "printmultiple"


	public static class compound_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "compound_expr"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:129:1: compound_expr : ( unclosed_compound_expr | closed_compound_expr );
	public final ChocolateParser.compound_expr_return compound_expr() throws RecognitionException {
		ChocolateParser.compound_expr_return retval = new ChocolateParser.compound_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope unclosed_compound_expr58 =null;
		ParserRuleReturnScope closed_compound_expr59 =null;


		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:130:5: ( unclosed_compound_expr | closed_compound_expr )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==CONSTANT||(LA18_0 >= IDENTIFIER && LA18_0 <= IF)||LA18_0==PRINT||LA18_0==READ||LA18_0==VAR) ) {
				alt18=1;
			}
			else if ( (LA18_0==LCURLY) ) {
				alt18=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:130:9: unclosed_compound_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_unclosed_compound_expr_in_compound_expr1576);
					unclosed_compound_expr58=unclosed_compound_expr();
					state._fsp--;

					adaptor.addChild(root_0, unclosed_compound_expr58.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:131:9: closed_compound_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_closed_compound_expr_in_compound_expr1586);
					closed_compound_expr59=closed_compound_expr();
					state._fsp--;

					adaptor.addChild(root_0, closed_compound_expr59.getTree());

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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:134:1: unclosed_compound_expr : ( ( declarations )* statements )+ ;
	public final ChocolateParser.unclosed_compound_expr_return unclosed_compound_expr() throws RecognitionException {
		ChocolateParser.unclosed_compound_expr_return retval = new ChocolateParser.unclosed_compound_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope declarations60 =null;
		ParserRuleReturnScope statements61 =null;


		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:135:5: ( ( ( declarations )* statements )+ )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:135:9: ( ( declarations )* statements )+
			{
			root_0 = (Object)adaptor.nil();


			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:135:9: ( ( declarations )* statements )+
			int cnt20=0;
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==CONSTANT||(LA20_0 >= IDENTIFIER && LA20_0 <= IF)||LA20_0==PRINT||LA20_0==READ||LA20_0==VAR) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:135:10: ( declarations )* statements
					{
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:135:10: ( declarations )*
					loop19:
					while (true) {
						int alt19=2;
						int LA19_0 = input.LA(1);
						if ( (LA19_0==CONSTANT||LA19_0==VAR) ) {
							alt19=1;
						}

						switch (alt19) {
						case 1 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:135:10: declarations
							{
							pushFollow(FOLLOW_declarations_in_unclosed_compound_expr1610);
							declarations60=declarations();
							state._fsp--;

							adaptor.addChild(root_0, declarations60.getTree());

							}
							break;

						default :
							break loop19;
						}
					}

					pushFollow(FOLLOW_statements_in_unclosed_compound_expr1613);
					statements61=statements();
					state._fsp--;

					adaptor.addChild(root_0, statements61.getTree());

					}
					break;

				default :
					if ( cnt20 >= 1 ) break loop20;
					EarlyExitException eee = new EarlyExitException(20, input);
					throw eee;
				}
				cnt20++;
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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:138:1: closed_compound_expr : LCURLY ! ( ( declarations )* statements )+ RCURLY !;
	public final ChocolateParser.closed_compound_expr_return closed_compound_expr() throws RecognitionException {
		ChocolateParser.closed_compound_expr_return retval = new ChocolateParser.closed_compound_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LCURLY62=null;
		Token RCURLY65=null;
		ParserRuleReturnScope declarations63 =null;
		ParserRuleReturnScope statements64 =null;

		Object LCURLY62_tree=null;
		Object RCURLY65_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:139:5: ( LCURLY ! ( ( declarations )* statements )+ RCURLY !)
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:139:9: LCURLY ! ( ( declarations )* statements )+ RCURLY !
			{
			root_0 = (Object)adaptor.nil();


			LCURLY62=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_closed_compound_expr1635); 
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:139:17: ( ( declarations )* statements )+
			int cnt22=0;
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==CONSTANT||(LA22_0 >= IDENTIFIER && LA22_0 <= IF)||LA22_0==PRINT||LA22_0==READ||LA22_0==VAR) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:139:18: ( declarations )* statements
					{
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:139:18: ( declarations )*
					loop21:
					while (true) {
						int alt21=2;
						int LA21_0 = input.LA(1);
						if ( (LA21_0==CONSTANT||LA21_0==VAR) ) {
							alt21=1;
						}

						switch (alt21) {
						case 1 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:139:18: declarations
							{
							pushFollow(FOLLOW_declarations_in_closed_compound_expr1639);
							declarations63=declarations();
							state._fsp--;

							adaptor.addChild(root_0, declarations63.getTree());

							}
							break;

						default :
							break loop21;
						}
					}

					pushFollow(FOLLOW_statements_in_closed_compound_expr1642);
					statements64=statements();
					state._fsp--;

					adaptor.addChild(root_0, statements64.getTree());

					}
					break;

				default :
					if ( cnt22 >= 1 ) break loop22;
					EarlyExitException eee = new EarlyExitException(22, input);
					throw eee;
				}
				cnt22++;
			}

			RCURLY65=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_closed_compound_expr1646); 
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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:142:1: single_expr : arithmetic ;
	public final ChocolateParser.single_expr_return single_expr() throws RecognitionException {
		ChocolateParser.single_expr_return retval = new ChocolateParser.single_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope arithmetic66 =null;


		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:143:5: ( arithmetic )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:143:9: arithmetic
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_in_single_expr1670);
			arithmetic66=arithmetic();
			state._fsp--;

			adaptor.addChild(root_0, arithmetic66.getTree());

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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:146:1: arithmetic : arith2 ( OR ^ arith2 )* ;
	public final ChocolateParser.arithmetic_return arithmetic() throws RecognitionException {
		ChocolateParser.arithmetic_return retval = new ChocolateParser.arithmetic_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token OR68=null;
		ParserRuleReturnScope arith267 =null;
		ParserRuleReturnScope arith269 =null;

		Object OR68_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:147:5: ( arith2 ( OR ^ arith2 )* )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:147:9: arith2 ( OR ^ arith2 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arith2_in_arithmetic1689);
			arith267=arith2();
			state._fsp--;

			adaptor.addChild(root_0, arith267.getTree());

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:147:16: ( OR ^ arith2 )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==OR) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:147:17: OR ^ arith2
					{
					OR68=(Token)match(input,OR,FOLLOW_OR_in_arithmetic1692); 
					OR68_tree = (Object)adaptor.create(OR68);
					root_0 = (Object)adaptor.becomeRoot(OR68_tree, root_0);

					pushFollow(FOLLOW_arith2_in_arithmetic1695);
					arith269=arith2();
					state._fsp--;

					adaptor.addChild(root_0, arith269.getTree());

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
	// $ANTLR end "arithmetic"


	public static class arith2_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arith2"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:150:1: arith2 : arith3 ( AND ^ arith3 )* ;
	public final ChocolateParser.arith2_return arith2() throws RecognitionException {
		ChocolateParser.arith2_return retval = new ChocolateParser.arith2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AND71=null;
		ParserRuleReturnScope arith370 =null;
		ParserRuleReturnScope arith372 =null;

		Object AND71_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:151:5: ( arith3 ( AND ^ arith3 )* )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:151:9: arith3 ( AND ^ arith3 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arith3_in_arith21720);
			arith370=arith3();
			state._fsp--;

			adaptor.addChild(root_0, arith370.getTree());

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:151:16: ( AND ^ arith3 )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==AND) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:151:17: AND ^ arith3
					{
					AND71=(Token)match(input,AND,FOLLOW_AND_in_arith21723); 
					AND71_tree = (Object)adaptor.create(AND71);
					root_0 = (Object)adaptor.becomeRoot(AND71_tree, root_0);

					pushFollow(FOLLOW_arith3_in_arith21726);
					arith372=arith3();
					state._fsp--;

					adaptor.addChild(root_0, arith372.getTree());

					}
					break;

				default :
					break loop24;
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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:154:1: arith3 : arith4 ( ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^) arith4 )* ;
	public final ChocolateParser.arith3_return arith3() throws RecognitionException {
		ChocolateParser.arith3_return retval = new ChocolateParser.arith3_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LESS74=null;
		Token LESSEQ75=null;
		Token GREATEQ76=null;
		Token GREAT77=null;
		Token EQ78=null;
		Token NOTEQ79=null;
		ParserRuleReturnScope arith473 =null;
		ParserRuleReturnScope arith480 =null;

		Object LESS74_tree=null;
		Object LESSEQ75_tree=null;
		Object GREATEQ76_tree=null;
		Object GREAT77_tree=null;
		Object EQ78_tree=null;
		Object NOTEQ79_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:155:5: ( arith4 ( ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^) arith4 )* )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:155:9: arith4 ( ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^) arith4 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arith4_in_arith31751);
			arith473=arith4();
			state._fsp--;

			adaptor.addChild(root_0, arith473.getTree());

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:155:16: ( ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^) arith4 )*
			loop26:
			while (true) {
				int alt26=2;
				switch ( input.LA(1) ) {
				case LESS:
					{
					alt26=1;
					}
					break;
				case LESSEQ:
					{
					alt26=1;
					}
					break;
				case GREATEQ:
					{
					alt26=1;
					}
					break;
				case GREAT:
					{
					alt26=1;
					}
					break;
				case EQ:
					{
					alt26=1;
					}
					break;
				case NOTEQ:
					{
					alt26=1;
					}
					break;
				}
				switch (alt26) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:155:17: ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^) arith4
					{
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:155:17: ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^)
					int alt25=6;
					switch ( input.LA(1) ) {
					case LESS:
						{
						alt25=1;
						}
						break;
					case LESSEQ:
						{
						alt25=2;
						}
						break;
					case GREATEQ:
						{
						alt25=3;
						}
						break;
					case GREAT:
						{
						alt25=4;
						}
						break;
					case EQ:
						{
						alt25=5;
						}
						break;
					case NOTEQ:
						{
						alt25=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 25, 0, input);
						throw nvae;
					}
					switch (alt25) {
						case 1 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:155:18: LESS ^
							{
							LESS74=(Token)match(input,LESS,FOLLOW_LESS_in_arith31755); 
							LESS74_tree = (Object)adaptor.create(LESS74);
							root_0 = (Object)adaptor.becomeRoot(LESS74_tree, root_0);

							}
							break;
						case 2 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:155:26: LESSEQ ^
							{
							LESSEQ75=(Token)match(input,LESSEQ,FOLLOW_LESSEQ_in_arith31760); 
							LESSEQ75_tree = (Object)adaptor.create(LESSEQ75);
							root_0 = (Object)adaptor.becomeRoot(LESSEQ75_tree, root_0);

							}
							break;
						case 3 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:155:36: GREATEQ ^
							{
							GREATEQ76=(Token)match(input,GREATEQ,FOLLOW_GREATEQ_in_arith31765); 
							GREATEQ76_tree = (Object)adaptor.create(GREATEQ76);
							root_0 = (Object)adaptor.becomeRoot(GREATEQ76_tree, root_0);

							}
							break;
						case 4 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:155:47: GREAT ^
							{
							GREAT77=(Token)match(input,GREAT,FOLLOW_GREAT_in_arith31770); 
							GREAT77_tree = (Object)adaptor.create(GREAT77);
							root_0 = (Object)adaptor.becomeRoot(GREAT77_tree, root_0);

							}
							break;
						case 5 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:155:56: EQ ^
							{
							EQ78=(Token)match(input,EQ,FOLLOW_EQ_in_arith31775); 
							EQ78_tree = (Object)adaptor.create(EQ78);
							root_0 = (Object)adaptor.becomeRoot(EQ78_tree, root_0);

							}
							break;
						case 6 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:155:62: NOTEQ ^
							{
							NOTEQ79=(Token)match(input,NOTEQ,FOLLOW_NOTEQ_in_arith31780); 
							NOTEQ79_tree = (Object)adaptor.create(NOTEQ79);
							root_0 = (Object)adaptor.becomeRoot(NOTEQ79_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_arith4_in_arith31784);
					arith480=arith4();
					state._fsp--;

					adaptor.addChild(root_0, arith480.getTree());

					}
					break;

				default :
					break loop26;
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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:158:1: arith4 : arith5 ( ( PLUS ^| MIN ^) arith5 )* ;
	public final ChocolateParser.arith4_return arith4() throws RecognitionException {
		ChocolateParser.arith4_return retval = new ChocolateParser.arith4_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS82=null;
		Token MIN83=null;
		ParserRuleReturnScope arith581 =null;
		ParserRuleReturnScope arith584 =null;

		Object PLUS82_tree=null;
		Object MIN83_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:159:5: ( arith5 ( ( PLUS ^| MIN ^) arith5 )* )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:159:9: arith5 ( ( PLUS ^| MIN ^) arith5 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arith5_in_arith41814);
			arith581=arith5();
			state._fsp--;

			adaptor.addChild(root_0, arith581.getTree());

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:159:16: ( ( PLUS ^| MIN ^) arith5 )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==PLUS) ) {
					alt28=1;
				}
				else if ( (LA28_0==MIN) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:159:17: ( PLUS ^| MIN ^) arith5
					{
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:159:17: ( PLUS ^| MIN ^)
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==PLUS) ) {
						alt27=1;
					}
					else if ( (LA27_0==MIN) ) {
						alt27=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 27, 0, input);
						throw nvae;
					}

					switch (alt27) {
						case 1 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:159:18: PLUS ^
							{
							PLUS82=(Token)match(input,PLUS,FOLLOW_PLUS_in_arith41818); 
							PLUS82_tree = (Object)adaptor.create(PLUS82);
							root_0 = (Object)adaptor.becomeRoot(PLUS82_tree, root_0);

							}
							break;
						case 2 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:159:26: MIN ^
							{
							MIN83=(Token)match(input,MIN,FOLLOW_MIN_in_arith41823); 
							MIN83_tree = (Object)adaptor.create(MIN83);
							root_0 = (Object)adaptor.becomeRoot(MIN83_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_arith5_in_arith41827);
					arith584=arith5();
					state._fsp--;

					adaptor.addChild(root_0, arith584.getTree());

					}
					break;

				default :
					break loop28;
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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:162:1: arith5 : arith6 ( ( MULT ^| DIV ^| MOD ^) arith6 )* ;
	public final ChocolateParser.arith5_return arith5() throws RecognitionException {
		ChocolateParser.arith5_return retval = new ChocolateParser.arith5_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MULT86=null;
		Token DIV87=null;
		Token MOD88=null;
		ParserRuleReturnScope arith685 =null;
		ParserRuleReturnScope arith689 =null;

		Object MULT86_tree=null;
		Object DIV87_tree=null;
		Object MOD88_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:163:5: ( arith6 ( ( MULT ^| DIV ^| MOD ^) arith6 )* )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:163:9: arith6 ( ( MULT ^| DIV ^| MOD ^) arith6 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arith6_in_arith51858);
			arith685=arith6();
			state._fsp--;

			adaptor.addChild(root_0, arith685.getTree());

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:163:16: ( ( MULT ^| DIV ^| MOD ^) arith6 )*
			loop30:
			while (true) {
				int alt30=2;
				switch ( input.LA(1) ) {
				case MULT:
					{
					alt30=1;
					}
					break;
				case DIV:
					{
					alt30=1;
					}
					break;
				case MOD:
					{
					alt30=1;
					}
					break;
				}
				switch (alt30) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:163:17: ( MULT ^| DIV ^| MOD ^) arith6
					{
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:163:17: ( MULT ^| DIV ^| MOD ^)
					int alt29=3;
					switch ( input.LA(1) ) {
					case MULT:
						{
						alt29=1;
						}
						break;
					case DIV:
						{
						alt29=2;
						}
						break;
					case MOD:
						{
						alt29=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 29, 0, input);
						throw nvae;
					}
					switch (alt29) {
						case 1 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:163:18: MULT ^
							{
							MULT86=(Token)match(input,MULT,FOLLOW_MULT_in_arith51862); 
							MULT86_tree = (Object)adaptor.create(MULT86);
							root_0 = (Object)adaptor.becomeRoot(MULT86_tree, root_0);

							}
							break;
						case 2 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:163:26: DIV ^
							{
							DIV87=(Token)match(input,DIV,FOLLOW_DIV_in_arith51867); 
							DIV87_tree = (Object)adaptor.create(DIV87);
							root_0 = (Object)adaptor.becomeRoot(DIV87_tree, root_0);

							}
							break;
						case 3 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:163:33: MOD ^
							{
							MOD88=(Token)match(input,MOD,FOLLOW_MOD_in_arith51872); 
							MOD88_tree = (Object)adaptor.create(MOD88);
							root_0 = (Object)adaptor.becomeRoot(MOD88_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_arith6_in_arith51876);
					arith689=arith6();
					state._fsp--;

					adaptor.addChild(root_0, arith689.getTree());

					}
					break;

				default :
					break loop30;
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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:166:1: arith6 : ( ( PLUS ^| MIN ^| NOT ^)? operand ) ;
	public final ChocolateParser.arith6_return arith6() throws RecognitionException {
		ChocolateParser.arith6_return retval = new ChocolateParser.arith6_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS90=null;
		Token MIN91=null;
		Token NOT92=null;
		ParserRuleReturnScope operand93 =null;

		Object PLUS90_tree=null;
		Object MIN91_tree=null;
		Object NOT92_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:167:5: ( ( ( PLUS ^| MIN ^| NOT ^)? operand ) )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:167:9: ( ( PLUS ^| MIN ^| NOT ^)? operand )
			{
			root_0 = (Object)adaptor.nil();


			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:167:9: ( ( PLUS ^| MIN ^| NOT ^)? operand )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:167:10: ( PLUS ^| MIN ^| NOT ^)? operand
			{
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:167:10: ( PLUS ^| MIN ^| NOT ^)?
			int alt31=4;
			switch ( input.LA(1) ) {
				case PLUS:
					{
					alt31=1;
					}
					break;
				case MIN:
					{
					alt31=2;
					}
					break;
				case NOT:
					{
					alt31=3;
					}
					break;
			}
			switch (alt31) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:167:11: PLUS ^
					{
					PLUS90=(Token)match(input,PLUS,FOLLOW_PLUS_in_arith61911); 
					PLUS90_tree = (Object)adaptor.create(PLUS90);
					root_0 = (Object)adaptor.becomeRoot(PLUS90_tree, root_0);

					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:167:19: MIN ^
					{
					MIN91=(Token)match(input,MIN,FOLLOW_MIN_in_arith61916); 
					MIN91_tree = (Object)adaptor.create(MIN91);
					root_0 = (Object)adaptor.becomeRoot(MIN91_tree, root_0);

					}
					break;
				case 3 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:167:26: NOT ^
					{
					NOT92=(Token)match(input,NOT,FOLLOW_NOT_in_arith61921); 
					NOT92_tree = (Object)adaptor.create(NOT92);
					root_0 = (Object)adaptor.becomeRoot(NOT92_tree, root_0);

					}
					break;

			}

			pushFollow(FOLLOW_operand_in_arith61926);
			operand93=operand();
			state._fsp--;

			adaptor.addChild(root_0, operand93.getTree());

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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:170:1: ifelsethen : IF ^ single_expr THEN ! closed_compound_expr ( ELSE ! closed_compound_expr )? ;
	public final ChocolateParser.ifelsethen_return ifelsethen() throws RecognitionException {
		ChocolateParser.ifelsethen_return retval = new ChocolateParser.ifelsethen_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IF94=null;
		Token THEN96=null;
		Token ELSE98=null;
		ParserRuleReturnScope single_expr95 =null;
		ParserRuleReturnScope closed_compound_expr97 =null;
		ParserRuleReturnScope closed_compound_expr99 =null;

		Object IF94_tree=null;
		Object THEN96_tree=null;
		Object ELSE98_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:171:5: ( IF ^ single_expr THEN ! closed_compound_expr ( ELSE ! closed_compound_expr )? )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:171:9: IF ^ single_expr THEN ! closed_compound_expr ( ELSE ! closed_compound_expr )?
			{
			root_0 = (Object)adaptor.nil();


			IF94=(Token)match(input,IF,FOLLOW_IF_in_ifelsethen1950); 
			IF94_tree = (Object)adaptor.create(IF94);
			root_0 = (Object)adaptor.becomeRoot(IF94_tree, root_0);

			pushFollow(FOLLOW_single_expr_in_ifelsethen1953);
			single_expr95=single_expr();
			state._fsp--;

			adaptor.addChild(root_0, single_expr95.getTree());

			THEN96=(Token)match(input,THEN,FOLLOW_THEN_in_ifelsethen1955); 
			pushFollow(FOLLOW_closed_compound_expr_in_ifelsethen1958);
			closed_compound_expr97=closed_compound_expr();
			state._fsp--;

			adaptor.addChild(root_0, closed_compound_expr97.getTree());

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:171:52: ( ELSE ! closed_compound_expr )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==ELSE) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:171:53: ELSE ! closed_compound_expr
					{
					ELSE98=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifelsethen1961); 
					pushFollow(FOLLOW_closed_compound_expr_in_ifelsethen1964);
					closed_compound_expr99=closed_compound_expr();
					state._fsp--;

					adaptor.addChild(root_0, closed_compound_expr99.getTree());

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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:175:1: operand : ( IDENTIFIER | NUMBER | LPAREN ! single_expr RPAREN !| BOOLEAN_OPERATOR | CHAR_OPERATOR );
	public final ChocolateParser.operand_return operand() throws RecognitionException {
		ChocolateParser.operand_return retval = new ChocolateParser.operand_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER100=null;
		Token NUMBER101=null;
		Token LPAREN102=null;
		Token RPAREN104=null;
		Token BOOLEAN_OPERATOR105=null;
		Token CHAR_OPERATOR106=null;
		ParserRuleReturnScope single_expr103 =null;

		Object IDENTIFIER100_tree=null;
		Object NUMBER101_tree=null;
		Object LPAREN102_tree=null;
		Object RPAREN104_tree=null;
		Object BOOLEAN_OPERATOR105_tree=null;
		Object CHAR_OPERATOR106_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:176:5: ( IDENTIFIER | NUMBER | LPAREN ! single_expr RPAREN !| BOOLEAN_OPERATOR | CHAR_OPERATOR )
			int alt33=5;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt33=1;
				}
				break;
			case NUMBER:
				{
				alt33=2;
				}
				break;
			case LPAREN:
				{
				alt33=3;
				}
				break;
			case BOOLEAN_OPERATOR:
				{
				alt33=4;
				}
				break;
			case CHAR_OPERATOR:
				{
				alt33=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}
			switch (alt33) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:176:9: IDENTIFIER
					{
					root_0 = (Object)adaptor.nil();


					IDENTIFIER100=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand1986); 
					IDENTIFIER100_tree = (Object)adaptor.create(IDENTIFIER100);
					adaptor.addChild(root_0, IDENTIFIER100_tree);

					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:177:9: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER101=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_operand1996); 
					NUMBER101_tree = (Object)adaptor.create(NUMBER101);
					adaptor.addChild(root_0, NUMBER101_tree);

					}
					break;
				case 3 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:178:9: LPAREN ! single_expr RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					LPAREN102=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operand2006); 
					pushFollow(FOLLOW_single_expr_in_operand2009);
					single_expr103=single_expr();
					state._fsp--;

					adaptor.addChild(root_0, single_expr103.getTree());

					RPAREN104=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operand2011); 
					}
					break;
				case 4 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:179:9: BOOLEAN_OPERATOR
					{
					root_0 = (Object)adaptor.nil();


					BOOLEAN_OPERATOR105=(Token)match(input,BOOLEAN_OPERATOR,FOLLOW_BOOLEAN_OPERATOR_in_operand2022); 
					BOOLEAN_OPERATOR105_tree = (Object)adaptor.create(BOOLEAN_OPERATOR105);
					adaptor.addChild(root_0, BOOLEAN_OPERATOR105_tree);

					}
					break;
				case 5 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:180:9: CHAR_OPERATOR
					{
					root_0 = (Object)adaptor.nil();


					CHAR_OPERATOR106=(Token)match(input,CHAR_OPERATOR,FOLLOW_CHAR_OPERATOR_in_operand2032); 
					CHAR_OPERATOR106_tree = (Object)adaptor.create(CHAR_OPERATOR106);
					adaptor.addChild(root_0, CHAR_OPERATOR106_tree);

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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:183:1: type : ( INTEGER | CHAR | BOOLEAN );
	public final ChocolateParser.type_return type() throws RecognitionException {
		ChocolateParser.type_return retval = new ChocolateParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set107=null;

		Object set107_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:184:5: ( INTEGER | CHAR | BOOLEAN )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:
			{
			root_0 = (Object)adaptor.nil();


			set107=input.LT(1);
			if ( input.LA(1)==BOOLEAN||input.LA(1)==CHAR||input.LA(1)==INTEGER ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set107));
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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:187:1: string : DQUOTATION ! ( graphic )* DQUOTATION !;
	public final ChocolateParser.string_return string() throws RecognitionException {
		ChocolateParser.string_return retval = new ChocolateParser.string_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token DQUOTATION108=null;
		Token DQUOTATION110=null;
		ParserRuleReturnScope graphic109 =null;

		Object DQUOTATION108_tree=null;
		Object DQUOTATION110_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:188:5: ( DQUOTATION ! ( graphic )* DQUOTATION !)
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:188:9: DQUOTATION ! ( graphic )* DQUOTATION !
			{
			root_0 = (Object)adaptor.nil();


			DQUOTATION108=(Token)match(input,DQUOTATION,FOLLOW_DQUOTATION_in_string2082); 
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:188:21: ( graphic )*
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==DIGIT||LA34_0==LETTER) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:188:21: graphic
					{
					pushFollow(FOLLOW_graphic_in_string2085);
					graphic109=graphic();
					state._fsp--;

					adaptor.addChild(root_0, graphic109.getTree());

					}
					break;

				default :
					break loop34;
				}
			}

			DQUOTATION110=(Token)match(input,DQUOTATION,FOLLOW_DQUOTATION_in_string2088); 
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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:191:1: graphic : ( LETTER | DIGIT );
	public final ChocolateParser.graphic_return graphic() throws RecognitionException {
		ChocolateParser.graphic_return retval = new ChocolateParser.graphic_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set111=null;

		Object set111_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:192:5: ( LETTER | DIGIT )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:
			{
			root_0 = (Object)adaptor.nil();


			set111=input.LT(1);
			if ( input.LA(1)==DIGIT||input.LA(1)==LETTER ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set111));
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



	public static final BitSet FOLLOW_declarations_in_program1033 = new BitSet(new long[]{0x0002088000C02000L});
	public static final BitSet FOLLOW_statements_in_program1036 = new BitSet(new long[]{0x0002088000C02000L});
	public static final BitSet FOLLOW_EOF_in_program1040 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_declarations1103 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_declarations1105 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_declaration1127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_declaration1131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONSTANT_in_constant1158 = new BitSet(new long[]{0x0000000001000140L});
	public static final BitSet FOLLOW_type_in_constant1161 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_constant1163 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_ASSIGN_in_constant1166 = new BitSet(new long[]{0x00000054C2400280L});
	public static final BitSet FOLLOW_single_expr_in_constant1169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_closed_compound_expr_in_constant1173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_variable1199 = new BitSet(new long[]{0x0000000001000140L});
	public static final BitSet FOLLOW_type_in_variable1202 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_variable1204 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_ASSIGN_in_variable1207 = new BitSet(new long[]{0x00000054C2400280L});
	public static final BitSet FOLLOW_single_expr_in_variable1210 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_closed_compound_expr_in_variable1214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statements1238 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_statements1240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_in_statement1264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_in_statement1275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assign_in_statement1286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifelsethen_in_statement1299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read1318 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_LPAREN_in_read1321 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read1324 = new BitSet(new long[]{0x0000100000000800L});
	public static final BitSet FOLLOW_readmultiple_in_read1326 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_RPAREN_in_read1329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_readmultiple1353 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_readmultiple1356 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_readmultiple_in_readmultiple1358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_assign1378 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_assign1380 = new BitSet(new long[]{0x00000054C2400280L});
	public static final BitSet FOLLOW_assignchoice_in_assign1383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_assignchoice1406 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_ASSIGN_in_assignchoice1409 = new BitSet(new long[]{0x00000054C2400280L});
	public static final BitSet FOLLOW_assignchoice_in_assignchoice1412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_single_expr_in_assignchoice1424 = new BitSet(new long[]{0x0007FFFFFFBFFFF0L});
	public static final BitSet FOLLOW_set_in_assignchoice1425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_closed_compound_expr_in_assignchoice1437 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_assignmultiple1460 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_ASSIGN_in_assignmultiple1463 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_assignmultiple_in_assignmultiple1466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print1491 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_LPAREN_in_print1494 = new BitSet(new long[]{0x0000000002410000L});
	public static final BitSet FOLLOW_closed_compound_expr_in_print1498 = new BitSet(new long[]{0x0000100000000800L});
	public static final BitSet FOLLOW_string_in_print1502 = new BitSet(new long[]{0x0000100000000800L});
	public static final BitSet FOLLOW_IDENTIFIER_in_print1506 = new BitSet(new long[]{0x0000100000000800L});
	public static final BitSet FOLLOW_printmultiple_in_print1509 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_RPAREN_in_print1512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_printmultiple1536 = new BitSet(new long[]{0x0000000002410000L});
	public static final BitSet FOLLOW_closed_compound_expr_in_printmultiple1540 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_string_in_printmultiple1544 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_IDENTIFIER_in_printmultiple1548 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_printmultiple_in_printmultiple1551 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unclosed_compound_expr_in_compound_expr1576 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_closed_compound_expr_in_compound_expr1586 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declarations_in_unclosed_compound_expr1610 = new BitSet(new long[]{0x0002088000C02000L});
	public static final BitSet FOLLOW_statements_in_unclosed_compound_expr1613 = new BitSet(new long[]{0x0002088000C02002L});
	public static final BitSet FOLLOW_LCURLY_in_closed_compound_expr1635 = new BitSet(new long[]{0x0002088000C02000L});
	public static final BitSet FOLLOW_declarations_in_closed_compound_expr1639 = new BitSet(new long[]{0x0002088000C02000L});
	public static final BitSet FOLLOW_statements_in_closed_compound_expr1642 = new BitSet(new long[]{0x00020C8000C02000L});
	public static final BitSet FOLLOW_RCURLY_in_closed_compound_expr1646 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_in_single_expr1670 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arith2_in_arithmetic1689 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_OR_in_arithmetic1692 = new BitSet(new long[]{0x00000054C0400280L});
	public static final BitSet FOLLOW_arith2_in_arithmetic1695 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_arith3_in_arith21720 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_AND_in_arith21723 = new BitSet(new long[]{0x00000054C0400280L});
	public static final BitSet FOLLOW_arith3_in_arith21726 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_arith4_in_arith31751 = new BitSet(new long[]{0x000000080C340002L});
	public static final BitSet FOLLOW_LESS_in_arith31755 = new BitSet(new long[]{0x00000054C0400280L});
	public static final BitSet FOLLOW_LESSEQ_in_arith31760 = new BitSet(new long[]{0x00000054C0400280L});
	public static final BitSet FOLLOW_GREATEQ_in_arith31765 = new BitSet(new long[]{0x00000054C0400280L});
	public static final BitSet FOLLOW_GREAT_in_arith31770 = new BitSet(new long[]{0x00000054C0400280L});
	public static final BitSet FOLLOW_EQ_in_arith31775 = new BitSet(new long[]{0x00000054C0400280L});
	public static final BitSet FOLLOW_NOTEQ_in_arith31780 = new BitSet(new long[]{0x00000054C0400280L});
	public static final BitSet FOLLOW_arith4_in_arith31784 = new BitSet(new long[]{0x000000080C340002L});
	public static final BitSet FOLLOW_arith5_in_arith41814 = new BitSet(new long[]{0x0000004080000002L});
	public static final BitSet FOLLOW_PLUS_in_arith41818 = new BitSet(new long[]{0x00000054C0400280L});
	public static final BitSet FOLLOW_MIN_in_arith41823 = new BitSet(new long[]{0x00000054C0400280L});
	public static final BitSet FOLLOW_arith5_in_arith41827 = new BitSet(new long[]{0x0000004080000002L});
	public static final BitSet FOLLOW_arith6_in_arith51858 = new BitSet(new long[]{0x0000000300008002L});
	public static final BitSet FOLLOW_MULT_in_arith51862 = new BitSet(new long[]{0x00000054C0400280L});
	public static final BitSet FOLLOW_DIV_in_arith51867 = new BitSet(new long[]{0x00000054C0400280L});
	public static final BitSet FOLLOW_MOD_in_arith51872 = new BitSet(new long[]{0x00000054C0400280L});
	public static final BitSet FOLLOW_arith6_in_arith51876 = new BitSet(new long[]{0x0000000300008002L});
	public static final BitSet FOLLOW_PLUS_in_arith61911 = new BitSet(new long[]{0x0000001040400280L});
	public static final BitSet FOLLOW_MIN_in_arith61916 = new BitSet(new long[]{0x0000001040400280L});
	public static final BitSet FOLLOW_NOT_in_arith61921 = new BitSet(new long[]{0x0000001040400280L});
	public static final BitSet FOLLOW_operand_in_arith61926 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifelsethen1950 = new BitSet(new long[]{0x00000054C0400280L});
	public static final BitSet FOLLOW_single_expr_in_ifelsethen1953 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_THEN_in_ifelsethen1955 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_closed_compound_expr_in_ifelsethen1958 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_ELSE_in_ifelsethen1961 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_closed_compound_expr_in_ifelsethen1964 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand1986 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand1996 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand2006 = new BitSet(new long[]{0x00000054C0400280L});
	public static final BitSet FOLLOW_single_expr_in_operand2009 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_RPAREN_in_operand2011 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_OPERATOR_in_operand2022 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_OPERATOR_in_operand2032 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DQUOTATION_in_string2082 = new BitSet(new long[]{0x0000000010014000L});
	public static final BitSet FOLLOW_graphic_in_string2085 = new BitSet(new long[]{0x0000000010014000L});
	public static final BitSet FOLLOW_DQUOTATION_in_string2088 = new BitSet(new long[]{0x0000000000000002L});
}
