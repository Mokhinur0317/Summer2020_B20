package day_28Recap_continue;

import java.util.Arrays;

public class Multi_Dim_Array {
    public static void main(String[] args) {
        int [] arr = {1 , 2, 3};    // single dimensionil      // ArraysToString only for single deminsionel


        //                 0 1 2    0 1 2     0 1 2
        int [][] arr1 = { {1,2,3}, {4,5,6} , {7,8,9}};       // multi
        // index number      0        1         2

        System.out.println( Arrays.toString(arr1[1]) );      // single dimensional    // {4,5,6}

        System.out.println(Arrays.deepToString(arr1));      // multi dimensional    [[1, 2, 3], [4, 5, 6], [7, 8, 9]]


        // in order to get only 7
        System.out.println(arr1[2][0]);        // thats how we get only 7


        System.out.println("=====================    Loop  ============================");
        for (int i =0; i <= arr1.length -1 ; i++){      //     gets each 1D array from 2D arrray
          int[]  eachD1Array  =    arr1[i];
 //           System.out.println(Arrays.toString(eachD1Array) );         //    [1, 2, 3]
//                                                                           [4, 5, 6]
//                                                                           [7, 8, 9]

        for (int j =0; j <= eachD1Array.length -1 ; j++){      //    iterates the element of each 1D arrray
            int eachNumber = eachD1Array[j];
            if (eachNumber % 2 ==0) {
                System.out.print(eachNumber + " , ");
            }
           }
            System.out.println();
        }


        System.out.println("===================     for each loop =========================");

        for (int [] each_1D : arr1 ){
            for (int eachNumber : each_1D){
               // System.out.print(eachNumber + " , ");
                if (  eachNumber % 2 != 0){
                    System.out.print(eachNumber + " , ");
                }
            }
            System.out.println();
        }



    }
}
