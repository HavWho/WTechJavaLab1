package com.company;

public class Basket {

    private double ballWeight = 0.0;
    private int blueBalls = 0;

    public Basket(Ball[] ballsArray) {

        for (Ball ball : ballsArray) {
            if (ball.getBlueColor()) {
                blueBalls++;
            }

            ballWeight += ball.getBallWeight();
        }
    }

    public double getBallWeight() {
        return ballWeight;
    }

    public int getBlueBalls() {
        return blueBalls;
    }

}
