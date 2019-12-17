/* MailingLabel.java            by Kevin Wang
 *     (MailingLabel) 26 POINTS
 *         A delimited string is a string literal that contains special characters ("delimiters") to signify a separation between different
 *         elements of information. An example of this is a Microsoft Excel CSV (Comma Separated Values) file.
 *         Write a Java program that performs the following tasks:
 *             * Asks the user to input their chosen delimiter
 *             * Asks the user to input the delimited string, which holds a person’s name and address, as input
 *             * Prints a mailing label as output.
 * 
 *     Sample: Input: "Jose Reyes:13-07 Estates Lane:Bayside, NY 11360"
 *     Output (may be through the Console window):
 *         -----------------------
 *         Jose Reyes
 *         13-07 Estates Lane
 *         Bayside, NY 11360
 *         -----------------------
 *     Your program must contain a method with the following signature:
 *         public static String mailingLabel(String str, String del)
 */

import javax.swing.JOptionPane;

public class MailingLabel {
    public static void main(String[] args) {
        int repeat;
        // User controlled exit.
        do {
            // Asks for input.
            String delimiter = JOptionPane.showInputDialog("Input the delimiter!");
            String userInput = JOptionPane.showInputDialog("Input the delimited string to get the mailing label!");
            
            // Outputs the results.
            JOptionPane.showMessageDialog(null, mailingLabel(userInput, delimiter));
            
            // Asks the user if they want to continue.
           repeat = JOptionPane.showConfirmDialog (null, "Try again?");
        } while (repeat == JOptionPane.YES_OPTION);
    }
    
    // Takes in a string, outputs the reverse of the string.
    public static String mailingLabel(String str, String del) {
        /* 
         * str.split(del) splits the string (str) with the delimiter (del).
         * String.join("\n", stringArray) lets us join (stringArray), with the delimiter "\n".
         * With these two methods, we have made an ultra hard assignment into an EZPZ 1 liner! Mwahahaha!
         * 
         * Another solution I found was:
         *     return str.replaceAll(del, "\n")
         * 
         * This solution is shorter, and cleaner, but I decided to stick with my original solution, cuz it's still cool.
         */
        return String.join("\n", str.split(del));
    }
}

/* 
 * I've gotten weak, and used to Javascript's ezpz type conversion. 
 * 
 * Sometimes I mix up syntax from multiple languages
 */