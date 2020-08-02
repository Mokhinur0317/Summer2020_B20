package day_24_Array;

public class Unique_Numbers {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 5, 6};
        for (int j =0; j <= arr.length-1;j++) {
            int first = arr[j];  // 1
            int count = 0;
            for (int i = 0; i <= arr.length - 1; i++) {
                int each = arr[i]; // 1 , 1, 3, 3, 5, 6
                if (each == first) {
                    count++;
                }
            }
                if (count == 1) {
                    System.out.println(first + " ");

            }

        }
    }
}
