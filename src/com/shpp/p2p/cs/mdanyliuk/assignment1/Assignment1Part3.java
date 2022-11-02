package com.shpp.p2p.cs.mdanyliuk.assignment1;

import com.shpp.karel.KarelTheRobot;

public class Assignment1Part3 extends KarelTheRobot {
    public void run() throws Exception {
        fillLineWithBeepers();
        pickUpAllBeepers();
        turnAroundAndMove();
        putBeeper();
    }

    private void pickUpAllBeepers() throws Exception{
        turnAroundAndMove();
        while (beepersPresent()) {
            moveToEnd();
            returnToBeeper();
        }
    }

    private void fillLineWithBeepers() throws Exception{
        move();
        while (frontIsClear()){
            putBeeper();
            move();
        }
    }

    private void turnAroundAndMove() throws Exception{
        turnAround();
        move();
    }
    private void returnToBeeper() throws Exception{
        turnAround();
        move();
        pickBeeper();
        move();
    }

    private void moveToEnd() throws Exception{
        while (beepersPresent()){
            move();
        }
    }

    private void turnAround() throws Exception{
        turnLeft();
        turnLeft();
    }
}
