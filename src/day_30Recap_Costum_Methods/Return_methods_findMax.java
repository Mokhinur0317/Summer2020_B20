package day_30Recap_Costum_Methods;

import java.util.Arrays;

public class Return_methods_findMax {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
         int num =  find_max(arr);
        System.out.println(num);
        System.out.println(num > 300);   // false

    }





    public static int find_max (int[] arr){
        Arrays.sort(arr);
       int max = arr[arr.length -1];
       return max;
    }
}
