import java.io.*;
import java.util.Scanner;

import grammar.MwayLexer;
import grammar.MwayParser;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
public class RunXpres {
    public static void main(String[] args) throws IOException {
        String infnam;
        if (args.length > 0) {
            infnam = args[0];
        } else {
            System.out.println("Vilken fil vill du köra?");
            Scanner scanner = new Scanner(System.in);
            infnam = scanner.nextLine();
        }
        //CharStream input = CharStreams.fromFileName(infnam);

        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(infnam));
        MwayLexer lexer = new MwayLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MwayParser parser = new MwayParser(tokens);
        ParseTree tree = parser.code();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new Interpreter(infnam), tree);


    }
}
