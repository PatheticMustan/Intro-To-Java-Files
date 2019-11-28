/* GuessingGame.java            by Kevin Wang
 * The user guesses a number 1-100 until (s)he gets the number right.
 */

import javax.swing.*;
import java.lang.Math;

public class GuessingGame {
    public static void main(String[] args) {
        // text will be the message we'll display.
        String text = "Guess a number 1-100!";
        // Generate a number 1-100.
        int random = (int)((Math.random() * 100) + 1);
        int guess = -1;
        // Keep track of how many tries the user makes.
        int tries = 0;
        
        do {
            // Displays text and get user input.
            guess = Integer.parseInt(JOptionPane.showInputDialog(text));
            // Tells the user if their guess was higher or lower than actual.
            if (guess > random) text = "Our number is lower than " + guess + ".";
            if (guess < random) text = "Our number is higher than " + guess + ".";
            // Log tries.
            tries += 1;
        } while (guess != random);
        
        // Display end result.
        JOptionPane.showMessageDialog(null, "Good job! The number was " + random + "!\nYou took " + tries + " tries to guess the number.");
    }
}