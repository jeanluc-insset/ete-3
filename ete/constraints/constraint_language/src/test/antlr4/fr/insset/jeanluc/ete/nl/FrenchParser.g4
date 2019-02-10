parser grammar FrenchParser;




//============================================================================//
// This grammar is a grammar for french.
// The user can customize this grammar.
// The two rules in the "Navigation" chapter are particularly important :
// - navExpression which can be from right to left, like in french, spanish...
//   or left to right like in OCL or japanese
// - atPreExpression which can be prefixed as in english, japanese...
//   or postfixed like in OCL, french, spanish...
//============================================================================//



options {
    tokenVocab = FrenchLexer;
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
// This grammar is used to parse external files or embedded contraints        //
// So there are two main entry points :                                       //
// - constraintFile                                                           //
// - nlExpression                                                             //
//============================================================================//


constraintFile :
    (operationDefinition | attributeDefinition | contextualConstraints)*
;



nlExpression :
    impliesExpression
    | xorExpression
;



//============================================================================//
//                         E X T E R N A L   F I L E S                        //
//============================================================================//


// A set of constraints within the same context
contextualConstraints :
    (
    class_context (operationDefinition | attributeDefinition | invariant)*
    )
    |
    (
    operationContext condition*
    )
;


class_context :
    BACKGROUND identifier COLON
;

invariant: SUB? {System.out.println("invariant start"); }  INVARIANT {System.out.println("in invariant head"); }  name? COLON {System.out.println("inInvariant body"); }  nlExpression DOT;


operationDefinition :
                        { System.out.println("operation definition");}
    DEFINITION operationName COLON nlExpression DOT
;

operationName :
    { System.out.println("operation name");}
    name
;


attributeDefinition :
    DEFINITION identifier COLON identifier COLON nlExpression DOT
;

operationContext:
     BACKGROUND identifier DOUBLE_COLON identifier COLON
;

condition:  SUB? (PRECONDITION | POSTCONDITION) name? COLON nlExpression DOT;


name :
         { System.out.println("name");}
         ((THE | A)? { System.out.println("a word");} word IS?)* (THE | A)?
         { System.out.println("last word");} word;

list_mark: LIST_MARK;



//============================================================================//
//                     L O G I C A L   O P E R A T I O N S                    //
//============================================================================//



impliesExpression :
    xorExpression IMPLIES xorExpression
    xorExpression IS_EQUIVALENT_TO xorExpression
;


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



operand : navExpression ;



//============================================================================//
//                  C O L L E C T I O N   O P E R A T I O N S                 //
//============================================================================//


includesExpression  : INCLUDES parameterList;      // OCL : ARROW INCLUDES LPAR parameterList RPAR
excludesExpression  : EXCLUDES parameterList;      // OCL : ARROW EXCLUDES LPAR parameterList RPAR
selectExpression    : SELECT parameterList;        // OCL : ARROW SELECT LPAR parameterList RPAR
existsExpression    : EXISTS nlExpression IN nlExpression;


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


selfExpression : THIS identifier;


variableReference : THE identifier;



/* OCL
parameterList:
    (
        ( nlExpression COMMA )* nlExpression
    )
    |
    ()
;
*/

parameterList:
    (
        ( nlExpression (COMMA | preposition )* nlExpression )
    )
    |
    ()
;


preposition: OF | FOR | WITH | BY;


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
word                 : { System.out.println("wwww");} navExpression;
integerLiteral       : IntegerLiteral;
floatingPointLiteral : FloatingPointLiteral;
booleanLiteral       : BooleanLiteral;
dateLiteral          : DateLiteral;
characterLiteral     : CharacterLiteral;
stringLiteral        : StringLiteral;
nullLiteral          : NullLiteral;

