package day_22_Arrays;
import java.util.stream.IntStream;

/*
public class Even_Numbers_Array {
    public static void main(String[] args) {
        int[] range = IntStream.rangeClosed(1, 100).toArray();
        for (int i = range.length - 1; i >= 0; i--){
            //  System.out.println(range[i]);
            if (range[i] % 2 == 0){
                System.out.println(range[i]);
            }else {
                continue;
            }

        }

 */

public class Even_Numbers_Array {
    public static void main(String[] args) {
        int[] range = IntStream.rangeClosed(1, 100).toArray();
        for (int i = 0; i <= range.length -1; i++){
          //  System.out.println(range[i]);
            if (range[i] % 2 == 0){
                System.out.println(range[i]);
            }else {
                continue;
            }

        }


        System.out.println();
        int[] range1 = IntStream.rangeClosed(1, 100).toArray();
        String even_string = "";
        String odd_string = "";
        for (int i = 0; i <= range1.length -1; i++) {
            //  System.out.println(range[i]);
            if (range1[i] % 2 == 0) {
                even_string += range1[i] + ",";
              //  System.out.println();
            }

            if (range1[i] % 2 != 0){
                odd_string += range1[i] + ",";

            }
        }
        System.out.print("Even num: " + even_string + "," );
        System.out.println();
        System.out.print("Odd num: " + odd_string +" , ");
    }
}
