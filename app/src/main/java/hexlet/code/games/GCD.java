package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class GCD {
    static String userName = Cli.greeting();

    public static void tellToUserWhatToDo() {

        System.out.println("Find the greatest common divisor of given numbers.");
    }

        public static String playRound() {
            Random random = new Random();
            int operandOne = random.nextInt(100);
            int operandTwo = random.nextInt(100);
            System.out.println("Question: " + operandOne + " " + operandTwo);

            //here we get user answer
            Scanner scanner = new Scanner(System.in);
            int userAnswer = scanner.nextInt();

            return GCD.isUserAnswerCorrect(operandOne, operandTwo, userAnswer, userName);
        }

    private static String isUserAnswerCorrect(int operandOne, int operandTwo, int userAnswer, String userName) {
        String resultAnswer = "";
        System.out.println("Your answer: " + userAnswer);

        while (operandOne != 0 && operandTwo != 0){
            if (operandOne > operandTwo) {
                operandOne = operandOne % operandTwo;
            }
            else {
                operandTwo = operandTwo % operandOne;
            }
        }

        int correctAnswer = operandOne + operandTwo;

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


