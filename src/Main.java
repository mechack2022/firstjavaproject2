import arrayPackage.ArrayInitialization;
import myPackage.CrapGame;
//import myPackage.ReapeatConsonant;

public class Main {
    public static void main(String[] args) {
      /*
      ReapeatConsonant reapeatConsonant = new ReapeatConsonant();
       reapeatConsonant.greet("taiwo");
       reapeatConsonant.repeatConsonant("taiwo", 1);
      */

        CrapGame crapGame = new CrapGame();
        crapGame.gameResult();
        System.out.println("------------------------------");
        System.out.println("Start of array initialization");
        System.out.println("------------------------------");
        ArrayInitialization  arrayInitialization = new ArrayInitialization();
        arrayInitialization.initiazeArray();
        arrayInitialization.sumArrayElement();
    }

}