package Office_hours;
import  java.util.Scanner;
public class Array_Sum_ofNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        for ( int numbers : nums ){
            System.out.print(numbers + " , ");
              sum +=numbers;

        }
        System.out.println();
        System.out.println(sum);
    }
}
