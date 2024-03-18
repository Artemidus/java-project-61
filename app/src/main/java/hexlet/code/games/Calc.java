package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    static String userName = Cli.greeting();


    public static void tellToTheUserWhatToDo() {
        System.out.println("What is the result of the expression?");
    }

    public static String playRound() {
        Random random = new Random();
        int operationTypeIndex = random.nextInt(3);
        int operandOne = random.nextInt(20);
        int operandTwo = random.nextInt(20);

        switch (operationTypeIndex) {
            case 0:
                System.out.println("Question: " + operandOne + " + " + operandTwo);
                break;
            case 1:
                System.out.println("Question: " + operandOne + " - " + operandTwo);
                break;
            case 2:
                System.out.println("Question: " + operandOne + " * " + operandTwo);
                break;
        }

        //here we get user answer
        Scanner scanner = new Scanner(System.in);
        int userAnswer = scanner.nextInt();

        return Calc.isUserAnswerCorrect(operandOne, operandTwo, operationTypeIndex, userAnswer, userName);
    }

    /**
     * in getRoundResult() function we calculate whether user answer is correct or not
     * @param operandOne - first operand of expression (from 0 to 20)
     * @param operandTwo - second operand of expression (from 0 to 20)
     * @param operationTypeIndex - random index related with exact operation - addition (0), substracion(1) or multiplication(2)
     * @param userAnswer - user answer we need to compare with the correct result of expression (probably it is redundant, because we don't use it)
     * @param userName - username getting from Cli.greeting() function
     * @return - return us result of comparing userAnswer and correct result of expression we calculated
     */

    public static String isUserAnswerCorrect(int operandOne, int operandTwo, int operationTypeIndex, int userAnswer, String userName) {
        String resultAnswer = "";
        System.out.println("Your answer: " + userAnswer);

        switch (operationTypeIndex) {
            case 0:
                if (operandOne + operandTwo == userAnswer) {
                    resultAnswer = "Correct!";
                    System.out.println(resultAnswer);
                } else {
                    resultAnswer = "\'" + userAnswer + "\' is wrong answer ;(. Correct answer was \'" + (operandOne + operandTwo) + "\'\nLet's try again, " + userName + "!";
                    System.out.println(resultAnswer);
                }
                break;
            case 1:
                if (operandOne - operandTwo == userAnswer) {
                    resultAnswer = "Correct!";
                    System.out.println(resultAnswer);
                } else {
                    resultAnswer = "\'" + userAnswer + "\' is wrong answer ;(. Correct answer was \'" + (operandOne - operandTwo) + "\'\nLet's try again, " + userName + "!";
                    System.out.println(resultAnswer);
                }
                break;
            case 2:
                if (operandOne * operandTwo == userAnswer) {
                    resultAnswer = "Correct!";
                    System.out.println(resultAnswer);
                } else {
                    resultAnswer = "\'" + userAnswer + "\'" + " is wrong answer ;(. Correct answer was \'" + (operandOne * operandTwo) + "\'\nLet's try again, " + userName + "!";
                    System.out.println(resultAnswer);
                }
                break;
            default:
                throw new IllegalStateException("\'" + userAnswer + "\'" + " is wrong answer ;(. Correct answer was \'" + (operandOne * operandTwo) + "\'\nLet's try again, " + userName + "!");
        }
        return resultAnswer;
    }
}



