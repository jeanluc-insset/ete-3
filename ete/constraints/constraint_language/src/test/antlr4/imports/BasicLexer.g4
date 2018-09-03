/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
lexer grammar BasicLexer;



//============================================================================//
//                             O P E R A T O R S                              //
//============================================================================//


XOR             : 'xor';
OR              : 'or';
AND             : 'and';
NOT             : 'not';

LT              : '<';
LE              : '<=';
GT              : '>';
GE              : '>=';

EQUAL           : '=';
DIFF            : '<>';

PLUS            : '+';
MINUS           : '-';
MULT            : '*';
DIV             : '/';
MOD             : '%';



//============================================================================//
//                            S E P A R A T O R S                             //
//============================================================================//


LPAREN          : '(';
RPAREN          : ')';
LBRACE          : '{';
RBRACE          : '}';
LBRACK          : '[';
RBRACK          : ']';
COLON           : ':';
SEMI            : ';';
COMMA           : ',';
DOT             : '.';
ARROW           : '->';
DOUBLE_ARROW    : '=>';
LEFT_ARROW      : '<-';
PIPE            : '|';


NO_DETERMINER   : 'no' 'determiner';
NO_KEYWORD      : 'no' 'keyword';
NO_MODEL_TERM   : 'no' 'model' 'term';
NO_OTHER        : 'no' 'other' 'term';

//============================================================================//
//============================================================================//


DEFINITION      : 'Definition';
RULE            : 'Rule';

//============================================================================//
//============================================================================//

INCLUDES        : 'includes';
EXCLUDES        : 'excludes';
INCLUDING       : 'including';
EXCLUDING       : 'excluding';


//============================================================================//
//============================================================================//


INTEGER         : NonNulDigit Digit*;

fragment
NonNulDigit     : [1-9];

fragment
Digit           : [0-9];

//============================================================================//
//============================================================================//

Identifier
    :   JavaLetter JavaLetterOrDigit*
    ;

fragment
JavaLetter
    :   [a-zA-Z$_] // these are the "java letters" below 0xFF
    |   // covers all characters above 0xFF which are not a surrogate
        ~[\u0000-\u00FF\uD800-\uDBFF]
        {Character.isJavaIdentifierStart(_input.LA(-1))}?
    |   // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
        [\uD800-\uDBFF] [\uDC00-\uDFFF]
        {Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?
    ;

fragment
JavaLetterOrDigit
    :   [a-zA-Z0-9$_] // these are the "java letters or digits" below 0xFF
    |   // covers all characters above 0xFF which are not a surrogate
        ~[\u0000-\u00FF\uD800-\uDBFF]
        {Character.isJavaIdentifierPart(_input.LA(-1))}?
    |   // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
        [\uD800-\uDBFF] [\uDC00-\uDFFF]
        {Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?
    ;



//============================================================================//


//
// Whitespace and comments
//

WS  :  [ \t\r\n\u000C]+ -> skip
    ;

COMMENT
    :   '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    :   '--' ~[\r\n]* -> skip
    ;

