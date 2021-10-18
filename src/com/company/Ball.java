package com.company;

import java.lang.reflect.Array;

public class Ball {

    private boolean isBlue;
    private double ballWeight;

    public Ball(boolean isBlueColor, double weight) {
        this.isBlue = isBlueColor;
        this.ballWeight = weight;
    }

    public boolean getBlueColor() {
        return isBlue;
    }

    public double getBallWeight() {
        return ballWeight;
    }

    @Override
    public String toString() {
        return isBlue + ", " + ballWeight;
    }
}
