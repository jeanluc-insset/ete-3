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

somme               : LA SOMME navOperator navExpression;
produit             : LE PRODUIT navOperator navExpression;
moyenne             : LA MOYENNE navOperator navExpression;


// for "terms" in gel expression navigation
word                : determiner? Identifier;
determiner          : LE | LA | LES | L | UN | UNE | DES;

keyword             : IS;


initTerm            : determiner? word;
term                : determiner? word;
