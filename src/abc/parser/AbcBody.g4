/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar AbcBody;
import Configuration;

body
 : measures+ (BAR | ENDREPEAT)? EOF
 ;
 
measures
 : start* (tuplet | note | chord)+
 ;
 
 start
 : BAR
 | BEGINREPEAT
 | PARTONE
 | PARTTWO
 | ENDREPEAT
 ;
 
//eol
// : NEWLINE
// | EOF
// ;
 
//content
// : note
// ;
  
BEGINREPEAT
 : '|:'
 ;
 
PARTONE
 : '|[1' ;

PARTTWO
 : '|[2' ;

ENDREPEAT
 : ':|['
 ;

COLON   : ':';

BAR 	: ('|'|'|]'); 

tuplet
: 

'(' (duplet | triplet | quadruplet);

duplet: 
'2' note note;

triplet: 
'3' note note note;

quadruplet: 
'4' note note note note ;

//SPACE   : (' ' | '\t')+ -> skip;
//NEWLINE : '\r'? '\n' | '\r';

//i don't like this... there has to be a better way

LENGTH
 : (NUMBER|FRACTION)
 ;

FRACTION	: NUMBER? '/' NUMBER?;
//SLASH   : '/' | '\\';
NUMBER	: [0-9]+;


note
 : ACCIDENTAL? LETTER LENGTH?
 ;
 
chord
 : '[' note+ ']'
 ;
 
 
ACCIDENTAL	: ('_'|'^'|'=')+;
LETTER	: ('a'..'z'|'A'..'Z') (','|'\'')*;

WS: [ \n\t\r]+ -> skip;