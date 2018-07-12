lexer grammar ${rootArtifactId}Lexer;


import NLLexer;



//============================================================================//
//                                  L E X E R                                 //
//============================================================================//
//                                                                            //
// This lexer is intented to be a language specific lexer.                    //
// The provided example is for french                                         //
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

OF              : 'DE' | 'De' | 'de'
                    | 'DES' | 'Des' | 'des'
                    | 'DU' | 'Du' | 'du' | 'D\'' | 'd\'';




//============================================================================//
//                                                                            //
//                         M I S C E L L A N E O U S                          //
//                                                                            //
//============================================================================//


//
// Additional symbols not defined in the lexical specification
//


ATPRE    : 'INITIAL' | 'Initial' | 'initial'
            | 'INITIALE' | 'Initiale' | 'initiale'
            | 'INITIAUX' | 'Initiaux' | 'initiaux'
            | 'INITIALES' | 'Initiales' | 'initiales';


INITIAL  : 'INITIAL' | 'Initial' | 'initial';
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

SEQUENCE : 'SÉQUENCE' | 'Séquence' | 'séquence';
BAG      : 'SAC' | 'Sac' | 'sac';
SET      : 'Ensemble' | 'Ensemble' | 'ensemble';


