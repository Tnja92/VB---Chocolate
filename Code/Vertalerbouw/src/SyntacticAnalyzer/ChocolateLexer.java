// $ANTLR 3.5 C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g 2013-07-10 10:05:27

package SyntacticAnalyzer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ChocolateLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public ChocolateLexer() {} 
	public ChocolateLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public ChocolateLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g"; }

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:11:5: ( 'rolo' )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:11:7: 'rolo'
			{
			match("rolo"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "ASSIGN"
	public final void mASSIGN() throws RecognitionException {
		try {
			int _type = ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:12:8: ( 'milka' )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:12:10: 'milka'
			{
			match("milka"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSIGN"

	// $ANTLR start "BOOLEAN"
	public final void mBOOLEAN() throws RecognitionException {
		try {
			int _type = BOOLEAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:13:9: ( 'puur' )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:13:11: 'puur'
			{
			match("puur"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOLEAN"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:14:6: ( 'melk' )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:14:8: 'melk'
			{
			match("melk"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:15:7: ( ':' )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:15:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:16:7: ( ',' )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:16:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "CONSTANT"
	public final void mCONSTANT() throws RecognitionException {
		try {
			int _type = CONSTANT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:17:10: ( 'reep' )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:17:12: 'reep'
			{
			match("reep"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONSTANT"

	// $ANTLR start "DIV"
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:18:5: ( 'dove' )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:18:7: 'dove'
			{
			match("dove"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV"

	// $ANTLR start "DO"
	public final void mDO() throws RecognitionException {
		try {
			int _type = DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:19:4: ( 'do' )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:19:6: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DO"

	// $ANTLR start "DQUOTATION"
	public final void mDQUOTATION() throws RecognitionException {
		try {
			int _type = DQUOTATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:20:12: ( '\"' )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:20:14: '\"'
			{
			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DQUOTATION"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:21:6: ( 'else' )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:21:8: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:22:4: ( 'kitkat' )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:22:6: 'kitkat'
			{
			match("kitkat"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ"

	// $ANTLR start "GREAT"
	public final void mGREAT() throws RecognitionException {
		try {
			int _type = GREAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:23:7: ( 'lion' )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:23:9: 'lion'
			{
			match("lion"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GREAT"

	// $ANTLR start "GREATEQ"
	public final void mGREATEQ() throws RecognitionException {
		try {
			int _type = GREATEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:24:9: ( 'bueno' )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:24:11: 'bueno'
			{
			match("bueno"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GREATEQ"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:25:4: ( 'if' )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:25:6: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "INTEGER"
	public final void mINTEGER() throws RecognitionException {
		try {
			int _type = INTEGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:26:9: ( 'wit' )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:26:11: 'wit'
			{
			match("wit"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTEGER"

	// $ANTLR start "LCURLY"
	public final void mLCURLY() throws RecognitionException {
		try {
			int _type = LCURLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:27:8: ( '{' )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:27:10: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LCURLY"

	// $ANTLR start "LESS"
	public final void mLESS() throws RecognitionException {
		try {
			int _type = LESS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:28:6: ( 'snickers' )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:28:8: 'snickers'
			{
			match("snickers"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LESS"

	// $ANTLR start "LESSEQ"
	public final void mLESSEQ() throws RecognitionException {
		try {
			int _type = LESSEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:29:8: ( 'kinder' )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:29:10: 'kinder'
			{
			match("kinder"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LESSEQ"

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:30:8: ( '(' )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:30:10: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPAREN"

	// $ANTLR start "MIN"
	public final void mMIN() throws RecognitionException {
		try {
			int _type = MIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:31:5: ( 'mars' )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:31:7: 'mars'
			{
			match("mars"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MIN"

	// $ANTLR start "MOD"
	public final void mMOD() throws RecognitionException {
		try {
			int _type = MOD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:32:5: ( 'maltesers' )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:32:7: 'maltesers'
			{
			match("maltesers"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOD"

	// $ANTLR start "MULT"
	public final void mMULT() throws RecognitionException {
		try {
			int _type = MULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:33:6: ( 'milkyway' )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:33:8: 'milkyway'
			{
			match("milkyway"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULT"

	// $ANTLR start "NEG"
	public final void mNEG() throws RecognitionException {
		try {
			int _type = NEG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:34:5: ( 'neg' )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:34:7: 'neg'
			{
			match("neg"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEG"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:35:5: ( 'nuts' )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:35:7: 'nuts'
			{
			match("nuts"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "NOTEQ"
	public final void mNOTEQ() throws RecognitionException {
		try {
			int _type = NOTEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:36:7: ( 'bros' )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:36:9: 'bros'
			{
			match("bros"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOTEQ"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:37:4: ( 'twix' )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:37:6: 'twix'
			{
			match("twix"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:38:6: ( 'bounty' )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:38:8: 'bounty'
			{
			match("bounty"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "POS"
	public final void mPOS() throws RecognitionException {
		try {
			int _type = POS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:39:5: ( 'pos' )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:39:7: 'pos'
			{
			match("pos"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POS"

	// $ANTLR start "PRINT"
	public final void mPRINT() throws RecognitionException {
		try {
			int _type = PRINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:40:7: ( 'verkade' )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:40:9: 'verkade'
			{
			match("verkade"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRINT"

	// $ANTLR start "PROGRAM"
	public final void mPROGRAM() throws RecognitionException {
		try {
			int _type = PROGRAM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:41:9: ( 'program' )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:41:11: 'program'
			{
			match("program"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PROGRAM"

	// $ANTLR start "QUOTATION"
	public final void mQUOTATION() throws RecognitionException {
		try {
			int _type = QUOTATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:42:11: ( '\\'' )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:42:13: '\\''
			{
			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUOTATION"

	// $ANTLR start "RCURLY"
	public final void mRCURLY() throws RecognitionException {
		try {
			int _type = RCURLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:43:8: ( '}' )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:43:10: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RCURLY"

	// $ANTLR start "READ"
	public final void mREAD() throws RecognitionException {
		try {
			int _type = READ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:44:6: ( 'droste' )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:44:8: 'droste'
			{
			match("droste"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "READ"

	// $ANTLR start "RPAREN"
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:45:8: ( ')' )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:45:10: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPAREN"

	// $ANTLR start "SEMICOLON"
	public final void mSEMICOLON() throws RecognitionException {
		try {
			int _type = SEMICOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:46:11: ( ';' )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:46:13: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMICOLON"

	// $ANTLR start "THEN"
	public final void mTHEN() throws RecognitionException {
		try {
			int _type = THEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:47:6: ( 'then' )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:47:8: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THEN"

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:48:5: ( 'bonbon' )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:48:7: 'bonbon'
			{
			match("bonbon"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:49:7: ( 'while' )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:49:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "BOOLEAN_OPERATOR"
	public final void mBOOLEAN_OPERATOR() throws RecognitionException {
		try {
			int _type = BOOLEAN_OPERATOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:218:5: ( 'true' | 'false' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='t') ) {
				alt1=1;
			}
			else if ( (LA1_0=='f') ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:218:9: 'true'
					{
					match("true"); 

					}
					break;
				case 2 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:219:9: 'false'
					{
					match("false"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOLEAN_OPERATOR"

	// $ANTLR start "IDENTIFIER"
	public final void mIDENTIFIER() throws RecognitionException {
		try {
			int _type = IDENTIFIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:223:5: ( LETTER ( LETTER | DIGIT )* )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:223:9: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:223:16: ( LETTER | DIGIT )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IDENTIFIER"

	// $ANTLR start "NUMBER"
	public final void mNUMBER() throws RecognitionException {
		try {
			int _type = NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:227:5: ( ( DIGIT )+ )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:227:9: ( DIGIT )+
			{
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:227:9: ( DIGIT )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMBER"

	// $ANTLR start "CHAR_OPERATOR"
	public final void mCHAR_OPERATOR() throws RecognitionException {
		try {
			int _type = CHAR_OPERATOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:231:5: ( QUOTATION ( DIGIT | LETTER ) QUOTATION )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:231:9: QUOTATION ( DIGIT | LETTER ) QUOTATION
			{
			mQUOTATION(); 

			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			mQUOTATION(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR_OPERATOR"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:235:5: ( 'cacao' ( . )* '\\n' )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:235:9: 'cacao' ( . )* '\\n'
			{
			match("cacao"); 

			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:235:17: ( . )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0=='\n') ) {
					alt4=2;
				}
				else if ( ((LA4_0 >= '\u0000' && LA4_0 <= '\t')||(LA4_0 >= '\u000B' && LA4_0 <= '\uFFFF')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:235:17: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop4;
				}
			}

			match('\n'); 
			 _channel=HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:240:5: ( ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+ )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:240:9: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
			{
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:240:9: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '\t' && LA5_0 <= '\n')||(LA5_0 >= '\f' && LA5_0 <= '\r')||LA5_0==' ') ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			 _channel=HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:244:17: ( ( '0' .. '9' ) )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "LOWER"
	public final void mLOWER() throws RecognitionException {
		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:245:17: ( ( 'a' .. 'z' ) )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:
			{
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LOWER"

	// $ANTLR start "UPPER"
	public final void mUPPER() throws RecognitionException {
		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:246:17: ( ( 'A' .. 'Z' ) )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UPPER"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:247:17: ( LOWER | UPPER )
			// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:8: ( AND | ASSIGN | BOOLEAN | CHAR | COLON | COMMA | CONSTANT | DIV | DO | DQUOTATION | ELSE | EQ | GREAT | GREATEQ | IF | INTEGER | LCURLY | LESS | LESSEQ | LPAREN | MIN | MOD | MULT | NEG | NOT | NOTEQ | OR | PLUS | POS | PRINT | PROGRAM | QUOTATION | RCURLY | READ | RPAREN | SEMICOLON | THEN | VAR | WHILE | BOOLEAN_OPERATOR | IDENTIFIER | NUMBER | CHAR_OPERATOR | COMMENT | WS )
		int alt6=45;
		alt6 = dfa6.predict(input);
		switch (alt6) {
			case 1 :
				// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:10: AND
				{
				mAND(); 

				}
				break;
			case 2 :
				// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:14: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 3 :
				// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:21: BOOLEAN
				{
				mBOOLEAN(); 

				}
				break;
			case 4 :
				// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:29: CHAR
				{
				mCHAR(); 

				}
				break;
			case 5 :
				// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:34: COLON
				{
				mCOLON(); 

				}
				break;
			case 6 :
				// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:40: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 7 :
				// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:46: CONSTANT
				{
				mCONSTANT(); 

				}
				break;
			case 8 :
				// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:55: DIV
				{
				mDIV(); 

				}
				break;
			case 9 :
				// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:59: DO
				{
				mDO(); 

				}
				break;
			case 10 :
				// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:62: DQUOTATION
				{
				mDQUOTATION(); 

				}
				break;
			case 11 :
				// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:73: ELSE
				{
				mELSE(); 

				}
				break;
			case 12 :
				// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:78: EQ
				{
				mEQ(); 

				}
				break;
			case 13 :
				// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:81: GREAT
				{
				mGREAT(); 

				}
				break;
			case 14 :
				// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:87: GREATEQ
				{
				mGREATEQ(); 

				}
				break;
			case 15 :
				// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:95: IF
				{
				mIF(); 

				}
				break;
			case 16 :
				// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:98: INTEGER
				{
				mINTEGER(); 

				}
				break;
			case 17 :
				// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:106: LCURLY
				{
				mLCURLY(); 

				}
				break;
			case 18 :
				// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:113: LESS
				{
				mLESS(); 

				}
				break;
			case 19 :
				// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:118: LESSEQ
				{
				mLESSEQ(); 

				}
				break;
			case 20 :
				// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:125: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 21 :
				// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:132: MIN
				{
				mMIN(); 

				}
				break;
			case 22 :
				// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:136: MOD
				{
				mMOD(); 

				}
				break;
			case 23 :
				// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:140: MULT
				{
				mMULT(); 

				}
				break;
			case 24 :
				// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:145: NEG
				{
				mNEG(); 

				}
				break;
			case 25 :
				// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:149: NOT
				{
				mNOT(); 

				}
				break;
			case 26 :
				// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:153: NOTEQ
				{
				mNOTEQ(); 

				}
				break;
			case 27 :
				// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:159: OR
				{
				mOR(); 

				}
				break;
			case 28 :
				// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:162: PLUS
				{
				mPLUS(); 

				}
				break;
			case 29 :
				// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:167: POS
				{
				mPOS(); 

				}
				break;
			case 30 :
				// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:171: PRINT
				{
				mPRINT(); 

				}
				break;
			case 31 :
				// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:177: PROGRAM
				{
				mPROGRAM(); 

				}
				break;
			case 32 :
				// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:185: QUOTATION
				{
				mQUOTATION(); 

				}
				break;
			case 33 :
				// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:195: RCURLY
				{
				mRCURLY(); 

				}
				break;
			case 34 :
				// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:202: READ
				{
				mREAD(); 

				}
				break;
			case 35 :
				// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:207: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 36 :
				// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:214: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 37 :
				// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:224: THEN
				{
				mTHEN(); 

				}
				break;
			case 38 :
				// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:229: VAR
				{
				mVAR(); 

				}
				break;
			case 39 :
				// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:233: WHILE
				{
				mWHILE(); 

				}
				break;
			case 40 :
				// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:239: BOOLEAN_OPERATOR
				{
				mBOOLEAN_OPERATOR(); 

				}
				break;
			case 41 :
				// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:256: IDENTIFIER
				{
				mIDENTIFIER(); 

				}
				break;
			case 42 :
				// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:267: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 43 :
				// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:274: CHAR_OPERATOR
				{
				mCHAR_OPERATOR(); 

				}
				break;
			case 44 :
				// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:288: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 45 :
				// C:\\Users\\Tanja\\Documents\\GitHub\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:296: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA6 dfa6 = new DFA6(this);
	static final String DFA6_eotS =
		"\1\uffff\3\33\2\uffff\1\33\1\uffff\6\33\1\uffff\1\33\1\uffff\3\33\1\67"+
		"\3\uffff\2\33\3\uffff\10\33\1\105\7\33\1\117\11\33\2\uffff\11\33\1\142"+
		"\2\33\1\uffff\11\33\1\uffff\1\156\2\33\1\161\7\33\1\171\1\172\1\33\1\175"+
		"\1\176\1\33\1\u0080\1\uffff\1\33\1\u0082\1\33\1\u0084\2\33\1\u0087\1\33"+
		"\1\u0089\2\33\1\uffff\2\33\1\uffff\1\u008e\1\u008f\1\u0090\1\u0091\3\33"+
		"\2\uffff\1\u0095\1\33\2\uffff\1\33\1\uffff\1\33\1\uffff\1\33\1\uffff\2"+
		"\33\1\uffff\1\u009c\1\uffff\2\33\1\u009f\1\33\4\uffff\1\33\1\u0091\1\33"+
		"\1\uffff\3\33\1\u00a7\1\u00a8\1\u00a9\1\uffff\1\u00aa\1\u00ab\1\uffff"+
		"\2\33\1\uffff\3\33\1\u00b0\5\uffff\1\33\1\u00b2\1\u00b3\1\33\1\uffff\1"+
		"\u00b5\2\uffff\1\u00b6\2\uffff";
	static final String DFA6_eofS =
		"\u00b7\uffff";
	static final String DFA6_minS =
		"\1\11\1\145\1\141\1\157\2\uffff\1\157\1\uffff\1\154\2\151\1\157\1\146"+
		"\1\150\1\uffff\1\156\1\uffff\1\145\1\150\1\145\1\60\3\uffff\2\141\3\uffff"+
		"\1\154\1\145\3\154\1\165\1\163\1\157\1\60\1\157\1\163\1\156\1\157\1\145"+
		"\1\157\1\156\1\60\1\164\2\151\1\147\1\164\1\151\1\145\1\165\1\162\2\uffff"+
		"\1\154\1\143\1\157\1\160\2\153\1\163\1\164\1\162\1\60\1\147\1\145\1\uffff"+
		"\1\163\1\145\1\153\1\144\2\156\1\163\1\156\1\142\1\uffff\1\60\1\154\1"+
		"\143\1\60\1\163\1\170\1\156\1\145\1\153\1\163\1\141\2\60\1\141\2\60\1"+
		"\145\1\60\1\uffff\1\162\1\60\1\164\1\60\1\141\1\145\1\60\1\157\1\60\1"+
		"\164\1\157\1\uffff\1\145\1\153\1\uffff\4\60\1\141\1\145\1\157\2\uffff"+
		"\1\60\1\167\2\uffff\1\163\1\uffff\1\141\1\uffff\1\145\1\uffff\1\164\1"+
		"\162\1\uffff\1\60\1\uffff\1\171\1\156\1\60\1\145\4\uffff\1\144\1\60\1"+
		"\0\1\uffff\1\141\1\145\1\155\3\60\1\uffff\2\60\1\uffff\1\162\1\145\1\uffff"+
		"\1\0\1\171\1\162\1\60\5\uffff\1\163\2\60\1\163\1\uffff\1\60\2\uffff\1"+
		"\60\2\uffff";
	static final String DFA6_maxS =
		"\1\175\1\157\1\151\1\165\2\uffff\1\162\1\uffff\1\154\2\151\1\165\1\146"+
		"\1\151\1\uffff\1\156\1\uffff\1\165\1\167\1\145\1\172\3\uffff\2\141\3\uffff"+
		"\1\154\1\145\2\154\1\162\1\165\1\163\1\157\1\172\1\157\1\163\1\164\1\157"+
		"\1\145\1\157\1\165\1\172\1\164\2\151\1\147\1\164\1\151\1\145\1\165\1\162"+
		"\2\uffff\1\154\1\143\1\157\1\160\2\153\1\163\1\164\1\162\1\172\1\147\1"+
		"\145\1\uffff\1\163\1\145\1\153\1\144\2\156\1\163\1\156\1\142\1\uffff\1"+
		"\172\1\154\1\143\1\172\1\163\1\170\1\156\1\145\1\153\1\163\1\141\2\172"+
		"\1\171\2\172\1\145\1\172\1\uffff\1\162\1\172\1\164\1\172\1\141\1\145\1"+
		"\172\1\157\1\172\1\164\1\157\1\uffff\1\145\1\153\1\uffff\4\172\1\141\1"+
		"\145\1\157\2\uffff\1\172\1\167\2\uffff\1\163\1\uffff\1\141\1\uffff\1\145"+
		"\1\uffff\1\164\1\162\1\uffff\1\172\1\uffff\1\171\1\156\1\172\1\145\4\uffff"+
		"\1\144\1\172\1\uffff\1\uffff\1\141\1\145\1\155\3\172\1\uffff\2\172\1\uffff"+
		"\1\162\1\145\1\uffff\1\uffff\1\171\1\162\1\172\5\uffff\1\163\2\172\1\163"+
		"\1\uffff\1\172\2\uffff\1\172\2\uffff";
	static final String DFA6_acceptS =
		"\4\uffff\1\5\1\6\1\uffff\1\12\6\uffff\1\21\1\uffff\1\24\4\uffff\1\41\1"+
		"\43\1\44\2\uffff\1\52\1\51\1\55\32\uffff\1\40\1\53\14\uffff\1\11\11\uffff"+
		"\1\17\22\uffff\1\35\13\uffff\1\20\2\uffff\1\30\7\uffff\1\1\1\7\2\uffff"+
		"\1\4\1\25\1\uffff\1\3\1\uffff\1\10\1\uffff\1\13\2\uffff\1\15\1\uffff\1"+
		"\32\4\uffff\1\31\1\33\1\45\1\50\3\uffff\1\2\6\uffff\1\16\2\uffff\1\47"+
		"\2\uffff\1\54\4\uffff\1\42\1\14\1\23\1\34\1\46\4\uffff\1\37\1\uffff\1"+
		"\36\1\27\1\uffff\1\22\1\26";
	static final String DFA6_specialS =
		"\u0094\uffff\1\1\16\uffff\1\0\23\uffff}>";
	static final String[] DFA6_transitionS = {
			"\2\34\1\uffff\2\34\22\uffff\1\34\1\uffff\1\7\4\uffff\1\24\1\20\1\26\2"+
			"\uffff\1\5\3\uffff\12\32\1\4\1\27\5\uffff\32\33\6\uffff\1\33\1\13\1\31"+
			"\1\6\1\10\1\30\2\33\1\14\1\33\1\11\1\12\1\2\1\21\1\33\1\3\1\33\1\1\1"+
			"\17\1\22\1\33\1\23\1\15\3\33\1\16\1\uffff\1\25",
			"\1\36\11\uffff\1\35",
			"\1\41\3\uffff\1\40\3\uffff\1\37",
			"\1\43\2\uffff\1\44\2\uffff\1\42",
			"",
			"",
			"\1\45\2\uffff\1\46",
			"",
			"\1\47",
			"\1\50",
			"\1\51",
			"\1\54\2\uffff\1\53\2\uffff\1\52",
			"\1\55",
			"\1\57\1\56",
			"",
			"\1\60",
			"",
			"\1\61\17\uffff\1\62",
			"\1\64\11\uffff\1\65\4\uffff\1\63",
			"\1\66",
			"\12\70\7\uffff\32\70\6\uffff\32\70",
			"",
			"",
			"",
			"\1\71",
			"\1\72",
			"",
			"",
			"",
			"\1\73",
			"\1\74",
			"\1\75",
			"\1\76",
			"\1\100\5\uffff\1\77",
			"\1\101",
			"\1\102",
			"\1\103",
			"\12\33\7\uffff\32\33\6\uffff\25\33\1\104\4\33",
			"\1\106",
			"\1\107",
			"\1\111\5\uffff\1\110",
			"\1\112",
			"\1\113",
			"\1\114",
			"\1\116\6\uffff\1\115",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
			"\1\120",
			"\1\121",
			"\1\122",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\126",
			"\1\127",
			"\1\130",
			"",
			"",
			"\1\131",
			"\1\132",
			"\1\133",
			"\1\134",
			"\1\135",
			"\1\136",
			"\1\137",
			"\1\140",
			"\1\141",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
			"\1\143",
			"\1\144",
			"",
			"\1\145",
			"\1\146",
			"\1\147",
			"\1\150",
			"\1\151",
			"\1\152",
			"\1\153",
			"\1\154",
			"\1\155",
			"",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
			"\1\157",
			"\1\160",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
			"\1\162",
			"\1\163",
			"\1\164",
			"\1\165",
			"\1\166",
			"\1\167",
			"\1\170",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
			"\1\173\27\uffff\1\174",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
			"\1\177",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
			"",
			"\1\u0081",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
			"\1\u0083",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
			"\1\u0085",
			"\1\u0086",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
			"\1\u0088",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
			"\1\u008a",
			"\1\u008b",
			"",
			"\1\u008c",
			"\1\u008d",
			"",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
			"\1\u0092",
			"\1\u0093",
			"\1\u0094",
			"",
			"",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
			"\1\u0096",
			"",
			"",
			"\1\u0097",
			"",
			"\1\u0098",
			"",
			"\1\u0099",
			"",
			"\1\u009a",
			"\1\u009b",
			"",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
			"",
			"\1\u009d",
			"\1\u009e",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
			"\1\u00a0",
			"",
			"",
			"",
			"",
			"\1\u00a1",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
			"\60\u00a2\12\u00a3\7\u00a2\32\u00a3\6\u00a2\32\u00a3\uff85\u00a2",
			"",
			"\1\u00a4",
			"\1\u00a5",
			"\1\u00a6",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
			"",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
			"",
			"\1\u00ac",
			"\1\u00ad",
			"",
			"\60\u00a2\12\u00a3\7\u00a2\32\u00a3\6\u00a2\32\u00a3\uff85\u00a2",
			"\1\u00ae",
			"\1\u00af",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
			"",
			"",
			"",
			"",
			"",
			"\1\u00b1",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
			"\1\u00b4",
			"",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
			"",
			"",
			"\12\33\7\uffff\32\33\6\uffff\32\33",
			"",
			""
	};

	static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
	static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
	static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
	static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
	static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
	static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
	static final short[][] DFA6_transition;

	static {
		int numStates = DFA6_transitionS.length;
		DFA6_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
		}
	}

	protected class DFA6 extends DFA {

		public DFA6(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 6;
			this.eot = DFA6_eot;
			this.eof = DFA6_eof;
			this.min = DFA6_min;
			this.max = DFA6_max;
			this.accept = DFA6_accept;
			this.special = DFA6_special;
			this.transition = DFA6_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( AND | ASSIGN | BOOLEAN | CHAR | COLON | COMMA | CONSTANT | DIV | DO | DQUOTATION | ELSE | EQ | GREAT | GREATEQ | IF | INTEGER | LCURLY | LESS | LESSEQ | LPAREN | MIN | MOD | MULT | NEG | NOT | NOTEQ | OR | PLUS | POS | PRINT | PROGRAM | QUOTATION | RCURLY | READ | RPAREN | SEMICOLON | THEN | VAR | WHILE | BOOLEAN_OPERATOR | IDENTIFIER | NUMBER | CHAR_OPERATOR | COMMENT | WS );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA6_163 = input.LA(1);
						s = -1;
						if ( ((LA6_163 >= '\u0000' && LA6_163 <= '/')||(LA6_163 >= ':' && LA6_163 <= '@')||(LA6_163 >= '[' && LA6_163 <= '`')||(LA6_163 >= '{' && LA6_163 <= '\uFFFF')) ) {s = 162;}
						else if ( ((LA6_163 >= '0' && LA6_163 <= '9')||(LA6_163 >= 'A' && LA6_163 <= 'Z')||(LA6_163 >= 'a' && LA6_163 <= 'z')) ) {s = 163;}
						else s = 27;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA6_148 = input.LA(1);
						s = -1;
						if ( ((LA6_148 >= '\u0000' && LA6_148 <= '/')||(LA6_148 >= ':' && LA6_148 <= '@')||(LA6_148 >= '[' && LA6_148 <= '`')||(LA6_148 >= '{' && LA6_148 <= '\uFFFF')) ) {s = 162;}
						else if ( ((LA6_148 >= '0' && LA6_148 <= '9')||(LA6_148 >= 'A' && LA6_148 <= 'Z')||(LA6_148 >= 'a' && LA6_148 <= 'z')) ) {s = 163;}
						else s = 27;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 6, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
