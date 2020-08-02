package day_33_Local_DateTime;

import java.util.Arrays;

public class re_sendOrder_Array {
    public static void main(String[] args) {

        int[] arr = {1,4,3,2,5};


    }


    public static int[] sortDesc (int[] arr){

        Arrays.sort(arr);
        int[] newArr = new int[arr.length];
        int index =arr.length -1;

        for (int each : arr){
            newArr[index] = each;
            index--;
        }

     return newArr;


    }
}
