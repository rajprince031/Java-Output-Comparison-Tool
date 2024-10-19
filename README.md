# Java Output Comparison Tool

This repository contains a Java-based tool designed to compare the outputs of two different Java programs. It generates random test cases, executes both programs with the same inputs, and checks if their outputs match. This tool is invaluable for validating the correctness of different implementations of a given algorithm or solution.

## Key Features

- **Random Test Case Generation**: Automatically creates a variety of test cases to evaluate the programs.
- **Output Comparison**: Executes both programs and compares their outputs to identify discrepancies.
- **Error Reporting**: Provides detailed error messages and reports when outputs do not match, aiding in identifying and debugging issues.

## How It Works

1. **Initialization**: The tool requires paths to the compiled classes of two Java programs and the class names to be compared.
2. **Test Case Creation**: It generates random inputs, including arrays and queries.
3. **Program Execution**: Runs both Java programs using the generated test cases.
4. **Output Verification**: Compares the outputs from both programs and reports any differences.

## Usage

To use the tool, compile your Java programs and ensure they are accessible from the specified paths. Run the `Main` class with the paths and class names as command-line arguments. For example:

```java
java Main /path/to/first/program FirstClass /path/to/second/program SecondClass
```


### Key Improvements Made

1. **Formatting**: Improved the organization and readability using headings and bullet points.
2. **Clarity**: Added clear descriptions for each section to enhance understanding.
3. **Consistent Markdown**: Ensured consistent use of Markdown syntax for commands and code blocks.

Feel free to modify any part of it to better suit your project!
