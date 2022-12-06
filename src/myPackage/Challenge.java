package myPackage;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Challenge {
     public static void main(String[] agrs){
         System.out.println(withdraw(300));
     }
    public static ArrayList<Integer> withdraw(int amount) {
        ArrayList<Integer> notes = new ArrayList<Integer>();
        if ((40 >= amount) && (1000 <= amount)) {
            int hundredDollarNote = amount / 100;
            int remainder1 = amount - (100 * hundredDollarNote);
            if (remainder1 == 0) {
                notes.add(hundredDollarNote);
            } else if (remainder1 > 0) {
                int fiftyDollarNote = remainder1 / 50;
                int remainder2 = amount - (50 * fiftyDollarNote);
                if (remainder2 == 0) {
                    notes.add(fiftyDollarNote);
                } else if (remainder2 > 0) {
                    int twentyDollarNote = remainder2 / 20;
                    int remainder3 = amount - (20 * twentyDollarNote);
                    if (remainder3 == 0) {
                        notes.add(twentyDollarNote);
                    }
                }
            }
        }
        return notes;
    }

}
