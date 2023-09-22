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
| whileloop
;

statementsequence
: statement ';' statementsequence ;

deklarera
: 'var' ID | 'var' tilldela
;

whileloop: condition 'gor' statement statement 'sluta'; // Syntax för en while-loop

condition: 'medan' atomicexpr COMPARABLE atomicexpr ; // Uppdaterad condition-regel för jämförelseuttryck

skrivut: 'skriv' expr;

tilldela: ID '=' expr;

expr
: addexpr | atomicexpr
;

addexpr
: atomicexpr '+' expr
;

atomicexpr
: ID
| INT
;

ID: ('a'..'z')+ ;
INT: ('0'..'9')+ ;
COMPARABLE: ('<' | '>' | '==' | '!=' | '<=' | '>=');
WS: [ \n\t\r]+ -> skip;