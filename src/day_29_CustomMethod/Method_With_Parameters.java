package day_29_CustomMethod;

import java.util.Scanner;

public class Method_With_Parameters {

 public static void printHello(int n ){
//                                int n called =====> argumenet in java
     for (int i =0; i <= n; i++){
         System.out.println("Hello World ");
     }
 }




    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = user.nextInt();

     printHello(number);

    }
}
