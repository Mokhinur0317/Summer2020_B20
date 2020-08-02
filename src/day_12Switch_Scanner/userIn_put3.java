package day_12Switch_Scanner;

import java.util.Scanner;

public class userIn_put3 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        System.out.println(" Please enter  ur  annual  salary");

        double salary = input.nextDouble();

        System.out.println("How many hours do u work in the week ?");

        int hours = input.nextInt();

        int   totalhours = hours * 52;
        double hourlyRate = salary/ totalhours;

        System.out.println(" Your hourly rate is : $ " + hourlyRate);

    }
}
