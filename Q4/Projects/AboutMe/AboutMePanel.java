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
        
        // default color
        setBackground(Color.cyan);
        
        
        
        JButton button;
        
        // First button
        button = ColorButton("My name is...");
        button.addActionListener(new ButtonListener("Kevin Wang!", Color.yellow));
        add(button);
        
        // Second button
        button = ColorButton("My name is...");
        button.addActionListener(new ButtonListener("Kevin Wang!", Color.yellow));
        add(button);
        
        // Third button
        button = ColorButton("My name is...");
        button.addActionListener(new ButtonListener("Kevin Wang!", Color.yellow));
        add(button);
        
        // Fourth button
        button = ColorButton("My name is...");
        button.addActionListener(new ButtonListener("Kevin Wang!", Color.yellow));
        add(button);
        
        // Fifth button
        button = ColorButton("My name is...");
        button.addActionListener(new ButtonListener("Kevin Wang!", Color.yellow));
        add(button);

        setPreferredSize(new Dimension(300, 300));
    }
    
    
    
    // simplify button making
    public JButton ColorButton(String question) {
        // make the button
        JButton button = new JButton(question);
        // center it and add event listener
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        return button;
    }
    
    
    // write once, use 5 times
    private class ButtonListener implements ActionListener {
        private String answer;
        private Color color;
        // constructor
        public ButtonListener(String answer, Color color) {
            this.answer = answer;
            this.color = color;
        }
        
        public void actionPerformed(ActionEvent event) {
            mainLabel.setText(this.answer);
            setBackground(this.color);
        }
    }
}