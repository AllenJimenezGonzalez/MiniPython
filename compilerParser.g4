parser grammar compilerParser;

options{
  tokenVocab = compilerScanner;
}

program                             :   statement(statement)* EOF                                                       #programAST;
statement                           :   defStatement                                                                    #defStatamentS
                                    |   ifStatement                                                                     #ifStatementS
                                    |   returnStatement                                                                 #returnStatementS
                                    |   printStatement                                                                  #printStatementS
                                    |   whileStatement                                                                  #whileStatementS
                                    |   assignStatement                                                                 #assignStatementS
                                    |   functionCallStatement                                                           #functionCallStatementS;

defStatement                        :   DEF ID LEFTPARENTHESIS argList RIGTHPARENTHESIS TWODOTS sequence                #defStatementAST;
argList                             :   (ID moreArgs)?                                                                  #argListAST;
moreArgs                            :   (COMMA ID)*                                                                     #moreArgsAST;
ifStatement                         :   IF expression TWODOTS sequence (ELSE TWODOTS sequence)?                         #ifStatementAST;
whileStatement                      :   WHILE expression TWODOTS sequence                                               #whileStatementAST;
returnStatement                     :   RETURN expression NEWLINE                                                       #returnStatementAST;
printStatement                      :   PRINT LEFTPARENTHESIS expression RIGTHPARENTHESIS NEWLINE                       #printStatementAST;
assignStatement                     :   ID ASSIGN expression NEWLINE                                                    #assignStatementAST;
functionCallStatement               :   primitiveExpression LEFTPARENTHESIS expressionList RIGTHPARENTHESIS NEWLINE     #functionCallStatementAST;
sequence                            :   NEWLINE moreStatement SEQUENCECLOSE NEWLINE                                     #sequenceAST;
moreStatement                       :   statement(statement)*                                                           #moreStatementAST;
expression                          :   additionExpression comparison                                                   #expressionAST;

comparison                          :   ((COMPARESMALLER
                                    |   COMPAREBIGGER
                                    |   COMPARESMALLEREQUAL
                                    |   COMPAREBIGGEREQUAL
                                    |   EQUAL) additionExpression)*                                                     #comparisonAST;

additionExpression                  :   multiplicationExpression additionFactor                                         #additionExpressionAST;
additionFactor                      :   ((SUM | SUBSTRACT) multiplicationExpression)*                                   #additionFactorAST;
multiplicationExpression            :   elementExpression multiplicationFactor                                          #multiplicationExpressionAST;
multiplicationFactor                :   ((MULTIPLY | DIVIDE) elementExpression)*                                        #multiplicationFactorAST;
elementExpression                   :   primitiveExpression elementAccess                                               #elementExpressionAST;
elementAccess                       :   (LEFTKEY expression RIGTHKEY)*                                                  #elementAccessAST;
functionCallExpression              :   ID LEFTPARENTHESIS expressionList RIGTHPARENTHESIS                              #functionCallExpressionAST;
expressionList                      :   (expression moreExpressions )?                                                  #expressionListAST;
moreExpressions                     :   (COMMA expression)*                                                             #moreExpressionsAST;
primitiveExpression                 :   (INTEGER
                                    |   STRING
                                    |   ID
                                    |   CHAR
                                    |   LEFTPARENTHESIS expression RIGTHPARENTHESIS
                                    |   listExpression
                                    |   LEN LEFTPARENTHESIS expression RIGTHPARENTHESIS
                                    |   functionCallExpression )                                                        #primitiveExpressionAST;
listExpression                      :   LEFTKEY expressionList RIGTHKEY                                                 #listExpressionAST;



