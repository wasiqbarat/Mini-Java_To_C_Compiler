package cli;

import ast.Program;
import main.MiniJavaLexer;
import main.MiniJavaParser;
import sem.SemanticAnalyzer;
import sem.SemanticException;
import tac.TacGenerator;
import cgen.CGenerator;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filePath;
        if (args.length == 0) {
            System.out.print("Enter MiniJava source file path (or '-' to paste source): ");
            filePath = scanner.nextLine().trim();
        } else {
            filePath = args[0];
        }
        try {
            // Create a CharStream from the input source
            CharStream input;
            if ("-".equals(filePath)) {
                System.out.println("Enter MiniJava source code. Finish with EOF (Ctrl+D):");
                StringBuilder sb = new StringBuilder();
                while (scanner.hasNextLine()) {
                    sb.append(scanner.nextLine()).append('\n');
                }
                input = CharStreams.fromString(sb.toString());
            } else {
                input = CharStreams.fromFileName(filePath);
            }

            // Create a lexer
            MiniJavaLexer lexer = new MiniJavaLexer(input);

            // Create a token stream
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Create a parser
            MiniJavaParser parser = new MiniJavaParser(tokens);

            // Parse the program to get a parse tree
            MiniJavaParser.ProgramContext tree = parser.program();

            // Build the AST from the parse tree
            AstBuilder astBuilder = new AstBuilder();
            Program ast = (Program) astBuilder.visit(tree);

            // Run semantic analysis before continuing
            SemanticAnalyzer analyzer = new SemanticAnalyzer();
            try {
                analyzer.analyze(ast);
                System.out.println("Semantic analysis succeeded.");
            } catch (SemanticException se) {
                System.err.println("Semantic error: " + se.getMessage());
                return;
            }

            // Print the AST in a readable format
            AstPrinter printer = new AstPrinter(System.out);
            printer.print(ast);

            // Generate and print Three Address Code
            TacGenerator tacGen = new TacGenerator();
            var tac = tacGen.generate(ast);
            System.out.println("TAC:");
            tac.forEach(System.out::println);

            // Generate and print C code
            CGenerator cGen = new CGenerator();
            var c = cGen.generate(ast);
            System.out.println("\nGenerated C code:\n");
            System.out.println(c);

        } catch (IOException e) {
            System.err.println("Error reading file: " + filePath);
            e.printStackTrace();
        }
    }
}
