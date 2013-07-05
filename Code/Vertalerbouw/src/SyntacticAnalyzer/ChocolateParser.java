<<<<<<< HEAD
// $ANTLR 3.5 C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g 2013-06-30 23:07:49
=======
// $ANTLR 3.5 C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g 2013-07-01 14:06:02
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227

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
	@Override public String getGrammarFileName() { return "C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g"; }


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
<<<<<<< HEAD
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:64:1: program : ( ( declarations )* statements )+ EOF -> ^( PROGRAM ( ( declarations )* statements )+ ) ;
=======
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:63:1: program : ( ( declarations )* statements )+ EOF -> ^( PROGRAM ( ( declarations )* statements )+ ) ;
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
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
<<<<<<< HEAD
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:65:5: ( ( ( declarations )* statements )+ EOF -> ^( PROGRAM ( ( declarations )* statements )+ ) )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:65:10: ( ( declarations )* statements )+ EOF
			{
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:65:10: ( ( declarations )* statements )+
=======
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:64:5: ( ( ( declarations )* statements )+ EOF -> ^( PROGRAM ( ( declarations )* statements )+ ) )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:64:10: ( ( declarations )* statements )+ EOF
			{
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:64:10: ( ( declarations )* statements )+
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
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
<<<<<<< HEAD
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:65:11: ( declarations )* statements
					{
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:65:11: ( declarations )*
=======
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:64:11: ( declarations )* statements
					{
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:64:11: ( declarations )*
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( (LA1_0==CONSTANT||LA1_0==VAR) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
<<<<<<< HEAD
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:65:11: declarations
=======
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:64:11: declarations
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
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
<<<<<<< HEAD
				// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:66:17: ^( PROGRAM ( ( declarations )* statements )+ )
=======
				// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:65:17: ^( PROGRAM ( ( declarations )* statements )+ )
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				if ( !(stream_statements.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_statements.hasNext() ) {
<<<<<<< HEAD
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:66:28: ( declarations )*
=======
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:65:28: ( declarations )*
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
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
<<<<<<< HEAD
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:70:1: declarations : declaration SEMICOLON !;
=======
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:70:1: declarations : declaration SEMICOLON !;
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
	public final ChocolateParser.declarations_return declarations() throws RecognitionException {
		ChocolateParser.declarations_return retval = new ChocolateParser.declarations_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMICOLON5=null;
		ParserRuleReturnScope declaration4 =null;

		Object SEMICOLON5_tree=null;

		try {
<<<<<<< HEAD
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:71:5: ( declaration SEMICOLON !)
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:71:9: declaration SEMICOLON !
=======
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:71:5: ( declaration SEMICOLON !)
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:71:9: declaration SEMICOLON !
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
			{
			root_0 = (Object)adaptor.nil();


<<<<<<< HEAD
			pushFollow(FOLLOW_declaration_in_declarations1113);
=======
			pushFollow(FOLLOW_declaration_in_declarations1103);
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
			declaration4=declaration();
			state._fsp--;

			adaptor.addChild(root_0, declaration4.getTree());

<<<<<<< HEAD
			SEMICOLON5=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_declarations1115); 
=======
			SEMICOLON5=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_declarations1105); 
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
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
<<<<<<< HEAD
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:74:1: declaration : ( constant | variable ) ;
=======
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:74:1: declaration : ( constant | variable ) ;
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
	public final ChocolateParser.declaration_return declaration() throws RecognitionException {
		ChocolateParser.declaration_return retval = new ChocolateParser.declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope constant6 =null;
		ParserRuleReturnScope variable7 =null;


		try {
<<<<<<< HEAD
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:75:5: ( ( constant | variable ) )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:75:9: ( constant | variable )
=======
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:75:5: ( ( constant | variable ) )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:75:9: ( constant | variable )
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
			{
			root_0 = (Object)adaptor.nil();


<<<<<<< HEAD
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:75:9: ( constant | variable )
=======
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:75:9: ( constant | variable )
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
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
<<<<<<< HEAD
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:75:10: constant
					{
					pushFollow(FOLLOW_constant_in_declaration1137);
=======
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:75:10: constant
					{
					pushFollow(FOLLOW_constant_in_declaration1127);
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
					constant6=constant();
					state._fsp--;

					adaptor.addChild(root_0, constant6.getTree());

					}
					break;
				case 2 :
<<<<<<< HEAD
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:75:21: variable
					{
					pushFollow(FOLLOW_variable_in_declaration1141);
=======
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:75:21: variable
					{
					pushFollow(FOLLOW_variable_in_declaration1131);
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
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
<<<<<<< HEAD
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:78:1: constant : CONSTANT ^ type IDENTIFIER ( ASSIGN ( single_expr | closed_compound_expr ) )? ;
=======
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:78:1: constant : CONSTANT ^ type IDENTIFIER ( ASSIGN ( single_expr | closed_compound_expr ) )? ;
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
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
<<<<<<< HEAD
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:79:5: ( CONSTANT ^ type IDENTIFIER ( ASSIGN ( single_expr | closed_compound_expr ) )? )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:79:9: CONSTANT ^ type IDENTIFIER ( ASSIGN ( single_expr | closed_compound_expr ) )?
=======
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:79:5: ( CONSTANT ^ type IDENTIFIER ( ASSIGN ( single_expr | closed_compound_expr ) )? )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:79:9: CONSTANT ^ type IDENTIFIER ( ASSIGN ( single_expr | closed_compound_expr ) )?
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
			{
			root_0 = (Object)adaptor.nil();


<<<<<<< HEAD
			CONSTANT8=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_constant1168); 
			CONSTANT8_tree = (Object)adaptor.create(CONSTANT8);
			root_0 = (Object)adaptor.becomeRoot(CONSTANT8_tree, root_0);

			pushFollow(FOLLOW_type_in_constant1171);
=======
			CONSTANT8=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_constant1158); 
			CONSTANT8_tree = (Object)adaptor.create(CONSTANT8);
			root_0 = (Object)adaptor.becomeRoot(CONSTANT8_tree, root_0);

			pushFollow(FOLLOW_type_in_constant1161);
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
			type9=type();
			state._fsp--;

			adaptor.addChild(root_0, type9.getTree());

<<<<<<< HEAD
			IDENTIFIER10=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant1173); 
			IDENTIFIER10_tree = (Object)adaptor.create(IDENTIFIER10);
			adaptor.addChild(root_0, IDENTIFIER10_tree);

			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:79:35: ( ASSIGN ( single_expr | closed_compound_expr ) )?
=======
			IDENTIFIER10=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant1163); 
			IDENTIFIER10_tree = (Object)adaptor.create(IDENTIFIER10);
			adaptor.addChild(root_0, IDENTIFIER10_tree);

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:79:35: ( ASSIGN ( single_expr | closed_compound_expr ) )?
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ASSIGN) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
<<<<<<< HEAD
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:79:36: ASSIGN ( single_expr | closed_compound_expr )
					{
					ASSIGN11=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_constant1176); 
					ASSIGN11_tree = (Object)adaptor.create(ASSIGN11);
					adaptor.addChild(root_0, ASSIGN11_tree);

					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:79:43: ( single_expr | closed_compound_expr )
=======
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:79:36: ASSIGN ( single_expr | closed_compound_expr )
					{
					ASSIGN11=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_constant1166); 
					ASSIGN11_tree = (Object)adaptor.create(ASSIGN11);
					adaptor.addChild(root_0, ASSIGN11_tree);

					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:79:43: ( single_expr | closed_compound_expr )
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
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
<<<<<<< HEAD
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:79:44: single_expr
							{
							pushFollow(FOLLOW_single_expr_in_constant1179);
=======
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:79:44: single_expr
							{
							pushFollow(FOLLOW_single_expr_in_constant1169);
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
							single_expr12=single_expr();
							state._fsp--;

							adaptor.addChild(root_0, single_expr12.getTree());

							}
							break;
						case 2 :
<<<<<<< HEAD
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:79:58: closed_compound_expr
							{
							pushFollow(FOLLOW_closed_compound_expr_in_constant1183);
=======
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:79:58: closed_compound_expr
							{
							pushFollow(FOLLOW_closed_compound_expr_in_constant1173);
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
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
<<<<<<< HEAD
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:82:1: variable : VAR ^ type IDENTIFIER ( ASSIGN ( single_expr | closed_compound_expr ) )? ;
=======
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:82:1: variable : VAR ^ type IDENTIFIER ( ASSIGN ( single_expr | closed_compound_expr ) )? ;
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
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
<<<<<<< HEAD
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:83:5: ( VAR ^ type IDENTIFIER ( ASSIGN ( single_expr | closed_compound_expr ) )? )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:83:9: VAR ^ type IDENTIFIER ( ASSIGN ( single_expr | closed_compound_expr ) )?
=======
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:83:5: ( VAR ^ type IDENTIFIER ( ASSIGN ( single_expr | closed_compound_expr ) )? )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:83:9: VAR ^ type IDENTIFIER ( ASSIGN ( single_expr | closed_compound_expr ) )?
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
			{
			root_0 = (Object)adaptor.nil();


<<<<<<< HEAD
			VAR14=(Token)match(input,VAR,FOLLOW_VAR_in_variable1209); 
			VAR14_tree = (Object)adaptor.create(VAR14);
			root_0 = (Object)adaptor.becomeRoot(VAR14_tree, root_0);

			pushFollow(FOLLOW_type_in_variable1212);
=======
			VAR14=(Token)match(input,VAR,FOLLOW_VAR_in_variable1199); 
			VAR14_tree = (Object)adaptor.create(VAR14);
			root_0 = (Object)adaptor.becomeRoot(VAR14_tree, root_0);

			pushFollow(FOLLOW_type_in_variable1202);
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
			type15=type();
			state._fsp--;

			adaptor.addChild(root_0, type15.getTree());

<<<<<<< HEAD
			IDENTIFIER16=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variable1214); 
			IDENTIFIER16_tree = (Object)adaptor.create(IDENTIFIER16);
			adaptor.addChild(root_0, IDENTIFIER16_tree);

			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:83:30: ( ASSIGN ( single_expr | closed_compound_expr ) )?
=======
			IDENTIFIER16=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variable1204); 
			IDENTIFIER16_tree = (Object)adaptor.create(IDENTIFIER16);
			adaptor.addChild(root_0, IDENTIFIER16_tree);

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:83:30: ( ASSIGN ( single_expr | closed_compound_expr ) )?
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==ASSIGN) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
<<<<<<< HEAD
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:83:31: ASSIGN ( single_expr | closed_compound_expr )
					{
					ASSIGN17=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_variable1217); 
					ASSIGN17_tree = (Object)adaptor.create(ASSIGN17);
					adaptor.addChild(root_0, ASSIGN17_tree);

					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:83:38: ( single_expr | closed_compound_expr )
=======
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:83:31: ASSIGN ( single_expr | closed_compound_expr )
					{
					ASSIGN17=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_variable1207); 
					ASSIGN17_tree = (Object)adaptor.create(ASSIGN17);
					adaptor.addChild(root_0, ASSIGN17_tree);

					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:83:38: ( single_expr | closed_compound_expr )
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
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
<<<<<<< HEAD
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:83:39: single_expr
							{
							pushFollow(FOLLOW_single_expr_in_variable1220);
=======
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:83:39: single_expr
							{
							pushFollow(FOLLOW_single_expr_in_variable1210);
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
							single_expr18=single_expr();
							state._fsp--;

							adaptor.addChild(root_0, single_expr18.getTree());

							}
							break;
						case 2 :
<<<<<<< HEAD
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:83:53: closed_compound_expr
							{
							pushFollow(FOLLOW_closed_compound_expr_in_variable1224);
=======
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:83:53: closed_compound_expr
							{
							pushFollow(FOLLOW_closed_compound_expr_in_variable1214);
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
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
<<<<<<< HEAD
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:87:1: statements : statement SEMICOLON !;
=======
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:87:1: statements : statement SEMICOLON !;
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
	public final ChocolateParser.statements_return statements() throws RecognitionException {
		ChocolateParser.statements_return retval = new ChocolateParser.statements_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMICOLON21=null;
		ParserRuleReturnScope statement20 =null;

		Object SEMICOLON21_tree=null;

		try {
<<<<<<< HEAD
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:88:5: ( statement SEMICOLON !)
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:88:7: statement SEMICOLON !
=======
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:88:5: ( statement SEMICOLON !)
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:88:7: statement SEMICOLON !
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
			{
			root_0 = (Object)adaptor.nil();


<<<<<<< HEAD
			pushFollow(FOLLOW_statement_in_statements1248);
=======
			pushFollow(FOLLOW_statement_in_statements1238);
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
			statement20=statement();
			state._fsp--;

			adaptor.addChild(root_0, statement20.getTree());

<<<<<<< HEAD
			SEMICOLON21=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statements1250); 
=======
			SEMICOLON21=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statements1240); 
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
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
<<<<<<< HEAD
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:91:1: statement : ( read | print | ifelsethen | single_expr );
=======
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:91:1: statement : ( read | print | assign | ifelsethen );
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
	public final ChocolateParser.statement_return statement() throws RecognitionException {
		ChocolateParser.statement_return retval = new ChocolateParser.statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope read22 =null;
		ParserRuleReturnScope print23 =null;
		ParserRuleReturnScope ifelsethen24 =null;
		ParserRuleReturnScope single_expr25 =null;


		try {
<<<<<<< HEAD
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:92:5: ( read | print | ifelsethen | single_expr )
=======
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:92:5: ( read | print | assign | ifelsethen )
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
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
<<<<<<< HEAD
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:92:9: read
=======
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:92:9: read
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
					{
					root_0 = (Object)adaptor.nil();


<<<<<<< HEAD
					pushFollow(FOLLOW_read_in_statement1274);
=======
					pushFollow(FOLLOW_read_in_statement1264);
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
					read22=read();
					state._fsp--;

					adaptor.addChild(root_0, read22.getTree());

					}
					break;
				case 2 :
<<<<<<< HEAD
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:93:9: print
=======
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:93:9: print
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
					{
					root_0 = (Object)adaptor.nil();


<<<<<<< HEAD
					pushFollow(FOLLOW_print_in_statement1285);
=======
					pushFollow(FOLLOW_print_in_statement1275);
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
					print23=print();
					state._fsp--;

					adaptor.addChild(root_0, print23.getTree());

					}
					break;
				case 3 :
<<<<<<< HEAD
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:94:9: ifelsethen
=======
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:94:9: assign
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
					{
					root_0 = (Object)adaptor.nil();


<<<<<<< HEAD
					pushFollow(FOLLOW_ifelsethen_in_statement1295);
					ifelsethen24=ifelsethen();
=======
					pushFollow(FOLLOW_assign_in_statement1286);
					assign24=assign();
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
					state._fsp--;

					adaptor.addChild(root_0, ifelsethen24.getTree());

					}
					break;
				case 4 :
<<<<<<< HEAD
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:95:9: single_expr
=======
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:95:9: ifelsethen
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
					{
					root_0 = (Object)adaptor.nil();


<<<<<<< HEAD
					pushFollow(FOLLOW_single_expr_in_statement1305);
					single_expr25=single_expr();
=======
					pushFollow(FOLLOW_ifelsethen_in_statement1299);
					ifelsethen25=ifelsethen();
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
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
<<<<<<< HEAD
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:98:1: read : READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !;
=======
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:98:1: read : READ ^ LPAREN ! IDENTIFIER ( readmultiple )? RPAREN !;
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
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
<<<<<<< HEAD
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:99:5: ( READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !)
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:99:9: READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !
=======
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:99:5: ( READ ^ LPAREN ! IDENTIFIER ( readmultiple )? RPAREN !)
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:99:9: READ ^ LPAREN ! IDENTIFIER ( readmultiple )? RPAREN !
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
			{
			root_0 = (Object)adaptor.nil();


<<<<<<< HEAD
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
=======
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
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227

					}
					break;

			}

<<<<<<< HEAD
			RPAREN31=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_read1340); 
=======
			RPAREN30=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_read1329); 
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
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


<<<<<<< HEAD
	// $ANTLR start "assign"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:102:1: assign : ( IDENTIFIER ASSIGN ^ ( IDENTIFIER ASSIGN ^)* ( single_expr | closed_compound_expr ) |);
	public final ChocolateParser.assign_return assign() throws RecognitionException {
		ChocolateParser.assign_return retval = new ChocolateParser.assign_return();
=======
	// $ANTLR start "readmultiple"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:102:1: readmultiple : COMMA ! IDENTIFIER ( readmultiple )? ;
	public final ChocolateParser.readmultiple_return readmultiple() throws RecognitionException {
		ChocolateParser.readmultiple_return retval = new ChocolateParser.readmultiple_return();
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
		retval.start = input.LT(1);

		Object root_0 = null;

		Token COMMA31=null;
		Token IDENTIFIER32=null;
<<<<<<< HEAD
		Token ASSIGN33=null;
		Token IDENTIFIER34=null;
		Token ASSIGN35=null;
		ParserRuleReturnScope single_expr36 =null;
		ParserRuleReturnScope closed_compound_expr37 =null;
=======
		ParserRuleReturnScope readmultiple33 =null;
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227

		Object COMMA31_tree=null;
		Object IDENTIFIER32_tree=null;
<<<<<<< HEAD
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
=======

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

>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
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

<<<<<<< HEAD
=======
	public static class assignchoice_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227

					IDENTIFIER32=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assign1360); 
					IDENTIFIER32_tree = (Object)adaptor.create(IDENTIFIER32);
					adaptor.addChild(root_0, IDENTIFIER32_tree);

<<<<<<< HEAD
					ASSIGN33=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign1362); 
					ASSIGN33_tree = (Object)adaptor.create(ASSIGN33);
					root_0 = (Object)adaptor.becomeRoot(ASSIGN33_tree, root_0);
=======
	// $ANTLR start "assignchoice"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:110:1: assignchoice : ( IDENTIFIER ( ASSIGN ^ assignchoice )? | single_expr ~ IDENTIFIER | closed_compound_expr );
	public final ChocolateParser.assignchoice_return assignchoice() throws RecognitionException {
		ChocolateParser.assignchoice_return retval = new ChocolateParser.assignchoice_return();
		retval.start = input.LT(1);
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227

					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:103:28: ( IDENTIFIER ASSIGN ^)*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==IDENTIFIER) ) {
							alt10=1;
						}

<<<<<<< HEAD
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
=======
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
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227

						default :
							break loop10;
						}
					}

<<<<<<< HEAD
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
=======
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
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227

							}
							break;

					}

					}
					break;
				case 2 :
<<<<<<< HEAD
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:105:5: 
=======
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
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
					{
					root_0 = (Object)adaptor.nil();


<<<<<<< HEAD
=======
					pushFollow(FOLLOW_closed_compound_expr_in_assignchoice1437);
					closed_compound_expr42=closed_compound_expr();
					state._fsp--;

					adaptor.addChild(root_0, closed_compound_expr42.getTree());

>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
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
<<<<<<< HEAD
	// $ANTLR end "assign"
=======
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
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227


	public static class print_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "print"
<<<<<<< HEAD
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:107:1: print : PRINT ^ LPAREN ! ( unclosed_compound_expr | string ) ( COMMA ! ( unclosed_compound_expr | string ) )* RPAREN !;
=======
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:120:1: print : PRINT ^ LPAREN ! ( closed_compound_expr | string | IDENTIFIER ) ( printmultiple )? RPAREN !;
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
	public final ChocolateParser.print_return print() throws RecognitionException {
		ChocolateParser.print_return retval = new ChocolateParser.print_return();
		retval.start = input.LT(1);

		Object root_0 = null;

<<<<<<< HEAD
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
=======
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
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
			{
			root_0 = (Object)adaptor.nil();


<<<<<<< HEAD
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
=======
			PRINT46=(Token)match(input,PRINT,FOLLOW_PRINT_in_print1491); 
			PRINT46_tree = (Object)adaptor.create(PRINT46);
			root_0 = (Object)adaptor.becomeRoot(PRINT46_tree, root_0);
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227

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
<<<<<<< HEAD
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
=======
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
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227

					}
					break;
				case 2 :
<<<<<<< HEAD
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:108:50: string
					{
					pushFollow(FOLLOW_string_in_print1419);
					string41=string();
					state._fsp--;

					adaptor.addChild(root_0, string41.getTree());
=======
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:121:48: string
					{
					pushFollow(FOLLOW_string_in_print1502);
					string49=string();
					state._fsp--;

					adaptor.addChild(root_0, string49.getTree());
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227

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

<<<<<<< HEAD
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
=======
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

>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
					}
					break;

<<<<<<< HEAD
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
=======
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

>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227

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

<<<<<<< HEAD
				default :
					break loop15;
				}
			}

			RPAREN45=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_print1436); 
=======
			}

>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
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
<<<<<<< HEAD
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:112:1: compound_expr : ( unclosed_compound_expr | closed_compound_expr );
=======
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:129:1: compound_expr : ( unclosed_compound_expr | closed_compound_expr );
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
	public final ChocolateParser.compound_expr_return compound_expr() throws RecognitionException {
		ChocolateParser.compound_expr_return retval = new ChocolateParser.compound_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

<<<<<<< HEAD
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
=======
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
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
			}

			else {
				NoViableAltException nvae =
<<<<<<< HEAD
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:113:9: unclosed_compound_expr
=======
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:130:9: unclosed_compound_expr
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
					{
					root_0 = (Object)adaptor.nil();


<<<<<<< HEAD
					pushFollow(FOLLOW_unclosed_compound_expr_in_compound_expr1461);
					unclosed_compound_expr46=unclosed_compound_expr();
					state._fsp--;

					adaptor.addChild(root_0, unclosed_compound_expr46.getTree());
=======
					pushFollow(FOLLOW_unclosed_compound_expr_in_compound_expr1576);
					unclosed_compound_expr58=unclosed_compound_expr();
					state._fsp--;

					adaptor.addChild(root_0, unclosed_compound_expr58.getTree());
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227

					}
					break;
				case 2 :
<<<<<<< HEAD
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:114:9: closed_compound_expr
=======
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:131:9: closed_compound_expr
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
					{
					root_0 = (Object)adaptor.nil();


<<<<<<< HEAD
					pushFollow(FOLLOW_closed_compound_expr_in_compound_expr1471);
					closed_compound_expr47=closed_compound_expr();
					state._fsp--;

					adaptor.addChild(root_0, closed_compound_expr47.getTree());
=======
					pushFollow(FOLLOW_closed_compound_expr_in_compound_expr1586);
					closed_compound_expr59=closed_compound_expr();
					state._fsp--;

					adaptor.addChild(root_0, closed_compound_expr59.getTree());
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227

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
<<<<<<< HEAD
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:117:1: unclosed_compound_expr : ( ( declarations )* statements )+ ;
=======
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:134:1: unclosed_compound_expr : ( ( declarations )* statements )+ ;
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
	public final ChocolateParser.unclosed_compound_expr_return unclosed_compound_expr() throws RecognitionException {
		ChocolateParser.unclosed_compound_expr_return retval = new ChocolateParser.unclosed_compound_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

<<<<<<< HEAD
		ParserRuleReturnScope declarations48 =null;
		ParserRuleReturnScope statements49 =null;


		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:118:5: ( ( ( declarations )* statements )+ )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:118:9: ( ( declarations )* statements )+
=======
		ParserRuleReturnScope declarations60 =null;
		ParserRuleReturnScope statements61 =null;


		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:135:5: ( ( ( declarations )* statements )+ )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:135:9: ( ( declarations )* statements )+
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
			{
			root_0 = (Object)adaptor.nil();


<<<<<<< HEAD
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
=======
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
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227

							}
							break;

						default :
<<<<<<< HEAD
							break loop17;
						}
					}

					pushFollow(FOLLOW_statements_in_unclosed_compound_expr1498);
					statements49=statements();
					state._fsp--;

					adaptor.addChild(root_0, statements49.getTree());
=======
							break loop19;
						}
					}

					pushFollow(FOLLOW_statements_in_unclosed_compound_expr1613);
					statements61=statements();
					state._fsp--;

					adaptor.addChild(root_0, statements61.getTree());
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227

					}
					break;

				default :
<<<<<<< HEAD
					if ( cnt18 >= 1 ) break loop18;
					EarlyExitException eee = new EarlyExitException(18, input);
					throw eee;
				}
				cnt18++;
=======
					if ( cnt20 >= 1 ) break loop20;
					EarlyExitException eee = new EarlyExitException(20, input);
					throw eee;
				}
				cnt20++;
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
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
<<<<<<< HEAD
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:121:1: closed_compound_expr : LCURLY ! ( ( declarations )* statements )+ RCURLY !;
=======
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:138:1: closed_compound_expr : LCURLY ! ( ( declarations )* statements )+ RCURLY !;
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
	public final ChocolateParser.closed_compound_expr_return closed_compound_expr() throws RecognitionException {
		ChocolateParser.closed_compound_expr_return retval = new ChocolateParser.closed_compound_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

<<<<<<< HEAD
		Token LCURLY50=null;
		Token RCURLY53=null;
		ParserRuleReturnScope declarations51 =null;
		ParserRuleReturnScope statements52 =null;

		Object LCURLY50_tree=null;
		Object RCURLY53_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:122:5: ( LCURLY ! ( ( declarations )* statements )+ RCURLY !)
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:122:9: LCURLY ! ( ( declarations )* statements )+ RCURLY !
=======
		Token LCURLY62=null;
		Token RCURLY65=null;
		ParserRuleReturnScope declarations63 =null;
		ParserRuleReturnScope statements64 =null;

		Object LCURLY62_tree=null;
		Object RCURLY65_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:139:5: ( LCURLY ! ( ( declarations )* statements )+ RCURLY !)
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:139:9: LCURLY ! ( ( declarations )* statements )+ RCURLY !
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
			{
			root_0 = (Object)adaptor.nil();


<<<<<<< HEAD
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
=======
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
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227

							}
							break;

						default :
<<<<<<< HEAD
							break loop19;
						}
					}

					pushFollow(FOLLOW_statements_in_closed_compound_expr1527);
					statements52=statements();
					state._fsp--;

					adaptor.addChild(root_0, statements52.getTree());
=======
							break loop21;
						}
					}

					pushFollow(FOLLOW_statements_in_closed_compound_expr1642);
					statements64=statements();
					state._fsp--;

					adaptor.addChild(root_0, statements64.getTree());
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227

					}
					break;

				default :
