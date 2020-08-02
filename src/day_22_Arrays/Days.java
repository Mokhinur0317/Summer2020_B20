package day_22_Arrays;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        String [] days = new String[7];
        days [6] = "Sunday";
        days [1] = "Tuesday";
        days [4] = "Friday";
        days [3] = "Thursday";
        days [2] = "Wednesday";
        days [5] = "Saturday";
        days [0] = "Manday";

        for (int i = 0; i <= days.length-1;i++){
            System.out.print( days[i]+" ");
        }

        System.out.println();
        System.out.println("Enter a number between 1  to 7");
        int num = user.nextInt();
        System.out.println( days[num -1 ]);
    }
}
