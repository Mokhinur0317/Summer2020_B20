package day_34_WrapperClass;

import java.util.Scanner;

public class practice_2 {
    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;
        System.out.println(a);

        byte b = Byte.MAX_VALUE;
        System.out.println(b);

        int a2 = Integer.MIN_VALUE;
        System.out.println(a2);

//===========================================================
        Scanner user = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i= 1; i <= 5;i++){
            System.out.println("Enter a number");
            int number = user.nextInt();

            if (number > max){
                max = number;
            }

            if (number < min){
                min = number;
            }

        }
        System.out.println("Max number is : " + max);
        System.out.println("Min number is : " + min);
    }

}
