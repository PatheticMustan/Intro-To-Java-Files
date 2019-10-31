/* EvenOrOdd.java            by Kevin Wang
 *
 * Write a program that determines if a user-inputted number is even 
 * The code should display an appropriate message as the result.
 * (Note: You must instantiate the Scanner object!!)
 */

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Instantiates a new instance of a scanner, in "sc".
        
        System.out.println("Enter a number! I'll tell you if it's even or odd.");
        int input = sc.nextInt();
        
        System.out.println(input + " % 2 = " + (input%2));
        if (input%2 == 0) {
            System.out.println(input + " is even!");
        } else {
            System.out.println(input + " is odd!");
        }
    }
}