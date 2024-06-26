package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GCD {
    private static final int MAX_RANDOM_NUMBER = 100;

    public static void run() {
        var questions = new String[Engine.ROUNDS_COUNT][];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questions[i] = generateRound();
        }
        Engine.run(questions, "Find the greatest common divisor of given numbers.");
    }

    private static String[] generateRound() {
        Random random = new Random();
        int operandOne = random.nextInt(MAX_RANDOM_NUMBER);
        int operandTwo = random.nextInt(MAX_RANDOM_NUMBER);
        String question = operandOne + " " + operandTwo;
        var correctAnswer = calculateGCD(operandOne, operandTwo);

        return new String[]{question, String.valueOf(correctAnswer)};
    }

    private static int calculateGCD(int operandOne, int operandTwo) {
        while (operandOne != 0 && operandTwo != 0) {
            if (operandOne > operandTwo) {
                operandOne = operandOne % operandTwo;
            } else {
                operandTwo = operandTwo % operandOne;
            }
        }
        return operandOne + operandTwo;
    }
}


