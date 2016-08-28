package com.mowitnow.tondeuse;

import com.mowitnow.tondeuse.cardinalpoint.*;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class SurfaceTest {

    private Surface surface;

    private static final Coordinate DEFAULT_COORDINATE = new Coordinate(1, 1);

    @Before
    public void initialization () {
        this.surface = new Surface(DEFAULT_COORDINATE);
    }

    @Test
    public void tondeuse_should_not_move_forward_when_start_position_1_1_N_and_surface_1_1 () {
        //Given
        Tondeuse tondeuse = this.generateDefault(North.getInstance());

        //When
        surface.add(tondeuse);
        surface.move('A');

        //Then
        assertThat(tondeuse.toString()).isEqualTo("1 1 N");
    }

    @Test
    public void tondeuse_position_should_move_forward_when_start_position_1_1_W_and_surface_1_1 () {
        //Given
        Tondeuse tondeuse = this.generateDefault(West.getInstance());

        //When
        surface.add(tondeuse);
        surface.move('A');

        //Then
        assertThat(tondeuse.toString()).isEqualTo("0 1 W");
    }

    @Test
    public void tondeuse_position_should_move_forward_when_start_position_1_1_S_and_surface_1_1 () {
        //Given
        Tondeuse tondeuse = this.generateDefault(South.getInstance());

        //When
        surface.add(tondeuse);
        surface.move('A');

        //Then
        assertThat(tondeuse.toString()).isEqualTo("1 0 S");
    }

    @Test
    public void tondeuse_position_should_not_move_forward_when_start_position_1_1_E_and_surface_1_1 () {
        //Given
        Tondeuse tondeuse = this.generateDefault(East.getInstance());

        //When
        surface.add(tondeuse);
        surface.move('A');

        //Then
        assertThat(tondeuse.toString()).isEqualTo("1 1 E");
    }

    private Tondeuse generateDefault(CardinalPoint cardinalPoint) {
        return new Tondeuse(new BasePosition(cardinalPoint, DEFAULT_COORDINATE));
    }

}