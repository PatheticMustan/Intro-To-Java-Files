import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AboutMePanel extends JPanel {
   private JLabel mainLabel, label;
   private JButton push;
   private JTextField fahrenheit;
   private int count;

   
   public AboutMePanel() {
       mainLabel = new JLabel ("Hi! I'm Kevin Wang!");
       fahrenheit = new JTextField (5);
       fahrenheit.addActionListener (new TempListener());
       
       add(mainLabel);
       add(fahrenheit);
       
       setBackground(Color.yellow);
       
       push = new JButton ("Push Me!");
       push.addActionListener (new ButtonListener());
      
      label = new JLabel ("Pushes: " + count);

      add (push);
      add (label);

      setPreferredSize (new Dimension(300, 40));
      setBackground (Color.cyan);
   }

   //*****************************************************************
   //  Represents a listener for button push (action) events.
   //*****************************************************************
   private class ButtonListener implements ActionListener
   {
      //--------------------------------------------------------------
      //  Updates the counter and label when the button is pushed.
      //--------------------------------------------------------------
      public void actionPerformed (ActionEvent event)
      {
         count++;
         label.setText("Pushes: " + count);
      }
   }
   
   // textbox listener
   private class TempListener implements ActionListener {
      // on enter key
      public void actionPerformed (ActionEvent event) {
         int fahrenheitTemp, celsiusTemp;

         String text = fahrenheit.getText();

         fahrenheitTemp = Integer.parseInt (text);
         celsiusTemp = (fahrenheitTemp-32) * 5/9;

         mainLabel.setText(Integer.toString (celsiusTemp));
      }
   }
}