package day_17String_Review;
import org.w3c.dom.ls.LSOutput;

import  java.util.Scanner;
public class Warm_Up1 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter a word");
        String word ="xcode"; //user.next();
        String word1 = word.substring( 0 + 1);
        if(word.contains("x")){
            System.out.println(word1);
        }
    //========================================================================

        System.out.println("Enter a word");
        String word2 ="xxmoki";//user.next();
        String word3 = word2.substring( 0 + 2);
        if(word2.startsWith("xx")){
            System.out.println(word3);
        }



   //========================================================================
      /*  System.out.println("Enter first  word");
         String first = user.next();
        System.out.println("Enter second word");
         String second = user.next();

        System.out.println("" +first + second);
        */
     //=====================================================================
        System.out.println("Enter first name");
        String firstName = "Moki";//user.next();
        System.out.println("Enter last name");
        String lastName ="Koko";// user.next();

        System.out.println("your initial is :"+ firstName.concat(firstName) + lastName.substring(lastName.charAt(0)));

    }
}
