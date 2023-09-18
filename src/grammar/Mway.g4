grammar Mway;

file: code EOF;

code
: statement ';' code
| statement ';'       // Implicitly defined terminal
;

statement
: deklarera
| tilldela
| skrivut
| whileLoop
;

deklarera: 'var' ID
;

whileLoop: 'medan' condition '{' code '}' ; // Syntax för en while-loop

condition: expr COMPARABLE expr ; // Uppdaterad condition-regel för jämförelseuttryck

tilldela
: ID '=' expr
| ID '=' plus
;

plus
: ID '+' INT
| ID '+' ID
| INT '+' ID
| INT '+' INT
;

minus
: expr '-' expr
;

skrivut: 'skriv' expr;

expr
: ID
| INT
| COMPARABLE
;

ID: ('a'..'z')+ ;
INT: ('0'..'9')+ ;
COMPARABLE: ('<' | '>' | '==' | '!=' | '<=' | '>=');
WS: [ \n\t\r]+ -> skip;