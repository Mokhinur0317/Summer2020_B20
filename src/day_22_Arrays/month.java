package day_22_Arrays;

import java.util.Scanner;

public class month {
    public static void main(String[] args) {
        String [] month = {"january" , "february", "mar", "apr" , "may", "june", "july", "aug", "sep", "oct" , "nov", "dec"};
        Scanner user = new Scanner(System.in);
        System.out.println("Enter a number of month");
        int num = user.nextInt();

        System.out.println( month[num-1]);
    }
}
