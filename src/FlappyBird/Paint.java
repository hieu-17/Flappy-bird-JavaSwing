/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlappyBird;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hieum
 */
public class Paint  extends JPanel implements Runnable{ 
    private Bird bird =new Bird();
    private Pipe pipe=new Pipe();
    private CheckDie checkDie =new CheckDie();
    Thread threadPain;
    private Scores scores =new Scores();
    
    public Paint(){
        threadPain=new Thread(this);
        threadPain.start();
    }
    public void paint(Graphics g){
        g.setColor(Color.cyan);
        g.fillRect(0,0,getWidth(),getHeight());
        pipe.paint(g);
        g.setColor(Color.green);
        g.fillRect(0, 400, getWidth(), getHeight());
        g.setColor(Color.orange);
        g.fillRect(0, 410, getWidth(), getHeight());
        bird.paint(g);
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial",Font.BOLD,20));
        g.drawString("Điểm: "+scores.getScore(),10, 20);
        
    }
    @Override
    public void run() {
        while(true){
            repaint();
            pipe.reduceX();
            try {
                Thread.sleep(5);//
            } catch (InterruptedException ex) {
                Logger.getLogger(Paint.class.getName()).log(Level.SEVERE, null, ex);
            }
            pipe.reX();
            bird.upY();
            if(checkDie.died()){
                threadPain.stop();
            };
            scores.addScore();
            System.out.println(scores.getScore());
        }
    }

    
}
