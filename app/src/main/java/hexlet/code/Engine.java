package hexlet.code;

import static hexlet.code.games.Calc.*;


public class Engine {
    public static int roundsQuantity = 3;


    public static void gameLogic() {

        askMainQuestion();

            playRound();
            if (playRound().equals("Correct!")){
                for (var i = 1; i <= Engine.roundsQuantity; i++) {
                    playRound();

                    if (i == 3) {
                        System.out.println("Congratulations, " + Cli.userName + "!");
                        break;
                    }
                }
            } else {

            }
//            for (var i = 1; i <= Engine.roundsQuantity && playRound().equals("Correct!"); i++) {
//                playRound();
//
//                if (i == 3) {
//                    System.out.println("Congratulations, " + Cli.userName + "!");
//                    break;
//                }
//            }


    }
}

