package day_34_WrapperClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class warm_up {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMMM/dd,yyyy");

          LocalDateTime today  =  LocalDateTime.now();
        System.out.println(today.format(dtf));
    }
}
