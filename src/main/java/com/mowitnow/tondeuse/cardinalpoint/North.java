package com.mowitnow.tondeuse.cardinalpoint;

public class North extends CardinalPoint {
    private static North instance = new North();

    public static North getInstance () {
        return instance;
    }

    CardinalPoint left() {
        return West.getInstance();
    }

    CardinalPoint right() {
        return East.getInstance();
    }
}
