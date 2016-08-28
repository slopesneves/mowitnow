package com.mowitnow.tondeuse;

import com.mowitnow.tondeuse.cardinalpoint.CardinalPoint;
import com.mowitnow.tondeuse.direction.DirectionFactory;

public class Tondeuse {
    private CardinalPoint toward;

    Coordinate getPosition() {
        return position;
    }

    private Coordinate position;
    private Coordinate previousPosition;

    public Tondeuse (BasePosition basePosition) {
        this.toward = basePosition.getCardinalPoint();
        this.previousPosition = basePosition.getCoordinate();
        this.position = basePosition.getCoordinate();
    }

    public void move (Character direction) {
        previousPosition = position;
        DirectionFactory.INSTANCE.getDirection(direction).move(this);
    }

    public void rollback () {
        this.position = previousPosition;
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

    public String toString () {
        return this.position + " " + this.toward;
    }
}
