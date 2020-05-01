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

// I wonder if there's a magic circle driver?
// what car does the magic square driver drive in? Where does it drive to? WHO IS IT DRIVING? That's what we really need to know.
public class MagicSquareDriver {
    // PUBLIC STATIC VOID MAIN STRING ARGS AHHHHHHHHH
    // fun tip, args is just a name, you could name it "poopoopeepee" if you wanted to. Just saying.
    public static void main(String[] args) { // arrrrrrgs I'm a pirate!
        
        // I'm trying to think of a clever name, but all I can think of is Shizune Hakamichi, so there she is
        // she'll read your inputs cuz she can't hear 'em haha
        JFrame shizune = new JFrame();
        SquareMatrix matrix = new SquareMatrix();
            
        do {
            SquareMatrix matrix = JOptionPane.showInputDialog(shizune, "Enter a new name"));
            ourBelovedUser.setAddress(JOptionPane.showInputDialog(shizune, "Enter a new address"));
            ourBelovedUser.setUsername(JOptionPane.showInputDialog(shizune, "Account Created!\nEnter a new username"));
            ourBelovedUser.setPassword(ourBelovedUser.encrypt(JOptionPane.showInputDialog(shizune, "Enter a new password")));
        
            // test toString()
            JOptionPane.showMessageDialog(shizune, ourBelovedUser);
        } while (JOptionPane.showConfirmDialog(shizune, "Do you wish to exit?", "Exit", JOptionPane.YES_NO_OPTION) == 1);
    }
}