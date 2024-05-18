package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    private static final int EXIT = 0;
    private static final int GREET = 1;
    private static final int EVEN = 2;
    private static final int CALC = 3;
    private static final int GCD = 4;
    private static final int PROGRESSION = 5;
    private static final int PRIME = 6;

    public static void main(String[] args) {

        System.out.println("Please enter the game number and press Enter."
                + "\n1 - Greet"
                + "\n2 - Even"
                + "\n3 - Calc"
                + "\n4 - GCD"
                + "\n5 - Progression"
                + "\n6 - Prime"
                + "\n0 - Exit");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case EXIT -> System.out.println("Exit game... done");
            case GREET -> Cli.greeting();
            case EVEN -> Even.run();
            case CALC -> Calc.run();
            case GCD -> hexlet.code.games.GCD.run();
            case PROGRESSION -> Progression.run();
            case PRIME -> Prime.run();
            default -> throw new RuntimeException("unknown game");

        }
        scanner.close();
    }
}
