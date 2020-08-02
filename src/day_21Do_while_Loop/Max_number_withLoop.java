package day_21Do_while_Loop;

import java.util.Scanner;

public class Max_number_withLoop {
    public static void main(String[] args) {
        Scanner  user = new Scanner(System.in);

          int  max = -0;  // 20  ,   30
        for (int i =1 ; i <= 5 ; i++){
            System.out.println("Enter a number");     // 20 , 5, 10, 30,3
            int num = user.nextInt();

            if (num > max){
                max = num;
            }
        }




        System.out.println(max);
        System.out.println();

            int min = 0;
        for (int i = 1; i <= 5 ; i++){
            System.out.println("Enter a number");
            int num2 = user.nextInt();

            if (num2 < min ){
                min = num2;
            }
        }
        System.out.println(min);







    }
}
