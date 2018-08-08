// Generated from fr/insset/jeanluc/ete/nl/FrenchLexer.g4 by ANTLR 4.5.3
package fr.insset.jeanluc.ete.nl;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FrenchLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IntegerLiteral=1, FloatingPointLiteral=2, DateLiteral=3, CharacterLiteral=4, 
		StringLiteral=5, NullLiteral=6, LPAREN=7, RPAREN=8, START_EXP=9, LBRACE=10, 
		RBRACE=11, LBRACK=12, RBRACK=13, SEMI=14, COMMA=15, DOT=16, ARROW=17, 
		LEFT_ARROW=18, PIPE=19, GT=20, LT=21, NOT=22, TILDE=23, QUESTION=24, COLON=25, 
		DOUBLE_COLON=26, EQUAL=27, LE=28, GE=29, NOTEQUAL=30, AND=31, OR=32, XOR=33, 
		ADD=34, SUB=35, MUL=36, DIV=37, MOD_PERCENT=38, CARET=39, MOD=40, FEATURE=41, 
		BACKGROUND=42, SCENARIO=43, OUTLINE=44, GIVEN=45, ETANT=46, DONNE=47, 
		WHEN=48, THEN=49, BUT=50, OF=51, ATPRE=52, ELLIPSIS=53, INITIAL=54, IS=55, 
		NEW=56, THE=57, THIS=58, A=59, WITH=60, TYPE=61, KIND=62, AS=63, ORDERED=64, 
		UNORDERED=65, SEQUENCE=66, BAG=67, SET=68, Identifier=69, WS=70, COMMENT=71, 
		LINE_COMMENT=72;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"IntegerLiteral", "DecimalIntegerLiteral", "HexIntegerLiteral", "OctalIntegerLiteral", 
		"BinaryIntegerLiteral", "IntegerTypeSuffix", "DecimalNumeral", "Digits", 
		"Digit", "NonZeroDigit", "DigitOrUnderscore", "Underscores", "HexNumeral", 
		"HexDigits", "HexDigit", "HexDigitOrUnderscore", "OctalNumeral", "OctalDigits", 
		"OctalDigit", "OctalDigitOrUnderscore", "BinaryNumeral", "BinaryDigits", 
		"BinaryDigit", "BinaryDigitOrUnderscore", "FloatingPointLiteral", "DecimalFloatingPointLiteral", 
		"ExponentPart", "ExponentIndicator", "SignedInteger", "Sign", "FloatTypeSuffix", 
		"HexadecimalFloatingPointLiteral", "HexSignificand", "BinaryExponent", 
		"BinaryExponentIndicator", "DateLiteral", "CharacterLiteral", "SingleCharacter", 
		"StringLiteral", "StringCharacters", "StringCharacter", "EscapeSequence", 
		"OctalEscape", "UnicodeEscape", "ZeroToThree", "NullLiteral", "LPAREN", 
		"RPAREN", "START_EXP", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", 
		"COMMA", "DOT", "ARROW", "LEFT_ARROW", "PIPE", "GT", "LT", "NOT", "TILDE", 
		"QUESTION", "COLON", "DOUBLE_COLON", "EQUAL", "LE", "GE", "NOTEQUAL", 
		"AND", "OR", "XOR", "ADD", "SUB", "MUL", "DIV", "MOD_PERCENT", "CARET", 
		"MOD", "FEATURE", "BACKGROUND", "SCENARIO", "OUTLINE", "GIVEN", "ETANT", 
		"DONNE", "WHEN", "THEN", "BUT", "OF", "ATPRE", "ELLIPSIS", "INITIAL", 
		"IS", "NEW", "THE", "THIS", "A", "WITH", "TYPE", "KIND", "AS", "ORDERED", 
		"UNORDERED", "SEQUENCE", "BAG", "SET", "Identifier", "JavaLetter", "JavaLetterOrDigit", 
		"WS", "COMMENT", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, "'null'", "'('", "')'", "'#{'", "'{'", 
		"'}'", "'['", "']'", "';'", "','", "'.'", "'->'", "'<-'", "'|'", "'>'", 
		"'<'", "'not'", "'~'", "'?'", "':'", "'::'", "'='", "'<='", "'>='", "'<>'", 
		"'and'", "'or'", "'xor'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'mod'", 
		null, null, null, null, null, null, null, null, null, null, null, "'@pre'", 
		"'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IntegerLiteral", "FloatingPointLiteral", "DateLiteral", "CharacterLiteral", 
		"StringLiteral", "NullLiteral", "LPAREN", "RPAREN", "START_EXP", "LBRACE", 
		"RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ARROW", "LEFT_ARROW", 
		"PIPE", "GT", "LT", "NOT", "TILDE", "QUESTION", "COLON", "DOUBLE_COLON", 
		"EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "XOR", "ADD", "SUB", "MUL", 
		"DIV", "MOD_PERCENT", "CARET", "MOD", "FEATURE", "BACKGROUND", "SCENARIO", 
		"OUTLINE", "GIVEN", "ETANT", "DONNE", "WHEN", "THEN", "BUT", "OF", "ATPRE", 
		"ELLIPSIS", "INITIAL", "IS", "NEW", "THE", "THIS", "A", "WITH", "TYPE", 
		"KIND", "AS", "ORDERED", "UNORDERED", "SEQUENCE", "BAG", "SET", "Identifier", 
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


	public FrenchLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FrenchLexer.g4"; }

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
		case 109:
			return JavaLetter_sempred((RuleContext)_localctx, predIndex);
		case 110:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2J\u044b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\3\2\3\2\3\2\3\2\5\2"+
		"\u00ec\n\2\3\3\3\3\5\3\u00f0\n\3\3\4\3\4\5\4\u00f4\n\4\3\5\3\5\5\5\u00f8"+
		"\n\5\3\6\3\6\5\6\u00fc\n\6\3\7\3\7\3\b\3\b\3\b\5\b\u0103\n\b\3\b\3\b\3"+
		"\b\5\b\u0108\n\b\5\b\u010a\n\b\3\t\3\t\7\t\u010e\n\t\f\t\16\t\u0111\13"+
		"\t\3\t\5\t\u0114\n\t\3\n\3\n\5\n\u0118\n\n\3\13\3\13\3\f\3\f\5\f\u011e"+
		"\n\f\3\r\6\r\u0121\n\r\r\r\16\r\u0122\3\16\3\16\3\16\3\16\3\17\3\17\7"+
		"\17\u012b\n\17\f\17\16\17\u012e\13\17\3\17\5\17\u0131\n\17\3\20\3\20\3"+
		"\21\3\21\5\21\u0137\n\21\3\22\3\22\5\22\u013b\n\22\3\22\3\22\3\23\3\23"+
		"\7\23\u0141\n\23\f\23\16\23\u0144\13\23\3\23\5\23\u0147\n\23\3\24\3\24"+
		"\3\25\3\25\5\25\u014d\n\25\3\26\3\26\3\26\3\26\3\27\3\27\7\27\u0155\n"+
		"\27\f\27\16\27\u0158\13\27\3\27\5\27\u015b\n\27\3\30\3\30\3\31\3\31\5"+
		"\31\u0161\n\31\3\32\3\32\5\32\u0165\n\32\3\33\3\33\3\33\5\33\u016a\n\33"+
		"\3\33\5\33\u016d\n\33\3\33\5\33\u0170\n\33\3\33\3\33\3\33\5\33\u0175\n"+
		"\33\3\33\5\33\u0178\n\33\3\33\3\33\3\33\5\33\u017d\n\33\3\33\3\33\3\33"+
		"\5\33\u0182\n\33\3\34\3\34\3\34\3\35\3\35\3\36\5\36\u018a\n\36\3\36\3"+
		"\36\3\37\3\37\3 \3 \3!\3!\3!\5!\u0195\n!\3\"\3\"\5\"\u0199\n\"\3\"\3\""+
		"\3\"\5\"\u019e\n\"\3\"\3\"\5\"\u01a2\n\"\3#\3#\3#\3$\3$\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\5&\u01be\n&\3\'\3\'"+
		"\3(\3(\5(\u01c4\n(\3(\3(\3)\6)\u01c9\n)\r)\16)\u01ca\3*\3*\5*\u01cf\n"+
		"*\3+\3+\3+\3+\5+\u01d5\n+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u01e2\n"+
		",\3-\3-\3-\3-\3-\3-\3-\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\61\3\61\3\62\3"+
		"\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\3"+
		"9\3:\3:\3:\3;\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3?\3?\3@\3@\3A\3A\3B\3B\3"+
		"C\3C\3C\3D\3D\3E\3E\3E\3F\3F\3F\3G\3G\3G\3H\3H\3H\3H\3I\3I\3I\3J\3J\3"+
		"J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3R\3"+
		"R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3"+
		"R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\5R\u0270\nR\3S\3S\3S\3S\3S\3"+
		"S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\5S\u028a\nS\3"+
		"T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3"+
		"T\5T\u02a4\nT\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\5"+
		"U\u02b8\nU\3V\3V\3V\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\5W\u02cc"+
		"\nW\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\5X\u02dd\nX\3Y\3Y\3Y"+
		"\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u02ee\nY\3Z\3Z\3Z\3Z\3Z\3Z\3Z"+
		"\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u02ff\nZ\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3["+
		"\3[\5[\u030d\n[\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3"+
		"\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u0328\n\\\3]\3]\3]"+
		"\3]\3]\3^\3^\3^\3^\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_"+
		"\3_\3_\3_\3_\5_\u0348\n_\3`\3`\3`\3`\3`\3`\5`\u0350\n`\3a\3a\3a\3a\3a"+
		"\3a\3a\3a\3a\5a\u035b\na\3b\3b\3b\3b\3b\3b\3b\3b\3b\5b\u0366\nb\3c\3c"+
		"\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\5c\u0374\nc\3d\3d\3d\3d\3d\3d\3d\5d\u037d"+
		"\nd\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\5e\u038b\ne\3f\3f\3f\3f\3f\3f"+
		"\3f\3f\3f\3f\3f\3f\5f\u0399\nf\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\5g"+
		"\u03a7\ng\3h\3h\3h\3h\3h\3h\5h\u03af\nh\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i"+
		"\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\5i\u03c6\ni\3j\3j\3j\3j\3j\3j\3j\3j"+
		"\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\5j\u03e3\nj"+
		"\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k"+
		"\3k\5k\u03fd\nk\3l\3l\3l\3l\3l\3l\3l\3l\3l\5l\u0408\nl\3m\3m\3m\3m\3m"+
		"\3m\3m\3m\3m\5m\u0413\nm\3n\3n\7n\u0417\nn\fn\16n\u041a\13n\3o\3o\3o\3"+
		"o\3o\3o\5o\u0422\no\3p\3p\3p\3p\3p\3p\5p\u042a\np\3q\6q\u042d\nq\rq\16"+
		"q\u042e\3q\3q\3r\3r\3r\3r\7r\u0437\nr\fr\16r\u043a\13r\3r\3r\3r\3r\3r"+
		"\3s\3s\3s\3s\7s\u0445\ns\fs\16s\u0448\13s\3s\3s\3\u0438\2t\3\3\5\2\7\2"+
		"\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'"+
		"\2)\2+\2-\2/\2\61\2\63\4\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\2I\5K\6M\2O\7"+
		"Q\2S\2U\2W\2Y\2[\2]\b_\ta\nc\13e\fg\ri\16k\17m\20o\21q\22s\23u\24w\25"+
		"y\26{\27}\30\177\31\u0081\32\u0083\33\u0085\34\u0087\35\u0089\36\u008b"+
		"\37\u008d \u008f!\u0091\"\u0093#\u0095$\u0097%\u0099&\u009b\'\u009d(\u009f"+
		")\u00a1*\u00a3+\u00a5,\u00a7-\u00a9.\u00ab/\u00ad\60\u00af\61\u00b1\62"+
		"\u00b3\63\u00b5\64\u00b7\65\u00b9\66\u00bb\67\u00bd8\u00bf9\u00c1:\u00c3"+
		";\u00c5<\u00c7=\u00c9>\u00cb?\u00cd@\u00cfA\u00d1B\u00d3C\u00d5D\u00d7"+
		"E\u00d9F\u00dbG\u00dd\2\u00df\2\u00e1H\u00e3I\u00e5J\3\2\31\4\2NNnn\3"+
		"\2\63;\4\2ZZzz\5\2\62;CHch\3\2\629\4\2DDdd\3\2\62\63\4\2GGgg\4\2--//\6"+
		"\2FFHHffhh\4\2RRrr\4\2))^^\4\2$$^^\n\2$$))^^ddhhppttvv\3\2\62\65\4\2C"+
		"Ccc\6\2&&C\\aac|\4\2\2\u0101\ud802\udc01\3\2\ud802\udc01\3\2\udc02\ue001"+
		"\7\2&&\62;C\\aac|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\u0493\2\3\3\2\2\2\2"+
		"\63\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2O\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a"+
		"\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2"+
		"\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2"+
		"\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2"+
		"\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d"+
		"\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2"+
		"\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f"+
		"\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2"+
		"\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1"+
		"\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2"+
		"\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3"+
		"\3\2\2\2\2\u00c5\3\2\2\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2"+
		"\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1\3\2\2\2\2\u00d3\3\2\2\2\2\u00d5"+
		"\3\2\2\2\2\u00d7\3\2\2\2\2\u00d9\3\2\2\2\2\u00db\3\2\2\2\2\u00e1\3\2\2"+
		"\2\2\u00e3\3\2\2\2\2\u00e5\3\2\2\2\3\u00eb\3\2\2\2\5\u00ed\3\2\2\2\7\u00f1"+
		"\3\2\2\2\t\u00f5\3\2\2\2\13\u00f9\3\2\2\2\r\u00fd\3\2\2\2\17\u0109\3\2"+
		"\2\2\21\u010b\3\2\2\2\23\u0117\3\2\2\2\25\u0119\3\2\2\2\27\u011d\3\2\2"+
		"\2\31\u0120\3\2\2\2\33\u0124\3\2\2\2\35\u0128\3\2\2\2\37\u0132\3\2\2\2"+
		"!\u0136\3\2\2\2#\u0138\3\2\2\2%\u013e\3\2\2\2\'\u0148\3\2\2\2)\u014c\3"+
		"\2\2\2+\u014e\3\2\2\2-\u0152\3\2\2\2/\u015c\3\2\2\2\61\u0160\3\2\2\2\63"+
		"\u0164\3\2\2\2\65\u0181\3\2\2\2\67\u0183\3\2\2\29\u0186\3\2\2\2;\u0189"+
		"\3\2\2\2=\u018d\3\2\2\2?\u018f\3\2\2\2A\u0191\3\2\2\2C\u01a1\3\2\2\2E"+
		"\u01a3\3\2\2\2G\u01a6\3\2\2\2I\u01a8\3\2\2\2K\u01bd\3\2\2\2M\u01bf\3\2"+
		"\2\2O\u01c1\3\2\2\2Q\u01c8\3\2\2\2S\u01ce\3\2\2\2U\u01d4\3\2\2\2W\u01e1"+
		"\3\2\2\2Y\u01e3\3\2\2\2[\u01ea\3\2\2\2]\u01ec\3\2\2\2_\u01f1\3\2\2\2a"+
		"\u01f3\3\2\2\2c\u01f5\3\2\2\2e\u01f8\3\2\2\2g\u01fa\3\2\2\2i\u01fc\3\2"+
		"\2\2k\u01fe\3\2\2\2m\u0200\3\2\2\2o\u0202\3\2\2\2q\u0204\3\2\2\2s\u0206"+
		"\3\2\2\2u\u0209\3\2\2\2w\u020c\3\2\2\2y\u020e\3\2\2\2{\u0210\3\2\2\2}"+
		"\u0212\3\2\2\2\177\u0216\3\2\2\2\u0081\u0218\3\2\2\2\u0083\u021a\3\2\2"+
		"\2\u0085\u021c\3\2\2\2\u0087\u021f\3\2\2\2\u0089\u0221\3\2\2\2\u008b\u0224"+
		"\3\2\2\2\u008d\u0227\3\2\2\2\u008f\u022a\3\2\2\2\u0091\u022e\3\2\2\2\u0093"+
		"\u0231\3\2\2\2\u0095\u0235\3\2\2\2\u0097\u0237\3\2\2\2\u0099\u0239\3\2"+
		"\2\2\u009b\u023b\3\2\2\2\u009d\u023d\3\2\2\2\u009f\u023f\3\2\2\2\u00a1"+
		"\u0241\3\2\2\2\u00a3\u026f\3\2\2\2\u00a5\u0289\3\2\2\2\u00a7\u02a3\3\2"+
		"\2\2\u00a9\u02b7\3\2\2\2\u00ab\u02b9\3\2\2\2\u00ad\u02cb\3\2\2\2\u00af"+
		"\u02dc\3\2\2\2\u00b1\u02ed\3\2\2\2\u00b3\u02fe\3\2\2\2\u00b5\u030c\3\2"+
		"\2\2\u00b7\u0327\3\2\2\2\u00b9\u0329\3\2\2\2\u00bb\u032e\3\2\2\2\u00bd"+
		"\u0347\3\2\2\2\u00bf\u034f\3\2\2\2\u00c1\u035a\3\2\2\2\u00c3\u0365\3\2"+
		"\2\2\u00c5\u0373\3\2\2\2\u00c7\u037c\3\2\2\2\u00c9\u038a\3\2\2\2\u00cb"+
		"\u0398\3\2\2\2\u00cd\u03a6\3\2\2\2\u00cf\u03ae\3\2\2\2\u00d1\u03c5\3\2"+
		"\2\2\u00d3\u03e2\3\2\2\2\u00d5\u03fc\3\2\2\2\u00d7\u0407\3\2\2\2\u00d9"+
		"\u0412\3\2\2\2\u00db\u0414\3\2\2\2\u00dd\u0421\3\2\2\2\u00df\u0429\3\2"+
		"\2\2\u00e1\u042c\3\2\2\2\u00e3\u0432\3\2\2\2\u00e5\u0440\3\2\2\2\u00e7"+
		"\u00ec\5\5\3\2\u00e8\u00ec\5\7\4\2\u00e9\u00ec\5\t\5\2\u00ea\u00ec\5\13"+
		"\6\2\u00eb\u00e7\3\2\2\2\u00eb\u00e8\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb"+
		"\u00ea\3\2\2\2\u00ec\4\3\2\2\2\u00ed\u00ef\5\17\b\2\u00ee\u00f0\5\r\7"+
		"\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\6\3\2\2\2\u00f1\u00f3"+
		"\5\33\16\2\u00f2\u00f4\5\r\7\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2"+
		"\u00f4\b\3\2\2\2\u00f5\u00f7\5#\22\2\u00f6\u00f8\5\r\7\2\u00f7\u00f6\3"+
		"\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\n\3\2\2\2\u00f9\u00fb\5+\26\2\u00fa\u00fc"+
		"\5\r\7\2\u00fb\u00fa\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\f\3\2\2\2\u00fd"+
		"\u00fe\t\2\2\2\u00fe\16\3\2\2\2\u00ff\u010a\7\62\2\2\u0100\u0107\5\25"+
		"\13\2\u0101\u0103\5\21\t\2\u0102\u0101\3\2\2\2\u0102\u0103\3\2\2\2\u0103"+
		"\u0108\3\2\2\2\u0104\u0105\5\31\r\2\u0105\u0106\5\21\t\2\u0106\u0108\3"+
		"\2\2\2\u0107\u0102\3\2\2\2\u0107\u0104\3\2\2\2\u0108\u010a\3\2\2\2\u0109"+
		"\u00ff\3\2\2\2\u0109\u0100\3\2\2\2\u010a\20\3\2\2\2\u010b\u0113\5\23\n"+
		"\2\u010c\u010e\5\27\f\2\u010d\u010c\3\2\2\2\u010e\u0111\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112\3\2\2\2\u0111\u010f\3\2"+
		"\2\2\u0112\u0114\5\23\n\2\u0113\u010f\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"\22\3\2\2\2\u0115\u0118\7\62\2\2\u0116\u0118\5\25\13\2\u0117\u0115\3\2"+
		"\2\2\u0117\u0116\3\2\2\2\u0118\24\3\2\2\2\u0119\u011a\t\3\2\2\u011a\26"+
		"\3\2\2\2\u011b\u011e\5\23\n\2\u011c\u011e\7a\2\2\u011d\u011b\3\2\2\2\u011d"+
		"\u011c\3\2\2\2\u011e\30\3\2\2\2\u011f\u0121\7a\2\2\u0120\u011f\3\2\2\2"+
		"\u0121\u0122\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\32"+
		"\3\2\2\2\u0124\u0125\7\62\2\2\u0125\u0126\t\4\2\2\u0126\u0127\5\35\17"+
		"\2\u0127\34\3\2\2\2\u0128\u0130\5\37\20\2\u0129\u012b\5!\21\2\u012a\u0129"+
		"\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"\u012f\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0131\5\37\20\2\u0130\u012c\3"+
		"\2\2\2\u0130\u0131\3\2\2\2\u0131\36\3\2\2\2\u0132\u0133\t\5\2\2\u0133"+
		" \3\2\2\2\u0134\u0137\5\37\20\2\u0135\u0137\7a\2\2\u0136\u0134\3\2\2\2"+
		"\u0136\u0135\3\2\2\2\u0137\"\3\2\2\2\u0138\u013a\7\62\2\2\u0139\u013b"+
		"\5\31\r\2\u013a\u0139\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\3\2\2\2"+
		"\u013c\u013d\5%\23\2\u013d$\3\2\2\2\u013e\u0146\5\'\24\2\u013f\u0141\5"+
		")\25\2\u0140\u013f\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143\u0145\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0147\5\'"+
		"\24\2\u0146\u0142\3\2\2\2\u0146\u0147\3\2\2\2\u0147&\3\2\2\2\u0148\u0149"+
		"\t\6\2\2\u0149(\3\2\2\2\u014a\u014d\5\'\24\2\u014b\u014d\7a\2\2\u014c"+
		"\u014a\3\2\2\2\u014c\u014b\3\2\2\2\u014d*\3\2\2\2\u014e\u014f\7\62\2\2"+
		"\u014f\u0150\t\7\2\2\u0150\u0151\5-\27\2\u0151,\3\2\2\2\u0152\u015a\5"+
		"/\30\2\u0153\u0155\5\61\31\2\u0154\u0153\3\2\2\2\u0155\u0158\3\2\2\2\u0156"+
		"\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0159\3\2\2\2\u0158\u0156\3\2"+
		"\2\2\u0159\u015b\5/\30\2\u015a\u0156\3\2\2\2\u015a\u015b\3\2\2\2\u015b"+
		".\3\2\2\2\u015c\u015d\t\b\2\2\u015d\60\3\2\2\2\u015e\u0161\5/\30\2\u015f"+
		"\u0161\7a\2\2\u0160\u015e\3\2\2\2\u0160\u015f\3\2\2\2\u0161\62\3\2\2\2"+
		"\u0162\u0165\5\65\33\2\u0163\u0165\5A!\2\u0164\u0162\3\2\2\2\u0164\u0163"+
		"\3\2\2\2\u0165\64\3\2\2\2\u0166\u0167\5\21\t\2\u0167\u0169\7\60\2\2\u0168"+
		"\u016a\5\21\t\2\u0169\u0168\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016c\3"+
		"\2\2\2\u016b\u016d\5\67\34\2\u016c\u016b\3\2\2\2\u016c\u016d\3\2\2\2\u016d"+
		"\u016f\3\2\2\2\u016e\u0170\5? \2\u016f\u016e\3\2\2\2\u016f\u0170\3\2\2"+
		"\2\u0170\u0182\3\2\2\2\u0171\u0172\7\60\2\2\u0172\u0174\5\21\t\2\u0173"+
		"\u0175\5\67\34\2\u0174\u0173\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0177\3"+
		"\2\2\2\u0176\u0178\5? \2\u0177\u0176\3\2\2\2\u0177\u0178\3\2\2\2\u0178"+
		"\u0182\3\2\2\2\u0179\u017a\5\21\t\2\u017a\u017c\5\67\34\2\u017b\u017d"+
		"\5? \2\u017c\u017b\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u0182\3\2\2\2\u017e"+
		"\u017f\5\21\t\2\u017f\u0180\5? \2\u0180\u0182\3\2\2\2\u0181\u0166\3\2"+
		"\2\2\u0181\u0171\3\2\2\2\u0181\u0179\3\2\2\2\u0181\u017e\3\2\2\2\u0182"+
		"\66\3\2\2\2\u0183\u0184\59\35\2\u0184\u0185\5;\36\2\u01858\3\2\2\2\u0186"+
		"\u0187\t\t\2\2\u0187:\3\2\2\2\u0188\u018a\5=\37\2\u0189\u0188\3\2\2\2"+
		"\u0189\u018a\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c\5\21\t\2\u018c<\3"+
		"\2\2\2\u018d\u018e\t\n\2\2\u018e>\3\2\2\2\u018f\u0190\t\13\2\2\u0190@"+
		"\3\2\2\2\u0191\u0192\5C\"\2\u0192\u0194\5E#\2\u0193\u0195\5? \2\u0194"+
		"\u0193\3\2\2\2\u0194\u0195\3\2\2\2\u0195B\3\2\2\2\u0196\u0198\5\33\16"+
		"\2\u0197\u0199\7\60\2\2\u0198\u0197\3\2\2\2\u0198\u0199\3\2\2\2\u0199"+
		"\u01a2\3\2\2\2\u019a\u019b\7\62\2\2\u019b\u019d\t\4\2\2\u019c\u019e\5"+
		"\35\17\2\u019d\u019c\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\3\2\2\2\u019f"+
		"\u01a0\7\60\2\2\u01a0\u01a2\5\35\17\2\u01a1\u0196\3\2\2\2\u01a1\u019a"+
		"\3\2\2\2\u01a2D\3\2\2\2\u01a3\u01a4\5G$\2\u01a4\u01a5\5;\36\2\u01a5F\3"+
		"\2\2\2\u01a6\u01a7\t\f\2\2\u01a7H\3\2\2\2\u01a8\u01a9\7$\2\2\u01a9\u01aa"+
		"\5\23\n\2\u01aa\u01ab\5\23\n\2\u01ab\u01ac\5\23\n\2\u01ac\u01ad\5\23\n"+
		"\2\u01ad\u01ae\5\u0097L\2\u01ae\u01af\5\23\n\2\u01af\u01b0\5\23\n\2\u01b0"+
		"\u01b1\5\u0097L\2\u01b1\u01b2\5\23\n\2\u01b2\u01b3\5\23\n\2\u01b3\u01b4"+
		"\7$\2\2\u01b4J\3\2\2\2\u01b5\u01b6\7)\2\2\u01b6\u01b7\5M\'\2\u01b7\u01b8"+
		"\7)\2\2\u01b8\u01be\3\2\2\2\u01b9\u01ba\7)\2\2\u01ba\u01bb\5U+\2\u01bb"+
		"\u01bc\7)\2\2\u01bc\u01be\3\2\2\2\u01bd\u01b5\3\2\2\2\u01bd\u01b9\3\2"+
		"\2\2\u01beL\3\2\2\2\u01bf\u01c0\n\r\2\2\u01c0N\3\2\2\2\u01c1\u01c3\7$"+
		"\2\2\u01c2\u01c4\5Q)\2\u01c3\u01c2\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c5"+
		"\3\2\2\2\u01c5\u01c6\7$\2\2\u01c6P\3\2\2\2\u01c7\u01c9\5S*\2\u01c8\u01c7"+
		"\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb"+
		"R\3\2\2\2\u01cc\u01cf\n\16\2\2\u01cd\u01cf\5U+\2\u01ce\u01cc\3\2\2\2\u01ce"+
		"\u01cd\3\2\2\2\u01cfT\3\2\2\2\u01d0\u01d1\7^\2\2\u01d1\u01d5\t\17\2\2"+
		"\u01d2\u01d5\5W,\2\u01d3\u01d5\5Y-\2\u01d4\u01d0\3\2\2\2\u01d4\u01d2\3"+
		"\2\2\2\u01d4\u01d3\3\2\2\2\u01d5V\3\2\2\2\u01d6\u01d7\7^\2\2\u01d7\u01e2"+
		"\5\'\24\2\u01d8\u01d9\7^\2\2\u01d9\u01da\5\'\24\2\u01da\u01db\5\'\24\2"+
		"\u01db\u01e2\3\2\2\2\u01dc\u01dd\7^\2\2\u01dd\u01de\5[.\2\u01de\u01df"+
		"\5\'\24\2\u01df\u01e0\5\'\24\2\u01e0\u01e2\3\2\2\2\u01e1\u01d6\3\2\2\2"+
		"\u01e1\u01d8\3\2\2\2\u01e1\u01dc\3\2\2\2\u01e2X\3\2\2\2\u01e3\u01e4\7"+
		"^\2\2\u01e4\u01e5\7w\2\2\u01e5\u01e6\5\37\20\2\u01e6\u01e7\5\37\20\2\u01e7"+
		"\u01e8\5\37\20\2\u01e8\u01e9\5\37\20\2\u01e9Z\3\2\2\2\u01ea\u01eb\t\20"+
		"\2\2\u01eb\\\3\2\2\2\u01ec\u01ed\7p\2\2\u01ed\u01ee\7w\2\2\u01ee\u01ef"+
		"\7n\2\2\u01ef\u01f0\7n\2\2\u01f0^\3\2\2\2\u01f1\u01f2\7*\2\2\u01f2`\3"+
		"\2\2\2\u01f3\u01f4\7+\2\2\u01f4b\3\2\2\2\u01f5\u01f6\7%\2\2\u01f6\u01f7"+
		"\7}\2\2\u01f7d\3\2\2\2\u01f8\u01f9\7}\2\2\u01f9f\3\2\2\2\u01fa\u01fb\7"+
		"\177\2\2\u01fbh\3\2\2\2\u01fc\u01fd\7]\2\2\u01fdj\3\2\2\2\u01fe\u01ff"+
		"\7_\2\2\u01ffl\3\2\2\2\u0200\u0201\7=\2\2\u0201n\3\2\2\2\u0202\u0203\7"+
		".\2\2\u0203p\3\2\2\2\u0204\u0205\7\60\2\2\u0205r\3\2\2\2\u0206\u0207\7"+
		"/\2\2\u0207\u0208\7@\2\2\u0208t\3\2\2\2\u0209\u020a\7>\2\2\u020a\u020b"+
		"\7/\2\2\u020bv\3\2\2\2\u020c\u020d\7~\2\2\u020dx\3\2\2\2\u020e\u020f\7"+
		"@\2\2\u020fz\3\2\2\2\u0210\u0211\7>\2\2\u0211|\3\2\2\2\u0212\u0213\7p"+
		"\2\2\u0213\u0214\7q\2\2\u0214\u0215\7v\2\2\u0215~\3\2\2\2\u0216\u0217"+
		"\7\u0080\2\2\u0217\u0080\3\2\2\2\u0218\u0219\7A\2\2\u0219\u0082\3\2\2"+
		"\2\u021a\u021b\7<\2\2\u021b\u0084\3\2\2\2\u021c\u021d\7<\2\2\u021d\u021e"+
		"\7<\2\2\u021e\u0086\3\2\2\2\u021f\u0220\7?\2\2\u0220\u0088\3\2\2\2\u0221"+
		"\u0222\7>\2\2\u0222\u0223\7?\2\2\u0223\u008a\3\2\2\2\u0224\u0225\7@\2"+
		"\2\u0225\u0226\7?\2\2\u0226\u008c\3\2\2\2\u0227\u0228\7>\2\2\u0228\u0229"+
		"\7@\2\2\u0229\u008e\3\2\2\2\u022a\u022b\7c\2\2\u022b\u022c\7p\2\2\u022c"+
		"\u022d\7f\2\2\u022d\u0090\3\2\2\2\u022e\u022f\7q\2\2\u022f\u0230\7t\2"+
		"\2\u0230\u0092\3\2\2\2\u0231\u0232\7z\2\2\u0232\u0233\7q\2\2\u0233\u0234"+
		"\7t\2\2\u0234\u0094\3\2\2\2\u0235\u0236\7-\2\2\u0236\u0096\3\2\2\2\u0237"+
		"\u0238\7/\2\2\u0238\u0098\3\2\2\2\u0239\u023a\7,\2\2\u023a\u009a\3\2\2"+
		"\2\u023b\u023c\7\61\2\2\u023c\u009c\3\2\2\2\u023d\u023e\7\'\2\2\u023e"+
		"\u009e\3\2\2\2\u023f\u0240\7`\2\2\u0240\u00a0\3\2\2\2\u0241\u0242\7o\2"+
		"\2\u0242\u0243\7q\2\2\u0243\u0244\7f\2\2\u0244\u00a2\3\2\2\2\u0245\u0246"+
		"\7H\2\2\u0246\u0247\7Q\2\2\u0247\u0248\7P\2\2\u0248\u0249\7E\2\2\u0249"+
		"\u024a\7V\2\2\u024a\u024b\7K\2\2\u024b\u024c\7Q\2\2\u024c\u024d\7P\2\2"+
		"\u024d\u024e\7P\2\2\u024e\u024f\7C\2\2\u024f\u0250\7N\2\2\u0250\u0251"+
		"\7K\2\2\u0251\u0252\7V\2\2\u0252\u0270\7\u00cb\2\2\u0253\u0254\7H\2\2"+
		"\u0254\u0255\7q\2\2\u0255\u0256\7p\2\2\u0256\u0257\7e\2\2\u0257\u0258"+
		"\7v\2\2\u0258\u0259\7k\2\2\u0259\u025a\7q\2\2\u025a\u025b\7p\2\2\u025b"+
		"\u025c\7p\2\2\u025c\u025d\7c\2\2\u025d\u025e\7n\2\2\u025e\u025f\7k\2\2"+
		"\u025f\u0260\7v\2\2\u0260\u0270\7\u00eb\2\2\u0261\u0262\7h\2\2\u0262\u0263"+
		"\7q\2\2\u0263\u0264\7p\2\2\u0264\u0265\7e\2\2\u0265\u0266\7v\2\2\u0266"+
		"\u0267\7k\2\2\u0267\u0268\7q\2\2\u0268\u0269\7p\2\2\u0269\u026a\7p\2\2"+
		"\u026a\u026b\7c\2\2\u026b\u026c\7n\2\2\u026c\u026d\7k\2\2\u026d\u026e"+
		"\7v\2\2\u026e\u0270\7\u00eb\2\2\u026f\u0245\3\2\2\2\u026f\u0253\3\2\2"+
		"\2\u026f\u0261\3\2\2\2\u0270\u00a4\3\2\2\2\u0271\u0272\7E\2\2\u0272\u0273"+
		"\7Q\2\2\u0273\u0274\7P\2\2\u0274\u0275\7V\2\2\u0275\u0276\7G\2\2\u0276"+
		"\u0277\7Z\2\2\u0277\u0278\7V\2\2\u0278\u028a\7G\2\2\u0279\u027a\7E\2\2"+
		"\u027a\u027b\7q\2\2\u027b\u027c\7p\2\2\u027c\u027d\7v\2\2\u027d\u027e"+
		"\7g\2\2\u027e\u027f\7z\2\2\u027f\u0280\7v\2\2\u0280\u028a\7g\2\2\u0281"+
		"\u0282\7e\2\2\u0282\u0283\7q\2\2\u0283\u0284\7p\2\2\u0284\u0285\7v\2\2"+
		"\u0285\u0286\7g\2\2\u0286\u0287\7z\2\2\u0287\u0288\7v\2\2\u0288\u028a"+
		"\7g\2\2\u0289\u0271\3\2\2\2\u0289\u0279\3\2\2\2\u0289\u0281\3\2\2\2\u028a"+
		"\u00a6\3\2\2\2\u028b\u028c\7U\2\2\u028c\u028d\7E\2\2\u028d\u028e\7G\2"+
		"\2\u028e\u028f\7P\2\2\u028f\u0290\7C\2\2\u0290\u0291\7T\2\2\u0291\u0292"+
		"\7K\2\2\u0292\u02a4\7Q\2\2\u0293\u0294\7U\2\2\u0294\u0295\7e\2\2\u0295"+
		"\u0296\7g\2\2\u0296\u0297\7p\2\2\u0297\u0298\7c\2\2\u0298\u0299\7t\2\2"+
		"\u0299\u029a\7k\2\2\u029a\u02a4\7q\2\2\u029b\u029c\7u\2\2\u029c\u029d"+
		"\7e\2\2\u029d\u029e\7g\2\2\u029e\u029f\7p\2\2\u029f\u02a0\7c\2\2\u02a0"+
		"\u02a1\7t\2\2\u02a1\u02a2\7k\2\2\u02a2\u02a4\7q\2\2\u02a3\u028b\3\2\2"+
		"\2\u02a3\u0293\3\2\2\2\u02a3\u029b\3\2\2\2\u02a4\u00a8\3\2\2\2\u02a5\u02a6"+
		"\7T\2\2\u02a6\u02a7\7\u00cb\2\2\u02a7\u02a8\7U\2\2\u02a8\u02a9\7W\2\2"+
		"\u02a9\u02aa\7O\2\2\u02aa\u02b8\7\u00cb\2\2\u02ab\u02ac\7T\2\2\u02ac\u02ad"+
		"\7\u00eb\2\2\u02ad\u02ae\7u\2\2\u02ae\u02af\7w\2\2\u02af\u02b0\7o\2\2"+
		"\u02b0\u02b8\7\u00eb\2\2\u02b1\u02b2\7t\2\2\u02b2\u02b3\7\u00eb\2\2\u02b3"+
		"\u02b4\7u\2\2\u02b4\u02b5\7w\2\2\u02b5\u02b6\7o\2\2\u02b6\u02b8\7\u00eb"+
		"\2\2\u02b7\u02a5\3\2\2\2\u02b7\u02ab\3\2\2\2\u02b7\u02b1\3\2\2\2\u02b8"+
		"\u00aa\3\2\2\2\u02b9\u02ba\5\u00adW\2\u02ba\u02bb\5\u00afX\2\u02bb\u00ac"+
		"\3\2\2\2\u02bc\u02bd\7\u00cb\2\2\u02bd\u02be\7V\2\2\u02be\u02bf\7C\2\2"+
		"\u02bf\u02c0\7P\2\2\u02c0\u02cc\7V\2\2\u02c1\u02c2\7\u00cb\2\2\u02c2\u02c3"+
		"\7v\2\2\u02c3\u02c4\7c\2\2\u02c4\u02c5\7p\2\2\u02c5\u02cc\7v\2\2\u02c6"+
		"\u02c7\7\u00eb\2\2\u02c7\u02c8\7v\2\2\u02c8\u02c9\7c\2\2\u02c9\u02ca\7"+
		"p\2\2\u02ca\u02cc\7v\2\2\u02cb\u02bc\3\2\2\2\u02cb\u02c1\3\2\2\2\u02cb"+
		"\u02c6\3\2\2\2\u02cc\u00ae\3\2\2\2\u02cd\u02ce\7F\2\2\u02ce\u02cf\7Q\2"+
		"\2\u02cf\u02d0\7P\2\2\u02d0\u02d1\7P\2\2\u02d1\u02dd\7\u00cb\2\2\u02d2"+
		"\u02d3\7F\2\2\u02d3\u02d4\7q\2\2\u02d4\u02d5\7p\2\2\u02d5\u02d6\7p\2\2"+
		"\u02d6\u02dd\7\u00eb\2\2\u02d7\u02d8\7f\2\2\u02d8\u02d9\7q\2\2\u02d9\u02da"+
		"\7p\2\2\u02da\u02db\7p\2\2\u02db\u02dd\7\u00eb\2\2\u02dc\u02cd\3\2\2\2"+
		"\u02dc\u02d2\3\2\2\2\u02dc\u02d7\3\2\2\2\u02dd\u00b0\3\2\2\2\u02de\u02df"+
		"\7S\2\2\u02df\u02e0\7W\2\2\u02e0\u02e1\7C\2\2\u02e1\u02e2\7P\2\2\u02e2"+
		"\u02ee\7F\2\2\u02e3\u02e4\7S\2\2\u02e4\u02e5\7w\2\2\u02e5\u02e6\7c\2\2"+
		"\u02e6\u02e7\7p\2\2\u02e7\u02ee\7f\2\2\u02e8\u02e9\7s\2\2\u02e9\u02ea"+
		"\7w\2\2\u02ea\u02eb\7c\2\2\u02eb\u02ec\7p\2\2\u02ec\u02ee\7f\2\2\u02ed"+
		"\u02de\3\2\2\2\u02ed\u02e3\3\2\2\2\u02ed\u02e8\3\2\2\2\u02ee\u00b2\3\2"+
		"\2\2\u02ef\u02f0\7C\2\2\u02f0\u02f1\7N\2\2\u02f1\u02f2\7Q\2\2\u02f2\u02f3"+
		"\7T\2\2\u02f3\u02ff\7U\2\2\u02f4\u02f5\7C\2\2\u02f5\u02f6\7n\2\2\u02f6"+
		"\u02f7\7q\2\2\u02f7\u02f8\7t\2\2\u02f8\u02ff\7u\2\2\u02f9\u02fa\7c\2\2"+
		"\u02fa\u02fb\7n\2\2\u02fb\u02fc\7q\2\2\u02fc\u02fd\7t\2\2\u02fd\u02ff"+
		"\7u\2\2\u02fe\u02ef\3\2\2\2\u02fe\u02f4\3\2\2\2\u02fe\u02f9\3\2\2\2\u02ff"+
		"\u00b4\3\2\2\2\u0300\u0301\7O\2\2\u0301\u0302\7C\2\2\u0302\u0303\7K\2"+
		"\2\u0303\u030d\7U\2\2\u0304\u0305\7O\2\2\u0305\u0306\7c\2\2\u0306\u0307"+
		"\7k\2\2\u0307\u030d\7u\2\2\u0308\u0309\7o\2\2\u0309\u030a\7c\2\2\u030a"+
		"\u030b\7k\2\2\u030b\u030d\7u\2\2\u030c\u0300\3\2\2\2\u030c\u0304\3\2\2"+
		"\2\u030c\u0308\3\2\2\2\u030d\u00b6\3\2\2\2\u030e\u030f\7F\2\2\u030f\u0328"+
		"\7G\2\2\u0310\u0311\7F\2\2\u0311\u0328\7g\2\2\u0312\u0313\7f\2\2\u0313"+
		"\u0328\7g\2\2\u0314\u0315\7F\2\2\u0315\u0316\7G\2\2\u0316\u0328\7U\2\2"+
		"\u0317\u0318\7F\2\2\u0318\u0319\7g\2\2\u0319\u0328\7u\2\2\u031a\u031b"+
		"\7f\2\2\u031b\u031c\7g\2\2\u031c\u0328\7u\2\2\u031d\u031e\7F\2\2\u031e"+
		"\u0328\7W\2\2\u031f\u0320\7F\2\2\u0320\u0328\7w\2\2\u0321\u0322\7f\2\2"+
		"\u0322\u0328\7w\2\2\u0323\u0324\7F\2\2\u0324\u0328\7)\2\2\u0325\u0326"+
		"\7f\2\2\u0326\u0328\7)\2\2\u0327\u030e\3\2\2\2\u0327\u0310\3\2\2\2\u0327"+
		"\u0312\3\2\2\2\u0327\u0314\3\2\2\2\u0327\u0317\3\2\2\2\u0327\u031a\3\2"+
		"\2\2\u0327\u031d\3\2\2\2\u0327\u031f\3\2\2\2\u0327\u0321\3\2\2\2\u0327"+
		"\u0323\3\2\2\2\u0327\u0325\3\2\2\2\u0328\u00b8\3\2\2\2\u0329\u032a\7B"+
		"\2\2\u032a\u032b\7r\2\2\u032b\u032c\7t\2\2\u032c\u032d\7g\2\2\u032d\u00ba"+
		"\3\2\2\2\u032e\u032f\7\60\2\2\u032f\u0330\7\60\2\2\u0330\u0331\7\60\2"+
		"\2\u0331\u00bc\3\2\2\2\u0332\u0333\7K\2\2\u0333\u0334\7P\2\2\u0334\u0335"+
		"\7K\2\2\u0335\u0336\7V\2\2\u0336\u0337\7K\2\2\u0337\u0338\7C\2\2\u0338"+
		"\u0348\7N\2\2\u0339\u033a\7K\2\2\u033a\u033b\7p\2\2\u033b\u033c\7k\2\2"+
		"\u033c\u033d\7v\2\2\u033d\u033e\7k\2\2\u033e\u033f\7c\2\2\u033f\u0348"+
		"\7n\2\2\u0340\u0341\7k\2\2\u0341\u0342\7p\2\2\u0342\u0343\7k\2\2\u0343"+
		"\u0344\7v\2\2\u0344\u0345\7k\2\2\u0345\u0346\7c\2\2\u0346\u0348\7n\2\2"+
		"\u0347\u0332\3\2\2\2\u0347\u0339\3\2\2\2\u0347\u0340\3\2\2\2\u0348\u00be"+
		"\3\2\2\2\u0349\u034a\7K\2\2\u034a\u0350\7U\2\2\u034b\u034c\7K\2\2\u034c"+
		"\u0350\7u\2\2\u034d\u034e\7k\2\2\u034e\u0350\7u\2\2\u034f\u0349\3\2\2"+
		"\2\u034f\u034b\3\2\2\2\u034f\u034d\3\2\2\2\u0350\u00c0\3\2\2\2\u0351\u0352"+
		"\7P\2\2\u0352\u0353\7G\2\2\u0353\u035b\7Y\2\2\u0354\u0355\7P\2\2\u0355"+
		"\u0356\7g\2\2\u0356\u035b\7y\2\2\u0357\u0358\7p\2\2\u0358\u0359\7g\2\2"+
		"\u0359\u035b\7y\2\2\u035a\u0351\3\2\2\2\u035a\u0354\3\2\2\2\u035a\u0357"+
		"\3\2\2\2\u035b\u00c2\3\2\2\2\u035c\u035d\7V\2\2\u035d\u035e\7J\2\2\u035e"+
		"\u0366\7G\2\2\u035f\u0360\7V\2\2\u0360\u0361\7j\2\2\u0361\u0366\7g\2\2"+
		"\u0362\u0363\7v\2\2\u0363\u0364\7j\2\2\u0364\u0366\7g\2\2\u0365\u035c"+
		"\3\2\2\2\u0365\u035f\3\2\2\2\u0365\u0362\3\2\2\2\u0366\u00c4\3\2\2\2\u0367"+
		"\u0368\7V\2\2\u0368\u0369\7J\2\2\u0369\u036a\7K\2\2\u036a\u0374\7U\2\2"+
		"\u036b\u036c\7V\2\2\u036c\u036d\7j\2\2\u036d\u036e\7k\2\2\u036e\u0374"+
		"\7u\2\2\u036f\u0370\7v\2\2\u0370\u0371\7j\2\2\u0371\u0372\7k\2\2\u0372"+
		"\u0374\7u\2\2\u0373\u0367\3\2\2\2\u0373\u036b\3\2\2\2\u0373\u036f\3\2"+
		"\2\2\u0374\u00c6\3\2\2\2\u0375\u037d\t\21\2\2\u0376\u0377\7C\2\2\u0377"+
		"\u037d\7P\2\2\u0378\u0379\7C\2\2\u0379\u037d\7p\2\2\u037a\u037b\7c\2\2"+
		"\u037b\u037d\7p\2\2\u037c\u0375\3\2\2\2\u037c\u0376\3\2\2\2\u037c\u0378"+
		"\3\2\2\2\u037c\u037a\3\2\2\2\u037d\u00c8\3\2\2\2\u037e\u037f\7Y\2\2\u037f"+
		"\u0380\7K\2\2\u0380\u0381\7V\2\2\u0381\u038b\7J\2\2\u0382\u0383\7Y\2\2"+
		"\u0383\u0384\7k\2\2\u0384\u0385\7v\2\2\u0385\u038b\7j\2\2\u0386\u0387"+
		"\7y\2\2\u0387\u0388\7k\2\2\u0388\u0389\7v\2\2\u0389\u038b\7j\2\2\u038a"+
		"\u037e\3\2\2\2\u038a\u0382\3\2\2\2\u038a\u0386\3\2\2\2\u038b\u00ca\3\2"+
		"\2\2\u038c\u038d\7V\2\2\u038d\u038e\7[\2\2\u038e\u038f\7R\2\2\u038f\u0399"+
		"\7G\2\2\u0390\u0391\7V\2\2\u0391\u0392\7{\2\2\u0392\u0393\7r\2\2\u0393"+
		"\u0399\7g\2\2\u0394\u0395\7v\2\2\u0395\u0396\7{\2\2\u0396\u0397\7r\2\2"+
		"\u0397\u0399\7g\2\2\u0398\u038c\3\2\2\2\u0398\u0390\3\2\2\2\u0398\u0394"+
		"\3\2\2\2\u0399\u00cc\3\2\2\2\u039a\u039b\7M\2\2\u039b\u039c\7K\2\2\u039c"+
		"\u039d\7P\2\2\u039d\u03a7\7F\2\2\u039e\u039f\7M\2\2\u039f\u03a0\7k\2\2"+
		"\u03a0\u03a1\7p\2\2\u03a1\u03a7\7f\2\2\u03a2\u03a3\7m\2\2\u03a3\u03a4"+
		"\7k\2\2\u03a4\u03a5\7p\2\2\u03a5\u03a7\7f\2\2\u03a6\u039a\3\2\2\2\u03a6"+
		"\u039e\3\2\2\2\u03a6\u03a2\3\2\2\2\u03a7\u00ce\3\2\2\2\u03a8\u03a9\7C"+
		"\2\2\u03a9\u03af\7U\2\2\u03aa\u03ab\7C\2\2\u03ab\u03af\7u\2\2\u03ac\u03ad"+
		"\7c\2\2\u03ad\u03af\7u\2\2\u03ae\u03a8\3\2\2\2\u03ae\u03aa\3\2\2\2\u03ae"+
		"\u03ac\3\2\2\2\u03af\u00d0\3\2\2\2\u03b0\u03b1\7Q\2\2\u03b1\u03b2\7T\2"+
		"\2\u03b2\u03b3\7F\2\2\u03b3\u03b4\7G\2\2\u03b4\u03b5\7T\2\2\u03b5\u03b6"+
		"\7G\2\2\u03b6\u03c6\7F\2\2\u03b7\u03b8\7Q\2\2\u03b8\u03b9\7t\2\2\u03b9"+
		"\u03ba\7f\2\2\u03ba\u03bb\7g\2\2\u03bb\u03bc\7t\2\2\u03bc\u03bd\7g\2\2"+
		"\u03bd\u03c6\7f\2\2\u03be\u03bf\7q\2\2\u03bf\u03c0\7t\2\2\u03c0\u03c1"+
		"\7f\2\2\u03c1\u03c2\7g\2\2\u03c2\u03c3\7t\2\2\u03c3\u03c4\7g\2\2\u03c4"+
		"\u03c6\7f\2\2\u03c5\u03b0\3\2\2\2\u03c5\u03b7\3\2\2\2\u03c5\u03be\3\2"+
		"\2\2\u03c6\u00d2\3\2\2\2\u03c7\u03c8\7W\2\2\u03c8\u03c9\7P\2\2\u03c9\u03ca"+
		"\7Q\2\2\u03ca\u03cb\7T\2\2\u03cb\u03cc\7F\2\2\u03cc\u03cd\7G\2\2\u03cd"+
		"\u03ce\7T\2\2\u03ce\u03cf\7G\2\2\u03cf\u03e3\7F\2\2\u03d0\u03d1\7W\2\2"+
		"\u03d1\u03d2\7p\2\2\u03d2\u03d3\7q\2\2\u03d3\u03d4\7t\2\2\u03d4\u03d5"+
		"\7f\2\2\u03d5\u03d6\7g\2\2\u03d6\u03d7\7t\2\2\u03d7\u03d8\7g\2\2\u03d8"+
		"\u03e3\7f\2\2\u03d9\u03da\7w\2\2\u03da\u03db\7p\2\2\u03db\u03dc\7q\2\2"+
		"\u03dc\u03dd\7t\2\2\u03dd\u03de\7f\2\2\u03de\u03df\7g\2\2\u03df\u03e0"+
		"\7t\2\2\u03e0\u03e1\7g\2\2\u03e1\u03e3\7f\2\2\u03e2\u03c7\3\2\2\2\u03e2"+
		"\u03d0\3\2\2\2\u03e2\u03d9\3\2\2\2\u03e3\u00d4\3\2\2\2\u03e4\u03e5\7U"+
		"\2\2\u03e5\u03e6\7G\2\2\u03e6\u03e7\7S\2\2\u03e7\u03e8\7W\2\2\u03e8\u03e9"+
		"\7G\2\2\u03e9\u03ea\7P\2\2\u03ea\u03eb\7E\2\2\u03eb\u03fd\7G\2\2\u03ec"+
		"\u03ed\7U\2\2\u03ed\u03ee\7g\2\2\u03ee\u03ef\7s\2\2\u03ef\u03f0\7w\2\2"+
		"\u03f0\u03f1\7g\2\2\u03f1\u03f2\7p\2\2\u03f2\u03f3\7e\2\2\u03f3\u03fd"+
		"\7g\2\2\u03f4\u03f5\7u\2\2\u03f5\u03f6\7g\2\2\u03f6\u03f7\7s\2\2\u03f7"+
		"\u03f8\7w\2\2\u03f8\u03f9\7g\2\2\u03f9\u03fa\7p\2\2\u03fa\u03fb\7e\2\2"+
		"\u03fb\u03fd\7g\2\2\u03fc\u03e4\3\2\2\2\u03fc\u03ec\3\2\2\2\u03fc\u03f4"+
		"\3\2\2\2\u03fd\u00d6\3\2\2\2\u03fe\u03ff\7D\2\2\u03ff\u0400\7C\2\2\u0400"+
		"\u0408\7I\2\2\u0401\u0402\7D\2\2\u0402\u0403\7c\2\2\u0403\u0408\7i\2\2"+
		"\u0404\u0405\7d\2\2\u0405\u0406\7c\2\2\u0406\u0408\7i\2\2\u0407\u03fe"+
		"\3\2\2\2\u0407\u0401\3\2\2\2\u0407\u0404\3\2\2\2\u0408\u00d8\3\2\2\2\u0409"+
		"\u040a\7U\2\2\u040a\u040b\7G\2\2\u040b\u0413\7V\2\2\u040c\u040d\7U\2\2"+
		"\u040d\u040e\7g\2\2\u040e\u0413\7v\2\2\u040f\u0410\7u\2\2\u0410\u0411"+
		"\7g\2\2\u0411\u0413\7v\2\2\u0412\u0409\3\2\2\2\u0412\u040c\3\2\2\2\u0412"+
		"\u040f\3\2\2\2\u0413\u00da\3\2\2\2\u0414\u0418\5\u00ddo\2\u0415\u0417"+
		"\5\u00dfp\2\u0416\u0415\3\2\2\2\u0417\u041a\3\2\2\2\u0418\u0416\3\2\2"+
		"\2\u0418\u0419\3\2\2\2\u0419\u00dc\3\2\2\2\u041a\u0418\3\2\2\2\u041b\u0422"+
		"\t\22\2\2\u041c\u041d\n\23\2\2\u041d\u0422\6o\2\2\u041e\u041f\t\24\2\2"+
		"\u041f\u0420\t\25\2\2\u0420\u0422\6o\3\2\u0421\u041b\3\2\2\2\u0421\u041c"+
		"\3\2\2\2\u0421\u041e\3\2\2\2\u0422\u00de\3\2\2\2\u0423\u042a\t\26\2\2"+
		"\u0424\u0425\n\23\2\2\u0425\u042a\6p\4\2\u0426\u0427\t\24\2\2\u0427\u0428"+
		"\t\25\2\2\u0428\u042a\6p\5\2\u0429\u0423\3\2\2\2\u0429\u0424\3\2\2\2\u0429"+
		"\u0426\3\2\2\2\u042a\u00e0\3\2\2\2\u042b\u042d\t\27\2\2\u042c\u042b\3"+
		"\2\2\2\u042d\u042e\3\2\2\2\u042e\u042c\3\2\2\2\u042e\u042f\3\2\2\2\u042f"+
		"\u0430\3\2\2\2\u0430\u0431\bq\2\2\u0431\u00e2\3\2\2\2\u0432\u0433\7\61"+
		"\2\2\u0433\u0434\7,\2\2\u0434\u0438\3\2\2\2\u0435\u0437\13\2\2\2\u0436"+
		"\u0435\3\2\2\2\u0437\u043a\3\2\2\2\u0438\u0439\3\2\2\2\u0438\u0436\3\2"+
		"\2\2\u0439\u043b\3\2\2\2\u043a\u0438\3\2\2\2\u043b\u043c\7,\2\2\u043c"+
		"\u043d\7\61\2\2\u043d\u043e\3\2\2\2\u043e\u043f\br\2\2\u043f\u00e4\3\2"+
		"\2\2\u0440\u0441\7/\2\2\u0441\u0442\7/\2\2\u0442\u0446\3\2\2\2\u0443\u0445"+
		"\n\30\2\2\u0444\u0443\3\2\2\2\u0445\u0448\3\2\2\2\u0446\u0444\3\2\2\2"+
		"\u0446\u0447\3\2\2\2\u0447\u0449\3\2\2\2\u0448\u0446\3\2\2\2\u0449\u044a"+
		"\bs\2\2\u044a\u00e6\3\2\2\2L\2\u00eb\u00ef\u00f3\u00f7\u00fb\u0102\u0107"+
		"\u0109\u010f\u0113\u0117\u011d\u0122\u012c\u0130\u0136\u013a\u0142\u0146"+
		"\u014c\u0156\u015a\u0160\u0164\u0169\u016c\u016f\u0174\u0177\u017c\u0181"+
		"\u0189\u0194\u0198\u019d\u01a1\u01bd\u01c3\u01ca\u01ce\u01d4\u01e1\u026f"+
		"\u0289\u02a3\u02b7\u02cb\u02dc\u02ed\u02fe\u030c\u0327\u0347\u034f\u035a"+
		"\u0365\u0373\u037c\u038a\u0398\u03a6\u03ae\u03c5\u03e2\u03fc\u0407\u0412"+
		"\u0418\u0421\u0429\u042e\u0438\u0446\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}