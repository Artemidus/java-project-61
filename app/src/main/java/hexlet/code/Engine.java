package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_COUNT = 3; //константа по кол-ву раундов. еще может сканнер лежать в движке
    public static String userName = Cli.greeting();


    public static void run(String[][] rounds, String rules) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        System.out.println(rules);

        for (String[] round : rounds) {
            System.out.println("Question: " + round[0]);

            System.out.print("Your answer: ");
            String userAnswer = scanner.next();
            //here we take user answer and comparing it with correct one
            if (userAnswer.equals(round[1])) {
                System.out.println("Correct!");
                count++;
                if (count == 3 && userAnswer.equals(round[1])) {
                    System.out.println("Congratulations, " + userName + "!");
                    break;
                }
            } else {
                System.out.println("\"" + userAnswer + "\" is wrong answer ;(. Correct answer was \"" + round[1] + "\".\nLet's try again, " + userName + "!");
                break;
            }
        }   scanner.close();
    }

}


