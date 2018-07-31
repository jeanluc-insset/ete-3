parser grammar DefinitionsParser;



options {
    tokenVocab = DefinitionsLexer;
}


file :
         definition*
;


//============================================================================//

definition:
     DEFINITION Word+ COLON Word+ DOT
;



