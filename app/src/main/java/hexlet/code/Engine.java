package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_COUNT = 3; //константа по кол-ву раундов. еще может сканнер лежать в движке

    public static void run(String[][] rounds, String rules) {
        String userName = Cli.greeting();
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        System.out.println(rules);

        for (String[] round : rounds) {
            System.out.println("Question: " + round[0]);

            System.out.print("Your answer: ");
            String answer = scanner.next();

            if (answer.equals(round[1])) {
                System.out.println("Correct!");
                count++;
                if (count == ROUNDS_COUNT && answer.equals(round[1])) {
                    System.out.println("Congratulations, " + userName + "!");
                    break;
                }
            } else {
                System.out.println("\""
                        + answer
                        + "\" is wrong answer ;(. Correct answer was \""
                        + round[1] + "\".\nLet's try again, "
                        + userName
                        + "!");
                break;
            }
        }
        scanner.close();
    }

}


