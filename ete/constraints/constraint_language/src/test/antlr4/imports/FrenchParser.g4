/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
parser grammar FrenchParser;


import BasicParser;


options {
     tokenVocab = FrenchLexer;
}

definitionSignature     : (keyword | word)+;


navExpression       : rightToLeftNavigation;
navigationKeyword   : OF;

// for "terms" in gel expression navigation
word                : determiner? Identifier;
determiner          : THE | A;

keyword             : IS;


initTerm                : determiner? word;
term                    : determiner? word;
