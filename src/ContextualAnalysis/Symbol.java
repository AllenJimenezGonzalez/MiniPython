package ContextualAnalysis;

import org.antlr.v4.runtime.Token;

public abstract class Symbol {

    public Token token;
    public String type;

    public Symbol(Token token, String type){
        this.token = token;
        this.type = type;
    }

}
