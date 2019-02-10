// Generated from fr/insset/jeanluc/ete/nl/FrenchParser.g4 by ANTLR 4.5.3
package fr.insset.jeanluc.ete.nl;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FrenchParser}.
 */
public interface FrenchParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FrenchParser#nlExpression}.
	 * @param ctx the parse tree
	 */
	void enterNlExpression(FrenchParser.NlExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#nlExpression}.
	 * @param ctx the parse tree
	 */
	void exitNlExpression(FrenchParser.NlExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#xorExpression}.
	 * @param ctx the parse tree
	 */
	void enterXorExpression(FrenchParser.XorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#xorExpression}.
	 * @param ctx the parse tree
	 */
	void exitXorExpression(FrenchParser.XorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(FrenchParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(FrenchParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(FrenchParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(FrenchParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#notOrNotNotExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotOrNotNotExpression(FrenchParser.NotOrNotNotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#notOrNotNotExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotOrNotNotExpression(FrenchParser.NotOrNotNotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#notExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(FrenchParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#notExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(FrenchParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#affirmativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterAffirmativeExpression(FrenchParser.AffirmativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#affirmativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitAffirmativeExpression(FrenchParser.AffirmativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#greaterThanExpression}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanExpression(FrenchParser.GreaterThanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#greaterThanExpression}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanExpression(FrenchParser.GreaterThanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#greaterOrEqualExpression}.
	 * @param ctx the parse tree
	 */
	void enterGreaterOrEqualExpression(FrenchParser.GreaterOrEqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#greaterOrEqualExpression}.
	 * @param ctx the parse tree
	 */
	void exitGreaterOrEqualExpression(FrenchParser.GreaterOrEqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#lessThanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLessThanExpression(FrenchParser.LessThanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#lessThanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLessThanExpression(FrenchParser.LessThanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#lessOrEqualExpression}.
	 * @param ctx the parse tree
	 */
	void enterLessOrEqualExpression(FrenchParser.LessOrEqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#lessOrEqualExpression}.
	 * @param ctx the parse tree
	 */
	void exitLessOrEqualExpression(FrenchParser.LessOrEqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#compareExpression}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpression(FrenchParser.CompareExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#compareExpression}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpression(FrenchParser.CompareExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#equalExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualExpression(FrenchParser.EqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#equalExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualExpression(FrenchParser.EqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#differentExpression}.
	 * @param ctx the parse tree
	 */
	void enterDifferentExpression(FrenchParser.DifferentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#differentExpression}.
	 * @param ctx the parse tree
	 */
	void exitDifferentExpression(FrenchParser.DifferentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#addOrSubExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddOrSubExpression(FrenchParser.AddOrSubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#addOrSubExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddOrSubExpression(FrenchParser.AddOrSubExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#addExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpression(FrenchParser.AddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#addExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpression(FrenchParser.AddExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#subExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubExpression(FrenchParser.SubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#subExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubExpression(FrenchParser.SubExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#multOrDivExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultOrDivExpression(FrenchParser.MultOrDivExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#multOrDivExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultOrDivExpression(FrenchParser.MultOrDivExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#multExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultExpression(FrenchParser.MultExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#multExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultExpression(FrenchParser.MultExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#divExpression}.
	 * @param ctx the parse tree
	 */
	void enterDivExpression(FrenchParser.DivExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#divExpression}.
	 * @param ctx the parse tree
	 */
	void exitDivExpression(FrenchParser.DivExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#modExpression}.
	 * @param ctx the parse tree
	 */
	void enterModExpression(FrenchParser.ModExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#modExpression}.
	 * @param ctx the parse tree
	 */
	void exitModExpression(FrenchParser.ModExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(FrenchParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(FrenchParser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#parenthesisExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExpression(FrenchParser.ParenthesisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#parenthesisExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExpression(FrenchParser.ParenthesisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#navExpression}.
	 * @param ctx the parse tree
	 */
	void enterNavExpression(FrenchParser.NavExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#navExpression}.
	 * @param ctx the parse tree
	 */
	void exitNavExpression(FrenchParser.NavExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#step}.
	 * @param ctx the parse tree
	 */
	void enterStep(FrenchParser.StepContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#step}.
	 * @param ctx the parse tree
	 */
	void exitStep(FrenchParser.StepContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#finalStep}.
	 * @param ctx the parse tree
	 */
	void enterFinalStep(FrenchParser.FinalStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#finalStep}.
	 * @param ctx the parse tree
	 */
	void exitFinalStep(FrenchParser.FinalStepContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#oclIsNew}.
	 * @param ctx the parse tree
	 */
	void enterOclIsNew(FrenchParser.OclIsNewContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#oclIsNew}.
	 * @param ctx the parse tree
	 */
	void exitOclIsNew(FrenchParser.OclIsNewContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#oclIsTypeOf}.
	 * @param ctx the parse tree
	 */
	void enterOclIsTypeOf(FrenchParser.OclIsTypeOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#oclIsTypeOf}.
	 * @param ctx the parse tree
	 */
	void exitOclIsTypeOf(FrenchParser.OclIsTypeOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#oclIsKindOf}.
	 * @param ctx the parse tree
	 */
	void enterOclIsKindOf(FrenchParser.OclIsKindOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#oclIsKindOf}.
	 * @param ctx the parse tree
	 */
	void exitOclIsKindOf(FrenchParser.OclIsKindOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#primitive}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive(FrenchParser.PrimitiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#primitive}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive(FrenchParser.PrimitiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#attributeNavExpression}.
	 * @param ctx the parse tree
	 */
	void enterAttributeNavExpression(FrenchParser.AttributeNavExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#attributeNavExpression}.
	 * @param ctx the parse tree
	 */
	void exitAttributeNavExpression(FrenchParser.AttributeNavExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#atPreExpression}.
	 * @param ctx the parse tree
	 */
	void enterAtPreExpression(FrenchParser.AtPreExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#atPreExpression}.
	 * @param ctx the parse tree
	 */
	void exitAtPreExpression(FrenchParser.AtPreExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#asTypeExpression}.
	 * @param ctx the parse tree
	 */
	void enterAsTypeExpression(FrenchParser.AsTypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#asTypeExpression}.
	 * @param ctx the parse tree
	 */
	void exitAsTypeExpression(FrenchParser.AsTypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#methodNavExpression}.
	 * @param ctx the parse tree
	 */
	void enterMethodNavExpression(FrenchParser.MethodNavExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#methodNavExpression}.
	 * @param ctx the parse tree
	 */
	void exitMethodNavExpression(FrenchParser.MethodNavExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#collectionMethodNavExpression}.
	 * @param ctx the parse tree
	 */
	void enterCollectionMethodNavExpression(FrenchParser.CollectionMethodNavExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#collectionMethodNavExpression}.
	 * @param ctx the parse tree
	 */
	void exitCollectionMethodNavExpression(FrenchParser.CollectionMethodNavExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#variableOrMember}.
	 * @param ctx the parse tree
	 */
	void enterVariableOrMember(FrenchParser.VariableOrMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#variableOrMember}.
	 * @param ctx the parse tree
	 */
	void exitVariableOrMember(FrenchParser.VariableOrMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#variableOrMemberAtPre}.
	 * @param ctx the parse tree
	 */
	void enterVariableOrMemberAtPre(FrenchParser.VariableOrMemberAtPreContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#variableOrMemberAtPre}.
	 * @param ctx the parse tree
	 */
	void exitVariableOrMemberAtPre(FrenchParser.VariableOrMemberAtPreContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(FrenchParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(FrenchParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#variableDeclarationExpression}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationExpression(FrenchParser.VariableDeclarationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#variableDeclarationExpression}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationExpression(FrenchParser.VariableDeclarationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void enterTypeExpression(FrenchParser.TypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void exitTypeExpression(FrenchParser.TypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#atomicTypeExpression}.
	 * @param ctx the parse tree
	 */
	void enterAtomicTypeExpression(FrenchParser.AtomicTypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#atomicTypeExpression}.
	 * @param ctx the parse tree
	 */
	void exitAtomicTypeExpression(FrenchParser.AtomicTypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#sequenceTypeExpression}.
	 * @param ctx the parse tree
	 */
	void enterSequenceTypeExpression(FrenchParser.SequenceTypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#sequenceTypeExpression}.
	 * @param ctx the parse tree
	 */
	void exitSequenceTypeExpression(FrenchParser.SequenceTypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#bagTypeExpression}.
	 * @param ctx the parse tree
	 */
	void enterBagTypeExpression(FrenchParser.BagTypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#bagTypeExpression}.
	 * @param ctx the parse tree
	 */
	void exitBagTypeExpression(FrenchParser.BagTypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#setTypeExpression}.
	 * @param ctx the parse tree
	 */
	void enterSetTypeExpression(FrenchParser.SetTypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#setTypeExpression}.
	 * @param ctx the parse tree
	 */
	void exitSetTypeExpression(FrenchParser.SetTypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#orderedSetTypeExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrderedSetTypeExpression(FrenchParser.OrderedSetTypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#orderedSetTypeExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrderedSetTypeExpression(FrenchParser.OrderedSetTypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#oppExpression}.
	 * @param ctx the parse tree
	 */
	void enterOppExpression(FrenchParser.OppExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#oppExpression}.
	 * @param ctx the parse tree
	 */
	void exitOppExpression(FrenchParser.OppExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#selfExpression}.
	 * @param ctx the parse tree
	 */
	void enterSelfExpression(FrenchParser.SelfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#selfExpression}.
	 * @param ctx the parse tree
	 */
	void exitSelfExpression(FrenchParser.SelfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void enterVariableReference(FrenchParser.VariableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void exitVariableReference(FrenchParser.VariableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(FrenchParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(FrenchParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(FrenchParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(FrenchParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(FrenchParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(FrenchParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(FrenchParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(FrenchParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#floatingPointLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointLiteral(FrenchParser.FloatingPointLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#floatingPointLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointLiteral(FrenchParser.FloatingPointLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#dateLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDateLiteral(FrenchParser.DateLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#dateLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDateLiteral(FrenchParser.DateLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#characterLiteral}.
	 * @param ctx the parse tree
	 */
	void enterCharacterLiteral(FrenchParser.CharacterLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#characterLiteral}.
	 * @param ctx the parse tree
	 */
	void exitCharacterLiteral(FrenchParser.CharacterLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(FrenchParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(FrenchParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrenchParser#nullLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(FrenchParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrenchParser#nullLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(FrenchParser.NullLiteralContext ctx);
}