/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar AbcBody;
import Configuration;

@members {
	public int counter;
}

body
 : section+ divider? EOF
 ;
 
section
 : (VOICE | measure)+ divider?
 ;
 
measure
 : divider? (PARTONE | PARTTWO)? (tuplet | note | chord)+
 ;
 
 divider
 : BAR
 | BEGINREPEAT
 | PARTONE
 | PARTTWO
 | ENDREPEAT
 ;
  
tuplet
@init {counter = 1;}
: '(' NUMBER ( {counter<=$NUMBER.int}? note {counter++;} )*
;

chord
 : LEFTBRACKET note+ RIGHTBRACKET
 ;

note
 : ACCIDENTAL? LETTER (NUMBER|FRACTION)?
 ;



BEGINREPEAT
 : '|:'
 ;
 
PARTONE
 : '[1' ;

PARTTWO
 : '[2' ;

ENDREPEAT
 : ':|'
 ;

VOICE   : 'V' COLON ' '* [a-zA-Z0-9]+;
fragment COLON   : ':';
LEFTBRACKET : '[';
RIGHTBRACKET : ']';
BAR 	: ('|'|'|]'); 
NUMBER	: [0-9]+;
FRACTION	: NUMBER? '/' NUMBER?;
ACCIDENTAL	: ('_'|'^'|'=')+;
LETTER	: ('a'..'z'|'A'..'Z') (','|'\'')*;
WS: [ \n\t\r]+ -> skip;
PERCENT: '%' -> skip;