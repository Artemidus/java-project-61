package hexlet.code.games;


import hexlet.code.Engine;

import java.util.Random;

public class Prime {

    private static final int NUMBER_UPPER_LIMIT = 99;

    public static void run() {
        var questions = new String[Engine.ROUNDS_COUNT][];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questions[i] = generateRound();
        }
        Engine.run(questions, "Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    private static String[] generateRound() {
        var number = new Random().nextInt(1, NUMBER_UPPER_LIMIT);
        var correctAnswer = isPrime(number) ? "yes" : "no";
        return new String[]{String.valueOf(number), correctAnswer};
    }

    private static boolean isPrime(int number) {
        int[] primeNumbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        int result = 0;

        for (var primeNumber : primeNumbers) {
            if (number == primeNumber) {
                result = 1;
            }
        }
        return result == 1;
    }
}
