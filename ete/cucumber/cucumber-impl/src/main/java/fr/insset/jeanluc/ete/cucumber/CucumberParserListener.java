// Generated from fr/insset/jeanluc/ete/cucumber/CucumberParser.g4 by ANTLR 4.5.3
package fr.insset.jeanluc.ete.cucumber;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CucumberParser}.
 */
public interface CucumberParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CucumberParser#cucumberExpression}.
	 * @param ctx the parse tree
	 */
	void enterCucumberExpression(CucumberParser.CucumberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CucumberParser#cucumberExpression}.
	 * @param ctx the parse tree
	 */
	void exitCucumberExpression(CucumberParser.CucumberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CucumberParser#xorExpression}.
	 * @param ctx the parse tree
	 */
	void enterXorExpression(CucumberParser.XorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CucumberParser#xorExpression}.
	 * @param ctx the parse tree
	 */
	void exitXorExpression(CucumberParser.XorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CucumberParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(CucumberParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CucumberParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(CucumberParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CucumberParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(CucumberParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CucumberParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(CucumberParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CucumberParser#notOrNotNotExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotOrNotNotExpression(CucumberParser.NotOrNotNotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CucumberParser#notOrNotNotExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotOrNotNotExpression(CucumberParser.NotOrNotNotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CucumberParser#notExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(CucumberParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CucumberParser#notExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(CucumberParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CucumberParser#affirmativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterAffirmativeExpression(CucumberParser.AffirmativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CucumberParser#affirmativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitAffirmativeExpression(CucumberParser.AffirmativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CucumberParser#greaterThanExpression}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanExpression(CucumberParser.GreaterThanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CucumberParser#greaterThanExpression}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanExpression(CucumberParser.GreaterThanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CucumberParser#greaterOrEqualExpression}.
	 * @param ctx the parse tree
	 */
	void enterGreaterOrEqualExpression(CucumberParser.GreaterOrEqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CucumberParser#greaterOrEqualExpression}.
	 * @param ctx the parse tree
	 */
	void exitGreaterOrEqualExpression(CucumberParser.GreaterOrEqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CucumberParser#lessThanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLessThanExpression(CucumberParser.LessThanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CucumberParser#lessThanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLessThanExpression(CucumberParser.LessThanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CucumberParser#lessOrEqualExpression}.
	 * @param ctx the parse tree
	 */
	void enterLessOrEqualExpression(CucumberParser.LessOrEqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CucumberParser#lessOrEqualExpression}.
	 * @param ctx the parse tree
	 */
	void exitLessOrEqualExpression(CucumberParser.LessOrEqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CucumberParser#compareExpression}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpression(CucumberParser.CompareExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CucumberParser#compareExpression}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpression(CucumberParser.CompareExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CucumberParser#equalExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualExpression(CucumberParser.EqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CucumberParser#equalExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualExpression(CucumberParser.EqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CucumberParser#differentExpression}.
	 * @param ctx the parse tree
	 */
	void enterDifferentExpression(CucumberParser.DifferentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CucumberParser#differentExpression}.
	 * @param ctx the parse tree
	 */
	void exitDifferentExpression(CucumberParser.DifferentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CucumberParser#addOrSubExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddOrSubExpression(CucumberParser.AddOrSubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CucumberParser#addOrSubExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddOrSubExpression(CucumberParser.AddOrSubExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CucumberParser#addExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpression(CucumberParser.AddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CucumberParser#addExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpression(CucumberParser.AddExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CucumberParser#subExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubExpression(CucumberParser.SubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CucumberParser#subExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubExpression(CucumberParser.SubExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CucumberParser#multOrDivExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultOrDivExpression(CucumberParser.MultOrDivExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CucumberParser#multOrDivExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultOrDivExpression(CucumberParser.MultOrDivExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CucumberParser#multExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultExpression(CucumberParser.MultExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CucumberParser#multExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultExpression(CucumberParser.MultExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CucumberParser#divExpression}.
	 * @param ctx the parse tree
	 */
	void enterDivExpression(CucumberParser.DivExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CucumberParser#divExpression}.
	 * @param ctx the parse tree
	 */
	void exitDivExpression(CucumberParser.DivExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CucumberParser#modExpression}.
	 * @param ctx the parse tree
	 */
	void enterModExpression(CucumberParser.ModExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CucumberParser#modExpression}.
	 * @param ctx the parse tree
	 */
	void exitModExpression(CucumberParser.ModExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CucumberParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(CucumberParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link CucumberParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(CucumberParser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link CucumberParser#navExpression}.
	 * @param ctx the parse tree
	 */
	void enterNavExpression(CucumberParser.NavExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CucumberParser#navExpression}.
	 * @param ctx the parse tree
	 */
	void exitNavExpression(CucumberParser.NavExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CucumberParser#parenthesisExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExpression(CucumberParser.ParenthesisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CucumberParser#parenthesisExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExpression(CucumberParser.ParenthesisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CucumberParser#variableDeclarationExpression}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationExpression(CucumberParser.VariableDeclarationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CucumberParser#variableDeclarationExpression}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationExpression(CucumberParser.VariableDeclarationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CucumberParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void enterTypeExpression(CucumberParser.TypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CucumberParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void exitTypeExpression(CucumberParser.TypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CucumberParser#atomicTypeExpression}.
	 * @param ctx the parse tree
	 */
	void enterAtomicTypeExpression(CucumberParser.AtomicTypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CucumberParser#atomicTypeExpression}.
	 * @param ctx the parse tree
	 */
	void exitAtomicTypeExpression(CucumberParser.AtomicTypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CucumberParser#oppExpression}.
	 * @param ctx the parse tree
	 */
	void enterOppExpression(CucumberParser.OppExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CucumberParser#oppExpression}.
	 * @param ctx the parse tree
	 */
	void exitOppExpression(CucumberParser.OppExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CucumberParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void enterVariableReference(CucumberParser.VariableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CucumberParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void exitVariableReference(CucumberParser.VariableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CucumberParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(CucumberParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CucumberParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(CucumberParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CucumberParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(CucumberParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CucumberParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(CucumberParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CucumberParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(CucumberParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CucumberParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(CucumberParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CucumberParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(CucumberParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CucumberParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(CucumberParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CucumberParser#floatingPointLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointLiteral(CucumberParser.FloatingPointLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CucumberParser#floatingPointLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointLiteral(CucumberParser.FloatingPointLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CucumberParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(CucumberParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CucumberParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(CucumberParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CucumberParser#dateLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDateLiteral(CucumberParser.DateLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CucumberParser#dateLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDateLiteral(CucumberParser.DateLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CucumberParser#characterLiteral}.
	 * @param ctx the parse tree
	 */
	void enterCharacterLiteral(CucumberParser.CharacterLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CucumberParser#characterLiteral}.
	 * @param ctx the parse tree
	 */
	void exitCharacterLiteral(CucumberParser.CharacterLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CucumberParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(CucumberParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CucumberParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(CucumberParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CucumberParser#nullLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(CucumberParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CucumberParser#nullLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(CucumberParser.NullLiteralContext ctx);
}