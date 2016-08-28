package com.mowitnow.tondeuse;

import com.mowitnow.tondeuse.cardinalpoint.CardinalPoint;
import com.mowitnow.tondeuse.direction.DirectionFactory;

public class Tondeuse {
    private CardinalPoint toward;
    private Coordinate position;

    public Tondeuse (BasePosition basePosition) {
        this.toward = basePosition.getCardinalPoint();
        this.position = basePosition.getCoordinate();
    }

    public void move (Character direction) {
        DirectionFactory.INSTANCE.getDirection(direction).move(this);
    }

    public void left () {
        this.toward = this.toward.left();
    }

    public void right () {
        this.toward = this.toward.right();
    }

    public void forward () {
        this.position = this.toward.move(this.position);
    }
}
