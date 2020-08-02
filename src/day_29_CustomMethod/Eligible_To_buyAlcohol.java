package day_29_CustomMethod;

import java.util.Scanner;

public class Eligible_To_buyAlcohol {

    public static void Alcohol( int age , String id){
        if (age >= 21 && id.equalsIgnoreCase("yes")){
            System.out.println("U can get any drink u want");
        }else {
            System.out.println("Sorry, u need to get out");
        }
    }      //     Costum Methoods
//==========================================================================

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter a age");
        int age = user.nextInt();
        System.out.println("do u have a Id");
        String id = user.next();

        Alcohol(age, id);

    }
}
