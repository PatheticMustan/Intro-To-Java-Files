/* JTabbedPaneThingy            by Kevin Wang
 *     (JTabbedPaneThingy) 0 POINTS
 *         I don't know why I have to write this, but it's like "extra-credit work"
 *         but without the credit. So just "extra work" I guess.
 * 
 *         I have to make a GUI (gooey gooEEEEE) that uses JTabbedPane, and lets me interact with all my programs.
 *         I should have pretended I had some other work to do. TT_TT
 * 
 *     Programs:
 *         CozaLozaWoza.java
 *         MailingLabel.java
 *         Palindrome.java
 *         Zinnformatics.java
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JTabbedPaneThing {
    public static void main(String[] args) {
        // Import other classes
        Palindrome    pali = new Palindrome();
        MailingLabel  mail = new MailingLabel();
        Zinnformatics zinn = new Zinnformatics();
        CozaLozaWoza  coza = new CozaLozaWoza();
        
        
        
        // Sleep deprived-please send help I'm dying inside I don't understand why we need JFrame and JTabbedPane
        JFrame frame = new JFrame("All my java programs");
        JTabbedPane tp = new JTabbedPane(JTabbedPane.LEFT);
        
        // create the palindrome pane
        JPanel paliPanel = new JPanel((LayoutManager) new FlowLayout(FlowLayout.LEFT));
        JTextField paliText = new JTextField();
        paliText.setMaximumSize(new Dimension(1000,20));
        paliText.setColumns(10);
        
        JButton paliButton = new JButton("Start");
        JLabel paliResult = new JLabel("");
        
        
        paliButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                paliResult.setText(
                    "Original: " + paliText.getText() +
                    "\nFlipped: " + pali.reverseString(paliText.getText()) +
                    "\nIs the string a palindrome?: " + pali.isPalindrome(paliText.getText()) + "."
                                       );
            }
        });
        
        paliPanel.add(new JLabel("Palindrome:"));
        paliPanel.add(paliText);
        paliPanel.add(paliButton);
        paliPanel.add(paliResult);
        
        
        
        // create the mailing label pane
        JPanel mailPanel = new JPanel();
        
        
        
        // create the zinnformatics pane
        JPanel zinnPanel = new JPanel();
        
        
        
        // create the cozalozawoza pane
        JPanel cozaPanel = new JPanel();
        
        
        // Make tabs vertical.
        paliPanel.setLayout(new BoxLayout(paliPanel, BoxLayout.Y_AXIS));
        
        // Add tabs
        tp.addTab("Palindrome", paliPanel);
        tp.addTab("Mailing Label", mailPanel);
        tp.addTab("Zinnformatics", zinnPanel);
        tp.addTab("Coza Loza Woza", cozaPanel);

        
        
        frame.getContentPane().add(tp);
        
        // 420 haha funny funny
        // This actually was a coincidence, because I was looking for a width to fit all 4 tabs.
        frame.setSize(1000, 500);
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setVisible(true);
    }
}