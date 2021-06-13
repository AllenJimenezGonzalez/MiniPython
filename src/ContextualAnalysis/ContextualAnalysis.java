package ContextualAnalysis;

import generated.*;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.SortedMap;

public class ContextualAnalysis extends compilerParserBaseVisitor {
    SymbolsTable symbolsTable = new SymbolsTable();
    ErrorManager errorManager = ErrorManager.getInstance();

    @Override
    public Object visitProgramAST(compilerParser.ProgramASTContext ctx) {
        for (compilerParser.StatementContext statementContext : ctx.statement()) {
            this.visit(statementContext);
        }
        return null;
    }

    //********************************Start Statements********************************
    @Override
    public Object visitDefStatamentS(compilerParser.DefStatamentSContext ctx) {
        return this.visit(ctx.defStatement());
    }

    @Override
    public Object visitIfStatementS(compilerParser.IfStatementSContext ctx) {
        return this.visit(ctx.ifStatement());
    }

    @Override
    public Object visitReturnStatementS(compilerParser.ReturnStatementSContext ctx) {
        return this.visit(ctx.returnStatement());
    }

    @Override
    public Object visitPrintStatementS(compilerParser.PrintStatementSContext ctx) {
        return this.visit(ctx.printStatement());
    }

    @Override
    public Object visitWhileStatementS(compilerParser.WhileStatementSContext ctx) {
        return this.visit(ctx.whileStatement());
    }

    @Override
    public Object visitAssignStatementS(compilerParser.AssignStatementSContext ctx) {
        return this.visit(ctx.assignStatement());
    }

    @Override
    public Object visitFunctionCallStatementS(compilerParser.FunctionCallStatementSContext ctx) {
        return this.visit(ctx.functionCallStatement());
    }

    //********************************End Statements********************************
    @Override
    public Object visitDefStatementAST(compilerParser.DefStatementASTContext ctx) {
        if (symbolsTable.searchSymbol(ctx.ID().getSymbol().getText()) != null) {
            errorManager.errorMessages.add(errorCreator("this function " + ctx.ID().getSymbol().getText() + " is already defined in this scope", ctx.ID().getSymbol().getLine()));
        } else {
            int paramQuantity = 0;

            if (ctx.argList() != null) {
                paramQuantity = (int) this.visit(ctx.argList());
            }

            symbolsTable.insertSymbol(new SymbolFunction(ctx.ID().getSymbol(), "object", paramQuantity));

            if (ctx.sequence() != null) {
                this.visit(ctx.sequence());
            }

        }

        return null;
    }

    @Override
    public Object visitArgListAST(compilerParser.ArgListASTContext ctx) {
        int paramQuantity = 0;
        symbolsTable.openScope();
        if (ctx.ID() != null && symbolsTable.searchSymbol(ctx.ID().getSymbol().getText()) != null) {
            errorManager.errorMessages.add(errorCreator("this variable " + ctx.ID().getSymbol().getText() + " is already defined in this scope", ctx.ID().getSymbol().getLine()));
        } else {
            if (ctx.ID() != null) {
                paramQuantity++;
                symbolsTable.insertSymbol(new SymbolVariable(ctx.ID().getSymbol(), "object", false));
            }
        }

        if (ctx.moreArgs() != null) {
            paramQuantity += (int) this.visit(ctx.moreArgs());

        }

        symbolsTable.closeScope();


        return paramQuantity;
    }

    @Override
    public Object visitMoreArgsAST(compilerParser.MoreArgsASTContext ctx) {
        for (TerminalNode terminalNode : ctx.ID()) {
            if (symbolsTable.searchSymbol(terminalNode.getSymbol().getText()) != null) {
                errorManager.errorMessages.add(errorCreator("this variable " + terminalNode.getText() + " is already defined in this scope", terminalNode.getSymbol().getLine()));
            }
        }
        return ctx.ID().size();
    }

    @Override
    public Object visitIfStatementAST(compilerParser.IfStatementASTContext ctx) {

        if (ctx.expression() != null) {
            String expressionType = (String) this.visit(ctx.expression());
            if (!expressionType.equals("boolean")) {
                errorManager.errorMessages.add(errorCreator("the if params cannot be diferent of boolean actual is " + expressionType, 0));
            }
        }

        for (compilerParser.SequenceContext sequenceContext : ctx.sequence()) {
            this.visit(sequenceContext);
        }
        return null;
    }

