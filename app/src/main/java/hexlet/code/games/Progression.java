package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class Progression {
    static String userName = Cli.greeting();

    public static void tellToUserWhatToDo() {
        System.out.println("What number is missing in the progression?");
    }

    public static String playRound() {
        Random random = new Random();
        //generate size of progression
        int sizeOfProgression = random.nextInt(6, 11);

        //generate first number's value
        int firstNumber = random.nextInt(1, 199);

        //generate step of progression
        int stepOfIncreasing = random.nextInt(1, 11);

        //generate number of progression that we will hide
        int hiddenNumber = random.nextInt(1, sizeOfProgression);

        //create empty array
        int[] numbers = new int[sizeOfProgression];

        var result = new StringBuilder(firstNumber);

        for (var i = 1; i < numbers.length; i++) {
            if (i == hiddenNumber) {
                numbers[i] = numbers[i - 1] + stepOfIncreasing;
                result.append("..");
            } else {
                numbers[i] = numbers[i - 1] + stepOfIncreasing;
                result.append(" ");
                result.append(numbers[i]);
                result.append(" ");
            }
        }

        System.out.println("Question: " + result.toString());
        int rightAnswer = numbers[hiddenNumber - 1] + stepOfIncreasing;

        //here we get user answer
        Scanner scanner = new Scanner(System.in);
        int userAnswer = scanner.nextInt();

        return Progression.isUserAnswerCorrect(rightAnswer, userAnswer, userName);
    }

    private static String isUserAnswerCorrect(int correctAnswer, int userAnswer, String userName) {
        String resultAnswer = "";
        System.out.println("Your answer: " + userAnswer);

        if (correctAnswer == userAnswer) {
            resultAnswer = "Correct!";
            System.out.println(resultAnswer);
        } else {
            resultAnswer = "\'" + userAnswer + "\' is wrong answer ;(. Correct answer was \'" + correctAnswer + "\'\nLet's try again, " + userName + "!";
            System.out.println(resultAnswer);
        }
        return resultAnswer;
    }
}
