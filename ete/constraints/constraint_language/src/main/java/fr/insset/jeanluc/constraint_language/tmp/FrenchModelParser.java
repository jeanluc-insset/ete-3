package fr.insset.jeanluc.constraint_language.tmp;

// Generated from FrenchModelParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FrenchModelParser extends Parser {
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
	public static final int
		RULE_modelKeyWords = 0, RULE_definitionSignature = 1, RULE_navExpression = 2, 
		RULE_navigationKeyword = 3, RULE_word = 4, RULE_determiner = 5, RULE_keyword = 6, 
		RULE_initTerm = 7, RULE_term = 8, RULE_file = 9, RULE_definition = 10, 
		RULE_definitionKeyword = 11, RULE_definitionHead = 12, RULE_definitionSeparator = 13, 
		RULE_definitionMark = 14, RULE_definitionEnd = 15, RULE_businessRule = 16, 
		RULE_ruleKeyword = 17, RULE_sentence = 18, RULE_nounGroup = 19, RULE_modelTermGroup = 20, 
		RULE_modelTerm = 21, RULE_other = 22, RULE_gelExpression = 23, RULE_xorExpression = 24, 
		RULE_xorOperator = 25, RULE_orExpression = 26, RULE_orOperator = 27, RULE_andExpression = 28, 
		RULE_andOperator = 29, RULE_impliesExpression = 30, RULE_impliesOperator = 31, 
		RULE_equalOrDiffExpression = 32, RULE_equalExpression = 33, RULE_equalOperator = 34, 
		RULE_diffExpression = 35, RULE_diffOperator = 36, RULE_compareExpression = 37, 
		RULE_gtExpression = 38, RULE_geExpression = 39, RULE_ltExpression = 40, 
		RULE_leExpression = 41, RULE_gtOperator = 42, RULE_geOperator = 43, RULE_leOperator = 44, 
		RULE_ltOperator = 45, RULE_negationExpression = 46, RULE_notOperator = 47, 
		RULE_oppExpression = 48, RULE_leftToRightNavigation = 49, RULE_rightToLeftNavigation = 50, 
		RULE_navOperator = 51;
	public static final String[] ruleNames = {
		"modelKeyWords", "definitionSignature", "navExpression", "navigationKeyword", 
		"word", "determiner", "keyword", "initTerm", "term", "file", "definition", 
		"definitionKeyword", "definitionHead", "definitionSeparator", "definitionMark", 
		"definitionEnd", "businessRule", "ruleKeyword", "sentence", "nounGroup", 
		"modelTermGroup", "modelTerm", "other", "gelExpression", "xorExpression", 
		"xorOperator", "orExpression", "orOperator", "andExpression", "andOperator", 
		"impliesExpression", "impliesOperator", "equalOrDiffExpression", "equalExpression", 
		"equalOperator", "diffExpression", "diffOperator", "compareExpression", 
		"gtExpression", "geExpression", "ltExpression", "leExpression", "gtOperator", 
		"geOperator", "leOperator", "ltOperator", "negationExpression", "notOperator", 
		"oppExpression", "leftToRightNavigation", "rightToLeftNavigation", "navOperator"
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

	@Override
	public String getGrammarFileName() { return "FrenchModelParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FrenchModelParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ModelKeyWordsContext extends ParserRuleContext {
		public TerminalNode BREVET() { return getToken(FrenchModelParser.BREVET, 0); }
		public TerminalNode PILOTE() { return getToken(FrenchModelParser.PILOTE, 0); }
		public TerminalNode AVION() { return getToken(FrenchModelParser.AVION, 0); }
		public TerminalNode VOL() { return getToken(FrenchModelParser.VOL, 0); }
		public TerminalNode CLIENT() { return getToken(FrenchModelParser.CLIENT, 0); }
		public TerminalNode COMPTE() { return getToken(FrenchModelParser.COMPTE, 0); }
		public TerminalNode MODÈLEDAVION() { return getToken(FrenchModelParser.MODÈLEDAVION, 0); }
		public ModelKeyWordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelKeyWords; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchModelParserVisitor ) return ((FrenchModelParserVisitor<? extends T>)visitor).visitModelKeyWords(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModelKeyWordsContext modelKeyWords() throws RecognitionException {
		ModelKeyWordsContext _localctx = new ModelKeyWordsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_modelKeyWords);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BREVET) | (1L << PILOTE) | (1L << AVION) | (1L << VOL) | (1L << CLIENT) | (1L << COMPTE) | (1L << MODÈLEDAVION))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinitionSignatureContext extends ParserRuleContext {
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<KeywordContext> keyword() {
			return getRuleContexts(KeywordContext.class);
		}
		public KeywordContext keyword(int i) {
			return getRuleContext(KeywordContext.class,i);
		}
		public DefinitionSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definitionSignature; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchModelParserVisitor ) return ((FrenchModelParserVisitor<? extends T>)visitor).visitDefinitionSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionSignatureContext definitionSignature() throws RecognitionException {
		DefinitionSignatureContext _localctx = new DefinitionSignatureContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definitionSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(108);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case THE:
				case A:
				case Identifier:
					{
					setState(106);
					word();
					}
					break;
				case IS:
					{
					setState(107);
					keyword();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(110); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THE) | (1L << A) | (1L << IS) | (1L << Identifier))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NavExpressionContext extends ParserRuleContext {
		public RightToLeftNavigationContext rightToLeftNavigation() {
			return getRuleContext(RightToLeftNavigationContext.class,0);
		}
		public NavExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_navExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchModelParserVisitor ) return ((FrenchModelParserVisitor<? extends T>)visitor).visitNavExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NavExpressionContext navExpression() throws RecognitionException {
		NavExpressionContext _localctx = new NavExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_navExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			rightToLeftNavigation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NavigationKeywordContext extends ParserRuleContext {
		public TerminalNode OF() { return getToken(FrenchModelParser.OF, 0); }
		public NavigationKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_navigationKeyword; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchModelParserVisitor ) return ((FrenchModelParserVisitor<? extends T>)visitor).visitNavigationKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NavigationKeywordContext navigationKeyword() throws RecognitionException {
		NavigationKeywordContext _localctx = new NavigationKeywordContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_navigationKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(OF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WordContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(FrenchModelParser.Identifier, 0); }
		public DeterminerContext determiner() {
			return getRuleContext(DeterminerContext.class,0);
		}
		public WordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchModelParserVisitor ) return ((FrenchModelParserVisitor<? extends T>)visitor).visitWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WordContext word() throws RecognitionException {
		WordContext _localctx = new WordContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_word);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THE || _la==A) {
				{
				setState(116);
				determiner();
				}
			}

			setState(119);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeterminerContext extends ParserRuleContext {
		public TerminalNode THE() { return getToken(FrenchModelParser.THE, 0); }
		public TerminalNode A() { return getToken(FrenchModelParser.A, 0); }
		public DeterminerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_determiner; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchModelParserVisitor ) return ((FrenchModelParserVisitor<? extends T>)visitor).visitDeterminer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeterminerContext determiner() throws RecognitionException {
		DeterminerContext _localctx = new DeterminerContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_determiner);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_la = _input.LA(1);
			if ( !(_la==THE || _la==A) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode IS() { return getToken(FrenchModelParser.IS, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchModelParserVisitor ) return ((FrenchModelParserVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(IS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitTermContext extends ParserRuleContext {
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public DeterminerContext determiner() {
			return getRuleContext(DeterminerContext.class,0);
		}
		public InitTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initTerm; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchModelParserVisitor ) return ((FrenchModelParserVisitor<? extends T>)visitor).visitInitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitTermContext initTerm() throws RecognitionException {
		InitTermContext _localctx = new InitTermContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_initTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(125);
				determiner();
				}
				break;
			}
			setState(128);
			word();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public DeterminerContext determiner() {
			return getRuleContext(DeterminerContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchModelParserVisitor ) return ((FrenchModelParserVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(130);
				determiner();
				}
				break;
			}
			setState(133);
			word();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileContext extends ParserRuleContext {
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public List<BusinessRuleContext> businessRule() {
			return getRuleContexts(BusinessRuleContext.class);
		}
		public BusinessRuleContext businessRule(int i) {
			return getRuleContext(BusinessRuleContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchModelParserVisitor ) return ((FrenchModelParserVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(137);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DEFINITION:
					{
					setState(135);
					definition();
					}
					break;
				case RULE:
					{
					setState(136);
					businessRule();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(139); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DEFINITION || _la==RULE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinitionContext extends ParserRuleContext {
		public DefinitionKeywordContext definitionKeyword() {
			return getRuleContext(DefinitionKeywordContext.class,0);
		}
		public DefinitionHeadContext definitionHead() {
			return getRuleContext(DefinitionHeadContext.class,0);
		}
		public DefinitionSeparatorContext definitionSeparator() {
			return getRuleContext(DefinitionSeparatorContext.class,0);
		}
		public GelExpressionContext gelExpression() {
			return getRuleContext(GelExpressionContext.class,0);
		}
		public DefinitionEndContext definitionEnd() {
			return getRuleContext(DefinitionEndContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchModelParserVisitor ) return ((FrenchModelParserVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			definitionKeyword();
			setState(142);
			definitionHead();
			setState(143);
			definitionSeparator();
			setState(144);
			gelExpression();
			setState(145);
			definitionEnd();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinitionKeywordContext extends ParserRuleContext {
		public TerminalNode DEFINITION() { return getToken(FrenchModelParser.DEFINITION, 0); }
		public DefinitionKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definitionKeyword; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchModelParserVisitor ) return ((FrenchModelParserVisitor<? extends T>)visitor).visitDefinitionKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionKeywordContext definitionKeyword() throws RecognitionException {
		DefinitionKeywordContext _localctx = new DefinitionKeywordContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_definitionKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(DEFINITION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinitionHeadContext extends ParserRuleContext {
		public DefinitionSignatureContext definitionSignature() {
			return getRuleContext(DefinitionSignatureContext.class,0);
		}
		public DefinitionMarkContext definitionMark() {
			return getRuleContext(DefinitionMarkContext.class,0);
		}
		public DefinitionHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definitionHead; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchModelParserVisitor ) return ((FrenchModelParserVisitor<? extends T>)visitor).visitDefinitionHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionHeadContext definitionHead() throws RecognitionException {
		DefinitionHeadContext _localctx = new DefinitionHeadContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_definitionHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(149);
				definitionMark();
				}
			}

			setState(152);
			definitionSignature();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinitionSeparatorContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(FrenchModelParser.COLON, 0); }
		public DefinitionSeparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definitionSeparator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchModelParserVisitor ) return ((FrenchModelParserVisitor<? extends T>)visitor).visitDefinitionSeparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionSeparatorContext definitionSeparator() throws RecognitionException {
		DefinitionSeparatorContext _localctx = new DefinitionSeparatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_definitionSeparator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinitionMarkContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(FrenchModelParser.MINUS, 0); }
		public DefinitionMarkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definitionMark; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchModelParserVisitor ) return ((FrenchModelParserVisitor<? extends T>)visitor).visitDefinitionMark(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionMarkContext definitionMark() throws RecognitionException {
		DefinitionMarkContext _localctx = new DefinitionMarkContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_definitionMark);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(MINUS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinitionEndContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(FrenchModelParser.DOT, 0); }
		public DefinitionEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definitionEnd; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchModelParserVisitor ) return ((FrenchModelParserVisitor<? extends T>)visitor).visitDefinitionEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionEndContext definitionEnd() throws RecognitionException {
		DefinitionEndContext _localctx = new DefinitionEndContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_definitionEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BusinessRuleContext extends ParserRuleContext {
		public TerminalNode RULE() { return getToken(FrenchModelParser.RULE, 0); }
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public TerminalNode COLON() { return getToken(FrenchModelParser.COLON, 0); }
		public GelExpressionContext gelExpression() {
			return getRuleContext(GelExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(FrenchModelParser.DOT, 0); }
		public BusinessRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_businessRule; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchModelParserVisitor ) return ((FrenchModelParserVisitor<? extends T>)visitor).visitBusinessRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BusinessRuleContext businessRule() throws RecognitionException {
		BusinessRuleContext _localctx = new BusinessRuleContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_businessRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(RULE);
			setState(161);
			sentence();
			setState(162);
			match(COLON);
			setState(163);
			gelExpression();
			setState(164);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleKeywordContext extends ParserRuleContext {
		public TerminalNode RULE() { return getToken(FrenchModelParser.RULE, 0); }
		public RuleKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleKeyword; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchModelParserVisitor ) return ((FrenchModelParserVisitor<? extends T>)visitor).visitRuleKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleKeywordContext ruleKeyword() throws RecognitionException {
		RuleKeywordContext _localctx = new RuleKeywordContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ruleKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(RULE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentenceContext extends ParserRuleContext {
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchModelParserVisitor ) return ((FrenchModelParserVisitor<? extends T>)visitor).visitSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(168);
				word();
				}
				}
				setState(171); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THE) | (1L << A) | (1L << Identifier))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NounGroupContext extends ParserRuleContext {
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public DeterminerContext determiner() {
			return getRuleContext(DeterminerContext.class,0);
		}
		public NounGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nounGroup; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchModelParserVisitor ) return ((FrenchModelParserVisitor<? extends T>)visitor).visitNounGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NounGroupContext nounGroup() throws RecognitionException {
		NounGroupContext _localctx = new NounGroupContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_nounGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(173);
				determiner();
				}
				break;
			}
			setState(176);
			word();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModelTermGroupContext extends ParserRuleContext {
		public ModelTermContext modelTerm() {
			return getRuleContext(ModelTermContext.class,0);
		}
		public DeterminerContext determiner() {
			return getRuleContext(DeterminerContext.class,0);
		}
		public ModelTermGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelTermGroup; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchModelParserVisitor ) return ((FrenchModelParserVisitor<? extends T>)visitor).visitModelTermGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModelTermGroupContext modelTermGroup() throws RecognitionException {
		ModelTermGroupContext _localctx = new ModelTermGroupContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_modelTermGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THE || _la==A) {
				{
				setState(178);
				determiner();
				}
			}

			setState(181);
			modelTerm();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModelTermContext extends ParserRuleContext {
		public TerminalNode NO_MODEL_TERM() { return getToken(FrenchModelParser.NO_MODEL_TERM, 0); }
		public ModelTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelTerm; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchModelParserVisitor ) return ((FrenchModelParserVisitor<? extends T>)visitor).visitModelTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModelTermContext modelTerm() throws RecognitionException {
		ModelTermContext _localctx = new ModelTermContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_modelTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(NO_MODEL_TERM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OtherContext extends ParserRuleContext {
		public TerminalNode NO_OTHER() { return getToken(FrenchModelParser.NO_OTHER, 0); }
		public OtherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchModelParserVisitor ) return ((FrenchModelParserVisitor<? extends T>)visitor).visitOther(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherContext other() throws RecognitionException {
		OtherContext _localctx = new OtherContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_other);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(NO_OTHER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GelExpressionContext extends ParserRuleContext {
		public XorExpressionContext xorExpression() {
			return getRuleContext(XorExpressionContext.class,0);
		}
		public GelExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gelExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchModelParserVisitor ) return ((FrenchModelParserVisitor<? extends T>)visitor).visitGelExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GelExpressionContext gelExpression() throws RecognitionException {
		GelExpressionContext _localctx = new GelExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_gelExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			xorExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class XorExpressionContext extends ParserRuleContext {
		public List<OrExpressionContext> orExpression() {
			return getRuleContexts(OrExpressionContext.class);
		}
		public OrExpressionContext orExpression(int i) {
			return getRuleContext(OrExpressionContext.class,i);
		}
		public XorOperatorContext xorOperator() {
			return getRuleContext(XorOperatorContext.class,0);
		}
		public XorExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xorExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchModelParserVisitor ) return ((FrenchModelParserVisitor<? extends T>)visitor).visitXorExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XorExpressionContext xorExpression() throws RecognitionException {
		XorExpressionContext _localctx = new XorExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_xorExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(189);
				orExpression();
				setState(190);
				xorOperator();
				}
				break;
			}
			setState(194);
			orExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class XorOperatorContext extends ParserRuleContext {
		public TerminalNode XOR() { return getToken(FrenchModelParser.XOR, 0); }
		public XorOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xorOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchModelParserVisitor ) return ((FrenchModelParserVisitor<? extends T>)visitor).visitXorOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XorOperatorContext xorOperator() throws RecognitionException {
		XorOperatorContext _localctx = new XorOperatorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_xorOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(XOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrExpressionContext extends ParserRuleContext {
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public List<OrOperatorContext> orOperator() {
			return getRuleContexts(OrOperatorContext.class);
		}
		public OrOperatorContext orOperator(int i) {
			return getRuleContext(OrOperatorContext.class,i);
		}
		public OrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchModelParserVisitor ) return ((FrenchModelParserVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrExpressionContext orExpression() throws RecognitionException {
		OrExpressionContext _localctx = new OrExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_orExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(198);
					andExpression();
					setState(199);
					orOperator();
					}
					} 
				}
				setState(205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(206);
			andExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrOperatorContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(FrenchModelParser.OR, 0); }
		public OrOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchModelParserVisitor ) return ((FrenchModelParserVisitor<? extends T>)visitor).visitOrOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrOperatorContext orOperator() throws RecognitionException {
		OrOperatorContext _localctx = new OrOperatorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_orOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(OR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public List<ImpliesExpressionContext> impliesExpression() {
			return getRuleContexts(ImpliesExpressionContext.class);
		}
		public ImpliesExpressionContext impliesExpression(int i) {
			return getRuleContext(ImpliesExpressionContext.class,i);
		}
		public List<AndOperatorContext> andOperator() {
			return getRuleContexts(AndOperatorContext.class);
		}
		public AndOperatorContext andOperator(int i) {
			return getRuleContext(AndOperatorContext.class,i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchModelParserVisitor ) return ((FrenchModelParserVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_andExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(210);
					impliesExpression();
					setState(211);
					andOperator();
					}
					} 
				}
				setState(217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(218);
			impliesExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndOperatorContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(FrenchModelParser.AND, 0); }
		public AndOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchModelParserVisitor ) return ((FrenchModelParserVisitor<? extends T>)visitor).visitAndOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndOperatorContext andOperator() throws RecognitionException {
		AndOperatorContext _localctx = new AndOperatorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_andOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(AND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImpliesExpressionContext extends ParserRuleContext {
		public List<EqualOrDiffExpressionContext> equalOrDiffExpression() {
			return getRuleContexts(EqualOrDiffExpressionContext.class);
		}
		public EqualOrDiffExpressionContext equalOrDiffExpression(int i) {
			return getRuleContext(EqualOrDiffExpressionContext.class,i);
		}
		public ImpliesOperatorContext impliesOperator() {
			return getRuleContext(ImpliesOperatorContext.class,0);
		}
		public ImpliesExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impliesExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchModelParserVisitor ) return ((FrenchModelParserVisitor<? extends T>)visitor).visitImpliesExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImpliesExpressionContext impliesExpression() throws RecognitionException {
		ImpliesExpressionContext _localctx = new ImpliesExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_impliesExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(222);
				equalOrDiffExpression();
				setState(223);
				impliesOperator();
				}
				break;
			}
			setState(227);
			equalOrDiffExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImpliesOperatorContext extends ParserRuleContext {
		public TerminalNode DOUBLE_ARROW() { return getToken(FrenchModelParser.DOUBLE_ARROW, 0); }
		public ImpliesOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impliesOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchModelParserVisitor ) return ((FrenchModelParserVisitor<? extends T>)visitor).visitImpliesOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImpliesOperatorContext impliesOperator() throws RecognitionException {
		ImpliesOperatorContext _localctx = new ImpliesOperatorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_impliesOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(DOUBLE_ARROW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualOrDiffExpressionContext extends ParserRuleContext {
		public EqualExpressionContext equalExpression() {
			return getRuleContext(EqualExpressionContext.class,0);
		}
		public DiffExpressionContext diffExpression() {
			return getRuleContext(DiffExpressionContext.class,0);
		}
		public CompareExpressionContext compareExpression() {
			return getRuleContext(CompareExpressionContext.class,0);
		}
		public EqualOrDiffExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalOrDiffExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchModelParserVisitor ) return ((FrenchModelParserVisitor<? extends T>)visitor).visitEqualOrDiffExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualOrDiffExpressionContext equalOrDiffExpression() throws RecognitionException {
		EqualOrDiffExpressionContext _localctx = new EqualOrDiffExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_equalOrDiffExpression);
		try {
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				equalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				diffExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				compareExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualExpressionContext extends ParserRuleContext {
		public List<CompareExpressionContext> compareExpression() {
			return getRuleContexts(CompareExpressionContext.class);
		}
		public CompareExpressionContext compareExpression(int i) {
			return getRuleContext(CompareExpressionContext.class,i);
		}
		public EqualOperatorContext equalOperator() {
			return getRuleContext(EqualOperatorContext.class,0);
		}
		public EqualExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchModelParserVisitor ) return ((FrenchModelParserVisitor<? extends T>)visitor).visitEqualExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualExpressionContext equalExpression() throws RecognitionException {
		EqualExpressionContext _localctx = new EqualExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_equalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			compareExpression();
			setState(237);
			equalOperator();
			setState(238);
			compareExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualOperatorContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(FrenchModelParser.EQUAL, 0); }
		public EqualOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchModelParserVisitor ) return ((FrenchModelParserVisitor<? extends T>)visitor).visitEqualOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualOperatorContext equalOperator() throws RecognitionException {
		EqualOperatorContext _localctx = new EqualOperatorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_equalOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(EQUAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiffExpressionContext extends ParserRuleContext {
		public List<CompareExpressionContext> compareExpression() {
			return getRuleContexts(CompareExpressionContext.class);
		}
		public CompareExpressionContext compareExpression(int i) {
			return getRuleContext(CompareExpressionContext.class,i);
		}
		public DiffOperatorContext diffOperator() {
			return getRuleContext(DiffOperatorContext.class,0);
		}
		public DiffExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diffExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchModelParserVisitor ) return ((FrenchModelParserVisitor<? extends T>)visitor).visitDiffExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DiffExpressionContext diffExpression() throws RecognitionException {
		DiffExpressionContext _localctx = new DiffExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_diffExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			compareExpression();
			setState(243);
			diffOperator();
			setState(244);
			compareExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiffOperatorContext extends ParserRuleContext {
		public TerminalNode DIFF() { return getToken(FrenchModelParser.DIFF, 0); }
		public DiffOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diffOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchModelParserVisitor ) return ((FrenchModelParserVisitor<? extends T>)visitor).visitDiffOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DiffOperatorContext diffOperator() throws RecognitionException {
		DiffOperatorContext _localctx = new DiffOperatorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_diffOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(DIFF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompareExpressionContext extends ParserRuleContext {
		public GtExpressionContext gtExpression() {
			return getRuleContext(GtExpressionContext.class,0);
		}
		public GeExpressionContext geExpression() {
			return getRuleContext(GeExpressionContext.class,0);
		}
		public LtExpressionContext ltExpression() {
			return getRuleContext(LtExpressionContext.class,0);
		}
		public LeExpressionContext leExpression() {
			return getRuleContext(LeExpressionContext.class,0);
		}
		public NegationExpressionContext negationExpression() {
			return getRuleContext(NegationExpressionContext.class,0);
		}
		public CompareExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchModelParserVisitor ) return ((FrenchModelParserVisitor<? extends T>)visitor).visitCompareExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareExpressionContext compareExpression() throws RecognitionException {
		CompareExpressionContext _localctx = new CompareExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_compareExpression);
		try {
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				gtExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				geExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				ltExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(251);
				leExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(252);
				negationExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GtExpressionContext extends ParserRuleContext {
		public List<NegationExpressionContext> negationExpression() {
			return getRuleContexts(NegationExpressionContext.class);
		}
		public NegationExpressionContext negationExpression(int i) {
			return getRuleContext(NegationExpressionContext.class,i);
		}
		public GtOperatorContext gtOperator() {
			return getRuleContext(GtOperatorContext.class,0);
		}
		public GtExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gtExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchModelParserVisitor ) return ((FrenchModelParserVisitor<? extends T>)visitor).visitGtExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GtExpressionContext gtExpression() throws RecognitionException {
		GtExpressionContext _localctx = new GtExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_gtExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			negationExpression();
			setState(256);
			gtOperator();
			setState(257);
			negationExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GeExpressionContext extends ParserRuleContext {
		public List<NegationExpressionContext> negationExpression() {
			return getRuleContexts(NegationExpressionContext.class);
		}
		public NegationExpressionContext negationExpression(int i) {
			return getRuleContext(NegationExpressionContext.class,i);
		}
		public GeOperatorContext geOperator() {
			return getRuleContext(GeOperatorContext.class,0);
		}
		public GeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_geExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchModelParserVisitor ) return ((FrenchModelParserVisitor<? extends T>)visitor).visitGeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeExpressionContext geExpression() throws RecognitionException {
		GeExpressionContext _localctx = new GeExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_geExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			negationExpression();
			setState(260);
			geOperator();
			setState(261);
			negationExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LtExpressionContext extends ParserRuleContext {
		public List<NegationExpressionContext> negationExpression() {
			return getRuleContexts(NegationExpressionContext.class);
		}
		public NegationExpressionContext negationExpression(int i) {
			return getRuleContext(NegationExpressionContext.class,i);
		}
		public LtOperatorContext ltOperator() {
			return getRuleContext(LtOperatorContext.class,0);
		}
		public LtExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ltExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchModelParserVisitor ) return ((FrenchModelParserVisitor<? extends T>)visitor).visitLtExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LtExpressionContext ltExpression() throws RecognitionException {
		LtExpressionContext _localctx = new LtExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_ltExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			negationExpression();
			setState(264);
			ltOperator();
			setState(265);
			negationExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeExpressionContext extends ParserRuleContext {
		public List<NegationExpressionContext> negationExpression() {
			return getRuleContexts(NegationExpressionContext.class);
		}
		public NegationExpressionContext negationExpression(int i) {
			return getRuleContext(NegationExpressionContext.class,i);
		}
		public LeOperatorContext leOperator() {
			return getRuleContext(LeOperatorContext.class,0);
		}
		public LeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchModelParserVisitor ) return ((FrenchModelParserVisitor<? extends T>)visitor).visitLeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeExpressionContext leExpression() throws RecognitionException {
		LeExpressionContext _localctx = new LeExpressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_leExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			negationExpression();
			setState(268);
			leOperator();
			setState(269);
			negationExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GtOperatorContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(FrenchModelParser.GT, 0); }
		public GtOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gtOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchModelParserVisitor ) return ((FrenchModelParserVisitor<? extends T>)visitor).visitGtOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GtOperatorContext gtOperator() throws RecognitionException {
		GtOperatorContext _localctx = new GtOperatorContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_gtOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GeOperatorContext extends ParserRuleContext {
		public TerminalNode GE() { return getToken(FrenchModelParser.GE, 0); }
		public GeOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_geOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchModelParserVisitor ) return ((FrenchModelParserVisitor<? extends T>)visitor).visitGeOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeOperatorContext geOperator() throws RecognitionException {
		GeOperatorContext _localctx = new GeOperatorContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_geOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(GE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeOperatorContext extends ParserRuleContext {
		public TerminalNode LE() { return getToken(FrenchModelParser.LE, 0); }
		public LeOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchModelParserVisitor ) return ((FrenchModelParserVisitor<? extends T>)visitor).visitLeOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeOperatorContext leOperator() throws RecognitionException {
		LeOperatorContext _localctx = new LeOperatorContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_leOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(LE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LtOperatorContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(FrenchModelParser.LT, 0); }
		public LtOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ltOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchModelParserVisitor ) return ((FrenchModelParserVisitor<? extends T>)visitor).visitLtOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LtOperatorContext ltOperator() throws RecognitionException {
		LtOperatorContext _localctx = new LtOperatorContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_ltOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(LT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NegationExpressionContext extends ParserRuleContext {
		public OppExpressionContext oppExpression() {
			return getRuleContext(OppExpressionContext.class,0);
		}
		public NotOperatorContext notOperator() {
			return getRuleContext(NotOperatorContext.class,0);
		}
		public NegationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negationExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchModelParserVisitor ) return ((FrenchModelParserVisitor<? extends T>)visitor).visitNegationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegationExpressionContext negationExpression() throws RecognitionException {
		NegationExpressionContext _localctx = new NegationExpressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_negationExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(279);
				notOperator();
				}
			}

			setState(282);
			oppExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotOperatorContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(FrenchModelParser.NOT, 0); }
		public NotOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchModelParserVisitor ) return ((FrenchModelParserVisitor<? extends T>)visitor).visitNotOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotOperatorContext notOperator() throws RecognitionException {
		NotOperatorContext _localctx = new NotOperatorContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_notOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(NOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OppExpressionContext extends ParserRuleContext {
		public NavExpressionContext navExpression() {
			return getRuleContext(NavExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(FrenchModelParser.MINUS, 0); }
		public OppExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oppExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchModelParserVisitor ) return ((FrenchModelParserVisitor<? extends T>)visitor).visitOppExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OppExpressionContext oppExpression() throws RecognitionException {
		OppExpressionContext _localctx = new OppExpressionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_oppExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(286);
				match(MINUS);
				}
			}

			setState(289);
			navExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeftToRightNavigationContext extends ParserRuleContext {
		public InitTermContext initTerm() {
			return getRuleContext(InitTermContext.class,0);
		}
		public List<NavOperatorContext> navOperator() {
			return getRuleContexts(NavOperatorContext.class);
		}
		public NavOperatorContext navOperator(int i) {
			return getRuleContext(NavOperatorContext.class,i);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public LeftToRightNavigationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftToRightNavigation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchModelParserVisitor ) return ((FrenchModelParserVisitor<? extends T>)visitor).visitLeftToRightNavigation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftToRightNavigationContext leftToRightNavigation() throws RecognitionException {
		LeftToRightNavigationContext _localctx = new LeftToRightNavigationContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_leftToRightNavigation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			initTerm();
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARROW) {
				{
				{
				setState(292);
				navOperator();
				setState(293);
				term();
				}
				}
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RightToLeftNavigationContext extends ParserRuleContext {
		public InitTermContext initTerm() {
			return getRuleContext(InitTermContext.class,0);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<NavOperatorContext> navOperator() {
			return getRuleContexts(NavOperatorContext.class);
		}
		public NavOperatorContext navOperator(int i) {
			return getRuleContext(NavOperatorContext.class,i);
		}
		public RightToLeftNavigationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightToLeftNavigation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchModelParserVisitor ) return ((FrenchModelParserVisitor<? extends T>)visitor).visitRightToLeftNavigation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightToLeftNavigationContext rightToLeftNavigation() throws RecognitionException {
		RightToLeftNavigationContext _localctx = new RightToLeftNavigationContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_rightToLeftNavigation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(300);
					term();
					setState(301);
					navOperator();
					}
					} 
				}
				setState(307);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(308);
			initTerm();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NavOperatorContext extends ParserRuleContext {
		public TerminalNode ARROW() { return getToken(FrenchModelParser.ARROW, 0); }
		public NavOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_navOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchModelParserVisitor ) return ((FrenchModelParserVisitor<? extends T>)visitor).visitNavOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NavOperatorContext navOperator() throws RecognitionException {
		NavOperatorContext _localctx = new NavOperatorContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_navOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(ARROW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u013b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\3\2\3\2\3\3\3\3\6\3o\n\3\r\3\16\3p\3\4\3\4\3\5\3\5\3\6\5"+
		"\6x\n\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\5\t\u0081\n\t\3\t\3\t\3\n\5\n\u0086"+
		"\n\n\3\n\3\n\3\13\3\13\6\13\u008c\n\13\r\13\16\13\u008d\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\16\5\16\u0099\n\16\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\6\24\u00ac\n\24"+
		"\r\24\16\24\u00ad\3\25\5\25\u00b1\n\25\3\25\3\25\3\26\5\26\u00b6\n\26"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\5\32\u00c3\n\32"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\34\7\34\u00cc\n\34\f\34\16\34\u00cf\13"+
		"\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\7\36\u00d8\n\36\f\36\16\36\u00db"+
		"\13\36\3\36\3\36\3\37\3\37\3 \3 \3 \5 \u00e4\n \3 \3 \3!\3!\3\"\3\"\3"+
		"\"\5\"\u00ed\n\"\3#\3#\3#\3#\3$\3$\3%\3%\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3"+
		"\'\5\'\u0100\n\'\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3,\3"+
		",\3-\3-\3.\3.\3/\3/\3\60\5\60\u011b\n\60\3\60\3\60\3\61\3\61\3\62\5\62"+
		"\u0122\n\62\3\62\3\62\3\63\3\63\3\63\3\63\7\63\u012a\n\63\f\63\16\63\u012d"+
		"\13\63\3\64\3\64\3\64\7\64\u0132\n\64\f\64\16\64\u0135\13\64\3\64\3\64"+
		"\3\65\3\65\3\65\2\2\66\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		".\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfh\2\4\3\2\3\t\3\2\f\r\2\u011f\2"+
		"j\3\2\2\2\4n\3\2\2\2\6r\3\2\2\2\bt\3\2\2\2\nw\3\2\2\2\f{\3\2\2\2\16}\3"+
		"\2\2\2\20\u0080\3\2\2\2\22\u0085\3\2\2\2\24\u008b\3\2\2\2\26\u008f\3\2"+
		"\2\2\30\u0095\3\2\2\2\32\u0098\3\2\2\2\34\u009c\3\2\2\2\36\u009e\3\2\2"+
		"\2 \u00a0\3\2\2\2\"\u00a2\3\2\2\2$\u00a8\3\2\2\2&\u00ab\3\2\2\2(\u00b0"+
		"\3\2\2\2*\u00b5\3\2\2\2,\u00b9\3\2\2\2.\u00bb\3\2\2\2\60\u00bd\3\2\2\2"+
		"\62\u00c2\3\2\2\2\64\u00c6\3\2\2\2\66\u00cd\3\2\2\28\u00d2\3\2\2\2:\u00d9"+
		"\3\2\2\2<\u00de\3\2\2\2>\u00e3\3\2\2\2@\u00e7\3\2\2\2B\u00ec\3\2\2\2D"+
		"\u00ee\3\2\2\2F\u00f2\3\2\2\2H\u00f4\3\2\2\2J\u00f8\3\2\2\2L\u00ff\3\2"+
		"\2\2N\u0101\3\2\2\2P\u0105\3\2\2\2R\u0109\3\2\2\2T\u010d\3\2\2\2V\u0111"+
		"\3\2\2\2X\u0113\3\2\2\2Z\u0115\3\2\2\2\\\u0117\3\2\2\2^\u011a\3\2\2\2"+
		"`\u011e\3\2\2\2b\u0121\3\2\2\2d\u0125\3\2\2\2f\u0133\3\2\2\2h\u0138\3"+
		"\2\2\2jk\t\2\2\2k\3\3\2\2\2lo\5\n\6\2mo\5\16\b\2nl\3\2\2\2nm\3\2\2\2o"+
		"p\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\5\3\2\2\2rs\5f\64\2s\7\3\2\2\2tu\7\16\2"+
		"\2u\t\3\2\2\2vx\5\f\7\2wv\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\7\61\2\2z\13\3"+
		"\2\2\2{|\t\3\2\2|\r\3\2\2\2}~\7\17\2\2~\17\3\2\2\2\177\u0081\5\f\7\2\u0080"+
		"\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\5\n\6"+
		"\2\u0083\21\3\2\2\2\u0084\u0086\5\f\7\2\u0085\u0084\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\5\n\6\2\u0088\23\3\2\2\2\u0089"+
		"\u008c\5\26\f\2\u008a\u008c\5\"\22\2\u008b\u0089\3\2\2\2\u008b\u008a\3"+
		"\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\25\3\2\2\2\u008f\u0090\5\30\r\2\u0090\u0091\5\32\16\2\u0091\u0092\5\34"+
		"\17\2\u0092\u0093\5\60\31\2\u0093\u0094\5 \21\2\u0094\27\3\2\2\2\u0095"+
		"\u0096\7\n\2\2\u0096\31\3\2\2\2\u0097\u0099\5\36\20\2\u0098\u0097\3\2"+
		"\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\5\4\3\2\u009b"+
		"\33\3\2\2\2\u009c\u009d\7%\2\2\u009d\35\3\2\2\2\u009e\u009f\7\33\2\2\u009f"+
		"\37\3\2\2\2\u00a0\u00a1\7(\2\2\u00a1!\3\2\2\2\u00a2\u00a3\7\13\2\2\u00a3"+
		"\u00a4\5&\24\2\u00a4\u00a5\7%\2\2\u00a5\u00a6\5\60\31\2\u00a6\u00a7\7"+
		"(\2\2\u00a7#\3\2\2\2\u00a8\u00a9\7\13\2\2\u00a9%\3\2\2\2\u00aa\u00ac\5"+
		"\n\6\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\'\3\2\2\2\u00af\u00b1\5\f\7\2\u00b0\u00af\3\2\2\2"+
		"\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\5\n\6\2\u00b3)\3"+
		"\2\2\2\u00b4\u00b6\5\f\7\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\u00b8\5,\27\2\u00b8+\3\2\2\2\u00b9\u00ba\7/\2\2\u00ba"+
		"-\3\2\2\2\u00bb\u00bc\7\60\2\2\u00bc/\3\2\2\2\u00bd\u00be\5\62\32\2\u00be"+
		"\61\3\2\2\2\u00bf\u00c0\5\66\34\2\u00c0\u00c1\5\64\33\2\u00c1\u00c3\3"+
		"\2\2\2\u00c2\u00bf\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\u00c5\5\66\34\2\u00c5\63\3\2\2\2\u00c6\u00c7\7\20\2\2\u00c7\65\3\2\2"+
		"\2\u00c8\u00c9\5:\36\2\u00c9\u00ca\58\35\2\u00ca\u00cc\3\2\2\2\u00cb\u00c8"+
		"\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00d0\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1\5:\36\2\u00d1\67\3\2\2"+
		"\2\u00d2\u00d3\7\21\2\2\u00d39\3\2\2\2\u00d4\u00d5\5> \2\u00d5\u00d6\5"+
		"<\37\2\u00d6\u00d8\3\2\2\2\u00d7\u00d4\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00d9\3\2"+
		"\2\2\u00dc\u00dd\5> \2\u00dd;\3\2\2\2\u00de\u00df\7\22\2\2\u00df=\3\2"+
		"\2\2\u00e0\u00e1\5B\"\2\u00e1\u00e2\5@!\2\u00e2\u00e4\3\2\2\2\u00e3\u00e0"+
		"\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\5B\"\2\u00e6"+
		"?\3\2\2\2\u00e7\u00e8\7*\2\2\u00e8A\3\2\2\2\u00e9\u00ed\5D#\2\u00ea\u00ed"+
		"\5H%\2\u00eb\u00ed\5L\'\2\u00ec\u00e9\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec"+
		"\u00eb\3\2\2\2\u00edC\3\2\2\2\u00ee\u00ef\5L\'\2\u00ef\u00f0\5F$\2\u00f0"+
		"\u00f1\5L\'\2\u00f1E\3\2\2\2\u00f2\u00f3\7\30\2\2\u00f3G\3\2\2\2\u00f4"+
		"\u00f5\5L\'\2\u00f5\u00f6\5J&\2\u00f6\u00f7\5L\'\2\u00f7I\3\2\2\2\u00f8"+
		"\u00f9\7\31\2\2\u00f9K\3\2\2\2\u00fa\u0100\5N(\2\u00fb\u0100\5P)\2\u00fc"+
		"\u0100\5R*\2\u00fd\u0100\5T+\2\u00fe\u0100\5^\60\2\u00ff\u00fa\3\2\2\2"+
		"\u00ff\u00fb\3\2\2\2\u00ff\u00fc\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u00fe"+
		"\3\2\2\2\u0100M\3\2\2\2\u0101\u0102\5^\60\2\u0102\u0103\5V,\2\u0103\u0104"+
		"\5^\60\2\u0104O\3\2\2\2\u0105\u0106\5^\60\2\u0106\u0107\5X-\2\u0107\u0108"+
		"\5^\60\2\u0108Q\3\2\2\2\u0109\u010a\5^\60\2\u010a\u010b\5\\/\2\u010b\u010c"+
		"\5^\60\2\u010cS\3\2\2\2\u010d\u010e\5^\60\2\u010e\u010f\5Z.\2\u010f\u0110"+
		"\5^\60\2\u0110U\3\2\2\2\u0111\u0112\7\26\2\2\u0112W\3\2\2\2\u0113\u0114"+
		"\7\27\2\2\u0114Y\3\2\2\2\u0115\u0116\7\25\2\2\u0116[\3\2\2\2\u0117\u0118"+
		"\7\24\2\2\u0118]\3\2\2\2\u0119\u011b\5`\61\2\u011a\u0119\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\5b\62\2\u011d_\3\2\2\2"+
		"\u011e\u011f\7\23\2\2\u011fa\3\2\2\2\u0120\u0122\7\33\2\2\u0121\u0120"+
		"\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\5\6\4\2\u0124"+
		"c\3\2\2\2\u0125\u012b\5\20\t\2\u0126\u0127\5h\65\2\u0127\u0128\5\22\n"+
		"\2\u0128\u012a\3\2\2\2\u0129\u0126\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129"+
		"\3\2\2\2\u012b\u012c\3\2\2\2\u012ce\3\2\2\2\u012d\u012b\3\2\2\2\u012e"+
		"\u012f\5\22\n\2\u012f\u0130\5h\65\2\u0130\u0132\3\2\2\2\u0131\u012e\3"+
		"\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"\u0136\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0137\5\20\t\2\u0137g\3\2\2\2"+
		"\u0138\u0139\7)\2\2\u0139i\3\2\2\2\27npw\u0080\u0085\u008b\u008d\u0098"+
		"\u00ad\u00b0\u00b5\u00c2\u00cd\u00d9\u00e3\u00ec\u00ff\u011a\u0121\u012b"+
		"\u0133";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}