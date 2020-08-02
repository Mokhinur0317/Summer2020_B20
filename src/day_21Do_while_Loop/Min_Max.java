package day_21Do_while_Loop;

import java.util.Scanner;

public class Min_Max {
    public static void main(String[] args) {
            Scanner user = new Scanner(System.in);
            int  min = 999999;
            int  max = -0;  // 20  ,   30
            for (int i =1 ; i <= 5 ; i++){
                System.out.println("Enter a number");     // 20 , 5, 10, 30,3
                int num = user.nextInt();

                if (num > max){
                    max = num;
                }

                if (num < min){
                    min = num;
                }
            }
        System.out.println("Max number: " + max + " and Min number: " + min);
        double i =user.nextDouble();

    }
}
