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
        
        
        // First button
        add(ColorButton("My name is...", "Kevin Wang", Color.yellow));
        
        // Second button
        add(ColorButton("My favorite color is...", "Green!", Color.green));
        
        // Third button
        add(ColorButton("My favorite programming language is...", "Javascript!", Color.cyan));
        
        // Fourth button
        add(ColorButton("My favorite animals are...", "Otters!", Color.red));
        
        // Fifth button
        add(ColorButton("My name is...", "Kevin Wang!", Color.yellow));

        setPreferredSize(new Dimension(300, 300));
    }
    
    
    
    // simplify button making
    public JButton ColorButton(String question, String answer, Color color) {
        // make the button
        JButton button = new JButton(question);
        button.setBackground(color);
        // center it and add event listener
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.addActionListener(new ButtonListener(answer, color));
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