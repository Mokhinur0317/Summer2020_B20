package Office_hours.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CombineTwo_Array {
    public static void main(String[] args) {
        char [] arr = {'a','b','c'};
        char [] arr2 = {'c','d','k'};
        char[] newArr = new char[arr.length + arr2.length];
        int index = 0;
        for (char each : arr){
            newArr[index] = each;
            index++;
        }
        for (char each : arr2){
            newArr[index] = each;
            index++;
        }

        System.out.println(Arrays.toString( newArr));


        int[] num = {1,2,3,4,5,};
        int[] newNum = new int[2];
        System.out.println( Arrays.toString(newNum));
        newNum[0] = num[0];
        newNum[1] = num[1];
        System.out.println( Arrays.toString(newNum));

//        if (num.length  == 1){
//            newNum[0]=num[num.length];
//        }
//
//        System.out.println( Arrays.toString( newNum));

    }
}
