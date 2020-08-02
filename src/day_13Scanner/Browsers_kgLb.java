package day_13Scanner;

import java.util.Scanner;

public class Browsers_kgLb {
    public static void main(String[] args) {
          /*
        armup tasks:
    1. write a progrm that can calculate the area of any given circle
                MUST use Scanner

    2. write a program that calculate the area of any given rectangle
                MUST use scanner


    5. write a program that can calculate the state tax, federal tax and salary after tax
                needed informations:
                                annual salaray
                                state tax rate
                                federal tax rate
                MUST use Scanner
                */




        System.out.println("=================================================================================");
       Scanner user_input = new Scanner(System.in);
        int gallons = user_input.nextInt();

        double litters = gallons * 3.785;

        System.out.println(gallons + " gallons equil to " + litters + " litters");
        System.out.println("===================================================================================");


        int  kg =  user_input.nextInt();

        double lb = kg * 2.205;

        System.out.println(kg  + " is equal to "+ lb + "lb");
        System.out.println("=====================================================================================");

             String browserName = "edge";
             switch (browserName){
                 case "chrome":
                 case"firefox":
                 case "opera":
                 case"safari":
                 case"edge":
                     System.out.println("Valid Browser Name");
                     break;

                 default:
                     System.out.println("Invalid Browser Name");
             }

    }
}
