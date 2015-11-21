/**
 * Define a grammar called Hello
 */
grammar Sem;
r 
    :   
	program ;         // match keyword hello followed by an identifier

program
    :   BEGIN '{' definitionList problemList '}' END ;

definitionList
    :   definition* intersect* ;

definition
    :   lane 
    |   sensor 
    |   semaphore ;

lane
    :   LANE ID idList ';' ;

sensor
    :   SENSOR ID idList ';' ;

semaphore
    :   SEMAPHORE  ID idList ';' ; 

intersect
    :   INTERSECT ID '(' ID ',' ID idList ')' ';' ;

problemList: (problem (',' problem)*);

problem: PROBLEM '(' ID ',' ID ')' ';' ;


BEGIN
    :   'begin';
END
    :   'end';
LANE: 'lane';
SENSOR: 'sensor';
SEMAPHORE: 'semaphore';
INTERSECT: 'intersect';
PROBLEM: 'problem';

idList
    :   (',' ID)* ;

ID
    :   LOWER(LOWER 
    |   UPPER 
    |   DIGIT)* ;   // match lower-case identifiers

LOWER
    :   [a-z] ; 

UPPER
    :   [A-Z] ;

DIGIT
    :   [0-9];

NUMBER
    :   [0-9]+;

WS
    :   [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

COMMENT
    :     '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    :     '//' ~[\r\n]* -> skip
    ;

