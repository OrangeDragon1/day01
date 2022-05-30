package myapp.core;

import java.io.Console;

import javax.naming.OperationNotSupportedException;

public class TeacherCalculator {

    public static void main(String[] args) {
        // get the console

        Console cons = System.console(); 
        
        // Read the inputs from the users
        // opnd0 
        String opnd0 = cons.readLine("Operand 0: ").trim();

        // opnd1
        String opnd1 = cons.readLine("Operand 1: ").trim();

        // oper
        String operator = cons.readLine("Operator: one of add, sub, div, mul: ").trim();

        // Convert String to Integer
        Integer val0 = Integer.parseInt(opnd0);
        Integer val1 = Integer.parseInt(opnd1);
        Float result = 0F;

        // Perform the calculation
        switch (operator) {
            case "add":
                result = (float)(val0 + val1);
                break;

            case "sub":
                result = (float)(val0 - val1);
                break;

            case "mul":
                result = (float)(val0 * val1);
                break;

            case "div":
                result = (float)val0 / val1;
                break;
        
            default:
                break;
        }

        System.out.printf("The answer for %d + %d + %d", args)


        

    }
    
}
