package myPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

//        alg.reverseString();
//        System.out.println(alg.reverseString2());
//        System.out.println(alg2.palindrome());
//        alg3.characterOccurance();
//        System.out.println("The number of occurance is " + alg.singleCharacterOccurance('s'));
//        stringAnagram("fired", "fried");
//        stringAnagram("bread", "beads");
//        System.out.println("VOWEL AND CONSONANT COUNT");
//        countVowelCounsonant("taiwo");
//        countVowelCounsonant("gboyeguntaiwo");
//        System.out.println("BUBBLE SORT IMPLEMENTATION");
////        bubbleSort(new int[]{7, 2, 9, 6, 4});
//
//        returnOddValue(new int[]{2, 4, 0, 100, 4, 11, 2602, 36});
//        returnOddValue(new int[]{160, 3, 1719, 19, 11, 13, -21});
//
//        System.out.println("---------------");
//        System.out.println("DUPLICATE COUNT");
//        System.out.println(duplicateCount("tAiiwa"));
//        System.out.println(duplicateCount("abcde"));
//        System.out.println(duplicateCount("aabbcdec"));
//        System.out.println(duplicateCount("aabBcde"));
//        System.out.println(duplicateCount("Indivisibilities"));
//        System.out.println(duplicateCount("indivisibility"));
//        System.out.println(duplicateCount("ABBA"));
//        System.out.println(duplicateCount("aA11"));
//        System.out.println(duplicateCount("aabbcde"));
//
//        System.out.println("---------------");
//
//        System.out.println(alg.reverseString1("taiwo"));
//
//        System.out.println("---------------");
//
//    rotateArray(new int[]{1,2,3,4,5,6,7}, 3);
//        getChaIndex("love", 9);
//        getChaIndex("System.out.println(\"The number of occurance is \" + alg.singleCharacterOccurance('s'))", 1);

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;

        int n = arr.length;

        reverseInGroups(arr, n, k);


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

    public static int duplicateCount(String text) {
        // Write your code here
        int count = 0;
        String textInLowerCase = text.toLowerCase();
        char[] temptext = textInLowerCase.toCharArray();
        for (int i = 0; i < temptext.length; i++) {
            for (int j = i + 1; j < temptext.length; j++) {
                if (temptext[i] == temptext[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public String reverseString1(String str) {
//        conver to array  of character
        String result = "";
        char[] newArray = str.toCharArray();
        System.out.println(newArray);
        for (int i = newArray.length - 1; i >= 0; i--) {
            result = result + newArray[i];
        }
        return result;
    }

    public static void rotateArray(int[] arr, int k) {
        if (k > arr.length) {
            k = k % arr.length;
        }

        int[] result = new int[arr.length];
        for (int i = 0; i < k; i++) {
            result[i] = arr[arr.length - k + i];
        }
        int j = 0;
        for (int i = k; i < arr.length; i++) {
            result[i] = arr[j];
            j++;
        }
        System.arraycopy(result, 0, arr, 0, arr.length);

    }

    //Write a Java program to get the character at the given index within the String.
    public static void getChaIndex(String str, int ind) {
        StringBuilder sb = new StringBuilder(str);
        try {
            System.out.println(sb.charAt(ind));

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String length is less than the provided index");
        }
    }

    /*
  Given an array arr[] of positive integers of size N. Reverse every sub-array
 group of size K.
Note: If at any instance, there are no more subarrays of size greater than or equal to K,
then reverse the last subarray (irrespective of its size). You shouldn't return any array,
 modify the given array in-place.

Example 1:

Input:
N = 5, K = 3
arr[] = {1,2,3,4,5}
Output: 3 2 1 5 4
Explanation: First group consists of elements
1, 2, 3. Second group consists of 4,5.


Example 2:

Input:
N = 4, K = 3
arr[] = {5,6,8,9}
Output: 8 6 5 9

    * */
    public static void reverseInGroups(int[] arr, int n, int k) {
        List<Integer> list = new ArrayList<>();
        if (k > n) {
            System.out.println(k + " can not be greater is " + n);
        }
        for (int i = 0; i < n; i += k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1);
            int temp;
            while (left < right) {
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left += 1;
                right -= 1;
            }
        }
        System.out.print("Modified array is: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
    /*
    Given an array A of positive integers. Your task is to find the leaders in the array.
    An element of array is leader if it is greater than or equal to all the elements to its right side.
    The rightmost element is always a leader.
    Example 1:
    Input:
    n = 6
    A[] = {16,17,4,3,5,2}
    Output: 17 5 2
    Explanation: The first leader is 17
    as it is greater than all the elements
    to its right.  Similarly, the next
    leader is 5. The right most element
    is always a leader so it is also
    included.

    Example 2:
    Input:
    n = 5
    A[] = {1,2,3,4,0}
    Output: 4 0

    Your Task:
    You don't need to read input or print anything. The task is to complete the function leader()
    which takes array A and n as input parameters and returns an array of leaders in order of their
    appearance.

    */

}




