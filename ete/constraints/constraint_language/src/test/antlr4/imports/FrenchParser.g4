parser grammar FrenchParser;


import BasicParser;


options {
     tokenVocab = FrenchLexer;
}

definitionSignature     : (keyword | word)+;
definitionEnd           : POINT_EXCLAMATION;


navExpression       : rightToLeftNavigation;
navOperator         : OF | DES;

collectionExpression: (navExpression collectionOperator collectionOrOppExpression) | specialCollectionExpression;
specialCollectionExpression : somme | produit | moyenne;

somme               : SUM navOperator navExpression;
produit             : PRODUCT navOperator navExpression;
moyenne             : AVERAGE navOperator navExpression;


// for "terms" in gel expression navigation
word                : determiner? Identifier;
determiner          : THE | A | DES;

keyword             : IS;


initTerm            : determiner? word;
term                : determiner? word;
