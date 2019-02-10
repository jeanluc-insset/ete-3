parser grammar BParser;



options {
    tokenVocab = BLexer;
}



//============================================================================//
//
// This B grammar comes from
// http://www.atelierb.eu/wp-content/uploads/sites/3/ressources/manrefb1.8.6.fr.pdf
//
//============================================================================//






//============================================================================//
//                                  A X I O M                                 //
//============================================================================//


composant :
    machine_abstraite
    | raffinement
    | implantation
;


//============================================================================//
//                                C L A U S E S                               //
//============================================================================//


machine_abstraite :
    MACHINE en_tete
    clause_machine_abstraite*
    END
;


clause_machine_abstraite :
    clause_constraints
    | clause_sees
    | clause_includes
    | clause_promotes
    | clause_extends
    | clause_uses
    | clause_sets
    | clause_concrete_constants
    | clause_abstract_constants
    | clause_properties
    | clause_concrete_variables
    | clause_abstract_variables
    | clause_invariant
    | clause_assertions
    | clause_initialisation
    | clause_operations
;


en_tete :
    identifier
    (
        LPAREN
        identifier
        (APOS identifier)*
        RPAREN
    )?;


raffinement :
    REFINEMENT en_tete
    clause_refines
    clause_raffinement*
    END
;


clause_raffinement :
    clause_sees
    | clause_imports
    | clause_promotes
    | clause_extends_B0
    | clause_sets
    | clause_concrete_constants
    | clause_properties
    | clause_values
    | clause_concrete_variables
    | clause_invariant
    | clause_assertions
    | clause_initialisation_B0
    | clause_operations_B0
    | clause_operations_locales
;

implantation:
    IMPLEMENTATION en_tete
    clause_refines
    clause_implantation*
    END
;

clause_implantation:
    clause_sees
    | clause_imports
    | clause_promotes
    | clause_extends_B0
    | clause_sets
    | clause_concrete_constants
    | clause_properties
    | clause_values
    | clause_concrete_variables
    | clause_invariant
    | clause_assertions
    | clause_initialisation_B0
    | clause_operations_B0
    | clause_operations_locales
;

clause_constraints :
    CONSTRAINT predicat
;

clause_refines :
    REFINES identifier
;

clause_imports :
    IMPORTS
    (
        ident_ren
        (
            LPAREN
            instanciation_B0
            (APOS instanciation_B0)*
            RPAREN
        )?
    )+ APOS
;

instanciation_B0 :
    terme
    ensemble_entier_B0
    BOOL
    intervalle_B0
;

clause_sees :
    SEES ident_ren+
;

clause_includes :
    INCLUDES
    (
        ident_ren 
        (
            LPAREN
            instanciation
            (APOS instanciation)*
            RPAREN
        )?
    )+ APOS
;

instanciation :
    terme
    ensemble_entier
    BOOL
    intervalle
;

clause_promotes :
    PROMOTES ident_ren (APOS ident_ren)*
;

clause_extends :
    EXTENDS
    ident_ren_instanciation
    (
        COMMA
        ident_ren_instanciation
    )*
;

ident_ren_instanciation:
    ident_ren
    (
        LPAREN
        instanciation
        (COMMA instanciation)*
        RPAREN
    )?
;

clause_extends_B0 :
    EXTENDS
    ident_ren_instanciation_B0
    (
        COMMA
        ident_ren_instanciation_B0
    )*
;

ident_ren_instanciation_B0:
    ident_ren
    (
        LPAREN
        instanciation_B0
        (COMMA instanciation_B0)*
        RPAREN
    )?
;

clause_extends_BO :
    EXTENDS
    (
        ident_ren
        (
            LPAREN
            instanciation_B0
            (
            instanciation_B0
            APOS
            )*
            RPAREN
        )?
    )+
    APOS
;

clause_uses :
    USES ident_ren (APOS ident_ren)*
;

clause_sets :
    SETS ensemble (APOS ensemble)*
;

/*      // custom definition later
ensemble:
    ident
    |
    (
        ident EQUAL LCURLY ident (APOS ident)* RCURLY
    )
;
*/

clause_concrete_constants :
    (
        CONCRETE CONSTANTS ident (APOS ident)*
    )
    |
    (
        CONSTANTS ident (APOS ident)*
    )
;

