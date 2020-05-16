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

        mainLabel = new JLabel("Hi! I'm Kevin Wang!");
        mainLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(mainLabel);

        setBackground(Color.yellow);
        
        // First button
        buttonMyName = ColorButton("My name is...", "Kevin Wang!", Color.yellow);
        buttonMyName.addActionListener(new ButtonListener());
        add(buttonMyName);

        setPreferredSize(new Dimension(300, 300));
        setBackground(Color.cyan);
    }
    
    
    
    // simplify button making
    public JButton ColorButton(String question, String answer, Color color) {
        // make the button
        JButton button = new JButton(question);
        // center it and add event listener
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        return button;
    }
    
    
    
    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            mainLabel.setText("Java is a shit language!");
        }
    }
}