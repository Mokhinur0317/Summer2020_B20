package day_28Recap_continue;

import java.util.Arrays;

public class Practice_2 {
    public static void main(String[] args) {

        System.out.println("===============  task treee ======================  ");


        int [][] arr1 = { {1,2,3}, {4,5, 6 , 7, 8} , {9, 10 , 11, 12, 13}};

        for (int i = arr1.length -1 ; i >= 0; i--){
            int[] eachArray = arr1[i];
           // System.out.println(Arrays.toString(eachArray));

            for (int j = eachArray.length -1; j >= 0; j--){
                int eachNumber = eachArray[j];
                System.out.print(eachNumber + " , ");
            }
            System.out.println();

        }

//===================================================================================
        System.out.println("=============Task   one ==========");
        for (int i = arr1.length -1 ; i >= 0; i--){
            int[] eachArray = arr1[i];
            // System.out.println(Arrays.toString(eachArray));

            for (int  j = 0; j <= eachArray.length -1;  j++){
                int eachNumber = eachArray[j];
                System.out.print(eachNumber + " , ");
            }
            System.out.println();

        }

  //================================================================================
        System.out.println("============== task two ===========");

        for (int i =0 ; i <= arr1.length -1; i++){
            int[] eachArray = arr1[i];
            // System.out.println(Arrays.toString(eachArray));

            for (int j = eachArray.length -1; j >=0;  j--){
                int eachNumber = eachArray[j];
                System.out.print(eachNumber + " , ");
            }
            System.out.println();

        }




    }
}
