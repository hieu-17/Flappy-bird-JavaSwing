/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlappyBird;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

/**
 *
 * @author hieum
 */
public class Pipe extends JPanel {

    private static int x1 = 500, x2 = x1 + 140, x3 = x2 + 140, x4 = x3 + 140;
    private static int h1, h2, h3, h4;
    private static boolean b1 = false;
    private static boolean b2 = false;
    private static boolean b3 = false;
    private static boolean b4 = false;

    public static int getX1() {
        return x1;
    }

    public static int getX2() {
        return x2;
    }

    public static int getX3() {
        return x3;
    }

    public static int getX4() {
        return x4;
    }

    public static int getH1() {
        return h1;
    }

    public static int getH2() {
        return h2;
    }

    public static int getH3() {
        return h3;
    }

    public static int getH4() {
        return h4;
    }

    public static boolean isB1() {
        return b1;
    }

    public static boolean isB2() {
        return b2;
    }

    public static boolean isB3() {
        return b3;
    }

    public static boolean isB4() {
        return b4;
    }

    public void randomPipe() {
        Random random = new Random();
        if (b1 == false) {
            h1 = random.nextInt(200);
            b1 = true;
        }
        if (b2 == false) {
            h2 = random.nextInt(200);
            b2 = true;
        }
        if (b3 = false) {
            h3 = random.nextInt(200);
            b3 = true;
        }
        if (b4 == false) {
            h4 = random.nextInt(200);
            b4 = true;
        }
    }

    @Override
    public void paint(Graphics g) {
        randomPipe();
        //pipe top
        g.setColor(Color.green);
        g.fillRect(x1, 0, 50, h1);

        //pipe bottom
        g.setColor(Color.green);
        g.fillRect(x1, h1 + 100, 50, 500);

        //pipe top
        g.setColor(Color.green);
        g.fillRect(x2, 0, 50, h2);

        //pipe bottom
        g.setColor(Color.green);
        g.fillRect(x2, h2 + 100, 50, 500);

        //pipe top
        g.setColor(Color.green);
        g.fillRect(x3, 0, 50, h3);

        //pipe bottom
        g.setColor(Color.green);
        g.fillRect(x3, h3 + 100, 50, 500);

        //pipe top
        g.setColor(Color.green);
        g.fillRect(x4, 0, 50, h4);

        //pipe bottom
        g.setColor(Color.green);
        g.fillRect(x4, h4 + 100, 50, 500);
    }

    public void reduceX() {
        x1--;
        x2--;
        x3--;
        x4--;
    }

    public void reX() {//lap lai X
        if (x1 == -50) {
            x1 = 500;
            b1 = false;
        }
        if (x2 == -50) {
            x2 = 500;
            b2 = false;
        }
        if (x3 == -50) {
            x3 = 500;
            b3 = false;
        }
        if (x4 == -50) {
            x4 = 500;
            b4 = false;
        }
    }

}
