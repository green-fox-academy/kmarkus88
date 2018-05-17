import sun.font.FontRunIterator;

import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FillWithRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.
        Random random = new Random();
        int x = random.nextInt(400);
        int y = random.nextInt(400);
        int width = random.nextInt(400);
        int height = random.nextInt(400);

        for (int i = 0; i <= 4; i++) {
            graphics.setColor(Color.GREEN);
            graphics.fillRect(x, y, height, width);

        }
       // graphics.setColor(Color.GREEN);
        //graphics.drawRect(x, y, height, width);


    }

    //    Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}