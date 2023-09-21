import grammar.MwayBaseListener;
import grammar.*;
import grammar.MwayParser;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.TokenSource;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import java.io.*;
import java.util.Scanner;

public class MwayCompilerx extends MwayBaseListener {
    public static void main(String[] args) throws IOException {
        String infnam;
        String outfnam = args[1];
        boolean traceOn = args.length < 3 || "traceOn".equalsIgnoreCase(args[2]);

        MwayCompiler compiler = new MwayCompiler();

        if (args.length > 0) {
            infnam = args[0];
        } else {
            System.out.println("Vilken fil vill du köra?");
            Scanner scanner = new Scanner(System.in);
            infnam = scanner.nextLine();
        }

        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(infnam));
        MwayLexer lexer = new MwayLexer((CharStream) input);
        CommonTokenStream tokens = new CommonTokenStream((TokenSource) lexer);
        MwayParser parser = new MwayParser((TokenStream) tokens);
        ParseTree tree = parser.file();
        ParseTreeWalker walker = new ParseTreeWalker();
        HackGen out = new HackGen(1024, 2048, 1025);
        walker.walk(compiler, tree);
        Writer w = new OutputStreamWriter(new FileOutputStream(outfnam), "US-ASCII");
        out.outputCode(w);
        w.close();
    }
}
