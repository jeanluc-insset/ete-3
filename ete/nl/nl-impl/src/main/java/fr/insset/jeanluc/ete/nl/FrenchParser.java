// Generated from fr/insset/jeanluc/ete/nl/FrenchParser.g4 by ANTLR 4.5.3
package fr.insset.jeanluc.ete.nl;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FrenchParser extends Parser {
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
	public static final int
		RULE_nlExpression = 0, RULE_xorExpression = 1, RULE_orExpression = 2, 
		RULE_andExpression = 3, RULE_notOrNotNotExpression = 4, RULE_notExpression = 5, 
		RULE_affirmativeExpression = 6, RULE_greaterThanExpression = 7, RULE_greaterOrEqualExpression = 8, 
		RULE_lessThanExpression = 9, RULE_lessOrEqualExpression = 10, RULE_compareExpression = 11, 
		RULE_equalExpression = 12, RULE_differentExpression = 13, RULE_addOrSubExpression = 14, 
		RULE_addExpression = 15, RULE_subExpression = 16, RULE_multOrDivExpression = 17, 
		RULE_multExpression = 18, RULE_divExpression = 19, RULE_modExpression = 20, 
		RULE_operand = 21, RULE_parenthesisExpression = 22, RULE_navExpression = 23, 
		RULE_step = 24, RULE_finalStep = 25, RULE_oclIsNew = 26, RULE_oclIsTypeOf = 27, 
		RULE_oclIsKindOf = 28, RULE_primitive = 29, RULE_attributeNavExpression = 30, 
		RULE_atPreExpression = 31, RULE_asTypeExpression = 32, RULE_methodNavExpression = 33, 
		RULE_collectionMethodNavExpression = 34, RULE_variableOrMember = 35, RULE_variableOrMemberAtPre = 36, 
		RULE_functionCall = 37, RULE_variableDeclarationExpression = 38, RULE_typeExpression = 39, 
		RULE_atomicTypeExpression = 40, RULE_sequenceTypeExpression = 41, RULE_bagTypeExpression = 42, 
		RULE_setTypeExpression = 43, RULE_orderedSetTypeExpression = 44, RULE_oppExpression = 45, 
		RULE_selfExpression = 46, RULE_variableReference = 47, RULE_parameterList = 48, 
		RULE_literal = 49, RULE_identifier = 50, RULE_integerLiteral = 51, RULE_floatingPointLiteral = 52, 
		RULE_dateLiteral = 53, RULE_characterLiteral = 54, RULE_stringLiteral = 55, 
		RULE_nullLiteral = 56;
	public static final String[] ruleNames = {
		"nlExpression", "xorExpression", "orExpression", "andExpression", "notOrNotNotExpression", 
		"notExpression", "affirmativeExpression", "greaterThanExpression", "greaterOrEqualExpression", 
		"lessThanExpression", "lessOrEqualExpression", "compareExpression", "equalExpression", 
		"differentExpression", "addOrSubExpression", "addExpression", "subExpression", 
		"multOrDivExpression", "multExpression", "divExpression", "modExpression", 
		"operand", "parenthesisExpression", "navExpression", "step", "finalStep", 
		"oclIsNew", "oclIsTypeOf", "oclIsKindOf", "primitive", "attributeNavExpression", 
		"atPreExpression", "asTypeExpression", "methodNavExpression", "collectionMethodNavExpression", 
		"variableOrMember", "variableOrMemberAtPre", "functionCall", "variableDeclarationExpression", 
		"typeExpression", "atomicTypeExpression", "sequenceTypeExpression", "bagTypeExpression", 
		"setTypeExpression", "orderedSetTypeExpression", "oppExpression", "selfExpression", 
		"variableReference", "parameterList", "literal", "identifier", "integerLiteral", 
		"floatingPointLiteral", "dateLiteral", "characterLiteral", "stringLiteral", 
		"nullLiteral"
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

	@Override
	public String getGrammarFileName() { return "FrenchParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FrenchParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class NlExpressionContext extends ParserRuleContext {
		public XorExpressionContext xorExpression() {
			return getRuleContext(XorExpressionContext.class,0);
		}
		public NlExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nlExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterNlExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitNlExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitNlExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NlExpressionContext nlExpression() throws RecognitionException {
		NlExpressionContext _localctx = new NlExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_nlExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
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
		public List<TerminalNode> XOR() { return getTokens(FrenchParser.XOR); }
		public TerminalNode XOR(int i) {
			return getToken(FrenchParser.XOR, i);
		}
		public XorExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xorExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterXorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitXorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitXorExpression(this);
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
			setState(121);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(116);
					orExpression();
					setState(117);
					match(XOR);
					}
					} 
				}
				setState(123);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(124);
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
		public List<TerminalNode> OR() { return getTokens(FrenchParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(FrenchParser.OR, i);
		}
		public OrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitOrExpression(this);
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
			setState(131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(126);
					andExpression();
					setState(127);
					match(OR);
					}
					} 
				}
				setState(133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(134);
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
		public List<TerminalNode> AND() { return getTokens(FrenchParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(FrenchParser.AND, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitAndExpression(this);
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
			setState(141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(136);
					notOrNotNotExpression();
					setState(137);
					match(AND);
					}
					} 
				}
				setState(143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(144);
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
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterNotOrNotNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitNotOrNotNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitNotOrNotNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotOrNotNotExpressionContext notOrNotNotExpression() throws RecognitionException {
		NotOrNotNotExpressionContext _localctx = new NotOrNotNotExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_notOrNotNotExpression);
		try {
			setState(148);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				notExpression();
				}
				break;
			case IntegerLiteral:
			case FloatingPointLiteral:
			case DateLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case SUB:
			case THE:
			case THIS:
			case A:
			case AS:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
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
		public TerminalNode NOT() { return getToken(FrenchParser.NOT, 0); }
		public AffirmativeExpressionContext affirmativeExpression() {
			return getRuleContext(AffirmativeExpressionContext.class,0);
		}
		public NotExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotExpressionContext notExpression() throws RecognitionException {
		NotExpressionContext _localctx = new NotExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_notExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(NOT);
			setState(151);
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
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterAffirmativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitAffirmativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitAffirmativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AffirmativeExpressionContext affirmativeExpression() throws RecognitionException {
		AffirmativeExpressionContext _localctx = new AffirmativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_affirmativeExpression);
		try {
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				greaterThanExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				greaterOrEqualExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				lessThanExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(156);
				lessOrEqualExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(157);
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
		public TerminalNode GT() { return getToken(FrenchParser.GT, 0); }
		public GreaterThanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greaterThanExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterGreaterThanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitGreaterThanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitGreaterThanExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GreaterThanExpressionContext greaterThanExpression() throws RecognitionException {
		GreaterThanExpressionContext _localctx = new GreaterThanExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_greaterThanExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			compareExpression();
			setState(161);
			match(GT);
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

	public static class GreaterOrEqualExpressionContext extends ParserRuleContext {
		public List<CompareExpressionContext> compareExpression() {
			return getRuleContexts(CompareExpressionContext.class);
		}
		public CompareExpressionContext compareExpression(int i) {
			return getRuleContext(CompareExpressionContext.class,i);
		}
		public TerminalNode GE() { return getToken(FrenchParser.GE, 0); }
		public GreaterOrEqualExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greaterOrEqualExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterGreaterOrEqualExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitGreaterOrEqualExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitGreaterOrEqualExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GreaterOrEqualExpressionContext greaterOrEqualExpression() throws RecognitionException {
		GreaterOrEqualExpressionContext _localctx = new GreaterOrEqualExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_greaterOrEqualExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			compareExpression();
			setState(165);
			match(GE);
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

	public static class LessThanExpressionContext extends ParserRuleContext {
		public List<CompareExpressionContext> compareExpression() {
			return getRuleContexts(CompareExpressionContext.class);
		}
		public CompareExpressionContext compareExpression(int i) {
			return getRuleContext(CompareExpressionContext.class,i);
		}
		public TerminalNode LT() { return getToken(FrenchParser.LT, 0); }
		public LessThanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lessThanExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterLessThanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitLessThanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitLessThanExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LessThanExpressionContext lessThanExpression() throws RecognitionException {
		LessThanExpressionContext _localctx = new LessThanExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_lessThanExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			compareExpression();
			setState(169);
			match(LT);
			setState(170);
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
		public TerminalNode LE() { return getToken(FrenchParser.LE, 0); }
		public LessOrEqualExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lessOrEqualExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterLessOrEqualExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitLessOrEqualExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitLessOrEqualExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LessOrEqualExpressionContext lessOrEqualExpression() throws RecognitionException {
		LessOrEqualExpressionContext _localctx = new LessOrEqualExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_lessOrEqualExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			compareExpression();
			setState(173);
			match(LE);
			setState(174);
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
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterCompareExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitCompareExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitCompareExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareExpressionContext compareExpression() throws RecognitionException {
		CompareExpressionContext _localctx = new CompareExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_compareExpression);
		try {
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				equalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				differentExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
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
		public TerminalNode EQUAL() { return getToken(FrenchParser.EQUAL, 0); }
		public EqualExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterEqualExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitEqualExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitEqualExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualExpressionContext equalExpression() throws RecognitionException {
		EqualExpressionContext _localctx = new EqualExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_equalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			addOrSubExpression();
			setState(182);
			match(EQUAL);
			setState(183);
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
		public TerminalNode NOTEQUAL() { return getToken(FrenchParser.NOTEQUAL, 0); }
		public DifferentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_differentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterDifferentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitDifferentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitDifferentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DifferentExpressionContext differentExpression() throws RecognitionException {
		DifferentExpressionContext _localctx = new DifferentExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_differentExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			addOrSubExpression();
			setState(186);
			match(NOTEQUAL);
			setState(187);
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
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterAddOrSubExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitAddOrSubExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitAddOrSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddOrSubExpressionContext addOrSubExpression() throws RecognitionException {
		AddOrSubExpressionContext _localctx = new AddOrSubExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_addOrSubExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			multOrDivExpression();
			setState(194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(192);
					switch (_input.LA(1)) {
					case ADD:
						{
						setState(190);
						addExpression();
						}
						break;
					case SUB:
						{
						setState(191);
						subExpression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		public TerminalNode ADD() { return getToken(FrenchParser.ADD, 0); }
		public MultOrDivExpressionContext multOrDivExpression() {
			return getRuleContext(MultOrDivExpressionContext.class,0);
		}
		public AddExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterAddExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitAddExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitAddExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddExpressionContext addExpression() throws RecognitionException {
		AddExpressionContext _localctx = new AddExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_addExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(ADD);
			setState(198);
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
		public TerminalNode SUB() { return getToken(FrenchParser.SUB, 0); }
		public MultOrDivExpressionContext multOrDivExpression() {
			return getRuleContext(MultOrDivExpressionContext.class,0);
		}
		public SubExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterSubExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitSubExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubExpressionContext subExpression() throws RecognitionException {
		SubExpressionContext _localctx = new SubExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_subExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(SUB);
			setState(201);
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
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterMultOrDivExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitMultOrDivExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitMultOrDivExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultOrDivExpressionContext multOrDivExpression() throws RecognitionException {
		MultOrDivExpressionContext _localctx = new MultOrDivExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_multOrDivExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			operand();
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(207);
					switch (_input.LA(1)) {
					case MUL:
						{
						setState(204);
						multExpression();
						}
						break;
					case DIV:
						{
						setState(205);
						divExpression();
						}
						break;
					case MOD:
						{
						setState(206);
						modExpression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		public TerminalNode MUL() { return getToken(FrenchParser.MUL, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public MultExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterMultExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitMultExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitMultExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultExpressionContext multExpression() throws RecognitionException {
		MultExpressionContext _localctx = new MultExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_multExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(MUL);
			setState(213);
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
		public TerminalNode DIV() { return getToken(FrenchParser.DIV, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public DivExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterDivExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitDivExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitDivExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivExpressionContext divExpression() throws RecognitionException {
		DivExpressionContext _localctx = new DivExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_divExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(DIV);
			setState(216);
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
		public TerminalNode MOD() { return getToken(FrenchParser.MOD, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public ModExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterModExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitModExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitModExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModExpressionContext modExpression() throws RecognitionException {
		ModExpressionContext _localctx = new ModExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_modExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(MOD);
			setState(219);
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
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_operand);
		try {
			setState(225);
			switch (_input.LA(1)) {
			case SUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				oppExpression();
				}
				break;
			case THE:
			case THIS:
			case A:
			case AS:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				navExpression();
				}
				break;
			case IntegerLiteral:
			case FloatingPointLiteral:
			case DateLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				literal();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(224);
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
		public TerminalNode LPAREN() { return getToken(FrenchParser.LPAREN, 0); }
		public NlExpressionContext nlExpression() {
			return getRuleContext(NlExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FrenchParser.RPAREN, 0); }
		public ParenthesisExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesisExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterParenthesisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitParenthesisExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitParenthesisExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParenthesisExpressionContext parenthesisExpression() throws RecognitionException {
		ParenthesisExpressionContext _localctx = new ParenthesisExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_parenthesisExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(LPAREN);
			setState(228);
			nlExpression();
			setState(229);
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
		public List<StepContext> step() {
			return getRuleContexts(StepContext.class);
		}
		public StepContext step(int i) {
			return getRuleContext(StepContext.class,i);
		}
		public List<TerminalNode> OF() { return getTokens(FrenchParser.OF); }
		public TerminalNode OF(int i) {
			return getToken(FrenchParser.OF, i);
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
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterNavExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitNavExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitNavExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NavExpressionContext navExpression() throws RecognitionException {
		NavExpressionContext _localctx = new NavExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_navExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(231);
					step();
					setState(232);
					match(OF);
					}
					} 
				}
				setState(238);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(239);
			primitive();
			setState(241);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(240);
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

	public static class StepContext extends ParserRuleContext {
		public AttributeNavExpressionContext attributeNavExpression() {
			return getRuleContext(AttributeNavExpressionContext.class,0);
		}
		public AtPreExpressionContext atPreExpression() {
			return getRuleContext(AtPreExpressionContext.class,0);
		}
		public AsTypeExpressionContext asTypeExpression() {
			return getRuleContext(AsTypeExpressionContext.class,0);
		}
		public MethodNavExpressionContext methodNavExpression() {
			return getRuleContext(MethodNavExpressionContext.class,0);
		}
		public CollectionMethodNavExpressionContext collectionMethodNavExpression() {
			return getRuleContext(CollectionMethodNavExpressionContext.class,0);
		}
		public StepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_step; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StepContext step() throws RecognitionException {
		StepContext _localctx = new StepContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_step);
		try {
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				attributeNavExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				atPreExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(245);
				asTypeExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(246);
				methodNavExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(247);
				collectionMethodNavExpression();
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
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterFinalStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitFinalStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitFinalStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinalStepContext finalStep() throws RecognitionException {
		FinalStepContext _localctx = new FinalStepContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_finalStep);
		try {
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				oclIsNew();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				oclIsTypeOf();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				oclIsKindOf();
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

	public static class OclIsNewContext extends ParserRuleContext {
		public TerminalNode IS() { return getToken(FrenchParser.IS, 0); }
		public TerminalNode NEW() { return getToken(FrenchParser.NEW, 0); }
		public OclIsNewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oclIsNew; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterOclIsNew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitOclIsNew(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitOclIsNew(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OclIsNewContext oclIsNew() throws RecognitionException {
		OclIsNewContext _localctx = new OclIsNewContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_oclIsNew);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(IS);
			setState(256);
			match(NEW);
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
		public TerminalNode IS() { return getToken(FrenchParser.IS, 0); }
		public TerminalNode OF() { return getToken(FrenchParser.OF, 0); }
		public TerminalNode TYPE() { return getToken(FrenchParser.TYPE, 0); }
		public NlExpressionContext nlExpression() {
			return getRuleContext(NlExpressionContext.class,0);
		}
		public OclIsTypeOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oclIsTypeOf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterOclIsTypeOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitOclIsTypeOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitOclIsTypeOf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OclIsTypeOfContext oclIsTypeOf() throws RecognitionException {
		OclIsTypeOfContext _localctx = new OclIsTypeOfContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_oclIsTypeOf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(IS);
			setState(259);
			match(OF);
			setState(260);
			match(TYPE);
			setState(261);
			nlExpression();
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
		public TerminalNode IS() { return getToken(FrenchParser.IS, 0); }
		public TerminalNode OF() { return getToken(FrenchParser.OF, 0); }
		public TerminalNode KIND() { return getToken(FrenchParser.KIND, 0); }
		public NlExpressionContext nlExpression() {
			return getRuleContext(NlExpressionContext.class,0);
		}
		public OclIsKindOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oclIsKindOf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterOclIsKindOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitOclIsKindOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitOclIsKindOf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OclIsKindOfContext oclIsKindOf() throws RecognitionException {
		OclIsKindOfContext _localctx = new OclIsKindOfContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_oclIsKindOf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(IS);
			setState(264);
			match(OF);
			setState(265);
			match(KIND);
			setState(266);
			nlExpression();
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
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterPrimitive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitPrimitive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitPrimitive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveContext primitive() throws RecognitionException {
		PrimitiveContext _localctx = new PrimitiveContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_primitive);
		try {
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				selfExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				variableOrMember();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(270);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OF() { return getToken(FrenchParser.OF, 0); }
		public AttributeNavExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeNavExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterAttributeNavExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitAttributeNavExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitAttributeNavExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeNavExpressionContext attributeNavExpression() throws RecognitionException {
		AttributeNavExpressionContext _localctx = new AttributeNavExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_attributeNavExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			identifier();
			setState(274);
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

	public static class AtPreExpressionContext extends ParserRuleContext {
		public TerminalNode INITIAL() { return getToken(FrenchParser.INITIAL, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode THE() { return getToken(FrenchParser.THE, 0); }
		public TerminalNode A() { return getToken(FrenchParser.A, 0); }
		public AtPreExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atPreExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterAtPreExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitAtPreExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitAtPreExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtPreExpressionContext atPreExpression() throws RecognitionException {
		AtPreExpressionContext _localctx = new AtPreExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_atPreExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_la = _input.LA(1);
			if ( !(_la==THE || _la==A) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(277);
			match(INITIAL);
			setState(278);
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

	public static class AsTypeExpressionContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(FrenchParser.AS, 0); }
		public TerminalNode TYPE() { return getToken(FrenchParser.TYPE, 0); }
		public NlExpressionContext nlExpression() {
			return getRuleContext(NlExpressionContext.class,0);
		}
		public AsTypeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asTypeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterAsTypeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitAsTypeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitAsTypeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsTypeExpressionContext asTypeExpression() throws RecognitionException {
		AsTypeExpressionContext _localctx = new AsTypeExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_asTypeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(AS);
			setState(281);
			match(TYPE);
			setState(282);
			nlExpression();
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
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode OF() { return getToken(FrenchParser.OF, 0); }
		public MethodNavExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodNavExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterMethodNavExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitMethodNavExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitMethodNavExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodNavExpressionContext methodNavExpression() throws RecognitionException {
		MethodNavExpressionContext _localctx = new MethodNavExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_methodNavExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			functionCall();
			setState(285);
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

	public static class CollectionMethodNavExpressionContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode OF() { return getToken(FrenchParser.OF, 0); }
		public CollectionMethodNavExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collectionMethodNavExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterCollectionMethodNavExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitCollectionMethodNavExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitCollectionMethodNavExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectionMethodNavExpressionContext collectionMethodNavExpression() throws RecognitionException {
		CollectionMethodNavExpressionContext _localctx = new CollectionMethodNavExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_collectionMethodNavExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			functionCall();
			setState(288);
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

	public static class VariableOrMemberContext extends ParserRuleContext {
		public TerminalNode THE() { return getToken(FrenchParser.THE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VariableOrMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableOrMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterVariableOrMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitVariableOrMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitVariableOrMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableOrMemberContext variableOrMember() throws RecognitionException {
		VariableOrMemberContext _localctx = new VariableOrMemberContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_variableOrMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(THE);
			setState(291);
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
		public TerminalNode THE() { return getToken(FrenchParser.THE, 0); }
		public TerminalNode INITIAL() { return getToken(FrenchParser.INITIAL, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VariableOrMemberAtPreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableOrMemberAtPre; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterVariableOrMemberAtPre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitVariableOrMemberAtPre(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitVariableOrMemberAtPre(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableOrMemberAtPreContext variableOrMemberAtPre() throws RecognitionException {
		VariableOrMemberAtPreContext _localctx = new VariableOrMemberAtPreContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_variableOrMemberAtPre);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(THE);
			setState(294);
			match(INITIAL);
			setState(295);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(FrenchParser.LPAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FrenchParser.RPAREN, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			identifier();
			setState(298);
			match(LPAREN);
			setState(299);
			parameterList();
			setState(300);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(FrenchParser.COLON, 0); }
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public VariableDeclarationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterVariableDeclarationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitVariableDeclarationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitVariableDeclarationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationExpressionContext variableDeclarationExpression() throws RecognitionException {
		VariableDeclarationExpressionContext _localctx = new VariableDeclarationExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_variableDeclarationExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			identifier();
			setState(305);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(303);
				match(COLON);
				setState(304);
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
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterTypeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitTypeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitTypeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeExpressionContext typeExpression() throws RecognitionException {
		TypeExpressionContext _localctx = new TypeExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_typeExpression);
		try {
			setState(312);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				atomicTypeExpression();
				}
				break;
			case SEQUENCE:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				sequenceTypeExpression();
				}
				break;
			case BAG:
				enterOuterAlt(_localctx, 3);
				{
				setState(309);
				bagTypeExpression();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 4);
				{
				setState(310);
				setTypeExpression();
				}
				break;
			case ORDERED:
				enterOuterAlt(_localctx, 5);
				{
				setState(311);
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
		public TerminalNode Identifier() { return getToken(FrenchParser.Identifier, 0); }
		public AtomicTypeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicTypeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterAtomicTypeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitAtomicTypeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitAtomicTypeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomicTypeExpressionContext atomicTypeExpression() throws RecognitionException {
		AtomicTypeExpressionContext _localctx = new AtomicTypeExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_atomicTypeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
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
		public TerminalNode SEQUENCE() { return getToken(FrenchParser.SEQUENCE, 0); }
		public TerminalNode LPAREN() { return getToken(FrenchParser.LPAREN, 0); }
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FrenchParser.RPAREN, 0); }
		public SequenceTypeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequenceTypeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterSequenceTypeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitSequenceTypeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitSequenceTypeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequenceTypeExpressionContext sequenceTypeExpression() throws RecognitionException {
		SequenceTypeExpressionContext _localctx = new SequenceTypeExpressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_sequenceTypeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(SEQUENCE);
			setState(317);
			match(LPAREN);
			setState(318);
			typeExpression();
			setState(319);
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
		public TerminalNode BAG() { return getToken(FrenchParser.BAG, 0); }
		public TerminalNode LPAREN() { return getToken(FrenchParser.LPAREN, 0); }
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FrenchParser.RPAREN, 0); }
		public BagTypeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bagTypeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterBagTypeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitBagTypeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitBagTypeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BagTypeExpressionContext bagTypeExpression() throws RecognitionException {
		BagTypeExpressionContext _localctx = new BagTypeExpressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_bagTypeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(BAG);
			setState(322);
			match(LPAREN);
			setState(323);
			typeExpression();
			setState(324);
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
		public TerminalNode SET() { return getToken(FrenchParser.SET, 0); }
		public TerminalNode LPAREN() { return getToken(FrenchParser.LPAREN, 0); }
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FrenchParser.RPAREN, 0); }
		public SetTypeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setTypeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterSetTypeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitSetTypeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitSetTypeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetTypeExpressionContext setTypeExpression() throws RecognitionException {
		SetTypeExpressionContext _localctx = new SetTypeExpressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_setTypeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(SET);
			setState(327);
			match(LPAREN);
			setState(328);
			typeExpression();
			setState(329);
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
		public TerminalNode ORDERED() { return getToken(FrenchParser.ORDERED, 0); }
		public TerminalNode SET() { return getToken(FrenchParser.SET, 0); }
		public TerminalNode LPAREN() { return getToken(FrenchParser.LPAREN, 0); }
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FrenchParser.RPAREN, 0); }
		public OrderedSetTypeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedSetTypeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterOrderedSetTypeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitOrderedSetTypeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitOrderedSetTypeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderedSetTypeExpressionContext orderedSetTypeExpression() throws RecognitionException {
		OrderedSetTypeExpressionContext _localctx = new OrderedSetTypeExpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_orderedSetTypeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(ORDERED);
			setState(332);
			match(SET);
			setState(333);
			match(LPAREN);
			setState(334);
			typeExpression();
			setState(335);
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
		public TerminalNode SUB() { return getToken(FrenchParser.SUB, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public OppExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oppExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterOppExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitOppExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitOppExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OppExpressionContext oppExpression() throws RecognitionException {
		OppExpressionContext _localctx = new OppExpressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_oppExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(SUB);
			setState(338);
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
		public TerminalNode THIS() { return getToken(FrenchParser.THIS, 0); }
		public TerminalNode Identifier() { return getToken(FrenchParser.Identifier, 0); }
		public SelfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterSelfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitSelfExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitSelfExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfExpressionContext selfExpression() throws RecognitionException {
		SelfExpressionContext _localctx = new SelfExpressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_selfExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(THIS);
			setState(341);
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

	public static class VariableReferenceContext extends ParserRuleContext {
		public TerminalNode THE() { return getToken(FrenchParser.THE, 0); }
		public TerminalNode Identifier() { return getToken(FrenchParser.Identifier, 0); }
		public VariableReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterVariableReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitVariableReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitVariableReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableReferenceContext variableReference() throws RecognitionException {
		VariableReferenceContext _localctx = new VariableReferenceContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_variableReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(THE);
			setState(344);
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
		public List<NlExpressionContext> nlExpression() {
			return getRuleContexts(NlExpressionContext.class);
		}
		public NlExpressionContext nlExpression(int i) {
			return getRuleContext(NlExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FrenchParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FrenchParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_parameterList);
		try {
			int _alt;
			setState(356);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case FloatingPointLiteral:
			case DateLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case NOT:
			case SUB:
			case THE:
			case THIS:
			case A:
			case AS:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(351);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(346);
						nlExpression();
						setState(347);
						match(COMMA);
						}
						} 
					}
					setState(353);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				setState(354);
				nlExpression();
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
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_literal);
		try {
			setState(364);
			switch (_input.LA(1)) {
			case IntegerLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				integerLiteral();
				}
				break;
			case FloatingPointLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				floatingPointLiteral();
				}
				break;
			case DateLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(360);
				dateLiteral();
				}
				break;
			case CharacterLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(361);
				characterLiteral();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(362);
				stringLiteral();
				}
				break;
			case NullLiteral:
				enterOuterAlt(_localctx, 6);
				{
				setState(363);
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
		public TerminalNode Identifier() { return getToken(FrenchParser.Identifier, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
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
		public TerminalNode IntegerLiteral() { return getToken(FrenchParser.IntegerLiteral, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_integerLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
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
		public TerminalNode FloatingPointLiteral() { return getToken(FrenchParser.FloatingPointLiteral, 0); }
		public FloatingPointLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingPointLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterFloatingPointLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitFloatingPointLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitFloatingPointLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatingPointLiteralContext floatingPointLiteral() throws RecognitionException {
		FloatingPointLiteralContext _localctx = new FloatingPointLiteralContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_floatingPointLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
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

	public static class DateLiteralContext extends ParserRuleContext {
		public TerminalNode DateLiteral() { return getToken(FrenchParser.DateLiteral, 0); }
		public DateLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterDateLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitDateLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitDateLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateLiteralContext dateLiteral() throws RecognitionException {
		DateLiteralContext _localctx = new DateLiteralContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_dateLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
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
		public TerminalNode CharacterLiteral() { return getToken(FrenchParser.CharacterLiteral, 0); }
		public CharacterLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterCharacterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitCharacterLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitCharacterLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterLiteralContext characterLiteral() throws RecognitionException {
		CharacterLiteralContext _localctx = new CharacterLiteralContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_characterLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
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
		public TerminalNode StringLiteral() { return getToken(FrenchParser.StringLiteral, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
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
		public TerminalNode NullLiteral() { return getToken(FrenchParser.NullLiteral, 0); }
		public NullLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrenchParserListener ) ((FrenchParserListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrenchParserVisitor ) return ((FrenchParserVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullLiteralContext nullLiteral() throws RecognitionException {
		NullLiteralContext _localctx = new NullLiteralContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_nullLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3J\u017f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\3\3\3\3"+
		"\3\7\3z\n\3\f\3\16\3}\13\3\3\3\3\3\3\4\3\4\3\4\7\4\u0084\n\4\f\4\16\4"+
		"\u0087\13\4\3\4\3\4\3\5\3\5\3\5\7\5\u008e\n\5\f\5\16\5\u0091\13\5\3\5"+
		"\3\5\3\6\3\6\5\6\u0097\n\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\b\u00a1\n"+
		"\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\5\r\u00b6\n\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\7\20\u00c3\n\20\f\20\16\20\u00c6\13\20\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u00d2\n\23\f\23\16\23\u00d5\13\23"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\5\27"+
		"\u00e4\n\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\7\31\u00ed\n\31\f\31\16"+
		"\31\u00f0\13\31\3\31\3\31\5\31\u00f4\n\31\3\32\3\32\3\32\3\32\3\32\5\32"+
		"\u00fb\n\32\3\33\3\33\3\33\5\33\u0100\n\33\3\34\3\34\3\34\3\35\3\35\3"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\5\37\u0112\n\37"+
		"\3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3"+
		"&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\5(\u0134\n(\3)\3)\3)\3)\3)\5)\u013b"+
		"\n)\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3."+
		"\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\7\62\u0160\n"+
		"\62\f\62\16\62\u0163\13\62\3\62\3\62\5\62\u0167\n\62\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\5\63\u016f\n\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67"+
		"\38\38\39\39\3:\3:\3:\2\2;\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnpr\2\3\4\2;;==\u016d\2t"+
		"\3\2\2\2\4{\3\2\2\2\6\u0085\3\2\2\2\b\u008f\3\2\2\2\n\u0096\3\2\2\2\f"+
		"\u0098\3\2\2\2\16\u00a0\3\2\2\2\20\u00a2\3\2\2\2\22\u00a6\3\2\2\2\24\u00aa"+
		"\3\2\2\2\26\u00ae\3\2\2\2\30\u00b5\3\2\2\2\32\u00b7\3\2\2\2\34\u00bb\3"+
		"\2\2\2\36\u00bf\3\2\2\2 \u00c7\3\2\2\2\"\u00ca\3\2\2\2$\u00cd\3\2\2\2"+
		"&\u00d6\3\2\2\2(\u00d9\3\2\2\2*\u00dc\3\2\2\2,\u00e3\3\2\2\2.\u00e5\3"+
		"\2\2\2\60\u00ee\3\2\2\2\62\u00fa\3\2\2\2\64\u00ff\3\2\2\2\66\u0101\3\2"+
		"\2\28\u0104\3\2\2\2:\u0109\3\2\2\2<\u0111\3\2\2\2>\u0113\3\2\2\2@\u0116"+
		"\3\2\2\2B\u011a\3\2\2\2D\u011e\3\2\2\2F\u0121\3\2\2\2H\u0124\3\2\2\2J"+
		"\u0127\3\2\2\2L\u012b\3\2\2\2N\u0130\3\2\2\2P\u013a\3\2\2\2R\u013c\3\2"+
		"\2\2T\u013e\3\2\2\2V\u0143\3\2\2\2X\u0148\3\2\2\2Z\u014d\3\2\2\2\\\u0153"+
		"\3\2\2\2^\u0156\3\2\2\2`\u0159\3\2\2\2b\u0166\3\2\2\2d\u016e\3\2\2\2f"+
		"\u0170\3\2\2\2h\u0172\3\2\2\2j\u0174\3\2\2\2l\u0176\3\2\2\2n\u0178\3\2"+
		"\2\2p\u017a\3\2\2\2r\u017c\3\2\2\2tu\5\4\3\2u\3\3\2\2\2vw\5\6\4\2wx\7"+
		"#\2\2xz\3\2\2\2yv\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3"+
		"\2\2\2~\177\5\6\4\2\177\5\3\2\2\2\u0080\u0081\5\b\5\2\u0081\u0082\7\""+
		"\2\2\u0082\u0084\3\2\2\2\u0083\u0080\3\2\2\2\u0084\u0087\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2"+
		"\2\2\u0088\u0089\5\b\5\2\u0089\7\3\2\2\2\u008a\u008b\5\n\6\2\u008b\u008c"+
		"\7!\2\2\u008c\u008e\3\2\2\2\u008d\u008a\3\2\2\2\u008e\u0091\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2"+
		"\2\2\u0092\u0093\5\n\6\2\u0093\t\3\2\2\2\u0094\u0097\5\f\7\2\u0095\u0097"+
		"\5\16\b\2\u0096\u0094\3\2\2\2\u0096\u0095\3\2\2\2\u0097\13\3\2\2\2\u0098"+
		"\u0099\7\30\2\2\u0099\u009a\5\16\b\2\u009a\r\3\2\2\2\u009b\u00a1\5\20"+
		"\t\2\u009c\u00a1\5\22\n\2\u009d\u00a1\5\24\13\2\u009e\u00a1\5\26\f\2\u009f"+
		"\u00a1\5\30\r\2\u00a0\u009b\3\2\2\2\u00a0\u009c\3\2\2\2\u00a0\u009d\3"+
		"\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\17\3\2\2\2\u00a2"+
		"\u00a3\5\30\r\2\u00a3\u00a4\7\26\2\2\u00a4\u00a5\5\30\r\2\u00a5\21\3\2"+
		"\2\2\u00a6\u00a7\5\30\r\2\u00a7\u00a8\7\37\2\2\u00a8\u00a9\5\30\r\2\u00a9"+
		"\23\3\2\2\2\u00aa\u00ab\5\30\r\2\u00ab\u00ac\7\27\2\2\u00ac\u00ad\5\30"+
		"\r\2\u00ad\25\3\2\2\2\u00ae\u00af\5\30\r\2\u00af\u00b0\7\36\2\2\u00b0"+
		"\u00b1\5\30\r\2\u00b1\27\3\2\2\2\u00b2\u00b6\5\32\16\2\u00b3\u00b6\5\34"+
		"\17\2\u00b4\u00b6\5\36\20\2\u00b5\u00b2\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5"+
		"\u00b4\3\2\2\2\u00b6\31\3\2\2\2\u00b7\u00b8\5\36\20\2\u00b8\u00b9\7\35"+
		"\2\2\u00b9\u00ba\5\36\20\2\u00ba\33\3\2\2\2\u00bb\u00bc\5\36\20\2\u00bc"+
		"\u00bd\7 \2\2\u00bd\u00be\5\36\20\2\u00be\35\3\2\2\2\u00bf\u00c4\5$\23"+
		"\2\u00c0\u00c3\5 \21\2\u00c1\u00c3\5\"\22\2\u00c2\u00c0\3\2\2\2\u00c2"+
		"\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5\37\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\7$\2\2\u00c8\u00c9"+
		"\5$\23\2\u00c9!\3\2\2\2\u00ca\u00cb\7%\2\2\u00cb\u00cc\5$\23\2\u00cc#"+
		"\3\2\2\2\u00cd\u00d3\5,\27\2\u00ce\u00d2\5&\24\2\u00cf\u00d2\5(\25\2\u00d0"+
		"\u00d2\5*\26\2\u00d1\u00ce\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d0\3\2"+
		"\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"%\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7\7&\2\2\u00d7\u00d8\5,\27\2\u00d8"+
		"\'\3\2\2\2\u00d9\u00da\7\'\2\2\u00da\u00db\5,\27\2\u00db)\3\2\2\2\u00dc"+
		"\u00dd\7*\2\2\u00dd\u00de\5,\27\2\u00de+\3\2\2\2\u00df\u00e4\5\\/\2\u00e0"+
		"\u00e4\5\60\31\2\u00e1\u00e4\5d\63\2\u00e2\u00e4\5.\30\2\u00e3\u00df\3"+
		"\2\2\2\u00e3\u00e0\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4"+
		"-\3\2\2\2\u00e5\u00e6\7\t\2\2\u00e6\u00e7\5\2\2\2\u00e7\u00e8\7\n\2\2"+
		"\u00e8/\3\2\2\2\u00e9\u00ea\5\62\32\2\u00ea\u00eb\7\65\2\2\u00eb\u00ed"+
		"\3\2\2\2\u00ec\u00e9\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f3\5<"+
		"\37\2\u00f2\u00f4\5\64\33\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\61\3\2\2\2\u00f5\u00fb\5> \2\u00f6\u00fb\5@!\2\u00f7\u00fb\5B\"\2\u00f8"+
		"\u00fb\5D#\2\u00f9\u00fb\5F$\2\u00fa\u00f5\3\2\2\2\u00fa\u00f6\3\2\2\2"+
		"\u00fa\u00f7\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb\63"+
		"\3\2\2\2\u00fc\u0100\5\66\34\2\u00fd\u0100\58\35\2\u00fe\u0100\5:\36\2"+
		"\u00ff\u00fc\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100\65"+
		"\3\2\2\2\u0101\u0102\79\2\2\u0102\u0103\7:\2\2\u0103\67\3\2\2\2\u0104"+
		"\u0105\79\2\2\u0105\u0106\7\65\2\2\u0106\u0107\7?\2\2\u0107\u0108\5\2"+
		"\2\2\u01089\3\2\2\2\u0109\u010a\79\2\2\u010a\u010b\7\65\2\2\u010b\u010c"+
		"\7@\2\2\u010c\u010d\5\2\2\2\u010d;\3\2\2\2\u010e\u0112\5^\60\2\u010f\u0112"+
		"\5H%\2\u0110\u0112\5J&\2\u0111\u010e\3\2\2\2\u0111\u010f\3\2\2\2\u0111"+
		"\u0110\3\2\2\2\u0112=\3\2\2\2\u0113\u0114\5f\64\2\u0114\u0115\7\65\2\2"+
		"\u0115?\3\2\2\2\u0116\u0117\t\2\2\2\u0117\u0118\78\2\2\u0118\u0119\5f"+
		"\64\2\u0119A\3\2\2\2\u011a\u011b\7A\2\2\u011b\u011c\7?\2\2\u011c\u011d"+
		"\5\2\2\2\u011dC\3\2\2\2\u011e\u011f\5L\'\2\u011f\u0120\7\65\2\2\u0120"+
		"E\3\2\2\2\u0121\u0122\5L\'\2\u0122\u0123\7\65\2\2\u0123G\3\2\2\2\u0124"+
		"\u0125\7;\2\2\u0125\u0126\5f\64\2\u0126I\3\2\2\2\u0127\u0128\7;\2\2\u0128"+
		"\u0129\78\2\2\u0129\u012a\5f\64\2\u012aK\3\2\2\2\u012b\u012c\5f\64\2\u012c"+
		"\u012d\7\t\2\2\u012d\u012e\5b\62\2\u012e\u012f\7\n\2\2\u012fM\3\2\2\2"+
		"\u0130\u0133\5f\64\2\u0131\u0132\7\33\2\2\u0132\u0134\5P)\2\u0133\u0131"+
		"\3\2\2\2\u0133\u0134\3\2\2\2\u0134O\3\2\2\2\u0135\u013b\5R*\2\u0136\u013b"+
		"\5T+\2\u0137\u013b\5V,\2\u0138\u013b\5X-\2\u0139\u013b\5Z.\2\u013a\u0135"+
		"\3\2\2\2\u013a\u0136\3\2\2\2\u013a\u0137\3\2\2\2\u013a\u0138\3\2\2\2\u013a"+
		"\u0139\3\2\2\2\u013bQ\3\2\2\2\u013c\u013d\7G\2\2\u013dS\3\2\2\2\u013e"+
		"\u013f\7D\2\2\u013f\u0140\7\t\2\2\u0140\u0141\5P)\2\u0141\u0142\7\n\2"+
		"\2\u0142U\3\2\2\2\u0143\u0144\7E\2\2\u0144\u0145\7\t\2\2\u0145\u0146\5"+
		"P)\2\u0146\u0147\7\n\2\2\u0147W\3\2\2\2\u0148\u0149\7F\2\2\u0149\u014a"+
		"\7\t\2\2\u014a\u014b\5P)\2\u014b\u014c\7\n\2\2\u014cY\3\2\2\2\u014d\u014e"+
		"\7B\2\2\u014e\u014f\7F\2\2\u014f\u0150\7\t\2\2\u0150\u0151\5P)\2\u0151"+
		"\u0152\7\n\2\2\u0152[\3\2\2\2\u0153\u0154\7%\2\2\u0154\u0155\5,\27\2\u0155"+
		"]\3\2\2\2\u0156\u0157\7<\2\2\u0157\u0158\7G\2\2\u0158_\3\2\2\2\u0159\u015a"+
		"\7;\2\2\u015a\u015b\7G\2\2\u015ba\3\2\2\2\u015c\u015d\5\2\2\2\u015d\u015e"+
		"\7\21\2\2\u015e\u0160\3\2\2\2\u015f\u015c\3\2\2\2\u0160\u0163\3\2\2\2"+
		"\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0164\3\2\2\2\u0163\u0161"+
		"\3\2\2\2\u0164\u0167\5\2\2\2\u0165\u0167\3\2\2\2\u0166\u0161\3\2\2\2\u0166"+
		"\u0165\3\2\2\2\u0167c\3\2\2\2\u0168\u016f\5h\65\2\u0169\u016f\5j\66\2"+
		"\u016a\u016f\5l\67\2\u016b\u016f\5n8\2\u016c\u016f\5p9\2\u016d\u016f\5"+
		"r:\2\u016e\u0168\3\2\2\2\u016e\u0169\3\2\2\2\u016e\u016a\3\2\2\2\u016e"+
		"\u016b\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016d\3\2\2\2\u016fe\3\2\2\2"+
		"\u0170\u0171\7G\2\2\u0171g\3\2\2\2\u0172\u0173\7\3\2\2\u0173i\3\2\2\2"+
		"\u0174\u0175\7\4\2\2\u0175k\3\2\2\2\u0176\u0177\7\5\2\2\u0177m\3\2\2\2"+
		"\u0178\u0179\7\6\2\2\u0179o\3\2\2\2\u017a\u017b\7\7\2\2\u017bq\3\2\2\2"+
		"\u017c\u017d\7\b\2\2\u017ds\3\2\2\2\27{\u0085\u008f\u0096\u00a0\u00b5"+
		"\u00c2\u00c4\u00d1\u00d3\u00e3\u00ee\u00f3\u00fa\u00ff\u0111\u0133\u013a"+
		"\u0161\u0166\u016e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}