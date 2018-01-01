parser grammar GelParser;



options {
    tokenVocab = GelLexer;
}



//============================================================================//
// This parser is the basis for OCL parser, UEL parser and MOF-QVTo parser    //
// It handles operator priority through hierarchical rules.                   //
// Any parser which imports this one can override any rule to customize the   //
// parser to its own needs.                                                   //
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
    orderExpression
;

notExpression : NOT orderExpression;


//============================================================================//


// In this grammar, comparisons are not associative. One cannot write
// expressions such that
//      a > b > c
orderExpression :
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
compareExpression :
    equalExpression
    |
    differentExpression
    |
    addOrSubExpression
;


equalExpression : addOrSubExpression EQUAL addOrSubExpression;


differentExpression : addOrSubExpression NOTEQUAL addOrSubExpression;



//============================================================================//
//                  A R I T H M E T I C   O P E R A T I O N S                 //
//============================================================================//


addOrSubExpression :
    (
        addExpression
        |
        minusExpression
    )+
    |
    multOrDivExpression
;

addExpression : multOrDivExpression ADD multOrDivExpression ;
minusExpression : multOrDivExpression SUB multOrDivExpression ;



multOrDivExpression :
    (
        multExpression
        |
        divExpression
        |
        modExpression
    )+
    |
    operand
;

multExpression : operand MUL operand;
divExpression  : operand DIV operand;
modExpression  : operand MOD operand;


//============================================================================//
//                             N A V I G A T I O N                            //
//============================================================================//


operand :
    oppExpression
    |
    navExpression
    |
    literal
;



navExpression:
    (selfExpression | identifier)
    (
        dotNavExpression
        |
        arrowNavExpression
    )*
;



dotNavExpression:
    DOT
    suffixNavExpression
;

arrowNavExpression:
    ARROW
    suffixNavExpression
;


suffixNavExpression:
    operationNavigationExpression
    |
    propertyNavigationExpression
;


propertyNavigationExpression:
    identifier
    filtersExpression
    atPreExpression
;

filtersExpression:
    filterExpression*
;



atPreExpression:
    AT
;

//----------------------------------------------------------------------------//



filterExpression :
    LBRACK
    lambdaExpression
    RBRACK
;


lambdaExpression :
    (
        variableDeclarationExpression
        (
            COMMA
            variableDeclarationExpression
        )*
        PIPE
    )?
    gelExpression
;



variableDeclarationExpression :
    Identifier
    (
        COLON
        typeExpression
    )?
;


typeExpression :
    atomicTypeExpression
    |
    sequenceTypeExpression
    |
    bagTypeExpression
    |
    setTypeExpression
    |
    orderedSetTypeExpression
;


atomicTypeExpression :
    Identifier
;

sequenceTypeExpression :
    SEQUENCE
    LPAREN
    typeExpression
    RPAREN
;

bagTypeExpression :
    BAG
    LPAREN
    typeExpression
    RPAREN
;

setTypeExpression :
    SET
    LPAREN
    typeExpression
    RPAREN
;

orderedSetTypeExpression :
    ORDERED SET
    LPAREN
    typeExpression
    RPAREN
;


//============================================================================//
//                                A T O M I C S                               //
//============================================================================//



oppExpression :
    SUB
    operand
;



selfExpression       : Self;


variableReference : Identifier;


operationNavigationExpression:
    identifier
    LPAREN
    parameterList
    RPAREN
;


parameterList:
    (
        (
        gelExpression
            COMMA
        )*
        gelExpression
    )
    |
    (
    )
;


//----------------------------------------------------------------------------//
//                                   LITERALS                                 //
//----------------------------------------------------------------------------//

literal :
    integerLiteral
    |
    floatingPointLiteral
    |
    booleanLiteral
    |
    dateLiteral
    |
    characterLiteral
    |
    stringLiteral
    |
    nullLiteral
;



identifier           : Identifier;
integerLiteral       : IntegerLiteral;
floatingPointLiteral : FloatingPointLiteral;
booleanLiteral       : BooleanLiteral;
dateLiteral          : DateLiteral;
characterLiteral     : CharacterLiteral;
stringLiteral        : StringLiteral;
nullLiteral          : NullLiteral;

