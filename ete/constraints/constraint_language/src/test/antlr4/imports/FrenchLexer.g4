lexer grammar FrenchLexer;


import BasicLexer;



DEFINITION  : 'Définition';
RULE        : 'Règle';

//============================================================================//
//============================================================================//

EXCLUDES        : 'ne' ('contient' | 'contiennent') 'pas';
INCLUDING       : ('contient' | 'contiennent') 'en' 'plus';
EXCLUDING       : 'ne' ('contient' | 'contiennent') 'plus';
INCLUDES        : 'contient' | 'contiennent';


SUM             : 'la'? 'somme';
PRODUCT         : 'le'? 'produit';
AVERAGE         : 'la'? 'moyenne';


//============================================================================//

THE         : 'le' | 'la' | 'l\u0027' | 'les';
A           : 'un' | 'une';
DES         : 'des';

OF          : 'de' | 'du' | 'd\u0027';

IS          : ('doit' 'être') | ('doivent' 'être') | 'est' | 'sont';

POINT_EXCLAMATION : '!';


fragment
JavaLetter
    :   [a-zA-Z$_] // these are the "java letters" below 0xFF
    |   [\u00C0-\u00FF]
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
    |   [\u00C0-\u00FF]
    |   // covers all characters above 0xFF which are not a surrogate
        ~[\u0000-\u00FF\uD800-\uDBFF]
        {Character.isJavaIdentifierPart(_input.LA(-1))}?
    |   // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
        [\uD800-\uDBFF] [\uDC00-\uDFFF]
        {Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?
    ;

