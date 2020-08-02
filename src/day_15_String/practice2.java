package day_15_String;

import java.util.Scanner;
public class practice2 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("enter your first name ");
        String  first = user.next();       // cybertek

        System.out.println("enter your last name");   // school
        String  last = user.next();

     //  String  fullName = first.concat(" ".concat(last));
       String fullName = first+ " "+last;
        System.out.println("Your full name is: " + fullName);

        fullName= fullName.toUpperCase();
        System.out.println(fullName);

    }
}
