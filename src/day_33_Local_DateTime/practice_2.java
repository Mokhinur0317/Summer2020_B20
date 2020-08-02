package day_33_Local_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class practice_2 {
    public static void main(String[] args) {
        String[] my = {"Moki", "dudka"};
        LocalDate[] dateBirth = {LocalDate.of(1997,6,2),
                           LocalDate.of(2000,2,6)
                            };

        DateTimeFormatter farmat_form = DateTimeFormatter.ofPattern("MMMM/dd/yyyy EEEE");

     for (int i =0 ; i <= my.length -1 ; i++){
         System.out.println(my[i] + " : " + dateBirth[i].format(farmat_form) );
     }
    }
}
