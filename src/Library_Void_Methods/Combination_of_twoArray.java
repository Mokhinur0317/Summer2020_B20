package Library_Void_Methods;

import java.util.Arrays;

public class Combination_of_twoArray {
    public static void Combination_of_Array(int[] arr , int[] arr2){
      int[] newArr = new int[arr.length + arr2.length];
       // System.out.println( Arrays.toString(newArr));

        System.arraycopy(arr, 0, newArr, 0, arr.length);
        System.arraycopy(arr2, 0, newArr, arr.length, arr2.length);

        System.out.println(Arrays.toString(newArr));





        }


    public static void main(String[] args) {
        int[] arr = {1,2};
        int[] arr2 = {3,4};
        Combination_of_Array(arr,arr2);
    }
}
