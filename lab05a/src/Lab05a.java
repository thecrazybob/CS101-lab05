import java.util.Scanner;

/**
 * Lab05a 
 * Instructions for Lab05a are in INSTRUCTIONS.md file located in the root directory of Lab05a
 * Revisions can be seen on the following GitHub URL: https://github.com/thecrazybob/CS101-lab05
 * Style Guidelines: http://www.cs.bilkent.edu.tr/~david/cs101/practicalwork/2010/styleguidelines.htm
 * Lab Page: http://www.cs.bilkent.edu.tr/~david/cs101/assignments/lab05/
 * 
 * @author Mohammed Sohail
 * @version 29/11/2020
 */ 

public class Lab05a
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
                
        // variables
        int width;
        int height;
        int thickness;          
        char repeat;
        boolean decision;

        // program code
        do {

            // prompt user for width
            System.out.println("Please enter the width:");
            width = scan.nextInt();
            
            // prompt user for height
            System.out.println("Please enter the height:");
            height = scan.nextInt();
            
            // prompt user for thickness
            System.out.println("Please enter the thickness:");
            thickness = scan.nextInt();

            // verify if the value is positive/valid
            if ( width > 0 && height > 0 && thickness > 0 ) {

                // loop through columns
                for (int i = 1; i <= height; i++)  {           

                    // loop through rows
                    for (int j = 1; j <= width; j++) {
                        
                        // verifying whether these are the rows with 'Space' or 'Hole' with them
                        if (i > thickness && i <= ( height - thickness)) {
                        
                            // verifying if the row counter is in place of hole
                            if (j <= thickness)
                            {
                                System.out.print("*");
                            }

                            // verifying if the row counter is in place of hole
                            else if (j > (width - thickness)) {
                                System.out.print("*");  
                            }
    
                            else {
                                System.out.print(" ");
                            }
    
                        }
    
                        else {
                            System.out.print("*");
                        }
                        
                    }

                    // line break
                    System.out.println("");
                
                }   


                if ((height / thickness) < thickness) {
    
                    System.out.println("Oops... no hole!");

                }

            }
    
            else {
                System.out.println("Error: all values must be positive!");
            }
            
            // prompt for re-running the program
            System.out.println("Do you want to repeat?");

            // get user response
            repeat = scan.next().charAt(0);
            
            // if the user decided to cotinue/repeat
            if (repeat == 'y' || repeat == 'Y') {
                decision = true;
            }

            // user decided not to continue/repeat
            else {                                          
                decision = false;   
                System.out.println("Goodbye!");
            }

        }

        while (decision);

        // close scanner instance
        scan.close();

    }
    
}