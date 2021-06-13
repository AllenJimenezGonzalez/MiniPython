lexer grammar compilerScanner;

//Reserved words

DEF                         :   'def';
WHILE                       :   'while';
IF                          :   'if';
ELSE                        :   'else';
RETURN                      :   'return';
PRINT                       :   'print';
LEN                         :   'len';

ID                          :   (LETTER|'_')('_'|LETTER|NUMBER)*;
INTEGER                     :   NUMBER(NUMBER)*;

STRING                      :   '"' (LETTER|NUMBER|'$'|COMPAREBIGGER|COMPARESMALLER|COMPAREBIGGEREQUAL
                                |COMPARESMALLEREQUAL|ASSIGN|'#'|'%'|'&'|LEFTPARENTHESIS|RIGTHPARENTHESIS
                                |MULTIPLY|SUM|COMMA|SUBSTRACT|'.'|DIVIDE|TWODOTS|ASSIGN|'@'|LEFTKEY|RIGTHKEY
                                |'\\'|'_'|LEFTBRACKET|RIGTHBRACKET|'|'|'~'|'`'|' ' )
                                (LETTER|NUMBER|'$'|COMPAREBIGGER|COMPARESMALLER|COMPAREBIGGEREQUAL
                                |COMPARESMALLEREQUAL|ASSIGN|'#'|'%'|'&'|LEFTPARENTHESIS|RIGTHPARENTHESIS
                                |MULTIPLY|SUM|COMMA|SUBSTRACT|'.'|DIVIDE|TWODOTS|ASSIGN|'@'|LEFTKEY|RIGTHKEY
                                |'\\'|'_'|LEFTBRACKET|RIGTHBRACKET|'|'|'~'|'`'|' ' )* '"';

CHAR                        :   '\'' (LETTER|NUMBER|'$'|COMPAREBIGGER|COMPARESMALLER|COMPAREBIGGEREQUAL
                                |COMPARESMALLEREQUAL|ASSIGN|'#'|'%'|'&'|LEFTPARENTHESIS|RIGTHPARENTHESIS
                                |MULTIPLY|SUM|COMMA|SUBSTRACT|'.'|DIVIDE|TWODOTS|ASSIGN|'@'|LEFTKEY|RIGTHKEY
                                |'\\'|'_'|LEFTBRACKET|RIGTHBRACKET|'|'|'~'|'`'|' ' )
                                (LETTER|NUMBER|'$'|COMPAREBIGGER|COMPARESMALLER|COMPAREBIGGEREQUAL
                                |COMPARESMALLEREQUAL|ASSIGN|'#'|'%'|'&'|LEFTPARENTHESIS|RIGTHPARENTHESIS
                                |MULTIPLY|SUM|COMMA|SUBSTRACT|'.'|DIVIDE|TWODOTS|ASSIGN|'@'|LEFTKEY|RIGTHKEY
                                |'\\'|'_'|LEFTBRACKET|RIGTHBRACKET|'|'|'~'|'`'|' ' )* '\'';




//Symbols
COMMA                       :   ',';
TWODOTS                     :   ':';
ASSIGN                      :   '=';
EQUAL                       :   '==';
COMPAREBIGGER               :   '>';
COMPARESMALLER              :   '<';
NOTEQUAL                    :   '!=';
COMPAREBIGGEREQUAL          :   '>=';
COMPARESMALLEREQUAL         :   '<=';
SUM                         :   '+';
SUBSTRACT                   :   '-';
DIVIDE                      :   '/';
MULTIPLY                    :   '*';
LEFTBRACKET                 :   '{';
RIGTHBRACKET                :   '}';
LEFTKEY                     :   '[';
RIGTHKEY                    :   ']';
LEFTPARENTHESIS             :   '(';
RIGTHPARENTHESIS            :   ')';
SEQUENCECLOSE               :   '$';

NEWLINE                     :   '\r'? '\n' | '\r';
WS                          :   [ \t\r]+ -> skip;

fragment LETTER             :   [a-zA-Z];
fragment NUMBER             :   [0-9];




