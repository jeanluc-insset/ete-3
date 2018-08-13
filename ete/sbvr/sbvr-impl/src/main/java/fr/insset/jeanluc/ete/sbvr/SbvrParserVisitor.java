// Generated from fr/insset/jeanluc/ete/sbvr/SbvrParser.g4 by ANTLR 4.5.3
package fr.insset.jeanluc.ete.sbvr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SbvrParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SbvrParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SbvrParser#genericExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericExpression(SbvrParser.GenericExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#sbvrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSbvrExpression(SbvrParser.SbvrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#navOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavOperator(SbvrParser.NavOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(SbvrParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#noungroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoungroup(SbvrParser.NoungroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#determiner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeterminer(SbvrParser.DeterminerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(SbvrParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#gelExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGelExpression(SbvrParser.GelExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#xorExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXorExpression(SbvrParser.XorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#orExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(SbvrParser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(SbvrParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#notOrNotNotExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotOrNotNotExpression(SbvrParser.NotOrNotNotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#notExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(SbvrParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#affirmativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAffirmativeExpression(SbvrParser.AffirmativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#greaterThanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanExpression(SbvrParser.GreaterThanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#greaterOrEqualExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterOrEqualExpression(SbvrParser.GreaterOrEqualExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#lessThanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanExpression(SbvrParser.LessThanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#lessOrEqualExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessOrEqualExpression(SbvrParser.LessOrEqualExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#compareExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpression(SbvrParser.CompareExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#equalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualExpression(SbvrParser.EqualExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#differentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDifferentExpression(SbvrParser.DifferentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#addOrSubExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOrSubExpression(SbvrParser.AddOrSubExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#addExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpression(SbvrParser.AddExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#subExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpression(SbvrParser.SubExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#multOrDivExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultOrDivExpression(SbvrParser.MultOrDivExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#multExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExpression(SbvrParser.MultExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#divExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivExpression(SbvrParser.DivExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#modExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModExpression(SbvrParser.ModExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(SbvrParser.OperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#parenthesisExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisExpression(SbvrParser.ParenthesisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#navExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavExpression(SbvrParser.NavExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#finalStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinalStep(SbvrParser.FinalStepContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#oclIsNew}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOclIsNew(SbvrParser.OclIsNewContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#oclIsTypeOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOclIsTypeOf(SbvrParser.OclIsTypeOfContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#oclIsKindOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOclIsKindOf(SbvrParser.OclIsKindOfContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#primitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive(SbvrParser.PrimitiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#attributeNavExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeNavExpression(SbvrParser.AttributeNavExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#atPreExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtPreExpression(SbvrParser.AtPreExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#asTypeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsTypeExpression(SbvrParser.AsTypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#methodNavExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodNavExpression(SbvrParser.MethodNavExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#collectionMethodNavExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionMethodNavExpression(SbvrParser.CollectionMethodNavExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#variableOrMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableOrMember(SbvrParser.VariableOrMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#variableOrMemberAtPre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableOrMemberAtPre(SbvrParser.VariableOrMemberAtPreContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(SbvrParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#variableDeclarationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationExpression(SbvrParser.VariableDeclarationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#typeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeExpression(SbvrParser.TypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#atomicTypeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomicTypeExpression(SbvrParser.AtomicTypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#sequenceTypeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequenceTypeExpression(SbvrParser.SequenceTypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#bagTypeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBagTypeExpression(SbvrParser.BagTypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#setTypeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTypeExpression(SbvrParser.SetTypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#orderedSetTypeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderedSetTypeExpression(SbvrParser.OrderedSetTypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#oppExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOppExpression(SbvrParser.OppExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#selfExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfExpression(SbvrParser.SelfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#variableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableReference(SbvrParser.VariableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(SbvrParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(SbvrParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(SbvrParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(SbvrParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#floatingPointLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatingPointLiteral(SbvrParser.FloatingPointLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(SbvrParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#dateLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateLiteral(SbvrParser.DateLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#characterLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterLiteral(SbvrParser.CharacterLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(SbvrParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#nullLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteral(SbvrParser.NullLiteralContext ctx);
}