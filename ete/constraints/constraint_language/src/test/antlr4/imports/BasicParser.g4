parser grammar BasicParser;


options {
     tokenVocab = BasicLexer;
}



file       : (definition | businessRule)+ ;


//============================================================================//


definition              : definitionKeyword definitionHead definitionSeparator gelExpression definitionEnd;
definitionKeyword       : DEFINITION;
definitionHead          : definitionMark? definitionSignature;
definitionSignature     : word+;
definitionSeparator     : COLON;
definitionMark          : MINUS;
definitionEnd           : DOT;

businessRule            : RULE sentence COLON gelExpression DOT;
ruleKeyword             : RULE;

sentence                : word+;


nounGroup               : determiner? word;
modelTermGroup          : determiner? modelTerm;
modelTerm               : NO_MODEL_TERM;
keyword                 : NO_KEYWORD;
other                   : NO_OTHER;

determiner              : NO_DETERMINER;

//============================================================================//


gelExpression           : xorExpression;

xorExpression           : (orExpression xorOperator)? orExpression;
xorOperator             : XOR;

orExpression            : (andExpression orOperator)* andExpression;
orOperator              : OR;

andExpression           : (impliesExpression andOperator)* impliesExpression;
andOperator             : AND;

impliesExpression       : (equalOrDiffExpression impliesOperator)? equalOrDiffExpression;
impliesOperator         : DOUBLE_ARROW;

equalOrDiffExpression   : equalExpression | diffExpression | compareExpression;
equalExpression         : compareExpression equalOperator compareExpression;
equalOperator           : EQUAL;
diffExpression          : compareExpression diffOperator compareExpression;
diffOperator            : DIFF;

compareExpression       : gtExpression | geExpression | ltExpression | leExpression | negationExpression;
gtExpression            : negationExpression gtOperator negationExpression;
geExpression            : negationExpression geOperator negationExpression;
ltExpression            : negationExpression ltOperator negationExpression;
leExpression            : negationExpression leOperator negationExpression;
gtOperator              : GT;
geOperator              : GE;
leOperator              : LE;
ltOperator              : LT;

negationExpression      : notOperator? oppExpression;
notOperator             : NOT;

oppExpression           : MINUS? navExpression;


//============================================================================//

navExpression           :
                            leftToRightNavigation
//                            rightToLeftNavigation
;

leftToRightNavigation   : initTerm (navOperator term)*;
rightToLeftNavigation   : (term navOperator)* initTerm;
navOperator             : ARROW;
initTerm                : word;
term                    : word;


//============================================================================//


word                    : Identifier;