    @Override
    public Object visitWhileStatementAST(compilerParser.WhileStatementASTContext ctx) {

        if (ctx.expression() != null) {
            String expressionType = (String) this.visit(ctx.expression());
            if (!expressionType.equals("boolean")) {
                errorManager.errorMessages.add(errorCreator("the while params cannot be diferent of boolean actual " + expressionType, 0));
            }
        }

        if (ctx.sequence() != null) {
            this.visit(ctx.sequence());
        }

        return null;
    }

    @Override
    public Object visitReturnStatementAST(compilerParser.ReturnStatementASTContext ctx) {
        this.visit(ctx.expression());
        return null;
    }

    @Override
    public Object visitPrintStatementAST(compilerParser.PrintStatementASTContext ctx) {
        this.visit(ctx.expression());
        return null;
    }

    @Override
    public Object visitAssignStatementAST(compilerParser.AssignStatementASTContext ctx) {

        boolean isArray = ctx.getText().contains("[") && ctx.getText().contains("]");

        if (ctx.ASSIGN() == null) {
            errorManager.errorMessages.add(errorCreator("you cant create a variable without assignation", ctx.ID().getSymbol().getLine()));
        }

        String expressionType = (String) this.visit(ctx.expression());
        if (ctx.ID() != null) {
            SymbolVariable symbolVariable = (SymbolVariable) symbolsTable.searchSymbolAll(ctx.ID().getSymbol().getText());
            if (symbolVariable != null) {
                symbolVariable.type = expressionType;
                symbolVariable.isArray = isArray;
            } else {
                symbolsTable.insertSymbol(new SymbolVariable(ctx.ID().getSymbol(), expressionType, isArray));
            }
        }

        return null;
    }

    @Override
    public Object visitFunctionCallStatementAST(compilerParser.FunctionCallStatementASTContext ctx) {


        if(ctx.expressionList()!=null){
            this.visit(ctx.expressionList());
        }
        if(ctx.primitiveExpression()!=null){
            this.visit(ctx.primitiveExpression());
        }


        return null;
    }

    @Override
    public Object visitSequenceAST(compilerParser.SequenceASTContext ctx) {
        this.visit(ctx.moreStatement());
        return ctx.getText();
    }

    @Override
    public Object visitMoreStatementAST(compilerParser.MoreStatementASTContext ctx) {
        for (compilerParser.StatementContext statementContext : ctx.statement()) {
            this.visit(statementContext);
        }
        return null;
    }

    @Override
    public Object visitExpressionAST(compilerParser.ExpressionASTContext ctx) {

        String typeAddition = (String) this.visit(ctx.additionExpression());
        String typeComparison = (String) this.visit(ctx.comparison());

        if (typeAddition.equals(typeComparison)) {
            return typeAddition;
        } else if (!typeAddition.equals("null") && typeComparison.equals("null")) {
            return typeAddition;
        } else if (typeAddition.equals("null") && !typeComparison.equals("null")) {
            return typeComparison;
        }else if(typeAddition.equals("int") && typeComparison.equals("boolean")){
            return "boolean";
        } else {
            return "null";
        }

    }

    @Override
    public Object visitComparisonAST(compilerParser.ComparisonASTContext ctx) {
        for (compilerParser.AdditionExpressionContext additionExpressionContext : ctx.additionExpression()) {
            String comparisonType = (String) this.visit(additionExpressionContext);
            if (!comparisonType.equals("int")) {
                errorManager.errorMessages.add(errorCreator("the operators like < > <= >= == only can be used by integers", additionExpressionContext.getRuleIndex()));
                return "null";
            }
        }

        if(ctx.getText().contains("<")
                || ctx.getText().contains(">")
                || ctx.getText().contains("<=")
                || ctx.getText().contains(">=")
                || ctx.getText().contains("==")){
            return "boolean";
        }else{
            return "null";
        }

    }

