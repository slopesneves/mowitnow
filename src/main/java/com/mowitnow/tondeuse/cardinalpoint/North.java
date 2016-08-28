package com.mowitnow.tondeuse.cardinalpoint;

import com.mowitnow.tondeuse.Coordinate;

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

    public Coordinate move(Coordinate coordinate) {
        Integer x = coordinate.getX();
        Integer y = coordinate.getY() + 1;
        return new Coordinate(x, y);
    }

    public String toString () {
        return "N";
    }
}
