package com.mowitnow.tondeuse;

import com.mowitnow.tondeuse.cardinalpoint.CardinalPoint;

public class BasePosition {
    private CardinalPoint cardinalPoint;
    private Coordinate coordinate;

    public BasePosition(CardinalPoint cardinalPoint, Coordinate coordinate) {
        this.cardinalPoint = cardinalPoint;
        this.coordinate = coordinate;
    }

    public CardinalPoint getCardinalPoint() {
        return cardinalPoint;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }
}
