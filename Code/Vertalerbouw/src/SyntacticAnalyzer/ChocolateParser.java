// $ANTLR 3.5 C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g 2013-06-20 16:57:06

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


	public static class chocolate_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "chocolate"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:61:1: chocolate : ( ( declarations )* statements )+ EOF -> ^( PROGRAM ( ( declarations )* statements )+ ) ;
	public final ChocolateParser.chocolate_return chocolate() throws RecognitionException {
		ChocolateParser.chocolate_return retval = new ChocolateParser.chocolate_return();
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
				if ( (LA2_0==ASSIGN||LA2_0==CONSTANT||LA2_0==PRINT||LA2_0==READ||LA2_0==VAR) ) {
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
							pushFollow(FOLLOW_declarations_in_chocolate985);
							declarations1=declarations();
							state._fsp--;

							stream_declarations.add(declarations1.getTree());
							}
							break;

						default :
							break loop1;
						}
					}

					pushFollow(FOLLOW_statements_in_chocolate988);
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

			EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_chocolate992);  
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
	// $ANTLR end "chocolate"


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
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:69:7: declaration SEMICOLON !
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_declaration_in_declarations1053);
			declaration4=declaration();
			state._fsp--;

			adaptor.addChild(root_0, declaration4.getTree());

			SEMICOLON5=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_declarations1055); 
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
					pushFollow(FOLLOW_constant_in_declaration1077);
					constant6=constant();
					state._fsp--;

					adaptor.addChild(root_0, constant6.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:73:21: variable
					{
					pushFollow(FOLLOW_variable_in_declaration1081);
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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:76:1: constant : CONSTANT ^ type IDENTIFIER BECOMES single_expr ;
	public final ChocolateParser.constant_return constant() throws RecognitionException {
		ChocolateParser.constant_return retval = new ChocolateParser.constant_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token CONSTANT8=null;
		Token IDENTIFIER10=null;
		Token BECOMES11=null;
		ParserRuleReturnScope type9 =null;
		ParserRuleReturnScope single_expr12 =null;

		Object CONSTANT8_tree=null;
		Object IDENTIFIER10_tree=null;
		Object BECOMES11_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:77:5: ( CONSTANT ^ type IDENTIFIER BECOMES single_expr )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:77:9: CONSTANT ^ type IDENTIFIER BECOMES single_expr
			{
			root_0 = (Object)adaptor.nil();


			CONSTANT8=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_constant1108); 
			CONSTANT8_tree = (Object)adaptor.create(CONSTANT8);
			root_0 = (Object)adaptor.becomeRoot(CONSTANT8_tree, root_0);

			pushFollow(FOLLOW_type_in_constant1111);
			type9=type();
			state._fsp--;

			adaptor.addChild(root_0, type9.getTree());

			IDENTIFIER10=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant1113); 
			IDENTIFIER10_tree = (Object)adaptor.create(IDENTIFIER10);
			adaptor.addChild(root_0, IDENTIFIER10_tree);

			BECOMES11=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_constant1115); 
			BECOMES11_tree = (Object)adaptor.create(BECOMES11);
			adaptor.addChild(root_0, BECOMES11_tree);

			pushFollow(FOLLOW_single_expr_in_constant1117);
			single_expr12=single_expr();
			state._fsp--;

			adaptor.addChild(root_0, single_expr12.getTree());

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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:80:1: variable : VAR ^ type IDENTIFIER variable_becomes ;
	public final ChocolateParser.variable_return variable() throws RecognitionException {
		ChocolateParser.variable_return retval = new ChocolateParser.variable_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VAR13=null;
		Token IDENTIFIER15=null;
		ParserRuleReturnScope type14 =null;
		ParserRuleReturnScope variable_becomes16 =null;

		Object VAR13_tree=null;
		Object IDENTIFIER15_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:81:5: ( VAR ^ type IDENTIFIER variable_becomes )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:81:9: VAR ^ type IDENTIFIER variable_becomes
			{
			root_0 = (Object)adaptor.nil();


			VAR13=(Token)match(input,VAR,FOLLOW_VAR_in_variable1140); 
			VAR13_tree = (Object)adaptor.create(VAR13);
			root_0 = (Object)adaptor.becomeRoot(VAR13_tree, root_0);

			pushFollow(FOLLOW_type_in_variable1143);
			type14=type();
			state._fsp--;

			adaptor.addChild(root_0, type14.getTree());

			IDENTIFIER15=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variable1145); 
			IDENTIFIER15_tree = (Object)adaptor.create(IDENTIFIER15);
			adaptor.addChild(root_0, IDENTIFIER15_tree);

			pushFollow(FOLLOW_variable_becomes_in_variable1147);
			variable_becomes16=variable_becomes();
			state._fsp--;

			adaptor.addChild(root_0, variable_becomes16.getTree());

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


	public static class variable_becomes_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variable_becomes"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:84:1: variable_becomes : (| ( BECOMES single_expr ) );
	public final ChocolateParser.variable_becomes_return variable_becomes() throws RecognitionException {
		ChocolateParser.variable_becomes_return retval = new ChocolateParser.variable_becomes_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token BECOMES17=null;
		ParserRuleReturnScope single_expr18 =null;

		Object BECOMES17_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:85:5: (| ( BECOMES single_expr ) )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==SEMICOLON) ) {
				alt4=1;
			}
			else if ( (LA4_0==BECOMES) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:86:5: 
					{
					root_0 = (Object)adaptor.nil();


					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:86:9: ( BECOMES single_expr )
					{
					root_0 = (Object)adaptor.nil();


					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:86:9: ( BECOMES single_expr )
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:86:10: BECOMES single_expr
					{
					BECOMES17=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_variable_becomes1177); 
					BECOMES17_tree = (Object)adaptor.create(BECOMES17);
					adaptor.addChild(root_0, BECOMES17_tree);

					pushFollow(FOLLOW_single_expr_in_variable_becomes1179);
					single_expr18=single_expr();
					state._fsp--;

					adaptor.addChild(root_0, single_expr18.getTree());

					}

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
	// $ANTLR end "variable_becomes"


	public static class statements_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statements"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:90:1: statements : statement SEMICOLON !;
	public final ChocolateParser.statements_return statements() throws RecognitionException {
		ChocolateParser.statements_return retval = new ChocolateParser.statements_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMICOLON20=null;
		ParserRuleReturnScope statement19 =null;

		Object SEMICOLON20_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:91:5: ( statement SEMICOLON !)
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:91:7: statement SEMICOLON !
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_statement_in_statements1201);
			statement19=statement();
			state._fsp--;

			adaptor.addChild(root_0, statement19.getTree());

			SEMICOLON20=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statements1203); 
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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:94:1: statement : ( read | print | assign );
	public final ChocolateParser.statement_return statement() throws RecognitionException {
		ChocolateParser.statement_return retval = new ChocolateParser.statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope read21 =null;
		ParserRuleReturnScope print22 =null;
		ParserRuleReturnScope assign23 =null;


		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:95:5: ( read | print | assign )
			int alt5=3;
			switch ( input.LA(1) ) {
			case READ:
				{
				alt5=1;
				}
				break;
			case PRINT:
				{
				alt5=2;
				}
				break;
			case ASSIGN:
				{
				alt5=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:95:7: read
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_read_in_statement1225);
					read21=read();
					state._fsp--;

					adaptor.addChild(root_0, read21.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:96:7: print
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_print_in_statement1234);
					print22=print();
					state._fsp--;

					adaptor.addChild(root_0, print22.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:97:7: assign
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_assign_in_statement1243);
					assign23=assign();
					state._fsp--;

					adaptor.addChild(root_0, assign23.getTree());

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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:100:1: read : READ ^ LPAREN ! IDENTIFIER readmore RPAREN !;
	public final ChocolateParser.read_return read() throws RecognitionException {
		ChocolateParser.read_return retval = new ChocolateParser.read_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token READ24=null;
		Token LPAREN25=null;
		Token IDENTIFIER26=null;
		Token RPAREN28=null;
		ParserRuleReturnScope readmore27 =null;

		Object READ24_tree=null;
		Object LPAREN25_tree=null;
		Object IDENTIFIER26_tree=null;
		Object RPAREN28_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:101:5: ( READ ^ LPAREN ! IDENTIFIER readmore RPAREN !)
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:101:9: READ ^ LPAREN ! IDENTIFIER readmore RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			READ24=(Token)match(input,READ,FOLLOW_READ_in_read1265); 
			READ24_tree = (Object)adaptor.create(READ24);
			root_0 = (Object)adaptor.becomeRoot(READ24_tree, root_0);

			LPAREN25=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_read1268); 
			IDENTIFIER26=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read1271); 
			IDENTIFIER26_tree = (Object)adaptor.create(IDENTIFIER26);
			adaptor.addChild(root_0, IDENTIFIER26_tree);

			pushFollow(FOLLOW_readmore_in_read1273);
			readmore27=readmore();
			state._fsp--;

			adaptor.addChild(root_0, readmore27.getTree());

			RPAREN28=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_read1275); 
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


	public static class readmore_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "readmore"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:104:1: readmore : (| COMMA ! IDENTIFIER readmore );
	public final ChocolateParser.readmore_return readmore() throws RecognitionException {
		ChocolateParser.readmore_return retval = new ChocolateParser.readmore_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token COMMA29=null;
		Token IDENTIFIER30=null;
		ParserRuleReturnScope readmore31 =null;

		Object COMMA29_tree=null;
		Object IDENTIFIER30_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:105:5: (| COMMA ! IDENTIFIER readmore )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==RPAREN) ) {
				alt6=1;
			}
			else if ( (LA6_0==COMMA) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:106:5: 
					{
					root_0 = (Object)adaptor.nil();


					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:106:9: COMMA ! IDENTIFIER readmore
					{
					root_0 = (Object)adaptor.nil();


					COMMA29=(Token)match(input,COMMA,FOLLOW_COMMA_in_readmore1308); 
					IDENTIFIER30=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_readmore1311); 
					IDENTIFIER30_tree = (Object)adaptor.create(IDENTIFIER30);
					adaptor.addChild(root_0, IDENTIFIER30_tree);

					pushFollow(FOLLOW_readmore_in_readmore1313);
					readmore31=readmore();
					state._fsp--;

					adaptor.addChild(root_0, readmore31.getTree());

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
	// $ANTLR end "readmore"


	public static class assign_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assign"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:109:1: assign : ASSIGN ^ IDENTIFIER assignmore expr ;
	public final ChocolateParser.assign_return assign() throws RecognitionException {
		ChocolateParser.assign_return retval = new ChocolateParser.assign_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ASSIGN32=null;
		Token IDENTIFIER33=null;
		ParserRuleReturnScope assignmore34 =null;
		ParserRuleReturnScope expr35 =null;

		Object ASSIGN32_tree=null;
		Object IDENTIFIER33_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:110:5: ( ASSIGN ^ IDENTIFIER assignmore expr )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:110:9: ASSIGN ^ IDENTIFIER assignmore expr
			{
			root_0 = (Object)adaptor.nil();


			ASSIGN32=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign1332); 
			ASSIGN32_tree = (Object)adaptor.create(ASSIGN32);
			root_0 = (Object)adaptor.becomeRoot(ASSIGN32_tree, root_0);

			IDENTIFIER33=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assign1335); 
			IDENTIFIER33_tree = (Object)adaptor.create(IDENTIFIER33);
			adaptor.addChild(root_0, IDENTIFIER33_tree);

			pushFollow(FOLLOW_assignmore_in_assign1337);
			assignmore34=assignmore();
			state._fsp--;

			adaptor.addChild(root_0, assignmore34.getTree());

			pushFollow(FOLLOW_expr_in_assign1339);
			expr35=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr35.getTree());

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


	public static class assignmore_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assignmore"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:113:1: assignmore : (| ASSIGN ^ IDENTIFIER );
	public final ChocolateParser.assignmore_return assignmore() throws RecognitionException {
		ChocolateParser.assignmore_return retval = new ChocolateParser.assignmore_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ASSIGN36=null;
		Token IDENTIFIER37=null;

		Object ASSIGN36_tree=null;
		Object IDENTIFIER37_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:114:5: (| ASSIGN ^ IDENTIFIER )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( ((LA7_0 >= IDENTIFIER && LA7_0 <= IF)||LA7_0==LCURLY||(LA7_0 >= LPAREN && LA7_0 <= MIN)||LA7_0==NOT||LA7_0==NUMBER||LA7_0==PLUS) ) {
				alt7=1;
			}
			else if ( (LA7_0==ASSIGN) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:115:5: 
					{
					root_0 = (Object)adaptor.nil();


					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:115:9: ASSIGN ^ IDENTIFIER
					{
					root_0 = (Object)adaptor.nil();


					ASSIGN36=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignmore1371); 
					ASSIGN36_tree = (Object)adaptor.create(ASSIGN36);
					root_0 = (Object)adaptor.becomeRoot(ASSIGN36_tree, root_0);

					IDENTIFIER37=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assignmore1374); 
					IDENTIFIER37_tree = (Object)adaptor.create(IDENTIFIER37);
					adaptor.addChild(root_0, IDENTIFIER37_tree);

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
	// $ANTLR end "assignmore"


	public static class print_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "print"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:118:1: print : PRINT ^ LPAREN ! ( single_expr | string ) printmore RPAREN !;
	public final ChocolateParser.print_return print() throws RecognitionException {
		ChocolateParser.print_return retval = new ChocolateParser.print_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PRINT38=null;
		Token LPAREN39=null;
		Token RPAREN43=null;
		ParserRuleReturnScope single_expr40 =null;
		ParserRuleReturnScope string41 =null;
		ParserRuleReturnScope printmore42 =null;

		Object PRINT38_tree=null;
		Object LPAREN39_tree=null;
		Object RPAREN43_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:119:5: ( PRINT ^ LPAREN ! ( single_expr | string ) printmore RPAREN !)
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:119:9: PRINT ^ LPAREN ! ( single_expr | string ) printmore RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			PRINT38=(Token)match(input,PRINT,FOLLOW_PRINT_in_print1397); 
			PRINT38_tree = (Object)adaptor.create(PRINT38);
			root_0 = (Object)adaptor.becomeRoot(PRINT38_tree, root_0);

			LPAREN39=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_print1400); 
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:119:24: ( single_expr | string )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( ((LA8_0 >= IDENTIFIER && LA8_0 <= IF)||(LA8_0 >= LPAREN && LA8_0 <= MIN)||LA8_0==NOT||LA8_0==NUMBER||LA8_0==PLUS) ) {
				alt8=1;
			}
			else if ( (LA8_0==DQUOTATION) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:119:25: single_expr
					{
					pushFollow(FOLLOW_single_expr_in_print1404);
					single_expr40=single_expr();
					state._fsp--;

					adaptor.addChild(root_0, single_expr40.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:119:39: string
					{
					pushFollow(FOLLOW_string_in_print1408);
					string41=string();
					state._fsp--;

					adaptor.addChild(root_0, string41.getTree());

					}
					break;

			}

			pushFollow(FOLLOW_printmore_in_print1411);
			printmore42=printmore();
			state._fsp--;

			adaptor.addChild(root_0, printmore42.getTree());

			RPAREN43=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_print1413); 
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


	public static class printmore_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "printmore"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:122:1: printmore : (| ( COMMA ! ( single_expr | string ) ) printmore );
	public final ChocolateParser.printmore_return printmore() throws RecognitionException {
		ChocolateParser.printmore_return retval = new ChocolateParser.printmore_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token COMMA44=null;
		ParserRuleReturnScope single_expr45 =null;
		ParserRuleReturnScope string46 =null;
		ParserRuleReturnScope printmore47 =null;

		Object COMMA44_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:123:5: (| ( COMMA ! ( single_expr | string ) ) printmore )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==RPAREN) ) {
				alt10=1;
			}
			else if ( (LA10_0==COMMA) ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:124:5: 
					{
					root_0 = (Object)adaptor.nil();


					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:124:9: ( COMMA ! ( single_expr | string ) ) printmore
					{
					root_0 = (Object)adaptor.nil();


					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:124:9: ( COMMA ! ( single_expr | string ) )
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:124:10: COMMA ! ( single_expr | string )
					{
					COMMA44=(Token)match(input,COMMA,FOLLOW_COMMA_in_printmore1444); 
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:124:17: ( single_expr | string )
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( ((LA9_0 >= IDENTIFIER && LA9_0 <= IF)||(LA9_0 >= LPAREN && LA9_0 <= MIN)||LA9_0==NOT||LA9_0==NUMBER||LA9_0==PLUS) ) {
						alt9=1;
					}
					else if ( (LA9_0==DQUOTATION) ) {
						alt9=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 9, 0, input);
						throw nvae;
					}

					switch (alt9) {
						case 1 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:124:18: single_expr
							{
							pushFollow(FOLLOW_single_expr_in_printmore1448);
							single_expr45=single_expr();
							state._fsp--;

							adaptor.addChild(root_0, single_expr45.getTree());

							}
							break;
						case 2 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:124:32: string
							{
							pushFollow(FOLLOW_string_in_printmore1452);
							string46=string();
							state._fsp--;

							adaptor.addChild(root_0, string46.getTree());

							}
							break;

					}

					}

					pushFollow(FOLLOW_printmore_in_printmore1456);
					printmore47=printmore();
					state._fsp--;

					adaptor.addChild(root_0, printmore47.getTree());

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
	// $ANTLR end "printmore"


	public static class expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:128:1: expr : ( compound_expr | single_expr );
	public final ChocolateParser.expr_return expr() throws RecognitionException {
		ChocolateParser.expr_return retval = new ChocolateParser.expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope compound_expr48 =null;
		ParserRuleReturnScope single_expr49 =null;


		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:129:5: ( compound_expr | single_expr )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==LCURLY) ) {
				alt11=1;
			}
			else if ( ((LA11_0 >= IDENTIFIER && LA11_0 <= IF)||(LA11_0 >= LPAREN && LA11_0 <= MIN)||LA11_0==NOT||LA11_0==NUMBER||LA11_0==PLUS) ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:129:9: compound_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_compound_expr_in_expr1480);
					compound_expr48=compound_expr();
					state._fsp--;

					adaptor.addChild(root_0, compound_expr48.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:130:9: single_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_single_expr_in_expr1490);
					single_expr49=single_expr();
					state._fsp--;

					adaptor.addChild(root_0, single_expr49.getTree());

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
	// $ANTLR end "expr"


	public static class compound_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "compound_expr"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:133:1: compound_expr : LCURLY ! ( ( declarations | statements ) single_expr SEMICOLON !)+ RCURLY !;
	public final ChocolateParser.compound_expr_return compound_expr() throws RecognitionException {
		ChocolateParser.compound_expr_return retval = new ChocolateParser.compound_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LCURLY50=null;
		Token SEMICOLON54=null;
		Token RCURLY55=null;
		ParserRuleReturnScope declarations51 =null;
		ParserRuleReturnScope statements52 =null;
		ParserRuleReturnScope single_expr53 =null;

		Object LCURLY50_tree=null;
		Object SEMICOLON54_tree=null;
		Object RCURLY55_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:134:5: ( LCURLY ! ( ( declarations | statements ) single_expr SEMICOLON !)+ RCURLY !)
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:134:9: LCURLY ! ( ( declarations | statements ) single_expr SEMICOLON !)+ RCURLY !
			{
			root_0 = (Object)adaptor.nil();


			LCURLY50=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_compound_expr1513); 
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:134:17: ( ( declarations | statements ) single_expr SEMICOLON !)+
			int cnt13=0;
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==ASSIGN||LA13_0==CONSTANT||LA13_0==PRINT||LA13_0==READ||LA13_0==VAR) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:134:18: ( declarations | statements ) single_expr SEMICOLON !
					{
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:134:18: ( declarations | statements )
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==CONSTANT||LA12_0==VAR) ) {
						alt12=1;
					}
					else if ( (LA12_0==ASSIGN||LA12_0==PRINT||LA12_0==READ) ) {
						alt12=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 12, 0, input);
						throw nvae;
					}

					switch (alt12) {
						case 1 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:134:19: declarations
							{
							pushFollow(FOLLOW_declarations_in_compound_expr1518);
							declarations51=declarations();
							state._fsp--;

							adaptor.addChild(root_0, declarations51.getTree());

							}
							break;
						case 2 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:134:34: statements
							{
							pushFollow(FOLLOW_statements_in_compound_expr1522);
							statements52=statements();
							state._fsp--;

							adaptor.addChild(root_0, statements52.getTree());

							}
							break;

					}

					pushFollow(FOLLOW_single_expr_in_compound_expr1525);
					single_expr53=single_expr();
					state._fsp--;

					adaptor.addChild(root_0, single_expr53.getTree());

					SEMICOLON54=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_compound_expr1527); 
					}
					break;

				default :
					if ( cnt13 >= 1 ) break loop13;
					EarlyExitException eee = new EarlyExitException(13, input);
					throw eee;
				}
				cnt13++;
			}

			RCURLY55=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_compound_expr1532); 
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


	public static class compound_exprmore_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "compound_exprmore"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:137:1: compound_exprmore : (| ( declarations | statements ) compound_exprmore );
	public final ChocolateParser.compound_exprmore_return compound_exprmore() throws RecognitionException {
		ChocolateParser.compound_exprmore_return retval = new ChocolateParser.compound_exprmore_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope declarations56 =null;
		ParserRuleReturnScope statements57 =null;
		ParserRuleReturnScope compound_exprmore58 =null;


		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:138:5: (| ( declarations | statements ) compound_exprmore )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( () ) {
				alt15=1;
			}
			else if ( (LA15_0==ASSIGN||LA15_0==CONSTANT||LA15_0==PRINT||LA15_0==READ||LA15_0==VAR) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:139:5: 
					{
					root_0 = (Object)adaptor.nil();


					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:139:9: ( declarations | statements ) compound_exprmore
					{
					root_0 = (Object)adaptor.nil();


					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:139:9: ( declarations | statements )
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==CONSTANT||LA14_0==VAR) ) {
						alt14=1;
					}
					else if ( (LA14_0==ASSIGN||LA14_0==PRINT||LA14_0==READ) ) {
						alt14=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 14, 0, input);
						throw nvae;
					}

					switch (alt14) {
						case 1 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:139:10: declarations
							{
							pushFollow(FOLLOW_declarations_in_compound_exprmore1563);
							declarations56=declarations();
							state._fsp--;

							adaptor.addChild(root_0, declarations56.getTree());

							}
							break;
						case 2 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:139:25: statements
							{
							pushFollow(FOLLOW_statements_in_compound_exprmore1567);
							statements57=statements();
							state._fsp--;

							adaptor.addChild(root_0, statements57.getTree());

							}
							break;

					}

					pushFollow(FOLLOW_compound_exprmore_in_compound_exprmore1570);
					compound_exprmore58=compound_exprmore();
					state._fsp--;

					adaptor.addChild(root_0, compound_exprmore58.getTree());

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
	// $ANTLR end "compound_exprmore"


	public static class single_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "single_expr"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:142:1: single_expr : ( arithmetic | ifelsethen );
	public final ChocolateParser.single_expr_return single_expr() throws RecognitionException {
		ChocolateParser.single_expr_return retval = new ChocolateParser.single_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope arithmetic59 =null;
		ParserRuleReturnScope ifelsethen60 =null;


		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:143:5: ( arithmetic | ifelsethen )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==IDENTIFIER||(LA16_0 >= LPAREN && LA16_0 <= MIN)||LA16_0==NOT||LA16_0==NUMBER||LA16_0==PLUS) ) {
				alt16=1;
			}
			else if ( (LA16_0==IF) ) {
				alt16=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:143:9: arithmetic
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_arithmetic_in_single_expr1593);
					arithmetic59=arithmetic();
					state._fsp--;

					adaptor.addChild(root_0, arithmetic59.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:144:9: ifelsethen
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_ifelsethen_in_single_expr1603);
					ifelsethen60=ifelsethen();
					state._fsp--;

					adaptor.addChild(root_0, ifelsethen60.getTree());

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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:147:1: arithmetic : arith2 ( OR ^ arith2 )* ;
	public final ChocolateParser.arithmetic_return arithmetic() throws RecognitionException {
		ChocolateParser.arithmetic_return retval = new ChocolateParser.arithmetic_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token OR62=null;
		ParserRuleReturnScope arith261 =null;
		ParserRuleReturnScope arith263 =null;

		Object OR62_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:148:5: ( arith2 ( OR ^ arith2 )* )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:148:9: arith2 ( OR ^ arith2 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arith2_in_arithmetic1622);
			arith261=arith2();
			state._fsp--;

			adaptor.addChild(root_0, arith261.getTree());

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:148:16: ( OR ^ arith2 )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==OR) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:148:17: OR ^ arith2
					{
					OR62=(Token)match(input,OR,FOLLOW_OR_in_arithmetic1625); 
					OR62_tree = (Object)adaptor.create(OR62);
					root_0 = (Object)adaptor.becomeRoot(OR62_tree, root_0);

					pushFollow(FOLLOW_arith2_in_arithmetic1628);
					arith263=arith2();
					state._fsp--;

					adaptor.addChild(root_0, arith263.getTree());

					}
					break;

				default :
					break loop17;
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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:151:1: arith2 : arith3 ( AND ^ arith3 )* ;
	public final ChocolateParser.arith2_return arith2() throws RecognitionException {
		ChocolateParser.arith2_return retval = new ChocolateParser.arith2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AND65=null;
		ParserRuleReturnScope arith364 =null;
		ParserRuleReturnScope arith366 =null;

		Object AND65_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:152:5: ( arith3 ( AND ^ arith3 )* )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:152:9: arith3 ( AND ^ arith3 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arith3_in_arith21653);
			arith364=arith3();
			state._fsp--;

			adaptor.addChild(root_0, arith364.getTree());

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:152:16: ( AND ^ arith3 )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==AND) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:152:17: AND ^ arith3
					{
					AND65=(Token)match(input,AND,FOLLOW_AND_in_arith21656); 
					AND65_tree = (Object)adaptor.create(AND65);
					root_0 = (Object)adaptor.becomeRoot(AND65_tree, root_0);

					pushFollow(FOLLOW_arith3_in_arith21659);
					arith366=arith3();
					state._fsp--;

					adaptor.addChild(root_0, arith366.getTree());

					}
					break;

				default :
					break loop18;
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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:155:1: arith3 : arith4 ( ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^) arith4 )* ;
	public final ChocolateParser.arith3_return arith3() throws RecognitionException {
		ChocolateParser.arith3_return retval = new ChocolateParser.arith3_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LESS68=null;
		Token LESSEQ69=null;
		Token GREATEQ70=null;
		Token GREAT71=null;
		Token EQ72=null;
		Token NOTEQ73=null;
		ParserRuleReturnScope arith467 =null;
		ParserRuleReturnScope arith474 =null;

		Object LESS68_tree=null;
		Object LESSEQ69_tree=null;
		Object GREATEQ70_tree=null;
		Object GREAT71_tree=null;
		Object EQ72_tree=null;
		Object NOTEQ73_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:156:5: ( arith4 ( ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^) arith4 )* )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:156:9: arith4 ( ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^) arith4 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arith4_in_arith31684);
			arith467=arith4();
			state._fsp--;

			adaptor.addChild(root_0, arith467.getTree());

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:156:16: ( ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^) arith4 )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( ((LA20_0 >= EQ && LA20_0 <= GREATEQ)||(LA20_0 >= LESS && LA20_0 <= LESSEQ)||LA20_0==NOTEQ) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:156:17: ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^) arith4
					{
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:156:17: ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^)
					int alt19=6;
					switch ( input.LA(1) ) {
					case LESS:
						{
						alt19=1;
						}
						break;
					case LESSEQ:
						{
						alt19=2;
						}
						break;
					case GREATEQ:
						{
						alt19=3;
						}
						break;
					case GREAT:
						{
						alt19=4;
						}
						break;
					case EQ:
						{
						alt19=5;
						}
						break;
					case NOTEQ:
						{
						alt19=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 19, 0, input);
						throw nvae;
					}
					switch (alt19) {
						case 1 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:156:18: LESS ^
							{
							LESS68=(Token)match(input,LESS,FOLLOW_LESS_in_arith31688); 
							LESS68_tree = (Object)adaptor.create(LESS68);
							root_0 = (Object)adaptor.becomeRoot(LESS68_tree, root_0);

							}
							break;
						case 2 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:156:26: LESSEQ ^
							{
							LESSEQ69=(Token)match(input,LESSEQ,FOLLOW_LESSEQ_in_arith31693); 
							LESSEQ69_tree = (Object)adaptor.create(LESSEQ69);
							root_0 = (Object)adaptor.becomeRoot(LESSEQ69_tree, root_0);

							}
							break;
						case 3 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:156:36: GREATEQ ^
							{
							GREATEQ70=(Token)match(input,GREATEQ,FOLLOW_GREATEQ_in_arith31698); 
							GREATEQ70_tree = (Object)adaptor.create(GREATEQ70);
							root_0 = (Object)adaptor.becomeRoot(GREATEQ70_tree, root_0);

							}
							break;
						case 4 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:156:47: GREAT ^
							{
							GREAT71=(Token)match(input,GREAT,FOLLOW_GREAT_in_arith31703); 
							GREAT71_tree = (Object)adaptor.create(GREAT71);
							root_0 = (Object)adaptor.becomeRoot(GREAT71_tree, root_0);

							}
							break;
						case 5 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:156:56: EQ ^
							{
							EQ72=(Token)match(input,EQ,FOLLOW_EQ_in_arith31708); 
							EQ72_tree = (Object)adaptor.create(EQ72);
							root_0 = (Object)adaptor.becomeRoot(EQ72_tree, root_0);

							}
							break;
						case 6 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:156:62: NOTEQ ^
							{
							NOTEQ73=(Token)match(input,NOTEQ,FOLLOW_NOTEQ_in_arith31713); 
							NOTEQ73_tree = (Object)adaptor.create(NOTEQ73);
							root_0 = (Object)adaptor.becomeRoot(NOTEQ73_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_arith4_in_arith31717);
					arith474=arith4();
					state._fsp--;

					adaptor.addChild(root_0, arith474.getTree());

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
	// $ANTLR end "arith3"


	public static class arith4_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arith4"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:159:1: arith4 : arith5 ( ( PLUS ^| MIN ^) arith5 )* ;
	public final ChocolateParser.arith4_return arith4() throws RecognitionException {
		ChocolateParser.arith4_return retval = new ChocolateParser.arith4_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS76=null;
		Token MIN77=null;
		ParserRuleReturnScope arith575 =null;
		ParserRuleReturnScope arith578 =null;

		Object PLUS76_tree=null;
		Object MIN77_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:160:5: ( arith5 ( ( PLUS ^| MIN ^) arith5 )* )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:160:9: arith5 ( ( PLUS ^| MIN ^) arith5 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arith5_in_arith41747);
			arith575=arith5();
			state._fsp--;

			adaptor.addChild(root_0, arith575.getTree());

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:160:16: ( ( PLUS ^| MIN ^) arith5 )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==MIN||LA22_0==PLUS) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:160:17: ( PLUS ^| MIN ^) arith5
					{
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:160:17: ( PLUS ^| MIN ^)
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==PLUS) ) {
						alt21=1;
					}
					else if ( (LA21_0==MIN) ) {
						alt21=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 21, 0, input);
						throw nvae;
					}

					switch (alt21) {
						case 1 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:160:18: PLUS ^
							{
							PLUS76=(Token)match(input,PLUS,FOLLOW_PLUS_in_arith41751); 
							PLUS76_tree = (Object)adaptor.create(PLUS76);
							root_0 = (Object)adaptor.becomeRoot(PLUS76_tree, root_0);

							}
							break;
						case 2 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:160:26: MIN ^
							{
							MIN77=(Token)match(input,MIN,FOLLOW_MIN_in_arith41756); 
							MIN77_tree = (Object)adaptor.create(MIN77);
							root_0 = (Object)adaptor.becomeRoot(MIN77_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_arith5_in_arith41760);
					arith578=arith5();
					state._fsp--;

					adaptor.addChild(root_0, arith578.getTree());

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
	// $ANTLR end "arith4"


	public static class arith5_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arith5"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:163:1: arith5 : arith6 ( ( MULT ^| DIV ^| MOD ^) arith6 )* ;
	public final ChocolateParser.arith5_return arith5() throws RecognitionException {
		ChocolateParser.arith5_return retval = new ChocolateParser.arith5_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MULT80=null;
		Token DIV81=null;
		Token MOD82=null;
		ParserRuleReturnScope arith679 =null;
		ParserRuleReturnScope arith683 =null;

		Object MULT80_tree=null;
		Object DIV81_tree=null;
		Object MOD82_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:164:5: ( arith6 ( ( MULT ^| DIV ^| MOD ^) arith6 )* )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:164:9: arith6 ( ( MULT ^| DIV ^| MOD ^) arith6 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arith6_in_arith51791);
			arith679=arith6();
			state._fsp--;

			adaptor.addChild(root_0, arith679.getTree());

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:164:16: ( ( MULT ^| DIV ^| MOD ^) arith6 )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==DIV||(LA24_0 >= MOD && LA24_0 <= MULT)) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:164:17: ( MULT ^| DIV ^| MOD ^) arith6
					{
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:164:17: ( MULT ^| DIV ^| MOD ^)
					int alt23=3;
					switch ( input.LA(1) ) {
					case MULT:
						{
						alt23=1;
						}
						break;
					case DIV:
						{
						alt23=2;
						}
						break;
					case MOD:
						{
						alt23=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 23, 0, input);
						throw nvae;
					}
					switch (alt23) {
						case 1 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:164:18: MULT ^
							{
							MULT80=(Token)match(input,MULT,FOLLOW_MULT_in_arith51795); 
							MULT80_tree = (Object)adaptor.create(MULT80);
							root_0 = (Object)adaptor.becomeRoot(MULT80_tree, root_0);

							}
							break;
						case 2 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:164:26: DIV ^
							{
							DIV81=(Token)match(input,DIV,FOLLOW_DIV_in_arith51800); 
							DIV81_tree = (Object)adaptor.create(DIV81);
							root_0 = (Object)adaptor.becomeRoot(DIV81_tree, root_0);

							}
							break;
						case 3 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:164:33: MOD ^
							{
							MOD82=(Token)match(input,MOD,FOLLOW_MOD_in_arith51805); 
							MOD82_tree = (Object)adaptor.create(MOD82);
							root_0 = (Object)adaptor.becomeRoot(MOD82_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_arith6_in_arith51809);
					arith683=arith6();
					state._fsp--;

					adaptor.addChild(root_0, arith683.getTree());

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
	// $ANTLR end "arith5"


	public static class arith6_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arith6"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:167:1: arith6 : ( ( PLUS ^| MIN ^| NOT ^)? operand ) ;
	public final ChocolateParser.arith6_return arith6() throws RecognitionException {
		ChocolateParser.arith6_return retval = new ChocolateParser.arith6_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS84=null;
		Token MIN85=null;
		Token NOT86=null;
		ParserRuleReturnScope operand87 =null;

		Object PLUS84_tree=null;
		Object MIN85_tree=null;
		Object NOT86_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:168:5: ( ( ( PLUS ^| MIN ^| NOT ^)? operand ) )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:168:9: ( ( PLUS ^| MIN ^| NOT ^)? operand )
			{
			root_0 = (Object)adaptor.nil();


			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:168:9: ( ( PLUS ^| MIN ^| NOT ^)? operand )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:168:10: ( PLUS ^| MIN ^| NOT ^)? operand
			{
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:168:10: ( PLUS ^| MIN ^| NOT ^)?
			int alt25=4;
			switch ( input.LA(1) ) {
				case PLUS:
					{
					alt25=1;
					}
					break;
				case MIN:
					{
					alt25=2;
					}
					break;
				case NOT:
					{
					alt25=3;
					}
					break;
			}
			switch (alt25) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:168:11: PLUS ^
					{
					PLUS84=(Token)match(input,PLUS,FOLLOW_PLUS_in_arith61844); 
					PLUS84_tree = (Object)adaptor.create(PLUS84);
					root_0 = (Object)adaptor.becomeRoot(PLUS84_tree, root_0);

					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:168:19: MIN ^
					{
					MIN85=(Token)match(input,MIN,FOLLOW_MIN_in_arith61849); 
					MIN85_tree = (Object)adaptor.create(MIN85);
					root_0 = (Object)adaptor.becomeRoot(MIN85_tree, root_0);

					}
					break;
				case 3 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:168:26: NOT ^
					{
					NOT86=(Token)match(input,NOT,FOLLOW_NOT_in_arith61854); 
					NOT86_tree = (Object)adaptor.create(NOT86);
					root_0 = (Object)adaptor.becomeRoot(NOT86_tree, root_0);

					}
					break;

			}

			pushFollow(FOLLOW_operand_in_arith61859);
			operand87=operand();
			state._fsp--;

			adaptor.addChild(root_0, operand87.getTree());

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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:171:1: ifelsethen : IF ^ arithmetic THEN ! LCURLY ! ( statement )+ RCURLY ! ifelsethen_else ;
	public final ChocolateParser.ifelsethen_return ifelsethen() throws RecognitionException {
		ChocolateParser.ifelsethen_return retval = new ChocolateParser.ifelsethen_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IF88=null;
		Token THEN90=null;
		Token LCURLY91=null;
		Token RCURLY93=null;
		ParserRuleReturnScope arithmetic89 =null;
		ParserRuleReturnScope statement92 =null;
		ParserRuleReturnScope ifelsethen_else94 =null;

		Object IF88_tree=null;
		Object THEN90_tree=null;
		Object LCURLY91_tree=null;
		Object RCURLY93_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:172:5: ( IF ^ arithmetic THEN ! LCURLY ! ( statement )+ RCURLY ! ifelsethen_else )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:172:9: IF ^ arithmetic THEN ! LCURLY ! ( statement )+ RCURLY ! ifelsethen_else
			{
			root_0 = (Object)adaptor.nil();


			IF88=(Token)match(input,IF,FOLLOW_IF_in_ifelsethen1883); 
			IF88_tree = (Object)adaptor.create(IF88);
			root_0 = (Object)adaptor.becomeRoot(IF88_tree, root_0);

			pushFollow(FOLLOW_arithmetic_in_ifelsethen1886);
			arithmetic89=arithmetic();
			state._fsp--;

			adaptor.addChild(root_0, arithmetic89.getTree());

			THEN90=(Token)match(input,THEN,FOLLOW_THEN_in_ifelsethen1888); 
			LCURLY91=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_ifelsethen1891); 
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:172:38: ( statement )+
			int cnt26=0;
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==ASSIGN||LA26_0==PRINT||LA26_0==READ) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:172:38: statement
					{
					pushFollow(FOLLOW_statement_in_ifelsethen1894);
					statement92=statement();
					state._fsp--;

					adaptor.addChild(root_0, statement92.getTree());

					}
					break;

				default :
					if ( cnt26 >= 1 ) break loop26;
					EarlyExitException eee = new EarlyExitException(26, input);
					throw eee;
				}
				cnt26++;
			}

			RCURLY93=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_ifelsethen1897); 
			pushFollow(FOLLOW_ifelsethen_else_in_ifelsethen1900);
			ifelsethen_else94=ifelsethen_else();
			state._fsp--;

			adaptor.addChild(root_0, ifelsethen_else94.getTree());

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


	public static class ifelsethen_else_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ifelsethen_else"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:175:1: ifelsethen_else : (| ( ELSE ^ LCURLY ! ( statement )+ RCURLY !) );
	public final ChocolateParser.ifelsethen_else_return ifelsethen_else() throws RecognitionException {
		ChocolateParser.ifelsethen_else_return retval = new ChocolateParser.ifelsethen_else_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ELSE95=null;
		Token LCURLY96=null;
		Token RCURLY98=null;
		ParserRuleReturnScope statement97 =null;

		Object ELSE95_tree=null;
		Object LCURLY96_tree=null;
		Object RCURLY98_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:176:5: (| ( ELSE ^ LCURLY ! ( statement )+ RCURLY !) )
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==ASSIGN||LA28_0==COMMA||LA28_0==PRINT||(LA28_0 >= RCURLY && LA28_0 <= SEMICOLON)) ) {
				alt28=1;
			}
			else if ( (LA28_0==ELSE) ) {
				alt28=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}

			switch (alt28) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:177:5: 
					{
					root_0 = (Object)adaptor.nil();


					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:177:9: ( ELSE ^ LCURLY ! ( statement )+ RCURLY !)
					{
					root_0 = (Object)adaptor.nil();


					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:177:9: ( ELSE ^ LCURLY ! ( statement )+ RCURLY !)
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:177:10: ELSE ^ LCURLY ! ( statement )+ RCURLY !
					{
					ELSE95=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifelsethen_else1930); 
					ELSE95_tree = (Object)adaptor.create(ELSE95);
					root_0 = (Object)adaptor.becomeRoot(ELSE95_tree, root_0);

					LCURLY96=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_ifelsethen_else1933); 
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:177:24: ( statement )+
					int cnt27=0;
					loop27:
					while (true) {
						int alt27=2;
						int LA27_0 = input.LA(1);
						if ( (LA27_0==ASSIGN||LA27_0==PRINT||LA27_0==READ) ) {
							alt27=1;
						}

						switch (alt27) {
						case 1 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:177:24: statement
							{
							pushFollow(FOLLOW_statement_in_ifelsethen_else1936);
							statement97=statement();
							state._fsp--;

							adaptor.addChild(root_0, statement97.getTree());

							}
							break;

						default :
							if ( cnt27 >= 1 ) break loop27;
							EarlyExitException eee = new EarlyExitException(27, input);
							throw eee;
						}
						cnt27++;
					}

					RCURLY98=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_ifelsethen_else1939); 
					}

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
	// $ANTLR end "ifelsethen_else"


	public static class operand_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "operand"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:181:1: operand : ( IDENTIFIER | NUMBER | LPAREN ! single_expr RPAREN !);
	public final ChocolateParser.operand_return operand() throws RecognitionException {
		ChocolateParser.operand_return retval = new ChocolateParser.operand_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER99=null;
		Token NUMBER100=null;
		Token LPAREN101=null;
		Token RPAREN103=null;
		ParserRuleReturnScope single_expr102 =null;

		Object IDENTIFIER99_tree=null;
		Object NUMBER100_tree=null;
		Object LPAREN101_tree=null;
		Object RPAREN103_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:182:5: ( IDENTIFIER | NUMBER | LPAREN ! single_expr RPAREN !)
			int alt29=3;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt29=1;
				}
				break;
			case NUMBER:
				{
				alt29=2;
				}
				break;
			case LPAREN:
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
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:182:9: IDENTIFIER
					{
					root_0 = (Object)adaptor.nil();


					IDENTIFIER99=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand1961); 
					IDENTIFIER99_tree = (Object)adaptor.create(IDENTIFIER99);
					adaptor.addChild(root_0, IDENTIFIER99_tree);

					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:183:9: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER100=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_operand1971); 
					NUMBER100_tree = (Object)adaptor.create(NUMBER100);
					adaptor.addChild(root_0, NUMBER100_tree);

					}
					break;
				case 3 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:184:9: LPAREN ! single_expr RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					LPAREN101=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operand1981); 
					pushFollow(FOLLOW_single_expr_in_operand1984);
					single_expr102=single_expr();
					state._fsp--;

					adaptor.addChild(root_0, single_expr102.getTree());

					RPAREN103=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operand1986); 
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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:187:1: type : ( INTEGER | CHAR | BOOLEAN );
	public final ChocolateParser.type_return type() throws RecognitionException {
		ChocolateParser.type_return retval = new ChocolateParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set104=null;

		Object set104_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:188:5: ( INTEGER | CHAR | BOOLEAN )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:
			{
			root_0 = (Object)adaptor.nil();


			set104=input.LT(1);
			if ( (input.LA(1) >= BOOLEAN && input.LA(1) <= CHAR)||input.LA(1)==INTEGER ) {
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
	// $ANTLR end "type"


	public static class string_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "string"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:191:1: string : DQUOTATION ! ( graphic )* DQUOTATION !;
	public final ChocolateParser.string_return string() throws RecognitionException {
		ChocolateParser.string_return retval = new ChocolateParser.string_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token DQUOTATION105=null;
		Token DQUOTATION107=null;
		ParserRuleReturnScope graphic106 =null;

		Object DQUOTATION105_tree=null;
		Object DQUOTATION107_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:192:5: ( DQUOTATION ! ( graphic )* DQUOTATION !)
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:192:9: DQUOTATION ! ( graphic )* DQUOTATION !
			{
			root_0 = (Object)adaptor.nil();


			DQUOTATION105=(Token)match(input,DQUOTATION,FOLLOW_DQUOTATION_in_string2037); 
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:192:21: ( graphic )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==DIGIT||LA30_0==LETTER) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:192:21: graphic
					{
					pushFollow(FOLLOW_graphic_in_string2040);
					graphic106=graphic();
					state._fsp--;

					adaptor.addChild(root_0, graphic106.getTree());

					}
					break;

				default :
					break loop30;
				}
			}

			DQUOTATION107=(Token)match(input,DQUOTATION,FOLLOW_DQUOTATION_in_string2043); 
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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:195:1: graphic : ( LETTER | DIGIT );
	public final ChocolateParser.graphic_return graphic() throws RecognitionException {
		ChocolateParser.graphic_return retval = new ChocolateParser.graphic_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set108=null;

		Object set108_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:196:5: ( LETTER | DIGIT )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:
			{
			root_0 = (Object)adaptor.nil();


			set108=input.LT(1);
			if ( input.LA(1)==DIGIT||input.LA(1)==LETTER ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set108));
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



	public static final BitSet FOLLOW_declarations_in_chocolate985 = new BitSet(new long[]{0x0000212000001020L});
	public static final BitSet FOLLOW_statements_in_chocolate988 = new BitSet(new long[]{0x0000212000001020L});
	public static final BitSet FOLLOW_EOF_in_chocolate992 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_declarations1053 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_declarations1055 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_declaration1077 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_declaration1081 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONSTANT_in_constant1108 = new BitSet(new long[]{0x0000000000400180L});
	public static final BitSet FOLLOW_type_in_constant1111 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_constant1113 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BECOMES_in_constant1115 = new BitSet(new long[]{0x0000001530300000L});
	public static final BitSet FOLLOW_single_expr_in_constant1117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_variable1140 = new BitSet(new long[]{0x0000000000400180L});
	public static final BitSet FOLLOW_type_in_variable1143 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_variable1145 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_variable_becomes_in_variable1147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BECOMES_in_variable_becomes1177 = new BitSet(new long[]{0x0000001530300000L});
	public static final BitSet FOLLOW_single_expr_in_variable_becomes1179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statements1201 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_statements1203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_in_statement1225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_in_statement1234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assign_in_statement1243 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read1265 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_read1268 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read1271 = new BitSet(new long[]{0x0000020000000400L});
	public static final BitSet FOLLOW_readmore_in_read1273 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_RPAREN_in_read1275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_readmore1308 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_readmore1311 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_readmore_in_readmore1313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_in_assign1332 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_assign1335 = new BitSet(new long[]{0x0000001530B00020L});
	public static final BitSet FOLLOW_assignmore_in_assign1337 = new BitSet(new long[]{0x0000001530B00000L});
	public static final BitSet FOLLOW_expr_in_assign1339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_in_assignmore1371 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_assignmore1374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print1397 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_print1400 = new BitSet(new long[]{0x0000001530308000L});
	public static final BitSet FOLLOW_single_expr_in_print1404 = new BitSet(new long[]{0x0000020000000400L});
	public static final BitSet FOLLOW_string_in_print1408 = new BitSet(new long[]{0x0000020000000400L});
	public static final BitSet FOLLOW_printmore_in_print1411 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_RPAREN_in_print1413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_printmore1444 = new BitSet(new long[]{0x0000001530308000L});
	public static final BitSet FOLLOW_single_expr_in_printmore1448 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_string_in_printmore1452 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_printmore_in_printmore1456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compound_expr_in_expr1480 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_single_expr_in_expr1490 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_compound_expr1513 = new BitSet(new long[]{0x0000212000001020L});
	public static final BitSet FOLLOW_declarations_in_compound_expr1518 = new BitSet(new long[]{0x0000001530300000L});
	public static final BitSet FOLLOW_statements_in_compound_expr1522 = new BitSet(new long[]{0x0000001530300000L});
	public static final BitSet FOLLOW_single_expr_in_compound_expr1525 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_compound_expr1527 = new BitSet(new long[]{0x000021A000001020L});
	public static final BitSet FOLLOW_RCURLY_in_compound_expr1532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declarations_in_compound_exprmore1563 = new BitSet(new long[]{0x0000212000001020L});
	public static final BitSet FOLLOW_statements_in_compound_exprmore1567 = new BitSet(new long[]{0x0000212000001020L});
	public static final BitSet FOLLOW_compound_exprmore_in_compound_exprmore1570 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_in_single_expr1593 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifelsethen_in_single_expr1603 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arith2_in_arithmetic1622 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_OR_in_arithmetic1625 = new BitSet(new long[]{0x0000001530100000L});
	public static final BitSet FOLLOW_arith2_in_arithmetic1628 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_arith3_in_arith21653 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_AND_in_arith21656 = new BitSet(new long[]{0x0000001530100000L});
	public static final BitSet FOLLOW_arith3_in_arith21659 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_arith4_in_arith31684 = new BitSet(new long[]{0x00000002030E0002L});
	public static final BitSet FOLLOW_LESS_in_arith31688 = new BitSet(new long[]{0x0000001530100000L});
	public static final BitSet FOLLOW_LESSEQ_in_arith31693 = new BitSet(new long[]{0x0000001530100000L});
	public static final BitSet FOLLOW_GREATEQ_in_arith31698 = new BitSet(new long[]{0x0000001530100000L});
	public static final BitSet FOLLOW_GREAT_in_arith31703 = new BitSet(new long[]{0x0000001530100000L});
	public static final BitSet FOLLOW_EQ_in_arith31708 = new BitSet(new long[]{0x0000001530100000L});
	public static final BitSet FOLLOW_NOTEQ_in_arith31713 = new BitSet(new long[]{0x0000001530100000L});
	public static final BitSet FOLLOW_arith4_in_arith31717 = new BitSet(new long[]{0x00000002030E0002L});
	public static final BitSet FOLLOW_arith5_in_arith41747 = new BitSet(new long[]{0x0000001020000002L});
	public static final BitSet FOLLOW_PLUS_in_arith41751 = new BitSet(new long[]{0x0000001530100000L});
	public static final BitSet FOLLOW_MIN_in_arith41756 = new BitSet(new long[]{0x0000001530100000L});
	public static final BitSet FOLLOW_arith5_in_arith41760 = new BitSet(new long[]{0x0000001020000002L});
	public static final BitSet FOLLOW_arith6_in_arith51791 = new BitSet(new long[]{0x00000000C0004002L});
	public static final BitSet FOLLOW_MULT_in_arith51795 = new BitSet(new long[]{0x0000001530100000L});
	public static final BitSet FOLLOW_DIV_in_arith51800 = new BitSet(new long[]{0x0000001530100000L});
	public static final BitSet FOLLOW_MOD_in_arith51805 = new BitSet(new long[]{0x0000001530100000L});
	public static final BitSet FOLLOW_arith6_in_arith51809 = new BitSet(new long[]{0x00000000C0004002L});
	public static final BitSet FOLLOW_PLUS_in_arith61844 = new BitSet(new long[]{0x0000000410100000L});
	public static final BitSet FOLLOW_MIN_in_arith61849 = new BitSet(new long[]{0x0000000410100000L});
	public static final BitSet FOLLOW_NOT_in_arith61854 = new BitSet(new long[]{0x0000000410100000L});
	public static final BitSet FOLLOW_operand_in_arith61859 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifelsethen1883 = new BitSet(new long[]{0x0000001530100000L});
	public static final BitSet FOLLOW_arithmetic_in_ifelsethen1886 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_THEN_in_ifelsethen1888 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LCURLY_in_ifelsethen1891 = new BitSet(new long[]{0x0000012000000020L});
	public static final BitSet FOLLOW_statement_in_ifelsethen1894 = new BitSet(new long[]{0x000001A000000020L});
	public static final BitSet FOLLOW_RCURLY_in_ifelsethen1897 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_ifelsethen_else_in_ifelsethen1900 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_ifelsethen_else1930 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LCURLY_in_ifelsethen_else1933 = new BitSet(new long[]{0x0000012000000020L});
	public static final BitSet FOLLOW_statement_in_ifelsethen_else1936 = new BitSet(new long[]{0x000001A000000020L});
	public static final BitSet FOLLOW_RCURLY_in_ifelsethen_else1939 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand1961 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand1971 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand1981 = new BitSet(new long[]{0x0000001530300000L});
	public static final BitSet FOLLOW_single_expr_in_operand1984 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_RPAREN_in_operand1986 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DQUOTATION_in_string2037 = new BitSet(new long[]{0x000000000400A000L});
	public static final BitSet FOLLOW_graphic_in_string2040 = new BitSet(new long[]{0x000000000400A000L});
	public static final BitSet FOLLOW_DQUOTATION_in_string2043 = new BitSet(new long[]{0x0000000000000002L});
}
