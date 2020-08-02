package day_13Scanner;
import java.sql.SQLOutput;
import java.util.Scanner;
public class warmUp {
    public static void main(String[] args) {
       Scanner user_input = new Scanner(System.in);
       /*
       System.out.println("Plese enter  car brand ");
       String  brand = user_input.next();

        System.out.println("please enter car model");
        String  model = user_input.next();

        System.out.println("please enter  year of the car");
        int year = user_input.nextInt();

        System.out.println("please enter color of the car");
        String color = user_input.next();

        System.out.println("please enter mile age of the car");
        double   mileAge = user_input.nextDouble();

        System.out.println("please enter price of the car ");
        Double price = user_input.nextDouble();

        System.out.println(year +" "+  brand+ " " + model+" " + color + ","+mileAge + " miles," +  price + " dollars. ");

        */
      /*  System.out.println("========================================================");

        System.out.println("Plese enter your company name");
        String  company = user_input.next();

        System.out.println("Enter your firs name");
        String firstName = user_input.next();

        System.out.println("Enter your last name");
        String lastName = user_input.next();

         String fullName = firstName + lastName;

         user_input.nextLine();
        System.out.println("Enter  your job title");
        String  jobTitle = user_input.nextLine();

        System.out.println("Enter your salary");
        double salary = user_input.nextDouble();

        user_input.close();

        System.out.println("Company name: " + company );
        System.out.println("Full name: " + fullName );
        System.out.println("Job title: " + jobTitle + " , " + "Annual salary: " + salary);*/

        System.out.println("====================================================================");

        System.out.println("Please enter ur  building number");
        int buildingNum  = user_input.nextInt();

          // user_input.nextLine();
        System.out.println("please enter street name");
       // String streetName = user_input.nextLine();
          String  streetName = user_input.next();

        System.out.println("enter road name ");
        String road = user_input.next();

        System.out.println("enter city name");
        String city = user_input.next();

            user_input.nextLine();
        System.out.println("enter state  name ");
        String state = user_input.nextLine();

        System.out.println("enter zipcode");
        int zip = user_input.nextInt();

        user_input.close();

        System.out.println("address : " + buildingNum + " "+ streetName + " " + road+ ", " +city + " "+ state +", " + zip);












    }
}
