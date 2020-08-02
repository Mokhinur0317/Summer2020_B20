package day_18Loop;
import  java.util.Scanner;
public class warm_UP_2 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int num = user.nextInt();

        int  sum = 0;
        for ( int i = 1; i <= num; i++){
            sum = sum + i;
            System.out.print(sum + " ");
        }

    }
}
