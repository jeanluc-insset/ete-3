// Generated from fr/insset/jeanluc/ete/sbvr/SbvrParser.g4 by ANTLR 4.5.3
package fr.insset.jeanluc.ete.sbvr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SbvrParser}.
 */
public interface SbvrParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SbvrParser#sbvrExpression}.
	 * @param ctx the parse tree
	 */
	void enterSbvrExpression(SbvrParser.SbvrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#sbvrExpression}.
	 * @param ctx the parse tree
	 */
	void exitSbvrExpression(SbvrParser.SbvrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#gelExpression}.
	 * @param ctx the parse tree
	 */
	void enterGelExpression(SbvrParser.GelExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#gelExpression}.
	 * @param ctx the parse tree
	 */
	void exitGelExpression(SbvrParser.GelExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#xorExpression}.
	 * @param ctx the parse tree
	 */
	void enterXorExpression(SbvrParser.XorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#xorExpression}.
	 * @param ctx the parse tree
	 */
	void exitXorExpression(SbvrParser.XorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(SbvrParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(SbvrParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(SbvrParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(SbvrParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#notOrNotNotExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotOrNotNotExpression(SbvrParser.NotOrNotNotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#notOrNotNotExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotOrNotNotExpression(SbvrParser.NotOrNotNotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#notExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(SbvrParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#notExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(SbvrParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#affirmativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterAffirmativeExpression(SbvrParser.AffirmativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#affirmativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitAffirmativeExpression(SbvrParser.AffirmativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#greaterThanExpression}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanExpression(SbvrParser.GreaterThanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#greaterThanExpression}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanExpression(SbvrParser.GreaterThanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#greaterOrEqualExpression}.
	 * @param ctx the parse tree
	 */
	void enterGreaterOrEqualExpression(SbvrParser.GreaterOrEqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#greaterOrEqualExpression}.
	 * @param ctx the parse tree
	 */
	void exitGreaterOrEqualExpression(SbvrParser.GreaterOrEqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#lessThanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLessThanExpression(SbvrParser.LessThanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#lessThanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLessThanExpression(SbvrParser.LessThanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#lessOrEqualExpression}.
	 * @param ctx the parse tree
	 */
	void enterLessOrEqualExpression(SbvrParser.LessOrEqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#lessOrEqualExpression}.
	 * @param ctx the parse tree
	 */
	void exitLessOrEqualExpression(SbvrParser.LessOrEqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#compareExpression}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpression(SbvrParser.CompareExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#compareExpression}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpression(SbvrParser.CompareExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#equalExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualExpression(SbvrParser.EqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#equalExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualExpression(SbvrParser.EqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#differentExpression}.
	 * @param ctx the parse tree
	 */
	void enterDifferentExpression(SbvrParser.DifferentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#differentExpression}.
	 * @param ctx the parse tree
	 */
	void exitDifferentExpression(SbvrParser.DifferentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#addOrSubExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddOrSubExpression(SbvrParser.AddOrSubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#addOrSubExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddOrSubExpression(SbvrParser.AddOrSubExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#addExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpression(SbvrParser.AddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#addExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpression(SbvrParser.AddExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#subExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubExpression(SbvrParser.SubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#subExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubExpression(SbvrParser.SubExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#multOrDivExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultOrDivExpression(SbvrParser.MultOrDivExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#multOrDivExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultOrDivExpression(SbvrParser.MultOrDivExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#multExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultExpression(SbvrParser.MultExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#multExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultExpression(SbvrParser.MultExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#divExpression}.
	 * @param ctx the parse tree
	 */
	void enterDivExpression(SbvrParser.DivExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#divExpression}.
	 * @param ctx the parse tree
	 */
	void exitDivExpression(SbvrParser.DivExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#modExpression}.
	 * @param ctx the parse tree
	 */
	void enterModExpression(SbvrParser.ModExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#modExpression}.
	 * @param ctx the parse tree
	 */
	void exitModExpression(SbvrParser.ModExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(SbvrParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(SbvrParser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#parenthesisExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExpression(SbvrParser.ParenthesisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#parenthesisExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExpression(SbvrParser.ParenthesisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#navExpression}.
	 * @param ctx the parse tree
	 */
	void enterNavExpression(SbvrParser.NavExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#navExpression}.
	 * @param ctx the parse tree
	 */
	void exitNavExpression(SbvrParser.NavExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#finalStep}.
	 * @param ctx the parse tree
	 */
	void enterFinalStep(SbvrParser.FinalStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#finalStep}.
	 * @param ctx the parse tree
	 */
	void exitFinalStep(SbvrParser.FinalStepContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#oclIsNew}.
	 * @param ctx the parse tree
	 */
	void enterOclIsNew(SbvrParser.OclIsNewContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#oclIsNew}.
	 * @param ctx the parse tree
	 */
	void exitOclIsNew(SbvrParser.OclIsNewContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#oclIsTypeOf}.
	 * @param ctx the parse tree
	 */
	void enterOclIsTypeOf(SbvrParser.OclIsTypeOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#oclIsTypeOf}.
	 * @param ctx the parse tree
	 */
	void exitOclIsTypeOf(SbvrParser.OclIsTypeOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#oclIsKindOf}.
	 * @param ctx the parse tree
	 */
	void enterOclIsKindOf(SbvrParser.OclIsKindOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#oclIsKindOf}.
	 * @param ctx the parse tree
	 */
	void exitOclIsKindOf(SbvrParser.OclIsKindOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#primitive}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive(SbvrParser.PrimitiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#primitive}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive(SbvrParser.PrimitiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#attributeNavExpression}.
	 * @param ctx the parse tree
	 */
	void enterAttributeNavExpression(SbvrParser.AttributeNavExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#attributeNavExpression}.
	 * @param ctx the parse tree
	 */
	void exitAttributeNavExpression(SbvrParser.AttributeNavExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#atPreExpression}.
	 * @param ctx the parse tree
	 */
	void enterAtPreExpression(SbvrParser.AtPreExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#atPreExpression}.
	 * @param ctx the parse tree
	 */
	void exitAtPreExpression(SbvrParser.AtPreExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#asTypeExpression}.
	 * @param ctx the parse tree
	 */
	void enterAsTypeExpression(SbvrParser.AsTypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#asTypeExpression}.
	 * @param ctx the parse tree
	 */
	void exitAsTypeExpression(SbvrParser.AsTypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#methodNavExpression}.
	 * @param ctx the parse tree
	 */
	void enterMethodNavExpression(SbvrParser.MethodNavExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#methodNavExpression}.
	 * @param ctx the parse tree
	 */
	void exitMethodNavExpression(SbvrParser.MethodNavExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#collectionMethodNavExpression}.
	 * @param ctx the parse tree
	 */
	void enterCollectionMethodNavExpression(SbvrParser.CollectionMethodNavExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#collectionMethodNavExpression}.
	 * @param ctx the parse tree
	 */
	void exitCollectionMethodNavExpression(SbvrParser.CollectionMethodNavExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#variableOrMember}.
	 * @param ctx the parse tree
	 */
	void enterVariableOrMember(SbvrParser.VariableOrMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#variableOrMember}.
	 * @param ctx the parse tree
	 */
	void exitVariableOrMember(SbvrParser.VariableOrMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#variableOrMemberAtPre}.
	 * @param ctx the parse tree
	 */
	void enterVariableOrMemberAtPre(SbvrParser.VariableOrMemberAtPreContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#variableOrMemberAtPre}.
	 * @param ctx the parse tree
	 */
	void exitVariableOrMemberAtPre(SbvrParser.VariableOrMemberAtPreContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(SbvrParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(SbvrParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#variableDeclarationExpression}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationExpression(SbvrParser.VariableDeclarationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#variableDeclarationExpression}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationExpression(SbvrParser.VariableDeclarationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void enterTypeExpression(SbvrParser.TypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void exitTypeExpression(SbvrParser.TypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#atomicTypeExpression}.
	 * @param ctx the parse tree
	 */
	void enterAtomicTypeExpression(SbvrParser.AtomicTypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#atomicTypeExpression}.
	 * @param ctx the parse tree
	 */
	void exitAtomicTypeExpression(SbvrParser.AtomicTypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#sequenceTypeExpression}.
	 * @param ctx the parse tree
	 */
	void enterSequenceTypeExpression(SbvrParser.SequenceTypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#sequenceTypeExpression}.
	 * @param ctx the parse tree
	 */
	void exitSequenceTypeExpression(SbvrParser.SequenceTypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#bagTypeExpression}.
	 * @param ctx the parse tree
	 */
	void enterBagTypeExpression(SbvrParser.BagTypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#bagTypeExpression}.
	 * @param ctx the parse tree
	 */
	void exitBagTypeExpression(SbvrParser.BagTypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#setTypeExpression}.
	 * @param ctx the parse tree
	 */
	void enterSetTypeExpression(SbvrParser.SetTypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#setTypeExpression}.
	 * @param ctx the parse tree
	 */
	void exitSetTypeExpression(SbvrParser.SetTypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#orderedSetTypeExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrderedSetTypeExpression(SbvrParser.OrderedSetTypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#orderedSetTypeExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrderedSetTypeExpression(SbvrParser.OrderedSetTypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#oppExpression}.
	 * @param ctx the parse tree
	 */
	void enterOppExpression(SbvrParser.OppExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#oppExpression}.
	 * @param ctx the parse tree
	 */
	void exitOppExpression(SbvrParser.OppExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#selfExpression}.
	 * @param ctx the parse tree
	 */
	void enterSelfExpression(SbvrParser.SelfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#selfExpression}.
	 * @param ctx the parse tree
	 */
	void exitSelfExpression(SbvrParser.SelfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void enterVariableReference(SbvrParser.VariableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void exitVariableReference(SbvrParser.VariableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(SbvrParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(SbvrParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(SbvrParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(SbvrParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(SbvrParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(SbvrParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(SbvrParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(SbvrParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#floatingPointLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointLiteral(SbvrParser.FloatingPointLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#floatingPointLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointLiteral(SbvrParser.FloatingPointLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(SbvrParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(SbvrParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#dateLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDateLiteral(SbvrParser.DateLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#dateLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDateLiteral(SbvrParser.DateLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#characterLiteral}.
	 * @param ctx the parse tree
	 */
	void enterCharacterLiteral(SbvrParser.CharacterLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#characterLiteral}.
	 * @param ctx the parse tree
	 */
	void exitCharacterLiteral(SbvrParser.CharacterLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(SbvrParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(SbvrParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#nullLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(SbvrParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#nullLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(SbvrParser.NullLiteralContext ctx);
}