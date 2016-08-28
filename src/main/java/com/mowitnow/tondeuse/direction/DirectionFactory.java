package com.mowitnow.tondeuse.direction;

public class DirectionFactory {
    public static final DirectionFactory INSTANCE = new DirectionFactory();
    private DirectionFactory () {}
    public Direction getDirection (Character character) throws IllegalArgumentException {
        if ('G' == character) {
            return Gauche.INSTANCE;
        } else if ('D' == character) {
            return Droite.INSTANCE;
        } else if ('A' == character) {
            return Avant.INSTANCE;
        } else {
            throw new IllegalArgumentException(this + " is unable to handle character " + character);
        }
    }
}
