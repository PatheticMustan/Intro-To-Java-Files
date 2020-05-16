/* AboutMePanel.java            by Kevin Wang
 * 
 * I've made some helper functions to make the whole thing shorter, and simpler.
 * 
 * public JButton ColorButton(String question, String answer, Color backgroundColor, Color buttonColor, ImageIcon image)
 * 
 * and
 * 
 * public ButtonListener(String answer, Color color, ImageIcon icon)
 */

// import
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AboutMePanel extends JPanel {
    private JLabel mainLabel;

    public AboutMePanel() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        // default color
        setBackground(Color.white);
        
        
        // First button
        add(ColorButton(
                        "My name is...",
                        "Kevin Wang",
                        Color.yellow,
                        Color.pink,
                        null
                       ));
        
        // Second button
        add(ColorButton(
                        "My favorite color is...",
                        "Green!",
                        Color.green,
                        Color.yellow,
                        null
                       ));
        
        // Third button
        add(ColorButton(
                        "My favorite programming language is...",
                        "Javascript!",
                        Color.cyan,
                        Color.green,
                        null
                       ));
        
        // Fourth button
        add(ColorButton(
                        "My favorite animals are...",
                        "Otters!",
                        Color.red,
                        Color.cyan,
                        new ImageIcon("otter.png")
                       ));
        
        // Fifth button
        add(ColorButton(
                        "Given rock, paper, or scissors, which would you pick?",
                        "Rock. Always.",
                        Color.pink,
                        Color.red,
                        null
                       ));
        
        mainLabel = new JLabel("Hi! I'm Kevin Wang!");
        mainLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(mainLabel);

        setPreferredSize(new Dimension(400, 500));
    }
    
    
    
    // simplify button making
    public JButton ColorButton(String question, String answer, Color backgroundColor, Color buttonColor, ImageIcon image) {
        // make the button
        JButton button = new JButton(question);
        button.setBackground(buttonColor);
        // center it and add event listener
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.addActionListener(new ButtonListener(answer, backgroundColor, image));
        return button;
    }
    
    
    // write once, use 5 times
    private class ButtonListener implements ActionListener {
        private String answer;
        private Color color;
        private ImageIcon icon;
        
        // constructor
        public ButtonListener(String answer, Color color, ImageIcon icon) {
            this.answer = answer;
            this.color = color;
            this.icon = icon;
        }
        
        public void actionPerformed(ActionEvent event) {
            mainLabel.setText(this.answer);
            setBackground(this.color);
            
            // the icon
            mainLabel.setIcon(this.icon);
            mainLabel.setHorizontalTextPosition(SwingConstants.CENTER);
            mainLabel.setVerticalTextPosition(SwingConstants.TOP);
        }
    }
    
}