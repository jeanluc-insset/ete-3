parser grammar CommonParser;


options {
    tokenVocab = CommonLexer;
}


nlExpression            : xorExpression;

xorExpression           : (orExpression XOR)? orExpression;

orExpression            : (andExpression OR)* andExpression;

andExpression           : (equalDiffExpression AND)* equalDiffExpression;

equalDiffExpression     : equalExpression | diffExpression | compareExpression;

equalExpression         : compareExpression EQUAL compareExpression;
diffExpression          : compareExpression DIFFERENT compareExpression;

compareExpression       : gtExpression | geExpression | ltExpression | leExpression | addOrSubExpression;

gtExpression            : addOrSubExpression GT addOrSubExpression;
geExpression            : addOrSubExpression GE addOrSubExpression;
ltExpression            : addOrSubExpression LT addOrSubExpression;
leExpression            : addOrSubExpression LE addOrSubExpression;

addOrSubExpression      : (multOrDivExpression (ADD | SUB))* multOrDivExpression;

multOrDivExpression     : (navExpression (MULT | DIV | MOD))* navExpression;

navExpression           : 
//    leftToRightExpression
    rightToLeftExpression
;


leftToRightExpression   : start (OF step)*;
rightToLeftExpression   : (step OF)* start;


step                    : identifier;
start                   : identifier;


identifier              : Identifier;

