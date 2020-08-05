package rep.it_practice;

import java.util.Arrays;

public class Array_FindMax_Min {
    public static void main(String[] args) {
        /*
        In this task, you need to write 2 methods findMax() that will find a maximum number in the array.
         First method should work with array of integers (int[]) and return int,
          and second method should work with an array of doubles (double[]) and return double as a result.
         */

        int [] number = {1,2,3,4,5};
        int max = findMax(number);
        System.out.println(max);

        double [] number2  = {1.9,2.0,3.3,4.9,5.0};
        double max1 = findMax(number2);
        System.out.println(max1);



    }


    public static int findMax (int[] arr){
       Arrays.sort( arr);
       int max = arr[0];
        for (int each : arr) {
            if (each > max) {
                max = each;
            }
        }

        return max;
    }

  public static double findMax (double[] arr){
        double max = arr[0];
        for (double each : arr){
            if (each > max){
                max = each;
            }
        }

        return  max;
  }




}
