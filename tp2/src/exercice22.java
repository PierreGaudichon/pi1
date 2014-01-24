
import es.*;
import Robot.*;

public class exercice22 {

    public static void initializeRobotState1() {
        Robot.initialize(3, 3);
        Robot.addBlock(0, 3, "?");
        Robot.addBlock(0, 2, "?");
        Robot.addBlock(1, 3, "?");
        Robot.addBlock(2, 1, "?");
        Robot.addBlock(2, 1, "?");
        Robot.addBlock(2, 1, "?");
    }

    public static void initializeRobotState2() {
        Robot.initialize(3, 3);
        Robot.addBlock(0, 3, "?");
        Robot.addBlock(0, 2, "?");
        Robot.addBlock(1, 4, "?");
        Robot.addBlock(2, 3, "?");
        Robot.addBlock(2, 1, "?");
        Robot.addBlock(2, 3, "?");
    }

    public static void initializeRobotState3() {
        Robot.initialize(3, 3);
        Robot.addBlock(0, 2, "?");
        Robot.addBlock(0, 3, "?");
        Robot.addBlock(1, 4, "?");
        Robot.addBlock(2, 3, "?");
        Robot.addBlock(2, 1, "?");
        Robot.addBlock(2, 3, "?");
    }

    public static void initializeRobotState4() {
        Robot.initialize(3, 3);
        Robot.addBlock(0, 4, "?");
        Robot.addBlock(0, 6, "?");
        Robot.addBlock(1, 1, "?");
        Robot.addBlock(2, 7, "?");
        Robot.addBlock(2, 3, "?");
        Robot.addBlock(2, 2, "?");
    }

    public static void initializeRobotState5() {
        Robot.initialize(3, 3);
        Robot.addBlock(0, 4, "?");
        Robot.addBlock(0, 6, "?");
        Robot.addBlock(1, 1, "?");
        Robot.addBlock(2, 7, "?");
        Robot.addBlock(2, 3, "?");
        Robot.addBlock(2, 9, "?");
    }

    public static void main(String[] args) {
        initializeRobotState5();
        int a, b, c;
        boolean c1, c2, c3, c4;

        // cond 1
        Robot.pickBlock();
        a = Robot.readBlock();
        Robot.putBlock();
        Robot.moveRight();
        Robot.pickBlock();
        b = Robot.readBlock();
        Robot.putBlock();
        Robot.moveLeft();
        // test 1
        c1 = a == b;

        // cond 2
        Robot.moveRight();
        Robot.moveRight();
        Robot.pickBlock();
        a = Robot.readBlock();
        Robot.moveLeft();
        Robot.putBlock();
        Robot.moveRight();
        Robot.pickBlock();
        b = Robot.readBlock();
        Robot.moveLeft();
        Robot.putBlock();
        Robot.moveRight();
        Robot.pickBlock();
        c = Robot.readBlock();
        Robot.putBlock();
        Robot.moveLeft();
        Robot.pickBlock();
        Robot.moveRight();
        Robot.putBlock();
        Robot.moveLeft();
        Robot.pickBlock();
        Robot.moveRight();
        Robot.putBlock();
        Robot.moveLeft();
        Robot.moveLeft();
        // test 2
        c2 = a != b && a != c && b != c;

        // cond 3
        Robot.pickBlock();
        a = Robot.readBlock();
        Robot.moveRight();
        Robot.putBlock();
        Robot.moveLeft();
        Robot.pickBlock();
        b = Robot.readBlock();
        Robot.putBlock();
        Robot.moveRight();
        Robot.pickBlock();
        Robot.moveLeft();
        Robot.putBlock();
        // test 3
        c3 = a > b;

        // cond 4
        Robot.moveRight();
        Robot.moveRight();
        Robot.pickBlock();
        a = Robot.readBlock();
        Robot.moveLeft();
        Robot.putBlock();
        Robot.moveRight();
        Robot.pickBlock();
        a = a + Robot.readBlock();
        Robot.moveLeft();
        Robot.putBlock();
        Robot.moveRight();
        Robot.pickBlock();
        a = a + Robot.readBlock();
        Robot.putBlock();
        Robot.moveLeft();
        Robot.pickBlock();
        Robot.moveRight();
        Robot.putBlock();
        Robot.moveLeft();
        Robot.pickBlock();
        Robot.moveRight();
        Robot.putBlock();
        Robot.moveLeft();
        Robot.moveLeft();
        // test 4
        c4 = a > 18;

        // out
        System.out.println("Condition 1 : " + c1);
        System.out.println("Condition 2 : " + c2);
        System.out.println("Condition 3 : " + c3);
        System.out.println("Condition 4 : " + c4);

           Robot.play();
    }
    
    
}



