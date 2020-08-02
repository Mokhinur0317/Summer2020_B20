package day_15_String;
import  java.lang.String;
 // import java .util.Scanner;

public class String_Intro {
    public static void main(String[] args) {
       String str = "Cybertek";      //    String literal

        String name2 = new String("Cybertek");     //


        // java heap: memory location in java where all the objects  will be saved at

       // String pool : aspicial memory location for all string  literals


        String s1 = "cat";   // String literals
        String s2 = "cat";    // String literal      these are saved at string pool:
        System.out.println(s1 == s2);   // output is  true

        String  d1 = "Cat";
        String d2 = "cat";
        System.out.println(d1 == d2); // output will be false because java is key sensative  languages

        String t1 = new String("Tiger");
        String t2 = new String("Tiger");
        System.out.println( t1 == t2); // output will be false
        // new String ("Tiger") == new String  ("Tiger") ====> false

        String c1 = "Cybertek";         // String pool
        String c2 = new String("Cybertek");     // heap
        System.out.println(c1 == c2); // false
             // "Cybertek" == new String (Cybertek)







    }
}
