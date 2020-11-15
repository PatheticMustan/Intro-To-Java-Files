/*
 * Write a program that determines if a user-inputted number is even 
 * The code should display an appropriate message as the result.
 * (Note: You must instantiate the Scanner object!!)
 */

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number! I'll tell you if it's even or odd.");
        int input = sc.nextInt();

        System.out.println(input + " % 2 = " + (input%2));
        System.out.println(input + " is " + (input%2 == 0? "even" : "odd") + "!");
    }
}