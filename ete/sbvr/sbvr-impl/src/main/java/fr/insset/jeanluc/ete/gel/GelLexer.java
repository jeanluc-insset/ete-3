// Generated from fr/insset/jeanluc/ete/sbvr/GelLexer.g4 by ANTLR 4.5.3
package fr.insset.jeanluc.ete.sbvr;
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
		CARET=41, MOD=42, SEQUENCE=43, BAG=44, SET=45, ORDERED=46, OCL_IS_NEW=47, 
		OCL_IS_TYPE_OF=48, OCL_IS_KIND_OF=49, OCL_AS_TYPE=50, Identifier=51, ATPRE=52, 
		ELLIPSIS=53, WS=54, COMMENT=55, LINE_COMMENT=56;
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
		"CARET", "MOD", "SEQUENCE", "BAG", "SET", "ORDERED", "OCL_IS_NEW", "OCL_IS_TYPE_OF", 
		"OCL_IS_KIND_OF", "OCL_AS_TYPE", "Identifier", "JavaLetter", "JavaLetterOrDigit", 
		"ATPRE", "ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'self'", null, null, null, null, null, null, "'null'", "'('", "')'", 
		"'#{'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'->'", "'<-'", 
		"'|'", "'>'", "'<'", "'not'", "'~'", "'?'", "':'", "'::'", "'='", "'<='", 
		"'>='", "'<>'", "'and'", "'or'", "'xor'", "'+'", "'-'", "'*'", "'/'", 
		"'%'", "'^'", "'mod'", "'sequence'", "'bag'", "'set'", "'ordered'", null, 
		null, null, null, null, "'@pre'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Self", "IntegerLiteral", "FloatingPointLiteral", "BooleanLiteral", 
		"DateLiteral", "CharacterLiteral", "StringLiteral", "NullLiteral", "LPAREN", 
		"RPAREN", "START_EXP", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", 
		"COMMA", "DOT", "ARROW", "LEFT_ARROW", "PIPE", "GT", "LT", "NOT", "TILDE", 
		"QUESTION", "COLON", "DOUBLE_COLON", "EQUAL", "LE", "GE", "NOTEQUAL", 
		"AND", "OR", "XOR", "ADD", "SUB", "MUL", "DIV", "MOD_PERCENT", "CARET", 
		"MOD", "SEQUENCE", "BAG", "SET", "ORDERED", "OCL_IS_NEW", "OCL_IS_TYPE_OF", 
		"OCL_IS_KIND_OF", "OCL_AS_TYPE", "Identifier", "ATPRE", "ELLIPSIS", "WS", 
		"COMMENT", "LINE_COMMENT"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2:\u02bd\b\1\4\2\t"+
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
		"`\t`\4a\ta\4b\tb\4c\tc\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3\u00d1\n"+
		"\3\3\4\3\4\5\4\u00d5\n\4\3\5\3\5\5\5\u00d9\n\5\3\6\3\6\5\6\u00dd\n\6\3"+
		"\7\3\7\5\7\u00e1\n\7\3\b\3\b\3\t\3\t\3\t\5\t\u00e8\n\t\3\t\3\t\3\t\5\t"+
		"\u00ed\n\t\5\t\u00ef\n\t\3\n\3\n\7\n\u00f3\n\n\f\n\16\n\u00f6\13\n\3\n"+
		"\5\n\u00f9\n\n\3\13\3\13\5\13\u00fd\n\13\3\f\3\f\3\r\3\r\5\r\u0103\n\r"+
		"\3\16\6\16\u0106\n\16\r\16\16\16\u0107\3\17\3\17\3\17\3\17\3\20\3\20\7"+
		"\20\u0110\n\20\f\20\16\20\u0113\13\20\3\20\5\20\u0116\n\20\3\21\3\21\3"+
		"\22\3\22\5\22\u011c\n\22\3\23\3\23\5\23\u0120\n\23\3\23\3\23\3\24\3\24"+
		"\7\24\u0126\n\24\f\24\16\24\u0129\13\24\3\24\5\24\u012c\n\24\3\25\3\25"+
		"\3\26\3\26\5\26\u0132\n\26\3\27\3\27\3\27\3\27\3\30\3\30\7\30\u013a\n"+
		"\30\f\30\16\30\u013d\13\30\3\30\5\30\u0140\n\30\3\31\3\31\3\32\3\32\5"+
		"\32\u0146\n\32\3\33\3\33\5\33\u014a\n\33\3\34\3\34\3\34\5\34\u014f\n\34"+
		"\3\34\5\34\u0152\n\34\3\34\5\34\u0155\n\34\3\34\3\34\3\34\5\34\u015a\n"+
		"\34\3\34\5\34\u015d\n\34\3\34\3\34\3\34\5\34\u0162\n\34\3\34\3\34\3\34"+
		"\5\34\u0167\n\34\3\35\3\35\3\35\3\36\3\36\3\37\5\37\u016f\n\37\3\37\3"+
		"\37\3 \3 \3!\3!\3\"\3\"\3\"\5\"\u017a\n\"\3#\3#\5#\u017e\n#\3#\3#\3#\5"+
		"#\u0183\n#\3#\3#\5#\u0187\n#\3$\3$\3$\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\5&\u0197\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\5(\u01ae\n(\3)\3)\3*\3*\5*\u01b4\n*\3*\3*\3+\6+\u01b9"+
		"\n+\r+\16+\u01ba\3,\3,\5,\u01bf\n,\3-\3-\3-\3-\5-\u01c5\n-\3.\3.\3.\3"+
		".\3.\3.\3.\3.\3.\3.\3.\5.\u01d2\n.\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\61"+
		"\3\61\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\66"+
		"\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3<\3=\3=\3=\3>\3>\3?\3?"+
		"\3@\3@\3A\3A\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3E\3F\3F\3G\3G\3G\3H\3H\3H"+
		"\3I\3I\3I\3J\3J\3J\3J\3K\3K\3K\3L\3L\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q"+
		"\3Q\3R\3R\3S\3S\3S\3S\3T\3T\3T\3T\3T\3T\3T\3T\3T\3U\3U\3U\3U\3V\3V\3V"+
		"\3V\3W\3W\3W\3W\3W\3W\3W\3W\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3Y\3Y\3Y\3Y"+
		"\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3["+
		"\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3\\\3\\\7\\\u0280\n\\\f\\\16\\\u0283\13"+
		"\\\3]\3]\3]\3]\3]\3]\5]\u028b\n]\3^\3^\3^\3^\3^\3^\5^\u0293\n^\3_\3_\3"+
		"_\3_\3_\3`\3`\3`\3`\3a\6a\u029f\na\ra\16a\u02a0\3a\3a\3b\3b\3b\3b\7b\u02a9"+
		"\nb\fb\16b\u02ac\13b\3b\3b\3b\3b\3b\3c\3c\3c\3c\7c\u02b7\nc\fc\16c\u02ba"+
		"\13c\3c\3c\3\u02aa\2d\3\3\5\4\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27"+
		"\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\5\67\29\2"+
		";\2=\2?\2A\2C\2E\2G\2I\2K\6M\7O\bQ\2S\tU\2W\2Y\2[\2]\2_\2a\nc\13e\fg\r"+
		"i\16k\17m\20o\21q\22s\23u\24w\25y\26{\27}\30\177\31\u0081\32\u0083\33"+
		"\u0085\34\u0087\35\u0089\36\u008b\37\u008d \u008f!\u0091\"\u0093#\u0095"+
		"$\u0097%\u0099&\u009b\'\u009d(\u009f)\u00a1*\u00a3+\u00a5,\u00a7-\u00a9"+
		".\u00ab/\u00ad\60\u00af\61\u00b1\62\u00b3\63\u00b5\64\u00b7\65\u00b9\2"+
		"\u00bb\2\u00bd\66\u00bf\67\u00c18\u00c39\u00c5:\3\2\30\4\2NNnn\3\2\63"+
		";\4\2ZZzz\5\2\62;CHch\3\2\629\4\2DDdd\3\2\62\63\4\2GGgg\4\2--//\6\2FF"+
		"HHffhh\4\2RRrr\4\2))^^\4\2$$^^\n\2$$))^^ddhhppttvv\3\2\62\65\6\2&&C\\"+
		"aac|\4\2\2\u0101\ud802\udc01\3\2\ud802\udc01\3\2\udc02\ue001\7\2&&\62"+
		";C\\aac|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\u02cb\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\65\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2S\3\2\2\2\2a\3\2\2\2"+
		"\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o"+
		"\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2"+
		"\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2"+
		"\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9"+
		"\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2"+
		"\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf"+
		"\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2\2\3\u00c7\3\2\2"+
		"\2\5\u00d0\3\2\2\2\7\u00d2\3\2\2\2\t\u00d6\3\2\2\2\13\u00da\3\2\2\2\r"+
		"\u00de\3\2\2\2\17\u00e2\3\2\2\2\21\u00ee\3\2\2\2\23\u00f0\3\2\2\2\25\u00fc"+
		"\3\2\2\2\27\u00fe\3\2\2\2\31\u0102\3\2\2\2\33\u0105\3\2\2\2\35\u0109\3"+
		"\2\2\2\37\u010d\3\2\2\2!\u0117\3\2\2\2#\u011b\3\2\2\2%\u011d\3\2\2\2\'"+
		"\u0123\3\2\2\2)\u012d\3\2\2\2+\u0131\3\2\2\2-\u0133\3\2\2\2/\u0137\3\2"+
		"\2\2\61\u0141\3\2\2\2\63\u0145\3\2\2\2\65\u0149\3\2\2\2\67\u0166\3\2\2"+
		"\29\u0168\3\2\2\2;\u016b\3\2\2\2=\u016e\3\2\2\2?\u0172\3\2\2\2A\u0174"+
		"\3\2\2\2C\u0176\3\2\2\2E\u0186\3\2\2\2G\u0188\3\2\2\2I\u018b\3\2\2\2K"+
		"\u0196\3\2\2\2M\u0198\3\2\2\2O\u01ad\3\2\2\2Q\u01af\3\2\2\2S\u01b1\3\2"+
		"\2\2U\u01b8\3\2\2\2W\u01be\3\2\2\2Y\u01c4\3\2\2\2[\u01d1\3\2\2\2]\u01d3"+
		"\3\2\2\2_\u01da\3\2\2\2a\u01dc\3\2\2\2c\u01e1\3\2\2\2e\u01e3\3\2\2\2g"+
		"\u01e5\3\2\2\2i\u01e8\3\2\2\2k\u01ea\3\2\2\2m\u01ec\3\2\2\2o\u01ee\3\2"+
		"\2\2q\u01f0\3\2\2\2s\u01f2\3\2\2\2u\u01f4\3\2\2\2w\u01f6\3\2\2\2y\u01f9"+
		"\3\2\2\2{\u01fc\3\2\2\2}\u01fe\3\2\2\2\177\u0200\3\2\2\2\u0081\u0202\3"+
		"\2\2\2\u0083\u0206\3\2\2\2\u0085\u0208\3\2\2\2\u0087\u020a\3\2\2\2\u0089"+
		"\u020c\3\2\2\2\u008b\u020f\3\2\2\2\u008d\u0211\3\2\2\2\u008f\u0214\3\2"+
		"\2\2\u0091\u0217\3\2\2\2\u0093\u021a\3\2\2\2\u0095\u021e\3\2\2\2\u0097"+
		"\u0221\3\2\2\2\u0099\u0225\3\2\2\2\u009b\u0227\3\2\2\2\u009d\u0229\3\2"+
		"\2\2\u009f\u022b\3\2\2\2\u00a1\u022d\3\2\2\2\u00a3\u022f\3\2\2\2\u00a5"+
		"\u0231\3\2\2\2\u00a7\u0235\3\2\2\2\u00a9\u023e\3\2\2\2\u00ab\u0242\3\2"+
		"\2\2\u00ad\u0246\3\2\2\2\u00af\u024e\3\2\2\2\u00b1\u0258\3\2\2\2\u00b3"+
		"\u0265\3\2\2\2\u00b5\u0272\3\2\2\2\u00b7\u027d\3\2\2\2\u00b9\u028a\3\2"+
		"\2\2\u00bb\u0292\3\2\2\2\u00bd\u0294\3\2\2\2\u00bf\u0299\3\2\2\2\u00c1"+
		"\u029e\3\2\2\2\u00c3\u02a4\3\2\2\2\u00c5\u02b2\3\2\2\2\u00c7\u00c8\7u"+
		"\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca\7n\2\2\u00ca\u00cb\7h\2\2\u00cb\4"+
		"\3\2\2\2\u00cc\u00d1\5\7\4\2\u00cd\u00d1\5\t\5\2\u00ce\u00d1\5\13\6\2"+
		"\u00cf\u00d1\5\r\7\2\u00d0\u00cc\3\2\2\2\u00d0\u00cd\3\2\2\2\u00d0\u00ce"+
		"\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\6\3\2\2\2\u00d2\u00d4\5\21\t\2\u00d3"+
		"\u00d5\5\17\b\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\b\3\2\2"+
		"\2\u00d6\u00d8\5\35\17\2\u00d7\u00d9\5\17\b\2\u00d8\u00d7\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9\n\3\2\2\2\u00da\u00dc\5%\23\2\u00db\u00dd\5\17\b"+
		"\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\f\3\2\2\2\u00de\u00e0"+
		"\5-\27\2\u00df\u00e1\5\17\b\2\u00e0\u00df\3\2\2\2\u00e0\u00e1\3\2\2\2"+
		"\u00e1\16\3\2\2\2\u00e2\u00e3\t\2\2\2\u00e3\20\3\2\2\2\u00e4\u00ef\7\62"+
		"\2\2\u00e5\u00ec\5\27\f\2\u00e6\u00e8\5\23\n\2\u00e7\u00e6\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00ed\3\2\2\2\u00e9\u00ea\5\33\16\2\u00ea\u00eb\5"+
		"\23\n\2\u00eb\u00ed\3\2\2\2\u00ec\u00e7\3\2\2\2\u00ec\u00e9\3\2\2\2\u00ed"+
		"\u00ef\3\2\2\2\u00ee\u00e4\3\2\2\2\u00ee\u00e5\3\2\2\2\u00ef\22\3\2\2"+
		"\2\u00f0\u00f8\5\25\13\2\u00f1\u00f3\5\31\r\2\u00f2\u00f1\3\2\2\2\u00f3"+
		"\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\3\2"+
		"\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f9\5\25\13\2\u00f8\u00f4\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\24\3\2\2\2\u00fa\u00fd\7\62\2\2\u00fb\u00fd\5\27"+
		"\f\2\u00fc\u00fa\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd\26\3\2\2\2\u00fe\u00ff"+
		"\t\3\2\2\u00ff\30\3\2\2\2\u0100\u0103\5\25\13\2\u0101\u0103\7a\2\2\u0102"+
		"\u0100\3\2\2\2\u0102\u0101\3\2\2\2\u0103\32\3\2\2\2\u0104\u0106\7a\2\2"+
		"\u0105\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108"+
		"\3\2\2\2\u0108\34\3\2\2\2\u0109\u010a\7\62\2\2\u010a\u010b\t\4\2\2\u010b"+
		"\u010c\5\37\20\2\u010c\36\3\2\2\2\u010d\u0115\5!\21\2\u010e\u0110\5#\22"+
		"\2\u010f\u010e\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112"+
		"\3\2\2\2\u0112\u0114\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0116\5!\21\2\u0115"+
		"\u0111\3\2\2\2\u0115\u0116\3\2\2\2\u0116 \3\2\2\2\u0117\u0118\t\5\2\2"+
		"\u0118\"\3\2\2\2\u0119\u011c\5!\21\2\u011a\u011c\7a\2\2\u011b\u0119\3"+
		"\2\2\2\u011b\u011a\3\2\2\2\u011c$\3\2\2\2\u011d\u011f\7\62\2\2\u011e\u0120"+
		"\5\33\16\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2"+
		"\u0121\u0122\5\'\24\2\u0122&\3\2\2\2\u0123\u012b\5)\25\2\u0124\u0126\5"+
		"+\26\2\u0125\u0124\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128\u012a\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012c\5)"+
		"\25\2\u012b\u0127\3\2\2\2\u012b\u012c\3\2\2\2\u012c(\3\2\2\2\u012d\u012e"+
		"\t\6\2\2\u012e*\3\2\2\2\u012f\u0132\5)\25\2\u0130\u0132\7a\2\2\u0131\u012f"+
		"\3\2\2\2\u0131\u0130\3\2\2\2\u0132,\3\2\2\2\u0133\u0134\7\62\2\2\u0134"+
		"\u0135\t\7\2\2\u0135\u0136\5/\30\2\u0136.\3\2\2\2\u0137\u013f\5\61\31"+
		"\2\u0138\u013a\5\63\32\2\u0139\u0138\3\2\2\2\u013a\u013d\3\2\2\2\u013b"+
		"\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013e\3\2\2\2\u013d\u013b\3\2"+
		"\2\2\u013e\u0140\5\61\31\2\u013f\u013b\3\2\2\2\u013f\u0140\3\2\2\2\u0140"+
		"\60\3\2\2\2\u0141\u0142\t\b\2\2\u0142\62\3\2\2\2\u0143\u0146\5\61\31\2"+
		"\u0144\u0146\7a\2\2\u0145\u0143\3\2\2\2\u0145\u0144\3\2\2\2\u0146\64\3"+
		"\2\2\2\u0147\u014a\5\67\34\2\u0148\u014a\5C\"\2\u0149\u0147\3\2\2\2\u0149"+
		"\u0148\3\2\2\2\u014a\66\3\2\2\2\u014b\u014c\5\23\n\2\u014c\u014e\7\60"+
		"\2\2\u014d\u014f\5\23\n\2\u014e\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f"+
		"\u0151\3\2\2\2\u0150\u0152\59\35\2\u0151\u0150\3\2\2\2\u0151\u0152\3\2"+
		"\2\2\u0152\u0154\3\2\2\2\u0153\u0155\5A!\2\u0154\u0153\3\2\2\2\u0154\u0155"+
		"\3\2\2\2\u0155\u0167\3\2\2\2\u0156\u0157\7\60\2\2\u0157\u0159\5\23\n\2"+
		"\u0158\u015a\59\35\2\u0159\u0158\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015c"+
		"\3\2\2\2\u015b\u015d\5A!\2\u015c\u015b\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"\u0167\3\2\2\2\u015e\u015f\5\23\n\2\u015f\u0161\59\35\2\u0160\u0162\5"+
		"A!\2\u0161\u0160\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0167\3\2\2\2\u0163"+
		"\u0164\5\23\n\2\u0164\u0165\5A!\2\u0165\u0167\3\2\2\2\u0166\u014b\3\2"+
		"\2\2\u0166\u0156\3\2\2\2\u0166\u015e\3\2\2\2\u0166\u0163\3\2\2\2\u0167"+
		"8\3\2\2\2\u0168\u0169\5;\36\2\u0169\u016a\5=\37\2\u016a:\3\2\2\2\u016b"+
		"\u016c\t\t\2\2\u016c<\3\2\2\2\u016d\u016f\5? \2\u016e\u016d\3\2\2\2\u016e"+
		"\u016f\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\5\23\n\2\u0171>\3\2\2\2"+
		"\u0172\u0173\t\n\2\2\u0173@\3\2\2\2\u0174\u0175\t\13\2\2\u0175B\3\2\2"+
		"\2\u0176\u0177\5E#\2\u0177\u0179\5G$\2\u0178\u017a\5A!\2\u0179\u0178\3"+
		"\2\2\2\u0179\u017a\3\2\2\2\u017aD\3\2\2\2\u017b\u017d\5\35\17\2\u017c"+
		"\u017e\7\60\2\2\u017d\u017c\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0187\3"+
		"\2\2\2\u017f\u0180\7\62\2\2\u0180\u0182\t\4\2\2\u0181\u0183\5\37\20\2"+
		"\u0182\u0181\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185"+
		"\7\60\2\2\u0185\u0187\5\37\20\2\u0186\u017b\3\2\2\2\u0186\u017f\3\2\2"+
		"\2\u0187F\3\2\2\2\u0188\u0189\5I%\2\u0189\u018a\5=\37\2\u018aH\3\2\2\2"+
		"\u018b\u018c\t\f\2\2\u018cJ\3\2\2\2\u018d\u018e\7v\2\2\u018e\u018f\7t"+
		"\2\2\u018f\u0190\7w\2\2\u0190\u0197\7g\2\2\u0191\u0192\7h\2\2\u0192\u0193"+
		"\7c\2\2\u0193\u0194\7n\2\2\u0194\u0195\7u\2\2\u0195\u0197\7g\2\2\u0196"+
		"\u018d\3\2\2\2\u0196\u0191\3\2\2\2\u0197L\3\2\2\2\u0198\u0199\7$\2\2\u0199"+
		"\u019a\5\25\13\2\u019a\u019b\5\25\13\2\u019b\u019c\5\25\13\2\u019c\u019d"+
		"\5\25\13\2\u019d\u019e\5\u009bN\2\u019e\u019f\5\25\13\2\u019f\u01a0\5"+
		"\25\13\2\u01a0\u01a1\5\u009bN\2\u01a1\u01a2\5\25\13\2\u01a2\u01a3\5\25"+
		"\13\2\u01a3\u01a4\7$\2\2\u01a4N\3\2\2\2\u01a5\u01a6\7)\2\2\u01a6\u01a7"+
		"\5Q)\2\u01a7\u01a8\7)\2\2\u01a8\u01ae\3\2\2\2\u01a9\u01aa\7)\2\2\u01aa"+
		"\u01ab\5Y-\2\u01ab\u01ac\7)\2\2\u01ac\u01ae\3\2\2\2\u01ad\u01a5\3\2\2"+
		"\2\u01ad\u01a9\3\2\2\2\u01aeP\3\2\2\2\u01af\u01b0\n\r\2\2\u01b0R\3\2\2"+
		"\2\u01b1\u01b3\7$\2\2\u01b2\u01b4\5U+\2\u01b3\u01b2\3\2\2\2\u01b3\u01b4"+
		"\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\7$\2\2\u01b6T\3\2\2\2\u01b7\u01b9"+
		"\5W,\2\u01b8\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba"+
		"\u01bb\3\2\2\2\u01bbV\3\2\2\2\u01bc\u01bf\n\16\2\2\u01bd\u01bf\5Y-\2\u01be"+
		"\u01bc\3\2\2\2\u01be\u01bd\3\2\2\2\u01bfX\3\2\2\2\u01c0\u01c1\7^\2\2\u01c1"+
		"\u01c5\t\17\2\2\u01c2\u01c5\5[.\2\u01c3\u01c5\5]/\2\u01c4\u01c0\3\2\2"+
		"\2\u01c4\u01c2\3\2\2\2\u01c4\u01c3\3\2\2\2\u01c5Z\3\2\2\2\u01c6\u01c7"+
		"\7^\2\2\u01c7\u01d2\5)\25\2\u01c8\u01c9\7^\2\2\u01c9\u01ca\5)\25\2\u01ca"+
		"\u01cb\5)\25\2\u01cb\u01d2\3\2\2\2\u01cc\u01cd\7^\2\2\u01cd\u01ce\5_\60"+
		"\2\u01ce\u01cf\5)\25\2\u01cf\u01d0\5)\25\2\u01d0\u01d2\3\2\2\2\u01d1\u01c6"+
		"\3\2\2\2\u01d1\u01c8\3\2\2\2\u01d1\u01cc\3\2\2\2\u01d2\\\3\2\2\2\u01d3"+
		"\u01d4\7^\2\2\u01d4\u01d5\7w\2\2\u01d5\u01d6\5!\21\2\u01d6\u01d7\5!\21"+
		"\2\u01d7\u01d8\5!\21\2\u01d8\u01d9\5!\21\2\u01d9^\3\2\2\2\u01da\u01db"+
		"\t\20\2\2\u01db`\3\2\2\2\u01dc\u01dd\7p\2\2\u01dd\u01de\7w\2\2\u01de\u01df"+
		"\7n\2\2\u01df\u01e0\7n\2\2\u01e0b\3\2\2\2\u01e1\u01e2\7*\2\2\u01e2d\3"+
		"\2\2\2\u01e3\u01e4\7+\2\2\u01e4f\3\2\2\2\u01e5\u01e6\7%\2\2\u01e6\u01e7"+
		"\7}\2\2\u01e7h\3\2\2\2\u01e8\u01e9\7}\2\2\u01e9j\3\2\2\2\u01ea\u01eb\7"+
		"\177\2\2\u01ebl\3\2\2\2\u01ec\u01ed\7]\2\2\u01edn\3\2\2\2\u01ee\u01ef"+
		"\7_\2\2\u01efp\3\2\2\2\u01f0\u01f1\7=\2\2\u01f1r\3\2\2\2\u01f2\u01f3\7"+
		".\2\2\u01f3t\3\2\2\2\u01f4\u01f5\7\60\2\2\u01f5v\3\2\2\2\u01f6\u01f7\7"+
		"/\2\2\u01f7\u01f8\7@\2\2\u01f8x\3\2\2\2\u01f9\u01fa\7>\2\2\u01fa\u01fb"+
		"\7/\2\2\u01fbz\3\2\2\2\u01fc\u01fd\7~\2\2\u01fd|\3\2\2\2\u01fe\u01ff\7"+
		"@\2\2\u01ff~\3\2\2\2\u0200\u0201\7>\2\2\u0201\u0080\3\2\2\2\u0202\u0203"+
		"\7p\2\2\u0203\u0204\7q\2\2\u0204\u0205\7v\2\2\u0205\u0082\3\2\2\2\u0206"+
		"\u0207\7\u0080\2\2\u0207\u0084\3\2\2\2\u0208\u0209\7A\2\2\u0209\u0086"+
		"\3\2\2\2\u020a\u020b\7<\2\2\u020b\u0088\3\2\2\2\u020c\u020d\7<\2\2\u020d"+
		"\u020e\7<\2\2\u020e\u008a\3\2\2\2\u020f\u0210\7?\2\2\u0210\u008c\3\2\2"+
		"\2\u0211\u0212\7>\2\2\u0212\u0213\7?\2\2\u0213\u008e\3\2\2\2\u0214\u0215"+
		"\7@\2\2\u0215\u0216\7?\2\2\u0216\u0090\3\2\2\2\u0217\u0218\7>\2\2\u0218"+
		"\u0219\7@\2\2\u0219\u0092\3\2\2\2\u021a\u021b\7c\2\2\u021b\u021c\7p\2"+
		"\2\u021c\u021d\7f\2\2\u021d\u0094\3\2\2\2\u021e\u021f\7q\2\2\u021f\u0220"+
		"\7t\2\2\u0220\u0096\3\2\2\2\u0221\u0222\7z\2\2\u0222\u0223\7q\2\2\u0223"+
		"\u0224\7t\2\2\u0224\u0098\3\2\2\2\u0225\u0226\7-\2\2\u0226\u009a\3\2\2"+
		"\2\u0227\u0228\7/\2\2\u0228\u009c\3\2\2\2\u0229\u022a\7,\2\2\u022a\u009e"+
		"\3\2\2\2\u022b\u022c\7\61\2\2\u022c\u00a0\3\2\2\2\u022d\u022e\7\'\2\2"+
		"\u022e\u00a2\3\2\2\2\u022f\u0230\7`\2\2\u0230\u00a4\3\2\2\2\u0231\u0232"+
		"\7o\2\2\u0232\u0233\7q\2\2\u0233\u0234\7f\2\2\u0234\u00a6\3\2\2\2\u0235"+
		"\u0236\7u\2\2\u0236\u0237\7g\2\2\u0237\u0238\7s\2\2\u0238\u0239\7w\2\2"+
		"\u0239\u023a\7g\2\2\u023a\u023b\7p\2\2\u023b\u023c\7e\2\2\u023c\u023d"+
		"\7g\2\2\u023d\u00a8\3\2\2\2\u023e\u023f\7d\2\2\u023f\u0240\7c\2\2\u0240"+
		"\u0241\7i\2\2\u0241\u00aa\3\2\2\2\u0242\u0243\7u\2\2\u0243\u0244\7g\2"+
		"\2\u0244\u0245\7v\2\2\u0245\u00ac\3\2\2\2\u0246\u0247\7q\2\2\u0247\u0248"+
		"\7t\2\2\u0248\u0249\7f\2\2\u0249\u024a\7g\2\2\u024a\u024b\7t\2\2\u024b"+
		"\u024c\7g\2\2\u024c\u024d\7f\2\2\u024d\u00ae\3\2\2\2\u024e\u024f\5u;\2"+
		"\u024f\u0250\7k\2\2\u0250\u0251\7u\2\2\u0251\u0252\7P\2\2\u0252\u0253"+
		"\7g\2\2\u0253\u0254\7y\2\2\u0254\u0255\3\2\2\2\u0255\u0256\5c\62\2\u0256"+
		"\u0257\5e\63\2\u0257\u00b0\3\2\2\2\u0258\u0259\5u;\2\u0259\u025a\7q\2"+
		"\2\u025a\u025b\7e\2\2\u025b\u025c\7n\2\2\u025c\u025d\7K\2\2\u025d\u025e"+
		"\7u\2\2\u025e\u025f\7V\2\2\u025f\u0260\7{\2\2\u0260\u0261\7r\2\2\u0261"+
		"\u0262\7g\2\2\u0262\u0263\7Q\2\2\u0263\u0264\7h\2\2\u0264\u00b2\3\2\2"+
		"\2\u0265\u0266\5u;\2\u0266\u0267\7q\2\2\u0267\u0268\7e\2\2\u0268\u0269"+
		"\7n\2\2\u0269\u026a\7K\2\2\u026a\u026b\7u\2\2\u026b\u026c\7M\2\2\u026c"+
		"\u026d\7k\2\2\u026d\u026e\7p\2\2\u026e\u026f\7f\2\2\u026f\u0270\7Q\2\2"+
		"\u0270\u0271\7h\2\2\u0271\u00b4\3\2\2\2\u0272\u0273\5u;\2\u0273\u0274"+
		"\7q\2\2\u0274\u0275\7e\2\2\u0275\u0276\7n\2\2\u0276\u0277\7C\2\2\u0277"+
		"\u0278\7u\2\2\u0278\u0279\7V\2\2\u0279\u027a\7{\2\2\u027a\u027b\7r\2\2"+
		"\u027b\u027c\7g\2\2\u027c\u00b6\3\2\2\2\u027d\u0281\5\u00b9]\2\u027e\u0280"+
		"\5\u00bb^\2\u027f\u027e\3\2\2\2\u0280\u0283\3\2\2\2\u0281\u027f\3\2\2"+
		"\2\u0281\u0282\3\2\2\2\u0282\u00b8\3\2\2\2\u0283\u0281\3\2\2\2\u0284\u028b"+
		"\t\21\2\2\u0285\u0286\n\22\2\2\u0286\u028b\6]\2\2\u0287\u0288\t\23\2\2"+
		"\u0288\u0289\t\24\2\2\u0289\u028b\6]\3\2\u028a\u0284\3\2\2\2\u028a\u0285"+
		"\3\2\2\2\u028a\u0287\3\2\2\2\u028b\u00ba\3\2\2\2\u028c\u0293\t\25\2\2"+
		"\u028d\u028e\n\22\2\2\u028e\u0293\6^\4\2\u028f\u0290\t\23\2\2\u0290\u0291"+
		"\t\24\2\2\u0291\u0293\6^\5\2\u0292\u028c\3\2\2\2\u0292\u028d\3\2\2\2\u0292"+
		"\u028f\3\2\2\2\u0293\u00bc\3\2\2\2\u0294\u0295\7B\2\2\u0295\u0296\7r\2"+
		"\2\u0296\u0297\7t\2\2\u0297\u0298\7g\2\2\u0298\u00be\3\2\2\2\u0299\u029a"+
		"\7\60\2\2\u029a\u029b\7\60\2\2\u029b\u029c\7\60\2\2\u029c\u00c0\3\2\2"+
		"\2\u029d\u029f\t\26\2\2\u029e\u029d\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0"+
		"\u029e\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a3\ba"+
		"\2\2\u02a3\u00c2\3\2\2\2\u02a4\u02a5\7\61\2\2\u02a5\u02a6\7,\2\2\u02a6"+
		"\u02aa\3\2\2\2\u02a7\u02a9\13\2\2\2\u02a8\u02a7\3\2\2\2\u02a9\u02ac\3"+
		"\2\2\2\u02aa\u02ab\3\2\2\2\u02aa\u02a8\3\2\2\2\u02ab\u02ad\3\2\2\2\u02ac"+
		"\u02aa\3\2\2\2\u02ad\u02ae\7,\2\2\u02ae\u02af\7\61\2\2\u02af\u02b0\3\2"+
		"\2\2\u02b0\u02b1\bb\2\2\u02b1\u00c4\3\2\2\2\u02b2\u02b3\7/\2\2\u02b3\u02b4"+
		"\7/\2\2\u02b4\u02b8\3\2\2\2\u02b5\u02b7\n\27\2\2\u02b6\u02b5\3\2\2\2\u02b7"+
		"\u02ba\3\2\2\2\u02b8\u02b6\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02bb\3\2"+
		"\2\2\u02ba\u02b8\3\2\2\2\u02bb\u02bc\bc\2\2\u02bc\u00c6\3\2\2\2\64\2\u00d0"+
		"\u00d4\u00d8\u00dc\u00e0\u00e7\u00ec\u00ee\u00f4\u00f8\u00fc\u0102\u0107"+
		"\u0111\u0115\u011b\u011f\u0127\u012b\u0131\u013b\u013f\u0145\u0149\u014e"+
		"\u0151\u0154\u0159\u015c\u0161\u0166\u016e\u0179\u017d\u0182\u0186\u0196"+
		"\u01ad\u01b3\u01ba\u01be\u01c4\u01d1\u0281\u028a\u0292\u02a0\u02aa\u02b8"+
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