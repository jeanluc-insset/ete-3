/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
parser grammar SbvrParser;


import GelParser;

options {
     tokenVocab = SbvrLexer;
}


genericExpression : definition | sbvrExpression | gelExpression;



definition : DEFINITION noungroup+ DOUBLE_COLON gelExpression DOT;


sbvrExpression : (keyword | noungroup | navExpression)+;

navOperator : OF;

keyword:
    ABRACADABRA 
;


noungroup : determiner? identifier;

determiner : THE | A;