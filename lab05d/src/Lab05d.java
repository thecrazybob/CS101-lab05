import java.util.Scanner;

/**
 * Lab05d 
 * Instructions for Lab05d are in INSTRUCTIONS.md file located in the root directory of Lab05d
 * Revisions can be seen on the following GitHub URL: https://github.com/thecrazybob/CS101-lab05
 * Style Guidelines: http://www.cs.bilkent.edu.tr/~david/cs101/practicalwork/2010/styleguidelines.htm
 * Lab Page: http://www.cs.bilkent.edu.tr/~david/cs101/assignments/lab05/
 * 
 * @author Mohammed Sohail
 * @version 29/11/2020
 */ 

public class Lab05d

{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        // variables
        int number_of_terms;
        double pi;
        double accuracy;
        int term;
        
        // program Code
        System.out.println("using the Java constant, Math.PI");
        System.out.println(Math.PI);

        System.out.println("Using the formula");

        // Prompt for input
        System.out.println("Enter number of terms: ");
        number_of_terms = scan.nextInt();

        // initialize variable
        pi = 0.0;

        // loop through i till number_of_terms
        for (int i = 0; i < number_of_terms; i++) {            

            // Factoring 4 outside the formula so pi approximation goes 4*(1 - 1/3 + 1/5 - 1/7)             
            pi = pi + 4 * ( (Math.pow( (-1) , i )) / (2*i + 1));
        
        }

        System.out.println(pi);

        // prompt for input
        System.out.println("Using the formula ");
        System.out.println("Enter accuracy required ");
        accuracy = scan.nextDouble();

        // initializing variables
        pi = 0.0;
        term = 0;

        do {
            pi = pi + 4 * ((Math.pow( (-1) , term )) / ( 2 * term + 1));
            System.out.println(pi);
            term++;
        }

        while ((Math.abs((pi- Math.PI)) > accuracy));

        // close scanner instance
        scan.close();

    }
    
}