/* Zinnformatics.java            by Kevin Wang
 * (Zinnformatics) 28 POINTS
 *     Zinnformatics Products, Inc. is selling a web-design software package that retails for $99.00. Quantity discounts are given according to the following table:
 * 
 *     Quantity Discount
 *         10-19 20%
 *         20-49 30%
 *         50-99 40%
 *         100 or more 50%
 * 
 *     Write a Java program that performs the following tasks:
 *         ? Have the user input the company name.
 *         ? Have the user input the number of packages that they would like to order.
 *         ? Output a final “invoice” through a message box, using the format indicated in the sample below:
 *             o Thank you for your order Great Neck South High School! You have ordered 40 packages, at a 30% discount. Your final cost will be $2772.00.
 *         ? Note: Keep in mind that the dollar value should be formatted, according to the above example.
 * 
 * Your program must contain methods with the following signatures:
 *     public static double zinnformatics(int quantity) //returns cost
 *     public static double discount(int quantity) //return decimal value, not percent
 */

import javax.swing.JOptionPane;

public class Zinnformatics {
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
        // str.split(del) splits the string (str) with the delimiter (del).
        // String.join("\n", stringArray) lets us join (stringArray), with the delimiter "\n".
        // With these two methods, we have made an ultra hard assignment into an EZPZ 1 liner! Mwahahaha!
        return String.join("\n", str.split(del));
    }
}