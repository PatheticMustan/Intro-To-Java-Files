/* AboutMe.java            by Kevin Wang
 * 
 * AboutMe Project: Implementing a Basic GUI
 * 
 * I know that it is already May, but I would like to get to know you better! Your next project is to
 * create a sort-of About Me program, titled AboutMe.
 * 
 * Write a program AboutMe that represents you! Your program MUST contain a GUI (graphical user interface),
 * complete with JButtons (and JTextFields if you can figure out a good way to incorporate them).
 * 
 * Each button must have a prompt, such as “My name is...”, where the user is given the answer when the
 * button is clicked (via a single JLabel in the window that is updated with the button presses).
 * 
 * program must contain a minimum of 5 different buttons, and:
 *     - A class extending JPanel
 *     - Exactly one JLabel
 *     - Appropriate ActionListeners
 *     - Exactly one button must display an image when clicked in addition to a text answer.
 * 
 * When another button is clicked, the image must disappear.
 *     - Each button must have a different background color, and the text on the buttons must be different colors as well.
 * 
 * In order to have your code display properly on different operating systems, you MUST include the following lines of code in your driver class.
 * Literally just copy and paste.
 * 
 * try {
 *     UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName() );
 * } catch (Exception e) {
 *     e.printStackTrace();
 * }
 * 
 * Your program must contain at least 2 files (one driver class and one panel class), and you must
 * upload all required images as well.
 */

// import
import java.awt.*;
import javax.swing.*;

public class AboutMe {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName() );
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        JFrame frame = new JFrame("About Me");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        AboutMePanel panel = new AboutMePanel();
        
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}