/*
 * On a certain network, usernames are required to start with the letter 'U'
 * and be more than 6 characters in length.
 * Write a program that takes a prospective username (a String) as input,
 * and determines if the String meets the network's username requirements.
 * 
 * Your code should advise the user if their username choice is illegal, and the reason.
 * (Note: You must instantiate the Scanner object!!)
 */

import java.util.Scanner;

public class ValidUsername {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your username! It must start with a 'U' and be more than 6 characters.");
        String username = sc.nextLine();

        System.out.println("Username is: " + username);
        // not including 6
        if (username.length() < 6) {
            System.out.println("Error! The username must have more than 6 characters.");
        } else if (!(username.substring(0, 1).equals("U"))) {
            System.out.println("Error! The username must start with a U.");
        } else {
            System.out.println("Success! Your username was very valid indeeeeeed. Good job!");
        }
    }
}