package day_29_CustomMethod;

import java.util.Scanner;

public class Calculate_age {
    public static void  Person_age(int age , int current_year) {
        if (current_year < age) {
            System.out.println("invalid entry");
        } else {
            age = current_year - age;
            System.out.println(age);
        }
    }

    public static void main(String[] args) {
        Scanner user =  new Scanner (System.in);
        System.out.println("Enter ur birth year");
        int age = user.nextInt();
        System.out.println("Enter a current  year ");
        int current_year = user.nextInt();

        Person_age(age,current_year);
    }


}