clause_abstract_constants:
    ABSTRACT CONSTANTS ident (COMMA ident)*
;

// NO APOS ???
clause_properties :
    PROPERTIES predicat
;

clause_values :
    VALUES valuation (APOS valuation)*
;


valuation :
    ( ident EQUAL terme)
    | (ident EQUAL expr_tableau)
    | (ident EQUAL intervalle_B0)
;

clause_concrete_variables:
    CONCRETE VARIABLES ident_ren (APOS ident_ren)*
;

clause_abstract_variables:
    ( ABSTRACT VARIABLES ident_ren (APOS ident_ren)*)
    | (VARIABLES ident_ren (APOS ident_ren)*)
;


clause_invariant:
    INVARIANT predicat
;

// SEMI-COLON ?
clause_assertions:
    ASSERTIONS predicat (APOS predicat)*
;

clause_initialisation :
    INITIALISATION substitution
;

clause_initialisation_B0 :
    INITIALISATION instruction
;

// SEMI-COLON
clause_operations :
    OPERATIONS operation (APOS operation)*
;

operation :
    en_tete_operation EQUAL substitution_corps_operation
;

en_tete_operation :
    (
        ident (APOS ident)* LEFT_ARROW
    )?
    ident_ren
    (
        LPAREN
        ident (APOS ident)*
        RPAREN
    )?
;

// SEMI-COLON ?
clause_operations_B0:
    OPERATIONS operations_B0 (APOS operations_B0)*
;

operations_B0:
    en_tete_operation EQUAL instruction_corps_operation
;

clause_operations_locales:
    LOCAL_OPERATIONS operation (APOS operation)*
;



//============================================================================//
//                                 T E R M E S                                //
//                                     E T                                    //
//                R E G R O U P E M E N T S   D ' E X P R E S S I O N S       //
//============================================================================//

terme :
    terme_simple
    | expression_arithmetique
    | terme_record
    | (terme_record (APOS ident)+)
;

terme_simple:
    ident_ren
    | entier_lit
    | booleen_lit
    | ( BOOL LPAREN condition RPAREN)
    | (ident_ren (APOS ident)+)
;

entier_lit:
    Entier_literal
    | MAXINT
    | MININT
;

booleen_lit:
    FALSE
    | TRUE
;

// These rules are added to avoid left recursive rules
expression_arithmetique:
    (expression_mult (PLUS | MINUS))* expression_mult
;



expression_mult:
    (expression_exp (MULT | DIV | MOD))* expression_exp
;

expression_exp:
    (expression_atomique EXP)* expression_atomique
;



expression_atomique:
    entier_lit
    | ident_ren
    | (ident_ren LPAREN terme (APOS terme)* RPAREN)
    | (ident_ren (APOS ident)+)
    | (MINUS expression_arithmetique)
    | (SUCC LPAREN expression_arithmetique RPAREN)
    | (PRED LPAREN expression_arithmetique RPAREN)
    | (LPAREN expression_arithmetique RPAREN)
;

terme_record :
    REC LPAREN
    (
        (ident COLON)?
        (terme
        |
        expr_tableau
        )
    )+ APOS
    RPAREN
;

expr_tableau:
    ident
    | (LCURLY (terme_simple RIGHT_ARROW )
    | (ensemble_simple (X ensemble_simple)* X LCURLY terme RCURLY))
;

intervalle_B0:
    ( expression_arithmetique DOUBLE_POINT expression_arithmetique)
    | ensemble_entier_B0
;

ensemble_entier_B0:
    NAT
    | NAT1
    | INT
;


//============================================================================//
//                             C O N D I T I O N S                            //
//============================================================================//


// The rule was only "condition :"
// The rules condition_et, condition_ou, condition_non are introduced to avoid
// left recursive rules and to carry the priority of operators
condition :
    (condition_et OR) condition_et
;

condition_et :
    (condition_atomique AND) condition_atomique
;

condition_atomique:
    (terme_simple EQUAL terme_simple)
    | (terme_simple DIFFERENT terme_simple)
    | (terme_simple LESS_THAN terme_simple)
    | (terme_simple LESS_OR_EQUAL terme_simple)
    | (terme_simple GREATER_THAN terme_simple)
    | (terme_simple GREATER_OR_EQUAL terme_simple)
    | (NOT LPAREN condition RPAREN)
    | (LPAREN condition RPAREN)
