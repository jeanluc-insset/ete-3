parser grammar ${artifactIdI2uc}Parser;




//============================================================================//
// This grammar is a grammar for ${rootArtifactId}.
// The user can customize this grammar.
// The two rules in the "Navigation" chapter are particularly important :
// - navExpression which can be from right to left, like in french, spanish...
//   or left to right like in OCL or japanese
// - atPreExpression which can be prefixed as in english, japanese...
//   or postfixed like in OCL, french, spanish...
//============================================================================//



options {
    tokenVocab = ${artifactIdI2uc}Lexer;
}



//============================================================================//
//                             N A V I G A T I O N                            //
//============================================================================//


// Uncomment the desired rule.
//
// Right to Left is the rule for french, spanish, english using "of" keyword
// We use sentences such that : "the model of the plane of this flight"
// The start of the navigation is the flight, then we navigate to the plane,
// finally to the model.
// In this syntax, the property comes before the owner of the property. So
// the navigation is from the right to the left of the sentence
//
// Left to right is the rule for japanese ("no")
// In this syntax, the owner comes before the property
// So the navigation is from the left to the right of the sentence


navExpression :
    navExpressionRightToLeft
//    |
//    navExpressionLeftToRight
;


atPreExpression : 
//    prefixedAtPreExpression
//    |
    postfixedAtPreExpression
;



//============================================================================//
//                           E N T R Y   P O I N T S                          //
//============================================================================//



constraintFile :
   contextualConstraints*
;


contextualConstraints :
    (
    class_context invariant*
    )
    |
    (
    operation_context condition*
    )
;


class_context :
    BACKGROUND identifier COLON
;

invariant: nlExpression DOT;

operation_context:
     BACKGROUND identifier DOUBLE_COLON identifier COLON
;

condition: nlExpression DOT;

nlExpression :
    impliesExpression
    | xorExpression
;


impliesExpression :
    xorExpression IMPLIES xorExpression
    xorExpression IS_EQUIVALENT_TO xorExpression
;


//============================================================================//
//                     L O G I C A L   O P E R A T I O N S                    //
//============================================================================//


xorExpression :
    (
    orExpression
    XOR
    )*
    orExpression
;


orExpression :
    (
    andExpression
    OR
    )*
    andExpression
;


andExpression :
    (
    notOrNotNotExpression
    AND
    )*
    notOrNotNotExpression
;


notOrNotNotExpression:
    notExpression
    |
    affirmativeExpression
;

// The grammar does not allow "not not xxxx"
notExpression : NOT affirmativeExpression;


//============================================================================//


// In this grammar, comparisons are not associative.
// expressions such that
//      a > b > c
// are forbidden
affirmativeExpression :
    greaterThanExpression
    |
    greaterOrEqualExpression
    |
    lessThanExpression
    |
    lessOrEqualExpression
    |
    compareExpression
;


greaterThanExpression : compareExpression GT compareExpression;
greaterOrEqualExpression : compareExpression GE compareExpression;
lessThanExpression : compareExpression LT compareExpression;
lessOrEqualExpression : compareExpression LE compareExpression;


// In this grammar, = and <> are not associative : one cannot write expressions
// such that
//      a = b = c
compareExpression
    :
    (    
    equalExpression
    | differentExpression
    | addOrSubExpression
    )
;


equalExpression : addOrSubExpression EQUAL addOrSubExpression;


differentExpression : addOrSubExpression NOTEQUAL addOrSubExpression;



//============================================================================//
//                  A R I T H M E T I C   O P E R A T I O N S                 //
//============================================================================//


addOrSubExpression :
     (
         multOrDivExpression
         (
            ADD
          | SUB
         )
     )*
     multOrDivExpression
;


// addExpression : multOrDivExpression ADD;
// subExpression : multOrDivExpression SUB;


multOrDivExpression :
    (
          multExpression
        | divExpression
        | modExpression
    )*
    operand
;

multExpression : operand MUL;
divExpression  : operand DIV;
modExpression  : operand MOD;



operand
    :
        navExpression
;



//============================================================================//
//                             N A V I G A T I O N                            //
//============================================================================//




navExpressionRightToLeft :
    ( step OF )*
    ( step | finalStep )
;


navExpressionLeftToRight
    :
        step
        (
            OF
            step
        )*
        oclIsNew?
    ;



prefixedAtPreExpression:
    (THE | A)? ATPRE identifier 
;

postfixedAtPreExpression:
    (THE | A)? identifier ATPRE
;



currentExpression
    :
   (THE | A)? identifier
;




step:
    currentExpression
    | atPreExpression
;


finalStep :
    identifier oclIsNew
;


oclIsNew    :   IS NEW;


//----------------------------------------------------------------------------//



//============================================================================//
//                                A T O M I C S                               //
//============================================================================//


oppExpression :
    SUB
    operand
;


selfExpression : THIS Identifier;


variableReference : THE Identifier;




parameterList:
    (
        ( nlExpression COMMA )* nlExpression
    )
    |
    ()
;


//----------------------------------------------------------------------------//
//                                   LITERALS                                 //
//----------------------------------------------------------------------------//


literal
    : integerLiteral
    | floatingPointLiteral
    | booleanLiteral
    | dateLiteral
    | characterLiteral
    | stringLiteral
    | nullLiteral
;



identifier           : Identifier;
integerLiteral       : IntegerLiteral;
floatingPointLiteral : FloatingPointLiteral;
booleanLiteral       : BooleanLiteral;
dateLiteral          : DateLiteral;
characterLiteral     : CharacterLiteral;
stringLiteral        : StringLiteral;
nullLiteral          : NullLiteral;

