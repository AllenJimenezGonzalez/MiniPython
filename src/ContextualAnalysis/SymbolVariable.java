package ContextualAnalysis;

import org.antlr.v4.runtime.Token;

public class SymbolVariable extends Symbol{
    public boolean isArray;
    public SymbolVariable(Token token,String type,boolean isArray){
        super(token,type);
        this.isArray = isArray;
    }
}
