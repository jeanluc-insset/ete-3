// Generated from fr/insset/jeanluc/ete/cucumber/CucumberParser.g4 by ANTLR 4.5.3
package fr.insset.jeanluc.ete.cucumber;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CucumberParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CucumberParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CucumberParser#cucumberExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCucumberExpression(CucumberParser.CucumberExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CucumberParser#xorExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXorExpression(CucumberParser.XorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CucumberParser#orExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(CucumberParser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CucumberParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(CucumberParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CucumberParser#notOrNotNotExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotOrNotNotExpression(CucumberParser.NotOrNotNotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CucumberParser#notExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(CucumberParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CucumberParser#affirmativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAffirmativeExpression(CucumberParser.AffirmativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CucumberParser#greaterThanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanExpression(CucumberParser.GreaterThanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CucumberParser#greaterOrEqualExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterOrEqualExpression(CucumberParser.GreaterOrEqualExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CucumberParser#lessThanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanExpression(CucumberParser.LessThanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CucumberParser#lessOrEqualExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessOrEqualExpression(CucumberParser.LessOrEqualExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CucumberParser#compareExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpression(CucumberParser.CompareExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CucumberParser#equalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualExpression(CucumberParser.EqualExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CucumberParser#differentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDifferentExpression(CucumberParser.DifferentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CucumberParser#addOrSubExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOrSubExpression(CucumberParser.AddOrSubExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CucumberParser#addExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpression(CucumberParser.AddExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CucumberParser#subExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpression(CucumberParser.SubExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CucumberParser#multOrDivExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultOrDivExpression(CucumberParser.MultOrDivExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CucumberParser#multExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExpression(CucumberParser.MultExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CucumberParser#divExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivExpression(CucumberParser.DivExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CucumberParser#modExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModExpression(CucumberParser.ModExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CucumberParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(CucumberParser.OperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link CucumberParser#navExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavExpression(CucumberParser.NavExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CucumberParser#parenthesisExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisExpression(CucumberParser.ParenthesisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CucumberParser#variableDeclarationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationExpression(CucumberParser.VariableDeclarationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CucumberParser#typeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeExpression(CucumberParser.TypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CucumberParser#atomicTypeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomicTypeExpression(CucumberParser.AtomicTypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CucumberParser#oppExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOppExpression(CucumberParser.OppExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CucumberParser#variableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableReference(CucumberParser.VariableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link CucumberParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(CucumberParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CucumberParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(CucumberParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CucumberParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(CucumberParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CucumberParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(CucumberParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CucumberParser#floatingPointLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatingPointLiteral(CucumberParser.FloatingPointLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CucumberParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(CucumberParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CucumberParser#dateLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateLiteral(CucumberParser.DateLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CucumberParser#characterLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterLiteral(CucumberParser.CharacterLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CucumberParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(CucumberParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CucumberParser#nullLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteral(CucumberParser.NullLiteralContext ctx);
}