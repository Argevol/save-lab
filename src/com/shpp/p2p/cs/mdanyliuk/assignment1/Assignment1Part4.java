package com.shpp.p2p.cs.mdanyliuk.assignment1;

import com.shpp.karel.KarelTheRobot;

public class Assignment1Part4 extends KarelTheRobot {
    public void run() throws Exception {
        fillFirstLine();
        while (frontIsClear()){
            fillSecondLine();
            fillFirstLine();
        }
    }

    private void fillFirstLine() throws Exception {
        fillLineInChessOrder();
        if(noBeepersPresent()){
            move();
            turnLeft();
        } else {
            move();
            turnLeft();
            move();
        }
    }


    private void fillSecondLine() throws Exception {
        fillLineInChessOrder();
        if(noBeepersPresent()){
            move();
            turnRight();
        } else {
            move();
            turnRight();
            move();
        }
    }

    private void fillLineInChessOrder() throws Exception {
        putBeeper();
        while (frontIsClear()) {
            move();
            if (frontIsClear()) {
                move();
                putBeeper();
            }
        }
        turnNorth();
    }

    private void turnNorth() throws Exception{
        while (notFacingNorth()){
            turnLeft();
        }
    }

    private void turnRight() throws Exception{
       turnLeft();
       turnLeft();
       turnLeft();
    }
}