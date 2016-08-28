package com.mowitnow.tondeuse.cardinalpoint;

public class East extends CardinalPoint {
    private static East instance = new East();

    public static East getInstance () {
        return instance;
    }

    CardinalPoint left() {
        return North.getInstance();
    }

    CardinalPoint right() {
        return South.getInstance();
    }
}
