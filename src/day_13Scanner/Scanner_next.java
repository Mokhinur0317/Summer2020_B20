package day_13Scanner;
import java.util.Scanner;
public class Scanner_next {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.println("please enter your campony name:");

        String campanyName = user_input.next();
        System.out.println("Your campany name is "+ campanyName);


        System.out.println("===========================================================================");
        System.out.println("Please enter your firs name ");
        String firstName = user_input.next();

        System.out.println("please enter ur last name ");
        String lastName = user_input.next();

        String fullName =firstName+lastName;
        System.out.println("Full name is :" +fullName);




    }
}
