
import Robot.*;

public class TriInsertion {

    public static void testIntertion1() {
        Robot.initialize(3, 4);
        Robot.addBlock(0, 1);
        Robot.addBlock(1, 2);
    }

    public static void testIntertion2() {
        Robot.initialize(3, 4);
        Robot.addBlock(0, 1);
        Robot.addBlock(0, 3);
        Robot.addBlock(1, 2);
    }

    public static void testIntertion3() {
        Robot.initialize(3, 4);
        Robot.addBlock(0, 3);
        Robot.addBlock(0, 4);
        Robot.addBlock(1, 2);
    }

    public static void testTri1() {
        Robot.initialize(3, 4);
        Robot.addBlock(1, 1, "?");
        Robot.addBlock(1, 3, "?");
        Robot.addBlock(1, 2, "?");
    }

    public static void testTri2() {
        Robot.initialize(3, 5);
        Robot.addBlock(1, 1, "?");
        Robot.addBlock(1, 4, "?");
        Robot.addBlock(1, 3, "?");
        Robot.addBlock(1, 2, "?");
    }

    public static void testTri3() {
        // cas le pire ...
        Robot.initialize(3, 4);
        Robot.addBlock(1, 4, "?");
        Robot.addBlock(1, 3, "?");
        Robot.addBlock(1, 2, "?");
        Robot.addBlock(1, 1, "?");
    }

    public static void testTri4() {
        // cas le pire ...
        Robot.initialize(3, 6);
        Robot.addBlock(1, 4, "?");
        Robot.addBlock(1, 3, "?");
        Robot.addBlock(1, 5, "?");
        Robot.addBlock(1, 2, "?");
        Robot.addBlock(1, 6, "?");
        Robot.addBlock(1, 1, "?");
    }

    public static void testTri5() {
        Robot.initialize(3, 3);
        Robot.addBlock(1, 4, "?");
    }

    public static void inserer(int n) {
        Robot.pickBlock();
        int b = Robot.readBlock();
        Robot.putBlock();
        if (n >= b) {
            Robot.moveRight();
            Robot.pickBlock();
            Robot.moveLeft();
            Robot.putBlock();
        } else {
            while (n < b || !Robot.isEmptyColumn()) {
                Robot.pickBlock();
                b = Robot.readBlock();
                Robot.moveRight();
                Robot.moveRight();
                Robot.putBlock();
                Robot.moveLeft();
                Robot.moveLeft();
            }
            Robot.moveRight();
            Robot.pickBlock();
            Robot.moveLeft();
            Robot.putBlock();
            Robot.moveRight();
            Robot.moveRight();
            while (!Robot.isEmptyColumn()){
                Robot.pickBlock();
                Robot.moveLeft();
                Robot.moveLeft();
                Robot.putBlock();
                Robot.moveRight();
                Robot.moveRight();
            }
            Robot.moveLeft();
            Robot.moveLeft();
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // décommentez une ligne à la fois pour tester différents états initiaux pour l'insertion		
        //testIntertion1();
        //testIntertion2();
        testIntertion3();

        // test de l'algorithme d'insertion. Dans les données de tests, on cherche toujours
        // à insérer le bloc dont le numéro est 2
        // inserer(2);
        // décommentez une ligne à la fois pour tester différents états initiaux pour le tri			
        //testTri1();
        //testTri2()
        //testTri3();
        //testTri4();
        //testTri5();
        // test de l'algorithme de tri insertion
        inserer(2);

        Robot.play();
    }

}
