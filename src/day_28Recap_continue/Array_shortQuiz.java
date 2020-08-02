package day_28Recap_continue;

import java.util.Arrays;

public class Array_shortQuiz {
    public static void main(String[] args) {
        char [] arr = {'d' , 'c','b', 'a'};
        Arrays.sort(arr);    // a b c d
        System.out.print(arr + " ");

        for (char each : arr){    // a , b , c, d
         if (each == 'd'){        // a , b , c,  d     in this case it skips anything after d
             continue;
         }
       }


        System.out.println();
        System.out.println("===============   next ===================");


        int num = 0;    // 0 - 1 ;  1 + 1 ;  2 + 2 -1
        String[] days = {"sun", "mon", "wed", "sat"};
        for (int i =0; i < days.length; i++){
            switch (days[i]){
                case "sun":
                case "sat":
                    num -= 1;
                    break;

                case "mon":
                    num ++;

                case "wed":
                    num += 2;

            }
        }

    }
}
