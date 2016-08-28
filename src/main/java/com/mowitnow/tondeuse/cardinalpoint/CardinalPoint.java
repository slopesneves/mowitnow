package com.mowitnow.tondeuse.cardinalpoint;

import com.mowitnow.tondeuse.Coordinate;

public abstract class CardinalPoint {
    protected CardinalPoint () {}
    public abstract CardinalPoint left();
    public abstract CardinalPoint right();
    public abstract Coordinate move(Coordinate coordinate);
}
