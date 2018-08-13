parser grammar SbvrParser;




//============================================================================//
// This grammar merges SBVR structured english and OCL expressions            //
// The rules has designed to make easy to use other natural languages than    //
// english                                                                    //
//============================================================================//


options {
    tokenVocab = SbvrLexer;
}



//============================================================================//
//                           E N T R Y P O I N T S                            //
//============================================================================//


file :
    definition*
    globalConstraint*
    contextualConstraints*
;


definition :
   DEFINITION word+ COLON word+ DOT
;



//============================================================================//
//                            F I L E   R U L E S                             //
//============================================================================//


globalConstraint:
    word+ COLON sbvrExpression DOT
;

contextualConstraints:
     invariants | conditions
;

invariants :
    CONTEXT Identifier
    invariant*
;

invariant :
    INVARIANT word* COLON sbvrExpression
;


conditions :
    CONTEXT Identifier DOUBLE_COLON Identifier
    (precondition | postcondition)+
;

precondition  : PRE word* COLON sbvrExpression;
postcondition : POST word* COLON sbvrExpression;


//============================================================================//


sbvrExpression:
    navExpression
   | sbvrExpression multOperator sbvrExpression
   | sbvrExpression addOperator sbvrExpression
   | sbvrExpression comparator sbvrExpression
   | sbvrExpression equalityOperator sbvrExpression
   | NOT sbvrExpression
   | sbvrExpression AND sbvrExpression
   | sbvrExpression OR sbvrExpression
   | sbvrExpression XOR sbvrExpression
    structuredNaturalLanguage;




multOperator     : MUL | DIV | MOD;
addOperator      : ADD | SUB;
equalityOperator : EQUAL | NOTEQUAL;
comparator       : LE | LT | GE | GT;



//============================================================================//
//                             N A V I G A T I O N                            //
//============================================================================//


operand: literal | navExpression;


navExpression:
//    leftToRightNavigation
    rightToLeftNavigation
;


leftToRightNavigation:
    firstStep (navOperator step)*;


rightToLeftNavigation:
    (step navOperator)* firstStep;



firstStep   : identifier;
step        : identifier;
navOperator : OF;


//============================================================================//
//                                  S B V R                                   //
//============================================================================//


structuredNaturalLanguage :
    modality? sentence
;

modality:
    IT_IS_OBLIGATORY_THAT
    | IT_IS_PROHIBITED_THAT
    | IT_IS_NECESSARY_THAT
    | IT_IS_IMPOSSIBLE_THAT
    | IT_IS_POSSIBLE_THAT
    | IT_IS_PERMITTED_THAT;


sentence:
    (general_concept | verb)+
;

general_concept :
    (determiner)? identifier
;


determiner : quantifier | article;

verb                : identifier;
quantifier          : EACH | SOME | AT_LEAST_ONE | AT_LEAST | AT_MOST_ONE | AT_MOST | EXACTLY_ONE | EXACTLY | MORE_THAN_ONE | NO;

article             : definite_article | indefinite_article;
definite_article    : THE;
indefinite_article  : A;

demonstrative       : THIS | THAT;

possessive          : ITS;


//============================================================================//
//                               L I T E R A L S                              //
//============================================================================//


literal
    : integerLiteral
    | floatingPointLiteral
    | booleanLiteral
    | dateLiteral
    | characterLiteral
    | stringLiteral
    | nullLiteral
;


word: Identifier;


identifier           : Identifier;
integerLiteral       : IntegerLiteral;
floatingPointLiteral : FloatingPointLiteral;
booleanLiteral       : TRUE | FALSE;
dateLiteral          : DateLiteral;
characterLiteral     : CharacterLiteral;
stringLiteral        : StringLiteral;
nullLiteral          : NullLiteral;