;


//============================================================================//
//                           I N S T R U C T I O N S                          //
//============================================================================//

// this rule is added to avoid left recursive rule
instruction :
    (instruction_corps_operation COLON)* instruction_corps_operation
;



instruction_corps_operation:
    instruction_bloc
    | instruction_variable_locale
    | substitution_identite
    | instruction_devient_egal
    | instruction_appel_operation
    | instruction_conditionnelle
    | instruction_cas
    | instruction_assertion
    | substitution_tant_que
;

instruction_bloc:
    BEGIN instruction END
;

instruction_variable_locale:
    VAR ident (COMMA ident)* IN instruction END
;

instruction_devient_egal:
    (ident_ren (LPAREN terme (COMMA terme)* RPAREN)? AFFECTATION terme)
    | (ident_ren AFFECTATION expr_tableau)
    | (ident_ren (COMMA ident)+ AFFECTATION terme)
;

instruction_appel_operation :
    (ident_ren (COMMA ident_ren)* LEFT_ARROW)? ident_ren (LPAREN terme_or_chaine_lit (COMMA terme_or_chaine_lit)+ RPAREN)?
;

terme_or_chaine_lit:
    terme
    | chaine_lit
;

instruction_sequence:
    instruction SEMI_COLON instruction
;

instruction_conditionnelle:
    IF condition THEN instruction
    (ELSEIF condition THEN instruction)*
    (ELSE instruction)?
    END
;

instruction_cas:
    CASE terme_simple OF
    EITHER terme_simple THEN instruction
    (OR terme_simple (COMMA terme_simple)* THEN instruction)*
    (ELSE instruction)?
    END
    END
;

substitution_tant_que:
    WHILE condition DO instruction
    INVARIANT predicat
    VARIANT expression
    END
;

instruction_assertion:
    ASSERT condition THEN instruction END
;


//============================================================================//
//                              P R E D I C A T S                             //
//============================================================================//


// The original rule is 'predicat' with all alternatives.
// The rules predicat predicat_conjonction, predicat_disjonction, have been
// modified to avoid left recursivity
predicat :
    predicat_implication_equivalence
;

predicat_implication_equivalence :
    predicat_disjonction
    |
    predicat_implication
    |
    predicat_equivalence
;


predicat_implication:
    predicat_disjonction IMPLIES predicat_disjonction
;

predicat_equivalence:
    predicat_disjonction EQUIVALENCE predicat_disjonction
;

predicat_disjonction:
    (predicat_et OR)* predicat_et
;

predicat_et:
    (predicat_egalite_inegalite AND)* predicat_egalite_inegalite
;

predicat_egalite_inegalite:
    predicat_atomique
    |
    predicat_egalite
    |
    predicat_inegalite
;

predicat_egalite:
    predicat_atomique EQUAL predicat_atomique
;

predicat_inegalite:
    predicat_atomique DIFFERENT predicat_atomique
;

predicat_atomique:
    predicat_parenthese
    | predicat_negation
    | predicat_universel
    | predicat_existentiel
    | predicat_appartenance
    | predicat_non_appartenance
    | predicat_inclusion
    | predicat_inclusion_stricte
    | predicat_non_inclusion
    | predicat_non_inclusion_stricte
    | predicat_inferieur_ou_egal
    | predicat_strictement_inferieur
    | predicat_superieur_ou_egal
    | predicat_strictement_superieur
;

predicat_parenthese:
    LPAREN predicat RPAREN
;

// These rules are slightly modified
predicat_conjonction:
    (predicat_atomique AND)* predicat
;

predicat_negation:
    NOT LPAREN predicat RPAREN
;

predicat_universel:
    QUEL_QUE_SOIT liste_ident DOT  LPAREN predicat IMPLIES predicat RPAREN
;

predicat_existentiel:
    IL_EXISTE liste_ident DOT LPAREN predicat RPAREN
;

predicat_appartenance:
    expression BELONGS_TO expression
;

predicat_non_appartenance:
    expression DOES_NOT_BELONG_TO expression
;

predicat_inclusion:
    expression IS_INCLUDED_IN expression
;

predicat_inclusion_stricte:
    expression IS_STRICTLY_INCLUDED_IN expression
;

predicat_non_inclusion:
    expression IS_NOT_INCLUDED_IN expression
;

