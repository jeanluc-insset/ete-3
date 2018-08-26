package fr.insset.jeanluc.constraint_language.tmp;

// Generated from FrenchModelLexer.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FrenchModelLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BREVET=1, PILOTE=2, AVION=3, VOL=4, CLIENT=5, COMPTE=6, MODÈLEDAVION=7, 
		DEFINITION=8, RULE=9, THE=10, A=11, OF=12, IS=13, XOR=14, OR=15, AND=16, 
		NOT=17, LT=18, LE=19, GT=20, GE=21, EQUAL=22, DIFF=23, PLUS=24, MINUS=25, 
		MULT=26, DIV=27, MOD=28, LPAREN=29, RPAREN=30, LBRACE=31, RBRACE=32, LBRACK=33, 
		RBRACK=34, COLON=35, SEMI=36, COMMA=37, DOT=38, ARROW=39, DOUBLE_ARROW=40, 
		LEFT_ARROW=41, PIPE=42, NO_DETERMINER=43, NO_KEYWORD=44, NO_MODEL_TERM=45, 
		NO_OTHER=46, Identifier=47, WS=48, COMMENT=49, LINE_COMMENT=50;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BREVET", "PILOTE", "AVION", "VOL", "CLIENT", "COMPTE", "MODÈLEDAVION", 
		"DEFINITION", "RULE", "THE", "A", "OF", "IS", "XOR", "OR", "AND", "NOT", 
		"LT", "LE", "GT", "GE", "EQUAL", "DIFF", "PLUS", "MINUS", "MULT", "DIV", 
		"MOD", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "COLON", 
		"SEMI", "COMMA", "DOT", "ARROW", "DOUBLE_ARROW", "LEFT_ARROW", "PIPE", 
		"NO_DETERMINER", "NO_KEYWORD", "NO_MODEL_TERM", "NO_OTHER", "Identifier", 
		"JavaLetter", "JavaLetterOrDigit", "WS", "COMMENT", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, "'D\u00E9finition'", "'R\u00E8gle'", 
		null, null, null, null, "'xor'", "'or'", "'and'", "'not'", "'<'", "'<='", 
		"'>'", "'>='", "'='", "'<>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'('", 
		"')'", "'{'", "'}'", "'['", "']'", "':'", "';'", "','", "'.'", "'->'", 
		"'=>'", "'<-'", "'|'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BREVET", "PILOTE", "AVION", "VOL", "CLIENT", "COMPTE", "MOD\u0003LEDAVION", 
		"DEFINITION", "RULE", "THE", "A", "OF", "IS", "XOR", "OR", "AND", "NOT", 
		"LT", "LE", "GT", "GE", "EQUAL", "DIFF", "PLUS", "MINUS", "MULT", "DIV", 
		"MOD", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "COLON", 
		"SEMI", "COMMA", "DOT", "ARROW", "DOUBLE_ARROW", "LEFT_ARROW", "PIPE", 
		"NO_DETERMINER", "NO_KEYWORD", "NO_MODEL_TERM", "NO_OTHER", "Identifier", 
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


	public FrenchModelLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FrenchModelLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 47:
			return JavaLetter_sempred((RuleContext)_localctx, predIndex);
		case 48:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u01d9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2x\n"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0086\n\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0092\n\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5\u009a\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00a8"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00b6\n\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\b\u00dd\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00f7\n\13\3"+
		"\f\3\f\3\f\3\f\3\f\5\f\u00fe\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0107"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u0125\n\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3"+
		"&\3&\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3\60"+
		"\3\60\7\60\u01a5\n\60\f\60\16\60\u01a8\13\60\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\5\61\u01b0\n\61\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u01b8\n\62\3"+
		"\63\6\63\u01bb\n\63\r\63\16\63\u01bc\3\63\3\63\3\64\3\64\3\64\3\64\7\64"+
		"\u01c5\n\64\f\64\16\64\u01c8\13\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65"+
		"\3\65\3\65\7\65\u01d3\n\65\f\65\16\65\u01d6\13\65\3\65\3\65\3\u01c6\2"+
		"\66\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\2c\2e\62g\63i\64\3\2\t"+
		"\6\2&&C\\aac|\4\2\2\u0101\ud802\udc01\3\2\ud802\udc01\3\2\udc02\ue001"+
		"\7\2&&\62;C\\aac|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\2\u01ee\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W"+
		"\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\2i\3\2\2\2\3w\3\2\2\2\5\u0085\3\2\2\2\7\u0091\3\2\2\2\t\u0099\3\2"+
		"\2\2\13\u00a7\3\2\2\2\r\u00b5\3\2\2\2\17\u00dc\3\2\2\2\21\u00de\3\2\2"+
		"\2\23\u00e9\3\2\2\2\25\u00f6\3\2\2\2\27\u00fd\3\2\2\2\31\u0106\3\2\2\2"+
		"\33\u0124\3\2\2\2\35\u0126\3\2\2\2\37\u012a\3\2\2\2!\u012d\3\2\2\2#\u0131"+
		"\3\2\2\2%\u0135\3\2\2\2\'\u0137\3\2\2\2)\u013a\3\2\2\2+\u013c\3\2\2\2"+
		"-\u013f\3\2\2\2/\u0141\3\2\2\2\61\u0144\3\2\2\2\63\u0146\3\2\2\2\65\u0148"+
		"\3\2\2\2\67\u014a\3\2\2\29\u014c\3\2\2\2;\u014e\3\2\2\2=\u0150\3\2\2\2"+
		"?\u0152\3\2\2\2A\u0154\3\2\2\2C\u0156\3\2\2\2E\u0158\3\2\2\2G\u015a\3"+
		"\2\2\2I\u015c\3\2\2\2K\u015e\3\2\2\2M\u0160\3\2\2\2O\u0162\3\2\2\2Q\u0165"+
		"\3\2\2\2S\u0168\3\2\2\2U\u016b\3\2\2\2W\u016d\3\2\2\2Y\u017b\3\2\2\2["+
		"\u0186\3\2\2\2]\u0194\3\2\2\2_\u01a2\3\2\2\2a\u01af\3\2\2\2c\u01b7\3\2"+
		"\2\2e\u01ba\3\2\2\2g\u01c0\3\2\2\2i\u01ce\3\2\2\2kl\7d\2\2lm\7t\2\2mn"+
		"\7g\2\2no\7x\2\2op\7g\2\2px\7v\2\2qr\7D\2\2rs\7t\2\2st\7g\2\2tu\7x\2\2"+
		"uv\7g\2\2vx\7v\2\2wk\3\2\2\2wq\3\2\2\2x\4\3\2\2\2yz\7r\2\2z{\7k\2\2{|"+
		"\7n\2\2|}\7q\2\2}~\7v\2\2~\u0086\7g\2\2\177\u0080\7R\2\2\u0080\u0081\7"+
		"k\2\2\u0081\u0082\7n\2\2\u0082\u0083\7q\2\2\u0083\u0084\7v\2\2\u0084\u0086"+
		"\7g\2\2\u0085y\3\2\2\2\u0085\177\3\2\2\2\u0086\6\3\2\2\2\u0087\u0088\7"+
		"c\2\2\u0088\u0089\7x\2\2\u0089\u008a\7k\2\2\u008a\u008b\7q\2\2\u008b\u0092"+
		"\7p\2\2\u008c\u008d\7C\2\2\u008d\u008e\7x\2\2\u008e\u008f\7k\2\2\u008f"+
		"\u0090\7q\2\2\u0090\u0092\7p\2\2\u0091\u0087\3\2\2\2\u0091\u008c\3\2\2"+
		"\2\u0092\b\3\2\2\2\u0093\u0094\7x\2\2\u0094\u0095\7q\2\2\u0095\u009a\7"+
		"n\2\2\u0096\u0097\7X\2\2\u0097\u0098\7q\2\2\u0098\u009a\7n\2\2\u0099\u0093"+
		"\3\2\2\2\u0099\u0096\3\2\2\2\u009a\n\3\2\2\2\u009b\u009c\7e\2\2\u009c"+
		"\u009d\7n\2\2\u009d\u009e\7k\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7p\2\2"+
		"\u00a0\u00a8\7v\2\2\u00a1\u00a2\7E\2\2\u00a2\u00a3\7n\2\2\u00a3\u00a4"+
		"\7k\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7p\2\2\u00a6\u00a8\7v\2\2\u00a7"+
		"\u009b\3\2\2\2\u00a7\u00a1\3\2\2\2\u00a8\f\3\2\2\2\u00a9\u00aa\7e\2\2"+
		"\u00aa\u00ab\7q\2\2\u00ab\u00ac\7o\2\2\u00ac\u00ad\7r\2\2\u00ad\u00ae"+
		"\7v\2\2\u00ae\u00b6\7g\2\2\u00af\u00b0\7E\2\2\u00b0\u00b1\7q\2\2\u00b1"+
		"\u00b2\7o\2\2\u00b2\u00b3\7r\2\2\u00b3\u00b4\7v\2\2\u00b4\u00b6\7g\2\2"+
		"\u00b5\u00a9\3\2\2\2\u00b5\u00af\3\2\2\2\u00b6\16\3\2\2\2\u00b7\u00b8"+
		"\7o\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7f\2\2\u00ba\u00bb\7\u00ea\2\2"+
		"\u00bb\u00bc\7n\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7F\2\2\u00be\u00bf"+
		"\7C\2\2\u00bf\u00c0\7x\2\2\u00c0\u00c1\7k\2\2\u00c1\u00c2\7q\2\2\u00c2"+
		"\u00dd\7p\2\2\u00c3\u00c4\7O\2\2\u00c4\u00c5\7q\2\2\u00c5\u00c6\7f\2\2"+
		"\u00c6\u00c7\7\u00ea\2\2\u00c7\u00c8\7n\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca"+
		"\7F\2\2\u00ca\u00cb\7C\2\2\u00cb\u00cc\7x\2\2\u00cc\u00cd\7k\2\2\u00cd"+
		"\u00ce\7q\2\2\u00ce\u00dd\7p\2\2\u00cf\u00d0\7o\2\2\u00d0\u00d1\7q\2\2"+
		"\u00d1\u00d2\7f\2\2\u00d2\u00d3\7\u00ea\2\2\u00d3\u00d4\7n\2\2\u00d4\u00d5"+
		"\7g\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\7f\2\2\u00d7\u00d8\7c\2\2\u00d8"+
		"\u00d9\7x\2\2\u00d9\u00da\7k\2\2\u00da\u00db\7q\2\2\u00db\u00dd\7p\2\2"+
		"\u00dc\u00b7\3\2\2\2\u00dc\u00c3\3\2\2\2\u00dc\u00cf\3\2\2\2\u00dd\20"+
		"\3\2\2\2\u00de\u00df\7F\2\2\u00df\u00e0\7\u00eb\2\2\u00e0\u00e1\7h\2\2"+
		"\u00e1\u00e2\7k\2\2\u00e2\u00e3\7p\2\2\u00e3\u00e4\7k\2\2\u00e4\u00e5"+
		"\7v\2\2\u00e5\u00e6\7k\2\2\u00e6\u00e7\7q\2\2\u00e7\u00e8\7p\2\2\u00e8"+
		"\22\3\2\2\2\u00e9\u00ea\7T\2\2\u00ea\u00eb\7\u00ea\2\2\u00eb\u00ec\7i"+
		"\2\2\u00ec\u00ed\7n\2\2\u00ed\u00ee\7g\2\2\u00ee\24\3\2\2\2\u00ef\u00f0"+
		"\7n\2\2\u00f0\u00f7\7g\2\2\u00f1\u00f2\7n\2\2\u00f2\u00f7\7c\2\2\u00f3"+
		"\u00f4\7n\2\2\u00f4\u00f5\7g\2\2\u00f5\u00f7\7u\2\2\u00f6\u00ef\3\2\2"+
		"\2\u00f6\u00f1\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f7\26\3\2\2\2\u00f8\u00f9"+
		"\7w\2\2\u00f9\u00fe\7p\2\2\u00fa\u00fb\7w\2\2\u00fb\u00fc\7p\2\2\u00fc"+
		"\u00fe\7g\2\2\u00fd\u00f8\3\2\2\2\u00fd\u00fa\3\2\2\2\u00fe\30\3\2\2\2"+
		"\u00ff\u0100\7f\2\2\u0100\u0107\7g\2\2\u0101\u0102\7f\2\2\u0102\u0107"+
		"\7w\2\2\u0103\u0104\7f\2\2\u0104\u0105\7g\2\2\u0105\u0107\7u\2\2\u0106"+
		"\u00ff\3\2\2\2\u0106\u0101\3\2\2\2\u0106\u0103\3\2\2\2\u0107\32\3\2\2"+
		"\2\u0108\u0109\7f\2\2\u0109\u010a\7q\2\2\u010a\u010b\7k\2\2\u010b\u010c"+
		"\7v\2\2\u010c\u010d\3\2\2\2\u010d\u010e\7\u00ec\2\2\u010e\u010f\7v\2\2"+
		"\u010f\u0110\7t\2\2\u0110\u0125\7g\2\2\u0111\u0112\7f\2\2\u0112\u0113"+
		"\7q\2\2\u0113\u0114\7k\2\2\u0114\u0115\7x\2\2\u0115\u0116\7g\2\2\u0116"+
		"\u0117\7p\2\2\u0117\u0118\7v\2\2\u0118\u0119\3\2\2\2\u0119\u011a\7\u00ec"+
		"\2\2\u011a\u011b\7v\2\2\u011b\u011c\7t\2\2\u011c\u0125\7g\2\2\u011d\u011e"+
		"\7g\2\2\u011e\u011f\7u\2\2\u011f\u0125\7v\2\2\u0120\u0121\7u\2\2\u0121"+
		"\u0122\7q\2\2\u0122\u0123\7p\2\2\u0123\u0125\7v\2\2\u0124\u0108\3\2\2"+
		"\2\u0124\u0111\3\2\2\2\u0124\u011d\3\2\2\2\u0124\u0120\3\2\2\2\u0125\34"+
		"\3\2\2\2\u0126\u0127\7z\2\2\u0127\u0128\7q\2\2\u0128\u0129\7t\2\2\u0129"+
		"\36\3\2\2\2\u012a\u012b\7q\2\2\u012b\u012c\7t\2\2\u012c \3\2\2\2\u012d"+
		"\u012e\7c\2\2\u012e\u012f\7p\2\2\u012f\u0130\7f\2\2\u0130\"\3\2\2\2\u0131"+
		"\u0132\7p\2\2\u0132\u0133\7q\2\2\u0133\u0134\7v\2\2\u0134$\3\2\2\2\u0135"+
		"\u0136\7>\2\2\u0136&\3\2\2\2\u0137\u0138\7>\2\2\u0138\u0139\7?\2\2\u0139"+
		"(\3\2\2\2\u013a\u013b\7@\2\2\u013b*\3\2\2\2\u013c\u013d\7@\2\2\u013d\u013e"+
		"\7?\2\2\u013e,\3\2\2\2\u013f\u0140\7?\2\2\u0140.\3\2\2\2\u0141\u0142\7"+
		">\2\2\u0142\u0143\7@\2\2\u0143\60\3\2\2\2\u0144\u0145\7-\2\2\u0145\62"+
		"\3\2\2\2\u0146\u0147\7/\2\2\u0147\64\3\2\2\2\u0148\u0149\7,\2\2\u0149"+
		"\66\3\2\2\2\u014a\u014b\7\61\2\2\u014b8\3\2\2\2\u014c\u014d\7\'\2\2\u014d"+
		":\3\2\2\2\u014e\u014f\7*\2\2\u014f<\3\2\2\2\u0150\u0151\7+\2\2\u0151>"+
		"\3\2\2\2\u0152\u0153\7}\2\2\u0153@\3\2\2\2\u0154\u0155\7\177\2\2\u0155"+
		"B\3\2\2\2\u0156\u0157\7]\2\2\u0157D\3\2\2\2\u0158\u0159\7_\2\2\u0159F"+
		"\3\2\2\2\u015a\u015b\7<\2\2\u015bH\3\2\2\2\u015c\u015d\7=\2\2\u015dJ\3"+
		"\2\2\2\u015e\u015f\7.\2\2\u015fL\3\2\2\2\u0160\u0161\7\60\2\2\u0161N\3"+
		"\2\2\2\u0162\u0163\7/\2\2\u0163\u0164\7@\2\2\u0164P\3\2\2\2\u0165\u0166"+
		"\7?\2\2\u0166\u0167\7@\2\2\u0167R\3\2\2\2\u0168\u0169\7>\2\2\u0169\u016a"+
		"\7/\2\2\u016aT\3\2\2\2\u016b\u016c\7~\2\2\u016cV\3\2\2\2\u016d\u016e\7"+
		"p\2\2\u016e\u016f\7q\2\2\u016f\u0170\3\2\2\2\u0170\u0171\7f\2\2\u0171"+
		"\u0172\7g\2\2\u0172\u0173\7v\2\2\u0173\u0174\7g\2\2\u0174\u0175\7t\2\2"+
		"\u0175\u0176\7o\2\2\u0176\u0177\7k\2\2\u0177\u0178\7p\2\2\u0178\u0179"+
		"\7g\2\2\u0179\u017a\7t\2\2\u017aX\3\2\2\2\u017b\u017c\7p\2\2\u017c\u017d"+
		"\7q\2\2\u017d\u017e\3\2\2\2\u017e\u017f\7m\2\2\u017f\u0180\7g\2\2\u0180"+
		"\u0181\7{\2\2\u0181\u0182\7y\2\2\u0182\u0183\7q\2\2\u0183\u0184\7t\2\2"+
		"\u0184\u0185\7f\2\2\u0185Z\3\2\2\2\u0186\u0187\7p\2\2\u0187\u0188\7q\2"+
		"\2\u0188\u0189\3\2\2\2\u0189\u018a\7o\2\2\u018a\u018b\7q\2\2\u018b\u018c"+
		"\7f\2\2\u018c\u018d\7g\2\2\u018d\u018e\7n\2\2\u018e\u018f\3\2\2\2\u018f"+
		"\u0190\7v\2\2\u0190\u0191\7g\2\2\u0191\u0192\7t\2\2\u0192\u0193\7o\2\2"+
		"\u0193\\\3\2\2\2\u0194\u0195\7p\2\2\u0195\u0196\7q\2\2\u0196\u0197\3\2"+
		"\2\2\u0197\u0198\7q\2\2\u0198\u0199\7v\2\2\u0199\u019a\7j\2\2\u019a\u019b"+
		"\7g\2\2\u019b\u019c\7t\2\2\u019c\u019d\3\2\2\2\u019d\u019e\7v\2\2\u019e"+
		"\u019f\7g\2\2\u019f\u01a0\7t\2\2\u01a0\u01a1\7o\2\2\u01a1^\3\2\2\2\u01a2"+
		"\u01a6\5a\61\2\u01a3\u01a5\5c\62\2\u01a4\u01a3\3\2\2\2\u01a5\u01a8\3\2"+
		"\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7`\3\2\2\2\u01a8\u01a6"+
		"\3\2\2\2\u01a9\u01b0\t\2\2\2\u01aa\u01ab\n\3\2\2\u01ab\u01b0\6\61\2\2"+
		"\u01ac\u01ad\t\4\2\2\u01ad\u01ae\t\5\2\2\u01ae\u01b0\6\61\3\2\u01af\u01a9"+
		"\3\2\2\2\u01af\u01aa\3\2\2\2\u01af\u01ac\3\2\2\2\u01b0b\3\2\2\2\u01b1"+
		"\u01b8\t\6\2\2\u01b2\u01b3\n\3\2\2\u01b3\u01b8\6\62\4\2\u01b4\u01b5\t"+
		"\4\2\2\u01b5\u01b6\t\5\2\2\u01b6\u01b8\6\62\5\2\u01b7\u01b1\3\2\2\2\u01b7"+
		"\u01b2\3\2\2\2\u01b7\u01b4\3\2\2\2\u01b8d\3\2\2\2\u01b9\u01bb\t\7\2\2"+
		"\u01ba\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd"+
		"\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\b\63\2\2\u01bff\3\2\2\2\u01c0"+
		"\u01c1\7\61\2\2\u01c1\u01c2\7,\2\2\u01c2\u01c6\3\2\2\2\u01c3\u01c5\13"+
		"\2\2\2\u01c4\u01c3\3\2\2\2\u01c5\u01c8\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c6"+
		"\u01c4\3\2\2\2\u01c7\u01c9\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c9\u01ca\7,"+
		"\2\2\u01ca\u01cb\7\61\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\b\64\2\2\u01cd"+
		"h\3\2\2\2\u01ce\u01cf\7/\2\2\u01cf\u01d0\7/\2\2\u01d0\u01d4\3\2\2\2\u01d1"+
		"\u01d3\n\b\2\2\u01d2\u01d1\3\2\2\2\u01d3\u01d6\3\2\2\2\u01d4\u01d2\3\2"+
		"\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d7\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d7"+
		"\u01d8\b\65\2\2\u01d8j\3\2\2\2\24\2w\u0085\u0091\u0099\u00a7\u00b5\u00dc"+
		"\u00f6\u00fd\u0106\u0124\u01a6\u01af\u01b7\u01bc\u01c6\u01d4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}