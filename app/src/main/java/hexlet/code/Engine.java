package hexlet.code;

import static hexlet.code.games.Calc.*;


public class Engine {
    public static int roundsQuantity = 3;


    public static void calcGameLogic() {

        askMainQuestion();

        for (var i = 1; i <= Engine.roundsQuantity && playRound().equals("Correct!"); i++) {

            if (i == 3) {
                System.out.println("Congratulations, " + Cli.userName + "!");
                break;
            }
        }


    }
}

