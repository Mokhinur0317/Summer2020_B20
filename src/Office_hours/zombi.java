package Office_hours;

import java.util.Arrays;

public class zombi {
    public static void main(String[] args) {
//        int day = 0;
//        int inhabitants = 5;
//        while (day  == 0 && inhabitants >= 1) {
//            System.out.println("day " + day + " " + inhabitants);
//
//            if (day == 0 && inhabitants == 0){
//                continue;
//            }
//
//            while (inhabitants > 1) {
//                inhabitants = inhabitants / 2;
//                day++;
//                System.out.println("day  " + day + " " + inhabitants);
//
//            }
//        }
//
//        System.out.println("exit the game");


        System.out.println("==================   start new game ===============================================");
        int days = 0;
        int[] new_inhabitants = {6, 4 ,0, 6};

       for (int eachNumber :new_inhabitants){
           while (days == 0 && eachNumber >=1){
               System.out.print("day " + days + " " + eachNumber);

                 while (eachNumber > 1) {
                   eachNumber = eachNumber / 2;
                   days++;
                   System.out.println();
                   System.out.println( "day " + days + " " + eachNumber);

              }
           }
       }














            }

    }

