package com.mowitnow.tondeuse.direction;

import com.mowitnow.tondeuse.Tondeuse;

public class Droite extends Direction {
    public static final Droite INSTANCE = new Droite();

    private Droite () {}

    public void move(Tondeuse tondeuse) {
        tondeuse.right();
    }
}