    @Override
    public Object visitAdditionExpressionAST(compilerParser.AdditionExpressionASTContext ctx) {

        String additionFactor = (String) this.visit(ctx.additionFactor());
        String multiplicationExpression = (String) this.visit(ctx.multiplicationExpression());

        if (additionFactor.equals(multiplicationExpression)) {
            return additionFactor;
        } else if (!additionFactor.equals("null") && multiplicationExpression.equals("null")) {
            return additionFactor;
        } else if (additionFactor.equals("null") && !multiplicationExpression.equals("null")) {
            return multiplicationExpression;
        } else {
            errorManager.errorMessages.add(errorCreator("you cant operate "+ additionFactor + " type with "+ multiplicationExpression,0));
            return "null";
        }

    }

    @Override
    public Object visitAdditionFactorAST(compilerParser.AdditionFactorASTContext ctx) {
        String initType = "int";
        int index = 0;
        for (compilerParser.MultiplicationExpressionContext multiplicationExpressionContext : ctx.multiplicationExpression()) {
            String actualType = (String) this.visit(multiplicationExpressionContext);
            if (index == 0) {
                initType = actualType;
            } else {
                if (!initType.equals(actualType)) {
                    errorManager.errorMessages.add(errorCreator("the actual type " + actualType + " cannot be operated with initial type " + initType, 0));
                    return "null";
                }
            }
            index++;
        }
        if(ctx.multiplicationExpression().size()>0) {
            return initType;
        }else{
            return "null";
        }
    }

    @Override
    public Object visitMultiplicationExpressionAST(compilerParser.MultiplicationExpressionASTContext ctx) {

        String elementExpressionType = (String) this.visit(ctx.elementExpression());
        String multiplicationFactor = (String) this.visit(ctx.multiplicationFactor());

        if (!multiplicationFactor.equals("null") && elementExpressionType.equals("null")) {
            return multiplicationFactor;
        } else if (elementExpressionType.equals(multiplicationFactor) && elementExpressionType.equals("int")) {
            return elementExpressionType;
        } else if (!elementExpressionType.equals("null") && multiplicationFactor.equals("null")) {
            return elementExpressionType;
        } else {
            return "null";
        }

    }

    @Override
    public Object visitMultiplicationFactorAST(compilerParser.MultiplicationFactorASTContext ctx) {
        for (compilerParser.ElementExpressionContext elementExpressionContext : ctx.elementExpression()) {
            String actualType = (String) this.visit(elementExpressionContext);
            if (!actualType.equals("int")) {
                errorManager.errorMessages.add(errorCreator("the actual type " + actualType + " cannot be operated with initial type int", 0));
                return "null";
            }
        }
        if(ctx.elementExpression().size() > 0) {
            return "int";
        }else{
            return "null";
        }

    }

    @Override
    public Object visitElementExpressionAST(compilerParser.ElementExpressionASTContext ctx) {

        String primitiveExpressionType = (String) this.visit(ctx.primitiveExpression());
        String elementAccessType = (String) this.visit(ctx.elementAccess());


        if (!primitiveExpressionType.equals("null") && elementAccessType.equals("null")) {
            return primitiveExpressionType;
        } else if (!primitiveExpressionType.equals("null")
                && !primitiveExpressionType.equals("int")
                && !primitiveExpressionType.equals("String")
                && !primitiveExpressionType.equals("char")
                && !elementAccessType.equals("null")) {

            SymbolVariable symbolVariable = (SymbolVariable) symbolsTable.searchSymbolAll(ctx.primitiveExpression().getText());
            if (symbolVariable != null) {
                if (symbolVariable.isArray) {
                    return symbolVariable.type;
                } else {

                    errorManager.errorMessages.add(errorCreator("the variable " + symbolVariable.token.getText() + " is not a list ADDITIONAL INFORMATION: " + primitiveExpressionType, 0));
                    return "null";
                }
            } else {

                errorManager.errorMessages.add(errorCreator("the list variable dont exist or has mixed types ", 0));
                return "null";
            }

        } else {
            return "null";
        }


    }

    @Override
    public Object visitElementAccessAST(compilerParser.ElementAccessASTContext ctx) {
        for (compilerParser.ExpressionContext expressionContext : ctx.expression()) {
            String expressionType = (String) this.visit(expressionContext);
            if (!expressionType.equals("int")) {
                errorManager.errorMessages.add(errorCreator("the list lookup cannot be used by " + expressionType + " variables, only by integers ADDITIONAL INFO: " + expressionType, 0));
                return "null";
            }
        }
        if(ctx.expression().size() > 0) {
            return "int";
        }else{
            return "null";
        }

    }

