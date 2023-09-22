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
| '{' statementsequence '}' //kanske ej behövs
;

statementsequence
: statement ';' statementsequence ;

deklarera
: 'var' ID | 'var' tilldela
;

whileloop: 'medan' condition '{' code '}' ; // Syntax för en while-loop

condition: expr COMPARABLE expr ; // Uppdaterad condition-regel för jämförelseuttryck

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
| COMPARABLE
;

ID: ('a'..'z')+ ;
INT: ('0'..'9')+ ;
COMPARABLE: ('<' | '>' | '==' | '!=' | '<=' | '>=');
WS: [ \n\t\r]+ -> skip;