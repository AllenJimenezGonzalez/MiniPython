import generated.*;
import ContextualAnalysis.*;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class Main {

    public static void main(String[] args) {
        compilerScanner inst = null;
        compilerParser parser = null;
        ParseTree tree=null;

        CharStream input=null;
        CommonTokenStream tokens = null;
        ErrorManager errorListener = null;

        ContextualAnalysis ac=null;
        try {
            input = CharStreams.fromFileName("code.txt");
            inst = new compilerScanner(input);
            tokens = new CommonTokenStream(inst);
            parser = new compilerParser(tokens);
            errorListener = ErrorManager.getInstance();
            inst.removeErrorListeners();
            inst.addErrorListener( errorListener );
            parser.removeErrorListeners();
            parser.addErrorListener ( errorListener );



            try {

                tree = parser.program();

                ac = new ContextualAnalysis();
                ac.visit(tree);


            }
            catch(RecognitionException e){
                System.out.println("Error");
                e.printStackTrace();
            }

            if (!errorListener.hasErrors() && errorListener.errorMessages.size() == 0) {
                System.out.println("Success project build\n");
                java.util.concurrent.Future<JFrame> treeGUI = org.antlr.v4.gui.Trees.inspect(tree, parser);
                treeGUI.get().setVisible(true);
            }
            else {
                System.out.println("Fail project build\n    ->Error list:");
                System.out.println(errorListener.toString());
            }


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
