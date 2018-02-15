// Generated from fr/insset/jeanluc/ete/gel/GelParser.g4 by ANTLR 4.5.3
package fr.insset.jeanluc.ete.gel;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GelParser extends Parser {
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
		ATPRE=48, ELLIPSIS=49, WS=50, COMMENT=51, LINE_COMMENT=52;
	public static final int
		RULE_gelExpression = 0, RULE_xorExpression = 1, RULE_orExpression = 2, 
		RULE_andExpression = 3, RULE_notOrNotNotExpression = 4, RULE_notExpression = 5, 
		RULE_affirmativeExpression = 6, RULE_greaterThanExpression = 7, RULE_greaterOrEqualExpression = 8, 
		RULE_lessThanExpression = 9, RULE_lessOrEqualExpression = 10, RULE_compareExpression = 11, 
		RULE_equalExpression = 12, RULE_differentExpression = 13, RULE_addOrSubExpression = 14, 
		RULE_addExpression = 15, RULE_subExpression = 16, RULE_multOrDivExpression = 17, 
		RULE_multExpression = 18, RULE_divExpression = 19, RULE_modExpression = 20, 
		RULE_operand = 21, RULE_parenthesisExpression = 22, RULE_navExpression = 23, 
		RULE_primitive = 24, RULE_attributeNavAtPreOrNot = 25, RULE_attributeNavExpression = 26, 
		RULE_atPreExpression = 27, RULE_methodNavExpression = 28, RULE_collectionMethodNavExpression = 29, 
		RULE_variableOrMember = 30, RULE_variableOrMemberAtPre = 31, RULE_functionCall = 32, 
		RULE_variableDeclarationExpression = 33, RULE_typeExpression = 34, RULE_atomicTypeExpression = 35, 
		RULE_sequenceTypeExpression = 36, RULE_bagTypeExpression = 37, RULE_setTypeExpression = 38, 
		RULE_orderedSetTypeExpression = 39, RULE_oppExpression = 40, RULE_selfExpression = 41, 
		RULE_variableReference = 42, RULE_parameterList = 43, RULE_literal = 44, 
		RULE_identifier = 45, RULE_integerLiteral = 46, RULE_floatingPointLiteral = 47, 
		RULE_booleanLiteral = 48, RULE_dateLiteral = 49, RULE_characterLiteral = 50, 
		RULE_stringLiteral = 51, RULE_nullLiteral = 52;
	public static final String[] ruleNames = {
		"gelExpression", "xorExpression", "orExpression", "andExpression", "notOrNotNotExpression", 
		"notExpression", "affirmativeExpression", "greaterThanExpression", "greaterOrEqualExpression", 
		"lessThanExpression", "lessOrEqualExpression", "compareExpression", "equalExpression", 
		"differentExpression", "addOrSubExpression", "addExpression", "subExpression", 
		"multOrDivExpression", "multExpression", "divExpression", "modExpression", 
		"operand", "parenthesisExpression", "navExpression", "primitive", "attributeNavAtPreOrNot", 
		"attributeNavExpression", "atPreExpression", "methodNavExpression", "collectionMethodNavExpression", 
		"variableOrMember", "variableOrMemberAtPre", "functionCall", "variableDeclarationExpression", 
		"typeExpression", "atomicTypeExpression", "sequenceTypeExpression", "bagTypeExpression", 
		"setTypeExpression", "orderedSetTypeExpression", "oppExpression", "selfExpression", 
		"variableReference", "parameterList", "literal", "identifier", "integerLiteral", 
		"floatingPointLiteral", "booleanLiteral", "dateLiteral", "characterLiteral", 
		"stringLiteral", "nullLiteral"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'self'", null, null, null, null, null, null, "'null'", "'('", "')'", 
		"'#{'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'->'", "'<-'", 
		"'|'", "'>'", "'<'", "'not'", "'~'", "'?'", "':'", "'::'", "'='", "'<='", 
		"'>='", "'<>'", "'and'", "'or'", "'xor'", "'+'", "'-'", "'*'", "'/'", 
		"'%'", "'^'", "'mod'", "'sequence'", "'bag'", "'set'", "'ordered'", null, 
		"'@pre'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Self", "IntegerLiteral", "FloatingPointLiteral", "BooleanLiteral", 
		"DateLiteral", "CharacterLiteral", "StringLiteral", "NullLiteral", "LPAREN", 
		"RPAREN", "START_EXP", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", 
		"COMMA", "DOT", "ARROW", "LEFT_ARROW", "PIPE", "GT", "LT", "NOT", "TILDE", 
		"QUESTION", "COLON", "DOUBLE_COLON", "EQUAL", "LE", "GE", "NOTEQUAL", 
		"AND", "OR", "XOR", "ADD", "SUB", "MUL", "DIV", "MOD_PERCENT", "CARET", 
		"MOD", "SEQUENCE", "BAG", "SET", "ORDERED", "Identifier", "ATPRE", "ELLIPSIS", 
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
	public String getGrammarFileName() { return "GelParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GelParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
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
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterGelExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitGelExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitGelExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GelExpressionContext gelExpression() throws RecognitionException {
		GelExpressionContext _localctx = new GelExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_gelExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
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
		public List<TerminalNode> XOR() { return getTokens(GelParser.XOR); }
		public TerminalNode XOR(int i) {
			return getToken(GelParser.XOR, i);
		}
		public XorExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xorExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterXorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitXorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitXorExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XorExpressionContext xorExpression() throws RecognitionException {
		XorExpressionContext _localctx = new XorExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_xorExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(108);
					orExpression();
					setState(109);
					match(XOR);
					}
					} 
				}
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(116);
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
		public List<TerminalNode> OR() { return getTokens(GelParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(GelParser.OR, i);
		}
		public OrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrExpressionContext orExpression() throws RecognitionException {
		OrExpressionContext _localctx = new OrExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_orExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(118);
					andExpression();
					setState(119);
					match(OR);
					}
					} 
				}
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(126);
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
		public List<TerminalNode> AND() { return getTokens(GelParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(GelParser.AND, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_andExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(128);
					notOrNotNotExpression();
					setState(129);
					match(AND);
					}
					} 
				}
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(136);
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
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterNotOrNotNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitNotOrNotNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitNotOrNotNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotOrNotNotExpressionContext notOrNotNotExpression() throws RecognitionException {
		NotOrNotNotExpressionContext _localctx = new NotOrNotNotExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_notOrNotNotExpression);
		try {
			setState(140);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
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
				setState(139);
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
		public TerminalNode NOT() { return getToken(GelParser.NOT, 0); }
		public AffirmativeExpressionContext affirmativeExpression() {
			return getRuleContext(AffirmativeExpressionContext.class,0);
		}
		public NotExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotExpressionContext notExpression() throws RecognitionException {
		NotExpressionContext _localctx = new NotExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_notExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(NOT);
			setState(143);
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
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterAffirmativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitAffirmativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitAffirmativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AffirmativeExpressionContext affirmativeExpression() throws RecognitionException {
		AffirmativeExpressionContext _localctx = new AffirmativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_affirmativeExpression);
		try {
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				greaterThanExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				greaterOrEqualExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				lessThanExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(148);
				lessOrEqualExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(149);
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
		public TerminalNode GT() { return getToken(GelParser.GT, 0); }
		public GreaterThanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greaterThanExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterGreaterThanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitGreaterThanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitGreaterThanExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GreaterThanExpressionContext greaterThanExpression() throws RecognitionException {
		GreaterThanExpressionContext _localctx = new GreaterThanExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_greaterThanExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			compareExpression();
			setState(153);
			match(GT);
			setState(154);
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
		public TerminalNode GE() { return getToken(GelParser.GE, 0); }
		public GreaterOrEqualExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greaterOrEqualExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterGreaterOrEqualExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitGreaterOrEqualExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitGreaterOrEqualExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GreaterOrEqualExpressionContext greaterOrEqualExpression() throws RecognitionException {
		GreaterOrEqualExpressionContext _localctx = new GreaterOrEqualExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_greaterOrEqualExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			compareExpression();
			setState(157);
			match(GE);
			setState(158);
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
		public TerminalNode LT() { return getToken(GelParser.LT, 0); }
		public LessThanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lessThanExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterLessThanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitLessThanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitLessThanExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LessThanExpressionContext lessThanExpression() throws RecognitionException {
		LessThanExpressionContext _localctx = new LessThanExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_lessThanExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			compareExpression();
			setState(161);
			match(LT);
			setState(162);
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
		public TerminalNode LE() { return getToken(GelParser.LE, 0); }
		public LessOrEqualExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lessOrEqualExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterLessOrEqualExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitLessOrEqualExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitLessOrEqualExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LessOrEqualExpressionContext lessOrEqualExpression() throws RecognitionException {
		LessOrEqualExpressionContext _localctx = new LessOrEqualExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_lessOrEqualExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			compareExpression();
			setState(165);
			match(LE);
			setState(166);
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
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterCompareExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitCompareExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitCompareExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareExpressionContext compareExpression() throws RecognitionException {
		CompareExpressionContext _localctx = new CompareExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_compareExpression);
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				equalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				differentExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
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
		public TerminalNode EQUAL() { return getToken(GelParser.EQUAL, 0); }
		public EqualExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterEqualExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitEqualExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitEqualExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualExpressionContext equalExpression() throws RecognitionException {
		EqualExpressionContext _localctx = new EqualExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_equalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			addOrSubExpression();
			setState(174);
			match(EQUAL);
			setState(175);
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
		public TerminalNode NOTEQUAL() { return getToken(GelParser.NOTEQUAL, 0); }
		public DifferentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_differentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterDifferentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitDifferentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitDifferentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DifferentExpressionContext differentExpression() throws RecognitionException {
		DifferentExpressionContext _localctx = new DifferentExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_differentExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			addOrSubExpression();
			setState(178);
			match(NOTEQUAL);
			setState(179);
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
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterAddOrSubExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitAddOrSubExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitAddOrSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddOrSubExpressionContext addOrSubExpression() throws RecognitionException {
		AddOrSubExpressionContext _localctx = new AddOrSubExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_addOrSubExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			multOrDivExpression();
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				setState(184);
				switch (_input.LA(1)) {
				case ADD:
					{
					setState(182);
					addExpression();
					}
					break;
				case SUB:
					{
					setState(183);
					subExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(188);
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

	public static class AddExpressionContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(GelParser.ADD, 0); }
		public MultOrDivExpressionContext multOrDivExpression() {
			return getRuleContext(MultOrDivExpressionContext.class,0);
		}
		public AddExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterAddExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitAddExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitAddExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddExpressionContext addExpression() throws RecognitionException {
		AddExpressionContext _localctx = new AddExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_addExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(ADD);
			setState(190);
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
		public TerminalNode SUB() { return getToken(GelParser.SUB, 0); }
		public MultOrDivExpressionContext multOrDivExpression() {
			return getRuleContext(MultOrDivExpressionContext.class,0);
		}
		public SubExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterSubExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitSubExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubExpressionContext subExpression() throws RecognitionException {
		SubExpressionContext _localctx = new SubExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_subExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(SUB);
			setState(193);
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
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterMultOrDivExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitMultOrDivExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitMultOrDivExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultOrDivExpressionContext multOrDivExpression() throws RecognitionException {
		MultOrDivExpressionContext _localctx = new MultOrDivExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_multOrDivExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			operand();
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) {
				{
				setState(199);
				switch (_input.LA(1)) {
				case MUL:
					{
					setState(196);
					multExpression();
					}
					break;
				case DIV:
					{
					setState(197);
					divExpression();
					}
					break;
				case MOD:
					{
					setState(198);
					modExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(203);
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
		public TerminalNode MUL() { return getToken(GelParser.MUL, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public MultExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterMultExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitMultExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitMultExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultExpressionContext multExpression() throws RecognitionException {
		MultExpressionContext _localctx = new MultExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_multExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(MUL);
			setState(205);
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
		public TerminalNode DIV() { return getToken(GelParser.DIV, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public DivExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterDivExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitDivExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitDivExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivExpressionContext divExpression() throws RecognitionException {
		DivExpressionContext _localctx = new DivExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_divExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(DIV);
			setState(208);
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
		public TerminalNode MOD() { return getToken(GelParser.MOD, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public ModExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterModExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitModExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitModExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModExpressionContext modExpression() throws RecognitionException {
		ModExpressionContext _localctx = new ModExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_modExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(MOD);
			setState(211);
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
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_operand);
		try {
			setState(217);
			switch (_input.LA(1)) {
			case SUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				oppExpression();
				}
				break;
			case Self:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
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
				setState(215);
				literal();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(216);
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
		public TerminalNode LPAREN() { return getToken(GelParser.LPAREN, 0); }
		public GelExpressionContext gelExpression() {
			return getRuleContext(GelExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GelParser.RPAREN, 0); }
		public ParenthesisExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesisExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterParenthesisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitParenthesisExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitParenthesisExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParenthesisExpressionContext parenthesisExpression() throws RecognitionException {
		ParenthesisExpressionContext _localctx = new ParenthesisExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_parenthesisExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(LPAREN);
			setState(220);
			gelExpression();
			setState(221);
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
		public List<AttributeNavAtPreOrNotContext> attributeNavAtPreOrNot() {
			return getRuleContexts(AttributeNavAtPreOrNotContext.class);
		}
		public AttributeNavAtPreOrNotContext attributeNavAtPreOrNot(int i) {
			return getRuleContext(AttributeNavAtPreOrNotContext.class,i);
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
		public NavExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_navExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterNavExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitNavExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitNavExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NavExpressionContext navExpression() throws RecognitionException {
		NavExpressionContext _localctx = new NavExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_navExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			primitive();
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT || _la==ARROW) {
				{
				setState(227);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(224);
					attributeNavAtPreOrNot();
					}
					break;
				case 2:
					{
					setState(225);
					methodNavExpression();
					}
					break;
				case 3:
					{
					setState(226);
					collectionMethodNavExpression();
					}
					break;
				}
				}
				setState(231);
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
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterPrimitive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitPrimitive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitPrimitive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveContext primitive() throws RecognitionException {
		PrimitiveContext _localctx = new PrimitiveContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_primitive);
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				selfExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				variableOrMember();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
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

	public static class AttributeNavAtPreOrNotContext extends ParserRuleContext {
		public AtPreExpressionContext atPreExpression() {
			return getRuleContext(AtPreExpressionContext.class,0);
		}
		public AttributeNavExpressionContext attributeNavExpression() {
			return getRuleContext(AttributeNavExpressionContext.class,0);
		}
		public AttributeNavAtPreOrNotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeNavAtPreOrNot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterAttributeNavAtPreOrNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitAttributeNavAtPreOrNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitAttributeNavAtPreOrNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeNavAtPreOrNotContext attributeNavAtPreOrNot() throws RecognitionException {
		AttributeNavAtPreOrNotContext _localctx = new AttributeNavAtPreOrNotContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_attributeNavAtPreOrNot);
		try {
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				atPreExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				attributeNavExpression();
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
		public TerminalNode DOT() { return getToken(GelParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributeNavExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeNavExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterAttributeNavExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitAttributeNavExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitAttributeNavExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeNavExpressionContext attributeNavExpression() throws RecognitionException {
		AttributeNavExpressionContext _localctx = new AttributeNavExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_attributeNavExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(DOT);
			setState(242);
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
		public AttributeNavExpressionContext attributeNavExpression() {
			return getRuleContext(AttributeNavExpressionContext.class,0);
		}
		public TerminalNode ATPRE() { return getToken(GelParser.ATPRE, 0); }
		public AtPreExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atPreExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterAtPreExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitAtPreExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitAtPreExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtPreExpressionContext atPreExpression() throws RecognitionException {
		AtPreExpressionContext _localctx = new AtPreExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_atPreExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			attributeNavExpression();
			setState(245);
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

	public static class MethodNavExpressionContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(GelParser.DOT, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public MethodNavExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodNavExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterMethodNavExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitMethodNavExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitMethodNavExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodNavExpressionContext methodNavExpression() throws RecognitionException {
		MethodNavExpressionContext _localctx = new MethodNavExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_methodNavExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(DOT);
			setState(248);
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
		public TerminalNode ARROW() { return getToken(GelParser.ARROW, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public CollectionMethodNavExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collectionMethodNavExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterCollectionMethodNavExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitCollectionMethodNavExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitCollectionMethodNavExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectionMethodNavExpressionContext collectionMethodNavExpression() throws RecognitionException {
		CollectionMethodNavExpressionContext _localctx = new CollectionMethodNavExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_collectionMethodNavExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(ARROW);
			setState(251);
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
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterVariableOrMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitVariableOrMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitVariableOrMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableOrMemberContext variableOrMember() throws RecognitionException {
		VariableOrMemberContext _localctx = new VariableOrMemberContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_variableOrMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
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
		public TerminalNode ATPRE() { return getToken(GelParser.ATPRE, 0); }
		public VariableOrMemberAtPreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableOrMemberAtPre; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterVariableOrMemberAtPre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitVariableOrMemberAtPre(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitVariableOrMemberAtPre(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableOrMemberAtPreContext variableOrMemberAtPre() throws RecognitionException {
		VariableOrMemberAtPreContext _localctx = new VariableOrMemberAtPreContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_variableOrMemberAtPre);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			identifier();
			setState(256);
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
		public TerminalNode LPAREN() { return getToken(GelParser.LPAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GelParser.RPAREN, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			identifier();
			setState(259);
			match(LPAREN);
			setState(260);
			parameterList();
			setState(261);
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
		public TerminalNode Identifier() { return getToken(GelParser.Identifier, 0); }
		public TerminalNode COLON() { return getToken(GelParser.COLON, 0); }
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public VariableDeclarationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterVariableDeclarationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitVariableDeclarationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitVariableDeclarationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationExpressionContext variableDeclarationExpression() throws RecognitionException {
		VariableDeclarationExpressionContext _localctx = new VariableDeclarationExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_variableDeclarationExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(Identifier);
			setState(266);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(264);
				match(COLON);
				setState(265);
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
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterTypeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitTypeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitTypeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeExpressionContext typeExpression() throws RecognitionException {
		TypeExpressionContext _localctx = new TypeExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_typeExpression);
		try {
			setState(273);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				atomicTypeExpression();
				}
				break;
			case SEQUENCE:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				sequenceTypeExpression();
				}
				break;
			case BAG:
				enterOuterAlt(_localctx, 3);
				{
				setState(270);
				bagTypeExpression();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 4);
				{
				setState(271);
				setTypeExpression();
				}
				break;
			case ORDERED:
				enterOuterAlt(_localctx, 5);
				{
				setState(272);
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
		public TerminalNode Identifier() { return getToken(GelParser.Identifier, 0); }
		public AtomicTypeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicTypeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterAtomicTypeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitAtomicTypeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitAtomicTypeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomicTypeExpressionContext atomicTypeExpression() throws RecognitionException {
		AtomicTypeExpressionContext _localctx = new AtomicTypeExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_atomicTypeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
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
		public TerminalNode SEQUENCE() { return getToken(GelParser.SEQUENCE, 0); }
		public TerminalNode LPAREN() { return getToken(GelParser.LPAREN, 0); }
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GelParser.RPAREN, 0); }
		public SequenceTypeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequenceTypeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterSequenceTypeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitSequenceTypeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitSequenceTypeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequenceTypeExpressionContext sequenceTypeExpression() throws RecognitionException {
		SequenceTypeExpressionContext _localctx = new SequenceTypeExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_sequenceTypeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(SEQUENCE);
			setState(278);
			match(LPAREN);
			setState(279);
			typeExpression();
			setState(280);
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
		public TerminalNode BAG() { return getToken(GelParser.BAG, 0); }
		public TerminalNode LPAREN() { return getToken(GelParser.LPAREN, 0); }
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GelParser.RPAREN, 0); }
		public BagTypeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bagTypeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterBagTypeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitBagTypeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitBagTypeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BagTypeExpressionContext bagTypeExpression() throws RecognitionException {
		BagTypeExpressionContext _localctx = new BagTypeExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_bagTypeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(BAG);
			setState(283);
			match(LPAREN);
			setState(284);
			typeExpression();
			setState(285);
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
		public TerminalNode SET() { return getToken(GelParser.SET, 0); }
		public TerminalNode LPAREN() { return getToken(GelParser.LPAREN, 0); }
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GelParser.RPAREN, 0); }
		public SetTypeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setTypeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterSetTypeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitSetTypeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitSetTypeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetTypeExpressionContext setTypeExpression() throws RecognitionException {
		SetTypeExpressionContext _localctx = new SetTypeExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_setTypeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(SET);
			setState(288);
			match(LPAREN);
			setState(289);
			typeExpression();
			setState(290);
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
		public TerminalNode ORDERED() { return getToken(GelParser.ORDERED, 0); }
		public TerminalNode SET() { return getToken(GelParser.SET, 0); }
		public TerminalNode LPAREN() { return getToken(GelParser.LPAREN, 0); }
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GelParser.RPAREN, 0); }
		public OrderedSetTypeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedSetTypeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterOrderedSetTypeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitOrderedSetTypeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitOrderedSetTypeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderedSetTypeExpressionContext orderedSetTypeExpression() throws RecognitionException {
		OrderedSetTypeExpressionContext _localctx = new OrderedSetTypeExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_orderedSetTypeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(ORDERED);
			setState(293);
			match(SET);
			setState(294);
			match(LPAREN);
			setState(295);
			typeExpression();
			setState(296);
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
		public TerminalNode SUB() { return getToken(GelParser.SUB, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public OppExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oppExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterOppExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitOppExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitOppExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OppExpressionContext oppExpression() throws RecognitionException {
		OppExpressionContext _localctx = new OppExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_oppExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(SUB);
			setState(299);
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
		public TerminalNode Self() { return getToken(GelParser.Self, 0); }
		public SelfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterSelfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitSelfExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitSelfExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfExpressionContext selfExpression() throws RecognitionException {
		SelfExpressionContext _localctx = new SelfExpressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_selfExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
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
		public TerminalNode Identifier() { return getToken(GelParser.Identifier, 0); }
		public VariableReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterVariableReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitVariableReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitVariableReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableReferenceContext variableReference() throws RecognitionException {
		VariableReferenceContext _localctx = new VariableReferenceContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_variableReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
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
		public List<TerminalNode> COMMA() { return getTokens(GelParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GelParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_parameterList);
		try {
			int _alt;
			setState(315);
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
				setState(310);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(305);
						gelExpression();
						setState(306);
						match(COMMA);
						}
						} 
					}
					setState(312);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				setState(313);
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
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_literal);
		try {
			setState(324);
			switch (_input.LA(1)) {
			case IntegerLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				integerLiteral();
				}
				break;
			case FloatingPointLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				floatingPointLiteral();
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(319);
				booleanLiteral();
				}
				break;
			case DateLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(320);
				dateLiteral();
				}
				break;
			case CharacterLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(321);
				characterLiteral();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 6);
				{
				setState(322);
				stringLiteral();
				}
				break;
			case NullLiteral:
				enterOuterAlt(_localctx, 7);
				{
				setState(323);
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
		public TerminalNode Identifier() { return getToken(GelParser.Identifier, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
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
		public TerminalNode IntegerLiteral() { return getToken(GelParser.IntegerLiteral, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_integerLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
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
		public TerminalNode FloatingPointLiteral() { return getToken(GelParser.FloatingPointLiteral, 0); }
		public FloatingPointLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingPointLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterFloatingPointLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitFloatingPointLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitFloatingPointLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatingPointLiteralContext floatingPointLiteral() throws RecognitionException {
		FloatingPointLiteralContext _localctx = new FloatingPointLiteralContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_floatingPointLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
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
		public TerminalNode BooleanLiteral() { return getToken(GelParser.BooleanLiteral, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_booleanLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
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
		public TerminalNode DateLiteral() { return getToken(GelParser.DateLiteral, 0); }
		public DateLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterDateLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitDateLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitDateLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateLiteralContext dateLiteral() throws RecognitionException {
		DateLiteralContext _localctx = new DateLiteralContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_dateLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
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
		public TerminalNode CharacterLiteral() { return getToken(GelParser.CharacterLiteral, 0); }
		public CharacterLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterCharacterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitCharacterLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitCharacterLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterLiteralContext characterLiteral() throws RecognitionException {
		CharacterLiteralContext _localctx = new CharacterLiteralContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_characterLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
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
		public TerminalNode StringLiteral() { return getToken(GelParser.StringLiteral, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
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
		public TerminalNode NullLiteral() { return getToken(GelParser.NullLiteral, 0); }
		public NullLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullLiteralContext nullLiteral() throws RecognitionException {
		NullLiteralContext _localctx = new NullLiteralContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_nullLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\66\u0159\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\3\2\3\2\3\3\3\3\3\3\7\3r\n\3\f\3\16\3u\13\3\3"+
		"\3\3\3\3\4\3\4\3\4\7\4|\n\4\f\4\16\4\177\13\4\3\4\3\4\3\5\3\5\3\5\7\5"+
		"\u0086\n\5\f\5\16\5\u0089\13\5\3\5\3\5\3\6\3\6\5\6\u008f\n\6\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\5\b\u0099\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u00ae\n\r\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\7\20\u00bb\n\20\f\20\16"+
		"\20\u00be\13\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\7\23"+
		"\u00ca\n\23\f\23\16\23\u00cd\13\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u00dc\n\27\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\7\31\u00e6\n\31\f\31\16\31\u00e9\13\31\3\32\3\32\3\32"+
		"\5\32\u00ee\n\32\3\33\3\33\5\33\u00f2\n\33\3\34\3\34\3\34\3\35\3\35\3"+
		"\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3"+
		"#\3#\3#\5#\u010d\n#\3$\3$\3$\3$\3$\5$\u0114\n$\3%\3%\3&\3&\3&\3&\3&\3"+
		"\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3+\3+\3,"+
		"\3,\3-\3-\3-\7-\u0137\n-\f-\16-\u013a\13-\3-\3-\5-\u013e\n-\3.\3.\3.\3"+
		".\3.\3.\3.\5.\u0147\n.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3"+
		"\64\3\64\3\65\3\65\3\66\3\66\3\66\2\2\67\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj\2\2\u0148\2"+
		"l\3\2\2\2\4s\3\2\2\2\6}\3\2\2\2\b\u0087\3\2\2\2\n\u008e\3\2\2\2\f\u0090"+
		"\3\2\2\2\16\u0098\3\2\2\2\20\u009a\3\2\2\2\22\u009e\3\2\2\2\24\u00a2\3"+
		"\2\2\2\26\u00a6\3\2\2\2\30\u00ad\3\2\2\2\32\u00af\3\2\2\2\34\u00b3\3\2"+
		"\2\2\36\u00b7\3\2\2\2 \u00bf\3\2\2\2\"\u00c2\3\2\2\2$\u00c5\3\2\2\2&\u00ce"+
		"\3\2\2\2(\u00d1\3\2\2\2*\u00d4\3\2\2\2,\u00db\3\2\2\2.\u00dd\3\2\2\2\60"+
		"\u00e1\3\2\2\2\62\u00ed\3\2\2\2\64\u00f1\3\2\2\2\66\u00f3\3\2\2\28\u00f6"+
		"\3\2\2\2:\u00f9\3\2\2\2<\u00fc\3\2\2\2>\u00ff\3\2\2\2@\u0101\3\2\2\2B"+
		"\u0104\3\2\2\2D\u0109\3\2\2\2F\u0113\3\2\2\2H\u0115\3\2\2\2J\u0117\3\2"+
		"\2\2L\u011c\3\2\2\2N\u0121\3\2\2\2P\u0126\3\2\2\2R\u012c\3\2\2\2T\u012f"+
		"\3\2\2\2V\u0131\3\2\2\2X\u013d\3\2\2\2Z\u0146\3\2\2\2\\\u0148\3\2\2\2"+
		"^\u014a\3\2\2\2`\u014c\3\2\2\2b\u014e\3\2\2\2d\u0150\3\2\2\2f\u0152\3"+
		"\2\2\2h\u0154\3\2\2\2j\u0156\3\2\2\2lm\5\4\3\2m\3\3\2\2\2no\5\6\4\2op"+
		"\7%\2\2pr\3\2\2\2qn\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us"+
		"\3\2\2\2vw\5\6\4\2w\5\3\2\2\2xy\5\b\5\2yz\7$\2\2z|\3\2\2\2{x\3\2\2\2|"+
		"\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0081"+
		"\5\b\5\2\u0081\7\3\2\2\2\u0082\u0083\5\n\6\2\u0083\u0084\7#\2\2\u0084"+
		"\u0086\3\2\2\2\u0085\u0082\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2"+
		"\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u0087\3\2\2\2\u008a"+
		"\u008b\5\n\6\2\u008b\t\3\2\2\2\u008c\u008f\5\f\7\2\u008d\u008f\5\16\b"+
		"\2\u008e\u008c\3\2\2\2\u008e\u008d\3\2\2\2\u008f\13\3\2\2\2\u0090\u0091"+
		"\7\32\2\2\u0091\u0092\5\16\b\2\u0092\r\3\2\2\2\u0093\u0099\5\20\t\2\u0094"+
		"\u0099\5\22\n\2\u0095\u0099\5\24\13\2\u0096\u0099\5\26\f\2\u0097\u0099"+
		"\5\30\r\2\u0098\u0093\3\2\2\2\u0098\u0094\3\2\2\2\u0098\u0095\3\2\2\2"+
		"\u0098\u0096\3\2\2\2\u0098\u0097\3\2\2\2\u0099\17\3\2\2\2\u009a\u009b"+
		"\5\30\r\2\u009b\u009c\7\30\2\2\u009c\u009d\5\30\r\2\u009d\21\3\2\2\2\u009e"+
		"\u009f\5\30\r\2\u009f\u00a0\7!\2\2\u00a0\u00a1\5\30\r\2\u00a1\23\3\2\2"+
		"\2\u00a2\u00a3\5\30\r\2\u00a3\u00a4\7\31\2\2\u00a4\u00a5\5\30\r\2\u00a5"+
		"\25\3\2\2\2\u00a6\u00a7\5\30\r\2\u00a7\u00a8\7 \2\2\u00a8\u00a9\5\30\r"+
		"\2\u00a9\27\3\2\2\2\u00aa\u00ae\5\32\16\2\u00ab\u00ae\5\34\17\2\u00ac"+
		"\u00ae\5\36\20\2\u00ad\u00aa\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ac\3"+
		"\2\2\2\u00ae\31\3\2\2\2\u00af\u00b0\5\36\20\2\u00b0\u00b1\7\37\2\2\u00b1"+
		"\u00b2\5\36\20\2\u00b2\33\3\2\2\2\u00b3\u00b4\5\36\20\2\u00b4\u00b5\7"+
		"\"\2\2\u00b5\u00b6\5\36\20\2\u00b6\35\3\2\2\2\u00b7\u00bc\5$\23\2\u00b8"+
		"\u00bb\5 \21\2\u00b9\u00bb\5\"\22\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3"+
		"\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\37\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\7&\2\2\u00c0\u00c1\5$\23\2"+
		"\u00c1!\3\2\2\2\u00c2\u00c3\7\'\2\2\u00c3\u00c4\5$\23\2\u00c4#\3\2\2\2"+
		"\u00c5\u00cb\5,\27\2\u00c6\u00ca\5&\24\2\u00c7\u00ca\5(\25\2\u00c8\u00ca"+
		"\5*\26\2\u00c9\u00c6\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca"+
		"\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc%\3\2\2\2"+
		"\u00cd\u00cb\3\2\2\2\u00ce\u00cf\7(\2\2\u00cf\u00d0\5,\27\2\u00d0\'\3"+
		"\2\2\2\u00d1\u00d2\7)\2\2\u00d2\u00d3\5,\27\2\u00d3)\3\2\2\2\u00d4\u00d5"+
		"\7,\2\2\u00d5\u00d6\5,\27\2\u00d6+\3\2\2\2\u00d7\u00dc\5R*\2\u00d8\u00dc"+
		"\5\60\31\2\u00d9\u00dc\5Z.\2\u00da\u00dc\5.\30\2\u00db\u00d7\3\2\2\2\u00db"+
		"\u00d8\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00da\3\2\2\2\u00dc-\3\2\2\2"+
		"\u00dd\u00de\7\13\2\2\u00de\u00df\5\2\2\2\u00df\u00e0\7\f\2\2\u00e0/\3"+
		"\2\2\2\u00e1\u00e7\5\62\32\2\u00e2\u00e6\5\64\33\2\u00e3\u00e6\5:\36\2"+
		"\u00e4\u00e6\5<\37\2\u00e5\u00e2\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e4"+
		"\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\61\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00ee\5T+\2\u00eb\u00ee\5> \2\u00ec"+
		"\u00ee\5@!\2\u00ed\u00ea\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ec\3\2\2"+
		"\2\u00ee\63\3\2\2\2\u00ef\u00f2\58\35\2\u00f0\u00f2\5\66\34\2\u00f1\u00ef"+
		"\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\65\3\2\2\2\u00f3\u00f4\7\24\2\2\u00f4"+
		"\u00f5\5\\/\2\u00f5\67\3\2\2\2\u00f6\u00f7\5\66\34\2\u00f7\u00f8\7\62"+
		"\2\2\u00f89\3\2\2\2\u00f9\u00fa\7\24\2\2\u00fa\u00fb\5B\"\2\u00fb;\3\2"+
		"\2\2\u00fc\u00fd\7\25\2\2\u00fd\u00fe\5B\"\2\u00fe=\3\2\2\2\u00ff\u0100"+
		"\5\\/\2\u0100?\3\2\2\2\u0101\u0102\5\\/\2\u0102\u0103\7\62\2\2\u0103A"+
		"\3\2\2\2\u0104\u0105\5\\/\2\u0105\u0106\7\13\2\2\u0106\u0107\5X-\2\u0107"+
		"\u0108\7\f\2\2\u0108C\3\2\2\2\u0109\u010c\7\61\2\2\u010a\u010b\7\35\2"+
		"\2\u010b\u010d\5F$\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010dE\3"+
		"\2\2\2\u010e\u0114\5H%\2\u010f\u0114\5J&\2\u0110\u0114\5L\'\2\u0111\u0114"+
		"\5N(\2\u0112\u0114\5P)\2\u0113\u010e\3\2\2\2\u0113\u010f\3\2\2\2\u0113"+
		"\u0110\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114G\3\2\2\2"+
		"\u0115\u0116\7\61\2\2\u0116I\3\2\2\2\u0117\u0118\7-\2\2\u0118\u0119\7"+
		"\13\2\2\u0119\u011a\5F$\2\u011a\u011b\7\f\2\2\u011bK\3\2\2\2\u011c\u011d"+
		"\7.\2\2\u011d\u011e\7\13\2\2\u011e\u011f\5F$\2\u011f\u0120\7\f\2\2\u0120"+
		"M\3\2\2\2\u0121\u0122\7/\2\2\u0122\u0123\7\13\2\2\u0123\u0124\5F$\2\u0124"+
		"\u0125\7\f\2\2\u0125O\3\2\2\2\u0126\u0127\7\60\2\2\u0127\u0128\7/\2\2"+
		"\u0128\u0129\7\13\2\2\u0129\u012a\5F$\2\u012a\u012b\7\f\2\2\u012bQ\3\2"+
		"\2\2\u012c\u012d\7\'\2\2\u012d\u012e\5,\27\2\u012eS\3\2\2\2\u012f\u0130"+
		"\7\3\2\2\u0130U\3\2\2\2\u0131\u0132\7\61\2\2\u0132W\3\2\2\2\u0133\u0134"+
		"\5\2\2\2\u0134\u0135\7\23\2\2\u0135\u0137\3\2\2\2\u0136\u0133\3\2\2\2"+
		"\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013b"+
		"\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013e\5\2\2\2\u013c\u013e\3\2\2\2\u013d"+
		"\u0138\3\2\2\2\u013d\u013c\3\2\2\2\u013eY\3\2\2\2\u013f\u0147\5^\60\2"+
		"\u0140\u0147\5`\61\2\u0141\u0147\5b\62\2\u0142\u0147\5d\63\2\u0143\u0147"+
		"\5f\64\2\u0144\u0147\5h\65\2\u0145\u0147\5j\66\2\u0146\u013f\3\2\2\2\u0146"+
		"\u0140\3\2\2\2\u0146\u0141\3\2\2\2\u0146\u0142\3\2\2\2\u0146\u0143\3\2"+
		"\2\2\u0146\u0144\3\2\2\2\u0146\u0145\3\2\2\2\u0147[\3\2\2\2\u0148\u0149"+
		"\7\61\2\2\u0149]\3\2\2\2\u014a\u014b\7\4\2\2\u014b_\3\2\2\2\u014c\u014d"+
		"\7\5\2\2\u014da\3\2\2\2\u014e\u014f\7\6\2\2\u014fc\3\2\2\2\u0150\u0151"+
		"\7\7\2\2\u0151e\3\2\2\2\u0152\u0153\7\b\2\2\u0153g\3\2\2\2\u0154\u0155"+
		"\7\t\2\2\u0155i\3\2\2\2\u0156\u0157\7\n\2\2\u0157k\3\2\2\2\26s}\u0087"+
		"\u008e\u0098\u00ad\u00ba\u00bc\u00c9\u00cb\u00db\u00e5\u00e7\u00ed\u00f1"+
		"\u010c\u0113\u0138\u013d\u0146";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}