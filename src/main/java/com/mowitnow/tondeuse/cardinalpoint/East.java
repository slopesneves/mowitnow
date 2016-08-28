package com.mowitnow.tondeuse.cardinalpoint;

import com.mowitnow.tondeuse.Coordinate;

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

    public Coordinate move(Coordinate coordinate) {
        Integer x = coordinate.getX() + 1;
        Integer y = coordinate.getY();
        return new Coordinate(x, y);
    }
}
