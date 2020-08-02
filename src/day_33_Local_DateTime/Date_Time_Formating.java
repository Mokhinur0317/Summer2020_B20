package day_33_Local_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class Date_Time_Formating {
    public static void main(String[] args) {
        DateTimeFormatter  dataFormat = DateTimeFormatter.ofPattern("E, MMMM/dd/yyyy");
        // MMMM it gives full  month  names   // MM gives the month number like 07


        LocalDate date = LocalDate.of(2020,7,25);
        System.out.println(date);

        System.out.println(date.format(dataFormat));
//==================================================================================



        DateTimeFormatter timeFormater = DateTimeFormatter.ofPattern("hh:mm a");

        LocalTime now = LocalTime.now();
        System.out.println(now);
        System.out.println(now.format(timeFormater));    // 01/01/pm


//=======================================================================================

      LocalDateTime time = LocalDateTime.of(2019,5,20,16,30);

      DateTimeFormatter  dateTimeFormatter = DateTimeFormatter.ofPattern("MMMM/dd/yyy EEEE hh:mm a ");
      System.out.println(time.format(dateTimeFormatter));

//====================================================================================

        System.out.println(LocalDateTime.now().format(dateTimeFormatter));

        // output gives todays date and time
//======================================================================================
       LocalDateTime rNow = LocalDateTime.now();
       DateTimeFormatter r_nowFormatter = DateTimeFormatter.ofPattern("EEEE hh:mm:ss a");
        System.out.println(rNow.format(r_nowFormatter));
    }
}
