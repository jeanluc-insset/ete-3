parser grammar ${artifactIdI2uc}Parser;


import NLParser;




//============================================================================//
// This grammar is an abstract grammar for any ${rootArtifactId}.             //
// A grammar which imports this one can override any rule to customize it to  //
// its own needs.                                                             //
// By convention, rules with "expression" as suffix are reflected by objects  //
// in the abstract syntax and are visitable by the abstract tree builder      //
// The objects in the abstract syntax must have the "kind" tag value which    //
// gives the template fragment to use in the abstract tree builder            // 
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
;


/*
navExpression :
    navExpressionLeftToRight
;
*/




attributeNavExpression:
    identifier
;




//============================================================================//
//                             E N T R Y P O I N T                            //
//============================================================================//


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


// In this grammar, comparisons are not associative. One cannot write
// expressions such that
//      a > b > c
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
    {
        System.out.println("compare expression");
    }
    (    
    equalExpression
    | differentExpression
    | addOrSubExpression
    )
;


equalExpression :
                        {
        System.out.println("equal expression");
    }

                    addOrSubExpression EQUAL addOrSubExpression;


differentExpression : addOrSubExpression NOTEQUAL addOrSubExpression;



//============================================================================//
//                  A R I T H M E T I C   O P E R A T I O N S                 //
//============================================================================//


addOrSubExpression :
     (
         addExpression
         |
         subExpression
     )*
     multOrDivExpression
;


addExpression : multOrDivExpression ADD;
subExpression : multOrDivExpression SUB;


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
        {
            System.out.println("operand");
        }
        navExpression
;



//============================================================================//
//                             N A V I G A T I O N                            //
//============================================================================//




navExpressionRightToLeft
    : 
        {
            System.out.println("Right to left");
        }
        (
            {
                System.out.println("Step in right to left");
            }
            step
            OF
        )*
        {
            System.out.println("Before primitive in right to left");
        }
        (
            step
            | finalStep
        )
;



//============================================================================//
//                             N A V I G A T I O N                            //
//============================================================================//



atPreExpression : (THE | A)? INITIAL identifier 
;

currentExpression
    :
    {
        System.out.println("current expression");
    }
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

