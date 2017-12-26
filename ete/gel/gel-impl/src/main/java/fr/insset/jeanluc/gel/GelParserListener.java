// Generated from fr/insset/jeanluc/gel/GelParser.g4 by ANTLR 4.5.3
package fr.insset.jeanluc.gel;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GelParser}.
 */
public interface GelParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GelParser#gelExpression}.
	 * @param ctx the parse tree
	 */
	void enterGelExpression(GelParser.GelExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#gelExpression}.
	 * @param ctx the parse tree
	 */
	void exitGelExpression(GelParser.GelExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#xorExpression}.
	 * @param ctx the parse tree
	 */
	void enterXorExpression(GelParser.XorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#xorExpression}.
	 * @param ctx the parse tree
	 */
	void exitXorExpression(GelParser.XorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(GelParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(GelParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(GelParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(GelParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#notOrNotNotExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotOrNotNotExpression(GelParser.NotOrNotNotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#notOrNotNotExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotOrNotNotExpression(GelParser.NotOrNotNotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#notExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(GelParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#notExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(GelParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#notNotExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotNotExpression(GelParser.NotNotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#notNotExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotNotExpression(GelParser.NotNotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#orderExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrderExpression(GelParser.OrderExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#orderExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrderExpression(GelParser.OrderExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#compareExpression}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpression(GelParser.CompareExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#compareExpression}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpression(GelParser.CompareExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#addOrSubExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddOrSubExpression(GelParser.AddOrSubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#addOrSubExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddOrSubExpression(GelParser.AddOrSubExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#multOrDivExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultOrDivExpression(GelParser.MultOrDivExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#multOrDivExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultOrDivExpression(GelParser.MultOrDivExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(GelParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(GelParser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#complexNavExpression}.
	 * @param ctx the parse tree
	 */
	void enterComplexNavExpression(GelParser.ComplexNavExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#complexNavExpression}.
	 * @param ctx the parse tree
	 */
	void exitComplexNavExpression(GelParser.ComplexNavExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#stepExpression}.
	 * @param ctx the parse tree
	 */
	void enterStepExpression(GelParser.StepExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#stepExpression}.
	 * @param ctx the parse tree
	 */
	void exitStepExpression(GelParser.StepExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#filterExpression}.
	 * @param ctx the parse tree
	 */
	void enterFilterExpression(GelParser.FilterExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#filterExpression}.
	 * @param ctx the parse tree
	 */
	void exitFilterExpression(GelParser.FilterExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(GelParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(GelParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#variableDeclarationExpression}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationExpression(GelParser.VariableDeclarationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#variableDeclarationExpression}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationExpression(GelParser.VariableDeclarationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void enterTypeExpression(GelParser.TypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void exitTypeExpression(GelParser.TypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#atomicTypeExpression}.
	 * @param ctx the parse tree
	 */
	void enterAtomicTypeExpression(GelParser.AtomicTypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#atomicTypeExpression}.
	 * @param ctx the parse tree
	 */
	void exitAtomicTypeExpression(GelParser.AtomicTypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#sequenceTypeExpression}.
	 * @param ctx the parse tree
	 */
	void enterSequenceTypeExpression(GelParser.SequenceTypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#sequenceTypeExpression}.
	 * @param ctx the parse tree
	 */
	void exitSequenceTypeExpression(GelParser.SequenceTypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#bagTypeExpression}.
	 * @param ctx the parse tree
	 */
	void enterBagTypeExpression(GelParser.BagTypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#bagTypeExpression}.
	 * @param ctx the parse tree
	 */
	void exitBagTypeExpression(GelParser.BagTypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#setTypeExpression}.
	 * @param ctx the parse tree
	 */
	void enterSetTypeExpression(GelParser.SetTypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#setTypeExpression}.
	 * @param ctx the parse tree
	 */
	void exitSetTypeExpression(GelParser.SetTypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#orderedSetTypeExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrderedSetTypeExpression(GelParser.OrderedSetTypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#orderedSetTypeExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrderedSetTypeExpression(GelParser.OrderedSetTypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#oppExpression}.
	 * @param ctx the parse tree
	 */
	void enterOppExpression(GelParser.OppExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#oppExpression}.
	 * @param ctx the parse tree
	 */
	void exitOppExpression(GelParser.OppExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#selfExpression}.
	 * @param ctx the parse tree
	 */
	void enterSelfExpression(GelParser.SelfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#selfExpression}.
	 * @param ctx the parse tree
	 */
	void exitSelfExpression(GelParser.SelfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void enterVariableReference(GelParser.VariableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void exitVariableReference(GelParser.VariableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#featureExpression}.
	 * @param ctx the parse tree
	 */
	void enterFeatureExpression(GelParser.FeatureExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#featureExpression}.
	 * @param ctx the parse tree
	 */
	void exitFeatureExpression(GelParser.FeatureExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#propertyNavigationExpression}.
	 * @param ctx the parse tree
	 */
	void enterPropertyNavigationExpression(GelParser.PropertyNavigationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#propertyNavigationExpression}.
	 * @param ctx the parse tree
	 */
	void exitPropertyNavigationExpression(GelParser.PropertyNavigationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#operationNavigationExpression}.
	 * @param ctx the parse tree
	 */
	void enterOperationNavigationExpression(GelParser.OperationNavigationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#operationNavigationExpression}.
	 * @param ctx the parse tree
	 */
	void exitOperationNavigationExpression(GelParser.OperationNavigationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(GelParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(GelParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(GelParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(GelParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(GelParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(GelParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(GelParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(GelParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#floatingPointLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointLiteral(GelParser.FloatingPointLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#floatingPointLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointLiteral(GelParser.FloatingPointLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(GelParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(GelParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#dateLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDateLiteral(GelParser.DateLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#dateLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDateLiteral(GelParser.DateLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#characterLiteral}.
	 * @param ctx the parse tree
	 */
	void enterCharacterLiteral(GelParser.CharacterLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#characterLiteral}.
	 * @param ctx the parse tree
	 */
	void exitCharacterLiteral(GelParser.CharacterLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(GelParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(GelParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link GelParser#nullLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(GelParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GelParser#nullLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(GelParser.NullLiteralContext ctx);
}