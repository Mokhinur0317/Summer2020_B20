package day_22_Arrays;

import java.util.Scanner;

public class Room_Reservation {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int King = 120;
        int Queen = 100;
        int Single = 80;
        int TotalPrice = 0;
        while (true) {
            System.out.println("Welcome to Shinny Hotel");
            System.out.println("Here the room options  ");
            System.out.println("1.King bed: " + King + "\n2.Queen: " + Queen + "\n3.Single bed: " + Single);
            System.out.println("Which bedroom u wanna reserve?");
            int roomType = user.nextInt();
            System.out.println("How many days do u wanna stay?");
            int days = user.nextInt();

            switch (roomType) {
                case 1:
                    TotalPrice += 120;
                    break;
                case 2:
                    TotalPrice += 100;
                    break;
                case 3:
                    TotalPrice += 80;
                    break;
                default:
                    System.out.println("Invalid option!");
            }

            System.out.println("Do you wanna reserve other room ?");
            String answers = user.next().toLowerCase();


            while ( ! (answers.equals("yes")) || (answers.equals("no")) ){     // while answers Not valid  these steps reapeted over and over
                System.out.println("Please re- enter yes or no ");
                System.out.println("Do you wanna reserve other room ?");
                answers = user.next().toLowerCase();
            }

            if (answers.equals("no")){
                break;
            }

        }

        System.out.println("Your total is : " + TotalPrice);


    }
}
