package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;


public class Engine {
    public static int roundsQuantity = 3;


    public static void evenGameLogic() {

        Even.tellToTheUserWhatToDo();

        // loop that define quantity of game rounds if user's answer was correct and congratulates user if game was totally successful
        for (var i = 1; i <= Engine.roundsQuantity && Even.playRound().equals("Correct!"); i++) {
            if (i == 3) {
                System.out.println("Congratulations, " + Cli.userName + "!");
                break;
            }
        }
    }

        public static void calcGameLogic() {

            Calc.tellToTheUserWhatToDo();

            // loop that define quantity of game rounds if user's answer was correct and congratulates user if game was totally successful
            for (var i = 1; i <= Engine.roundsQuantity && Calc.playRound().equals("Correct!"); i++) {
                if (i == 3) {
                    System.out.println("Congratulations, " + Cli.userName + "!");
                    break;
                }
            }
        }

    public static void gcdGameLogic() {
        GCD.tellToTheUserWhatToDo();

        // loop that define quantity of game rounds if user's answer was correct and congratulates user if game was totally successful
        for (var i = 1; i <= Engine.roundsQuantity && GCD.playRound().equals("Correct!"); i++) {
            if (i == 3) {
                System.out.println("Congratulations, " + Cli.userName + "!");
                break;
            }
        }
    }



        }


