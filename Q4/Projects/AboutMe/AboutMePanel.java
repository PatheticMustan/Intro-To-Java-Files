/* thinking
 * 
 * Let's make a new class
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AboutMePanel extends JPanel {
    private JLabel mainLabel;
    
    private JButton buttonMyName;

   
   public AboutMePanel() {
       setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
       
       mainLabel = new JLabel ("Hi! I'm Kevin Wang!");
       add(mainLabel);
       
       setBackground(Color.yellow);
       
       buttonMyName = new JButton ("My name is...");
       buttonMyName.addActionListener (new ButtonListener());
       add(buttonMyName);

      setPreferredSize(new Dimension(300, 300));
      setBackground(Color.cyan);
   }

   
   private class ButtonListener implements ActionListener {
      public void actionPerformed (ActionEvent event) {
         
         mainLabel.setText("Java is a shit language!");
      }
   }
}