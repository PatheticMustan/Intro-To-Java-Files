/* DivisibleByThree.java            by Kevin Wang
 *
 * Write a program that determines if a user-inputted number is divisible by 3.
 * The code should display an appropriate message as the result.
 * (Note: You must instantiate the Scanner object!!)
 */

import java.util.Scanner;

public class DivisibleByThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Instantiates a new instance of a scanner, in "sc".
        
        System.out.println("Enter a number! I'll tell you if it's divisible by three.");
        int input = sc.nextInt();
        
        System.out.println(input + " % 3 = " + (input%3));
        if (input%3 == 0) {
            System.out.println(input + " is divisible by three!");
        } else {
            System.out.println(input + " is NOT divisible by three!");
        }
    }
}