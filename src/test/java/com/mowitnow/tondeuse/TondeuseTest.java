package com.mowitnow.tondeuse;

import com.mowitnow.tondeuse.cardinalpoint.East;
import com.mowitnow.tondeuse.cardinalpoint.North;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TondeuseTest {
    @Test
    public void final_position_should_be_1_3_N_when_start_position_1_2_N_and_movement_GAGAGAGAA () {
        //Given
        Tondeuse tondeuse;
        BasePosition startPosition;
        Coordinate coordinate = new Coordinate(1, 2);
        startPosition = new BasePosition(North.getInstance(), coordinate);
        tondeuse = new Tondeuse(startPosition);

        //When
        tondeuse.move('G');
        tondeuse.move('A');
        tondeuse.move('G');
        tondeuse.move('A');
        tondeuse.move('G');
        tondeuse.move('A');
        tondeuse.move('G');
        tondeuse.move('A');
        tondeuse.move('A');

        //Then
        assertThat(tondeuse.toString()).isEqualTo("1 3 N");
    }

    @Test
    public void final_position_should_be_5_1_E_when_start_position_3_3_E_and_movement_AADAADADDA () {
        //Given
        Tondeuse tondeuse;
        BasePosition startPosition;
        Coordinate coordinate = new Coordinate(3, 3);
        startPosition = new BasePosition(East.getInstance(), coordinate);
        tondeuse = new Tondeuse(startPosition);

        //When
        tondeuse.move('A');
        tondeuse.move('A');
        tondeuse.move('D');
        tondeuse.move('A');
        tondeuse.move('A');
        tondeuse.move('D');
        tondeuse.move('A');
        tondeuse.move('D');
        tondeuse.move('D');
        tondeuse.move('A');

        //Then
        assertThat(tondeuse.toString()).isEqualTo("5 1 E");
    }
}