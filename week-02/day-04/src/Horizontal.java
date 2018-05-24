import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Horizontal {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a 50 long horizontal line from that point.
        // Draw 3 lines with that function. Use loop for that.

        int x = 30;
        int y = 30;
        lines(x, y, graphics);
    }
    public static void lines ( int x, int y, Graphics graphics){
        for (int i = 1; i <=3 ; i++) {
            graphics.setColor(new Color(45, 200, 145));
            graphics.drawLine(x * i, y * i,x + 50,y * i);

        }

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