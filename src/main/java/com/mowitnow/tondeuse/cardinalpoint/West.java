package com.mowitnow.tondeuse.cardinalpoint;

import com.mowitnow.tondeuse.Coordinate;

public class West extends CardinalPoint {
    private static West instance = new West();

    public static West getInstance () {
        return instance;
    }

    public CardinalPoint left() {
        return South.getInstance();
    }

    public CardinalPoint right() {
        return North.getInstance();
    }

    public Coordinate move(Coordinate coordinate) {
        Integer x = coordinate.getX() - 1;
        Integer y = coordinate.getY();
        return new Coordinate(x, y);
    }
}
