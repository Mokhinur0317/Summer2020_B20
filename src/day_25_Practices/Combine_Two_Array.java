package day_25_Practices;

import java.util.Arrays;

public class Combine_Two_Array {
    public static void main(String[] args) {
        int[] arr1 = {1 , 3, 4, 5, 6,};
        int[] arr2 = {7, 8, 9};
        int both = arr1.length + arr2.length;
        int[] arr3 = new int[both];

        int index = 0;
        for (int each : arr1){
            arr3[index] = each;
            index += 1;
        }

        for (int each : arr2){
            arr3[index] = each;
            index++;
        }

        Arrays.sort(arr3);

        System.out.println(Arrays.toString(arr3)+" ,");
        System.out.println("max: "+ arr3[arr3.length - 1]);
    }
}
