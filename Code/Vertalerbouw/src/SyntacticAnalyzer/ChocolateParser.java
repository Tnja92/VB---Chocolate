// $ANTLR 3.5 C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g 2013-06-30 23:07:49

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
	@Override public String getGrammarFileName() { return "C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g"; }


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:64:1: program : ( ( declarations )* statements )+ EOF -> ^( PROGRAM ( ( declarations )* statements )+ ) ;
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
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:65:5: ( ( ( declarations )* statements )+ EOF -> ^( PROGRAM ( ( declarations )* statements )+ ) )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:65:10: ( ( declarations )* statements )+ EOF
			{
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:65:10: ( ( declarations )* statements )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==BOOLEAN_OPERATOR||LA2_0==CHAR_OPERATOR||LA2_0==CONSTANT||(LA2_0 >= IDENTIFIER && LA2_0 <= IF)||(LA2_0 >= LPAREN && LA2_0 <= MIN)||LA2_0==NOT||LA2_0==NUMBER||(LA2_0 >= PLUS && LA2_0 <= PRINT)||(LA2_0 >= READ && LA2_0 <= THEN)||LA2_0==VAR) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:65:11: ( declarations )* statements
					{
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:65:11: ( declarations )*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( (LA1_0==CONSTANT||LA1_0==VAR) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:65:11: declarations
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
			// elements: declarations, statements
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
				// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:66:17: ^( PROGRAM ( ( declarations )* statements )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				if ( !(stream_statements.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_statements.hasNext() ) {
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:66:28: ( declarations )*
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


			pushFollow(FOLLOW_declaration_in_declarations1113);
			declaration4=declaration();
			state._fsp--;

			adaptor.addChild(root_0, declaration4.getTree());

			SEMICOLON5=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_declarations1115); 
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:74:1: declaration : ( constant | variable ) ;
	public final ChocolateParser.declaration_return declaration() throws RecognitionException {
		ChocolateParser.declaration_return retval = new ChocolateParser.declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope constant6 =null;
		ParserRuleReturnScope variable7 =null;


		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:75:5: ( ( constant | variable ) )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:75:9: ( constant | variable )
			{
			root_0 = (Object)adaptor.nil();


			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:75:9: ( constant | variable )
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
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:75:10: constant
					{
					pushFollow(FOLLOW_constant_in_declaration1137);
					constant6=constant();
					state._fsp--;

					adaptor.addChild(root_0, constant6.getTree());

					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:75:21: variable
					{
					pushFollow(FOLLOW_variable_in_declaration1141);
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:78:1: constant : CONSTANT ^ type IDENTIFIER ( ASSIGN ( single_expr | closed_compound_expr ) )? ;
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
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:79:5: ( CONSTANT ^ type IDENTIFIER ( ASSIGN ( single_expr | closed_compound_expr ) )? )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:79:9: CONSTANT ^ type IDENTIFIER ( ASSIGN ( single_expr | closed_compound_expr ) )?
			{
			root_0 = (Object)adaptor.nil();


			CONSTANT8=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_constant1168); 
			CONSTANT8_tree = (Object)adaptor.create(CONSTANT8);
			root_0 = (Object)adaptor.becomeRoot(CONSTANT8_tree, root_0);

			pushFollow(FOLLOW_type_in_constant1171);
			type9=type();
			state._fsp--;

			adaptor.addChild(root_0, type9.getTree());

			IDENTIFIER10=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant1173); 
			IDENTIFIER10_tree = (Object)adaptor.create(IDENTIFIER10);
			adaptor.addChild(root_0, IDENTIFIER10_tree);

			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:79:35: ( ASSIGN ( single_expr | closed_compound_expr ) )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ASSIGN) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:79:36: ASSIGN ( single_expr | closed_compound_expr )
					{
					ASSIGN11=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_constant1176); 
					ASSIGN11_tree = (Object)adaptor.create(ASSIGN11);
					adaptor.addChild(root_0, ASSIGN11_tree);

					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:79:43: ( single_expr | closed_compound_expr )
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==BOOLEAN_OPERATOR||LA4_0==CHAR_OPERATOR||LA4_0==IDENTIFIER||(LA4_0 >= LPAREN && LA4_0 <= MIN)||LA4_0==NOT||LA4_0==NUMBER||LA4_0==PLUS||(LA4_0 >= RPAREN && LA4_0 <= THEN)) ) {
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
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:79:44: single_expr
							{
							pushFollow(FOLLOW_single_expr_in_constant1179);
							single_expr12=single_expr();
							state._fsp--;

							adaptor.addChild(root_0, single_expr12.getTree());

							}
							break;
						case 2 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:79:58: closed_compound_expr
							{
							pushFollow(FOLLOW_closed_compound_expr_in_constant1183);
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:82:1: variable : VAR ^ type IDENTIFIER ( ASSIGN ( single_expr | closed_compound_expr ) )? ;
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
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:83:5: ( VAR ^ type IDENTIFIER ( ASSIGN ( single_expr | closed_compound_expr ) )? )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:83:9: VAR ^ type IDENTIFIER ( ASSIGN ( single_expr | closed_compound_expr ) )?
			{
			root_0 = (Object)adaptor.nil();


			VAR14=(Token)match(input,VAR,FOLLOW_VAR_in_variable1209); 
			VAR14_tree = (Object)adaptor.create(VAR14);
			root_0 = (Object)adaptor.becomeRoot(VAR14_tree, root_0);

			pushFollow(FOLLOW_type_in_variable1212);
			type15=type();
			state._fsp--;

			adaptor.addChild(root_0, type15.getTree());

			IDENTIFIER16=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variable1214); 
			IDENTIFIER16_tree = (Object)adaptor.create(IDENTIFIER16);
			adaptor.addChild(root_0, IDENTIFIER16_tree);

			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:83:30: ( ASSIGN ( single_expr | closed_compound_expr ) )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==ASSIGN) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:83:31: ASSIGN ( single_expr | closed_compound_expr )
					{
					ASSIGN17=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_variable1217); 
					ASSIGN17_tree = (Object)adaptor.create(ASSIGN17);
					adaptor.addChild(root_0, ASSIGN17_tree);

					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:83:38: ( single_expr | closed_compound_expr )
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==BOOLEAN_OPERATOR||LA6_0==CHAR_OPERATOR||LA6_0==IDENTIFIER||(LA6_0 >= LPAREN && LA6_0 <= MIN)||LA6_0==NOT||LA6_0==NUMBER||LA6_0==PLUS||(LA6_0 >= RPAREN && LA6_0 <= THEN)) ) {
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
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:83:39: single_expr
							{
							pushFollow(FOLLOW_single_expr_in_variable1220);
							single_expr18=single_expr();
							state._fsp--;

							adaptor.addChild(root_0, single_expr18.getTree());

							}
							break;
						case 2 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:83:53: closed_compound_expr
							{
							pushFollow(FOLLOW_closed_compound_expr_in_variable1224);
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:87:1: statements : statement SEMICOLON !;
	public final ChocolateParser.statements_return statements() throws RecognitionException {
		ChocolateParser.statements_return retval = new ChocolateParser.statements_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMICOLON21=null;
		ParserRuleReturnScope statement20 =null;

		Object SEMICOLON21_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:88:5: ( statement SEMICOLON !)
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:88:7: statement SEMICOLON !
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_statement_in_statements1248);
			statement20=statement();
			state._fsp--;

			adaptor.addChild(root_0, statement20.getTree());

			SEMICOLON21=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statements1250); 
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:91:1: statement : ( read | print | ifelsethen | single_expr );
	public final ChocolateParser.statement_return statement() throws RecognitionException {
		ChocolateParser.statement_return retval = new ChocolateParser.statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope read22 =null;
		ParserRuleReturnScope print23 =null;
		ParserRuleReturnScope ifelsethen24 =null;
		ParserRuleReturnScope single_expr25 =null;


		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:92:5: ( read | print | ifelsethen | single_expr )
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
			case IF:
				{
				alt8=3;
				}
				break;
			case BOOLEAN_OPERATOR:
			case CHAR_OPERATOR:
			case IDENTIFIER:
			case LPAREN:
			case MIN:
			case NOT:
			case NUMBER:
			case PLUS:
			case RPAREN:
			case SEMICOLON:
			case THEN:
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
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:92:9: read
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_read_in_statement1274);
					read22=read();
					state._fsp--;

					adaptor.addChild(root_0, read22.getTree());

					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:93:9: print
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_print_in_statement1285);
					print23=print();
					state._fsp--;

					adaptor.addChild(root_0, print23.getTree());

					}
					break;
				case 3 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:94:9: ifelsethen
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_ifelsethen_in_statement1295);
					ifelsethen24=ifelsethen();
					state._fsp--;

					adaptor.addChild(root_0, ifelsethen24.getTree());

					}
					break;
				case 4 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:95:9: single_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_single_expr_in_statement1305);
					single_expr25=single_expr();
					state._fsp--;

					adaptor.addChild(root_0, single_expr25.getTree());

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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:98:1: read : READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !;
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
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:99:5: ( READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !)
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:99:9: READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			READ26=(Token)match(input,READ,FOLLOW_READ_in_read1324); 
			READ26_tree = (Object)adaptor.create(READ26);
			root_0 = (Object)adaptor.becomeRoot(READ26_tree, root_0);

			LPAREN27=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_read1327); 
			IDENTIFIER28=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read1330); 
			IDENTIFIER28_tree = (Object)adaptor.create(IDENTIFIER28);
			adaptor.addChild(root_0, IDENTIFIER28_tree);

			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:99:34: ( COMMA ! IDENTIFIER )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==COMMA) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:99:35: COMMA ! IDENTIFIER
					{
					COMMA29=(Token)match(input,COMMA,FOLLOW_COMMA_in_read1333); 
					IDENTIFIER30=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read1336); 
					IDENTIFIER30_tree = (Object)adaptor.create(IDENTIFIER30);
					adaptor.addChild(root_0, IDENTIFIER30_tree);

					}
					break;

				default :
					break loop9;
				}
			}

			RPAREN31=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_read1340); 
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:102:1: assign : ( IDENTIFIER ASSIGN ^ ( IDENTIFIER ASSIGN ^)* ( single_expr | closed_compound_expr ) |);
	public final ChocolateParser.assign_return assign() throws RecognitionException {
		ChocolateParser.assign_return retval = new ChocolateParser.assign_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER32=null;
		Token ASSIGN33=null;
		Token IDENTIFIER34=null;
		Token ASSIGN35=null;
		ParserRuleReturnScope single_expr36 =null;
		ParserRuleReturnScope closed_compound_expr37 =null;

		Object IDENTIFIER32_tree=null;
		Object ASSIGN33_tree=null;
		Object IDENTIFIER34_tree=null;
		Object ASSIGN35_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:103:5: ( IDENTIFIER ASSIGN ^ ( IDENTIFIER ASSIGN ^)* ( single_expr | closed_compound_expr ) |)
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==IDENTIFIER) ) {
				alt12=1;
			}
			else if ( ((LA12_0 >= RPAREN && LA12_0 <= THEN)) ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:103:9: IDENTIFIER ASSIGN ^ ( IDENTIFIER ASSIGN ^)* ( single_expr | closed_compound_expr )
					{
					root_0 = (Object)adaptor.nil();


					IDENTIFIER32=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assign1360); 
					IDENTIFIER32_tree = (Object)adaptor.create(IDENTIFIER32);
					adaptor.addChild(root_0, IDENTIFIER32_tree);

					ASSIGN33=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign1362); 
					ASSIGN33_tree = (Object)adaptor.create(ASSIGN33);
					root_0 = (Object)adaptor.becomeRoot(ASSIGN33_tree, root_0);

					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:103:28: ( IDENTIFIER ASSIGN ^)*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==IDENTIFIER) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:103:29: IDENTIFIER ASSIGN ^
							{
							IDENTIFIER34=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assign1366); 
							IDENTIFIER34_tree = (Object)adaptor.create(IDENTIFIER34);
							adaptor.addChild(root_0, IDENTIFIER34_tree);

							ASSIGN35=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign1368); 
							ASSIGN35_tree = (Object)adaptor.create(ASSIGN35);
							root_0 = (Object)adaptor.becomeRoot(ASSIGN35_tree, root_0);

							}
							break;

						default :
							break loop10;
						}
					}

					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:103:50: ( single_expr | closed_compound_expr )
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==BOOLEAN_OPERATOR||LA11_0==CHAR_OPERATOR||LA11_0==IDENTIFIER||(LA11_0 >= LPAREN && LA11_0 <= MIN)||LA11_0==NOT||LA11_0==NUMBER||LA11_0==PLUS||(LA11_0 >= RPAREN && LA11_0 <= THEN)) ) {
						alt11=1;
					}
					else if ( (LA11_0==LCURLY) ) {
						alt11=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 11, 0, input);
						throw nvae;
					}

					switch (alt11) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:103:51: single_expr
							{
							pushFollow(FOLLOW_single_expr_in_assign1374);
							single_expr36=single_expr();
							state._fsp--;

							adaptor.addChild(root_0, single_expr36.getTree());

							}
							break;
						case 2 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:103:65: closed_compound_expr
							{
							pushFollow(FOLLOW_closed_compound_expr_in_assign1378);
							closed_compound_expr37=closed_compound_expr();
							state._fsp--;

							adaptor.addChild(root_0, closed_compound_expr37.getTree());

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:105:5: 
					{
					root_0 = (Object)adaptor.nil();


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
	// $ANTLR end "assign"


	public static class print_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "print"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:107:1: print : PRINT ^ LPAREN ! ( unclosed_compound_expr | string ) ( COMMA ! ( unclosed_compound_expr | string ) )* RPAREN !;
	public final ChocolateParser.print_return print() throws RecognitionException {
		ChocolateParser.print_return retval = new ChocolateParser.print_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PRINT38=null;
		Token LPAREN39=null;
		Token COMMA42=null;
		Token RPAREN45=null;
		ParserRuleReturnScope unclosed_compound_expr40 =null;
		ParserRuleReturnScope string41 =null;
		ParserRuleReturnScope unclosed_compound_expr43 =null;
		ParserRuleReturnScope string44 =null;

		Object PRINT38_tree=null;
		Object LPAREN39_tree=null;
		Object COMMA42_tree=null;
		Object RPAREN45_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:108:5: ( PRINT ^ LPAREN ! ( unclosed_compound_expr | string ) ( COMMA ! ( unclosed_compound_expr | string ) )* RPAREN !)
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:108:9: PRINT ^ LPAREN ! ( unclosed_compound_expr | string ) ( COMMA ! ( unclosed_compound_expr | string ) )* RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			PRINT38=(Token)match(input,PRINT,FOLLOW_PRINT_in_print1408); 
			PRINT38_tree = (Object)adaptor.create(PRINT38);
			root_0 = (Object)adaptor.becomeRoot(PRINT38_tree, root_0);

			LPAREN39=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_print1411); 
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:108:24: ( unclosed_compound_expr | string )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==BOOLEAN_OPERATOR||LA13_0==CHAR_OPERATOR||LA13_0==CONSTANT||(LA13_0 >= IDENTIFIER && LA13_0 <= IF)||(LA13_0 >= LPAREN && LA13_0 <= MIN)||LA13_0==NOT||LA13_0==NUMBER||(LA13_0 >= PLUS && LA13_0 <= PRINT)||(LA13_0 >= READ && LA13_0 <= THEN)||LA13_0==VAR) ) {
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
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:108:25: unclosed_compound_expr
					{
					pushFollow(FOLLOW_unclosed_compound_expr_in_print1415);
					unclosed_compound_expr40=unclosed_compound_expr();
					state._fsp--;

					adaptor.addChild(root_0, unclosed_compound_expr40.getTree());

					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:108:50: string
					{
					pushFollow(FOLLOW_string_in_print1419);
					string41=string();
					state._fsp--;

					adaptor.addChild(root_0, string41.getTree());

					}
					break;

			}

			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:108:58: ( COMMA ! ( unclosed_compound_expr | string ) )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==COMMA) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:108:59: COMMA ! ( unclosed_compound_expr | string )
					{
					COMMA42=(Token)match(input,COMMA,FOLLOW_COMMA_in_print1423); 
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:108:66: ( unclosed_compound_expr | string )
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==BOOLEAN_OPERATOR||LA14_0==CHAR_OPERATOR||LA14_0==CONSTANT||(LA14_0 >= IDENTIFIER && LA14_0 <= IF)||(LA14_0 >= LPAREN && LA14_0 <= MIN)||LA14_0==NOT||LA14_0==NUMBER||(LA14_0 >= PLUS && LA14_0 <= PRINT)||(LA14_0 >= READ && LA14_0 <= THEN)||LA14_0==VAR) ) {
						alt14=1;
					}
					else if ( (LA14_0==DQUOTATION) ) {
						alt14=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 14, 0, input);
						throw nvae;
					}

					switch (alt14) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:108:67: unclosed_compound_expr
							{
							pushFollow(FOLLOW_unclosed_compound_expr_in_print1427);
							unclosed_compound_expr43=unclosed_compound_expr();
							state._fsp--;

							adaptor.addChild(root_0, unclosed_compound_expr43.getTree());

							}
							break;
						case 2 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:108:92: string
							{
							pushFollow(FOLLOW_string_in_print1431);
							string44=string();
							state._fsp--;

							adaptor.addChild(root_0, string44.getTree());

							}
							break;

					}

					}
					break;

				default :
					break loop15;
				}
			}

			RPAREN45=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_print1436); 
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:112:1: compound_expr : ( unclosed_compound_expr | closed_compound_expr );
	public final ChocolateParser.compound_expr_return compound_expr() throws RecognitionException {
		ChocolateParser.compound_expr_return retval = new ChocolateParser.compound_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope unclosed_compound_expr46 =null;
		ParserRuleReturnScope closed_compound_expr47 =null;


		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:113:5: ( unclosed_compound_expr | closed_compound_expr )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==BOOLEAN_OPERATOR||LA16_0==CHAR_OPERATOR||LA16_0==CONSTANT||(LA16_0 >= IDENTIFIER && LA16_0 <= IF)||(LA16_0 >= LPAREN && LA16_0 <= MIN)||LA16_0==NOT||LA16_0==NUMBER||(LA16_0 >= PLUS && LA16_0 <= PRINT)||(LA16_0 >= READ && LA16_0 <= THEN)||LA16_0==VAR) ) {
				alt16=1;
			}
			else if ( (LA16_0==LCURLY) ) {
				alt16=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:113:9: unclosed_compound_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_unclosed_compound_expr_in_compound_expr1461);
					unclosed_compound_expr46=unclosed_compound_expr();
					state._fsp--;

					adaptor.addChild(root_0, unclosed_compound_expr46.getTree());

					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:114:9: closed_compound_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_closed_compound_expr_in_compound_expr1471);
					closed_compound_expr47=closed_compound_expr();
					state._fsp--;

					adaptor.addChild(root_0, closed_compound_expr47.getTree());

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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:117:1: unclosed_compound_expr : ( ( declarations )* statements )+ ;
	public final ChocolateParser.unclosed_compound_expr_return unclosed_compound_expr() throws RecognitionException {
		ChocolateParser.unclosed_compound_expr_return retval = new ChocolateParser.unclosed_compound_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope declarations48 =null;
		ParserRuleReturnScope statements49 =null;


		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:118:5: ( ( ( declarations )* statements )+ )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:118:9: ( ( declarations )* statements )+
			{
			root_0 = (Object)adaptor.nil();


			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:118:9: ( ( declarations )* statements )+
			int cnt18=0;
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==BOOLEAN_OPERATOR||LA18_0==CHAR_OPERATOR||LA18_0==CONSTANT||(LA18_0 >= IDENTIFIER && LA18_0 <= IF)||(LA18_0 >= LPAREN && LA18_0 <= MIN)||LA18_0==NOT||LA18_0==NUMBER||(LA18_0 >= PLUS && LA18_0 <= PRINT)||LA18_0==READ||LA18_0==SEMICOLON||LA18_0==VAR) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:118:10: ( declarations )* statements
					{
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:118:10: ( declarations )*
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0==CONSTANT||LA17_0==VAR) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:118:10: declarations
							{
							pushFollow(FOLLOW_declarations_in_unclosed_compound_expr1495);
							declarations48=declarations();
							state._fsp--;

							adaptor.addChild(root_0, declarations48.getTree());

							}
							break;

						default :
							break loop17;
						}
					}

					pushFollow(FOLLOW_statements_in_unclosed_compound_expr1498);
					statements49=statements();
					state._fsp--;

					adaptor.addChild(root_0, statements49.getTree());

					}
					break;

				default :
					if ( cnt18 >= 1 ) break loop18;
					EarlyExitException eee = new EarlyExitException(18, input);
					throw eee;
				}
				cnt18++;
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:121:1: closed_compound_expr : LCURLY ! ( ( declarations )* statements )+ RCURLY !;
	public final ChocolateParser.closed_compound_expr_return closed_compound_expr() throws RecognitionException {
		ChocolateParser.closed_compound_expr_return retval = new ChocolateParser.closed_compound_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LCURLY50=null;
		Token RCURLY53=null;
		ParserRuleReturnScope declarations51 =null;
		ParserRuleReturnScope statements52 =null;

		Object LCURLY50_tree=null;
		Object RCURLY53_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:122:5: ( LCURLY ! ( ( declarations )* statements )+ RCURLY !)
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:122:9: LCURLY ! ( ( declarations )* statements )+ RCURLY !
			{
			root_0 = (Object)adaptor.nil();


			LCURLY50=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_closed_compound_expr1520); 
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:122:17: ( ( declarations )* statements )+
			int cnt20=0;
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==BOOLEAN_OPERATOR||LA20_0==CHAR_OPERATOR||LA20_0==CONSTANT||(LA20_0 >= IDENTIFIER && LA20_0 <= IF)||(LA20_0 >= LPAREN && LA20_0 <= MIN)||LA20_0==NOT||LA20_0==NUMBER||(LA20_0 >= PLUS && LA20_0 <= PRINT)||(LA20_0 >= READ && LA20_0 <= THEN)||LA20_0==VAR) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:122:18: ( declarations )* statements
					{
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:122:18: ( declarations )*
					loop19:
					while (true) {
						int alt19=2;
						int LA19_0 = input.LA(1);
						if ( (LA19_0==CONSTANT||LA19_0==VAR) ) {
							alt19=1;
						}

						switch (alt19) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:122:18: declarations
							{
							pushFollow(FOLLOW_declarations_in_closed_compound_expr1524);
							declarations51=declarations();
							state._fsp--;

							adaptor.addChild(root_0, declarations51.getTree());

							}
							break;

						default :
							break loop19;
						}
					}

					pushFollow(FOLLOW_statements_in_closed_compound_expr1527);
					statements52=statements();
					state._fsp--;

					adaptor.addChild(root_0, statements52.getTree());

					}
					break;

				default :
					if ( cnt20 >= 1 ) break loop20;
					EarlyExitException eee = new EarlyExitException(20, input);
					throw eee;
				}
				cnt20++;
			}

			RCURLY53=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_closed_compound_expr1531); 
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:125:1: single_expr : ( arithmetic | assign );
	public final ChocolateParser.single_expr_return single_expr() throws RecognitionException {
		ChocolateParser.single_expr_return retval = new ChocolateParser.single_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope arithmetic54 =null;
		ParserRuleReturnScope assign55 =null;


		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:126:5: ( arithmetic | assign )
			int alt21=2;
			switch ( input.LA(1) ) {
			case BOOLEAN_OPERATOR:
			case CHAR_OPERATOR:
			case LPAREN:
			case MIN:
			case NOT:
			case NUMBER:
			case PLUS:
				{
				alt21=1;
				}
				break;
			case IDENTIFIER:
				{
				alt21=1;
				}
				break;
			case RPAREN:
			case SEMICOLON:
			case THEN:
				{
				alt21=2;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}
			switch (alt21) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:126:9: arithmetic
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_arithmetic_in_single_expr1555);
					arithmetic54=arithmetic();
					state._fsp--;

					adaptor.addChild(root_0, arithmetic54.getTree());

					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:127:9: assign
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_assign_in_single_expr1565);
					assign55=assign();
					state._fsp--;

					adaptor.addChild(root_0, assign55.getTree());

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
	// $ANTLR end "single_expr"


	public static class arithmetic_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arithmetic"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:130:1: arithmetic : arith2 ( OR ^ arith2 )* ;
	public final ChocolateParser.arithmetic_return arithmetic() throws RecognitionException {
		ChocolateParser.arithmetic_return retval = new ChocolateParser.arithmetic_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token OR57=null;
		ParserRuleReturnScope arith256 =null;
		ParserRuleReturnScope arith258 =null;

		Object OR57_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:131:5: ( arith2 ( OR ^ arith2 )* )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:131:9: arith2 ( OR ^ arith2 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arith2_in_arithmetic1584);
			arith256=arith2();
			state._fsp--;

			adaptor.addChild(root_0, arith256.getTree());

			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:131:16: ( OR ^ arith2 )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==OR) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:131:17: OR ^ arith2
					{
					OR57=(Token)match(input,OR,FOLLOW_OR_in_arithmetic1587); 
					OR57_tree = (Object)adaptor.create(OR57);
					root_0 = (Object)adaptor.becomeRoot(OR57_tree, root_0);

					pushFollow(FOLLOW_arith2_in_arithmetic1590);
					arith258=arith2();
					state._fsp--;

					adaptor.addChild(root_0, arith258.getTree());

					}
					break;

				default :
					break loop22;
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:134:1: arith2 : arith3 ( AND ^ arith3 )* ;
	public final ChocolateParser.arith2_return arith2() throws RecognitionException {
		ChocolateParser.arith2_return retval = new ChocolateParser.arith2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AND60=null;
		ParserRuleReturnScope arith359 =null;
		ParserRuleReturnScope arith361 =null;

		Object AND60_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:135:5: ( arith3 ( AND ^ arith3 )* )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:135:9: arith3 ( AND ^ arith3 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arith3_in_arith21615);
			arith359=arith3();
			state._fsp--;

			adaptor.addChild(root_0, arith359.getTree());

			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:135:16: ( AND ^ arith3 )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==AND) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:135:17: AND ^ arith3
					{
					AND60=(Token)match(input,AND,FOLLOW_AND_in_arith21618); 
					AND60_tree = (Object)adaptor.create(AND60);
					root_0 = (Object)adaptor.becomeRoot(AND60_tree, root_0);

					pushFollow(FOLLOW_arith3_in_arith21621);
					arith361=arith3();
					state._fsp--;

					adaptor.addChild(root_0, arith361.getTree());

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
	// $ANTLR end "arith2"


	public static class arith3_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arith3"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:138:1: arith3 : arith4 ( ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^) arith4 )* ;
	public final ChocolateParser.arith3_return arith3() throws RecognitionException {
		ChocolateParser.arith3_return retval = new ChocolateParser.arith3_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LESS63=null;
		Token LESSEQ64=null;
		Token GREATEQ65=null;
		Token GREAT66=null;
		Token EQ67=null;
		Token NOTEQ68=null;
		ParserRuleReturnScope arith462 =null;
		ParserRuleReturnScope arith469 =null;

		Object LESS63_tree=null;
		Object LESSEQ64_tree=null;
		Object GREATEQ65_tree=null;
		Object GREAT66_tree=null;
		Object EQ67_tree=null;
		Object NOTEQ68_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:139:5: ( arith4 ( ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^) arith4 )* )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:139:9: arith4 ( ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^) arith4 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arith4_in_arith31646);
			arith462=arith4();
			state._fsp--;

			adaptor.addChild(root_0, arith462.getTree());

			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:139:16: ( ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^) arith4 )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==EQ||(LA25_0 >= GREAT && LA25_0 <= GREATEQ)||(LA25_0 >= LESS && LA25_0 <= LESSEQ)||LA25_0==NOTEQ) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:139:17: ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^) arith4
					{
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:139:17: ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^)
					int alt24=6;
					switch ( input.LA(1) ) {
					case LESS:
						{
						alt24=1;
						}
						break;
					case LESSEQ:
						{
						alt24=2;
						}
						break;
					case GREATEQ:
						{
						alt24=3;
						}
						break;
					case GREAT:
						{
						alt24=4;
						}
						break;
					case EQ:
						{
						alt24=5;
						}
						break;
					case NOTEQ:
						{
						alt24=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 24, 0, input);
						throw nvae;
					}
					switch (alt24) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:139:18: LESS ^
							{
							LESS63=(Token)match(input,LESS,FOLLOW_LESS_in_arith31650); 
							LESS63_tree = (Object)adaptor.create(LESS63);
							root_0 = (Object)adaptor.becomeRoot(LESS63_tree, root_0);

							}
							break;
						case 2 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:139:26: LESSEQ ^
							{
							LESSEQ64=(Token)match(input,LESSEQ,FOLLOW_LESSEQ_in_arith31655); 
							LESSEQ64_tree = (Object)adaptor.create(LESSEQ64);
							root_0 = (Object)adaptor.becomeRoot(LESSEQ64_tree, root_0);

							}
							break;
						case 3 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:139:36: GREATEQ ^
							{
							GREATEQ65=(Token)match(input,GREATEQ,FOLLOW_GREATEQ_in_arith31660); 
							GREATEQ65_tree = (Object)adaptor.create(GREATEQ65);
							root_0 = (Object)adaptor.becomeRoot(GREATEQ65_tree, root_0);

							}
							break;
						case 4 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:139:47: GREAT ^
							{
							GREAT66=(Token)match(input,GREAT,FOLLOW_GREAT_in_arith31665); 
							GREAT66_tree = (Object)adaptor.create(GREAT66);
							root_0 = (Object)adaptor.becomeRoot(GREAT66_tree, root_0);

							}
							break;
						case 5 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:139:56: EQ ^
							{
							EQ67=(Token)match(input,EQ,FOLLOW_EQ_in_arith31670); 
							EQ67_tree = (Object)adaptor.create(EQ67);
							root_0 = (Object)adaptor.becomeRoot(EQ67_tree, root_0);

							}
							break;
						case 6 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:139:62: NOTEQ ^
							{
							NOTEQ68=(Token)match(input,NOTEQ,FOLLOW_NOTEQ_in_arith31675); 
							NOTEQ68_tree = (Object)adaptor.create(NOTEQ68);
							root_0 = (Object)adaptor.becomeRoot(NOTEQ68_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_arith4_in_arith31679);
					arith469=arith4();
					state._fsp--;

					adaptor.addChild(root_0, arith469.getTree());

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
	// $ANTLR end "arith3"


	public static class arith4_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arith4"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:142:1: arith4 : arith5 ( ( PLUS ^| MIN ^) arith5 )* ;
	public final ChocolateParser.arith4_return arith4() throws RecognitionException {
		ChocolateParser.arith4_return retval = new ChocolateParser.arith4_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS71=null;
		Token MIN72=null;
		ParserRuleReturnScope arith570 =null;
		ParserRuleReturnScope arith573 =null;

		Object PLUS71_tree=null;
		Object MIN72_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:143:5: ( arith5 ( ( PLUS ^| MIN ^) arith5 )* )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:143:9: arith5 ( ( PLUS ^| MIN ^) arith5 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arith5_in_arith41709);
			arith570=arith5();
			state._fsp--;

			adaptor.addChild(root_0, arith570.getTree());

			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:143:16: ( ( PLUS ^| MIN ^) arith5 )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==MIN||LA27_0==PLUS) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:143:17: ( PLUS ^| MIN ^) arith5
					{
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:143:17: ( PLUS ^| MIN ^)
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==PLUS) ) {
						alt26=1;
					}
					else if ( (LA26_0==MIN) ) {
						alt26=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 26, 0, input);
						throw nvae;
					}

					switch (alt26) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:143:18: PLUS ^
							{
							PLUS71=(Token)match(input,PLUS,FOLLOW_PLUS_in_arith41713); 
							PLUS71_tree = (Object)adaptor.create(PLUS71);
							root_0 = (Object)adaptor.becomeRoot(PLUS71_tree, root_0);

							}
							break;
						case 2 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:143:26: MIN ^
							{
							MIN72=(Token)match(input,MIN,FOLLOW_MIN_in_arith41718); 
							MIN72_tree = (Object)adaptor.create(MIN72);
							root_0 = (Object)adaptor.becomeRoot(MIN72_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_arith5_in_arith41722);
					arith573=arith5();
					state._fsp--;

					adaptor.addChild(root_0, arith573.getTree());

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
	// $ANTLR end "arith4"


	public static class arith5_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arith5"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:146:1: arith5 : arith6 ( ( MULT ^| DIV ^| MOD ^) arith6 )* ;
	public final ChocolateParser.arith5_return arith5() throws RecognitionException {
		ChocolateParser.arith5_return retval = new ChocolateParser.arith5_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MULT75=null;
		Token DIV76=null;
		Token MOD77=null;
		ParserRuleReturnScope arith674 =null;
		ParserRuleReturnScope arith678 =null;

		Object MULT75_tree=null;
		Object DIV76_tree=null;
		Object MOD77_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:147:5: ( arith6 ( ( MULT ^| DIV ^| MOD ^) arith6 )* )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:147:9: arith6 ( ( MULT ^| DIV ^| MOD ^) arith6 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arith6_in_arith51753);
			arith674=arith6();
			state._fsp--;

			adaptor.addChild(root_0, arith674.getTree());

			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:147:16: ( ( MULT ^| DIV ^| MOD ^) arith6 )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==DIV||(LA29_0 >= MOD && LA29_0 <= MULT)) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:147:17: ( MULT ^| DIV ^| MOD ^) arith6
					{
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:147:17: ( MULT ^| DIV ^| MOD ^)
					int alt28=3;
					switch ( input.LA(1) ) {
					case MULT:
						{
						alt28=1;
						}
						break;
					case DIV:
						{
						alt28=2;
						}
						break;
					case MOD:
						{
						alt28=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 28, 0, input);
						throw nvae;
					}
					switch (alt28) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:147:18: MULT ^
							{
							MULT75=(Token)match(input,MULT,FOLLOW_MULT_in_arith51757); 
							MULT75_tree = (Object)adaptor.create(MULT75);
							root_0 = (Object)adaptor.becomeRoot(MULT75_tree, root_0);

							}
							break;
						case 2 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:147:26: DIV ^
							{
							DIV76=(Token)match(input,DIV,FOLLOW_DIV_in_arith51762); 
							DIV76_tree = (Object)adaptor.create(DIV76);
							root_0 = (Object)adaptor.becomeRoot(DIV76_tree, root_0);

							}
							break;
						case 3 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:147:33: MOD ^
							{
							MOD77=(Token)match(input,MOD,FOLLOW_MOD_in_arith51767); 
							MOD77_tree = (Object)adaptor.create(MOD77);
							root_0 = (Object)adaptor.becomeRoot(MOD77_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_arith6_in_arith51771);
					arith678=arith6();
					state._fsp--;

					adaptor.addChild(root_0, arith678.getTree());

					}
					break;

				default :
					break loop29;
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:150:1: arith6 : ( ( PLUS ^| MIN ^| NOT ^)? operand ) ;
	public final ChocolateParser.arith6_return arith6() throws RecognitionException {
		ChocolateParser.arith6_return retval = new ChocolateParser.arith6_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS79=null;
		Token MIN80=null;
		Token NOT81=null;
		ParserRuleReturnScope operand82 =null;

		Object PLUS79_tree=null;
		Object MIN80_tree=null;
		Object NOT81_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:151:5: ( ( ( PLUS ^| MIN ^| NOT ^)? operand ) )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:151:9: ( ( PLUS ^| MIN ^| NOT ^)? operand )
			{
			root_0 = (Object)adaptor.nil();


			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:151:9: ( ( PLUS ^| MIN ^| NOT ^)? operand )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:151:10: ( PLUS ^| MIN ^| NOT ^)? operand
			{
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:151:10: ( PLUS ^| MIN ^| NOT ^)?
			int alt30=4;
			switch ( input.LA(1) ) {
				case PLUS:
					{
					alt30=1;
					}
					break;
				case MIN:
					{
					alt30=2;
					}
					break;
				case NOT:
					{
					alt30=3;
					}
					break;
			}
			switch (alt30) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:151:11: PLUS ^
					{
					PLUS79=(Token)match(input,PLUS,FOLLOW_PLUS_in_arith61806); 
					PLUS79_tree = (Object)adaptor.create(PLUS79);
					root_0 = (Object)adaptor.becomeRoot(PLUS79_tree, root_0);

					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:151:19: MIN ^
					{
					MIN80=(Token)match(input,MIN,FOLLOW_MIN_in_arith61811); 
					MIN80_tree = (Object)adaptor.create(MIN80);
					root_0 = (Object)adaptor.becomeRoot(MIN80_tree, root_0);

					}
					break;
				case 3 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:151:26: NOT ^
					{
					NOT81=(Token)match(input,NOT,FOLLOW_NOT_in_arith61816); 
					NOT81_tree = (Object)adaptor.create(NOT81);
					root_0 = (Object)adaptor.becomeRoot(NOT81_tree, root_0);

					}
					break;

			}

			pushFollow(FOLLOW_operand_in_arith61821);
			operand82=operand();
			state._fsp--;

			adaptor.addChild(root_0, operand82.getTree());

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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:154:1: ifelsethen : IF ^ single_expr THEN ! LCURLY ! unclosed_compound_expr RCURLY ! ( ELSE ! LCURLY ! unclosed_compound_expr RCURLY !)? ;
	public final ChocolateParser.ifelsethen_return ifelsethen() throws RecognitionException {
		ChocolateParser.ifelsethen_return retval = new ChocolateParser.ifelsethen_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IF83=null;
		Token THEN85=null;
		Token LCURLY86=null;
		Token RCURLY88=null;
		Token ELSE89=null;
		Token LCURLY90=null;
		Token RCURLY92=null;
		ParserRuleReturnScope single_expr84 =null;
		ParserRuleReturnScope unclosed_compound_expr87 =null;
		ParserRuleReturnScope unclosed_compound_expr91 =null;

		Object IF83_tree=null;
		Object THEN85_tree=null;
		Object LCURLY86_tree=null;
		Object RCURLY88_tree=null;
		Object ELSE89_tree=null;
		Object LCURLY90_tree=null;
		Object RCURLY92_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:155:5: ( IF ^ single_expr THEN ! LCURLY ! unclosed_compound_expr RCURLY ! ( ELSE ! LCURLY ! unclosed_compound_expr RCURLY !)? )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:155:9: IF ^ single_expr THEN ! LCURLY ! unclosed_compound_expr RCURLY ! ( ELSE ! LCURLY ! unclosed_compound_expr RCURLY !)?
			{
			root_0 = (Object)adaptor.nil();


			IF83=(Token)match(input,IF,FOLLOW_IF_in_ifelsethen1845); 
			IF83_tree = (Object)adaptor.create(IF83);
			root_0 = (Object)adaptor.becomeRoot(IF83_tree, root_0);

			pushFollow(FOLLOW_single_expr_in_ifelsethen1848);
			single_expr84=single_expr();
			state._fsp--;

			adaptor.addChild(root_0, single_expr84.getTree());

			THEN85=(Token)match(input,THEN,FOLLOW_THEN_in_ifelsethen1850); 
			LCURLY86=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_ifelsethen1853); 
			pushFollow(FOLLOW_unclosed_compound_expr_in_ifelsethen1856);
			unclosed_compound_expr87=unclosed_compound_expr();
			state._fsp--;

			adaptor.addChild(root_0, unclosed_compound_expr87.getTree());

			RCURLY88=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_ifelsethen1858); 
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:155:70: ( ELSE ! LCURLY ! unclosed_compound_expr RCURLY !)?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==ELSE) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:155:71: ELSE ! LCURLY ! unclosed_compound_expr RCURLY !
					{
					ELSE89=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifelsethen1862); 
					LCURLY90=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_ifelsethen1865); 
					pushFollow(FOLLOW_unclosed_compound_expr_in_ifelsethen1868);
					unclosed_compound_expr91=unclosed_compound_expr();
					state._fsp--;

					adaptor.addChild(root_0, unclosed_compound_expr91.getTree());

					RCURLY92=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_ifelsethen1870); 
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:159:1: operand : ( IDENTIFIER | NUMBER | LPAREN ! single_expr RPAREN !| BOOLEAN_OPERATOR | CHAR_OPERATOR );
	public final ChocolateParser.operand_return operand() throws RecognitionException {
		ChocolateParser.operand_return retval = new ChocolateParser.operand_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER93=null;
		Token NUMBER94=null;
		Token LPAREN95=null;
		Token RPAREN97=null;
		Token BOOLEAN_OPERATOR98=null;
		Token CHAR_OPERATOR99=null;
		ParserRuleReturnScope single_expr96 =null;

		Object IDENTIFIER93_tree=null;
		Object NUMBER94_tree=null;
		Object LPAREN95_tree=null;
		Object RPAREN97_tree=null;
		Object BOOLEAN_OPERATOR98_tree=null;
		Object CHAR_OPERATOR99_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:160:5: ( IDENTIFIER | NUMBER | LPAREN ! single_expr RPAREN !| BOOLEAN_OPERATOR | CHAR_OPERATOR )
			int alt32=5;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt32=1;
				}
				break;
			case NUMBER:
				{
				alt32=2;
				}
				break;
			case LPAREN:
				{
				alt32=3;
				}
				break;
			case BOOLEAN_OPERATOR:
				{
				alt32=4;
				}
				break;
			case CHAR_OPERATOR:
				{
				alt32=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}
			switch (alt32) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:160:9: IDENTIFIER
					{
					root_0 = (Object)adaptor.nil();


					IDENTIFIER93=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand1893); 
					IDENTIFIER93_tree = (Object)adaptor.create(IDENTIFIER93);
					adaptor.addChild(root_0, IDENTIFIER93_tree);

					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:161:9: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER94=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_operand1903); 
					NUMBER94_tree = (Object)adaptor.create(NUMBER94);
					adaptor.addChild(root_0, NUMBER94_tree);

					}
					break;
				case 3 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:162:9: LPAREN ! single_expr RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					LPAREN95=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operand1913); 
					pushFollow(FOLLOW_single_expr_in_operand1916);
					single_expr96=single_expr();
					state._fsp--;

					adaptor.addChild(root_0, single_expr96.getTree());

					RPAREN97=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operand1918); 
					}
					break;
				case 4 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:163:9: BOOLEAN_OPERATOR
					{
					root_0 = (Object)adaptor.nil();


					BOOLEAN_OPERATOR98=(Token)match(input,BOOLEAN_OPERATOR,FOLLOW_BOOLEAN_OPERATOR_in_operand1929); 
					BOOLEAN_OPERATOR98_tree = (Object)adaptor.create(BOOLEAN_OPERATOR98);
					adaptor.addChild(root_0, BOOLEAN_OPERATOR98_tree);

					}
					break;
				case 5 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:164:9: CHAR_OPERATOR
					{
					root_0 = (Object)adaptor.nil();


					CHAR_OPERATOR99=(Token)match(input,CHAR_OPERATOR,FOLLOW_CHAR_OPERATOR_in_operand1939); 
					CHAR_OPERATOR99_tree = (Object)adaptor.create(CHAR_OPERATOR99);
					adaptor.addChild(root_0, CHAR_OPERATOR99_tree);

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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:167:1: type : ( INTEGER | CHAR | BOOLEAN );
	public final ChocolateParser.type_return type() throws RecognitionException {
		ChocolateParser.type_return retval = new ChocolateParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set100=null;

		Object set100_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:168:5: ( INTEGER | CHAR | BOOLEAN )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:
			{
			root_0 = (Object)adaptor.nil();


			set100=input.LT(1);
			if ( input.LA(1)==BOOLEAN||input.LA(1)==CHAR||input.LA(1)==INTEGER ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set100));
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:171:1: string : DQUOTATION ! ( graphic )* DQUOTATION !;
	public final ChocolateParser.string_return string() throws RecognitionException {
		ChocolateParser.string_return retval = new ChocolateParser.string_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token DQUOTATION101=null;
		Token DQUOTATION103=null;
		ParserRuleReturnScope graphic102 =null;

		Object DQUOTATION101_tree=null;
		Object DQUOTATION103_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:172:5: ( DQUOTATION ! ( graphic )* DQUOTATION !)
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:172:9: DQUOTATION ! ( graphic )* DQUOTATION !
			{
			root_0 = (Object)adaptor.nil();


			DQUOTATION101=(Token)match(input,DQUOTATION,FOLLOW_DQUOTATION_in_string1989); 
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:172:21: ( graphic )*
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==DIGIT||LA33_0==LETTER) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:172:21: graphic
					{
					pushFollow(FOLLOW_graphic_in_string1992);
					graphic102=graphic();
					state._fsp--;

					adaptor.addChild(root_0, graphic102.getTree());

					}
					break;

				default :
					break loop33;
				}
			}

			DQUOTATION103=(Token)match(input,DQUOTATION,FOLLOW_DQUOTATION_in_string1995); 
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:175:1: graphic : ( LETTER | DIGIT );
	public final ChocolateParser.graphic_return graphic() throws RecognitionException {
		ChocolateParser.graphic_return retval = new ChocolateParser.graphic_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set104=null;

		Object set104_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:176:5: ( LETTER | DIGIT )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:
			{
			root_0 = (Object)adaptor.nil();


			set104=input.LT(1);
			if ( input.LA(1)==DIGIT||input.LA(1)==LETTER ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set104));
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



	public static final BitSet FOLLOW_declarations_in_program1055 = new BitSet(new long[]{0x000411A981804500L});
	public static final BitSet FOLLOW_statements_in_program1058 = new BitSet(new long[]{0x000411A981804500L});
	public static final BitSet FOLLOW_EOF_in_program1062 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_declarations1113 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_declarations1115 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_declaration1137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_declaration1141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONSTANT_in_constant1168 = new BitSet(new long[]{0x0000000002000280L});
	public static final BitSet FOLLOW_type_in_constant1171 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_constant1173 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_ASSIGN_in_constant1176 = new BitSet(new long[]{0x000000A984800500L});
	public static final BitSet FOLLOW_single_expr_in_constant1179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_closed_compound_expr_in_constant1183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_variable1209 = new BitSet(new long[]{0x0000000002000280L});
	public static final BitSet FOLLOW_type_in_variable1212 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_variable1214 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_ASSIGN_in_variable1217 = new BitSet(new long[]{0x000000A984800500L});
	public static final BitSet FOLLOW_single_expr_in_variable1220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_closed_compound_expr_in_variable1224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statements1248 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_statements1250 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_in_statement1274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_in_statement1285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifelsethen_in_statement1295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_single_expr_in_statement1305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read1324 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_LPAREN_in_read1327 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read1330 = new BitSet(new long[]{0x0000200000001000L});
	public static final BitSet FOLLOW_COMMA_in_read1333 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read1336 = new BitSet(new long[]{0x0000200000001000L});
	public static final BitSet FOLLOW_RPAREN_in_read1340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_assign1360 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_assign1362 = new BitSet(new long[]{0x000000A984800500L});
	public static final BitSet FOLLOW_IDENTIFIER_in_assign1366 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_assign1368 = new BitSet(new long[]{0x000000A984800500L});
	public static final BitSet FOLLOW_single_expr_in_assign1374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_closed_compound_expr_in_assign1378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print1408 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_LPAREN_in_print1411 = new BitSet(new long[]{0x000411A981824500L});
	public static final BitSet FOLLOW_unclosed_compound_expr_in_print1415 = new BitSet(new long[]{0x0000200000001000L});
	public static final BitSet FOLLOW_string_in_print1419 = new BitSet(new long[]{0x0000200000001000L});
	public static final BitSet FOLLOW_COMMA_in_print1423 = new BitSet(new long[]{0x000411A981824500L});
	public static final BitSet FOLLOW_unclosed_compound_expr_in_print1427 = new BitSet(new long[]{0x0000200000001000L});
	public static final BitSet FOLLOW_string_in_print1431 = new BitSet(new long[]{0x0000200000001000L});
	public static final BitSet FOLLOW_RPAREN_in_print1436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unclosed_compound_expr_in_compound_expr1461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_closed_compound_expr_in_compound_expr1471 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declarations_in_unclosed_compound_expr1495 = new BitSet(new long[]{0x000411A981804500L});
	public static final BitSet FOLLOW_statements_in_unclosed_compound_expr1498 = new BitSet(new long[]{0x000411A981804502L});
	public static final BitSet FOLLOW_LCURLY_in_closed_compound_expr1520 = new BitSet(new long[]{0x000411A981804500L});
	public static final BitSet FOLLOW_declarations_in_closed_compound_expr1524 = new BitSet(new long[]{0x000411A981804500L});
	public static final BitSet FOLLOW_statements_in_closed_compound_expr1527 = new BitSet(new long[]{0x000419A981804500L});
	public static final BitSet FOLLOW_RCURLY_in_closed_compound_expr1531 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_in_single_expr1555 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assign_in_single_expr1565 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arith2_in_arithmetic1584 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_OR_in_arithmetic1587 = new BitSet(new long[]{0x000000A980800500L});
	public static final BitSet FOLLOW_arith2_in_arithmetic1590 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_arith3_in_arith21615 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_AND_in_arith21618 = new BitSet(new long[]{0x000000A980800500L});
	public static final BitSet FOLLOW_arith3_in_arith21621 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_arith4_in_arith31646 = new BitSet(new long[]{0x0000001018680002L});
	public static final BitSet FOLLOW_LESS_in_arith31650 = new BitSet(new long[]{0x000000A980800500L});
	public static final BitSet FOLLOW_LESSEQ_in_arith31655 = new BitSet(new long[]{0x000000A980800500L});
	public static final BitSet FOLLOW_GREATEQ_in_arith31660 = new BitSet(new long[]{0x000000A980800500L});
	public static final BitSet FOLLOW_GREAT_in_arith31665 = new BitSet(new long[]{0x000000A980800500L});
	public static final BitSet FOLLOW_EQ_in_arith31670 = new BitSet(new long[]{0x000000A980800500L});
	public static final BitSet FOLLOW_NOTEQ_in_arith31675 = new BitSet(new long[]{0x000000A980800500L});
	public static final BitSet FOLLOW_arith4_in_arith31679 = new BitSet(new long[]{0x0000001018680002L});
	public static final BitSet FOLLOW_arith5_in_arith41709 = new BitSet(new long[]{0x0000008100000002L});
	public static final BitSet FOLLOW_PLUS_in_arith41713 = new BitSet(new long[]{0x000000A980800500L});
	public static final BitSet FOLLOW_MIN_in_arith41718 = new BitSet(new long[]{0x000000A980800500L});
	public static final BitSet FOLLOW_arith5_in_arith41722 = new BitSet(new long[]{0x0000008100000002L});
	public static final BitSet FOLLOW_arith6_in_arith51753 = new BitSet(new long[]{0x0000000600010002L});
	public static final BitSet FOLLOW_MULT_in_arith51757 = new BitSet(new long[]{0x000000A980800500L});
	public static final BitSet FOLLOW_DIV_in_arith51762 = new BitSet(new long[]{0x000000A980800500L});
	public static final BitSet FOLLOW_MOD_in_arith51767 = new BitSet(new long[]{0x000000A980800500L});
	public static final BitSet FOLLOW_arith6_in_arith51771 = new BitSet(new long[]{0x0000000600010002L});
	public static final BitSet FOLLOW_PLUS_in_arith61806 = new BitSet(new long[]{0x0000002080800500L});
	public static final BitSet FOLLOW_MIN_in_arith61811 = new BitSet(new long[]{0x0000002080800500L});
	public static final BitSet FOLLOW_NOT_in_arith61816 = new BitSet(new long[]{0x0000002080800500L});
	public static final BitSet FOLLOW_operand_in_arith61821 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifelsethen1845 = new BitSet(new long[]{0x000000A980800500L});
	public static final BitSet FOLLOW_single_expr_in_ifelsethen1848 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_THEN_in_ifelsethen1850 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LCURLY_in_ifelsethen1853 = new BitSet(new long[]{0x000411A981804500L});
	public static final BitSet FOLLOW_unclosed_compound_expr_in_ifelsethen1856 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_RCURLY_in_ifelsethen1858 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_ELSE_in_ifelsethen1862 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LCURLY_in_ifelsethen1865 = new BitSet(new long[]{0x000411A981804500L});
	public static final BitSet FOLLOW_unclosed_compound_expr_in_ifelsethen1868 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_RCURLY_in_ifelsethen1870 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand1893 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand1903 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand1913 = new BitSet(new long[]{0x000000A980800500L});
	public static final BitSet FOLLOW_single_expr_in_operand1916 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_RPAREN_in_operand1918 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_OPERATOR_in_operand1929 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_OPERATOR_in_operand1939 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DQUOTATION_in_string1989 = new BitSet(new long[]{0x0000000020028000L});
	public static final BitSet FOLLOW_graphic_in_string1992 = new BitSet(new long[]{0x0000000020028000L});
	public static final BitSet FOLLOW_DQUOTATION_in_string1995 = new BitSet(new long[]{0x0000000000000002L});
}
