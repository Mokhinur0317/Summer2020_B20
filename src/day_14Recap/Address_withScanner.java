package day_14Recap;
import java.awt.*;
import java.util.Scanner;

public class Address_withScanner {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("Enter ur building number");
        int building = user.nextInt();

        user.nextLine();
        System.out.println("enter ur street address");
        String  street = user.nextLine();          // here    nextLine

//   if use more then one next line one after other  i dont have to the enters
        System.out.println("enter city name");
        String  city  = user.nextLine();          // here  nextLine

        System.out.println("enter ur state name");
        String  state = user.next();        // Enter here

        System.out.println("enter ur zip code");
        int zipCode = user.nextInt();        // Enter here

        user.nextLine();      // i used becouse i had two enter
        System.out.println("enter ur full name");
        String fullName = user.nextLine();


        System.out.println("\n Ship To " +fullName+"\n" + building + " " + street +"\n" + city + " ," + state+ " " + zipCode);

   /*
        System.out.println("Ship To: " + building + " " + street);
        System.out.println(city + " " + state + ", " + zipCode);
        System.out.println(fullName);

        user.close(); */
    }
}
