package day_14Recap;
import java.util.Scanner;
public class ScannerMethoods {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

      //  int num = user_input.nextInt();
      //  System.out.println("u have entered: " + num);

     //   double num1 = user_input.nextDouble();
      //  System.out.println(" u have entered : " + num1);

       // boolean  num2 = user_input.nextBoolean();
      //  System.out.println("you Entered " +num2);
        //// boolean has to be true or false nothing else

       System.out.println("do you wanna learn Java"); // in this case user input has to be yes or no
       // String  answers = user_input.next();// because it takes only one word

       String answers = user_input.nextLine(); // this one  takes everything


    }
}
