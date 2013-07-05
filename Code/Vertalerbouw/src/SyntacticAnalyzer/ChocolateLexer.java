// $ANTLR 3.5 C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g 2013-06-30 23:07:50

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
	@Override public String getGrammarFileName() { return "C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g"; }

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:11:5: ( 'rolo' )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:11:7: 'rolo'
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
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:12:8: ( 'milka' )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:12:10: 'milka'
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

	// $ANTLR start "BECOMES"
	public final void mBECOMES() throws RecognitionException {
		try {
			int _type = BECOMES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:13:9: ( '=' )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:13:11: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BECOMES"

	// $ANTLR start "BOOLEAN"
	public final void mBOOLEAN() throws RecognitionException {
		try {
			int _type = BOOLEAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:14:9: ( 'puur' )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:14:11: 'puur'
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
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:15:6: ( 'melk' )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:15:8: 'melk'
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
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:16:7: ( ':' )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:16:9: ':'
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
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:17:7: ( ',' )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:17:9: ','
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
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:18:10: ( 'reep' )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:18:12: 'reep'
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
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:19:5: ( 'dove' )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:19:7: 'dove'
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

	// $ANTLR start "DQUOTATION"
	public final void mDQUOTATION() throws RecognitionException {
		try {
			int _type = DQUOTATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:20:12: ( '\"' )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:20:14: '\"'
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
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:21:6: ( 'else' )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:21:8: 'else'
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
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:22:4: ( 'kitkat' )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:22:6: 'kitkat'
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

	// $ANTLR start "FALSE"
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:23:7: ( 'false' )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:23:9: 'false'
			{
			match("false"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FALSE"

	// $ANTLR start "GREAT"
	public final void mGREAT() throws RecognitionException {
		try {
			int _type = GREAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:24:7: ( 'lion' )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:24:9: 'lion'
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
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:25:9: ( 'bueno' )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:25:11: 'bueno'
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
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:26:4: ( 'if' )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:26:6: 'if'
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
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:27:9: ( 'wit' )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:27:11: 'wit'
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
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:28:8: ( '{' )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:28:10: '{'
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
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:29:6: ( 'snickers' )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:29:8: 'snickers'
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
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:30:8: ( 'kinder' )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:30:10: 'kinder'
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
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:31:8: ( '(' )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:31:10: '('
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
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:32:5: ( 'mars' )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:32:7: 'mars'
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
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:33:5: ( 'maltesers' )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:33:7: 'maltesers'
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
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:34:6: ( 'milkyway' )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:34:8: 'milkyway'
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

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:35:5: ( 'nuts' )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:35:7: 'nuts'
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
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:36:7: ( 'bros' )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:36:9: 'bros'
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
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:37:4: ( 'twix' )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:37:6: 'twix'
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
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:38:6: ( 'bounty' )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:38:8: 'bounty'
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

	// $ANTLR start "PRINT"
	public final void mPRINT() throws RecognitionException {
		try {
			int _type = PRINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:39:7: ( 'verkade' )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:39:9: 'verkade'
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
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:40:9: ( 'program' )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:40:11: 'program'
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
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:41:11: ( '\\'' )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:41:13: '\\''
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
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:42:8: ( '}' )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:42:10: '}'
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
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:43:6: ( 'droste' )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:43:8: 'droste'
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
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:44:8: ( ')' )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:44:10: ')'
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
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:45:11: ( ';' )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:45:13: ';'
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
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:46:6: ( 'then' )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:46:8: 'then'
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

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:47:6: ( 'true' )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:47:8: 'true'
			{
			match("true"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRUE"

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:48:5: ( 'bonbon' )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:48:7: 'bonbon'
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

	// $ANTLR start "IDENTIFIER"
	public final void mIDENTIFIER() throws RecognitionException {
		try {
			int _type = IDENTIFIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:181:5: ( LETTER ( LETTER | DIGIT )* )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:181:9: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:181:16: ( LETTER | DIGIT )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:
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
					break loop1;
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
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:185:5: ( ( DIGIT )+ )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:185:9: ( DIGIT )+
			{
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:185:9: ( DIGIT )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:
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
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
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
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:189:5: ( QUOTATION ( DIGIT | LETTER ) QUOTATION )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:189:9: QUOTATION ( DIGIT | LETTER ) QUOTATION
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
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:193:5: ( 'cacao' ( . )* '\\n' )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:193:9: 'cacao' ( . )* '\\n'
			{
			match("cacao"); 

			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:193:17: ( . )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0=='\n') ) {
					alt3=2;
				}
				else if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\uFFFF')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:193:17: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop3;
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
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:198:5: ( ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+ )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:198:9: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
			{
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:198:9: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '\t' && LA4_0 <= '\n')||(LA4_0 >= '\f' && LA4_0 <= '\r')||LA4_0==' ') ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:
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
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
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
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:202:17: ( ( '0' .. '9' ) )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:
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
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:203:17: ( ( 'a' .. 'z' ) )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:
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
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:204:17: ( ( 'A' .. 'Z' ) )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:
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
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:205:17: ( LOWER | UPPER )
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:
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

	// $ANTLR start "BOOLEAN_OPERATOR"
	public final void mBOOLEAN_OPERATOR() throws RecognitionException {
		try {
			// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:206:27: ( 'true' | 'false' )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='t') ) {
				alt5=1;
			}
			else if ( (LA5_0=='f') ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:206:31: 'true'
					{
					match("true"); 

					}
					break;
				case 2 :
					// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:206:40: 'false'
					{
					match("false"); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOLEAN_OPERATOR"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:8: ( AND | ASSIGN | BECOMES | BOOLEAN | CHAR | COLON | COMMA | CONSTANT | DIV | DQUOTATION | ELSE | EQ | FALSE | GREAT | GREATEQ | IF | INTEGER | LCURLY | LESS | LESSEQ | LPAREN | MIN | MOD | MULT | NOT | NOTEQ | OR | PLUS | PRINT | PROGRAM | QUOTATION | RCURLY | READ | RPAREN | SEMICOLON | THEN | TRUE | VAR | IDENTIFIER | NUMBER | CHAR_OPERATOR | COMMENT | WS )
		int alt6=43;
		alt6 = dfa6.predict(input);
		switch (alt6) {
			case 1 :
				// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:10: AND
				{
				mAND(); 

				}
				break;
			case 2 :
				// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:14: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 3 :
				// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:21: BECOMES
				{
				mBECOMES(); 

				}
				break;
			case 4 :
				// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:29: BOOLEAN
				{
				mBOOLEAN(); 

				}
				break;
			case 5 :
				// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:37: CHAR
				{
				mCHAR(); 

				}
				break;
			case 6 :
				// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:42: COLON
				{
				mCOLON(); 

				}
				break;
			case 7 :
				// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:48: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 8 :
				// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:54: CONSTANT
				{
				mCONSTANT(); 

				}
				break;
			case 9 :
				// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:63: DIV
				{
				mDIV(); 

				}
				break;
			case 10 :
				// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:67: DQUOTATION
				{
				mDQUOTATION(); 

				}
				break;
			case 11 :
				// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:78: ELSE
				{
				mELSE(); 

				}
				break;
			case 12 :
				// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:83: EQ
				{
				mEQ(); 

				}
				break;
			case 13 :
				// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:86: FALSE
				{
				mFALSE(); 

				}
				break;
			case 14 :
				// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:92: GREAT
				{
				mGREAT(); 

				}
				break;
			case 15 :
				// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:98: GREATEQ
				{
				mGREATEQ(); 

				}
				break;
			case 16 :
				// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:106: IF
				{
				mIF(); 

				}
				break;
			case 17 :
				// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:109: INTEGER
				{
				mINTEGER(); 

				}
				break;
			case 18 :
				// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:117: LCURLY
				{
				mLCURLY(); 

				}
				break;
			case 19 :
				// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:124: LESS
				{
				mLESS(); 

				}
				break;
			case 20 :
				// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:129: LESSEQ
				{
				mLESSEQ(); 

				}
				break;
			case 21 :
				// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:136: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 22 :
				// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:143: MIN
				{
				mMIN(); 

				}
				break;
			case 23 :
				// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:147: MOD
				{
				mMOD(); 

				}
				break;
			case 24 :
				// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:151: MULT
				{
				mMULT(); 

				}
				break;
			case 25 :
				// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:156: NOT
				{
				mNOT(); 

				}
				break;
			case 26 :
				// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:160: NOTEQ
				{
				mNOTEQ(); 

				}
				break;
			case 27 :
				// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:166: OR
				{
				mOR(); 

				}
				break;
			case 28 :
				// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:169: PLUS
				{
				mPLUS(); 

				}
				break;
			case 29 :
				// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:174: PRINT
				{
				mPRINT(); 

				}
				break;
			case 30 :
				// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:180: PROGRAM
				{
				mPROGRAM(); 

				}
				break;
			case 31 :
				// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:188: QUOTATION
				{
				mQUOTATION(); 

				}
				break;
			case 32 :
				// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:198: RCURLY
				{
				mRCURLY(); 

				}
				break;
			case 33 :
				// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:205: READ
				{
				mREAD(); 

				}
				break;
			case 34 :
				// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:210: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 35 :
				// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:217: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 36 :
				// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:227: THEN
				{
				mTHEN(); 

				}
				break;
			case 37 :
				// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:232: TRUE
				{
				mTRUE(); 

				}
				break;
			case 38 :
				// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:237: VAR
				{
				mVAR(); 

				}
				break;
			case 39 :
				// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:241: IDENTIFIER
				{
				mIDENTIFIER(); 

				}
				break;
			case 40 :
				// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:252: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 41 :
				// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:259: CHAR_OPERATOR
				{
				mCHAR_OPERATOR(); 

				}
				break;
			case 42 :
				// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:273: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 43 :
				// C:\\Kim\\INF\\Vertalerbouw\\Practicum\\src\\vb\\Chocolate\\VB---Chocolate\\Code\\Vertalerbouw\\src\\SyntacticAnalyzer\\Chocolate.g:1:281: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA6 dfa6 = new DFA6(this);
	static final String DFA6_eotS =
		"\1\uffff\2\34\1\uffff\1\34\2\uffff\1\34\1\uffff\7\34\1\uffff\1\34\1\uffff"+
		"\3\34\1\66\3\uffff\1\34\3\uffff\20\34\1\114\7\34\2\uffff\24\34\1\uffff"+
		"\1\150\7\34\1\160\1\161\1\34\1\164\1\165\1\34\1\167\1\34\1\171\1\34\1"+
		"\173\3\34\1\177\1\34\1\u0081\2\34\1\uffff\1\34\1\u0085\1\u0086\1\u0087"+
		"\1\u0088\2\34\2\uffff\1\u008b\1\34\2\uffff\1\34\1\uffff\1\34\1\uffff\1"+
		"\34\1\uffff\2\34\1\u0092\1\uffff\1\u0093\1\uffff\3\34\4\uffff\2\34\1\uffff"+
		"\3\34\1\u009d\1\u009e\1\u009f\2\uffff\1\u00a0\1\u00a1\2\34\1\uffff\3\34"+
		"\1\u00a6\5\uffff\1\34\1\u00a8\1\u00a9\1\34\1\uffff\1\u00ab\2\uffff\1\u00ac"+
		"\2\uffff";
	static final String DFA6_eofS =
		"\u00ad\uffff";
	static final String DFA6_minS =
		"\1\11\1\145\1\141\1\uffff\1\162\2\uffff\1\157\1\uffff\1\154\1\151\1\141"+
		"\1\151\1\157\1\146\1\151\1\uffff\1\156\1\uffff\1\165\1\150\1\145\1\60"+
		"\3\uffff\1\141\3\uffff\1\154\1\145\3\154\1\165\1\157\1\166\1\157\1\163"+
		"\1\156\1\154\1\157\1\145\1\157\1\156\1\60\1\164\1\151\1\164\1\151\1\145"+
		"\1\165\1\162\2\uffff\1\143\1\157\1\160\2\153\1\163\1\164\1\162\1\147\1"+
		"\145\1\163\1\145\1\153\1\144\1\163\2\156\1\163\1\156\1\142\1\uffff\1\60"+
		"\1\143\1\163\1\170\1\156\1\145\1\153\1\141\2\60\1\141\2\60\1\145\1\60"+
		"\1\162\1\60\1\164\1\60\1\141\2\145\1\60\1\157\1\60\1\164\1\157\1\uffff"+
		"\1\153\4\60\1\141\1\157\2\uffff\1\60\1\167\2\uffff\1\163\1\uffff\1\141"+
		"\1\uffff\1\145\1\uffff\1\164\1\162\1\60\1\uffff\1\60\1\uffff\1\171\1\156"+
		"\1\145\4\uffff\1\144\1\0\1\uffff\1\141\1\145\1\155\3\60\2\uffff\2\60\1"+
		"\162\1\145\1\uffff\1\0\1\171\1\162\1\60\5\uffff\1\163\2\60\1\163\1\uffff"+
		"\1\60\2\uffff\1\60\2\uffff";
	static final String DFA6_maxS =
		"\1\175\1\157\1\151\1\uffff\1\165\2\uffff\1\162\1\uffff\1\154\1\151\1\141"+
		"\1\151\1\165\1\146\1\151\1\uffff\1\156\1\uffff\1\165\1\167\1\145\1\172"+
		"\3\uffff\1\141\3\uffff\1\154\1\145\2\154\1\162\1\165\1\157\1\166\1\157"+
		"\1\163\1\164\1\154\1\157\1\145\1\157\1\165\1\172\1\164\1\151\1\164\1\151"+
		"\1\145\1\165\1\162\2\uffff\1\143\1\157\1\160\2\153\1\163\1\164\1\162\1"+
		"\147\1\145\1\163\1\145\1\153\1\144\1\163\2\156\1\163\1\156\1\142\1\uffff"+
		"\1\172\1\143\1\163\1\170\1\156\1\145\1\153\1\141\2\172\1\171\2\172\1\145"+
		"\1\172\1\162\1\172\1\164\1\172\1\141\2\145\1\172\1\157\1\172\1\164\1\157"+
		"\1\uffff\1\153\4\172\1\141\1\157\2\uffff\1\172\1\167\2\uffff\1\163\1\uffff"+
		"\1\141\1\uffff\1\145\1\uffff\1\164\1\162\1\172\1\uffff\1\172\1\uffff\1"+
		"\171\1\156\1\145\4\uffff\1\144\1\uffff\1\uffff\1\141\1\145\1\155\3\172"+
		"\2\uffff\2\172\1\162\1\145\1\uffff\1\uffff\1\171\1\162\1\172\5\uffff\1"+
		"\163\2\172\1\163\1\uffff\1\172\2\uffff\1\172\2\uffff";
	static final String DFA6_acceptS =
		"\3\uffff\1\3\1\uffff\1\6\1\7\1\uffff\1\12\7\uffff\1\22\1\uffff\1\25\4"+
		"\uffff\1\40\1\42\1\43\1\uffff\1\50\1\47\1\53\30\uffff\1\37\1\51\24\uffff"+
		"\1\20\33\uffff\1\21\7\uffff\1\1\1\10\2\uffff\1\5\1\26\1\uffff\1\4\1\uffff"+
		"\1\11\1\uffff\1\13\3\uffff\1\16\1\uffff\1\32\3\uffff\1\31\1\33\1\44\1"+
		"\45\2\uffff\1\2\6\uffff\1\15\1\17\4\uffff\1\52\4\uffff\1\41\1\14\1\24"+
		"\1\34\1\46\4\uffff\1\36\1\uffff\1\35\1\30\1\uffff\1\23\1\27";
	static final String DFA6_specialS =
		"\u008a\uffff\1\1\16\uffff\1\0\23\uffff}>";
	static final String[] DFA6_transitionS = {
			"\2\35\1\uffff\2\35\22\uffff\1\35\1\uffff\1\10\4\uffff\1\26\1\22\1\30"+
			"\2\uffff\1\6\3\uffff\12\33\1\5\1\31\1\uffff\1\3\3\uffff\32\34\6\uffff"+
			"\1\34\1\15\1\32\1\7\1\11\1\13\2\34\1\16\1\34\1\12\1\14\1\2\1\23\1\34"+
			"\1\4\1\34\1\1\1\21\1\24\1\34\1\25\1\17\3\34\1\20\1\uffff\1\27",
			"\1\37\11\uffff\1\36",
			"\1\42\3\uffff\1\41\3\uffff\1\40",
			"",
			"\1\44\2\uffff\1\43",
			"",
			"",
			"\1\45\2\uffff\1\46",
			"",
			"\1\47",
			"\1\50",
			"\1\51",
			"\1\52",
			"\1\55\2\uffff\1\54\2\uffff\1\53",
			"\1\56",
			"\1\57",
			"",
			"\1\60",
			"",
			"\1\61",
			"\1\63\11\uffff\1\64\4\uffff\1\62",
			"\1\65",
			"\12\67\7\uffff\32\67\6\uffff\32\67",
			"",
			"",
			"",
			"\1\70",
			"",
			"",
			"",
			"\1\71",
			"\1\72",
			"\1\73",
			"\1\74",
			"\1\76\5\uffff\1\75",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\102",
			"\1\103",
			"\1\105\5\uffff\1\104",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\113\6\uffff\1\112",
			"\12\34\7\uffff\32\34\6\uffff\32\34",
			"\1\115",
			"\1\116",
			"\1\117",
			"\1\120",
			"\1\121",
			"\1\122",
			"\1\123",
			"",
			"",
			"\1\124",
			"\1\125",
			"\1\126",
			"\1\127",
			"\1\130",
			"\1\131",
			"\1\132",
			"\1\133",
			"\1\134",
			"\1\135",
			"\1\136",
			"\1\137",
			"\1\140",
			"\1\141",
			"\1\142",
			"\1\143",
			"\1\144",
			"\1\145",
			"\1\146",
			"\1\147",
			"",
			"\12\34\7\uffff\32\34\6\uffff\32\34",
			"\1\151",
			"\1\152",
			"\1\153",
			"\1\154",
			"\1\155",
			"\1\156",
			"\1\157",
			"\12\34\7\uffff\32\34\6\uffff\32\34",
			"\12\34\7\uffff\32\34\6\uffff\32\34",
			"\1\162\27\uffff\1\163",
			"\12\34\7\uffff\32\34\6\uffff\32\34",
			"\12\34\7\uffff\32\34\6\uffff\32\34",
			"\1\166",
			"\12\34\7\uffff\32\34\6\uffff\32\34",
			"\1\170",
			"\12\34\7\uffff\32\34\6\uffff\32\34",
			"\1\172",
			"\12\34\7\uffff\32\34\6\uffff\32\34",
			"\1\174",
			"\1\175",
			"\1\176",
			"\12\34\7\uffff\32\34\6\uffff\32\34",
			"\1\u0080",
			"\12\34\7\uffff\32\34\6\uffff\32\34",
			"\1\u0082",
			"\1\u0083",
			"",
			"\1\u0084",
			"\12\34\7\uffff\32\34\6\uffff\32\34",
			"\12\34\7\uffff\32\34\6\uffff\32\34",
			"\12\34\7\uffff\32\34\6\uffff\32\34",
			"\12\34\7\uffff\32\34\6\uffff\32\34",
			"\1\u0089",
			"\1\u008a",
			"",
			"",
			"\12\34\7\uffff\32\34\6\uffff\32\34",
			"\1\u008c",
			"",
			"",
			"\1\u008d",
			"",
			"\1\u008e",
			"",
			"\1\u008f",
			"",
			"\1\u0090",
			"\1\u0091",
			"\12\34\7\uffff\32\34\6\uffff\32\34",
			"",
			"\12\34\7\uffff\32\34\6\uffff\32\34",
			"",
			"\1\u0094",
			"\1\u0095",
			"\1\u0096",
			"",
			"",
			"",
			"",
			"\1\u0097",
			"\60\u0098\12\u0099\7\u0098\32\u0099\6\u0098\32\u0099\uff85\u0098",
			"",
			"\1\u009a",
			"\1\u009b",
			"\1\u009c",
			"\12\34\7\uffff\32\34\6\uffff\32\34",
			"\12\34\7\uffff\32\34\6\uffff\32\34",
			"\12\34\7\uffff\32\34\6\uffff\32\34",
			"",
			"",
			"\12\34\7\uffff\32\34\6\uffff\32\34",
			"\12\34\7\uffff\32\34\6\uffff\32\34",
			"\1\u00a2",
			"\1\u00a3",
			"",
			"\60\u0098\12\u0099\7\u0098\32\u0099\6\u0098\32\u0099\uff85\u0098",
			"\1\u00a4",
			"\1\u00a5",
			"\12\34\7\uffff\32\34\6\uffff\32\34",
			"",
			"",
			"",
			"",
			"",
			"\1\u00a7",
			"\12\34\7\uffff\32\34\6\uffff\32\34",
			"\12\34\7\uffff\32\34\6\uffff\32\34",
			"\1\u00aa",
			"",
			"\12\34\7\uffff\32\34\6\uffff\32\34",
			"",
			"",
			"\12\34\7\uffff\32\34\6\uffff\32\34",
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
			return "1:1: Tokens : ( AND | ASSIGN | BECOMES | BOOLEAN | CHAR | COLON | COMMA | CONSTANT | DIV | DQUOTATION | ELSE | EQ | FALSE | GREAT | GREATEQ | IF | INTEGER | LCURLY | LESS | LESSEQ | LPAREN | MIN | MOD | MULT | NOT | NOTEQ | OR | PLUS | PRINT | PROGRAM | QUOTATION | RCURLY | READ | RPAREN | SEMICOLON | THEN | TRUE | VAR | IDENTIFIER | NUMBER | CHAR_OPERATOR | COMMENT | WS );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA6_153 = input.LA(1);
						s = -1;
						if ( ((LA6_153 >= '\u0000' && LA6_153 <= '/')||(LA6_153 >= ':' && LA6_153 <= '@')||(LA6_153 >= '[' && LA6_153 <= '`')||(LA6_153 >= '{' && LA6_153 <= '\uFFFF')) ) {s = 152;}
						else if ( ((LA6_153 >= '0' && LA6_153 <= '9')||(LA6_153 >= 'A' && LA6_153 <= 'Z')||(LA6_153 >= 'a' && LA6_153 <= 'z')) ) {s = 153;}
						else s = 28;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA6_138 = input.LA(1);
						s = -1;
						if ( ((LA6_138 >= '\u0000' && LA6_138 <= '/')||(LA6_138 >= ':' && LA6_138 <= '@')||(LA6_138 >= '[' && LA6_138 <= '`')||(LA6_138 >= '{' && LA6_138 <= '\uFFFF')) ) {s = 152;}
						else if ( ((LA6_138 >= '0' && LA6_138 <= '9')||(LA6_138 >= 'A' && LA6_138 <= 'Z')||(LA6_138 >= 'a' && LA6_138 <= 'z')) ) {s = 153;}
						else s = 28;
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
