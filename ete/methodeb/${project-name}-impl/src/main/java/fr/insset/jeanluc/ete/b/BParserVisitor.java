// Generated from fr/insset/jeanluc/ete/b/BParser.g4 by ANTLR 4.5.3
package fr.insset.jeanluc.ete.b;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BParser#composant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComposant(BParser.ComposantContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#machine_abstraite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMachine_abstraite(BParser.Machine_abstraiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#clause_machine_abstraite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClause_machine_abstraite(BParser.Clause_machine_abstraiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#en_tete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEn_tete(BParser.En_teteContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#raffinement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaffinement(BParser.RaffinementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#clause_raffinement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClause_raffinement(BParser.Clause_raffinementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#implantation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplantation(BParser.ImplantationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#clause_implantation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClause_implantation(BParser.Clause_implantationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#clause_constraints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClause_constraints(BParser.Clause_constraintsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#clause_refines}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClause_refines(BParser.Clause_refinesContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#clause_imports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClause_imports(BParser.Clause_importsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#instanciation_B0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanciation_B0(BParser.Instanciation_B0Context ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#clause_sees}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClause_sees(BParser.Clause_seesContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#clause_includes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClause_includes(BParser.Clause_includesContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#instanciation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanciation(BParser.InstanciationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#clause_promotes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClause_promotes(BParser.Clause_promotesContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#clause_extends}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClause_extends(BParser.Clause_extendsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#ident_ren_instanciation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent_ren_instanciation(BParser.Ident_ren_instanciationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#clause_extends_B0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClause_extends_B0(BParser.Clause_extends_B0Context ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#ident_ren_instanciation_B0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent_ren_instanciation_B0(BParser.Ident_ren_instanciation_B0Context ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#clause_extends_BO}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClause_extends_BO(BParser.Clause_extends_BOContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#clause_uses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClause_uses(BParser.Clause_usesContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#clause_sets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClause_sets(BParser.Clause_setsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#clause_concrete_constants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClause_concrete_constants(BParser.Clause_concrete_constantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#clause_abstract_constants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClause_abstract_constants(BParser.Clause_abstract_constantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#clause_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClause_properties(BParser.Clause_propertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#clause_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClause_values(BParser.Clause_valuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#valuation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuation(BParser.ValuationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#clause_concrete_variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClause_concrete_variables(BParser.Clause_concrete_variablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#clause_abstract_variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClause_abstract_variables(BParser.Clause_abstract_variablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#clause_invariant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClause_invariant(BParser.Clause_invariantContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#clause_assertions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClause_assertions(BParser.Clause_assertionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#clause_initialisation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClause_initialisation(BParser.Clause_initialisationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#clause_initialisation_B0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClause_initialisation_B0(BParser.Clause_initialisation_B0Context ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#clause_operations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClause_operations(BParser.Clause_operationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(BParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#en_tete_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEn_tete_operation(BParser.En_tete_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#clause_operations_B0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClause_operations_B0(BParser.Clause_operations_B0Context ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#operations_B0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperations_B0(BParser.Operations_B0Context ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#clause_operations_locales}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClause_operations_locales(BParser.Clause_operations_localesContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#terme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerme(BParser.TermeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#terme_simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerme_simple(BParser.Terme_simpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#entier_lit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntier_lit(BParser.Entier_litContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#booleen_lit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleen_lit(BParser.Booleen_litContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#expression_arithmetique}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_arithmetique(BParser.Expression_arithmetiqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#expression_mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_mult(BParser.Expression_multContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#expression_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_exp(BParser.Expression_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#expression_atomique}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_atomique(BParser.Expression_atomiqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#terme_record}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerme_record(BParser.Terme_recordContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#expr_tableau}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_tableau(BParser.Expr_tableauContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#intervalle_B0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalle_B0(BParser.Intervalle_B0Context ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#ensemble_entier_B0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnsemble_entier_B0(BParser.Ensemble_entier_B0Context ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(BParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#condition_et}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_et(BParser.Condition_etContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#condition_atomique}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_atomique(BParser.Condition_atomiqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(BParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#instruction_corps_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction_corps_operation(BParser.Instruction_corps_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#instruction_bloc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction_bloc(BParser.Instruction_blocContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#instruction_variable_locale}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction_variable_locale(BParser.Instruction_variable_localeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#instruction_devient_egal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction_devient_egal(BParser.Instruction_devient_egalContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#instruction_appel_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction_appel_operation(BParser.Instruction_appel_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#terme_or_chaine_lit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerme_or_chaine_lit(BParser.Terme_or_chaine_litContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#instruction_sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction_sequence(BParser.Instruction_sequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#instruction_conditionnelle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction_conditionnelle(BParser.Instruction_conditionnelleContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#instruction_cas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction_cas(BParser.Instruction_casContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#substitution_tant_que}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstitution_tant_que(BParser.Substitution_tant_queContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#instruction_assertion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction_assertion(BParser.Instruction_assertionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#predicat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicat(BParser.PredicatContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#predicat_implication_equivalence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicat_implication_equivalence(BParser.Predicat_implication_equivalenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#predicat_implication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicat_implication(BParser.Predicat_implicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#predicat_equivalence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicat_equivalence(BParser.Predicat_equivalenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#predicat_disjonction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicat_disjonction(BParser.Predicat_disjonctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#predicat_et}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicat_et(BParser.Predicat_etContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#predicat_egalite_inegalite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicat_egalite_inegalite(BParser.Predicat_egalite_inegaliteContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#predicat_egalite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicat_egalite(BParser.Predicat_egaliteContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#predicat_inegalite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicat_inegalite(BParser.Predicat_inegaliteContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#predicat_atomique}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicat_atomique(BParser.Predicat_atomiqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#predicat_parenthese}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicat_parenthese(BParser.Predicat_parentheseContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#predicat_conjonction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicat_conjonction(BParser.Predicat_conjonctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#predicat_negation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicat_negation(BParser.Predicat_negationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#predicat_universel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicat_universel(BParser.Predicat_universelContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#predicat_existentiel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicat_existentiel(BParser.Predicat_existentielContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#predicat_appartenance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicat_appartenance(BParser.Predicat_appartenanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#predicat_non_appartenance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicat_non_appartenance(BParser.Predicat_non_appartenanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#predicat_inclusion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicat_inclusion(BParser.Predicat_inclusionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#predicat_inclusion_stricte}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicat_inclusion_stricte(BParser.Predicat_inclusion_stricteContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#predicat_non_inclusion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicat_non_inclusion(BParser.Predicat_non_inclusionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#predicat_non_inclusion_stricte}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicat_non_inclusion_stricte(BParser.Predicat_non_inclusion_stricteContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#predicat_inferieur_ou_egal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicat_inferieur_ou_egal(BParser.Predicat_inferieur_ou_egalContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#predicat_strictement_inferieur}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicat_strictement_inferieur(BParser.Predicat_strictement_inferieurContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#predicat_superieur_ou_egal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicat_superieur_ou_egal(BParser.Predicat_superieur_ou_egalContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#predicat_strictement_superieur}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicat_strictement_superieur(BParser.Predicat_strictement_superieurContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(BParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#expression_primaire}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_primaire(BParser.Expression_primaireContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#expression_booleenne}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_booleenne(BParser.Expression_booleenneContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#expression_de_couples}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_de_couples(BParser.Expression_de_couplesContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#expression_d_ensembles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_d_ensembles(BParser.Expression_d_ensemblesContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#construction_d_ensembles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstruction_d_ensembles(BParser.Construction_d_ensemblesContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#expression_de_records}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_de_records(BParser.Expression_de_recordsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#expression_de_relations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_de_relations(BParser.Expression_de_relationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#expression_de_fonctions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_de_fonctions(BParser.Expression_de_fonctionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#construction_de_fonctions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstruction_de_fonctions(BParser.Construction_de_fonctionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#expression_de_suites}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_de_suites(BParser.Expression_de_suitesContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#construction_de_suites}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstruction_de_suites(BParser.Construction_de_suitesContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#expression_d_arbres}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_d_arbres(BParser.Expression_d_arbresContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#donnee}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDonnee(BParser.DonneeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#expr_parenthesee}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_parenthesee(BParser.Expr_parentheseeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#chaine_lit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChaine_lit(BParser.Chaine_litContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#conversion_bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConversion_bool(BParser.Conversion_boolContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#moins_unaire}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoins_unaire(BParser.Moins_unaireContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#produit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProduit(BParser.ProduitContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#division}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(BParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#puissance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuissance(BParser.PuissanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#successeur}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuccesseur(BParser.SuccesseurContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#predecesseur}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredecesseur(BParser.PredecesseurContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#maximum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaximum(BParser.MaximumContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#minimum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinimum(BParser.MinimumContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#cardinal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCardinal(BParser.CardinalContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#somme_generalisee}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSomme_generalisee(BParser.Somme_generaliseeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#produit_generalise}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProduit_generalise(BParser.Produit_generaliseContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#couple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCouple(BParser.CoupleContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#champ_de_record}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamp_de_record(BParser.Champ_de_recordContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#ensemble_relations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnsemble_relations(BParser.Ensemble_relationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#ensemble}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnsemble(BParser.EnsembleContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#union}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion(BParser.UnionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#intersection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntersection(BParser.IntersectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#produit_ensembles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProduit_ensembles(BParser.Produit_ensemblesContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#produit_direct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProduit_direct(BParser.Produit_directContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#produit_parallele}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProduit_parallele(BParser.Produit_paralleleContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#iteration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteration(BParser.IterationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#fermeture_reflexive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFermeture_reflexive(BParser.Fermeture_reflexiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#fermeture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFermeture(BParser.FermetureContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#ensemble_atomique}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnsemble_atomique(BParser.Ensemble_atomiqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#ensemble_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnsemble_literal(BParser.Ensemble_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#ensemble_vide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnsemble_vide(BParser.Ensemble_videContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#ensemble_entier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnsemble_entier(BParser.Ensemble_entierContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#ensemble_booleen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnsemble_booleen(BParser.Ensemble_booleenContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#ensemble_chaines}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnsemble_chaines(BParser.Ensemble_chainesContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#ens_comprehension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEns_comprehension(BParser.Ens_comprehensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#sous_ensembles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSous_ensembles(BParser.Sous_ensemblesContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#sous_ensembles_finis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSous_ensembles_finis(BParser.Sous_ensembles_finisContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#ens_extension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEns_extension(BParser.Ens_extensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#intervalle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalle(BParser.IntervalleContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#union_generalisee}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_generalisee(BParser.Union_generaliseeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#intersection_generalisee}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntersection_generalisee(BParser.Intersection_generaliseeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#union_quantifiee}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_quantifiee(BParser.Union_quantifieeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#intersection_quantifiee}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntersection_quantifiee(BParser.Intersection_quantifieeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#ensemble_records}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnsemble_records(BParser.Ensemble_recordsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#def_record}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_record(BParser.Def_recordContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#record_en_extension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_en_extension(BParser.Record_en_extensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#def_record2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_record2(BParser.Def_record2Context ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#identite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentite(BParser.IdentiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#inverse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInverse(BParser.InverseContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#premiere_projection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPremiere_projection(BParser.Premiere_projectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#deuxieme_projection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeuxieme_projection(BParser.Deuxieme_projectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#composition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComposition(BParser.CompositionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#domaine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDomaine(BParser.DomaineContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#codomaine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodomaine(BParser.CodomaineContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#image}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImage(BParser.ImageContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#restriction_domaine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestriction_domaine(BParser.Restriction_domaineContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#soustraction_domaine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSoustraction_domaine(BParser.Soustraction_domaineContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#restriction_codomaine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestriction_codomaine(BParser.Restriction_codomaineContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#soustraction_codomaine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSoustraction_codomaine(BParser.Soustraction_codomaineContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#surcharge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSurcharge(BParser.SurchargeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#fonction_partielle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFonction_partielle(BParser.Fonction_partielleContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#fonction_totale}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFonction_totale(BParser.Fonction_totaleContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#injection_partielle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInjection_partielle(BParser.Injection_partielleContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#injection_totale}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInjection_totale(BParser.Injection_totaleContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#surjection_partielle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSurjection_partielle(BParser.Surjection_partielleContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#surjection_totale}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSurjection_totale(BParser.Surjection_totaleContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#bijection_totale}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBijection_totale(BParser.Bijection_totaleContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#lambda_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda_expression(BParser.Lambda_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#evaluation_fonction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluation_fonction(BParser.Evaluation_fonctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#transformee_fonction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransformee_fonction(BParser.Transformee_fonctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#transformee_relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransformee_relation(BParser.Transformee_relationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#suites}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuites(BParser.SuitesContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#suites_non_vide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuites_non_vide(BParser.Suites_non_videContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#suites_injectives}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuites_injectives(BParser.Suites_injectivesContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#suites_inj_non_vide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuites_inj_non_vide(BParser.Suites_inj_non_videContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#permutations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPermutations(BParser.PermutationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#suite_vide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuite_vide(BParser.Suite_videContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#suite_extension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuite_extension(BParser.Suite_extensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#taille_suite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTaille_suite(BParser.Taille_suiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#premier_element_suite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPremier_element_suite(BParser.Premier_element_suiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#dernier_element_suite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDernier_element_suite(BParser.Dernier_element_suiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#tete_suite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTete_suite(BParser.Tete_suiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#queue_suite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueue_suite(BParser.Queue_suiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#inverse_suite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInverse_suite(BParser.Inverse_suiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#concatenation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenation(BParser.ConcatenationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#insertion_tete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertion_tete(BParser.Insertion_teteContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#insertion_queue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertion_queue(BParser.Insertion_queueContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#restriction_tete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestriction_tete(BParser.Restriction_teteContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#restriction_queue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestriction_queue(BParser.Restriction_queueContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#concat_generalisee}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcat_generalisee(BParser.Concat_generaliseeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#arbres}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArbres(BParser.ArbresContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#arbres_binaires}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArbres_binaires(BParser.Arbres_binairesContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#construction_arbre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstruction_arbre(BParser.Construction_arbreContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#racine_arbre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRacine_arbre(BParser.Racine_arbreContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#fils_arbre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFils_arbre(BParser.Fils_arbreContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#aplatissement_prefixe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAplatissement_prefixe(BParser.Aplatissement_prefixeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#aplatissement_postfixe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAplatissement_postfixe(BParser.Aplatissement_postfixeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#taille_arbre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTaille_arbre(BParser.Taille_arbreContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#symetrie_arbre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymetrie_arbre(BParser.Symetrie_arbreContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#rang_noeud}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRang_noeud(BParser.Rang_noeudContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#pere_noeud}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPere_noeud(BParser.Pere_noeudContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#fils_noeud}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFils_noeud(BParser.Fils_noeudContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#sous_arbre_noeud}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSous_arbre_noeud(BParser.Sous_arbre_noeudContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#arite_noeud}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArite_noeud(BParser.Arite_noeudContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#arbre_binaire_en_extension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArbre_binaire_en_extension(BParser.Arbre_binaire_en_extensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#sous_arbre_gauche}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSous_arbre_gauche(BParser.Sous_arbre_gaucheContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#sous_arbre_droit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSous_arbre_droit(BParser.Sous_arbre_droitContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#aplatissement_infixe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAplatissement_infixe(BParser.Aplatissement_infixeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#substitution}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstitution(BParser.SubstitutionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#substitution_corps_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstitution_corps_operation(BParser.Substitution_corps_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#substitution_bloc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstitution_bloc(BParser.Substitution_blocContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#substitution_identite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstitution_identite(BParser.Substitution_identiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#substitution_devient_egal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstitution_devient_egal(BParser.Substitution_devient_egalContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#substitution_precondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstitution_precondition(BParser.Substitution_preconditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#substitution_assertion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstitution_assertion(BParser.Substitution_assertionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#substitution_choix_borne}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstitution_choix_borne(BParser.Substitution_choix_borneContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#substitution_choix_non_borne}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstitution_choix_non_borne(BParser.Substitution_choix_non_borneContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#substitution_conditionnelle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstitution_conditionnelle(BParser.Substitution_conditionnelleContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#substitution_selection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstitution_selection(BParser.Substitution_selectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#substitution_cas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstitution_cas(BParser.Substitution_casContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#substitution_non_borne}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstitution_non_borne(BParser.Substitution_non_borneContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#substitution_definition_locale}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstitution_definition_locale(BParser.Substitution_definition_localeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#ident_equal_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent_equal_expression(BParser.Ident_equal_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#substitution_let}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstitution_let(BParser.Substitution_letContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#substitution_devient_elt_de}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstitution_devient_elt_de(BParser.Substitution_devient_elt_deContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#substitution_devient_tel_que}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstitution_devient_tel_que(BParser.Substitution_devient_tel_queContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#substitution_variable_locale}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstitution_variable_locale(BParser.Substitution_variable_localeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#substitution_sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstitution_sequence(BParser.Substitution_sequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#substitution_appel_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstitution_appel_operation(BParser.Substitution_appel_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#substitution_simultanee}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstitution_simultanee(BParser.Substitution_simultaneeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#liste_ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListe_ident(BParser.Liste_identContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#ident_ren}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent_ren(BParser.Ident_renContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#typage_donnée_abstraite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypage_donnée_abstraite(BParser.Typage_donnée_abstraiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#type_cte_concrete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_cte_concrete(BParser.Type_cte_concreteContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#typage_appartenance_donnee_concrete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypage_appartenance_donnee_concrete(BParser.Typage_appartenance_donnee_concreteContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#ident_typage_appartenance_donnee_concrete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent_typage_appartenance_donnee_concrete(BParser.Ident_typage_appartenance_donnee_concreteContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#typage_egalite_cte_concrete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypage_egalite_cte_concrete(BParser.Typage_egalite_cte_concreteContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#ident_colon_terme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent_colon_terme(BParser.Ident_colon_termeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#ensemble_simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnsemble_simple(BParser.Ensemble_simpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(BParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link BParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(BParser.IdentContext ctx);
}