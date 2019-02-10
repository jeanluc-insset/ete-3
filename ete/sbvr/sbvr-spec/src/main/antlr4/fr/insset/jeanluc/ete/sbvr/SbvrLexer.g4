/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
lexer grammar SbvrLexer;

import GelLexer;



//============================================================================//
//                   N A V I G A T I O N   O P E R A T O R                    //
//============================================================================//


OF                      : 'of';



//============================================================================//
//                      O T H E R   K E Y W O R D S
//============================================================================//



A_GIVEN                 : 'a' 'given';

THE                     : 'the';
A                       : 'a' | 'an';

OTHER                   : 'other';
ANOTHER                 : 'another';

THAT                    : 'that';
THIS                    : 'this';
THESE                   : 'these';
WHO                     : 'who';

WHICH                   : 'which';
WHERE                   : 'where';
WHOSE                   : 'whose';


ABRACADABRA             : 'abracadabra';


//============================================================================//
//                   M O D A L   O P E R A T O R S
//============================================================================//


IT_IS_OBLIGATORY_THAT   : 'it' 'is' 'obligatory' 'that';
IT_IS_PROHIBITED_THAT   : 'it' 'is' 'prohibited' 'that';
IT_IS_NECESSARY_THAT    : 'it' 'is' 'necessary' 'that';
IT_IS_IMPOSSIBLE_THAT   : 'it' 'is' 'impossible' 'that';
IT_IS_POSSIBLE_THAT     : 'it' 'is' 'possible' 'that';
IT_IS_PERMITTED_THAT    : 'it' 'is' 'permitted' 'that';

MUST_NOT                : 'must' 'not';
MUST                    : 'must';
NEED_NOT                : ('need' | 'needs') 'not';
ALWAYS                  : 'always';
NEVER                   : 'never';
CAN                     : 'can';
MAY                     : 'may';

ONLY_IF                 : 'only' 'if';



//============================================================================//
//============================================================================//


