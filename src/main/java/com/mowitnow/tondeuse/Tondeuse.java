package com.mowitnow.tondeuse;

import com.mowitnow.tondeuse.cardinalpoint.CardinalPoint;

public class Tondeuse {
    private CardinalPoint toward;
    private Coordinate position;

    public Tondeuse (BasePosition basePosition) {
        this.toward = basePosition.getCardinalPoint();
        this.position = basePosition.getCoordinate();
    }
}
