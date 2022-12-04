/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar AbcHeader;
import Configuration;

header
 : headerRules+ EOF
 ;

headerRules
 : TEXT COLON TEXT
 ;

COLON   : ':';
TEXT : ~[:\r\n]+;
NEWLINE : [\n\t\r]+ -> skip;