predicat_non_inclusion_stricte:
    expression IS_STRICTLY_NON_INCLUDED_IN expression
;

predicat_inferieur_ou_egal:
    expression LESS_OR_EQUAL expression
;

predicat_strictement_inferieur:
    expression LESS_THAN expression
;

predicat_superieur_ou_egal:
    expression GREATER_OR_EQUAL expression
;

predicat_strictement_superieur:
    expression GREATER expression
;


//============================================================================//
//                            E X P R E S S I O N S                           //
//============================================================================//

expression:
    expression_primaire
    | expression_booleenne
    | expression_arithmetique
    | expression_de_couples
    | expression_d_ensembles
    | construction_d_ensembles
/*
    | expression_de_records
    | expression_de_relations
    | expression_de_fonctions
    | construction_de_fonctions
    | expression_de_suites
    | construction_de_suites
    | expression_d_arbres
*/
;

expression_primaire:
    donnee
    | expr_parenthesee
    | chaine_lit
;

expression_booleenne:
    booleen_lit
    | conversion_bool
;

expression_de_couples:
    couple
;

expression_d_ensembles:
    ensemble_vide
    | ensemble_entier
    | ensemble_booleen
    | ensemble_chaines
;

construction_d_ensembles:
    produit
    | ens_comprehension
    | sous_ensembles
    | sous_ensembles_finis
    | ens_extension
    | intervalle
/*    | difference    */
    | union
    | intersection
    | union_generalisee
    | intersection_generalisee
    | union_quantifiee
    | intersection_quantifiee
;

expression_de_records:
    ensemble_records
    | record_en_extension
    | champ_de_record
;

expression_de_relations:
    ensemble_relations
    | identite
    | inverse
    | premiere_projection
    | deuxieme_projection
    | composition
    | produit_direct
    | produit_parallele
    | iteration
    | fermeture_reflexive
    | fermeture
    | domaine
    | codomaine
    | image
    | restriction_domaine
    | restriction_codomaine
    | soustraction_codomaine
    | surcharge
;

expression_de_fonctions:
    fonction_partielle
    | fonction_totale
    | injection_partielle
    | injection_totale
    | surjection_partielle
    | surjection_totale
    | bijection_totale
;

construction_de_fonctions:
    lambda_expression
    | evaluation_fonction
    | transformee_fonction
    | transformee_relation
;

expression_de_suites:
    suites
    | suites_non_vide
    | suites_injectives
    | suites_inj_non_vide
    | permutations
    | suite_vide
    | suite_extension
;

construction_de_suites:
    taille_suite
    | premier_element_suite
    | dernier_element_suite
    | tete_suite
    | queue_suite
    | inverse_suite
    | concatenation
    | insertion_tete
    | insertion_queue
    | restriction_tete
    | restriction_queue
    | concat_generalisee
;

expression_d_arbres:
    arbres
    | arbres_binaires
    | construction_arbre
    | racine_arbre
    | fils_arbre
    | aplatissement_prefixe
    | aplatissement_postfixe
    | taille_arbre
    | symetrie_arbre
    | rang_noeud
    | pere_noeud
    | fils_noeud
    | sous_arbre_noeud
    | arite_noeud
;

donnee :
    ident_ren
    | (ident_ren DOLLAR_ZERO)
;

expr_parenthesee:
    LPAREN expression RPAREN
;

chaine_lit : CHAINE_DE_CARACTERES;


conversion_bool:
    BOOL LPAREN predicat RPAREN
;

/*
expression:
    (addition_difference)*
    produit_division
;

addition_difference:
    | addition
    | difference
;

addition            : produit_division PLUS;
difference          : produit_division MINUS;

produit_division :
    
;
*/

// Expressions numériques

moins_unaire        : MINUS expression;
produit             : expression_atomique X expression_atomique;
division            : expression_atomique DIV expression_atomique;
puissance           : expression_atomique POWER expression_atomique;
successeur          : SUCC (LPAREN expression RPAREN)?;
predecesseur        : PRED (LPAREN expression RPAREN)?;
maximum             : MAX LPAREN expression RPAREN;
minimum             : MIN LPAREN expression RPAREN;
cardinal            : CARD LPAREN expression RPAREN;
somme_generalisee   : SIGMA liste_ident DOT  LPAREN predicat PIPE expression RPAREN;
produit_generalise  : PI liste_ident DOT LPAREN predicat PIPE expression RPAREN;

