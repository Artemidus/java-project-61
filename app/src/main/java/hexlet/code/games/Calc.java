package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    private static final int QUANTITY_OF_AVAILABLE_OPERATIONS = 3;
    private static final int OPERAND_MAX_VALUE = 20;

    public static void run() {
        var questions = new String[Engine.ROUNDS_COUNT][];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questions[i] = generateRound();
        }
        Engine.run(questions, "What is the result of the expression?");
    }

    private static String[] generateRound() {
        Random random = new Random();
        int operationType = random.nextInt(QUANTITY_OF_AVAILABLE_OPERATIONS);
        int operandOne = random.nextInt(OPERAND_MAX_VALUE);
        int operandTwo = random.nextInt(OPERAND_MAX_VALUE);
        String question = "";

        if (operationType == 0) {
            question = operandOne + " + " + operandTwo;
        } else if (operationType == 1) {
            question = operandOne + " - " + operandTwo;
        } else {
            question = operandOne + " * " + operandTwo;
        }

        var correctAnswer = calculateResult(operandOne, operandTwo, operationType);
        return new String[]{question, String.valueOf(correctAnswer)};
    }

    private static int calculateResult(int operandOne, int operandTwo, int operationType) {
        return switch (operationType) {
            case 0 -> operandOne + operandTwo;
            case 1 -> operandOne - operandTwo;
            case 2 -> operandOne * operandTwo;
            default -> throw new RuntimeException("unknown operation");
        };
    }
}



