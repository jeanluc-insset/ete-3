// Generated from fr/insset/jeanluc/gel/GelParser.g4 by ANTLR 4.5.3
package fr.insset.jeanluc.gel;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GelParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GelParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GelParser#gelExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGelExpression(GelParser.GelExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#xorExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXorExpression(GelParser.XorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#orExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(GelParser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(GelParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#notOrNotNotExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotOrNotNotExpression(GelParser.NotOrNotNotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#notExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(GelParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#notNotExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotNotExpression(GelParser.NotNotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#orderExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderExpression(GelParser.OrderExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#compareExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpression(GelParser.CompareExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#addOrSubExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOrSubExpression(GelParser.AddOrSubExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#multOrDivExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultOrDivExpression(GelParser.MultOrDivExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(GelParser.OperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#complexNavExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexNavExpression(GelParser.ComplexNavExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#stepExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStepExpression(GelParser.StepExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#filterExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterExpression(GelParser.FilterExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(GelParser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#variableDeclarationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationExpression(GelParser.VariableDeclarationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#typeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeExpression(GelParser.TypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#atomicTypeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomicTypeExpression(GelParser.AtomicTypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#sequenceTypeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequenceTypeExpression(GelParser.SequenceTypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#bagTypeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBagTypeExpression(GelParser.BagTypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#setTypeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTypeExpression(GelParser.SetTypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#orderedSetTypeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderedSetTypeExpression(GelParser.OrderedSetTypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#oppExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOppExpression(GelParser.OppExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#selfExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfExpression(GelParser.SelfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#variableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableReference(GelParser.VariableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#featureExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeatureExpression(GelParser.FeatureExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#propertyNavigationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyNavigationExpression(GelParser.PropertyNavigationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#operationNavigationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationNavigationExpression(GelParser.OperationNavigationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(GelParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(GelParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(GelParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(GelParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#floatingPointLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatingPointLiteral(GelParser.FloatingPointLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(GelParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#dateLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateLiteral(GelParser.DateLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#characterLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterLiteral(GelParser.CharacterLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(GelParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser#nullLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteral(GelParser.NullLiteralContext ctx);
}