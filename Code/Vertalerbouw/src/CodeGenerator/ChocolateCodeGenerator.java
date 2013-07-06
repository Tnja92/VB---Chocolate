// $ANTLR 3.5 C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g 2013-07-07 00:09:48

package CodeGenerator;



import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
@SuppressWarnings("all")
public class ChocolateCodeGenerator extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ASSIGN", "BOOLEAN", "BOOLEAN_OPERATOR", 
		"CHAR", "CHAR_OPERATOR", "COLON", "COMMA", "COMMENT", "CONSTANT", "DIGIT", 
		"DIV", "DQUOTATION", "ELSE", "EQ", "GREAT", "GREATEQ", "IDENTIFIER", "IF", 
		"INTEGER", "LCURLY", "LESS", "LESSEQ", "LETTER", "LOWER", "LPAREN", "MIN", 
		"MOD", "MULT", "NEG", "NOT", "NOTEQ", "NUMBER", "OR", "PLUS", "POS", "PRINT", 
		"PROGRAM", "QUOTATION", "RCURLY", "READ", "RPAREN", "SEMICOLON", "STRING", 
		"THEN", "UPPER", "VAR", "WS"
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
	public static final int STRING=47;
	public static final int THEN=48;
	public static final int UPPER=49;
	public static final int VAR=50;
	public static final int WS=51;

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public ChocolateCodeGenerator(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public ChocolateCodeGenerator(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected StringTemplateGroup templateLib =
	  new StringTemplateGroup("ChocolateCodeGeneratorTemplates", AngleBracketTemplateLexer.class);

	public void setTemplateLib(StringTemplateGroup templateLib) {
	  this.templateLib = templateLib;
	}
	public StringTemplateGroup getTemplateLib() {
	  return templateLib;
	}
	/** allows convenient multi-value initialization:
	 *  "new STAttrMap().put(...).put(...)"
	 */
	@SuppressWarnings("serial")
	public static class STAttrMap extends HashMap<String, Object> {
		public STAttrMap put(String attrName, Object value) {
			super.put(attrName, value);
			return this;
		}
	}
	@Override public String[] getTokenNames() { return ChocolateCodeGenerator.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g"; }


	public static class program_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "program"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:15:1: program : ^( PROGRAM ( ( declaration )* statement )+ ) ;
	public final ChocolateCodeGenerator.program_return program() throws RecognitionException {
		ChocolateCodeGenerator.program_return retval = new ChocolateCodeGenerator.program_return();
		retval.start = input.LT(1);

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:16:5: ( ^( PROGRAM ( ( declaration )* statement )+ ) )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:16:9: ^( PROGRAM ( ( declaration )* statement )+ )
			{
			match(input,PROGRAM,FOLLOW_PROGRAM_in_program95); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:16:19: ( ( declaration )* statement )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==ASSIGN||LA2_0==CONSTANT||LA2_0==IF||LA2_0==PRINT||LA2_0==READ||LA2_0==VAR) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:16:20: ( declaration )* statement
					{
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:16:20: ( declaration )*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( (LA1_0==CONSTANT||LA1_0==VAR) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:16:20: declaration
							{
							pushFollow(FOLLOW_declaration_in_program98);
							declaration();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

						default :
							break loop1;
						}
					}

					pushFollow(FOLLOW_statement_in_program101);
					statement();
					state._fsp--;
					if (state.failed) return retval;
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

			match(input, Token.UP, null); if (state.failed) return retval;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class declaration_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "declaration"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:19:1: declaration : ( ^( CONSTANT constant_extension ) | ^( VAR var_extension ) );
	public final ChocolateCodeGenerator.declaration_return declaration() throws RecognitionException {
		ChocolateCodeGenerator.declaration_return retval = new ChocolateCodeGenerator.declaration_return();
		retval.start = input.LT(1);

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:20:5: ( ^( CONSTANT constant_extension ) | ^( VAR var_extension ) )
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
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:20:9: ^( CONSTANT constant_extension )
					{
					match(input,CONSTANT,FOLLOW_CONSTANT_in_declaration124); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_constant_extension_in_declaration126);
					constant_extension();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:21:9: ^( VAR var_extension )
					{
					match(input,VAR,FOLLOW_VAR_in_declaration138); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_var_extension_in_declaration140);
					var_extension();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declaration"


	public static class constant_extension_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "constant_extension"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:24:1: constant_extension : ( INTEGER ( IDENTIFIER )+ ASSIGN ( single_expr | closed_compound_expr ) | CHAR ( IDENTIFIER )+ ASSIGN CHAR_OPERATOR | BOOLEAN ( IDENTIFIER )+ ASSIGN BOOLEAN_OPERATOR );
	public final ChocolateCodeGenerator.constant_extension_return constant_extension() throws RecognitionException {
		ChocolateCodeGenerator.constant_extension_return retval = new ChocolateCodeGenerator.constant_extension_return();
		retval.start = input.LT(1);

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:25:5: ( INTEGER ( IDENTIFIER )+ ASSIGN ( single_expr | closed_compound_expr ) | CHAR ( IDENTIFIER )+ ASSIGN CHAR_OPERATOR | BOOLEAN ( IDENTIFIER )+ ASSIGN BOOLEAN_OPERATOR )
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
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:25:9: INTEGER ( IDENTIFIER )+ ASSIGN ( single_expr | closed_compound_expr )
					{
					match(input,INTEGER,FOLLOW_INTEGER_in_constant_extension168); if (state.failed) return retval;
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:25:17: ( IDENTIFIER )+
					int cnt4=0;
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==IDENTIFIER) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:25:17: IDENTIFIER
							{
							match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant_extension170); if (state.failed) return retval;
							}
							break;

						default :
							if ( cnt4 >= 1 ) break loop4;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(4, input);
							throw eee;
						}
						cnt4++;
					}

					match(input,ASSIGN,FOLLOW_ASSIGN_in_constant_extension173); if (state.failed) return retval;
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:25:36: ( single_expr | closed_compound_expr )
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==AND||LA5_0==BOOLEAN_OPERATOR||LA5_0==CHAR_OPERATOR||LA5_0==DIV||(LA5_0 >= EQ && LA5_0 <= IDENTIFIER)||(LA5_0 >= LESS && LA5_0 <= LESSEQ)||(LA5_0 >= LPAREN && LA5_0 <= POS)) ) {
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
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:25:37: single_expr
							{
							pushFollow(FOLLOW_single_expr_in_constant_extension176);
							single_expr();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;
						case 2 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:25:51: closed_compound_expr
							{
							pushFollow(FOLLOW_closed_compound_expr_in_constant_extension180);
							closed_compound_expr();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:26:9: CHAR ( IDENTIFIER )+ ASSIGN CHAR_OPERATOR
					{
					match(input,CHAR,FOLLOW_CHAR_in_constant_extension191); if (state.failed) return retval;
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:26:14: ( IDENTIFIER )+
					int cnt6=0;
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==IDENTIFIER) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:26:14: IDENTIFIER
							{
							match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant_extension193); if (state.failed) return retval;
							}
							break;

						default :
							if ( cnt6 >= 1 ) break loop6;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(6, input);
							throw eee;
						}
						cnt6++;
					}

					match(input,ASSIGN,FOLLOW_ASSIGN_in_constant_extension196); if (state.failed) return retval;
					match(input,CHAR_OPERATOR,FOLLOW_CHAR_OPERATOR_in_constant_extension198); if (state.failed) return retval;
					}
					break;
				case 3 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:27:9: BOOLEAN ( IDENTIFIER )+ ASSIGN BOOLEAN_OPERATOR
					{
					match(input,BOOLEAN,FOLLOW_BOOLEAN_in_constant_extension208); if (state.failed) return retval;
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:27:17: ( IDENTIFIER )+
					int cnt7=0;
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0==IDENTIFIER) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:27:17: IDENTIFIER
							{
							match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant_extension210); if (state.failed) return retval;
							}
							break;

						default :
							if ( cnt7 >= 1 ) break loop7;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(7, input);
							throw eee;
						}
						cnt7++;
					}

					match(input,ASSIGN,FOLLOW_ASSIGN_in_constant_extension213); if (state.failed) return retval;
					match(input,BOOLEAN_OPERATOR,FOLLOW_BOOLEAN_OPERATOR_in_constant_extension215); if (state.failed) return retval;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constant_extension"


	public static class var_extension_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "var_extension"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:30:1: var_extension : ( INTEGER ( IDENTIFIER )+ ( ASSIGN ( single_expr | closed_compound_expr ) )? | CHAR ( IDENTIFIER )+ ( ASSIGN CHAR_OPERATOR )? | BOOLEAN ( IDENTIFIER )+ ( ASSIGN BOOLEAN_OPERATOR )? );
	public final ChocolateCodeGenerator.var_extension_return var_extension() throws RecognitionException {
		ChocolateCodeGenerator.var_extension_return retval = new ChocolateCodeGenerator.var_extension_return();
		retval.start = input.LT(1);

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:31:5: ( INTEGER ( IDENTIFIER )+ ( ASSIGN ( single_expr | closed_compound_expr ) )? | CHAR ( IDENTIFIER )+ ( ASSIGN CHAR_OPERATOR )? | BOOLEAN ( IDENTIFIER )+ ( ASSIGN BOOLEAN_OPERATOR )? )
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
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:31:9: INTEGER ( IDENTIFIER )+ ( ASSIGN ( single_expr | closed_compound_expr ) )?
					{
					match(input,INTEGER,FOLLOW_INTEGER_in_var_extension238); if (state.failed) return retval;
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:31:17: ( IDENTIFIER )+
					int cnt9=0;
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==IDENTIFIER) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:31:17: IDENTIFIER
							{
							match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_var_extension240); if (state.failed) return retval;
							}
							break;

						default :
							if ( cnt9 >= 1 ) break loop9;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(9, input);
							throw eee;
						}
						cnt9++;
					}

					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:31:29: ( ASSIGN ( single_expr | closed_compound_expr ) )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==ASSIGN) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:31:30: ASSIGN ( single_expr | closed_compound_expr )
							{
							match(input,ASSIGN,FOLLOW_ASSIGN_in_var_extension244); if (state.failed) return retval;
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:31:37: ( single_expr | closed_compound_expr )
							int alt10=2;
							int LA10_0 = input.LA(1);
							if ( (LA10_0==AND||LA10_0==BOOLEAN_OPERATOR||LA10_0==CHAR_OPERATOR||LA10_0==DIV||(LA10_0 >= EQ && LA10_0 <= IDENTIFIER)||(LA10_0 >= LESS && LA10_0 <= LESSEQ)||(LA10_0 >= LPAREN && LA10_0 <= POS)) ) {
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
									// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:31:38: single_expr
									{
									pushFollow(FOLLOW_single_expr_in_var_extension247);
									single_expr();
									state._fsp--;
									if (state.failed) return retval;
									}
									break;
								case 2 :
									// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:31:52: closed_compound_expr
									{
									pushFollow(FOLLOW_closed_compound_expr_in_var_extension251);
									closed_compound_expr();
									state._fsp--;
									if (state.failed) return retval;
									}
									break;

							}

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:32:9: CHAR ( IDENTIFIER )+ ( ASSIGN CHAR_OPERATOR )?
					{
					match(input,CHAR,FOLLOW_CHAR_in_var_extension264); if (state.failed) return retval;
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:32:14: ( IDENTIFIER )+
					int cnt12=0;
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==IDENTIFIER) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:32:14: IDENTIFIER
							{
							match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_var_extension266); if (state.failed) return retval;
							}
							break;

						default :
							if ( cnt12 >= 1 ) break loop12;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(12, input);
							throw eee;
						}
						cnt12++;
					}

					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:32:26: ( ASSIGN CHAR_OPERATOR )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==ASSIGN) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:32:27: ASSIGN CHAR_OPERATOR
							{
							match(input,ASSIGN,FOLLOW_ASSIGN_in_var_extension270); if (state.failed) return retval;
							match(input,CHAR_OPERATOR,FOLLOW_CHAR_OPERATOR_in_var_extension272); if (state.failed) return retval;
							}
							break;

					}

					}
					break;
				case 3 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:33:9: BOOLEAN ( IDENTIFIER )+ ( ASSIGN BOOLEAN_OPERATOR )?
					{
					match(input,BOOLEAN,FOLLOW_BOOLEAN_in_var_extension284); if (state.failed) return retval;
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:33:17: ( IDENTIFIER )+
					int cnt14=0;
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==IDENTIFIER) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:33:17: IDENTIFIER
							{
							match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_var_extension286); if (state.failed) return retval;
							}
							break;

						default :
							if ( cnt14 >= 1 ) break loop14;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(14, input);
							throw eee;
						}
						cnt14++;
					}

					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:33:29: ( ASSIGN BOOLEAN_OPERATOR )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==ASSIGN) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:33:30: ASSIGN BOOLEAN_OPERATOR
							{
							match(input,ASSIGN,FOLLOW_ASSIGN_in_var_extension290); if (state.failed) return retval;
							match(input,BOOLEAN_OPERATOR,FOLLOW_BOOLEAN_OPERATOR_in_var_extension292); if (state.failed) return retval;
							}
							break;

					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "var_extension"


	public static class statement_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "statement"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:36:1: statement : ( read | print | assign | ifthenelse );
	public final ChocolateCodeGenerator.statement_return statement() throws RecognitionException {
		ChocolateCodeGenerator.statement_return retval = new ChocolateCodeGenerator.statement_return();
		retval.start = input.LT(1);

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:37:5: ( read | print | assign | ifthenelse )
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
			case ASSIGN:
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
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:37:9: read
					{
					pushFollow(FOLLOW_read_in_statement317);
					read();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:38:9: print
					{
					pushFollow(FOLLOW_print_in_statement328);
					print();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 3 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:39:9: assign
					{
					pushFollow(FOLLOW_assign_in_statement339);
					assign();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 4 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:40:9: ifthenelse
					{
					pushFollow(FOLLOW_ifthenelse_in_statement352);
					ifthenelse();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class read_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "read"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:43:1: read : ^( READ (id+= IDENTIFIER )+ ) ;
	public final ChocolateCodeGenerator.read_return read() throws RecognitionException {
		ChocolateCodeGenerator.read_return retval = new ChocolateCodeGenerator.read_return();
		retval.start = input.LT(1);

		CommonTree id=null;
		List<Object> list_id=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:44:5: ( ^( READ (id+= IDENTIFIER )+ ) )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:44:9: ^( READ (id+= IDENTIFIER )+ )
			{
			match(input,READ,FOLLOW_READ_in_read376); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:44:16: (id+= IDENTIFIER )+
			int cnt18=0;
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==IDENTIFIER) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:44:17: id+= IDENTIFIER
					{
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read381); if (state.failed) return retval;
					if (list_id==null) list_id=new ArrayList<Object>();
					list_id.add(id);
					}
					break;

				default :
					if ( cnt18 >= 1 ) break loop18;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(18, input);
					throw eee;
				}
				cnt18++;
			}

			match(input, Token.UP, null); if (state.failed) return retval;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "read"


	public static class print_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "print"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:47:1: print : ^( PRINT ( closed_compound_expr | IDENTIFIER | STRING )+ ) ;
	public final ChocolateCodeGenerator.print_return print() throws RecognitionException {
		ChocolateCodeGenerator.print_return retval = new ChocolateCodeGenerator.print_return();
		retval.start = input.LT(1);

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:48:5: ( ^( PRINT ( closed_compound_expr | IDENTIFIER | STRING )+ ) )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:48:9: ^( PRINT ( closed_compound_expr | IDENTIFIER | STRING )+ )
			{
			match(input,PRINT,FOLLOW_PRINT_in_print408); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:48:17: ( closed_compound_expr | IDENTIFIER | STRING )+
			int cnt19=0;
			loop19:
			while (true) {
				int alt19=4;
				switch ( input.LA(1) ) {
				case LCURLY:
					{
					alt19=1;
					}
					break;
				case IDENTIFIER:
					{
					alt19=2;
					}
					break;
				case STRING:
					{
					alt19=3;
					}
					break;
				}
				switch (alt19) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:48:18: closed_compound_expr
					{
					pushFollow(FOLLOW_closed_compound_expr_in_print411);
					closed_compound_expr();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:48:41: IDENTIFIER
					{
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_print415); if (state.failed) return retval;
					}
					break;
				case 3 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:48:54: STRING
					{
					match(input,STRING,FOLLOW_STRING_in_print419); if (state.failed) return retval;
					}
					break;

				default :
					if ( cnt19 >= 1 ) break loop19;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(19, input);
					throw eee;
				}
				cnt19++;
			}

			match(input, Token.UP, null); if (state.failed) return retval;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "print"


	public static class assign_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "assign"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:51:1: assign : ASSIGN IDENTIFIER ( assignexpr ) ;
	public final ChocolateCodeGenerator.assign_return assign() throws RecognitionException {
		ChocolateCodeGenerator.assign_return retval = new ChocolateCodeGenerator.assign_return();
		retval.start = input.LT(1);

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:52:5: ( ASSIGN IDENTIFIER ( assignexpr ) )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:52:9: ASSIGN IDENTIFIER ( assignexpr )
			{
			match(input,ASSIGN,FOLLOW_ASSIGN_in_assign449); if (state.failed) return retval;
			match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assign451); if (state.failed) return retval;
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:52:27: ( assignexpr )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:52:28: assignexpr
			{
			pushFollow(FOLLOW_assignexpr_in_assign454);
			assignexpr();
			state._fsp--;
			if (state.failed) return retval;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assign"


	public static class assignexpr_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "assignexpr"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:55:1: assignexpr : ( ( IDENTIFIER ASSIGN )=> ( ASSIGN IDENTIFIER assignexpr ) | single_expr | closed_compound_expr );
	public final ChocolateCodeGenerator.assignexpr_return assignexpr() throws RecognitionException {
		ChocolateCodeGenerator.assignexpr_return retval = new ChocolateCodeGenerator.assignexpr_return();
		retval.start = input.LT(1);

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:56:5: ( ( IDENTIFIER ASSIGN )=> ( ASSIGN IDENTIFIER assignexpr ) | single_expr | closed_compound_expr )
			int alt20=3;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==ASSIGN) && (synpred1_ChocolateCodeGenerator())) {
				alt20=1;
			}
			else if ( (LA20_0==AND||LA20_0==BOOLEAN_OPERATOR||LA20_0==CHAR_OPERATOR||LA20_0==DIV||(LA20_0 >= EQ && LA20_0 <= IDENTIFIER)||(LA20_0 >= LESS && LA20_0 <= LESSEQ)||(LA20_0 >= LPAREN && LA20_0 <= POS)) ) {
				alt20=2;
			}
			else if ( (LA20_0==LCURLY) ) {
				alt20=3;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}

			switch (alt20) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:56:9: ( IDENTIFIER ASSIGN )=> ( ASSIGN IDENTIFIER assignexpr )
					{
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:56:32: ( ASSIGN IDENTIFIER assignexpr )
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:56:33: ASSIGN IDENTIFIER assignexpr
					{
					match(input,ASSIGN,FOLLOW_ASSIGN_in_assignexpr487); if (state.failed) return retval;
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assignexpr489); if (state.failed) return retval;
					pushFollow(FOLLOW_assignexpr_in_assignexpr491);
					assignexpr();
					state._fsp--;
					if (state.failed) return retval;
					}

					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:57:9: single_expr
					{
					pushFollow(FOLLOW_single_expr_in_assignexpr502);
					single_expr();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 3 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:58:9: closed_compound_expr
					{
					pushFollow(FOLLOW_closed_compound_expr_in_assignexpr512);
					closed_compound_expr();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignexpr"


	public static class ifthenelse_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "ifthenelse"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:61:1: ifthenelse : IF single_expr closed_compound_expr closed_compound_expr ;
	public final ChocolateCodeGenerator.ifthenelse_return ifthenelse() throws RecognitionException {
		ChocolateCodeGenerator.ifthenelse_return retval = new ChocolateCodeGenerator.ifthenelse_return();
		retval.start = input.LT(1);

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:62:5: ( IF single_expr closed_compound_expr closed_compound_expr )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:62:9: IF single_expr closed_compound_expr closed_compound_expr
			{
			match(input,IF,FOLLOW_IF_in_ifthenelse535); if (state.failed) return retval;
			pushFollow(FOLLOW_single_expr_in_ifthenelse537);
			single_expr();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_closed_compound_expr_in_ifthenelse539);
			closed_compound_expr();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_closed_compound_expr_in_ifthenelse541);
			closed_compound_expr();
			state._fsp--;
			if (state.failed) return retval;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ifthenelse"


	public static class closed_compound_expr_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "closed_compound_expr"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:65:1: closed_compound_expr : ^( LCURLY ( declaration )* ( statement )+ ) ;
	public final ChocolateCodeGenerator.closed_compound_expr_return closed_compound_expr() throws RecognitionException {
		ChocolateCodeGenerator.closed_compound_expr_return retval = new ChocolateCodeGenerator.closed_compound_expr_return();
		retval.start = input.LT(1);

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:66:5: ( ^( LCURLY ( declaration )* ( statement )+ ) )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:66:9: ^( LCURLY ( declaration )* ( statement )+ )
			{
			match(input,LCURLY,FOLLOW_LCURLY_in_closed_compound_expr565); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:66:18: ( declaration )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==CONSTANT||LA21_0==VAR) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:66:18: declaration
					{
					pushFollow(FOLLOW_declaration_in_closed_compound_expr567);
					declaration();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					break loop21;
				}
			}

			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:66:31: ( statement )+
			int cnt22=0;
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==ASSIGN||LA22_0==IF||LA22_0==PRINT||LA22_0==READ) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:66:31: statement
					{
					pushFollow(FOLLOW_statement_in_closed_compound_expr570);
					statement();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					if ( cnt22 >= 1 ) break loop22;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(22, input);
					throw eee;
				}
				cnt22++;
			}

			match(input, Token.UP, null); if (state.failed) return retval;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "closed_compound_expr"


	public static class single_expr_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "single_expr"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:69:1: single_expr : ( operand | ^( OR x= single_expr y= single_expr ) -> or(ex1=$x.stex2=$y.st)| ^( AND x= single_expr y= single_expr ) -> and(ex1=$x.stex2=$y.st)| ^( LESS x= single_expr y= single_expr ) -> less(ex1=$x.stex2=$y.st)| ^( LESSEQ x= single_expr y= single_expr ) -> or(ex1=$x.stex2=$y.st)| ^( GREATEQ x= single_expr y= single_expr ) -> or(ex1=$x.stex2=$y.st)| ^( GREAT x= single_expr y= single_expr ) -> or(ex1=$x.stex2=$y.st)| ^( EQ x= single_expr y= single_expr ) -> or(ex1=$x.stex2=$y.st)| ^( NOTEQ x= single_expr y= single_expr ) -> or(ex1=$x.stex2=$y.st)| ^( PLUS x= single_expr y= single_expr ) -> or(ex1=$x.stex2=$y.st)| ^( MIN x= single_expr y= single_expr ) -> or(ex1=$x.stex2=$y.st)| ^( MULT x= single_expr y= single_expr ) -> or(ex1=$x.stex2=$y.st)| ^( DIV x= single_expr y= single_expr ) -> or(ex1=$x.stex2=$y.st)| ^( MOD x= single_expr y= single_expr ) -> or(ex1=$x.stex2=$y.st)| ^( POS x= single_expr ) -> or(ex1=$x.stex2=$y.st)| ^( NEG x= single_expr ) -> or(ex1=$x.stex2=$y.st)| ^( NOT x= single_expr ) -> or(ex1=$x.stex2=$y.st));
	public final ChocolateCodeGenerator.single_expr_return single_expr() throws RecognitionException {
		ChocolateCodeGenerator.single_expr_return retval = new ChocolateCodeGenerator.single_expr_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope x =null;
		TreeRuleReturnScope y =null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:70:5: ( operand | ^( OR x= single_expr y= single_expr ) -> or(ex1=$x.stex2=$y.st)| ^( AND x= single_expr y= single_expr ) -> and(ex1=$x.stex2=$y.st)| ^( LESS x= single_expr y= single_expr ) -> less(ex1=$x.stex2=$y.st)| ^( LESSEQ x= single_expr y= single_expr ) -> or(ex1=$x.stex2=$y.st)| ^( GREATEQ x= single_expr y= single_expr ) -> or(ex1=$x.stex2=$y.st)| ^( GREAT x= single_expr y= single_expr ) -> or(ex1=$x.stex2=$y.st)| ^( EQ x= single_expr y= single_expr ) -> or(ex1=$x.stex2=$y.st)| ^( NOTEQ x= single_expr y= single_expr ) -> or(ex1=$x.stex2=$y.st)| ^( PLUS x= single_expr y= single_expr ) -> or(ex1=$x.stex2=$y.st)| ^( MIN x= single_expr y= single_expr ) -> or(ex1=$x.stex2=$y.st)| ^( MULT x= single_expr y= single_expr ) -> or(ex1=$x.stex2=$y.st)| ^( DIV x= single_expr y= single_expr ) -> or(ex1=$x.stex2=$y.st)| ^( MOD x= single_expr y= single_expr ) -> or(ex1=$x.stex2=$y.st)| ^( POS x= single_expr ) -> or(ex1=$x.stex2=$y.st)| ^( NEG x= single_expr ) -> or(ex1=$x.stex2=$y.st)| ^( NOT x= single_expr ) -> or(ex1=$x.stex2=$y.st))
			int alt23=17;
			switch ( input.LA(1) ) {
			case BOOLEAN_OPERATOR:
			case CHAR_OPERATOR:
			case IDENTIFIER:
			case LPAREN:
			case NUMBER:
				{
				alt23=1;
				}
				break;
			case OR:
				{
				alt23=2;
				}
				break;
			case AND:
				{
				alt23=3;
				}
				break;
			case LESS:
				{
				alt23=4;
				}
				break;
			case LESSEQ:
				{
				alt23=5;
				}
				break;
			case GREATEQ:
				{
				alt23=6;
				}
				break;
			case GREAT:
				{
				alt23=7;
				}
				break;
			case EQ:
				{
				alt23=8;
				}
				break;
			case NOTEQ:
				{
				alt23=9;
				}
				break;
			case PLUS:
				{
				alt23=10;
				}
				break;
			case MIN:
				{
				alt23=11;
				}
				break;
			case MULT:
				{
				alt23=12;
				}
				break;
			case DIV:
				{
				alt23=13;
				}
				break;
			case MOD:
				{
				alt23=14;
				}
				break;
			case POS:
				{
				alt23=15;
				}
				break;
			case NEG:
				{
				alt23=16;
				}
				break;
			case NOT:
				{
				alt23=17;
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
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:70:9: operand
					{
					pushFollow(FOLLOW_operand_in_single_expr600);
					operand();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:71:9: ^( OR x= single_expr y= single_expr )
					{
					match(input,OR,FOLLOW_OR_in_single_expr644); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr648);
					x=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr652);
					y=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 71:49: -> or(ex1=$x.stex2=$y.st)
					  {
					  	retval.st = templateLib.getInstanceOf("or",new STAttrMap().put("ex1", (x!=null?((StringTemplate)x.getTemplate()):null)).put("ex2", (y!=null?((StringTemplate)y.getTemplate()):null)));
					  }


					}

					}
					break;
				case 3 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:72:9: ^( AND x= single_expr y= single_expr )
					{
					match(input,AND,FOLLOW_AND_in_single_expr683); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr687);
					x=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr691);
					y=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 72:49: -> and(ex1=$x.stex2=$y.st)
					  {
					  	retval.st = templateLib.getInstanceOf("and",new STAttrMap().put("ex1", (x!=null?((StringTemplate)x.getTemplate()):null)).put("ex2", (y!=null?((StringTemplate)y.getTemplate()):null)));
					  }


					}

					}
					break;
				case 4 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:73:9: ^( LESS x= single_expr y= single_expr )
					{
					match(input,LESS,FOLLOW_LESS_in_single_expr721); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr725);
					x=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr729);
					y=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 73:49: -> less(ex1=$x.stex2=$y.st)
					  {
					  	retval.st = templateLib.getInstanceOf("less",new STAttrMap().put("ex1", (x!=null?((StringTemplate)x.getTemplate()):null)).put("ex2", (y!=null?((StringTemplate)y.getTemplate()):null)));
					  }


					}

					}
					break;
				case 5 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:74:9: ^( LESSEQ x= single_expr y= single_expr )
					{
					match(input,LESSEQ,FOLLOW_LESSEQ_in_single_expr758); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr762);
					x=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr766);
					y=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 74:49: -> or(ex1=$x.stex2=$y.st)
					  {
					  	retval.st = templateLib.getInstanceOf("or",new STAttrMap().put("ex1", (x!=null?((StringTemplate)x.getTemplate()):null)).put("ex2", (y!=null?((StringTemplate)y.getTemplate()):null)));
					  }


					}

					}
					break;
				case 6 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:75:9: ^( GREATEQ x= single_expr y= single_expr )
					{
					match(input,GREATEQ,FOLLOW_GREATEQ_in_single_expr793); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr797);
					x=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr801);
					y=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 75:49: -> or(ex1=$x.stex2=$y.st)
					  {
					  	retval.st = templateLib.getInstanceOf("or",new STAttrMap().put("ex1", (x!=null?((StringTemplate)x.getTemplate()):null)).put("ex2", (y!=null?((StringTemplate)y.getTemplate()):null)));
					  }


					}

					}
					break;
				case 7 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:76:9: ^( GREAT x= single_expr y= single_expr )
					{
					match(input,GREAT,FOLLOW_GREAT_in_single_expr827); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr831);
					x=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr835);
					y=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 76:49: -> or(ex1=$x.stex2=$y.st)
					  {
					  	retval.st = templateLib.getInstanceOf("or",new STAttrMap().put("ex1", (x!=null?((StringTemplate)x.getTemplate()):null)).put("ex2", (y!=null?((StringTemplate)y.getTemplate()):null)));
					  }


					}

					}
					break;
				case 8 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:77:9: ^( EQ x= single_expr y= single_expr )
					{
					match(input,EQ,FOLLOW_EQ_in_single_expr863); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr867);
					x=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr871);
					y=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 77:49: -> or(ex1=$x.stex2=$y.st)
					  {
					  	retval.st = templateLib.getInstanceOf("or",new STAttrMap().put("ex1", (x!=null?((StringTemplate)x.getTemplate()):null)).put("ex2", (y!=null?((StringTemplate)y.getTemplate()):null)));
					  }


					}

					}
					break;
				case 9 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:78:9: ^( NOTEQ x= single_expr y= single_expr )
					{
					match(input,NOTEQ,FOLLOW_NOTEQ_in_single_expr902); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr906);
					x=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr910);
					y=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 78:49: -> or(ex1=$x.stex2=$y.st)
					  {
					  	retval.st = templateLib.getInstanceOf("or",new STAttrMap().put("ex1", (x!=null?((StringTemplate)x.getTemplate()):null)).put("ex2", (y!=null?((StringTemplate)y.getTemplate()):null)));
					  }


					}

					}
					break;
				case 10 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:79:9: ^( PLUS x= single_expr y= single_expr )
					{
					match(input,PLUS,FOLLOW_PLUS_in_single_expr938); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr942);
					x=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr946);
					y=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 79:49: -> or(ex1=$x.stex2=$y.st)
					  {
					  	retval.st = templateLib.getInstanceOf("or",new STAttrMap().put("ex1", (x!=null?((StringTemplate)x.getTemplate()):null)).put("ex2", (y!=null?((StringTemplate)y.getTemplate()):null)));
					  }


					}

					}
					break;
				case 11 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:80:9: ^( MIN x= single_expr y= single_expr )
					{
					match(input,MIN,FOLLOW_MIN_in_single_expr975); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr979);
					x=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr983);
					y=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 80:49: -> or(ex1=$x.stex2=$y.st)
					  {
					  	retval.st = templateLib.getInstanceOf("or",new STAttrMap().put("ex1", (x!=null?((StringTemplate)x.getTemplate()):null)).put("ex2", (y!=null?((StringTemplate)y.getTemplate()):null)));
					  }


					}

					}
					break;
				case 12 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:81:9: ^( MULT x= single_expr y= single_expr )
					{
					match(input,MULT,FOLLOW_MULT_in_single_expr1013); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1017);
					x=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1021);
					y=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 81:49: -> or(ex1=$x.stex2=$y.st)
					  {
					  	retval.st = templateLib.getInstanceOf("or",new STAttrMap().put("ex1", (x!=null?((StringTemplate)x.getTemplate()):null)).put("ex2", (y!=null?((StringTemplate)y.getTemplate()):null)));
					  }


					}

					}
					break;
				case 13 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:82:9: ^( DIV x= single_expr y= single_expr )
					{
					match(input,DIV,FOLLOW_DIV_in_single_expr1050); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1054);
					x=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1058);
					y=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 82:49: -> or(ex1=$x.stex2=$y.st)
					  {
					  	retval.st = templateLib.getInstanceOf("or",new STAttrMap().put("ex1", (x!=null?((StringTemplate)x.getTemplate()):null)).put("ex2", (y!=null?((StringTemplate)y.getTemplate()):null)));
					  }


					}

					}
					break;
				case 14 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:83:9: ^( MOD x= single_expr y= single_expr )
					{
					match(input,MOD,FOLLOW_MOD_in_single_expr1088); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1092);
					x=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1096);
					y=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 83:49: -> or(ex1=$x.stex2=$y.st)
					  {
					  	retval.st = templateLib.getInstanceOf("or",new STAttrMap().put("ex1", (x!=null?((StringTemplate)x.getTemplate()):null)).put("ex2", (y!=null?((StringTemplate)y.getTemplate()):null)));
					  }


					}

					}
					break;
				case 15 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:84:9: ^( POS x= single_expr )
					{
					match(input,POS,FOLLOW_POS_in_single_expr1126); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1130);
					x=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 84:49: -> or(ex1=$x.stex2=$y.st)
					  {
					  	retval.st = templateLib.getInstanceOf("or",new STAttrMap().put("ex1", (x!=null?((StringTemplate)x.getTemplate()):null)).put("ex2", (y!=null?((StringTemplate)y.getTemplate()):null)));
					  }


					}

					}
					break;
				case 16 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:85:9: ^( NEG x= single_expr )
					{
					match(input,NEG,FOLLOW_NEG_in_single_expr1174); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1178);
					x=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 85:49: -> or(ex1=$x.stex2=$y.st)
					  {
					  	retval.st = templateLib.getInstanceOf("or",new STAttrMap().put("ex1", (x!=null?((StringTemplate)x.getTemplate()):null)).put("ex2", (y!=null?((StringTemplate)y.getTemplate()):null)));
					  }


					}

					}
					break;
				case 17 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:86:9: ^( NOT x= single_expr )
					{
					match(input,NOT,FOLLOW_NOT_in_single_expr1222); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1226);
					x=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 86:49: -> or(ex1=$x.stex2=$y.st)
					  {
					  	retval.st = templateLib.getInstanceOf("or",new STAttrMap().put("ex1", (x!=null?((StringTemplate)x.getTemplate()):null)).put("ex2", (y!=null?((StringTemplate)y.getTemplate()):null)));
					  }


					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "single_expr"


	public static class operand_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "operand"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:89:1: operand : (id= IDENTIFIER |n= NUMBER -> number(n=$n.text)| ^( LPAREN single_expr ) |b= BOOLEAN_OPERATOR |c= CHAR_OPERATOR );
	public final ChocolateCodeGenerator.operand_return operand() throws RecognitionException {
		ChocolateCodeGenerator.operand_return retval = new ChocolateCodeGenerator.operand_return();
		retval.start = input.LT(1);

		CommonTree id=null;
		CommonTree n=null;
		CommonTree b=null;
		CommonTree c=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:90:5: (id= IDENTIFIER |n= NUMBER -> number(n=$n.text)| ^( LPAREN single_expr ) |b= BOOLEAN_OPERATOR |c= CHAR_OPERATOR )
			int alt24=5;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt24=1;
				}
				break;
			case NUMBER:
				{
				alt24=2;
				}
				break;
			case LPAREN:
				{
				alt24=3;
				}
				break;
			case BOOLEAN_OPERATOR:
				{
				alt24=4;
				}
				break;
			case CHAR_OPERATOR:
				{
				alt24=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}
			switch (alt24) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:90:9: id= IDENTIFIER
					{
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand1284); if (state.failed) return retval;
					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:91:9: n= NUMBER
					{
					n=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_operand1296); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 91:31: -> number(n=$n.text)
					  {
					  	retval.st = templateLib.getInstanceOf("number",new STAttrMap().put("n", (n!=null?n.getText():null)));
					  }


					}

					}
					break;
				case 3 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:92:9: ^( LPAREN single_expr )
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_operand1329); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_operand1331);
					single_expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					}
					break;
				case 4 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:93:9: b= BOOLEAN_OPERATOR
					{
					b=(CommonTree)match(input,BOOLEAN_OPERATOR,FOLLOW_BOOLEAN_OPERATOR_in_operand1344); if (state.failed) return retval;
					}
					break;
				case 5 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:94:9: c= CHAR_OPERATOR
					{
					c=(CommonTree)match(input,CHAR_OPERATOR,FOLLOW_CHAR_OPERATOR_in_operand1356); if (state.failed) return retval;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "operand"

	// $ANTLR start synpred1_ChocolateCodeGenerator
	public final void synpred1_ChocolateCodeGenerator_fragment() throws RecognitionException {
		// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:56:9: ( IDENTIFIER ASSIGN )
		// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:56:10: IDENTIFIER ASSIGN
		{
		match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred1_ChocolateCodeGenerator479); if (state.failed) return;
		match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred1_ChocolateCodeGenerator481); if (state.failed) return;
		}

	}
	// $ANTLR end synpred1_ChocolateCodeGenerator

	// Delegated rules

	public final boolean synpred1_ChocolateCodeGenerator() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_ChocolateCodeGenerator_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_PROGRAM_in_program95 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_declaration_in_program98 = new BitSet(new long[]{0x0004110000402020L});
	public static final BitSet FOLLOW_statement_in_program101 = new BitSet(new long[]{0x0004110000402028L});
	public static final BitSet FOLLOW_CONSTANT_in_declaration124 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_constant_extension_in_declaration126 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VAR_in_declaration138 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_var_extension_in_declaration140 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INTEGER_in_constant_extension168 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_constant_extension170 = new BitSet(new long[]{0x0000000000200020L});
	public static final BitSet FOLLOW_ASSIGN_in_constant_extension173 = new BitSet(new long[]{0x000000FFE73C8290L});
	public static final BitSet FOLLOW_single_expr_in_constant_extension176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_closed_compound_expr_in_constant_extension180 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_constant_extension191 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_constant_extension193 = new BitSet(new long[]{0x0000000000200020L});
	public static final BitSet FOLLOW_ASSIGN_in_constant_extension196 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CHAR_OPERATOR_in_constant_extension198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_constant_extension208 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_constant_extension210 = new BitSet(new long[]{0x0000000000200020L});
	public static final BitSet FOLLOW_ASSIGN_in_constant_extension213 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BOOLEAN_OPERATOR_in_constant_extension215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_var_extension238 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_var_extension240 = new BitSet(new long[]{0x0000000000200022L});
	public static final BitSet FOLLOW_ASSIGN_in_var_extension244 = new BitSet(new long[]{0x000000FFE73C8290L});
	public static final BitSet FOLLOW_single_expr_in_var_extension247 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_closed_compound_expr_in_var_extension251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_var_extension264 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_var_extension266 = new BitSet(new long[]{0x0000000000200022L});
	public static final BitSet FOLLOW_ASSIGN_in_var_extension270 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CHAR_OPERATOR_in_var_extension272 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_var_extension284 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_var_extension286 = new BitSet(new long[]{0x0000000000200022L});
	public static final BitSet FOLLOW_ASSIGN_in_var_extension290 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BOOLEAN_OPERATOR_in_var_extension292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_in_statement317 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_in_statement328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assign_in_statement339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifthenelse_in_statement352 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read376 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read381 = new BitSet(new long[]{0x0000000000200008L});
	public static final BitSet FOLLOW_PRINT_in_print408 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_closed_compound_expr_in_print411 = new BitSet(new long[]{0x0000800001200008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_print415 = new BitSet(new long[]{0x0000800001200008L});
	public static final BitSet FOLLOW_STRING_in_print419 = new BitSet(new long[]{0x0000800001200008L});
	public static final BitSet FOLLOW_ASSIGN_in_assign449 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_assign451 = new BitSet(new long[]{0x000000FFE73C82B0L});
	public static final BitSet FOLLOW_assignexpr_in_assign454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_in_assignexpr487 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_assignexpr489 = new BitSet(new long[]{0x000000FFE73C82B0L});
	public static final BitSet FOLLOW_assignexpr_in_assignexpr491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_single_expr_in_assignexpr502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_closed_compound_expr_in_assignexpr512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifthenelse535 = new BitSet(new long[]{0x000000FFE63C8290L});
	public static final BitSet FOLLOW_single_expr_in_ifthenelse537 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_closed_compound_expr_in_ifthenelse539 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_closed_compound_expr_in_ifthenelse541 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_closed_compound_expr565 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_declaration_in_closed_compound_expr567 = new BitSet(new long[]{0x0004110000402020L});
	public static final BitSet FOLLOW_statement_in_closed_compound_expr570 = new BitSet(new long[]{0x0000110000400028L});
	public static final BitSet FOLLOW_operand_in_single_expr600 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OR_in_single_expr644 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_single_expr648 = new BitSet(new long[]{0x000000FFE63C8290L});
	public static final BitSet FOLLOW_single_expr_in_single_expr652 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AND_in_single_expr683 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_single_expr687 = new BitSet(new long[]{0x000000FFE63C8290L});
	public static final BitSet FOLLOW_single_expr_in_single_expr691 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LESS_in_single_expr721 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_single_expr725 = new BitSet(new long[]{0x000000FFE63C8290L});
	public static final BitSet FOLLOW_single_expr_in_single_expr729 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LESSEQ_in_single_expr758 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_single_expr762 = new BitSet(new long[]{0x000000FFE63C8290L});
	public static final BitSet FOLLOW_single_expr_in_single_expr766 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GREATEQ_in_single_expr793 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_single_expr797 = new BitSet(new long[]{0x000000FFE63C8290L});
	public static final BitSet FOLLOW_single_expr_in_single_expr801 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GREAT_in_single_expr827 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_single_expr831 = new BitSet(new long[]{0x000000FFE63C8290L});
	public static final BitSet FOLLOW_single_expr_in_single_expr835 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQ_in_single_expr863 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_single_expr867 = new BitSet(new long[]{0x000000FFE63C8290L});
	public static final BitSet FOLLOW_single_expr_in_single_expr871 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NOTEQ_in_single_expr902 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_single_expr906 = new BitSet(new long[]{0x000000FFE63C8290L});
	public static final BitSet FOLLOW_single_expr_in_single_expr910 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_in_single_expr938 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_single_expr942 = new BitSet(new long[]{0x000000FFE63C8290L});
	public static final BitSet FOLLOW_single_expr_in_single_expr946 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MIN_in_single_expr975 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_single_expr979 = new BitSet(new long[]{0x000000FFE63C8290L});
	public static final BitSet FOLLOW_single_expr_in_single_expr983 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MULT_in_single_expr1013 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1017 = new BitSet(new long[]{0x000000FFE63C8290L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1021 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIV_in_single_expr1050 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1054 = new BitSet(new long[]{0x000000FFE63C8290L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1058 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MOD_in_single_expr1088 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1092 = new BitSet(new long[]{0x000000FFE63C8290L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1096 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_POS_in_single_expr1126 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1130 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEG_in_single_expr1174 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1178 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NOT_in_single_expr1222 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1226 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand1284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand1296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand1329 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_operand1331 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BOOLEAN_OPERATOR_in_operand1344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_OPERATOR_in_operand1356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_synpred1_ChocolateCodeGenerator479 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_synpred1_ChocolateCodeGenerator481 = new BitSet(new long[]{0x0000000000000002L});
}
