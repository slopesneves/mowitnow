package com.mowitnow.tondeuse.cardinalpoint;


public class CardinalPointFactory {
    public static final CardinalPointFactory INSTANCE = new CardinalPointFactory();
    private CardinalPointFactory () {}

    public CardinalPoint get(Character character) throws IllegalArgumentException {
        if('E' == character) {
            return East.getInstance();
        } else if ('N' == character) {
            return North.getInstance();
        } else if ('S' == character) {
            return South.getInstance();
        } else if ('W' == character) {
            return West.getInstance();
        } else {
            throw new IllegalArgumentException(this + " unable to instantiate Cardinal Point from " + character);
        }
    }
}
