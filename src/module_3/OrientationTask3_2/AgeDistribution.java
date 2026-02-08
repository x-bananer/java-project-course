package module_3.OrientationTask3_2;

import java.util.Random;

public class AgeDistribution {
    static int REPETITIONS = 1000;
    static int[][] AGES = {
            {16, 20},
            {34, 21},
            {52, 22},
            {68, 23},
            {82, 24},
            {89, 25},
            {94, 26},
            {96, 28},
            {98, 30},
            {100, 35}
    };

    static int[] generatedAges = new int[35 + 1];

    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < REPETITIONS; i++) {
            int randomNumber = random.nextInt(100) + 1;

            for (int j = 0; j < AGES.length; j++) {
                if (randomNumber <= AGES[j][0]) {
                    generatedAges[AGES[j][1]]++;
                    break;
                }
            }
        }

        for (int i = 0; i < generatedAges.length; i++) {
            if (generatedAges[i] > 0) {
                int count = generatedAges[i];
                int age = generatedAges[i];
                double share = age * 100.0 / REPETITIONS;

                System.out.println(count + " y.o: " + age + " ppl. - " + share + "%");
            }

        }
    }
}
