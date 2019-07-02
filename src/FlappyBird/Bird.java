/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlappyBird;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author hieum
 */
public class Bird  {

    private static int y = 100;
    private static int x = 50;

    public static int getY() {
        return y;
    }
    public static int getX() {
        return x;
    }

    
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(x, y, 20, 20);

    }
    // Bird dow
    public void upY() {
        y++;
    }
    // Bird up
    public void dowY() {
        y-=40;
    }

}
