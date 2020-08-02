package day_28Recap_continue;

import java.util.Arrays;

public class Tree_Dimen_Array {
    public static void main(String[] args) {
        int [][] arr_2D ={ {1,2} , {3,4} };

        //                     0 ,1    0, 1        0, 1    0,1
        int[][][] arr_3D ={ { {1,2} , {3,4}} ,  { {5,6},  {7,8}}  };
        // index num               0                    1

        //   { {5,6},  {7,8}
        System.out.println(Arrays.deepToString(arr_3D[1]));

        //{3,4}
        System.out.println(Arrays.toString(arr_3D[0][1]) );

        // 8
        System.out.println(arr_3D[1][1][1]);

  //=================================================================

        System.out.println("==========  Loop =============");

        for (int i = 0;i <= arr_3D.length -1; i++){   // index nub of 2D arrays
           int[][] twoArray = arr_3D[i];
           for (int j  = 0;  j <= twoArray.length -1; j++){
               int [] oneArray = twoArray[j];
                   for (int k = 0; k <= oneArray.length -1; k++){
                     int   eachNum = oneArray[k];
                       System.out.print(eachNum + " ");
                   }
            //   System.out.println();
           }
            System.out.println();
        }


    //===================================================================

        System.out.println("=============  For each loop ============");

        for (int [][] each_2d : arr_3D){
            for (int [] each_1d : each_2d){
                for (int eachNumber : each_1d){
                    if (eachNumber % 2 == 0) {
                        System.out.print(eachNumber + " , ");
                    }
                }
            }
            System.out.println();
        }

    }
}
