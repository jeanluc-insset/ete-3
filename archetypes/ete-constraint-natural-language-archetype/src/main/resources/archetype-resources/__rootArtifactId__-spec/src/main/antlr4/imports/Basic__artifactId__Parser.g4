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
//                             N A V I G A T I O N                            //
//============================================================================//


operand
    : oppExpression
    | navExpression
    | literal
    | parenthesisExpression
;



parenthesisExpression:
    LPAREN ${artifactId}Expression RPAREN
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
      finalStep ?
;




finalStep :
    oclIsNew | oclIsTypeOf | oclIsKindOf
;


oclIsNew    :   OCL_IS_NEW;
oclIsTypeOf :   OCL_IS_TYPE_OF LPAREN ${artifactId}Expression RPAREN;
oclIsKindOf :   OCL_IS_KIND_OF LPAREN ${artifactId}Expression RPAREN;


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
    : DOT OCL_AS_TYPE LPAREN ${artifactId}Expression RPAREN
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


selfExpression : Self;


variableReference : Identifier;

