// Generated from fr/insset/jeanluc/gel/GelLexer.g4 by ANTLR 4.5.3
package fr.insset.jeanluc.gel;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GelLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Self=1, IntegerLiteral=2, FloatingPointLiteral=3, BooleanLiteral=4, DateLiteral=5, 
		CharacterLiteral=6, StringLiteral=7, NullLiteral=8, LPAREN=9, RPAREN=10, 
		START_EXP=11, LBRACE=12, RBRACE=13, LBRACK=14, RBRACK=15, SEMI=16, COMMA=17, 
		DOT=18, ARROW=19, LEFT_ARROW=20, PIPE=21, GT=22, LT=23, NOT=24, TILDE=25, 
		QUESTION=26, COLON=27, DOUBLE_COLON=28, EQUAL=29, LE=30, GE=31, NOTEQUAL=32, 
		AND=33, OR=34, XOR=35, ADD=36, SUB=37, MUL=38, DIV=39, MOD_PERCENT=40, 
		CARET=41, MOD=42, SEQUENCE=43, BAG=44, SET=45, ORDERED=46, Identifier=47, 
		ELLIPSIS=48, WS=49, COMMENT=50, LINE_COMMENT=51;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Self", "IntegerLiteral", "DecimalIntegerLiteral", "HexIntegerLiteral", 
		"OctalIntegerLiteral", "BinaryIntegerLiteral", "IntegerTypeSuffix", "DecimalNumeral", 
		"Digits", "Digit", "NonZeroDigit", "DigitOrUnderscore", "Underscores", 
		"HexNumeral", "HexDigits", "HexDigit", "HexDigitOrUnderscore", "OctalNumeral", 
		"OctalDigits", "OctalDigit", "OctalDigitOrUnderscore", "BinaryNumeral", 
		"BinaryDigits", "BinaryDigit", "BinaryDigitOrUnderscore", "FloatingPointLiteral", 
		"DecimalFloatingPointLiteral", "ExponentPart", "ExponentIndicator", "SignedInteger", 
		"Sign", "FloatTypeSuffix", "HexadecimalFloatingPointLiteral", "HexSignificand", 
		"BinaryExponent", "BinaryExponentIndicator", "BooleanLiteral", "DateLiteral", 
		"CharacterLiteral", "SingleCharacter", "StringLiteral", "StringCharacters", 
		"StringCharacter", "EscapeSequence", "OctalEscape", "UnicodeEscape", "ZeroToThree", 
		"NullLiteral", "LPAREN", "RPAREN", "START_EXP", "LBRACE", "RBRACE", "LBRACK", 
		"RBRACK", "SEMI", "COMMA", "DOT", "ARROW", "LEFT_ARROW", "PIPE", "GT", 
		"LT", "NOT", "TILDE", "QUESTION", "COLON", "DOUBLE_COLON", "EQUAL", "LE", 
		"GE", "NOTEQUAL", "AND", "OR", "XOR", "ADD", "SUB", "MUL", "DIV", "MOD_PERCENT", 
		"CARET", "MOD", "SEQUENCE", "BAG", "SET", "ORDERED", "Identifier", "JavaLetter", 
		"JavaLetterOrDigit", "ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'self'", null, null, null, null, null, null, "'null'", "'('", "')'", 
		"'#{'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'->'", "'<-'", 
		"'|'", "'>'", "'<'", "'not'", "'~'", "'?'", "':'", "'::'", "'='", "'<='", 
		"'>='", "'<>'", "'and'", "'or'", "'xor'", "'+'", "'-'", "'*'", "'/'", 
		"'%'", "'^'", "'mod'", "'sequence'", "'bag'", "'set'", "'ordered'", null, 
		"'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Self", "IntegerLiteral", "FloatingPointLiteral", "BooleanLiteral", 
		"DateLiteral", "CharacterLiteral", "StringLiteral", "NullLiteral", "LPAREN", 
		"RPAREN", "START_EXP", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", 
		"COMMA", "DOT", "ARROW", "LEFT_ARROW", "PIPE", "GT", "LT", "NOT", "TILDE", 
		"QUESTION", "COLON", "DOUBLE_COLON", "EQUAL", "LE", "GE", "NOTEQUAL", 
		"AND", "OR", "XOR", "ADD", "SUB", "MUL", "DIV", "MOD_PERCENT", "CARET", 
		"MOD", "SEQUENCE", "BAG", "SET", "ORDERED", "Identifier", "ELLIPSIS", 
		"WS", "COMMENT", "LINE_COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public GelLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GelLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 87:
			return JavaLetter_sempred((RuleContext)_localctx, predIndex);
		case 88:
			return JavaLetterOrDigit_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean JavaLetter_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return Character.isJavaIdentifierStart(_input.LA(-1));
		case 1:
			return Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}
	private boolean JavaLetterOrDigit_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return Character.isJavaIdentifierPart(_input.LA(-1));
		case 3:
			return Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\65\u027f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\t"+
		"T\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3\u00c7\n\3\3\4\3\4\5\4\u00cb\n\4\3\5"+
		"\3\5\5\5\u00cf\n\5\3\6\3\6\5\6\u00d3\n\6\3\7\3\7\5\7\u00d7\n\7\3\b\3\b"+
		"\3\t\3\t\3\t\5\t\u00de\n\t\3\t\3\t\3\t\5\t\u00e3\n\t\5\t\u00e5\n\t\3\n"+
		"\3\n\7\n\u00e9\n\n\f\n\16\n\u00ec\13\n\3\n\5\n\u00ef\n\n\3\13\3\13\5\13"+
		"\u00f3\n\13\3\f\3\f\3\r\3\r\5\r\u00f9\n\r\3\16\6\16\u00fc\n\16\r\16\16"+
		"\16\u00fd\3\17\3\17\3\17\3\17\3\20\3\20\7\20\u0106\n\20\f\20\16\20\u0109"+
		"\13\20\3\20\5\20\u010c\n\20\3\21\3\21\3\22\3\22\5\22\u0112\n\22\3\23\3"+
		"\23\5\23\u0116\n\23\3\23\3\23\3\24\3\24\7\24\u011c\n\24\f\24\16\24\u011f"+
		"\13\24\3\24\5\24\u0122\n\24\3\25\3\25\3\26\3\26\5\26\u0128\n\26\3\27\3"+
		"\27\3\27\3\27\3\30\3\30\7\30\u0130\n\30\f\30\16\30\u0133\13\30\3\30\5"+
		"\30\u0136\n\30\3\31\3\31\3\32\3\32\5\32\u013c\n\32\3\33\3\33\5\33\u0140"+
		"\n\33\3\34\3\34\3\34\5\34\u0145\n\34\3\34\5\34\u0148\n\34\3\34\5\34\u014b"+
		"\n\34\3\34\3\34\3\34\5\34\u0150\n\34\3\34\5\34\u0153\n\34\3\34\3\34\3"+
		"\34\5\34\u0158\n\34\3\34\3\34\3\34\5\34\u015d\n\34\3\35\3\35\3\35\3\36"+
		"\3\36\3\37\5\37\u0165\n\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\5\"\u0170"+
		"\n\"\3#\3#\5#\u0174\n#\3#\3#\3#\5#\u0179\n#\3#\3#\5#\u017d\n#\3$\3$\3"+
		"$\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u018d\n&\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\5(\u01a4\n(\3)\3"+
		")\3*\3*\5*\u01aa\n*\3*\3*\3+\6+\u01af\n+\r+\16+\u01b0\3,\3,\5,\u01b5\n"+
		",\3-\3-\3-\3-\5-\u01bb\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u01c8\n"+
		".\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3"+
		"\63\3\63\3\64\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3"+
		":\3;\3;\3<\3<\3<\3=\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3A\3A\3B\3B\3C\3C\3"+
		"D\3D\3E\3E\3E\3F\3F\3G\3G\3G\3H\3H\3H\3I\3I\3I\3J\3J\3J\3J\3K\3K\3K\3"+
		"L\3L\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3S\3S\3T\3T\3T\3"+
		"T\3T\3T\3T\3T\3T\3U\3U\3U\3U\3V\3V\3V\3V\3W\3W\3W\3W\3W\3W\3W\3W\3X\3"+
		"X\7X\u0247\nX\fX\16X\u024a\13X\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u0252\nY\3Z\3Z\3Z"+
		"\3Z\3Z\3Z\5Z\u025a\nZ\3[\3[\3[\3[\3\\\6\\\u0261\n\\\r\\\16\\\u0262\3\\"+
		"\3\\\3]\3]\3]\3]\7]\u026b\n]\f]\16]\u026e\13]\3]\3]\3]\3]\3]\3^\3^\3^"+
		"\3^\7^\u0279\n^\f^\16^\u027c\13^\3^\3^\3\u026c\2_\3\3\5\4\7\2\t\2\13\2"+
		"\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-"+
		"\2/\2\61\2\63\2\65\5\67\29\2;\2=\2?\2A\2C\2E\2G\2I\2K\6M\7O\bQ\2S\tU\2"+
		"W\2Y\2[\2]\2_\2a\nc\13e\fg\ri\16k\17m\20o\21q\22s\23u\24w\25y\26{\27}"+
		"\30\177\31\u0081\32\u0083\33\u0085\34\u0087\35\u0089\36\u008b\37\u008d"+
		" \u008f!\u0091\"\u0093#\u0095$\u0097%\u0099&\u009b\'\u009d(\u009f)\u00a1"+
		"*\u00a3+\u00a5,\u00a7-\u00a9.\u00ab/\u00ad\60\u00af\61\u00b1\2\u00b3\2"+
		"\u00b5\62\u00b7\63\u00b9\64\u00bb\65\3\2\30\4\2NNnn\3\2\63;\4\2ZZzz\5"+
		"\2\62;CHch\3\2\629\4\2DDdd\3\2\62\63\4\2GGgg\4\2--//\6\2FFHHffhh\4\2R"+
		"Rrr\4\2))^^\4\2$$^^\n\2$$))^^ddhhppttvv\3\2\62\65\6\2&&C\\aac|\4\2\2\u0101"+
		"\ud802\udc01\3\2\ud802\udc01\3\2\udc02\ue001\7\2&&\62;C\\aac|\5\2\13\f"+
		"\16\17\"\"\4\2\f\f\17\17\u028d\2\3\3\2\2\2\2\5\3\2\2\2\2\65\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2S\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2"+
		"\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3"+
		"\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2"+
		"\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099"+
		"\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2"+
		"\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab"+
		"\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2"+
		"\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\3\u00bd\3\2\2\2\5\u00c6\3\2\2\2\7\u00c8"+
		"\3\2\2\2\t\u00cc\3\2\2\2\13\u00d0\3\2\2\2\r\u00d4\3\2\2\2\17\u00d8\3\2"+
		"\2\2\21\u00e4\3\2\2\2\23\u00e6\3\2\2\2\25\u00f2\3\2\2\2\27\u00f4\3\2\2"+
		"\2\31\u00f8\3\2\2\2\33\u00fb\3\2\2\2\35\u00ff\3\2\2\2\37\u0103\3\2\2\2"+
		"!\u010d\3\2\2\2#\u0111\3\2\2\2%\u0113\3\2\2\2\'\u0119\3\2\2\2)\u0123\3"+
		"\2\2\2+\u0127\3\2\2\2-\u0129\3\2\2\2/\u012d\3\2\2\2\61\u0137\3\2\2\2\63"+
		"\u013b\3\2\2\2\65\u013f\3\2\2\2\67\u015c\3\2\2\29\u015e\3\2\2\2;\u0161"+
		"\3\2\2\2=\u0164\3\2\2\2?\u0168\3\2\2\2A\u016a\3\2\2\2C\u016c\3\2\2\2E"+
		"\u017c\3\2\2\2G\u017e\3\2\2\2I\u0181\3\2\2\2K\u018c\3\2\2\2M\u018e\3\2"+
		"\2\2O\u01a3\3\2\2\2Q\u01a5\3\2\2\2S\u01a7\3\2\2\2U\u01ae\3\2\2\2W\u01b4"+
		"\3\2\2\2Y\u01ba\3\2\2\2[\u01c7\3\2\2\2]\u01c9\3\2\2\2_\u01d0\3\2\2\2a"+
		"\u01d2\3\2\2\2c\u01d7\3\2\2\2e\u01d9\3\2\2\2g\u01db\3\2\2\2i\u01de\3\2"+
		"\2\2k\u01e0\3\2\2\2m\u01e2\3\2\2\2o\u01e4\3\2\2\2q\u01e6\3\2\2\2s\u01e8"+
		"\3\2\2\2u\u01ea\3\2\2\2w\u01ec\3\2\2\2y\u01ef\3\2\2\2{\u01f2\3\2\2\2}"+
		"\u01f4\3\2\2\2\177\u01f6\3\2\2\2\u0081\u01f8\3\2\2\2\u0083\u01fc\3\2\2"+
		"\2\u0085\u01fe\3\2\2\2\u0087\u0200\3\2\2\2\u0089\u0202\3\2\2\2\u008b\u0205"+
		"\3\2\2\2\u008d\u0207\3\2\2\2\u008f\u020a\3\2\2\2\u0091\u020d\3\2\2\2\u0093"+
		"\u0210\3\2\2\2\u0095\u0214\3\2\2\2\u0097\u0217\3\2\2\2\u0099\u021b\3\2"+
		"\2\2\u009b\u021d\3\2\2\2\u009d\u021f\3\2\2\2\u009f\u0221\3\2\2\2\u00a1"+
		"\u0223\3\2\2\2\u00a3\u0225\3\2\2\2\u00a5\u0227\3\2\2\2\u00a7\u022b\3\2"+
		"\2\2\u00a9\u0234\3\2\2\2\u00ab\u0238\3\2\2\2\u00ad\u023c\3\2\2\2\u00af"+
		"\u0244\3\2\2\2\u00b1\u0251\3\2\2\2\u00b3\u0259\3\2\2\2\u00b5\u025b\3\2"+
		"\2\2\u00b7\u0260\3\2\2\2\u00b9\u0266\3\2\2\2\u00bb\u0274\3\2\2\2\u00bd"+
		"\u00be\7u\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7n\2\2\u00c0\u00c1\7h\2\2"+
		"\u00c1\4\3\2\2\2\u00c2\u00c7\5\7\4\2\u00c3\u00c7\5\t\5\2\u00c4\u00c7\5"+
		"\13\6\2\u00c5\u00c7\5\r\7\2\u00c6\u00c2\3\2\2\2\u00c6\u00c3\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\6\3\2\2\2\u00c8\u00ca\5\21\t"+
		"\2\u00c9\u00cb\5\17\b\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\b\3\2\2\2\u00cc\u00ce\5\35\17\2\u00cd\u00cf\5\17\b\2\u00ce\u00cd\3\2"+
		"\2\2\u00ce\u00cf\3\2\2\2\u00cf\n\3\2\2\2\u00d0\u00d2\5%\23\2\u00d1\u00d3"+
		"\5\17\b\2\u00d2\u00d1\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\f\3\2\2\2\u00d4"+
		"\u00d6\5-\27\2\u00d5\u00d7\5\17\b\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3"+
		"\2\2\2\u00d7\16\3\2\2\2\u00d8\u00d9\t\2\2\2\u00d9\20\3\2\2\2\u00da\u00e5"+
		"\7\62\2\2\u00db\u00e2\5\27\f\2\u00dc\u00de\5\23\n\2\u00dd\u00dc\3\2\2"+
		"\2\u00dd\u00de\3\2\2\2\u00de\u00e3\3\2\2\2\u00df\u00e0\5\33\16\2\u00e0"+
		"\u00e1\5\23\n\2\u00e1\u00e3\3\2\2\2\u00e2\u00dd\3\2\2\2\u00e2\u00df\3"+
		"\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00da\3\2\2\2\u00e4\u00db\3\2\2\2\u00e5"+
		"\22\3\2\2\2\u00e6\u00ee\5\25\13\2\u00e7\u00e9\5\31\r\2\u00e8\u00e7\3\2"+
		"\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00ed\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ef\5\25\13\2\u00ee\u00ea\3"+
		"\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\24\3\2\2\2\u00f0\u00f3\7\62\2\2\u00f1"+
		"\u00f3\5\27\f\2\u00f2\u00f0\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3\26\3\2\2"+
		"\2\u00f4\u00f5\t\3\2\2\u00f5\30\3\2\2\2\u00f6\u00f9\5\25\13\2\u00f7\u00f9"+
		"\7a\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\32\3\2\2\2\u00fa"+
		"\u00fc\7a\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fb\3\2"+
		"\2\2\u00fd\u00fe\3\2\2\2\u00fe\34\3\2\2\2\u00ff\u0100\7\62\2\2\u0100\u0101"+
		"\t\4\2\2\u0101\u0102\5\37\20\2\u0102\36\3\2\2\2\u0103\u010b\5!\21\2\u0104"+
		"\u0106\5#\22\2\u0105\u0104\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2"+
		"\2\2\u0107\u0108\3\2\2\2\u0108\u010a\3\2\2\2\u0109\u0107\3\2\2\2\u010a"+
		"\u010c\5!\21\2\u010b\u0107\3\2\2\2\u010b\u010c\3\2\2\2\u010c \3\2\2\2"+
		"\u010d\u010e\t\5\2\2\u010e\"\3\2\2\2\u010f\u0112\5!\21\2\u0110\u0112\7"+
		"a\2\2\u0111\u010f\3\2\2\2\u0111\u0110\3\2\2\2\u0112$\3\2\2\2\u0113\u0115"+
		"\7\62\2\2\u0114\u0116\5\33\16\2\u0115\u0114\3\2\2\2\u0115\u0116\3\2\2"+
		"\2\u0116\u0117\3\2\2\2\u0117\u0118\5\'\24\2\u0118&\3\2\2\2\u0119\u0121"+
		"\5)\25\2\u011a\u011c\5+\26\2\u011b\u011a\3\2\2\2\u011c\u011f\3\2\2\2\u011d"+
		"\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120\3\2\2\2\u011f\u011d\3\2"+
		"\2\2\u0120\u0122\5)\25\2\u0121\u011d\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		"(\3\2\2\2\u0123\u0124\t\6\2\2\u0124*\3\2\2\2\u0125\u0128\5)\25\2\u0126"+
		"\u0128\7a\2\2\u0127\u0125\3\2\2\2\u0127\u0126\3\2\2\2\u0128,\3\2\2\2\u0129"+
		"\u012a\7\62\2\2\u012a\u012b\t\7\2\2\u012b\u012c\5/\30\2\u012c.\3\2\2\2"+
		"\u012d\u0135\5\61\31\2\u012e\u0130\5\63\32\2\u012f\u012e\3\2\2\2\u0130"+
		"\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134\3\2"+
		"\2\2\u0133\u0131\3\2\2\2\u0134\u0136\5\61\31\2\u0135\u0131\3\2\2\2\u0135"+
		"\u0136\3\2\2\2\u0136\60\3\2\2\2\u0137\u0138\t\b\2\2\u0138\62\3\2\2\2\u0139"+
		"\u013c\5\61\31\2\u013a\u013c\7a\2\2\u013b\u0139\3\2\2\2\u013b\u013a\3"+
		"\2\2\2\u013c\64\3\2\2\2\u013d\u0140\5\67\34\2\u013e\u0140\5C\"\2\u013f"+
		"\u013d\3\2\2\2\u013f\u013e\3\2\2\2\u0140\66\3\2\2\2\u0141\u0142\5\23\n"+
		"\2\u0142\u0144\7\60\2\2\u0143\u0145\5\23\n\2\u0144\u0143\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145\u0147\3\2\2\2\u0146\u0148\59\35\2\u0147\u0146\3\2"+
		"\2\2\u0147\u0148\3\2\2\2\u0148\u014a\3\2\2\2\u0149\u014b\5A!\2\u014a\u0149"+
		"\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u015d\3\2\2\2\u014c\u014d\7\60\2\2"+
		"\u014d\u014f\5\23\n\2\u014e\u0150\59\35\2\u014f\u014e\3\2\2\2\u014f\u0150"+
		"\3\2\2\2\u0150\u0152\3\2\2\2\u0151\u0153\5A!\2\u0152\u0151\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u0153\u015d\3\2\2\2\u0154\u0155\5\23\n\2\u0155\u0157\5"+
		"9\35\2\u0156\u0158\5A!\2\u0157\u0156\3\2\2\2\u0157\u0158\3\2\2\2\u0158"+
		"\u015d\3\2\2\2\u0159\u015a\5\23\n\2\u015a\u015b\5A!\2\u015b\u015d\3\2"+
		"\2\2\u015c\u0141\3\2\2\2\u015c\u014c\3\2\2\2\u015c\u0154\3\2\2\2\u015c"+
		"\u0159\3\2\2\2\u015d8\3\2\2\2\u015e\u015f\5;\36\2\u015f\u0160\5=\37\2"+
		"\u0160:\3\2\2\2\u0161\u0162\t\t\2\2\u0162<\3\2\2\2\u0163\u0165\5? \2\u0164"+
		"\u0163\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\5\23"+
		"\n\2\u0167>\3\2\2\2\u0168\u0169\t\n\2\2\u0169@\3\2\2\2\u016a\u016b\t\13"+
		"\2\2\u016bB\3\2\2\2\u016c\u016d\5E#\2\u016d\u016f\5G$\2\u016e\u0170\5"+
		"A!\2\u016f\u016e\3\2\2\2\u016f\u0170\3\2\2\2\u0170D\3\2\2\2\u0171\u0173"+
		"\5\35\17\2\u0172\u0174\7\60\2\2\u0173\u0172\3\2\2\2\u0173\u0174\3\2\2"+
		"\2\u0174\u017d\3\2\2\2\u0175\u0176\7\62\2\2\u0176\u0178\t\4\2\2\u0177"+
		"\u0179\5\37\20\2\u0178\u0177\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a\3"+
		"\2\2\2\u017a\u017b\7\60\2\2\u017b\u017d\5\37\20\2\u017c\u0171\3\2\2\2"+
		"\u017c\u0175\3\2\2\2\u017dF\3\2\2\2\u017e\u017f\5I%\2\u017f\u0180\5=\37"+
		"\2\u0180H\3\2\2\2\u0181\u0182\t\f\2\2\u0182J\3\2\2\2\u0183\u0184\7v\2"+
		"\2\u0184\u0185\7t\2\2\u0185\u0186\7w\2\2\u0186\u018d\7g\2\2\u0187\u0188"+
		"\7h\2\2\u0188\u0189\7c\2\2\u0189\u018a\7n\2\2\u018a\u018b\7u\2\2\u018b"+
		"\u018d\7g\2\2\u018c\u0183\3\2\2\2\u018c\u0187\3\2\2\2\u018dL\3\2\2\2\u018e"+
		"\u018f\7$\2\2\u018f\u0190\5\25\13\2\u0190\u0191\5\25\13\2\u0191\u0192"+
		"\5\25\13\2\u0192\u0193\5\25\13\2\u0193\u0194\5\u009bN\2\u0194\u0195\5"+
		"\25\13\2\u0195\u0196\5\25\13\2\u0196\u0197\5\u009bN\2\u0197\u0198\5\25"+
		"\13\2\u0198\u0199\5\25\13\2\u0199\u019a\7$\2\2\u019aN\3\2\2\2\u019b\u019c"+
		"\7)\2\2\u019c\u019d\5Q)\2\u019d\u019e\7)\2\2\u019e\u01a4\3\2\2\2\u019f"+
		"\u01a0\7)\2\2\u01a0\u01a1\5Y-\2\u01a1\u01a2\7)\2\2\u01a2\u01a4\3\2\2\2"+
		"\u01a3\u019b\3\2\2\2\u01a3\u019f\3\2\2\2\u01a4P\3\2\2\2\u01a5\u01a6\n"+
		"\r\2\2\u01a6R\3\2\2\2\u01a7\u01a9\7$\2\2\u01a8\u01aa\5U+\2\u01a9\u01a8"+
		"\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\7$\2\2\u01ac"+
		"T\3\2\2\2\u01ad\u01af\5W,\2\u01ae\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0"+
		"\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1V\3\2\2\2\u01b2\u01b5\n\16\2\2"+
		"\u01b3\u01b5\5Y-\2\u01b4\u01b2\3\2\2\2\u01b4\u01b3\3\2\2\2\u01b5X\3\2"+
		"\2\2\u01b6\u01b7\7^\2\2\u01b7\u01bb\t\17\2\2\u01b8\u01bb\5[.\2\u01b9\u01bb"+
		"\5]/\2\u01ba\u01b6\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01b9\3\2\2\2\u01bb"+
		"Z\3\2\2\2\u01bc\u01bd\7^\2\2\u01bd\u01c8\5)\25\2\u01be\u01bf\7^\2\2\u01bf"+
		"\u01c0\5)\25\2\u01c0\u01c1\5)\25\2\u01c1\u01c8\3\2\2\2\u01c2\u01c3\7^"+
		"\2\2\u01c3\u01c4\5_\60\2\u01c4\u01c5\5)\25\2\u01c5\u01c6\5)\25\2\u01c6"+
		"\u01c8\3\2\2\2\u01c7\u01bc\3\2\2\2\u01c7\u01be\3\2\2\2\u01c7\u01c2\3\2"+
		"\2\2\u01c8\\\3\2\2\2\u01c9\u01ca\7^\2\2\u01ca\u01cb\7w\2\2\u01cb\u01cc"+
		"\5!\21\2\u01cc\u01cd\5!\21\2\u01cd\u01ce\5!\21\2\u01ce\u01cf\5!\21\2\u01cf"+
		"^\3\2\2\2\u01d0\u01d1\t\20\2\2\u01d1`\3\2\2\2\u01d2\u01d3\7p\2\2\u01d3"+
		"\u01d4\7w\2\2\u01d4\u01d5\7n\2\2\u01d5\u01d6\7n\2\2\u01d6b\3\2\2\2\u01d7"+
		"\u01d8\7*\2\2\u01d8d\3\2\2\2\u01d9\u01da\7+\2\2\u01daf\3\2\2\2\u01db\u01dc"+
		"\7%\2\2\u01dc\u01dd\7}\2\2\u01ddh\3\2\2\2\u01de\u01df\7}\2\2\u01dfj\3"+
		"\2\2\2\u01e0\u01e1\7\177\2\2\u01e1l\3\2\2\2\u01e2\u01e3\7]\2\2\u01e3n"+
		"\3\2\2\2\u01e4\u01e5\7_\2\2\u01e5p\3\2\2\2\u01e6\u01e7\7=\2\2\u01e7r\3"+
		"\2\2\2\u01e8\u01e9\7.\2\2\u01e9t\3\2\2\2\u01ea\u01eb\7\60\2\2\u01ebv\3"+
		"\2\2\2\u01ec\u01ed\7/\2\2\u01ed\u01ee\7@\2\2\u01eex\3\2\2\2\u01ef\u01f0"+
		"\7>\2\2\u01f0\u01f1\7/\2\2\u01f1z\3\2\2\2\u01f2\u01f3\7~\2\2\u01f3|\3"+
		"\2\2\2\u01f4\u01f5\7@\2\2\u01f5~\3\2\2\2\u01f6\u01f7\7>\2\2\u01f7\u0080"+
		"\3\2\2\2\u01f8\u01f9\7p\2\2\u01f9\u01fa\7q\2\2\u01fa\u01fb\7v\2\2\u01fb"+
		"\u0082\3\2\2\2\u01fc\u01fd\7\u0080\2\2\u01fd\u0084\3\2\2\2\u01fe\u01ff"+
		"\7A\2\2\u01ff\u0086\3\2\2\2\u0200\u0201\7<\2\2\u0201\u0088\3\2\2\2\u0202"+
		"\u0203\7<\2\2\u0203\u0204\7<\2\2\u0204\u008a\3\2\2\2\u0205\u0206\7?\2"+
		"\2\u0206\u008c\3\2\2\2\u0207\u0208\7>\2\2\u0208\u0209\7?\2\2\u0209\u008e"+
		"\3\2\2\2\u020a\u020b\7@\2\2\u020b\u020c\7?\2\2\u020c\u0090\3\2\2\2\u020d"+
		"\u020e\7>\2\2\u020e\u020f\7@\2\2\u020f\u0092\3\2\2\2\u0210\u0211\7c\2"+
		"\2\u0211\u0212\7p\2\2\u0212\u0213\7f\2\2\u0213\u0094\3\2\2\2\u0214\u0215"+
		"\7q\2\2\u0215\u0216\7t\2\2\u0216\u0096\3\2\2\2\u0217\u0218\7z\2\2\u0218"+
		"\u0219\7q\2\2\u0219\u021a\7t\2\2\u021a\u0098\3\2\2\2\u021b\u021c\7-\2"+
		"\2\u021c\u009a\3\2\2\2\u021d\u021e\7/\2\2\u021e\u009c\3\2\2\2\u021f\u0220"+
		"\7,\2\2\u0220\u009e\3\2\2\2\u0221\u0222\7\61\2\2\u0222\u00a0\3\2\2\2\u0223"+
		"\u0224\7\'\2\2\u0224\u00a2\3\2\2\2\u0225\u0226\7`\2\2\u0226\u00a4\3\2"+
		"\2\2\u0227\u0228\7o\2\2\u0228\u0229\7q\2\2\u0229\u022a\7f\2\2\u022a\u00a6"+
		"\3\2\2\2\u022b\u022c\7u\2\2\u022c\u022d\7g\2\2\u022d\u022e\7s\2\2\u022e"+
		"\u022f\7w\2\2\u022f\u0230\7g\2\2\u0230\u0231\7p\2\2\u0231\u0232\7e\2\2"+
		"\u0232\u0233\7g\2\2\u0233\u00a8\3\2\2\2\u0234\u0235\7d\2\2\u0235\u0236"+
		"\7c\2\2\u0236\u0237\7i\2\2\u0237\u00aa\3\2\2\2\u0238\u0239\7u\2\2\u0239"+
		"\u023a\7g\2\2\u023a\u023b\7v\2\2\u023b\u00ac\3\2\2\2\u023c\u023d\7q\2"+
		"\2\u023d\u023e\7t\2\2\u023e\u023f\7f\2\2\u023f\u0240\7g\2\2\u0240\u0241"+
		"\7t\2\2\u0241\u0242\7g\2\2\u0242\u0243\7f\2\2\u0243\u00ae\3\2\2\2\u0244"+
		"\u0248\5\u00b1Y\2\u0245\u0247\5\u00b3Z\2\u0246\u0245\3\2\2\2\u0247\u024a"+
		"\3\2\2\2\u0248\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u00b0\3\2\2\2\u024a"+
		"\u0248\3\2\2\2\u024b\u0252\t\21\2\2\u024c\u024d\n\22\2\2\u024d\u0252\6"+
		"Y\2\2\u024e\u024f\t\23\2\2\u024f\u0250\t\24\2\2\u0250\u0252\6Y\3\2\u0251"+
		"\u024b\3\2\2\2\u0251\u024c\3\2\2\2\u0251\u024e\3\2\2\2\u0252\u00b2\3\2"+
		"\2\2\u0253\u025a\t\25\2\2\u0254\u0255\n\22\2\2\u0255\u025a\6Z\4\2\u0256"+
		"\u0257\t\23\2\2\u0257\u0258\t\24\2\2\u0258\u025a\6Z\5\2\u0259\u0253\3"+
		"\2\2\2\u0259\u0254\3\2\2\2\u0259\u0256\3\2\2\2\u025a\u00b4\3\2\2\2\u025b"+
		"\u025c\7\60\2\2\u025c\u025d\7\60\2\2\u025d\u025e\7\60\2\2\u025e\u00b6"+
		"\3\2\2\2\u025f\u0261\t\26\2\2\u0260\u025f\3\2\2\2\u0261\u0262\3\2\2\2"+
		"\u0262\u0260\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0265"+
		"\b\\\2\2\u0265\u00b8\3\2\2\2\u0266\u0267\7\61\2\2\u0267\u0268\7,\2\2\u0268"+
		"\u026c\3\2\2\2\u0269\u026b\13\2\2\2\u026a\u0269\3\2\2\2\u026b\u026e\3"+
		"\2\2\2\u026c\u026d\3\2\2\2\u026c\u026a\3\2\2\2\u026d\u026f\3\2\2\2\u026e"+
		"\u026c\3\2\2\2\u026f\u0270\7,\2\2\u0270\u0271\7\61\2\2\u0271\u0272\3\2"+
		"\2\2\u0272\u0273\b]\2\2\u0273\u00ba\3\2\2\2\u0274\u0275\7/\2\2\u0275\u0276"+
		"\7/\2\2\u0276\u027a\3\2\2\2\u0277\u0279\n\27\2\2\u0278\u0277\3\2\2\2\u0279"+
		"\u027c\3\2\2\2\u027a\u0278\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u027d\3\2"+
		"\2\2\u027c\u027a\3\2\2\2\u027d\u027e\b^\2\2\u027e\u00bc\3\2\2\2\64\2\u00c6"+
		"\u00ca\u00ce\u00d2\u00d6\u00dd\u00e2\u00e4\u00ea\u00ee\u00f2\u00f8\u00fd"+
		"\u0107\u010b\u0111\u0115\u011d\u0121\u0127\u0131\u0135\u013b\u013f\u0144"+
		"\u0147\u014a\u014f\u0152\u0157\u015c\u0164\u016f\u0173\u0178\u017c\u018c"+
		"\u01a3\u01a9\u01b0\u01b4\u01ba\u01c7\u0248\u0251\u0259\u0262\u026c\u027a"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}