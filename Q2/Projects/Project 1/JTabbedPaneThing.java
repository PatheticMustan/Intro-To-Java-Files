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

public class JTabbedPaneThing {
    public static void main(String[] args) {
        CozaLozaWoza coza = new CozaLozaWoza();
        MailingLabel mail = new MailingLabel();
        Palindrome pal = new Palindrome();
        Zinnformatics zinn = new Zinnformatics();
        
        
        JFrame frame = new JFrame("TabbedPaneFrame");
        JTabbedPane tp = new JTabbedPane();

        // create the controls pane
        JPanel controls = new JPanel();
        controls.add(new JLabel("Service:"));
        JList list = new JList(
            new String[] { "Web server", "FTP server" }
        );
        list.setBorder(BorderFactory.createEtchedBorder());
        controls.add(list);
        controls.add(new JButton("Start"));

        // create an image pane
        String filename = "Piazza di Spagna.jpg";
        JLabel image = new JLabel( new ImageIcon(filename) );
        JComponent picture = new JScrollPane(image);
        tp.addTab("Controls", controls);
        tp.addTab("Picture", picture);

        frame.getContentPane().add(tp);

        frame.setSize(1000, 500);
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setVisible(true);
    }
}