// Element expressions
couple              : (expression_atomique RIGHT_ARROW expression_atomique)
                        | (expression_atomique COMMA expression_atomique);
champ_de_record     : expression COMMA ident;
ensemble_relations  : expression DOUBLE_ARROW expression;


// Set expressions
ensemble:
    union
;

union :
    (intersection UNION)* intersection
;

intersection:
    (produit_ensembles INTER)* produit_ensembles
;

produit_ensembles:
    produit_direct
    | produit_parallele
;

produit_direct      : ensemble_atomique DIRECT_PRODUCT ensemble_atomique;
produit_parallele   : ensemble_atomique DOUBLE_PIPE ensemble_atomique;

iteration           : ensemble_atomique POWER expression_arithmetique;
fermeture_reflexive : ensemble_atomique STAR;
fermeture           : ensemble_atomique PLUS;

ensemble_atomique:
    ensemble_literal
    | ens_comprehension
/*
    | sous_ensembles
    | ens_extension
    | intervalle
    | union_generalisee
    | intersection_generalisee
    | union_quantifiee
    | intersection_quantifiee
    | ensemble_records
    | def_record
    | record_en_extension
    | def_record2
    | identite
    | inverse
    | premiere_projection
    | deuxieme_projection
    | composition
    | domaine
    | codomaine
    | image
    | restriction_domaine
    | restriction_codomaine
*/
;

ensemble_literal    :
    ensemble_vide
    | ensemble_entier
    | ensemble_booleen
    | ensemble_chaines
;

ensemble_vide       : EMPTY_SET;
ensemble_entier     : Z | N | N1 | NAT | NAT1 | INT;
ensemble_booleen    : BOOL;
ensemble_chaines    : STRING;

ens_comprehension   : RCURLY ident (COMMA ident)* PIPE predicat RCURLY;
sous_ensembles      : (P LPAREN expression RPAREN)
                        | (P1 LPAREN expression RPAREN);
sous_ensembles_finis: (F LPAREN expression RPAREN)
                        | (F1 LPAREN expression RPAREN);
