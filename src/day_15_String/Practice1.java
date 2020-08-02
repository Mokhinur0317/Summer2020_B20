package day_15_String;
import  java.util.Scanner;
public class Practice1 {
    public static void main(String[] args) {

       Scanner user = new Scanner(System.in);
        //   chatAt(index);
 /*
        System.out.println("Enter your first name");
        String firstName = user.next();        //   Cybertek     // Moki
        char ch1 = firstName.charAt(0);       // C               //    M

        System.out.println("Enter your last name");
        String lastName = user.next();       // School          // Vafoeva
        char ch2 = lastName.charAt(0);       // S              //   V


        System.out.println("your initial is :" + ch1+"."+ ch2) ;  */
        System.out.println("================================================================");

        //    length() ======> int

        System.out.println("Please write a sentence");

        String sen =  "Im so happy be here!"; //user.nextLine();    // char 20

        int senLength= sen.length() ;
        System.out.println(senLength);         // char 20



        char first = sen.charAt(0);
        System.out.println("first character is: " + first);

         char last = sen.charAt(19);
        System.out.println("last character is : "+ last);


        System.out.println("===============================================================");






    }
}
