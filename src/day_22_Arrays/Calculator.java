package day_22_Arrays;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        while(true) {
            System.out.println("Enter a number : ");
            double num = user.nextDouble();
            System.out.println("Enter second number");
            double num2 = user.nextDouble();
            double sum = 0;
            sum += num + num2;
            System.out.println("result : " + sum);
//===========================================================
            System.out.println("Enter the math operator");
            char o = user.next().charAt(0);

          /*          Turnary part
            double result = (o == '+')? num1+num2 :( o == '-')? num1-num2 :(o =='*')? num1 * num2
                          :( o == '/')? num1/num2  :(o=='%')? num1%num2 : 0;
                          System.out.println(result);
            */

            switch (o) {

                case '+':
                    System.out.println(num + num2);
                    break;

                case '-':
                    System.out.println(num - num2);
                    break;

                case '*':
                    System.out.println(num * num2);
                    break;

                case '/':
                    System.out.println(num / num2);
                    break;

                case '%':
                    System.out.println(num % num2);
                    break;

                default:
                    System.out.println("Invalid Operator");
            }


            System.out.println("Do you want to continue?");
            String a = user.next().toLowerCase();  // yes

            while (!(a.equals("yes") || a.equals("no"))) { // while the answer is invalid
                System.out.println("Invalid Answer, please enter yes or no");
                System.out.println("Do you want to continue?");
                a = user.next().toLowerCase();
            }

            if (a.equals("no")) {
                break;
            }

        }


           System.out.println("Thanks for using Cybertek' Calculator");

           System.exit(0);




    }
}
