import java.awt.*;
import java.awt.image.*;

import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.*;

public class RayTracer extends JPanel {
    private int width = 512;
    private int height = 512;

    public void paint(Graphics g) {
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        // draw image
        for (int i = 0; i < width; i++) {
            for (int o = 0; o < height; o++) {
                image.setRGB(i, o, toColor(i - o, i, o));
            }
        }

        // write to file, in case you wanna see it later
        try {
            ImageIO.write(image, "png", new File("rt.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // display it on the frame
        g.drawImage(image, 0, 0, null);
    }

    // convert rgb to proper format
    private static int toColor(int r, int g, int b) {
        return ((r % 256) << 16) | ((g % 256) << 8) | (b % 256);
    }

    public static void main(String[] args) {
        RayTracer rt = new RayTracer();
        JFrame frame = new JFrame();
        frame.getContentPane().add(rt);




        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(rt.width, rt.height);
        frame.setVisible(true);
    }
}