package com.mowitnow.tondeuse.direction;

import com.mowitnow.tondeuse.Tondeuse;

public class Avant extends Direction {
    public static final Avant INSTANCE = new Avant();

    private Avant () {}

    public void move(Tondeuse tondeuse) {
        tondeuse.forward();
    }
}
