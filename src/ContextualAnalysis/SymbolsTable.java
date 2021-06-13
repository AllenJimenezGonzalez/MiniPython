package ContextualAnalysis;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.LinkedList;
import generated.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class SymbolsTable {

    public int scopeLevel = 0;

    public LinkedList<LinkedList<Symbol>> symbols;

    public SymbolsTable() {
        LinkedList<Symbol> subScope = new LinkedList<>();
        this.symbols = new LinkedList<>();
        symbols.add(subScope);
    }

    public Symbol searchSymbol(String id) {

        for (Symbol symbolInformation : symbols.get(scopeLevel)) {

            if (symbolInformation.token.getText().equals(id)) {

                if (symbolInformation instanceof SymbolFunction) {
                    return (SymbolFunction) symbolInformation;
                } else if (symbolInformation instanceof SymbolVariable) {
                    return (SymbolVariable) symbolInformation;
                } else {
                    return symbolInformation;
                }

            }

        }
        return null;

    }

    public Symbol searchSymbolAll(String id) {

        for (LinkedList<Symbol> symbolInformation : symbols) {
            for (Symbol symbol : symbolInformation) {
                if (symbol.token.getText().equals(id)) {

                    if (symbol instanceof SymbolFunction) {
                        return (SymbolFunction) symbol;
                    } else if (symbol instanceof SymbolVariable) {
                        return (SymbolVariable) symbol;
                    } else {
                        return symbol;
                    }

                }
            }


        }
        return null;

    }

    public Symbol searchSymbolAll(String id, String searchType) {

        for (LinkedList<Symbol> symbolInformation : symbols) {
            for (Symbol symbol : symbolInformation) {
                if (symbol.token.getText().equals(id)) {
                    if (searchType.equals("function") && symbol instanceof SymbolFunction) {
                        return (SymbolFunction) symbol;
                    }else if (searchType.equals("variable") && symbol instanceof SymbolVariable) {
                        return (SymbolVariable) symbol;
                    }
                }
            }
        }
        return null;
    }


    public void insertSymbol(Symbol symbolInformation) {
        if (symbols.get(scopeLevel) == null) {
            LinkedList<Symbol> subScope = new LinkedList<>();
            subScope.add(symbolInformation);
            symbols.add(subScope);
        } else {
            symbols.get(scopeLevel).add(symbolInformation);
        }

    }

    public void openScope() {
        scopeLevel += 1;
        LinkedList<Symbol> subScope = new LinkedList<>();
        symbols.add(subScope);
    }

    public void closeScope() {
        symbols.remove(scopeLevel);
        scopeLevel--;
    }

    public void printSymbols(){
        int level = 0;
        StringBuilder spaces = new StringBuilder();
        for (LinkedList<Symbol> symbolSubList : symbols) {
            for (Symbol symbol : symbolSubList) {
                System.out.printf("\n%sActualLevel %d Token %s\n",spaces,level,symbol.token.getText());
            }
            spaces.append(" ");
            level++;
        }
        System.out.println();
    }
}
