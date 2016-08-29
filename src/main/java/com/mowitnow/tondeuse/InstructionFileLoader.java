package com.mowitnow.tondeuse;


import com.mowitnow.tondeuse.cardinalpoint.CardinalPoint;
import com.mowitnow.tondeuse.cardinalpoint.CardinalPointFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class InstructionFileLoader {
    private Surface surface;

    public InstructionFileLoader (String filePath) throws IOException{
        FileInputStream fis = null;
        Scanner sc = null;
        try {
            fis = new FileInputStream(filePath);
            sc = new Scanner(fis, "UTF-8");

            String surfaceSizeLine = sc.nextLine();

            surface = loadSurface(surfaceSizeLine);

            while (sc.hasNextLine()) {
                String baseTondeusePositionLine = sc.nextLine();
                String instructionsLine = sc.nextLine();
                Tondeuse tondeuse = loadTondeuse(baseTondeusePositionLine);
                surface.add(tondeuse);

                for(Character instruction : instructionsLine.toCharArray()) {
                    surface.move(instruction);
                }

                System.out.println(tondeuse.toString());
            }
        }finally {
            if(fis != null) {
                fis.close();
            }
        }
    }

    public Surface getSurface() {
        return surface;
    }

    private static Surface loadSurface (String surfaceSizeLine) {
        String[] maxCoordinates = surfaceSizeLine.split(" ");
        Integer x = Integer.valueOf(maxCoordinates[0]);
        Integer y = Integer.valueOf(maxCoordinates[1]);
        Coordinate coordinate = new Coordinate(x, y);
        return new Surface(coordinate);
    }

    private static Tondeuse loadTondeuse (String baseTondeusePositionLine) {
        Coordinate coordinate = coordinateFromLine(baseTondeusePositionLine);
        CardinalPoint cardinalPoint = cardinalPointFromLine(baseTondeusePositionLine);
        return new Tondeuse(new BasePosition(cardinalPoint, coordinate));
    }

    private static Coordinate coordinateFromLine(String line) {
        String[] coordinates = line.split(" ");
        Integer x = Integer.valueOf(coordinates[0]);
        Integer y = Integer.valueOf(coordinates[1]);
        return new Coordinate(x, y);
    }

    private static CardinalPoint cardinalPointFromLine(String line) {
        String cardinalPointString = line.split(" ")[2];
        CardinalPoint cardinalPoint = CardinalPointFactory.INSTANCE.get(cardinalPointString.charAt(0));
        return cardinalPoint;
    }
}
