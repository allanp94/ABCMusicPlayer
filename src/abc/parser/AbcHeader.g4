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
 : FIELDTEXT COLON content						# headerField
 ;
 
content
 : CONTENTTEXT | FIELDTEXT						# contentField
 ; 

COLON   : ':';
FIELDTEXT : [A-Z]; 
CONTENTTEXT :  ~[:\r\n]+ ;
NEWLINE : [\n\t\r]+ -> skip;