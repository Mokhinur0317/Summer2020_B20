package day_34_WrapperClass;

import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,};
        Integer[] arr1 = {1,2,3,4};

        for (Integer each : arr1){
            System.out.print(each + " ");
        }
        System.out.println();
        for (int each : arr1){
            System.out.print(each + " ");
        }
        System.out.println();




        double[] d = {1,2,3};
        Double[] d1 = {1.0,2.0,3.0};


        char[] ch = {65,66,67};
        System.out.println(Arrays.toString(ch));

        char  ch1 = 66;
        Character ch2 = 66;
        System.out.println(ch2);
        System.out.println(ch1);



        String[] str = {"1", "2", "3"};
        double[] num = new double[str.length];

        for (int i =0; i <= str.length -1; i++){
         num[i] =  Double.parseDouble(str[i]);
        }
        System.out.println(Arrays.toString(num));



    }
}
