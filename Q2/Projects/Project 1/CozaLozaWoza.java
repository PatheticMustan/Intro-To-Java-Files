/* CozaLozaWoza.java            by Kevin Wang
 *     (CozaLozaWoza) 26 POINTS
 *         Write a program that prints the numbers 1 to n, 11 numbers per line. The program shall print "Coza" in place of the numbers
 *         which are multiples of 3, "Loza" for multiples of 5, "Woza" for multiples of 7, "CozaLoza" for multiples of 3 and 5, and so
 *         on. Get the value of n from the user via an input box. The output is through a message box. Numbers (and words) must be
 *         separated by only a single space. There are no commas in the output.
 * 
 *         Your program must contain a method with the following signature:
 *             public static String cozaLozaWoza(int n)
 */

import javax.swing.JOptionPane;

public class CozaLozaWoza {
    public static void main(String[] args) {
        int repeat;
        // User controlled exit.
        do {
            // Asks for input.
            int bound = Integer.parseInt(JOptionPane.showInputDialog("Input a positive integer, the upper bound of CozaLozaWoza!"));
            
            // Outputs the results.
            JOptionPane.showMessageDialog(null, cozaLozaWoza(bound));
            
            // Asks the user if they want to continue.
           repeat = JOptionPane.showConfirmDialog (null, "Try again?");
        } while (repeat == JOptionPane.YES_OPTION);
    }
    
    public static String cozaLozaWoza(int n) {
        String result = "";
        
        for (int i=1; i<=n; i++) {
            // We do things if the number is divisible by 3, 5, 7, or 11.
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                if (i % 3 == 0) result += "Coza";
                if (i % 5 == 0) result += "Loza";
                if (i % 7 == 0) result += "Woza";
            } else {
                result += i;
            }
            
            // Handles that newline thing and spaces between numbers.
            if (i % 11 == 0) {
                result += "\n";
            } else if (i != n) {
                result += " ";
            }
        }
        
        return result;
    }
}