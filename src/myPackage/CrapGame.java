package myPackage;
import java.util.Random;

/**
 *A popular game of chance is a dices game known as craps, which is played in casinos and back alleys throughout the world. The rules of the game are
 * straightforward: You roll two dice. Each die has six faces, which contain one, two, three, four, five and six spots, respectively. After the dice
 * have come to rest, the sum of the spots on the two upward faces is calculated.If the sum is 7 or 11 on the first throw, you win. If the sum is 2,
 * 3 or 12 on the first throw (called “craps”), you lose (i.e., the “house” wins). If the sum is 4, 5, 6, 8, 9 or 10 on the first throw, that sum becomes
 * your “point.” To win, you must continue rolling the dice until you “make your point” (i.e., roll that same point value). You lose by rolling a 7 before making your point.
 * **/

public class CrapGame {
    static Random randomNumber = new Random();
//    some constants games values
    private static final int SNAKE_EYES = 2;
    private static final int SEVEN = 7;
    private static final int TREY = 3;
    private static final int YO_ELEEN = 11;
    private static final int BOX_EYES  = 12;

//    enumeation: creation of datatype o constant value
    private enum status  { WON, LOSE, CONTINUE};
    public static int rowDice(){
//        first dice roll  and second dice roll
        int  firstRoll = 1 + randomNumber.nextInt(6);
        int secondRoll = 1 + randomNumber.nextInt(6);
        int sum = firstRoll + secondRoll;
        System.out.printf("the first die is %d, the second die is %d  and the sum is %d\n", firstRoll , secondRoll, sum);
        return sum;
    }

//   display game results
    public void gameResult(){
        status gameStatus;
        int result = rowDice();
//      count point for those that will have 4,5,6, 8, 9, 10 at first roll
        int playerPoint = 0;
        switch (result) {
            case SNAKE_EYES, TREY, BOX_EYES -> gameStatus = status.LOSE;
            case SEVEN, YO_ELEEN -> gameStatus = status.WON;
            default -> {
                gameStatus = status.CONTINUE;
//                set player point to the sum
                playerPoint = rowDice();
                System.out.printf("player point is %d \n", playerPoint);
            }
        }
                 while(gameStatus == status.CONTINUE){
                    // re-roll dice
                    result = rowDice();
                    if(result == SEVEN){
                        gameStatus = status.LOSE;
                    }else if(result == playerPoint){
                        gameStatus = status.WON;
                    }
                }
                if(gameStatus == status.WON){
                    System.out.println("Player win");
                }
                else if(gameStatus == status.LOSE){
                    System.out.println("Player lose");
                }
    }

}
