




// JBehave Grammar expressed in EBNF (http:// en.wikipedia.org/wiki/Extended_Backus%E2%80%93Naur_Form)
 
// The story describes a feature via description, narrative and a set of scenarios
story : description meta? narrative? givenStories? lifecycle? scenario+ ;
 
// The Description is expressed by any sequence of words that must not contain any keywords at start of lines.
description : (word space?)* ;
 
// The meta is identified by keyword "Meta:" (or equivalent in I18n-ed locale),
// It is followed by any number of meta elements
meta: METACOLON (metaElement)* ;
 
// The meta element is identified by keyword "@" (or equivalent in I18n-ed locale),
// It is followed by a name-value pair, where the value can be empty or have multiple words
metaElement: AT word+ ;
 
// The narrative is identified by keyword "Narrative:" (or equivalent in I18n-ed locale),
// It is followed by the narrative elements
narrative: NARRATIVE COLON ( (inOrderTo asA iWantTo) | (asA iWantTo soThat) ) ;
 
// The narrative elements
inOrderTo: IN_ORDER_TO narrativeElementContent ;
asA: AS A narrativeElementContent ;
iWantTo: I WANT TO narrativeElementContent ;
soThat: SO THAT narrativeElementContent ;
 
// The narrative element content is any sequence of characters that do not match a narrative starting word
narrativeElementContent : word* ;
 
// All characters are allowed in a narrative content, including newlines
NarrativeCharacter :  ;
 
// The narrative starting words (or equivalent in I18n-ed locale)
narrativeStartingWord : ((IN ORDER TO) | (AS A) | (I WANT TO) | (SO THAT)) ;
 
// The comma-separated list of story resources that specify the stories to be run before a story or a scenario
givenStories: GIVEN STORIES COLON (storyPath COMMA ?)+ ;
 
// The lifecycle is identified by keyword "Lifecycle:" (or equivalent in I18n-ed locale),
// It is followed by the lifecycle elements
Lifecycle: LIFECYCLE COLON lifecycleBefore? lifecycleAfter?
 
// The before lifecyle element identified by keyword "Before:" (or equivalent in I18n-ed locale), 
// followed by one or more steps
lifecycleBefore: BEFORE COLON (scope? step+)+
 
// The after lifecyle element identified by keyword "After:" (or equivalent in I18n-ed locale), 
// followed by one or more sets of scope, outcome, meta filter and steps
lifecycleAfter: AFTER COLON (scope? outcome? metaFilter? step+)+
 
// The scope element identified by keyword "Scope:" (or equivalent in I18n-ed locale),
Scope: "Scope:" "SCENARIO" | "STORY"
 
// The outcome element identified by keyword "Outcome:" (or equivalent in I18n-ed locale), 
Outcome: "Outcome:" "ANY" | "SUCCESS" | "FAILURE";
 
// The meta filter element identified by keyword "MetaFilter:" (or equivalent in I18n-ed locale), 
MetaFilter: "MetaFilter:" (Word Space?)*
 
// The scenario is identified by keyword "Scenario:" (or equivalent in I18n-ed locale),
// which is optional in the case of a single scenario.  
// It can optionally be followed by a title, which is expressed by any sequence of words
// that must not contain any keywords at start of lines.
// It is followed by one or more Steps. 
// Finally the optional Examples table, which if present will execute the scenario for as many table rows present
scenario : (SCENARIO COLON)? title? meta? givenStories? step+ examples? ;
 
// The free-text description 
title : word* ;
 
// The word is any sequence of non-space characters that does not match a KeyWord
word : Identifier ;
 
// The space character
space : ? Unicode space character ? ;
 
// The non-space character
NonSpaceCharacter : ? Any Unicode character except Space ? ;
 
// The keywords which are reserved (or equivalent in I18n-ed locale)
KeyWord : "Scenario:" | "GivenStories:" | "Given" | "When" | "Then" | "And" | "!--";
 
// The story resource path  
StoryPath : PathCharacter+ ;
 
// The characters allowed in a resource path
PathCharacter : "/" | "." | "_" | Letter | Digit ;
 
// The letter characters
Letter : ? Any Unicode letter character ? ;
 
// The digit characters
Digit : ? Any Unicode digit character ? ;
 
// The scenario step is a step starting work followed by any number of characters
Step : StepStartingWord StepContent ;
 
// The step starting words (or equivalent in I18n-ed locale)
StepStartingWord : ("Given" | "When" | "Then" | "And" | "!--" ) ;
 
// The step content is any sequence of characters that do not match a step starting word
StepContent : ? Any sequence of StepCharacter that does not match StepStartingWord ? ;
 
// All characters are allowed in a scenario step content, including newlines
StepCharacter : ? Any Unicode character ? ;
 
// The examples table
Examples : "Examples:" ExamplesTable ;
 
// The examples table comprises of a header row and data rows
ExamplesTable : ExamplesTableHeader ExamplesTableRow+ ;
 
// The examples table header contains the column names, separated by ExamplesTableColumnSeparator
ExamplesTableHeader : ((ExamplesTableColumnSeparator ExamplesTableCharacter+)+ ExamplesTableColumnSeparator  Newline ;
 
// The examples table row contains the column values, separated by ExamplesTableColumnSeparator
ExamplesTableRow : ((ExamplesTableColumnSeparator ExamplesTableCharacter+)+ ExamplesTableColumnSeparator  Newline ;
 
// The examples table character can be any character, expect for ExamplesTableColumnSeparator and Newline
ExamplesTableCharacter : ? Any Unicode character except ExamplesTableColumnSeparator and Newline ? ;
 
// The examples table column separator
ExamplesTableColumnSeparator : "|" ;
 
// The new line character
Newline : ? Unicode newline character ? ;
