package day_24_Array;

public class Unique_num2_EachLoop {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 5, 6};
        for (int first : arr){
            int count = 0;

            for(int second: arr){
                if(first == second){
                    count++;
                }
            }

            if (count == 1 ){
                System.out.println(first);
            }
        }
    }
}
