parser grammar NLParser;




//============================================================================//
// This grammar is an abstract grammar for any natural language               //
// Any grammar which imports this one can override any rule to customize it   //
// to its own needs.                                                          //
// By convention, rules with "expression" as suffix are reflected by objects  //
// in the abstract syntax and are visitable by the abstract tree builder      //
// The objects in the abstract syntax must have the "kind" tag value which    //
// gives the template fragment to use in the abstract tree builder            // 
//============================================================================//




//============================================================================//
//                             E N T R Y P O I N T                            //
//============================================================================//


nlExpression :
    xorExpression
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
    : equalExpression
    | differentExpression
    | addOrSubExpression
;


equalExpression : addOrSubExpression EQUAL addOrSubExpression;

differentExpression : addOrSubExpression NOTEQUAL addOrSubExpression;



//============================================================================//
//                  A R I T H M E T I C   O P E R A T I O N S                 //
//============================================================================//


addOrSubExpression :
    multOrDivExpression
    (
        addExpression 
      | subExpression
    )*
;


addExpression : ADD multOrDivExpression;
subExpression : SUB multOrDivExpression;


multOrDivExpression :
    operand
    (
          multExpression
        | divExpression
        | modExpression
    )*
;

multExpression : MUL operand;
divExpression  : DIV operand;
modExpression  : MOD operand;


//============================================================================//
//                             N A V I G A T I O N                            //
//============================================================================//


operand
    : oppExpression
    | navExpression
    | literal
    | parenthesisExpression
;



parenthesisExpression:
    LPAREN nlExpression RPAREN
;




navExpressionRightToLeft
    : 
        (
            step
            OF
        )*
        primitive
        finalStep ?
;



navExpressionLeftToRight
    : 
        primitive
        (
            OF step
        )*
        finalStep
;



step:
    attributeNavExpression
    | atPreExpression
    | asTypeExpression
    | methodNavExpression
    | collectionMethodNavExpression
;


finalStep :
    oclIsNew | oclIsTypeOf | oclIsKindOf
;


oclIsNew    :   IS NEW;
oclIsTypeOf :   IS OF TYPE nlExpression;
oclIsKindOf :   IS OF KIND nlExpression;


primitive
    : selfExpression
    | variableOrMember
    | variableOrMemberAtPre
;




attributeNavExpression
    : identifier
;

atPreExpression
    : (THE | A) INITIAL identifier
;



asTypeExpression
    : AS TYPE nlExpression
;

methodNavExpression
    : functionCall OF
;

collectionMethodNavExpression
    : functionCall OF
;


variableOrMember: THE identifier;

variableOrMemberAtPre: THE INITIAL identifier ;


functionCall :
    identifier LPAREN parameterList RPAREN
;


//----------------------------------------------------------------------------//



variableDeclarationExpression :
    identifier
    (   COLON typeExpression )?
;


typeExpression
    : atomicTypeExpression
    | sequenceTypeExpression
    | bagTypeExpression
    | setTypeExpression
    | orderedSetTypeExpression
;


atomicTypeExpression :
    Identifier
;

sequenceTypeExpression
    : SEQUENCE LPAREN typeExpression RPAREN
;

bagTypeExpression
    : BAG LPAREN typeExpression RPAREN
;

setTypeExpression
    : SET LPAREN typeExpression RPAREN
;

orderedSetTypeExpression
    : ORDERED SET LPAREN typeExpression RPAREN
;


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

