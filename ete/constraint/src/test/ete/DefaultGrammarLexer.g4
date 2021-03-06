lexer grammar DefaultGrammarLexer;



//============================================================================//
//                                  L E X E R                                 //
//============================================================================//
//                                                                            //
// This lexer is intented to be a language specific lexer.                    //
// The provided example is for english                                         //
//                                                                            //
// The tokens are in english, since the main grammar rules use english        //
// keywords                                                                   //
//                                                                            //
//============================================================================//
//                                                                            //
// The lexer must get rid of words such as "the", "a", "an".                  //
// On the other hand, "this" denotes the contextual object, such as in        //
// "the captain of this flight must be certified for the plane model of the   //
// plane of this flight"                                                      //
//                                                                            //
//============================================================================//




//============================================================================//
//                                  L E X E R                                 //
//============================================================================//
//                                                                            //
// This lexer is the default lexer for any natural language                   //
//                                                                            //
// It is a Java lexer borrowed from antlr documentation.                      //
// The paragraph numbers reference the original grammar                       //
//                                                                            //
//============================================================================//
//                                                                            //
// The lexer must get rid of words such as "the", "a", "an".                  //
// On the other hand, "this" denotes the contextual object, such as in        //
// "the captain of this flight must be certified for the plane model of the   //
// plane of this flight"                                                      //
//                                                                            //
//============================================================================//





//============================================================================//
//                               L I T E R A L S                              //
//============================================================================//


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

// §3.10.3 Boolean Literals. Modified by JL

TRUE    : 'true';
FALSE   : 'false';


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
LEFT_ARROW      : '<-';
PIPE            : '|';





//============================================================================//
//                                                                            //
//                             O P E R A T O R S                              //
//                                                                            //
//============================================================================//


// §3.12 Operators

GT              : '>';
LT              : '<';
TILDE           : '~';
QUESTION        : '?';
COLON           : ':';
DOUBLE_COLON    : '::';
EQUAL           : '=';
LE              : '<=';
GE              : '>=';
NOTEQUAL        : '<>';
XOR             : 'xor';
ADD             : '+';
SUB             : '-';
MUL             : '*';
DIV             : '/';
MOD_PERCENT     : '%';
CARET           : '^';
MOD             : 'mod';

// Added by JLD

IMPLIES         : '=>';
IS_EQUIVALENT_TO: '<=>';

LIST_MARK       : '--';


//============================================================================//
//                                                                            //
//                         R E S E R V E D   W O R D S                        //
//                                                                            //
//============================================================================//



FEATURE         : 'FONCTIONNALITÉ' | 'Fonctionnalité' | 'fonctionnalité';
BACKGROUND      : 'CONTEXTE' | 'Contexte' |'contexte';
SCENARIO        : 'SCENARIO' | 'Scenario' | 'scenario';
OUTLINE         : 'RÉSUMÉ' | 'Résumé' | 'résumé';

DEFINITION      : 'DÉFINITION' | 'Définition' | 'définition' | 'def';
INVARIANT       : 'INVARIANT' | 'Invariant' | 'invariant';
POSTCONDITION   : 'POST-CONDITION' | 'Post-condition' | 'post-condition';
PRECONDITION    : 'PRE-CONDITION' | 'PRÉ-CONDITION' | 'Pre-condition' | 'Pré-condition' | 'pre-condition' | 'pré-condition';


GIVEN           : ETANT DONNE;
ETANT           : 'ÉTANT' | 'ETANT' | 'Étant' | 'Etant' | 'étant';
DONNE           : 'DONNÉ' | 'Donné' |'donné';
WHEN            : 'QUAND' | 'Quand' | 'quand';
THEN            : 'ALORS' | 'Alors' | 'alors';
BUT             : 'MAIS' | 'Mais' | 'mais';

OF              : 'DE' | 'De' | 'de'
                    | 'DES' | 'Des' | 'des'
                    | 'DU' | 'Du' | 'du' | 'D\'' | 'd\'';

AND             : 'ET' | 'Et' | 'et';
OR              : 'OU' | 'Ou' | 'ou';


//============================================================================//
//                                                                            //
//                         M I S C E L L A N E O U S                          //
//                                                                            //
//============================================================================//


//
// Additional symbols not defined in the lexical specification
//




ATPRE  : 'INITIAL' | 'Initial' | 'initial'
            | 'INITIALE' | 'Initiale' | 'initiale'
            | 'INITIAUX' | 'Initiaux' | 'initiaux'
            | 'INITIALES' | 'Initiales' | 'initiales';
IS       : 'EST' | 'Est' | 'est';
NEW      : 'NOUVEAU' | 'Nouveau' | 'nouveau'
            | 'NOUVELLE' | 'Nouvelle' | 'nouvelle'
            | 'NOUVEAUX' | 'Nouveaux' | 'nouveaux'
            | 'NOUVELLES' | 'Nouvelles' | 'nouvelles';
THE      : 'LE' | 'Le' | 'le'
            | 'LA' | 'La' | 'la'
            | 'LES' | 'Les' | 'les';
THIS     : 'CE' | 'Ce' | 'ce'
            | 'CETTE' | 'Cette' | 'cette'
            | 'CES' | 'Ces' | 'ces';
A        : 'UN' | 'Un' | 'un'
            | 'UNE' | 'Une' | 'une'
            'DES' | 'Des' | 'des';
WITH     : 'AVEC' | 'Avec' | 'avec';

TYPE     : 'TYPE' | 'Type' | 'type';
KIND     : 'SORTE' | 'Sorte' | 'sorte';

AS       : EN TANT QUE;

EN       : 'EN' | 'En' | 'en';
TANT     : 'TANT' | 'Tant' | 'tant';
QUE      : 'QUE' | 'Que' | 'que';

ORDERED  : 'ORDONNÉ' | 'Ordonné' | 'ordonné' 
            | 'ORDONNÉE' | 'Ordonnée' | 'ordonnée'
            | 'ORDONNÉS' | 'Ordonnés' | 'ordonnés'
            | 'ORDONNÉES' | 'Ordonnées' | 'ordonnées';

UNORDERED: NOT ORDERED;
NOT      : 'NON' | 'Non' | 'non';


INCLUDES : 'CONTIENT' | 'Contient' | 'contient'
         | 'CONTIENNENT' | 'Contiennent'| 'contiennent';
EXCLUDES : NE INCLUDES PAS;
EXISTE   : ('IL' | 'Il' | 'il') ('EXISTE' | 'existe');

NE       : 'NE' | 'Ne' | 'ne';
PAS      : 'PAS' | 'Pas' | 'pas';

SEQUENCE : 'SÉQUENCE' | 'Séquence' | 'séquence';
BAG      : 'SAC' | 'Sac' | 'sac';
SET      : 'Ensemble' | 'Ensemble' | 'ensemble';





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
    |   [\u00C0-\u017F\']
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
    |   [\u00C0-\u017F\']
    ;








//============================================================================//
//                                                                            //
//                         M I S C E L L A N E O U S                          //
//                                                                            //
//============================================================================//



//
// Whitespace and comments
//


WS  :  [ \t\r\n\u000C]+  -> skip ;


COMMENT :   '/*' .*? '*/' -> skip ;

LINE_COMMENT :   '--' ~[\r\n]* -> skip ;


