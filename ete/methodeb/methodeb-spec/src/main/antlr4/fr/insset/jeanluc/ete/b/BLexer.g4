lexer grammar BLexer;




//============================================================================//
//                                  L E X E R                                 //
//============================================================================//
//                                                                            //
// This lexer is a Java lexer borrowed from antlr documentation.              //
// The paragraph numbers reference the original grammar                       //
//                                                                            //
//============================================================================//





//============================================================================//
//                               L I T E R A L S                              //
//============================================================================//


// Added by JL

Self : 'self';



// §3.10.1 Integer Literals

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

// §3.10.2 Floating-Point Literals

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
BinaryExponentIndicator
    :   [pP]
    ;

// §3.10.3 Boolean Literals

BooleanLiteral
    :   'true'
    |   'false'
    ;


// Added by JL

DateLiteral
    : '"' Digit Digit Digit Digit SUB Digit Digit SUB Digit Digit '"';


// §3.10.4 Character Literals

CharacterLiteral
    :   '\'' SingleCharacter '\''
    |   '\'' EscapeSequence '\''
    ;

fragment
SingleCharacter
    :   ~['\\]
    ;

// §3.10.5 String Literals

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

// §3.10.6 Escape Sequences for Character and String Literals

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

// §3.10.7 The Null Literal

NullLiteral
    :   'null'
    ;


//============================================================================//
//                                                                            //
//                             S E P A R A T O R S                            //
//                                                                            //
//============================================================================//

// §3.11 Separators

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
PIPE            : '|';



//============================================================================//
//                                                                            //
//                         R E S E R V E D   W O R D S                        //
//                                                                            //
//============================================================================//



//============================================================================//
//                                                                            //
//                             O P E R A T O R S                              //
//                                                                            //
//============================================================================//


// Arithmetic operators

GT              : '>';
LT              : '<';
NOT             : 'not';
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
DOUBLE_POINT    : '..';


// Set operators




//============================================================================//
//                                                                            //
//                             B   L I B R A R Y                              //
//                                                                            //
//============================================================================//


MACHINE                 : 'Machine';
END                     : 'End';
REFINMENT               : 'Refinment';
IMPLEMENTATION          : 'Implementation';
REFINES                 : 'Refines';
IMPORTS                 : 'Imports';
BOOL                    : 'Bool';
PROMOTES                : 'Promotes';
SEES                    : 'Sees';
INCLUDES                : 'Includes';
EXTENDS                 : 'Extends';
USES                    : 'Uses';
SETS                    : 'Sets';
CONCRETE                : 'Concrete';
ABSTRACT                : 'Abstract';
CONSTANTS               : 'Constants';
VARIABLES               : 'Variables';
PROPERTIES              : 'Properties';
VALUES                  : 'Values';
CONSTRAINT              : 'Constraint';
INVARIANT               : 'Invariant';
ASSERTIONS              : 'Assertions';
INITIALISATION          : 'Initialization';
OPERATIONS              : 'Operations';
LOCAL                   : 'Local';


STRUCT                  : 'struct';
ID                      : 'id';
DOUBLE_PIPE             : '||';


//============================================================================//
//                                                                            //
//                           I D E N T I F I E R S                            //
//                                                                            //
//============================================================================//


// §3.8 Identifiers (must appear after all keywords in the grammar)

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


DIGIT               : '0' | NON_NULL_DIGIT;
NON_NULL_DIGIT      : '1'..'0';
ENTIER_LITERAL      : NON_NULL_DIGIT (DIGIT)*;
MAXINT              : 'maxint';
MININT              : 'minint';

FALSE               : 'false';
TRUE                : 'true';

PLUS                : '+';
MINUS               : '-';
MULT                : '*';
EXP                 : 'exp';
SUCC                : 'succ';
PRED                : 'pred';

REC                 : 'rec';


LCURLY              : '{';
RCURLY              : '}';

RIGHT_ARROW         : '→';
SPECIAL_RIGHT_ARROW : '↣';
LEFT_ARROW          : '←';

UNION               : '∪';
STRICTLY_INCLUDED   : '⊂';
INCLUDED            : '⊆';
NOT_STRICTLY_INCLUDED: '⊄';
NOT_INCLUDED        : '⊊';
CONTAINS_ALL        : '⊇';
DOES_NOT_CONTAIN_ALL: '⊋';

BELONGS_TO          : '∈';
DOES_NOT_BELONG_TO  : '∉';
CONTAINS            : '∋';
DOES_NOT_CONTAIN    : '∌';
X                   : 'x';

QUEL_QUE_SOIT       : '∀';
IL_EXISTE           : '∃';

N                   : 'ℕ';
Z                   : 'ℤ';
R                   : 'ℝ';
P                   : 'ℙ';
F                   : '?';

//============================================================================//
//                                                                            //
//                         M I S C E L L A N E O U S                          //
//                                                                            //
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
