package day_22_Arrays;

public class Max_min_Array {
    public static void main(String[] args) {
        int [] arr = {10 , 20, 3 , 4 , 5 , 6 , 7, 10 , - 100, 300, 400};
           int max = arr[0];
           int min = arr[0];

        for (int i = 0; i <= arr.length-1; i++ ){
         if (arr[i] > max){     // compares the array elements and assign the maximum number to variable max
             max = arr[i];
         }

         if (arr[i] < min){    //
             min = arr[i];
         }
        }
         System.out.println("From The Array Element Largest Number is:" + max);
        System.out.println("From The Array Element Smallest  Number is:" + min);
    }
}



