/** HorseRacing.java            by Kevin Wang
 * 
 * A game about racing horses. Spam [Space] as quickly as you can, and get to the end before everybody else!
 * 
 **/

import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;

import java.util.*;

import java.util.Timer;

import javax.swing.*;

import java.io.*;
import javax.imageio.ImageIO;

public class HorseRacing extends JPanel {
    private int width;
    private int height;
    private Timer timer;
    private boolean gameOver;
    private Random random;
    private BufferedImage horseImage;
    
    private int[] distances;
    
    public void startGame() {
        width = 512;
        height = 512;
        gameOver = false;
        timer = new Timer();
        random = new Random();
        
        // import horse image
        try {
            horseImage = ImageIO.read(new File("horse.png"));
        } catch (IOException e) {
            System.out.println(e);
        }
        
        // runs repaint function 60 fps
        // thank you https://www.javatpoint.com/post/java-timer-schedule-method
        TimerTask task = new TimerTask() {
            public void run() {
                if (gameOver == false) repaint();
            }
        };  
        
        timer.schedule(task, 0, 1000 / 60);
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        
        // white background
        g.setColor(new Color(255, 255, 255));
        g.fillRect(0, 0, width, height);
        
        g.setColor(new Color(0, 0, 0));
        g.setFont(new Font("Serif", Font.BOLD, 20));
        g.drawString("Horse Racing!", 30, 30);
        
        g.setFont(new Font("Serif", Font.BOLD, 20));
        g.drawString("Spam [Space] as fast as you can!", 30, 60);
        
        g.drawImage(horseImage, 30, 100, null);
    }

    public static void main(String[] args) {
        HorseRacing hr = new HorseRacing();
        JFrame frame = new JFrame();
        frame.getContentPane().add(hr);
        
        hr.startGame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(hr.width, hr.height);
        frame.setVisible(true);
    }
}