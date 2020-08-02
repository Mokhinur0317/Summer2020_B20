package day_13Scanner;
import  java.util.Scanner;
public class Scanner_nextLine {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        System.out.println("Enter your full name");

        String  fullName = user_input.nextLine();
        System.out.println("Full name :" + fullName);   // i get a full name

        System.out.println("Enter your company year");
        String  companyName = user_input.nextLine();
        System.out.println("Company name : " + companyName);



    }
}
