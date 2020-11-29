import java.util.Scanner;

/**
 * Lab05c 
 * Instructions for Lab05c are in INSTRUCTIONS.md file located in the root directory of Lab05c
 * Revisions can be seen on the following GitHub URL: https://github.com/thecrazybob/CS101-lab05
 * Style Guidelines: http://www.cs.bilkent.edu.tr/~david/cs101/practicalwork/2010/styleguidelines.htm
 * Lab Page: http://www.cs.bilkent.edu.tr/~david/cs101/assignments/lab05/
 * 
 * @author Mohammed Sohail
 * @version 29/11/2020
 */ 

public class Lab05c
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        // constants
        final String SEPARATOR = "------------------";                
        final String OPERATION_TYPES = "+,-,*,/ value";
        final String CLEAR = "Clear";
        final String QUIT = "Quit";
        final String SELECT = "Select: ";

        // variables
        double result;
        String operation;
        double value_given;
        
        // program code
        System.out.println("Welcome to \"SimpleCalc\"...");
        System.out.println();

        // initializing variables
        result = 0;
        value_given = 0;
        
        // loop while condition is true
        while (true)  {

            System.out.println(SEPARATOR);
            System.out.println("[ " + result + " ]");
            System.out.println(SEPARATOR);
            System.out.println(OPERATION_TYPES);
            System.out.println(CLEAR);
            System.out.println(QUIT);
            System.out.println(SEPARATOR);
            System.out.print(SELECT);

            // geting user input for operation to be done in calculator
            operation = scan.next();
            
            // checking if user has decided to quit or not
            if (operation.equalsIgnoreCase("q")) {  
                System.out.print("Thanks for using \"SimpleCalc\", goodbye.");
                break;
            }

            // checking if user wants to 'clear' the calculator
            if (operation.equalsIgnoreCase("clear") || operation.equalsIgnoreCase("c")) {
                result = 0;
            }

            else {
                // getting the value input from user+
                value_given = scan.nextDouble();        
            }

            if (operation.equals("-")) {
                result = result - value_given;
            }
            
            else if (operation.equals("/")) {
                result = result / value_given;
            }

            else if (operation.equals("*")) {
                result = result * value_given;
            }

            else if (operation.equals("+")) {
                result = result + value_given;
            }

        }
        
        // close scanner instance
        scan.close();

    }
    
}