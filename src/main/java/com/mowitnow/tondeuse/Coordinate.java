package com.mowitnow.tondeuse;

public class Coordinate {
    private Integer x;
    private Integer y;

    public Coordinate (Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public String toString () {
        return x + " " + y;
    }
}
