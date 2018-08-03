// Generated from src/test/ete/GrammarParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#nlExpression}.
	 * @param ctx the parse tree
	 */
	void enterNlExpression(GrammarParser.NlExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#nlExpression}.
	 * @param ctx the parse tree
	 */
	void exitNlExpression(GrammarParser.NlExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#navExpression}.
	 * @param ctx the parse tree
	 */
	void enterNavExpression(GrammarParser.NavExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#navExpression}.
	 * @param ctx the parse tree
	 */
	void exitNavExpression(GrammarParser.NavExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#atPreExpression}.
	 * @param ctx the parse tree
	 */
	void enterAtPreExpression(GrammarParser.AtPreExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#atPreExpression}.
	 * @param ctx the parse tree
	 */
	void exitAtPreExpression(GrammarParser.AtPreExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#constraintFile}.
	 * @param ctx the parse tree
	 */
	void enterConstraintFile(GrammarParser.ConstraintFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#constraintFile}.
	 * @param ctx the parse tree
	 */
	void exitConstraintFile(GrammarParser.ConstraintFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#contextualConstraints}.
	 * @param ctx the parse tree
	 */
	void enterContextualConstraints(GrammarParser.ContextualConstraintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#contextualConstraints}.
	 * @param ctx the parse tree
	 */
	void exitContextualConstraints(GrammarParser.ContextualConstraintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#class_context}.
	 * @param ctx the parse tree
	 */
	void enterClass_context(GrammarParser.Class_contextContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#class_context}.
	 * @param ctx the parse tree
	 */
	void exitClass_context(GrammarParser.Class_contextContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#invariant}.
	 * @param ctx the parse tree
	 */
	void enterInvariant(GrammarParser.InvariantContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#invariant}.
	 * @param ctx the parse tree
	 */
	void exitInvariant(GrammarParser.InvariantContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#operationDefinition}.
	 * @param ctx the parse tree
	 */
	void enterOperationDefinition(GrammarParser.OperationDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#operationDefinition}.
	 * @param ctx the parse tree
	 */
	void exitOperationDefinition(GrammarParser.OperationDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#operationName}.
	 * @param ctx the parse tree
	 */
	void enterOperationName(GrammarParser.OperationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#operationName}.
	 * @param ctx the parse tree
	 */
	void exitOperationName(GrammarParser.OperationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#attributeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterAttributeDefinition(GrammarParser.AttributeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#attributeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitAttributeDefinition(GrammarParser.AttributeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#operationContext}.
	 * @param ctx the parse tree
	 */
	void enterOperationContext(GrammarParser.OperationContextContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#operationContext}.
	 * @param ctx the parse tree
	 */
	void exitOperationContext(GrammarParser.OperationContextContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(GrammarParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(GrammarParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(GrammarParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(GrammarParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#list_mark}.
	 * @param ctx the parse tree
	 */
	void enterList_mark(GrammarParser.List_markContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#list_mark}.
	 * @param ctx the parse tree
	 */
	void exitList_mark(GrammarParser.List_markContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#impliesExpression}.
	 * @param ctx the parse tree
	 */
	void enterImpliesExpression(GrammarParser.ImpliesExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#impliesExpression}.
	 * @param ctx the parse tree
	 */
	void exitImpliesExpression(GrammarParser.ImpliesExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#xorExpression}.
	 * @param ctx the parse tree
	 */
	void enterXorExpression(GrammarParser.XorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#xorExpression}.
	 * @param ctx the parse tree
	 */
	void exitXorExpression(GrammarParser.XorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(GrammarParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(GrammarParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(GrammarParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(GrammarParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#notOrNotNotExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotOrNotNotExpression(GrammarParser.NotOrNotNotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#notOrNotNotExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotOrNotNotExpression(GrammarParser.NotOrNotNotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#notExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(GrammarParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#notExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(GrammarParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#affirmativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterAffirmativeExpression(GrammarParser.AffirmativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#affirmativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitAffirmativeExpression(GrammarParser.AffirmativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#greaterThanExpression}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanExpression(GrammarParser.GreaterThanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#greaterThanExpression}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanExpression(GrammarParser.GreaterThanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#greaterOrEqualExpression}.
	 * @param ctx the parse tree
	 */
	void enterGreaterOrEqualExpression(GrammarParser.GreaterOrEqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#greaterOrEqualExpression}.
	 * @param ctx the parse tree
	 */
	void exitGreaterOrEqualExpression(GrammarParser.GreaterOrEqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#lessThanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLessThanExpression(GrammarParser.LessThanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#lessThanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLessThanExpression(GrammarParser.LessThanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#lessOrEqualExpression}.
	 * @param ctx the parse tree
	 */
	void enterLessOrEqualExpression(GrammarParser.LessOrEqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#lessOrEqualExpression}.
	 * @param ctx the parse tree
	 */
	void exitLessOrEqualExpression(GrammarParser.LessOrEqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#compareExpression}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpression(GrammarParser.CompareExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#compareExpression}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpression(GrammarParser.CompareExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#equalExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualExpression(GrammarParser.EqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#equalExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualExpression(GrammarParser.EqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#differentExpression}.
	 * @param ctx the parse tree
	 */
	void enterDifferentExpression(GrammarParser.DifferentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#differentExpression}.
	 * @param ctx the parse tree
	 */
	void exitDifferentExpression(GrammarParser.DifferentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#addOrSubExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddOrSubExpression(GrammarParser.AddOrSubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#addOrSubExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddOrSubExpression(GrammarParser.AddOrSubExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#multOrDivExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultOrDivExpression(GrammarParser.MultOrDivExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#multOrDivExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultOrDivExpression(GrammarParser.MultOrDivExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#multExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultExpression(GrammarParser.MultExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#multExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultExpression(GrammarParser.MultExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#divExpression}.
	 * @param ctx the parse tree
	 */
	void enterDivExpression(GrammarParser.DivExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#divExpression}.
	 * @param ctx the parse tree
	 */
	void exitDivExpression(GrammarParser.DivExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#modExpression}.
	 * @param ctx the parse tree
	 */
	void enterModExpression(GrammarParser.ModExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#modExpression}.
	 * @param ctx the parse tree
	 */
	void exitModExpression(GrammarParser.ModExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(GrammarParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(GrammarParser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#includesExpression}.
	 * @param ctx the parse tree
	 */
	void enterIncludesExpression(GrammarParser.IncludesExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#includesExpression}.
	 * @param ctx the parse tree
	 */
	void exitIncludesExpression(GrammarParser.IncludesExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#excludesExpression}.
	 * @param ctx the parse tree
	 */
	void enterExcludesExpression(GrammarParser.ExcludesExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#excludesExpression}.
	 * @param ctx the parse tree
	 */
	void exitExcludesExpression(GrammarParser.ExcludesExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#selectExpression}.
	 * @param ctx the parse tree
	 */
	void enterSelectExpression(GrammarParser.SelectExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#selectExpression}.
	 * @param ctx the parse tree
	 */
	void exitSelectExpression(GrammarParser.SelectExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#existsExpression}.
	 * @param ctx the parse tree
	 */
	void enterExistsExpression(GrammarParser.ExistsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#existsExpression}.
	 * @param ctx the parse tree
	 */
	void exitExistsExpression(GrammarParser.ExistsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#navExpressionRightToLeft}.
	 * @param ctx the parse tree
	 */
	void enterNavExpressionRightToLeft(GrammarParser.NavExpressionRightToLeftContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#navExpressionRightToLeft}.
	 * @param ctx the parse tree
	 */
	void exitNavExpressionRightToLeft(GrammarParser.NavExpressionRightToLeftContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#navExpressionLeftToRight}.
	 * @param ctx the parse tree
	 */
	void enterNavExpressionLeftToRight(GrammarParser.NavExpressionLeftToRightContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#navExpressionLeftToRight}.
	 * @param ctx the parse tree
	 */
	void exitNavExpressionLeftToRight(GrammarParser.NavExpressionLeftToRightContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#prefixedAtPreExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrefixedAtPreExpression(GrammarParser.PrefixedAtPreExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#prefixedAtPreExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrefixedAtPreExpression(GrammarParser.PrefixedAtPreExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#postfixedAtPreExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixedAtPreExpression(GrammarParser.PostfixedAtPreExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#postfixedAtPreExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixedAtPreExpression(GrammarParser.PostfixedAtPreExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#currentExpression}.
	 * @param ctx the parse tree
	 */
	void enterCurrentExpression(GrammarParser.CurrentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#currentExpression}.
	 * @param ctx the parse tree
	 */
	void exitCurrentExpression(GrammarParser.CurrentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#step}.
	 * @param ctx the parse tree
	 */
	void enterStep(GrammarParser.StepContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#step}.
	 * @param ctx the parse tree
	 */
	void exitStep(GrammarParser.StepContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#finalStep}.
	 * @param ctx the parse tree
	 */
	void enterFinalStep(GrammarParser.FinalStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#finalStep}.
	 * @param ctx the parse tree
	 */
	void exitFinalStep(GrammarParser.FinalStepContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#oclIsNew}.
	 * @param ctx the parse tree
	 */
	void enterOclIsNew(GrammarParser.OclIsNewContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#oclIsNew}.
	 * @param ctx the parse tree
	 */
	void exitOclIsNew(GrammarParser.OclIsNewContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#oppExpression}.
	 * @param ctx the parse tree
	 */
	void enterOppExpression(GrammarParser.OppExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#oppExpression}.
	 * @param ctx the parse tree
	 */
	void exitOppExpression(GrammarParser.OppExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#selfExpression}.
	 * @param ctx the parse tree
	 */
	void enterSelfExpression(GrammarParser.SelfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#selfExpression}.
	 * @param ctx the parse tree
	 */
	void exitSelfExpression(GrammarParser.SelfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void enterVariableReference(GrammarParser.VariableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void exitVariableReference(GrammarParser.VariableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(GrammarParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(GrammarParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#preposition}.
	 * @param ctx the parse tree
	 */
	void enterPreposition(GrammarParser.PrepositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#preposition}.
	 * @param ctx the parse tree
	 */
	void exitPreposition(GrammarParser.PrepositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(GrammarParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(GrammarParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(GrammarParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(GrammarParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(GrammarParser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(GrammarParser.WordContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(GrammarParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(GrammarParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#floatingPointLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointLiteral(GrammarParser.FloatingPointLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#floatingPointLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointLiteral(GrammarParser.FloatingPointLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(GrammarParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(GrammarParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#dateLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDateLiteral(GrammarParser.DateLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#dateLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDateLiteral(GrammarParser.DateLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#characterLiteral}.
	 * @param ctx the parse tree
	 */
	void enterCharacterLiteral(GrammarParser.CharacterLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#characterLiteral}.
	 * @param ctx the parse tree
	 */
	void exitCharacterLiteral(GrammarParser.CharacterLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(GrammarParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(GrammarParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#nullLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(GrammarParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#nullLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(GrammarParser.NullLiteralContext ctx);
}