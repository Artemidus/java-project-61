package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Even {

    private static final int NUMBER_UPPER_LIMIT = 99;

    public static void run() {
        var questions = new String[Engine.ROUNDS_COUNT][];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questions[i] = generateRound();
        }
        Engine.run(questions, "Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

    private static String[] generateRound() {
        var number = new Random().nextInt(1, NUMBER_UPPER_LIMIT);
        var correctAnswer = isEven(number) ? "yes" : "no";
        return new String[]{String.valueOf(number), correctAnswer};
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}