<<<<<<< HEAD
					if ( cnt20 >= 1 ) break loop20;
					EarlyExitException eee = new EarlyExitException(20, input);
					throw eee;
				}
				cnt20++;
			}

			RCURLY53=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_closed_compound_expr1531); 
=======
					if ( cnt22 >= 1 ) break loop22;
					EarlyExitException eee = new EarlyExitException(22, input);
					throw eee;
				}
				cnt22++;
			}

			RCURLY65=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_closed_compound_expr1646); 
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
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
<<<<<<< HEAD
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:125:1: single_expr : ( arithmetic | assign );
=======
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:142:1: single_expr : arithmetic ;
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
	public final ChocolateParser.single_expr_return single_expr() throws RecognitionException {
		ChocolateParser.single_expr_return retval = new ChocolateParser.single_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

<<<<<<< HEAD
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
=======
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
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227

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
<<<<<<< HEAD
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:130:1: arithmetic : arith2 ( OR ^ arith2 )* ;
=======
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:146:1: arithmetic : arith2 ( OR ^ arith2 )* ;
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
	public final ChocolateParser.arithmetic_return arithmetic() throws RecognitionException {
		ChocolateParser.arithmetic_return retval = new ChocolateParser.arithmetic_return();
		retval.start = input.LT(1);

		Object root_0 = null;

<<<<<<< HEAD
		Token OR57=null;
		ParserRuleReturnScope arith256 =null;
		ParserRuleReturnScope arith258 =null;

		Object OR57_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:131:5: ( arith2 ( OR ^ arith2 )* )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:131:9: arith2 ( OR ^ arith2 )*
=======
		Token OR68=null;
		ParserRuleReturnScope arith267 =null;
		ParserRuleReturnScope arith269 =null;

		Object OR68_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:147:5: ( arith2 ( OR ^ arith2 )* )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:147:9: arith2 ( OR ^ arith2 )*
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
			{
			root_0 = (Object)adaptor.nil();


<<<<<<< HEAD
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
=======
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
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227

					}
					break;

				default :
<<<<<<< HEAD
					break loop22;
=======
					break loop23;
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
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
<<<<<<< HEAD
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:134:1: arith2 : arith3 ( AND ^ arith3 )* ;
=======
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:150:1: arith2 : arith3 ( AND ^ arith3 )* ;
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
	public final ChocolateParser.arith2_return arith2() throws RecognitionException {
		ChocolateParser.arith2_return retval = new ChocolateParser.arith2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

<<<<<<< HEAD
		Token AND60=null;
		ParserRuleReturnScope arith359 =null;
		ParserRuleReturnScope arith361 =null;

		Object AND60_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:135:5: ( arith3 ( AND ^ arith3 )* )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:135:9: arith3 ( AND ^ arith3 )*
=======
		Token AND71=null;
		ParserRuleReturnScope arith370 =null;
		ParserRuleReturnScope arith372 =null;

		Object AND71_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:151:5: ( arith3 ( AND ^ arith3 )* )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:151:9: arith3 ( AND ^ arith3 )*
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
			{
			root_0 = (Object)adaptor.nil();


<<<<<<< HEAD
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
=======
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
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227

					}
					break;

				default :
<<<<<<< HEAD
					break loop23;
=======
					break loop24;
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
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
<<<<<<< HEAD
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:138:1: arith3 : arith4 ( ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^) arith4 )* ;
=======
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:154:1: arith3 : arith4 ( ( LESS ^| LESSEQ ^| GREATEQ ^| GREAT ^| EQ ^| NOTEQ ^) arith4 )* ;
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
	public final ChocolateParser.arith3_return arith3() throws RecognitionException {
		ChocolateParser.arith3_return retval = new ChocolateParser.arith3_return();
		retval.start = input.LT(1);

		Object root_0 = null;

<<<<<<< HEAD
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
=======
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
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
			{
			root_0 = (Object)adaptor.nil();


<<<<<<< HEAD
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
=======
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
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
						}
						break;
					case LESSEQ:
						{
<<<<<<< HEAD
						alt24=2;
=======
						alt25=2;
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
						}
						break;
					case GREATEQ:
						{
<<<<<<< HEAD
						alt24=3;
=======
						alt25=3;
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
						}
						break;
					case GREAT:
						{
<<<<<<< HEAD
						alt24=4;
=======
						alt25=4;
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
						}
						break;
					case EQ:
						{
<<<<<<< HEAD
						alt24=5;
=======
						alt25=5;
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
						}
						break;
					case NOTEQ:
						{
<<<<<<< HEAD
						alt24=6;
=======
						alt25=6;
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
						}
						break;
					default:
						NoViableAltException nvae =
<<<<<<< HEAD
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
=======
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
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227

							}
							break;
						case 2 :
<<<<<<< HEAD
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:139:26: LESSEQ ^
							{
							LESSEQ64=(Token)match(input,LESSEQ,FOLLOW_LESSEQ_in_arith31655); 
							LESSEQ64_tree = (Object)adaptor.create(LESSEQ64);
							root_0 = (Object)adaptor.becomeRoot(LESSEQ64_tree, root_0);
=======
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:155:26: LESSEQ ^
							{
							LESSEQ75=(Token)match(input,LESSEQ,FOLLOW_LESSEQ_in_arith31760); 
							LESSEQ75_tree = (Object)adaptor.create(LESSEQ75);
							root_0 = (Object)adaptor.becomeRoot(LESSEQ75_tree, root_0);
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227

							}
							break;
						case 3 :
<<<<<<< HEAD
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:139:36: GREATEQ ^
							{
							GREATEQ65=(Token)match(input,GREATEQ,FOLLOW_GREATEQ_in_arith31660); 
							GREATEQ65_tree = (Object)adaptor.create(GREATEQ65);
							root_0 = (Object)adaptor.becomeRoot(GREATEQ65_tree, root_0);
=======
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:155:36: GREATEQ ^
							{
							GREATEQ76=(Token)match(input,GREATEQ,FOLLOW_GREATEQ_in_arith31765); 
							GREATEQ76_tree = (Object)adaptor.create(GREATEQ76);
							root_0 = (Object)adaptor.becomeRoot(GREATEQ76_tree, root_0);
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227

							}
							break;
						case 4 :
<<<<<<< HEAD
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:139:47: GREAT ^
							{
							GREAT66=(Token)match(input,GREAT,FOLLOW_GREAT_in_arith31665); 
							GREAT66_tree = (Object)adaptor.create(GREAT66);
							root_0 = (Object)adaptor.becomeRoot(GREAT66_tree, root_0);
=======
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:155:47: GREAT ^
							{
							GREAT77=(Token)match(input,GREAT,FOLLOW_GREAT_in_arith31770); 
							GREAT77_tree = (Object)adaptor.create(GREAT77);
							root_0 = (Object)adaptor.becomeRoot(GREAT77_tree, root_0);
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227

							}
							break;
						case 5 :
<<<<<<< HEAD
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:139:56: EQ ^
							{
							EQ67=(Token)match(input,EQ,FOLLOW_EQ_in_arith31670); 
							EQ67_tree = (Object)adaptor.create(EQ67);
							root_0 = (Object)adaptor.becomeRoot(EQ67_tree, root_0);
=======
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:155:56: EQ ^
							{
							EQ78=(Token)match(input,EQ,FOLLOW_EQ_in_arith31775); 
							EQ78_tree = (Object)adaptor.create(EQ78);
							root_0 = (Object)adaptor.becomeRoot(EQ78_tree, root_0);
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227

							}
							break;
						case 6 :
<<<<<<< HEAD
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:139:62: NOTEQ ^
							{
							NOTEQ68=(Token)match(input,NOTEQ,FOLLOW_NOTEQ_in_arith31675); 
							NOTEQ68_tree = (Object)adaptor.create(NOTEQ68);
							root_0 = (Object)adaptor.becomeRoot(NOTEQ68_tree, root_0);
=======
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:155:62: NOTEQ ^
							{
							NOTEQ79=(Token)match(input,NOTEQ,FOLLOW_NOTEQ_in_arith31780); 
							NOTEQ79_tree = (Object)adaptor.create(NOTEQ79);
							root_0 = (Object)adaptor.becomeRoot(NOTEQ79_tree, root_0);
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227

							}
							break;

					}

<<<<<<< HEAD
					pushFollow(FOLLOW_arith4_in_arith31679);
					arith469=arith4();
					state._fsp--;

					adaptor.addChild(root_0, arith469.getTree());
=======
					pushFollow(FOLLOW_arith4_in_arith31784);
					arith480=arith4();
					state._fsp--;

					adaptor.addChild(root_0, arith480.getTree());
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227

					}
					break;

				default :
<<<<<<< HEAD
					break loop25;
=======
					break loop26;
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
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
<<<<<<< HEAD
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:142:1: arith4 : arith5 ( ( PLUS ^| MIN ^) arith5 )* ;
=======
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:158:1: arith4 : arith5 ( ( PLUS ^| MIN ^) arith5 )* ;
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
	public final ChocolateParser.arith4_return arith4() throws RecognitionException {
		ChocolateParser.arith4_return retval = new ChocolateParser.arith4_return();
		retval.start = input.LT(1);

		Object root_0 = null;

<<<<<<< HEAD
		Token PLUS71=null;
		Token MIN72=null;
		ParserRuleReturnScope arith570 =null;
		ParserRuleReturnScope arith573 =null;

		Object PLUS71_tree=null;
		Object MIN72_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:143:5: ( arith5 ( ( PLUS ^| MIN ^) arith5 )* )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:143:9: arith5 ( ( PLUS ^| MIN ^) arith5 )*
=======
		Token PLUS82=null;
		Token MIN83=null;
		ParserRuleReturnScope arith581 =null;
		ParserRuleReturnScope arith584 =null;

		Object PLUS82_tree=null;
		Object MIN83_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:159:5: ( arith5 ( ( PLUS ^| MIN ^) arith5 )* )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:159:9: arith5 ( ( PLUS ^| MIN ^) arith5 )*
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
			{
			root_0 = (Object)adaptor.nil();


<<<<<<< HEAD
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
=======
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
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
					}

					else {
						NoViableAltException nvae =
<<<<<<< HEAD
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
=======
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
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227

							}
							break;
						case 2 :
<<<<<<< HEAD
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:143:26: MIN ^
							{
							MIN72=(Token)match(input,MIN,FOLLOW_MIN_in_arith41718); 
							MIN72_tree = (Object)adaptor.create(MIN72);
							root_0 = (Object)adaptor.becomeRoot(MIN72_tree, root_0);
=======
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:159:26: MIN ^
							{
							MIN83=(Token)match(input,MIN,FOLLOW_MIN_in_arith41823); 
							MIN83_tree = (Object)adaptor.create(MIN83);
							root_0 = (Object)adaptor.becomeRoot(MIN83_tree, root_0);
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227

							}
							break;

					}

<<<<<<< HEAD
					pushFollow(FOLLOW_arith5_in_arith41722);
					arith573=arith5();
					state._fsp--;

					adaptor.addChild(root_0, arith573.getTree());
=======
					pushFollow(FOLLOW_arith5_in_arith41827);
					arith584=arith5();
					state._fsp--;

					adaptor.addChild(root_0, arith584.getTree());
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227

					}
					break;

				default :
<<<<<<< HEAD
					break loop27;
=======
					break loop28;
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
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
<<<<<<< HEAD
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:146:1: arith5 : arith6 ( ( MULT ^| DIV ^| MOD ^) arith6 )* ;
=======
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:162:1: arith5 : arith6 ( ( MULT ^| DIV ^| MOD ^) arith6 )* ;
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
	public final ChocolateParser.arith5_return arith5() throws RecognitionException {
		ChocolateParser.arith5_return retval = new ChocolateParser.arith5_return();
		retval.start = input.LT(1);

		Object root_0 = null;

<<<<<<< HEAD
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
=======
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
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
			{
			root_0 = (Object)adaptor.nil();


<<<<<<< HEAD
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
=======
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
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
						}
						break;
					case DIV:
						{
<<<<<<< HEAD
						alt28=2;
=======
						alt29=2;
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
						}
						break;
					case MOD:
						{
<<<<<<< HEAD
						alt28=3;
=======
						alt29=3;
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
						}
						break;
					default:
						NoViableAltException nvae =
<<<<<<< HEAD
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
=======
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
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227

							}
							break;
						case 2 :
<<<<<<< HEAD
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:147:26: DIV ^
							{
							DIV76=(Token)match(input,DIV,FOLLOW_DIV_in_arith51762); 
							DIV76_tree = (Object)adaptor.create(DIV76);
							root_0 = (Object)adaptor.becomeRoot(DIV76_tree, root_0);
=======
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:163:26: DIV ^
							{
							DIV87=(Token)match(input,DIV,FOLLOW_DIV_in_arith51867); 
							DIV87_tree = (Object)adaptor.create(DIV87);
							root_0 = (Object)adaptor.becomeRoot(DIV87_tree, root_0);
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227

							}
							break;
						case 3 :
<<<<<<< HEAD
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:147:33: MOD ^
							{
							MOD77=(Token)match(input,MOD,FOLLOW_MOD_in_arith51767); 
							MOD77_tree = (Object)adaptor.create(MOD77);
							root_0 = (Object)adaptor.becomeRoot(MOD77_tree, root_0);
=======
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:163:33: MOD ^
							{
							MOD88=(Token)match(input,MOD,FOLLOW_MOD_in_arith51872); 
							MOD88_tree = (Object)adaptor.create(MOD88);
							root_0 = (Object)adaptor.becomeRoot(MOD88_tree, root_0);
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227

							}
							break;

					}

<<<<<<< HEAD
					pushFollow(FOLLOW_arith6_in_arith51771);
					arith678=arith6();
					state._fsp--;

					adaptor.addChild(root_0, arith678.getTree());
=======
					pushFollow(FOLLOW_arith6_in_arith51876);
					arith689=arith6();
					state._fsp--;

					adaptor.addChild(root_0, arith689.getTree());
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227

					}
					break;

				default :
<<<<<<< HEAD
					break loop29;
=======
					break loop30;
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
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
<<<<<<< HEAD
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:150:1: arith6 : ( ( PLUS ^| MIN ^| NOT ^)? operand ) ;
=======
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:166:1: arith6 : ( ( PLUS ^| MIN ^| NOT ^)? operand ) ;
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
	public final ChocolateParser.arith6_return arith6() throws RecognitionException {
		ChocolateParser.arith6_return retval = new ChocolateParser.arith6_return();
		retval.start = input.LT(1);

		Object root_0 = null;

<<<<<<< HEAD
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
=======
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
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
			{
			root_0 = (Object)adaptor.nil();


<<<<<<< HEAD
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:151:9: ( ( PLUS ^| MIN ^| NOT ^)? operand )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:151:10: ( PLUS ^| MIN ^| NOT ^)? operand
			{
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:151:10: ( PLUS ^| MIN ^| NOT ^)?
			int alt30=4;
			switch ( input.LA(1) ) {
				case PLUS:
					{
					alt30=1;
=======
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:167:9: ( ( PLUS ^| MIN ^| NOT ^)? operand )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:167:10: ( PLUS ^| MIN ^| NOT ^)? operand
			{
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:167:10: ( PLUS ^| MIN ^| NOT ^)?
			int alt31=4;
			switch ( input.LA(1) ) {
				case PLUS:
					{
					alt31=1;
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
					}
					break;
				case MIN:
					{
<<<<<<< HEAD
					alt30=2;
=======
					alt31=2;
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
					}
					break;
				case NOT:
					{
<<<<<<< HEAD
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
=======
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
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227

					}
					break;
				case 2 :
<<<<<<< HEAD
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:151:19: MIN ^
					{
					MIN80=(Token)match(input,MIN,FOLLOW_MIN_in_arith61811); 
					MIN80_tree = (Object)adaptor.create(MIN80);
					root_0 = (Object)adaptor.becomeRoot(MIN80_tree, root_0);
=======
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:167:19: MIN ^
					{
					MIN91=(Token)match(input,MIN,FOLLOW_MIN_in_arith61916); 
					MIN91_tree = (Object)adaptor.create(MIN91);
					root_0 = (Object)adaptor.becomeRoot(MIN91_tree, root_0);
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227

					}
					break;
				case 3 :
<<<<<<< HEAD
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:151:26: NOT ^
					{
					NOT81=(Token)match(input,NOT,FOLLOW_NOT_in_arith61816); 
					NOT81_tree = (Object)adaptor.create(NOT81);
					root_0 = (Object)adaptor.becomeRoot(NOT81_tree, root_0);
=======
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:167:26: NOT ^
					{
					NOT92=(Token)match(input,NOT,FOLLOW_NOT_in_arith61921); 
					NOT92_tree = (Object)adaptor.create(NOT92);
					root_0 = (Object)adaptor.becomeRoot(NOT92_tree, root_0);
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227

					}
					break;

			}

<<<<<<< HEAD
			pushFollow(FOLLOW_operand_in_arith61821);
			operand82=operand();
			state._fsp--;

			adaptor.addChild(root_0, operand82.getTree());
=======
			pushFollow(FOLLOW_operand_in_arith61926);
			operand93=operand();
			state._fsp--;

			adaptor.addChild(root_0, operand93.getTree());
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227

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
<<<<<<< HEAD
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:154:1: ifelsethen : IF ^ single_expr THEN ! LCURLY ! unclosed_compound_expr RCURLY ! ( ELSE ! LCURLY ! unclosed_compound_expr RCURLY !)? ;
=======
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:170:1: ifelsethen : IF ^ single_expr THEN ! closed_compound_expr ( ELSE ! closed_compound_expr )? ;
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
	public final ChocolateParser.ifelsethen_return ifelsethen() throws RecognitionException {
		ChocolateParser.ifelsethen_return retval = new ChocolateParser.ifelsethen_return();
		retval.start = input.LT(1);

		Object root_0 = null;

<<<<<<< HEAD
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
=======
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
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
			{
			root_0 = (Object)adaptor.nil();


<<<<<<< HEAD
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
=======
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

>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
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
<<<<<<< HEAD
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:159:1: operand : ( IDENTIFIER | NUMBER | LPAREN ! single_expr RPAREN !| BOOLEAN_OPERATOR | CHAR_OPERATOR );
=======
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:175:1: operand : ( IDENTIFIER | NUMBER | LPAREN ! single_expr RPAREN !| BOOLEAN_OPERATOR | CHAR_OPERATOR );
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
	public final ChocolateParser.operand_return operand() throws RecognitionException {
		ChocolateParser.operand_return retval = new ChocolateParser.operand_return();
		retval.start = input.LT(1);

		Object root_0 = null;

<<<<<<< HEAD
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
=======
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
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
				}
				break;
			case NUMBER:
				{
<<<<<<< HEAD
				alt32=2;
=======
				alt33=2;
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
				}
				break;
			case LPAREN:
				{
<<<<<<< HEAD
				alt32=3;
=======
				alt33=3;
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
				}
				break;
			case BOOLEAN_OPERATOR:
				{
<<<<<<< HEAD
				alt32=4;
=======
				alt33=4;
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
				}
				break;
			case CHAR_OPERATOR:
				{
<<<<<<< HEAD
				alt32=5;
=======
				alt33=5;
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
				}
				break;
			default:
				NoViableAltException nvae =
<<<<<<< HEAD
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}
			switch (alt32) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:160:9: IDENTIFIER
=======
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}
			switch (alt33) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:176:9: IDENTIFIER
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
					{
					root_0 = (Object)adaptor.nil();


<<<<<<< HEAD
					IDENTIFIER93=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand1893); 
					IDENTIFIER93_tree = (Object)adaptor.create(IDENTIFIER93);
					adaptor.addChild(root_0, IDENTIFIER93_tree);
=======
					IDENTIFIER100=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand1986); 
					IDENTIFIER100_tree = (Object)adaptor.create(IDENTIFIER100);
					adaptor.addChild(root_0, IDENTIFIER100_tree);
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227

					}
					break;
				case 2 :
<<<<<<< HEAD
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:161:9: NUMBER
=======
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:177:9: NUMBER
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
					{
					root_0 = (Object)adaptor.nil();


<<<<<<< HEAD
					NUMBER94=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_operand1903); 
					NUMBER94_tree = (Object)adaptor.create(NUMBER94);
					adaptor.addChild(root_0, NUMBER94_tree);
=======
					NUMBER101=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_operand1996); 
					NUMBER101_tree = (Object)adaptor.create(NUMBER101);
					adaptor.addChild(root_0, NUMBER101_tree);
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227

					}
					break;
				case 3 :
<<<<<<< HEAD
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:162:9: LPAREN ! single_expr RPAREN !
=======
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:178:9: LPAREN ! single_expr RPAREN !
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
					{
					root_0 = (Object)adaptor.nil();


<<<<<<< HEAD
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
=======
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
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
					{
					root_0 = (Object)adaptor.nil();


<<<<<<< HEAD
					BOOLEAN_OPERATOR98=(Token)match(input,BOOLEAN_OPERATOR,FOLLOW_BOOLEAN_OPERATOR_in_operand1929); 
					BOOLEAN_OPERATOR98_tree = (Object)adaptor.create(BOOLEAN_OPERATOR98);
					adaptor.addChild(root_0, BOOLEAN_OPERATOR98_tree);
=======
					BOOLEAN_OPERATOR105=(Token)match(input,BOOLEAN_OPERATOR,FOLLOW_BOOLEAN_OPERATOR_in_operand2022); 
					BOOLEAN_OPERATOR105_tree = (Object)adaptor.create(BOOLEAN_OPERATOR105);
					adaptor.addChild(root_0, BOOLEAN_OPERATOR105_tree);
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227

					}
					break;
				case 5 :
<<<<<<< HEAD
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:164:9: CHAR_OPERATOR
=======
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:180:9: CHAR_OPERATOR
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
					{
					root_0 = (Object)adaptor.nil();


<<<<<<< HEAD
					CHAR_OPERATOR99=(Token)match(input,CHAR_OPERATOR,FOLLOW_CHAR_OPERATOR_in_operand1939); 
					CHAR_OPERATOR99_tree = (Object)adaptor.create(CHAR_OPERATOR99);
					adaptor.addChild(root_0, CHAR_OPERATOR99_tree);
=======
					CHAR_OPERATOR106=(Token)match(input,CHAR_OPERATOR,FOLLOW_CHAR_OPERATOR_in_operand2032); 
					CHAR_OPERATOR106_tree = (Object)adaptor.create(CHAR_OPERATOR106);
					adaptor.addChild(root_0, CHAR_OPERATOR106_tree);
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227

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
<<<<<<< HEAD
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:167:1: type : ( INTEGER | CHAR | BOOLEAN );
=======
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:183:1: type : ( INTEGER | CHAR | BOOLEAN );
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
	public final ChocolateParser.type_return type() throws RecognitionException {
		ChocolateParser.type_return retval = new ChocolateParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

<<<<<<< HEAD
		Token set100=null;

		Object set100_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:168:5: ( INTEGER | CHAR | BOOLEAN )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:
=======
		Token set107=null;

		Object set107_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:184:5: ( INTEGER | CHAR | BOOLEAN )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
			{
			root_0 = (Object)adaptor.nil();


<<<<<<< HEAD
			set100=input.LT(1);
			if ( input.LA(1)==BOOLEAN||input.LA(1)==CHAR||input.LA(1)==INTEGER ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set100));
=======
			set107=input.LT(1);
			if ( input.LA(1)==BOOLEAN||input.LA(1)==CHAR||input.LA(1)==INTEGER ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set107));
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
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
<<<<<<< HEAD
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:171:1: string : DQUOTATION ! ( graphic )* DQUOTATION !;
=======
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:187:1: string : DQUOTATION ! ( graphic )* DQUOTATION !;
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
	public final ChocolateParser.string_return string() throws RecognitionException {
		ChocolateParser.string_return retval = new ChocolateParser.string_return();
		retval.start = input.LT(1);

		Object root_0 = null;

<<<<<<< HEAD
		Token DQUOTATION101=null;
		Token DQUOTATION103=null;
		ParserRuleReturnScope graphic102 =null;

		Object DQUOTATION101_tree=null;
		Object DQUOTATION103_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:172:5: ( DQUOTATION ! ( graphic )* DQUOTATION !)
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:172:9: DQUOTATION ! ( graphic )* DQUOTATION !
=======
		Token DQUOTATION108=null;
		Token DQUOTATION110=null;
		ParserRuleReturnScope graphic109 =null;

		Object DQUOTATION108_tree=null;
		Object DQUOTATION110_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:188:5: ( DQUOTATION ! ( graphic )* DQUOTATION !)
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:188:9: DQUOTATION ! ( graphic )* DQUOTATION !
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
			{
			root_0 = (Object)adaptor.nil();


<<<<<<< HEAD
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
=======
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
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227

					}
					break;

				default :
<<<<<<< HEAD
					break loop33;
				}
			}

			DQUOTATION103=(Token)match(input,DQUOTATION,FOLLOW_DQUOTATION_in_string1995); 
=======
					break loop34;
				}
			}

			DQUOTATION110=(Token)match(input,DQUOTATION,FOLLOW_DQUOTATION_in_string2088); 
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
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
<<<<<<< HEAD
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:175:1: graphic : ( LETTER | DIGIT );
=======
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:191:1: graphic : ( LETTER | DIGIT );
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
	public final ChocolateParser.graphic_return graphic() throws RecognitionException {
		ChocolateParser.graphic_return retval = new ChocolateParser.graphic_return();
		retval.start = input.LT(1);

		Object root_0 = null;

<<<<<<< HEAD
		Token set104=null;

		Object set104_tree=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:176:5: ( LETTER | DIGIT )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:
=======
		Token set111=null;

		Object set111_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:192:5: ( LETTER | DIGIT )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
			{
			root_0 = (Object)adaptor.nil();


<<<<<<< HEAD
			set104=input.LT(1);
			if ( input.LA(1)==DIGIT||input.LA(1)==LETTER ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set104));
=======
			set111=input.LT(1);
			if ( input.LA(1)==DIGIT||input.LA(1)==LETTER ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set111));
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
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



<<<<<<< HEAD
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
=======
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
>>>>>>> 5a2673432be4863e2ee2fe2cf46a8f4f77859227
}
