/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar Abc;
import Configuration;

song
 : header body EOF
 ;

header
 : headerRules+ endRule
 ;
 
body
 : bodyRules+ eol
 ;
 
headerRules
 : field COLON content NEWLINE
 ;
 
bodyRules
 : BAR* sequence BAR
 ;
 
 sequence
 : SPACE* NOTES SPACE
 ;
 
 endRule
 : endField COLON content NEWLINE
 ;
 
content
 :  STRING
 |  KEYC
 |  KEYL
 |  KEYM
 |  KEYQ
 |  KEYT
 |  KEYX
 |  WORD
 |  NUMBER
 ;

endRuleContent
 : STRING
 | KEYK
 | WORD
 ;

field
 : KEYC
 | KEYL
 | KEYM
 | KEYQ
 | KEYT
 | KEYX
 ;
 
endField
 : KEYK
 ;
  
eol
 : NEWLINE
 | EOF
 ;

COLON   : ':';

BAR 	: '|'; 

KEYC    : 'C';
KEYK    : 'K';
KEYL    : 'L';
KEYM    : 'M';
KEYQ    : 'Q';
KEYT    : 'T';
KEYX    : 'X';

SPACE   : (' ' | '\t');
SLASH   : '/' | '\\';
STRING  : '"' ~('"')* '"';
NEWLINE : '\r'? '\n' | '\r';
NUMBER  : ('0'..'9')+ ('.' ('0'..'9')+)?;
ANYCHAR : .; 

//i don't like this... there has to be a better way
WORD    : ( 'a'..'z' | 'A'..'Z' | SPACE | SLASH | '=' | '.' | STRING | NUMBER)+;

NOTES	: ( 'a'..'z' | 'A'..'Z' | SLASH | NUMBER | '[' | ']' | '^')+;