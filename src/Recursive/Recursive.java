package Recursive;

import java.util.Arrays;

public class Recursive {
    public int sumlist(int[] arr, int n){
          if(n<= 0) {
              return  0;
          }
        else{
            return sumlist(arr, n-1) + arr[n-1];
         }
    }
    public int factorial(int n){
        int fact = 1;
        if((n == 0) || (n==1)) {
            return 1;
        }
        return n * factorial(n-1) ;
    }
    public int sumDigit(int n){
        if(n <= 0){
            return 0;
        }
        return n + sumDigit(n-1);
    }

  public int power_m_n(int m, int n){
        if(m == 0){
            return 0;
        }if((m==1) || (n == 0)){
            return 1;
      }else return m * power_m_n(m , n-1);
  }
}
