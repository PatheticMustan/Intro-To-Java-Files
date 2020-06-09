import java.awt.*;
import java.awt.image.*;

import java.io.*;

import javax.swing.*;

public class HorseRacing extends JPanel {
    private int width = 512;
    private int height = 512;
    private int modifier = 0;
    
    public void update(Graphics g) {
        paint(g);
        modifier += 1;
    }   
    
    public void paint(Graphics g) {
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = image.createGraphics();
        
        // white background
        g2d.setColor(new Color(255, 255, 255));
        g2d.fillRect(0, 0, width, height);
        
        g2d.setColor(new Color(0, 0, 0));
        g2d.setFont(new Font("Serif", Font.BOLD, 20));
        g2d.drawString("Test", 30, 30);
        
        g2d.dispose();
        

        // display it on the frame
        g.drawImage(image, 0, 0, null);
    }

    public static void main(String[] args) {
        HorseRacing hr = new HorseRacing();
        JFrame frame = new JFrame();
        frame.getContentPane().add(hr);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(hr.width, hr.height);
        frame.setVisible(true);
    }
}