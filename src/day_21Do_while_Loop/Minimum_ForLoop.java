package day_21Do_while_Loop;

import java.util.Scanner;

public class Minimum_ForLoop {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
             int min = 0;
        for( int i = 1; i <= 5; i++){
            System.out.println("Enter a number");
            int num  = user.nextInt();

            if (num < min){
                min =num;
            }
        }

        System.out.println(min);
    }
}
