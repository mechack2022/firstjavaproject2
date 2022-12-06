package arrayPackage;

public class Challenge {

      public static void main(String[] args){
          System.out.println(  hasUniqueChars("taiwo"));
          System.out.println(  hasUniqueChars("taiiwo"));
          System.out.println(  hasUniqueChars("abcdef"));
      }

    public static boolean hasUniqueChars(String str) {
        boolean result = false;
        String textInLowerCase = str.toLowerCase();
        char[] temptext = textInLowerCase.toCharArray();
        for (int i = 0; i < temptext.length; i++) {
            for (int j = i + 1; j < temptext.length; j++) {
                if (temptext[i] == temptext[j]) {
                    return result ;
                }
            }
        }
        return true;
    }
}
