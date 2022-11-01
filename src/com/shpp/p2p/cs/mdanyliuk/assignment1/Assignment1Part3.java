package com.shpp.p2p.cs.mdanyliuk.assignment1;

import com.shpp.karel.KarelTheRobot;

public class Assignment1Part3 extends KarelTheRobot {
    public void run() throws Exception {
        fillLineWithBeepers();
        turnAroundAndMove();
        while (beepersPresent()) {
            moveToEnd();
            returnToBeeper();
        }
        putBeeper();
    }

    private void fillLineWithBeepers() throws Exception{
        while (frontIsClear()){
            move();
            putBeeper();
        }
        pickBeeper();
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
