package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Calc {


    static String userName = Cli.greeting();



    public static void askMainQuestion() {
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

        Scanner scanner = new Scanner(System.in);
        int userAnswer = scanner.nextInt();

        return Calc.getRoundResult(operandOne, operandTwo, operationTypeIndex, userAnswer, userName);

    }


    public static String getRoundResult(int operandOne, int operandTwo, int operationTypeIndex, int userAnswer, String userName) {
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



