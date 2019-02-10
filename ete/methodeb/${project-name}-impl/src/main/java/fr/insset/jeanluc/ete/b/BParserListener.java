// Generated from fr/insset/jeanluc/ete/b/BParser.g4 by ANTLR 4.5.3
package fr.insset.jeanluc.ete.b;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BParser}.
 */
public interface BParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BParser#composant}.
	 * @param ctx the parse tree
	 */
	void enterComposant(BParser.ComposantContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#composant}.
	 * @param ctx the parse tree
	 */
	void exitComposant(BParser.ComposantContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#machine_abstraite}.
	 * @param ctx the parse tree
	 */
	void enterMachine_abstraite(BParser.Machine_abstraiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#machine_abstraite}.
	 * @param ctx the parse tree
	 */
	void exitMachine_abstraite(BParser.Machine_abstraiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#clause_machine_abstraite}.
	 * @param ctx the parse tree
	 */
	void enterClause_machine_abstraite(BParser.Clause_machine_abstraiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#clause_machine_abstraite}.
	 * @param ctx the parse tree
	 */
	void exitClause_machine_abstraite(BParser.Clause_machine_abstraiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#en_tete}.
	 * @param ctx the parse tree
	 */
	void enterEn_tete(BParser.En_teteContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#en_tete}.
	 * @param ctx the parse tree
	 */
	void exitEn_tete(BParser.En_teteContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#raffinement}.
	 * @param ctx the parse tree
	 */
	void enterRaffinement(BParser.RaffinementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#raffinement}.
	 * @param ctx the parse tree
	 */
	void exitRaffinement(BParser.RaffinementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#clause_raffinement}.
	 * @param ctx the parse tree
	 */
	void enterClause_raffinement(BParser.Clause_raffinementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#clause_raffinement}.
	 * @param ctx the parse tree
	 */
	void exitClause_raffinement(BParser.Clause_raffinementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#implantation}.
	 * @param ctx the parse tree
	 */
	void enterImplantation(BParser.ImplantationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#implantation}.
	 * @param ctx the parse tree
	 */
	void exitImplantation(BParser.ImplantationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#clause_implantation}.
	 * @param ctx the parse tree
	 */
	void enterClause_implantation(BParser.Clause_implantationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#clause_implantation}.
	 * @param ctx the parse tree
	 */
	void exitClause_implantation(BParser.Clause_implantationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#clause_constraints}.
	 * @param ctx the parse tree
	 */
	void enterClause_constraints(BParser.Clause_constraintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#clause_constraints}.
	 * @param ctx the parse tree
	 */
	void exitClause_constraints(BParser.Clause_constraintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#clause_refines}.
	 * @param ctx the parse tree
	 */
	void enterClause_refines(BParser.Clause_refinesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#clause_refines}.
	 * @param ctx the parse tree
	 */
	void exitClause_refines(BParser.Clause_refinesContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#clause_imports}.
	 * @param ctx the parse tree
	 */
	void enterClause_imports(BParser.Clause_importsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#clause_imports}.
	 * @param ctx the parse tree
	 */
	void exitClause_imports(BParser.Clause_importsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#instanciation_B0}.
	 * @param ctx the parse tree
	 */
	void enterInstanciation_B0(BParser.Instanciation_B0Context ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#instanciation_B0}.
	 * @param ctx the parse tree
	 */
	void exitInstanciation_B0(BParser.Instanciation_B0Context ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#clause_sees}.
	 * @param ctx the parse tree
	 */
	void enterClause_sees(BParser.Clause_seesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#clause_sees}.
	 * @param ctx the parse tree
	 */
	void exitClause_sees(BParser.Clause_seesContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#clause_includes}.
	 * @param ctx the parse tree
	 */
	void enterClause_includes(BParser.Clause_includesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#clause_includes}.
	 * @param ctx the parse tree
	 */
	void exitClause_includes(BParser.Clause_includesContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#instanciation}.
	 * @param ctx the parse tree
	 */
	void enterInstanciation(BParser.InstanciationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#instanciation}.
	 * @param ctx the parse tree
	 */
	void exitInstanciation(BParser.InstanciationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#clause_promotes}.
	 * @param ctx the parse tree
	 */
	void enterClause_promotes(BParser.Clause_promotesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#clause_promotes}.
	 * @param ctx the parse tree
	 */
	void exitClause_promotes(BParser.Clause_promotesContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#clause_extends}.
	 * @param ctx the parse tree
	 */
	void enterClause_extends(BParser.Clause_extendsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#clause_extends}.
	 * @param ctx the parse tree
	 */
	void exitClause_extends(BParser.Clause_extendsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#ident_ren_instanciation}.
	 * @param ctx the parse tree
	 */
	void enterIdent_ren_instanciation(BParser.Ident_ren_instanciationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#ident_ren_instanciation}.
	 * @param ctx the parse tree
	 */
	void exitIdent_ren_instanciation(BParser.Ident_ren_instanciationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#clause_extends_B0}.
	 * @param ctx the parse tree
	 */
	void enterClause_extends_B0(BParser.Clause_extends_B0Context ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#clause_extends_B0}.
	 * @param ctx the parse tree
	 */
	void exitClause_extends_B0(BParser.Clause_extends_B0Context ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#ident_ren_instanciation_B0}.
	 * @param ctx the parse tree
	 */
	void enterIdent_ren_instanciation_B0(BParser.Ident_ren_instanciation_B0Context ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#ident_ren_instanciation_B0}.
	 * @param ctx the parse tree
	 */
	void exitIdent_ren_instanciation_B0(BParser.Ident_ren_instanciation_B0Context ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#clause_extends_BO}.
	 * @param ctx the parse tree
	 */
	void enterClause_extends_BO(BParser.Clause_extends_BOContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#clause_extends_BO}.
	 * @param ctx the parse tree
	 */
	void exitClause_extends_BO(BParser.Clause_extends_BOContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#clause_uses}.
	 * @param ctx the parse tree
	 */
	void enterClause_uses(BParser.Clause_usesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#clause_uses}.
	 * @param ctx the parse tree
	 */
	void exitClause_uses(BParser.Clause_usesContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#clause_sets}.
	 * @param ctx the parse tree
	 */
	void enterClause_sets(BParser.Clause_setsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#clause_sets}.
	 * @param ctx the parse tree
	 */
	void exitClause_sets(BParser.Clause_setsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#clause_concrete_constants}.
	 * @param ctx the parse tree
	 */
	void enterClause_concrete_constants(BParser.Clause_concrete_constantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#clause_concrete_constants}.
	 * @param ctx the parse tree
	 */
	void exitClause_concrete_constants(BParser.Clause_concrete_constantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#clause_abstract_constants}.
	 * @param ctx the parse tree
	 */
	void enterClause_abstract_constants(BParser.Clause_abstract_constantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#clause_abstract_constants}.
	 * @param ctx the parse tree
	 */
	void exitClause_abstract_constants(BParser.Clause_abstract_constantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#clause_properties}.
	 * @param ctx the parse tree
	 */
	void enterClause_properties(BParser.Clause_propertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#clause_properties}.
	 * @param ctx the parse tree
	 */
	void exitClause_properties(BParser.Clause_propertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#clause_values}.
	 * @param ctx the parse tree
	 */
	void enterClause_values(BParser.Clause_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#clause_values}.
	 * @param ctx the parse tree
	 */
	void exitClause_values(BParser.Clause_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#valuation}.
	 * @param ctx the parse tree
	 */
	void enterValuation(BParser.ValuationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#valuation}.
	 * @param ctx the parse tree
	 */
	void exitValuation(BParser.ValuationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#clause_concrete_variables}.
	 * @param ctx the parse tree
	 */
	void enterClause_concrete_variables(BParser.Clause_concrete_variablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#clause_concrete_variables}.
	 * @param ctx the parse tree
	 */
	void exitClause_concrete_variables(BParser.Clause_concrete_variablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#clause_abstract_variables}.
	 * @param ctx the parse tree
	 */
	void enterClause_abstract_variables(BParser.Clause_abstract_variablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#clause_abstract_variables}.
	 * @param ctx the parse tree
	 */
	void exitClause_abstract_variables(BParser.Clause_abstract_variablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#clause_invariant}.
	 * @param ctx the parse tree
	 */
	void enterClause_invariant(BParser.Clause_invariantContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#clause_invariant}.
	 * @param ctx the parse tree
	 */
	void exitClause_invariant(BParser.Clause_invariantContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#clause_assertions}.
	 * @param ctx the parse tree
	 */
	void enterClause_assertions(BParser.Clause_assertionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#clause_assertions}.
	 * @param ctx the parse tree
	 */
	void exitClause_assertions(BParser.Clause_assertionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#clause_initialisation}.
	 * @param ctx the parse tree
	 */
	void enterClause_initialisation(BParser.Clause_initialisationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#clause_initialisation}.
	 * @param ctx the parse tree
	 */
	void exitClause_initialisation(BParser.Clause_initialisationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#clause_initialisation_B0}.
	 * @param ctx the parse tree
	 */
	void enterClause_initialisation_B0(BParser.Clause_initialisation_B0Context ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#clause_initialisation_B0}.
	 * @param ctx the parse tree
	 */
	void exitClause_initialisation_B0(BParser.Clause_initialisation_B0Context ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#clause_operations}.
	 * @param ctx the parse tree
	 */
	void enterClause_operations(BParser.Clause_operationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#clause_operations}.
	 * @param ctx the parse tree
	 */
	void exitClause_operations(BParser.Clause_operationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(BParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(BParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#en_tete_operation}.
	 * @param ctx the parse tree
	 */
	void enterEn_tete_operation(BParser.En_tete_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#en_tete_operation}.
	 * @param ctx the parse tree
	 */
	void exitEn_tete_operation(BParser.En_tete_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#clause_operations_B0}.
	 * @param ctx the parse tree
	 */
	void enterClause_operations_B0(BParser.Clause_operations_B0Context ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#clause_operations_B0}.
	 * @param ctx the parse tree
	 */
	void exitClause_operations_B0(BParser.Clause_operations_B0Context ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#operations_B0}.
	 * @param ctx the parse tree
	 */
	void enterOperations_B0(BParser.Operations_B0Context ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#operations_B0}.
	 * @param ctx the parse tree
	 */
	void exitOperations_B0(BParser.Operations_B0Context ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#clause_operations_locales}.
	 * @param ctx the parse tree
	 */
	void enterClause_operations_locales(BParser.Clause_operations_localesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#clause_operations_locales}.
	 * @param ctx the parse tree
	 */
	void exitClause_operations_locales(BParser.Clause_operations_localesContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#terme}.
	 * @param ctx the parse tree
	 */
	void enterTerme(BParser.TermeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#terme}.
	 * @param ctx the parse tree
	 */
	void exitTerme(BParser.TermeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#terme_simple}.
	 * @param ctx the parse tree
	 */
	void enterTerme_simple(BParser.Terme_simpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#terme_simple}.
	 * @param ctx the parse tree
	 */
	void exitTerme_simple(BParser.Terme_simpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#entier_lit}.
	 * @param ctx the parse tree
	 */
	void enterEntier_lit(BParser.Entier_litContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#entier_lit}.
	 * @param ctx the parse tree
	 */
	void exitEntier_lit(BParser.Entier_litContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#booleen_lit}.
	 * @param ctx the parse tree
	 */
	void enterBooleen_lit(BParser.Booleen_litContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#booleen_lit}.
	 * @param ctx the parse tree
	 */
	void exitBooleen_lit(BParser.Booleen_litContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#expression_arithmetique}.
	 * @param ctx the parse tree
	 */
	void enterExpression_arithmetique(BParser.Expression_arithmetiqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#expression_arithmetique}.
	 * @param ctx the parse tree
	 */
	void exitExpression_arithmetique(BParser.Expression_arithmetiqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#expression_mult}.
	 * @param ctx the parse tree
	 */
	void enterExpression_mult(BParser.Expression_multContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#expression_mult}.
	 * @param ctx the parse tree
	 */
	void exitExpression_mult(BParser.Expression_multContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#expression_exp}.
	 * @param ctx the parse tree
	 */
	void enterExpression_exp(BParser.Expression_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#expression_exp}.
	 * @param ctx the parse tree
	 */
	void exitExpression_exp(BParser.Expression_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#expression_atomique}.
	 * @param ctx the parse tree
	 */
	void enterExpression_atomique(BParser.Expression_atomiqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#expression_atomique}.
	 * @param ctx the parse tree
	 */
	void exitExpression_atomique(BParser.Expression_atomiqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#terme_record}.
	 * @param ctx the parse tree
	 */
	void enterTerme_record(BParser.Terme_recordContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#terme_record}.
	 * @param ctx the parse tree
	 */
	void exitTerme_record(BParser.Terme_recordContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#expr_tableau}.
	 * @param ctx the parse tree
	 */
	void enterExpr_tableau(BParser.Expr_tableauContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#expr_tableau}.
	 * @param ctx the parse tree
	 */
	void exitExpr_tableau(BParser.Expr_tableauContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#intervalle_B0}.
	 * @param ctx the parse tree
	 */
	void enterIntervalle_B0(BParser.Intervalle_B0Context ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#intervalle_B0}.
	 * @param ctx the parse tree
	 */
	void exitIntervalle_B0(BParser.Intervalle_B0Context ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#ensemble_entier_B0}.
	 * @param ctx the parse tree
	 */
	void enterEnsemble_entier_B0(BParser.Ensemble_entier_B0Context ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#ensemble_entier_B0}.
	 * @param ctx the parse tree
	 */
	void exitEnsemble_entier_B0(BParser.Ensemble_entier_B0Context ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(BParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(BParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#condition_et}.
	 * @param ctx the parse tree
	 */
	void enterCondition_et(BParser.Condition_etContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#condition_et}.
	 * @param ctx the parse tree
	 */
	void exitCondition_et(BParser.Condition_etContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#condition_atomique}.
	 * @param ctx the parse tree
	 */
	void enterCondition_atomique(BParser.Condition_atomiqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#condition_atomique}.
	 * @param ctx the parse tree
	 */
	void exitCondition_atomique(BParser.Condition_atomiqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(BParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(BParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#instruction_corps_operation}.
	 * @param ctx the parse tree
	 */
	void enterInstruction_corps_operation(BParser.Instruction_corps_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#instruction_corps_operation}.
	 * @param ctx the parse tree
	 */
	void exitInstruction_corps_operation(BParser.Instruction_corps_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#instruction_bloc}.
	 * @param ctx the parse tree
	 */
	void enterInstruction_bloc(BParser.Instruction_blocContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#instruction_bloc}.
	 * @param ctx the parse tree
	 */
	void exitInstruction_bloc(BParser.Instruction_blocContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#instruction_variable_locale}.
	 * @param ctx the parse tree
	 */
	void enterInstruction_variable_locale(BParser.Instruction_variable_localeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#instruction_variable_locale}.
	 * @param ctx the parse tree
	 */
	void exitInstruction_variable_locale(BParser.Instruction_variable_localeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#instruction_devient_egal}.
	 * @param ctx the parse tree
	 */
	void enterInstruction_devient_egal(BParser.Instruction_devient_egalContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#instruction_devient_egal}.
	 * @param ctx the parse tree
	 */
	void exitInstruction_devient_egal(BParser.Instruction_devient_egalContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#instruction_appel_operation}.
	 * @param ctx the parse tree
	 */
	void enterInstruction_appel_operation(BParser.Instruction_appel_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#instruction_appel_operation}.
	 * @param ctx the parse tree
	 */
	void exitInstruction_appel_operation(BParser.Instruction_appel_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#terme_or_chaine_lit}.
	 * @param ctx the parse tree
	 */
	void enterTerme_or_chaine_lit(BParser.Terme_or_chaine_litContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#terme_or_chaine_lit}.
	 * @param ctx the parse tree
	 */
	void exitTerme_or_chaine_lit(BParser.Terme_or_chaine_litContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#instruction_sequence}.
	 * @param ctx the parse tree
	 */
	void enterInstruction_sequence(BParser.Instruction_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#instruction_sequence}.
	 * @param ctx the parse tree
	 */
	void exitInstruction_sequence(BParser.Instruction_sequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#instruction_conditionnelle}.
	 * @param ctx the parse tree
	 */
	void enterInstruction_conditionnelle(BParser.Instruction_conditionnelleContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#instruction_conditionnelle}.
	 * @param ctx the parse tree
	 */
	void exitInstruction_conditionnelle(BParser.Instruction_conditionnelleContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#instruction_cas}.
	 * @param ctx the parse tree
	 */
	void enterInstruction_cas(BParser.Instruction_casContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#instruction_cas}.
	 * @param ctx the parse tree
	 */
	void exitInstruction_cas(BParser.Instruction_casContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#substitution_tant_que}.
	 * @param ctx the parse tree
	 */
	void enterSubstitution_tant_que(BParser.Substitution_tant_queContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#substitution_tant_que}.
	 * @param ctx the parse tree
	 */
	void exitSubstitution_tant_que(BParser.Substitution_tant_queContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#instruction_assertion}.
	 * @param ctx the parse tree
	 */
	void enterInstruction_assertion(BParser.Instruction_assertionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#instruction_assertion}.
	 * @param ctx the parse tree
	 */
	void exitInstruction_assertion(BParser.Instruction_assertionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#predicat}.
	 * @param ctx the parse tree
	 */
	void enterPredicat(BParser.PredicatContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#predicat}.
	 * @param ctx the parse tree
	 */
	void exitPredicat(BParser.PredicatContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#predicat_implication_equivalence}.
	 * @param ctx the parse tree
	 */
	void enterPredicat_implication_equivalence(BParser.Predicat_implication_equivalenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#predicat_implication_equivalence}.
	 * @param ctx the parse tree
	 */
	void exitPredicat_implication_equivalence(BParser.Predicat_implication_equivalenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#predicat_implication}.
	 * @param ctx the parse tree
	 */
	void enterPredicat_implication(BParser.Predicat_implicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#predicat_implication}.
	 * @param ctx the parse tree
	 */
	void exitPredicat_implication(BParser.Predicat_implicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#predicat_equivalence}.
	 * @param ctx the parse tree
	 */
	void enterPredicat_equivalence(BParser.Predicat_equivalenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#predicat_equivalence}.
	 * @param ctx the parse tree
	 */
	void exitPredicat_equivalence(BParser.Predicat_equivalenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#predicat_disjonction}.
	 * @param ctx the parse tree
	 */
	void enterPredicat_disjonction(BParser.Predicat_disjonctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#predicat_disjonction}.
	 * @param ctx the parse tree
	 */
	void exitPredicat_disjonction(BParser.Predicat_disjonctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#predicat_et}.
	 * @param ctx the parse tree
	 */
	void enterPredicat_et(BParser.Predicat_etContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#predicat_et}.
	 * @param ctx the parse tree
	 */
	void exitPredicat_et(BParser.Predicat_etContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#predicat_egalite_inegalite}.
	 * @param ctx the parse tree
	 */
	void enterPredicat_egalite_inegalite(BParser.Predicat_egalite_inegaliteContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#predicat_egalite_inegalite}.
	 * @param ctx the parse tree
	 */
	void exitPredicat_egalite_inegalite(BParser.Predicat_egalite_inegaliteContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#predicat_egalite}.
	 * @param ctx the parse tree
	 */
	void enterPredicat_egalite(BParser.Predicat_egaliteContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#predicat_egalite}.
	 * @param ctx the parse tree
	 */
	void exitPredicat_egalite(BParser.Predicat_egaliteContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#predicat_inegalite}.
	 * @param ctx the parse tree
	 */
	void enterPredicat_inegalite(BParser.Predicat_inegaliteContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#predicat_inegalite}.
	 * @param ctx the parse tree
	 */
	void exitPredicat_inegalite(BParser.Predicat_inegaliteContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#predicat_atomique}.
	 * @param ctx the parse tree
	 */
	void enterPredicat_atomique(BParser.Predicat_atomiqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#predicat_atomique}.
	 * @param ctx the parse tree
	 */
	void exitPredicat_atomique(BParser.Predicat_atomiqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#predicat_parenthese}.
	 * @param ctx the parse tree
	 */
	void enterPredicat_parenthese(BParser.Predicat_parentheseContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#predicat_parenthese}.
	 * @param ctx the parse tree
	 */
	void exitPredicat_parenthese(BParser.Predicat_parentheseContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#predicat_conjonction}.
	 * @param ctx the parse tree
	 */
	void enterPredicat_conjonction(BParser.Predicat_conjonctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#predicat_conjonction}.
	 * @param ctx the parse tree
	 */
	void exitPredicat_conjonction(BParser.Predicat_conjonctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#predicat_negation}.
	 * @param ctx the parse tree
	 */
	void enterPredicat_negation(BParser.Predicat_negationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#predicat_negation}.
	 * @param ctx the parse tree
	 */
	void exitPredicat_negation(BParser.Predicat_negationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#predicat_universel}.
	 * @param ctx the parse tree
	 */
	void enterPredicat_universel(BParser.Predicat_universelContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#predicat_universel}.
	 * @param ctx the parse tree
	 */
	void exitPredicat_universel(BParser.Predicat_universelContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#predicat_existentiel}.
	 * @param ctx the parse tree
	 */
	void enterPredicat_existentiel(BParser.Predicat_existentielContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#predicat_existentiel}.
	 * @param ctx the parse tree
	 */
	void exitPredicat_existentiel(BParser.Predicat_existentielContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#predicat_appartenance}.
	 * @param ctx the parse tree
	 */
	void enterPredicat_appartenance(BParser.Predicat_appartenanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#predicat_appartenance}.
	 * @param ctx the parse tree
	 */
	void exitPredicat_appartenance(BParser.Predicat_appartenanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#predicat_non_appartenance}.
	 * @param ctx the parse tree
	 */
	void enterPredicat_non_appartenance(BParser.Predicat_non_appartenanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#predicat_non_appartenance}.
	 * @param ctx the parse tree
	 */
	void exitPredicat_non_appartenance(BParser.Predicat_non_appartenanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#predicat_inclusion}.
	 * @param ctx the parse tree
	 */
	void enterPredicat_inclusion(BParser.Predicat_inclusionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#predicat_inclusion}.
	 * @param ctx the parse tree
	 */
	void exitPredicat_inclusion(BParser.Predicat_inclusionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#predicat_inclusion_stricte}.
	 * @param ctx the parse tree
	 */
	void enterPredicat_inclusion_stricte(BParser.Predicat_inclusion_stricteContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#predicat_inclusion_stricte}.
	 * @param ctx the parse tree
	 */
	void exitPredicat_inclusion_stricte(BParser.Predicat_inclusion_stricteContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#predicat_non_inclusion}.
	 * @param ctx the parse tree
	 */
	void enterPredicat_non_inclusion(BParser.Predicat_non_inclusionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#predicat_non_inclusion}.
	 * @param ctx the parse tree
	 */
	void exitPredicat_non_inclusion(BParser.Predicat_non_inclusionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#predicat_non_inclusion_stricte}.
	 * @param ctx the parse tree
	 */
	void enterPredicat_non_inclusion_stricte(BParser.Predicat_non_inclusion_stricteContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#predicat_non_inclusion_stricte}.
	 * @param ctx the parse tree
	 */
	void exitPredicat_non_inclusion_stricte(BParser.Predicat_non_inclusion_stricteContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#predicat_inferieur_ou_egal}.
	 * @param ctx the parse tree
	 */
	void enterPredicat_inferieur_ou_egal(BParser.Predicat_inferieur_ou_egalContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#predicat_inferieur_ou_egal}.
	 * @param ctx the parse tree
	 */
	void exitPredicat_inferieur_ou_egal(BParser.Predicat_inferieur_ou_egalContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#predicat_strictement_inferieur}.
	 * @param ctx the parse tree
	 */
	void enterPredicat_strictement_inferieur(BParser.Predicat_strictement_inferieurContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#predicat_strictement_inferieur}.
	 * @param ctx the parse tree
	 */
	void exitPredicat_strictement_inferieur(BParser.Predicat_strictement_inferieurContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#predicat_superieur_ou_egal}.
	 * @param ctx the parse tree
	 */
	void enterPredicat_superieur_ou_egal(BParser.Predicat_superieur_ou_egalContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#predicat_superieur_ou_egal}.
	 * @param ctx the parse tree
	 */
	void exitPredicat_superieur_ou_egal(BParser.Predicat_superieur_ou_egalContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#predicat_strictement_superieur}.
	 * @param ctx the parse tree
	 */
	void enterPredicat_strictement_superieur(BParser.Predicat_strictement_superieurContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#predicat_strictement_superieur}.
	 * @param ctx the parse tree
	 */
	void exitPredicat_strictement_superieur(BParser.Predicat_strictement_superieurContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(BParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(BParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#expression_primaire}.
	 * @param ctx the parse tree
	 */
	void enterExpression_primaire(BParser.Expression_primaireContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#expression_primaire}.
	 * @param ctx the parse tree
	 */
	void exitExpression_primaire(BParser.Expression_primaireContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#expression_booleenne}.
	 * @param ctx the parse tree
	 */
	void enterExpression_booleenne(BParser.Expression_booleenneContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#expression_booleenne}.
	 * @param ctx the parse tree
	 */
	void exitExpression_booleenne(BParser.Expression_booleenneContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#expression_de_couples}.
	 * @param ctx the parse tree
	 */
	void enterExpression_de_couples(BParser.Expression_de_couplesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#expression_de_couples}.
	 * @param ctx the parse tree
	 */
	void exitExpression_de_couples(BParser.Expression_de_couplesContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#expression_d_ensembles}.
	 * @param ctx the parse tree
	 */
	void enterExpression_d_ensembles(BParser.Expression_d_ensemblesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#expression_d_ensembles}.
	 * @param ctx the parse tree
	 */
	void exitExpression_d_ensembles(BParser.Expression_d_ensemblesContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#construction_d_ensembles}.
	 * @param ctx the parse tree
	 */
	void enterConstruction_d_ensembles(BParser.Construction_d_ensemblesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#construction_d_ensembles}.
	 * @param ctx the parse tree
	 */
	void exitConstruction_d_ensembles(BParser.Construction_d_ensemblesContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#expression_de_records}.
	 * @param ctx the parse tree
	 */
	void enterExpression_de_records(BParser.Expression_de_recordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#expression_de_records}.
	 * @param ctx the parse tree
	 */
	void exitExpression_de_records(BParser.Expression_de_recordsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#expression_de_relations}.
	 * @param ctx the parse tree
	 */
	void enterExpression_de_relations(BParser.Expression_de_relationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#expression_de_relations}.
	 * @param ctx the parse tree
	 */
	void exitExpression_de_relations(BParser.Expression_de_relationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#expression_de_fonctions}.
	 * @param ctx the parse tree
	 */
	void enterExpression_de_fonctions(BParser.Expression_de_fonctionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#expression_de_fonctions}.
	 * @param ctx the parse tree
	 */
	void exitExpression_de_fonctions(BParser.Expression_de_fonctionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#construction_de_fonctions}.
	 * @param ctx the parse tree
	 */
	void enterConstruction_de_fonctions(BParser.Construction_de_fonctionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#construction_de_fonctions}.
	 * @param ctx the parse tree
	 */
	void exitConstruction_de_fonctions(BParser.Construction_de_fonctionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#expression_de_suites}.
	 * @param ctx the parse tree
	 */
	void enterExpression_de_suites(BParser.Expression_de_suitesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#expression_de_suites}.
	 * @param ctx the parse tree
	 */
	void exitExpression_de_suites(BParser.Expression_de_suitesContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#construction_de_suites}.
	 * @param ctx the parse tree
	 */
	void enterConstruction_de_suites(BParser.Construction_de_suitesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#construction_de_suites}.
	 * @param ctx the parse tree
	 */
	void exitConstruction_de_suites(BParser.Construction_de_suitesContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#expression_d_arbres}.
	 * @param ctx the parse tree
	 */
	void enterExpression_d_arbres(BParser.Expression_d_arbresContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#expression_d_arbres}.
	 * @param ctx the parse tree
	 */
	void exitExpression_d_arbres(BParser.Expression_d_arbresContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#donnee}.
	 * @param ctx the parse tree
	 */
	void enterDonnee(BParser.DonneeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#donnee}.
	 * @param ctx the parse tree
	 */
	void exitDonnee(BParser.DonneeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#expr_parenthesee}.
	 * @param ctx the parse tree
	 */
	void enterExpr_parenthesee(BParser.Expr_parentheseeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#expr_parenthesee}.
	 * @param ctx the parse tree
	 */
	void exitExpr_parenthesee(BParser.Expr_parentheseeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#chaine_lit}.
	 * @param ctx the parse tree
	 */
	void enterChaine_lit(BParser.Chaine_litContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#chaine_lit}.
	 * @param ctx the parse tree
	 */
	void exitChaine_lit(BParser.Chaine_litContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#conversion_bool}.
	 * @param ctx the parse tree
	 */
	void enterConversion_bool(BParser.Conversion_boolContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#conversion_bool}.
	 * @param ctx the parse tree
	 */
	void exitConversion_bool(BParser.Conversion_boolContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#moins_unaire}.
	 * @param ctx the parse tree
	 */
	void enterMoins_unaire(BParser.Moins_unaireContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#moins_unaire}.
	 * @param ctx the parse tree
	 */
	void exitMoins_unaire(BParser.Moins_unaireContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#produit}.
	 * @param ctx the parse tree
	 */
	void enterProduit(BParser.ProduitContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#produit}.
	 * @param ctx the parse tree
	 */
	void exitProduit(BParser.ProduitContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#division}.
	 * @param ctx the parse tree
	 */
	void enterDivision(BParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#division}.
	 * @param ctx the parse tree
	 */
	void exitDivision(BParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#puissance}.
	 * @param ctx the parse tree
	 */
	void enterPuissance(BParser.PuissanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#puissance}.
	 * @param ctx the parse tree
	 */
	void exitPuissance(BParser.PuissanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#successeur}.
	 * @param ctx the parse tree
	 */
	void enterSuccesseur(BParser.SuccesseurContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#successeur}.
	 * @param ctx the parse tree
	 */
	void exitSuccesseur(BParser.SuccesseurContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#predecesseur}.
	 * @param ctx the parse tree
	 */
	void enterPredecesseur(BParser.PredecesseurContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#predecesseur}.
	 * @param ctx the parse tree
	 */
	void exitPredecesseur(BParser.PredecesseurContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#maximum}.
	 * @param ctx the parse tree
	 */
	void enterMaximum(BParser.MaximumContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#maximum}.
	 * @param ctx the parse tree
	 */
	void exitMaximum(BParser.MaximumContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#minimum}.
	 * @param ctx the parse tree
	 */
	void enterMinimum(BParser.MinimumContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#minimum}.
	 * @param ctx the parse tree
	 */
	void exitMinimum(BParser.MinimumContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#cardinal}.
	 * @param ctx the parse tree
	 */
	void enterCardinal(BParser.CardinalContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#cardinal}.
	 * @param ctx the parse tree
	 */
	void exitCardinal(BParser.CardinalContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#somme_generalisee}.
	 * @param ctx the parse tree
	 */
	void enterSomme_generalisee(BParser.Somme_generaliseeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#somme_generalisee}.
	 * @param ctx the parse tree
	 */
	void exitSomme_generalisee(BParser.Somme_generaliseeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#produit_generalise}.
	 * @param ctx the parse tree
	 */
	void enterProduit_generalise(BParser.Produit_generaliseContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#produit_generalise}.
	 * @param ctx the parse tree
	 */
	void exitProduit_generalise(BParser.Produit_generaliseContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#couple}.
	 * @param ctx the parse tree
	 */
	void enterCouple(BParser.CoupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#couple}.
	 * @param ctx the parse tree
	 */
	void exitCouple(BParser.CoupleContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#champ_de_record}.
	 * @param ctx the parse tree
	 */
	void enterChamp_de_record(BParser.Champ_de_recordContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#champ_de_record}.
	 * @param ctx the parse tree
	 */
	void exitChamp_de_record(BParser.Champ_de_recordContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#ensemble_relations}.
	 * @param ctx the parse tree
	 */
	void enterEnsemble_relations(BParser.Ensemble_relationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#ensemble_relations}.
	 * @param ctx the parse tree
	 */
	void exitEnsemble_relations(BParser.Ensemble_relationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#ensemble}.
	 * @param ctx the parse tree
	 */
	void enterEnsemble(BParser.EnsembleContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#ensemble}.
	 * @param ctx the parse tree
	 */
	void exitEnsemble(BParser.EnsembleContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#union}.
	 * @param ctx the parse tree
	 */
	void enterUnion(BParser.UnionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#union}.
	 * @param ctx the parse tree
	 */
	void exitUnion(BParser.UnionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#intersection}.
	 * @param ctx the parse tree
	 */
	void enterIntersection(BParser.IntersectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#intersection}.
	 * @param ctx the parse tree
	 */
	void exitIntersection(BParser.IntersectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#produit_ensembles}.
	 * @param ctx the parse tree
	 */
	void enterProduit_ensembles(BParser.Produit_ensemblesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#produit_ensembles}.
	 * @param ctx the parse tree
	 */
	void exitProduit_ensembles(BParser.Produit_ensemblesContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#produit_direct}.
	 * @param ctx the parse tree
	 */
	void enterProduit_direct(BParser.Produit_directContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#produit_direct}.
	 * @param ctx the parse tree
	 */
	void exitProduit_direct(BParser.Produit_directContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#produit_parallele}.
	 * @param ctx the parse tree
	 */
	void enterProduit_parallele(BParser.Produit_paralleleContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#produit_parallele}.
	 * @param ctx the parse tree
	 */
	void exitProduit_parallele(BParser.Produit_paralleleContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#iteration}.
	 * @param ctx the parse tree
	 */
	void enterIteration(BParser.IterationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#iteration}.
	 * @param ctx the parse tree
	 */
	void exitIteration(BParser.IterationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#fermeture_reflexive}.
	 * @param ctx the parse tree
	 */
	void enterFermeture_reflexive(BParser.Fermeture_reflexiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#fermeture_reflexive}.
	 * @param ctx the parse tree
	 */
	void exitFermeture_reflexive(BParser.Fermeture_reflexiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#fermeture}.
	 * @param ctx the parse tree
	 */
	void enterFermeture(BParser.FermetureContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#fermeture}.
	 * @param ctx the parse tree
	 */
	void exitFermeture(BParser.FermetureContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#ensemble_atomique}.
	 * @param ctx the parse tree
	 */
	void enterEnsemble_atomique(BParser.Ensemble_atomiqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#ensemble_atomique}.
	 * @param ctx the parse tree
	 */
	void exitEnsemble_atomique(BParser.Ensemble_atomiqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#ensemble_literal}.
	 * @param ctx the parse tree
	 */
	void enterEnsemble_literal(BParser.Ensemble_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#ensemble_literal}.
	 * @param ctx the parse tree
	 */
	void exitEnsemble_literal(BParser.Ensemble_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#ensemble_vide}.
	 * @param ctx the parse tree
	 */
	void enterEnsemble_vide(BParser.Ensemble_videContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#ensemble_vide}.
	 * @param ctx the parse tree
	 */
	void exitEnsemble_vide(BParser.Ensemble_videContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#ensemble_entier}.
	 * @param ctx the parse tree
	 */
	void enterEnsemble_entier(BParser.Ensemble_entierContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#ensemble_entier}.
	 * @param ctx the parse tree
	 */
	void exitEnsemble_entier(BParser.Ensemble_entierContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#ensemble_booleen}.
	 * @param ctx the parse tree
	 */
	void enterEnsemble_booleen(BParser.Ensemble_booleenContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#ensemble_booleen}.
	 * @param ctx the parse tree
	 */
	void exitEnsemble_booleen(BParser.Ensemble_booleenContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#ensemble_chaines}.
	 * @param ctx the parse tree
	 */
	void enterEnsemble_chaines(BParser.Ensemble_chainesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#ensemble_chaines}.
	 * @param ctx the parse tree
	 */
	void exitEnsemble_chaines(BParser.Ensemble_chainesContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#ens_comprehension}.
	 * @param ctx the parse tree
	 */
	void enterEns_comprehension(BParser.Ens_comprehensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#ens_comprehension}.
	 * @param ctx the parse tree
	 */
	void exitEns_comprehension(BParser.Ens_comprehensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#sous_ensembles}.
	 * @param ctx the parse tree
	 */
	void enterSous_ensembles(BParser.Sous_ensemblesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#sous_ensembles}.
	 * @param ctx the parse tree
	 */
	void exitSous_ensembles(BParser.Sous_ensemblesContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#sous_ensembles_finis}.
	 * @param ctx the parse tree
	 */
	void enterSous_ensembles_finis(BParser.Sous_ensembles_finisContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#sous_ensembles_finis}.
	 * @param ctx the parse tree
	 */
	void exitSous_ensembles_finis(BParser.Sous_ensembles_finisContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#ens_extension}.
	 * @param ctx the parse tree
	 */
	void enterEns_extension(BParser.Ens_extensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#ens_extension}.
	 * @param ctx the parse tree
	 */
	void exitEns_extension(BParser.Ens_extensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#intervalle}.
	 * @param ctx the parse tree
	 */
	void enterIntervalle(BParser.IntervalleContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#intervalle}.
	 * @param ctx the parse tree
	 */
	void exitIntervalle(BParser.IntervalleContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#union_generalisee}.
	 * @param ctx the parse tree
	 */
	void enterUnion_generalisee(BParser.Union_generaliseeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#union_generalisee}.
	 * @param ctx the parse tree
	 */
	void exitUnion_generalisee(BParser.Union_generaliseeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#intersection_generalisee}.
	 * @param ctx the parse tree
	 */
	void enterIntersection_generalisee(BParser.Intersection_generaliseeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#intersection_generalisee}.
	 * @param ctx the parse tree
	 */
	void exitIntersection_generalisee(BParser.Intersection_generaliseeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#union_quantifiee}.
	 * @param ctx the parse tree
	 */
	void enterUnion_quantifiee(BParser.Union_quantifieeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#union_quantifiee}.
	 * @param ctx the parse tree
	 */
	void exitUnion_quantifiee(BParser.Union_quantifieeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#intersection_quantifiee}.
	 * @param ctx the parse tree
	 */
	void enterIntersection_quantifiee(BParser.Intersection_quantifieeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#intersection_quantifiee}.
	 * @param ctx the parse tree
	 */
	void exitIntersection_quantifiee(BParser.Intersection_quantifieeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#ensemble_records}.
	 * @param ctx the parse tree
	 */
	void enterEnsemble_records(BParser.Ensemble_recordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#ensemble_records}.
	 * @param ctx the parse tree
	 */
	void exitEnsemble_records(BParser.Ensemble_recordsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#def_record}.
	 * @param ctx the parse tree
	 */
	void enterDef_record(BParser.Def_recordContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#def_record}.
	 * @param ctx the parse tree
	 */
	void exitDef_record(BParser.Def_recordContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#record_en_extension}.
	 * @param ctx the parse tree
	 */
	void enterRecord_en_extension(BParser.Record_en_extensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#record_en_extension}.
	 * @param ctx the parse tree
	 */
	void exitRecord_en_extension(BParser.Record_en_extensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#def_record2}.
	 * @param ctx the parse tree
	 */
	void enterDef_record2(BParser.Def_record2Context ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#def_record2}.
	 * @param ctx the parse tree
	 */
	void exitDef_record2(BParser.Def_record2Context ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#identite}.
	 * @param ctx the parse tree
	 */
	void enterIdentite(BParser.IdentiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#identite}.
	 * @param ctx the parse tree
	 */
	void exitIdentite(BParser.IdentiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#inverse}.
	 * @param ctx the parse tree
	 */
	void enterInverse(BParser.InverseContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#inverse}.
	 * @param ctx the parse tree
	 */
	void exitInverse(BParser.InverseContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#premiere_projection}.
	 * @param ctx the parse tree
	 */
	void enterPremiere_projection(BParser.Premiere_projectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#premiere_projection}.
	 * @param ctx the parse tree
	 */
	void exitPremiere_projection(BParser.Premiere_projectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#deuxieme_projection}.
	 * @param ctx the parse tree
	 */
	void enterDeuxieme_projection(BParser.Deuxieme_projectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#deuxieme_projection}.
	 * @param ctx the parse tree
	 */
	void exitDeuxieme_projection(BParser.Deuxieme_projectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#composition}.
	 * @param ctx the parse tree
	 */
	void enterComposition(BParser.CompositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#composition}.
	 * @param ctx the parse tree
	 */
	void exitComposition(BParser.CompositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#domaine}.
	 * @param ctx the parse tree
	 */
	void enterDomaine(BParser.DomaineContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#domaine}.
	 * @param ctx the parse tree
	 */
	void exitDomaine(BParser.DomaineContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#codomaine}.
	 * @param ctx the parse tree
	 */
	void enterCodomaine(BParser.CodomaineContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#codomaine}.
	 * @param ctx the parse tree
	 */
	void exitCodomaine(BParser.CodomaineContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#image}.
	 * @param ctx the parse tree
	 */
	void enterImage(BParser.ImageContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#image}.
	 * @param ctx the parse tree
	 */
	void exitImage(BParser.ImageContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#restriction_domaine}.
	 * @param ctx the parse tree
	 */
	void enterRestriction_domaine(BParser.Restriction_domaineContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#restriction_domaine}.
	 * @param ctx the parse tree
	 */
	void exitRestriction_domaine(BParser.Restriction_domaineContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#soustraction_domaine}.
	 * @param ctx the parse tree
	 */
	void enterSoustraction_domaine(BParser.Soustraction_domaineContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#soustraction_domaine}.
	 * @param ctx the parse tree
	 */
	void exitSoustraction_domaine(BParser.Soustraction_domaineContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#restriction_codomaine}.
	 * @param ctx the parse tree
	 */
	void enterRestriction_codomaine(BParser.Restriction_codomaineContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#restriction_codomaine}.
	 * @param ctx the parse tree
	 */
	void exitRestriction_codomaine(BParser.Restriction_codomaineContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#soustraction_codomaine}.
	 * @param ctx the parse tree
	 */
	void enterSoustraction_codomaine(BParser.Soustraction_codomaineContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#soustraction_codomaine}.
	 * @param ctx the parse tree
	 */
	void exitSoustraction_codomaine(BParser.Soustraction_codomaineContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#surcharge}.
	 * @param ctx the parse tree
	 */
	void enterSurcharge(BParser.SurchargeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#surcharge}.
	 * @param ctx the parse tree
	 */
	void exitSurcharge(BParser.SurchargeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#fonction_partielle}.
	 * @param ctx the parse tree
	 */
	void enterFonction_partielle(BParser.Fonction_partielleContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#fonction_partielle}.
	 * @param ctx the parse tree
	 */
	void exitFonction_partielle(BParser.Fonction_partielleContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#fonction_totale}.
	 * @param ctx the parse tree
	 */
	void enterFonction_totale(BParser.Fonction_totaleContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#fonction_totale}.
	 * @param ctx the parse tree
	 */
	void exitFonction_totale(BParser.Fonction_totaleContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#injection_partielle}.
	 * @param ctx the parse tree
	 */
	void enterInjection_partielle(BParser.Injection_partielleContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#injection_partielle}.
	 * @param ctx the parse tree
	 */
	void exitInjection_partielle(BParser.Injection_partielleContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#injection_totale}.
	 * @param ctx the parse tree
	 */
	void enterInjection_totale(BParser.Injection_totaleContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#injection_totale}.
	 * @param ctx the parse tree
	 */
	void exitInjection_totale(BParser.Injection_totaleContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#surjection_partielle}.
	 * @param ctx the parse tree
	 */
	void enterSurjection_partielle(BParser.Surjection_partielleContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#surjection_partielle}.
	 * @param ctx the parse tree
	 */
	void exitSurjection_partielle(BParser.Surjection_partielleContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#surjection_totale}.
	 * @param ctx the parse tree
	 */
	void enterSurjection_totale(BParser.Surjection_totaleContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#surjection_totale}.
	 * @param ctx the parse tree
	 */
	void exitSurjection_totale(BParser.Surjection_totaleContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#bijection_totale}.
	 * @param ctx the parse tree
	 */
	void enterBijection_totale(BParser.Bijection_totaleContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#bijection_totale}.
	 * @param ctx the parse tree
	 */
	void exitBijection_totale(BParser.Bijection_totaleContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#lambda_expression}.
	 * @param ctx the parse tree
	 */
	void enterLambda_expression(BParser.Lambda_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#lambda_expression}.
	 * @param ctx the parse tree
	 */
	void exitLambda_expression(BParser.Lambda_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#evaluation_fonction}.
	 * @param ctx the parse tree
	 */
	void enterEvaluation_fonction(BParser.Evaluation_fonctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#evaluation_fonction}.
	 * @param ctx the parse tree
	 */
	void exitEvaluation_fonction(BParser.Evaluation_fonctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#transformee_fonction}.
	 * @param ctx the parse tree
	 */
	void enterTransformee_fonction(BParser.Transformee_fonctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#transformee_fonction}.
	 * @param ctx the parse tree
	 */
	void exitTransformee_fonction(BParser.Transformee_fonctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#transformee_relation}.
	 * @param ctx the parse tree
	 */
	void enterTransformee_relation(BParser.Transformee_relationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#transformee_relation}.
	 * @param ctx the parse tree
	 */
	void exitTransformee_relation(BParser.Transformee_relationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#suites}.
	 * @param ctx the parse tree
	 */
	void enterSuites(BParser.SuitesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#suites}.
	 * @param ctx the parse tree
	 */
	void exitSuites(BParser.SuitesContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#suites_non_vide}.
	 * @param ctx the parse tree
	 */
	void enterSuites_non_vide(BParser.Suites_non_videContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#suites_non_vide}.
	 * @param ctx the parse tree
	 */
	void exitSuites_non_vide(BParser.Suites_non_videContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#suites_injectives}.
	 * @param ctx the parse tree
	 */
	void enterSuites_injectives(BParser.Suites_injectivesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#suites_injectives}.
	 * @param ctx the parse tree
	 */
	void exitSuites_injectives(BParser.Suites_injectivesContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#suites_inj_non_vide}.
	 * @param ctx the parse tree
	 */
	void enterSuites_inj_non_vide(BParser.Suites_inj_non_videContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#suites_inj_non_vide}.
	 * @param ctx the parse tree
	 */
	void exitSuites_inj_non_vide(BParser.Suites_inj_non_videContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#permutations}.
	 * @param ctx the parse tree
	 */
	void enterPermutations(BParser.PermutationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#permutations}.
	 * @param ctx the parse tree
	 */
	void exitPermutations(BParser.PermutationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#suite_vide}.
	 * @param ctx the parse tree
	 */
	void enterSuite_vide(BParser.Suite_videContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#suite_vide}.
	 * @param ctx the parse tree
	 */
	void exitSuite_vide(BParser.Suite_videContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#suite_extension}.
	 * @param ctx the parse tree
	 */
	void enterSuite_extension(BParser.Suite_extensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#suite_extension}.
	 * @param ctx the parse tree
	 */
	void exitSuite_extension(BParser.Suite_extensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#taille_suite}.
	 * @param ctx the parse tree
	 */
	void enterTaille_suite(BParser.Taille_suiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#taille_suite}.
	 * @param ctx the parse tree
	 */
	void exitTaille_suite(BParser.Taille_suiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#premier_element_suite}.
	 * @param ctx the parse tree
	 */
	void enterPremier_element_suite(BParser.Premier_element_suiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#premier_element_suite}.
	 * @param ctx the parse tree
	 */
	void exitPremier_element_suite(BParser.Premier_element_suiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#dernier_element_suite}.
	 * @param ctx the parse tree
	 */
	void enterDernier_element_suite(BParser.Dernier_element_suiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#dernier_element_suite}.
	 * @param ctx the parse tree
	 */
	void exitDernier_element_suite(BParser.Dernier_element_suiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#tete_suite}.
	 * @param ctx the parse tree
	 */
	void enterTete_suite(BParser.Tete_suiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#tete_suite}.
	 * @param ctx the parse tree
	 */
	void exitTete_suite(BParser.Tete_suiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#queue_suite}.
	 * @param ctx the parse tree
	 */
	void enterQueue_suite(BParser.Queue_suiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#queue_suite}.
	 * @param ctx the parse tree
	 */
	void exitQueue_suite(BParser.Queue_suiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#inverse_suite}.
	 * @param ctx the parse tree
	 */
	void enterInverse_suite(BParser.Inverse_suiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#inverse_suite}.
	 * @param ctx the parse tree
	 */
	void exitInverse_suite(BParser.Inverse_suiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#concatenation}.
	 * @param ctx the parse tree
	 */
	void enterConcatenation(BParser.ConcatenationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#concatenation}.
	 * @param ctx the parse tree
	 */
	void exitConcatenation(BParser.ConcatenationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#insertion_tete}.
	 * @param ctx the parse tree
	 */
	void enterInsertion_tete(BParser.Insertion_teteContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#insertion_tete}.
	 * @param ctx the parse tree
	 */
	void exitInsertion_tete(BParser.Insertion_teteContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#insertion_queue}.
	 * @param ctx the parse tree
	 */
	void enterInsertion_queue(BParser.Insertion_queueContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#insertion_queue}.
	 * @param ctx the parse tree
	 */
	void exitInsertion_queue(BParser.Insertion_queueContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#restriction_tete}.
	 * @param ctx the parse tree
	 */
	void enterRestriction_tete(BParser.Restriction_teteContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#restriction_tete}.
	 * @param ctx the parse tree
	 */
	void exitRestriction_tete(BParser.Restriction_teteContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#restriction_queue}.
	 * @param ctx the parse tree
	 */
	void enterRestriction_queue(BParser.Restriction_queueContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#restriction_queue}.
	 * @param ctx the parse tree
	 */
	void exitRestriction_queue(BParser.Restriction_queueContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#concat_generalisee}.
	 * @param ctx the parse tree
	 */
	void enterConcat_generalisee(BParser.Concat_generaliseeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#concat_generalisee}.
	 * @param ctx the parse tree
	 */
	void exitConcat_generalisee(BParser.Concat_generaliseeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#arbres}.
	 * @param ctx the parse tree
	 */
	void enterArbres(BParser.ArbresContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#arbres}.
	 * @param ctx the parse tree
	 */
	void exitArbres(BParser.ArbresContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#arbres_binaires}.
	 * @param ctx the parse tree
	 */
	void enterArbres_binaires(BParser.Arbres_binairesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#arbres_binaires}.
	 * @param ctx the parse tree
	 */
	void exitArbres_binaires(BParser.Arbres_binairesContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#construction_arbre}.
	 * @param ctx the parse tree
	 */
	void enterConstruction_arbre(BParser.Construction_arbreContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#construction_arbre}.
	 * @param ctx the parse tree
	 */
	void exitConstruction_arbre(BParser.Construction_arbreContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#racine_arbre}.
	 * @param ctx the parse tree
	 */
	void enterRacine_arbre(BParser.Racine_arbreContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#racine_arbre}.
	 * @param ctx the parse tree
	 */
	void exitRacine_arbre(BParser.Racine_arbreContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#fils_arbre}.
	 * @param ctx the parse tree
	 */
	void enterFils_arbre(BParser.Fils_arbreContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#fils_arbre}.
	 * @param ctx the parse tree
	 */
	void exitFils_arbre(BParser.Fils_arbreContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#aplatissement_prefixe}.
	 * @param ctx the parse tree
	 */
	void enterAplatissement_prefixe(BParser.Aplatissement_prefixeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#aplatissement_prefixe}.
	 * @param ctx the parse tree
	 */
	void exitAplatissement_prefixe(BParser.Aplatissement_prefixeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#aplatissement_postfixe}.
	 * @param ctx the parse tree
	 */
	void enterAplatissement_postfixe(BParser.Aplatissement_postfixeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#aplatissement_postfixe}.
	 * @param ctx the parse tree
	 */
	void exitAplatissement_postfixe(BParser.Aplatissement_postfixeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#taille_arbre}.
	 * @param ctx the parse tree
	 */
	void enterTaille_arbre(BParser.Taille_arbreContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#taille_arbre}.
	 * @param ctx the parse tree
	 */
	void exitTaille_arbre(BParser.Taille_arbreContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#symetrie_arbre}.
	 * @param ctx the parse tree
	 */
	void enterSymetrie_arbre(BParser.Symetrie_arbreContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#symetrie_arbre}.
	 * @param ctx the parse tree
	 */
	void exitSymetrie_arbre(BParser.Symetrie_arbreContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#rang_noeud}.
	 * @param ctx the parse tree
	 */
	void enterRang_noeud(BParser.Rang_noeudContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#rang_noeud}.
	 * @param ctx the parse tree
	 */
	void exitRang_noeud(BParser.Rang_noeudContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#pere_noeud}.
	 * @param ctx the parse tree
	 */
	void enterPere_noeud(BParser.Pere_noeudContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#pere_noeud}.
	 * @param ctx the parse tree
	 */
	void exitPere_noeud(BParser.Pere_noeudContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#fils_noeud}.
	 * @param ctx the parse tree
	 */
	void enterFils_noeud(BParser.Fils_noeudContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#fils_noeud}.
	 * @param ctx the parse tree
	 */
	void exitFils_noeud(BParser.Fils_noeudContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#sous_arbre_noeud}.
	 * @param ctx the parse tree
	 */
	void enterSous_arbre_noeud(BParser.Sous_arbre_noeudContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#sous_arbre_noeud}.
	 * @param ctx the parse tree
	 */
	void exitSous_arbre_noeud(BParser.Sous_arbre_noeudContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#arite_noeud}.
	 * @param ctx the parse tree
	 */
	void enterArite_noeud(BParser.Arite_noeudContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#arite_noeud}.
	 * @param ctx the parse tree
	 */
	void exitArite_noeud(BParser.Arite_noeudContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#arbre_binaire_en_extension}.
	 * @param ctx the parse tree
	 */
	void enterArbre_binaire_en_extension(BParser.Arbre_binaire_en_extensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#arbre_binaire_en_extension}.
	 * @param ctx the parse tree
	 */
	void exitArbre_binaire_en_extension(BParser.Arbre_binaire_en_extensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#sous_arbre_gauche}.
	 * @param ctx the parse tree
	 */
	void enterSous_arbre_gauche(BParser.Sous_arbre_gaucheContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#sous_arbre_gauche}.
	 * @param ctx the parse tree
	 */
	void exitSous_arbre_gauche(BParser.Sous_arbre_gaucheContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#sous_arbre_droit}.
	 * @param ctx the parse tree
	 */
	void enterSous_arbre_droit(BParser.Sous_arbre_droitContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#sous_arbre_droit}.
	 * @param ctx the parse tree
	 */
	void exitSous_arbre_droit(BParser.Sous_arbre_droitContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#aplatissement_infixe}.
	 * @param ctx the parse tree
	 */
	void enterAplatissement_infixe(BParser.Aplatissement_infixeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#aplatissement_infixe}.
	 * @param ctx the parse tree
	 */
	void exitAplatissement_infixe(BParser.Aplatissement_infixeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#substitution}.
	 * @param ctx the parse tree
	 */
	void enterSubstitution(BParser.SubstitutionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#substitution}.
	 * @param ctx the parse tree
	 */
	void exitSubstitution(BParser.SubstitutionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#substitution_corps_operation}.
	 * @param ctx the parse tree
	 */
	void enterSubstitution_corps_operation(BParser.Substitution_corps_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#substitution_corps_operation}.
	 * @param ctx the parse tree
	 */
	void exitSubstitution_corps_operation(BParser.Substitution_corps_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#substitution_bloc}.
	 * @param ctx the parse tree
	 */
	void enterSubstitution_bloc(BParser.Substitution_blocContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#substitution_bloc}.
	 * @param ctx the parse tree
	 */
	void exitSubstitution_bloc(BParser.Substitution_blocContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#substitution_identite}.
	 * @param ctx the parse tree
	 */
	void enterSubstitution_identite(BParser.Substitution_identiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#substitution_identite}.
	 * @param ctx the parse tree
	 */
	void exitSubstitution_identite(BParser.Substitution_identiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#substitution_devient_egal}.
	 * @param ctx the parse tree
	 */
	void enterSubstitution_devient_egal(BParser.Substitution_devient_egalContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#substitution_devient_egal}.
	 * @param ctx the parse tree
	 */
	void exitSubstitution_devient_egal(BParser.Substitution_devient_egalContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#substitution_precondition}.
	 * @param ctx the parse tree
	 */
	void enterSubstitution_precondition(BParser.Substitution_preconditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#substitution_precondition}.
	 * @param ctx the parse tree
	 */
	void exitSubstitution_precondition(BParser.Substitution_preconditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#substitution_assertion}.
	 * @param ctx the parse tree
	 */
	void enterSubstitution_assertion(BParser.Substitution_assertionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#substitution_assertion}.
	 * @param ctx the parse tree
	 */
	void exitSubstitution_assertion(BParser.Substitution_assertionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#substitution_choix_borne}.
	 * @param ctx the parse tree
	 */
	void enterSubstitution_choix_borne(BParser.Substitution_choix_borneContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#substitution_choix_borne}.
	 * @param ctx the parse tree
	 */
	void exitSubstitution_choix_borne(BParser.Substitution_choix_borneContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#substitution_choix_non_borne}.
	 * @param ctx the parse tree
	 */
	void enterSubstitution_choix_non_borne(BParser.Substitution_choix_non_borneContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#substitution_choix_non_borne}.
	 * @param ctx the parse tree
	 */
	void exitSubstitution_choix_non_borne(BParser.Substitution_choix_non_borneContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#substitution_conditionnelle}.
	 * @param ctx the parse tree
	 */
	void enterSubstitution_conditionnelle(BParser.Substitution_conditionnelleContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#substitution_conditionnelle}.
	 * @param ctx the parse tree
	 */
	void exitSubstitution_conditionnelle(BParser.Substitution_conditionnelleContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#substitution_selection}.
	 * @param ctx the parse tree
	 */
	void enterSubstitution_selection(BParser.Substitution_selectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#substitution_selection}.
	 * @param ctx the parse tree
	 */
	void exitSubstitution_selection(BParser.Substitution_selectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#substitution_cas}.
	 * @param ctx the parse tree
	 */
	void enterSubstitution_cas(BParser.Substitution_casContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#substitution_cas}.
	 * @param ctx the parse tree
	 */
	void exitSubstitution_cas(BParser.Substitution_casContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#substitution_non_borne}.
	 * @param ctx the parse tree
	 */
	void enterSubstitution_non_borne(BParser.Substitution_non_borneContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#substitution_non_borne}.
	 * @param ctx the parse tree
	 */
	void exitSubstitution_non_borne(BParser.Substitution_non_borneContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#substitution_definition_locale}.
	 * @param ctx the parse tree
	 */
	void enterSubstitution_definition_locale(BParser.Substitution_definition_localeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#substitution_definition_locale}.
	 * @param ctx the parse tree
	 */
	void exitSubstitution_definition_locale(BParser.Substitution_definition_localeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#ident_equal_expression}.
	 * @param ctx the parse tree
	 */
	void enterIdent_equal_expression(BParser.Ident_equal_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#ident_equal_expression}.
	 * @param ctx the parse tree
	 */
	void exitIdent_equal_expression(BParser.Ident_equal_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#substitution_let}.
	 * @param ctx the parse tree
	 */
	void enterSubstitution_let(BParser.Substitution_letContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#substitution_let}.
	 * @param ctx the parse tree
	 */
	void exitSubstitution_let(BParser.Substitution_letContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#substitution_devient_elt_de}.
	 * @param ctx the parse tree
	 */
	void enterSubstitution_devient_elt_de(BParser.Substitution_devient_elt_deContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#substitution_devient_elt_de}.
	 * @param ctx the parse tree
	 */
	void exitSubstitution_devient_elt_de(BParser.Substitution_devient_elt_deContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#substitution_devient_tel_que}.
	 * @param ctx the parse tree
	 */
	void enterSubstitution_devient_tel_que(BParser.Substitution_devient_tel_queContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#substitution_devient_tel_que}.
	 * @param ctx the parse tree
	 */
	void exitSubstitution_devient_tel_que(BParser.Substitution_devient_tel_queContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#substitution_variable_locale}.
	 * @param ctx the parse tree
	 */
	void enterSubstitution_variable_locale(BParser.Substitution_variable_localeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#substitution_variable_locale}.
	 * @param ctx the parse tree
	 */
	void exitSubstitution_variable_locale(BParser.Substitution_variable_localeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#substitution_sequence}.
	 * @param ctx the parse tree
	 */
	void enterSubstitution_sequence(BParser.Substitution_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#substitution_sequence}.
	 * @param ctx the parse tree
	 */
	void exitSubstitution_sequence(BParser.Substitution_sequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#substitution_appel_operation}.
	 * @param ctx the parse tree
	 */
	void enterSubstitution_appel_operation(BParser.Substitution_appel_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#substitution_appel_operation}.
	 * @param ctx the parse tree
	 */
	void exitSubstitution_appel_operation(BParser.Substitution_appel_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#substitution_simultanee}.
	 * @param ctx the parse tree
	 */
	void enterSubstitution_simultanee(BParser.Substitution_simultaneeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#substitution_simultanee}.
	 * @param ctx the parse tree
	 */
	void exitSubstitution_simultanee(BParser.Substitution_simultaneeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#liste_ident}.
	 * @param ctx the parse tree
	 */
	void enterListe_ident(BParser.Liste_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#liste_ident}.
	 * @param ctx the parse tree
	 */
	void exitListe_ident(BParser.Liste_identContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#ident_ren}.
	 * @param ctx the parse tree
	 */
	void enterIdent_ren(BParser.Ident_renContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#ident_ren}.
	 * @param ctx the parse tree
	 */
	void exitIdent_ren(BParser.Ident_renContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#typage_donnée_abstraite}.
	 * @param ctx the parse tree
	 */
	void enterTypage_donnée_abstraite(BParser.Typage_donnée_abstraiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#typage_donnée_abstraite}.
	 * @param ctx the parse tree
	 */
	void exitTypage_donnée_abstraite(BParser.Typage_donnée_abstraiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#type_cte_concrete}.
	 * @param ctx the parse tree
	 */
	void enterType_cte_concrete(BParser.Type_cte_concreteContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#type_cte_concrete}.
	 * @param ctx the parse tree
	 */
	void exitType_cte_concrete(BParser.Type_cte_concreteContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#typage_appartenance_donnee_concrete}.
	 * @param ctx the parse tree
	 */
	void enterTypage_appartenance_donnee_concrete(BParser.Typage_appartenance_donnee_concreteContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#typage_appartenance_donnee_concrete}.
	 * @param ctx the parse tree
	 */
	void exitTypage_appartenance_donnee_concrete(BParser.Typage_appartenance_donnee_concreteContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#ident_typage_appartenance_donnee_concrete}.
	 * @param ctx the parse tree
	 */
	void enterIdent_typage_appartenance_donnee_concrete(BParser.Ident_typage_appartenance_donnee_concreteContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#ident_typage_appartenance_donnee_concrete}.
	 * @param ctx the parse tree
	 */
	void exitIdent_typage_appartenance_donnee_concrete(BParser.Ident_typage_appartenance_donnee_concreteContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#typage_egalite_cte_concrete}.
	 * @param ctx the parse tree
	 */
	void enterTypage_egalite_cte_concrete(BParser.Typage_egalite_cte_concreteContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#typage_egalite_cte_concrete}.
	 * @param ctx the parse tree
	 */
	void exitTypage_egalite_cte_concrete(BParser.Typage_egalite_cte_concreteContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#ident_colon_terme}.
	 * @param ctx the parse tree
	 */
	void enterIdent_colon_terme(BParser.Ident_colon_termeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#ident_colon_terme}.
	 * @param ctx the parse tree
	 */
	void exitIdent_colon_terme(BParser.Ident_colon_termeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#ensemble_simple}.
	 * @param ctx the parse tree
	 */
	void enterEnsemble_simple(BParser.Ensemble_simpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#ensemble_simple}.
	 * @param ctx the parse tree
	 */
	void exitEnsemble_simple(BParser.Ensemble_simpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(BParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(BParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link BParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(BParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(BParser.IdentContext ctx);
}