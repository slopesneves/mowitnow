package com.mowitnow.tondeuse.direction;

import com.mowitnow.tondeuse.Tondeuse;

public class Gauche extends Direction {
    public static final Gauche INSTANCE = new Gauche();

    private Gauche () {}

    public void move(Tondeuse tondeuse) {
        tondeuse.left();
    }
}
