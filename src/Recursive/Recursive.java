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
}
