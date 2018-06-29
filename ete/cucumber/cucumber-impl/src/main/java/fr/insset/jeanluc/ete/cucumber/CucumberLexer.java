// Generated from fr/insset/jeanluc/ete/cucumber/CucumberLexer.g4 by ANTLR 4.5.3
package fr.insset.jeanluc.ete.cucumber;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CucumberLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IntegerLiteral=1, FloatingPointLiteral=2, BooleanLiteral=3, DateLiteral=4, 
		CharacterLiteral=5, StringLiteral=6, NullLiteral=7, LPAREN=8, RPAREN=9, 
		START_EXP=10, LBRACE=11, RBRACE=12, LBRACK=13, RBRACK=14, SEMI=15, COMMA=16, 
		DOT=17, ARROW=18, LEFT_ARROW=19, PIPE=20, GT=21, LT=22, NOT=23, TILDE=24, 
		QUESTION=25, COLON=26, DOUBLE_COLON=27, EQUAL=28, LE=29, GE=30, NOTEQUAL=31, 
		AND=32, OR=33, XOR=34, ADD=35, SUB=36, MUL=37, DIV=38, MOD_PERCENT=39, 
		CARET=40, MOD=41, FEATURE=42, BACKGROUND=43, SCENARIO=44, OUTLINE=45, 
		GIVEN=46, WHEN=47, THEN=48, BUT=49, OF=50, Identifier=51, ATPRE=52, ELLIPSIS=53, 
		WS=54, COMMENT=55, LINE_COMMENT=56;
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
		"BinaryExponentIndicator", "BooleanLiteral", "DateLiteral", "CharacterLiteral", 
		"SingleCharacter", "StringLiteral", "StringCharacters", "StringCharacter", 
		"EscapeSequence", "OctalEscape", "UnicodeEscape", "ZeroToThree", "NullLiteral", 
		"LPAREN", "RPAREN", "START_EXP", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
		"SEMI", "COMMA", "DOT", "ARROW", "LEFT_ARROW", "PIPE", "GT", "LT", "NOT", 
		"TILDE", "QUESTION", "COLON", "DOUBLE_COLON", "EQUAL", "LE", "GE", "NOTEQUAL", 
		"AND", "OR", "XOR", "ADD", "SUB", "MUL", "DIV", "MOD_PERCENT", "CARET", 
		"MOD", "FEATURE", "BACKGROUND", "SCENARIO", "OUTLINE", "GIVEN", "WHEN", 
		"THEN", "BUT", "OF", "Identifier", "JavaLetter", "JavaLetterOrDigit", 
		"ATPRE", "ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, "'null'", "'('", "')'", "'#{'", 
		"'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'->'", "'<-'", "'|'", 
		"'>'", "'<'", "'not'", "'~'", "'?'", "':'", "'::'", "'='", "'<='", "'>='", 
		"'<>'", "'and'", "'or'", "'xor'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", 
		"'mod'", "'Feature'", "'Background'", "'Scenario'", "'Outline'", "'Given'", 
		"'When'", "'Then'", "'But'", "'of'", null, "'@pre'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IntegerLiteral", "FloatingPointLiteral", "BooleanLiteral", "DateLiteral", 
		"CharacterLiteral", "StringLiteral", "NullLiteral", "LPAREN", "RPAREN", 
		"START_EXP", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
		"DOT", "ARROW", "LEFT_ARROW", "PIPE", "GT", "LT", "NOT", "TILDE", "QUESTION", 
		"COLON", "DOUBLE_COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", 
		"XOR", "ADD", "SUB", "MUL", "DIV", "MOD_PERCENT", "CARET", "MOD", "FEATURE", 
		"BACKGROUND", "SCENARIO", "OUTLINE", "GIVEN", "WHEN", "THEN", "BUT", "OF", 
		"Identifier", "ATPRE", "ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT"
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


	public CucumberLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CucumberLexer.g4"; }

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
		case 91:
			return JavaLetter_sempred((RuleContext)_localctx, predIndex);
		case 92:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2:\u02ab\b\1\4\2\t"+
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
		"`\t`\4a\ta\4b\tb\4c\tc\3\2\3\2\3\2\3\2\5\2\u00cc\n\2\3\3\3\3\5\3\u00d0"+
		"\n\3\3\4\3\4\5\4\u00d4\n\4\3\5\3\5\5\5\u00d8\n\5\3\6\3\6\5\6\u00dc\n\6"+
		"\3\7\3\7\3\b\3\b\3\b\5\b\u00e3\n\b\3\b\3\b\3\b\5\b\u00e8\n\b\5\b\u00ea"+
		"\n\b\3\t\3\t\7\t\u00ee\n\t\f\t\16\t\u00f1\13\t\3\t\5\t\u00f4\n\t\3\n\3"+
		"\n\5\n\u00f8\n\n\3\13\3\13\3\f\3\f\5\f\u00fe\n\f\3\r\6\r\u0101\n\r\r\r"+
		"\16\r\u0102\3\16\3\16\3\16\3\16\3\17\3\17\7\17\u010b\n\17\f\17\16\17\u010e"+
		"\13\17\3\17\5\17\u0111\n\17\3\20\3\20\3\21\3\21\5\21\u0117\n\21\3\22\3"+
		"\22\5\22\u011b\n\22\3\22\3\22\3\23\3\23\7\23\u0121\n\23\f\23\16\23\u0124"+
		"\13\23\3\23\5\23\u0127\n\23\3\24\3\24\3\25\3\25\5\25\u012d\n\25\3\26\3"+
		"\26\3\26\3\26\3\27\3\27\7\27\u0135\n\27\f\27\16\27\u0138\13\27\3\27\5"+
		"\27\u013b\n\27\3\30\3\30\3\31\3\31\5\31\u0141\n\31\3\32\3\32\5\32\u0145"+
		"\n\32\3\33\3\33\3\33\5\33\u014a\n\33\3\33\5\33\u014d\n\33\3\33\5\33\u0150"+
		"\n\33\3\33\3\33\3\33\5\33\u0155\n\33\3\33\5\33\u0158\n\33\3\33\3\33\3"+
		"\33\5\33\u015d\n\33\3\33\3\33\3\33\5\33\u0162\n\33\3\34\3\34\3\34\3\35"+
		"\3\35\3\36\5\36\u016a\n\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\5!\u0175"+
		"\n!\3\"\3\"\5\"\u0179\n\"\3\"\3\"\3\"\5\"\u017e\n\"\3\"\3\"\5\"\u0182"+
		"\n\"\3#\3#\3#\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0192\n%\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01a9"+
		"\n\'\3(\3(\3)\3)\5)\u01af\n)\3)\3)\3*\6*\u01b4\n*\r*\16*\u01b5\3+\3+\5"+
		"+\u01ba\n+\3,\3,\3,\3,\5,\u01c0\n,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5"+
		"-\u01cd\n-\3.\3.\3.\3.\3.\3.\3.\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3"+
		"\61\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3"+
		"8\38\39\39\3:\3:\3;\3;\3;\3<\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3@\3@\3A\3"+
		"A\3B\3B\3C\3C\3D\3D\3D\3E\3E\3F\3F\3F\3G\3G\3G\3H\3H\3H\3I\3I\3I\3I\3"+
		"J\3J\3J\3K\3K\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3R\3R\3"+
		"S\3S\3S\3S\3S\3S\3S\3S\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3U\3U\3U\3U\3"+
		"U\3U\3U\3U\3U\3V\3V\3V\3V\3V\3V\3V\3V\3W\3W\3W\3W\3W\3W\3X\3X\3X\3X\3"+
		"X\3Y\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3[\3[\3[\3\\\3\\\7\\\u026e\n\\\f\\\16\\\u0271"+
		"\13\\\3]\3]\3]\3]\3]\3]\5]\u0279\n]\3^\3^\3^\3^\3^\3^\5^\u0281\n^\3_\3"+
		"_\3_\3_\3_\3`\3`\3`\3`\3a\6a\u028d\na\ra\16a\u028e\3a\3a\3b\3b\3b\3b\7"+
		"b\u0297\nb\fb\16b\u029a\13b\3b\3b\3b\3b\3b\3c\3c\3c\3c\7c\u02a5\nc\fc"+
		"\16c\u02a8\13c\3c\3c\3\u0298\2d\3\3\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23"+
		"\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\4\65"+
		"\2\67\29\2;\2=\2?\2A\2C\2E\2G\2I\5K\6M\7O\2Q\bS\2U\2W\2Y\2[\2]\2_\ta\n"+
		"c\13e\fg\ri\16k\17m\20o\21q\22s\23u\24w\25y\26{\27}\30\177\31\u0081\32"+
		"\u0083\33\u0085\34\u0087\35\u0089\36\u008b\37\u008d \u008f!\u0091\"\u0093"+
		"#\u0095$\u0097%\u0099&\u009b\'\u009d(\u009f)\u00a1*\u00a3+\u00a5,\u00a7"+
		"-\u00a9.\u00ab/\u00ad\60\u00af\61\u00b1\62\u00b3\63\u00b5\64\u00b7\65"+
		"\u00b9\2\u00bb\2\u00bd\66\u00bf\67\u00c18\u00c39\u00c5:\3\2\30\4\2NNn"+
		"n\3\2\63;\4\2ZZzz\5\2\62;CHch\3\2\629\4\2DDdd\3\2\62\63\4\2GGgg\4\2--"+
		"//\6\2FFHHffhh\4\2RRrr\4\2))^^\4\2$$^^\n\2$$))^^ddhhppttvv\3\2\62\65\6"+
		"\2&&C\\aac|\4\2\2\u0101\ud802\udc01\3\2\ud802\udc01\3\2\udc02\ue001\7"+
		"\2&&\62;C\\aac|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\u02b9\2\3\3\2\2\2\2\63"+
		"\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2Q\3\2\2\2\2_\3\2\2\2\2a\3\2"+
		"\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2"+
		"\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{"+
		"\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2"+
		"\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9"+
		"\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2"+
		"\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf"+
		"\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2\2\3\u00cb\3\2\2"+
		"\2\5\u00cd\3\2\2\2\7\u00d1\3\2\2\2\t\u00d5\3\2\2\2\13\u00d9\3\2\2\2\r"+
		"\u00dd\3\2\2\2\17\u00e9\3\2\2\2\21\u00eb\3\2\2\2\23\u00f7\3\2\2\2\25\u00f9"+
		"\3\2\2\2\27\u00fd\3\2\2\2\31\u0100\3\2\2\2\33\u0104\3\2\2\2\35\u0108\3"+
		"\2\2\2\37\u0112\3\2\2\2!\u0116\3\2\2\2#\u0118\3\2\2\2%\u011e\3\2\2\2\'"+
		"\u0128\3\2\2\2)\u012c\3\2\2\2+\u012e\3\2\2\2-\u0132\3\2\2\2/\u013c\3\2"+
		"\2\2\61\u0140\3\2\2\2\63\u0144\3\2\2\2\65\u0161\3\2\2\2\67\u0163\3\2\2"+
		"\29\u0166\3\2\2\2;\u0169\3\2\2\2=\u016d\3\2\2\2?\u016f\3\2\2\2A\u0171"+
		"\3\2\2\2C\u0181\3\2\2\2E\u0183\3\2\2\2G\u0186\3\2\2\2I\u0191\3\2\2\2K"+
		"\u0193\3\2\2\2M\u01a8\3\2\2\2O\u01aa\3\2\2\2Q\u01ac\3\2\2\2S\u01b3\3\2"+
		"\2\2U\u01b9\3\2\2\2W\u01bf\3\2\2\2Y\u01cc\3\2\2\2[\u01ce\3\2\2\2]\u01d5"+
		"\3\2\2\2_\u01d7\3\2\2\2a\u01dc\3\2\2\2c\u01de\3\2\2\2e\u01e0\3\2\2\2g"+
		"\u01e3\3\2\2\2i\u01e5\3\2\2\2k\u01e7\3\2\2\2m\u01e9\3\2\2\2o\u01eb\3\2"+
		"\2\2q\u01ed\3\2\2\2s\u01ef\3\2\2\2u\u01f1\3\2\2\2w\u01f4\3\2\2\2y\u01f7"+
		"\3\2\2\2{\u01f9\3\2\2\2}\u01fb\3\2\2\2\177\u01fd\3\2\2\2\u0081\u0201\3"+
		"\2\2\2\u0083\u0203\3\2\2\2\u0085\u0205\3\2\2\2\u0087\u0207\3\2\2\2\u0089"+
		"\u020a\3\2\2\2\u008b\u020c\3\2\2\2\u008d\u020f\3\2\2\2\u008f\u0212\3\2"+
		"\2\2\u0091\u0215\3\2\2\2\u0093\u0219\3\2\2\2\u0095\u021c\3\2\2\2\u0097"+
		"\u0220\3\2\2\2\u0099\u0222\3\2\2\2\u009b\u0224\3\2\2\2\u009d\u0226\3\2"+
		"\2\2\u009f\u0228\3\2\2\2\u00a1\u022a\3\2\2\2\u00a3\u022c\3\2\2\2\u00a5"+
		"\u0230\3\2\2\2\u00a7\u0238\3\2\2\2\u00a9\u0243\3\2\2\2\u00ab\u024c\3\2"+
		"\2\2\u00ad\u0254\3\2\2\2\u00af\u025a\3\2\2\2\u00b1\u025f\3\2\2\2\u00b3"+
		"\u0264\3\2\2\2\u00b5\u0268\3\2\2\2\u00b7\u026b\3\2\2\2\u00b9\u0278\3\2"+
		"\2\2\u00bb\u0280\3\2\2\2\u00bd\u0282\3\2\2\2\u00bf\u0287\3\2\2\2\u00c1"+
		"\u028c\3\2\2\2\u00c3\u0292\3\2\2\2\u00c5\u02a0\3\2\2\2\u00c7\u00cc\5\5"+
		"\3\2\u00c8\u00cc\5\7\4\2\u00c9\u00cc\5\t\5\2\u00ca\u00cc\5\13\6\2\u00cb"+
		"\u00c7\3\2\2\2\u00cb\u00c8\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00ca\3\2"+
		"\2\2\u00cc\4\3\2\2\2\u00cd\u00cf\5\17\b\2\u00ce\u00d0\5\r\7\2\u00cf\u00ce"+
		"\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\6\3\2\2\2\u00d1\u00d3\5\33\16\2\u00d2"+
		"\u00d4\5\r\7\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\b\3\2\2\2"+
		"\u00d5\u00d7\5#\22\2\u00d6\u00d8\5\r\7\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8"+
		"\3\2\2\2\u00d8\n\3\2\2\2\u00d9\u00db\5+\26\2\u00da\u00dc\5\r\7\2\u00db"+
		"\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\f\3\2\2\2\u00dd\u00de\t\2\2\2"+
		"\u00de\16\3\2\2\2\u00df\u00ea\7\62\2\2\u00e0\u00e7\5\25\13\2\u00e1\u00e3"+
		"\5\21\t\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e8\3\2\2\2"+
		"\u00e4\u00e5\5\31\r\2\u00e5\u00e6\5\21\t\2\u00e6\u00e8\3\2\2\2\u00e7\u00e2"+
		"\3\2\2\2\u00e7\u00e4\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00df\3\2\2\2\u00e9"+
		"\u00e0\3\2\2\2\u00ea\20\3\2\2\2\u00eb\u00f3\5\23\n\2\u00ec\u00ee\5\27"+
		"\f\2\u00ed\u00ec\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f4\5\23"+
		"\n\2\u00f3\u00ef\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\22\3\2\2\2\u00f5\u00f8"+
		"\7\62\2\2\u00f6\u00f8\5\25\13\2\u00f7\u00f5\3\2\2\2\u00f7\u00f6\3\2\2"+
		"\2\u00f8\24\3\2\2\2\u00f9\u00fa\t\3\2\2\u00fa\26\3\2\2\2\u00fb\u00fe\5"+
		"\23\n\2\u00fc\u00fe\7a\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe"+
		"\30\3\2\2\2\u00ff\u0101\7a\2\2\u0100\u00ff\3\2\2\2\u0101\u0102\3\2\2\2"+
		"\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\32\3\2\2\2\u0104\u0105"+
		"\7\62\2\2\u0105\u0106\t\4\2\2\u0106\u0107\5\35\17\2\u0107\34\3\2\2\2\u0108"+
		"\u0110\5\37\20\2\u0109\u010b\5!\21\2\u010a\u0109\3\2\2\2\u010b\u010e\3"+
		"\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f\3\2\2\2\u010e"+
		"\u010c\3\2\2\2\u010f\u0111\5\37\20\2\u0110\u010c\3\2\2\2\u0110\u0111\3"+
		"\2\2\2\u0111\36\3\2\2\2\u0112\u0113\t\5\2\2\u0113 \3\2\2\2\u0114\u0117"+
		"\5\37\20\2\u0115\u0117\7a\2\2\u0116\u0114\3\2\2\2\u0116\u0115\3\2\2\2"+
		"\u0117\"\3\2\2\2\u0118\u011a\7\62\2\2\u0119\u011b\5\31\r\2\u011a\u0119"+
		"\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\5%\23\2\u011d"+
		"$\3\2\2\2\u011e\u0126\5\'\24\2\u011f\u0121\5)\25\2\u0120\u011f\3\2\2\2"+
		"\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0125"+
		"\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0127\5\'\24\2\u0126\u0122\3\2\2\2"+
		"\u0126\u0127\3\2\2\2\u0127&\3\2\2\2\u0128\u0129\t\6\2\2\u0129(\3\2\2\2"+
		"\u012a\u012d\5\'\24\2\u012b\u012d\7a\2\2\u012c\u012a\3\2\2\2\u012c\u012b"+
		"\3\2\2\2\u012d*\3\2\2\2\u012e\u012f\7\62\2\2\u012f\u0130\t\7\2\2\u0130"+
		"\u0131\5-\27\2\u0131,\3\2\2\2\u0132\u013a\5/\30\2\u0133\u0135\5\61\31"+
		"\2\u0134\u0133\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137"+
		"\3\2\2\2\u0137\u0139\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013b\5/\30\2\u013a"+
		"\u0136\3\2\2\2\u013a\u013b\3\2\2\2\u013b.\3\2\2\2\u013c\u013d\t\b\2\2"+
		"\u013d\60\3\2\2\2\u013e\u0141\5/\30\2\u013f\u0141\7a\2\2\u0140\u013e\3"+
		"\2\2\2\u0140\u013f\3\2\2\2\u0141\62\3\2\2\2\u0142\u0145\5\65\33\2\u0143"+
		"\u0145\5A!\2\u0144\u0142\3\2\2\2\u0144\u0143\3\2\2\2\u0145\64\3\2\2\2"+
		"\u0146\u0147\5\21\t\2\u0147\u0149\7\60\2\2\u0148\u014a\5\21\t\2\u0149"+
		"\u0148\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014c\3\2\2\2\u014b\u014d\5\67"+
		"\34\2\u014c\u014b\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014f\3\2\2\2\u014e"+
		"\u0150\5? \2\u014f\u014e\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0162\3\2\2"+
		"\2\u0151\u0152\7\60\2\2\u0152\u0154\5\21\t\2\u0153\u0155\5\67\34\2\u0154"+
		"\u0153\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0157\3\2\2\2\u0156\u0158\5?"+
		" \2\u0157\u0156\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0162\3\2\2\2\u0159"+
		"\u015a\5\21\t\2\u015a\u015c\5\67\34\2\u015b\u015d\5? \2\u015c\u015b\3"+
		"\2\2\2\u015c\u015d\3\2\2\2\u015d\u0162\3\2\2\2\u015e\u015f\5\21\t\2\u015f"+
		"\u0160\5? \2\u0160\u0162\3\2\2\2\u0161\u0146\3\2\2\2\u0161\u0151\3\2\2"+
		"\2\u0161\u0159\3\2\2\2\u0161\u015e\3\2\2\2\u0162\66\3\2\2\2\u0163\u0164"+
		"\59\35\2\u0164\u0165\5;\36\2\u01658\3\2\2\2\u0166\u0167\t\t\2\2\u0167"+
		":\3\2\2\2\u0168\u016a\5=\37\2\u0169\u0168\3\2\2\2\u0169\u016a\3\2\2\2"+
		"\u016a\u016b\3\2\2\2\u016b\u016c\5\21\t\2\u016c<\3\2\2\2\u016d\u016e\t"+
		"\n\2\2\u016e>\3\2\2\2\u016f\u0170\t\13\2\2\u0170@\3\2\2\2\u0171\u0172"+
		"\5C\"\2\u0172\u0174\5E#\2\u0173\u0175\5? \2\u0174\u0173\3\2\2\2\u0174"+
		"\u0175\3\2\2\2\u0175B\3\2\2\2\u0176\u0178\5\33\16\2\u0177\u0179\7\60\2"+
		"\2\u0178\u0177\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u0182\3\2\2\2\u017a\u017b"+
		"\7\62\2\2\u017b\u017d\t\4\2\2\u017c\u017e\5\35\17\2\u017d\u017c\3\2\2"+
		"\2\u017d\u017e\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\7\60\2\2\u0180"+
		"\u0182\5\35\17\2\u0181\u0176\3\2\2\2\u0181\u017a\3\2\2\2\u0182D\3\2\2"+
		"\2\u0183\u0184\5G$\2\u0184\u0185\5;\36\2\u0185F\3\2\2\2\u0186\u0187\t"+
		"\f\2\2\u0187H\3\2\2\2\u0188\u0189\7v\2\2\u0189\u018a\7t\2\2\u018a\u018b"+
		"\7w\2\2\u018b\u0192\7g\2\2\u018c\u018d\7h\2\2\u018d\u018e\7c\2\2\u018e"+
		"\u018f\7n\2\2\u018f\u0190\7u\2\2\u0190\u0192\7g\2\2\u0191\u0188\3\2\2"+
		"\2\u0191\u018c\3\2\2\2\u0192J\3\2\2\2\u0193\u0194\7$\2\2\u0194\u0195\5"+
		"\23\n\2\u0195\u0196\5\23\n\2\u0196\u0197\5\23\n\2\u0197\u0198\5\23\n\2"+
		"\u0198\u0199\5\u0099M\2\u0199\u019a\5\23\n\2\u019a\u019b\5\23\n\2\u019b"+
		"\u019c\5\u0099M\2\u019c\u019d\5\23\n\2\u019d\u019e\5\23\n\2\u019e\u019f"+
		"\7$\2\2\u019fL\3\2\2\2\u01a0\u01a1\7)\2\2\u01a1\u01a2\5O(\2\u01a2\u01a3"+
		"\7)\2\2\u01a3\u01a9\3\2\2\2\u01a4\u01a5\7)\2\2\u01a5\u01a6\5W,\2\u01a6"+
		"\u01a7\7)\2\2\u01a7\u01a9\3\2\2\2\u01a8\u01a0\3\2\2\2\u01a8\u01a4\3\2"+
		"\2\2\u01a9N\3\2\2\2\u01aa\u01ab\n\r\2\2\u01abP\3\2\2\2\u01ac\u01ae\7$"+
		"\2\2\u01ad\u01af\5S*\2\u01ae\u01ad\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0"+
		"\3\2\2\2\u01b0\u01b1\7$\2\2\u01b1R\3\2\2\2\u01b2\u01b4\5U+\2\u01b3\u01b2"+
		"\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6"+
		"T\3\2\2\2\u01b7\u01ba\n\16\2\2\u01b8\u01ba\5W,\2\u01b9\u01b7\3\2\2\2\u01b9"+
		"\u01b8\3\2\2\2\u01baV\3\2\2\2\u01bb\u01bc\7^\2\2\u01bc\u01c0\t\17\2\2"+
		"\u01bd\u01c0\5Y-\2\u01be\u01c0\5[.\2\u01bf\u01bb\3\2\2\2\u01bf\u01bd\3"+
		"\2\2\2\u01bf\u01be\3\2\2\2\u01c0X\3\2\2\2\u01c1\u01c2\7^\2\2\u01c2\u01cd"+
		"\5\'\24\2\u01c3\u01c4\7^\2\2\u01c4\u01c5\5\'\24\2\u01c5\u01c6\5\'\24\2"+
		"\u01c6\u01cd\3\2\2\2\u01c7\u01c8\7^\2\2\u01c8\u01c9\5]/\2\u01c9\u01ca"+
		"\5\'\24\2\u01ca\u01cb\5\'\24\2\u01cb\u01cd\3\2\2\2\u01cc\u01c1\3\2\2\2"+
		"\u01cc\u01c3\3\2\2\2\u01cc\u01c7\3\2\2\2\u01cdZ\3\2\2\2\u01ce\u01cf\7"+
		"^\2\2\u01cf\u01d0\7w\2\2\u01d0\u01d1\5\37\20\2\u01d1\u01d2\5\37\20\2\u01d2"+
		"\u01d3\5\37\20\2\u01d3\u01d4\5\37\20\2\u01d4\\\3\2\2\2\u01d5\u01d6\t\20"+
		"\2\2\u01d6^\3\2\2\2\u01d7\u01d8\7p\2\2\u01d8\u01d9\7w\2\2\u01d9\u01da"+
		"\7n\2\2\u01da\u01db\7n\2\2\u01db`\3\2\2\2\u01dc\u01dd\7*\2\2\u01ddb\3"+
		"\2\2\2\u01de\u01df\7+\2\2\u01dfd\3\2\2\2\u01e0\u01e1\7%\2\2\u01e1\u01e2"+
		"\7}\2\2\u01e2f\3\2\2\2\u01e3\u01e4\7}\2\2\u01e4h\3\2\2\2\u01e5\u01e6\7"+
		"\177\2\2\u01e6j\3\2\2\2\u01e7\u01e8\7]\2\2\u01e8l\3\2\2\2\u01e9\u01ea"+
		"\7_\2\2\u01ean\3\2\2\2\u01eb\u01ec\7=\2\2\u01ecp\3\2\2\2\u01ed\u01ee\7"+
		".\2\2\u01eer\3\2\2\2\u01ef\u01f0\7\60\2\2\u01f0t\3\2\2\2\u01f1\u01f2\7"+
		"/\2\2\u01f2\u01f3\7@\2\2\u01f3v\3\2\2\2\u01f4\u01f5\7>\2\2\u01f5\u01f6"+
		"\7/\2\2\u01f6x\3\2\2\2\u01f7\u01f8\7~\2\2\u01f8z\3\2\2\2\u01f9\u01fa\7"+
		"@\2\2\u01fa|\3\2\2\2\u01fb\u01fc\7>\2\2\u01fc~\3\2\2\2\u01fd\u01fe\7p"+
		"\2\2\u01fe\u01ff\7q\2\2\u01ff\u0200\7v\2\2\u0200\u0080\3\2\2\2\u0201\u0202"+
		"\7\u0080\2\2\u0202\u0082\3\2\2\2\u0203\u0204\7A\2\2\u0204\u0084\3\2\2"+
		"\2\u0205\u0206\7<\2\2\u0206\u0086\3\2\2\2\u0207\u0208\7<\2\2\u0208\u0209"+
		"\7<\2\2\u0209\u0088\3\2\2\2\u020a\u020b\7?\2\2\u020b\u008a\3\2\2\2\u020c"+
		"\u020d\7>\2\2\u020d\u020e\7?\2\2\u020e\u008c\3\2\2\2\u020f\u0210\7@\2"+
		"\2\u0210\u0211\7?\2\2\u0211\u008e\3\2\2\2\u0212\u0213\7>\2\2\u0213\u0214"+
		"\7@\2\2\u0214\u0090\3\2\2\2\u0215\u0216\7c\2\2\u0216\u0217\7p\2\2\u0217"+
		"\u0218\7f\2\2\u0218\u0092\3\2\2\2\u0219\u021a\7q\2\2\u021a\u021b\7t\2"+
		"\2\u021b\u0094\3\2\2\2\u021c\u021d\7z\2\2\u021d\u021e\7q\2\2\u021e\u021f"+
		"\7t\2\2\u021f\u0096\3\2\2\2\u0220\u0221\7-\2\2\u0221\u0098\3\2\2\2\u0222"+
		"\u0223\7/\2\2\u0223\u009a\3\2\2\2\u0224\u0225\7,\2\2\u0225\u009c\3\2\2"+
		"\2\u0226\u0227\7\61\2\2\u0227\u009e\3\2\2\2\u0228\u0229\7\'\2\2\u0229"+
		"\u00a0\3\2\2\2\u022a\u022b\7`\2\2\u022b\u00a2\3\2\2\2\u022c\u022d\7o\2"+
		"\2\u022d\u022e\7q\2\2\u022e\u022f\7f\2\2\u022f\u00a4\3\2\2\2\u0230\u0231"+
		"\7H\2\2\u0231\u0232\7g\2\2\u0232\u0233\7c\2\2\u0233\u0234\7v\2\2\u0234"+
		"\u0235\7w\2\2\u0235\u0236\7t\2\2\u0236\u0237\7g\2\2\u0237\u00a6\3\2\2"+
		"\2\u0238\u0239\7D\2\2\u0239\u023a\7c\2\2\u023a\u023b\7e\2\2\u023b\u023c"+
		"\7m\2\2\u023c\u023d\7i\2\2\u023d\u023e\7t\2\2\u023e\u023f\7q\2\2\u023f"+
		"\u0240\7w\2\2\u0240\u0241\7p\2\2\u0241\u0242\7f\2\2\u0242\u00a8\3\2\2"+
		"\2\u0243\u0244\7U\2\2\u0244\u0245\7e\2\2\u0245\u0246\7g\2\2\u0246\u0247"+
		"\7p\2\2\u0247\u0248\7c\2\2\u0248\u0249\7t\2\2\u0249\u024a\7k\2\2\u024a"+
		"\u024b\7q\2\2\u024b\u00aa\3\2\2\2\u024c\u024d\7Q\2\2\u024d\u024e\7w\2"+
		"\2\u024e\u024f\7v\2\2\u024f\u0250\7n\2\2\u0250\u0251\7k\2\2\u0251\u0252"+
		"\7p\2\2\u0252\u0253\7g\2\2\u0253\u00ac\3\2\2\2\u0254\u0255\7I\2\2\u0255"+
		"\u0256\7k\2\2\u0256\u0257\7x\2\2\u0257\u0258\7g\2\2\u0258\u0259\7p\2\2"+
		"\u0259\u00ae\3\2\2\2\u025a\u025b\7Y\2\2\u025b\u025c\7j\2\2\u025c\u025d"+
		"\7g\2\2\u025d\u025e\7p\2\2\u025e\u00b0\3\2\2\2\u025f\u0260\7V\2\2\u0260"+
		"\u0261\7j\2\2\u0261\u0262\7g\2\2\u0262\u0263\7p\2\2\u0263\u00b2\3\2\2"+
		"\2\u0264\u0265\7D\2\2\u0265\u0266\7w\2\2\u0266\u0267\7v\2\2\u0267\u00b4"+
		"\3\2\2\2\u0268\u0269\7q\2\2\u0269\u026a\7h\2\2\u026a\u00b6\3\2\2\2\u026b"+
		"\u026f\5\u00b9]\2\u026c\u026e\5\u00bb^\2\u026d\u026c\3\2\2\2\u026e\u0271"+
		"\3\2\2\2\u026f\u026d\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u00b8\3\2\2\2\u0271"+
		"\u026f\3\2\2\2\u0272\u0279\t\21\2\2\u0273\u0274\n\22\2\2\u0274\u0279\6"+
		"]\2\2\u0275\u0276\t\23\2\2\u0276\u0277\t\24\2\2\u0277\u0279\6]\3\2\u0278"+
		"\u0272\3\2\2\2\u0278\u0273\3\2\2\2\u0278\u0275\3\2\2\2\u0279\u00ba\3\2"+
		"\2\2\u027a\u0281\t\25\2\2\u027b\u027c\n\22\2\2\u027c\u0281\6^\4\2\u027d"+
		"\u027e\t\23\2\2\u027e\u027f\t\24\2\2\u027f\u0281\6^\5\2\u0280\u027a\3"+
		"\2\2\2\u0280\u027b\3\2\2\2\u0280\u027d\3\2\2\2\u0281\u00bc\3\2\2\2\u0282"+
		"\u0283\7B\2\2\u0283\u0284\7r\2\2\u0284\u0285\7t\2\2\u0285\u0286\7g\2\2"+
		"\u0286\u00be\3\2\2\2\u0287\u0288\7\60\2\2\u0288\u0289\7\60\2\2\u0289\u028a"+
		"\7\60\2\2\u028a\u00c0\3\2\2\2\u028b\u028d\t\26\2\2\u028c\u028b\3\2\2\2"+
		"\u028d\u028e\3\2\2\2\u028e\u028c\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0290"+
		"\3\2\2\2\u0290\u0291\ba\2\2\u0291\u00c2\3\2\2\2\u0292\u0293\7\61\2\2\u0293"+
		"\u0294\7,\2\2\u0294\u0298\3\2\2\2\u0295\u0297\13\2\2\2\u0296\u0295\3\2"+
		"\2\2\u0297\u029a\3\2\2\2\u0298\u0299\3\2\2\2\u0298\u0296\3\2\2\2\u0299"+
		"\u029b\3\2\2\2\u029a\u0298\3\2\2\2\u029b\u029c\7,\2\2\u029c\u029d\7\61"+
		"\2\2\u029d\u029e\3\2\2\2\u029e\u029f\bb\2\2\u029f\u00c4\3\2\2\2\u02a0"+
		"\u02a1\7/\2\2\u02a1\u02a2\7/\2\2\u02a2\u02a6\3\2\2\2\u02a3\u02a5\n\27"+
		"\2\2\u02a4\u02a3\3\2\2\2\u02a5\u02a8\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a6"+
		"\u02a7\3\2\2\2\u02a7\u02a9\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a9\u02aa\bc"+
		"\2\2\u02aa\u00c6\3\2\2\2\64\2\u00cb\u00cf\u00d3\u00d7\u00db\u00e2\u00e7"+
		"\u00e9\u00ef\u00f3\u00f7\u00fd\u0102\u010c\u0110\u0116\u011a\u0122\u0126"+
		"\u012c\u0136\u013a\u0140\u0144\u0149\u014c\u014f\u0154\u0157\u015c\u0161"+
		"\u0169\u0174\u0178\u017d\u0181\u0191\u01a8\u01ae\u01b5\u01b9\u01bf\u01cc"+
		"\u026f\u0278\u0280\u028e\u0298\u02a6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}