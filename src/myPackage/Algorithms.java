package myPackage;

import java.util.ArrayList;
import java.util.Arrays;

public class Algorithms {

    String str;
    int[] arr;
    int number;
    String[] arrString;

    //    main method
    public static void main(String[] args) {
        Algorithms alg = new Algorithms("software developers are massive");
        Algorithms alg2 = new Algorithms("decagon");
        Algorithms alg3 = new Algorithms("princess");

        alg.reverseString();
        System.out.println(alg.reverseString2());
        System.out.println(alg2.palindrome());
        alg3.characterOccurance();
        System.out.println("The number of occurance is " + alg.singleCharacterOccurance('s'));
        stringAnagram("fired", "fried");
        stringAnagram("bread", "beads");
        System.out.println("VOWEL AND CONSONANT COUNT");
        countVowelCounsonant("taiwo");
        countVowelCounsonant("gboyeguntaiwo");
        System.out.println("BUBBLE SORT IMPLEMENTATION");
//        bubbleSort(new int[]{7, 2, 9, 6, 4});

        returnOddValue(new int[]{2, 4, 0, 100, 4, 11, 2602, 36});
        returnOddValue(new int[]{160, 3, 1719, 19, 11, 13, -21});

    }

    //    class constructor
    public Algorithms(String str) {
        this.str = str;
    }

    public String getString() {
        return this.str;
    }

    public void reverseString() {
        StringBuilder builder = new StringBuilder(getString());
        System.out.printf("The reverse of %s is %s \n", str, builder.reverse());
    }

    public String reverseString2() {
        if (getString() == null || getString().isEmpty()) {
            return getString();
        }
        String reverse = "";
        for (int i = getString().length() - 1; i >= 0; --i) {
            reverse = reverse + getString().charAt(i);
        }
        return reverse;

    }

    // this method return true if a string is palindrome string and false otherwise
    public boolean palindrome() {
//       String oldString = getString();
        String newString = this.reverseString2();
        if (getString().equals(newString)) {
            return true;
        }
        return false;
    }

    // this method return the number of occurance of a character in a string/
    /*
     1. iterate the string
     2. if a character is repeated, increment the count for the character
     3. Return array of character with the number of appearance
    */
    public int singleCharacterOccurance(char c) {
        int count = 0;
        for (int i = 0; i < getString().length(); i++) {
            if (getString().charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
//
//    this method return the number of occurance of each character in a string/

    public void characterOccurance() {
        int[] counter = new int[256];
//        loop through the string and store it in counter array
        for (int i = 0; i < getString().length(); i++) {
            counter[getString().charAt(i)]++;
        }
//          print the frequency of the character if the character frequency is not zero
        for (int i = 0; i < 256; i++) {
            if (counter[i] != 0) {
                System.out.println((char) i + "---->" + counter[i]);
            }
        }
    }

    /*
       Sorting the array manually;
        Get the required string.
        Convert the given string to a character array using the toCharArray() method.
        Compare the first two elements of the array.
        If the first element is greater than the second swap them.
        Then, compare 2nd and 3rd elements if the second element is greater than the 3rd swap them.
         Repeat this till the end of the array.
        */
    public static void stringSortingManually(String str) {
        char temp;
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] > charArray[j]) ;
                temp = charArray[i];
                charArray[i] = charArray[j];
                charArray[j] = (char) temp;
            }
        }
        System.out.println("\nArray sorted in ascending order: ");
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i] + " ");
        }
    }


    /*
    this method check if two strings anagram or not(anangram is when two string
     contains the characters, irrespective of the arrangment of the strings
     e.g FIRED = FRIED, GAINLY = LAYING,  SADDERS = DREADS
     */
    public static void stringAnagram(String str1, String str2) {
        System.out.printf("anagram of strings %s and %s ", str1, str2);
        if (str1.length() != str2.length()) {
            System.out.println("string are not of the same length\n");
        } else {
//            convert both string to character array
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            boolean result = Arrays.equals(charArray1, charArray2);
            if (result) {
                System.out.println(str1 + " and " + str2 + " are anagram.");
            }
            System.out.println(str1 + " and " + str2 + " are not anagram.");
        }

    }
//    this method count the number of consonant and vowel in a string

    public static void countVowelCounsonant(String str) {

        int vowelCount = 0;
        int consonantCount = 0;
        int digitCount = 0;
        int spaceCount = 0;
        str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount = vowelCount + 1;
            }
//             check consonant
            else if (ch >= 'a' && ch <= 'z') {
                consonantCount = consonantCount + 1;
            }
//             digitCount digitCount
            else if (ch >= '0' && ch <= '9') {
                digitCount = digitCount + 1;
            } else if (ch == ' ') {
                spaceCount = spaceCount + 1;
            }

        }
        System.out.println("In " + str + " the number of consonant is " + consonantCount +
                "\nthe number of vowel is " + vowelCount + "\nthe number of digit is " + digitCount +
                "\nthe count of space is " + spaceCount);
    }

    //    implementation of bubble sort algorithm
   public static int[] bubbleSort(int[] numbers) {
        int temp;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; i < numbers.length; j++) {
//                compare the current and the next element
                if (numbers[i] == numbers[j]) {
//                      move to the next the element
                    numbers[i]++;
                } else if (numbers[i] > numbers[j]) {
//swap the elements elements
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = (char) temp;
                }
            }
        }
     return numbers;
    }


    /**
     * You are given an array (which will have a length of at least 3,
     * but could be very large) containing integers. The array is either entirely
     * comprised of odd integers or entirely comprised of even integers except for a single
     * integer N. Write a method that takes the
     * array as an argument and returns this "outlier" N.
     **/

    public static void returnOddValue(int[] numbers) {
        ArrayList<Integer> oddNumbers = new ArrayList<Integer>();
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
        for (int i = 0; i < numbers.length; i++) {
            int n = numbers[i];
            if (n % 2 == 1) {
                oddNumbers.add(n);
            }
            if (n % 2 == 0) {
                evenNumbers.add(n);
            }
        }
        if (oddNumbers.size() == 1) {
            System.out.println(oddNumbers.get(0));
        } else if (evenNumbers.size() == 1) {
            System.out.println(evenNumbers.get(0));
        }

    }
}