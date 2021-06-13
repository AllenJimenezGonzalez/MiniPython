package ContextualAnalysis;

import org.antlr.v4.runtime.Token;

public class SymbolFunction extends Symbol{
    public int parametersQuantity;
    public SymbolFunction(Token token, String type,int parametersQuantity){
        super(token,type);
        this.parametersQuantity = parametersQuantity;
    }
}
