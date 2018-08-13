grammar Definitions;




file :
         definition*
;


//============================================================================//


definition:
     DEFINITION? Word+ COLON Word+ DOT
;


//============================================================================//


DEFINITION  : 'Def' | 'Definition';

DOT         : '.';
COLON       : ':';

