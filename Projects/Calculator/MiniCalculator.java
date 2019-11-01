/* MiniCalculator Project                by Kevin Wang
 * 
 * This project will be graded on:
 * 1. Documentation (4 points): Your code must be fully commented and employ standard Java-style conventions.
 * 2. User-Friendliness (4 points): All interactions with the user must be clear and unambiguous.
 * 3. Basic Calculations (4 points): All basic calculations must be performed correctly.
 * 4. Advanced Calculations (4 points): All advanced calculations must be performed correctly.
 * 
 * We must implement:
 * 1. Addition
 * 2. Subtraction
 * 3. Multiplication
 * 4. Division
 * 5. Absolute Value
 */

import java.util.Scanner;
import java.lang.Math;

public class MiniCalculator {
    public static void main(String[] args) {
        // Make a new instance of the Scanner class (sc) that takes input from (System.in).
        Scanner sc = new Scanner(System.in);
        // Initialize the variables so we don't get any *unexpected* results.
        int operator = 0;
        double first = 0.0;
        double second = 0.0;
        String output = "";
        String again = "y";
        
        // Continue doing math if they respond "yes" or "y".
        while (again.equals("y") || again.equals("yes")) {
            // Reset the operator after every time they say "yes"
            operator = 0;
            
            // Continue asking them what operator they want if it's invalid.
            while (operator < 0.5 || operator > 5.5) {
                // Print operators, and ask user which operator they want to use.
                System.out.println("Choose an operator from the below list! (1-5)");
                System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Absolute Value");
                operator = sc.nextInt();
                if (operator < 0.5 || operator > 5.5) {
                    System.out.println("Invalid operator! Pick a number 1-5. <3");
                }
            }
            
            System.out.println("Enter the first number:");
            first = sc.nextDouble();
            // While the first 4 operators take 2 values, absolute value only takes 1 value.
            // Therefore, we need to check that the operator is between 1-4 before asking for the second value.
            if (operator > 0.5 && operator < 4.5) {
                System.out.println("Enter the second number:");
                second = sc.nextDouble();
            }
            
            // We already know the operator is a valid choice, so we don't need another else if to check for absolute value.
            // I would've used switch-case, but I don't think we learned that yet.
            if (operator == 1) {
                output = first + " + " + second + " = " + (first+second);
            } else if (operator == 2) {
                output = first + " - " + second + " = " + (first-second);
            } else if (operator == 3) {
                output = first + " * " + second + " = " + (first*second);
            } else if (operator == 4) {
                output = first + " / " + second + " = " + (first/second);
            } else {
                output = "|" + first + "| = " + Math.abs(first);
            }
            // Tada!
            System.out.println(output + "\n\n");
            System.out.println("Want to do math again? (y/yes to continue)");
            sc.nextLine();
            again = sc.nextLine();
        }
    }
}