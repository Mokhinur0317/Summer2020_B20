package day_20_While_Loop;

import java.util.Scanner;

public class Factorial_number {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int input = user.nextInt();
        int result = 1;

        for (int i = input; i >= 1; i -= 1){      // i: 5, 4, 3, 2, 1  == 120 ;
            result *= i;
        }
        System.out.println(result);




    }
}
