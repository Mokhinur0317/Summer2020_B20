package day_13Scanner;
import java.util.Scanner;
public class ScannerLine_VS_nextMethood {
    public static void main(String[] args) {
       Scanner user_input = new Scanner (System.in);

        System.out.println("Enter ur salary");
        //   Enter ur salary
        //95000
        //Enter your full name
        //Salary: 95000.0
        //Full name :
        //
        //Process finished with exit code 0     there is a bug becouse we uset nextline methood

        double salary = user_input.nextDouble();

         user_input.nextLine();// we use this to take out the Enters that are left in the scanner,so that we can

        System.out.println("Enter your full name ");
        String fullName = user_input.nextLine();

        System.out.println("Salary: " +salary);
        System.out.println( "Full name : "+ fullName);




    }
}
