// $ANTLR 3.5 C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g 2013-06-20 14:42:51

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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:80:1: variable : VAR ^ type IDENTIFIER ( BECOMES single_expr )? ;
	public final ChocolateParser.variable_return variable() throws RecognitionException {
		ChocolateParser.variable_return retval = new ChocolateParser.variable_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VAR13=null;
		Token IDENTIFIER15=null;
		Token BECOMES16=null;
		ParserRuleReturnScope type14 =null;
		ParserRuleReturnScope single_expr17 =null;

		Object VAR13_tree=null;
		Object IDENTIFIER15_tree=null;
		Object BECOMES16_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:81:5: ( VAR ^ type IDENTIFIER ( BECOMES single_expr )? )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:81:9: VAR ^ type IDENTIFIER ( BECOMES single_expr )?
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

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:81:30: ( BECOMES single_expr )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==BECOMES) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:81:31: BECOMES single_expr
					{
					BECOMES16=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_variable1148); 
					BECOMES16_tree = (Object)adaptor.create(BECOMES16);
					adaptor.addChild(root_0, BECOMES16_tree);

					pushFollow(FOLLOW_single_expr_in_variable1150);
					single_expr17=single_expr();
					state._fsp--;

					adaptor.addChild(root_0, single_expr17.getTree());

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

		Token SEMICOLON19=null;
		ParserRuleReturnScope statement18 =null;

		Object SEMICOLON19_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:86:5: ( statement SEMICOLON !)
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:86:7: statement SEMICOLON !
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_statement_in_statements1173);
			statement18=statement();
			state._fsp--;

			adaptor.addChild(root_0, statement18.getTree());

			SEMICOLON19=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statements1175); 
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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:89:1: statement : ( read | print | assign );
	public final ChocolateParser.statement_return statement() throws RecognitionException {
		ChocolateParser.statement_return retval = new ChocolateParser.statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope read20 =null;
		ParserRuleReturnScope print21 =null;
		ParserRuleReturnScope assign22 =null;


		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:90:5: ( read | print | assign )
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
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:90:7: read
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_read_in_statement1197);
					read20=read();
					state._fsp--;

					adaptor.addChild(root_0, read20.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:91:7: print
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_print_in_statement1206);
					print21=print();
					state._fsp--;

					adaptor.addChild(root_0, print21.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:92:7: assign
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_assign_in_statement1215);
					assign22=assign();
					state._fsp--;

					adaptor.addChild(root_0, assign22.getTree());

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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:95:1: read : READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !;
	public final ChocolateParser.read_return read() throws RecognitionException {
		ChocolateParser.read_return retval = new ChocolateParser.read_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token READ23=null;
		Token LPAREN24=null;
		Token IDENTIFIER25=null;
		Token COMMA26=null;
		Token IDENTIFIER27=null;
		Token RPAREN28=null;

		Object READ23_tree=null;
		Object LPAREN24_tree=null;
		Object IDENTIFIER25_tree=null;
		Object COMMA26_tree=null;
		Object IDENTIFIER27_tree=null;
		Object RPAREN28_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:96:5: ( READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !)
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:96:9: READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			READ23=(Token)match(input,READ,FOLLOW_READ_in_read1237); 
			READ23_tree = (Object)adaptor.create(READ23);
			root_0 = (Object)adaptor.becomeRoot(READ23_tree, root_0);

			LPAREN24=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_read1240); 
			IDENTIFIER25=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read1243); 
			IDENTIFIER25_tree = (Object)adaptor.create(IDENTIFIER25);
			adaptor.addChild(root_0, IDENTIFIER25_tree);

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:96:34: ( COMMA ! IDENTIFIER )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==COMMA) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:96:35: COMMA ! IDENTIFIER
					{
					COMMA26=(Token)match(input,COMMA,FOLLOW_COMMA_in_read1246); 
					IDENTIFIER27=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read1249); 
					IDENTIFIER27_tree = (Object)adaptor.create(IDENTIFIER27);
					adaptor.addChild(root_0, IDENTIFIER27_tree);

					}
					break;

				default :
					break loop6;
				}
			}

			RPAREN28=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_read1253); 
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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:99:1: assign : ( ASSIGN ^ IDENTIFIER )+ single_expr ;
	public final ChocolateParser.assign_return assign() throws RecognitionException {
		ChocolateParser.assign_return retval = new ChocolateParser.assign_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ASSIGN29=null;
		Token IDENTIFIER30=null;
		ParserRuleReturnScope single_expr31 =null;

		Object ASSIGN29_tree=null;
		Object IDENTIFIER30_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:100:5: ( ( ASSIGN ^ IDENTIFIER )+ single_expr )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:100:9: ( ASSIGN ^ IDENTIFIER )+ single_expr
			{
			root_0 = (Object)adaptor.nil();


			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:100:9: ( ASSIGN ^ IDENTIFIER )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==ASSIGN) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:100:10: ASSIGN ^ IDENTIFIER
					{
					ASSIGN29=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign1274); 
					ASSIGN29_tree = (Object)adaptor.create(ASSIGN29);
					root_0 = (Object)adaptor.becomeRoot(ASSIGN29_tree, root_0);

					IDENTIFIER30=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assign1277); 
					IDENTIFIER30_tree = (Object)adaptor.create(IDENTIFIER30);
					adaptor.addChild(root_0, IDENTIFIER30_tree);

					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
			}

			pushFollow(FOLLOW_single_expr_in_assign1282);
			single_expr31=single_expr();
			state._fsp--;

			adaptor.addChild(root_0, single_expr31.getTree());

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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:103:1: print : PRINT ^ LPAREN ! ( ( single_expr | string ) COMMA )+ RPAREN !;
	public final ChocolateParser.print_return print() throws RecognitionException {
		ChocolateParser.print_return retval = new ChocolateParser.print_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PRINT32=null;
		Token LPAREN33=null;
		Token COMMA36=null;
		Token RPAREN37=null;
		ParserRuleReturnScope single_expr34 =null;
		ParserRuleReturnScope string35 =null;

		Object PRINT32_tree=null;
		Object LPAREN33_tree=null;
		Object COMMA36_tree=null;
		Object RPAREN37_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:104:5: ( PRINT ^ LPAREN ! ( ( single_expr | string ) COMMA )+ RPAREN !)
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:104:9: PRINT ^ LPAREN ! ( ( single_expr | string ) COMMA )+ RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			PRINT32=(Token)match(input,PRINT,FOLLOW_PRINT_in_print1305); 
			PRINT32_tree = (Object)adaptor.create(PRINT32);
			root_0 = (Object)adaptor.becomeRoot(PRINT32_tree, root_0);

			LPAREN33=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_print1308); 
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:104:24: ( ( single_expr | string ) COMMA )+
			int cnt9=0;
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==DQUOTATION||(LA9_0 >= IDENTIFIER && LA9_0 <= IF)||(LA9_0 >= LPAREN && LA9_0 <= MIN)||LA9_0==NOT||LA9_0==NUMBER||LA9_0==PLUS) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:104:25: ( single_expr | string ) COMMA
					{
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:104:25: ( single_expr | string )
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
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:104:26: single_expr
							{
							pushFollow(FOLLOW_single_expr_in_print1313);
							single_expr34=single_expr();
							state._fsp--;

							adaptor.addChild(root_0, single_expr34.getTree());

							}
							break;
						case 2 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:104:40: string
							{
							pushFollow(FOLLOW_string_in_print1317);
							string35=string();
							state._fsp--;

							adaptor.addChild(root_0, string35.getTree());

							}
							break;

					}

					COMMA36=(Token)match(input,COMMA,FOLLOW_COMMA_in_print1320); 
					COMMA36_tree = (Object)adaptor.create(COMMA36);
					adaptor.addChild(root_0, COMMA36_tree);

					}
					break;

				default :
					if ( cnt9 >= 1 ) break loop9;
					EarlyExitException eee = new EarlyExitException(9, input);
					throw eee;
				}
				cnt9++;
			}

			RPAREN37=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_print1324); 
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


	public static class expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:108:1: expr : ( compound_expr | single_expr );
	public final ChocolateParser.expr_return expr() throws RecognitionException {
		ChocolateParser.expr_return retval = new ChocolateParser.expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope compound_expr38 =null;
		ParserRuleReturnScope single_expr39 =null;


		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:109:5: ( compound_expr | single_expr )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==LCURLY) ) {
				alt10=1;
			}
			else if ( ((LA10_0 >= IDENTIFIER && LA10_0 <= IF)||(LA10_0 >= LPAREN && LA10_0 <= MIN)||LA10_0==NOT||LA10_0==NUMBER||LA10_0==PLUS) ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:109:9: compound_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_compound_expr_in_expr1349);
					compound_expr38=compound_expr();
					state._fsp--;

					adaptor.addChild(root_0, compound_expr38.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:110:9: single_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_single_expr_in_expr1359);
					single_expr39=single_expr();
					state._fsp--;

					adaptor.addChild(root_0, single_expr39.getTree());

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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:113:1: compound_expr : LCURLY ! ( ( declarations | statements )* single_expr SEMICOLON !)+ RCURLY !;
	public final ChocolateParser.compound_expr_return compound_expr() throws RecognitionException {
		ChocolateParser.compound_expr_return retval = new ChocolateParser.compound_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LCURLY40=null;
		Token SEMICOLON44=null;
		Token RCURLY45=null;
		ParserRuleReturnScope declarations41 =null;
		ParserRuleReturnScope statements42 =null;
		ParserRuleReturnScope single_expr43 =null;

		Object LCURLY40_tree=null;
		Object SEMICOLON44_tree=null;
		Object RCURLY45_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:114:5: ( LCURLY ! ( ( declarations | statements )* single_expr SEMICOLON !)+ RCURLY !)
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:114:9: LCURLY ! ( ( declarations | statements )* single_expr SEMICOLON !)+ RCURLY !
			{
			root_0 = (Object)adaptor.nil();


			LCURLY40=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_compound_expr1382); 
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:114:17: ( ( declarations | statements )* single_expr SEMICOLON !)+
			int cnt12=0;
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==ASSIGN||LA12_0==CONSTANT||(LA12_0 >= IDENTIFIER && LA12_0 <= IF)||(LA12_0 >= LPAREN && LA12_0 <= MIN)||LA12_0==NOT||LA12_0==NUMBER||(LA12_0 >= PLUS && LA12_0 <= PRINT)||LA12_0==READ||LA12_0==VAR) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:114:18: ( declarations | statements )* single_expr SEMICOLON !
					{
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:114:18: ( declarations | statements )*
					loop11:
					while (true) {
						int alt11=3;
						int LA11_0 = input.LA(1);
						if ( (LA11_0==CONSTANT||LA11_0==VAR) ) {
							alt11=1;
						}
						else if ( (LA11_0==ASSIGN||LA11_0==PRINT||LA11_0==READ) ) {
							alt11=2;
						}

						switch (alt11) {
						case 1 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:114:19: declarations
							{
							pushFollow(FOLLOW_declarations_in_compound_expr1387);
							declarations41=declarations();
							state._fsp--;

							adaptor.addChild(root_0, declarations41.getTree());

							}
							break;
						case 2 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:114:34: statements
							{
							pushFollow(FOLLOW_statements_in_compound_expr1391);
							statements42=statements();
							state._fsp--;

							adaptor.addChild(root_0, statements42.getTree());

							}
							break;

						default :
							break loop11;
						}
					}

					pushFollow(FOLLOW_single_expr_in_compound_expr1395);
					single_expr43=single_expr();
					state._fsp--;

					adaptor.addChild(root_0, single_expr43.getTree());

					SEMICOLON44=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_compound_expr1397); 
					}
					break;

				default :
					if ( cnt12 >= 1 ) break loop12;
					EarlyExitException eee = new EarlyExitException(12, input);
					throw eee;
				}
				cnt12++;
			}

			RCURLY45=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_compound_expr1402); 
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


	public static class single_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "single_expr"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:117:1: single_expr : ( arithmetic | ifelsethen );
	public final ChocolateParser.single_expr_return single_expr() throws RecognitionException {
		ChocolateParser.single_expr_return retval = new ChocolateParser.single_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope arithmetic46 =null;
		ParserRuleReturnScope ifelsethen47 =null;


		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:118:5: ( arithmetic | ifelsethen )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==IDENTIFIER||(LA13_0 >= LPAREN && LA13_0 <= MIN)||LA13_0==NOT||LA13_0==NUMBER||LA13_0==PLUS) ) {
				alt13=1;
			}
			else if ( (LA13_0==IF) ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:118:9: arithmetic
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_arithmetic_in_single_expr1426);
					arithmetic46=arithmetic();
					state._fsp--;

					adaptor.addChild(root_0, arithmetic46.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:119:9: ifelsethen
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_ifelsethen_in_single_expr1436);
					ifelsethen47=ifelsethen();
					state._fsp--;

					adaptor.addChild(root_0, ifelsethen47.getTree());

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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:122:1: arithmetic : arith2 ( OR ^ arith2 )* ;
	public final ChocolateParser.arithmetic_return arithmetic() throws RecognitionException {
		ChocolateParser.arithmetic_return retval = new ChocolateParser.arithmetic_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token OR49=null;
		ParserRuleReturnScope arith248 =null;
		ParserRuleReturnScope arith250 =null;

		Object OR49_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:123:5: ( arith2 ( OR ^ arith2 )* )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:123:9: arith2 ( OR ^ arith2 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arith2_in_arithmetic1455);
			arith248=arith2();
			state._fsp--;

			adaptor.addChild(root_0, arith248.getTree());

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:123:16: ( OR ^ arith2 )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==OR) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:123:17: OR ^ arith2
					{
					OR49=(Token)match(input,OR,FOLLOW_OR_in_arithmetic1458); 
					OR49_tree = (Object)adaptor.create(OR49);
					root_0 = (Object)adaptor.becomeRoot(OR49_tree, root_0);

					pushFollow(FOLLOW_arith2_in_arithmetic1461);
					arith250=arith2();
					state._fsp--;

					adaptor.addChild(root_0, arith250.getTree());

					}
					break;

				default :
					break loop14;
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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:126:1: arith2 : arith3 ( AND ^ arith3 )* ;
	public final ChocolateParser.arith2_return arith2() throws RecognitionException {
		ChocolateParser.arith2_return retval = new ChocolateParser.arith2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AND52=null;
		ParserRuleReturnScope arith351 =null;
		ParserRuleReturnScope arith353 =null;

		Object AND52_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:127:5: ( arith3 ( AND ^ arith3 )* )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:127:9: arith3 ( AND ^ arith3 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arith3_in_arith21486);
			arith351=arith3();
			state._fsp--;

			adaptor.addChild(root_0, arith351.getTree());

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:127:16: ( AND ^ arith3 )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==AND) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:127:17: AND ^ arith3
					{
					AND52=(Token)match(input,AND,FOLLOW_AND_in_arith21489); 
					AND52_tree = (Object)adaptor.create(AND52);
					root_0 = (Object)adaptor.becomeRoot(AND52_tree, root_0);

					pushFollow(FOLLOW_arith3_in_arith21492);
					arith353=arith3();
					state._fsp--;

					adaptor.addChild(root_0, arith353.getTree());

					}
					break;

				default :
					break loop15;
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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:130:1: arith3 : arith4 ( ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^) arith4 )* ;
	public final ChocolateParser.arith3_return arith3() throws RecognitionException {
		ChocolateParser.arith3_return retval = new ChocolateParser.arith3_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LESS55=null;
		Token LESSEQ56=null;
		Token GREATEQ57=null;
		Token GREAT58=null;
		Token EQ59=null;
		Token NOTEQ60=null;
		ParserRuleReturnScope arith454 =null;
		ParserRuleReturnScope arith461 =null;

		Object LESS55_tree=null;
		Object LESSEQ56_tree=null;
		Object GREATEQ57_tree=null;
		Object GREAT58_tree=null;
		Object EQ59_tree=null;
		Object NOTEQ60_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:131:5: ( arith4 ( ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^) arith4 )* )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:131:9: arith4 ( ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^) arith4 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arith4_in_arith31517);
			arith454=arith4();
			state._fsp--;

			adaptor.addChild(root_0, arith454.getTree());

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:131:16: ( ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^) arith4 )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( ((LA17_0 >= EQ && LA17_0 <= GREATEQ)||(LA17_0 >= LESS && LA17_0 <= LESSEQ)||LA17_0==NOTEQ) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:131:17: ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^) arith4
					{
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:131:17: ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^)
					int alt16=6;
					switch ( input.LA(1) ) {
					case LESS:
						{
						alt16=1;
						}
						break;
					case LESSEQ:
						{
						alt16=2;
						}
						break;
					case GREATEQ:
						{
						alt16=3;
						}
						break;
					case GREAT:
						{
						alt16=4;
						}
						break;
					case EQ:
						{
						alt16=5;
						}
						break;
					case NOTEQ:
						{
						alt16=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 16, 0, input);
						throw nvae;
					}
					switch (alt16) {
						case 1 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:131:18: LESS ^
							{
							LESS55=(Token)match(input,LESS,FOLLOW_LESS_in_arith31521); 
							LESS55_tree = (Object)adaptor.create(LESS55);
							root_0 = (Object)adaptor.becomeRoot(LESS55_tree, root_0);

							}
							break;
						case 2 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:131:26: LESSEQ ^
							{
							LESSEQ56=(Token)match(input,LESSEQ,FOLLOW_LESSEQ_in_arith31526); 
							LESSEQ56_tree = (Object)adaptor.create(LESSEQ56);
							root_0 = (Object)adaptor.becomeRoot(LESSEQ56_tree, root_0);

							}
							break;
						case 3 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:131:36: GREATEQ ^
							{
							GREATEQ57=(Token)match(input,GREATEQ,FOLLOW_GREATEQ_in_arith31531); 
							GREATEQ57_tree = (Object)adaptor.create(GREATEQ57);
							root_0 = (Object)adaptor.becomeRoot(GREATEQ57_tree, root_0);

							}
							break;
						case 4 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:131:47: GREAT ^
							{
							GREAT58=(Token)match(input,GREAT,FOLLOW_GREAT_in_arith31536); 
							GREAT58_tree = (Object)adaptor.create(GREAT58);
							root_0 = (Object)adaptor.becomeRoot(GREAT58_tree, root_0);

							}
							break;
						case 5 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:131:56: EQ ^
							{
							EQ59=(Token)match(input,EQ,FOLLOW_EQ_in_arith31541); 
							EQ59_tree = (Object)adaptor.create(EQ59);
							root_0 = (Object)adaptor.becomeRoot(EQ59_tree, root_0);

							}
							break;
						case 6 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:131:62: NOTEQ ^
							{
							NOTEQ60=(Token)match(input,NOTEQ,FOLLOW_NOTEQ_in_arith31546); 
							NOTEQ60_tree = (Object)adaptor.create(NOTEQ60);
							root_0 = (Object)adaptor.becomeRoot(NOTEQ60_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_arith4_in_arith31550);
					arith461=arith4();
					state._fsp--;

					adaptor.addChild(root_0, arith461.getTree());

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
	// $ANTLR end "arith3"


	public static class arith4_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arith4"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:134:1: arith4 : arith5 ( ( PLUS ^| MIN ^) arith5 )* ;
	public final ChocolateParser.arith4_return arith4() throws RecognitionException {
		ChocolateParser.arith4_return retval = new ChocolateParser.arith4_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS63=null;
		Token MIN64=null;
		ParserRuleReturnScope arith562 =null;
		ParserRuleReturnScope arith565 =null;

		Object PLUS63_tree=null;
		Object MIN64_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:135:5: ( arith5 ( ( PLUS ^| MIN ^) arith5 )* )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:135:9: arith5 ( ( PLUS ^| MIN ^) arith5 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arith5_in_arith41580);
			arith562=arith5();
			state._fsp--;

			adaptor.addChild(root_0, arith562.getTree());

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:135:16: ( ( PLUS ^| MIN ^) arith5 )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==MIN||LA19_0==PLUS) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:135:17: ( PLUS ^| MIN ^) arith5
					{
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:135:17: ( PLUS ^| MIN ^)
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==PLUS) ) {
						alt18=1;
					}
					else if ( (LA18_0==MIN) ) {
						alt18=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 18, 0, input);
						throw nvae;
					}

					switch (alt18) {
						case 1 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:135:18: PLUS ^
							{
							PLUS63=(Token)match(input,PLUS,FOLLOW_PLUS_in_arith41584); 
							PLUS63_tree = (Object)adaptor.create(PLUS63);
							root_0 = (Object)adaptor.becomeRoot(PLUS63_tree, root_0);

							}
							break;
						case 2 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:135:26: MIN ^
							{
							MIN64=(Token)match(input,MIN,FOLLOW_MIN_in_arith41589); 
							MIN64_tree = (Object)adaptor.create(MIN64);
							root_0 = (Object)adaptor.becomeRoot(MIN64_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_arith5_in_arith41593);
					arith565=arith5();
					state._fsp--;

					adaptor.addChild(root_0, arith565.getTree());

					}
					break;

				default :
					break loop19;
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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:138:1: arith5 : arith6 ( ( MULT ^| DIV ^| MOD ^) arith6 )* ;
	public final ChocolateParser.arith5_return arith5() throws RecognitionException {
		ChocolateParser.arith5_return retval = new ChocolateParser.arith5_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MULT67=null;
		Token DIV68=null;
		Token MOD69=null;
		ParserRuleReturnScope arith666 =null;
		ParserRuleReturnScope arith670 =null;

		Object MULT67_tree=null;
		Object DIV68_tree=null;
		Object MOD69_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:139:5: ( arith6 ( ( MULT ^| DIV ^| MOD ^) arith6 )* )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:139:9: arith6 ( ( MULT ^| DIV ^| MOD ^) arith6 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arith6_in_arith51624);
			arith666=arith6();
			state._fsp--;

			adaptor.addChild(root_0, arith666.getTree());

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:139:16: ( ( MULT ^| DIV ^| MOD ^) arith6 )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==DIV||(LA21_0 >= MOD && LA21_0 <= MULT)) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:139:17: ( MULT ^| DIV ^| MOD ^) arith6
					{
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:139:17: ( MULT ^| DIV ^| MOD ^)
					int alt20=3;
					switch ( input.LA(1) ) {
					case MULT:
						{
						alt20=1;
						}
						break;
					case DIV:
						{
						alt20=2;
						}
						break;
					case MOD:
						{
						alt20=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 20, 0, input);
						throw nvae;
					}
					switch (alt20) {
						case 1 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:139:18: MULT ^
							{
							MULT67=(Token)match(input,MULT,FOLLOW_MULT_in_arith51628); 
							MULT67_tree = (Object)adaptor.create(MULT67);
							root_0 = (Object)adaptor.becomeRoot(MULT67_tree, root_0);

							}
							break;
						case 2 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:139:26: DIV ^
							{
							DIV68=(Token)match(input,DIV,FOLLOW_DIV_in_arith51633); 
							DIV68_tree = (Object)adaptor.create(DIV68);
							root_0 = (Object)adaptor.becomeRoot(DIV68_tree, root_0);

							}
							break;
						case 3 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:139:33: MOD ^
							{
							MOD69=(Token)match(input,MOD,FOLLOW_MOD_in_arith51638); 
							MOD69_tree = (Object)adaptor.create(MOD69);
							root_0 = (Object)adaptor.becomeRoot(MOD69_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_arith6_in_arith51642);
					arith670=arith6();
					state._fsp--;

					adaptor.addChild(root_0, arith670.getTree());

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
	// $ANTLR end "arith5"


	public static class arith6_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arith6"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:142:1: arith6 : ( ( PLUS ^| MIN ^| NOT ^)? operand ) ;
	public final ChocolateParser.arith6_return arith6() throws RecognitionException {
		ChocolateParser.arith6_return retval = new ChocolateParser.arith6_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS71=null;
		Token MIN72=null;
		Token NOT73=null;
		ParserRuleReturnScope operand74 =null;

		Object PLUS71_tree=null;
		Object MIN72_tree=null;
		Object NOT73_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:143:5: ( ( ( PLUS ^| MIN ^| NOT ^)? operand ) )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:143:9: ( ( PLUS ^| MIN ^| NOT ^)? operand )
			{
			root_0 = (Object)adaptor.nil();


			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:143:9: ( ( PLUS ^| MIN ^| NOT ^)? operand )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:143:10: ( PLUS ^| MIN ^| NOT ^)? operand
			{
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:143:10: ( PLUS ^| MIN ^| NOT ^)?
			int alt22=4;
			switch ( input.LA(1) ) {
				case PLUS:
					{
					alt22=1;
					}
					break;
				case MIN:
					{
					alt22=2;
					}
					break;
				case NOT:
					{
					alt22=3;
					}
					break;
			}
			switch (alt22) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:143:11: PLUS ^
					{
					PLUS71=(Token)match(input,PLUS,FOLLOW_PLUS_in_arith61677); 
					PLUS71_tree = (Object)adaptor.create(PLUS71);
					root_0 = (Object)adaptor.becomeRoot(PLUS71_tree, root_0);

					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:143:19: MIN ^
					{
					MIN72=(Token)match(input,MIN,FOLLOW_MIN_in_arith61682); 
					MIN72_tree = (Object)adaptor.create(MIN72);
					root_0 = (Object)adaptor.becomeRoot(MIN72_tree, root_0);

					}
					break;
				case 3 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:143:26: NOT ^
					{
					NOT73=(Token)match(input,NOT,FOLLOW_NOT_in_arith61687); 
					NOT73_tree = (Object)adaptor.create(NOT73);
					root_0 = (Object)adaptor.becomeRoot(NOT73_tree, root_0);

					}
					break;

			}

			pushFollow(FOLLOW_operand_in_arith61692);
			operand74=operand();
			state._fsp--;

			adaptor.addChild(root_0, operand74.getTree());

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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:146:1: ifelsethen : IF ^ arithmetic THEN ! LCURLY ! ( statement )+ RCURLY ! ( ELSE ! LCURLY ! ( statement )+ RCURLY !)? ;
	public final ChocolateParser.ifelsethen_return ifelsethen() throws RecognitionException {
		ChocolateParser.ifelsethen_return retval = new ChocolateParser.ifelsethen_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IF75=null;
		Token THEN77=null;
		Token LCURLY78=null;
		Token RCURLY80=null;
		Token ELSE81=null;
		Token LCURLY82=null;
		Token RCURLY84=null;
		ParserRuleReturnScope arithmetic76 =null;
		ParserRuleReturnScope statement79 =null;
		ParserRuleReturnScope statement83 =null;

		Object IF75_tree=null;
		Object THEN77_tree=null;
		Object LCURLY78_tree=null;
		Object RCURLY80_tree=null;
		Object ELSE81_tree=null;
		Object LCURLY82_tree=null;
		Object RCURLY84_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:147:5: ( IF ^ arithmetic THEN ! LCURLY ! ( statement )+ RCURLY ! ( ELSE ! LCURLY ! ( statement )+ RCURLY !)? )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:147:9: IF ^ arithmetic THEN ! LCURLY ! ( statement )+ RCURLY ! ( ELSE ! LCURLY ! ( statement )+ RCURLY !)?
			{
			root_0 = (Object)adaptor.nil();


			IF75=(Token)match(input,IF,FOLLOW_IF_in_ifelsethen1716); 
			IF75_tree = (Object)adaptor.create(IF75);
			root_0 = (Object)adaptor.becomeRoot(IF75_tree, root_0);

			pushFollow(FOLLOW_arithmetic_in_ifelsethen1719);
			arithmetic76=arithmetic();
			state._fsp--;

			adaptor.addChild(root_0, arithmetic76.getTree());

			THEN77=(Token)match(input,THEN,FOLLOW_THEN_in_ifelsethen1721); 
			LCURLY78=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_ifelsethen1724); 
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:147:38: ( statement )+
			int cnt23=0;
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==ASSIGN||LA23_0==PRINT||LA23_0==READ) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:147:38: statement
					{
					pushFollow(FOLLOW_statement_in_ifelsethen1727);
					statement79=statement();
					state._fsp--;

					adaptor.addChild(root_0, statement79.getTree());

					}
					break;

				default :
					if ( cnt23 >= 1 ) break loop23;
					EarlyExitException eee = new EarlyExitException(23, input);
					throw eee;
				}
				cnt23++;
			}

			RCURLY80=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_ifelsethen1730); 
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:147:57: ( ELSE ! LCURLY ! ( statement )+ RCURLY !)?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==ELSE) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:147:58: ELSE ! LCURLY ! ( statement )+ RCURLY !
					{
					ELSE81=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifelsethen1734); 
					LCURLY82=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_ifelsethen1737); 
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:147:72: ( statement )+
					int cnt24=0;
					loop24:
					while (true) {
						int alt24=2;
						int LA24_0 = input.LA(1);
						if ( (LA24_0==ASSIGN||LA24_0==PRINT||LA24_0==READ) ) {
							alt24=1;
						}

						switch (alt24) {
						case 1 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:147:72: statement
							{
							pushFollow(FOLLOW_statement_in_ifelsethen1740);
							statement83=statement();
							state._fsp--;

							adaptor.addChild(root_0, statement83.getTree());

							}
							break;

						default :
							if ( cnt24 >= 1 ) break loop24;
							EarlyExitException eee = new EarlyExitException(24, input);
							throw eee;
						}
						cnt24++;
					}

					RCURLY84=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_ifelsethen1743); 
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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:151:1: operand : ( IDENTIFIER | NUMBER | LPAREN ! single_expr RPAREN !);
	public final ChocolateParser.operand_return operand() throws RecognitionException {
		ChocolateParser.operand_return retval = new ChocolateParser.operand_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER85=null;
		Token NUMBER86=null;
		Token LPAREN87=null;
		Token RPAREN89=null;
		ParserRuleReturnScope single_expr88 =null;

		Object IDENTIFIER85_tree=null;
		Object NUMBER86_tree=null;
		Object LPAREN87_tree=null;
		Object RPAREN89_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:152:5: ( IDENTIFIER | NUMBER | LPAREN ! single_expr RPAREN !)
			int alt26=3;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt26=1;
				}
				break;
			case NUMBER:
				{
				alt26=2;
				}
				break;
			case LPAREN:
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
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:152:9: IDENTIFIER
					{
					root_0 = (Object)adaptor.nil();


					IDENTIFIER85=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand1766); 
					IDENTIFIER85_tree = (Object)adaptor.create(IDENTIFIER85);
					adaptor.addChild(root_0, IDENTIFIER85_tree);

					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:153:9: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER86=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_operand1776); 
					NUMBER86_tree = (Object)adaptor.create(NUMBER86);
					adaptor.addChild(root_0, NUMBER86_tree);

					}
					break;
				case 3 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:154:9: LPAREN ! single_expr RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					LPAREN87=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operand1786); 
					pushFollow(FOLLOW_single_expr_in_operand1789);
					single_expr88=single_expr();
					state._fsp--;

					adaptor.addChild(root_0, single_expr88.getTree());

					RPAREN89=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operand1791); 
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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:157:1: type : ( INTEGER | CHAR | BOOLEAN );
	public final ChocolateParser.type_return type() throws RecognitionException {
		ChocolateParser.type_return retval = new ChocolateParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set90=null;

		Object set90_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:158:5: ( INTEGER | CHAR | BOOLEAN )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:
			{
			root_0 = (Object)adaptor.nil();


			set90=input.LT(1);
			if ( (input.LA(1) >= BOOLEAN && input.LA(1) <= CHAR)||input.LA(1)==INTEGER ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set90));
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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:161:1: string : DQUOTATION ! ( graphic )* DQUOTATION !;
	public final ChocolateParser.string_return string() throws RecognitionException {
		ChocolateParser.string_return retval = new ChocolateParser.string_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token DQUOTATION91=null;
		Token DQUOTATION93=null;
		ParserRuleReturnScope graphic92 =null;

		Object DQUOTATION91_tree=null;
		Object DQUOTATION93_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:162:5: ( DQUOTATION ! ( graphic )* DQUOTATION !)
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:162:9: DQUOTATION ! ( graphic )* DQUOTATION !
			{
			root_0 = (Object)adaptor.nil();


			DQUOTATION91=(Token)match(input,DQUOTATION,FOLLOW_DQUOTATION_in_string1842); 
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:162:21: ( graphic )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==DIGIT||LA27_0==LETTER) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:162:21: graphic
					{
					pushFollow(FOLLOW_graphic_in_string1845);
					graphic92=graphic();
					state._fsp--;

					adaptor.addChild(root_0, graphic92.getTree());

					}
					break;

				default :
					break loop27;
				}
			}

			DQUOTATION93=(Token)match(input,DQUOTATION,FOLLOW_DQUOTATION_in_string1848); 
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
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:165:1: graphic : ( LETTER | DIGIT );
	public final ChocolateParser.graphic_return graphic() throws RecognitionException {
		ChocolateParser.graphic_return retval = new ChocolateParser.graphic_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set94=null;

		Object set94_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:166:5: ( LETTER | DIGIT )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:
			{
			root_0 = (Object)adaptor.nil();


			set94=input.LT(1);
			if ( input.LA(1)==DIGIT||input.LA(1)==LETTER ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set94));
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
	public static final BitSet FOLLOW_IDENTIFIER_in_variable1145 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_BECOMES_in_variable1148 = new BitSet(new long[]{0x0000001530300000L});
	public static final BitSet FOLLOW_single_expr_in_variable1150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statements1173 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_statements1175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_in_statement1197 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_in_statement1206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assign_in_statement1215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read1237 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_read1240 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read1243 = new BitSet(new long[]{0x0000020000000400L});
	public static final BitSet FOLLOW_COMMA_in_read1246 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read1249 = new BitSet(new long[]{0x0000020000000400L});
	public static final BitSet FOLLOW_RPAREN_in_read1253 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_in_assign1274 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_assign1277 = new BitSet(new long[]{0x0000001530300020L});
	public static final BitSet FOLLOW_single_expr_in_assign1282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print1305 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_print1308 = new BitSet(new long[]{0x0000001530308000L});
	public static final BitSet FOLLOW_single_expr_in_print1313 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_string_in_print1317 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COMMA_in_print1320 = new BitSet(new long[]{0x0000021530308000L});
	public static final BitSet FOLLOW_RPAREN_in_print1324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compound_expr_in_expr1349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_single_expr_in_expr1359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_compound_expr1382 = new BitSet(new long[]{0x0000213530301020L});
	public static final BitSet FOLLOW_declarations_in_compound_expr1387 = new BitSet(new long[]{0x0000213530301020L});
	public static final BitSet FOLLOW_statements_in_compound_expr1391 = new BitSet(new long[]{0x0000213530301020L});
	public static final BitSet FOLLOW_single_expr_in_compound_expr1395 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_compound_expr1397 = new BitSet(new long[]{0x000021B530301020L});
	public static final BitSet FOLLOW_RCURLY_in_compound_expr1402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_in_single_expr1426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifelsethen_in_single_expr1436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arith2_in_arithmetic1455 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_OR_in_arithmetic1458 = new BitSet(new long[]{0x0000001530100000L});
	public static final BitSet FOLLOW_arith2_in_arithmetic1461 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_arith3_in_arith21486 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_AND_in_arith21489 = new BitSet(new long[]{0x0000001530100000L});
	public static final BitSet FOLLOW_arith3_in_arith21492 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_arith4_in_arith31517 = new BitSet(new long[]{0x00000002030E0002L});
	public static final BitSet FOLLOW_LESS_in_arith31521 = new BitSet(new long[]{0x0000001530100000L});
	public static final BitSet FOLLOW_LESSEQ_in_arith31526 = new BitSet(new long[]{0x0000001530100000L});
	public static final BitSet FOLLOW_GREATEQ_in_arith31531 = new BitSet(new long[]{0x0000001530100000L});
	public static final BitSet FOLLOW_GREAT_in_arith31536 = new BitSet(new long[]{0x0000001530100000L});
	public static final BitSet FOLLOW_EQ_in_arith31541 = new BitSet(new long[]{0x0000001530100000L});
	public static final BitSet FOLLOW_NOTEQ_in_arith31546 = new BitSet(new long[]{0x0000001530100000L});
	public static final BitSet FOLLOW_arith4_in_arith31550 = new BitSet(new long[]{0x00000002030E0002L});
	public static final BitSet FOLLOW_arith5_in_arith41580 = new BitSet(new long[]{0x0000001020000002L});
	public static final BitSet FOLLOW_PLUS_in_arith41584 = new BitSet(new long[]{0x0000001530100000L});
	public static final BitSet FOLLOW_MIN_in_arith41589 = new BitSet(new long[]{0x0000001530100000L});
	public static final BitSet FOLLOW_arith5_in_arith41593 = new BitSet(new long[]{0x0000001020000002L});
	public static final BitSet FOLLOW_arith6_in_arith51624 = new BitSet(new long[]{0x00000000C0004002L});
	public static final BitSet FOLLOW_MULT_in_arith51628 = new BitSet(new long[]{0x0000001530100000L});
	public static final BitSet FOLLOW_DIV_in_arith51633 = new BitSet(new long[]{0x0000001530100000L});
	public static final BitSet FOLLOW_MOD_in_arith51638 = new BitSet(new long[]{0x0000001530100000L});
	public static final BitSet FOLLOW_arith6_in_arith51642 = new BitSet(new long[]{0x00000000C0004002L});
	public static final BitSet FOLLOW_PLUS_in_arith61677 = new BitSet(new long[]{0x0000000410100000L});
	public static final BitSet FOLLOW_MIN_in_arith61682 = new BitSet(new long[]{0x0000000410100000L});
	public static final BitSet FOLLOW_NOT_in_arith61687 = new BitSet(new long[]{0x0000000410100000L});
	public static final BitSet FOLLOW_operand_in_arith61692 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifelsethen1716 = new BitSet(new long[]{0x0000001530100000L});
	public static final BitSet FOLLOW_arithmetic_in_ifelsethen1719 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_THEN_in_ifelsethen1721 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LCURLY_in_ifelsethen1724 = new BitSet(new long[]{0x0000012000000020L});
	public static final BitSet FOLLOW_statement_in_ifelsethen1727 = new BitSet(new long[]{0x000001A000000020L});
	public static final BitSet FOLLOW_RCURLY_in_ifelsethen1730 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_ELSE_in_ifelsethen1734 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LCURLY_in_ifelsethen1737 = new BitSet(new long[]{0x0000012000000020L});
	public static final BitSet FOLLOW_statement_in_ifelsethen1740 = new BitSet(new long[]{0x000001A000000020L});
	public static final BitSet FOLLOW_RCURLY_in_ifelsethen1743 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand1766 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand1776 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand1786 = new BitSet(new long[]{0x0000001530300000L});
	public static final BitSet FOLLOW_single_expr_in_operand1789 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_RPAREN_in_operand1791 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DQUOTATION_in_string1842 = new BitSet(new long[]{0x000000000400A000L});
	public static final BitSet FOLLOW_graphic_in_string1845 = new BitSet(new long[]{0x000000000400A000L});
	public static final BitSet FOLLOW_DQUOTATION_in_string1848 = new BitSet(new long[]{0x0000000000000002L});
}
