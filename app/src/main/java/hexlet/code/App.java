package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Prime;
import hexlet.code.games.Calc;
import hexlet.code.games.Progression;
import hexlet.code.games.GCD;

import java.util.Scanner;

public class App {
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
        int choice = scanner.nextInt();

        System.out.println("Your choice: " + choice);

        switch (choice) {
            case 0 -> System.out.println("0 - Exit");
            case 1 -> Cli.greeting();
            case 2 -> Even.run();
            case 3 -> Calc.run();
            case 4 -> GCD.run();
            case 5 -> Progression.run();
            case 6 -> Prime.run();
            default -> throw new RuntimeException("unknown game");

        }
        scanner.close();
    }
}
