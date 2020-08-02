package day_29_CustomMethod;

import java.util.Scanner;

public class Eligibility_vote {

    public static void Eligible_to_Vote(int age, String country){
        if (age >= 18 &&  country.equalsIgnoreCase("USA")){
            System.out.println("Eligible to vote");
        }else {
            System.out.println("not eligible");
        }

    }


    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter your age");
            int age = user.nextInt();
        System.out.println("Enter current country u live");
             String country = user.next();

             Eligible_to_Vote(age,country);
    }


}
