package MyNewMavenProject.MavenProject;

//File: Calculator.java
public class Calculator {

 // Adds two integers
 public int add(int a, int b) {
     return a + b;
 }

 // Subtracts second integer from first
 public int subtract(int a, int b) {
     return a - b;
 }

 // Multiplies two integers
 public int multiply(int a, int b) {
     return a * b;
 }

 // Divides first integer by second
 public int divide(int a, int b) {
     if (b == 0) {
         throw new IllegalArgumentException("Division by zero is not allowed.");
     }
     return a / b;
 }
}

