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
    
    private boolean keyFree;
    
    private Random random;
    private BufferedImage horseImage;
    
    public int[] distances;
    
    public void startGame() {
        // powers of 2 make me feel happy inside
        width = 1024;
        height = 512;
        gameOver = false;
        
        keyFree = true;
        
        timer = new Timer();
        random = new Random();
        distances = new int[] {20, 20, 20, 20, 20};
        
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
        
        if (gameOver == false) {
            // white background
            g.setColor(new Color(228, 211, 27));
            g.fillRect(0, 0, width, height);
            
            // header
            g.setColor(new Color(0, 0, 0));
            //        new Font("Comic Sans MS", Font.BOLD, 20)
            g.setFont(new Font("Serif", Font.BOLD, 20));
            g.drawString("Horse Racing!", 30, 30);
            
            // description
            g.setFont(new Font("Serif", Font.BOLD, 20));
            g.drawString("Spam [Space] as fast as you can!", 30, 60);
            
            // draw horses
            for (int i = 0; i < distances.length; i++) {
                g.drawImage(horseImage, distances[i], 100 + (50 * i), null);
            }
            
            // advance horses
            for (int i = 1; i < distances.length; i++) {
                if (random.nextInt(10) == 9)
                    distances[i] += 20;
            }
            
            // draw win/loss conditions
            for (int i = 0; i < distances.length; i++) {
                // if one horse has gone over a certain distance...
                if (distances[i] > width - 60) {
                    gameOver = true;
                    // conditionals are just fancy if statements
                    // condition? true : false
                    // if it's the horse player, the player won. Otherwise, the player lost.
                    String result = (i==0? "You Won!" : "You Lost.");
                    
                    g.setFont(new Font("Serif", Font.BOLD, 40));
                    g.drawString(result, width/3, height/3);
                }
            }
        }
    }

    public static void main(String[] args) {
        HorseRacing hr = new HorseRacing();
        JFrame frame = new JFrame();
        frame.getContentPane().add(hr);
        
        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {}
            
            // you can only move forward if you press AND release the space key.
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == ' ' && hr.keyFree) {
                    hr.keyFree = false;
                    // 1 click
                    hr.distances[0] += 20;
                }
            }
            
            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyChar() == ' ' && hr.keyFree == false) {
                    hr.keyFree = true;
                }
            }
        });
        
        hr.startGame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(hr.width, hr.height);
        frame.setVisible(true);
    }
}