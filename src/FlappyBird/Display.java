/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlappyBird;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

/**
 *
 * @author hieum
 */
public class Display extends JFrame {
    private Paint paint = new Paint();
    private Bird bird = new Bird();
    public Display() {
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(400,100);
        setResizable(false);
        add(paint);
        addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent e) {
               bird.dowY(); 
            }
            
        });
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                bird.dowY(); //To change body of generated methods, choose Tools | Templates.
            }
            
});
    }

    public static void main(String[] args) {
        Display ds = new Display();
    }
}
