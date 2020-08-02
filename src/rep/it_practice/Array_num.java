package rep.it_practice;

import java.util.Arrays;
import java.util.Scanner;

public class Array_num {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
         int number  = user.nextInt();

         int [] arr = new int [number];
         for (int  i =0; i <= arr.length -1 ; i++){
             System.out.println(arr[i]);
         }
    }
}
