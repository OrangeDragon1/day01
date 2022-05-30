package myapp.core;

import java.io.Console;

public class SimpleCalculator {

    // Write the entry point
    public static void main(String[] args) {
        // Get the console
        Console cons = System.console();

        Float answer = 0F;

        // Read from input and convert into integer
        String inputOne = cons.readLine("Operand1(number): ").trim();
        int numberOne = Integer.parseInt(inputOne);

        String inputTwo = cons.readLine("Operand2(number): ").trim();
        int numberTwo = Integer.parseInt(inputTwo);

        // Read from input for operator
        String inputOperator = cons.readLine("Operator(add, div, sub, mul): ").trim();
        inputOperator = inputOperator.trim();

        if (inputOperator.equalsIgnoreCase("add")){
            answer = (float)(numberOne + numberTwo);
            System.out.printf("The answer for %d + %d = %.3f\n", numberOne, numberTwo, answer);
        }
        
        else if (inputOperator.equalsIgnoreCase("div")){
            answer = (float)numberOne / numberTwo;
            System.out.printf("The answer for %d / %d = %.3f\n", numberOne, numberTwo, answer);
        }
            
        else if (inputOperator.equalsIgnoreCase("sub")){
            answer = (float)(numberOne - numberTwo);
            System.out.printf("The answer for %d - %d = %.3f\n", numberOne, numberTwo, answer);
        }

        else if (inputOperator.equalsIgnoreCase("mul")){
            answer = (float)(numberOne * numberTwo);
            System.out.printf("The answer for %d * %d = %.3f\n", numberOne, numberTwo, answer);
        }
            
            
        }

    }
    
