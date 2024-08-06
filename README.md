---> Java Output Comparison Tool
This repository contains a Java-based tool designed to compare the outputs of two different Java programs. It generates random test cases, executes both programs with the same inputs, and checks if their outputs match. This tool is useful for validating the correctness of different implementations of a given algorithm or solution.

---> Key Features
Random Test Case Generation: Automatically creates a variety of test cases to evaluate the programs.
Output Comparison: Executes both programs and compares their outputs to identify discrepancies.
Error Reporting: Provides detailed error messages and reports when outputs do not match, helping to identify and debug issues.


---> How It Works
Initialization: The tool requires paths to the compiled classes of two Java programs and the class names to be compared.
Test Case Creation: It generates random inputs including arrays and queries.
Program Execution: Runs both Java programs using the generated test cases.
Output Verification: Compares the outputs from both programs and reports any differences.
Usage
To use the tool, compile your Java programs and ensure they are accessible from the specified paths. Run the Main class with the paths and class names as command-line arguments. For example:

---> write this in terminal
java Main /path/to/first/program FirstClass /path/to/second/program SecondClass

The tool will output any mismatches between the two programs' outputs and provide the input test case used.

Contribution
Contributions to this project are welcome. If you have suggestions for improvements or bug fixes, please submit a pull request or open an issue.

License
This project is licensed under the MIT License. See the LICENSE file for more details.
