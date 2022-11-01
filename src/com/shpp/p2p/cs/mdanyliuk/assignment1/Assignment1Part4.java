package com.shpp.p2p.cs.mdanyliuk.assignment1;

import com.shpp.karel.KarelTheRobot;

public class Assignment1Part4 extends KarelTheRobot {
    public void run() throws Exception {
        goToBeeper();
        pickBeeper();
        returnToStartPosition();
    }

    private void goToBeeper() throws Exception{
        turnRight();
        goUntilFindBeeper();
    }

    private void turnRight() throws Exception{
        turnLeft();
        turnLeft();
        turnLeft();
    }

    private void goUntilFindBeeper() throws Exception {
        makeStepAndTurnLeft();
        while (noBeepersPresent()) {
            move();
        }
    }

    private void makeStepAndTurnLeft() throws Exception{
        move();
        turnLeft();
    }

    private void returnToStartPosition() throws Exception{
        moveUntilFindWall();
        goToPosition();
    }

    private void moveUntilFindWall() throws Exception{
        turnAround();
        while(frontIsClear()){
            move();
        }
    }

    private void turnAround() throws Exception{
        turnLeft();
        turnLeft();
    }

    private void goToPosition() throws Exception{
        turnRight();
        move();
        turnRight();
    }
}