    @Override
    public Object visitFunctionCallExpressionAST(compilerParser.FunctionCallExpressionASTContext ctx) {

        SymbolFunction symbolFunction = (SymbolFunction) symbolsTable.searchSymbolAll(ctx.ID().getSymbol().getText());
        int actualParamsQuantity = 0;
        if(ctx.expressionList().getText().contains(",")){
            actualParamsQuantity = ctx.expressionList().getText().split(",").length;
        }else{
            if(!ctx.expressionList().getText().equals("")){
                actualParamsQuantity = 1;
            }
        }

        if(ctx.LEFTPARENTHESIS() == null || ctx.RIGTHPARENTHESIS() == null){
            errorManager.errorMessages.add(errorCreator("the function "+ctx.ID().getSymbol().getText()+" require parenthesis <example()> to be called",ctx.ID().getSymbol().getLine()));
        }

        if(symbolFunction == null){
            errorManager.errorMessages.add(errorCreator("the function "+ctx.ID().getSymbol().getText()+" is not declared in this scope",ctx.ID().getSymbol().getLine()));
            return "null";
        }else{
            if(actualParamsQuantity == symbolFunction.parametersQuantity){
                return symbolFunction.type;
            }else{
                errorManager.errorMessages.add(errorCreator("the quantity of params function "+ctx.ID().getSymbol().getText()+" is "+symbolFunction.parametersQuantity+" dont math with the call function quantity "+ actualParamsQuantity,ctx.ID().getSymbol().getLine()));
                return "null";
            }

        }

    }

    @Override
    public Object visitExpressionListAST(compilerParser.ExpressionListASTContext ctx) {

        String expressionType = (String) this.visit(ctx.expression());
        String moreExpressionsType = (String) this.visit(ctx.moreExpressions());

        if (moreExpressionsType.equals("null")) {
            errorManager.errorMessages.add(errorCreator("this list expressions types cannot be mixed", 0));
            return "null";
        }

        if (expressionType.equals(moreExpressionsType)) {
            return expressionType;
        } else {
            errorManager.errorMessages.add(errorCreator("this list expressions variables types cannot be mixed", 0));
            return "null";
        }

    }

    @Override
    public Object visitMoreExpressionsAST(compilerParser.MoreExpressionsASTContext ctx) {
        int index = 0;
        String initType = "";
        for (compilerParser.ExpressionContext expressionContext : ctx.expression()) {
            String actualType = (String) this.visit(expressionContext);
            if (index == 0) {
                initType = actualType;
            } else {
                if (!actualType.equals(initType)) {
                    errorManager.errorMessages.add(errorCreator("the values of operation not match with the init type: " + initType, 0));
                }
            }

            index++;
        }

        return initType;
    }

    @Override
    public Object visitPrimitiveExpressionAST(compilerParser.PrimitiveExpressionASTContext ctx) {
        if (ctx.STRING() != null) {
            return "string";
        } else if (ctx.INTEGER() != null) {
            return "int";
        } else if (ctx.ID() != null) {
            Symbol symbol = symbolsTable.searchSymbolAll(ctx.ID().getSymbol().getText());
            if (symbol != null) {
                return symbol.type;
            } else {
                errorManager.errorMessages.add(errorCreator("the variable " + ctx.ID().getSymbol().getText() + " is not defined in this scope", ctx.ID().getSymbol().getLine()));
                return "null";
            }
        } else if (ctx.CHAR() != null) {
            return "char";
        } else if (ctx.LEN() != null) {
            return "int";
        } else if (ctx.expression() != null && ctx.LEFTPARENTHESIS() != null && ctx.RIGTHPARENTHESIS() != null) {
            return this.visit(ctx.expression());
        } else if (ctx.listExpression() != null) {
            return this.visit(ctx.listExpression());
        } else {
            if(ctx.functionCallExpression()!=null) {
                return this.visit(ctx.functionCallExpression());
            }else{
                return "null";
            }
        }

    }

    @Override
    public Object visitListExpressionAST(compilerParser.ListExpressionASTContext ctx) {
        return this.visit(ctx.expressionList());
    }

    public String errorCreator(String msg, int level) {
        return "CONTEXTUAL ERROR -" + msg + " on line " + level;
    }
}
