// Generated from fr/insset/jeanluc/ete/nl/FrenchParser.g4 by ANTLR 4.5.3
package fr.insset.jeanluc.ete.nl;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FrenchParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FrenchParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FrenchParser#nlExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNlExpression(FrenchParser.NlExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#xorExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXorExpression(FrenchParser.XorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#orExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(FrenchParser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(FrenchParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#notOrNotNotExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotOrNotNotExpression(FrenchParser.NotOrNotNotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#notExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(FrenchParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#affirmativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAffirmativeExpression(FrenchParser.AffirmativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#greaterThanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanExpression(FrenchParser.GreaterThanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#greaterOrEqualExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterOrEqualExpression(FrenchParser.GreaterOrEqualExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#lessThanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanExpression(FrenchParser.LessThanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#lessOrEqualExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessOrEqualExpression(FrenchParser.LessOrEqualExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#compareExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpression(FrenchParser.CompareExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#equalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualExpression(FrenchParser.EqualExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#differentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDifferentExpression(FrenchParser.DifferentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#addOrSubExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOrSubExpression(FrenchParser.AddOrSubExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#addExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpression(FrenchParser.AddExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#subExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpression(FrenchParser.SubExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#multOrDivExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultOrDivExpression(FrenchParser.MultOrDivExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#multExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExpression(FrenchParser.MultExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#divExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivExpression(FrenchParser.DivExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#modExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModExpression(FrenchParser.ModExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(FrenchParser.OperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#parenthesisExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisExpression(FrenchParser.ParenthesisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#navExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavExpression(FrenchParser.NavExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStep(FrenchParser.StepContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#finalStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinalStep(FrenchParser.FinalStepContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#oclIsNew}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOclIsNew(FrenchParser.OclIsNewContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#oclIsTypeOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOclIsTypeOf(FrenchParser.OclIsTypeOfContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#oclIsKindOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOclIsKindOf(FrenchParser.OclIsKindOfContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#primitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive(FrenchParser.PrimitiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#attributeNavExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeNavExpression(FrenchParser.AttributeNavExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#atPreExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtPreExpression(FrenchParser.AtPreExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#asTypeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsTypeExpression(FrenchParser.AsTypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#methodNavExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodNavExpression(FrenchParser.MethodNavExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#collectionMethodNavExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionMethodNavExpression(FrenchParser.CollectionMethodNavExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#variableOrMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableOrMember(FrenchParser.VariableOrMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#variableOrMemberAtPre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableOrMemberAtPre(FrenchParser.VariableOrMemberAtPreContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(FrenchParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#variableDeclarationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationExpression(FrenchParser.VariableDeclarationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#typeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeExpression(FrenchParser.TypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#atomicTypeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomicTypeExpression(FrenchParser.AtomicTypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#sequenceTypeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequenceTypeExpression(FrenchParser.SequenceTypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#bagTypeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBagTypeExpression(FrenchParser.BagTypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#setTypeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTypeExpression(FrenchParser.SetTypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#orderedSetTypeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderedSetTypeExpression(FrenchParser.OrderedSetTypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#oppExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOppExpression(FrenchParser.OppExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#selfExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfExpression(FrenchParser.SelfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#variableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableReference(FrenchParser.VariableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(FrenchParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(FrenchParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(FrenchParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(FrenchParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#floatingPointLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatingPointLiteral(FrenchParser.FloatingPointLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#dateLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateLiteral(FrenchParser.DateLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#characterLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterLiteral(FrenchParser.CharacterLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(FrenchParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchParser#nullLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteral(FrenchParser.NullLiteralContext ctx);
}