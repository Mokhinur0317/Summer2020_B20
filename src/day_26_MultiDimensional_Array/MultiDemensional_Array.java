package day_26_MultiDimensional_Array;

import java.util.Arrays;

public class MultiDemensional_Array {
    public static void main(String[] args) {
        char[] ch1 = {'A' , 'B'};
        char[] ch2 = {'C', 'D' , 'f'};
        char[] ch3 = {'k', 'm'};

       char[][] two = { ch1, ch2 , ch3};
                   //    0    1     2           single deminsional array

        System.out.println(Arrays.toString(two[0]));     // [ A , B ]
        System.out.println(Arrays.toString(two[1]));    // [ C, D , f ]
        System.out.println(Arrays.toString(two[2]));    // [ k , m  ]   here im getting the single array

     //   if i want to get  only element k
        System.out.println(two[2][0]);     // k         here im getting element from single array
// if i wanna get only element B
        System.out.println(two[0][1]);

        // if i wanna get k and B
        System.out.println(two[0][1] +" " + two[2][0]);

        System.out.println("===============================================================");

        int[] num1 = {1 ,2, 3};    // index num 0 == 1 , 1 == 2 , 2 == 3
        int[] num2 = {4, 5, 6};
        int[] num3 = {7 ,8};
        int[] num4 = {9,10};

        int[][] allTogether = {num1,  num2,  num3,  num4 };
       // index number is       0 ,     1,     2     3

        // if i wanna get only one single demensional array
        System.out.println(  Arrays.toString(allTogether[0]));
        //if i wanna get only one single array
        System.out.println(  Arrays.toString(allTogether[1]));
        //if i wanna get only one single array
        System.out.println(  Arrays.toString(allTogether[2]));
        //if i wanna get only one single array
        System.out.println(  Arrays.toString(allTogether[3]));

        System.out.println(         "         I should get the same resolt     "   );
        for (int[] each : allTogether){
            System.out.println(Arrays.toString(each));
            for (int eachElement : each){
                System.out.println( eachElement);
            }
        }

    }
}
