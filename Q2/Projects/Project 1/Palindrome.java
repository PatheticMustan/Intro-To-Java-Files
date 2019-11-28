/* Palindrome.java            by Kevin Wang
 * Checks if a string is a palindrome.
 */

import javax.swing.JOptionPane;

public class Palindrome {
    public static void main(String[] args) {
        // User controlled exit.
        String repeat = "y";
        while (repeat.equals("y")) {
            // Asks for input.
            String userInput = JOptionPane.showInputDialog("Input a string to find if that string is a palindrome!");
            // Outputs the results.
            JOptionPane.showMessageDialog(null,
                                          "Original: " + userInput +
                                          "\nFlipped: " + reverseString(userInput) +
                                          "\nIs the string a palindrome?: " + isPalindrome(userInput) + ""
                                         );
            // Asks user if they want to continue.
            repeat = JOptionPane.showInputDialog("Do you want to repeat? (y/n)");
        }
    }
    
    // Takes in a string, outputs the reverse of the string.
    public static String reverseString(String str) {
        String reversed = "";
        
        // Loops over the string backwards.
        for (int i=str.length()-1; i>=0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;

    }
    
    // Takes in a string, outputs whether a string is a palindrome.
    public static boolean isPalindrome(String str) {
        return str.equals(reverseString(str));
    }
}