package day_34_WrapperClass;

import java.util.Arrays;

public class Wrapper_class {
    public static void main(String[] args) {

        Integer num = 20;
        int num_1 =20;

        int[]arr = new int[3];
        System.out.println(Arrays.toString(arr));     // defolt value is   0

        Integer[]arr1 = new Integer[2];
        System.out.println( Arrays.toString(arr1));     // defult value is null


        int num2 = 20;
        Integer n = num2;     // Autoboxing  converting the primitive value to wrapper class

        Integer num3 = 2;
        int n1 = num3;       //Unboxsing converting the wrapper class to primitive

        // double num4 = // wrapper class is only dedicated to its primitive
        Double num4 = 300.0    ;
        double n3 = num4;      // unboxing


        long l = 400;
        Long l2 = l; // autboxing

        Float f1 = 6.0f;
        Float f2 = f1;



       Double[] arr2 = {1.2, 2.2, 3.4};
       for (Double each : arr2){
           System.out.println(each);
       }


    }
}
