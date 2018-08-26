lexer grammar FrenchLexer;


import BasicLexer;



DEFINITION  : 'Définition';
RULE        : 'Règle';


//============================================================================//


THE         : 'le' | 'la' | 'les';
A           : 'un' | 'une' /*| 'des'*/;

OF          : 'de' | 'du' | 'des';

IS          : ('doit' 'être') | ('doivent' 'être') | 'est' | 'sont';



