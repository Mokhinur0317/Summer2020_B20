package day_14Recap;
import java.util.Scanner;
public class Scanner_practice {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("Enter your gender"); // enter
        String  gender = user.next();  // female

        System.out.println("Enter ur age:");
        int age = user.nextInt();    //19    + Enter

           user.nextLine();    // this medhoods takes everything from the top
        System.out.println("Enter ur country name ");
        String  country = user.nextLine();        // no i need to take all enters from the top

        System.out.println("enter ur zip code");
        int zip = user.nextInt();             //// we have one more enter


        user.nextLine();   // here it takes the enter
        System.out.println("enter ur full name");
        String fullName = user.nextLine();

        user.close();







    }
}
