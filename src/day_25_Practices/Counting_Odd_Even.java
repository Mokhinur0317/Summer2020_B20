package day_25_Practices;
import  java.util.Arrays;
public class Counting_Odd_Even {
    public static void main(String[] args) {
         int[] arr = new int[11];
         for (int i = 0; i <= arr.length - 1; i++){
             arr[i] = i+1;
         }

         int odd = 0;
         int even = 0;

         for (int each : arr){
             if (each % 2 == 0){
                 even += 1;
             }else {
                 odd += 1;
             }
         }
        System.out.println("even num: " + even);
        System.out.println("odd num: " + odd);




    }
}
