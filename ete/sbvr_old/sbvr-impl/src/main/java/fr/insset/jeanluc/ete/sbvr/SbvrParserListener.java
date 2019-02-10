// Generated from fr/insset/jeanluc/ete/sbvr/SbvrParser.g4 by ANTLR 4.5.3
package fr.insset.jeanluc.ete.sbvr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SbvrParser}.
 */
public interface SbvrParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SbvrParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(SbvrParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(SbvrParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(SbvrParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(SbvrParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#globalConstraint}.
	 * @param ctx the parse tree
	 */
	void enterGlobalConstraint(SbvrParser.GlobalConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#globalConstraint}.
	 * @param ctx the parse tree
	 */
	void exitGlobalConstraint(SbvrParser.GlobalConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#contextualConstraints}.
	 * @param ctx the parse tree
	 */
	void enterContextualConstraints(SbvrParser.ContextualConstraintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#contextualConstraints}.
	 * @param ctx the parse tree
	 */
	void exitContextualConstraints(SbvrParser.ContextualConstraintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#invariants}.
	 * @param ctx the parse tree
	 */
	void enterInvariants(SbvrParser.InvariantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#invariants}.
	 * @param ctx the parse tree
	 */
	void exitInvariants(SbvrParser.InvariantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#invariant}.
	 * @param ctx the parse tree
	 */
	void enterInvariant(SbvrParser.InvariantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#invariant}.
	 * @param ctx the parse tree
	 */
	void exitInvariant(SbvrParser.InvariantContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterConditions(SbvrParser.ConditionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitConditions(SbvrParser.ConditionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#precondition}.
	 * @param ctx the parse tree
	 */
	void enterPrecondition(SbvrParser.PreconditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#precondition}.
	 * @param ctx the parse tree
	 */
	void exitPrecondition(SbvrParser.PreconditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#postcondition}.
	 * @param ctx the parse tree
	 */
	void enterPostcondition(SbvrParser.PostconditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#postcondition}.
	 * @param ctx the parse tree
	 */
	void exitPostcondition(SbvrParser.PostconditionContext ctx);
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
	 * Enter a parse tree produced by {@link SbvrParser#multOperator}.
	 * @param ctx the parse tree
	 */
	void enterMultOperator(SbvrParser.MultOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#multOperator}.
	 * @param ctx the parse tree
	 */
	void exitMultOperator(SbvrParser.MultOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#addOperator}.
	 * @param ctx the parse tree
	 */
	void enterAddOperator(SbvrParser.AddOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#addOperator}.
	 * @param ctx the parse tree
	 */
	void exitAddOperator(SbvrParser.AddOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#equalityOperator}.
	 * @param ctx the parse tree
	 */
	void enterEqualityOperator(SbvrParser.EqualityOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#equalityOperator}.
	 * @param ctx the parse tree
	 */
	void exitEqualityOperator(SbvrParser.EqualityOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#comparator}.
	 * @param ctx the parse tree
	 */
	void enterComparator(SbvrParser.ComparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#comparator}.
	 * @param ctx the parse tree
	 */
	void exitComparator(SbvrParser.ComparatorContext ctx);
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
	 * Enter a parse tree produced by {@link SbvrParser#leftToRightNavigation}.
	 * @param ctx the parse tree
	 */
	void enterLeftToRightNavigation(SbvrParser.LeftToRightNavigationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#leftToRightNavigation}.
	 * @param ctx the parse tree
	 */
	void exitLeftToRightNavigation(SbvrParser.LeftToRightNavigationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#rightToLeftNavigation}.
	 * @param ctx the parse tree
	 */
	void enterRightToLeftNavigation(SbvrParser.RightToLeftNavigationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#rightToLeftNavigation}.
	 * @param ctx the parse tree
	 */
	void exitRightToLeftNavigation(SbvrParser.RightToLeftNavigationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#firstStep}.
	 * @param ctx the parse tree
	 */
	void enterFirstStep(SbvrParser.FirstStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#firstStep}.
	 * @param ctx the parse tree
	 */
	void exitFirstStep(SbvrParser.FirstStepContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#step}.
	 * @param ctx the parse tree
	 */
	void enterStep(SbvrParser.StepContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#step}.
	 * @param ctx the parse tree
	 */
	void exitStep(SbvrParser.StepContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#navOperator}.
	 * @param ctx the parse tree
	 */
	void enterNavOperator(SbvrParser.NavOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#navOperator}.
	 * @param ctx the parse tree
	 */
	void exitNavOperator(SbvrParser.NavOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#structuredNaturalLanguage}.
	 * @param ctx the parse tree
	 */
	void enterStructuredNaturalLanguage(SbvrParser.StructuredNaturalLanguageContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#structuredNaturalLanguage}.
	 * @param ctx the parse tree
	 */
	void exitStructuredNaturalLanguage(SbvrParser.StructuredNaturalLanguageContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#modality}.
	 * @param ctx the parse tree
	 */
	void enterModality(SbvrParser.ModalityContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#modality}.
	 * @param ctx the parse tree
	 */
	void exitModality(SbvrParser.ModalityContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(SbvrParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(SbvrParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#general_concept}.
	 * @param ctx the parse tree
	 */
	void enterGeneral_concept(SbvrParser.General_conceptContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#general_concept}.
	 * @param ctx the parse tree
	 */
	void exitGeneral_concept(SbvrParser.General_conceptContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#determiner}.
	 * @param ctx the parse tree
	 */
	void enterDeterminer(SbvrParser.DeterminerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#determiner}.
	 * @param ctx the parse tree
	 */
	void exitDeterminer(SbvrParser.DeterminerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#verb}.
	 * @param ctx the parse tree
	 */
	void enterVerb(SbvrParser.VerbContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#verb}.
	 * @param ctx the parse tree
	 */
	void exitVerb(SbvrParser.VerbContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier(SbvrParser.QuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier(SbvrParser.QuantifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#article}.
	 * @param ctx the parse tree
	 */
	void enterArticle(SbvrParser.ArticleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#article}.
	 * @param ctx the parse tree
	 */
	void exitArticle(SbvrParser.ArticleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#definite_article}.
	 * @param ctx the parse tree
	 */
	void enterDefinite_article(SbvrParser.Definite_articleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#definite_article}.
	 * @param ctx the parse tree
	 */
	void exitDefinite_article(SbvrParser.Definite_articleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#indefinite_article}.
	 * @param ctx the parse tree
	 */
	void enterIndefinite_article(SbvrParser.Indefinite_articleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#indefinite_article}.
	 * @param ctx the parse tree
	 */
	void exitIndefinite_article(SbvrParser.Indefinite_articleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#demonstrative}.
	 * @param ctx the parse tree
	 */
	void enterDemonstrative(SbvrParser.DemonstrativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#demonstrative}.
	 * @param ctx the parse tree
	 */
	void exitDemonstrative(SbvrParser.DemonstrativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SbvrParser#possessive}.
	 * @param ctx the parse tree
	 */
	void enterPossessive(SbvrParser.PossessiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#possessive}.
	 * @param ctx the parse tree
	 */
	void exitPossessive(SbvrParser.PossessiveContext ctx);
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
	 * Enter a parse tree produced by {@link SbvrParser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(SbvrParser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SbvrParser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(SbvrParser.WordContext ctx);
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