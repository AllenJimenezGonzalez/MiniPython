package ContextualAnalysis;

import generated.compilerParser;
import generated.compilerScanner;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.util.ArrayList;

public class ErrorManager extends BaseErrorListener {
    private static ErrorManager instance = null;

    public static ErrorManager getInstance(){
        if(instance == null){
            instance = new ErrorManager();
        }
        return instance;
    }

    public ArrayList<String> errorMessages = new ArrayList<String>();



    public ErrorManager(){
        this.errorMessages = new ArrayList<String>();
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line,
                            int charPositionInLine,
                            String msg,
                            RecognitionException re) {
        if (recognizer instanceof compilerParser)
            errorMessages.add("PARSER ERROR - line "+line+":"+charPositionInLine + " " + msg);
        else if (recognizer instanceof compilerScanner)
            errorMessages.add("SCANNER ERROR - line "+line+":"+charPositionInLine + " " + msg );
        else
            errorMessages.add("Other Error");
    }



    public boolean hasErrors ( )
    {
        return this.errorMessages.size() > 0;
    }

    @Override
    public String toString ( )
    {
        if ( !hasErrors() ) return "0 errors";
        StringBuilder builder = new StringBuilder();
        for ( String s : errorMessages)
        {
            builder.append ( String.format( "       ->%s\n", s ) );
        }
        return builder.toString();
    }
}
