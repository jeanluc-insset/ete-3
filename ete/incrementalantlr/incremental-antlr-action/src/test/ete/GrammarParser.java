// Generated from src/test/ete/GrammarParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BACKGROUND=1, COLON=2, SUB=3, INVARIANT=4, DOT=5, DEFINITION=6, DOUBLE_COLON=7, 
		PRECONDITION=8, POSTCONDITION=9, THE=10, A=11, IS=12, LIST_MARK=13, IMPLIES=14, 
		IS_EQUIVALENT_TO=15, XOR=16, OR=17, AND=18, NOT=19, GT=20, GE=21, LT=22, 
		LE=23, EQUAL=24, NOTEQUAL=25, ADD=26, MUL=27, DIV=28, MOD=29, INCLUDES=30, 
		EXCLUDES=31, SELECT=32, EXISTS=33, IN=34, OF=35, ATPRE=36, NEW=37, THIS=38, 
		COMMA=39, FOR=40, WITH=41, BY=42, Identifier=43, IntegerLiteral=44, FloatingPointLiteral=45, 
		TRUE=46, FALSE=47, DateLiteral=48, CharacterLiteral=49, StringLiteral=50, 
		NullLiteral=51;
	public static final int
		RULE_nlExpression = 0, RULE_navExpression = 1, RULE_atPreExpression = 2, 
		RULE_constraintFile = 3, RULE_contextualConstraints = 4, RULE_class_context = 5, 
		RULE_invariant = 6, RULE_operationDefinition = 7, RULE_operationName = 8, 
		RULE_attributeDefinition = 9, RULE_operationContext = 10, RULE_condition = 11, 
		RULE_name = 12, RULE_list_mark = 13, RULE_impliesExpression = 14, RULE_xorExpression = 15, 
		RULE_orExpression = 16, RULE_andExpression = 17, RULE_notOrNotNotExpression = 18, 
		RULE_notExpression = 19, RULE_affirmativeExpression = 20, RULE_greaterThanExpression = 21, 
		RULE_greaterOrEqualExpression = 22, RULE_lessThanExpression = 23, RULE_lessOrEqualExpression = 24, 
		RULE_compareExpression = 25, RULE_equalExpression = 26, RULE_differentExpression = 27, 
		RULE_addOrSubExpression = 28, RULE_multOrDivExpression = 29, RULE_multExpression = 30, 
		RULE_divExpression = 31, RULE_modExpression = 32, RULE_operand = 33, RULE_includesExpression = 34, 
		RULE_excludesExpression = 35, RULE_selectExpression = 36, RULE_existsExpression = 37, 
		RULE_navExpressionRightToLeft = 38, RULE_navExpressionLeftToRight = 39, 
		RULE_prefixedAtPreExpression = 40, RULE_postfixedAtPreExpression = 41, 
		RULE_currentExpression = 42, RULE_step = 43, RULE_finalStep = 44, RULE_oclIsNew = 45, 
		RULE_oppExpression = 46, RULE_selfExpression = 47, RULE_variableReference = 48, 
		RULE_parameterList = 49, RULE_preposition = 50, RULE_literal = 51, RULE_identifier = 52, 
		RULE_word = 53, RULE_integerLiteral = 54, RULE_floatingPointLiteral = 55, 
		RULE_booleanLiteral = 56, RULE_dateLiteral = 57, RULE_characterLiteral = 58, 
		RULE_stringLiteral = 59, RULE_nullLiteral = 60;
	public static final String[] ruleNames = {
		"nlExpression", "navExpression", "atPreExpression", "constraintFile", 
		"contextualConstraints", "class_context", "invariant", "operationDefinition", 
		"operationName", "attributeDefinition", "operationContext", "condition", 
		"name", "list_mark", "impliesExpression", "xorExpression", "orExpression", 
		"andExpression", "notOrNotNotExpression", "notExpression", "affirmativeExpression", 
		"greaterThanExpression", "greaterOrEqualExpression", "lessThanExpression", 
		"lessOrEqualExpression", "compareExpression", "equalExpression", "differentExpression", 
		"addOrSubExpression", "multOrDivExpression", "multExpression", "divExpression", 
		"modExpression", "operand", "includesExpression", "excludesExpression", 
		"selectExpression", "existsExpression", "navExpressionRightToLeft", "navExpressionLeftToRight", 
		"prefixedAtPreExpression", "postfixedAtPreExpression", "currentExpression", 
		"step", "finalStep", "oclIsNew", "oppExpression", "selfExpression", "variableReference", 
		"parameterList", "preposition", "literal", "identifier", "word", "integerLiteral", 
		"floatingPointLiteral", "booleanLiteral", "dateLiteral", "characterLiteral", 
		"stringLiteral", "nullLiteral"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BACKGROUND", "COLON", "SUB", "INVARIANT", "DOT", "DEFINITION", 
		"DOUBLE_COLON", "PRECONDITION", "POSTCONDITION", "THE", "A", "IS", "LIST_MARK", 
		"IMPLIES", "IS_EQUIVALENT_TO", "XOR", "OR", "AND", "NOT", "GT", "GE", 
		"LT", "LE", "EQUAL", "NOTEQUAL", "ADD", "MUL", "DIV", "MOD", "INCLUDES", 
		"EXCLUDES", "SELECT", "EXISTS", "IN", "OF", "ATPRE", "NEW", "THIS", "COMMA", 
		"FOR", "WITH", "BY", "Identifier", "IntegerLiteral", "FloatingPointLiteral", 
		"TRUE", "FALSE", "DateLiteral", "CharacterLiteral", "StringLiteral", "NullLiteral"
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
	public String getGrammarFileName() { return "GrammarParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class NlExpressionContext extends ParserRuleContext {
		public NlExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nlExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterNlExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitNlExpression(this);
		}
	}

	public final NlExpressionContext nlExpression() throws RecognitionException {
		NlExpressionContext _localctx = new NlExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_nlExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		public NavExpressionRightToLeftContext navExpressionRightToLeft() {
			return getRuleContext(NavExpressionRightToLeftContext.class,0);
		}
		public NavExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_navExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterNavExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitNavExpression(this);
		}
	}

	public final NavExpressionContext navExpression() throws RecognitionException {
		NavExpressionContext _localctx = new NavExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_navExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			navExpressionRightToLeft();
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
		public PostfixedAtPreExpressionContext postfixedAtPreExpression() {
			return getRuleContext(PostfixedAtPreExpressionContext.class,0);
		}
		public AtPreExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atPreExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterAtPreExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitAtPreExpression(this);
		}
	}

	public final AtPreExpressionContext atPreExpression() throws RecognitionException {
		AtPreExpressionContext _localctx = new AtPreExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_atPreExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			postfixedAtPreExpression();
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

	public static class ConstraintFileContext extends ParserRuleContext {
		public List<OperationDefinitionContext> operationDefinition() {
			return getRuleContexts(OperationDefinitionContext.class);
		}
		public OperationDefinitionContext operationDefinition(int i) {
			return getRuleContext(OperationDefinitionContext.class,i);
		}
		public List<AttributeDefinitionContext> attributeDefinition() {
			return getRuleContexts(AttributeDefinitionContext.class);
		}
		public AttributeDefinitionContext attributeDefinition(int i) {
			return getRuleContext(AttributeDefinitionContext.class,i);
		}
		public List<ContextualConstraintsContext> contextualConstraints() {
			return getRuleContexts(ContextualConstraintsContext.class);
		}
		public ContextualConstraintsContext contextualConstraints(int i) {
			return getRuleContext(ContextualConstraintsContext.class,i);
		}
		public ConstraintFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterConstraintFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitConstraintFile(this);
		}
	}

	public final ConstraintFileContext constraintFile() throws RecognitionException {
		ConstraintFileContext _localctx = new ConstraintFileContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_constraintFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BACKGROUND || _la==DEFINITION) {
				{
				setState(131);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(128);
					operationDefinition();
					}
					break;
				case 2:
					{
					setState(129);
					attributeDefinition();
					}
					break;
				case 3:
					{
					setState(130);
					contextualConstraints();
					}
					break;
				}
				}
				setState(135);
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

	public static class ContextualConstraintsContext extends ParserRuleContext {
		public Class_contextContext class_context() {
			return getRuleContext(Class_contextContext.class,0);
		}
		public List<OperationDefinitionContext> operationDefinition() {
			return getRuleContexts(OperationDefinitionContext.class);
		}
		public OperationDefinitionContext operationDefinition(int i) {
			return getRuleContext(OperationDefinitionContext.class,i);
		}
		public List<AttributeDefinitionContext> attributeDefinition() {
			return getRuleContexts(AttributeDefinitionContext.class);
		}
		public AttributeDefinitionContext attributeDefinition(int i) {
			return getRuleContext(AttributeDefinitionContext.class,i);
		}
		public List<InvariantContext> invariant() {
			return getRuleContexts(InvariantContext.class);
		}
		public InvariantContext invariant(int i) {
			return getRuleContext(InvariantContext.class,i);
		}
		public OperationContextContext operationContext() {
			return getRuleContext(OperationContextContext.class,0);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public ContextualConstraintsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contextualConstraints; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterContextualConstraints(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitContextualConstraints(this);
		}
	}

	public final ContextualConstraintsContext contextualConstraints() throws RecognitionException {
		ContextualConstraintsContext _localctx = new ContextualConstraintsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_contextualConstraints);
		int _la;
		try {
			int _alt;
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(136);
				class_context();
				setState(142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(140);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
						case 1:
							{
							setState(137);
							operationDefinition();
							}
							break;
						case 2:
							{
							setState(138);
							attributeDefinition();
							}
							break;
						case 3:
							{
							setState(139);
							invariant();
							}
							break;
						}
						} 
					}
					setState(144);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(145);
				operationContext();
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUB) | (1L << PRECONDITION) | (1L << POSTCONDITION))) != 0)) {
					{
					{
					setState(146);
					condition();
					}
					}
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class Class_contextContext extends ParserRuleContext {
		public TerminalNode BACKGROUND() { return getToken(GrammarParser.BACKGROUND, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GrammarParser.COLON, 0); }
		public Class_contextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_context; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterClass_context(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitClass_context(this);
		}
	}

	public final Class_contextContext class_context() throws RecognitionException {
		Class_contextContext _localctx = new Class_contextContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_class_context);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(BACKGROUND);
			setState(155);
			identifier();
			setState(156);
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

	public static class InvariantContext extends ParserRuleContext {
		public TerminalNode INVARIANT() { return getToken(GrammarParser.INVARIANT, 0); }
		public TerminalNode COLON() { return getToken(GrammarParser.COLON, 0); }
		public NlExpressionContext nlExpression() {
			return getRuleContext(NlExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(GrammarParser.DOT, 0); }
		public TerminalNode SUB() { return getToken(GrammarParser.SUB, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public InvariantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invariant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterInvariant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitInvariant(this);
		}
	}

	public final InvariantContext invariant() throws RecognitionException {
		InvariantContext _localctx = new InvariantContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_invariant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUB) {
				{
				setState(158);
				match(SUB);
				}
			}

			System.out.println("invariant start"); 
			setState(162);
			match(INVARIANT);
			System.out.println("in invariant head"); 
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THE) | (1L << A) | (1L << Identifier))) != 0)) {
				{
				setState(164);
				name();
				}
			}

			setState(167);
			match(COLON);
			System.out.println("inInvariant body"); 
			setState(169);
			nlExpression();
			setState(170);
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

	public static class OperationDefinitionContext extends ParserRuleContext {
		public TerminalNode DEFINITION() { return getToken(GrammarParser.DEFINITION, 0); }
		public OperationNameContext operationName() {
			return getRuleContext(OperationNameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GrammarParser.COLON, 0); }
		public NlExpressionContext nlExpression() {
			return getRuleContext(NlExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(GrammarParser.DOT, 0); }
		public OperationDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterOperationDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitOperationDefinition(this);
		}
	}

	public final OperationDefinitionContext operationDefinition() throws RecognitionException {
		OperationDefinitionContext _localctx = new OperationDefinitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_operationDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 System.out.println("operation definition");
			setState(173);
			match(DEFINITION);
			setState(174);
			operationName();
			setState(175);
			match(COLON);
			setState(176);
			nlExpression();
			setState(177);
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

	public static class OperationNameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public OperationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterOperationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitOperationName(this);
		}
	}

	public final OperationNameContext operationName() throws RecognitionException {
		OperationNameContext _localctx = new OperationNameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_operationName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 System.out.println("operation name");
			setState(180);
			name();
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

	public static class AttributeDefinitionContext extends ParserRuleContext {
		public TerminalNode DEFINITION() { return getToken(GrammarParser.DEFINITION, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(GrammarParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(GrammarParser.COLON, i);
		}
		public NlExpressionContext nlExpression() {
			return getRuleContext(NlExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(GrammarParser.DOT, 0); }
		public AttributeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterAttributeDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitAttributeDefinition(this);
		}
	}

	public final AttributeDefinitionContext attributeDefinition() throws RecognitionException {
		AttributeDefinitionContext _localctx = new AttributeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_attributeDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(DEFINITION);
			setState(183);
			identifier();
			setState(184);
			match(COLON);
			setState(185);
			identifier();
			setState(186);
			match(COLON);
			setState(187);
			nlExpression();
			setState(188);
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

	public static class OperationContextContext extends ParserRuleContext {
		public TerminalNode BACKGROUND() { return getToken(GrammarParser.BACKGROUND, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode DOUBLE_COLON() { return getToken(GrammarParser.DOUBLE_COLON, 0); }
		public TerminalNode COLON() { return getToken(GrammarParser.COLON, 0); }
		public OperationContextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationContext; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterOperationContext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitOperationContext(this);
		}
	}

	public final OperationContextContext operationContext() throws RecognitionException {
		OperationContextContext _localctx = new OperationContextContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_operationContext);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(BACKGROUND);
			setState(191);
			identifier();
			setState(192);
			match(DOUBLE_COLON);
			setState(193);
			identifier();
			setState(194);
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

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(GrammarParser.COLON, 0); }
		public NlExpressionContext nlExpression() {
			return getRuleContext(NlExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(GrammarParser.DOT, 0); }
		public TerminalNode PRECONDITION() { return getToken(GrammarParser.PRECONDITION, 0); }
		public TerminalNode POSTCONDITION() { return getToken(GrammarParser.POSTCONDITION, 0); }
		public TerminalNode SUB() { return getToken(GrammarParser.SUB, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUB) {
				{
				setState(196);
				match(SUB);
				}
			}

			setState(199);
			_la = _input.LA(1);
			if ( !(_la==PRECONDITION || _la==POSTCONDITION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THE) | (1L << A) | (1L << Identifier))) != 0)) {
				{
				setState(200);
				name();
				}
			}

			setState(203);
			match(COLON);
			setState(204);
			nlExpression();
			setState(205);
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

	public static class NameContext extends ParserRuleContext {
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<TerminalNode> THE() { return getTokens(GrammarParser.THE); }
		public TerminalNode THE(int i) {
			return getToken(GrammarParser.THE, i);
		}
		public List<TerminalNode> A() { return getTokens(GrammarParser.A); }
		public TerminalNode A(int i) {
			return getToken(GrammarParser.A, i);
		}
		public List<TerminalNode> IS() { return getTokens(GrammarParser.IS); }
		public TerminalNode IS(int i) {
			return getToken(GrammarParser.IS, i);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_name);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			 System.out.println("name");
			setState(218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(209);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						setState(208);
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
						break;
					}
					 System.out.println("a word");
					setState(212);
					word();
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IS) {
						{
						setState(213);
						match(IS);
						}
					}

					}
					} 
				}
				setState(220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(221);
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
				break;
			}
			 System.out.println("last word");
			setState(225);
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

	public static class List_markContext extends ParserRuleContext {
		public TerminalNode LIST_MARK() { return getToken(GrammarParser.LIST_MARK, 0); }
		public List_markContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_mark; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterList_mark(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitList_mark(this);
		}
	}

	public final List_markContext list_mark() throws RecognitionException {
		List_markContext _localctx = new List_markContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_list_mark);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(LIST_MARK);
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
		public List<XorExpressionContext> xorExpression() {
			return getRuleContexts(XorExpressionContext.class);
		}
		public XorExpressionContext xorExpression(int i) {
			return getRuleContext(XorExpressionContext.class,i);
		}
		public TerminalNode IMPLIES() { return getToken(GrammarParser.IMPLIES, 0); }
		public TerminalNode IS_EQUIVALENT_TO() { return getToken(GrammarParser.IS_EQUIVALENT_TO, 0); }
		public ImpliesExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impliesExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterImpliesExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitImpliesExpression(this);
		}
	}

	public final ImpliesExpressionContext impliesExpression() throws RecognitionException {
		ImpliesExpressionContext _localctx = new ImpliesExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_impliesExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			xorExpression();
			setState(230);
			match(IMPLIES);
			setState(231);
			xorExpression();
			setState(232);
			xorExpression();
			setState(233);
			match(IS_EQUIVALENT_TO);
			setState(234);
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
		public List<TerminalNode> XOR() { return getTokens(GrammarParser.XOR); }
		public TerminalNode XOR(int i) {
			return getToken(GrammarParser.XOR, i);
		}
		public XorExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xorExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterXorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitXorExpression(this);
		}
	}

	public final XorExpressionContext xorExpression() throws RecognitionException {
		XorExpressionContext _localctx = new XorExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_xorExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(236);
					orExpression();
					setState(237);
					match(XOR);
					}
					} 
				}
				setState(243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(244);
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
		public List<TerminalNode> OR() { return getTokens(GrammarParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(GrammarParser.OR, i);
		}
		public OrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitOrExpression(this);
		}
	}

	public final OrExpressionContext orExpression() throws RecognitionException {
		OrExpressionContext _localctx = new OrExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_orExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(246);
					andExpression();
					setState(247);
					match(OR);
					}
					} 
				}
				setState(253);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(254);
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
		public List<TerminalNode> AND() { return getTokens(GrammarParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(GrammarParser.AND, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitAndExpression(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_andExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(256);
					notOrNotNotExpression();
					setState(257);
					match(AND);
					}
					} 
				}
				setState(263);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(264);
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
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterNotOrNotNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitNotOrNotNotExpression(this);
		}
	}

	public final NotOrNotNotExpressionContext notOrNotNotExpression() throws RecognitionException {
		NotOrNotNotExpressionContext _localctx = new NotOrNotNotExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_notOrNotNotExpression);
		try {
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				notExpression();
				}
				break;
			case THE:
			case A:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
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
		public TerminalNode NOT() { return getToken(GrammarParser.NOT, 0); }
		public AffirmativeExpressionContext affirmativeExpression() {
			return getRuleContext(AffirmativeExpressionContext.class,0);
		}
		public NotExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitNotExpression(this);
		}
	}

	public final NotExpressionContext notExpression() throws RecognitionException {
		NotExpressionContext _localctx = new NotExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_notExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(NOT);
			setState(271);
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
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterAffirmativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitAffirmativeExpression(this);
		}
	}

	public final AffirmativeExpressionContext affirmativeExpression() throws RecognitionException {
		AffirmativeExpressionContext _localctx = new AffirmativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_affirmativeExpression);
		try {
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				greaterThanExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				greaterOrEqualExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(275);
				lessThanExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(276);
				lessOrEqualExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(277);
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
		public TerminalNode GT() { return getToken(GrammarParser.GT, 0); }
		public GreaterThanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greaterThanExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterGreaterThanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitGreaterThanExpression(this);
		}
	}

	public final GreaterThanExpressionContext greaterThanExpression() throws RecognitionException {
		GreaterThanExpressionContext _localctx = new GreaterThanExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_greaterThanExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			compareExpression();
			setState(281);
			match(GT);
			setState(282);
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
		public TerminalNode GE() { return getToken(GrammarParser.GE, 0); }
		public GreaterOrEqualExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greaterOrEqualExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterGreaterOrEqualExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitGreaterOrEqualExpression(this);
		}
	}

	public final GreaterOrEqualExpressionContext greaterOrEqualExpression() throws RecognitionException {
		GreaterOrEqualExpressionContext _localctx = new GreaterOrEqualExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_greaterOrEqualExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			compareExpression();
			setState(285);
			match(GE);
			setState(286);
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
		public TerminalNode LT() { return getToken(GrammarParser.LT, 0); }
		public LessThanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lessThanExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterLessThanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitLessThanExpression(this);
		}
	}

	public final LessThanExpressionContext lessThanExpression() throws RecognitionException {
		LessThanExpressionContext _localctx = new LessThanExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_lessThanExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			compareExpression();
			setState(289);
			match(LT);
			setState(290);
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
		public TerminalNode LE() { return getToken(GrammarParser.LE, 0); }
		public LessOrEqualExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lessOrEqualExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterLessOrEqualExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitLessOrEqualExpression(this);
		}
	}

	public final LessOrEqualExpressionContext lessOrEqualExpression() throws RecognitionException {
		LessOrEqualExpressionContext _localctx = new LessOrEqualExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_lessOrEqualExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			compareExpression();
			setState(293);
			match(LE);
			setState(294);
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
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterCompareExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitCompareExpression(this);
		}
	}

	public final CompareExpressionContext compareExpression() throws RecognitionException {
		CompareExpressionContext _localctx = new CompareExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_compareExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(296);
				equalExpression();
				}
				break;
			case 2:
				{
				setState(297);
				differentExpression();
				}
				break;
			case 3:
				{
				setState(298);
				addOrSubExpression();
				}
				break;
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

	public static class EqualExpressionContext extends ParserRuleContext {
		public List<AddOrSubExpressionContext> addOrSubExpression() {
			return getRuleContexts(AddOrSubExpressionContext.class);
		}
		public AddOrSubExpressionContext addOrSubExpression(int i) {
			return getRuleContext(AddOrSubExpressionContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(GrammarParser.EQUAL, 0); }
		public EqualExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterEqualExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitEqualExpression(this);
		}
	}

	public final EqualExpressionContext equalExpression() throws RecognitionException {
		EqualExpressionContext _localctx = new EqualExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_equalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			addOrSubExpression();
			setState(302);
			match(EQUAL);
			setState(303);
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
		public TerminalNode NOTEQUAL() { return getToken(GrammarParser.NOTEQUAL, 0); }
		public DifferentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_differentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterDifferentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitDifferentExpression(this);
		}
	}

	public final DifferentExpressionContext differentExpression() throws RecognitionException {
		DifferentExpressionContext _localctx = new DifferentExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_differentExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			addOrSubExpression();
			setState(306);
			match(NOTEQUAL);
			setState(307);
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
		public List<MultOrDivExpressionContext> multOrDivExpression() {
			return getRuleContexts(MultOrDivExpressionContext.class);
		}
		public MultOrDivExpressionContext multOrDivExpression(int i) {
			return getRuleContext(MultOrDivExpressionContext.class,i);
		}
		public List<TerminalNode> ADD() { return getTokens(GrammarParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(GrammarParser.ADD, i);
		}
		public List<TerminalNode> SUB() { return getTokens(GrammarParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(GrammarParser.SUB, i);
		}
		public AddOrSubExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addOrSubExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterAddOrSubExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitAddOrSubExpression(this);
		}
	}

	public final AddOrSubExpressionContext addOrSubExpression() throws RecognitionException {
		AddOrSubExpressionContext _localctx = new AddOrSubExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_addOrSubExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(309);
					multOrDivExpression();
					setState(310);
					_la = _input.LA(1);
					if ( !(_la==SUB || _la==ADD) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(316);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(317);
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
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterMultOrDivExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitMultOrDivExpression(this);
		}
	}

	public final MultOrDivExpressionContext multOrDivExpression() throws RecognitionException {
		MultOrDivExpressionContext _localctx = new MultOrDivExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_multOrDivExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(322);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						setState(319);
						multExpression();
						}
						break;
					case 2:
						{
						setState(320);
						divExpression();
						}
						break;
					case 3:
						{
						setState(321);
						modExpression();
						}
						break;
					}
					} 
				}
				setState(326);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(327);
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

	public static class MultExpressionContext extends ParserRuleContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public TerminalNode MUL() { return getToken(GrammarParser.MUL, 0); }
		public MultExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterMultExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitMultExpression(this);
		}
	}

	public final MultExpressionContext multExpression() throws RecognitionException {
		MultExpressionContext _localctx = new MultExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_multExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			operand();
			setState(330);
			match(MUL);
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
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public TerminalNode DIV() { return getToken(GrammarParser.DIV, 0); }
		public DivExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterDivExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitDivExpression(this);
		}
	}

	public final DivExpressionContext divExpression() throws RecognitionException {
		DivExpressionContext _localctx = new DivExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_divExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			operand();
			setState(333);
			match(DIV);
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
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public TerminalNode MOD() { return getToken(GrammarParser.MOD, 0); }
		public ModExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterModExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitModExpression(this);
		}
	}

	public final ModExpressionContext modExpression() throws RecognitionException {
		ModExpressionContext _localctx = new ModExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_modExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			operand();
			setState(336);
			match(MOD);
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
		public NavExpressionContext navExpression() {
			return getRuleContext(NavExpressionContext.class,0);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitOperand(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_operand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
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

	public static class IncludesExpressionContext extends ParserRuleContext {
		public TerminalNode INCLUDES() { return getToken(GrammarParser.INCLUDES, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public IncludesExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_includesExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterIncludesExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitIncludesExpression(this);
		}
	}

	public final IncludesExpressionContext includesExpression() throws RecognitionException {
		IncludesExpressionContext _localctx = new IncludesExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_includesExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(INCLUDES);
			setState(341);
			parameterList();
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

	public static class ExcludesExpressionContext extends ParserRuleContext {
		public TerminalNode EXCLUDES() { return getToken(GrammarParser.EXCLUDES, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ExcludesExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_excludesExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterExcludesExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitExcludesExpression(this);
		}
	}

	public final ExcludesExpressionContext excludesExpression() throws RecognitionException {
		ExcludesExpressionContext _localctx = new ExcludesExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_excludesExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(EXCLUDES);
			setState(344);
			parameterList();
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

	public static class SelectExpressionContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(GrammarParser.SELECT, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public SelectExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterSelectExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitSelectExpression(this);
		}
	}

	public final SelectExpressionContext selectExpression() throws RecognitionException {
		SelectExpressionContext _localctx = new SelectExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_selectExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(SELECT);
			setState(347);
			parameterList();
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

	public static class ExistsExpressionContext extends ParserRuleContext {
		public TerminalNode EXISTS() { return getToken(GrammarParser.EXISTS, 0); }
		public List<NlExpressionContext> nlExpression() {
			return getRuleContexts(NlExpressionContext.class);
		}
		public NlExpressionContext nlExpression(int i) {
			return getRuleContext(NlExpressionContext.class,i);
		}
		public TerminalNode IN() { return getToken(GrammarParser.IN, 0); }
		public ExistsExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_existsExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterExistsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitExistsExpression(this);
		}
	}

	public final ExistsExpressionContext existsExpression() throws RecognitionException {
		ExistsExpressionContext _localctx = new ExistsExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_existsExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(EXISTS);
			setState(350);
			nlExpression();
			setState(351);
			match(IN);
			setState(352);
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

	public static class NavExpressionRightToLeftContext extends ParserRuleContext {
		public List<StepContext> step() {
			return getRuleContexts(StepContext.class);
		}
		public StepContext step(int i) {
			return getRuleContext(StepContext.class,i);
		}
		public FinalStepContext finalStep() {
			return getRuleContext(FinalStepContext.class,0);
		}
		public List<TerminalNode> OF() { return getTokens(GrammarParser.OF); }
		public TerminalNode OF(int i) {
			return getToken(GrammarParser.OF, i);
		}
		public NavExpressionRightToLeftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_navExpressionRightToLeft; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterNavExpressionRightToLeft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitNavExpressionRightToLeft(this);
		}
	}

	public final NavExpressionRightToLeftContext navExpressionRightToLeft() throws RecognitionException {
		NavExpressionRightToLeftContext _localctx = new NavExpressionRightToLeftContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_navExpressionRightToLeft);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(354);
					step();
					setState(355);
					match(OF);
					}
					} 
				}
				setState(361);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(362);
				step();
				}
				break;
			case 2:
				{
				setState(363);
				finalStep();
				}
				break;
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

	public static class NavExpressionLeftToRightContext extends ParserRuleContext {
		public List<StepContext> step() {
			return getRuleContexts(StepContext.class);
		}
		public StepContext step(int i) {
			return getRuleContext(StepContext.class,i);
		}
		public List<TerminalNode> OF() { return getTokens(GrammarParser.OF); }
		public TerminalNode OF(int i) {
			return getToken(GrammarParser.OF, i);
		}
		public OclIsNewContext oclIsNew() {
			return getRuleContext(OclIsNewContext.class,0);
		}
		public NavExpressionLeftToRightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_navExpressionLeftToRight; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterNavExpressionLeftToRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitNavExpressionLeftToRight(this);
		}
	}

	public final NavExpressionLeftToRightContext navExpressionLeftToRight() throws RecognitionException {
		NavExpressionLeftToRightContext _localctx = new NavExpressionLeftToRightContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_navExpressionLeftToRight);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			step();
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OF) {
				{
				{
				setState(367);
				match(OF);
				setState(368);
				step();
				}
				}
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(374);
				oclIsNew();
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

	public static class PrefixedAtPreExpressionContext extends ParserRuleContext {
		public TerminalNode ATPRE() { return getToken(GrammarParser.ATPRE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode THE() { return getToken(GrammarParser.THE, 0); }
		public TerminalNode A() { return getToken(GrammarParser.A, 0); }
		public PrefixedAtPreExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixedAtPreExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterPrefixedAtPreExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitPrefixedAtPreExpression(this);
		}
	}

	public final PrefixedAtPreExpressionContext prefixedAtPreExpression() throws RecognitionException {
		PrefixedAtPreExpressionContext _localctx = new PrefixedAtPreExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_prefixedAtPreExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THE || _la==A) {
				{
				setState(377);
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

			setState(380);
			match(ATPRE);
			setState(381);
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

	public static class PostfixedAtPreExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ATPRE() { return getToken(GrammarParser.ATPRE, 0); }
		public TerminalNode THE() { return getToken(GrammarParser.THE, 0); }
		public TerminalNode A() { return getToken(GrammarParser.A, 0); }
		public PostfixedAtPreExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixedAtPreExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterPostfixedAtPreExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitPostfixedAtPreExpression(this);
		}
	}

	public final PostfixedAtPreExpressionContext postfixedAtPreExpression() throws RecognitionException {
		PostfixedAtPreExpressionContext _localctx = new PostfixedAtPreExpressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_postfixedAtPreExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THE || _la==A) {
				{
				setState(383);
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

			setState(386);
			identifier();
			setState(387);
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

	public static class CurrentExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode THE() { return getToken(GrammarParser.THE, 0); }
		public TerminalNode A() { return getToken(GrammarParser.A, 0); }
		public CurrentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_currentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterCurrentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitCurrentExpression(this);
		}
	}

	public final CurrentExpressionContext currentExpression() throws RecognitionException {
		CurrentExpressionContext _localctx = new CurrentExpressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_currentExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THE || _la==A) {
				{
				setState(389);
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

			setState(392);
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

	public static class StepContext extends ParserRuleContext {
		public CurrentExpressionContext currentExpression() {
			return getRuleContext(CurrentExpressionContext.class,0);
		}
		public AtPreExpressionContext atPreExpression() {
			return getRuleContext(AtPreExpressionContext.class,0);
		}
		public StepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_step; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitStep(this);
		}
	}

	public final StepContext step() throws RecognitionException {
		StepContext _localctx = new StepContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_step);
		try {
			setState(396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				currentExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
				atPreExpression();
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OclIsNewContext oclIsNew() {
			return getRuleContext(OclIsNewContext.class,0);
		}
		public FinalStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finalStep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterFinalStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitFinalStep(this);
		}
	}

	public final FinalStepContext finalStep() throws RecognitionException {
		FinalStepContext _localctx = new FinalStepContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_finalStep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			identifier();
			setState(399);
			oclIsNew();
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
		public TerminalNode IS() { return getToken(GrammarParser.IS, 0); }
		public TerminalNode NEW() { return getToken(GrammarParser.NEW, 0); }
		public OclIsNewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oclIsNew; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterOclIsNew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitOclIsNew(this);
		}
	}

	public final OclIsNewContext oclIsNew() throws RecognitionException {
		OclIsNewContext _localctx = new OclIsNewContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_oclIsNew);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(IS);
			setState(402);
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

	public static class OppExpressionContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(GrammarParser.SUB, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public OppExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oppExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterOppExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitOppExpression(this);
		}
	}

	public final OppExpressionContext oppExpression() throws RecognitionException {
		OppExpressionContext _localctx = new OppExpressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_oppExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(SUB);
			setState(405);
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
		public TerminalNode THIS() { return getToken(GrammarParser.THIS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SelfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterSelfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitSelfExpression(this);
		}
	}

	public final SelfExpressionContext selfExpression() throws RecognitionException {
		SelfExpressionContext _localctx = new SelfExpressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_selfExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(THIS);
			setState(408);
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

	public static class VariableReferenceContext extends ParserRuleContext {
		public TerminalNode THE() { return getToken(GrammarParser.THE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VariableReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterVariableReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitVariableReference(this);
		}
	}

	public final VariableReferenceContext variableReference() throws RecognitionException {
		VariableReferenceContext _localctx = new VariableReferenceContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_variableReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(THE);
			setState(411);
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

	public static class ParameterListContext extends ParserRuleContext {
		public List<NlExpressionContext> nlExpression() {
			return getRuleContexts(NlExpressionContext.class);
		}
		public NlExpressionContext nlExpression(int i) {
			return getRuleContext(NlExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarParser.COMMA, i);
		}
		public List<PrepositionContext> preposition() {
			return getRuleContexts(PrepositionContext.class);
		}
		public PrepositionContext preposition(int i) {
			return getRuleContext(PrepositionContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitParameterList(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_parameterList);
		int _la;
		try {
			setState(424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				{
				setState(413);
				nlExpression();
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OF) | (1L << COMMA) | (1L << FOR) | (1L << WITH) | (1L << BY))) != 0)) {
					{
					setState(416);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMA:
						{
						setState(414);
						match(COMMA);
						}
						break;
					case OF:
					case FOR:
					case WITH:
					case BY:
						{
						setState(415);
						preposition();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(420);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(421);
				nlExpression();
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				}
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

	public static class PrepositionContext extends ParserRuleContext {
		public TerminalNode OF() { return getToken(GrammarParser.OF, 0); }
		public TerminalNode FOR() { return getToken(GrammarParser.FOR, 0); }
		public TerminalNode WITH() { return getToken(GrammarParser.WITH, 0); }
		public TerminalNode BY() { return getToken(GrammarParser.BY, 0); }
		public PrepositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preposition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterPreposition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitPreposition(this);
		}
	}

	public final PrepositionContext preposition() throws RecognitionException {
		PrepositionContext _localctx = new PrepositionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_preposition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OF) | (1L << FOR) | (1L << WITH) | (1L << BY))) != 0)) ) {
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
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_literal);
		try {
			setState(435);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				integerLiteral();
				}
				break;
			case FloatingPointLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
				floatingPointLiteral();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(430);
				booleanLiteral();
				}
				break;
			case DateLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(431);
				dateLiteral();
				}
				break;
			case CharacterLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(432);
				characterLiteral();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 6);
				{
				setState(433);
				stringLiteral();
				}
				break;
			case NullLiteral:
				enterOuterAlt(_localctx, 7);
				{
				setState(434);
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
		public TerminalNode Identifier() { return getToken(GrammarParser.Identifier, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
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

	public static class WordContext extends ParserRuleContext {
		public NavExpressionContext navExpression() {
			return getRuleContext(NavExpressionContext.class,0);
		}
		public WordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitWord(this);
		}
	}

	public final WordContext word() throws RecognitionException {
		WordContext _localctx = new WordContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_word);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 System.out.println("wwww");
			setState(440);
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

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(GrammarParser.IntegerLiteral, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitIntegerLiteral(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_integerLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
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
		public TerminalNode FloatingPointLiteral() { return getToken(GrammarParser.FloatingPointLiteral, 0); }
		public FloatingPointLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingPointLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterFloatingPointLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitFloatingPointLiteral(this);
		}
	}

	public final FloatingPointLiteralContext floatingPointLiteral() throws RecognitionException {
		FloatingPointLiteralContext _localctx = new FloatingPointLiteralContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_floatingPointLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
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
		public TerminalNode TRUE() { return getToken(GrammarParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(GrammarParser.FALSE, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitBooleanLiteral(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public static class DateLiteralContext extends ParserRuleContext {
		public TerminalNode DateLiteral() { return getToken(GrammarParser.DateLiteral, 0); }
		public DateLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterDateLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitDateLiteral(this);
		}
	}

	public final DateLiteralContext dateLiteral() throws RecognitionException {
		DateLiteralContext _localctx = new DateLiteralContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_dateLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
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
		public TerminalNode CharacterLiteral() { return getToken(GrammarParser.CharacterLiteral, 0); }
		public CharacterLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterCharacterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitCharacterLiteral(this);
		}
	}

	public final CharacterLiteralContext characterLiteral() throws RecognitionException {
		CharacterLiteralContext _localctx = new CharacterLiteralContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_characterLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
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
		public TerminalNode StringLiteral() { return getToken(GrammarParser.StringLiteral, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitStringLiteral(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
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
		public TerminalNode NullLiteral() { return getToken(GrammarParser.NullLiteral, 0); }
		public NullLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitNullLiteral(this);
		}
	}

	public final NullLiteralContext nullLiteral() throws RecognitionException {
		NullLiteralContext _localctx = new NullLiteralContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_nullLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u01cb\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\7\5\u0086\n\5\f\5\16\5\u0089"+
		"\13\5\3\6\3\6\3\6\3\6\7\6\u008f\n\6\f\6\16\6\u0092\13\6\3\6\3\6\7\6\u0096"+
		"\n\6\f\6\16\6\u0099\13\6\5\6\u009b\n\6\3\7\3\7\3\7\3\7\3\b\5\b\u00a2\n"+
		"\b\3\b\3\b\3\b\3\b\5\b\u00a8\n\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\5\r\u00c8\n\r\3\r\3\r\5\r\u00cc\n\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\5\16\u00d4\n\16\3\16\3\16\3\16\5\16\u00d9\n\16\7\16\u00db"+
		"\n\16\f\16\16\16\u00de\13\16\3\16\5\16\u00e1\n\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\7\21\u00f2\n\21"+
		"\f\21\16\21\u00f5\13\21\3\21\3\21\3\22\3\22\3\22\7\22\u00fc\n\22\f\22"+
		"\16\22\u00ff\13\22\3\22\3\22\3\23\3\23\3\23\7\23\u0106\n\23\f\23\16\23"+
		"\u0109\13\23\3\23\3\23\3\24\3\24\5\24\u010f\n\24\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\5\26\u0119\n\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\5\33\u012e"+
		"\n\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\7\36\u013b"+
		"\n\36\f\36\16\36\u013e\13\36\3\36\3\36\3\37\3\37\3\37\7\37\u0145\n\37"+
		"\f\37\16\37\u0148\13\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#"+
		"\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\7(\u0168\n(\f"+
		"(\16(\u016b\13(\3(\3(\5(\u016f\n(\3)\3)\3)\7)\u0174\n)\f)\16)\u0177\13"+
		")\3)\5)\u017a\n)\3*\5*\u017d\n*\3*\3*\3*\3+\5+\u0183\n+\3+\3+\3+\3,\5"+
		",\u0189\n,\3,\3,\3-\3-\5-\u018f\n-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3"+
		"\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\7\63\u01a3\n\63\f\63\16\63"+
		"\u01a6\13\63\3\63\3\63\3\63\5\63\u01ab\n\63\3\64\3\64\3\65\3\65\3\65\3"+
		"\65\3\65\3\65\3\65\5\65\u01b6\n\65\3\66\3\66\3\67\3\67\3\67\38\38\39\3"+
		"9\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3>\2\2?\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz\2\7"+
		"\3\2\n\13\3\2\f\r\4\2\5\5\34\34\4\2%%*,\3\2\60\61\2\u01bc\2|\3\2\2\2\4"+
		"~\3\2\2\2\6\u0080\3\2\2\2\b\u0087\3\2\2\2\n\u009a\3\2\2\2\f\u009c\3\2"+
		"\2\2\16\u00a1\3\2\2\2\20\u00ae\3\2\2\2\22\u00b5\3\2\2\2\24\u00b8\3\2\2"+
		"\2\26\u00c0\3\2\2\2\30\u00c7\3\2\2\2\32\u00d1\3\2\2\2\34\u00e5\3\2\2\2"+
		"\36\u00e7\3\2\2\2 \u00f3\3\2\2\2\"\u00fd\3\2\2\2$\u0107\3\2\2\2&\u010e"+
		"\3\2\2\2(\u0110\3\2\2\2*\u0118\3\2\2\2,\u011a\3\2\2\2.\u011e\3\2\2\2\60"+
		"\u0122\3\2\2\2\62\u0126\3\2\2\2\64\u012d\3\2\2\2\66\u012f\3\2\2\28\u0133"+
		"\3\2\2\2:\u013c\3\2\2\2<\u0146\3\2\2\2>\u014b\3\2\2\2@\u014e\3\2\2\2B"+
		"\u0151\3\2\2\2D\u0154\3\2\2\2F\u0156\3\2\2\2H\u0159\3\2\2\2J\u015c\3\2"+
		"\2\2L\u015f\3\2\2\2N\u0169\3\2\2\2P\u0170\3\2\2\2R\u017c\3\2\2\2T\u0182"+
		"\3\2\2\2V\u0188\3\2\2\2X\u018e\3\2\2\2Z\u0190\3\2\2\2\\\u0193\3\2\2\2"+
		"^\u0196\3\2\2\2`\u0199\3\2\2\2b\u019c\3\2\2\2d\u01aa\3\2\2\2f\u01ac\3"+
		"\2\2\2h\u01b5\3\2\2\2j\u01b7\3\2\2\2l\u01b9\3\2\2\2n\u01bc\3\2\2\2p\u01be"+
		"\3\2\2\2r\u01c0\3\2\2\2t\u01c2\3\2\2\2v\u01c4\3\2\2\2x\u01c6\3\2\2\2z"+
		"\u01c8\3\2\2\2|}\3\2\2\2}\3\3\2\2\2~\177\5N(\2\177\5\3\2\2\2\u0080\u0081"+
		"\5T+\2\u0081\7\3\2\2\2\u0082\u0086\5\20\t\2\u0083\u0086\5\24\13\2\u0084"+
		"\u0086\5\n\6\2\u0085\u0082\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2"+
		"\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\t\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u0090\5\f\7\2\u008b\u008f\5\20\t"+
		"\2\u008c\u008f\5\24\13\2\u008d\u008f\5\16\b\2\u008e\u008b\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2"+
		"\2\2\u0090\u0091\3\2\2\2\u0091\u009b\3\2\2\2\u0092\u0090\3\2\2\2\u0093"+
		"\u0097\5\26\f\2\u0094\u0096\5\30\r\2\u0095\u0094\3\2\2\2\u0096\u0099\3"+
		"\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009b\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u009a\u008a\3\2\2\2\u009a\u0093\3\2\2\2\u009b\13\3\2\2"+
		"\2\u009c\u009d\7\3\2\2\u009d\u009e\5j\66\2\u009e\u009f\7\4\2\2\u009f\r"+
		"\3\2\2\2\u00a0\u00a2\7\5\2\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a4\b\b\1\2\u00a4\u00a5\7\6\2\2\u00a5\u00a7\b\b"+
		"\1\2\u00a6\u00a8\5\32\16\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00aa\7\4\2\2\u00aa\u00ab\b\b\1\2\u00ab\u00ac\5\2"+
		"\2\2\u00ac\u00ad\7\7\2\2\u00ad\17\3\2\2\2\u00ae\u00af\b\t\1\2\u00af\u00b0"+
		"\7\b\2\2\u00b0\u00b1\5\22\n\2\u00b1\u00b2\7\4\2\2\u00b2\u00b3\5\2\2\2"+
		"\u00b3\u00b4\7\7\2\2\u00b4\21\3\2\2\2\u00b5\u00b6\b\n\1\2\u00b6\u00b7"+
		"\5\32\16\2\u00b7\23\3\2\2\2\u00b8\u00b9\7\b\2\2\u00b9\u00ba\5j\66\2\u00ba"+
		"\u00bb\7\4\2\2\u00bb\u00bc\5j\66\2\u00bc\u00bd\7\4\2\2\u00bd\u00be\5\2"+
		"\2\2\u00be\u00bf\7\7\2\2\u00bf\25\3\2\2\2\u00c0\u00c1\7\3\2\2\u00c1\u00c2"+
		"\5j\66\2\u00c2\u00c3\7\t\2\2\u00c3\u00c4\5j\66\2\u00c4\u00c5\7\4\2\2\u00c5"+
		"\27\3\2\2\2\u00c6\u00c8\7\5\2\2\u00c7\u00c6\3\2\2\2\u00c7\u00c8\3\2\2"+
		"\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\t\2\2\2\u00ca\u00cc\5\32\16\2\u00cb"+
		"\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\7\4"+
		"\2\2\u00ce\u00cf\5\2\2\2\u00cf\u00d0\7\7\2\2\u00d0\31\3\2\2\2\u00d1\u00dc"+
		"\b\16\1\2\u00d2\u00d4\t\3\2\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2"+
		"\u00d4\u00d5\3\2\2\2\u00d5\u00d6\b\16\1\2\u00d6\u00d8\5l\67\2\u00d7\u00d9"+
		"\7\16\2\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2"+
		"\u00da\u00d3\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd"+
		"\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e1\t\3\2\2\u00e0"+
		"\u00df\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\b\16"+
		"\1\2\u00e3\u00e4\5l\67\2\u00e4\33\3\2\2\2\u00e5\u00e6\7\17\2\2\u00e6\35"+
		"\3\2\2\2\u00e7\u00e8\5 \21\2\u00e8\u00e9\7\20\2\2\u00e9\u00ea\5 \21\2"+
		"\u00ea\u00eb\5 \21\2\u00eb\u00ec\7\21\2\2\u00ec\u00ed\5 \21\2\u00ed\37"+
		"\3\2\2\2\u00ee\u00ef\5\"\22\2\u00ef\u00f0\7\22\2\2\u00f0\u00f2\3\2\2\2"+
		"\u00f1\u00ee\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4"+
		"\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\5\"\22\2"+
		"\u00f7!\3\2\2\2\u00f8\u00f9\5$\23\2\u00f9\u00fa\7\23\2\2\u00fa\u00fc\3"+
		"\2\2\2\u00fb\u00f8\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0101\5$"+
		"\23\2\u0101#\3\2\2\2\u0102\u0103\5&\24\2\u0103\u0104\7\24\2\2\u0104\u0106"+
		"\3\2\2\2\u0105\u0102\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\u010a\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010b\5&"+
		"\24\2\u010b%\3\2\2\2\u010c\u010f\5(\25\2\u010d\u010f\5*\26\2\u010e\u010c"+
		"\3\2\2\2\u010e\u010d\3\2\2\2\u010f\'\3\2\2\2\u0110\u0111\7\25\2\2\u0111"+
		"\u0112\5*\26\2\u0112)\3\2\2\2\u0113\u0119\5,\27\2\u0114\u0119\5.\30\2"+
		"\u0115\u0119\5\60\31\2\u0116\u0119\5\62\32\2\u0117\u0119\5\64\33\2\u0118"+
		"\u0113\3\2\2\2\u0118\u0114\3\2\2\2\u0118\u0115\3\2\2\2\u0118\u0116\3\2"+
		"\2\2\u0118\u0117\3\2\2\2\u0119+\3\2\2\2\u011a\u011b\5\64\33\2\u011b\u011c"+
		"\7\26\2\2\u011c\u011d\5\64\33\2\u011d-\3\2\2\2\u011e\u011f\5\64\33\2\u011f"+
		"\u0120\7\27\2\2\u0120\u0121\5\64\33\2\u0121/\3\2\2\2\u0122\u0123\5\64"+
		"\33\2\u0123\u0124\7\30\2\2\u0124\u0125\5\64\33\2\u0125\61\3\2\2\2\u0126"+
		"\u0127\5\64\33\2\u0127\u0128\7\31\2\2\u0128\u0129\5\64\33\2\u0129\63\3"+
		"\2\2\2\u012a\u012e\5\66\34\2\u012b\u012e\58\35\2\u012c\u012e\5:\36\2\u012d"+
		"\u012a\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012c\3\2\2\2\u012e\65\3\2\2"+
		"\2\u012f\u0130\5:\36\2\u0130\u0131\7\32\2\2\u0131\u0132\5:\36\2\u0132"+
		"\67\3\2\2\2\u0133\u0134\5:\36\2\u0134\u0135\7\33\2\2\u0135\u0136\5:\36"+
		"\2\u01369\3\2\2\2\u0137\u0138\5<\37\2\u0138\u0139\t\4\2\2\u0139\u013b"+
		"\3\2\2\2\u013a\u0137\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c"+
		"\u013d\3\2\2\2\u013d\u013f\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0140\5<"+
		"\37\2\u0140;\3\2\2\2\u0141\u0145\5> \2\u0142\u0145\5@!\2\u0143\u0145\5"+
		"B\"\2\u0144\u0141\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0143\3\2\2\2\u0145"+
		"\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0149\3\2"+
		"\2\2\u0148\u0146\3\2\2\2\u0149\u014a\5D#\2\u014a=\3\2\2\2\u014b\u014c"+
		"\5D#\2\u014c\u014d\7\35\2\2\u014d?\3\2\2\2\u014e\u014f\5D#\2\u014f\u0150"+
		"\7\36\2\2\u0150A\3\2\2\2\u0151\u0152\5D#\2\u0152\u0153\7\37\2\2\u0153"+
		"C\3\2\2\2\u0154\u0155\5\4\3\2\u0155E\3\2\2\2\u0156\u0157\7 \2\2\u0157"+
		"\u0158\5d\63\2\u0158G\3\2\2\2\u0159\u015a\7!\2\2\u015a\u015b\5d\63\2\u015b"+
		"I\3\2\2\2\u015c\u015d\7\"\2\2\u015d\u015e\5d\63\2\u015eK\3\2\2\2\u015f"+
		"\u0160\7#\2\2\u0160\u0161\5\2\2\2\u0161\u0162\7$\2\2\u0162\u0163\5\2\2"+
		"\2\u0163M\3\2\2\2\u0164\u0165\5X-\2\u0165\u0166\7%\2\2\u0166\u0168\3\2"+
		"\2\2\u0167\u0164\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u0169"+
		"\u016a\3\2\2\2\u016a\u016e\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u016f\5X"+
		"-\2\u016d\u016f\5Z.\2\u016e\u016c\3\2\2\2\u016e\u016d\3\2\2\2\u016fO\3"+
		"\2\2\2\u0170\u0175\5X-\2\u0171\u0172\7%\2\2\u0172\u0174\5X-\2\u0173\u0171"+
		"\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176"+
		"\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0178\u017a\5\\/\2\u0179\u0178\3\2"+
		"\2\2\u0179\u017a\3\2\2\2\u017aQ\3\2\2\2\u017b\u017d\t\3\2\2\u017c\u017b"+
		"\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f\7&\2\2\u017f"+
		"\u0180\5j\66\2\u0180S\3\2\2\2\u0181\u0183\t\3\2\2\u0182\u0181\3\2\2\2"+
		"\u0182\u0183\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\5j\66\2\u0185\u0186"+
		"\7&\2\2\u0186U\3\2\2\2\u0187\u0189\t\3\2\2\u0188\u0187\3\2\2\2\u0188\u0189"+
		"\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\5j\66\2\u018bW\3\2\2\2\u018c"+
		"\u018f\5V,\2\u018d\u018f\5\6\4\2\u018e\u018c\3\2\2\2\u018e\u018d\3\2\2"+
		"\2\u018fY\3\2\2\2\u0190\u0191\5j\66\2\u0191\u0192\5\\/\2\u0192[\3\2\2"+
		"\2\u0193\u0194\7\16\2\2\u0194\u0195\7\'\2\2\u0195]\3\2\2\2\u0196\u0197"+
		"\7\5\2\2\u0197\u0198\5D#\2\u0198_\3\2\2\2\u0199\u019a\7(\2\2\u019a\u019b"+
		"\5j\66\2\u019ba\3\2\2\2\u019c\u019d\7\f\2\2\u019d\u019e\5j\66\2\u019e"+
		"c\3\2\2\2\u019f\u01a4\5\2\2\2\u01a0\u01a3\7)\2\2\u01a1\u01a3\5f\64\2\u01a2"+
		"\u01a0\3\2\2\2\u01a2\u01a1\3\2\2\2\u01a3\u01a6\3\2\2\2\u01a4\u01a2\3\2"+
		"\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a7\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7"+
		"\u01a8\5\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01ab\3\2\2\2\u01aa\u019f\3\2"+
		"\2\2\u01aa\u01a9\3\2\2\2\u01abe\3\2\2\2\u01ac\u01ad\t\5\2\2\u01adg\3\2"+
		"\2\2\u01ae\u01b6\5n8\2\u01af\u01b6\5p9\2\u01b0\u01b6\5r:\2\u01b1\u01b6"+
		"\5t;\2\u01b2\u01b6\5v<\2\u01b3\u01b6\5x=\2\u01b4\u01b6\5z>\2\u01b5\u01ae"+
		"\3\2\2\2\u01b5\u01af\3\2\2\2\u01b5\u01b0\3\2\2\2\u01b5\u01b1\3\2\2\2\u01b5"+
		"\u01b2\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b4\3\2\2\2\u01b6i\3\2\2\2"+
		"\u01b7\u01b8\7-\2\2\u01b8k\3\2\2\2\u01b9\u01ba\b\67\1\2\u01ba\u01bb\5"+
		"\4\3\2\u01bbm\3\2\2\2\u01bc\u01bd\7.\2\2\u01bdo\3\2\2\2\u01be\u01bf\7"+
		"/\2\2\u01bfq\3\2\2\2\u01c0\u01c1\t\6\2\2\u01c1s\3\2\2\2\u01c2\u01c3\7"+
		"\62\2\2\u01c3u\3\2\2\2\u01c4\u01c5\7\63\2\2\u01c5w\3\2\2\2\u01c6\u01c7"+
		"\7\64\2\2\u01c7y\3\2\2\2\u01c8\u01c9\7\65\2\2\u01c9{\3\2\2\2%\u0085\u0087"+
		"\u008e\u0090\u0097\u009a\u00a1\u00a7\u00c7\u00cb\u00d3\u00d8\u00dc\u00e0"+
		"\u00f3\u00fd\u0107\u010e\u0118\u012d\u013c\u0144\u0146\u0169\u016e\u0175"+
		"\u0179\u017c\u0182\u0188\u018e\u01a2\u01a4\u01aa\u01b5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}