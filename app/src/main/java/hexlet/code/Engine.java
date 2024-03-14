package hexlet.code;

import static hexlet.code.games.Calculator.*;


public class Engine {
    public static int roundsQuantity = 3;



    public static void gameLogic() {

        askMainQuestion();

        for (var i = 0; i <= roundsQuantity ; i++){
            gameRound();

            if (i == 3 ) {
                    System.out.println("Congratulations, " + Cli.userName + "!");
                    break;
                }
            }


    }
}