ens_extension       : LCURLY expression (COMMA expression)* RCURLY;
intervalle          : expression_atomique DOUBLE_POINT expression_atomique;
union_generalisee   : UNION LPAREN expression RPAREN;
intersection_generalisee: INTER LPAREN expression RPAREN;
union_quantifiee    : UNION liste_ident DOT LPAREN predicat PIPE expression RPAREN;
intersection_quantifiee : INTER liste_ident DOT LPAREN predicat PIPE expression RPAREN;
ensemble_records    : STRUCT LPAREN def_record (COMMA def_record)* RPAREN;
def_record          : ident COLON expression;
record_en_extension : REC LPAREN def_record2 (COMMA def_record2)* RPAREN;
def_record2         : (ident COLON)? expression;
identite            : ID LPAREN expression RPAREN;
inverse             : expression MINUS_ONE;
premiere_projection : PRJ1 LPAREN expression COMMA expression RPAREN;
deuxieme_projection : PRJ2 LPAREN expression COMMA expression RPAREN;
composition         : expression_atomique SEMI_COLON expression;
domaine             : DOM LPAREN expression RPAREN;
codomaine           : RAN LPAREN expression RPAREN;
image               : expression LBRACK expression RBRACK;
restriction_domaine : expression DOMAIN_RESTRICTION expression;
soustraction_domaine: expression DOMAIN_SUBSTRACTION expression;
restriction_codomaine : expression CODOMAIN_RESTRICTION expression;
soustraction_codomaine  : expression CODOMAIN_SUBSTRACTION expression;
surcharge           : expression OVERLOAD expression;
fonction_partielle  : expression PARTIAL_FUNCTION expression;
fonction_totale     : expression RIGHT_ARROW expression;
injection_partielle : expression PARTIAL_INJECTION expression;
injection_totale    : expression TOTAL_INJECTION expression;
surjection_partielle: expression PARTIAL_SURJECTION expression;
surjection_totale   : expression TOTAL_SURJECTION expression;
bijection_totale    : expression TOTAL_BIJECTION expression;
lambda_expression   : LAMBDA liste_ident DOT LPAREN predicat PIPE expression RPAREN;
evaluation_fonction : expression LPAREN expression RPAREN;
transformee_fonction: FNC LPAREN expression RPAREN;
transformee_relation: REL LPAREN expression RPAREN;
suites              : SEQ LPAREN expression RPAREN;
suites_non_vide     : SEQ1 LPAREN expression RPAREN;
suites_injectives   : ISEQ LPAREN expression RPAREN;
suites_inj_non_vide : ISEQ1 LPAREN expression RPAREN;
permutations        : PERM LPAREN expression RPAREN;
suite_vide          : LBRACK RBRACK;
suite_extension     : LBRACK expression (COMMA expression)* RBRACK;
taille_suite        : SIZE LPAREN expression RPAREN;
premier_element_suite   : FIRST LPAREN expression RPAREN;
dernier_element_suite   : LAST LPAREN expression RPAREN;
tete_suite          : FRONT LPAREN expression RPAREN;
queue_suite         : TAIL LPAREN expression RPAREN;
inverse_suite       : REV LPAREN expression RPAREN;
concatenation       : expression CONCAT expression;
insertion_tete      : expression RIGHT_ARROW expression;
insertion_queue     : expression LEFT_ARROW expression;
restriction_tete    : expression UP_ARROW expression;
restriction_queue   : expression DOWN_ARROW expression;
concat_generalisee  : CONC LPAREN expression RPAREN;
arbres              : TREE LPAREN expression RPAREN;
arbres_binaires     : BTREE LPAREN expression RPAREN;
construction_arbre  : CONST LPAREN expression COMMA expression RPAREN;
racine_arbre        : TOP LPAREN expression RPAREN;
fils_arbre          : SONS LPAREN expression RPAREN;
aplatissement_prefixe  : PREFIX LPAREN expression RPAREN;
aplatissement_postfixe : POSTFIX LPAREN expression RPAREN;
taille_arbre        : SIZET LPAREN expression RPAREN;
symetrie_arbre      : MIRROR LPAREN expression RPAREN;
rang_noeud          : RANK LPAREN expression COMMA expression RPAREN;
pere_noeud          : FATHER LPAREN expression RPAREN;
fils_noeud          : SON LPAREN expression RPAREN;
sous_arbre_noeud    : SUBTREE LPAREN expression COMMA expression RPAREN;
arite_noeud         : ARITY LPAREN expression COMMA expression RPAREN;
arbre_binaire_en_extension  : BIN LPAREN expression (COMMA expression COMMA expression)? RPAREN;
sous_arbre_gauche   : LEFT LPAREN expression RPAREN;
sous_arbre_droit    : RIGHT LPAREN expression RPAREN;
aplatissement_infixe   : INFIX LPAREN expression RPAREN;



//============================================================================//
//                          S U B S T I T U T I O N S                         //
//============================================================================//


substitution:
    substitution_bloc
/*
    | substitution_identite
    | substitution_devient_egal
    | substitution_precondition
    | substitution_assertion
    | substitution_choix_borne
    | substitution_conditionnelle
    | substitution_selection
    | substitution_cas
    | substitution_choix_non_borne
    | substitution_definition_locale
    | substitution_devient_elt_de
    | substitution_devient_tel_que
    | substitution_variable_locale
    | substitution_sequence
    | substitution_appel_operation
    | substitution_simultanee
    | substitution_tant_que
*/
    ;

substitution_corps_operation :
    substitution_bloc
    | substitution_identite
    | substitution_devient_egal
    | substitution_precondition
    | substitution_assertion
    | substitution_choix_borne
    | substitution_conditionnelle
    | substitution_selection
    | substitution_cas
    | substitution_choix_non_borne
//      This branch is in the grammar but the rule seems to be defined as
//      substitution_definition_locale which in turn seems to be referred as
//      substituion_variable_locale
//    | substitution_let
    | substitution_devient_elt_de
    | substitution_devient_tel_que
    | substitution_variable_locale
    | substitution_appel_operation
;

substitution_bloc       : BEGIN substitution END;
substitution_identite   : SKIP;
substitution_devient_egal : 
    (ident_ren (COMMA ident_ren)* ASSIGNATION expression)
    | (ident_ren LPAREN expression (COMMA expression)* RPAREN ASSIGNATION expression)
    | (ident_ren (COMMA ident)+ ASSIGNATION expression)
;

substitution_precondition :
    PRE predicat THEN substitution END
