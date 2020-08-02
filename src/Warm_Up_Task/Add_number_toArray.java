package Warm_Up_Task;

import java.util.Arrays;

public class Add_number_toArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int number = 4;

        Add_numberTo_Array(arr,number);
    }


    public static void  Add_numberTo_Array(int[] arr, int number){
        int[] newArr = new int[arr.length + 1];
        newArr[newArr.length-1] = number;
      //  System.out.println(Arrays.toString(newArr));
        int index = 0;
        for (int i =0; i <= arr.length -1; i++){
            newArr[index] = arr[i];
            index++;
        }
        System.out.println( Arrays.toString( newArr));
    }

}

