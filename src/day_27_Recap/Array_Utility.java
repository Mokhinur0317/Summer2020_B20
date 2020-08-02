package day_27_Recap;

import java.util.Arrays;

public class Array_Utility {
    public static void main(String[] args) {
        /*
        Arrays.sort();
         */

        int num[] = {6 , 5, 4, 3 , 2 , 1};
        Arrays.sort(num);
        System.out.println( Arrays.toString(num));

        System.out.println("max num : " + num[num.length -1]);  // for getting last index number
        System.out.println("min num: " + num[0]);


        System.out.println("================== equals ==================");

        String[] arr = {"moki" , "ali", "dots "};
        String[]  arr2 = {"moki" , "ali", "dots "};

        System.out.println(   Arrays.equals(arr, arr2));    // it checks index by index    // true

        String[] arr3 = {"moki" , "ali", "dots "};
        String[]  arr4 = {"dots " , "dots", "dots "};
        System.out.println( Arrays.equals   (arr3, arr4  ));   //  false


        System.out.println("=============================================");

        char[] chars = {'a', 'b', 'c'};
        char[]  chars1 = {'b', 'a', 'c'};

        Arrays.sort(chars);
        Arrays.sort(chars1);

        System.out.println(  Arrays.equals(chars, chars1));        //true
    }
}
