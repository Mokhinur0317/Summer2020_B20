package day_24_Array;

import java.util.Scanner;

public class Min_Maxnums_Array {
    public static void main(String[] args) {
        Scanner user = new  Scanner(System.in);
        System.out.println("How many numbers do u want to enter ");
        int numbers = user.nextInt();

        int [] arr = new int[numbers]; // [ 1, 2 , 3

        for (int i = 0; i < numbers; i++){    // get user inputs and storing them in the array
            System.out.println("Enter a number");
            arr[i] = user.nextInt();       // [ 1 , 2, 3

        }
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i <= arr.length -1; i++){
           // System.out.print(arr[i]+ " ");
            if (arr[i] > max){
                max =  arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("max num: " + max);
        System.out.println("min num: " + min);

    }
}
