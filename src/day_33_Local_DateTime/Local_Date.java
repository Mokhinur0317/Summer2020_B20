package day_33_Local_DateTime;
import java.time.LocalDate;
import java.util.Scanner;

public class Local_Date {
    public static void main(String[] args) {

        LocalDate dob = LocalDate.of(2020,7,24);
        // year - month - days

        System.out.println(dob);


        LocalDate today = LocalDate.now();
        System.out.println(today);


        LocalDate y = LocalDate.of(2020,1,1);
        boolean result = y.isLeapYear();
        System.out.println(result);
 //===================================================================================

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = scan.nextInt();

        boolean result2 = LocalDate.of(year,1,1).isLeapYear();
        System.out.println(result2);
//===================================================================================

        System.out.println("enter birth year , birth month, bith day");
      LocalDate a =  LocalDate.of(scan.nextInt(),scan.nextInt(),scan.nextInt());
        System.out.println(a);
        System.out.println(a.isLeapYear());// it shows year is leaper or not
    }
}
