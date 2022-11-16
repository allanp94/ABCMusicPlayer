/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar Abc;
import Configuration;

song
 : header EOF
 ;

header
 : rules+
 ;
 
rules
 : field COLON content eol
 ;
 
content
 : STRING
 | KEYC
 |  KEYK
 |  KEYL
 |  KEYM
 |  KEYQ
 |  KEYT
 |  KEYX
 | WORD
 ;

field
 : KEYC
 | KEYK
 | KEYL
 | KEYM
 | KEYQ
 | KEYT
 | KEYX
 ;
  
eol
 : NEWLINE
 | EOF
 ;

COLON   : ':';

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