import grammar.MwayLexer;
import grammar.MwayParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;
import java.util.Scanner;

public class RunCompiler {

    public static void main(String[] args) throws IOException {
        String inFile;
        String outFile;

        MwayCompiler compiler = new MwayCompiler();

        System.out.println("Vilket program vill du kompilera?");
        Scanner scanner = new Scanner(System.in);
        inFile = scanner.nextLine();

        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(inFile));
        MwayLexer lexer = new MwayLexer((CharStream) input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MwayParser parser = new MwayParser(tokens);
        MwayParser.FileContext tree = parser.file();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new MwayCompiler(), tree);

        System.out.println("Vad ska den kompilerade filen heta?");
        outFile = scanner.nextLine();

<<<<<<< HEAD
<<<<<<< HEAD
        Writer w = new OutputStreamWriter(new FileOutputStream(outFile), "US-ASCII");
        //w.write(compiler.getCompiledCode());
        w.flush();
=======
        Writer w = new OutputStreamWriter(new FileOutputStream(outFile));
        w.write(compiler.getCompiledCode());
>>>>>>> parent of ecea7fb (update)
=======
        Writer w = new OutputStreamWriter(new FileOutputStream(outFile));
        w.write(compiler.getCompiledCode());
>>>>>>> parent of ecea7fb (update)
        w.close();




    }
}
