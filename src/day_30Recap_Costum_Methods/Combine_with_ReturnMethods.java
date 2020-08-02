package day_30Recap_Costum_Methods;

import java.util.Arrays;

public class Combine_with_ReturnMethods {

    public  static int[]  Combine_2_Arr (int[] first, int[] second){
        int[] newArr = new int[first.length + second.length];
        int index = 0;
        for (int eachNumber : first){
            newArr[index] = eachNumber;
            index++;
        }

        for (int eachNumber_2 : second){
            newArr[index] = eachNumber_2;
            index++;
        }

        //System.out.println(Arrays.toString(newArr));
        return newArr;

    }
//=======================================================================
    public static void main(String[] args) {
        int[] num = {1,2};
        int[] num2 = {3,4};

      int [] newArr =  Combine_2_Arr(num,num2);   // it can be reusable

        System.out.println(Arrays.toString(newArr));
        System.out.println(newArr[0]);
    }
}
