package tp1;

import Robot.*;

/**
 *
 * @author Louis Beziaud
 */
public class exercice11 {

    public static void initializeRobotState1() {
        Robot.initialize(3, 4);
        Robot.addBlock(0, 1, "?");
        Robot.addBlock(0, 2, "?");
        Robot.addBlock(0, 1, "?");
    }

    public static void initializeRobotState2() {
        Robot.initialize(3, 3);
        Robot.addBlock(0, 1, "?");
        Robot.addBlock(0, 1, "?");
        Robot.addBlock(0, 1, "?");
    }

    public static void initializeRobotState3() {
        Robot.initialize(3, 3);
        Robot.addBlock(0, 2, "?");
        Robot.addBlock(0, 2, "?");
        Robot.addBlock(0, 1, "?");
    }

    public static void initializeRobotState4() {
        Robot.initialize(3, 3);
        Robot.addBlock(0, 2, "?");
        Robot.addBlock(0, 2, "?");
        Robot.addBlock(0, 2, "?");
    }

    public static void main(String[] args) {

        initializeRobotState1();
        //initializeRobotState2();
        //initializeRobotState3();
        //initializeRobotState4();
        
        // placer ici vos instructions à exécuter
        int n;

        while (Robot.isEmptyColumn() == false) {
            Robot.pickBlock();
            n = Robot.readBlock();
            if (n == 1) {
                Robot.moveRight();
                Robot.putBlock();
                Robot.moveLeft();
            } else {
                Robot.moveRight();
                Robot.moveRight();
                Robot.putBlock();
                Robot.moveLeft();
                Robot.moveLeft();
            }
        }

        // pour démarrer le robot
        Robot.play();

    }

}
