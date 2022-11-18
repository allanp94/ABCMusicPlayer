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
 : headerRules+ endRule eol
 ;
 
body
 : bodyRules+ eol
 ;
 
headerRules
 : field COLON content 
 ;
 
bodyRules
 : BAR* WORD+ BAR
 ;
 
endRule
 : endField COLON endRuleContent
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