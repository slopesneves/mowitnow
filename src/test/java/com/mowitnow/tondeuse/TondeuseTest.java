package com.mowitnow.tondeuse;

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
}