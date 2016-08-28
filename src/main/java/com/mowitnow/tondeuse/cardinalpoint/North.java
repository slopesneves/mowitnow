package com.mowitnow.tondeuse.cardinalpoint;

public class North extends CardinalPoint {
    private static North instance = new North();

    public static North getInstance () {
        return instance;
    }

    public CardinalPoint left() {
        return West.getInstance();
    }

    public CardinalPoint right() {
        return East.getInstance();
    }
}
