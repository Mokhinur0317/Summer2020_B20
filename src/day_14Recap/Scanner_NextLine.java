package day_14Recap;
import java.util.Scanner;
public class Scanner_NextLine {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = user_input.nextInt();

        user_input.nextLine();
        System.out.println("Enter your full name");
        String  fullName = user_input.nextLine();

        System.out.println("Enter your company name");
        String companyName = user_input.nextLine();
        // in this one i dont have to use nextline again

        System.out.println("full name is " + fullName );

    }
}
