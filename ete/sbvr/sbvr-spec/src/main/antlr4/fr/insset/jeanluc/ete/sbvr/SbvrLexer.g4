lexer grammar SbvrLexer;




//============================================================================//
//                                  L E X E R                                 //
//============================================================================//
//                                                                            //
// This lexer defines tokens for OCL and for SBVR structured english          //
// It is designed to be easy to customize                                     //
//                                                                            //
//============================================================================//



//============================================================================//
//
//============================================================================//


DEFINITION: 'definition';

CONTEXT   : 'context';
INVARIANT : 'inv';
PRE       : 'pre';
POST      : 'post';




//============================================================================//
//                               L I T E R A L S                              //
//============================================================================//


Self : 'self';


// Number literals

IntegerLiteral
    :   DecimalIntegerLiteral
    |   HexIntegerLiteral
    |   OctalIntegerLiteral
    |   BinaryIntegerLiteral
    ;

fragment
DecimalIntegerLiteral
    :   DecimalNumeral IntegerTypeSuffix?
    ;

fragment
HexIntegerLiteral
    :   HexNumeral IntegerTypeSuffix?
    ;

fragment
OctalIntegerLiteral
    :   OctalNumeral IntegerTypeSuffix?
    ;

fragment
BinaryIntegerLiteral
    :   BinaryNumeral IntegerTypeSuffix?
    ;

fragment
IntegerTypeSuffix
    :   [lL]
    ;

fragment
DecimalNumeral
    :   '0'
    |   NonZeroDigit (Digits? | Underscores Digits)
    ;

fragment
Digits
    :   Digit (DigitOrUnderscore* Digit)?
    ;

fragment
Digit
    :   '0'
    |   NonZeroDigit
    ;

fragment
NonZeroDigit
    :   [1-9]
    ;

fragment
DigitOrUnderscore
    :   Digit
    |   '_'
    ;

fragment
Underscores
    :   '_'+
    ;

fragment
HexNumeral
    :   '0' [xX] HexDigits
    ;

fragment
HexDigits
    :   HexDigit (HexDigitOrUnderscore* HexDigit)?
    ;

fragment
HexDigit
    :   [0-9a-fA-F]
    ;

fragment
HexDigitOrUnderscore
    :   HexDigit
    |   '_'
    ;

fragment
OctalNumeral
    :   '0' Underscores? OctalDigits
    ;

fragment
OctalDigits
    :   OctalDigit (OctalDigitOrUnderscore* OctalDigit)?
    ;

fragment
OctalDigit
    :   [0-7]
    ;

fragment
OctalDigitOrUnderscore
    :   OctalDigit
    |   '_'
    ;

fragment
BinaryNumeral
    :   '0' [bB] BinaryDigits
    ;

fragment
BinaryDigits
    :   BinaryDigit (BinaryDigitOrUnderscore* BinaryDigit)?
    ;

fragment
BinaryDigit
    :   [01]
    ;

fragment
BinaryDigitOrUnderscore
    :   BinaryDigit
    |   '_'
    ;

// Floating-Point Literals

FloatingPointLiteral
    :   DecimalFloatingPointLiteral
    |   HexadecimalFloatingPointLiteral
    ;

fragment
DecimalFloatingPointLiteral
    :   Digits '.' Digits? ExponentPart? FloatTypeSuffix?
    |   '.' Digits ExponentPart? FloatTypeSuffix?
    |   Digits ExponentPart FloatTypeSuffix?
    |   Digits FloatTypeSuffix
    ;

fragment
ExponentPart
    :   ExponentIndicator SignedInteger
    ;

fragment
ExponentIndicator
    :   [eE]
    ;



fragment
SignedInteger
    :   Sign? Digits
    ;

fragment
Sign
    :   [+-]
    ;

fragment
FloatTypeSuffix
    :   [fFdD]
    ;

fragment
HexadecimalFloatingPointLiteral
    :   HexSignificand BinaryExponent FloatTypeSuffix?
    ;

fragment
HexSignificand
    :   HexNumeral '.'?
    |   '0' [xX] HexDigits? '.' HexDigits
    ;

fragment
BinaryExponent
    :   BinaryExponentIndicator SignedInteger
    ;

fragment
BinaryExponentIndicator : [pP];

// Boolean Literals

TRUE    :   'true';
FALSE   :   'false';


// Date Literals

DateLiteral
    : '"' Digit Digit Digit Digit SUB Digit Digit SUB Digit Digit '"';


// Character Literals

CharacterLiteral
    :   '\'' SingleCharacter '\''
    |   '\'' EscapeSequence '\''
    ;

