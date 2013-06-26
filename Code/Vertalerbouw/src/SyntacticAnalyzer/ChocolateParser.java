// $ANTLR 3.5 C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g 2013-06-26 20:49:24

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
		"CHAR", "COLON", "COMMA", "COMMENT", "CONSTANT", "DIGIT", "DIV", "DQUOTATION", 
		"ELSE", "EQ", "GREAT", "GREATEQ", "IDENTIFIER", "IF", "INTEGER", "LCURLY", 
		"LESS", "LESSEQ", "LETTER", "LOWER", "LPAREN", "MIN", "MOD", "MULT", "NOT", 
		"NOTEQ", "NUMBER", "OR", "PLUS", "PRINT", "PROGRAM", "RCURLY", "READ", 
		"RPAREN", "SEMICOLON", "THEN", "UPPER", "VAR", "WS"
	};
	public static final int EOF=-1;
	public static final int AND=4;
	public static final int ASSIGN=5;
	public static final int BECOMES=6;
	public static final int BOOLEAN=7;
	public static final int CHAR=8;
	public static final int COLON=9;
	public static final int COMMA=10;
	public static final int COMMENT=11;
	public static final int CONSTANT=12;
	public static final int DIGIT=13;
	public static final int DIV=14;
	public static final int DQUOTATION=15;
	public static final int ELSE=16;
	public static final int EQ=17;
	public static final int GREAT=18;
	public static final int GREATEQ=19;
	public static final int IDENTIFIER=20;
	public static final int IF=21;
	public static final int INTEGER=22;
	public static final int LCURLY=23;
	public static final int LESS=24;
	public static final int LESSEQ=25;
	public static final int LETTER=26;
	public static final int LOWER=27;
	public static final int LPAREN=28;
	public static final int MIN=29;
	public static final int MOD=30;
	public static final int MULT=31;
	public static final int NOT=32;
	public static final int NOTEQ=33;
	public static final int NUMBER=34;
	public static final int OR=35;
	public static final int PLUS=36;
	public static final int PRINT=37;
	public static final int PROGRAM=38;
	public static final int RCURLY=39;
	public static final int READ=40;
	public static final int RPAREN=41;
	public static final int SEMICOLON=42;
	public static final int THEN=43;
	public static final int UPPER=44;
	public static final int VAR=45;
	public static final int WS=46;

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
							pushFollow(FOLLOW_declarations_in_program985);
							declarations1=declarations();
							state._fsp--;

							stream_declarations.add(declarations1.getTree());
							}
							break;

						default :
							break loop1;
						}
					}

					pushFollow(FOLLOW_statements_in_program988);
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

			EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_program992);  
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


			pushFollow(FOLLOW_declaration_in_declarations1055);
			declaration4=declaration();
			state._fsp--;

			adaptor.addChild(root_0, declaration4.getTree());

			SEMICOLON5=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_declarations1057); 
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
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:73:10: constant
					{
					pushFollow(FOLLOW_constant_in_declaration1079);
					constant6=constant();
					state._fsp--;

					adaptor.addChild(root_0, constant6.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:73:21: variable
					{
					pushFollow(FOLLOW_variable_in_declaration1083);
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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:76:1: constant : CONSTANT ^ type IDENTIFIER ( ASSIGN ( single_expr | closed_compound_expr ) )? ;
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
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:77:5: ( CONSTANT ^ type IDENTIFIER ( ASSIGN ( single_expr | closed_compound_expr ) )? )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:77:9: CONSTANT ^ type IDENTIFIER ( ASSIGN ( single_expr | closed_compound_expr ) )?
			{
			root_0 = (Object)adaptor.nil();


			CONSTANT8=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_constant1110); 
			CONSTANT8_tree = (Object)adaptor.create(CONSTANT8);
			root_0 = (Object)adaptor.becomeRoot(CONSTANT8_tree, root_0);

			pushFollow(FOLLOW_type_in_constant1113);
			type9=type();
			state._fsp--;

			adaptor.addChild(root_0, type9.getTree());

			IDENTIFIER10=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant1115); 
			IDENTIFIER10_tree = (Object)adaptor.create(IDENTIFIER10);
			adaptor.addChild(root_0, IDENTIFIER10_tree);

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:77:35: ( ASSIGN ( single_expr | closed_compound_expr ) )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ASSIGN) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:77:36: ASSIGN ( single_expr | closed_compound_expr )
					{
					ASSIGN11=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_constant1118); 
					ASSIGN11_tree = (Object)adaptor.create(ASSIGN11);
					adaptor.addChild(root_0, ASSIGN11_tree);

					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:77:43: ( single_expr | closed_compound_expr )
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==IDENTIFIER||(LA4_0 >= LPAREN && LA4_0 <= MIN)||LA4_0==NOT||LA4_0==NUMBER||LA4_0==PLUS) ) {
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
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:77:44: single_expr
							{
							pushFollow(FOLLOW_single_expr_in_constant1121);
							single_expr12=single_expr();
							state._fsp--;

							adaptor.addChild(root_0, single_expr12.getTree());

							}
							break;
						case 2 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:77:58: closed_compound_expr
							{
							pushFollow(FOLLOW_closed_compound_expr_in_constant1125);
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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:80:1: variable : VAR ^ type IDENTIFIER ( ASSIGN ( single_expr | closed_compound_expr ) )? ;
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
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:81:5: ( VAR ^ type IDENTIFIER ( ASSIGN ( single_expr | closed_compound_expr ) )? )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:81:9: VAR ^ type IDENTIFIER ( ASSIGN ( single_expr | closed_compound_expr ) )?
			{
			root_0 = (Object)adaptor.nil();


			VAR14=(Token)match(input,VAR,FOLLOW_VAR_in_variable1151); 
			VAR14_tree = (Object)adaptor.create(VAR14);
			root_0 = (Object)adaptor.becomeRoot(VAR14_tree, root_0);

			pushFollow(FOLLOW_type_in_variable1154);
			type15=type();
			state._fsp--;

			adaptor.addChild(root_0, type15.getTree());

			IDENTIFIER16=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variable1156); 
			IDENTIFIER16_tree = (Object)adaptor.create(IDENTIFIER16);
			adaptor.addChild(root_0, IDENTIFIER16_tree);

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:81:30: ( ASSIGN ( single_expr | closed_compound_expr ) )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==ASSIGN) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:81:31: ASSIGN ( single_expr | closed_compound_expr )
					{
					ASSIGN17=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_variable1159); 
					ASSIGN17_tree = (Object)adaptor.create(ASSIGN17);
					adaptor.addChild(root_0, ASSIGN17_tree);

					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:81:38: ( single_expr | closed_compound_expr )
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==IDENTIFIER||(LA6_0 >= LPAREN && LA6_0 <= MIN)||LA6_0==NOT||LA6_0==NUMBER||LA6_0==PLUS) ) {
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
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:81:39: single_expr
							{
							pushFollow(FOLLOW_single_expr_in_variable1162);
							single_expr18=single_expr();
							state._fsp--;

							adaptor.addChild(root_0, single_expr18.getTree());

							}
							break;
						case 2 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:81:53: closed_compound_expr
							{
							pushFollow(FOLLOW_closed_compound_expr_in_variable1166);
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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:85:1: statements : statement SEMICOLON !;
	public final ChocolateParser.statements_return statements() throws RecognitionException {
		ChocolateParser.statements_return retval = new ChocolateParser.statements_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMICOLON21=null;
		ParserRuleReturnScope statement20 =null;

		Object SEMICOLON21_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:86:5: ( statement SEMICOLON !)
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:86:7: statement SEMICOLON !
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_statement_in_statements1190);
			statement20=statement();
			state._fsp--;

			adaptor.addChild(root_0, statement20.getTree());

			SEMICOLON21=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statements1192); 
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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:89:1: statement : ( read | print | assign | ifelsethen );
	public final ChocolateParser.statement_return statement() throws RecognitionException {
		ChocolateParser.statement_return retval = new ChocolateParser.statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope read22 =null;
		ParserRuleReturnScope print23 =null;
		ParserRuleReturnScope assign24 =null;
		ParserRuleReturnScope ifelsethen25 =null;


		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:90:5: ( read | print | assign | ifelsethen )
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
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:90:9: read
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_read_in_statement1216);
					read22=read();
					state._fsp--;

					adaptor.addChild(root_0, read22.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:91:9: print
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_print_in_statement1227);
					print23=print();
					state._fsp--;

					adaptor.addChild(root_0, print23.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:92:9: assign
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_assign_in_statement1238);
					assign24=assign();
					state._fsp--;

					adaptor.addChild(root_0, assign24.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:93:9: ifelsethen
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_ifelsethen_in_statement1251);
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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:96:1: read : READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !;
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
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:97:5: ( READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !)
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:97:9: READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			READ26=(Token)match(input,READ,FOLLOW_READ_in_read1270); 
			READ26_tree = (Object)adaptor.create(READ26);
			root_0 = (Object)adaptor.becomeRoot(READ26_tree, root_0);

			LPAREN27=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_read1273); 
			IDENTIFIER28=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read1276); 
			IDENTIFIER28_tree = (Object)adaptor.create(IDENTIFIER28);
			adaptor.addChild(root_0, IDENTIFIER28_tree);

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:97:34: ( COMMA ! IDENTIFIER )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==COMMA) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:97:35: COMMA ! IDENTIFIER
					{
					COMMA29=(Token)match(input,COMMA,FOLLOW_COMMA_in_read1279); 
					IDENTIFIER30=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read1282); 
					IDENTIFIER30_tree = (Object)adaptor.create(IDENTIFIER30);
					adaptor.addChild(root_0, IDENTIFIER30_tree);

					}
					break;

				default :
					break loop9;
				}
			}

			RPAREN31=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_read1286); 
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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:100:1: assign : IDENTIFIER ASSIGN ^ ( options {greedy=true; } : assign2 ) ;
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
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:101:5: ( IDENTIFIER ASSIGN ^ ( options {greedy=true; } : assign2 ) )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:101:9: IDENTIFIER ASSIGN ^ ( options {greedy=true; } : assign2 )
			{
			root_0 = (Object)adaptor.nil();


			IDENTIFIER32=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assign1306); 
			IDENTIFIER32_tree = (Object)adaptor.create(IDENTIFIER32);
			adaptor.addChild(root_0, IDENTIFIER32_tree);

			ASSIGN33=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign1308); 
			ASSIGN33_tree = (Object)adaptor.create(ASSIGN33);
			root_0 = (Object)adaptor.becomeRoot(ASSIGN33_tree, root_0);

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:101:28: ( options {greedy=true; } : assign2 )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:101:53: assign2
			{
			pushFollow(FOLLOW_assign2_in_assign1321);
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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:104:1: assign2 : ( IDENTIFIER ( ASSIGN ^ assign2 )? | single_expr | closed_compound_expr );
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
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:105:5: ( IDENTIFIER ( ASSIGN ^ assign2 )? | single_expr | closed_compound_expr )
			int alt11=3;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt11=1;
				}
				break;
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
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:105:9: IDENTIFIER ( ASSIGN ^ assign2 )?
					{
					root_0 = (Object)adaptor.nil();


					IDENTIFIER35=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assign21345); 
					IDENTIFIER35_tree = (Object)adaptor.create(IDENTIFIER35);
					adaptor.addChild(root_0, IDENTIFIER35_tree);

					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:105:20: ( ASSIGN ^ assign2 )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==ASSIGN) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:105:21: ASSIGN ^ assign2
							{
							ASSIGN36=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign21348); 
							ASSIGN36_tree = (Object)adaptor.create(ASSIGN36);
							root_0 = (Object)adaptor.becomeRoot(ASSIGN36_tree, root_0);

							pushFollow(FOLLOW_assign2_in_assign21351);
							assign237=assign2();
							state._fsp--;

							adaptor.addChild(root_0, assign237.getTree());

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:106:9: single_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_single_expr_in_assign21363);
					single_expr38=single_expr();
					state._fsp--;

					adaptor.addChild(root_0, single_expr38.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:107:9: closed_compound_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_closed_compound_expr_in_assign21373);
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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:110:1: print : PRINT ^ LPAREN ! ( unclosed_compound_expr | string ) ( COMMA ! ( unclosed_compound_expr | string ) )* RPAREN !;
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
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:111:5: ( PRINT ^ LPAREN ! ( unclosed_compound_expr | string ) ( COMMA ! ( unclosed_compound_expr | string ) )* RPAREN !)
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:111:9: PRINT ^ LPAREN ! ( unclosed_compound_expr | string ) ( COMMA ! ( unclosed_compound_expr | string ) )* RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			PRINT40=(Token)match(input,PRINT,FOLLOW_PRINT_in_print1396); 
			PRINT40_tree = (Object)adaptor.create(PRINT40);
			root_0 = (Object)adaptor.becomeRoot(PRINT40_tree, root_0);

			LPAREN41=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_print1399); 
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:111:24: ( unclosed_compound_expr | string )
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
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:111:25: unclosed_compound_expr
					{
					pushFollow(FOLLOW_unclosed_compound_expr_in_print1403);
					unclosed_compound_expr42=unclosed_compound_expr();
					state._fsp--;

					adaptor.addChild(root_0, unclosed_compound_expr42.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:111:50: string
					{
					pushFollow(FOLLOW_string_in_print1407);
					string43=string();
					state._fsp--;

					adaptor.addChild(root_0, string43.getTree());

					}
					break;

			}

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:111:58: ( COMMA ! ( unclosed_compound_expr | string ) )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==COMMA) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:111:59: COMMA ! ( unclosed_compound_expr | string )
					{
					COMMA44=(Token)match(input,COMMA,FOLLOW_COMMA_in_print1411); 
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:111:66: ( unclosed_compound_expr | string )
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
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:111:67: unclosed_compound_expr
							{
							pushFollow(FOLLOW_unclosed_compound_expr_in_print1415);
							unclosed_compound_expr45=unclosed_compound_expr();
							state._fsp--;

							adaptor.addChild(root_0, unclosed_compound_expr45.getTree());

							}
							break;
						case 2 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:111:92: string
							{
							pushFollow(FOLLOW_string_in_print1419);
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

			RPAREN47=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_print1424); 
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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:115:1: compound_expr : ( unclosed_compound_expr | closed_compound_expr );
	public final ChocolateParser.compound_expr_return compound_expr() throws RecognitionException {
		ChocolateParser.compound_expr_return retval = new ChocolateParser.compound_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope unclosed_compound_expr48 =null;
		ParserRuleReturnScope closed_compound_expr49 =null;


		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:116:5: ( unclosed_compound_expr | closed_compound_expr )
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
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:116:9: unclosed_compound_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_unclosed_compound_expr_in_compound_expr1449);
					unclosed_compound_expr48=unclosed_compound_expr();
					state._fsp--;

					adaptor.addChild(root_0, unclosed_compound_expr48.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:117:9: closed_compound_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_closed_compound_expr_in_compound_expr1459);
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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:120:1: unclosed_compound_expr : ( ( declarations )* statements )+ ;
	public final ChocolateParser.unclosed_compound_expr_return unclosed_compound_expr() throws RecognitionException {
		ChocolateParser.unclosed_compound_expr_return retval = new ChocolateParser.unclosed_compound_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope declarations50 =null;
		ParserRuleReturnScope statements51 =null;


		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:121:5: ( ( ( declarations )* statements )+ )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:121:9: ( ( declarations )* statements )+
			{
			root_0 = (Object)adaptor.nil();


			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:121:9: ( ( declarations )* statements )+
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
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:121:10: ( declarations )* statements
					{
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:121:10: ( declarations )*
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( (LA16_0==CONSTANT||LA16_0==VAR) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:121:10: declarations
							{
							pushFollow(FOLLOW_declarations_in_unclosed_compound_expr1483);
							declarations50=declarations();
							state._fsp--;

							adaptor.addChild(root_0, declarations50.getTree());

							}
							break;

						default :
							break loop16;
						}
					}

					pushFollow(FOLLOW_statements_in_unclosed_compound_expr1486);
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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:124:1: closed_compound_expr : LCURLY ! ( ( declarations )* statements )+ RCURLY !;
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
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:125:5: ( LCURLY ! ( ( declarations )* statements )+ RCURLY !)
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:125:9: LCURLY ! ( ( declarations )* statements )+ RCURLY !
			{
			root_0 = (Object)adaptor.nil();


			LCURLY52=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_closed_compound_expr1508); 
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:125:17: ( ( declarations )* statements )+
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
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:125:18: ( declarations )* statements
					{
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:125:18: ( declarations )*
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( (LA18_0==CONSTANT||LA18_0==VAR) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:125:18: declarations
							{
							pushFollow(FOLLOW_declarations_in_closed_compound_expr1512);
							declarations53=declarations();
							state._fsp--;

							adaptor.addChild(root_0, declarations53.getTree());

							}
							break;

						default :
							break loop18;
						}
					}

					pushFollow(FOLLOW_statements_in_closed_compound_expr1515);
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

			RCURLY55=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_closed_compound_expr1519); 
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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:128:1: single_expr : arithmetic ;
	public final ChocolateParser.single_expr_return single_expr() throws RecognitionException {
		ChocolateParser.single_expr_return retval = new ChocolateParser.single_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope arithmetic56 =null;


		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:129:5: ( arithmetic )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:129:9: arithmetic
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_in_single_expr1543);
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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:132:1: arithmetic : arith2 ( OR ^ arith2 )* ;
	public final ChocolateParser.arithmetic_return arithmetic() throws RecognitionException {
		ChocolateParser.arithmetic_return retval = new ChocolateParser.arithmetic_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token OR58=null;
		ParserRuleReturnScope arith257 =null;
		ParserRuleReturnScope arith259 =null;

		Object OR58_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:133:5: ( arith2 ( OR ^ arith2 )* )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:133:9: arith2 ( OR ^ arith2 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arith2_in_arithmetic1562);
			arith257=arith2();
			state._fsp--;

			adaptor.addChild(root_0, arith257.getTree());

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:133:16: ( OR ^ arith2 )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==OR) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:133:17: OR ^ arith2
					{
					OR58=(Token)match(input,OR,FOLLOW_OR_in_arithmetic1565); 
					OR58_tree = (Object)adaptor.create(OR58);
					root_0 = (Object)adaptor.becomeRoot(OR58_tree, root_0);

					pushFollow(FOLLOW_arith2_in_arithmetic1568);
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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:136:1: arith2 : arith3 ( AND ^ arith3 )* ;
	public final ChocolateParser.arith2_return arith2() throws RecognitionException {
		ChocolateParser.arith2_return retval = new ChocolateParser.arith2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AND61=null;
		ParserRuleReturnScope arith360 =null;
		ParserRuleReturnScope arith362 =null;

		Object AND61_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:137:5: ( arith3 ( AND ^ arith3 )* )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:137:9: arith3 ( AND ^ arith3 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arith3_in_arith21593);
			arith360=arith3();
			state._fsp--;

			adaptor.addChild(root_0, arith360.getTree());

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:137:16: ( AND ^ arith3 )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==AND) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:137:17: AND ^ arith3
					{
					AND61=(Token)match(input,AND,FOLLOW_AND_in_arith21596); 
					AND61_tree = (Object)adaptor.create(AND61);
					root_0 = (Object)adaptor.becomeRoot(AND61_tree, root_0);

					pushFollow(FOLLOW_arith3_in_arith21599);
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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:140:1: arith3 : arith4 ( ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^) arith4 )* ;
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
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:141:5: ( arith4 ( ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^) arith4 )* )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:141:9: arith4 ( ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^) arith4 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arith4_in_arith31624);
			arith463=arith4();
			state._fsp--;

			adaptor.addChild(root_0, arith463.getTree());

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:141:16: ( ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^) arith4 )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( ((LA23_0 >= EQ && LA23_0 <= GREATEQ)||(LA23_0 >= LESS && LA23_0 <= LESSEQ)||LA23_0==NOTEQ) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:141:17: ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^) arith4
					{
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:141:17: ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^)
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
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:141:18: LESS ^
							{
							LESS64=(Token)match(input,LESS,FOLLOW_LESS_in_arith31628); 
							LESS64_tree = (Object)adaptor.create(LESS64);
							root_0 = (Object)adaptor.becomeRoot(LESS64_tree, root_0);

							}
							break;
						case 2 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:141:26: LESSEQ ^
							{
							LESSEQ65=(Token)match(input,LESSEQ,FOLLOW_LESSEQ_in_arith31633); 
							LESSEQ65_tree = (Object)adaptor.create(LESSEQ65);
							root_0 = (Object)adaptor.becomeRoot(LESSEQ65_tree, root_0);

							}
							break;
						case 3 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:141:36: GREATEQ ^
							{
							GREATEQ66=(Token)match(input,GREATEQ,FOLLOW_GREATEQ_in_arith31638); 
							GREATEQ66_tree = (Object)adaptor.create(GREATEQ66);
							root_0 = (Object)adaptor.becomeRoot(GREATEQ66_tree, root_0);

							}
							break;
						case 4 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:141:47: GREAT ^
							{
							GREAT67=(Token)match(input,GREAT,FOLLOW_GREAT_in_arith31643); 
							GREAT67_tree = (Object)adaptor.create(GREAT67);
							root_0 = (Object)adaptor.becomeRoot(GREAT67_tree, root_0);

							}
							break;
						case 5 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:141:56: EQ ^
							{
							EQ68=(Token)match(input,EQ,FOLLOW_EQ_in_arith31648); 
							EQ68_tree = (Object)adaptor.create(EQ68);
							root_0 = (Object)adaptor.becomeRoot(EQ68_tree, root_0);

							}
							break;
						case 6 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:141:62: NOTEQ ^
							{
							NOTEQ69=(Token)match(input,NOTEQ,FOLLOW_NOTEQ_in_arith31653); 
							NOTEQ69_tree = (Object)adaptor.create(NOTEQ69);
							root_0 = (Object)adaptor.becomeRoot(NOTEQ69_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_arith4_in_arith31657);
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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:144:1: arith4 : arith5 ( ( PLUS ^| MIN ^) arith5 )* ;
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
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:145:5: ( arith5 ( ( PLUS ^| MIN ^) arith5 )* )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:145:9: arith5 ( ( PLUS ^| MIN ^) arith5 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arith5_in_arith41687);
			arith571=arith5();
			state._fsp--;

			adaptor.addChild(root_0, arith571.getTree());

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:145:16: ( ( PLUS ^| MIN ^) arith5 )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==MIN||LA25_0==PLUS) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:145:17: ( PLUS ^| MIN ^) arith5
					{
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:145:17: ( PLUS ^| MIN ^)
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
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:145:18: PLUS ^
							{
							PLUS72=(Token)match(input,PLUS,FOLLOW_PLUS_in_arith41691); 
							PLUS72_tree = (Object)adaptor.create(PLUS72);
							root_0 = (Object)adaptor.becomeRoot(PLUS72_tree, root_0);

							}
							break;
						case 2 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:145:26: MIN ^
							{
							MIN73=(Token)match(input,MIN,FOLLOW_MIN_in_arith41696); 
							MIN73_tree = (Object)adaptor.create(MIN73);
							root_0 = (Object)adaptor.becomeRoot(MIN73_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_arith5_in_arith41700);
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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:148:1: arith5 : arith6 ( ( MULT ^| DIV ^| MOD ^) arith6 )* ;
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
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:149:5: ( arith6 ( ( MULT ^| DIV ^| MOD ^) arith6 )* )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:149:9: arith6 ( ( MULT ^| DIV ^| MOD ^) arith6 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arith6_in_arith51731);
			arith675=arith6();
			state._fsp--;

			adaptor.addChild(root_0, arith675.getTree());

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:149:16: ( ( MULT ^| DIV ^| MOD ^) arith6 )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==DIV||(LA27_0 >= MOD && LA27_0 <= MULT)) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:149:17: ( MULT ^| DIV ^| MOD ^) arith6
					{
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:149:17: ( MULT ^| DIV ^| MOD ^)
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
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:149:18: MULT ^
							{
							MULT76=(Token)match(input,MULT,FOLLOW_MULT_in_arith51735); 
							MULT76_tree = (Object)adaptor.create(MULT76);
							root_0 = (Object)adaptor.becomeRoot(MULT76_tree, root_0);

							}
							break;
						case 2 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:149:26: DIV ^
							{
							DIV77=(Token)match(input,DIV,FOLLOW_DIV_in_arith51740); 
							DIV77_tree = (Object)adaptor.create(DIV77);
							root_0 = (Object)adaptor.becomeRoot(DIV77_tree, root_0);

							}
							break;
						case 3 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:149:33: MOD ^
							{
							MOD78=(Token)match(input,MOD,FOLLOW_MOD_in_arith51745); 
							MOD78_tree = (Object)adaptor.create(MOD78);
							root_0 = (Object)adaptor.becomeRoot(MOD78_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_arith6_in_arith51749);
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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:152:1: arith6 : ( ( PLUS ^| MIN ^| NOT ^)? operand ) ;
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
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:153:5: ( ( ( PLUS ^| MIN ^| NOT ^)? operand ) )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:153:9: ( ( PLUS ^| MIN ^| NOT ^)? operand )
			{
			root_0 = (Object)adaptor.nil();


			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:153:9: ( ( PLUS ^| MIN ^| NOT ^)? operand )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:153:10: ( PLUS ^| MIN ^| NOT ^)? operand
			{
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:153:10: ( PLUS ^| MIN ^| NOT ^)?
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
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:153:11: PLUS ^
					{
					PLUS80=(Token)match(input,PLUS,FOLLOW_PLUS_in_arith61784); 
					PLUS80_tree = (Object)adaptor.create(PLUS80);
					root_0 = (Object)adaptor.becomeRoot(PLUS80_tree, root_0);

					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:153:19: MIN ^
					{
					MIN81=(Token)match(input,MIN,FOLLOW_MIN_in_arith61789); 
					MIN81_tree = (Object)adaptor.create(MIN81);
					root_0 = (Object)adaptor.becomeRoot(MIN81_tree, root_0);

					}
					break;
				case 3 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:153:26: NOT ^
					{
					NOT82=(Token)match(input,NOT,FOLLOW_NOT_in_arith61794); 
					NOT82_tree = (Object)adaptor.create(NOT82);
					root_0 = (Object)adaptor.becomeRoot(NOT82_tree, root_0);

					}
					break;

			}

			pushFollow(FOLLOW_operand_in_arith61799);
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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:156:1: ifelsethen : IF ^ single_expr THEN ! LCURLY ! unclosed_compound_expr RCURLY ! ( ELSE ! LCURLY ! unclosed_compound_expr RCURLY !)? ;
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
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:157:5: ( IF ^ single_expr THEN ! LCURLY ! unclosed_compound_expr RCURLY ! ( ELSE ! LCURLY ! unclosed_compound_expr RCURLY !)? )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:157:9: IF ^ single_expr THEN ! LCURLY ! unclosed_compound_expr RCURLY ! ( ELSE ! LCURLY ! unclosed_compound_expr RCURLY !)?
			{
			root_0 = (Object)adaptor.nil();


			IF84=(Token)match(input,IF,FOLLOW_IF_in_ifelsethen1823); 
			IF84_tree = (Object)adaptor.create(IF84);
			root_0 = (Object)adaptor.becomeRoot(IF84_tree, root_0);

			pushFollow(FOLLOW_single_expr_in_ifelsethen1826);
			single_expr85=single_expr();
			state._fsp--;

			adaptor.addChild(root_0, single_expr85.getTree());

			THEN86=(Token)match(input,THEN,FOLLOW_THEN_in_ifelsethen1828); 
			LCURLY87=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_ifelsethen1831); 
			pushFollow(FOLLOW_unclosed_compound_expr_in_ifelsethen1834);
			unclosed_compound_expr88=unclosed_compound_expr();
			state._fsp--;

			adaptor.addChild(root_0, unclosed_compound_expr88.getTree());

			RCURLY89=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_ifelsethen1836); 
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:157:70: ( ELSE ! LCURLY ! unclosed_compound_expr RCURLY !)?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==ELSE) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:157:71: ELSE ! LCURLY ! unclosed_compound_expr RCURLY !
					{
					ELSE90=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifelsethen1840); 
					LCURLY91=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_ifelsethen1843); 
					pushFollow(FOLLOW_unclosed_compound_expr_in_ifelsethen1846);
					unclosed_compound_expr92=unclosed_compound_expr();
					state._fsp--;

					adaptor.addChild(root_0, unclosed_compound_expr92.getTree());

					RCURLY93=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_ifelsethen1848); 
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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:161:1: operand : ( IDENTIFIER | NUMBER | LPAREN ! single_expr RPAREN !);
	public final ChocolateParser.operand_return operand() throws RecognitionException {
		ChocolateParser.operand_return retval = new ChocolateParser.operand_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER94=null;
		Token NUMBER95=null;
		Token LPAREN96=null;
		Token RPAREN98=null;
		ParserRuleReturnScope single_expr97 =null;

		Object IDENTIFIER94_tree=null;
		Object NUMBER95_tree=null;
		Object LPAREN96_tree=null;
		Object RPAREN98_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:162:5: ( IDENTIFIER | NUMBER | LPAREN ! single_expr RPAREN !)
			int alt30=3;
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
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}
			switch (alt30) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:162:9: IDENTIFIER
					{
					root_0 = (Object)adaptor.nil();


					IDENTIFIER94=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand1871); 
					IDENTIFIER94_tree = (Object)adaptor.create(IDENTIFIER94);
					adaptor.addChild(root_0, IDENTIFIER94_tree);

					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:163:9: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER95=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_operand1881); 
					NUMBER95_tree = (Object)adaptor.create(NUMBER95);
					adaptor.addChild(root_0, NUMBER95_tree);

					}
					break;
				case 3 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:164:9: LPAREN ! single_expr RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					LPAREN96=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operand1891); 
					pushFollow(FOLLOW_single_expr_in_operand1894);
					single_expr97=single_expr();
					state._fsp--;

					adaptor.addChild(root_0, single_expr97.getTree());

					RPAREN98=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operand1896); 
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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:167:1: type : ( INTEGER | CHAR | BOOLEAN );
	public final ChocolateParser.type_return type() throws RecognitionException {
		ChocolateParser.type_return retval = new ChocolateParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set99=null;

		Object set99_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:168:5: ( INTEGER | CHAR | BOOLEAN )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:
			{
			root_0 = (Object)adaptor.nil();


			set99=input.LT(1);
			if ( (input.LA(1) >= BOOLEAN && input.LA(1) <= CHAR)||input.LA(1)==INTEGER ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set99));
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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:171:1: string : DQUOTATION ! ( graphic )* DQUOTATION !;
	public final ChocolateParser.string_return string() throws RecognitionException {
		ChocolateParser.string_return retval = new ChocolateParser.string_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token DQUOTATION100=null;
		Token DQUOTATION102=null;
		ParserRuleReturnScope graphic101 =null;

		Object DQUOTATION100_tree=null;
		Object DQUOTATION102_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:172:5: ( DQUOTATION ! ( graphic )* DQUOTATION !)
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:172:9: DQUOTATION ! ( graphic )* DQUOTATION !
			{
			root_0 = (Object)adaptor.nil();


			DQUOTATION100=(Token)match(input,DQUOTATION,FOLLOW_DQUOTATION_in_string1947); 
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:172:21: ( graphic )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==DIGIT||LA31_0==LETTER) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:172:21: graphic
					{
					pushFollow(FOLLOW_graphic_in_string1950);
					graphic101=graphic();
					state._fsp--;

					adaptor.addChild(root_0, graphic101.getTree());

					}
					break;

				default :
					break loop31;
				}
			}

			DQUOTATION102=(Token)match(input,DQUOTATION,FOLLOW_DQUOTATION_in_string1953); 
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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:175:1: graphic : ( LETTER | DIGIT );
	public final ChocolateParser.graphic_return graphic() throws RecognitionException {
		ChocolateParser.graphic_return retval = new ChocolateParser.graphic_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set103=null;

		Object set103_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:176:5: ( LETTER | DIGIT )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:
			{
			root_0 = (Object)adaptor.nil();


			set103=input.LT(1);
			if ( input.LA(1)==DIGIT||input.LA(1)==LETTER ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set103));
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



	public static final BitSet FOLLOW_declarations_in_program985 = new BitSet(new long[]{0x0000212000301000L});
	public static final BitSet FOLLOW_statements_in_program988 = new BitSet(new long[]{0x0000212000301000L});
	public static final BitSet FOLLOW_EOF_in_program992 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_declarations1055 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_declarations1057 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_declaration1079 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_declaration1083 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONSTANT_in_constant1110 = new BitSet(new long[]{0x0000000000400180L});
	public static final BitSet FOLLOW_type_in_constant1113 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_constant1115 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_ASSIGN_in_constant1118 = new BitSet(new long[]{0x0000001530900000L});
	public static final BitSet FOLLOW_single_expr_in_constant1121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_closed_compound_expr_in_constant1125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_variable1151 = new BitSet(new long[]{0x0000000000400180L});
	public static final BitSet FOLLOW_type_in_variable1154 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_variable1156 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_ASSIGN_in_variable1159 = new BitSet(new long[]{0x0000001530900000L});
	public static final BitSet FOLLOW_single_expr_in_variable1162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_closed_compound_expr_in_variable1166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statements1190 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_statements1192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_in_statement1216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_in_statement1227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assign_in_statement1238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifelsethen_in_statement1251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read1270 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_read1273 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read1276 = new BitSet(new long[]{0x0000020000000400L});
	public static final BitSet FOLLOW_COMMA_in_read1279 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read1282 = new BitSet(new long[]{0x0000020000000400L});
	public static final BitSet FOLLOW_RPAREN_in_read1286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_assign1306 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_assign1308 = new BitSet(new long[]{0x0000001530900000L});
	public static final BitSet FOLLOW_assign2_in_assign1321 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_assign21345 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_ASSIGN_in_assign21348 = new BitSet(new long[]{0x0000001530900000L});
	public static final BitSet FOLLOW_assign2_in_assign21351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_single_expr_in_assign21363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_closed_compound_expr_in_assign21373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print1396 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_print1399 = new BitSet(new long[]{0x0000212000309000L});
	public static final BitSet FOLLOW_unclosed_compound_expr_in_print1403 = new BitSet(new long[]{0x0000020000000400L});
	public static final BitSet FOLLOW_string_in_print1407 = new BitSet(new long[]{0x0000020000000400L});
	public static final BitSet FOLLOW_COMMA_in_print1411 = new BitSet(new long[]{0x0000212000309000L});
	public static final BitSet FOLLOW_unclosed_compound_expr_in_print1415 = new BitSet(new long[]{0x0000020000000400L});
	public static final BitSet FOLLOW_string_in_print1419 = new BitSet(new long[]{0x0000020000000400L});
	public static final BitSet FOLLOW_RPAREN_in_print1424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unclosed_compound_expr_in_compound_expr1449 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_closed_compound_expr_in_compound_expr1459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declarations_in_unclosed_compound_expr1483 = new BitSet(new long[]{0x0000212000301000L});
	public static final BitSet FOLLOW_statements_in_unclosed_compound_expr1486 = new BitSet(new long[]{0x0000212000301002L});
	public static final BitSet FOLLOW_LCURLY_in_closed_compound_expr1508 = new BitSet(new long[]{0x0000212000301000L});
	public static final BitSet FOLLOW_declarations_in_closed_compound_expr1512 = new BitSet(new long[]{0x0000212000301000L});
	public static final BitSet FOLLOW_statements_in_closed_compound_expr1515 = new BitSet(new long[]{0x000021A000301000L});
	public static final BitSet FOLLOW_RCURLY_in_closed_compound_expr1519 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_in_single_expr1543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arith2_in_arithmetic1562 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_OR_in_arithmetic1565 = new BitSet(new long[]{0x0000001530100000L});
	public static final BitSet FOLLOW_arith2_in_arithmetic1568 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_arith3_in_arith21593 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_AND_in_arith21596 = new BitSet(new long[]{0x0000001530100000L});
	public static final BitSet FOLLOW_arith3_in_arith21599 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_arith4_in_arith31624 = new BitSet(new long[]{0x00000002030E0002L});
	public static final BitSet FOLLOW_LESS_in_arith31628 = new BitSet(new long[]{0x0000001530100000L});
	public static final BitSet FOLLOW_LESSEQ_in_arith31633 = new BitSet(new long[]{0x0000001530100000L});
	public static final BitSet FOLLOW_GREATEQ_in_arith31638 = new BitSet(new long[]{0x0000001530100000L});
	public static final BitSet FOLLOW_GREAT_in_arith31643 = new BitSet(new long[]{0x0000001530100000L});
	public static final BitSet FOLLOW_EQ_in_arith31648 = new BitSet(new long[]{0x0000001530100000L});
	public static final BitSet FOLLOW_NOTEQ_in_arith31653 = new BitSet(new long[]{0x0000001530100000L});
	public static final BitSet FOLLOW_arith4_in_arith31657 = new BitSet(new long[]{0x00000002030E0002L});
	public static final BitSet FOLLOW_arith5_in_arith41687 = new BitSet(new long[]{0x0000001020000002L});
	public static final BitSet FOLLOW_PLUS_in_arith41691 = new BitSet(new long[]{0x0000001530100000L});
	public static final BitSet FOLLOW_MIN_in_arith41696 = new BitSet(new long[]{0x0000001530100000L});
	public static final BitSet FOLLOW_arith5_in_arith41700 = new BitSet(new long[]{0x0000001020000002L});
	public static final BitSet FOLLOW_arith6_in_arith51731 = new BitSet(new long[]{0x00000000C0004002L});
	public static final BitSet FOLLOW_MULT_in_arith51735 = new BitSet(new long[]{0x0000001530100000L});
	public static final BitSet FOLLOW_DIV_in_arith51740 = new BitSet(new long[]{0x0000001530100000L});
	public static final BitSet FOLLOW_MOD_in_arith51745 = new BitSet(new long[]{0x0000001530100000L});
	public static final BitSet FOLLOW_arith6_in_arith51749 = new BitSet(new long[]{0x00000000C0004002L});
	public static final BitSet FOLLOW_PLUS_in_arith61784 = new BitSet(new long[]{0x0000000410100000L});
	public static final BitSet FOLLOW_MIN_in_arith61789 = new BitSet(new long[]{0x0000000410100000L});
	public static final BitSet FOLLOW_NOT_in_arith61794 = new BitSet(new long[]{0x0000000410100000L});
	public static final BitSet FOLLOW_operand_in_arith61799 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifelsethen1823 = new BitSet(new long[]{0x0000001530100000L});
	public static final BitSet FOLLOW_single_expr_in_ifelsethen1826 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_THEN_in_ifelsethen1828 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LCURLY_in_ifelsethen1831 = new BitSet(new long[]{0x0000212000301000L});
	public static final BitSet FOLLOW_unclosed_compound_expr_in_ifelsethen1834 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_RCURLY_in_ifelsethen1836 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_ELSE_in_ifelsethen1840 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LCURLY_in_ifelsethen1843 = new BitSet(new long[]{0x0000212000301000L});
	public static final BitSet FOLLOW_unclosed_compound_expr_in_ifelsethen1846 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_RCURLY_in_ifelsethen1848 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand1871 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand1881 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand1891 = new BitSet(new long[]{0x0000001530100000L});
	public static final BitSet FOLLOW_single_expr_in_operand1894 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_RPAREN_in_operand1896 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DQUOTATION_in_string1947 = new BitSet(new long[]{0x000000000400A000L});
	public static final BitSet FOLLOW_graphic_in_string1950 = new BitSet(new long[]{0x000000000400A000L});
	public static final BitSet FOLLOW_DQUOTATION_in_string1953 = new BitSet(new long[]{0x0000000000000002L});
}
