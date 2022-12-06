package Recursive;

public class RecursiveMain {
     public static void main(String[] args){

         Recursive recur = new Recursive();
         int[] arr =new int[]{1,2,3,4, 5};
         System.out.println(recur.sumlist(arr, arr.length));
         System.out.println(recur.factorial(4));
         System.out.println(recur.sumDigit(10));
         System.out.println(recur.power_m_n(3, 2));
         System.out.println(recur.power_m_n(2, 0));

     }
}
