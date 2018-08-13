// Generated from fr/insset/jeanluc/ete/sbvr/SbvrParser.g4 by ANTLR 4.5.3
package fr.insset.jeanluc.ete.sbvr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SbvrParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OF=1, A_GIVEN=2, THE=3, A=4, OTHER=5, ANOTHER=6, THAT=7, THIS=8, THESE=9, 
		WHO=10, WHICH=11, WHERE=12, WHOSE=13, ABRACADABRA=14, IT_IS_OBLIGATORY_THAT=15, 
		IT_IS_PROHIBITED_THAT=16, IT_IS_NECESSARY_THAT=17, IT_IS_IMPOSSIBLE_THAT=18, 
		IT_IS_POSSIBLE_THAT=19, IT_IS_PERMITTED_THAT=20, MUST_NOT=21, MUST=22, 
		NEED_NOT=23, ALWAYS=24, NEVER=25, CAN=26, MAY=27, ONLY_IF=28, Self=29, 
		IntegerLiteral=30, FloatingPointLiteral=31, BooleanLiteral=32, DateLiteral=33, 
		CharacterLiteral=34, StringLiteral=35, NullLiteral=36, LPAREN=37, RPAREN=38, 
		START_EXP=39, LBRACE=40, RBRACE=41, LBRACK=42, RBRACK=43, SEMI=44, COMMA=45, 
		DOT=46, ARROW=47, LEFT_ARROW=48, PIPE=49, GT=50, LT=51, NOT=52, TILDE=53, 
		QUESTION=54, COLON=55, DOUBLE_COLON=56, EQUAL=57, LE=58, GE=59, NOTEQUAL=60, 
		AND=61, OR=62, XOR=63, ADD=64, SUB=65, MUL=66, DIV=67, MOD_PERCENT=68, 
		CARET=69, MOD=70, SEQUENCE=71, BAG=72, SET=73, ORDERED=74, OCL_IS_NEW=75, 
		OCL_IS_TYPE_OF=76, OCL_IS_KIND_OF=77, OCL_AS_TYPE=78, Identifier=79, ATPRE=80, 
		ELLIPSIS=81, WS=82, COMMENT=83, LINE_COMMENT=84;
	public static final int
		RULE_genericExpression = 0, RULE_sbvrExpression = 1, RULE_navOperator = 2, 
		RULE_keyword = 3, RULE_noungroup = 4, RULE_determiner = 5, RULE_file = 6, 
		RULE_gelExpression = 7, RULE_xorExpression = 8, RULE_orExpression = 9, 
		RULE_andExpression = 10, RULE_notOrNotNotExpression = 11, RULE_notExpression = 12, 
		RULE_affirmativeExpression = 13, RULE_greaterThanExpression = 14, RULE_greaterOrEqualExpression = 15, 
		RULE_lessThanExpression = 16, RULE_lessOrEqualExpression = 17, RULE_compareExpression = 18, 
		RULE_equalExpression = 19, RULE_differentExpression = 20, RULE_addOrSubExpression = 21, 
		RULE_addExpression = 22, RULE_subExpression = 23, RULE_multOrDivExpression = 24, 
		RULE_multExpression = 25, RULE_divExpression = 26, RULE_modExpression = 27, 
		RULE_operand = 28, RULE_parenthesisExpression = 29, RULE_navExpression = 30, 
		RULE_finalStep = 31, RULE_oclIsNew = 32, RULE_oclIsTypeOf = 33, RULE_oclIsKindOf = 34, 
		RULE_primitive = 35, RULE_attributeNavExpression = 36, RULE_atPreExpression = 37, 
		RULE_asTypeExpression = 38, RULE_methodNavExpression = 39, RULE_collectionMethodNavExpression = 40, 
		RULE_variableOrMember = 41, RULE_variableOrMemberAtPre = 42, RULE_functionCall = 43, 
		RULE_variableDeclarationExpression = 44, RULE_typeExpression = 45, RULE_atomicTypeExpression = 46, 
		RULE_sequenceTypeExpression = 47, RULE_bagTypeExpression = 48, RULE_setTypeExpression = 49, 
		RULE_orderedSetTypeExpression = 50, RULE_oppExpression = 51, RULE_selfExpression = 52, 
		RULE_variableReference = 53, RULE_parameterList = 54, RULE_literal = 55, 
		RULE_identifier = 56, RULE_integerLiteral = 57, RULE_floatingPointLiteral = 58, 
		RULE_booleanLiteral = 59, RULE_dateLiteral = 60, RULE_characterLiteral = 61, 
		RULE_stringLiteral = 62, RULE_nullLiteral = 63;
	public static final String[] ruleNames = {
		"genericExpression", "sbvrExpression", "navOperator", "keyword", "noungroup", 
		"determiner", "file", "gelExpression", "xorExpression", "orExpression", 
		"andExpression", "notOrNotNotExpression", "notExpression", "affirmativeExpression", 
		"greaterThanExpression", "greaterOrEqualExpression", "lessThanExpression", 
		"lessOrEqualExpression", "compareExpression", "equalExpression", "differentExpression", 
		"addOrSubExpression", "addExpression", "subExpression", "multOrDivExpression", 
		"multExpression", "divExpression", "modExpression", "operand", "parenthesisExpression", 
		"navExpression", "finalStep", "oclIsNew", "oclIsTypeOf", "oclIsKindOf", 
		"primitive", "attributeNavExpression", "atPreExpression", "asTypeExpression", 
		"methodNavExpression", "collectionMethodNavExpression", "variableOrMember", 
		"variableOrMemberAtPre", "functionCall", "variableDeclarationExpression", 
		"typeExpression", "atomicTypeExpression", "sequenceTypeExpression", "bagTypeExpression", 
		"setTypeExpression", "orderedSetTypeExpression", "oppExpression", "selfExpression", 
		"variableReference", "parameterList", "literal", "identifier", "integerLiteral", 
		"floatingPointLiteral", "booleanLiteral", "dateLiteral", "characterLiteral", 
		"stringLiteral", "nullLiteral"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'of'", null, "'the'", null, "'other'", "'another'", "'that'", "'this'", 
		"'these'", "'who'", "'which'", "'where'", "'whose'", "'abracadabra'", 
		null, null, null, null, null, null, null, "'must'", null, "'always'", 
		"'never'", "'can'", "'may'", null, "'self'", null, null, null, null, null, 
		null, "'null'", "'('", "')'", "'#{'", "'{'", "'}'", "'['", "']'", "';'", 
		"','", "'.'", "'->'", "'<-'", "'|'", "'>'", "'<'", "'not'", "'~'", "'?'", 
		"':'", "'::'", "'='", "'<='", "'>='", "'<>'", "'and'", "'or'", "'xor'", 
		"'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'mod'", "'sequence'", "'bag'", 
		"'set'", "'ordered'", null, null, null, null, null, "'@pre'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "OF", "A_GIVEN", "THE", "A", "OTHER", "ANOTHER", "THAT", "THIS", 
		"THESE", "WHO", "WHICH", "WHERE", "WHOSE", "ABRACADABRA", "IT_IS_OBLIGATORY_THAT", 
		"IT_IS_PROHIBITED_THAT", "IT_IS_NECESSARY_THAT", "IT_IS_IMPOSSIBLE_THAT", 
		"IT_IS_POSSIBLE_THAT", "IT_IS_PERMITTED_THAT", "MUST_NOT", "MUST", "NEED_NOT", 
		"ALWAYS", "NEVER", "CAN", "MAY", "ONLY_IF", "Self", "IntegerLiteral", 
		"FloatingPointLiteral", "BooleanLiteral", "DateLiteral", "CharacterLiteral", 
		"StringLiteral", "NullLiteral", "LPAREN", "RPAREN", "START_EXP", "LBRACE", 
		"RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ARROW", "LEFT_ARROW", 
		"PIPE", "GT", "LT", "NOT", "TILDE", "QUESTION", "COLON", "DOUBLE_COLON", 
		"EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "XOR", "ADD", "SUB", "MUL", 
		"DIV", "MOD_PERCENT", "CARET", "MOD", "SEQUENCE", "BAG", "SET", "ORDERED", 
		"OCL_IS_NEW", "OCL_IS_TYPE_OF", "OCL_IS_KIND_OF", "OCL_AS_TYPE", "Identifier", 
		"ATPRE", "ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "SbvrParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SbvrParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GenericExpressionContext extends ParserRuleContext {
		public GelExpressionContext gelExpression() {
			return getRuleContext(GelExpressionContext.class,0);
		}
		public SbvrExpressionContext sbvrExpression() {
			return getRuleContext(SbvrExpressionContext.class,0);
		}
		public GenericExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterGenericExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitGenericExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitGenericExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericExpressionContext genericExpression() throws RecognitionException {
		GenericExpressionContext _localctx = new GenericExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_genericExpression);
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				gelExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				sbvrExpression();
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

	public static class SbvrExpressionContext extends ParserRuleContext {
		public List<KeywordContext> keyword() {
			return getRuleContexts(KeywordContext.class);
		}
		public KeywordContext keyword(int i) {
			return getRuleContext(KeywordContext.class,i);
		}
		public List<NoungroupContext> noungroup() {
			return getRuleContexts(NoungroupContext.class);
		}
		public NoungroupContext noungroup(int i) {
			return getRuleContext(NoungroupContext.class,i);
		}
		public List<NavExpressionContext> navExpression() {
			return getRuleContexts(NavExpressionContext.class);
		}
		public NavExpressionContext navExpression(int i) {
			return getRuleContext(NavExpressionContext.class,i);
		}
		public SbvrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sbvrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterSbvrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitSbvrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitSbvrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SbvrExpressionContext sbvrExpression() throws RecognitionException {
		SbvrExpressionContext _localctx = new SbvrExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sbvrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(135);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(132);
					keyword();
					}
					break;
				case 2:
					{
					setState(133);
					noungroup();
					}
					break;
				case 3:
					{
					setState(134);
					navExpression();
					}
					break;
				}
				}
				setState(137); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THE) | (1L << A) | (1L << ABRACADABRA) | (1L << Self))) != 0) || _la==Identifier );
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
		public TerminalNode OF() { return getToken(SbvrParser.OF, 0); }
		public NavOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_navOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterNavOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitNavOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitNavOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NavOperatorContext navOperator() throws RecognitionException {
		NavOperatorContext _localctx = new NavOperatorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_navOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
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

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode ABRACADABRA() { return getToken(SbvrParser.ABRACADABRA, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(ABRACADABRA);
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

	public static class NoungroupContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DeterminerContext determiner() {
			return getRuleContext(DeterminerContext.class,0);
		}
		public NoungroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noungroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterNoungroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitNoungroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitNoungroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoungroupContext noungroup() throws RecognitionException {
		NoungroupContext _localctx = new NoungroupContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_noungroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_la = _input.LA(1);
			if (_la==THE || _la==A) {
				{
				setState(143);
				determiner();
				}
			}

			setState(146);
			identifier();
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
		public TerminalNode THE() { return getToken(SbvrParser.THE, 0); }
		public TerminalNode A() { return getToken(SbvrParser.A, 0); }
		public DeterminerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_determiner; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterDeterminer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitDeterminer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitDeterminer(this);
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
			setState(148);
			_la = _input.LA(1);
			if ( !(_la==THE || _la==A) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class FileContext extends ParserRuleContext {
		public List<GelExpressionContext> gelExpression() {
			return getRuleContexts(GelExpressionContext.class);
		}
		public GelExpressionContext gelExpression(int i) {
			return getRuleContext(GelExpressionContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 29)) & ~0x3f) == 0 && ((1L << (_la - 29)) & ((1L << (Self - 29)) | (1L << (IntegerLiteral - 29)) | (1L << (FloatingPointLiteral - 29)) | (1L << (BooleanLiteral - 29)) | (1L << (DateLiteral - 29)) | (1L << (CharacterLiteral - 29)) | (1L << (StringLiteral - 29)) | (1L << (NullLiteral - 29)) | (1L << (LPAREN - 29)) | (1L << (NOT - 29)) | (1L << (SUB - 29)) | (1L << (Identifier - 29)))) != 0)) {
				{
				{
				setState(150);
				gelExpression();
				}
				}
				setState(155);
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

	public static class GelExpressionContext extends ParserRuleContext {
		public XorExpressionContext xorExpression() {
			return getRuleContext(XorExpressionContext.class,0);
		}
		public GelExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gelExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterGelExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitGelExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitGelExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GelExpressionContext gelExpression() throws RecognitionException {
		GelExpressionContext _localctx = new GelExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_gelExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
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
		public List<TerminalNode> XOR() { return getTokens(SbvrParser.XOR); }
		public TerminalNode XOR(int i) {
			return getToken(SbvrParser.XOR, i);
		}
		public XorExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xorExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterXorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitXorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitXorExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XorExpressionContext xorExpression() throws RecognitionException {
		XorExpressionContext _localctx = new XorExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_xorExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(158);
					orExpression();
					setState(159);
					match(XOR);
					}
					} 
				}
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(166);
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

	public static class OrExpressionContext extends ParserRuleContext {
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(SbvrParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(SbvrParser.OR, i);
		}
		public OrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrExpressionContext orExpression() throws RecognitionException {
		OrExpressionContext _localctx = new OrExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_orExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(168);
					andExpression();
					setState(169);
					match(OR);
					}
					} 
				}
				setState(175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(176);
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

	public static class AndExpressionContext extends ParserRuleContext {
		public List<NotOrNotNotExpressionContext> notOrNotNotExpression() {
			return getRuleContexts(NotOrNotNotExpressionContext.class);
		}
		public NotOrNotNotExpressionContext notOrNotNotExpression(int i) {
			return getRuleContext(NotOrNotNotExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(SbvrParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(SbvrParser.AND, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_andExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(178);
					notOrNotNotExpression();
					setState(179);
					match(AND);
					}
					} 
				}
				setState(185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(186);
			notOrNotNotExpression();
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

	public static class NotOrNotNotExpressionContext extends ParserRuleContext {
		public NotExpressionContext notExpression() {
			return getRuleContext(NotExpressionContext.class,0);
		}
		public AffirmativeExpressionContext affirmativeExpression() {
			return getRuleContext(AffirmativeExpressionContext.class,0);
		}
		public NotOrNotNotExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notOrNotNotExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterNotOrNotNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitNotOrNotNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitNotOrNotNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotOrNotNotExpressionContext notOrNotNotExpression() throws RecognitionException {
		NotOrNotNotExpressionContext _localctx = new NotOrNotNotExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_notOrNotNotExpression);
		try {
			setState(190);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				notExpression();
				}
				break;
			case Self:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case DateLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case SUB:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				affirmativeExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class NotExpressionContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(SbvrParser.NOT, 0); }
		public AffirmativeExpressionContext affirmativeExpression() {
			return getRuleContext(AffirmativeExpressionContext.class,0);
		}
		public NotExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotExpressionContext notExpression() throws RecognitionException {
		NotExpressionContext _localctx = new NotExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_notExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(NOT);
			setState(193);
			affirmativeExpression();
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

	public static class AffirmativeExpressionContext extends ParserRuleContext {
		public GreaterThanExpressionContext greaterThanExpression() {
			return getRuleContext(GreaterThanExpressionContext.class,0);
		}
		public GreaterOrEqualExpressionContext greaterOrEqualExpression() {
			return getRuleContext(GreaterOrEqualExpressionContext.class,0);
		}
		public LessThanExpressionContext lessThanExpression() {
			return getRuleContext(LessThanExpressionContext.class,0);
		}
		public LessOrEqualExpressionContext lessOrEqualExpression() {
			return getRuleContext(LessOrEqualExpressionContext.class,0);
		}
		public CompareExpressionContext compareExpression() {
			return getRuleContext(CompareExpressionContext.class,0);
		}
		public AffirmativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_affirmativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterAffirmativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitAffirmativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitAffirmativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AffirmativeExpressionContext affirmativeExpression() throws RecognitionException {
		AffirmativeExpressionContext _localctx = new AffirmativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_affirmativeExpression);
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				greaterThanExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				greaterOrEqualExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(197);
				lessThanExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(198);
				lessOrEqualExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(199);
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

	public static class GreaterThanExpressionContext extends ParserRuleContext {
		public List<CompareExpressionContext> compareExpression() {
			return getRuleContexts(CompareExpressionContext.class);
		}
		public CompareExpressionContext compareExpression(int i) {
			return getRuleContext(CompareExpressionContext.class,i);
		}
		public TerminalNode GT() { return getToken(SbvrParser.GT, 0); }
		public GreaterThanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greaterThanExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterGreaterThanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitGreaterThanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitGreaterThanExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GreaterThanExpressionContext greaterThanExpression() throws RecognitionException {
		GreaterThanExpressionContext _localctx = new GreaterThanExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_greaterThanExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			compareExpression();
			setState(203);
			match(GT);
			setState(204);
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

	public static class GreaterOrEqualExpressionContext extends ParserRuleContext {
		public List<CompareExpressionContext> compareExpression() {
			return getRuleContexts(CompareExpressionContext.class);
		}
		public CompareExpressionContext compareExpression(int i) {
			return getRuleContext(CompareExpressionContext.class,i);
		}
		public TerminalNode GE() { return getToken(SbvrParser.GE, 0); }
		public GreaterOrEqualExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greaterOrEqualExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterGreaterOrEqualExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitGreaterOrEqualExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitGreaterOrEqualExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GreaterOrEqualExpressionContext greaterOrEqualExpression() throws RecognitionException {
		GreaterOrEqualExpressionContext _localctx = new GreaterOrEqualExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_greaterOrEqualExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			compareExpression();
			setState(207);
			match(GE);
			setState(208);
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

	public static class LessThanExpressionContext extends ParserRuleContext {
		public List<CompareExpressionContext> compareExpression() {
			return getRuleContexts(CompareExpressionContext.class);
		}
		public CompareExpressionContext compareExpression(int i) {
			return getRuleContext(CompareExpressionContext.class,i);
		}
		public TerminalNode LT() { return getToken(SbvrParser.LT, 0); }
		public LessThanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lessThanExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterLessThanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitLessThanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitLessThanExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LessThanExpressionContext lessThanExpression() throws RecognitionException {
		LessThanExpressionContext _localctx = new LessThanExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_lessThanExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			compareExpression();
			setState(211);
			match(LT);
			setState(212);
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

	public static class LessOrEqualExpressionContext extends ParserRuleContext {
		public List<CompareExpressionContext> compareExpression() {
			return getRuleContexts(CompareExpressionContext.class);
		}
		public CompareExpressionContext compareExpression(int i) {
			return getRuleContext(CompareExpressionContext.class,i);
		}
		public TerminalNode LE() { return getToken(SbvrParser.LE, 0); }
		public LessOrEqualExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lessOrEqualExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterLessOrEqualExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitLessOrEqualExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitLessOrEqualExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LessOrEqualExpressionContext lessOrEqualExpression() throws RecognitionException {
		LessOrEqualExpressionContext _localctx = new LessOrEqualExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_lessOrEqualExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			compareExpression();
			setState(215);
			match(LE);
			setState(216);
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

	public static class CompareExpressionContext extends ParserRuleContext {
		public EqualExpressionContext equalExpression() {
			return getRuleContext(EqualExpressionContext.class,0);
		}
		public DifferentExpressionContext differentExpression() {
			return getRuleContext(DifferentExpressionContext.class,0);
		}
		public AddOrSubExpressionContext addOrSubExpression() {
			return getRuleContext(AddOrSubExpressionContext.class,0);
		}
		public CompareExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterCompareExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitCompareExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitCompareExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareExpressionContext compareExpression() throws RecognitionException {
		CompareExpressionContext _localctx = new CompareExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_compareExpression);
		try {
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				equalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				differentExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				addOrSubExpression();
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
		public List<AddOrSubExpressionContext> addOrSubExpression() {
			return getRuleContexts(AddOrSubExpressionContext.class);
		}
		public AddOrSubExpressionContext addOrSubExpression(int i) {
			return getRuleContext(AddOrSubExpressionContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(SbvrParser.EQUAL, 0); }
		public EqualExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterEqualExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitEqualExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitEqualExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualExpressionContext equalExpression() throws RecognitionException {
		EqualExpressionContext _localctx = new EqualExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_equalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			addOrSubExpression();
			setState(224);
			match(EQUAL);
			setState(225);
			addOrSubExpression();
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

	public static class DifferentExpressionContext extends ParserRuleContext {
		public List<AddOrSubExpressionContext> addOrSubExpression() {
			return getRuleContexts(AddOrSubExpressionContext.class);
		}
		public AddOrSubExpressionContext addOrSubExpression(int i) {
			return getRuleContext(AddOrSubExpressionContext.class,i);
		}
		public TerminalNode NOTEQUAL() { return getToken(SbvrParser.NOTEQUAL, 0); }
		public DifferentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_differentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterDifferentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitDifferentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitDifferentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DifferentExpressionContext differentExpression() throws RecognitionException {
		DifferentExpressionContext _localctx = new DifferentExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_differentExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			addOrSubExpression();
			setState(228);
			match(NOTEQUAL);
			setState(229);
			addOrSubExpression();
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

	public static class AddOrSubExpressionContext extends ParserRuleContext {
		public MultOrDivExpressionContext multOrDivExpression() {
			return getRuleContext(MultOrDivExpressionContext.class,0);
		}
		public List<AddExpressionContext> addExpression() {
			return getRuleContexts(AddExpressionContext.class);
		}
		public AddExpressionContext addExpression(int i) {
			return getRuleContext(AddExpressionContext.class,i);
		}
		public List<SubExpressionContext> subExpression() {
			return getRuleContexts(SubExpressionContext.class);
		}
		public SubExpressionContext subExpression(int i) {
			return getRuleContext(SubExpressionContext.class,i);
		}
		public AddOrSubExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addOrSubExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterAddOrSubExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitAddOrSubExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitAddOrSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddOrSubExpressionContext addOrSubExpression() throws RecognitionException {
		AddOrSubExpressionContext _localctx = new AddOrSubExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_addOrSubExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			multOrDivExpression();
			setState(236);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(234);
					switch (_input.LA(1)) {
					case ADD:
						{
						setState(232);
						addExpression();
						}
						break;
					case SUB:
						{
						setState(233);
						subExpression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(238);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class AddExpressionContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SbvrParser.ADD, 0); }
		public MultOrDivExpressionContext multOrDivExpression() {
			return getRuleContext(MultOrDivExpressionContext.class,0);
		}
		public AddExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterAddExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitAddExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitAddExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddExpressionContext addExpression() throws RecognitionException {
		AddExpressionContext _localctx = new AddExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_addExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(ADD);
			setState(240);
			multOrDivExpression();
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

	public static class SubExpressionContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(SbvrParser.SUB, 0); }
		public MultOrDivExpressionContext multOrDivExpression() {
			return getRuleContext(MultOrDivExpressionContext.class,0);
		}
		public SubExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterSubExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitSubExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubExpressionContext subExpression() throws RecognitionException {
		SubExpressionContext _localctx = new SubExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_subExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(SUB);
			setState(243);
			multOrDivExpression();
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

	public static class MultOrDivExpressionContext extends ParserRuleContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public List<MultExpressionContext> multExpression() {
			return getRuleContexts(MultExpressionContext.class);
		}
		public MultExpressionContext multExpression(int i) {
			return getRuleContext(MultExpressionContext.class,i);
		}
		public List<DivExpressionContext> divExpression() {
			return getRuleContexts(DivExpressionContext.class);
		}
		public DivExpressionContext divExpression(int i) {
			return getRuleContext(DivExpressionContext.class,i);
		}
		public List<ModExpressionContext> modExpression() {
			return getRuleContexts(ModExpressionContext.class);
		}
		public ModExpressionContext modExpression(int i) {
			return getRuleContext(ModExpressionContext.class,i);
		}
		public MultOrDivExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multOrDivExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterMultOrDivExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitMultOrDivExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitMultOrDivExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultOrDivExpressionContext multOrDivExpression() throws RecognitionException {
		MultOrDivExpressionContext _localctx = new MultOrDivExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_multOrDivExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			operand();
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (MUL - 66)) | (1L << (DIV - 66)) | (1L << (MOD - 66)))) != 0)) {
				{
				setState(249);
				switch (_input.LA(1)) {
				case MUL:
					{
					setState(246);
					multExpression();
					}
					break;
				case DIV:
					{
					setState(247);
					divExpression();
					}
					break;
				case MOD:
					{
					setState(248);
					modExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(253);
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

	public static class MultExpressionContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(SbvrParser.MUL, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public MultExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterMultExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitMultExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitMultExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultExpressionContext multExpression() throws RecognitionException {
		MultExpressionContext _localctx = new MultExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_multExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(MUL);
			setState(255);
			operand();
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

	public static class DivExpressionContext extends ParserRuleContext {
		public TerminalNode DIV() { return getToken(SbvrParser.DIV, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public DivExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterDivExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitDivExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitDivExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivExpressionContext divExpression() throws RecognitionException {
		DivExpressionContext _localctx = new DivExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_divExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(DIV);
			setState(258);
			operand();
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

	public static class ModExpressionContext extends ParserRuleContext {
		public TerminalNode MOD() { return getToken(SbvrParser.MOD, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public ModExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterModExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitModExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitModExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModExpressionContext modExpression() throws RecognitionException {
		ModExpressionContext _localctx = new ModExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_modExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(MOD);
			setState(261);
			operand();
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

	public static class OperandContext extends ParserRuleContext {
		public OppExpressionContext oppExpression() {
			return getRuleContext(OppExpressionContext.class,0);
		}
		public NavExpressionContext navExpression() {
			return getRuleContext(NavExpressionContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ParenthesisExpressionContext parenthesisExpression() {
			return getRuleContext(ParenthesisExpressionContext.class,0);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_operand);
		try {
			setState(267);
			switch (_input.LA(1)) {
			case SUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				oppExpression();
				}
				break;
			case Self:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				navExpression();
				}
				break;
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case DateLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(265);
				literal();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(266);
				parenthesisExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ParenthesisExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(SbvrParser.LPAREN, 0); }
		public GelExpressionContext gelExpression() {
			return getRuleContext(GelExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SbvrParser.RPAREN, 0); }
		public ParenthesisExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesisExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterParenthesisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitParenthesisExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitParenthesisExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParenthesisExpressionContext parenthesisExpression() throws RecognitionException {
		ParenthesisExpressionContext _localctx = new ParenthesisExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_parenthesisExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(LPAREN);
			setState(270);
			gelExpression();
			setState(271);
			match(RPAREN);
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
		public PrimitiveContext primitive() {
			return getRuleContext(PrimitiveContext.class,0);
		}
		public List<AttributeNavExpressionContext> attributeNavExpression() {
			return getRuleContexts(AttributeNavExpressionContext.class);
		}
		public AttributeNavExpressionContext attributeNavExpression(int i) {
			return getRuleContext(AttributeNavExpressionContext.class,i);
		}
		public List<AtPreExpressionContext> atPreExpression() {
			return getRuleContexts(AtPreExpressionContext.class);
		}
		public AtPreExpressionContext atPreExpression(int i) {
			return getRuleContext(AtPreExpressionContext.class,i);
		}
		public List<AsTypeExpressionContext> asTypeExpression() {
			return getRuleContexts(AsTypeExpressionContext.class);
		}
		public AsTypeExpressionContext asTypeExpression(int i) {
			return getRuleContext(AsTypeExpressionContext.class,i);
		}
		public List<MethodNavExpressionContext> methodNavExpression() {
			return getRuleContexts(MethodNavExpressionContext.class);
		}
		public MethodNavExpressionContext methodNavExpression(int i) {
			return getRuleContext(MethodNavExpressionContext.class,i);
		}
		public List<CollectionMethodNavExpressionContext> collectionMethodNavExpression() {
			return getRuleContexts(CollectionMethodNavExpressionContext.class);
		}
		public CollectionMethodNavExpressionContext collectionMethodNavExpression(int i) {
			return getRuleContext(CollectionMethodNavExpressionContext.class,i);
		}
		public FinalStepContext finalStep() {
			return getRuleContext(FinalStepContext.class,0);
		}
		public NavExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_navExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterNavExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitNavExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitNavExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NavExpressionContext navExpression() throws RecognitionException {
		NavExpressionContext _localctx = new NavExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_navExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(273);
			primitive();
			}
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OF) | (1L << DOT) | (1L << ARROW))) != 0) || _la==ATPRE) {
				{
				setState(279);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(274);
					attributeNavExpression();
					}
					break;
				case 2:
					{
					setState(275);
					atPreExpression();
					}
					break;
				case 3:
					{
					setState(276);
					asTypeExpression();
					}
					break;
				case 4:
					{
					setState(277);
					methodNavExpression();
					}
					break;
				case 5:
					{
					setState(278);
					collectionMethodNavExpression();
					}
					break;
				}
				}
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(285);
			_la = _input.LA(1);
			if (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (OCL_IS_NEW - 75)) | (1L << (OCL_IS_TYPE_OF - 75)) | (1L << (OCL_IS_KIND_OF - 75)))) != 0)) {
				{
				setState(284);
				finalStep();
				}
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

	public static class FinalStepContext extends ParserRuleContext {
		public OclIsNewContext oclIsNew() {
			return getRuleContext(OclIsNewContext.class,0);
		}
		public OclIsTypeOfContext oclIsTypeOf() {
			return getRuleContext(OclIsTypeOfContext.class,0);
		}
		public OclIsKindOfContext oclIsKindOf() {
			return getRuleContext(OclIsKindOfContext.class,0);
		}
		public FinalStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finalStep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterFinalStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitFinalStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitFinalStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinalStepContext finalStep() throws RecognitionException {
		FinalStepContext _localctx = new FinalStepContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_finalStep);
		try {
			setState(290);
			switch (_input.LA(1)) {
			case OCL_IS_NEW:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				oclIsNew();
				}
				break;
			case OCL_IS_TYPE_OF:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				oclIsTypeOf();
				}
				break;
			case OCL_IS_KIND_OF:
				enterOuterAlt(_localctx, 3);
				{
				setState(289);
				oclIsKindOf();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class OclIsNewContext extends ParserRuleContext {
		public TerminalNode OCL_IS_NEW() { return getToken(SbvrParser.OCL_IS_NEW, 0); }
		public OclIsNewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oclIsNew; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterOclIsNew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitOclIsNew(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitOclIsNew(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OclIsNewContext oclIsNew() throws RecognitionException {
		OclIsNewContext _localctx = new OclIsNewContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_oclIsNew);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(OCL_IS_NEW);
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

	public static class OclIsTypeOfContext extends ParserRuleContext {
		public TerminalNode OCL_IS_TYPE_OF() { return getToken(SbvrParser.OCL_IS_TYPE_OF, 0); }
		public TerminalNode LPAREN() { return getToken(SbvrParser.LPAREN, 0); }
		public GelExpressionContext gelExpression() {
			return getRuleContext(GelExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SbvrParser.RPAREN, 0); }
		public OclIsTypeOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oclIsTypeOf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterOclIsTypeOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitOclIsTypeOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitOclIsTypeOf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OclIsTypeOfContext oclIsTypeOf() throws RecognitionException {
		OclIsTypeOfContext _localctx = new OclIsTypeOfContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_oclIsTypeOf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(OCL_IS_TYPE_OF);
			setState(295);
			match(LPAREN);
			setState(296);
			gelExpression();
			setState(297);
			match(RPAREN);
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

	public static class OclIsKindOfContext extends ParserRuleContext {
		public TerminalNode OCL_IS_KIND_OF() { return getToken(SbvrParser.OCL_IS_KIND_OF, 0); }
		public TerminalNode LPAREN() { return getToken(SbvrParser.LPAREN, 0); }
		public GelExpressionContext gelExpression() {
			return getRuleContext(GelExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SbvrParser.RPAREN, 0); }
		public OclIsKindOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oclIsKindOf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterOclIsKindOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitOclIsKindOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitOclIsKindOf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OclIsKindOfContext oclIsKindOf() throws RecognitionException {
		OclIsKindOfContext _localctx = new OclIsKindOfContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_oclIsKindOf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(OCL_IS_KIND_OF);
			setState(300);
			match(LPAREN);
			setState(301);
			gelExpression();
			setState(302);
			match(RPAREN);
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

	public static class PrimitiveContext extends ParserRuleContext {
		public SelfExpressionContext selfExpression() {
			return getRuleContext(SelfExpressionContext.class,0);
		}
		public VariableOrMemberContext variableOrMember() {
			return getRuleContext(VariableOrMemberContext.class,0);
		}
		public VariableOrMemberAtPreContext variableOrMemberAtPre() {
			return getRuleContext(VariableOrMemberAtPreContext.class,0);
		}
		public PrimitiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterPrimitive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitPrimitive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitPrimitive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveContext primitive() throws RecognitionException {
		PrimitiveContext _localctx = new PrimitiveContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_primitive);
		try {
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				selfExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				variableOrMember();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(306);
				variableOrMemberAtPre();
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

	public static class AttributeNavExpressionContext extends ParserRuleContext {
		public NavOperatorContext navOperator() {
			return getRuleContext(NavOperatorContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributeNavExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeNavExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterAttributeNavExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitAttributeNavExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitAttributeNavExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeNavExpressionContext attributeNavExpression() throws RecognitionException {
		AttributeNavExpressionContext _localctx = new AttributeNavExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_attributeNavExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			navOperator();
			setState(310);
			identifier();
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

	public static class AtPreExpressionContext extends ParserRuleContext {
		public TerminalNode ATPRE() { return getToken(SbvrParser.ATPRE, 0); }
		public AtPreExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atPreExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterAtPreExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitAtPreExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitAtPreExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtPreExpressionContext atPreExpression() throws RecognitionException {
		AtPreExpressionContext _localctx = new AtPreExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_atPreExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(ATPRE);
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

	public static class AsTypeExpressionContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(SbvrParser.DOT, 0); }
		public TerminalNode OCL_AS_TYPE() { return getToken(SbvrParser.OCL_AS_TYPE, 0); }
		public TerminalNode LPAREN() { return getToken(SbvrParser.LPAREN, 0); }
		public GelExpressionContext gelExpression() {
			return getRuleContext(GelExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SbvrParser.RPAREN, 0); }
		public AsTypeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asTypeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterAsTypeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitAsTypeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitAsTypeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsTypeExpressionContext asTypeExpression() throws RecognitionException {
		AsTypeExpressionContext _localctx = new AsTypeExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_asTypeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(DOT);
			setState(315);
			match(OCL_AS_TYPE);
			setState(316);
			match(LPAREN);
			setState(317);
			gelExpression();
			setState(318);
			match(RPAREN);
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

	public static class MethodNavExpressionContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(SbvrParser.DOT, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public MethodNavExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodNavExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterMethodNavExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitMethodNavExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitMethodNavExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodNavExpressionContext methodNavExpression() throws RecognitionException {
		MethodNavExpressionContext _localctx = new MethodNavExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_methodNavExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(DOT);
			setState(321);
			functionCall();
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

	public static class CollectionMethodNavExpressionContext extends ParserRuleContext {
		public TerminalNode ARROW() { return getToken(SbvrParser.ARROW, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public CollectionMethodNavExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collectionMethodNavExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterCollectionMethodNavExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitCollectionMethodNavExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitCollectionMethodNavExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectionMethodNavExpressionContext collectionMethodNavExpression() throws RecognitionException {
		CollectionMethodNavExpressionContext _localctx = new CollectionMethodNavExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_collectionMethodNavExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(ARROW);
			setState(324);
			functionCall();
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

	public static class VariableOrMemberContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VariableOrMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableOrMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterVariableOrMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitVariableOrMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitVariableOrMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableOrMemberContext variableOrMember() throws RecognitionException {
		VariableOrMemberContext _localctx = new VariableOrMemberContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_variableOrMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			identifier();
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

	public static class VariableOrMemberAtPreContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ATPRE() { return getToken(SbvrParser.ATPRE, 0); }
		public VariableOrMemberAtPreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableOrMemberAtPre; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterVariableOrMemberAtPre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitVariableOrMemberAtPre(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitVariableOrMemberAtPre(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableOrMemberAtPreContext variableOrMemberAtPre() throws RecognitionException {
		VariableOrMemberAtPreContext _localctx = new VariableOrMemberAtPreContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_variableOrMemberAtPre);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			identifier();
			setState(329);
			match(ATPRE);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(SbvrParser.LPAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SbvrParser.RPAREN, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			identifier();
			setState(332);
			match(LPAREN);
			setState(333);
			parameterList();
			setState(334);
			match(RPAREN);
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

	public static class VariableDeclarationExpressionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SbvrParser.Identifier, 0); }
		public TerminalNode COLON() { return getToken(SbvrParser.COLON, 0); }
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public VariableDeclarationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterVariableDeclarationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitVariableDeclarationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitVariableDeclarationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationExpressionContext variableDeclarationExpression() throws RecognitionException {
		VariableDeclarationExpressionContext _localctx = new VariableDeclarationExpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_variableDeclarationExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(Identifier);
			setState(339);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(337);
				match(COLON);
				setState(338);
				typeExpression();
				}
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

	public static class TypeExpressionContext extends ParserRuleContext {
		public AtomicTypeExpressionContext atomicTypeExpression() {
			return getRuleContext(AtomicTypeExpressionContext.class,0);
		}
		public SequenceTypeExpressionContext sequenceTypeExpression() {
			return getRuleContext(SequenceTypeExpressionContext.class,0);
		}
		public BagTypeExpressionContext bagTypeExpression() {
			return getRuleContext(BagTypeExpressionContext.class,0);
		}
		public SetTypeExpressionContext setTypeExpression() {
			return getRuleContext(SetTypeExpressionContext.class,0);
		}
		public OrderedSetTypeExpressionContext orderedSetTypeExpression() {
			return getRuleContext(OrderedSetTypeExpressionContext.class,0);
		}
		public TypeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterTypeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitTypeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitTypeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeExpressionContext typeExpression() throws RecognitionException {
		TypeExpressionContext _localctx = new TypeExpressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_typeExpression);
		try {
			setState(346);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				atomicTypeExpression();
				}
				break;
			case SEQUENCE:
				enterOuterAlt(_localctx, 2);
				{
				setState(342);
				sequenceTypeExpression();
				}
				break;
			case BAG:
				enterOuterAlt(_localctx, 3);
				{
				setState(343);
				bagTypeExpression();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 4);
				{
				setState(344);
				setTypeExpression();
				}
				break;
			case ORDERED:
				enterOuterAlt(_localctx, 5);
				{
				setState(345);
				orderedSetTypeExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class AtomicTypeExpressionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SbvrParser.Identifier, 0); }
		public AtomicTypeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicTypeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterAtomicTypeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitAtomicTypeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitAtomicTypeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomicTypeExpressionContext atomicTypeExpression() throws RecognitionException {
		AtomicTypeExpressionContext _localctx = new AtomicTypeExpressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_atomicTypeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
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

	public static class SequenceTypeExpressionContext extends ParserRuleContext {
		public TerminalNode SEQUENCE() { return getToken(SbvrParser.SEQUENCE, 0); }
		public TerminalNode LPAREN() { return getToken(SbvrParser.LPAREN, 0); }
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SbvrParser.RPAREN, 0); }
		public SequenceTypeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequenceTypeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterSequenceTypeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitSequenceTypeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitSequenceTypeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequenceTypeExpressionContext sequenceTypeExpression() throws RecognitionException {
		SequenceTypeExpressionContext _localctx = new SequenceTypeExpressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_sequenceTypeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(SEQUENCE);
			setState(351);
			match(LPAREN);
			setState(352);
			typeExpression();
			setState(353);
			match(RPAREN);
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

	public static class BagTypeExpressionContext extends ParserRuleContext {
		public TerminalNode BAG() { return getToken(SbvrParser.BAG, 0); }
		public TerminalNode LPAREN() { return getToken(SbvrParser.LPAREN, 0); }
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SbvrParser.RPAREN, 0); }
		public BagTypeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bagTypeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterBagTypeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitBagTypeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitBagTypeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BagTypeExpressionContext bagTypeExpression() throws RecognitionException {
		BagTypeExpressionContext _localctx = new BagTypeExpressionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_bagTypeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(BAG);
			setState(356);
			match(LPAREN);
			setState(357);
			typeExpression();
			setState(358);
			match(RPAREN);
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

	public static class SetTypeExpressionContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SbvrParser.SET, 0); }
		public TerminalNode LPAREN() { return getToken(SbvrParser.LPAREN, 0); }
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SbvrParser.RPAREN, 0); }
		public SetTypeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setTypeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterSetTypeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitSetTypeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitSetTypeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetTypeExpressionContext setTypeExpression() throws RecognitionException {
		SetTypeExpressionContext _localctx = new SetTypeExpressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_setTypeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(SET);
			setState(361);
			match(LPAREN);
			setState(362);
			typeExpression();
			setState(363);
			match(RPAREN);
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

	public static class OrderedSetTypeExpressionContext extends ParserRuleContext {
		public TerminalNode ORDERED() { return getToken(SbvrParser.ORDERED, 0); }
		public TerminalNode SET() { return getToken(SbvrParser.SET, 0); }
		public TerminalNode LPAREN() { return getToken(SbvrParser.LPAREN, 0); }
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SbvrParser.RPAREN, 0); }
		public OrderedSetTypeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedSetTypeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterOrderedSetTypeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitOrderedSetTypeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitOrderedSetTypeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderedSetTypeExpressionContext orderedSetTypeExpression() throws RecognitionException {
		OrderedSetTypeExpressionContext _localctx = new OrderedSetTypeExpressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_orderedSetTypeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(ORDERED);
			setState(366);
			match(SET);
			setState(367);
			match(LPAREN);
			setState(368);
			typeExpression();
			setState(369);
			match(RPAREN);
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
		public TerminalNode SUB() { return getToken(SbvrParser.SUB, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public OppExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oppExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterOppExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitOppExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitOppExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OppExpressionContext oppExpression() throws RecognitionException {
		OppExpressionContext _localctx = new OppExpressionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_oppExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(SUB);
			setState(372);
			operand();
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

	public static class SelfExpressionContext extends ParserRuleContext {
		public TerminalNode Self() { return getToken(SbvrParser.Self, 0); }
		public SelfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterSelfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitSelfExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitSelfExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfExpressionContext selfExpression() throws RecognitionException {
		SelfExpressionContext _localctx = new SelfExpressionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_selfExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(Self);
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

	public static class VariableReferenceContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SbvrParser.Identifier, 0); }
		public VariableReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterVariableReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitVariableReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitVariableReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableReferenceContext variableReference() throws RecognitionException {
		VariableReferenceContext _localctx = new VariableReferenceContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_variableReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
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

	public static class ParameterListContext extends ParserRuleContext {
		public List<GelExpressionContext> gelExpression() {
			return getRuleContexts(GelExpressionContext.class);
		}
		public GelExpressionContext gelExpression(int i) {
			return getRuleContext(GelExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SbvrParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SbvrParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_parameterList);
		try {
			int _alt;
			setState(388);
			switch (_input.LA(1)) {
			case Self:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case DateLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case NOT:
			case SUB:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(383);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(378);
						gelExpression();
						setState(379);
						match(COMMA);
						}
						} 
					}
					setState(385);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				setState(386);
				gelExpression();
				}
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
				{
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class LiteralContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public FloatingPointLiteralContext floatingPointLiteral() {
			return getRuleContext(FloatingPointLiteralContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public DateLiteralContext dateLiteral() {
			return getRuleContext(DateLiteralContext.class,0);
		}
		public CharacterLiteralContext characterLiteral() {
			return getRuleContext(CharacterLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public NullLiteralContext nullLiteral() {
			return getRuleContext(NullLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_literal);
		try {
			setState(397);
			switch (_input.LA(1)) {
			case IntegerLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				integerLiteral();
				}
				break;
			case FloatingPointLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				floatingPointLiteral();
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(392);
				booleanLiteral();
				}
				break;
			case DateLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(393);
				dateLiteral();
				}
				break;
			case CharacterLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(394);
				characterLiteral();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 6);
				{
				setState(395);
				stringLiteral();
				}
				break;
			case NullLiteral:
				enterOuterAlt(_localctx, 7);
				{
				setState(396);
				nullLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SbvrParser.Identifier, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
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

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(SbvrParser.IntegerLiteral, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_integerLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(IntegerLiteral);
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

	public static class FloatingPointLiteralContext extends ParserRuleContext {
		public TerminalNode FloatingPointLiteral() { return getToken(SbvrParser.FloatingPointLiteral, 0); }
		public FloatingPointLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingPointLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterFloatingPointLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitFloatingPointLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitFloatingPointLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatingPointLiteralContext floatingPointLiteral() throws RecognitionException {
		FloatingPointLiteralContext _localctx = new FloatingPointLiteralContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_floatingPointLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(FloatingPointLiteral);
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

	public static class BooleanLiteralContext extends ParserRuleContext {
		public TerminalNode BooleanLiteral() { return getToken(SbvrParser.BooleanLiteral, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_booleanLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(BooleanLiteral);
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

	public static class DateLiteralContext extends ParserRuleContext {
		public TerminalNode DateLiteral() { return getToken(SbvrParser.DateLiteral, 0); }
		public DateLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterDateLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitDateLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitDateLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateLiteralContext dateLiteral() throws RecognitionException {
		DateLiteralContext _localctx = new DateLiteralContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_dateLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(DateLiteral);
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

	public static class CharacterLiteralContext extends ParserRuleContext {
		public TerminalNode CharacterLiteral() { return getToken(SbvrParser.CharacterLiteral, 0); }
		public CharacterLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterCharacterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitCharacterLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitCharacterLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterLiteralContext characterLiteral() throws RecognitionException {
		CharacterLiteralContext _localctx = new CharacterLiteralContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_characterLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(CharacterLiteral);
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

	public static class StringLiteralContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(SbvrParser.StringLiteral, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(StringLiteral);
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

	public static class NullLiteralContext extends ParserRuleContext {
		public TerminalNode NullLiteral() { return getToken(SbvrParser.NullLiteral, 0); }
		public NullLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullLiteralContext nullLiteral() throws RecognitionException {
		NullLiteralContext _localctx = new NullLiteralContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_nullLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(NullLiteral);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3V\u01a2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\3\2\3\2\5\2\u0085\n\2\3\3\3\3\3\3\6\3\u008a\n"+
		"\3\r\3\16\3\u008b\3\4\3\4\3\5\3\5\3\6\5\6\u0093\n\6\3\6\3\6\3\7\3\7\3"+
		"\b\7\b\u009a\n\b\f\b\16\b\u009d\13\b\3\t\3\t\3\n\3\n\3\n\7\n\u00a4\n\n"+
		"\f\n\16\n\u00a7\13\n\3\n\3\n\3\13\3\13\3\13\7\13\u00ae\n\13\f\13\16\13"+
		"\u00b1\13\13\3\13\3\13\3\f\3\f\3\f\7\f\u00b8\n\f\f\f\16\f\u00bb\13\f\3"+
		"\f\3\f\3\r\3\r\5\r\u00c1\n\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5"+
		"\17\u00cb\n\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\5\24\u00e0\n\24\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\7\27\u00ed\n\27\f\27\16\27\u00f0"+
		"\13\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\7\32\u00fc\n"+
		"\32\f\32\16\32\u00ff\13\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\5\36\u010e\n\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3 \7 \u011a\n \f \16 \u011d\13 \3 \5 \u0120\n \3!\3!\3!\5!\u0125\n!"+
		"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\5%\u0136\n%\3&\3&\3&\3"+
		"\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3,\3,\3,\3-\3-\3-\3-"+
		"\3-\3.\3.\3.\5.\u0156\n.\3/\3/\3/\3/\3/\5/\u015d\n/\3\60\3\60\3\61\3\61"+
		"\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\67\3\67\38\38\38"+
		"\78\u0180\n8\f8\168\u0183\138\38\38\58\u0187\n8\39\39\39\39\39\39\39\5"+
		"9\u0190\n9\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3A\2\2B\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RTVXZ\\^`bdfhjlnprtvxz|~\u0080\2\3\3\2\5\6\u0190\2\u0084\3\2\2\2\4\u0089"+
		"\3\2\2\2\6\u008d\3\2\2\2\b\u008f\3\2\2\2\n\u0092\3\2\2\2\f\u0096\3\2\2"+
		"\2\16\u009b\3\2\2\2\20\u009e\3\2\2\2\22\u00a5\3\2\2\2\24\u00af\3\2\2\2"+
		"\26\u00b9\3\2\2\2\30\u00c0\3\2\2\2\32\u00c2\3\2\2\2\34\u00ca\3\2\2\2\36"+
		"\u00cc\3\2\2\2 \u00d0\3\2\2\2\"\u00d4\3\2\2\2$\u00d8\3\2\2\2&\u00df\3"+
		"\2\2\2(\u00e1\3\2\2\2*\u00e5\3\2\2\2,\u00e9\3\2\2\2.\u00f1\3\2\2\2\60"+
		"\u00f4\3\2\2\2\62\u00f7\3\2\2\2\64\u0100\3\2\2\2\66\u0103\3\2\2\28\u0106"+
		"\3\2\2\2:\u010d\3\2\2\2<\u010f\3\2\2\2>\u0113\3\2\2\2@\u0124\3\2\2\2B"+
		"\u0126\3\2\2\2D\u0128\3\2\2\2F\u012d\3\2\2\2H\u0135\3\2\2\2J\u0137\3\2"+
		"\2\2L\u013a\3\2\2\2N\u013c\3\2\2\2P\u0142\3\2\2\2R\u0145\3\2\2\2T\u0148"+
		"\3\2\2\2V\u014a\3\2\2\2X\u014d\3\2\2\2Z\u0152\3\2\2\2\\\u015c\3\2\2\2"+
		"^\u015e\3\2\2\2`\u0160\3\2\2\2b\u0165\3\2\2\2d\u016a\3\2\2\2f\u016f\3"+
		"\2\2\2h\u0175\3\2\2\2j\u0178\3\2\2\2l\u017a\3\2\2\2n\u0186\3\2\2\2p\u018f"+
		"\3\2\2\2r\u0191\3\2\2\2t\u0193\3\2\2\2v\u0195\3\2\2\2x\u0197\3\2\2\2z"+
		"\u0199\3\2\2\2|\u019b\3\2\2\2~\u019d\3\2\2\2\u0080\u019f\3\2\2\2\u0082"+
		"\u0085\5\20\t\2\u0083\u0085\5\4\3\2\u0084\u0082\3\2\2\2\u0084\u0083\3"+
		"\2\2\2\u0085\3\3\2\2\2\u0086\u008a\5\b\5\2\u0087\u008a\5\n\6\2\u0088\u008a"+
		"\5> \2\u0089\u0086\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\5\3\2\2\2"+
		"\u008d\u008e\7\3\2\2\u008e\7\3\2\2\2\u008f\u0090\7\20\2\2\u0090\t\3\2"+
		"\2\2\u0091\u0093\5\f\7\2\u0092\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0095\5r:\2\u0095\13\3\2\2\2\u0096\u0097\t\2\2\2"+
		"\u0097\r\3\2\2\2\u0098\u009a\5\20\t\2\u0099\u0098\3\2\2\2\u009a\u009d"+
		"\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\17\3\2\2\2\u009d"+
		"\u009b\3\2\2\2\u009e\u009f\5\22\n\2\u009f\21\3\2\2\2\u00a0\u00a1\5\24"+
		"\13\2\u00a1\u00a2\7A\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a0\3\2\2\2\u00a4"+
		"\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2"+
		"\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\5\24\13\2\u00a9\23\3\2\2\2\u00aa"+
		"\u00ab\5\26\f\2\u00ab\u00ac\7@\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00aa\3\2"+
		"\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\5\26\f\2\u00b3\25\3\2\2"+
		"\2\u00b4\u00b5\5\30\r\2\u00b5\u00b6\7?\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b4"+
		"\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\5\30\r\2\u00bd\27\3\2\2"+
		"\2\u00be\u00c1\5\32\16\2\u00bf\u00c1\5\34\17\2\u00c0\u00be\3\2\2\2\u00c0"+
		"\u00bf\3\2\2\2\u00c1\31\3\2\2\2\u00c2\u00c3\7\66\2\2\u00c3\u00c4\5\34"+
		"\17\2\u00c4\33\3\2\2\2\u00c5\u00cb\5\36\20\2\u00c6\u00cb\5 \21\2\u00c7"+
		"\u00cb\5\"\22\2\u00c8\u00cb\5$\23\2\u00c9\u00cb\5&\24\2\u00ca\u00c5\3"+
		"\2\2\2\u00ca\u00c6\3\2\2\2\u00ca\u00c7\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca"+
		"\u00c9\3\2\2\2\u00cb\35\3\2\2\2\u00cc\u00cd\5&\24\2\u00cd\u00ce\7\64\2"+
		"\2\u00ce\u00cf\5&\24\2\u00cf\37\3\2\2\2\u00d0\u00d1\5&\24\2\u00d1\u00d2"+
		"\7=\2\2\u00d2\u00d3\5&\24\2\u00d3!\3\2\2\2\u00d4\u00d5\5&\24\2\u00d5\u00d6"+
		"\7\65\2\2\u00d6\u00d7\5&\24\2\u00d7#\3\2\2\2\u00d8\u00d9\5&\24\2\u00d9"+
		"\u00da\7<\2\2\u00da\u00db\5&\24\2\u00db%\3\2\2\2\u00dc\u00e0\5(\25\2\u00dd"+
		"\u00e0\5*\26\2\u00de\u00e0\5,\27\2\u00df\u00dc\3\2\2\2\u00df\u00dd\3\2"+
		"\2\2\u00df\u00de\3\2\2\2\u00e0\'\3\2\2\2\u00e1\u00e2\5,\27\2\u00e2\u00e3"+
		"\7;\2\2\u00e3\u00e4\5,\27\2\u00e4)\3\2\2\2\u00e5\u00e6\5,\27\2\u00e6\u00e7"+
		"\7>\2\2\u00e7\u00e8\5,\27\2\u00e8+\3\2\2\2\u00e9\u00ee\5\62\32\2\u00ea"+
		"\u00ed\5.\30\2\u00eb\u00ed\5\60\31\2\u00ec\u00ea\3\2\2\2\u00ec\u00eb\3"+
		"\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"-\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f2\7B\2\2\u00f2\u00f3\5\62\32\2"+
		"\u00f3/\3\2\2\2\u00f4\u00f5\7C\2\2\u00f5\u00f6\5\62\32\2\u00f6\61\3\2"+
		"\2\2\u00f7\u00fd\5:\36\2\u00f8\u00fc\5\64\33\2\u00f9\u00fc\5\66\34\2\u00fa"+
		"\u00fc\58\35\2\u00fb\u00f8\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fa\3\2"+
		"\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\63\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0101\7D\2\2\u0101\u0102\5:\36\2"+
		"\u0102\65\3\2\2\2\u0103\u0104\7E\2\2\u0104\u0105\5:\36\2\u0105\67\3\2"+
		"\2\2\u0106\u0107\7H\2\2\u0107\u0108\5:\36\2\u01089\3\2\2\2\u0109\u010e"+
		"\5h\65\2\u010a\u010e\5> \2\u010b\u010e\5p9\2\u010c\u010e\5<\37\2\u010d"+
		"\u0109\3\2\2\2\u010d\u010a\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010c\3\2"+
		"\2\2\u010e;\3\2\2\2\u010f\u0110\7\'\2\2\u0110\u0111\5\20\t\2\u0111\u0112"+
		"\7(\2\2\u0112=\3\2\2\2\u0113\u011b\5H%\2\u0114\u011a\5J&\2\u0115\u011a"+
		"\5L\'\2\u0116\u011a\5N(\2\u0117\u011a\5P)\2\u0118\u011a\5R*\2\u0119\u0114"+
		"\3\2\2\2\u0119\u0115\3\2\2\2\u0119\u0116\3\2\2\2\u0119\u0117\3\2\2\2\u0119"+
		"\u0118\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2"+
		"\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u0120\5@!\2\u011f\u011e"+
		"\3\2\2\2\u011f\u0120\3\2\2\2\u0120?\3\2\2\2\u0121\u0125\5B\"\2\u0122\u0125"+
		"\5D#\2\u0123\u0125\5F$\2\u0124\u0121\3\2\2\2\u0124\u0122\3\2\2\2\u0124"+
		"\u0123\3\2\2\2\u0125A\3\2\2\2\u0126\u0127\7M\2\2\u0127C\3\2\2\2\u0128"+
		"\u0129\7N\2\2\u0129\u012a\7\'\2\2\u012a\u012b\5\20\t\2\u012b\u012c\7("+
		"\2\2\u012cE\3\2\2\2\u012d\u012e\7O\2\2\u012e\u012f\7\'\2\2\u012f\u0130"+
		"\5\20\t\2\u0130\u0131\7(\2\2\u0131G\3\2\2\2\u0132\u0136\5j\66\2\u0133"+
		"\u0136\5T+\2\u0134\u0136\5V,\2\u0135\u0132\3\2\2\2\u0135\u0133\3\2\2\2"+
		"\u0135\u0134\3\2\2\2\u0136I\3\2\2\2\u0137\u0138\5\6\4\2\u0138\u0139\5"+
		"r:\2\u0139K\3\2\2\2\u013a\u013b\7R\2\2\u013bM\3\2\2\2\u013c\u013d\7\60"+
		"\2\2\u013d\u013e\7P\2\2\u013e\u013f\7\'\2\2\u013f\u0140\5\20\t\2\u0140"+
		"\u0141\7(\2\2\u0141O\3\2\2\2\u0142\u0143\7\60\2\2\u0143\u0144\5X-\2\u0144"+
		"Q\3\2\2\2\u0145\u0146\7\61\2\2\u0146\u0147\5X-\2\u0147S\3\2\2\2\u0148"+
		"\u0149\5r:\2\u0149U\3\2\2\2\u014a\u014b\5r:\2\u014b\u014c\7R\2\2\u014c"+
		"W\3\2\2\2\u014d\u014e\5r:\2\u014e\u014f\7\'\2\2\u014f\u0150\5n8\2\u0150"+
		"\u0151\7(\2\2\u0151Y\3\2\2\2\u0152\u0155\7Q\2\2\u0153\u0154\79\2\2\u0154"+
		"\u0156\5\\/\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156[\3\2\2\2\u0157"+
		"\u015d\5^\60\2\u0158\u015d\5`\61\2\u0159\u015d\5b\62\2\u015a\u015d\5d"+
		"\63\2\u015b\u015d\5f\64\2\u015c\u0157\3\2\2\2\u015c\u0158\3\2\2\2\u015c"+
		"\u0159\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015b\3\2\2\2\u015d]\3\2\2\2"+
		"\u015e\u015f\7Q\2\2\u015f_\3\2\2\2\u0160\u0161\7I\2\2\u0161\u0162\7\'"+
		"\2\2\u0162\u0163\5\\/\2\u0163\u0164\7(\2\2\u0164a\3\2\2\2\u0165\u0166"+
		"\7J\2\2\u0166\u0167\7\'\2\2\u0167\u0168\5\\/\2\u0168\u0169\7(\2\2\u0169"+
		"c\3\2\2\2\u016a\u016b\7K\2\2\u016b\u016c\7\'\2\2\u016c\u016d\5\\/\2\u016d"+
		"\u016e\7(\2\2\u016ee\3\2\2\2\u016f\u0170\7L\2\2\u0170\u0171\7K\2\2\u0171"+
		"\u0172\7\'\2\2\u0172\u0173\5\\/\2\u0173\u0174\7(\2\2\u0174g\3\2\2\2\u0175"+
		"\u0176\7C\2\2\u0176\u0177\5:\36\2\u0177i\3\2\2\2\u0178\u0179\7\37\2\2"+
		"\u0179k\3\2\2\2\u017a\u017b\7Q\2\2\u017bm\3\2\2\2\u017c\u017d\5\20\t\2"+
		"\u017d\u017e\7/\2\2\u017e\u0180\3\2\2\2\u017f\u017c\3\2\2\2\u0180\u0183"+
		"\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0184\3\2\2\2\u0183"+
		"\u0181\3\2\2\2\u0184\u0187\5\20\t\2\u0185\u0187\3\2\2\2\u0186\u0181\3"+
		"\2\2\2\u0186\u0185\3\2\2\2\u0187o\3\2\2\2\u0188\u0190\5t;\2\u0189\u0190"+
		"\5v<\2\u018a\u0190\5x=\2\u018b\u0190\5z>\2\u018c\u0190\5|?\2\u018d\u0190"+
		"\5~@\2\u018e\u0190\5\u0080A\2\u018f\u0188\3\2\2\2\u018f\u0189\3\2\2\2"+
		"\u018f\u018a\3\2\2\2\u018f\u018b\3\2\2\2\u018f\u018c\3\2\2\2\u018f\u018d"+
		"\3\2\2\2\u018f\u018e\3\2\2\2\u0190q\3\2\2\2\u0191\u0192\7Q\2\2\u0192s"+
		"\3\2\2\2\u0193\u0194\7 \2\2\u0194u\3\2\2\2\u0195\u0196\7!\2\2\u0196w\3"+
		"\2\2\2\u0197\u0198\7\"\2\2\u0198y\3\2\2\2\u0199\u019a\7#\2\2\u019a{\3"+
		"\2\2\2\u019b\u019c\7$\2\2\u019c}\3\2\2\2\u019d\u019e\7%\2\2\u019e\177"+
		"\3\2\2\2\u019f\u01a0\7&\2\2\u01a0\u0081\3\2\2\2\34\u0084\u0089\u008b\u0092"+
		"\u009b\u00a5\u00af\u00b9\u00c0\u00ca\u00df\u00ec\u00ee\u00fb\u00fd\u010d"+
		"\u0119\u011b\u011f\u0124\u0135\u0155\u015c\u0181\u0186\u018f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}