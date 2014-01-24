package tp1;

import Robot.*;

/**
 *
 * @author Louis Beziaud
 */
public class exercice12 {

    public static void initializeRobotState1() {
        Robot.initialize(3, 3);
        Robot.addBlock(0, 1, "?");
        Robot.addBlock(0, 2, "?");
        Robot.addBlock(0, 3, "?");
    }

    public static void initializeRobotState2() {
        Robot.initialize(3, 3);
        Robot.addBlock(0, 7, "?");
        Robot.addBlock(0, 4, "?");
        Robot.addBlock(0, 6, "?");
    }

    public static void initializeRobotState3() {
        Robot.initialize(3, 3);
        Robot.addBlock(0, 3, "?");
        Robot.addBlock(0, 2, "?");
        Robot.addBlock(0, 1, "?");
    }

    public static void initializeRobotState4() {
        Robot.initialize(3, 3);
        Robot.addBlock(0, 1, "?");
        Robot.addBlock(0, 7, "?");
        Robot.addBlock(0, 3, "?");
    }

    public static void initializeRobotState5() {
        Robot.initialize(3, 3);
        Robot.addBlock(0, 4, "?");
        Robot.addBlock(0, 2, "?");
        Robot.addBlock(0, 6, "?");
    }

    public static void main(String[] args) {

        initializeRobotState1();
        //initializeRobotState2();
        //initializeRobotState3();
        //initializeRobotState4();
        //initializeRobotState5();

        // placer ici vos instructions à exécuter
        int n1, n2, n3;

        // on récupère les numéros de chaque bloc
        Robot.pickBlock();
        n3 = Robot.readBlock();
        Robot.moveRight();
        Robot.putBlock();
        Robot.moveLeft();
        Robot.pickBlock();
        n2 = Robot.readBlock();
        Robot.moveRight();
        Robot.putBlock();
        Robot.moveLeft();
        Robot.pickBlock();
        n1 = Robot.readBlock();

        // on compare
        int biggest = Math.max(n1, Math.max(n2, n3));
        int smallest = Math.min(n1, Math.min(n2, n3));

        if (biggest == n1) {
            Robot.moveRight();
            Robot.moveRight();
            Robot.putBlock();
            Robot.moveLeft();

            if (smallest != n2) {
                Robot.pickBlock();
                Robot.moveRight();
                Robot.putBlock();
                Robot.moveLeft();
                Robot.pickBlock();
                Robot.moveRight();
                Robot.putBlock();
            } else {
                Robot.pickBlock();
                Robot.moveLeft();
                Robot.putBlock();
                Robot.moveRight();
                Robot.pickBlock();
                Robot.moveRight();
                Robot.putBlock();
                Robot.moveLeft();
                Robot.moveLeft();
                Robot.pickBlock();
                Robot.moveRight();
                Robot.moveRight();
                Robot.putBlock();
            }

        } else if (biggest == n2) {
            Robot.putBlock();
            Robot.moveRight();
            Robot.pickBlock();
            Robot.moveRight();
            Robot.putBlock();
            Robot.moveLeft();

            if (smallest != n1) {
                Robot.moveLeft();
                Robot.pickBlock();
                Robot.moveRight();
                Robot.moveRight();
                Robot.putBlock();
                Robot.moveLeft();
                Robot.pickBlock();
                Robot.moveRight();
                Robot.putBlock();
            } else {
                Robot.pickBlock();
                Robot.moveRight();
                Robot.putBlock();
                Robot.moveLeft();
                Robot.moveLeft();
                Robot.pickBlock();
                Robot.moveRight();
                Robot.moveRight();
                Robot.putBlock();
            }

        } else {
            Robot.putBlock();
            Robot.moveRight();
            Robot.pickBlock();
            Robot.moveLeft();
            Robot.putBlock();
            Robot.moveRight();
            Robot.pickBlock();
            Robot.moveRight();
            Robot.putBlock();
            Robot.moveLeft();

            if (smallest != n3) {
                Robot.moveLeft();
                Robot.pickBlock();
                Robot.moveRight();
                Robot.moveRight();
                Robot.putBlock();
                Robot.moveLeft();
                Robot.moveLeft();
                Robot.pickBlock();
                Robot.moveRight();
                Robot.moveRight();
                Robot.putBlock();
            } else {
                Robot.moveLeft();
                Robot.pickBlock();
                Robot.moveRight();
                Robot.putBlock();
                Robot.moveLeft();
                Robot.pickBlock();
                Robot.moveRight();
                Robot.moveRight();
                Robot.putBlock();
                Robot.moveLeft();
                Robot.pickBlock();
                Robot.moveRight();
                Robot.putBlock();
            }

        }

        // pour démarrer le robot
        Robot.play();

    }

}
