package demo;

import java.util.Random;

public class RandomWithSeed {
    public static void main(String[] args) {
        // Create a Random object with a specific seed (e.g., 123)
        Random random = new Random(8);

        // Generate some random integers
        for (int i = 0; i < 5; i++) {
            int randomNumber = random.nextInt(100);
            System.out.println("Random Number: " + randomNumber);
        }
    }
}