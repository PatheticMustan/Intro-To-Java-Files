/* MagicSquareDriver.java            by Kevin Wang
 * 
 * Your class should handle user input through a full GUI or pop-up windows.
 * The user should specify (in your DRIVER CLASS):
 *     - The size of the matrix (the value of n)
 *     - The numbers to be added to the matrix
 * 
 * At the end of your program, along with displaying the result of isMagic(),
 * please also display the matrix that the user entered.
 */

import javax.swing.*;

// I wonder if there's a magic circle driver?
// what car does the magic square driver drive in? Where does it drive to? WHO IS IT DRIVING? That's what we really need to know.
public class MagicSquareDriver {
    // PUBLIC STATIC VOID MAIN STRING ARGS AHHHHHHHHH
    // fun tip, args is just a name, you could name it "poopoopeepee" if you wanted to. Just saying.
    public static void main(String[] args) { // arrrrrrgs I'm a pirate!
        
        // I'm trying to think of a clever name, but all I can think of is Shizune Hakamichi, so there she is
        // she'll read your inputs cuz she can't hear 'em haha
        JFrame shizune = new JFrame();
            
        do {
            // I REALLY don't want to check for valid input but I also really don't want to lose points
            int size = 0;
            do {
                size = Integer.parseInt(JOptionPane.showInputDialog(shizune, "Enter the size of the matrix."));
                if (size < 1) {JOptionPane.showMessageDialog(shizune, "Invalid size! Enter a number greater than 0.");}
            } while(size < 1);
            
            SquareMatrix matrix = new SquareMatrix(size);
            
            for (int i=0; i<size; i++) {
                // stupid input verification, get the user's input (1,2,3,4,5)
                // we don't know if it'll be valid, so don't specify the size of the array yet
                String[] stringInput;
                do {
                    stringInput = JOptionPane.showInputDialog(shizune, "Enter Row #" + (i + 1) + ", with " + size + " elements, split by commas.").split(",");
                    if (stringInput.length != size) {
                        JOptionPane.showMessageDialog(shizune, "Invalid size! " + stringInput.length + " elements entered but " + size + " required.");
                    }
                } while(stringInput.length != size);
                
                // now we take it and mush it into the matrix
                for (int o=0; o<size; o++) {
                    matrix.add(Integer.parseInt(stringInput[o]), i, o);
                }
            }
            
            // isMagic?
            JOptionPane.showMessageDialog(shizune, "The matrix is " + (matrix.isMagic()? "very" : "not") + " magical!");
            
            // Spit out toString
            JOptionPane.showMessageDialog(shizune, matrix);
        } while (JOptionPane.showConfirmDialog(shizune, "Do you wish to exit?", "Exit", JOptionPane.YES_NO_OPTION) == 1);
    }
}