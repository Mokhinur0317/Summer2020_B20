package day_13Scanner;
import java.util.Scanner;
public class salary_calculate {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        System.out.println("Please Enter your full name");
        String fullName = user_input.nextLine();

        System.out.println("please enter your annual salary");
        double salary = user_input.nextDouble();

        System.out.println("please enter your married status");
        boolean married = user_input.nextBoolean();



    }
}
