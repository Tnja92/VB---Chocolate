// $ANTLR 3.5 C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g 2013-07-09 14:03:41

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
		"DIV", "DO", "DQUOTATION", "ELSE", "EQ", "GREAT", "GREATEQ", "IDENTIFIER", 
		"IF", "INTEGER", "LCURLY", "LESS", "LESSEQ", "LETTER", "LOWER", "LPAREN", 
		"MIN", "MOD", "MULT", "NEG", "NOT", "NOTEQ", "NUMBER", "OR", "PLUS", "POS", 
		"PRINT", "PROGRAM", "QUOTATION", "RCURLY", "READ", "RPAREN", "SEMICOLON", 
		"THEN", "UPPER", "VAR", "WHILE", "WS"
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
	public static final int DO=16;
	public static final int DQUOTATION=17;
	public static final int ELSE=18;
	public static final int EQ=19;
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
	public static final int NEG=34;
	public static final int NOT=35;
	public static final int NOTEQ=36;
	public static final int NUMBER=37;
	public static final int OR=38;
	public static final int PLUS=39;
	public static final int POS=40;
	public static final int PRINT=41;
	public static final int PROGRAM=42;
	public static final int QUOTATION=43;
	public static final int RCURLY=44;
	public static final int READ=45;
	public static final int RPAREN=46;
	public static final int SEMICOLON=47;
	public static final int THEN=48;
	public static final int UPPER=49;
	public static final int VAR=50;
	public static final int WHILE=51;
	public static final int WS=52;

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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:65:1: program : ( ( declarations )* statements )+ EOF -> ^( PROGRAM ( ( declarations )* statements )+ ) ;
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
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:66:5: ( ( ( declarations )* statements )+ EOF -> ^( PROGRAM ( ( declarations )* statements )+ ) )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:66:10: ( ( declarations )* statements )+ EOF
			{
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:66:10: ( ( declarations )* statements )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==CONSTANT||(LA2_0 >= IDENTIFIER && LA2_0 <= IF)||LA2_0==PRINT||LA2_0==READ||(LA2_0 >= VAR && LA2_0 <= WHILE)) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:66:11: ( declarations )* statements
					{
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:66:11: ( declarations )*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( (LA1_0==CONSTANT||LA1_0==VAR) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:66:11: declarations
							{
							pushFollow(FOLLOW_declarations_in_program1093);
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

					pushFollow(FOLLOW_statements_in_program1096);
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

			EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_program1100); if (state.failed) return retval; 
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
			// 67:13: -> ^( PROGRAM ( ( declarations )* statements )+ )
			{
				// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:67:17: ^( PROGRAM ( ( declarations )* statements )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				if ( !(stream_statements.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_statements.hasNext() ) {
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:67:28: ( declarations )*
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:72:1: declarations : declaration SEMICOLON !;
	public final ChocolateParser.declarations_return declarations() throws RecognitionException {
		ChocolateParser.declarations_return retval = new ChocolateParser.declarations_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMICOLON5=null;
		ParserRuleReturnScope declaration4 =null;

		Object SEMICOLON5_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:73:5: ( declaration SEMICOLON !)
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:73:9: declaration SEMICOLON !
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_declaration_in_declarations1163);
			declaration4=declaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration4.getTree());

			SEMICOLON5=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_declarations1165); if (state.failed) return retval;
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:76:1: declaration : ( CONSTANT ^ type IDENTIFIER ( COMMA ! IDENTIFIER )* ASSIGN ( type_op ) | VAR ^ type IDENTIFIER ( COMMA ! IDENTIFIER )* ( ASSIGN ( type_op ) )? );
	public final ChocolateParser.declaration_return declaration() throws RecognitionException {
		ChocolateParser.declaration_return retval = new ChocolateParser.declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token CONSTANT6=null;
		Token IDENTIFIER8=null;
		Token COMMA9=null;
		Token IDENTIFIER10=null;
		Token ASSIGN11=null;
		Token VAR13=null;
		Token IDENTIFIER15=null;
		Token COMMA16=null;
		Token IDENTIFIER17=null;
		Token ASSIGN18=null;
		ParserRuleReturnScope type7 =null;
		ParserRuleReturnScope type_op12 =null;
		ParserRuleReturnScope type14 =null;
		ParserRuleReturnScope type_op19 =null;

		Object CONSTANT6_tree=null;
		Object IDENTIFIER8_tree=null;
		Object COMMA9_tree=null;
		Object IDENTIFIER10_tree=null;
		Object ASSIGN11_tree=null;
		Object VAR13_tree=null;
		Object IDENTIFIER15_tree=null;
		Object COMMA16_tree=null;
		Object IDENTIFIER17_tree=null;
		Object ASSIGN18_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:77:5: ( CONSTANT ^ type IDENTIFIER ( COMMA ! IDENTIFIER )* ASSIGN ( type_op ) | VAR ^ type IDENTIFIER ( COMMA ! IDENTIFIER )* ( ASSIGN ( type_op ) )? )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==CONSTANT) ) {
				alt6=1;
			}
			else if ( (LA6_0==VAR) ) {
				alt6=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:77:9: CONSTANT ^ type IDENTIFIER ( COMMA ! IDENTIFIER )* ASSIGN ( type_op )
					{
					root_0 = (Object)adaptor.nil();


					CONSTANT6=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_declaration1186); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CONSTANT6_tree = (Object)adaptor.create(CONSTANT6);
					root_0 = (Object)adaptor.becomeRoot(CONSTANT6_tree, root_0);
					}

					pushFollow(FOLLOW_type_in_declaration1189);
					type7=type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, type7.getTree());

					IDENTIFIER8=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration1191); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER8_tree = (Object)adaptor.create(IDENTIFIER8);
					adaptor.addChild(root_0, IDENTIFIER8_tree);
					}

					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:77:35: ( COMMA ! IDENTIFIER )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0==COMMA) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:77:36: COMMA ! IDENTIFIER
							{
							COMMA9=(Token)match(input,COMMA,FOLLOW_COMMA_in_declaration1194); if (state.failed) return retval;
							IDENTIFIER10=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration1197); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							IDENTIFIER10_tree = (Object)adaptor.create(IDENTIFIER10);
							adaptor.addChild(root_0, IDENTIFIER10_tree);
							}

							}
							break;

						default :
							break loop3;
						}
					}

					ASSIGN11=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_declaration1201); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ASSIGN11_tree = (Object)adaptor.create(ASSIGN11);
					adaptor.addChild(root_0, ASSIGN11_tree);
					}

					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:77:63: ( type_op )
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:77:64: type_op
					{
					pushFollow(FOLLOW_type_op_in_declaration1204);
					type_op12=type_op();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, type_op12.getTree());

					}

					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:78:9: VAR ^ type IDENTIFIER ( COMMA ! IDENTIFIER )* ( ASSIGN ( type_op ) )?
					{
					root_0 = (Object)adaptor.nil();


					VAR13=(Token)match(input,VAR,FOLLOW_VAR_in_declaration1215); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VAR13_tree = (Object)adaptor.create(VAR13);
					root_0 = (Object)adaptor.becomeRoot(VAR13_tree, root_0);
					}

					pushFollow(FOLLOW_type_in_declaration1218);
					type14=type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, type14.getTree());

					IDENTIFIER15=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration1220); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER15_tree = (Object)adaptor.create(IDENTIFIER15);
					adaptor.addChild(root_0, IDENTIFIER15_tree);
					}

					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:78:30: ( COMMA ! IDENTIFIER )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==COMMA) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:78:31: COMMA ! IDENTIFIER
							{
							COMMA16=(Token)match(input,COMMA,FOLLOW_COMMA_in_declaration1223); if (state.failed) return retval;
							IDENTIFIER17=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration1226); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							IDENTIFIER17_tree = (Object)adaptor.create(IDENTIFIER17);
							adaptor.addChild(root_0, IDENTIFIER17_tree);
							}

							}
							break;

						default :
							break loop4;
						}
					}

					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:78:51: ( ASSIGN ( type_op ) )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==ASSIGN) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:78:52: ASSIGN ( type_op )
							{
							ASSIGN18=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_declaration1231); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							ASSIGN18_tree = (Object)adaptor.create(ASSIGN18);
							adaptor.addChild(root_0, ASSIGN18_tree);
							}

							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:78:59: ( type_op )
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:78:60: type_op
							{
							pushFollow(FOLLOW_type_op_in_declaration1234);
							type_op19=type_op();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, type_op19.getTree());

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
	// $ANTLR end "declaration"


	public static class type_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:105:1: type : ( IDENTIFIER | CHAR | BOOLEAN );
	public final ChocolateParser.type_return type() throws RecognitionException {
		ChocolateParser.type_return retval = new ChocolateParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set20=null;

		Object set20_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:106:5: ( IDENTIFIER | CHAR | BOOLEAN )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:
			{
			root_0 = (Object)adaptor.nil();


			set20=input.LT(1);
			if ( input.LA(1)==BOOLEAN||input.LA(1)==CHAR||input.LA(1)==IDENTIFIER ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set20));
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


	public static class type_op_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type_op"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:111:1: type_op : ( single_expr | closed_compound_expr );
	public final ChocolateParser.type_op_return type_op() throws RecognitionException {
		ChocolateParser.type_op_return retval = new ChocolateParser.type_op_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope single_expr21 =null;
		ParserRuleReturnScope closed_compound_expr22 =null;


		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:112:5: ( single_expr | closed_compound_expr )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==BOOLEAN_OPERATOR||LA7_0==CHAR_OPERATOR||LA7_0==IDENTIFIER||(LA7_0 >= LPAREN && LA7_0 <= MIN)||LA7_0==NOT||LA7_0==NUMBER||LA7_0==PLUS) ) {
				alt7=1;
			}
			else if ( (LA7_0==LCURLY) ) {
				alt7=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:112:9: single_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_single_expr_in_type_op1411);
					single_expr21=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, single_expr21.getTree());

					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:113:9: closed_compound_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_closed_compound_expr_in_type_op1421);
					closed_compound_expr22=closed_compound_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, closed_compound_expr22.getTree());

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
	// $ANTLR end "type_op"


	public static class statements_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statements"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:117:1: statements : statement SEMICOLON !;
	public final ChocolateParser.statements_return statements() throws RecognitionException {
		ChocolateParser.statements_return retval = new ChocolateParser.statements_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMICOLON24=null;
		ParserRuleReturnScope statement23 =null;

		Object SEMICOLON24_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:118:5: ( statement SEMICOLON !)
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:118:7: statement SEMICOLON !
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_statement_in_statements1442);
			statement23=statement();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, statement23.getTree());

			SEMICOLON24=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statements1444); if (state.failed) return retval;
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:121:1: statement : ( read | print | assign | ifthenelse | while );
	public final ChocolateParser.statement_return statement() throws RecognitionException {
		ChocolateParser.statement_return retval = new ChocolateParser.statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope read25 =null;
		ParserRuleReturnScope print26 =null;
		ParserRuleReturnScope assign27 =null;
		ParserRuleReturnScope ifthenelse28 =null;
		ParserRuleReturnScope while29 =null;


		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:122:5: ( read | print | assign | ifthenelse | while )
			int alt8=5;
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
			case WHILE:
				{
				alt8=5;
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
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:122:9: read
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_read_in_statement1468);
					read25=read();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, read25.getTree());

					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:123:9: print
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_print_in_statement1479);
					print26=print();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, print26.getTree());

					}
					break;
				case 3 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:124:9: assign
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_assign_in_statement1490);
					assign27=assign();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assign27.getTree());

					}
					break;
				case 4 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:125:9: ifthenelse
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_ifthenelse_in_statement1503);
					ifthenelse28=ifthenelse();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ifthenelse28.getTree());

					}
					break;
				case 5 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:126:9: while
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_while_in_statement1513);
					while29=while();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, while29.getTree());

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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:129:1: read : READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !;
	public final ChocolateParser.read_return read() throws RecognitionException {
		ChocolateParser.read_return retval = new ChocolateParser.read_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token READ30=null;
		Token LPAREN31=null;
		Token IDENTIFIER32=null;
		Token COMMA33=null;
		Token IDENTIFIER34=null;
		Token RPAREN35=null;

		Object READ30_tree=null;
		Object LPAREN31_tree=null;
		Object IDENTIFIER32_tree=null;
		Object COMMA33_tree=null;
		Object IDENTIFIER34_tree=null;
		Object RPAREN35_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:130:5: ( READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !)
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:130:9: READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			READ30=(Token)match(input,READ,FOLLOW_READ_in_read1532); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			READ30_tree = (Object)adaptor.create(READ30);
			root_0 = (Object)adaptor.becomeRoot(READ30_tree, root_0);
			}

			LPAREN31=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_read1535); if (state.failed) return retval;
			IDENTIFIER32=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read1538); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER32_tree = (Object)adaptor.create(IDENTIFIER32);
			adaptor.addChild(root_0, IDENTIFIER32_tree);
			}

			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:130:34: ( COMMA ! IDENTIFIER )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==COMMA) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:130:35: COMMA ! IDENTIFIER
					{
					COMMA33=(Token)match(input,COMMA,FOLLOW_COMMA_in_read1541); if (state.failed) return retval;
					IDENTIFIER34=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read1544); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER34_tree = (Object)adaptor.create(IDENTIFIER34);
					adaptor.addChild(root_0, IDENTIFIER34_tree);
					}

					}
					break;

				default :
					break loop9;
				}
			}

			RPAREN35=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_read1548); if (state.failed) return retval;
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:133:1: assign : IDENTIFIER ASSIGN ^ ( assignexpr ) ;
	public final ChocolateParser.assign_return assign() throws RecognitionException {
		ChocolateParser.assign_return retval = new ChocolateParser.assign_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER36=null;
		Token ASSIGN37=null;
		ParserRuleReturnScope assignexpr38 =null;

		Object IDENTIFIER36_tree=null;
		Object ASSIGN37_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:134:5: ( IDENTIFIER ASSIGN ^ ( assignexpr ) )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:134:9: IDENTIFIER ASSIGN ^ ( assignexpr )
			{
			root_0 = (Object)adaptor.nil();


			IDENTIFIER36=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assign1568); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER36_tree = (Object)adaptor.create(IDENTIFIER36);
			adaptor.addChild(root_0, IDENTIFIER36_tree);
			}

			ASSIGN37=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign1570); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ASSIGN37_tree = (Object)adaptor.create(ASSIGN37);
			root_0 = (Object)adaptor.becomeRoot(ASSIGN37_tree, root_0);
			}

			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:134:28: ( assignexpr )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:134:29: assignexpr
			{
			pushFollow(FOLLOW_assignexpr_in_assign1574);
			assignexpr38=assignexpr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, assignexpr38.getTree());

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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:137:1: assignexpr : ( ( IDENTIFIER ASSIGN ^)=> ( IDENTIFIER ASSIGN ^ assignexpr ) | single_expr | closed_compound_expr );
	public final ChocolateParser.assignexpr_return assignexpr() throws RecognitionException {
		ChocolateParser.assignexpr_return retval = new ChocolateParser.assignexpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER39=null;
		Token ASSIGN40=null;
		ParserRuleReturnScope assignexpr41 =null;
		ParserRuleReturnScope single_expr42 =null;
		ParserRuleReturnScope closed_compound_expr43 =null;

		Object IDENTIFIER39_tree=null;
		Object ASSIGN40_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:138:5: ( ( IDENTIFIER ASSIGN ^)=> ( IDENTIFIER ASSIGN ^ assignexpr ) | single_expr | closed_compound_expr )
			int alt10=3;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				int LA10_1 = input.LA(2);
				if ( (synpred1_Chocolate()) ) {
					alt10=1;
				}
				else if ( (true) ) {
					alt10=2;
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
				alt10=2;
				}
				break;
			case LCURLY:
				{
				alt10=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:138:9: ( IDENTIFIER ASSIGN ^)=> ( IDENTIFIER ASSIGN ^ assignexpr )
					{
					root_0 = (Object)adaptor.nil();


					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:138:33: ( IDENTIFIER ASSIGN ^ assignexpr )
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:138:34: IDENTIFIER ASSIGN ^ assignexpr
					{
					IDENTIFIER39=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assignexpr1608); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER39_tree = (Object)adaptor.create(IDENTIFIER39);
					adaptor.addChild(root_0, IDENTIFIER39_tree);
					}

					ASSIGN40=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignexpr1610); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ASSIGN40_tree = (Object)adaptor.create(ASSIGN40);
					root_0 = (Object)adaptor.becomeRoot(ASSIGN40_tree, root_0);
					}

					pushFollow(FOLLOW_assignexpr_in_assignexpr1613);
					assignexpr41=assignexpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignexpr41.getTree());

					}

					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:139:9: single_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_single_expr_in_assignexpr1624);
					single_expr42=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, single_expr42.getTree());

					}
					break;
				case 3 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:140:9: closed_compound_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_closed_compound_expr_in_assignexpr1634);
					closed_compound_expr43=closed_compound_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, closed_compound_expr43.getTree());

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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:143:1: print : PRINT ^ LPAREN ! ( closed_compound_expr | single_expr | string ) ( COMMA ! ( closed_compound_expr | single_expr | string ) )* RPAREN !;
	public final ChocolateParser.print_return print() throws RecognitionException {
		ChocolateParser.print_return retval = new ChocolateParser.print_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PRINT44=null;
		Token LPAREN45=null;
		Token COMMA49=null;
		Token RPAREN53=null;
		ParserRuleReturnScope closed_compound_expr46 =null;
		ParserRuleReturnScope single_expr47 =null;
		ParserRuleReturnScope string48 =null;
		ParserRuleReturnScope closed_compound_expr50 =null;
		ParserRuleReturnScope single_expr51 =null;
		ParserRuleReturnScope string52 =null;

		Object PRINT44_tree=null;
		Object LPAREN45_tree=null;
		Object COMMA49_tree=null;
		Object RPAREN53_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:144:5: ( PRINT ^ LPAREN ! ( closed_compound_expr | single_expr | string ) ( COMMA ! ( closed_compound_expr | single_expr | string ) )* RPAREN !)
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:144:9: PRINT ^ LPAREN ! ( closed_compound_expr | single_expr | string ) ( COMMA ! ( closed_compound_expr | single_expr | string ) )* RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			PRINT44=(Token)match(input,PRINT,FOLLOW_PRINT_in_print1657); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			PRINT44_tree = (Object)adaptor.create(PRINT44);
			root_0 = (Object)adaptor.becomeRoot(PRINT44_tree, root_0);
			}

			LPAREN45=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_print1660); if (state.failed) return retval;
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:144:24: ( closed_compound_expr | single_expr | string )
			int alt11=3;
			switch ( input.LA(1) ) {
			case LCURLY:
				{
				alt11=1;
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
				{
				alt11=2;
				}
				break;
			case DQUOTATION:
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
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:144:25: closed_compound_expr
					{
					pushFollow(FOLLOW_closed_compound_expr_in_print1664);
					closed_compound_expr46=closed_compound_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, closed_compound_expr46.getTree());

					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:144:48: single_expr
					{
					pushFollow(FOLLOW_single_expr_in_print1668);
					single_expr47=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, single_expr47.getTree());

					}
					break;
				case 3 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:144:62: string
					{
					pushFollow(FOLLOW_string_in_print1672);
					string48=string();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, string48.getTree());

					}
					break;

			}

			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:144:70: ( COMMA ! ( closed_compound_expr | single_expr | string ) )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==COMMA) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:144:71: COMMA ! ( closed_compound_expr | single_expr | string )
					{
					COMMA49=(Token)match(input,COMMA,FOLLOW_COMMA_in_print1676); if (state.failed) return retval;
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:144:78: ( closed_compound_expr | single_expr | string )
					int alt12=3;
					switch ( input.LA(1) ) {
					case LCURLY:
						{
						alt12=1;
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
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:144:79: closed_compound_expr
							{
							pushFollow(FOLLOW_closed_compound_expr_in_print1680);
							closed_compound_expr50=closed_compound_expr();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, closed_compound_expr50.getTree());

							}
							break;
						case 2 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:144:102: single_expr
							{
							pushFollow(FOLLOW_single_expr_in_print1684);
							single_expr51=single_expr();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, single_expr51.getTree());

							}
							break;
						case 3 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:144:116: string
							{
							pushFollow(FOLLOW_string_in_print1688);
							string52=string();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, string52.getTree());

							}
							break;

					}

					}
					break;

				default :
					break loop13;
				}
			}

			RPAREN53=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_print1693); if (state.failed) return retval;
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:150:1: closed_compound_expr : LCURLY ^ ( declarations )* compound_ext ;
	public final ChocolateParser.closed_compound_expr_return closed_compound_expr() throws RecognitionException {
		ChocolateParser.closed_compound_expr_return retval = new ChocolateParser.closed_compound_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LCURLY54=null;
		ParserRuleReturnScope declarations55 =null;
		ParserRuleReturnScope compound_ext56 =null;

		Object LCURLY54_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:151:5: ( LCURLY ^ ( declarations )* compound_ext )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:151:9: LCURLY ^ ( declarations )* compound_ext
			{
			root_0 = (Object)adaptor.nil();


			LCURLY54=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_closed_compound_expr1723); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LCURLY54_tree = (Object)adaptor.create(LCURLY54);
			root_0 = (Object)adaptor.becomeRoot(LCURLY54_tree, root_0);
			}

			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:151:17: ( declarations )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==CONSTANT||LA14_0==VAR) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:151:17: declarations
					{
					pushFollow(FOLLOW_declarations_in_closed_compound_expr1726);
					declarations55=declarations();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, declarations55.getTree());

					}
					break;

				default :
					break loop14;
				}
			}

			pushFollow(FOLLOW_compound_ext_in_closed_compound_expr1729);
			compound_ext56=compound_ext();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, compound_ext56.getTree());

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


	public static class compound_ext_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "compound_ext"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:155:1: compound_ext : ( ( single_expr RCURLY )=> ( single_expr RCURLY !) | statements ( declarations )* compound_ext );
	public final ChocolateParser.compound_ext_return compound_ext() throws RecognitionException {
		ChocolateParser.compound_ext_return retval = new ChocolateParser.compound_ext_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token RCURLY58=null;
		ParserRuleReturnScope single_expr57 =null;
		ParserRuleReturnScope statements59 =null;
		ParserRuleReturnScope declarations60 =null;
		ParserRuleReturnScope compound_ext61 =null;

		Object RCURLY58_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:156:5: ( ( single_expr RCURLY )=> ( single_expr RCURLY !) | statements ( declarations )* compound_ext )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==PLUS) && (synpred2_Chocolate())) {
				alt16=1;
			}
			else if ( (LA16_0==MIN) && (synpred2_Chocolate())) {
				alt16=1;
			}
			else if ( (LA16_0==NOT) && (synpred2_Chocolate())) {
				alt16=1;
			}
			else if ( (LA16_0==IDENTIFIER) ) {
				int LA16_4 = input.LA(2);
				if ( (synpred2_Chocolate()) ) {
					alt16=1;
				}
				else if ( (true) ) {
					alt16=2;
				}

			}
			else if ( (LA16_0==NUMBER) && (synpred2_Chocolate())) {
				alt16=1;
			}
			else if ( (LA16_0==LPAREN) && (synpred2_Chocolate())) {
				alt16=1;
			}
			else if ( (LA16_0==BOOLEAN_OPERATOR) && (synpred2_Chocolate())) {
				alt16=1;
			}
			else if ( (LA16_0==CHAR_OPERATOR) && (synpred2_Chocolate())) {
				alt16=1;
			}
			else if ( (LA16_0==IF||LA16_0==PRINT||LA16_0==READ||LA16_0==WHILE) ) {
				alt16=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:156:9: ( single_expr RCURLY )=> ( single_expr RCURLY !)
					{
					root_0 = (Object)adaptor.nil();


					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:156:33: ( single_expr RCURLY !)
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:156:34: single_expr RCURLY !
					{
					pushFollow(FOLLOW_single_expr_in_compound_ext1766);
					single_expr57=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, single_expr57.getTree());

					RCURLY58=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_compound_ext1768); if (state.failed) return retval;
					}

					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:157:9: statements ( declarations )* compound_ext
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_statements_in_compound_ext1780);
					statements59=statements();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statements59.getTree());

					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:157:20: ( declarations )*
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( (LA15_0==CONSTANT||LA15_0==VAR) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:157:20: declarations
							{
							pushFollow(FOLLOW_declarations_in_compound_ext1782);
							declarations60=declarations();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, declarations60.getTree());

							}
							break;

						default :
							break loop15;
						}
					}

					pushFollow(FOLLOW_compound_ext_in_compound_ext1785);
					compound_ext61=compound_ext();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, compound_ext61.getTree());

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
	// $ANTLR end "compound_ext"


	public static class single_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "single_expr"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:160:1: single_expr : arithmetic ;
	public final ChocolateParser.single_expr_return single_expr() throws RecognitionException {
		ChocolateParser.single_expr_return retval = new ChocolateParser.single_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope arithmetic62 =null;


		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:161:5: ( arithmetic )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:161:9: arithmetic
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_in_single_expr1808);
			arithmetic62=arithmetic();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic62.getTree());

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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:164:1: arithmetic : arith2 ( OR ^ arith2 )* ;
	public final ChocolateParser.arithmetic_return arithmetic() throws RecognitionException {
		ChocolateParser.arithmetic_return retval = new ChocolateParser.arithmetic_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token OR64=null;
		ParserRuleReturnScope arith263 =null;
		ParserRuleReturnScope arith265 =null;

		Object OR64_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:165:5: ( arith2 ( OR ^ arith2 )* )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:165:9: arith2 ( OR ^ arith2 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arith2_in_arithmetic1827);
			arith263=arith2();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arith263.getTree());

			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:165:16: ( OR ^ arith2 )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==OR) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:165:17: OR ^ arith2
					{
					OR64=(Token)match(input,OR,FOLLOW_OR_in_arithmetic1830); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					OR64_tree = (Object)adaptor.create(OR64);
					root_0 = (Object)adaptor.becomeRoot(OR64_tree, root_0);
					}

					pushFollow(FOLLOW_arith2_in_arithmetic1833);
					arith265=arith2();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arith265.getTree());

					}
					break;

				default :
					break loop17;
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:168:1: arith2 : arith3 ( AND ^ arith3 )* ;
	public final ChocolateParser.arith2_return arith2() throws RecognitionException {
		ChocolateParser.arith2_return retval = new ChocolateParser.arith2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AND67=null;
		ParserRuleReturnScope arith366 =null;
		ParserRuleReturnScope arith368 =null;

		Object AND67_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:169:5: ( arith3 ( AND ^ arith3 )* )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:169:9: arith3 ( AND ^ arith3 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arith3_in_arith21858);
			arith366=arith3();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arith366.getTree());

			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:169:16: ( AND ^ arith3 )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==AND) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:169:17: AND ^ arith3
					{
					AND67=(Token)match(input,AND,FOLLOW_AND_in_arith21861); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AND67_tree = (Object)adaptor.create(AND67);
					root_0 = (Object)adaptor.becomeRoot(AND67_tree, root_0);
					}

					pushFollow(FOLLOW_arith3_in_arith21864);
					arith368=arith3();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arith368.getTree());

					}
					break;

				default :
					break loop18;
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:172:1: arith3 : arith4 ( ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^) arith4 )* ;
	public final ChocolateParser.arith3_return arith3() throws RecognitionException {
		ChocolateParser.arith3_return retval = new ChocolateParser.arith3_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LESS70=null;
		Token LESSEQ71=null;
		Token GREATEQ72=null;
		Token GREAT73=null;
		Token EQ74=null;
		Token NOTEQ75=null;
		ParserRuleReturnScope arith469 =null;
		ParserRuleReturnScope arith476 =null;

		Object LESS70_tree=null;
		Object LESSEQ71_tree=null;
		Object GREATEQ72_tree=null;
		Object GREAT73_tree=null;
		Object EQ74_tree=null;
		Object NOTEQ75_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:173:5: ( arith4 ( ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^) arith4 )* )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:173:9: arith4 ( ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^) arith4 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arith4_in_arith31889);
			arith469=arith4();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arith469.getTree());

			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:173:16: ( ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^) arith4 )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( ((LA20_0 >= EQ && LA20_0 <= GREATEQ)||(LA20_0 >= LESS && LA20_0 <= LESSEQ)||LA20_0==NOTEQ) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:173:17: ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^) arith4
					{
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:173:17: ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^)
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
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 19, 0, input);
						throw nvae;
					}
					switch (alt19) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:173:18: LESS ^
							{
							LESS70=(Token)match(input,LESS,FOLLOW_LESS_in_arith31893); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							LESS70_tree = (Object)adaptor.create(LESS70);
							root_0 = (Object)adaptor.becomeRoot(LESS70_tree, root_0);
							}

							}
							break;
						case 2 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:173:26: LESSEQ ^
							{
							LESSEQ71=(Token)match(input,LESSEQ,FOLLOW_LESSEQ_in_arith31898); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							LESSEQ71_tree = (Object)adaptor.create(LESSEQ71);
							root_0 = (Object)adaptor.becomeRoot(LESSEQ71_tree, root_0);
							}

							}
							break;
						case 3 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:173:36: GREATEQ ^
							{
							GREATEQ72=(Token)match(input,GREATEQ,FOLLOW_GREATEQ_in_arith31903); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							GREATEQ72_tree = (Object)adaptor.create(GREATEQ72);
							root_0 = (Object)adaptor.becomeRoot(GREATEQ72_tree, root_0);
							}

							}
							break;
						case 4 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:173:47: GREAT ^
							{
							GREAT73=(Token)match(input,GREAT,FOLLOW_GREAT_in_arith31908); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							GREAT73_tree = (Object)adaptor.create(GREAT73);
							root_0 = (Object)adaptor.becomeRoot(GREAT73_tree, root_0);
							}

							}
							break;
						case 5 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:173:56: EQ ^
							{
							EQ74=(Token)match(input,EQ,FOLLOW_EQ_in_arith31913); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							EQ74_tree = (Object)adaptor.create(EQ74);
							root_0 = (Object)adaptor.becomeRoot(EQ74_tree, root_0);
							}

							}
							break;
						case 6 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:173:62: NOTEQ ^
							{
							NOTEQ75=(Token)match(input,NOTEQ,FOLLOW_NOTEQ_in_arith31918); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							NOTEQ75_tree = (Object)adaptor.create(NOTEQ75);
							root_0 = (Object)adaptor.becomeRoot(NOTEQ75_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_arith4_in_arith31922);
					arith476=arith4();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arith476.getTree());

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
	// $ANTLR end "arith3"


	public static class arith4_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arith4"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:176:1: arith4 : arith5 ( ( PLUS ^| MIN ^) arith5 )* ;
	public final ChocolateParser.arith4_return arith4() throws RecognitionException {
		ChocolateParser.arith4_return retval = new ChocolateParser.arith4_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS78=null;
		Token MIN79=null;
		ParserRuleReturnScope arith577 =null;
		ParserRuleReturnScope arith580 =null;

		Object PLUS78_tree=null;
		Object MIN79_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:177:5: ( arith5 ( ( PLUS ^| MIN ^) arith5 )* )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:177:9: arith5 ( ( PLUS ^| MIN ^) arith5 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arith5_in_arith41952);
			arith577=arith5();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arith577.getTree());

			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:177:16: ( ( PLUS ^| MIN ^) arith5 )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==MIN||LA22_0==PLUS) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:177:17: ( PLUS ^| MIN ^) arith5
					{
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:177:17: ( PLUS ^| MIN ^)
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==PLUS) ) {
						alt21=1;
					}
					else if ( (LA21_0==MIN) ) {
						alt21=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 21, 0, input);
						throw nvae;
					}

					switch (alt21) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:177:18: PLUS ^
							{
							PLUS78=(Token)match(input,PLUS,FOLLOW_PLUS_in_arith41956); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							PLUS78_tree = (Object)adaptor.create(PLUS78);
							root_0 = (Object)adaptor.becomeRoot(PLUS78_tree, root_0);
							}

							}
							break;
						case 2 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:177:26: MIN ^
							{
							MIN79=(Token)match(input,MIN,FOLLOW_MIN_in_arith41961); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							MIN79_tree = (Object)adaptor.create(MIN79);
							root_0 = (Object)adaptor.becomeRoot(MIN79_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_arith5_in_arith41965);
					arith580=arith5();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arith580.getTree());

					}
					break;

				default :
					break loop22;
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:180:1: arith5 : arith6 ( ( MULT ^| DIV ^| MOD ^) arith6 )* ;
	public final ChocolateParser.arith5_return arith5() throws RecognitionException {
		ChocolateParser.arith5_return retval = new ChocolateParser.arith5_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MULT82=null;
		Token DIV83=null;
		Token MOD84=null;
		ParserRuleReturnScope arith681 =null;
		ParserRuleReturnScope arith685 =null;

		Object MULT82_tree=null;
		Object DIV83_tree=null;
		Object MOD84_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:181:5: ( arith6 ( ( MULT ^| DIV ^| MOD ^) arith6 )* )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:181:9: arith6 ( ( MULT ^| DIV ^| MOD ^) arith6 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arith6_in_arith51996);
			arith681=arith6();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arith681.getTree());

			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:181:16: ( ( MULT ^| DIV ^| MOD ^) arith6 )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==DIV||(LA24_0 >= MOD && LA24_0 <= MULT)) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:181:17: ( MULT ^| DIV ^| MOD ^) arith6
					{
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:181:17: ( MULT ^| DIV ^| MOD ^)
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
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 23, 0, input);
						throw nvae;
					}
					switch (alt23) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:181:18: MULT ^
							{
							MULT82=(Token)match(input,MULT,FOLLOW_MULT_in_arith52000); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							MULT82_tree = (Object)adaptor.create(MULT82);
							root_0 = (Object)adaptor.becomeRoot(MULT82_tree, root_0);
							}

							}
							break;
						case 2 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:181:26: DIV ^
							{
							DIV83=(Token)match(input,DIV,FOLLOW_DIV_in_arith52005); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							DIV83_tree = (Object)adaptor.create(DIV83);
							root_0 = (Object)adaptor.becomeRoot(DIV83_tree, root_0);
							}

							}
							break;
						case 3 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:181:33: MOD ^
							{
							MOD84=(Token)match(input,MOD,FOLLOW_MOD_in_arith52010); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							MOD84_tree = (Object)adaptor.create(MOD84);
							root_0 = (Object)adaptor.becomeRoot(MOD84_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_arith6_in_arith52014);
					arith685=arith6();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arith685.getTree());

					}
					break;

				default :
					break loop24;
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:184:1: arith6 : ( PLUS operand -> ^( POS operand ) | MIN operand -> ^( NEG operand ) | NOT ^ operand | operand );
	public final ChocolateParser.arith6_return arith6() throws RecognitionException {
		ChocolateParser.arith6_return retval = new ChocolateParser.arith6_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS86=null;
		Token MIN88=null;
		Token NOT90=null;
		ParserRuleReturnScope operand87 =null;
		ParserRuleReturnScope operand89 =null;
		ParserRuleReturnScope operand91 =null;
		ParserRuleReturnScope operand92 =null;

		Object PLUS86_tree=null;
		Object MIN88_tree=null;
		Object NOT90_tree=null;
		RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
		RewriteRuleTokenStream stream_MIN=new RewriteRuleTokenStream(adaptor,"token MIN");
		RewriteRuleSubtreeStream stream_operand=new RewriteRuleSubtreeStream(adaptor,"rule operand");

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:185:5: ( PLUS operand -> ^( POS operand ) | MIN operand -> ^( NEG operand ) | NOT ^ operand | operand )
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
			case BOOLEAN_OPERATOR:
			case CHAR_OPERATOR:
			case IDENTIFIER:
			case LPAREN:
			case NUMBER:
				{
				alt25=4;
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
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:185:9: PLUS operand
					{
					PLUS86=(Token)match(input,PLUS,FOLLOW_PLUS_in_arith62047); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PLUS.add(PLUS86);

					pushFollow(FOLLOW_operand_in_arith62049);
					operand87=operand();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_operand.add(operand87.getTree());
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
					// 185:22: -> ^( POS operand )
					{
						// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:185:25: ^( POS operand )
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
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:186:9: MIN operand
					{
					MIN88=(Token)match(input,MIN,FOLLOW_MIN_in_arith62068); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MIN.add(MIN88);

					pushFollow(FOLLOW_operand_in_arith62070);
					operand89=operand();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_operand.add(operand89.getTree());
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
					// 186:21: -> ^( NEG operand )
					{
						// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:186:24: ^( NEG operand )
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
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:187:9: NOT ^ operand
					{
					root_0 = (Object)adaptor.nil();


					NOT90=(Token)match(input,NOT,FOLLOW_NOT_in_arith62088); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NOT90_tree = (Object)adaptor.create(NOT90);
					root_0 = (Object)adaptor.becomeRoot(NOT90_tree, root_0);
					}

					pushFollow(FOLLOW_operand_in_arith62091);
					operand91=operand();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, operand91.getTree());

					}
					break;
				case 4 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:188:9: operand
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_operand_in_arith62101);
					operand92=operand();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, operand92.getTree());

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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:191:1: ifthenelse : IF ^ single_expr THEN ! closed_compound_expr ( ELSE ! closed_compound_expr )? ;
	public final ChocolateParser.ifthenelse_return ifthenelse() throws RecognitionException {
		ChocolateParser.ifthenelse_return retval = new ChocolateParser.ifthenelse_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IF93=null;
		Token THEN95=null;
		Token ELSE97=null;
		ParserRuleReturnScope single_expr94 =null;
		ParserRuleReturnScope closed_compound_expr96 =null;
		ParserRuleReturnScope closed_compound_expr98 =null;

		Object IF93_tree=null;
		Object THEN95_tree=null;
		Object ELSE97_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:192:5: ( IF ^ single_expr THEN ! closed_compound_expr ( ELSE ! closed_compound_expr )? )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:192:9: IF ^ single_expr THEN ! closed_compound_expr ( ELSE ! closed_compound_expr )?
			{
			root_0 = (Object)adaptor.nil();


			IF93=(Token)match(input,IF,FOLLOW_IF_in_ifthenelse2124); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IF93_tree = (Object)adaptor.create(IF93);
			root_0 = (Object)adaptor.becomeRoot(IF93_tree, root_0);
			}

			pushFollow(FOLLOW_single_expr_in_ifthenelse2127);
			single_expr94=single_expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, single_expr94.getTree());

			THEN95=(Token)match(input,THEN,FOLLOW_THEN_in_ifthenelse2129); if (state.failed) return retval;
			pushFollow(FOLLOW_closed_compound_expr_in_ifthenelse2132);
			closed_compound_expr96=closed_compound_expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, closed_compound_expr96.getTree());

			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:192:52: ( ELSE ! closed_compound_expr )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==ELSE) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:192:53: ELSE ! closed_compound_expr
					{
					ELSE97=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifthenelse2135); if (state.failed) return retval;
					pushFollow(FOLLOW_closed_compound_expr_in_ifthenelse2138);
					closed_compound_expr98=closed_compound_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, closed_compound_expr98.getTree());

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


	public static class while_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "while"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:195:1: while : WHILE ^ single_expr DO ! closed_compound_expr ;
	public final ChocolateParser.while_return while() throws RecognitionException {
		ChocolateParser.while_return retval = new ChocolateParser.while_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WHILE99=null;
		Token DO101=null;
		ParserRuleReturnScope single_expr100 =null;
		ParserRuleReturnScope closed_compound_expr102 =null;

		Object WHILE99_tree=null;
		Object DO101_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:196:5: ( WHILE ^ single_expr DO ! closed_compound_expr )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:196:9: WHILE ^ single_expr DO ! closed_compound_expr
			{
			root_0 = (Object)adaptor.nil();


			WHILE99=(Token)match(input,WHILE,FOLLOW_WHILE_in_while2163); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WHILE99_tree = (Object)adaptor.create(WHILE99);
			root_0 = (Object)adaptor.becomeRoot(WHILE99_tree, root_0);
			}

			pushFollow(FOLLOW_single_expr_in_while2166);
			single_expr100=single_expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, single_expr100.getTree());

			DO101=(Token)match(input,DO,FOLLOW_DO_in_while2168); if (state.failed) return retval;
			pushFollow(FOLLOW_closed_compound_expr_in_while2171);
			closed_compound_expr102=closed_compound_expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, closed_compound_expr102.getTree());

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
	// $ANTLR end "while"


	public static class operand_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "operand"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:200:1: operand : ( IDENTIFIER | NUMBER | LPAREN ^ single_expr RPAREN !| BOOLEAN_OPERATOR | CHAR_OPERATOR );
	public final ChocolateParser.operand_return operand() throws RecognitionException {
		ChocolateParser.operand_return retval = new ChocolateParser.operand_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER103=null;
		Token NUMBER104=null;
		Token LPAREN105=null;
		Token RPAREN107=null;
		Token BOOLEAN_OPERATOR108=null;
		Token CHAR_OPERATOR109=null;
		ParserRuleReturnScope single_expr106 =null;

		Object IDENTIFIER103_tree=null;
		Object NUMBER104_tree=null;
		Object LPAREN105_tree=null;
		Object RPAREN107_tree=null;
		Object BOOLEAN_OPERATOR108_tree=null;
		Object CHAR_OPERATOR109_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:201:5: ( IDENTIFIER | NUMBER | LPAREN ^ single_expr RPAREN !| BOOLEAN_OPERATOR | CHAR_OPERATOR )
			int alt27=5;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt27=1;
				}
				break;
			case NUMBER:
				{
				alt27=2;
				}
				break;
			case LPAREN:
				{
				alt27=3;
				}
				break;
			case BOOLEAN_OPERATOR:
				{
				alt27=4;
				}
				break;
			case CHAR_OPERATOR:
				{
				alt27=5;
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
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:201:9: IDENTIFIER
					{
					root_0 = (Object)adaptor.nil();


					IDENTIFIER103=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand2191); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER103_tree = (Object)adaptor.create(IDENTIFIER103);
					adaptor.addChild(root_0, IDENTIFIER103_tree);
					}

					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:202:9: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER104=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_operand2201); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NUMBER104_tree = (Object)adaptor.create(NUMBER104);
					adaptor.addChild(root_0, NUMBER104_tree);
					}

					}
					break;
				case 3 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:203:9: LPAREN ^ single_expr RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					LPAREN105=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operand2211); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LPAREN105_tree = (Object)adaptor.create(LPAREN105);
					root_0 = (Object)adaptor.becomeRoot(LPAREN105_tree, root_0);
					}

					pushFollow(FOLLOW_single_expr_in_operand2214);
					single_expr106=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, single_expr106.getTree());

					RPAREN107=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operand2216); if (state.failed) return retval;
					}
					break;
				case 4 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:204:9: BOOLEAN_OPERATOR
					{
					root_0 = (Object)adaptor.nil();


					BOOLEAN_OPERATOR108=(Token)match(input,BOOLEAN_OPERATOR,FOLLOW_BOOLEAN_OPERATOR_in_operand2227); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BOOLEAN_OPERATOR108_tree = (Object)adaptor.create(BOOLEAN_OPERATOR108);
					adaptor.addChild(root_0, BOOLEAN_OPERATOR108_tree);
					}

					}
					break;
				case 5 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:205:9: CHAR_OPERATOR
					{
					root_0 = (Object)adaptor.nil();


					CHAR_OPERATOR109=(Token)match(input,CHAR_OPERATOR,FOLLOW_CHAR_OPERATOR_in_operand2237); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CHAR_OPERATOR109_tree = (Object)adaptor.create(CHAR_OPERATOR109);
					adaptor.addChild(root_0, CHAR_OPERATOR109_tree);
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:208:1: string : DQUOTATION ! IDENTIFIER DQUOTATION !;
	public final ChocolateParser.string_return string() throws RecognitionException {
		ChocolateParser.string_return retval = new ChocolateParser.string_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token DQUOTATION110=null;
		Token IDENTIFIER111=null;
		Token DQUOTATION112=null;

		Object DQUOTATION110_tree=null;
		Object IDENTIFIER111_tree=null;
		Object DQUOTATION112_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:209:5: ( DQUOTATION ! IDENTIFIER DQUOTATION !)
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:209:9: DQUOTATION ! IDENTIFIER DQUOTATION !
			{
			root_0 = (Object)adaptor.nil();


			DQUOTATION110=(Token)match(input,DQUOTATION,FOLLOW_DQUOTATION_in_string2260); if (state.failed) return retval;
			IDENTIFIER111=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_string2263); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER111_tree = (Object)adaptor.create(IDENTIFIER111);
			adaptor.addChild(root_0, IDENTIFIER111_tree);
			}

			DQUOTATION112=(Token)match(input,DQUOTATION,FOLLOW_DQUOTATION_in_string2265); if (state.failed) return retval;
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:212:1: graphic : ( LETTER | DIGIT );
	public final ChocolateParser.graphic_return graphic() throws RecognitionException {
		ChocolateParser.graphic_return retval = new ChocolateParser.graphic_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set113=null;

		Object set113_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:213:5: ( LETTER | DIGIT )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:
			{
			root_0 = (Object)adaptor.nil();


			set113=input.LT(1);
			if ( input.LA(1)==DIGIT||input.LA(1)==LETTER ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set113));
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
		// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:138:9: ( IDENTIFIER ASSIGN ^)
		// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:138:10: IDENTIFIER ASSIGN ^
		{
		match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred1_Chocolate1599); if (state.failed) return;

		match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred1_Chocolate1601); if (state.failed) return;

		}

	}
	// $ANTLR end synpred1_Chocolate

	// $ANTLR start synpred2_Chocolate
	public final void synpred2_Chocolate_fragment() throws RecognitionException {
		// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:156:9: ( single_expr RCURLY )
		// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:156:10: single_expr RCURLY
		{
		pushFollow(FOLLOW_single_expr_in_synpred2_Chocolate1758);
		single_expr();
		state._fsp--;
		if (state.failed) return;

		match(input,RCURLY,FOLLOW_RCURLY_in_synpred2_Chocolate1760); if (state.failed) return;

		}

	}
	// $ANTLR end synpred2_Chocolate

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
	public final boolean synpred2_Chocolate() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_Chocolate_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_declarations_in_program1093 = new BitSet(new long[]{0x000C220000C02000L});
	public static final BitSet FOLLOW_statements_in_program1096 = new BitSet(new long[]{0x000C220000C02000L});
	public static final BitSet FOLLOW_EOF_in_program1100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_declarations1163 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_declarations1165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONSTANT_in_declaration1186 = new BitSet(new long[]{0x0000000000400140L});
	public static final BitSet FOLLOW_type_in_declaration1189 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration1191 = new BitSet(new long[]{0x0000000000000820L});
	public static final BitSet FOLLOW_COMMA_in_declaration1194 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration1197 = new BitSet(new long[]{0x0000000000000820L});
	public static final BitSet FOLLOW_ASSIGN_in_declaration1201 = new BitSet(new long[]{0x000000A8C2400280L});
	public static final BitSet FOLLOW_type_op_in_declaration1204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_declaration1215 = new BitSet(new long[]{0x0000000000400140L});
	public static final BitSet FOLLOW_type_in_declaration1218 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration1220 = new BitSet(new long[]{0x0000000000000822L});
	public static final BitSet FOLLOW_COMMA_in_declaration1223 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration1226 = new BitSet(new long[]{0x0000000000000822L});
	public static final BitSet FOLLOW_ASSIGN_in_declaration1231 = new BitSet(new long[]{0x000000A8C2400280L});
	public static final BitSet FOLLOW_type_op_in_declaration1234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_single_expr_in_type_op1411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_closed_compound_expr_in_type_op1421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statements1442 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_statements1444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_in_statement1468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_in_statement1479 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assign_in_statement1490 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifthenelse_in_statement1503 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_while_in_statement1513 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read1532 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_LPAREN_in_read1535 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read1538 = new BitSet(new long[]{0x0000400000000800L});
	public static final BitSet FOLLOW_COMMA_in_read1541 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read1544 = new BitSet(new long[]{0x0000400000000800L});
	public static final BitSet FOLLOW_RPAREN_in_read1548 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_assign1568 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_assign1570 = new BitSet(new long[]{0x000000A8C2400280L});
	public static final BitSet FOLLOW_assignexpr_in_assign1574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_assignexpr1608 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_assignexpr1610 = new BitSet(new long[]{0x000000A8C2400280L});
	public static final BitSet FOLLOW_assignexpr_in_assignexpr1613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_single_expr_in_assignexpr1624 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_closed_compound_expr_in_assignexpr1634 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print1657 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_LPAREN_in_print1660 = new BitSet(new long[]{0x000000A8C2420280L});
	public static final BitSet FOLLOW_closed_compound_expr_in_print1664 = new BitSet(new long[]{0x0000400000000800L});
	public static final BitSet FOLLOW_single_expr_in_print1668 = new BitSet(new long[]{0x0000400000000800L});
	public static final BitSet FOLLOW_string_in_print1672 = new BitSet(new long[]{0x0000400000000800L});
	public static final BitSet FOLLOW_COMMA_in_print1676 = new BitSet(new long[]{0x000000A8C2420280L});
	public static final BitSet FOLLOW_closed_compound_expr_in_print1680 = new BitSet(new long[]{0x0000400000000800L});
	public static final BitSet FOLLOW_single_expr_in_print1684 = new BitSet(new long[]{0x0000400000000800L});
	public static final BitSet FOLLOW_string_in_print1688 = new BitSet(new long[]{0x0000400000000800L});
	public static final BitSet FOLLOW_RPAREN_in_print1693 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_closed_compound_expr1723 = new BitSet(new long[]{0x000C22A8C0C02280L});
	public static final BitSet FOLLOW_declarations_in_closed_compound_expr1726 = new BitSet(new long[]{0x000C22A8C0C02280L});
	public static final BitSet FOLLOW_compound_ext_in_closed_compound_expr1729 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_single_expr_in_compound_ext1766 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_RCURLY_in_compound_ext1768 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statements_in_compound_ext1780 = new BitSet(new long[]{0x000C22A8C0C02280L});
	public static final BitSet FOLLOW_declarations_in_compound_ext1782 = new BitSet(new long[]{0x000C22A8C0C02280L});
	public static final BitSet FOLLOW_compound_ext_in_compound_ext1785 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_in_single_expr1808 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arith2_in_arithmetic1827 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_OR_in_arithmetic1830 = new BitSet(new long[]{0x000000A8C0400280L});
	public static final BitSet FOLLOW_arith2_in_arithmetic1833 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_arith3_in_arith21858 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_AND_in_arith21861 = new BitSet(new long[]{0x000000A8C0400280L});
	public static final BitSet FOLLOW_arith3_in_arith21864 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_arith4_in_arith31889 = new BitSet(new long[]{0x000000100C380002L});
	public static final BitSet FOLLOW_LESS_in_arith31893 = new BitSet(new long[]{0x000000A8C0400280L});
	public static final BitSet FOLLOW_LESSEQ_in_arith31898 = new BitSet(new long[]{0x000000A8C0400280L});
	public static final BitSet FOLLOW_GREATEQ_in_arith31903 = new BitSet(new long[]{0x000000A8C0400280L});
	public static final BitSet FOLLOW_GREAT_in_arith31908 = new BitSet(new long[]{0x000000A8C0400280L});
	public static final BitSet FOLLOW_EQ_in_arith31913 = new BitSet(new long[]{0x000000A8C0400280L});
	public static final BitSet FOLLOW_NOTEQ_in_arith31918 = new BitSet(new long[]{0x000000A8C0400280L});
	public static final BitSet FOLLOW_arith4_in_arith31922 = new BitSet(new long[]{0x000000100C380002L});
	public static final BitSet FOLLOW_arith5_in_arith41952 = new BitSet(new long[]{0x0000008080000002L});
	public static final BitSet FOLLOW_PLUS_in_arith41956 = new BitSet(new long[]{0x000000A8C0400280L});
	public static final BitSet FOLLOW_MIN_in_arith41961 = new BitSet(new long[]{0x000000A8C0400280L});
	public static final BitSet FOLLOW_arith5_in_arith41965 = new BitSet(new long[]{0x0000008080000002L});
	public static final BitSet FOLLOW_arith6_in_arith51996 = new BitSet(new long[]{0x0000000300008002L});
	public static final BitSet FOLLOW_MULT_in_arith52000 = new BitSet(new long[]{0x000000A8C0400280L});
	public static final BitSet FOLLOW_DIV_in_arith52005 = new BitSet(new long[]{0x000000A8C0400280L});
	public static final BitSet FOLLOW_MOD_in_arith52010 = new BitSet(new long[]{0x000000A8C0400280L});
	public static final BitSet FOLLOW_arith6_in_arith52014 = new BitSet(new long[]{0x0000000300008002L});
	public static final BitSet FOLLOW_PLUS_in_arith62047 = new BitSet(new long[]{0x0000002040400280L});
	public static final BitSet FOLLOW_operand_in_arith62049 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MIN_in_arith62068 = new BitSet(new long[]{0x0000002040400280L});
	public static final BitSet FOLLOW_operand_in_arith62070 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_arith62088 = new BitSet(new long[]{0x0000002040400280L});
	public static final BitSet FOLLOW_operand_in_arith62091 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operand_in_arith62101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifthenelse2124 = new BitSet(new long[]{0x000000A8C0400280L});
	public static final BitSet FOLLOW_single_expr_in_ifthenelse2127 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_THEN_in_ifthenelse2129 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_closed_compound_expr_in_ifthenelse2132 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_ELSE_in_ifthenelse2135 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_closed_compound_expr_in_ifthenelse2138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_while2163 = new BitSet(new long[]{0x000000A8C0400280L});
	public static final BitSet FOLLOW_single_expr_in_while2166 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_DO_in_while2168 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_closed_compound_expr_in_while2171 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand2191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand2201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand2211 = new BitSet(new long[]{0x000000A8C0400280L});
	public static final BitSet FOLLOW_single_expr_in_operand2214 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_RPAREN_in_operand2216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_OPERATOR_in_operand2227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_OPERATOR_in_operand2237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DQUOTATION_in_string2260 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_string2263 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_DQUOTATION_in_string2265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_synpred1_Chocolate1599 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_synpred1_Chocolate1601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_single_expr_in_synpred2_Chocolate1758 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_RCURLY_in_synpred2_Chocolate1760 = new BitSet(new long[]{0x0000000000000002L});
}
