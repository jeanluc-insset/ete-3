parser grammar GelParser;



options {
    tokenVocab = GelLexer;
}



//============================================================================//
// This parser is the basis for OCL parser, UEL parser and MOF-QVTo parser    //
// It handles operator priority.                                              //
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
    notNotExpression
;

notExpression :
    NOT
    orderExpression
;

notNotExpression :
    orderExpression
;

//============================================================================//


// In this grammar, comparisons are not associative. One cannot write
// expressions such that
//      a > b > c
orderExpression :
    (
        compareExpression
        (
            GT
            |
            GE
            |
            LT
            |
            LE
        )
    )?
    compareExpression
;




// In this grammar, = and <> are not associative : one cannot write expressions
// such that
//      a = b = c
compareExpression :
    (
        addOrSubExpression
        (
            EQUAL
            |
            NOTEQUAL
        )
    )?
    addOrSubExpression
;




//============================================================================//
//                  A R I T H M E T I C   O P E R A T I O N S                 //
//============================================================================//


addOrSubExpression :
    (
        multOrDivExpression
        (
            ADD
            |
            SUB
        )
    )*
    multOrDivExpression
;





multOrDivExpression :
    (
        operand
        (
            MUL
            |
            DIV
            |
            MOD
        )
    )*
    
    operand
;



//============================================================================//
//                             N A V I G A T I O N                            //
//============================================================================//


operand :
    oppExpression
    |
    complexNavExpression
    |
    literal
    |
    selfExpression
;


complexNavExpression:
    (
        (
            selfExpression
        )
        (
            DOT
            |
            ARROW
        )
    )?
    (
    stepExpression
        (
        DOT
        |
        ARROW
        )
    )*
    stepExpression
;



stepExpression :
    featureExpression
    (
        filterExpression
    )*
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

featureExpression :
    propertyNavigationExpression
    |
    operationNavigationExpression
;


propertyNavigationExpression:
    identifier
;

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

