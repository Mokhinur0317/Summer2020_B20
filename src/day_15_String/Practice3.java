package day_15_String;

import javax.print.attribute.standard.PagesPerMinute;
import java.util.Scanner;
public class Practice3 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("Please enter ur sentence");     // Hello world
        String sence = user.nextLine();

        System.out.println(sence.charAt( 0 ));         // H
        System.out.println(sence.length() - 1 );            // 10

        int lastIndexChar = sence.length()-1;
        System.out.println(lastIndexChar);             // 10

        System.out.println(sence.charAt(0) + sence.charAt(lastIndexChar));   // 204

        System.out.println(" "+sence.charAt(0) + sence.charAt(lastIndexChar));     // H d
    }
}
