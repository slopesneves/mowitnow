package com.mowitnow.tondeuse.cardinalpoint;

public class West extends CardinalPoint {
    private static West instance = new West();

    public static West getInstance () {
        return instance;
    }

    CardinalPoint left() {
        return South.getInstance();
    }

    CardinalPoint right() {
        return North.getInstance();
    }
}
