/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar AbcHeader;
import Configuration;

song
 : header  EOF
 ;

header
 : headerRules+ 
 ;

headerRules
 : field COLON content NEWLINE
 ;
 
content
 :  KEY
 |  WORD
 ;

field
 : KEY;

  
eol
 : NEWLINE
 | EOF
 ;

COLON   : ':';

BAR 	: '|'; 

KEY 	: [A-Z];



fragment SPACE   : (' ' | '\t');
fragment SLASH   : '/' | '\\';
fragment STRING  : '"' ~('"')* '"';
NEWLINE : '\r'? '\n' | '\r';
fragment NUMBER  : [0-9]+;
fragment ANYCHAR : .; 

//i don't like this... there has to be a better way
WORD    : ( 'a'..'z' | 'A'..'Z' | SPACE | SLASH | '=' | '.'| ',' | '\'' | STRING | NUMBER)+;