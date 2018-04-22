parser grammar GelParser;



options {
    tokenVocab = GelLexer;
}



//============================================================================//
// This grammar is the basis for OCL, UEL, MOF-QVTo and Mof2Text grammars     //
// It handles operator priority through hierarchical rules.                   //
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


gelExpression :
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
    | navExpressionWithFinalStep
    | literal
    | parenthesisExpression
;



parenthesisExpression:
    LPAREN gelExpression RPAREN
;


navExpression
    : 
      ( 
          primitive
      )
      (  attributeNavExpression
      |  atPreExpression
      | asTypeExpression
      | methodNavExpression
      | collectionMethodNavExpression
      )*
;



navExpressionWithFinalStep :
    navExpression
    finalStep
;


finalStep :
    oclIsNew | oclIsTypeOf | oclIsKindOf
;


oclIsNew    :   OCL_IS_NEW;
oclIsTypeOf :   OCL_IS_TYPE_OF LPAREN gelExpression RPAREN;
oclIsKindOf :   OCL_IS_KIND_OF LPAREN gelExpression RPAREN;


primitive
    : selfExpression
    | variableOrMember
    | variableOrMemberAtPre
;




attributeNavExpression
    : DOT identifier
;

atPreExpression
    : ATPRE
;

asTypeExpression
    : DOT OCL_AS_TYPE LPAREN gelExpression RPAREN
;

methodNavExpression
    : DOT functionCall
;

collectionMethodNavExpression
    : ARROW functionCall
;


variableOrMember: identifier;

variableOrMemberAtPre: identifier ATPRE;


functionCall :
    identifier LPAREN parameterList RPAREN
;


//----------------------------------------------------------------------------//



variableDeclarationExpression :
    Identifier
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


selfExpression : Self;


variableReference : Identifier;



parameterList:
    (
        ( gelExpression COMMA )* gelExpression
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

