import javax.swing.*;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ToTheCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Draw 3 lines with that function. Use loop for that.
        int a = 3;
        System.out.println("Give me the X and Y coordinates from 0 to 400!");
        Scanner scanner = new Scanner(System.in);

        while ( <= a)
        System.out.println("First the X coordinate.");
        int x = scanner.nextInt();
        System.out.println("Give me the Y coordinate!");
        int y = scanner.nextInt();



        graphics.setColor(Color.GREEN);
        graphics.drawLine(x,y,200,200);



    }

    // Don't touch the code below
    static int WIDTH = 400;
    static int HEIGHT = 423;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}