fragment
SingleCharacter
    :   ~['\\]
    ;

// String Literals

StringLiteral
    :   '"' StringCharacters? '"'
    ;

fragment
StringCharacters
    :   StringCharacter+
    ;

fragment
StringCharacter
    :   ~["\\]
    |   EscapeSequence
    ;

// Escape Sequences for Character and String Literals

fragment
EscapeSequence
    :   '\\' [btnfr"'\\]
    |   OctalEscape
    |   UnicodeEscape
    ;

fragment
OctalEscape
    :   '\\' OctalDigit
    |   '\\' OctalDigit OctalDigit
    |   '\\' ZeroToThree OctalDigit OctalDigit
    ;

fragment
UnicodeEscape
    :   '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;

fragment
ZeroToThree
    :   [0-3]
    ;

// The Null Literal

NullLiteral
    :   'null'
    ;


//============================================================================//
//                                                                            //
//                             S E P A R A T O R S                            //
//                                                                            //
//============================================================================//


// Separators

LPAREN          : '(';
RPAREN          : ')';
START_EXP       : '#{';
LBRACE          : '{';
RBRACE          : '}';
LBRACK          : '[';
RBRACK          : ']';
SEMI            : ';';
COMMA           : ',';
DOT             : '.';
ARROW           : '->';
LEFT_ARROW      : '<-';
PIPE            : '|';



//============================================================================//
//                                                                            //
//                             O P E R A T O R S                              //
//                                                                            //
//============================================================================//


// Operators

GT              : '>';
LT              : '<';
// NOT             : 'not';
TILDE           : '~';
QUESTION        : '?';
COLON           : ':';
DOUBLE_COLON    : '::';
EQUAL           : '=';
LE              : '<=';
GE              : '>=';
NOTEQUAL        : '<>';
AND             : 'and';
OR              : 'or';
XOR             : 'xor';
ADD             : '+';
SUB             : '-';
MUL             : '*';
DIV             : '/';
MOD_PERCENT     : '%';
CARET           : '^';
MOD             : 'mod';


OF              : 'of';


//============================================================================//
//                                                                            //
//                         S B V R   K E Y W O R D S                          //
//                                                                            //
//============================================================================//


// Quantifiers

EACH                   : 'each';
SOME                   : 'some';
AT_LEAST_ONE           : 'at' 'least' 'one';
AT_LEAST               : 'at' 'least';
AT_MOST_ONE            : 'at' 'most' 'one';
AT_MOST                : 'at' 'most';
EXACTLY_ONE            : 'exactly' 'one';
EXACTLY                : 'exactly';
MORE_THAN_ONE          : 'more' 'than' 'one';
NO                     : 'no';


// Logical operations

IT_IS_NOT_THE_CASE_THAT: 'it' 'is' 'not' 'the' 'case' 'that';
BUT_NOT_BOTH           : 'but' 'not' 'both';
THEN                   : 'then';
IF_AND_ONLY_IF         : 'if' 'and' 'only' 'if';
NOT_BOTH               : 'not' 'both';
NEITHER                : 'neither';
WHETHER_OR_NOT         : 'whether' 'or' 'not';


// Modal operations

IT_IS_OBLIGATORY_THAT  : 'it' 'is' 'obligatory' 'that';
IT_IS_PROHIBITED_THAT  : 'it' 'is' 'prohibited' 'that';
IT_IS_NECESSARY_THAT   : 'it' 'is' 'necessary' 'that';
IT_IS_IMPOSSIBLE_THAT  : 'it' 'is' 'impossible' 'that';
IT_IS_POSSIBLE_THAT    : 'it' 'is' 'possible' 'that';
IT_IS_PERMITTED_THAT   : 'it' 'is' 'permitted' 'that';

ONLY_IF                : 'only' 'if';

MUST_NOT               : 'must' 'not';
MUST                   : 'must';
NEED_NOT               : 'need' 'not';
NEED                   : 'need';
ALWAYS                 : 'always';
NEVER                  : 'never';
CAN                    : 'can';
MAY                    : 'may';
NOT                    : 'not';


// Other keywords

THE                    : 'the';
A_GIVEN                : 'a' 'given';
GIVEN                  : 'given';
A                      : 'a' | 'an';
ANOTHER                : 'another';
THAT                   : 'that';
WHO                    : 'who';
WHAT                   : 'what';
IS_OF                  : 'is' 'of';
THIS                   : 'this';


// added by JLD

ITS                    : 'its';


//============================================================================//
//                                                                            //
//                    O C L   R E S E R V E D   W O R D S                     //
//                                                                            //
//============================================================================//


SEQUENCE               : 'sequence';
BAG                    : 'bag';
SET                    : 'set';
ORDERED                : 'ordered';


//============================================================================//
//                                                                            //
//                           O C L   L I B R A R Y                            //
//============================================================================//


OCL_IS_NEW             : DOT 'isNew' LPAREN RPAREN;
OCL_IS_TYPE_OF         : DOT 'oclIsTypeOf';
OCL_IS_KIND_OF         : DOT 'oclIsKindOf';
OCL_AS_TYPE            : DOT 'oclAsType';


//============================================================================//
//                                                                            //
//                           I D E N T I F I E R S                            //
//                                                                            //
//============================================================================//


// Identifiers (must appear after all keywords in the grammar)

Identifier :   JavaLetter JavaLetterOrDigit* ;


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
//                                                                            //
//                         M I S C E L L A N E O U S                          //
//                                                                            //
//============================================================================//


//
// Additional symbols not defined in the lexical specification
//

// AT       : '@';
ATPRE    : '@pre';
ELLIPSIS : '...';

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


