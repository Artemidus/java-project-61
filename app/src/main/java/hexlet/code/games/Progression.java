package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    private static final int MIN_PROGRESSION_LENGTH = 6;
    private static final int MAX_PROGRESSION_LENGTH = 10;
    private static final int MAX_FIRST_VALUE = 200;
    private static final int MAX_PROGRESSION_STEP = 20;

    public static void run() {
        var questions = new String[Engine.ROUNDS_COUNT][];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questions[i] = generateRound();
        }
        Engine.run(questions, "What number is missing in the progression?");
    }

    private static String[] generateRound() {
        Random random = new Random();
        int sizeOfProgression = random.nextInt(MIN_PROGRESSION_LENGTH, MAX_PROGRESSION_LENGTH);
        int firstValue = random.nextInt(MAX_FIRST_VALUE);
        int stepOfIncreasing = random.nextInt(MAX_PROGRESSION_STEP);
        int hiddenIndex = random.nextInt(sizeOfProgression);

        var progression = generateProgression(firstValue, stepOfIncreasing, sizeOfProgression);
        var correctAnswer = progression[hiddenIndex];

        progression[hiddenIndex] = "..";
        String result = String.join(" ", progression);
        return new String[]{result, String.valueOf(correctAnswer)};
    }

    private static String[] generateProgression(int firstValue, int step, int sizeOfProgression) {
        int[] numbers = new int[sizeOfProgression];
        numbers[0] = firstValue;

        for (var i = 1; i < numbers.length; i++) {
            numbers[i] = numbers[i - 1] + step;
        }
        //converting int[] to the String[]
        String[] strArray = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strArray[i] = String.valueOf(numbers[i]);
        }
        return strArray;
    }
}
