package com.mowitnow.tondeuse.cardinalpoint;

public class South extends CardinalPoint {
    private static South instance = new South();

    public static South getInstance () {
        return instance;
    }

    public CardinalPoint left() {
        return East.getInstance();
    }

    public CardinalPoint right() {
        return West.getInstance();
    }
}
