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
public class CheckDie {

    private Bird bird = new Bird();
    private Pipe pipe = new Pipe();

    public boolean died() {
        // check die with ground
        if (bird.getY() + 45 >= 425) {
            return true;
        }
        // check die with pipe top
        if (bird.getY() <= pipe.getH1()
                && ((bird.getX() + 20) >= pipe.getX1())
                && bird.getX() <= pipe.getX1() + 65) {
            return true;
        }
        // check die with pipe bottom
        if (bird.getY() >= pipe.getH1() + 100
                && ((bird.getX() + 20) >= pipe.getX1())
                && bird.getX() <= pipe.getX1() + 65) {
            return true;
        }
        
        // check die with pipe top
        if (bird.getY() <= pipe.getH2()
                && ((bird.getX() + 20) >= pipe.getX2())
                && bird.getX() <= pipe.getX2() + 65) {
            return true;
        }
        // check die with pipe bottom
        if (bird.getY() >= pipe.getH2() + 100
                && ((bird.getX() + 20) >= pipe.getX2())
                && bird.getX() <= pipe.getX2() + 65) {
            return true;
        }
        
        // check die with pipe top
        if (bird.getY() <= pipe.getH3()
                && ((bird.getX() + 20) >= pipe.getX3())
                && bird.getX() <= pipe.getX3() + 65) {
            return true;
        }
        // check die with pipe bottom
        if (bird.getY() >= pipe.getH3() + 100
                && ((bird.getX() + 20) >= pipe.getX3())
                && bird.getX() <= pipe.getX3() + 65) {
            return true;
        }
        
        // check die with pipe top
        if (bird.getY() <= pipe.getH4()
                && ((bird.getX() + 20) >= pipe.getX4())
                && bird.getX() <= pipe.getX4() + 65) {
            return true;
        }
        // check die with pipe bottom
        if (bird.getY() >= pipe.getH4() + 100
                && ((bird.getX() + 20) >= pipe.getX4())
                && bird.getX() <= pipe.getX4() + 65) {
            return true;
        }
           return false;
    }
}
