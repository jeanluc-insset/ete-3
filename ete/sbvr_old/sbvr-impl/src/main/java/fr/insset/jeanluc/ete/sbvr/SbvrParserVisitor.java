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
	 * Visit a parse tree produced by {@link SbvrParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(SbvrParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(SbvrParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#globalConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalConstraint(SbvrParser.GlobalConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#contextualConstraints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContextualConstraints(SbvrParser.ContextualConstraintsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#invariants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvariants(SbvrParser.InvariantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#invariant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvariant(SbvrParser.InvariantContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditions(SbvrParser.ConditionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#precondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecondition(SbvrParser.PreconditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#postcondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostcondition(SbvrParser.PostconditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#sbvrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSbvrExpression(SbvrParser.SbvrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#multOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultOperator(SbvrParser.MultOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#addOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOperator(SbvrParser.AddOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#equalityOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityOperator(SbvrParser.EqualityOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#comparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparator(SbvrParser.ComparatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(SbvrParser.OperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#navExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavExpression(SbvrParser.NavExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#leftToRightNavigation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftToRightNavigation(SbvrParser.LeftToRightNavigationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#rightToLeftNavigation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightToLeftNavigation(SbvrParser.RightToLeftNavigationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#firstStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirstStep(SbvrParser.FirstStepContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStep(SbvrParser.StepContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#navOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavOperator(SbvrParser.NavOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#structuredNaturalLanguage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructuredNaturalLanguage(SbvrParser.StructuredNaturalLanguageContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#modality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModality(SbvrParser.ModalityContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(SbvrParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#general_concept}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneral_concept(SbvrParser.General_conceptContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#determiner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeterminer(SbvrParser.DeterminerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#verb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerb(SbvrParser.VerbContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#quantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier(SbvrParser.QuantifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#article}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArticle(SbvrParser.ArticleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#definite_article}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinite_article(SbvrParser.Definite_articleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#indefinite_article}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndefinite_article(SbvrParser.Indefinite_articleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#demonstrative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDemonstrative(SbvrParser.DemonstrativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#possessive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPossessive(SbvrParser.PossessiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(SbvrParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SbvrParser#word}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWord(SbvrParser.WordContext ctx);
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