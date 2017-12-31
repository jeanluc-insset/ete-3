// Generated from fr/insset/jeanluc/ete/gel/GelLexer.g4 by ANTLR 4.5.3
package fr.insset.jeanluc.ete.gel;
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
		AT=48, ELLIPSIS=49, WS=50, COMMENT=51, LINE_COMMENT=52;
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
		"JavaLetterOrDigit", "AT", "ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'self'", null, null, null, null, null, null, "'null'", "'('", "')'", 
		"'#{'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'->'", "'<-'", 
		"'|'", "'>'", "'<'", "'not'", "'~'", "'?'", "':'", "'::'", "'='", "'<='", 
		"'>='", "'<>'", "'and'", "'or'", "'xor'", "'+'", "'-'", "'*'", "'/'", 
		"'%'", "'^'", "'mod'", "'sequence'", "'bag'", "'set'", "'ordered'", null, 
		"'@'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Self", "IntegerLiteral", "FloatingPointLiteral", "BooleanLiteral", 
		"DateLiteral", "CharacterLiteral", "StringLiteral", "NullLiteral", "LPAREN", 
		"RPAREN", "START_EXP", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", 
		"COMMA", "DOT", "ARROW", "LEFT_ARROW", "PIPE", "GT", "LT", "NOT", "TILDE", 
		"QUESTION", "COLON", "DOUBLE_COLON", "EQUAL", "LE", "GE", "NOTEQUAL", 
		"AND", "OR", "XOR", "ADD", "SUB", "MUL", "DIV", "MOD_PERCENT", "CARET", 
		"MOD", "SEQUENCE", "BAG", "SET", "ORDERED", "Identifier", "AT", "ELLIPSIS", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\66\u0283\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\t"+
		"T\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3\u00c9\n\3\3\4\3\4\5\4\u00cd\n"+
		"\4\3\5\3\5\5\5\u00d1\n\5\3\6\3\6\5\6\u00d5\n\6\3\7\3\7\5\7\u00d9\n\7\3"+
		"\b\3\b\3\t\3\t\3\t\5\t\u00e0\n\t\3\t\3\t\3\t\5\t\u00e5\n\t\5\t\u00e7\n"+
		"\t\3\n\3\n\7\n\u00eb\n\n\f\n\16\n\u00ee\13\n\3\n\5\n\u00f1\n\n\3\13\3"+
		"\13\5\13\u00f5\n\13\3\f\3\f\3\r\3\r\5\r\u00fb\n\r\3\16\6\16\u00fe\n\16"+
		"\r\16\16\16\u00ff\3\17\3\17\3\17\3\17\3\20\3\20\7\20\u0108\n\20\f\20\16"+
		"\20\u010b\13\20\3\20\5\20\u010e\n\20\3\21\3\21\3\22\3\22\5\22\u0114\n"+
		"\22\3\23\3\23\5\23\u0118\n\23\3\23\3\23\3\24\3\24\7\24\u011e\n\24\f\24"+
		"\16\24\u0121\13\24\3\24\5\24\u0124\n\24\3\25\3\25\3\26\3\26\5\26\u012a"+
		"\n\26\3\27\3\27\3\27\3\27\3\30\3\30\7\30\u0132\n\30\f\30\16\30\u0135\13"+
		"\30\3\30\5\30\u0138\n\30\3\31\3\31\3\32\3\32\5\32\u013e\n\32\3\33\3\33"+
		"\5\33\u0142\n\33\3\34\3\34\3\34\5\34\u0147\n\34\3\34\5\34\u014a\n\34\3"+
		"\34\5\34\u014d\n\34\3\34\3\34\3\34\5\34\u0152\n\34\3\34\5\34\u0155\n\34"+
		"\3\34\3\34\3\34\5\34\u015a\n\34\3\34\3\34\3\34\5\34\u015f\n\34\3\35\3"+
		"\35\3\35\3\36\3\36\3\37\5\37\u0167\n\37\3\37\3\37\3 \3 \3!\3!\3\"\3\""+
		"\3\"\5\"\u0172\n\"\3#\3#\5#\u0176\n#\3#\3#\3#\5#\u017b\n#\3#\3#\5#\u017f"+
		"\n#\3$\3$\3$\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u018f\n&\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\5(\u01a6"+
		"\n(\3)\3)\3*\3*\5*\u01ac\n*\3*\3*\3+\6+\u01b1\n+\r+\16+\u01b2\3,\3,\5"+
		",\u01b7\n,\3-\3-\3-\3-\5-\u01bd\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5"+
		".\u01ca\n.\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62"+
		"\3\62\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39"+
		"\39\3:\3:\3;\3;\3<\3<\3<\3=\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3A\3A\3B\3B"+
		"\3C\3C\3D\3D\3E\3E\3E\3F\3F\3G\3G\3G\3H\3H\3H\3I\3I\3I\3J\3J\3J\3J\3K"+
		"\3K\3K\3L\3L\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3S\3S\3T"+
		"\3T\3T\3T\3T\3T\3T\3T\3T\3U\3U\3U\3U\3V\3V\3V\3V\3W\3W\3W\3W\3W\3W\3W"+
		"\3W\3X\3X\7X\u0249\nX\fX\16X\u024c\13X\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u0254\nY\3"+
		"Z\3Z\3Z\3Z\3Z\3Z\5Z\u025c\nZ\3[\3[\3\\\3\\\3\\\3\\\3]\6]\u0265\n]\r]\16"+
		"]\u0266\3]\3]\3^\3^\3^\3^\7^\u026f\n^\f^\16^\u0272\13^\3^\3^\3^\3^\3^"+
		"\3_\3_\3_\3_\7_\u027d\n_\f_\16_\u0280\13_\3_\3_\3\u0270\2`\3\3\5\4\7\2"+
		"\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'"+
		"\2)\2+\2-\2/\2\61\2\63\2\65\5\67\29\2;\2=\2?\2A\2C\2E\2G\2I\2K\6M\7O\b"+
		"Q\2S\tU\2W\2Y\2[\2]\2_\2a\nc\13e\fg\ri\16k\17m\20o\21q\22s\23u\24w\25"+
		"y\26{\27}\30\177\31\u0081\32\u0083\33\u0085\34\u0087\35\u0089\36\u008b"+
		"\37\u008d \u008f!\u0091\"\u0093#\u0095$\u0097%\u0099&\u009b\'\u009d(\u009f"+
		")\u00a1*\u00a3+\u00a5,\u00a7-\u00a9.\u00ab/\u00ad\60\u00af\61\u00b1\2"+
		"\u00b3\2\u00b5\62\u00b7\63\u00b9\64\u00bb\65\u00bd\66\3\2\30\4\2NNnn\3"+
		"\2\63;\4\2ZZzz\5\2\62;CHch\3\2\629\4\2DDdd\3\2\62\63\4\2GGgg\4\2--//\6"+
		"\2FFHHffhh\4\2RRrr\4\2))^^\4\2$$^^\n\2$$))^^ddhhppttvv\3\2\62\65\6\2&"+
		"&C\\aac|\4\2\2\u0101\ud802\udc01\3\2\ud802\udc01\3\2\udc02\ue001\7\2&"+
		"&\62;C\\aac|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\u0291\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\65\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2S\3\2\2\2\2a\3\2"+
		"\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2"+
		"\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{"+
		"\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2"+
		"\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9"+
		"\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b5\3\2\2"+
		"\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\3\u00bf"+
		"\3\2\2\2\5\u00c8\3\2\2\2\7\u00ca\3\2\2\2\t\u00ce\3\2\2\2\13\u00d2\3\2"+
		"\2\2\r\u00d6\3\2\2\2\17\u00da\3\2\2\2\21\u00e6\3\2\2\2\23\u00e8\3\2\2"+
		"\2\25\u00f4\3\2\2\2\27\u00f6\3\2\2\2\31\u00fa\3\2\2\2\33\u00fd\3\2\2\2"+
		"\35\u0101\3\2\2\2\37\u0105\3\2\2\2!\u010f\3\2\2\2#\u0113\3\2\2\2%\u0115"+
		"\3\2\2\2\'\u011b\3\2\2\2)\u0125\3\2\2\2+\u0129\3\2\2\2-\u012b\3\2\2\2"+
		"/\u012f\3\2\2\2\61\u0139\3\2\2\2\63\u013d\3\2\2\2\65\u0141\3\2\2\2\67"+
		"\u015e\3\2\2\29\u0160\3\2\2\2;\u0163\3\2\2\2=\u0166\3\2\2\2?\u016a\3\2"+
		"\2\2A\u016c\3\2\2\2C\u016e\3\2\2\2E\u017e\3\2\2\2G\u0180\3\2\2\2I\u0183"+
		"\3\2\2\2K\u018e\3\2\2\2M\u0190\3\2\2\2O\u01a5\3\2\2\2Q\u01a7\3\2\2\2S"+
		"\u01a9\3\2\2\2U\u01b0\3\2\2\2W\u01b6\3\2\2\2Y\u01bc\3\2\2\2[\u01c9\3\2"+
		"\2\2]\u01cb\3\2\2\2_\u01d2\3\2\2\2a\u01d4\3\2\2\2c\u01d9\3\2\2\2e\u01db"+
		"\3\2\2\2g\u01dd\3\2\2\2i\u01e0\3\2\2\2k\u01e2\3\2\2\2m\u01e4\3\2\2\2o"+
		"\u01e6\3\2\2\2q\u01e8\3\2\2\2s\u01ea\3\2\2\2u\u01ec\3\2\2\2w\u01ee\3\2"+
		"\2\2y\u01f1\3\2\2\2{\u01f4\3\2\2\2}\u01f6\3\2\2\2\177\u01f8\3\2\2\2\u0081"+
		"\u01fa\3\2\2\2\u0083\u01fe\3\2\2\2\u0085\u0200\3\2\2\2\u0087\u0202\3\2"+
		"\2\2\u0089\u0204\3\2\2\2\u008b\u0207\3\2\2\2\u008d\u0209\3\2\2\2\u008f"+
		"\u020c\3\2\2\2\u0091\u020f\3\2\2\2\u0093\u0212\3\2\2\2\u0095\u0216\3\2"+
		"\2\2\u0097\u0219\3\2\2\2\u0099\u021d\3\2\2\2\u009b\u021f\3\2\2\2\u009d"+
		"\u0221\3\2\2\2\u009f\u0223\3\2\2\2\u00a1\u0225\3\2\2\2\u00a3\u0227\3\2"+
		"\2\2\u00a5\u0229\3\2\2\2\u00a7\u022d\3\2\2\2\u00a9\u0236\3\2\2\2\u00ab"+
		"\u023a\3\2\2\2\u00ad\u023e\3\2\2\2\u00af\u0246\3\2\2\2\u00b1\u0253\3\2"+
		"\2\2\u00b3\u025b\3\2\2\2\u00b5\u025d\3\2\2\2\u00b7\u025f\3\2\2\2\u00b9"+
		"\u0264\3\2\2\2\u00bb\u026a\3\2\2\2\u00bd\u0278\3\2\2\2\u00bf\u00c0\7u"+
		"\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7n\2\2\u00c2\u00c3\7h\2\2\u00c3\4"+
		"\3\2\2\2\u00c4\u00c9\5\7\4\2\u00c5\u00c9\5\t\5\2\u00c6\u00c9\5\13\6\2"+
		"\u00c7\u00c9\5\r\7\2\u00c8\u00c4\3\2\2\2\u00c8\u00c5\3\2\2\2\u00c8\u00c6"+
		"\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\6\3\2\2\2\u00ca\u00cc\5\21\t\2\u00cb"+
		"\u00cd\5\17\b\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\b\3\2\2"+
		"\2\u00ce\u00d0\5\35\17\2\u00cf\u00d1\5\17\b\2\u00d0\u00cf\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\n\3\2\2\2\u00d2\u00d4\5%\23\2\u00d3\u00d5\5\17\b"+
		"\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\f\3\2\2\2\u00d6\u00d8"+
		"\5-\27\2\u00d7\u00d9\5\17\b\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2"+
		"\u00d9\16\3\2\2\2\u00da\u00db\t\2\2\2\u00db\20\3\2\2\2\u00dc\u00e7\7\62"+
		"\2\2\u00dd\u00e4\5\27\f\2\u00de\u00e0\5\23\n\2\u00df\u00de\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e5\3\2\2\2\u00e1\u00e2\5\33\16\2\u00e2\u00e3\5"+
		"\23\n\2\u00e3\u00e5\3\2\2\2\u00e4\u00df\3\2\2\2\u00e4\u00e1\3\2\2\2\u00e5"+
		"\u00e7\3\2\2\2\u00e6\u00dc\3\2\2\2\u00e6\u00dd\3\2\2\2\u00e7\22\3\2\2"+
		"\2\u00e8\u00f0\5\25\13\2\u00e9\u00eb\5\31\r\2\u00ea\u00e9\3\2\2\2\u00eb"+
		"\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\3\2"+
		"\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f1\5\25\13\2\u00f0\u00ec\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\24\3\2\2\2\u00f2\u00f5\7\62\2\2\u00f3\u00f5\5\27"+
		"\f\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5\26\3\2\2\2\u00f6\u00f7"+
		"\t\3\2\2\u00f7\30\3\2\2\2\u00f8\u00fb\5\25\13\2\u00f9\u00fb\7a\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb\32\3\2\2\2\u00fc\u00fe\7a\2\2"+
		"\u00fd\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100"+
		"\3\2\2\2\u0100\34\3\2\2\2\u0101\u0102\7\62\2\2\u0102\u0103\t\4\2\2\u0103"+
		"\u0104\5\37\20\2\u0104\36\3\2\2\2\u0105\u010d\5!\21\2\u0106\u0108\5#\22"+
		"\2\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a"+
		"\3\2\2\2\u010a\u010c\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010e\5!\21\2\u010d"+
		"\u0109\3\2\2\2\u010d\u010e\3\2\2\2\u010e \3\2\2\2\u010f\u0110\t\5\2\2"+
		"\u0110\"\3\2\2\2\u0111\u0114\5!\21\2\u0112\u0114\7a\2\2\u0113\u0111\3"+
		"\2\2\2\u0113\u0112\3\2\2\2\u0114$\3\2\2\2\u0115\u0117\7\62\2\2\u0116\u0118"+
		"\5\33\16\2\u0117\u0116\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2\2\2"+
		"\u0119\u011a\5\'\24\2\u011a&\3\2\2\2\u011b\u0123\5)\25\2\u011c\u011e\5"+
		"+\26\2\u011d\u011c\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u0120\u0122\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0124\5)"+
		"\25\2\u0123\u011f\3\2\2\2\u0123\u0124\3\2\2\2\u0124(\3\2\2\2\u0125\u0126"+
		"\t\6\2\2\u0126*\3\2\2\2\u0127\u012a\5)\25\2\u0128\u012a\7a\2\2\u0129\u0127"+
		"\3\2\2\2\u0129\u0128\3\2\2\2\u012a,\3\2\2\2\u012b\u012c\7\62\2\2\u012c"+
		"\u012d\t\7\2\2\u012d\u012e\5/\30\2\u012e.\3\2\2\2\u012f\u0137\5\61\31"+
		"\2\u0130\u0132\5\63\32\2\u0131\u0130\3\2\2\2\u0132\u0135\3\2\2\2\u0133"+
		"\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0136\3\2\2\2\u0135\u0133\3\2"+
		"\2\2\u0136\u0138\5\61\31\2\u0137\u0133\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"\60\3\2\2\2\u0139\u013a\t\b\2\2\u013a\62\3\2\2\2\u013b\u013e\5\61\31\2"+
		"\u013c\u013e\7a\2\2\u013d\u013b\3\2\2\2\u013d\u013c\3\2\2\2\u013e\64\3"+
		"\2\2\2\u013f\u0142\5\67\34\2\u0140\u0142\5C\"\2\u0141\u013f\3\2\2\2\u0141"+
		"\u0140\3\2\2\2\u0142\66\3\2\2\2\u0143\u0144\5\23\n\2\u0144\u0146\7\60"+
		"\2\2\u0145\u0147\5\23\n\2\u0146\u0145\3\2\2\2\u0146\u0147\3\2\2\2\u0147"+
		"\u0149\3\2\2\2\u0148\u014a\59\35\2\u0149\u0148\3\2\2\2\u0149\u014a\3\2"+
		"\2\2\u014a\u014c\3\2\2\2\u014b\u014d\5A!\2\u014c\u014b\3\2\2\2\u014c\u014d"+
		"\3\2\2\2\u014d\u015f\3\2\2\2\u014e\u014f\7\60\2\2\u014f\u0151\5\23\n\2"+
		"\u0150\u0152\59\35\2\u0151\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0154"+
		"\3\2\2\2\u0153\u0155\5A!\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2\2\2\u0155"+
		"\u015f\3\2\2\2\u0156\u0157\5\23\n\2\u0157\u0159\59\35\2\u0158\u015a\5"+
		"A!\2\u0159\u0158\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015f\3\2\2\2\u015b"+
		"\u015c\5\23\n\2\u015c\u015d\5A!\2\u015d\u015f\3\2\2\2\u015e\u0143\3\2"+
		"\2\2\u015e\u014e\3\2\2\2\u015e\u0156\3\2\2\2\u015e\u015b\3\2\2\2\u015f"+
		"8\3\2\2\2\u0160\u0161\5;\36\2\u0161\u0162\5=\37\2\u0162:\3\2\2\2\u0163"+
		"\u0164\t\t\2\2\u0164<\3\2\2\2\u0165\u0167\5? \2\u0166\u0165\3\2\2\2\u0166"+
		"\u0167\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\5\23\n\2\u0169>\3\2\2\2"+
		"\u016a\u016b\t\n\2\2\u016b@\3\2\2\2\u016c\u016d\t\13\2\2\u016dB\3\2\2"+
		"\2\u016e\u016f\5E#\2\u016f\u0171\5G$\2\u0170\u0172\5A!\2\u0171\u0170\3"+
		"\2\2\2\u0171\u0172\3\2\2\2\u0172D\3\2\2\2\u0173\u0175\5\35\17\2\u0174"+
		"\u0176\7\60\2\2\u0175\u0174\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u017f\3"+
		"\2\2\2\u0177\u0178\7\62\2\2\u0178\u017a\t\4\2\2\u0179\u017b\5\37\20\2"+
		"\u017a\u0179\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d"+
		"\7\60\2\2\u017d\u017f\5\37\20\2\u017e\u0173\3\2\2\2\u017e\u0177\3\2\2"+
		"\2\u017fF\3\2\2\2\u0180\u0181\5I%\2\u0181\u0182\5=\37\2\u0182H\3\2\2\2"+
		"\u0183\u0184\t\f\2\2\u0184J\3\2\2\2\u0185\u0186\7v\2\2\u0186\u0187\7t"+
		"\2\2\u0187\u0188\7w\2\2\u0188\u018f\7g\2\2\u0189\u018a\7h\2\2\u018a\u018b"+
		"\7c\2\2\u018b\u018c\7n\2\2\u018c\u018d\7u\2\2\u018d\u018f\7g\2\2\u018e"+
		"\u0185\3\2\2\2\u018e\u0189\3\2\2\2\u018fL\3\2\2\2\u0190\u0191\7$\2\2\u0191"+
		"\u0192\5\25\13\2\u0192\u0193\5\25\13\2\u0193\u0194\5\25\13\2\u0194\u0195"+
		"\5\25\13\2\u0195\u0196\5\u009bN\2\u0196\u0197\5\25\13\2\u0197\u0198\5"+
		"\25\13\2\u0198\u0199\5\u009bN\2\u0199\u019a\5\25\13\2\u019a\u019b\5\25"+
		"\13\2\u019b\u019c\7$\2\2\u019cN\3\2\2\2\u019d\u019e\7)\2\2\u019e\u019f"+
		"\5Q)\2\u019f\u01a0\7)\2\2\u01a0\u01a6\3\2\2\2\u01a1\u01a2\7)\2\2\u01a2"+
		"\u01a3\5Y-\2\u01a3\u01a4\7)\2\2\u01a4\u01a6\3\2\2\2\u01a5\u019d\3\2\2"+
		"\2\u01a5\u01a1\3\2\2\2\u01a6P\3\2\2\2\u01a7\u01a8\n\r\2\2\u01a8R\3\2\2"+
		"\2\u01a9\u01ab\7$\2\2\u01aa\u01ac\5U+\2\u01ab\u01aa\3\2\2\2\u01ab\u01ac"+
		"\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\7$\2\2\u01aeT\3\2\2\2\u01af\u01b1"+
		"\5W,\2\u01b0\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2"+
		"\u01b3\3\2\2\2\u01b3V\3\2\2\2\u01b4\u01b7\n\16\2\2\u01b5\u01b7\5Y-\2\u01b6"+
		"\u01b4\3\2\2\2\u01b6\u01b5\3\2\2\2\u01b7X\3\2\2\2\u01b8\u01b9\7^\2\2\u01b9"+
		"\u01bd\t\17\2\2\u01ba\u01bd\5[.\2\u01bb\u01bd\5]/\2\u01bc\u01b8\3\2\2"+
		"\2\u01bc\u01ba\3\2\2\2\u01bc\u01bb\3\2\2\2\u01bdZ\3\2\2\2\u01be\u01bf"+
		"\7^\2\2\u01bf\u01ca\5)\25\2\u01c0\u01c1\7^\2\2\u01c1\u01c2\5)\25\2\u01c2"+
		"\u01c3\5)\25\2\u01c3\u01ca\3\2\2\2\u01c4\u01c5\7^\2\2\u01c5\u01c6\5_\60"+
		"\2\u01c6\u01c7\5)\25\2\u01c7\u01c8\5)\25\2\u01c8\u01ca\3\2\2\2\u01c9\u01be"+
		"\3\2\2\2\u01c9\u01c0\3\2\2\2\u01c9\u01c4\3\2\2\2\u01ca\\\3\2\2\2\u01cb"+
		"\u01cc\7^\2\2\u01cc\u01cd\7w\2\2\u01cd\u01ce\5!\21\2\u01ce\u01cf\5!\21"+
		"\2\u01cf\u01d0\5!\21\2\u01d0\u01d1\5!\21\2\u01d1^\3\2\2\2\u01d2\u01d3"+
		"\t\20\2\2\u01d3`\3\2\2\2\u01d4\u01d5\7p\2\2\u01d5\u01d6\7w\2\2\u01d6\u01d7"+
		"\7n\2\2\u01d7\u01d8\7n\2\2\u01d8b\3\2\2\2\u01d9\u01da\7*\2\2\u01dad\3"+
		"\2\2\2\u01db\u01dc\7+\2\2\u01dcf\3\2\2\2\u01dd\u01de\7%\2\2\u01de\u01df"+
		"\7}\2\2\u01dfh\3\2\2\2\u01e0\u01e1\7}\2\2\u01e1j\3\2\2\2\u01e2\u01e3\7"+
		"\177\2\2\u01e3l\3\2\2\2\u01e4\u01e5\7]\2\2\u01e5n\3\2\2\2\u01e6\u01e7"+
		"\7_\2\2\u01e7p\3\2\2\2\u01e8\u01e9\7=\2\2\u01e9r\3\2\2\2\u01ea\u01eb\7"+
		".\2\2\u01ebt\3\2\2\2\u01ec\u01ed\7\60\2\2\u01edv\3\2\2\2\u01ee\u01ef\7"+
		"/\2\2\u01ef\u01f0\7@\2\2\u01f0x\3\2\2\2\u01f1\u01f2\7>\2\2\u01f2\u01f3"+
		"\7/\2\2\u01f3z\3\2\2\2\u01f4\u01f5\7~\2\2\u01f5|\3\2\2\2\u01f6\u01f7\7"+
		"@\2\2\u01f7~\3\2\2\2\u01f8\u01f9\7>\2\2\u01f9\u0080\3\2\2\2\u01fa\u01fb"+
		"\7p\2\2\u01fb\u01fc\7q\2\2\u01fc\u01fd\7v\2\2\u01fd\u0082\3\2\2\2\u01fe"+
		"\u01ff\7\u0080\2\2\u01ff\u0084\3\2\2\2\u0200\u0201\7A\2\2\u0201\u0086"+
		"\3\2\2\2\u0202\u0203\7<\2\2\u0203\u0088\3\2\2\2\u0204\u0205\7<\2\2\u0205"+
		"\u0206\7<\2\2\u0206\u008a\3\2\2\2\u0207\u0208\7?\2\2\u0208\u008c\3\2\2"+
		"\2\u0209\u020a\7>\2\2\u020a\u020b\7?\2\2\u020b\u008e\3\2\2\2\u020c\u020d"+
		"\7@\2\2\u020d\u020e\7?\2\2\u020e\u0090\3\2\2\2\u020f\u0210\7>\2\2\u0210"+
		"\u0211\7@\2\2\u0211\u0092\3\2\2\2\u0212\u0213\7c\2\2\u0213\u0214\7p\2"+
		"\2\u0214\u0215\7f\2\2\u0215\u0094\3\2\2\2\u0216\u0217\7q\2\2\u0217\u0218"+
		"\7t\2\2\u0218\u0096\3\2\2\2\u0219\u021a\7z\2\2\u021a\u021b\7q\2\2\u021b"+
		"\u021c\7t\2\2\u021c\u0098\3\2\2\2\u021d\u021e\7-\2\2\u021e\u009a\3\2\2"+
		"\2\u021f\u0220\7/\2\2\u0220\u009c\3\2\2\2\u0221\u0222\7,\2\2\u0222\u009e"+
		"\3\2\2\2\u0223\u0224\7\61\2\2\u0224\u00a0\3\2\2\2\u0225\u0226\7\'\2\2"+
		"\u0226\u00a2\3\2\2\2\u0227\u0228\7`\2\2\u0228\u00a4\3\2\2\2\u0229\u022a"+
		"\7o\2\2\u022a\u022b\7q\2\2\u022b\u022c\7f\2\2\u022c\u00a6\3\2\2\2\u022d"+
		"\u022e\7u\2\2\u022e\u022f\7g\2\2\u022f\u0230\7s\2\2\u0230\u0231\7w\2\2"+
		"\u0231\u0232\7g\2\2\u0232\u0233\7p\2\2\u0233\u0234\7e\2\2\u0234\u0235"+
		"\7g\2\2\u0235\u00a8\3\2\2\2\u0236\u0237\7d\2\2\u0237\u0238\7c\2\2\u0238"+
		"\u0239\7i\2\2\u0239\u00aa\3\2\2\2\u023a\u023b\7u\2\2\u023b\u023c\7g\2"+
		"\2\u023c\u023d\7v\2\2\u023d\u00ac\3\2\2\2\u023e\u023f\7q\2\2\u023f\u0240"+
		"\7t\2\2\u0240\u0241\7f\2\2\u0241\u0242\7g\2\2\u0242\u0243\7t\2\2\u0243"+
		"\u0244\7g\2\2\u0244\u0245\7f\2\2\u0245\u00ae\3\2\2\2\u0246\u024a\5\u00b1"+
		"Y\2\u0247\u0249\5\u00b3Z\2\u0248\u0247\3\2\2\2\u0249\u024c\3\2\2\2\u024a"+
		"\u0248\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u00b0\3\2\2\2\u024c\u024a\3\2"+
		"\2\2\u024d\u0254\t\21\2\2\u024e\u024f\n\22\2\2\u024f\u0254\6Y\2\2\u0250"+
		"\u0251\t\23\2\2\u0251\u0252\t\24\2\2\u0252\u0254\6Y\3\2\u0253\u024d\3"+
		"\2\2\2\u0253\u024e\3\2\2\2\u0253\u0250\3\2\2\2\u0254\u00b2\3\2\2\2\u0255"+
		"\u025c\t\25\2\2\u0256\u0257\n\22\2\2\u0257\u025c\6Z\4\2\u0258\u0259\t"+
		"\23\2\2\u0259\u025a\t\24\2\2\u025a\u025c\6Z\5\2\u025b\u0255\3\2\2\2\u025b"+
		"\u0256\3\2\2\2\u025b\u0258\3\2\2\2\u025c\u00b4\3\2\2\2\u025d\u025e\7B"+
		"\2\2\u025e\u00b6\3\2\2\2\u025f\u0260\7\60\2\2\u0260\u0261\7\60\2\2\u0261"+
		"\u0262\7\60\2\2\u0262\u00b8\3\2\2\2\u0263\u0265\t\26\2\2\u0264\u0263\3"+
		"\2\2\2\u0265\u0266\3\2\2\2\u0266\u0264\3\2\2\2\u0266\u0267\3\2\2\2\u0267"+
		"\u0268\3\2\2\2\u0268\u0269\b]\2\2\u0269\u00ba\3\2\2\2\u026a\u026b\7\61"+
		"\2\2\u026b\u026c\7,\2\2\u026c\u0270\3\2\2\2\u026d\u026f\13\2\2\2\u026e"+
		"\u026d\3\2\2\2\u026f\u0272\3\2\2\2\u0270\u0271\3\2\2\2\u0270\u026e\3\2"+
		"\2\2\u0271\u0273\3\2\2\2\u0272\u0270\3\2\2\2\u0273\u0274\7,\2\2\u0274"+
		"\u0275\7\61\2\2\u0275\u0276\3\2\2\2\u0276\u0277\b^\2\2\u0277\u00bc\3\2"+
		"\2\2\u0278\u0279\7/\2\2\u0279\u027a\7/\2\2\u027a\u027e\3\2\2\2\u027b\u027d"+
		"\n\27\2\2\u027c\u027b\3\2\2\2\u027d\u0280\3\2\2\2\u027e\u027c\3\2\2\2"+
		"\u027e\u027f\3\2\2\2\u027f\u0281\3\2\2\2\u0280\u027e\3\2\2\2\u0281\u0282"+
		"\b_\2\2\u0282\u00be\3\2\2\2\64\2\u00c8\u00cc\u00d0\u00d4\u00d8\u00df\u00e4"+
		"\u00e6\u00ec\u00f0\u00f4\u00fa\u00ff\u0109\u010d\u0113\u0117\u011f\u0123"+
		"\u0129\u0133\u0137\u013d\u0141\u0146\u0149\u014c\u0151\u0154\u0159\u015e"+
		"\u0166\u0171\u0175\u017a\u017e\u018e\u01a5\u01ab\u01b2\u01b6\u01bc\u01c9"+
		"\u024a\u0253\u025b\u0266\u0270\u027e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}