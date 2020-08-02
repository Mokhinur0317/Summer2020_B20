package day_19For_Loop;
import java.util.Scanner;
public class Warm_Up_ {
    public static void main(String[] args) {

    for (int i= 1; i <=100; i++){
        if(i % 3 == 0){
            continue;
        }
        System.out.print(i+" ,");
    }


        System.out.println();

    Scanner user = new Scanner(System.in);
    /*
         int sum = 0;
         for ( int i =1; i <= 5; i++ ){
             System.out.println("Please Enter a number");
             int num = user.nextInt();
             sum += num;
         }
        System.out.println("Number of sum is: "+ sum);
                                                          */
        System.out.println();
             int sumOfall = 0;
        for (int i = 0; i <=100; ){
            System.out.println("Enter a number");
            int num = user.nextInt();
            sumOfall += num;

            if(num < 0 ){
                break;
            }
        }

        System.out.println(sumOfall);




    }
}
