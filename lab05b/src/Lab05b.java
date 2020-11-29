import java.util.Scanner;

/**
 * Lab05b 
 * Instructions for Lab05b are in INSTRUCTIONS.md file located in the root directory of Lab05b
 * Revisions can be seen on the following GitHub URL: https://github.com/thecrazybob/CS101-lab05
 * Style Guidelines: http://www.cs.bilkent.edu.tr/~david/cs101/practicalwork/2010/styleguidelines.htm
 * Lab Page: http://www.cs.bilkent.edu.tr/~david/cs101/assignments/lab05/
 * 
 * @author Mohammed Sohail
 * @version 29/11/2020
 */ 

public class Lab05b
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        // constants
        final int MAX_WIDTH = 6;

        // variables
        int row;
        int column;
        int count;
        String digits;

        // program code

        // prompt for row
        System.out.println("Enter row: ");
        row = scan.nextInt();

        // prompt for column
        System.out.println("Enter column: ");
        column = scan.nextInt();

        System.out.println("Table with row & column numbers");

        // loop through rows
        for (int i = 1; i <= row; i++) {

            // loop through columns
            for (int j = 1; j <= column; j++) {

                // getting row and column in format row, column
                digits = i + "," + j;

                // calculating space to the left by subtracting the max possible width with row,column length
                for (int k = 0; k < MAX_WIDTH - digits.length(); k++) {
                    System.out.print(" ");
                }

                System.out.print(digits);

            }
            
            System.out.println();
        
        }

        System.out.println("Table with product of the row & column number");

        // loop through rows
        for (int i = 1; i <= row; i++) {

            // loop through columns
            for (int j = 1; j <= column; j++) {

                digits = "" + (i * j);                         

                for (int k = 0; k < MAX_WIDTH - digits.length(); k++) {
                
                    System.out.print(" ");
                    
                }

                System.out.print(digits);

            }
            
            System.out.println();
        
        }

        System.out.println("Table  beginning from 0 and increasing left to right, top to bottom ");

        count = 0;

        for (int i = 1; i <= row; i++) {

            for ( int j = 1; j <= column; j++) {

                digits = "";

                for (int k = 0; k < MAX_WIDTH - digits.length(); k++) {
                    System.out.print(" ");
                }

                System.out.print(count);
                count++;

            }
            
            System.out.println();
                
        }

        System.out.println("Table with row number in the first column only");

        count = 0;

        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= column; j++) {
                
                if (j == 1) {
                    // Making it so it only prints the row number in first column of every row
                    digits = i + "";
                }

                else {
                    digits = "-";                           
                }
                
                // calculating space to the left by subtracting the max possible width with row, column length
                for (int k = 0; k < MAX_WIDTH - digits.length(); k++) {
                    
                    System.out.print(" ");
                        
                }

                System.out.print(digits);
            
            }
            
            System.out.println();
                
        }

        scan.close();

    }
}

