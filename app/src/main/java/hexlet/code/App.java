package hexlet.code;


import hexlet.code.games.Even;
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
                Engine.evenGameLogic();
                break;
            case 3:
                Engine.calcGameLogic();
                break;
            case 4:
                Engine.gcdGameLogic();
            case 5:
                Engine.progressionGameLogic();
        }

        scanner.close();

    }
}
