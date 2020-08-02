package day_16String;
import  java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("Enter first number");
        double n1 = user.nextDouble();

        System.out.println("enter second number");
        double n2 = user.nextDouble();

        System.out.println("Enter ur math operator");
        char math = user.next().charAt(0);

        boolean valid = math == '*' || math == '/' || math == '%'|| math == '-' ||math == '+';

        if(valid){
            switch (math){
                case '*':
                    System.out.println(n1 +n2);
                    break;

                case '/':
                    System.out.println(n1 / n2);
                    break;

                case'+':
                    System.out.println(n1 + n2);
                    break;

                case '-':
                    System.out.println(n1 -n2);
                    break;

                case '%':
                    System.out.println(n1 % n2);
                    break;

                default:
                    break;
            }
        }else{
            System.out.println("invalid operator");
        }
    }
}
