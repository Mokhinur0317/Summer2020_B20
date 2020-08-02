package day_30Recap_Costum_Methods;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Combine_2_Array {

 public  static void  Combine_2_Arr (int[] first, int[] second){
     int[] newArr = new int[first.length + second.length];
     int index = 0;
     for (int eachNumber : first){
         newArr[index] = eachNumber;
         index++;
     }

     for (int eachNumber_2 : second){
         newArr[index] = eachNumber_2;
         index++;
     }

     System.out.println(Arrays.toString(newArr));

    }

    public static void main(String[] args) {
        int[] arr1 ={1,2,3};
        int[] arr2 = {5,6,7};

        Combine_2_Arr(arr1,arr2);
    }
}
