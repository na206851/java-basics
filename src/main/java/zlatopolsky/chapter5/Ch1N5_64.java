package zlatopolsky.chapter5;

import java.util.Random;

public class Ch1N5_64 {

    public int[] arrayHuman(int countArea, int maxHuman, int minHuman) {
        int[] arrayHuman = new int[countArea];
        Random randomHuman = new Random();
        for (int i = 0; i < arrayHuman.length; i++) {
            arrayHuman[i] = randomHuman.nextInt(maxHuman - minHuman) + minHuman;
        }
        return arrayHuman;
    }

    public int[] arraySquare(int countArea, int maxSquare, int minSquare) {
        int[] arraySquare = new int[countArea];
        Random randomSquare = new Random();
        for (int j = 0; j < countArea; j++) {
            arraySquare[j] = randomSquare.nextInt(maxSquare - minSquare) + minSquare;
        }
        return arraySquare;
    }

    public double density(int countArea, int[] arrayHuman, int[] arraySquare) {
        double generalPopulation = 0;
        double generalSquare = 0;
        for (int k = 0; k < countArea; k++) {
            generalPopulation += arrayHuman[k];
            generalSquare += arraySquare[k];
        }
        return generalPopulation / generalSquare;
    }
}