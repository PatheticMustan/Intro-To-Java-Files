/* Zinnformatics.java            by Kevin Wang
 *     (Zinnformatics) 28 POINTS
 *         Zinnformatics Products, Inc. is selling a web-design software package that retails for $99.00. Quantity discounts are given according to the following table:
 *     
 *         Quantity Discount
 *             10-19 20%
 *             20-49 30%
 *             50-99 40%
 *             100 or more 50%
 *     
 *         Write a Java program that performs the following tasks:
 *             * Have the user input the company name.
 *             * Have the user input the number of packages that they would like to order.
 *             * Output a final "invoice" through a message box, using the format indicated in the sample below:
 *                 - "Thank you for your order Great Neck South High School! You have ordered 40 packages, at a 30% discount. Your final cost will be $2772.00."
 *             * Note: Keep in mind that the dollar value should be formatted, according to the above example.
 *     
 *     Your program must contain methods with the following signatures:
 *         public static double zinnformatics(int quantity) //returns cost
 *         public static double discount(int quantity) //return decimal value, not percent
 */

import javax.swing.JOptionPane;

public class Zinnformatics {
    public static void main(String[] args) {
        int repeat;
        // User controlled exit.
        do {
            // Asks for input.
            String companyName = JOptionPane.showInputDialog("Input a String, the company name!");
            int quantity = Integer.parseInt(JOptionPane.showInputDialog("Input an integer, the number of packages you would like to order!"));
            
            // Gets the discount.
            double discount = 0;
        
            if (10 <= quantity && quantity <= 19) discount = 0.2; // 20%
            else if (20 <= quantity && quantity <= 49) discount = 0.3; // 30%
            else if (50 <= quantity && quantity <= 99) discount = 0.4; // 40%
            else if (100 <= quantity) discount = 0.5; // 50%
            
            // Outputs the results.
            JOptionPane.showMessageDialog(
                                          null,
                                          "Thank you for your order " +
                                          companyName +
                                          "! You have ordered " +
                                          quantity +
                                          " packages, at a " +
                                          (int)(discount * 100) +
                                          "% discount. Your final cost will be $" +
                                          String.format("%,.2f", zinnformatics(quantity)) +
                                          "."
            );
            
            // Asks the user if they want to continue.
           repeat = JOptionPane.showConfirmDialog (null, "Try again?");
        } while (repeat == JOptionPane.YES_OPTION);
    }
    
    //returns cost
    public static double zinnformatics(int quantity) {
        return (quantity * 99) - discount(quantity);
    }
    
    //return decimal value, not percent
    public static double discount(int quantity) {
        double discount = 0;
        
        if (10 <= quantity && quantity <= 19) discount = 0.2; // 20%
        else if (20 <= quantity && quantity <= 49) discount = 0.3; // 30%
        else if (50 <= quantity && quantity <= 99) discount = 0.4; // 40%
        else if (100 <= quantity) discount = 0.5; // 50%
        
        return (quantity * 99) * discount;
    }
}