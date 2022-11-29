/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar AbcBody;
import Configuration;

body
 : bodyRules+ eol
 ;
 
bodyRules
 : BAR* content BAR
 ;
 
content
 : NOTES
 ;
  
eol
 : NEWLINE
 | EOF
 ;

COLON   : ':';

BAR 	: '|'; 

SPACE   : (' ' | '\t');
SLASH   : '/' | '\\';
NEWLINE : '\r'? '\n' | '\r';

//i don't like this... there has to be a better way

NOTES	: ( 'a'..'z' | 'A'..'Z' | SLASH | '[' | ']' | '^' )+;