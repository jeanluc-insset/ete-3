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
		DEFINITION=1, CONTEXT=2, INVARIANT=3, PRE=4, POST=5, Self=6, IntegerLiteral=7, 
		FloatingPointLiteral=8, TRUE=9, FALSE=10, DateLiteral=11, CharacterLiteral=12, 
		StringLiteral=13, NullLiteral=14, LPAREN=15, RPAREN=16, START_EXP=17, 
		LBRACE=18, RBRACE=19, LBRACK=20, RBRACK=21, SEMI=22, COMMA=23, DOT=24, 
		ARROW=25, LEFT_ARROW=26, PIPE=27, GT=28, LT=29, TILDE=30, QUESTION=31, 
		COLON=32, DOUBLE_COLON=33, EQUAL=34, LE=35, GE=36, NOTEQUAL=37, AND=38, 
		OR=39, XOR=40, ADD=41, SUB=42, MUL=43, DIV=44, MOD_PERCENT=45, CARET=46, 
		MOD=47, OF=48, EACH=49, SOME=50, AT_LEAST_ONE=51, AT_LEAST=52, AT_MOST_ONE=53, 
		AT_MOST=54, EXACTLY_ONE=55, EXACTLY=56, MORE_THAN_ONE=57, NO=58, IT_IS_NOT_THE_CASE_THAT=59, 
		BUT_NOT_BOTH=60, THEN=61, IF_AND_ONLY_IF=62, NOT_BOTH=63, NEITHER=64, 
		WHETHER_OR_NOT=65, IT_IS_OBLIGATORY_THAT=66, IT_IS_PROHIBITED_THAT=67, 
		IT_IS_NECESSARY_THAT=68, IT_IS_IMPOSSIBLE_THAT=69, IT_IS_POSSIBLE_THAT=70, 
		IT_IS_PERMITTED_THAT=71, ONLY_IF=72, MUST_NOT=73, MUST=74, NEED_NOT=75, 
		NEED=76, ALWAYS=77, NEVER=78, CAN=79, MAY=80, NOT=81, THE=82, A_GIVEN=83, 
		GIVEN=84, A=85, ANOTHER=86, THAT=87, WHO=88, WHAT=89, IS_OF=90, THIS=91, 
		ITS=92, SEQUENCE=93, BAG=94, SET=95, ORDERED=96, OCL_IS_NEW=97, OCL_IS_TYPE_OF=98, 
		OCL_IS_KIND_OF=99, OCL_AS_TYPE=100, Identifier=101, ATPRE=102, ELLIPSIS=103, 
		WS=104, COMMENT=105, LINE_COMMENT=106;
	public static final int
		RULE_file = 0, RULE_definition = 1, RULE_globalConstraint = 2, RULE_contextualConstraints = 3, 
		RULE_invariants = 4, RULE_invariant = 5, RULE_conditions = 6, RULE_precondition = 7, 
		RULE_postcondition = 8, RULE_sbvrExpression = 9, RULE_multOperator = 10, 
		RULE_addOperator = 11, RULE_equalityOperator = 12, RULE_comparator = 13, 
		RULE_operand = 14, RULE_navExpression = 15, RULE_leftToRightNavigation = 16, 
		RULE_rightToLeftNavigation = 17, RULE_firstStep = 18, RULE_step = 19, 
		RULE_navOperator = 20, RULE_structuredNaturalLanguage = 21, RULE_modality = 22, 
		RULE_sentence = 23, RULE_general_concept = 24, RULE_determiner = 25, RULE_verb = 26, 
		RULE_quantifier = 27, RULE_article = 28, RULE_definite_article = 29, RULE_indefinite_article = 30, 
		RULE_demonstrative = 31, RULE_possessive = 32, RULE_literal = 33, RULE_word = 34, 
		RULE_identifier = 35, RULE_integerLiteral = 36, RULE_floatingPointLiteral = 37, 
		RULE_booleanLiteral = 38, RULE_dateLiteral = 39, RULE_characterLiteral = 40, 
		RULE_stringLiteral = 41, RULE_nullLiteral = 42;
	public static final String[] ruleNames = {
		"file", "definition", "globalConstraint", "contextualConstraints", "invariants", 
		"invariant", "conditions", "precondition", "postcondition", "sbvrExpression", 
		"multOperator", "addOperator", "equalityOperator", "comparator", "operand", 
		"navExpression", "leftToRightNavigation", "rightToLeftNavigation", "firstStep", 
		"step", "navOperator", "structuredNaturalLanguage", "modality", "sentence", 
		"general_concept", "determiner", "verb", "quantifier", "article", "definite_article", 
		"indefinite_article", "demonstrative", "possessive", "literal", "word", 
		"identifier", "integerLiteral", "floatingPointLiteral", "booleanLiteral", 
		"dateLiteral", "characterLiteral", "stringLiteral", "nullLiteral"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'definition'", "'context'", "'inv'", "'pre'", "'post'", "'self'", 
		null, null, "'true'", "'false'", null, null, null, "'null'", "'('", "')'", 
		"'#{'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'->'", "'<-'", 
		"'|'", "'>'", "'<'", "'~'", "'?'", "':'", "'::'", "'='", "'<='", "'>='", 
		"'<>'", "'and'", "'or'", "'xor'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", 
		"'mod'", "'of'", "'each'", "'some'", null, null, null, null, null, "'exactly'", 
		null, "'no'", null, null, "'then'", null, null, "'neither'", null, null, 
		null, null, null, null, null, null, null, "'must'", null, "'need'", "'always'", 
		"'never'", "'can'", "'may'", "'not'", "'the'", null, "'given'", null, 
		"'another'", "'that'", "'who'", "'what'", null, "'this'", "'its'", "'sequence'", 
		"'bag'", "'set'", "'ordered'", null, null, null, null, null, "'@pre'", 
		"'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "DEFINITION", "CONTEXT", "INVARIANT", "PRE", "POST", "Self", "IntegerLiteral", 
		"FloatingPointLiteral", "TRUE", "FALSE", "DateLiteral", "CharacterLiteral", 
		"StringLiteral", "NullLiteral", "LPAREN", "RPAREN", "START_EXP", "LBRACE", 
		"RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ARROW", "LEFT_ARROW", 
		"PIPE", "GT", "LT", "TILDE", "QUESTION", "COLON", "DOUBLE_COLON", "EQUAL", 
		"LE", "GE", "NOTEQUAL", "AND", "OR", "XOR", "ADD", "SUB", "MUL", "DIV", 
		"MOD_PERCENT", "CARET", "MOD", "OF", "EACH", "SOME", "AT_LEAST_ONE", "AT_LEAST", 
		"AT_MOST_ONE", "AT_MOST", "EXACTLY_ONE", "EXACTLY", "MORE_THAN_ONE", "NO", 
		"IT_IS_NOT_THE_CASE_THAT", "BUT_NOT_BOTH", "THEN", "IF_AND_ONLY_IF", "NOT_BOTH", 
		"NEITHER", "WHETHER_OR_NOT", "IT_IS_OBLIGATORY_THAT", "IT_IS_PROHIBITED_THAT", 
		"IT_IS_NECESSARY_THAT", "IT_IS_IMPOSSIBLE_THAT", "IT_IS_POSSIBLE_THAT", 
		"IT_IS_PERMITTED_THAT", "ONLY_IF", "MUST_NOT", "MUST", "NEED_NOT", "NEED", 
		"ALWAYS", "NEVER", "CAN", "MAY", "NOT", "THE", "A_GIVEN", "GIVEN", "A", 
		"ANOTHER", "THAT", "WHO", "WHAT", "IS_OF", "THIS", "ITS", "SEQUENCE", 
		"BAG", "SET", "ORDERED", "OCL_IS_NEW", "OCL_IS_TYPE_OF", "OCL_IS_KIND_OF", 
		"OCL_AS_TYPE", "Identifier", "ATPRE", "ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT"
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
	public static class FileContext extends ParserRuleContext {
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public List<GlobalConstraintContext> globalConstraint() {
			return getRuleContexts(GlobalConstraintContext.class);
		}
		public GlobalConstraintContext globalConstraint(int i) {
			return getRuleContext(GlobalConstraintContext.class,i);
		}
		public List<ContextualConstraintsContext> contextualConstraints() {
			return getRuleContexts(ContextualConstraintsContext.class);
		}
		public ContextualConstraintsContext contextualConstraints(int i) {
			return getRuleContext(ContextualConstraintsContext.class,i);
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
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEFINITION) {
				{
				{
				setState(86);
				definition();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(92);
				globalConstraint();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONTEXT) {
				{
				{
				setState(98);
				contextualConstraints();
				}
				}
				setState(103);
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

	public static class DefinitionContext extends ParserRuleContext {
		public TerminalNode DEFINITION() { return getToken(SbvrParser.DEFINITION, 0); }
		public TerminalNode COLON() { return getToken(SbvrParser.COLON, 0); }
		public TerminalNode DOT() { return getToken(SbvrParser.DOT, 0); }
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(DEFINITION);
			setState(106); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(105);
				word();
				}
				}
				setState(108); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Identifier );
			setState(110);
			match(COLON);
			setState(112); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(111);
				word();
				}
				}
				setState(114); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Identifier );
			setState(116);
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

	public static class GlobalConstraintContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(SbvrParser.COLON, 0); }
		public SbvrExpressionContext sbvrExpression() {
			return getRuleContext(SbvrExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SbvrParser.DOT, 0); }
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public GlobalConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterGlobalConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitGlobalConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitGlobalConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalConstraintContext globalConstraint() throws RecognitionException {
		GlobalConstraintContext _localctx = new GlobalConstraintContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_globalConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(118);
				word();
				}
				}
				setState(121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Identifier );
			setState(123);
			match(COLON);
			setState(124);
			sbvrExpression(0);
			setState(125);
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

	public static class ContextualConstraintsContext extends ParserRuleContext {
		public InvariantsContext invariants() {
			return getRuleContext(InvariantsContext.class,0);
		}
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public ContextualConstraintsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contextualConstraints; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterContextualConstraints(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitContextualConstraints(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitContextualConstraints(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContextualConstraintsContext contextualConstraints() throws RecognitionException {
		ContextualConstraintsContext _localctx = new ContextualConstraintsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_contextualConstraints);
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				invariants();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				conditions();
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

	public static class InvariantsContext extends ParserRuleContext {
		public TerminalNode CONTEXT() { return getToken(SbvrParser.CONTEXT, 0); }
		public TerminalNode Identifier() { return getToken(SbvrParser.Identifier, 0); }
		public List<InvariantContext> invariant() {
			return getRuleContexts(InvariantContext.class);
		}
		public InvariantContext invariant(int i) {
			return getRuleContext(InvariantContext.class,i);
		}
		public InvariantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invariants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterInvariants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitInvariants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitInvariants(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvariantsContext invariants() throws RecognitionException {
		InvariantsContext _localctx = new InvariantsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_invariants);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(CONTEXT);
			setState(132);
			match(Identifier);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INVARIANT) {
				{
				{
				setState(133);
				invariant();
				}
				}
				setState(138);
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

	public static class InvariantContext extends ParserRuleContext {
		public TerminalNode INVARIANT() { return getToken(SbvrParser.INVARIANT, 0); }
		public TerminalNode COLON() { return getToken(SbvrParser.COLON, 0); }
		public SbvrExpressionContext sbvrExpression() {
			return getRuleContext(SbvrExpressionContext.class,0);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public InvariantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invariant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterInvariant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitInvariant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitInvariant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvariantContext invariant() throws RecognitionException {
		InvariantContext _localctx = new InvariantContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_invariant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(INVARIANT);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(140);
				word();
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
			match(COLON);
			setState(147);
			sbvrExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionsContext extends ParserRuleContext {
		public TerminalNode CONTEXT() { return getToken(SbvrParser.CONTEXT, 0); }
		public List<TerminalNode> Identifier() { return getTokens(SbvrParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(SbvrParser.Identifier, i);
		}
		public TerminalNode DOUBLE_COLON() { return getToken(SbvrParser.DOUBLE_COLON, 0); }
		public List<PreconditionContext> precondition() {
			return getRuleContexts(PreconditionContext.class);
		}
		public PreconditionContext precondition(int i) {
			return getRuleContext(PreconditionContext.class,i);
		}
		public List<PostconditionContext> postcondition() {
			return getRuleContexts(PostconditionContext.class);
		}
		public PostconditionContext postcondition(int i) {
			return getRuleContext(PostconditionContext.class,i);
		}
		public ConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterConditions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitConditions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitConditions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionsContext conditions() throws RecognitionException {
		ConditionsContext _localctx = new ConditionsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_conditions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(CONTEXT);
			setState(150);
			match(Identifier);
			setState(151);
			match(DOUBLE_COLON);
			setState(152);
			match(Identifier);
			setState(155); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(155);
				switch (_input.LA(1)) {
				case PRE:
					{
					setState(153);
					precondition();
					}
					break;
				case POST:
					{
					setState(154);
					postcondition();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(157); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PRE || _la==POST );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreconditionContext extends ParserRuleContext {
		public TerminalNode PRE() { return getToken(SbvrParser.PRE, 0); }
		public TerminalNode COLON() { return getToken(SbvrParser.COLON, 0); }
		public SbvrExpressionContext sbvrExpression() {
			return getRuleContext(SbvrExpressionContext.class,0);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public PreconditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterPrecondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitPrecondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitPrecondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreconditionContext precondition() throws RecognitionException {
		PreconditionContext _localctx = new PreconditionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_precondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(PRE);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(160);
				word();
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166);
			match(COLON);
			setState(167);
			sbvrExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostconditionContext extends ParserRuleContext {
		public TerminalNode POST() { return getToken(SbvrParser.POST, 0); }
		public TerminalNode COLON() { return getToken(SbvrParser.COLON, 0); }
		public SbvrExpressionContext sbvrExpression() {
			return getRuleContext(SbvrExpressionContext.class,0);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public PostconditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postcondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterPostcondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitPostcondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitPostcondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostconditionContext postcondition() throws RecognitionException {
		PostconditionContext _localctx = new PostconditionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_postcondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(POST);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(170);
				word();
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176);
			match(COLON);
			setState(177);
			sbvrExpression(0);
			}
		}
		catch (RecognitionException re) {
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
		public NavExpressionContext navExpression() {
			return getRuleContext(NavExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SbvrParser.NOT, 0); }
		public List<SbvrExpressionContext> sbvrExpression() {
			return getRuleContexts(SbvrExpressionContext.class);
		}
		public SbvrExpressionContext sbvrExpression(int i) {
			return getRuleContext(SbvrExpressionContext.class,i);
		}
		public MultOperatorContext multOperator() {
			return getRuleContext(MultOperatorContext.class,0);
		}
		public AddOperatorContext addOperator() {
			return getRuleContext(AddOperatorContext.class,0);
		}
		public ComparatorContext comparator() {
			return getRuleContext(ComparatorContext.class,0);
		}
		public EqualityOperatorContext equalityOperator() {
			return getRuleContext(EqualityOperatorContext.class,0);
		}
		public TerminalNode AND() { return getToken(SbvrParser.AND, 0); }
		public TerminalNode OR() { return getToken(SbvrParser.OR, 0); }
		public TerminalNode XOR() { return getToken(SbvrParser.XOR, 0); }
		public StructuredNaturalLanguageContext structuredNaturalLanguage() {
			return getRuleContext(StructuredNaturalLanguageContext.class,0);
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
		return sbvrExpression(0);
	}

	private SbvrExpressionContext sbvrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SbvrExpressionContext _localctx = new SbvrExpressionContext(_ctx, _parentState);
		SbvrExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_sbvrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(180);
				navExpression();
				}
				break;
			case NOT:
				{
				setState(181);
				match(NOT);
				setState(182);
				sbvrExpression(4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(214);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(212);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new SbvrExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sbvrExpression);
						setState(185);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(186);
						multOperator();
						setState(187);
						sbvrExpression(9);
						}
						break;
					case 2:
						{
						_localctx = new SbvrExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sbvrExpression);
						setState(189);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(190);
						addOperator();
						setState(191);
						sbvrExpression(8);
						}
						break;
					case 3:
						{
						_localctx = new SbvrExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sbvrExpression);
						setState(193);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(194);
						comparator();
						setState(195);
						sbvrExpression(7);
						}
						break;
					case 4:
						{
						_localctx = new SbvrExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sbvrExpression);
						setState(197);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(198);
						equalityOperator();
						setState(199);
						sbvrExpression(6);
						}
						break;
					case 5:
						{
						_localctx = new SbvrExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sbvrExpression);
						setState(201);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(202);
						match(AND);
						setState(203);
						sbvrExpression(4);
						}
						break;
					case 6:
						{
						_localctx = new SbvrExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sbvrExpression);
						setState(204);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(205);
						match(OR);
						setState(206);
						sbvrExpression(3);
						}
						break;
					case 7:
						{
						_localctx = new SbvrExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sbvrExpression);
						setState(207);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(208);
						match(XOR);
						setState(209);
						sbvrExpression(0);
						setState(210);
						structuredNaturalLanguage();
						}
						break;
					}
					} 
				}
				setState(216);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultOperatorContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(SbvrParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(SbvrParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SbvrParser.MOD, 0); }
		public MultOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterMultOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitMultOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitMultOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultOperatorContext multOperator() throws RecognitionException {
		MultOperatorContext _localctx = new MultOperatorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_multOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
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

	public static class AddOperatorContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SbvrParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(SbvrParser.SUB, 0); }
		public AddOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterAddOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitAddOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitAddOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddOperatorContext addOperator() throws RecognitionException {
		AddOperatorContext _localctx = new AddOperatorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_addOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_la = _input.LA(1);
			if ( !(_la==ADD || _la==SUB) ) {
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

	public static class EqualityOperatorContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(SbvrParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(SbvrParser.NOTEQUAL, 0); }
		public EqualityOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterEqualityOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitEqualityOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitEqualityOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityOperatorContext equalityOperator() throws RecognitionException {
		EqualityOperatorContext _localctx = new EqualityOperatorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_equalityOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_la = _input.LA(1);
			if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
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

	public static class ComparatorContext extends ParserRuleContext {
		public TerminalNode LE() { return getToken(SbvrParser.LE, 0); }
		public TerminalNode LT() { return getToken(SbvrParser.LT, 0); }
		public TerminalNode GE() { return getToken(SbvrParser.GE, 0); }
		public TerminalNode GT() { return getToken(SbvrParser.GT, 0); }
		public ComparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterComparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitComparator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitComparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparatorContext comparator() throws RecognitionException {
		ComparatorContext _localctx = new ComparatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << LE) | (1L << GE))) != 0)) ) {
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

	public static class OperandContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public NavExpressionContext navExpression() {
			return getRuleContext(NavExpressionContext.class,0);
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
		enterRule(_localctx, 28, RULE_operand);
		try {
			setState(227);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case FloatingPointLiteral:
			case TRUE:
			case FALSE:
			case DateLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				literal();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				navExpression();
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

	public static class NavExpressionContext extends ParserRuleContext {
		public RightToLeftNavigationContext rightToLeftNavigation() {
			return getRuleContext(RightToLeftNavigationContext.class,0);
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
		enterRule(_localctx, 30, RULE_navExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
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

	public static class LeftToRightNavigationContext extends ParserRuleContext {
		public FirstStepContext firstStep() {
			return getRuleContext(FirstStepContext.class,0);
		}
		public List<NavOperatorContext> navOperator() {
			return getRuleContexts(NavOperatorContext.class);
		}
		public NavOperatorContext navOperator(int i) {
			return getRuleContext(NavOperatorContext.class,i);
		}
		public List<StepContext> step() {
			return getRuleContexts(StepContext.class);
		}
		public StepContext step(int i) {
			return getRuleContext(StepContext.class,i);
		}
		public LeftToRightNavigationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftToRightNavigation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterLeftToRightNavigation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitLeftToRightNavigation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitLeftToRightNavigation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftToRightNavigationContext leftToRightNavigation() throws RecognitionException {
		LeftToRightNavigationContext _localctx = new LeftToRightNavigationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_leftToRightNavigation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			firstStep();
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OF) {
				{
				{
				setState(232);
				navOperator();
				setState(233);
				step();
				}
				}
				setState(239);
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
		public FirstStepContext firstStep() {
			return getRuleContext(FirstStepContext.class,0);
		}
		public List<StepContext> step() {
			return getRuleContexts(StepContext.class);
		}
		public StepContext step(int i) {
			return getRuleContext(StepContext.class,i);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterRightToLeftNavigation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitRightToLeftNavigation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitRightToLeftNavigation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightToLeftNavigationContext rightToLeftNavigation() throws RecognitionException {
		RightToLeftNavigationContext _localctx = new RightToLeftNavigationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_rightToLeftNavigation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(240);
					step();
					setState(241);
					navOperator();
					}
					} 
				}
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(248);
			firstStep();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FirstStepContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FirstStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_firstStep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterFirstStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitFirstStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitFirstStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FirstStepContext firstStep() throws RecognitionException {
		FirstStepContext _localctx = new FirstStepContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_firstStep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_step; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StepContext step() throws RecognitionException {
		StepContext _localctx = new StepContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_step);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
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
		enterRule(_localctx, 40, RULE_navOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
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

	public static class StructuredNaturalLanguageContext extends ParserRuleContext {
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public ModalityContext modality() {
			return getRuleContext(ModalityContext.class,0);
		}
		public StructuredNaturalLanguageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structuredNaturalLanguage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterStructuredNaturalLanguage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitStructuredNaturalLanguage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitStructuredNaturalLanguage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructuredNaturalLanguageContext structuredNaturalLanguage() throws RecognitionException {
		StructuredNaturalLanguageContext _localctx = new StructuredNaturalLanguageContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_structuredNaturalLanguage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_la = _input.LA(1);
			if (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IT_IS_OBLIGATORY_THAT - 66)) | (1L << (IT_IS_PROHIBITED_THAT - 66)) | (1L << (IT_IS_NECESSARY_THAT - 66)) | (1L << (IT_IS_IMPOSSIBLE_THAT - 66)) | (1L << (IT_IS_POSSIBLE_THAT - 66)) | (1L << (IT_IS_PERMITTED_THAT - 66)))) != 0)) {
				{
				setState(256);
				modality();
				}
			}

			setState(259);
			sentence();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModalityContext extends ParserRuleContext {
		public TerminalNode IT_IS_OBLIGATORY_THAT() { return getToken(SbvrParser.IT_IS_OBLIGATORY_THAT, 0); }
		public TerminalNode IT_IS_PROHIBITED_THAT() { return getToken(SbvrParser.IT_IS_PROHIBITED_THAT, 0); }
		public TerminalNode IT_IS_NECESSARY_THAT() { return getToken(SbvrParser.IT_IS_NECESSARY_THAT, 0); }
		public TerminalNode IT_IS_IMPOSSIBLE_THAT() { return getToken(SbvrParser.IT_IS_IMPOSSIBLE_THAT, 0); }
		public TerminalNode IT_IS_POSSIBLE_THAT() { return getToken(SbvrParser.IT_IS_POSSIBLE_THAT, 0); }
		public TerminalNode IT_IS_PERMITTED_THAT() { return getToken(SbvrParser.IT_IS_PERMITTED_THAT, 0); }
		public ModalityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modality; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterModality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitModality(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitModality(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModalityContext modality() throws RecognitionException {
		ModalityContext _localctx = new ModalityContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_modality);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_la = _input.LA(1);
			if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IT_IS_OBLIGATORY_THAT - 66)) | (1L << (IT_IS_PROHIBITED_THAT - 66)) | (1L << (IT_IS_NECESSARY_THAT - 66)) | (1L << (IT_IS_IMPOSSIBLE_THAT - 66)) | (1L << (IT_IS_POSSIBLE_THAT - 66)) | (1L << (IT_IS_PERMITTED_THAT - 66)))) != 0)) ) {
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

	public static class SentenceContext extends ParserRuleContext {
		public List<General_conceptContext> general_concept() {
			return getRuleContexts(General_conceptContext.class);
		}
		public General_conceptContext general_concept(int i) {
			return getRuleContext(General_conceptContext.class,i);
		}
		public List<VerbContext> verb() {
			return getRuleContexts(VerbContext.class);
		}
		public VerbContext verb(int i) {
			return getRuleContext(VerbContext.class,i);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_sentence);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(265); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(265);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						setState(263);
						general_concept();
						}
						break;
					case 2:
						{
						setState(264);
						verb();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(267); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class General_conceptContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DeterminerContext determiner() {
			return getRuleContext(DeterminerContext.class,0);
		}
		public General_conceptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_general_concept; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterGeneral_concept(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitGeneral_concept(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitGeneral_concept(this);
			else return visitor.visitChildren(this);
		}
	}

	public final General_conceptContext general_concept() throws RecognitionException {
		General_conceptContext _localctx = new General_conceptContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_general_concept);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_la = _input.LA(1);
			if (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & ((1L << (EACH - 49)) | (1L << (SOME - 49)) | (1L << (AT_LEAST_ONE - 49)) | (1L << (AT_LEAST - 49)) | (1L << (AT_MOST_ONE - 49)) | (1L << (AT_MOST - 49)) | (1L << (EXACTLY_ONE - 49)) | (1L << (EXACTLY - 49)) | (1L << (MORE_THAN_ONE - 49)) | (1L << (NO - 49)) | (1L << (THE - 49)) | (1L << (A - 49)))) != 0)) {
				{
				setState(269);
				determiner();
				}
			}

			setState(272);
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
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
		}
		public ArticleContext article() {
			return getRuleContext(ArticleContext.class,0);
		}
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
		enterRule(_localctx, 50, RULE_determiner);
		try {
			setState(276);
			switch (_input.LA(1)) {
			case EACH:
			case SOME:
			case AT_LEAST_ONE:
			case AT_LEAST:
			case AT_MOST_ONE:
			case AT_MOST:
			case EXACTLY_ONE:
			case EXACTLY:
			case MORE_THAN_ONE:
			case NO:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				quantifier();
				}
				break;
			case THE:
			case A:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				article();
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

	public static class VerbContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VerbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterVerb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitVerb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitVerb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VerbContext verb() throws RecognitionException {
		VerbContext _localctx = new VerbContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_verb);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class QuantifierContext extends ParserRuleContext {
		public TerminalNode EACH() { return getToken(SbvrParser.EACH, 0); }
		public TerminalNode SOME() { return getToken(SbvrParser.SOME, 0); }
		public TerminalNode AT_LEAST_ONE() { return getToken(SbvrParser.AT_LEAST_ONE, 0); }
		public TerminalNode AT_LEAST() { return getToken(SbvrParser.AT_LEAST, 0); }
		public TerminalNode AT_MOST_ONE() { return getToken(SbvrParser.AT_MOST_ONE, 0); }
		public TerminalNode AT_MOST() { return getToken(SbvrParser.AT_MOST, 0); }
		public TerminalNode EXACTLY_ONE() { return getToken(SbvrParser.EXACTLY_ONE, 0); }
		public TerminalNode EXACTLY() { return getToken(SbvrParser.EXACTLY, 0); }
		public TerminalNode MORE_THAN_ONE() { return getToken(SbvrParser.MORE_THAN_ONE, 0); }
		public TerminalNode NO() { return getToken(SbvrParser.NO, 0); }
		public QuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuantifierContext quantifier() throws RecognitionException {
		QuantifierContext _localctx = new QuantifierContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_quantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EACH) | (1L << SOME) | (1L << AT_LEAST_ONE) | (1L << AT_LEAST) | (1L << AT_MOST_ONE) | (1L << AT_MOST) | (1L << EXACTLY_ONE) | (1L << EXACTLY) | (1L << MORE_THAN_ONE) | (1L << NO))) != 0)) ) {
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

	public static class ArticleContext extends ParserRuleContext {
		public Definite_articleContext definite_article() {
			return getRuleContext(Definite_articleContext.class,0);
		}
		public Indefinite_articleContext indefinite_article() {
			return getRuleContext(Indefinite_articleContext.class,0);
		}
		public ArticleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_article; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterArticle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitArticle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitArticle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArticleContext article() throws RecognitionException {
		ArticleContext _localctx = new ArticleContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_article);
		try {
			setState(284);
			switch (_input.LA(1)) {
			case THE:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				definite_article();
				}
				break;
			case A:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				indefinite_article();
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

	public static class Definite_articleContext extends ParserRuleContext {
		public TerminalNode THE() { return getToken(SbvrParser.THE, 0); }
		public Definite_articleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definite_article; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterDefinite_article(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitDefinite_article(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitDefinite_article(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definite_articleContext definite_article() throws RecognitionException {
		Definite_articleContext _localctx = new Definite_articleContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_definite_article);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(THE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Indefinite_articleContext extends ParserRuleContext {
		public TerminalNode A() { return getToken(SbvrParser.A, 0); }
		public Indefinite_articleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indefinite_article; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterIndefinite_article(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitIndefinite_article(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitIndefinite_article(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Indefinite_articleContext indefinite_article() throws RecognitionException {
		Indefinite_articleContext _localctx = new Indefinite_articleContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_indefinite_article);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(A);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DemonstrativeContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(SbvrParser.THIS, 0); }
		public TerminalNode THAT() { return getToken(SbvrParser.THAT, 0); }
		public DemonstrativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_demonstrative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterDemonstrative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitDemonstrative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitDemonstrative(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DemonstrativeContext demonstrative() throws RecognitionException {
		DemonstrativeContext _localctx = new DemonstrativeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_demonstrative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			_la = _input.LA(1);
			if ( !(_la==THAT || _la==THIS) ) {
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

	public static class PossessiveContext extends ParserRuleContext {
		public TerminalNode ITS() { return getToken(SbvrParser.ITS, 0); }
		public PossessiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_possessive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterPossessive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitPossessive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitPossessive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PossessiveContext possessive() throws RecognitionException {
		PossessiveContext _localctx = new PossessiveContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_possessive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(ITS);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 66, RULE_literal);
		try {
			setState(301);
			switch (_input.LA(1)) {
			case IntegerLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				integerLiteral();
				}
				break;
			case FloatingPointLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				floatingPointLiteral();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(296);
				booleanLiteral();
				}
				break;
			case DateLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(297);
				dateLiteral();
				}
				break;
			case CharacterLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(298);
				characterLiteral();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 6);
				{
				setState(299);
				stringLiteral();
				}
				break;
			case NullLiteral:
				enterOuterAlt(_localctx, 7);
				{
				setState(300);
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

	public static class WordContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SbvrParser.Identifier, 0); }
		public WordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).enterWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SbvrParserListener ) ((SbvrParserListener)listener).exitWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SbvrParserVisitor ) return ((SbvrParserVisitor<? extends T>)visitor).visitWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WordContext word() throws RecognitionException {
		WordContext _localctx = new WordContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_word);
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
		enterRule(_localctx, 70, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
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
		enterRule(_localctx, 72, RULE_integerLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
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
		enterRule(_localctx, 74, RULE_floatingPointLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
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
		public TerminalNode TRUE() { return getToken(SbvrParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SbvrParser.FALSE, 0); }
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
		enterRule(_localctx, 76, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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
		enterRule(_localctx, 78, RULE_dateLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
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
		enterRule(_localctx, 80, RULE_characterLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
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
		enterRule(_localctx, 82, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
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
		enterRule(_localctx, 84, RULE_nullLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return sbvrExpression_sempred((SbvrExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean sbvrExpression_sempred(SbvrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3l\u0144\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\7\2Z\n\2\f\2\16\2]\13\2\3\2\7\2`\n\2\f\2\16\2c\13\2\3\2\7\2f"+
		"\n\2\f\2\16\2i\13\2\3\3\3\3\6\3m\n\3\r\3\16\3n\3\3\3\3\6\3s\n\3\r\3\16"+
		"\3t\3\3\3\3\3\4\6\4z\n\4\r\4\16\4{\3\4\3\4\3\4\3\4\3\5\3\5\5\5\u0084\n"+
		"\5\3\6\3\6\3\6\7\6\u0089\n\6\f\6\16\6\u008c\13\6\3\7\3\7\7\7\u0090\n\7"+
		"\f\7\16\7\u0093\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\6\b\u009e\n\b"+
		"\r\b\16\b\u009f\3\t\3\t\7\t\u00a4\n\t\f\t\16\t\u00a7\13\t\3\t\3\t\3\t"+
		"\3\n\3\n\7\n\u00ae\n\n\f\n\16\n\u00b1\13\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\5\13\u00ba\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\7\13\u00d7\n\13\f\13\16\13\u00da\13\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\5\20\u00e6\n\20\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\7\22\u00ee\n\22\f\22\16\22\u00f1\13\22\3\23\3\23\3\23\7\23\u00f6"+
		"\n\23\f\23\16\23\u00f9\13\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3"+
		"\27\5\27\u0104\n\27\3\27\3\27\3\30\3\30\3\31\3\31\6\31\u010c\n\31\r\31"+
		"\16\31\u010d\3\32\5\32\u0111\n\32\3\32\3\32\3\33\3\33\5\33\u0117\n\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\5\36\u011f\n\36\3\37\3\37\3 \3 \3!\3!\3"+
		"\"\3\"\3#\3#\3#\3#\3#\3#\3#\5#\u0130\n#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3"+
		"(\3)\3)\3*\3*\3+\3+\3,\3,\3,\2\3\24-\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTV\2\n\4\2-.\61\61\3\2+,\4\2"+
		"$$\'\'\4\2\36\37%&\3\2DI\3\2\63<\4\2YY]]\3\2\13\f\u013c\2[\3\2\2\2\4j"+
		"\3\2\2\2\6y\3\2\2\2\b\u0083\3\2\2\2\n\u0085\3\2\2\2\f\u008d\3\2\2\2\16"+
		"\u0097\3\2\2\2\20\u00a1\3\2\2\2\22\u00ab\3\2\2\2\24\u00b9\3\2\2\2\26\u00db"+
		"\3\2\2\2\30\u00dd\3\2\2\2\32\u00df\3\2\2\2\34\u00e1\3\2\2\2\36\u00e5\3"+
		"\2\2\2 \u00e7\3\2\2\2\"\u00e9\3\2\2\2$\u00f7\3\2\2\2&\u00fc\3\2\2\2(\u00fe"+
		"\3\2\2\2*\u0100\3\2\2\2,\u0103\3\2\2\2.\u0107\3\2\2\2\60\u010b\3\2\2\2"+
		"\62\u0110\3\2\2\2\64\u0116\3\2\2\2\66\u0118\3\2\2\28\u011a\3\2\2\2:\u011e"+
		"\3\2\2\2<\u0120\3\2\2\2>\u0122\3\2\2\2@\u0124\3\2\2\2B\u0126\3\2\2\2D"+
		"\u012f\3\2\2\2F\u0131\3\2\2\2H\u0133\3\2\2\2J\u0135\3\2\2\2L\u0137\3\2"+
		"\2\2N\u0139\3\2\2\2P\u013b\3\2\2\2R\u013d\3\2\2\2T\u013f\3\2\2\2V\u0141"+
		"\3\2\2\2XZ\5\4\3\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\a\3\2\2\2"+
		"][\3\2\2\2^`\5\6\4\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bg\3\2\2\2"+
		"ca\3\2\2\2df\5\b\5\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\3\3\2\2"+
		"\2ig\3\2\2\2jl\7\3\2\2km\5F$\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2"+
		"op\3\2\2\2pr\7\"\2\2qs\5F$\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2u"+
		"v\3\2\2\2vw\7\32\2\2w\5\3\2\2\2xz\5F$\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2"+
		"{|\3\2\2\2|}\3\2\2\2}~\7\"\2\2~\177\5\24\13\2\177\u0080\7\32\2\2\u0080"+
		"\7\3\2\2\2\u0081\u0084\5\n\6\2\u0082\u0084\5\16\b\2\u0083\u0081\3\2\2"+
		"\2\u0083\u0082\3\2\2\2\u0084\t\3\2\2\2\u0085\u0086\7\4\2\2\u0086\u008a"+
		"\7g\2\2\u0087\u0089\5\f\7\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\13\3\2\2\2\u008c\u008a\3\2\2"+
		"\2\u008d\u0091\7\5\2\2\u008e\u0090\5F$\2\u008f\u008e\3\2\2\2\u0090\u0093"+
		"\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0094\u0095\7\"\2\2\u0095\u0096\5\24\13\2\u0096\r\3\2\2"+
		"\2\u0097\u0098\7\4\2\2\u0098\u0099\7g\2\2\u0099\u009a\7#\2\2\u009a\u009d"+
		"\7g\2\2\u009b\u009e\5\20\t\2\u009c\u009e\5\22\n\2\u009d\u009b\3\2\2\2"+
		"\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0"+
		"\3\2\2\2\u00a0\17\3\2\2\2\u00a1\u00a5\7\6\2\2\u00a2\u00a4\5F$\2\u00a3"+
		"\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2"+
		"\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\7\"\2\2\u00a9"+
		"\u00aa\5\24\13\2\u00aa\21\3\2\2\2\u00ab\u00af\7\7\2\2\u00ac\u00ae\5F$"+
		"\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0"+
		"\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\7\"\2\2\u00b3"+
		"\u00b4\5\24\13\2\u00b4\23\3\2\2\2\u00b5\u00b6\b\13\1\2\u00b6\u00ba\5 "+
		"\21\2\u00b7\u00b8\7S\2\2\u00b8\u00ba\5\24\13\6\u00b9\u00b5\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00ba\u00d8\3\2\2\2\u00bb\u00bc\f\n\2\2\u00bc\u00bd\5\26"+
		"\f\2\u00bd\u00be\5\24\13\13\u00be\u00d7\3\2\2\2\u00bf\u00c0\f\t\2\2\u00c0"+
		"\u00c1\5\30\r\2\u00c1\u00c2\5\24\13\n\u00c2\u00d7\3\2\2\2\u00c3\u00c4"+
		"\f\b\2\2\u00c4\u00c5\5\34\17\2\u00c5\u00c6\5\24\13\t\u00c6\u00d7\3\2\2"+
		"\2\u00c7\u00c8\f\7\2\2\u00c8\u00c9\5\32\16\2\u00c9\u00ca\5\24\13\b\u00ca"+
		"\u00d7\3\2\2\2\u00cb\u00cc\f\5\2\2\u00cc\u00cd\7(\2\2\u00cd\u00d7\5\24"+
		"\13\6\u00ce\u00cf\f\4\2\2\u00cf\u00d0\7)\2\2\u00d0\u00d7\5\24\13\5\u00d1"+
		"\u00d2\f\3\2\2\u00d2\u00d3\7*\2\2\u00d3\u00d4\5\24\13\2\u00d4\u00d5\5"+
		",\27\2\u00d5\u00d7\3\2\2\2\u00d6\u00bb\3\2\2\2\u00d6\u00bf\3\2\2\2\u00d6"+
		"\u00c3\3\2\2\2\u00d6\u00c7\3\2\2\2\u00d6\u00cb\3\2\2\2\u00d6\u00ce\3\2"+
		"\2\2\u00d6\u00d1\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9\25\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dc\t\2\2"+
		"\2\u00dc\27\3\2\2\2\u00dd\u00de\t\3\2\2\u00de\31\3\2\2\2\u00df\u00e0\t"+
		"\4\2\2\u00e0\33\3\2\2\2\u00e1\u00e2\t\5\2\2\u00e2\35\3\2\2\2\u00e3\u00e6"+
		"\5D#\2\u00e4\u00e6\5 \21\2\u00e5\u00e3\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6"+
		"\37\3\2\2\2\u00e7\u00e8\5$\23\2\u00e8!\3\2\2\2\u00e9\u00ef\5&\24\2\u00ea"+
		"\u00eb\5*\26\2\u00eb\u00ec\5(\25\2\u00ec\u00ee\3\2\2\2\u00ed\u00ea\3\2"+
		"\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"#\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\5(\25\2\u00f3\u00f4\5*\26\2"+
		"\u00f4\u00f6\3\2\2\2\u00f5\u00f2\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5"+
		"\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa"+
		"\u00fb\5&\24\2\u00fb%\3\2\2\2\u00fc\u00fd\5H%\2\u00fd\'\3\2\2\2\u00fe"+
		"\u00ff\5H%\2\u00ff)\3\2\2\2\u0100\u0101\7\62\2\2\u0101+\3\2\2\2\u0102"+
		"\u0104\5.\30\2\u0103\u0102\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2"+
		"\2\2\u0105\u0106\5\60\31\2\u0106-\3\2\2\2\u0107\u0108\t\6\2\2\u0108/\3"+
		"\2\2\2\u0109\u010c\5\62\32\2\u010a\u010c\5\66\34\2\u010b\u0109\3\2\2\2"+
		"\u010b\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e"+
		"\3\2\2\2\u010e\61\3\2\2\2\u010f\u0111\5\64\33\2\u0110\u010f\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\5H%\2\u0113\63\3\2\2\2"+
		"\u0114\u0117\58\35\2\u0115\u0117\5:\36\2\u0116\u0114\3\2\2\2\u0116\u0115"+
		"\3\2\2\2\u0117\65\3\2\2\2\u0118\u0119\5H%\2\u0119\67\3\2\2\2\u011a\u011b"+
		"\t\7\2\2\u011b9\3\2\2\2\u011c\u011f\5<\37\2\u011d\u011f\5> \2\u011e\u011c"+
		"\3\2\2\2\u011e\u011d\3\2\2\2\u011f;\3\2\2\2\u0120\u0121\7T\2\2\u0121="+
		"\3\2\2\2\u0122\u0123\7W\2\2\u0123?\3\2\2\2\u0124\u0125\t\b\2\2\u0125A"+
		"\3\2\2\2\u0126\u0127\7^\2\2\u0127C\3\2\2\2\u0128\u0130\5J&\2\u0129\u0130"+
		"\5L\'\2\u012a\u0130\5N(\2\u012b\u0130\5P)\2\u012c\u0130\5R*\2\u012d\u0130"+
		"\5T+\2\u012e\u0130\5V,\2\u012f\u0128\3\2\2\2\u012f\u0129\3\2\2\2\u012f"+
		"\u012a\3\2\2\2\u012f\u012b\3\2\2\2\u012f\u012c\3\2\2\2\u012f\u012d\3\2"+
		"\2\2\u012f\u012e\3\2\2\2\u0130E\3\2\2\2\u0131\u0132\7g\2\2\u0132G\3\2"+
		"\2\2\u0133\u0134\7g\2\2\u0134I\3\2\2\2\u0135\u0136\7\t\2\2\u0136K\3\2"+
		"\2\2\u0137\u0138\7\n\2\2\u0138M\3\2\2\2\u0139\u013a\t\t\2\2\u013aO\3\2"+
		"\2\2\u013b\u013c\7\r\2\2\u013cQ\3\2\2\2\u013d\u013e\7\16\2\2\u013eS\3"+
		"\2\2\2\u013f\u0140\7\17\2\2\u0140U\3\2\2\2\u0141\u0142\7\20\2\2\u0142"+
		"W\3\2\2\2\34[agnt{\u0083\u008a\u0091\u009d\u009f\u00a5\u00af\u00b9\u00d6"+
		"\u00d8\u00e5\u00ef\u00f7\u0103\u010b\u010d\u0110\u0116\u011e\u012f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}