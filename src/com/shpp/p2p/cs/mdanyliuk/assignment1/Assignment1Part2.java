package com.shpp.p2p.cs.mdanyliuk.assignment1;

import com.shpp.karel.KarelTheRobot;

public class Assignment1Part2 extends KarelTheRobot {
    public void run() throws Exception {
        if(leftIsClear()) {
            repairColumn();
            goToBaseOfColumn();
        } else {
            putIfNoBeeper();
        }

        while(frontIsClear()){
            goToNextColumn();
            repairColumn();
            goToBaseOfColumn();
        }
    }
    private void repairColumn() throws Exception{
        turnLeft();
        moveAndRepairUntilReachTop();
    }

    private void moveAndRepairUntilReachTop() throws Exception{
        putIfNoBeeper();
        while (frontIsClear()){
            move();
            putIfNoBeeper();
        }
    }
    private void goToBaseOfColumn() throws Exception {
        moveUntilReachBottom();
        turnLeft();
    }

    private void moveUntilReachBottom() throws Exception{
        turnAround();
        while (frontIsClear()) {
            move();
        }
    }

    private void turnAround() throws Exception{
        turnLeft();
        turnLeft();
    }

    private void putIfNoBeeper() throws Exception{
        if (noBeepersPresent()) {
            putBeeper();
        }
    }

    private void goToNextColumn()throws Exception {
        for (int i = 1; i <= 4; i++){
            move();
        }
    }
}