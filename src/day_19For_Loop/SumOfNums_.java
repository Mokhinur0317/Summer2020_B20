package day_19For_Loop;
import java.util.Scanner;
public class SumOfNums_ {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter a number");

        int num = user.nextInt();
        int sum = 0;

        if (num > 1 ){
            for (int i = 1; i <= num; i++){
                sum = sum + i;
            }
            System.out.println(sum);
        }else {
            System.out.println("Invalid Entry");
        }

    }
}
