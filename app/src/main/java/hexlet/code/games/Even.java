package hexlet.code.games;

import hexlet.code.Cli;
import java.util.Scanner;
import java.util.Random;

public class Even {
    static String userName = Cli.greeting();

    public static void tellToTheUserWhatToDo() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");;
    }
    public static String playRound() {
        Random random = new Random();
        int operand = random.nextInt(99);
        System.out.println("Question: " + operand);

        Scanner scanner = new Scanner(System.in);
        String userAnswer = scanner.next();

        return Even.isUserAnswerCorrect(operand, userAnswer, userName);
    }

    public static String isUserAnswerCorrect(int operand, String userAnswer, String userName) {
        String answer = "";
        System.out.println("Your answer: " + userAnswer);
        if (((operand % 2 == 0) && userAnswer.equalsIgnoreCase("yes"))) {
            answer = "Correct!";
            System.out.println(answer);
        } else if (((operand % 2 != 0) && userAnswer.equalsIgnoreCase("no"))) {
            answer = "Correct!";
            System.out.println(answer);
        } else if (((operand % 2 == 0) && userAnswer.equalsIgnoreCase("no"))) {
            answer = "\'no\' is wrong answer ;(. Correct answer was \'yes\'.\nLet's try again, " + userName + "!";
            System.out.println(answer);
        } else if (((operand % 2 != 0) && userAnswer.equalsIgnoreCase("yes"))) {
            answer = "\'yes\' is wrong answer ;(. Correct answer was \'no\'.\nLet's try again, " + userName + "!";
            System.out.println(answer);
        } else {
            answer = userAnswer + " is wrong answer ;(.Let's try again, " + userName + "!";
            System.out.println(answer);
        }
        return answer;
    }

}

