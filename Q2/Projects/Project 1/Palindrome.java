/* Palindrome.java            by Kevin Wang
 * Checks if a string is a palindrome.
 * (Palindrome) 26 POINTS
 *     Write a program called Palindrome, which prompts user for a String, and determines whether or not it is a palindrome.
 *         ? Have the user input a string into an input box
 *         ? Output the result through a message box.
 *     Your program must contain methods with the following signatures:
 *         public static String reverseString(String str)
 *         public static boolean isPalindrome(String str)
 */

import javax.swing.JOptionPane;

public class Palindrome {
    public static void main(String[] args) {
        int repeat;
        // User controlled exit.
        do {
            // Asks for input.
            String userInput = JOptionPane.showInputDialog("Input a string to find if that string is a palindrome!");
            
            // Outputs the results.
            JOptionPane.showMessageDialog(null,
                                          "Original: " + userInput +
                                          "\nFlipped: " + reverseString(userInput) +
                                          "\nIs the string a palindrome?: " + isPalindrome(userInput) + ""
                                         );
            
            // Asks user if they want to continue.
           repeat = JOptionPane.showConfirmDialog (null, "Try again?");
        } while (repeat == JOptionPane.YES_OPTION);
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