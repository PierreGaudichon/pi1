
import Robot.*;

public class extraction {

    public static void initExtraction1() {
        Robot.initialize(3, 4);
        Robot.addBlock(0, 5);
        Robot.addBlock(0, 3);
        Robot.addBlock(0, 1);
    }

    public static void initExtraction2() {
        Robot.initialize(3, 4);
    }

    public static void initExtraction3() {
        Robot.initialize(3, 4);
        Robot.addBlock(0, 5);
    }

    public static void initExtraction4() {
        Robot.initialize(3, 4);
        Robot.addBlock(0, 3);
    }

    public static void initExtraction5() {
        Robot.initialize(3, 4);
        Robot.addBlock(0, 4);
        Robot.addBlock(0, 3);
        Robot.addBlock(0, 2);
        Robot.addBlock(0, 1);

    }

    // fonction extraction: prend deux entiers min et max en paramètre
    public static void extraction(int min, int max) {
        while (!Robot.isEmptyColumn()) {
            Robot.pickBlock();
            Robot.moveRight();
            int b = Robot.readBlock();
            if (min < b && b < max) {
                Robot.moveRight();
                Robot.putBlock();
                Robot.moveLeft();
                Robot.moveLeft();
            } else {
                Robot.putBlock();
                Robot.moveLeft();
            }
        }
        Robot.moveRight();
        while (!Robot.isEmptyColumn()) {
            Robot.pickBlock();
            Robot.moveLeft();
            Robot.putBlock();
            Robot.moveRight();
        }
        Robot.moveLeft();
    }

    public static void main(String[] args) {
        initExtraction1();
	//initExtraction2();
        //initExtraction3();
        //initExtraction4();
        //initExtraction5();

        extraction(2, 4);
        
        Robot.play();

    }

}
