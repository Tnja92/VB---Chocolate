// $ANTLR 3.5 C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g 2013-07-09 17:38:23

package ContextualAnalyzer;
import java.util.Set;
import java.util.HashSet;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings("all")
public class ChocolateChecker extends TreeParser {
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
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public ChocolateChecker(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public ChocolateChecker(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return ChocolateChecker.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g"; }


	  CheckerActions ca = new CheckerActions();


	public static class program_return extends TreeRuleReturnScope {
		ChocolateTree tree;
		@Override
		public ChocolateTree getTree() { return tree; }
	};


	// $ANTLR start "program"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:27:1: program : ^( PROGRAM ( ( declarations )* statements )+ ) ;
	public final ChocolateChecker.program_return program() throws RecognitionException {
		ChocolateChecker.program_return retval = new ChocolateChecker.program_return();
		retval.start = input.LT(1);

		ChocolateTree root_0 = null;

		ChocolateTree _first_0 = null;
		ChocolateTree _last = null;


		ChocolateTree PROGRAM1=null;
		TreeRuleReturnScope declarations2 =null;
		TreeRuleReturnScope statements3 =null;

		ChocolateTree PROGRAM1_tree=null;


		  cf.openScope();

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:34:5: ( ^( PROGRAM ( ( declarations )* statements )+ ) )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:34:9: ^( PROGRAM ( ( declarations )* statements )+ )
			{
			root_0 = (ChocolateTree)adaptor.nil();


			_last = (ChocolateTree)input.LT(1);
			{
			ChocolateTree _save_last_1 = _last;
			ChocolateTree _first_1 = null;
			ChocolateTree root_1 = (ChocolateTree)adaptor.nil();
			_last = (ChocolateTree)input.LT(1);
			PROGRAM1=(ChocolateTree)match(input,PROGRAM,FOLLOW_PROGRAM_in_program119); 
			PROGRAM1_tree = (ChocolateTree)adaptor.dupNode(PROGRAM1);


			root_1 = (ChocolateTree)adaptor.becomeRoot(PROGRAM1_tree, root_1);

			match(input, Token.DOWN, null); 
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:34:19: ( ( declarations )* statements )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==ASSIGN||LA2_0==CONSTANT||LA2_0==IF||LA2_0==PRINT||LA2_0==READ||(LA2_0 >= VAR && LA2_0 <= WHILE)) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:34:20: ( declarations )* statements
					{
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:34:20: ( declarations )*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( (LA1_0==CONSTANT||LA1_0==VAR) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:34:20: declarations
							{
							_last = (ChocolateTree)input.LT(1);
							pushFollow(FOLLOW_declarations_in_program122);
							declarations2=declarations();
							state._fsp--;

							adaptor.addChild(root_1, declarations2.getTree());

							}
							break;

						default :
							break loop1;
						}
					}

					_last = (ChocolateTree)input.LT(1);
					pushFollow(FOLLOW_statements_in_program125);
					statements3=statements();
					state._fsp--;

					adaptor.addChild(root_1, statements3.getTree());

					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (ChocolateTree)adaptor.rulePostProcessing(root_0);


			  cf.closeScope();

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class declarations_return extends TreeRuleReturnScope {
		ChocolateTree tree;
		@Override
		public ChocolateTree getTree() { return tree; }
	};


	// $ANTLR start "declarations"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:37:1: declarations : ( ^(r= CONSTANT t= type id= IDENTIFIER ( COMMA !a= IDENTIFIER )* ASSIGN (t2= type_op ) ) | ^(r= VAR t= type id= IDENTIFIER ( COMMA !a= IDENTIFIER )* ( ASSIGN ( type_op ) )? ) );
	public final ChocolateChecker.declarations_return declarations() throws RecognitionException {
		ChocolateChecker.declarations_return retval = new ChocolateChecker.declarations_return();
		retval.start = input.LT(1);

		ChocolateTree root_0 = null;

		ChocolateTree _first_0 = null;
		ChocolateTree _last = null;


		ChocolateTree r=null;
		ChocolateTree id=null;
		ChocolateTree a=null;
		ChocolateTree COMMA4=null;
		ChocolateTree ASSIGN5=null;
		ChocolateTree COMMA6=null;
		ChocolateTree ASSIGN7=null;
		TreeRuleReturnScope t =null;
		TreeRuleReturnScope t2 =null;
		TreeRuleReturnScope type_op8 =null;

		ChocolateTree r_tree=null;
		ChocolateTree id_tree=null;
		ChocolateTree a_tree=null;
		ChocolateTree COMMA4_tree=null;
		ChocolateTree ASSIGN5_tree=null;
		ChocolateTree COMMA6_tree=null;
		ChocolateTree ASSIGN7_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:38:5: ( ^(r= CONSTANT t= type id= IDENTIFIER ( COMMA !a= IDENTIFIER )* ASSIGN (t2= type_op ) ) | ^(r= VAR t= type id= IDENTIFIER ( COMMA !a= IDENTIFIER )* ( ASSIGN ( type_op ) )? ) )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==CONSTANT) ) {
				alt6=1;
			}
			else if ( (LA6_0==VAR) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:38:9: ^(r= CONSTANT t= type id= IDENTIFIER ( COMMA !a= IDENTIFIER )* ASSIGN (t2= type_op ) )
					{
					root_0 = (ChocolateTree)adaptor.nil();


					_last = (ChocolateTree)input.LT(1);
					{
					ChocolateTree _save_last_1 = _last;
					ChocolateTree _first_1 = null;
					ChocolateTree root_1 = (ChocolateTree)adaptor.nil();
					_last = (ChocolateTree)input.LT(1);
					r=(ChocolateTree)match(input,CONSTANT,FOLLOW_CONSTANT_in_declarations154); 
					r_tree = (ChocolateTree)adaptor.dupNode(r);


					root_1 = (ChocolateTree)adaptor.becomeRoot(r_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (ChocolateTree)input.LT(1);
					pushFollow(FOLLOW_type_in_declarations158);
					t=type();
					state._fsp--;

					adaptor.addChild(root_1, t.getTree());

					_last = (ChocolateTree)input.LT(1);
					id=(ChocolateTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declarations162); 
					id_tree = (ChocolateTree)adaptor.dupNode(id);


					adaptor.addChild(root_1, id_tree);

					ca.checkVarDecl(r, t, id);
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:38:72: ( COMMA !a= IDENTIFIER )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0==COMMA) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:38:73: COMMA !a= IDENTIFIER
							{
							_last = (ChocolateTree)input.LT(1);
							COMMA4=(ChocolateTree)match(input,COMMA,FOLLOW_COMMA_in_declarations167); 

							_last = (ChocolateTree)input.LT(1);
							a=(ChocolateTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declarations172); 
							a_tree = (ChocolateTree)adaptor.dupNode(a);


							adaptor.addChild(root_1, a_tree);

							ca.checkVarDecl(r, t, a);
							}
							break;

						default :
							break loop3;
						}
					}

					_last = (ChocolateTree)input.LT(1);
					ASSIGN5=(ChocolateTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_declarations178); 
					ASSIGN5_tree = (ChocolateTree)adaptor.dupNode(ASSIGN5);


					adaptor.addChild(root_1, ASSIGN5_tree);

					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:38:130: (t2= type_op )
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:38:131: t2= type_op
					{
					_last = (ChocolateTree)input.LT(1);
					pushFollow(FOLLOW_type_op_in_declarations183);
					t2=type_op();
					state._fsp--;

					adaptor.addChild(root_1, t2.getTree());

					ca.checkDeclaration(r, t, t2);
					}

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:39:9: ^(r= VAR t= type id= IDENTIFIER ( COMMA !a= IDENTIFIER )* ( ASSIGN ( type_op ) )? )
					{
					root_0 = (ChocolateTree)adaptor.nil();


					_last = (ChocolateTree)input.LT(1);
					{
					ChocolateTree _save_last_1 = _last;
					ChocolateTree _first_1 = null;
					ChocolateTree root_1 = (ChocolateTree)adaptor.nil();
					_last = (ChocolateTree)input.LT(1);
					r=(ChocolateTree)match(input,VAR,FOLLOW_VAR_in_declarations199); 
					r_tree = (ChocolateTree)adaptor.dupNode(r);


					root_1 = (ChocolateTree)adaptor.becomeRoot(r_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (ChocolateTree)input.LT(1);
					pushFollow(FOLLOW_type_in_declarations203);
					t=type();
					state._fsp--;

					adaptor.addChild(root_1, t.getTree());

					_last = (ChocolateTree)input.LT(1);
					id=(ChocolateTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declarations207); 
					id_tree = (ChocolateTree)adaptor.dupNode(id);


					adaptor.addChild(root_1, id_tree);

					ca.checkConstDecl(r, t, id);
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:39:68: ( COMMA !a= IDENTIFIER )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==COMMA) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:39:69: COMMA !a= IDENTIFIER
							{
							_last = (ChocolateTree)input.LT(1);
							COMMA6=(ChocolateTree)match(input,COMMA,FOLLOW_COMMA_in_declarations211); 

							_last = (ChocolateTree)input.LT(1);
							a=(ChocolateTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declarations216); 
							a_tree = (ChocolateTree)adaptor.dupNode(a);


							adaptor.addChild(root_1, a_tree);

							ca.checkConstDecl(r, t, a);
							}
							break;

						default :
							break loop4;
						}
					}

					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:39:120: ( ASSIGN ( type_op ) )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==ASSIGN) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:39:121: ASSIGN ( type_op )
							{
							_last = (ChocolateTree)input.LT(1);
							ASSIGN7=(ChocolateTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_declarations222); 
							ASSIGN7_tree = (ChocolateTree)adaptor.dupNode(ASSIGN7);


							adaptor.addChild(root_1, ASSIGN7_tree);

							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:39:128: ( type_op )
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:39:129: type_op
							{
							_last = (ChocolateTree)input.LT(1);
							pushFollow(FOLLOW_type_op_in_declarations225);
							type_op8=type_op();
							state._fsp--;

							adaptor.addChild(root_1, type_op8.getTree());

							ca.checkDeclaration(r, t, t2);
							}

							}
							break;

					}

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;

			}
			retval.tree = (ChocolateTree)adaptor.rulePostProcessing(root_0);

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declarations"


	public static class statements_return extends TreeRuleReturnScope {
		ChocolateTree tree;
		@Override
		public ChocolateTree getTree() { return tree; }
	};


	// $ANTLR start "statements"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:42:1: statements : ( read | assign | print | ifthenelse | while );
	public final ChocolateChecker.statements_return statements() throws RecognitionException {
		ChocolateChecker.statements_return retval = new ChocolateChecker.statements_return();
		retval.start = input.LT(1);

		ChocolateTree root_0 = null;

		ChocolateTree _first_0 = null;
		ChocolateTree _last = null;


		TreeRuleReturnScope read9 =null;
		TreeRuleReturnScope assign10 =null;
		TreeRuleReturnScope print11 =null;
		TreeRuleReturnScope ifthenelse12 =null;
		TreeRuleReturnScope while13 =null;


		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:43:5: ( read | assign | print | ifthenelse | while )
			int alt7=5;
			switch ( input.LA(1) ) {
			case READ:
				{
				alt7=1;
				}
				break;
			case ASSIGN:
				{
				alt7=2;
				}
				break;
			case PRINT:
				{
				alt7=3;
				}
				break;
			case IF:
				{
				alt7=4;
				}
				break;
			case WHILE:
				{
				alt7=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:43:9: read
					{
					root_0 = (ChocolateTree)adaptor.nil();


					_last = (ChocolateTree)input.LT(1);
					pushFollow(FOLLOW_read_in_statements253);
					read9=read();
					state._fsp--;

					adaptor.addChild(root_0, read9.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:43:16: assign
					{
					root_0 = (ChocolateTree)adaptor.nil();


					_last = (ChocolateTree)input.LT(1);
					pushFollow(FOLLOW_assign_in_statements257);
					assign10=assign();
					state._fsp--;

					adaptor.addChild(root_0, assign10.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:43:25: print
					{
					root_0 = (ChocolateTree)adaptor.nil();


					_last = (ChocolateTree)input.LT(1);
					pushFollow(FOLLOW_print_in_statements261);
					print11=print();
					state._fsp--;

					adaptor.addChild(root_0, print11.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:43:33: ifthenelse
					{
					root_0 = (ChocolateTree)adaptor.nil();


					_last = (ChocolateTree)input.LT(1);
					pushFollow(FOLLOW_ifthenelse_in_statements265);
					ifthenelse12=ifthenelse();
					state._fsp--;

					adaptor.addChild(root_0, ifthenelse12.getTree());

					}
					break;
				case 5 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:43:46: while
					{
					root_0 = (ChocolateTree)adaptor.nil();


					_last = (ChocolateTree)input.LT(1);
					pushFollow(FOLLOW_while_in_statements269);
					while13=while();
					state._fsp--;

					adaptor.addChild(root_0, while13.getTree());

					}
					break;

			}
			retval.tree = (ChocolateTree)adaptor.rulePostProcessing(root_0);

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statements"


	public static class read_return extends TreeRuleReturnScope {
		ChocolateTree tree;
		@Override
		public ChocolateTree getTree() { return tree; }
	};


	// $ANTLR start "read"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:46:1: read : ^(r= READ (id= IDENTIFIER ) (id= IDENTIFIER )* ) ;
	public final ChocolateChecker.read_return read() throws RecognitionException {
		ChocolateChecker.read_return retval = new ChocolateChecker.read_return();
		retval.start = input.LT(1);

		ChocolateTree root_0 = null;

		ChocolateTree _first_0 = null;
		ChocolateTree _last = null;


		ChocolateTree r=null;
		ChocolateTree id=null;

		ChocolateTree r_tree=null;
		ChocolateTree id_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:47:5: ( ^(r= READ (id= IDENTIFIER ) (id= IDENTIFIER )* ) )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:47:9: ^(r= READ (id= IDENTIFIER ) (id= IDENTIFIER )* )
			{
			root_0 = (ChocolateTree)adaptor.nil();


			_last = (ChocolateTree)input.LT(1);
			{
			ChocolateTree _save_last_1 = _last;
			ChocolateTree _first_1 = null;
			ChocolateTree root_1 = (ChocolateTree)adaptor.nil();
			_last = (ChocolateTree)input.LT(1);
			r=(ChocolateTree)match(input,READ,FOLLOW_READ_in_read295); 
			r_tree = (ChocolateTree)adaptor.dupNode(r);


			root_1 = (ChocolateTree)adaptor.becomeRoot(r_tree, root_1);

			match(input, Token.DOWN, null); 
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:47:18: (id= IDENTIFIER )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:47:19: id= IDENTIFIER
			{
			_last = (ChocolateTree)input.LT(1);
			id=(ChocolateTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read300); 
			id_tree = (ChocolateTree)adaptor.dupNode(id);


			adaptor.addChild(root_1, id_tree);

			 ca.checkExprReadSingle(r,id); 
			}

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:47:67: (id= IDENTIFIER )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==IDENTIFIER) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:47:68: id= IDENTIFIER
					{
					_last = (ChocolateTree)input.LT(1);
					id=(ChocolateTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read307); 
					id_tree = (ChocolateTree)adaptor.dupNode(id);


					adaptor.addChild(root_1, id_tree);

					 ca.checkExprReadMultiple(); 
					}
					break;

				default :
					break loop8;
				}
			}

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (ChocolateTree)adaptor.rulePostProcessing(root_0);

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "read"


	public static class assign_return extends TreeRuleReturnScope {
		ChocolateTree tree;
		@Override
		public ChocolateTree getTree() { return tree; }
	};


	// $ANTLR start "assign"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:50:1: assign : ^(r= ASSIGN id= IDENTIFIER ae= assignexpr ) ;
	public final ChocolateChecker.assign_return assign() throws RecognitionException {
		ChocolateChecker.assign_return retval = new ChocolateChecker.assign_return();
		retval.start = input.LT(1);

		ChocolateTree root_0 = null;

		ChocolateTree _first_0 = null;
		ChocolateTree _last = null;


		ChocolateTree r=null;
		ChocolateTree id=null;
		TreeRuleReturnScope ae =null;

		ChocolateTree r_tree=null;
		ChocolateTree id_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:51:5: ( ^(r= ASSIGN id= IDENTIFIER ae= assignexpr ) )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:51:9: ^(r= ASSIGN id= IDENTIFIER ae= assignexpr )
			{
			root_0 = (ChocolateTree)adaptor.nil();


			_last = (ChocolateTree)input.LT(1);
			{
			ChocolateTree _save_last_1 = _last;
			ChocolateTree _first_1 = null;
			ChocolateTree root_1 = (ChocolateTree)adaptor.nil();
			_last = (ChocolateTree)input.LT(1);
			r=(ChocolateTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign333); 
			r_tree = (ChocolateTree)adaptor.dupNode(r);


			root_1 = (ChocolateTree)adaptor.becomeRoot(r_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (ChocolateTree)input.LT(1);
			id=(ChocolateTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assign337); 
			id_tree = (ChocolateTree)adaptor.dupNode(id);


			adaptor.addChild(root_1, id_tree);

			_last = (ChocolateTree)input.LT(1);
			pushFollow(FOLLOW_assignexpr_in_assign341);
			ae=assignexpr();
			state._fsp--;

			adaptor.addChild(root_1, ae.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			   ca.checkExprAssign(r, id, (ae!=null?((ChocolateTree)ae.getTree()):null)); 
			}

			retval.tree = (ChocolateTree)adaptor.rulePostProcessing(root_0);

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assign"


	public static class assignexpr_return extends TreeRuleReturnScope {
		ChocolateTree tree;
		@Override
		public ChocolateTree getTree() { return tree; }
	};


	// $ANTLR start "assignexpr"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:55:1: assignexpr : ( ^(r= ASSIGN id= IDENTIFIER ae= assignexpr ) | (se= single_expr ) | (cce= closed_compound_expr ) );
	public final ChocolateChecker.assignexpr_return assignexpr() throws RecognitionException {
		ChocolateChecker.assignexpr_return retval = new ChocolateChecker.assignexpr_return();
		retval.start = input.LT(1);

		ChocolateTree root_0 = null;

		ChocolateTree _first_0 = null;
		ChocolateTree _last = null;


		ChocolateTree r=null;
		ChocolateTree id=null;
		TreeRuleReturnScope ae =null;
		TreeRuleReturnScope se =null;
		TreeRuleReturnScope cce =null;

		ChocolateTree r_tree=null;
		ChocolateTree id_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:56:5: ( ^(r= ASSIGN id= IDENTIFIER ae= assignexpr ) | (se= single_expr ) | (cce= closed_compound_expr ) )
			int alt9=3;
			switch ( input.LA(1) ) {
			case ASSIGN:
				{
				alt9=1;
				}
				break;
			case AND:
			case BOOLEAN_OPERATOR:
			case CHAR_OPERATOR:
			case DIV:
			case EQ:
			case GREAT:
			case GREATEQ:
			case IDENTIFIER:
			case LESS:
			case LESSEQ:
			case LPAREN:
			case MIN:
			case MOD:
			case MULT:
			case NEG:
			case NOT:
			case NOTEQ:
			case NUMBER:
			case OR:
			case PLUS:
			case POS:
				{
				alt9=2;
				}
				break;
			case LCURLY:
				{
				alt9=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:56:9: ^(r= ASSIGN id= IDENTIFIER ae= assignexpr )
					{
					root_0 = (ChocolateTree)adaptor.nil();


					_last = (ChocolateTree)input.LT(1);
					{
					ChocolateTree _save_last_1 = _last;
					ChocolateTree _first_1 = null;
					ChocolateTree root_1 = (ChocolateTree)adaptor.nil();
					_last = (ChocolateTree)input.LT(1);
					r=(ChocolateTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignexpr378); 
					r_tree = (ChocolateTree)adaptor.dupNode(r);


					root_1 = (ChocolateTree)adaptor.becomeRoot(r_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (ChocolateTree)input.LT(1);
					id=(ChocolateTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assignexpr382); 
					id_tree = (ChocolateTree)adaptor.dupNode(id);


					adaptor.addChild(root_1, id_tree);

					_last = (ChocolateTree)input.LT(1);
					pushFollow(FOLLOW_assignexpr_in_assignexpr386);
					ae=assignexpr();
					state._fsp--;

					adaptor.addChild(root_1, ae.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					 ca.checkExprAssign(r, id, (ae!=null?((ChocolateTree)ae.getTree()):null)); 
					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:58:9: (se= single_expr )
					{
					root_0 = (ChocolateTree)adaptor.nil();


					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:58:9: (se= single_expr )
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:58:10: se= single_expr
					{
					_last = (ChocolateTree)input.LT(1);
					pushFollow(FOLLOW_single_expr_in_assignexpr411);
					se=single_expr();
					state._fsp--;

					adaptor.addChild(root_0, se.getTree());

					}

					 ca.checkExprSingle((se!=null?((ChocolateTree)se.getTree()):null)); 
					}
					break;
				case 3 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:60:9: (cce= closed_compound_expr )
					{
					root_0 = (ChocolateTree)adaptor.nil();


					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:60:9: (cce= closed_compound_expr )
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:60:10: cce= closed_compound_expr
					{
					_last = (ChocolateTree)input.LT(1);
					pushFollow(FOLLOW_closed_compound_expr_in_assignexpr435);
					cce=closed_compound_expr();
					state._fsp--;

					adaptor.addChild(root_0, cce.getTree());

					}

					 ca.checkExprCompound((cce!=null?((ChocolateTree)cce.getTree()):null));
					        
					}
					break;

			}
			retval.tree = (ChocolateTree)adaptor.rulePostProcessing(root_0);

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignexpr"


	public static class print_return extends TreeRuleReturnScope {
		ChocolateTree tree;
		@Override
		public ChocolateTree getTree() { return tree; }
	};


	// $ANTLR start "print"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:65:1: print : ^(r= PRINT (cce= closed_compound_expr |se= single_expr |s= string ) (cce= closed_compound_expr |se= single_expr |s= string ) ) ;
	public final ChocolateChecker.print_return print() throws RecognitionException {
		ChocolateChecker.print_return retval = new ChocolateChecker.print_return();
		retval.start = input.LT(1);

		ChocolateTree root_0 = null;

		ChocolateTree _first_0 = null;
		ChocolateTree _last = null;


		ChocolateTree r=null;
		TreeRuleReturnScope cce =null;
		TreeRuleReturnScope se =null;
		TreeRuleReturnScope s =null;

		ChocolateTree r_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:66:5: ( ^(r= PRINT (cce= closed_compound_expr |se= single_expr |s= string ) (cce= closed_compound_expr |se= single_expr |s= string ) ) )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:66:9: ^(r= PRINT (cce= closed_compound_expr |se= single_expr |s= string ) (cce= closed_compound_expr |se= single_expr |s= string ) )
			{
			root_0 = (ChocolateTree)adaptor.nil();


			_last = (ChocolateTree)input.LT(1);
			{
			ChocolateTree _save_last_1 = _last;
			ChocolateTree _first_1 = null;
			ChocolateTree root_1 = (ChocolateTree)adaptor.nil();
			_last = (ChocolateTree)input.LT(1);
			r=(ChocolateTree)match(input,PRINT,FOLLOW_PRINT_in_print469); 
			r_tree = (ChocolateTree)adaptor.dupNode(r);


			root_1 = (ChocolateTree)adaptor.becomeRoot(r_tree, root_1);

			match(input, Token.DOWN, null); 
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:66:19: (cce= closed_compound_expr |se= single_expr |s= string )
			int alt10=3;
			switch ( input.LA(1) ) {
			case LCURLY:
				{
				alt10=1;
				}
				break;
			case AND:
			case BOOLEAN_OPERATOR:
			case CHAR_OPERATOR:
			case DIV:
			case EQ:
			case GREAT:
			case GREATEQ:
			case IDENTIFIER:
			case LESS:
			case LESSEQ:
			case LPAREN:
			case MIN:
			case MOD:
			case MULT:
			case NEG:
			case NOT:
			case NOTEQ:
			case NUMBER:
			case OR:
			case PLUS:
			case POS:
				{
				alt10=2;
				}
				break;
			case DIGIT:
			case LETTER:
				{
				alt10=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:66:20: cce= closed_compound_expr
					{
					_last = (ChocolateTree)input.LT(1);
					pushFollow(FOLLOW_closed_compound_expr_in_print474);
					cce=closed_compound_expr();
					state._fsp--;

					adaptor.addChild(root_1, cce.getTree());

					ca.checkExprPrintSingle(r,(cce!=null?((ChocolateTree)cce.getTree()):null));
					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:67:20: se= single_expr
					{
					_last = (ChocolateTree)input.LT(1);
					pushFollow(FOLLOW_single_expr_in_print499);
					se=single_expr();
					state._fsp--;

					adaptor.addChild(root_1, se.getTree());

					ca.checkExprPrintSingle(r,(se!=null?((ChocolateTree)se.getTree()):null));
					}
					break;
				case 3 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:68:20: s= string
					{
					_last = (ChocolateTree)input.LT(1);
					pushFollow(FOLLOW_string_in_print534);
					s=string();
					state._fsp--;

					adaptor.addChild(root_1, s.getTree());

					ca.checkExprPrintSingle(r,(s!=null?((ChocolateTree)s.getTree()):null));
					}
					break;

			}

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:69:19: (cce= closed_compound_expr |se= single_expr |s= string )
			int alt11=3;
			switch ( input.LA(1) ) {
			case LCURLY:
				{
				alt11=1;
				}
				break;
			case AND:
			case BOOLEAN_OPERATOR:
			case CHAR_OPERATOR:
			case DIV:
			case EQ:
			case GREAT:
			case GREATEQ:
			case IDENTIFIER:
			case LESS:
			case LESSEQ:
			case LPAREN:
			case MIN:
			case MOD:
			case MULT:
			case NEG:
			case NOT:
			case NOTEQ:
			case NUMBER:
			case OR:
			case PLUS:
			case POS:
				{
				alt11=2;
				}
				break;
			case DIGIT:
			case LETTER:
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
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:69:20: cce= closed_compound_expr
					{
					_last = (ChocolateTree)input.LT(1);
					pushFollow(FOLLOW_closed_compound_expr_in_print576);
					cce=closed_compound_expr();
					state._fsp--;

					adaptor.addChild(root_1, cce.getTree());

					ca.checkExprPrintMultiple(r,(cce!=null?((ChocolateTree)cce.getTree()):null));
					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:70:20: se= single_expr
					{
					_last = (ChocolateTree)input.LT(1);
					pushFollow(FOLLOW_single_expr_in_print601);
					se=single_expr();
					state._fsp--;

					adaptor.addChild(root_1, se.getTree());

					ca.checkExprPrintMultiple(r,(se!=null?((ChocolateTree)se.getTree()):null));
					}
					break;
				case 3 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:71:20: s= string
					{
					_last = (ChocolateTree)input.LT(1);
					pushFollow(FOLLOW_string_in_print636);
					s=string();
					state._fsp--;

					adaptor.addChild(root_1, s.getTree());

					ca.checkExprPrintMultiple(r,(s!=null?((ChocolateTree)s.getTree()):null));
					}
					break;

			}

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (ChocolateTree)adaptor.rulePostProcessing(root_0);

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "print"


	public static class ifthenelse_return extends TreeRuleReturnScope {
		ChocolateTree tree;
		@Override
		public ChocolateTree getTree() { return tree; }
	};


	// $ANTLR start "ifthenelse"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:74:1: ifthenelse : ^(r= IF se= single_expr closed_compound_expr ( closed_compound_expr )? ) ;
	public final ChocolateChecker.ifthenelse_return ifthenelse() throws RecognitionException {
		ChocolateChecker.ifthenelse_return retval = new ChocolateChecker.ifthenelse_return();
		retval.start = input.LT(1);

		ChocolateTree root_0 = null;

		ChocolateTree _first_0 = null;
		ChocolateTree _last = null;


		ChocolateTree r=null;
		TreeRuleReturnScope se =null;
		TreeRuleReturnScope closed_compound_expr14 =null;
		TreeRuleReturnScope closed_compound_expr15 =null;

		ChocolateTree r_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:75:5: ( ^(r= IF se= single_expr closed_compound_expr ( closed_compound_expr )? ) )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:75:9: ^(r= IF se= single_expr closed_compound_expr ( closed_compound_expr )? )
			{
			root_0 = (ChocolateTree)adaptor.nil();


			_last = (ChocolateTree)input.LT(1);
			{
			ChocolateTree _save_last_1 = _last;
			ChocolateTree _first_1 = null;
			ChocolateTree root_1 = (ChocolateTree)adaptor.nil();
			_last = (ChocolateTree)input.LT(1);
			r=(ChocolateTree)match(input,IF,FOLLOW_IF_in_ifthenelse678); 
			r_tree = (ChocolateTree)adaptor.dupNode(r);


			root_1 = (ChocolateTree)adaptor.becomeRoot(r_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (ChocolateTree)input.LT(1);
			pushFollow(FOLLOW_single_expr_in_ifthenelse682);
			se=single_expr();
			state._fsp--;

			adaptor.addChild(root_1, se.getTree());

			ca.openScope(); 
			_last = (ChocolateTree)input.LT(1);
			pushFollow(FOLLOW_closed_compound_expr_in_ifthenelse686);
			closed_compound_expr14=closed_compound_expr();
			state._fsp--;

			adaptor.addChild(root_1, closed_compound_expr14.getTree());

			ca.closeScope();
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:75:90: ( closed_compound_expr )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==LCURLY) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:75:91: closed_compound_expr
					{
					ca.openScope(); 
					_last = (ChocolateTree)input.LT(1);
					pushFollow(FOLLOW_closed_compound_expr_in_ifthenelse693);
					closed_compound_expr15=closed_compound_expr();
					state._fsp--;

					adaptor.addChild(root_1, closed_compound_expr15.getTree());

					ca.closeScope();
					}
					break;

			}

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			 ca.checkIf(r, (se!=null?((ChocolateTree)se.getTree()):null)); 
			}

			retval.tree = (ChocolateTree)adaptor.rulePostProcessing(root_0);

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ifthenelse"


	public static class while_return extends TreeRuleReturnScope {
		ChocolateTree tree;
		@Override
		public ChocolateTree getTree() { return tree; }
	};


	// $ANTLR start "while"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:79:1: while : ^(r= WHILE se= single_expr closed_compound_expr ) ;
	public final ChocolateChecker.while_return while() throws RecognitionException {
		ChocolateChecker.while_return retval = new ChocolateChecker.while_return();
		retval.start = input.LT(1);

		ChocolateTree root_0 = null;

		ChocolateTree _first_0 = null;
		ChocolateTree _last = null;


		ChocolateTree r=null;
		TreeRuleReturnScope se =null;
		TreeRuleReturnScope closed_compound_expr16 =null;

		ChocolateTree r_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:80:5: ( ^(r= WHILE se= single_expr closed_compound_expr ) )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:80:9: ^(r= WHILE se= single_expr closed_compound_expr )
			{
			root_0 = (ChocolateTree)adaptor.nil();


			_last = (ChocolateTree)input.LT(1);
			{
			ChocolateTree _save_last_1 = _last;
			ChocolateTree _first_1 = null;
			ChocolateTree root_1 = (ChocolateTree)adaptor.nil();
			_last = (ChocolateTree)input.LT(1);
			r=(ChocolateTree)match(input,WHILE,FOLLOW_WHILE_in_while734); 
			r_tree = (ChocolateTree)adaptor.dupNode(r);


			root_1 = (ChocolateTree)adaptor.becomeRoot(r_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (ChocolateTree)input.LT(1);
			pushFollow(FOLLOW_single_expr_in_while738);
			se=single_expr();
			state._fsp--;

			adaptor.addChild(root_1, se.getTree());

			ca.openScope(); 
			_last = (ChocolateTree)input.LT(1);
			pushFollow(FOLLOW_closed_compound_expr_in_while742);
			closed_compound_expr16=closed_compound_expr();
			state._fsp--;

			adaptor.addChild(root_1, closed_compound_expr16.getTree());

			ca.closeScope();
			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			 ca.checkWhile(r, (se!=null?((ChocolateTree)se.getTree()):null));
			}

			retval.tree = (ChocolateTree)adaptor.rulePostProcessing(root_0);

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "while"


	public static class closed_compound_expr_return extends TreeRuleReturnScope {
		ChocolateTree tree;
		@Override
		public ChocolateTree getTree() { return tree; }
	};


	// $ANTLR start "closed_compound_expr"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:84:1: closed_compound_expr : ^(r= LCURLY ( declarations )* compound_ext ) ;
	public final ChocolateChecker.closed_compound_expr_return closed_compound_expr() throws RecognitionException {
		ChocolateChecker.closed_compound_expr_return retval = new ChocolateChecker.closed_compound_expr_return();
		retval.start = input.LT(1);

		ChocolateTree root_0 = null;

		ChocolateTree _first_0 = null;
		ChocolateTree _last = null;


		ChocolateTree r=null;
		TreeRuleReturnScope declarations17 =null;
		TreeRuleReturnScope compound_ext18 =null;

		ChocolateTree r_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:85:5: ( ^(r= LCURLY ( declarations )* compound_ext ) )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:85:9: ^(r= LCURLY ( declarations )* compound_ext )
			{
			root_0 = (ChocolateTree)adaptor.nil();


			_last = (ChocolateTree)input.LT(1);
			{
			ChocolateTree _save_last_1 = _last;
			ChocolateTree _first_1 = null;
			ChocolateTree root_1 = (ChocolateTree)adaptor.nil();
			_last = (ChocolateTree)input.LT(1);
			r=(ChocolateTree)match(input,LCURLY,FOLLOW_LCURLY_in_closed_compound_expr781); 
			r_tree = (ChocolateTree)adaptor.dupNode(r);


			root_1 = (ChocolateTree)adaptor.becomeRoot(r_tree, root_1);

			ca.openScope();
			match(input, Token.DOWN, null); 
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:85:37: ( declarations )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==CONSTANT||LA13_0==VAR) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:85:37: declarations
					{
					_last = (ChocolateTree)input.LT(1);
					pushFollow(FOLLOW_declarations_in_closed_compound_expr784);
					declarations17=declarations();
					state._fsp--;

					adaptor.addChild(root_1, declarations17.getTree());

					}
					break;

				default :
					break loop13;
				}
			}

			_last = (ChocolateTree)input.LT(1);
			pushFollow(FOLLOW_compound_ext_in_closed_compound_expr787);
			compound_ext18=compound_ext();
			state._fsp--;

			adaptor.addChild(root_1, compound_ext18.getTree());

			 ca.checkCompoundExpr(r, $ce.tree); 
			ca.closeScope();
			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (ChocolateTree)adaptor.rulePostProcessing(root_0);

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "closed_compound_expr"


	public static class compound_ext_return extends TreeRuleReturnScope {
		ChocolateTree tree;
		@Override
		public ChocolateTree getTree() { return tree; }
	};


	// $ANTLR start "compound_ext"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:88:1: compound_ext : ( ^(r= RCURLY se= single_expr ) | statements ( declarations )* compound_ext );
	public final ChocolateChecker.compound_ext_return compound_ext() throws RecognitionException {
		ChocolateChecker.compound_ext_return retval = new ChocolateChecker.compound_ext_return();
		retval.start = input.LT(1);

		ChocolateTree root_0 = null;

		ChocolateTree _first_0 = null;
		ChocolateTree _last = null;


		ChocolateTree r=null;
		TreeRuleReturnScope se =null;
		TreeRuleReturnScope statements19 =null;
		TreeRuleReturnScope declarations20 =null;
		TreeRuleReturnScope compound_ext21 =null;

		ChocolateTree r_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:89:5: ( ^(r= RCURLY se= single_expr ) | statements ( declarations )* compound_ext )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==RCURLY) ) {
				alt15=1;
			}
			else if ( (LA15_0==ASSIGN||LA15_0==IF||LA15_0==PRINT||LA15_0==READ||LA15_0==WHILE) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:89:9: ^(r= RCURLY se= single_expr )
					{
					root_0 = (ChocolateTree)adaptor.nil();


					_last = (ChocolateTree)input.LT(1);
					{
					ChocolateTree _save_last_1 = _last;
					ChocolateTree _first_1 = null;
					ChocolateTree root_1 = (ChocolateTree)adaptor.nil();
					_last = (ChocolateTree)input.LT(1);
					r=(ChocolateTree)match(input,RCURLY,FOLLOW_RCURLY_in_compound_ext813); 
					r_tree = (ChocolateTree)adaptor.dupNode(r);


					root_1 = (ChocolateTree)adaptor.becomeRoot(r_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (ChocolateTree)input.LT(1);
					pushFollow(FOLLOW_single_expr_in_compound_ext817);
					se=single_expr();
					state._fsp--;

					adaptor.addChild(root_1, se.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					 ca.checkCompoundExt(r,(se!=null?((ChocolateTree)se.getTree()):null));
					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:91:9: statements ( declarations )* compound_ext
					{
					root_0 = (ChocolateTree)adaptor.nil();


					_last = (ChocolateTree)input.LT(1);
					pushFollow(FOLLOW_statements_in_compound_ext838);
					statements19=statements();
					state._fsp--;

					adaptor.addChild(root_0, statements19.getTree());

					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:91:20: ( declarations )*
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==CONSTANT||LA14_0==VAR) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:91:20: declarations
							{
							_last = (ChocolateTree)input.LT(1);
							pushFollow(FOLLOW_declarations_in_compound_ext840);
							declarations20=declarations();
							state._fsp--;

							adaptor.addChild(root_0, declarations20.getTree());

							}
							break;

						default :
							break loop14;
						}
					}

					_last = (ChocolateTree)input.LT(1);
					pushFollow(FOLLOW_compound_ext_in_compound_ext843);
					compound_ext21=compound_ext();
					state._fsp--;

					adaptor.addChild(root_0, compound_ext21.getTree());

					}
					break;

			}
			retval.tree = (ChocolateTree)adaptor.rulePostProcessing(root_0);

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "compound_ext"


	public static class type_op_return extends TreeRuleReturnScope {
		ChocolateTree tree;
		@Override
		public ChocolateTree getTree() { return tree; }
	};


	// $ANTLR start "type_op"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:94:1: type_op : ( single_expr | closed_compound_expr );
	public final ChocolateChecker.type_op_return type_op() throws RecognitionException {
		ChocolateChecker.type_op_return retval = new ChocolateChecker.type_op_return();
		retval.start = input.LT(1);

		ChocolateTree root_0 = null;

		ChocolateTree _first_0 = null;
		ChocolateTree _last = null;


		TreeRuleReturnScope single_expr22 =null;
		TreeRuleReturnScope closed_compound_expr23 =null;


		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:95:5: ( single_expr | closed_compound_expr )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==AND||LA16_0==BOOLEAN_OPERATOR||LA16_0==CHAR_OPERATOR||LA16_0==DIV||(LA16_0 >= EQ && LA16_0 <= IDENTIFIER)||(LA16_0 >= LESS && LA16_0 <= LESSEQ)||(LA16_0 >= LPAREN && LA16_0 <= POS)) ) {
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
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:95:9: single_expr
					{
					root_0 = (ChocolateTree)adaptor.nil();


					_last = (ChocolateTree)input.LT(1);
					pushFollow(FOLLOW_single_expr_in_type_op862);
					single_expr22=single_expr();
					state._fsp--;

					adaptor.addChild(root_0, single_expr22.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:96:9: closed_compound_expr
					{
					root_0 = (ChocolateTree)adaptor.nil();


					_last = (ChocolateTree)input.LT(1);
					pushFollow(FOLLOW_closed_compound_expr_in_type_op872);
					closed_compound_expr23=closed_compound_expr();
					state._fsp--;

					adaptor.addChild(root_0, closed_compound_expr23.getTree());

					}
					break;

			}
			retval.tree = (ChocolateTree)adaptor.rulePostProcessing(root_0);

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type_op"


	public static class single_expr_return extends TreeRuleReturnScope {
		ChocolateTree tree;
		@Override
		public ChocolateTree getTree() { return tree; }
	};


	// $ANTLR start "single_expr"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:99:1: single_expr : arithmetic ;
	public final ChocolateChecker.single_expr_return single_expr() throws RecognitionException {
		ChocolateChecker.single_expr_return retval = new ChocolateChecker.single_expr_return();
		retval.start = input.LT(1);

		ChocolateTree root_0 = null;

		ChocolateTree _first_0 = null;
		ChocolateTree _last = null;


		TreeRuleReturnScope arithmetic24 =null;


		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:100:5: ( arithmetic )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:100:9: arithmetic
			{
			root_0 = (ChocolateTree)adaptor.nil();


			_last = (ChocolateTree)input.LT(1);
			pushFollow(FOLLOW_arithmetic_in_single_expr891);
			arithmetic24=arithmetic();
			state._fsp--;

			adaptor.addChild(root_0, arithmetic24.getTree());

			}

			retval.tree = (ChocolateTree)adaptor.rulePostProcessing(root_0);

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "single_expr"


	public static class arithmetic_return extends TreeRuleReturnScope {
		ChocolateTree tree;
		@Override
		public ChocolateTree getTree() { return tree; }
	};


	// $ANTLR start "arithmetic"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:103:1: arithmetic : ( ^(r= ( POS | NEG ) ar= arithmetic ) | ^(r= NOT ar= arithmetic ) | ^(r= ( MULT | DIV | MOD | PLUS | MIN ) ar1= arithmetic ar2= arithmetic ) | ^(r= ( LESS | GREAT | LESSEQ | GREATEQ ) ar1= arithmetic ar2= arithmetic ) | ^(r= ( EQ | NOTEQ ) ar1= arithmetic ar2= arithmetic ) | ^(r= ( AND | OR ) ar1= arithmetic ar2= arithmetic ) | operand );
	public final ChocolateChecker.arithmetic_return arithmetic() throws RecognitionException {
		ChocolateChecker.arithmetic_return retval = new ChocolateChecker.arithmetic_return();
		retval.start = input.LT(1);

		ChocolateTree root_0 = null;

		ChocolateTree _first_0 = null;
		ChocolateTree _last = null;


		ChocolateTree r=null;
		TreeRuleReturnScope ar =null;
		TreeRuleReturnScope ar1 =null;
		TreeRuleReturnScope ar2 =null;
		TreeRuleReturnScope operand25 =null;

		ChocolateTree r_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:104:5: ( ^(r= ( POS | NEG ) ar= arithmetic ) | ^(r= NOT ar= arithmetic ) | ^(r= ( MULT | DIV | MOD | PLUS | MIN ) ar1= arithmetic ar2= arithmetic ) | ^(r= ( LESS | GREAT | LESSEQ | GREATEQ ) ar1= arithmetic ar2= arithmetic ) | ^(r= ( EQ | NOTEQ ) ar1= arithmetic ar2= arithmetic ) | ^(r= ( AND | OR ) ar1= arithmetic ar2= arithmetic ) | operand )
			int alt17=7;
			switch ( input.LA(1) ) {
			case NEG:
			case POS:
				{
				alt17=1;
				}
				break;
			case NOT:
				{
				alt17=2;
				}
				break;
			case DIV:
			case MIN:
			case MOD:
			case MULT:
			case PLUS:
				{
				alt17=3;
				}
				break;
			case GREAT:
			case GREATEQ:
			case LESS:
			case LESSEQ:
				{
				alt17=4;
				}
				break;
			case EQ:
			case NOTEQ:
				{
				alt17=5;
				}
				break;
			case AND:
			case OR:
				{
				alt17=6;
				}
				break;
			case BOOLEAN_OPERATOR:
			case CHAR_OPERATOR:
			case IDENTIFIER:
			case LPAREN:
			case NUMBER:
				{
				alt17=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}
			switch (alt17) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:104:9: ^(r= ( POS | NEG ) ar= arithmetic )
					{
					root_0 = (ChocolateTree)adaptor.nil();


					_last = (ChocolateTree)input.LT(1);
					{
					ChocolateTree _save_last_1 = _last;
					ChocolateTree _first_1 = null;
					ChocolateTree root_1 = (ChocolateTree)adaptor.nil();
					r=(ChocolateTree)input.LT(1);
					if ( input.LA(1)==NEG||input.LA(1)==POS ) {
						input.consume();
						r_tree = (ChocolateTree)adaptor.dupNode(r);


						root_1 = (ChocolateTree)adaptor.becomeRoot(r_tree, root_1);

						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}

					match(input, Token.DOWN, null); 
					_last = (ChocolateTree)input.LT(1);
					pushFollow(FOLLOW_arithmetic_in_arithmetic927);
					ar=arithmetic();
					state._fsp--;

					adaptor.addChild(root_1, ar.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					 ca.checkExprNegate(r, (ar!=null?((ChocolateTree)ar.getTree()):null)); 
					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:106:9: ^(r= NOT ar= arithmetic )
					{
					root_0 = (ChocolateTree)adaptor.nil();


					_last = (ChocolateTree)input.LT(1);
					{
					ChocolateTree _save_last_1 = _last;
					ChocolateTree _first_1 = null;
					ChocolateTree root_1 = (ChocolateTree)adaptor.nil();
					_last = (ChocolateTree)input.LT(1);
					r=(ChocolateTree)match(input,NOT,FOLLOW_NOT_in_arithmetic951); 
					r_tree = (ChocolateTree)adaptor.dupNode(r);


					root_1 = (ChocolateTree)adaptor.becomeRoot(r_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (ChocolateTree)input.LT(1);
					pushFollow(FOLLOW_arithmetic_in_arithmetic955);
					ar=arithmetic();
					state._fsp--;

					adaptor.addChild(root_1, ar.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					 ca.checkExprNot(r, (ar!=null?((ChocolateTree)ar.getTree()):null)); 
					}
					break;
				case 3 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:108:9: ^(r= ( MULT | DIV | MOD | PLUS | MIN ) ar1= arithmetic ar2= arithmetic )
					{
					root_0 = (ChocolateTree)adaptor.nil();


					_last = (ChocolateTree)input.LT(1);
					{
					ChocolateTree _save_last_1 = _last;
					ChocolateTree _first_1 = null;
					ChocolateTree root_1 = (ChocolateTree)adaptor.nil();
					r=(ChocolateTree)input.LT(1);
					if ( input.LA(1)==DIV||(input.LA(1) >= MIN && input.LA(1) <= MULT)||input.LA(1)==PLUS ) {
						input.consume();
						r_tree = (ChocolateTree)adaptor.dupNode(r);


						root_1 = (ChocolateTree)adaptor.becomeRoot(r_tree, root_1);

						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}

					match(input, Token.DOWN, null); 
					_last = (ChocolateTree)input.LT(1);
					pushFollow(FOLLOW_arithmetic_in_arithmetic1001);
					ar1=arithmetic();
					state._fsp--;

					adaptor.addChild(root_1, ar1.getTree());

					_last = (ChocolateTree)input.LT(1);
					pushFollow(FOLLOW_arithmetic_in_arithmetic1005);
					ar2=arithmetic();
					state._fsp--;

					adaptor.addChild(root_1, ar2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					 ca.checkExprMath(r, (ar1!=null?((ChocolateTree)ar1.getTree()):null), (ar2!=null?((ChocolateTree)ar2.getTree()):null)); 
					}
					break;
				case 4 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:110:9: ^(r= ( LESS | GREAT | LESSEQ | GREATEQ ) ar1= arithmetic ar2= arithmetic )
					{
					root_0 = (ChocolateTree)adaptor.nil();


					_last = (ChocolateTree)input.LT(1);
					{
					ChocolateTree _save_last_1 = _last;
					ChocolateTree _first_1 = null;
					ChocolateTree root_1 = (ChocolateTree)adaptor.nil();
					r=(ChocolateTree)input.LT(1);
					if ( (input.LA(1) >= GREAT && input.LA(1) <= GREATEQ)||(input.LA(1) >= LESS && input.LA(1) <= LESSEQ) ) {
						input.consume();
						r_tree = (ChocolateTree)adaptor.dupNode(r);


						root_1 = (ChocolateTree)adaptor.becomeRoot(r_tree, root_1);

						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}

					match(input, Token.DOWN, null); 
					_last = (ChocolateTree)input.LT(1);
					pushFollow(FOLLOW_arithmetic_in_arithmetic1047);
					ar1=arithmetic();
					state._fsp--;

					adaptor.addChild(root_1, ar1.getTree());

					_last = (ChocolateTree)input.LT(1);
					pushFollow(FOLLOW_arithmetic_in_arithmetic1051);
					ar2=arithmetic();
					state._fsp--;

					adaptor.addChild(root_1, ar2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					 ca.checkExprCompNumber(r, (ar1!=null?((ChocolateTree)ar1.getTree()):null), (ar2!=null?((ChocolateTree)ar2.getTree()):null)); 
					}
					break;
				case 5 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:112:9: ^(r= ( EQ | NOTEQ ) ar1= arithmetic ar2= arithmetic )
					{
					root_0 = (ChocolateTree)adaptor.nil();


					_last = (ChocolateTree)input.LT(1);
					{
					ChocolateTree _save_last_1 = _last;
					ChocolateTree _first_1 = null;
					ChocolateTree root_1 = (ChocolateTree)adaptor.nil();
					r=(ChocolateTree)input.LT(1);
					if ( input.LA(1)==EQ||input.LA(1)==NOTEQ ) {
						input.consume();
						r_tree = (ChocolateTree)adaptor.dupNode(r);


						root_1 = (ChocolateTree)adaptor.becomeRoot(r_tree, root_1);

						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}

					match(input, Token.DOWN, null); 
					_last = (ChocolateTree)input.LT(1);
					pushFollow(FOLLOW_arithmetic_in_arithmetic1085);
					ar1=arithmetic();
					state._fsp--;

					adaptor.addChild(root_1, ar1.getTree());

					_last = (ChocolateTree)input.LT(1);
					pushFollow(FOLLOW_arithmetic_in_arithmetic1089);
					ar2=arithmetic();
					state._fsp--;

					adaptor.addChild(root_1, ar2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					 ca.checkExprCompThing(r, (ar1!=null?((ChocolateTree)ar1.getTree()):null), (ar2!=null?((ChocolateTree)ar2.getTree()):null)); 
					}
					break;
				case 6 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:114:9: ^(r= ( AND | OR ) ar1= arithmetic ar2= arithmetic )
					{
					root_0 = (ChocolateTree)adaptor.nil();


					_last = (ChocolateTree)input.LT(1);
					{
					ChocolateTree _save_last_1 = _last;
					ChocolateTree _first_1 = null;
					ChocolateTree root_1 = (ChocolateTree)adaptor.nil();
					r=(ChocolateTree)input.LT(1);
					if ( input.LA(1)==AND||input.LA(1)==OR ) {
						input.consume();
						r_tree = (ChocolateTree)adaptor.dupNode(r);


						root_1 = (ChocolateTree)adaptor.becomeRoot(r_tree, root_1);

						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}

					match(input, Token.DOWN, null); 
					_last = (ChocolateTree)input.LT(1);
					pushFollow(FOLLOW_arithmetic_in_arithmetic1123);
					ar1=arithmetic();
					state._fsp--;

					adaptor.addChild(root_1, ar1.getTree());

					_last = (ChocolateTree)input.LT(1);
					pushFollow(FOLLOW_arithmetic_in_arithmetic1127);
					ar2=arithmetic();
					state._fsp--;

					adaptor.addChild(root_1, ar2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					 ca.checkExprBin(r, (ar1!=null?((ChocolateTree)ar1.getTree()):null), (ar2!=null?((ChocolateTree)ar2.getTree()):null)); 
					}
					break;
				case 7 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:116:9: operand
					{
					root_0 = (ChocolateTree)adaptor.nil();


					_last = (ChocolateTree)input.LT(1);
					pushFollow(FOLLOW_operand_in_arithmetic1148);
					operand25=operand();
					state._fsp--;

					adaptor.addChild(root_0, operand25.getTree());

					}
					break;

			}
			retval.tree = (ChocolateTree)adaptor.rulePostProcessing(root_0);

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arithmetic"


	public static class operand_return extends TreeRuleReturnScope {
		ChocolateTree tree;
		@Override
		public ChocolateTree getTree() { return tree; }
	};


	// $ANTLR start "operand"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:120:1: operand : (id= IDENTIFIER |n= NUMBER | ^(r= LPAREN se= single_expr ) | (b= BOOLEAN_OPERATOR ) | (c= CHAR_OPERATOR ) );
	public final ChocolateChecker.operand_return operand() throws RecognitionException {
		ChocolateChecker.operand_return retval = new ChocolateChecker.operand_return();
		retval.start = input.LT(1);

		ChocolateTree root_0 = null;

		ChocolateTree _first_0 = null;
		ChocolateTree _last = null;


		ChocolateTree id=null;
		ChocolateTree n=null;
		ChocolateTree r=null;
		ChocolateTree b=null;
		ChocolateTree c=null;
		TreeRuleReturnScope se =null;

		ChocolateTree id_tree=null;
		ChocolateTree n_tree=null;
		ChocolateTree r_tree=null;
		ChocolateTree b_tree=null;
		ChocolateTree c_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:121:5: (id= IDENTIFIER |n= NUMBER | ^(r= LPAREN se= single_expr ) | (b= BOOLEAN_OPERATOR ) | (c= CHAR_OPERATOR ) )
			int alt18=5;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt18=1;
				}
				break;
			case NUMBER:
				{
				alt18=2;
				}
				break;
			case LPAREN:
				{
				alt18=3;
				}
				break;
			case BOOLEAN_OPERATOR:
				{
				alt18=4;
				}
				break;
			case CHAR_OPERATOR:
				{
				alt18=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:121:9: id= IDENTIFIER
					{
					root_0 = (ChocolateTree)adaptor.nil();


					_last = (ChocolateTree)input.LT(1);
					id=(ChocolateTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand1170); 
					id_tree = (ChocolateTree)adaptor.dupNode(id);


					adaptor.addChild(root_0, id_tree);

					 ca.checkOperandIdentifier(id); 
					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:123:9: n= NUMBER
					{
					root_0 = (ChocolateTree)adaptor.nil();


					_last = (ChocolateTree)input.LT(1);
					n=(ChocolateTree)match(input,NUMBER,FOLLOW_NUMBER_in_operand1201); 
					n_tree = (ChocolateTree)adaptor.dupNode(n);


					adaptor.addChild(root_0, n_tree);

					 ca.checkOperandNumber(n); 
					}
					break;
				case 3 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:125:9: ^(r= LPAREN se= single_expr )
					{
					root_0 = (ChocolateTree)adaptor.nil();


					_last = (ChocolateTree)input.LT(1);
					{
					ChocolateTree _save_last_1 = _last;
					ChocolateTree _first_1 = null;
					ChocolateTree root_1 = (ChocolateTree)adaptor.nil();
					_last = (ChocolateTree)input.LT(1);
					r=(ChocolateTree)match(input,LPAREN,FOLLOW_LPAREN_in_operand1224); 
					r_tree = (ChocolateTree)adaptor.dupNode(r);


					root_1 = (ChocolateTree)adaptor.becomeRoot(r_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (ChocolateTree)input.LT(1);
					pushFollow(FOLLOW_single_expr_in_operand1228);
					se=single_expr();
					state._fsp--;

					adaptor.addChild(root_1, se.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					 ca.checkOperandLparen(r, (se!=null?((ChocolateTree)se.getTree()):null)); 
					}
					break;
				case 4 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:127:9: (b= BOOLEAN_OPERATOR )
					{
					root_0 = (ChocolateTree)adaptor.nil();


					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:127:9: (b= BOOLEAN_OPERATOR )
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:127:10: b= BOOLEAN_OPERATOR
					{
					_last = (ChocolateTree)input.LT(1);
					b=(ChocolateTree)match(input,BOOLEAN_OPERATOR,FOLLOW_BOOLEAN_OPERATOR_in_operand1252); 
					b_tree = (ChocolateTree)adaptor.dupNode(b);


					adaptor.addChild(root_0, b_tree);

					}

					 ca.checkOperandBool(b); 
					}
					break;
				case 5 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:129:9: (c= CHAR_OPERATOR )
					{
					root_0 = (ChocolateTree)adaptor.nil();


					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:129:9: (c= CHAR_OPERATOR )
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:129:10: c= CHAR_OPERATOR
					{
					_last = (ChocolateTree)input.LT(1);
					c=(ChocolateTree)match(input,CHAR_OPERATOR,FOLLOW_CHAR_OPERATOR_in_operand1276); 
					c_tree = (ChocolateTree)adaptor.dupNode(c);


					adaptor.addChild(root_0, c_tree);

					}

					 ca.checkOperandChar(c); 
					}
					break;

			}
			retval.tree = (ChocolateTree)adaptor.rulePostProcessing(root_0);

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "operand"


	public static class type_return extends TreeRuleReturnScope {
		ChocolateTree tree;
		@Override
		public ChocolateTree getTree() { return tree; }
	};


	// $ANTLR start "type"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:133:1: type : ( INTEGER | CHAR | BOOLEAN );
	public final ChocolateChecker.type_return type() throws RecognitionException {
		ChocolateChecker.type_return retval = new ChocolateChecker.type_return();
		retval.start = input.LT(1);

		ChocolateTree root_0 = null;

		ChocolateTree _first_0 = null;
		ChocolateTree _last = null;


		ChocolateTree set26=null;

		ChocolateTree set26_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:134:5: ( INTEGER | CHAR | BOOLEAN )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:
			{
			root_0 = (ChocolateTree)adaptor.nil();


			_last = (ChocolateTree)input.LT(1);
			set26=(ChocolateTree)input.LT(1);
			if ( input.LA(1)==BOOLEAN||input.LA(1)==CHAR||input.LA(1)==INTEGER ) {
				input.consume();
				set26_tree = (ChocolateTree)adaptor.dupNode(set26);


				adaptor.addChild(root_0, set26_tree);

				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}

			 

			}

			retval.tree = (ChocolateTree)adaptor.rulePostProcessing(root_0);

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type"


	public static class string_return extends TreeRuleReturnScope {
		ChocolateTree tree;
		@Override
		public ChocolateTree getTree() { return tree; }
	};


	// $ANTLR start "string"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:137:1: string : graphic string ;
	public final ChocolateChecker.string_return string() throws RecognitionException {
		ChocolateChecker.string_return retval = new ChocolateChecker.string_return();
		retval.start = input.LT(1);

		ChocolateTree root_0 = null;

		ChocolateTree _first_0 = null;
		ChocolateTree _last = null;


		TreeRuleReturnScope graphic27 =null;
		TreeRuleReturnScope string28 =null;


		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:138:5: ( graphic string )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:138:9: graphic string
			{
			root_0 = (ChocolateTree)adaptor.nil();


			_last = (ChocolateTree)input.LT(1);
			pushFollow(FOLLOW_graphic_in_string1337);
			graphic27=graphic();
			state._fsp--;

			adaptor.addChild(root_0, graphic27.getTree());

			_last = (ChocolateTree)input.LT(1);
			pushFollow(FOLLOW_string_in_string1339);
			string28=string();
			state._fsp--;

			adaptor.addChild(root_0, string28.getTree());

			}

			retval.tree = (ChocolateTree)adaptor.rulePostProcessing(root_0);

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "string"


	public static class graphic_return extends TreeRuleReturnScope {
		ChocolateTree tree;
		@Override
		public ChocolateTree getTree() { return tree; }
	};


	// $ANTLR start "graphic"
	// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:141:1: graphic : ( LETTER | DIGIT );
	public final ChocolateChecker.graphic_return graphic() throws RecognitionException {
		ChocolateChecker.graphic_return retval = new ChocolateChecker.graphic_return();
		retval.start = input.LT(1);

		ChocolateTree root_0 = null;

		ChocolateTree _first_0 = null;
		ChocolateTree _last = null;


		ChocolateTree set29=null;

		ChocolateTree set29_tree=null;

		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:142:5: ( LETTER | DIGIT )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\ContextualAnalyzer\\ChocolateChecker.g:
			{
			root_0 = (ChocolateTree)adaptor.nil();


			_last = (ChocolateTree)input.LT(1);
			set29=(ChocolateTree)input.LT(1);
			if ( input.LA(1)==DIGIT||input.LA(1)==LETTER ) {
				input.consume();
				set29_tree = (ChocolateTree)adaptor.dupNode(set29);


				adaptor.addChild(root_0, set29_tree);

				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}

			 

			}

			retval.tree = (ChocolateTree)adaptor.rulePostProcessing(root_0);

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "graphic"

	// Delegated rules



	public static final BitSet FOLLOW_PROGRAM_in_program119 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_declarations_in_program122 = new BitSet(new long[]{0x000C220000802020L});
	public static final BitSet FOLLOW_statements_in_program125 = new BitSet(new long[]{0x000C220000802028L});
	public static final BitSet FOLLOW_CONSTANT_in_declarations154 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_declarations158 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declarations162 = new BitSet(new long[]{0x0000000000000820L});
	public static final BitSet FOLLOW_COMMA_in_declarations167 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declarations172 = new BitSet(new long[]{0x0000000000000820L});
	public static final BitSet FOLLOW_ASSIGN_in_declarations178 = new BitSet(new long[]{0x000001FFCE788290L});
	public static final BitSet FOLLOW_type_op_in_declarations183 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VAR_in_declarations199 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_declarations203 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declarations207 = new BitSet(new long[]{0x0000000000000828L});
	public static final BitSet FOLLOW_COMMA_in_declarations211 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declarations216 = new BitSet(new long[]{0x0000000000000828L});
	public static final BitSet FOLLOW_ASSIGN_in_declarations222 = new BitSet(new long[]{0x000001FFCE788290L});
	public static final BitSet FOLLOW_type_op_in_declarations225 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_read_in_statements253 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assign_in_statements257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_in_statements261 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifthenelse_in_statements265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_while_in_statements269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read295 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read300 = new BitSet(new long[]{0x0000000000400008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read307 = new BitSet(new long[]{0x0000000000400008L});
	public static final BitSet FOLLOW_ASSIGN_in_assign333 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_assign337 = new BitSet(new long[]{0x000001FFCE7882B0L});
	public static final BitSet FOLLOW_assignexpr_in_assign341 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSIGN_in_assignexpr378 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_assignexpr382 = new BitSet(new long[]{0x000001FFCE7882B0L});
	public static final BitSet FOLLOW_assignexpr_in_assignexpr386 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_single_expr_in_assignexpr411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_closed_compound_expr_in_assignexpr435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print469 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_closed_compound_expr_in_print474 = new BitSet(new long[]{0x000001FFDE78C290L});
	public static final BitSet FOLLOW_single_expr_in_print499 = new BitSet(new long[]{0x000001FFDE78C290L});
	public static final BitSet FOLLOW_string_in_print534 = new BitSet(new long[]{0x000001FFDE78C290L});
	public static final BitSet FOLLOW_closed_compound_expr_in_print576 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_single_expr_in_print601 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_string_in_print636 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_in_ifthenelse678 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_ifthenelse682 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_closed_compound_expr_in_ifthenelse686 = new BitSet(new long[]{0x0000000002000008L});
	public static final BitSet FOLLOW_closed_compound_expr_in_ifthenelse693 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_WHILE_in_while734 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_while738 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_closed_compound_expr_in_while742 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LCURLY_in_closed_compound_expr781 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_declarations_in_closed_compound_expr784 = new BitSet(new long[]{0x000C320000802020L});
	public static final BitSet FOLLOW_compound_ext_in_closed_compound_expr787 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_RCURLY_in_compound_ext813 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_compound_ext817 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_statements_in_compound_ext838 = new BitSet(new long[]{0x000C320000802020L});
	public static final BitSet FOLLOW_declarations_in_compound_ext840 = new BitSet(new long[]{0x000C320000802020L});
	public static final BitSet FOLLOW_compound_ext_in_compound_ext843 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_single_expr_in_type_op862 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_closed_compound_expr_in_type_op872 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_in_single_expr891 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_arithmetic917 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_arithmetic_in_arithmetic927 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NOT_in_arithmetic951 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_arithmetic_in_arithmetic955 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_set_in_arithmetic979 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_arithmetic_in_arithmetic1001 = new BitSet(new long[]{0x000001FFCC788290L});
	public static final BitSet FOLLOW_arithmetic_in_arithmetic1005 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_set_in_arithmetic1029 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_arithmetic_in_arithmetic1047 = new BitSet(new long[]{0x000001FFCC788290L});
	public static final BitSet FOLLOW_arithmetic_in_arithmetic1051 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_set_in_arithmetic1075 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_arithmetic_in_arithmetic1085 = new BitSet(new long[]{0x000001FFCC788290L});
	public static final BitSet FOLLOW_arithmetic_in_arithmetic1089 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_set_in_arithmetic1113 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_arithmetic_in_arithmetic1123 = new BitSet(new long[]{0x000001FFCC788290L});
	public static final BitSet FOLLOW_arithmetic_in_arithmetic1127 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_operand_in_arithmetic1148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand1170 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand1201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand1224 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_operand1228 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BOOLEAN_OPERATOR_in_operand1252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_OPERATOR_in_operand1276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_graphic_in_string1337 = new BitSet(new long[]{0x0000000010004000L});
	public static final BitSet FOLLOW_string_in_string1339 = new BitSet(new long[]{0x0000000000000002L});
}
