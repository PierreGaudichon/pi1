
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

    public static void put(int from, int to) {
        for (int i = 1; i < from; i++) {
            Robot.moveRight();
        }
        Robot.pickBlock();
        for (int i = 1; i < from; i++) {
            Robot.moveLeft();
        }
        for (int i = 1; i < to; i++) {
            Robot.moveRight();
        }
        Robot.putBlock();
        for (int i = 1; i < to; i++) {
            Robot.moveLeft();
        }
    }

    public static int read(int l) {
        int a = -1;
        for (int i = 1; i < l; i++) {
            Robot.moveRight();
        }
        if (!Robot.isEmptyColumn()) {
            Robot.pickBlock();
            a = Robot.readBlock();
            Robot.putBlock();
        }
        for (int i = 1; i < l; i++) {
            Robot.moveLeft();
        }
        return a;
    }

    public static boolean empty(int l) {
        for (int i = 1; i < l; i++) {
            Robot.moveRight();
        }
        boolean a = Robot.isEmptyColumn();
        for (int i = 1; i < l; i++) {
            Robot.moveLeft();
        }
        return a;
    }

    public static void inserer(int n) {
        int a;
        while (!empty(2)) {
            a = read(2);
            if (empty(1) || read(1) <= a) {
                put(2, 1);
                while (!empty(3)) {
                    put(3, 1);
                }
            } else {
                put(1, 3);
            }
        }
    }

    public static void main(String[] args) {

        //testIntertion1();
        //testIntertion2();
        //testIntertion3();

        testTri1();
        //testTri2()
        //testTri3();
        //testTri4();
        //testTri5();
        
        inserer(2);
        
        Robot.play();
    }

}
