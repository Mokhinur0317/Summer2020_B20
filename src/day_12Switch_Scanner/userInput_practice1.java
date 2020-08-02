package day_12Switch_Scanner;
import  java.util.Scanner;
public class userInput_practice1 {
    public static void main(String[] args) {
/*
      Scanner input = new Scanner(System.in);
        System.out.println("Please enter ur number");
  //     double num = input.nextDouble();            in this case i can assign 3.4
        int num = input.nextInt();
//      double num = input.nextDouble();
        String result = (num % 2 == 0) ?  num + " its a even number" : num +  " its a odd number";
        System.out.println(result);


 */
        System.out.println("==================================================");

         Scanner input = new Scanner(System.in);
        System.out.println("Please enter ur first code");

        int num = input.nextInt();
       // System.out.println(num);

        System.out.println("Please enter ur first code");
        int num2 = input.nextInt();
       // System.out.println(num2);
        System.out.println("Sum of those numbers are : " +  (num + num2 ) );
    }
}
