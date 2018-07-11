lexer grammar ${rootArtifactId}Lexer;


import NLLexer;



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
//                                                                            //
//                         R E S E R V E D   W O R D S                        //
//                                                                            //
//============================================================================//


FEATURE         : 'FONCTIONNALITÉ' | 'Fonctionnalité' | 'fonctionnalité';
BACKGROUND      : 'CONTEXTE' | 'Contexte' |'contexte';
SCENARIO        : 'SCENARIO' | 'Scenario' | 'scenario';
OUTLINE         : 'RÉSUMÉ' | 'Résumé' | 'résumé';

GIVEN           : ETANT DONNE;
ETANT           : 'ÉTANT' | 'Étant' | 'étant';
DONNE           : 'DONNÉ' | 'Donné' |'donné';
WHEN            : 'QUAND' | 'Quand' | 'quand';
THEN            : 'ALORS' | 'Alors' | 'alors';
BUT             : 'MAIS' | 'Mais' | 'mais';

OF              : 'DE' | 'De' | 'de' | 'DES' | 'Des' | 'des' | 'DU' | 'Du' | 'du' | 'D\'' | 'd\'';





//============================================================================//
//                                                                            //
//                         M I S C E L L A N E O U S                          //
//                                                                            //
//============================================================================//


//
// Additional symbols not defined in the lexical specification
//


ATPRE    : '@pre';
ELLIPSIS : '...';


INITIAL  : 'INITIAL' | 'Initial' | 'initial';
IS       : 'IS' | 'Is' | 'is';
NEW      : 'NEW' | 'New' | 'new';
THE      : 'THE' | 'The' | 'the';
THIS     : 'THIS' | 'This' | 'this';
A        : 'A' | 'a' | 'AN' | 'An' | 'an';
WITH     : 'WITH' | 'With' | 'with';

TYPE     : 'TYPE' | 'Type' | 'type';
KIND     : 'KIND' | 'Kind' | 'kind';

AS       : 'AS'| 'As' | 'as';

ORDERED  : 'ORDERED' | 'Ordered' | 'ordered';
UNORDERED: 'UNORDERED' | 'Unordered' | 'unordered';

SEQUENCE : 'SEQUENCE' | 'Sequence' | 'sequence';
BAG      : 'BAG' | 'Bag' | 'bag';
SET      : 'SET' | 'Set' | 'set';


