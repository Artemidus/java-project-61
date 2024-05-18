package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {

    public static void run() {
        var questions = new String[Engine.ROUNDS_COUNT][];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questions[i] = generateRound();
        }
        Engine.run(questions, "What is the result of the expression?");
    }

    public static String[] generateRound() {
        Random random = new Random();
        int operationType = random.nextInt(3);
        int operandOne = random.nextInt(20);
        int operandTwo = random.nextInt(20);
        String question = "";

        switch (operationType) {
            case 0 -> question = operandOne + " + " + operandTwo;
            case 1 -> question = operandOne + " - " + operandTwo;
            case 2 -> question = operandOne + " * " + operandTwo;
        }

        var correctAnswer = calculateResult(operandOne, operandTwo, operationType);
        return new String[]{question, String.valueOf(correctAnswer)};
    }

    public static int calculateResult(int operandOne, int operandTwo, int operationType) {
        return switch (operationType) {
            case 0 -> operandOne + operandTwo;
            case 1 -> operandOne - operandTwo;
            case 2 -> operandOne * operandTwo;
            default -> throw new RuntimeException("unknown operation");
        };
    }
}



