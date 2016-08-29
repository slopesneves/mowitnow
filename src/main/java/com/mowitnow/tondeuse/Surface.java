package com.mowitnow.tondeuse;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Surface {
    private static final MinCorner MIN_CORNER = new MinCorner(new Coordinate(0, 0));
    private MaxCorner maxCorner;
    private List<Tondeuse> tondeuses = new LinkedList<Tondeuse>();
    private Tondeuse tondeuse;

    public Surface (Coordinate maxCorner) {
        this.maxCorner = new MaxCorner(maxCorner);
    }

    public List<Tondeuse> getTondeuses() {
        return Collections.unmodifiableList(tondeuses);
    }

    public void add (Tondeuse tondeuse) {
        tondeuses.add(tondeuse);
        this.tondeuse = tondeuse;
    }

    public void move (Character direction) {
        tondeuse.move(direction);
        if (!this.isInside(tondeuse)) {
            tondeuse.rollback();
        }
    }

    private boolean isInside (Tondeuse tondeuse) {
        Coordinate position = tondeuse.getPosition();
        return Surface.MIN_CORNER.isInside(position)
                && this.maxCorner.isInside(position);
    }

    public String toString () {
        return maxCorner.toString();
    }

    private static class Corner {
        private Coordinate position;
        private Corner (Coordinate position) {
            this.position = position;
        }

        protected Coordinate getPosition() {
            return position;
        }
    }

    private static class MinCorner extends Corner {
        private MinCorner (Coordinate position) {
            super(position);
        }

        public boolean isInside (Coordinate position) {
            return position.getX() >= this.getPosition().getX()
                    && position.getY() >= this.getPosition().getY();
        }
    }

    private static class MaxCorner extends Corner {
        private MaxCorner (Coordinate position) {
            super(position);
        }

        public boolean isInside (Coordinate position) {
            return position.getX() <= this.getPosition().getX()
                    && position.getY() <= this.getPosition().getY();
        }

        public String toString () {
            return getPosition().toString();
        }
    }
}
