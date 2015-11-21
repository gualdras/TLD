/**
 * Define a grammar called Hello
 */
grammar Sem;
r  : 
	program ;         // match keyword hello followed by an identifier

program : BEGIN '{' definiciones lista_problemas '}' END;

definiciones : carril ',' sensor ',' semaforo ',' cruce ';' ;

carril : CARRIL ID ID_SUCESSION ';' ;

sensor : SENSOR ID ID_SUCESSION ';' ;

semaforo : SEMAFORO ID ID_SUCESSION ';' ; 

cruce : CRUCE ID '(' ID ',' ID ',' ID ID_SUCESSION ')' ';' ;

lista_problemas: (problemas (',' problemas)*) ';';
problemas: PROBLEMA '(' ID ',' ID ')' ';' ;


BEGIN : 'begin';
END : 'end';
CARRIL: 'carril';
SENSOR: 'sensor';
SEMAFORO: 'semaforo';
CRUCE: 'cruce';
PROBLEMA: 'problema';

ID_SUCESSION : (',' ID) ;

ID : LOWER(LOWER | UPPER | DIGIT)* ;             // match lower-case identifiers

LOWER : [a-z] ; 

UPPER : [A-Z] ;

DIGIT : [0-9];

NUMBER : [0-9]+;

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

