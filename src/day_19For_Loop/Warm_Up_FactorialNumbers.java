package day_19For_Loop;
import java.util.Scanner;
public class Warm_Up_FactorialNumbers {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = user.nextInt();
            int fuctorial = 1;
        for (int i = 1; i <= num ; i++){
             fuctorial = fuctorial * i;
        }
        System.out.println("Factorial of "+num+" is: "+fuctorial);

    }
}
