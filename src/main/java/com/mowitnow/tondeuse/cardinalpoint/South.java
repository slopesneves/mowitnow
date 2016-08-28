package com.mowitnow.tondeuse.cardinalpoint;

import com.mowitnow.tondeuse.Coordinate;

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

    public Coordinate move(Coordinate coordinate) {
        Integer x = coordinate.getX();
        Integer y = coordinate.getY() - 1;
        return new Coordinate(x, y);
    }

    public String toString () {
        return "S";
    }
}
