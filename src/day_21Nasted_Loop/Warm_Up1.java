package day_21Nasted_Loop;

import  java.util.Scanner;

public class Warm_Up1 {
    public static void main(String[] args) {
        Scanner user = new Scanner (System.in);
        int sum = 0;
        while (true) {
            System.out.println(" running");
            System.out.print("Enter first number: ");
            int number = user.nextInt();
            System.out.print("Enter second number: ");
            int number2 = user.nextInt();
            sum = number + number2;
            System.out.println("sum of two numbers: " + sum);

//            THIS SHOULD BE IN A LOOP BREAK | WHEN NEEDED
            while (true) {
                System.out.println("Do  u wanna continue ?");
                String ans = user.next();

                if (ans.equalsIgnoreCase("yes")) {
                    System.out.print("answer is  yes");
                    break;
                } else if (ans.equalsIgnoreCase("no")) {
                    System.out.println(" no ");
                    System.exit(0);
                } else {
                    System.out.println(" re-enter yes or no");
                    continue;
                }
            }
       }
    }
}







/*
   1. write a program that ill ask user to enter two numbers and calculates the sum of those two numbers. then it asks the user if he/she wants to continue
                    if the answer is yes, repeat the whole process again
                    if the answer is no, only return the addition
                    but while the anser is not a valid answer (not yes or no), the the program should repeatedly ask the user re-enter
            HINT: nested loop task, outter loop need to be an infinite loop

 */