;

substitution_assertion :
    ASSERT predicat THEN substitution END
;

substitution_choix_borne:
    CHOICE substitution (OR substitution)* END
;

substitution_choix_non_borne:
    ANY ident (COMMA ident)+ WHERE predicat THEN substitution END
;

substitution_conditionnelle:
    IF predicat THEN substitution
    (ELSEIF predicat THEN substitution)*
    (ELSE substitution)?
    END
;

substitution_selection :
    SELECT predicat THEN substitution
    (WHEN predicat THEN substitution)*
    (ELSE substitution)?
    END
;

substitution_cas:
    CASE expression OF
    EITHER terme_simple (COMMA terme_simple)* THEN substitution
    (OR terme_simple (COMMA terme_simple)* THEN substitution)*
    (ELSE substitution)?
    END
    END
;


substitution_non_borne:
    ANY ident (COMMA ident)*
    WHERE predicat THEN substitution
    END
;

substitution_definition_locale:
    LET ident (COMMA ident)* BE
    ident_equal_expression
    (AND ident_equal_expression)*
    IN substitution
    END
;

ident_equal_expression : ident EQUAL expression;

substitution_let:
;

substitution_devient_elt_de:
    ident_ren (COMMA ident_ren)*
    COLON_BELONGS_TO expression
;

substitution_devient_tel_que:
    ident_ren (COMMA ident_ren)*
    COLON LPAREN predicat RPAREN
;

substitution_variable_locale:
    VAR ident  (COMMA ident)* IN substitution
    END
;

substitution_sequence:
    substitution COLON substitution
;

substitution_appel_operation:
    (
        ident_ren (COMMA ident_ren)* LEFT_ARROW
    )?
    ident_ren
    (
        LPAREN expression (COMMA expression)* RPAREN
    )?
;

substitution_simultanee:
    substitution DOUBLE_PIPE substitution
;


//============================================================================//
//                            U T I L I T A I R E S                           //
//============================================================================//


liste_ident :
    ident
    | (LPAREN ident (COMMA ident)* RPAREN)
;

ident_ren :
    ident (DOT ident)*
;


//============================================================================//
//                                 T Y P A G E                                //
//============================================================================//


typage_donnée_abstraite :
    (ident (COMMA ident)* BELONGS_TO expression (X expression)*)
    | (ident IS_INCLUDED expression)
    | (ident IS_STRICTLY_INCLUDED expression)
    | (ident (COMMA ident)* EQUAL expression (COMMA expression)*)
;

type_cte_concrete:
    (ident (COMMA ident)* BELONGS_TO typage_appartenance_donnee_concrete (X typage_appartenance_donnee_concrete)*)
    | (ident EQUAL typage_egalite_cte_concrete)
    | (ident INCLUDED ensemble_simple)
    | (ident STRICTLY_INCLUDED ensemble_simple)
;

typage_appartenance_donnee_concrete:
    ensemble_simple
    | (ensemble_simple (X ensemble_simple)* RIGHT_ARROW ensemble_simple)
    | (ensemble_simple (X ensemble_simple)* SPECIAL_RIGHT_ARROW ensemble_simple)
    | (ensemble_simple (X ensemble_simple)* DOUBLE_RIGHT_ARROW ensemble_simple)
    | (ensemble_simple (X ensemble_simple)* SPECIAL_DOUBLE_RIGHT_ARROW ensemble_simple)
    | (LCURLY terme_simple (COMMA terme_simple)* RCURLY)
    | (STRUCT LPAREN ident_typage_appartenance_donnee_concrete (COMMA ident_typage_appartenance_donnee_concrete)* RPAREN)
;

ident_typage_appartenance_donnee_concrete:
    ident COLON typage_appartenance_donnee_concrete
;

typage_egalite_cte_concrete:
    terme
    | expr_tableau
    | intervalle
    | ensemble_entier_B0
    | (REC LPAREN ident_colon_terme (COMMA ident_colon_terme)* RPAREN)
;

ident_colon_terme:
    (ident COLON)? terme
;

ensemble_simple:
    ensemble_entier_B0
    | BOOL
    | intervalle_B0
    | ident
;

/*
ensemble_simple_B0:
    NAT | NAT1 | INT
;
*/



identifier:
    IDENTIFIER
;

ident:
    IDENTIFIER
;



