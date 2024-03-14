package hexlet.code.games;

import hexlet.code.Cli;
import java.util.Scanner;
import java.util.Random;

public class Even {
    public static void game() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        //creating random number object
        Random random = new Random();

        //first round
        int numberOne = random.nextInt(99);
        System.out.println("Question: " + numberOne);
        String userAnswer = scanner.next();
        String resultOne = Even.checkCorrectness(numberOne, userAnswer, Cli.greeting());

        //second round
        if (resultOne.equals("Correct!")) {
            Random random2 = new Random();
            int numberTwo = random2.nextInt(99);
            System.out.println("Question: " + numberTwo);
            String secondUserAnswer = scanner.next();
            String resultTwo = Even.checkCorrectness(numberTwo, secondUserAnswer, Cli.greeting());

            //third round
            if (resultTwo.equals("Correct!")) {
                int numberThree = random.nextInt(99);
                System.out.println("Question: " + numberThree);
                String thirdUserAnswer = scanner.next();
                String resultThree = Even.checkCorrectness(numberThree, thirdUserAnswer, Cli.greeting());
                String congratOrNot = resultThree.equals("Correct!") ? "Congratulations, " + Cli.greeting() + "!" : "";
                System.out.println(congratOrNot);
            }
        }

        scanner.close();
    }

    public static String checkCorrectness(int number, String userAnswer, String userName) {
        String answer = "";
        System.out.println("Your answer: " + userAnswer);
        if (((number % 2 == 0) && userAnswer.equalsIgnoreCase("yes"))) {
            answer = "Correct!";
            System.out.println(answer);
        } else if (((number % 2 != 0) && userAnswer.equalsIgnoreCase("no"))) {
            answer = "Correct!";
            System.out.println(answer);
        } else if (((number % 2 == 0) && userAnswer.equalsIgnoreCase("no"))) {
            answer = "\'no\' is wrong answer ;(. Correct answer was \'yes\'.\nLet's try again, " + userName + "!";
            System.out.println(answer);
        } else if (((number % 2 != 0) && userAnswer.equalsIgnoreCase("yes"))) {
            answer = "\'yes\' is wrong answer ;(. Correct answer was \'no\'.\nLet's try again, " + userName + "!";
            System.out.println(answer);
        } else {
            answer = userAnswer + " is wrong answer ;(.Let's try again, " + userName + "!";
            System.out.println(answer);
        }
        return answer;
    }

}

