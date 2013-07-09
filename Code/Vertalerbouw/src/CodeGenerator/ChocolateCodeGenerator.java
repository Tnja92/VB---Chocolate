// $ANTLR 3.5 C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g 2013-07-09 17:06:03

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
		"DIV", "DO", "DQUOTATION", "ELSE", "EQ", "GREAT", "GREATEQ", "IDENTIFIER", 
		"IF", "INTEGER", "LCURLY", "LESS", "LESSEQ", "LETTER", "LOWER", "LPAREN", 
		"MIN", "MOD", "MULT", "NEG", "NOT", "NOTEQ", "NUMBER", "OR", "PLUS", "POS", 
		"PRINT", "PROGRAM", "QUOTATION", "RCURLY", "READ", "RPAREN", "SEMICOLON", 
		"THEN", "UPPER", "VAR", "WHILE", "WS", "STRING"
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
	public static final int STRING=53;

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


	    private int LbNr = 0;
	    private int LNr = 0;
	    private int store = 0;
	    private int temp[];
	    private int getLbNr() { LbNr++; return LbNr; }
	    private int getLNr() { LNr++; return (LNr-1); }


	public static class program_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "program"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:23:1: program : ^( PROGRAM (sections+= section )+ ) -> program(sourceF=Chocolate.getFilename()classN=Chocolate.getClassname()local=100stack=50sections=$sections);
	public final ChocolateCodeGenerator.program_return program() throws RecognitionException {
		ChocolateCodeGenerator.program_return retval = new ChocolateCodeGenerator.program_return();
		retval.start = input.LT(1);

		List<Object> list_sections=null;
		RuleReturnScope sections = null;
		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:24:5: ( ^( PROGRAM (sections+= section )+ ) -> program(sourceF=Chocolate.getFilename()classN=Chocolate.getClassname()local=100stack=50sections=$sections))
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:24:9: ^( PROGRAM (sections+= section )+ )
			{
			match(input,PROGRAM,FOLLOW_PROGRAM_in_program100); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:24:19: (sections+= section )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ASSIGN||LA1_0==CONSTANT||LA1_0==IF||LA1_0==PRINT||LA1_0==READ||(LA1_0 >= VAR && LA1_0 <= WHILE)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:24:20: sections+= section
					{
					pushFollow(FOLLOW_section_in_program105);
					sections=section();
					state._fsp--;
					if (state.failed) return retval;
					if (list_sections==null) list_sections=new ArrayList<Object>();
					list_sections.add(sections.getTemplate());
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 24:51: -> program(sourceF=Chocolate.getFilename()classN=Chocolate.getClassname()local=100stack=50sections=$sections)
			  {
			  	retval.st = templateLib.getInstanceOf("program",new STAttrMap().put("sourceF", Chocolate.getFilename()).put("classN", Chocolate.getClassname()).put("local", 100).put("stack", 50).put("sections", list_sections));
			  }


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
	// $ANTLR end "program"


	public static class section_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "section"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:27:1: section : ( (decls+= declaration )* state= statement ) -> section(decls=$declsstate=$state.st);
	public final ChocolateCodeGenerator.section_return section() throws RecognitionException {
		ChocolateCodeGenerator.section_return retval = new ChocolateCodeGenerator.section_return();
		retval.start = input.LT(1);

		List<Object> list_decls=null;
		TreeRuleReturnScope state =null;
		RuleReturnScope decls = null;
		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:28:5: ( ( (decls+= declaration )* state= statement ) -> section(decls=$declsstate=$state.st))
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:28:7: ( (decls+= declaration )* state= statement )
			{
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:28:7: ( (decls+= declaration )* state= statement )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:28:8: (decls+= declaration )* state= statement
			{
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:28:13: (decls+= declaration )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==CONSTANT||LA2_0==VAR) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:28:13: decls+= declaration
					{
					pushFollow(FOLLOW_declaration_in_section167);
					decls=declaration();
					state._fsp--;
					if (state.failed) return retval;
					if (list_decls==null) list_decls=new ArrayList<Object>();
					list_decls.add(decls.getTemplate());
					}
					break;

				default :
					break loop2;
				}
			}

			pushFollow(FOLLOW_statement_in_section172);
			state=statement();
			state._fsp--;
			if (state.failed) return retval;
			}

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 28:51: -> section(decls=$declsstate=$state.st)
			  {
			  	retval.st = templateLib.getInstanceOf("section",new STAttrMap().put("decls", list_decls).put("state", (state!=null?((StringTemplate)state.getTemplate()):null)));
			  }


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
	// $ANTLR end "section"


	public static class declaration_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "declaration"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:31:1: declaration : ( ^( CONSTANT t= type (ids+= IDENTIFIER )+ ASSIGN to= type_op ) -> constant(to=$to.textst=storelnr=getLNR();)| ^( VAR t= type (ids+= IDENTIFIER )+ ( ASSIGN to= type_op )? ) -> var(to=$to.textst=storelbl=getLbNr();lnr=getLNr();));
	public final ChocolateCodeGenerator.declaration_return declaration() throws RecognitionException {
		ChocolateCodeGenerator.declaration_return retval = new ChocolateCodeGenerator.declaration_return();
		retval.start = input.LT(1);

		CommonTree ids=null;
		List<Object> list_ids=null;
		TreeRuleReturnScope t =null;
		TreeRuleReturnScope to =null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:32:5: ( ^( CONSTANT t= type (ids+= IDENTIFIER )+ ASSIGN to= type_op ) -> constant(to=$to.textst=storelnr=getLNR();)| ^( VAR t= type (ids+= IDENTIFIER )+ ( ASSIGN to= type_op )? ) -> var(to=$to.textst=storelbl=getLbNr();lnr=getLNr();))
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
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:32:9: ^( CONSTANT t= type (ids+= IDENTIFIER )+ ASSIGN to= type_op )
					{
					match(input,CONSTANT,FOLLOW_CONSTANT_in_declaration216); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_type_in_declaration220);
					t=type();
					state._fsp--;
					if (state.failed) return retval;
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:32:30: (ids+= IDENTIFIER )+
					int cnt3=0;
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0==IDENTIFIER) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:32:30: ids+= IDENTIFIER
							{
							ids=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration224); if (state.failed) return retval;
							if (list_ids==null) list_ids=new ArrayList<Object>();
							list_ids.add(ids);
							}
							break;

						default :
							if ( cnt3 >= 1 ) break loop3;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(3, input);
							throw eee;
						}
						cnt3++;
					}

					match(input,ASSIGN,FOLLOW_ASSIGN_in_declaration228); if (state.failed) return retval;
					pushFollow(FOLLOW_type_op_in_declaration232);
					to=type_op();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					if ( state.backtracking==0 ) {store++; for(int i=0;i<ids.length();i++) ids[i].setAddress(store);}
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 33:13: -> constant(to=$to.textst=storelnr=getLNR();)
					  {
					  	retval.st = templateLib.getInstanceOf("constant",new STAttrMap().put("to", (to!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(to.start),input.getTreeAdaptor().getTokenStopIndex(to.start))):null)).put("st", store).put("lnr", getLNR();));
					  }


					}

					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:34:9: ^( VAR t= type (ids+= IDENTIFIER )+ ( ASSIGN to= type_op )? )
					{
					match(input,VAR,FOLLOW_VAR_in_declaration275); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_type_in_declaration279);
					t=type();
					state._fsp--;
					if (state.failed) return retval;
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:34:25: (ids+= IDENTIFIER )+
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
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:34:25: ids+= IDENTIFIER
							{
							ids=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration283); if (state.failed) return retval;
							if (list_ids==null) list_ids=new ArrayList<Object>();
							list_ids.add(ids);
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

					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:34:39: ( ASSIGN to= type_op )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==ASSIGN) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:34:40: ASSIGN to= type_op
							{
							match(input,ASSIGN,FOLLOW_ASSIGN_in_declaration287); if (state.failed) return retval;
							pushFollow(FOLLOW_type_op_in_declaration291);
							to=type_op();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

					}

					match(input, Token.UP, null); if (state.failed) return retval;

					if ( state.backtracking==0 ) {store++; for(int i=0;i<ids.length();i++) ids[i].setAddress(store);}
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 35:13: -> var(to=$to.textst=storelbl=getLbNr();lnr=getLNr();)
					  {
					  	retval.st = templateLib.getInstanceOf("var",new STAttrMap().put("to", (to!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(to.start),input.getTreeAdaptor().getTokenStopIndex(to.start))):null)).put("st", store).put("lbl", getLbNr();).put("lnr", getLNr();));
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
	// $ANTLR end "declaration"


	public static class type_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "type"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:38:1: type : (i= INTEGER |c= CHAR |b= BOOLEAN );
	public final ChocolateCodeGenerator.type_return type() throws RecognitionException {
		ChocolateCodeGenerator.type_return retval = new ChocolateCodeGenerator.type_return();
		retval.start = input.LT(1);

		CommonTree i=null;
		CommonTree c=null;
		CommonTree b=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:39:5: (i= INTEGER |c= CHAR |b= BOOLEAN )
			int alt7=3;
			switch ( input.LA(1) ) {
			case INTEGER:
				{
				alt7=1;
				}
				break;
			case CHAR:
				{
				alt7=2;
				}
				break;
			case BOOLEAN:
				{
				alt7=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:39:9: i= INTEGER
					{
					i=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_type355); if (state.failed) return retval;
					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:40:9: c= CHAR
					{
					c=(CommonTree)match(input,CHAR,FOLLOW_CHAR_in_type367); if (state.failed) return retval;
					}
					break;
				case 3 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:41:9: b= BOOLEAN
					{
					b=(CommonTree)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_type379); if (state.failed) return retval;
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
	// $ANTLR end "type"


	public static class type_op_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "type_op"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:44:1: type_op : (s= single_expr -> {$s.st}|c= closed_compound_expr -> {$c.st});
	public final ChocolateCodeGenerator.type_op_return type_op() throws RecognitionException {
		ChocolateCodeGenerator.type_op_return retval = new ChocolateCodeGenerator.type_op_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope s =null;
		TreeRuleReturnScope c =null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:45:5: (s= single_expr -> {$s.st}|c= closed_compound_expr -> {$c.st})
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==AND||LA8_0==BOOLEAN_OPERATOR||LA8_0==CHAR_OPERATOR||LA8_0==DIV||(LA8_0 >= EQ && LA8_0 <= IDENTIFIER)||(LA8_0 >= LESS && LA8_0 <= LESSEQ)||(LA8_0 >= LPAREN && LA8_0 <= POS)) ) {
				alt8=1;
			}
			else if ( (LA8_0==LCURLY) ) {
				alt8=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:45:9: s= single_expr
					{
					pushFollow(FOLLOW_single_expr_in_type_op404);
					s=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 45:37: -> {$s.st}
					  {
					  	retval.st = (s!=null?((StringTemplate)s.getTemplate()):null);
					  }


					}

					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:46:9: c= closed_compound_expr
					{
					pushFollow(FOLLOW_closed_compound_expr_in_type_op434);
					c=closed_compound_expr();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 46:37: -> {$c.st}
					  {
					  	retval.st = (c!=null?((StringTemplate)c.getTemplate()):null);
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
	// $ANTLR end "type_op"


	public static class statement_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "statement"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:66:1: statement : (r= read -> {$r.st}|p= print -> {$p.st}|a= assign -> {$a.st}|ite= ifthenelse -> {$ite.st}|wd= whiledo -> {$wd.st});
	public final ChocolateCodeGenerator.statement_return statement() throws RecognitionException {
		ChocolateCodeGenerator.statement_return retval = new ChocolateCodeGenerator.statement_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope r =null;
		TreeRuleReturnScope p =null;
		TreeRuleReturnScope a =null;
		TreeRuleReturnScope ite =null;
		TreeRuleReturnScope wd =null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:67:5: (r= read -> {$r.st}|p= print -> {$p.st}|a= assign -> {$a.st}|ite= ifthenelse -> {$ite.st}|wd= whiledo -> {$wd.st})
			int alt9=5;
			switch ( input.LA(1) ) {
			case READ:
				{
				alt9=1;
				}
				break;
			case PRINT:
				{
				alt9=2;
				}
				break;
			case ASSIGN:
				{
				alt9=3;
				}
				break;
			case IF:
				{
				alt9=4;
				}
				break;
			case WHILE:
				{
				alt9=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:67:9: r= read
					{
					pushFollow(FOLLOW_read_in_statement541);
					r=read();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 67:27: -> {$r.st}
					  {
					  	retval.st = (r!=null?((StringTemplate)r.getTemplate()):null);
					  }


					}

					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:68:9: p= print
					{
					pushFollow(FOLLOW_print_in_statement568);
					p=print();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 68:27: -> {$p.st}
					  {
					  	retval.st = (p!=null?((StringTemplate)p.getTemplate()):null);
					  }


					}

					}
					break;
				case 3 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:69:9: a= assign
					{
					pushFollow(FOLLOW_assign_in_statement594);
					a=assign();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 69:27: -> {$a.st}
					  {
					  	retval.st = (a!=null?((StringTemplate)a.getTemplate()):null);
					  }


					}

					}
					break;
				case 4 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:70:9: ite= ifthenelse
					{
					pushFollow(FOLLOW_ifthenelse_in_statement619);
					ite=ifthenelse();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 70:27: -> {$ite.st}
					  {
					  	retval.st = (ite!=null?((StringTemplate)ite.getTemplate()):null);
					  }


					}

					}
					break;
				case 5 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:71:9: wd= whiledo
					{
					pushFollow(FOLLOW_whiledo_in_statement638);
					wd=whiledo();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 71:27: -> {$wd.st}
					  {
					  	retval.st = (wd!=null?((StringTemplate)wd.getTemplate()):null);
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
	// $ANTLR end "statement"


	public static class read_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "read"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:74:1: read : ^( READ (ids+= read_one )+ ) -> read(ids=$idslnr=getLNr(););
	public final ChocolateCodeGenerator.read_return read() throws RecognitionException {
		ChocolateCodeGenerator.read_return retval = new ChocolateCodeGenerator.read_return();
		retval.start = input.LT(1);

		List<Object> list_ids=null;
		RuleReturnScope ids = null;
		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:75:5: ( ^( READ (ids+= read_one )+ ) -> read(ids=$idslnr=getLNr();))
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:75:9: ^( READ (ids+= read_one )+ )
			{
			match(input,READ,FOLLOW_READ_in_read673); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:75:16: (ids+= read_one )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==IDENTIFIER) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:75:17: ids+= read_one
					{
					pushFollow(FOLLOW_read_one_in_read678);
					ids=read_one();
					state._fsp--;
					if (state.failed) return retval;
					if (list_ids==null) list_ids=new ArrayList<Object>();
					list_ids.add(ids.getTemplate());
					}
					break;

				default :
					if ( cnt10 >= 1 ) break loop10;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
			}

			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 75:49: -> read(ids=$idslnr=getLNr();)
			  {
			  	retval.st = templateLib.getInstanceOf("read",new STAttrMap().put("ids", list_ids).put("lnr", getLNr();));
			  }


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
	// $ANTLR end "read"


	public static class read_one_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "read_one"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:78:1: read_one : id= IDENTIFIER -> reado(addr=addr);
	public final ChocolateCodeGenerator.read_one_return read_one() throws RecognitionException {
		ChocolateCodeGenerator.read_one_return retval = new ChocolateCodeGenerator.read_one_return();
		retval.start = input.LT(1);

		CommonTree id=null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:79:5: (id= IDENTIFIER -> reado(addr=addr))
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:79:9: id= IDENTIFIER
			{
			id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read_one734); if (state.failed) return retval;
			if ( state.backtracking==0 ) {addr=id.getAddress();}
			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 79:49: -> reado(addr=addr)
			  {
			  	retval.st = templateLib.getInstanceOf("reado",new STAttrMap().put("addr", addr));
			  }


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
	// $ANTLR end "read_one"


	public static class print_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "print"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:82:1: print : ^( PRINT (r+= print_one )+ ) -> print(r=$rlnr=getLNr(););
	public final ChocolateCodeGenerator.print_return print() throws RecognitionException {
		ChocolateCodeGenerator.print_return retval = new ChocolateCodeGenerator.print_return();
		retval.start = input.LT(1);

		List<Object> list_r=null;
		RuleReturnScope r = null;
		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:83:5: ( ^( PRINT (r+= print_one )+ ) -> print(r=$rlnr=getLNr();))
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:83:9: ^( PRINT (r+= print_one )+ )
			{
			match(input,PRINT,FOLLOW_PRINT_in_print771); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:83:17: (r+= print_one )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==IDENTIFIER||LA11_0==LCURLY||LA11_0==STRING) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:83:18: r+= print_one
					{
					pushFollow(FOLLOW_print_one_in_print776);
					r=print_one();
					state._fsp--;
					if (state.failed) return retval;
					if (list_r==null) list_r=new ArrayList<Object>();
					list_r.add(r.getTemplate());
					}
					break;

				default :
					if ( cnt11 >= 1 ) break loop11;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(11, input);
					throw eee;
				}
				cnt11++;
			}

			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 83:34: -> print(r=$rlnr=getLNr();)
			  {
			  	retval.st = templateLib.getInstanceOf("print",new STAttrMap().put("r", list_r).put("lnr", getLNr();));
			  }


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
	// $ANTLR end "print"


	public static class print_one_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "print_one"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:86:1: print_one : (r= closed_compound_expr -> printocce(cce=$r.st)|id= IDENTIFIER -> printo(addr=addr)|s= STRING -> printo(addr=addr));
	public final ChocolateCodeGenerator.print_one_return print_one() throws RecognitionException {
		ChocolateCodeGenerator.print_one_return retval = new ChocolateCodeGenerator.print_one_return();
		retval.start = input.LT(1);

		CommonTree id=null;
		CommonTree s=null;
		TreeRuleReturnScope r =null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:87:5: (r= closed_compound_expr -> printocce(cce=$r.st)|id= IDENTIFIER -> printo(addr=addr)|s= STRING -> printo(addr=addr))
			int alt12=3;
			switch ( input.LA(1) ) {
			case LCURLY:
				{
				alt12=1;
				}
				break;
			case IDENTIFIER:
				{
				alt12=2;
				}
				break;
			case STRING:
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
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:87:9: r= closed_compound_expr
					{
					pushFollow(FOLLOW_closed_compound_expr_in_print_one817);
					r=closed_compound_expr();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 87:48: -> printocce(cce=$r.st)
					  {
					  	retval.st = templateLib.getInstanceOf("printocce",new STAttrMap().put("cce", (r!=null?((StringTemplate)r.getTemplate()):null)));
					  }


					}

					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:88:9: id= IDENTIFIER
					{
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_print_one854); if (state.failed) return retval;
					if ( state.backtracking==0 ) {addr=id.getAddress();}
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 88:48: -> printo(addr=addr)
					  {
					  	retval.st = templateLib.getInstanceOf("printo",new STAttrMap().put("addr", addr));
					  }


					}

					}
					break;
				case 3 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:89:9: s= STRING
					{
					s=(CommonTree)match(input,STRING,FOLLOW_STRING_in_print_one878); if (state.failed) return retval;
					if ( state.backtracking==0 ) {addr=s.getAddress();}
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 89:48: -> printo(addr=addr)
					  {
					  	retval.st = templateLib.getInstanceOf("printo",new STAttrMap().put("addr", addr));
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
	// $ANTLR end "print_one"


	public static class assign_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "assign"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:92:1: assign : ^( ASSIGN id= IDENTIFIER (aexpr= assignexpr ) ) -> assign(id=$idassexpr=$aexpr.stlnr=getLNr(););
	public final ChocolateCodeGenerator.assign_return assign() throws RecognitionException {
		ChocolateCodeGenerator.assign_return retval = new ChocolateCodeGenerator.assign_return();
		retval.start = input.LT(1);

		CommonTree id=null;
		TreeRuleReturnScope aexpr =null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:93:5: ( ^( ASSIGN id= IDENTIFIER (aexpr= assignexpr ) ) -> assign(id=$idassexpr=$aexpr.stlnr=getLNr();))
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:93:9: ^( ASSIGN id= IDENTIFIER (aexpr= assignexpr ) )
			{
			match(input,ASSIGN,FOLLOW_ASSIGN_in_assign920); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assign924); if (state.failed) return retval;
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:93:32: (aexpr= assignexpr )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:93:33: aexpr= assignexpr
			{
			pushFollow(FOLLOW_assignexpr_in_assign929);
			aexpr=assignexpr();
			state._fsp--;
			if (state.failed) return retval;
			}

			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 93:55: -> assign(id=$idassexpr=$aexpr.stlnr=getLNr();)
			  {
			  	retval.st = templateLib.getInstanceOf("assign",new STAttrMap().put("id", id).put("assexpr", (aexpr!=null?((StringTemplate)aexpr.getTemplate()):null)).put("lnr", getLNr();));
			  }


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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:96:1: assignexpr : ( ( IDENTIFIER ASSIGN )=> ^( ASSIGN id= IDENTIFIER aexpr= assignexpr ) -> assign(id=$idaexpr=$aexpr.st)|s= single_expr -> {$s.st}|c= closed_compound_expr -> {$c.st});
	public final ChocolateCodeGenerator.assignexpr_return assignexpr() throws RecognitionException {
		ChocolateCodeGenerator.assignexpr_return retval = new ChocolateCodeGenerator.assignexpr_return();
		retval.start = input.LT(1);

		CommonTree id=null;
		TreeRuleReturnScope aexpr =null;
		TreeRuleReturnScope s =null;
		TreeRuleReturnScope c =null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:97:5: ( ( IDENTIFIER ASSIGN )=> ^( ASSIGN id= IDENTIFIER aexpr= assignexpr ) -> assign(id=$idaexpr=$aexpr.st)|s= single_expr -> {$s.st}|c= closed_compound_expr -> {$c.st})
			int alt13=3;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==ASSIGN) && (synpred1_ChocolateCodeGenerator())) {
				alt13=1;
			}
			else if ( (LA13_0==AND||LA13_0==BOOLEAN_OPERATOR||LA13_0==CHAR_OPERATOR||LA13_0==DIV||(LA13_0 >= EQ && LA13_0 <= IDENTIFIER)||(LA13_0 >= LESS && LA13_0 <= LESSEQ)||(LA13_0 >= LPAREN && LA13_0 <= POS)) ) {
				alt13=2;
			}
			else if ( (LA13_0==LCURLY) ) {
				alt13=3;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:97:9: ( IDENTIFIER ASSIGN )=> ^( ASSIGN id= IDENTIFIER aexpr= assignexpr )
					{
					match(input,ASSIGN,FOLLOW_ASSIGN_in_assignexpr983); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assignexpr987); if (state.failed) return retval;
					pushFollow(FOLLOW_assignexpr_in_assignexpr991);
					aexpr=assignexpr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 97:80: -> assign(id=$idaexpr=$aexpr.st)
					  {
					  	retval.st = templateLib.getInstanceOf("assign",new STAttrMap().put("id", id).put("aexpr", (aexpr!=null?((StringTemplate)aexpr.getTemplate()):null)));
					  }


					}

					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:98:9: s= single_expr
					{
					pushFollow(FOLLOW_single_expr_in_assignexpr1024);
					s=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 98:79: -> {$s.st}
					  {
					  	retval.st = (s!=null?((StringTemplate)s.getTemplate()):null);
					  }


					}

					}
					break;
				case 3 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:99:9: c= closed_compound_expr
					{
					pushFollow(FOLLOW_closed_compound_expr_in_assignexpr1096);
					c=closed_compound_expr();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 99:79: -> {$c.st}
					  {
					  	retval.st = (c!=null?((StringTemplate)c.getTemplate()):null);
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
	// $ANTLR end "assignexpr"


	public static class ifthenelse_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "ifthenelse"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:102:1: ifthenelse : ^( IF s= single_expr c1= closed_compound_expr c2= closed_compound_expr ) -> ifthenelse(s=$s.stc1=$c1.stc2=$c2.stlbl=getLbNr();lnr=getLNr(););
	public final ChocolateCodeGenerator.ifthenelse_return ifthenelse() throws RecognitionException {
		ChocolateCodeGenerator.ifthenelse_return retval = new ChocolateCodeGenerator.ifthenelse_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope s =null;
		TreeRuleReturnScope c1 =null;
		TreeRuleReturnScope c2 =null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:103:5: ( ^( IF s= single_expr c1= closed_compound_expr c2= closed_compound_expr ) -> ifthenelse(s=$s.stc1=$c1.stc2=$c2.stlbl=getLbNr();lnr=getLNr();))
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:103:9: ^( IF s= single_expr c1= closed_compound_expr c2= closed_compound_expr )
			{
			match(input,IF,FOLLOW_IF_in_ifthenelse1171); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_single_expr_in_ifthenelse1175);
			s=single_expr();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_closed_compound_expr_in_ifthenelse1179);
			c1=closed_compound_expr();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_closed_compound_expr_in_ifthenelse1183);
			c2=closed_compound_expr();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 103:79: -> ifthenelse(s=$s.stc1=$c1.stc2=$c2.stlbl=getLbNr();lnr=getLNr();)
			  {
			  	retval.st = templateLib.getInstanceOf("ifthenelse",new STAttrMap().put("s", (s!=null?((StringTemplate)s.getTemplate()):null)).put("c1", (c1!=null?((StringTemplate)c1.getTemplate()):null)).put("c2", (c2!=null?((StringTemplate)c2.getTemplate()):null)).put("lbl", getLbNr();).put("lnr", getLNr();));
			  }


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
	// $ANTLR end "ifthenelse"


	public static class whiledo_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "whiledo"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:106:1: whiledo : ^( WHILE s= single_expr c= closed_compound_expr ) -> whiledo(s=$s.stc=$c.stlbl=getLbNr();lnr=getLNr(););
	public final ChocolateCodeGenerator.whiledo_return whiledo() throws RecognitionException {
		ChocolateCodeGenerator.whiledo_return retval = new ChocolateCodeGenerator.whiledo_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope s =null;
		TreeRuleReturnScope c =null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:107:5: ( ^( WHILE s= single_expr c= closed_compound_expr ) -> whiledo(s=$s.stc=$c.stlbl=getLbNr();lnr=getLNr();))
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:107:9: ^( WHILE s= single_expr c= closed_compound_expr )
			{
			match(input,WHILE,FOLLOW_WHILE_in_whiledo1235); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_single_expr_in_whiledo1239);
			s=single_expr();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_closed_compound_expr_in_whiledo1243);
			c=closed_compound_expr();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 107:79: -> whiledo(s=$s.stc=$c.stlbl=getLbNr();lnr=getLNr();)
			  {
			  	retval.st = templateLib.getInstanceOf("whiledo",new STAttrMap().put("s", (s!=null?((StringTemplate)s.getTemplate()):null)).put("c", (c!=null?((StringTemplate)c.getTemplate()):null)).put("lbl", getLbNr();).put("lnr", getLNr();));
			  }


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
	// $ANTLR end "whiledo"


	public static class closed_compound_expr_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "closed_compound_expr"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:114:1: closed_compound_expr : ^( LCURLY (decls+= declaration )* cext= compound_ext ) -> compound(decls=$declscext=$cext.stlnr=getLNr(););
	public final ChocolateCodeGenerator.closed_compound_expr_return closed_compound_expr() throws RecognitionException {
		ChocolateCodeGenerator.closed_compound_expr_return retval = new ChocolateCodeGenerator.closed_compound_expr_return();
		retval.start = input.LT(1);

		List<Object> list_decls=null;
		TreeRuleReturnScope cext =null;
		RuleReturnScope decls = null;
		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:115:5: ( ^( LCURLY (decls+= declaration )* cext= compound_ext ) -> compound(decls=$declscext=$cext.stlnr=getLNr();))
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:115:9: ^( LCURLY (decls+= declaration )* cext= compound_ext )
			{
			match(input,LCURLY,FOLLOW_LCURLY_in_closed_compound_expr1325); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:115:23: (decls+= declaration )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==CONSTANT||LA14_0==VAR) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:115:23: decls+= declaration
					{
					pushFollow(FOLLOW_declaration_in_closed_compound_expr1329);
					decls=declaration();
					state._fsp--;
					if (state.failed) return retval;
					if (list_decls==null) list_decls=new ArrayList<Object>();
					list_decls.add(decls.getTemplate());
					}
					break;

				default :
					break loop14;
				}
			}

			pushFollow(FOLLOW_compound_ext_in_closed_compound_expr1334);
			cext=compound_ext();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 115:64: -> compound(decls=$declscext=$cext.stlnr=getLNr();)
			  {
			  	retval.st = templateLib.getInstanceOf("compound",new STAttrMap().put("decls", list_decls).put("cext", (cext!=null?((StringTemplate)cext.getTemplate()):null)).put("lnr", getLNr();));
			  }


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
	// $ANTLR end "closed_compound_expr"


	public static class compound_ext_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "compound_ext"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:118:1: compound_ext : ( ( single_expr RCURLY )=> (s= single_expr ) -> compoundend(s=$s.stlnr=getLNr();)|s= statement (decls+= declaration )* cext= compound_ext -> compoundex(s=$s.stdecls=$declscext=$cext.stlnr=getLNr();));
	public final ChocolateCodeGenerator.compound_ext_return compound_ext() throws RecognitionException {
		ChocolateCodeGenerator.compound_ext_return retval = new ChocolateCodeGenerator.compound_ext_return();
		retval.start = input.LT(1);

		List<Object> list_decls=null;
		TreeRuleReturnScope s =null;
		TreeRuleReturnScope cext =null;
		RuleReturnScope decls = null;
		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:119:5: ( ( single_expr RCURLY )=> (s= single_expr ) -> compoundend(s=$s.stlnr=getLNr();)|s= statement (decls+= declaration )* cext= compound_ext -> compoundex(s=$s.stdecls=$declscext=$cext.stlnr=getLNr();))
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==IDENTIFIER) && (synpred2_ChocolateCodeGenerator())) {
				alt16=1;
			}
			else if ( (LA16_0==NUMBER) && (synpred2_ChocolateCodeGenerator())) {
				alt16=1;
			}
			else if ( (LA16_0==LPAREN) && (synpred2_ChocolateCodeGenerator())) {
				alt16=1;
			}
			else if ( (LA16_0==BOOLEAN_OPERATOR) && (synpred2_ChocolateCodeGenerator())) {
				alt16=1;
			}
			else if ( (LA16_0==CHAR_OPERATOR) && (synpred2_ChocolateCodeGenerator())) {
				alt16=1;
			}
			else if ( (LA16_0==OR) && (synpred2_ChocolateCodeGenerator())) {
				alt16=1;
			}
			else if ( (LA16_0==AND) && (synpred2_ChocolateCodeGenerator())) {
				alt16=1;
			}
			else if ( (LA16_0==LESS) && (synpred2_ChocolateCodeGenerator())) {
				alt16=1;
			}
			else if ( (LA16_0==LESSEQ) && (synpred2_ChocolateCodeGenerator())) {
				alt16=1;
			}
			else if ( (LA16_0==GREATEQ) && (synpred2_ChocolateCodeGenerator())) {
				alt16=1;
			}
			else if ( (LA16_0==GREAT) && (synpred2_ChocolateCodeGenerator())) {
				alt16=1;
			}
			else if ( (LA16_0==EQ) && (synpred2_ChocolateCodeGenerator())) {
				alt16=1;
			}
			else if ( (LA16_0==NOTEQ) && (synpred2_ChocolateCodeGenerator())) {
				alt16=1;
			}
			else if ( (LA16_0==PLUS) && (synpred2_ChocolateCodeGenerator())) {
				alt16=1;
			}
			else if ( (LA16_0==MIN) && (synpred2_ChocolateCodeGenerator())) {
				alt16=1;
			}
			else if ( (LA16_0==MULT) && (synpred2_ChocolateCodeGenerator())) {
				alt16=1;
			}
			else if ( (LA16_0==DIV) && (synpred2_ChocolateCodeGenerator())) {
				alt16=1;
			}
			else if ( (LA16_0==MOD) && (synpred2_ChocolateCodeGenerator())) {
				alt16=1;
			}
			else if ( (LA16_0==POS) && (synpred2_ChocolateCodeGenerator())) {
				alt16=1;
			}
			else if ( (LA16_0==NEG) && (synpred2_ChocolateCodeGenerator())) {
				alt16=1;
			}
			else if ( (LA16_0==NOT) && (synpred2_ChocolateCodeGenerator())) {
				alt16=1;
			}
			else if ( (LA16_0==ASSIGN||LA16_0==IF||LA16_0==PRINT||LA16_0==READ||LA16_0==WHILE) ) {
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
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:119:9: ( single_expr RCURLY )=> (s= single_expr )
					{
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:119:33: (s= single_expr )
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:119:34: s= single_expr
					{
					pushFollow(FOLLOW_single_expr_in_compound_ext1393);
					s=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					}

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 119:64: -> compoundend(s=$s.stlnr=getLNr();)
					  {
					  	retval.st = templateLib.getInstanceOf("compoundend",new STAttrMap().put("s", (s!=null?((StringTemplate)s.getTemplate()):null)).put("lnr", getLNr();));
					  }


					}

					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:120:9: s= statement (decls+= declaration )* cext= compound_ext
					{
					pushFollow(FOLLOW_statement_in_compound_ext1434);
					s=statement();
					state._fsp--;
					if (state.failed) return retval;
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:120:26: (decls+= declaration )*
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( (LA15_0==CONSTANT||LA15_0==VAR) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:120:26: decls+= declaration
							{
							pushFollow(FOLLOW_declaration_in_compound_ext1438);
							decls=declaration();
							state._fsp--;
							if (state.failed) return retval;
							if (list_decls==null) list_decls=new ArrayList<Object>();
							list_decls.add(decls.getTemplate());
							}
							break;

						default :
							break loop15;
						}
					}

					pushFollow(FOLLOW_compound_ext_in_compound_ext1443);
					cext=compound_ext();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 120:64: -> compoundex(s=$s.stdecls=$declscext=$cext.stlnr=getLNr();)
					  {
					  	retval.st = templateLib.getInstanceOf("compoundex",new STAttrMap().put("s", (s!=null?((StringTemplate)s.getTemplate()):null)).put("decls", list_decls).put("cext", (cext!=null?((StringTemplate)cext.getTemplate()):null)).put("lnr", getLNr();));
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
	// $ANTLR end "compound_ext"


	public static class single_expr_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "single_expr"
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:123:1: single_expr : (o= operand -> {$o.st}| ^( OR x= single_expr y= single_expr ) -> or(ex1=$x.stex2=$y.st)| ^( AND x= single_expr y= single_expr ) -> and(ex1=$x.stex2=$y.st)| ^( LESS x= single_expr y= single_expr ) -> less(ex1=$x.stex2=$y.stlbl=getLbNr();)| ^( LESSEQ x= single_expr y= single_expr ) -> lesseq(ex1=$x.stex2=$y.stlbl=getLbNr();)| ^( GREATEQ x= single_expr y= single_expr ) -> greateq(ex1=$x.stex2=$y.stlbl=getLbNr();)| ^( GREAT x= single_expr y= single_expr ) -> great(ex1=$x.stex2=$y.stlbl=getLbNr();)| ^( EQ x= single_expr y= single_expr ) -> eq(ex1=$x.stex2=$y.stlbl=getLbNr();)| ^( NOTEQ x= single_expr y= single_expr ) -> noteq(ex1=$x.stex2=$y.stlbl=getLbNr();)| ^( PLUS x= single_expr y= single_expr ) -> plus(ex1=$x.stex2=$y.st)| ^( MIN x= single_expr y= single_expr ) -> min(ex1=$x.stex2=$y.st)| ^( MULT x= single_expr y= single_expr ) -> mult(ex1=$x.stex2=$y.st)| ^( DIV x= single_expr y= single_expr ) -> div(ex1=$x.stex2=$y.st)| ^( MOD x= single_expr y= single_expr ) -> mod(ex1=$x.stex2=$y.st)| ^( POS x= single_expr ) -> pos(ex1=$x.st)| ^( NEG x= single_expr ) -> neg(ex1=$x.st)| ^( NOT x= single_expr ) -> not(ex1=$x.st));
	public final ChocolateCodeGenerator.single_expr_return single_expr() throws RecognitionException {
		ChocolateCodeGenerator.single_expr_return retval = new ChocolateCodeGenerator.single_expr_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope o =null;
		TreeRuleReturnScope x =null;
		TreeRuleReturnScope y =null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:124:5: (o= operand -> {$o.st}| ^( OR x= single_expr y= single_expr ) -> or(ex1=$x.stex2=$y.st)| ^( AND x= single_expr y= single_expr ) -> and(ex1=$x.stex2=$y.st)| ^( LESS x= single_expr y= single_expr ) -> less(ex1=$x.stex2=$y.stlbl=getLbNr();)| ^( LESSEQ x= single_expr y= single_expr ) -> lesseq(ex1=$x.stex2=$y.stlbl=getLbNr();)| ^( GREATEQ x= single_expr y= single_expr ) -> greateq(ex1=$x.stex2=$y.stlbl=getLbNr();)| ^( GREAT x= single_expr y= single_expr ) -> great(ex1=$x.stex2=$y.stlbl=getLbNr();)| ^( EQ x= single_expr y= single_expr ) -> eq(ex1=$x.stex2=$y.stlbl=getLbNr();)| ^( NOTEQ x= single_expr y= single_expr ) -> noteq(ex1=$x.stex2=$y.stlbl=getLbNr();)| ^( PLUS x= single_expr y= single_expr ) -> plus(ex1=$x.stex2=$y.st)| ^( MIN x= single_expr y= single_expr ) -> min(ex1=$x.stex2=$y.st)| ^( MULT x= single_expr y= single_expr ) -> mult(ex1=$x.stex2=$y.st)| ^( DIV x= single_expr y= single_expr ) -> div(ex1=$x.stex2=$y.st)| ^( MOD x= single_expr y= single_expr ) -> mod(ex1=$x.stex2=$y.st)| ^( POS x= single_expr ) -> pos(ex1=$x.st)| ^( NEG x= single_expr ) -> neg(ex1=$x.st)| ^( NOT x= single_expr ) -> not(ex1=$x.st))
			int alt17=17;
			switch ( input.LA(1) ) {
			case BOOLEAN_OPERATOR:
			case CHAR_OPERATOR:
			case IDENTIFIER:
			case LPAREN:
			case NUMBER:
				{
				alt17=1;
				}
				break;
			case OR:
				{
				alt17=2;
				}
				break;
			case AND:
				{
				alt17=3;
				}
				break;
			case LESS:
				{
				alt17=4;
				}
				break;
			case LESSEQ:
				{
				alt17=5;
				}
				break;
			case GREATEQ:
				{
				alt17=6;
				}
				break;
			case GREAT:
				{
				alt17=7;
				}
				break;
			case EQ:
				{
				alt17=8;
				}
				break;
			case NOTEQ:
				{
				alt17=9;
				}
				break;
			case PLUS:
				{
				alt17=10;
				}
				break;
			case MIN:
				{
				alt17=11;
				}
				break;
			case MULT:
				{
				alt17=12;
				}
				break;
			case DIV:
				{
				alt17=13;
				}
				break;
			case MOD:
				{
				alt17=14;
				}
				break;
			case POS:
				{
				alt17=15;
				}
				break;
			case NEG:
				{
				alt17=16;
				}
				break;
			case NOT:
				{
				alt17=17;
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
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:124:9: o= operand
					{
					pushFollow(FOLLOW_operand_in_single_expr1494);
					o=operand();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 124:49: -> {$o.st}
					  {
					  	retval.st = (o!=null?((StringTemplate)o.getTemplate()):null);
					  }


					}

					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:125:9: ^( OR x= single_expr y= single_expr )
					{
					match(input,OR,FOLLOW_OR_in_single_expr1539); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1543);
					x=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1547);
					y=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 125:49: -> or(ex1=$x.stex2=$y.st)
					  {
					  	retval.st = templateLib.getInstanceOf("or",new STAttrMap().put("ex1", (x!=null?((StringTemplate)x.getTemplate()):null)).put("ex2", (y!=null?((StringTemplate)y.getTemplate()):null)));
					  }


					}

					}
					break;
				case 3 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:126:9: ^( AND x= single_expr y= single_expr )
					{
					match(input,AND,FOLLOW_AND_in_single_expr1578); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1582);
					x=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1586);
					y=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 126:49: -> and(ex1=$x.stex2=$y.st)
					  {
					  	retval.st = templateLib.getInstanceOf("and",new STAttrMap().put("ex1", (x!=null?((StringTemplate)x.getTemplate()):null)).put("ex2", (y!=null?((StringTemplate)y.getTemplate()):null)));
					  }


					}

					}
					break;
				case 4 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:127:9: ^( LESS x= single_expr y= single_expr )
					{
					match(input,LESS,FOLLOW_LESS_in_single_expr1616); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1620);
					x=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1624);
					y=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 127:49: -> less(ex1=$x.stex2=$y.stlbl=getLbNr();)
					  {
					  	retval.st = templateLib.getInstanceOf("less",new STAttrMap().put("ex1", (x!=null?((StringTemplate)x.getTemplate()):null)).put("ex2", (y!=null?((StringTemplate)y.getTemplate()):null)).put("lbl", getLbNr();));
					  }


					}

					}
					break;
				case 5 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:128:9: ^( LESSEQ x= single_expr y= single_expr )
					{
					match(input,LESSEQ,FOLLOW_LESSEQ_in_single_expr1657); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1661);
					x=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1665);
					y=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 128:49: -> lesseq(ex1=$x.stex2=$y.stlbl=getLbNr();)
					  {
					  	retval.st = templateLib.getInstanceOf("lesseq",new STAttrMap().put("ex1", (x!=null?((StringTemplate)x.getTemplate()):null)).put("ex2", (y!=null?((StringTemplate)y.getTemplate()):null)).put("lbl", getLbNr();));
					  }


					}

					}
					break;
				case 6 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:129:9: ^( GREATEQ x= single_expr y= single_expr )
					{
					match(input,GREATEQ,FOLLOW_GREATEQ_in_single_expr1696); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1700);
					x=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1704);
					y=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 129:49: -> greateq(ex1=$x.stex2=$y.stlbl=getLbNr();)
					  {
					  	retval.st = templateLib.getInstanceOf("greateq",new STAttrMap().put("ex1", (x!=null?((StringTemplate)x.getTemplate()):null)).put("ex2", (y!=null?((StringTemplate)y.getTemplate()):null)).put("lbl", getLbNr();));
					  }


					}

					}
					break;
				case 7 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:130:9: ^( GREAT x= single_expr y= single_expr )
					{
					match(input,GREAT,FOLLOW_GREAT_in_single_expr1734); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1738);
					x=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1742);
					y=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 130:49: -> great(ex1=$x.stex2=$y.stlbl=getLbNr();)
					  {
					  	retval.st = templateLib.getInstanceOf("great",new STAttrMap().put("ex1", (x!=null?((StringTemplate)x.getTemplate()):null)).put("ex2", (y!=null?((StringTemplate)y.getTemplate()):null)).put("lbl", getLbNr();));
					  }


					}

					}
					break;
				case 8 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:131:9: ^( EQ x= single_expr y= single_expr )
					{
					match(input,EQ,FOLLOW_EQ_in_single_expr1774); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1778);
					x=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1782);
					y=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 131:49: -> eq(ex1=$x.stex2=$y.stlbl=getLbNr();)
					  {
					  	retval.st = templateLib.getInstanceOf("eq",new STAttrMap().put("ex1", (x!=null?((StringTemplate)x.getTemplate()):null)).put("ex2", (y!=null?((StringTemplate)y.getTemplate()):null)).put("lbl", getLbNr();));
					  }


					}

					}
					break;
				case 9 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:132:9: ^( NOTEQ x= single_expr y= single_expr )
					{
					match(input,NOTEQ,FOLLOW_NOTEQ_in_single_expr1817); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1821);
					x=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1825);
					y=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 132:49: -> noteq(ex1=$x.stex2=$y.stlbl=getLbNr();)
					  {
					  	retval.st = templateLib.getInstanceOf("noteq",new STAttrMap().put("ex1", (x!=null?((StringTemplate)x.getTemplate()):null)).put("ex2", (y!=null?((StringTemplate)y.getTemplate()):null)).put("lbl", getLbNr();));
					  }


					}

					}
					break;
				case 10 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:133:9: ^( PLUS x= single_expr y= single_expr )
					{
					match(input,PLUS,FOLLOW_PLUS_in_single_expr1857); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1861);
					x=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1865);
					y=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 133:49: -> plus(ex1=$x.stex2=$y.st)
					  {
					  	retval.st = templateLib.getInstanceOf("plus",new STAttrMap().put("ex1", (x!=null?((StringTemplate)x.getTemplate()):null)).put("ex2", (y!=null?((StringTemplate)y.getTemplate()):null)));
					  }


					}

					}
					break;
				case 11 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:134:9: ^( MIN x= single_expr y= single_expr )
					{
					match(input,MIN,FOLLOW_MIN_in_single_expr1894); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1898);
					x=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1902);
					y=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 134:49: -> min(ex1=$x.stex2=$y.st)
					  {
					  	retval.st = templateLib.getInstanceOf("min",new STAttrMap().put("ex1", (x!=null?((StringTemplate)x.getTemplate()):null)).put("ex2", (y!=null?((StringTemplate)y.getTemplate()):null)));
					  }


					}

					}
					break;
				case 12 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:135:9: ^( MULT x= single_expr y= single_expr )
					{
					match(input,MULT,FOLLOW_MULT_in_single_expr1932); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1936);
					x=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1940);
					y=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 135:49: -> mult(ex1=$x.stex2=$y.st)
					  {
					  	retval.st = templateLib.getInstanceOf("mult",new STAttrMap().put("ex1", (x!=null?((StringTemplate)x.getTemplate()):null)).put("ex2", (y!=null?((StringTemplate)y.getTemplate()):null)));
					  }


					}

					}
					break;
				case 13 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:136:9: ^( DIV x= single_expr y= single_expr )
					{
					match(input,DIV,FOLLOW_DIV_in_single_expr1969); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1973);
					x=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr1977);
					y=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 136:49: -> div(ex1=$x.stex2=$y.st)
					  {
					  	retval.st = templateLib.getInstanceOf("div",new STAttrMap().put("ex1", (x!=null?((StringTemplate)x.getTemplate()):null)).put("ex2", (y!=null?((StringTemplate)y.getTemplate()):null)));
					  }


					}

					}
					break;
				case 14 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:137:9: ^( MOD x= single_expr y= single_expr )
					{
					match(input,MOD,FOLLOW_MOD_in_single_expr2007); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr2011);
					x=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr2015);
					y=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 137:49: -> mod(ex1=$x.stex2=$y.st)
					  {
					  	retval.st = templateLib.getInstanceOf("mod",new STAttrMap().put("ex1", (x!=null?((StringTemplate)x.getTemplate()):null)).put("ex2", (y!=null?((StringTemplate)y.getTemplate()):null)));
					  }


					}

					}
					break;
				case 15 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:138:9: ^( POS x= single_expr )
					{
					match(input,POS,FOLLOW_POS_in_single_expr2045); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr2049);
					x=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 138:49: -> pos(ex1=$x.st)
					  {
					  	retval.st = templateLib.getInstanceOf("pos",new STAttrMap().put("ex1", (x!=null?((StringTemplate)x.getTemplate()):null)));
					  }


					}

					}
					break;
				case 16 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:139:9: ^( NEG x= single_expr )
					{
					match(input,NEG,FOLLOW_NEG_in_single_expr2089); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr2093);
					x=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 139:49: -> neg(ex1=$x.st)
					  {
					  	retval.st = templateLib.getInstanceOf("neg",new STAttrMap().put("ex1", (x!=null?((StringTemplate)x.getTemplate()):null)));
					  }


					}

					}
					break;
				case 17 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:140:9: ^( NOT x= single_expr )
					{
					match(input,NOT,FOLLOW_NOT_in_single_expr2133); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_single_expr2137);
					x=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 140:49: -> not(ex1=$x.st)
					  {
					  	retval.st = templateLib.getInstanceOf("not",new STAttrMap().put("ex1", (x!=null?((StringTemplate)x.getTemplate()):null)));
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
	// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:143:1: operand : (id= IDENTIFIER -> identifier(id=$id.text)|n= NUMBER -> number(n=$n.text)| ^( LPAREN s= single_expr ) -> {$s.st}|b= BOOLEAN_OPERATOR -> boolean(b=$b.text)|c= CHAR_OPERATOR -> char(c=$c.text));
	public final ChocolateCodeGenerator.operand_return operand() throws RecognitionException {
		ChocolateCodeGenerator.operand_return retval = new ChocolateCodeGenerator.operand_return();
		retval.start = input.LT(1);

		CommonTree id=null;
		CommonTree n=null;
		CommonTree b=null;
		CommonTree c=null;
		TreeRuleReturnScope s =null;

		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:144:5: (id= IDENTIFIER -> identifier(id=$id.text)|n= NUMBER -> number(n=$n.text)| ^( LPAREN s= single_expr ) -> {$s.st}|b= BOOLEAN_OPERATOR -> boolean(b=$b.text)|c= CHAR_OPERATOR -> char(c=$c.text))
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
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:144:9: id= IDENTIFIER
					{
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand2191); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 144:33: -> identifier(id=$id.text)
					  {
					  	retval.st = templateLib.getInstanceOf("identifier",new STAttrMap().put("id", (id!=null?id.getText():null)));
					  }


					}

					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:145:9: n= NUMBER
					{
					n=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_operand2222); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 145:33: -> number(n=$n.text)
					  {
					  	retval.st = templateLib.getInstanceOf("number",new STAttrMap().put("n", (n!=null?n.getText():null)));
					  }


					}

					}
					break;
				case 3 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:146:9: ^( LPAREN s= single_expr )
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_operand2257); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_single_expr_in_operand2261);
					s=single_expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 146:33: -> {$s.st}
					  {
					  	retval.st = (s!=null?((StringTemplate)s.getTemplate()):null);
					  }


					}

					}
					break;
				case 4 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:147:9: b= BOOLEAN_OPERATOR
					{
					b=(CommonTree)match(input,BOOLEAN_OPERATOR,FOLLOW_BOOLEAN_OPERATOR_in_operand2278); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 147:33: -> boolean(b=$b.text)
					  {
					  	retval.st = templateLib.getInstanceOf("boolean",new STAttrMap().put("b", (b!=null?b.getText():null)));
					  }


					}

					}
					break;
				case 5 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:148:9: c= CHAR_OPERATOR
					{
					c=(CommonTree)match(input,CHAR_OPERATOR,FOLLOW_CHAR_OPERATOR_in_operand2304); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 148:33: -> char(c=$c.text)
					  {
					  	retval.st = templateLib.getInstanceOf("char",new STAttrMap().put("c", (c!=null?c.getText():null)));
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
	// $ANTLR end "operand"

	// $ANTLR start synpred1_ChocolateCodeGenerator
	public final void synpred1_ChocolateCodeGenerator_fragment() throws RecognitionException {
		// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:97:9: ( IDENTIFIER ASSIGN )
		// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:97:10: IDENTIFIER ASSIGN
		{
		match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred1_ChocolateCodeGenerator975); if (state.failed) return;
		match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred1_ChocolateCodeGenerator977); if (state.failed) return;
		}

	}
	// $ANTLR end synpred1_ChocolateCodeGenerator

	// $ANTLR start synpred2_ChocolateCodeGenerator
	public final void synpred2_ChocolateCodeGenerator_fragment() throws RecognitionException {
		// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:119:9: ( single_expr RCURLY )
		// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\CodeGenerator\\ChocolateCodeGenerator.g:119:10: single_expr RCURLY
		{
		pushFollow(FOLLOW_single_expr_in_synpred2_ChocolateCodeGenerator1383);
		single_expr();
		state._fsp--;
		if (state.failed) return;
		match(input,RCURLY,FOLLOW_RCURLY_in_synpred2_ChocolateCodeGenerator1385); if (state.failed) return;
		}

	}
	// $ANTLR end synpred2_ChocolateCodeGenerator

	// Delegated rules

	public final boolean synpred2_ChocolateCodeGenerator() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_ChocolateCodeGenerator_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
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



	public static final BitSet FOLLOW_PROGRAM_in_program100 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_section_in_program105 = new BitSet(new long[]{0x000C220000802028L});
	public static final BitSet FOLLOW_declaration_in_section167 = new BitSet(new long[]{0x000C220000802020L});
	public static final BitSet FOLLOW_statement_in_section172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONSTANT_in_declaration216 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_declaration220 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration224 = new BitSet(new long[]{0x0000000000400020L});
	public static final BitSet FOLLOW_ASSIGN_in_declaration228 = new BitSet(new long[]{0x000001FFCE788290L});
	public static final BitSet FOLLOW_type_op_in_declaration232 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VAR_in_declaration275 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_declaration279 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration283 = new BitSet(new long[]{0x0000000000400028L});
	public static final BitSet FOLLOW_ASSIGN_in_declaration287 = new BitSet(new long[]{0x000001FFCE788290L});
	public static final BitSet FOLLOW_type_op_in_declaration291 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INTEGER_in_type355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_type379 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_single_expr_in_type_op404 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_closed_compound_expr_in_type_op434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_in_statement541 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_in_statement568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assign_in_statement594 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifthenelse_in_statement619 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whiledo_in_statement638 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read673 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_read_one_in_read678 = new BitSet(new long[]{0x0000000000400008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read_one734 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print771 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_print_one_in_print776 = new BitSet(new long[]{0x0020000002400008L});
	public static final BitSet FOLLOW_closed_compound_expr_in_print_one817 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_print_one854 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_print_one878 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_in_assign920 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_assign924 = new BitSet(new long[]{0x000001FFCE7882B0L});
	public static final BitSet FOLLOW_assignexpr_in_assign929 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSIGN_in_assignexpr983 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_assignexpr987 = new BitSet(new long[]{0x000001FFCE7882B0L});
	public static final BitSet FOLLOW_assignexpr_in_assignexpr991 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_single_expr_in_assignexpr1024 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_closed_compound_expr_in_assignexpr1096 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifthenelse1171 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_ifthenelse1175 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_closed_compound_expr_in_ifthenelse1179 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_closed_compound_expr_in_ifthenelse1183 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_WHILE_in_whiledo1235 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_whiledo1239 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_closed_compound_expr_in_whiledo1243 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LCURLY_in_closed_compound_expr1325 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_declaration_in_closed_compound_expr1329 = new BitSet(new long[]{0x000C23FFCCF8A2B0L});
	public static final BitSet FOLLOW_compound_ext_in_closed_compound_expr1334 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_single_expr_in_compound_ext1393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_compound_ext1434 = new BitSet(new long[]{0x000C23FFCCF8A2B0L});
	public static final BitSet FOLLOW_declaration_in_compound_ext1438 = new BitSet(new long[]{0x000C23FFCCF8A2B0L});
	public static final BitSet FOLLOW_compound_ext_in_compound_ext1443 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operand_in_single_expr1494 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OR_in_single_expr1539 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1543 = new BitSet(new long[]{0x000001FFCC788290L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1547 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AND_in_single_expr1578 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1582 = new BitSet(new long[]{0x000001FFCC788290L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1586 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LESS_in_single_expr1616 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1620 = new BitSet(new long[]{0x000001FFCC788290L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1624 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LESSEQ_in_single_expr1657 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1661 = new BitSet(new long[]{0x000001FFCC788290L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1665 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GREATEQ_in_single_expr1696 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1700 = new BitSet(new long[]{0x000001FFCC788290L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1704 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GREAT_in_single_expr1734 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1738 = new BitSet(new long[]{0x000001FFCC788290L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1742 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQ_in_single_expr1774 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1778 = new BitSet(new long[]{0x000001FFCC788290L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1782 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NOTEQ_in_single_expr1817 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1821 = new BitSet(new long[]{0x000001FFCC788290L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1825 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_in_single_expr1857 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1861 = new BitSet(new long[]{0x000001FFCC788290L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1865 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MIN_in_single_expr1894 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1898 = new BitSet(new long[]{0x000001FFCC788290L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1902 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MULT_in_single_expr1932 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1936 = new BitSet(new long[]{0x000001FFCC788290L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1940 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIV_in_single_expr1969 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1973 = new BitSet(new long[]{0x000001FFCC788290L});
	public static final BitSet FOLLOW_single_expr_in_single_expr1977 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MOD_in_single_expr2007 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_single_expr2011 = new BitSet(new long[]{0x000001FFCC788290L});
	public static final BitSet FOLLOW_single_expr_in_single_expr2015 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_POS_in_single_expr2045 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_single_expr2049 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEG_in_single_expr2089 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_single_expr2093 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NOT_in_single_expr2133 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_single_expr2137 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand2191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand2222 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand2257 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_single_expr_in_operand2261 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BOOLEAN_OPERATOR_in_operand2278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_OPERATOR_in_operand2304 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_synpred1_ChocolateCodeGenerator975 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_synpred1_ChocolateCodeGenerator977 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_single_expr_in_synpred2_ChocolateCodeGenerator1383 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_RCURLY_in_synpred2_ChocolateCodeGenerator1385 = new BitSet(new long[]{0x0000000000000002L});
}
