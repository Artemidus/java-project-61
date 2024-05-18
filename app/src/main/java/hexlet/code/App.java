package hexlet.code;

import hexlet.code.games.*;

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
            case 0:
                System.out.println("0 - Exit");
                break;
            case 1:
                Cli.greeting();
                break;
            case 2:
                Even.run();
                break;
            case 3:
                Calc.run();
                break;
            case 4:
                GCD.run();
                break;
            case 5:
                Progression.run();
                break;
            case 6:
                Prime.run();
                break;
        }
        scanner.close();
    }
}
