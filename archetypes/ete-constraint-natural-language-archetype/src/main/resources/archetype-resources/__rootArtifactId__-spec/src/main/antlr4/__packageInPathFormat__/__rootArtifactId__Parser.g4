parser grammar ${rootArtifactId}Parser;


import NLParser;




//============================================================================//
// This grammar is an abstract grammar for any ${rootArtifactId}.             //
// A grammar which imports this one can override any rule to customize it to  //
// its own needs.                                                             //
// By convention, rules with "expression" as suffix are reflected by objects  //
// in the abstract syntax and are visitable by the abstract tree builder      //
// The objects in the abstract syntax must have the "kind" tag value which    //
// gives the template fragment to use in the abstract tree builder            // 
//============================================================================//


options {
    tokenVocab = ${rootArtifactId}Lexer;
}




//============================================================================//
//                             N A V I G A T I O N                            //
//============================================================================//


// Uncomment the desired rule.
// Right to Left is the rule for french, spanish, english using "of" keyword
// Left to right is the rule for japanese ("no")

/*
navExpression :
    navExpressionRightToLeft
;

*/


/*
navExpression :
    navExpressionLeftToRight
;
*/

