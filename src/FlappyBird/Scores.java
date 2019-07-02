/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlappyBird;

/**
 *
 * @author hieum
 */
public class Scores {

    private static int score = 0;
    private Bird bird = new Bird();
    private Pipe pipe = new Pipe();
    private static boolean bl = false;

    public static int getScore() {
        return score;
    }

    public void addScore() {
        if (bird.getX() + 20 > pipe.getX1()
                && bird.getX() < pipe.getX1() + 65) {
            bl = true;
        }
        if (bl = true && bird.getX() > pipe.getX() + 50) {
            score++;
            bl = false;
        }
    }
}
