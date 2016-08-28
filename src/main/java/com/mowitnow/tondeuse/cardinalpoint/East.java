package com.mowitnow.tondeuse.cardinalpoint;

public class East extends CardinalPoint {
    private static East instance = new East();

    public static East getInstance () {
        return instance;
    }

    public CardinalPoint left() {
        return North.getInstance();
    }

    public CardinalPoint right() {
        return South.getInstance();
    }
}
