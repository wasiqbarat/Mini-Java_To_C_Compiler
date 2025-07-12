Project Document link:
```
https://www.m-zakeri.ir/Compilers/projects/spring2025/minijava-to-c-compiler-development-spring2025/
```

# Mini-Java to C Compiler

This project is a compiler that translates Mini-Java code into C code, including the generation of Three-Address Code (TAC). This project is part of the Compiler Design course and is intended to provide a hands-on understanding of the key components of a compiler.

## About the Project

The compiler is divided into four main parts:

* **Lexer (Lexical Analysis):** The lexer breaks down the source Mini-Java code into a stream of tokens.
* **Parser (Syntax Analysis):** The parser takes the tokens from the lexer and builds an Abstract Syntax Tree (AST).
* **Semantic Analyzer:** The semantic analyzer checks the source code for semantic errors, such as type mismatches and undeclared variables.
* **Code Generator:** The code generator translates the AST into an intermediate representation (Three-Address Code) and then into C code.

## Features

* **Lexical Analysis:** The lexer can recognize and tokenize Mini-Java code, including keywords, operators, identifiers, and literals.
* **Syntax Analysis:** The parser can build an AST from a stream of tokens, ensuring that the code is syntactically correct.
* **Semantic Analysis:** The semantic analyzer can detect and report semantic errors in the source code.
* **Code Generation:** The code generator can produce Three-Address Code and C code from an AST.

## Getting Started

To get started with this project, you will need to have a working knowledge of Java and C. You will also need to be familiar with the concepts of lexical analysis, syntax analysis, semantic analysis, and code generation.

## Phases

The project is divided into the following phases:

1.  **Lexical Analysis:** In this phase, you will implement the lexer for the Mini-Java language.
2.  **Syntax Analysis:** In this phase, you will implement the parser for the Mini-Java language.
3.  **Semantic Analysis:** In this phase, you will implement the semantic analyzer for the Mini-Java language.
4.  **Code Generation:** In this phase, you will implement the code generator for the Mini-Java language.

## How to Contribute

To contribute to this project, you can fork the repository on GitHub and submit a pull request. You can also open an issue on GitHub to report a bug or request a new feature.

## Running the Compiler

After building the project with Maven, run the `cli.Main` class and provide the
Mini-Java source file path (or `-` to read from standard input). The compiler
parses the file, performs semantic analysis and prints the resulting AST.

```
mvn -q package
java -cp target/mini-java-compiler-1.0-SNAPSHOT.jar cli.Main Factorial.java
```

If a semantic error is encountered, the message will be printed and compilation
stops.
