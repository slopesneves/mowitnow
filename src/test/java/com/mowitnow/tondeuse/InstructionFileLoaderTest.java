package com.mowitnow.tondeuse;


import org.junit.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.*;


public class InstructionFileLoaderTest {
    private static final String INSTRUCTIONS_FILE_PATH = "./src/test/resources/instructions.txt";

    private InstructionFileLoader instance;

    @Test
    public void should_return_surface_5_5_with_two_tondeuse_position_1_3_N_and_5_1_E_when_read_instructions_file () throws IOException {
        //Given
        instance = new InstructionFileLoader(INSTRUCTIONS_FILE_PATH);

        //When
        Surface surface = instance.getSurface();

        //Then
        assertThat(surface.toString()).isEqualTo("5 5");
        assertThat(surface.getTondeuses().stream().map(Tondeuse::toString))
                .containsExactly(
                        "1 3 N",
                        "5 1 E"
                );
    }
}