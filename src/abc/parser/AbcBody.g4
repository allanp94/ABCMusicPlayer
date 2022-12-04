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
 : measures+ (BAR /*  | ENDREPEAT*/)? EOF
 ;
 
measures
 : start* (tuplet | note | chord)+
 ;
 
 start
 : BAR
// | BEGINREPEAT
// | PARTONE
// | PARTTWO
// | ENDREPEAT
 ;
  
tuplet
@init {counter = 1;}
: '(' NUMBER ( {counter<=$NUMBER.int}? note {counter++;} )*
;

chord
 : '[' note+ ']'
 ;

note
 : ACCIDENTAL? LETTER (NUMBER|FRACTION)?
 ;

//BEGINREPEAT
// : '|:'
// ;
// 
//PARTONE
// : '|[1' ;
//
//PARTTWO
// : '|[2' ;
//
//ENDREPEAT
// : ':|['
// ;

COLON   : ':';

BAR 	: ('|'|'|]'); 
NUMBER	: [0-9]+;
FRACTION	: NUMBER? '/' NUMBER?;
ACCIDENTAL	: ('_'|'^'|'=')+;
LETTER	: ('a'..'z'|'A'..'Z') (','|'\'')*;
WS: [ \n\t\r]+ -> skip;