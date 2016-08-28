package com.mowitnow.tondeuse.cardinalpoint;

public class South extends CardinalPoint {
    private static South instance = new South();

    public static South getInstance () {
        return instance;
    }

    CardinalPoint left() {
        return East.getInstance();
    }

    CardinalPoint right() {
        return West.getInstance();
    }
}
