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
        JTabbedPane tp = new JTabbedPane();
        
        // create the palindrome pane
        JPanel paliPanel = new JPanel();
        JTextArea paliText = new JTextArea("racecar UwU racecar OwO racecar UwU racecar");
        paliText.setLineWrap(true);
        paliText.setColumns(10);
        
        JButton paliButton = new JButton("Start");
        JLabel result = new JLabel("Palindrome:");
        
        
        paliButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("I was clicked!");
            }
        });
        
        paliPanel.add(new JLabel("Palindrome:"));
        paliPanel.add(paliText);
        paliPanel.add(paliButton);
        paliPanel.add(result);
        
        
        
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
        frame.setSize(420, 300);
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setVisible(true);
    }
}