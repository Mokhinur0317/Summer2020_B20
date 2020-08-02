package day_26_MultiDimensional_Array;
import  java.util.Arrays;
public class Desending_order_array {
    public static void main(String[] args) {
        int[] arr1 = {2 , 1, 3};
        Arrays.sort(arr1);               // 1 , 2, 3
        int [] des = new int[3];

//        des[0] = arr1[arr1.length -1];
//        des[1] = arr1[1];
//        des[des.length -1] = arr1[0];

           int count = arr1.length -1;
        for (int i = 0; i < des.length; i++){
            des[i] = arr1[count];
            count--;

        }
        System.out.println(Arrays.toString(des));
    }
}
