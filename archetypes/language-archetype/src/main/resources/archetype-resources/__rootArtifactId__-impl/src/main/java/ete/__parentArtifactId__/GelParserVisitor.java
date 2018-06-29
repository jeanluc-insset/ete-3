#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
// Generated from ${packageInPathFormat}/ete/${parentArtifactId}/GelParser.g4 by ANTLR 4.5.3
package ${package}.ete.${parentArtifactId};
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
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}${parentArtifactId}Expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGelExpression(GelParser.GelExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}xorExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXorExpression(GelParser.XorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}orExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(GelParser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(GelParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}notOrNotNotExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotOrNotNotExpression(GelParser.NotOrNotNotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}notExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(GelParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}affirmativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAffirmativeExpression(GelParser.AffirmativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}greaterThanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanExpression(GelParser.GreaterThanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}greaterOrEqualExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterOrEqualExpression(GelParser.GreaterOrEqualExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}lessThanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanExpression(GelParser.LessThanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}lessOrEqualExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessOrEqualExpression(GelParser.LessOrEqualExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}compareExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpression(GelParser.CompareExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}equalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualExpression(GelParser.EqualExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}differentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDifferentExpression(GelParser.DifferentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}addOrSubExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOrSubExpression(GelParser.AddOrSubExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}addExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpression(GelParser.AddExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}subExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpression(GelParser.SubExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}multOrDivExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultOrDivExpression(GelParser.MultOrDivExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}multExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExpression(GelParser.MultExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}divExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivExpression(GelParser.DivExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}modExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModExpression(GelParser.ModExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(GelParser.OperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}parenthesisExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisExpression(GelParser.ParenthesisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}navExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavExpression(GelParser.NavExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}finalStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinalStep(GelParser.FinalStepContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}oclIsNew}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOclIsNew(GelParser.OclIsNewContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}oclIsTypeOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOclIsTypeOf(GelParser.OclIsTypeOfContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}oclIsKindOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOclIsKindOf(GelParser.OclIsKindOfContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}primitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive(GelParser.PrimitiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}attributeNavExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeNavExpression(GelParser.AttributeNavExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}atPreExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtPreExpression(GelParser.AtPreExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}asTypeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsTypeExpression(GelParser.AsTypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}methodNavExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodNavExpression(GelParser.MethodNavExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}collectionMethodNavExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionMethodNavExpression(GelParser.CollectionMethodNavExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}variableOrMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableOrMember(GelParser.VariableOrMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}variableOrMemberAtPre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableOrMemberAtPre(GelParser.VariableOrMemberAtPreContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(GelParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}variableDeclarationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationExpression(GelParser.VariableDeclarationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}typeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeExpression(GelParser.TypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}atomicTypeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomicTypeExpression(GelParser.AtomicTypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}sequenceTypeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequenceTypeExpression(GelParser.SequenceTypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}bagTypeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBagTypeExpression(GelParser.BagTypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}setTypeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTypeExpression(GelParser.SetTypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}orderedSetTypeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderedSetTypeExpression(GelParser.OrderedSetTypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}oppExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOppExpression(GelParser.OppExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}selfExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfExpression(GelParser.SelfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}variableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableReference(GelParser.VariableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(GelParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(GelParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(GelParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(GelParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}floatingPointLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatingPointLiteral(GelParser.FloatingPointLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(GelParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}dateLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateLiteral(GelParser.DateLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}characterLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterLiteral(GelParser.CharacterLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(GelParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link GelParser${symbol_pound}nullLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteral(GelParser.NullLiteralContext ctx);
}