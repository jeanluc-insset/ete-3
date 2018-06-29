// Generated from fr/insset/jeanluc/ete/nl/NLParser.g4 by ANTLR 4.5.3
package fr.insset.jeanluc.ete.nl;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link NLParser#nlExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNlExpression(NLParser.NlExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#xorExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXorExpression(NLParser.XorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#orExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(NLParser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(NLParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#notOrNotNotExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotOrNotNotExpression(NLParser.NotOrNotNotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#notExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(NLParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#affirmativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAffirmativeExpression(NLParser.AffirmativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#greaterThanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanExpression(NLParser.GreaterThanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#greaterOrEqualExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterOrEqualExpression(NLParser.GreaterOrEqualExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#lessThanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanExpression(NLParser.LessThanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#lessOrEqualExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessOrEqualExpression(NLParser.LessOrEqualExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#compareExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpression(NLParser.CompareExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#equalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualExpression(NLParser.EqualExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#differentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDifferentExpression(NLParser.DifferentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#addOrSubExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOrSubExpression(NLParser.AddOrSubExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#addExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpression(NLParser.AddExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#subExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpression(NLParser.SubExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#multOrDivExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultOrDivExpression(NLParser.MultOrDivExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#multExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExpression(NLParser.MultExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#divExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivExpression(NLParser.DivExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#modExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModExpression(NLParser.ModExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(NLParser.OperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#parenthesisExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisExpression(NLParser.ParenthesisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#navExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavExpression(NLParser.NavExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStep(NLParser.StepContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#finalStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinalStep(NLParser.FinalStepContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#oclIsNew}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOclIsNew(NLParser.OclIsNewContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#oclIsTypeOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOclIsTypeOf(NLParser.OclIsTypeOfContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#oclIsKindOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOclIsKindOf(NLParser.OclIsKindOfContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#primitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive(NLParser.PrimitiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#attributeNavExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeNavExpression(NLParser.AttributeNavExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#atPreExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtPreExpression(NLParser.AtPreExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#asTypeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsTypeExpression(NLParser.AsTypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#methodNavExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodNavExpression(NLParser.MethodNavExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#collectionMethodNavExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionMethodNavExpression(NLParser.CollectionMethodNavExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#variableOrMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableOrMember(NLParser.VariableOrMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#variableOrMemberAtPre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableOrMemberAtPre(NLParser.VariableOrMemberAtPreContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(NLParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#variableDeclarationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationExpression(NLParser.VariableDeclarationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#typeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeExpression(NLParser.TypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#atomicTypeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomicTypeExpression(NLParser.AtomicTypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#sequenceTypeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequenceTypeExpression(NLParser.SequenceTypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#bagTypeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBagTypeExpression(NLParser.BagTypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#setTypeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTypeExpression(NLParser.SetTypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#orderedSetTypeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderedSetTypeExpression(NLParser.OrderedSetTypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#oppExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOppExpression(NLParser.OppExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#selfExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfExpression(NLParser.SelfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#variableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableReference(NLParser.VariableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(NLParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(NLParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(NLParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(NLParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#floatingPointLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatingPointLiteral(NLParser.FloatingPointLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#dateLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateLiteral(NLParser.DateLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#characterLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterLiteral(NLParser.CharacterLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(NLParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link NLParser#nullLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteral(NLParser.NullLiteralContext ctx);
}