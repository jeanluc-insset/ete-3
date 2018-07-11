// Generated from fr/insset/jeanluc/ete/nl/NLParser.g4 by ANTLR 4.5.3
package fr.insset.jeanluc.ete.nl;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NLParser}.
 */
public interface NLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NLParser#nlExpression}.
	 * @param ctx the parse tree
	 */
	void enterNlExpression(NLParser.NlExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#nlExpression}.
	 * @param ctx the parse tree
	 */
	void exitNlExpression(NLParser.NlExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#xorExpression}.
	 * @param ctx the parse tree
	 */
	void enterXorExpression(NLParser.XorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#xorExpression}.
	 * @param ctx the parse tree
	 */
	void exitXorExpression(NLParser.XorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(NLParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(NLParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(NLParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(NLParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#notOrNotNotExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotOrNotNotExpression(NLParser.NotOrNotNotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#notOrNotNotExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotOrNotNotExpression(NLParser.NotOrNotNotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#notExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(NLParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#notExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(NLParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#affirmativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterAffirmativeExpression(NLParser.AffirmativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#affirmativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitAffirmativeExpression(NLParser.AffirmativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#greaterThanExpression}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanExpression(NLParser.GreaterThanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#greaterThanExpression}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanExpression(NLParser.GreaterThanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#greaterOrEqualExpression}.
	 * @param ctx the parse tree
	 */
	void enterGreaterOrEqualExpression(NLParser.GreaterOrEqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#greaterOrEqualExpression}.
	 * @param ctx the parse tree
	 */
	void exitGreaterOrEqualExpression(NLParser.GreaterOrEqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#lessThanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLessThanExpression(NLParser.LessThanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#lessThanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLessThanExpression(NLParser.LessThanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#lessOrEqualExpression}.
	 * @param ctx the parse tree
	 */
	void enterLessOrEqualExpression(NLParser.LessOrEqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#lessOrEqualExpression}.
	 * @param ctx the parse tree
	 */
	void exitLessOrEqualExpression(NLParser.LessOrEqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#compareExpression}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpression(NLParser.CompareExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#compareExpression}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpression(NLParser.CompareExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#equalExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualExpression(NLParser.EqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#equalExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualExpression(NLParser.EqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#differentExpression}.
	 * @param ctx the parse tree
	 */
	void enterDifferentExpression(NLParser.DifferentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#differentExpression}.
	 * @param ctx the parse tree
	 */
	void exitDifferentExpression(NLParser.DifferentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#addOrSubExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddOrSubExpression(NLParser.AddOrSubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#addOrSubExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddOrSubExpression(NLParser.AddOrSubExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#addExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpression(NLParser.AddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#addExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpression(NLParser.AddExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#subExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubExpression(NLParser.SubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#subExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubExpression(NLParser.SubExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#multOrDivExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultOrDivExpression(NLParser.MultOrDivExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#multOrDivExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultOrDivExpression(NLParser.MultOrDivExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#multExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultExpression(NLParser.MultExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#multExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultExpression(NLParser.MultExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#divExpression}.
	 * @param ctx the parse tree
	 */
	void enterDivExpression(NLParser.DivExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#divExpression}.
	 * @param ctx the parse tree
	 */
	void exitDivExpression(NLParser.DivExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#modExpression}.
	 * @param ctx the parse tree
	 */
	void enterModExpression(NLParser.ModExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#modExpression}.
	 * @param ctx the parse tree
	 */
	void exitModExpression(NLParser.ModExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(NLParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(NLParser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#parenthesisExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExpression(NLParser.ParenthesisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#parenthesisExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExpression(NLParser.ParenthesisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#navExpression}.
	 * @param ctx the parse tree
	 */
	void enterNavExpression(NLParser.NavExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#navExpression}.
	 * @param ctx the parse tree
	 */
	void exitNavExpression(NLParser.NavExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#step}.
	 * @param ctx the parse tree
	 */
	void enterStep(NLParser.StepContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#step}.
	 * @param ctx the parse tree
	 */
	void exitStep(NLParser.StepContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#finalStep}.
	 * @param ctx the parse tree
	 */
	void enterFinalStep(NLParser.FinalStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#finalStep}.
	 * @param ctx the parse tree
	 */
	void exitFinalStep(NLParser.FinalStepContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#oclIsNew}.
	 * @param ctx the parse tree
	 */
	void enterOclIsNew(NLParser.OclIsNewContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#oclIsNew}.
	 * @param ctx the parse tree
	 */
	void exitOclIsNew(NLParser.OclIsNewContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#oclIsTypeOf}.
	 * @param ctx the parse tree
	 */
	void enterOclIsTypeOf(NLParser.OclIsTypeOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#oclIsTypeOf}.
	 * @param ctx the parse tree
	 */
	void exitOclIsTypeOf(NLParser.OclIsTypeOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#oclIsKindOf}.
	 * @param ctx the parse tree
	 */
	void enterOclIsKindOf(NLParser.OclIsKindOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#oclIsKindOf}.
	 * @param ctx the parse tree
	 */
	void exitOclIsKindOf(NLParser.OclIsKindOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#primitive}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive(NLParser.PrimitiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#primitive}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive(NLParser.PrimitiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#attributeNavExpression}.
	 * @param ctx the parse tree
	 */
	void enterAttributeNavExpression(NLParser.AttributeNavExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#attributeNavExpression}.
	 * @param ctx the parse tree
	 */
	void exitAttributeNavExpression(NLParser.AttributeNavExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#atPreExpression}.
	 * @param ctx the parse tree
	 */
	void enterAtPreExpression(NLParser.AtPreExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#atPreExpression}.
	 * @param ctx the parse tree
	 */
	void exitAtPreExpression(NLParser.AtPreExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#asTypeExpression}.
	 * @param ctx the parse tree
	 */
	void enterAsTypeExpression(NLParser.AsTypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#asTypeExpression}.
	 * @param ctx the parse tree
	 */
	void exitAsTypeExpression(NLParser.AsTypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#methodNavExpression}.
	 * @param ctx the parse tree
	 */
	void enterMethodNavExpression(NLParser.MethodNavExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#methodNavExpression}.
	 * @param ctx the parse tree
	 */
	void exitMethodNavExpression(NLParser.MethodNavExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#collectionMethodNavExpression}.
	 * @param ctx the parse tree
	 */
	void enterCollectionMethodNavExpression(NLParser.CollectionMethodNavExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#collectionMethodNavExpression}.
	 * @param ctx the parse tree
	 */
	void exitCollectionMethodNavExpression(NLParser.CollectionMethodNavExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#variableOrMember}.
	 * @param ctx the parse tree
	 */
	void enterVariableOrMember(NLParser.VariableOrMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#variableOrMember}.
	 * @param ctx the parse tree
	 */
	void exitVariableOrMember(NLParser.VariableOrMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#variableOrMemberAtPre}.
	 * @param ctx the parse tree
	 */
	void enterVariableOrMemberAtPre(NLParser.VariableOrMemberAtPreContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#variableOrMemberAtPre}.
	 * @param ctx the parse tree
	 */
	void exitVariableOrMemberAtPre(NLParser.VariableOrMemberAtPreContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(NLParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(NLParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#variableDeclarationExpression}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationExpression(NLParser.VariableDeclarationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#variableDeclarationExpression}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationExpression(NLParser.VariableDeclarationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void enterTypeExpression(NLParser.TypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void exitTypeExpression(NLParser.TypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#atomicTypeExpression}.
	 * @param ctx the parse tree
	 */
	void enterAtomicTypeExpression(NLParser.AtomicTypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#atomicTypeExpression}.
	 * @param ctx the parse tree
	 */
	void exitAtomicTypeExpression(NLParser.AtomicTypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#sequenceTypeExpression}.
	 * @param ctx the parse tree
	 */
	void enterSequenceTypeExpression(NLParser.SequenceTypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#sequenceTypeExpression}.
	 * @param ctx the parse tree
	 */
	void exitSequenceTypeExpression(NLParser.SequenceTypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#bagTypeExpression}.
	 * @param ctx the parse tree
	 */
	void enterBagTypeExpression(NLParser.BagTypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#bagTypeExpression}.
	 * @param ctx the parse tree
	 */
	void exitBagTypeExpression(NLParser.BagTypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#setTypeExpression}.
	 * @param ctx the parse tree
	 */
	void enterSetTypeExpression(NLParser.SetTypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#setTypeExpression}.
	 * @param ctx the parse tree
	 */
	void exitSetTypeExpression(NLParser.SetTypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#orderedSetTypeExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrderedSetTypeExpression(NLParser.OrderedSetTypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#orderedSetTypeExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrderedSetTypeExpression(NLParser.OrderedSetTypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#oppExpression}.
	 * @param ctx the parse tree
	 */
	void enterOppExpression(NLParser.OppExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#oppExpression}.
	 * @param ctx the parse tree
	 */
	void exitOppExpression(NLParser.OppExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#selfExpression}.
	 * @param ctx the parse tree
	 */
	void enterSelfExpression(NLParser.SelfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#selfExpression}.
	 * @param ctx the parse tree
	 */
	void exitSelfExpression(NLParser.SelfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void enterVariableReference(NLParser.VariableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void exitVariableReference(NLParser.VariableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(NLParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(NLParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(NLParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(NLParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(NLParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(NLParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(NLParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(NLParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#floatingPointLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointLiteral(NLParser.FloatingPointLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#floatingPointLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointLiteral(NLParser.FloatingPointLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#dateLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDateLiteral(NLParser.DateLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#dateLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDateLiteral(NLParser.DateLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#characterLiteral}.
	 * @param ctx the parse tree
	 */
	void enterCharacterLiteral(NLParser.CharacterLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#characterLiteral}.
	 * @param ctx the parse tree
	 */
	void exitCharacterLiteral(NLParser.CharacterLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(NLParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(NLParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link NLParser#nullLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(NLParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link NLParser#nullLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(NLParser.NullLiteralContext ctx);
}