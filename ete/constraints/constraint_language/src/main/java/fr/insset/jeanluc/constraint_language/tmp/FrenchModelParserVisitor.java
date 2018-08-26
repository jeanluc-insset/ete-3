package fr.insset.jeanluc.constraint_language.tmp;

// Generated from FrenchModelParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FrenchModelParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FrenchModelParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FrenchModelParser#modelKeyWords}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModelKeyWords(FrenchModelParser.ModelKeyWordsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchModelParser#definitionSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinitionSignature(FrenchModelParser.DefinitionSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchModelParser#navExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavExpression(FrenchModelParser.NavExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchModelParser#navigationKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavigationKeyword(FrenchModelParser.NavigationKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchModelParser#word}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWord(FrenchModelParser.WordContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchModelParser#determiner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeterminer(FrenchModelParser.DeterminerContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchModelParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(FrenchModelParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchModelParser#initTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitTerm(FrenchModelParser.InitTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchModelParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(FrenchModelParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchModelParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(FrenchModelParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchModelParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(FrenchModelParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchModelParser#definitionKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinitionKeyword(FrenchModelParser.DefinitionKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchModelParser#definitionHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinitionHead(FrenchModelParser.DefinitionHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchModelParser#definitionSeparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinitionSeparator(FrenchModelParser.DefinitionSeparatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchModelParser#definitionMark}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinitionMark(FrenchModelParser.DefinitionMarkContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchModelParser#definitionEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinitionEnd(FrenchModelParser.DefinitionEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchModelParser#businessRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBusinessRule(FrenchModelParser.BusinessRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchModelParser#ruleKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleKeyword(FrenchModelParser.RuleKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchModelParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(FrenchModelParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchModelParser#nounGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNounGroup(FrenchModelParser.NounGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchModelParser#modelTermGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModelTermGroup(FrenchModelParser.ModelTermGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchModelParser#modelTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModelTerm(FrenchModelParser.ModelTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchModelParser#other}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOther(FrenchModelParser.OtherContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchModelParser#gelExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGelExpression(FrenchModelParser.GelExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchModelParser#xorExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXorExpression(FrenchModelParser.XorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchModelParser#xorOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXorOperator(FrenchModelParser.XorOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchModelParser#orExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(FrenchModelParser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchModelParser#orOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrOperator(FrenchModelParser.OrOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchModelParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(FrenchModelParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchModelParser#andOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOperator(FrenchModelParser.AndOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchModelParser#impliesExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpliesExpression(FrenchModelParser.ImpliesExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchModelParser#impliesOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpliesOperator(FrenchModelParser.ImpliesOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchModelParser#equalOrDiffExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualOrDiffExpression(FrenchModelParser.EqualOrDiffExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchModelParser#equalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualExpression(FrenchModelParser.EqualExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchModelParser#equalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualOperator(FrenchModelParser.EqualOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchModelParser#diffExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiffExpression(FrenchModelParser.DiffExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchModelParser#diffOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiffOperator(FrenchModelParser.DiffOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchModelParser#compareExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpression(FrenchModelParser.CompareExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchModelParser#gtExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGtExpression(FrenchModelParser.GtExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchModelParser#geExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeExpression(FrenchModelParser.GeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchModelParser#ltExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtExpression(FrenchModelParser.LtExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchModelParser#leExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeExpression(FrenchModelParser.LeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchModelParser#gtOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGtOperator(FrenchModelParser.GtOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchModelParser#geOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeOperator(FrenchModelParser.GeOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchModelParser#leOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeOperator(FrenchModelParser.LeOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchModelParser#ltOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtOperator(FrenchModelParser.LtOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchModelParser#negationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegationExpression(FrenchModelParser.NegationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchModelParser#notOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotOperator(FrenchModelParser.NotOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchModelParser#oppExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOppExpression(FrenchModelParser.OppExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchModelParser#leftToRightNavigation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftToRightNavigation(FrenchModelParser.LeftToRightNavigationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchModelParser#rightToLeftNavigation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightToLeftNavigation(FrenchModelParser.RightToLeftNavigationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrenchModelParser#navOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavOperator(FrenchModelParser.NavOperatorContext ctx);
}