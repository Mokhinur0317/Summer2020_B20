package day_24_Array;

public class ForEach_Loop {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        for (int i =0; i <= arr.length-1; i++){   // i is the index number
            System.out.print( arr[i] + " ");
        }
        System.out.println("===========================");

        for (int each : arr){   // each represent the elements
            System.out.println(each);
        }

    }
}
