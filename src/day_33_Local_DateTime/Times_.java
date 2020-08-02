package day_33_Local_DateTime;

import java.time.LocalTime;

public class Times_ {
    public static void main(String[] args) {


   LocalTime time = LocalTime.of(15,45,55);
        System.out.println(time);

   LocalTime time2 =  LocalTime.now();
        System.out.println(time2);
    }
}
