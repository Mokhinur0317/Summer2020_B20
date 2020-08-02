package day_11NestedIf_Ternary;
/*
 write a program that can find the number of days  in a month
            Hint: 28 days:2
                  31 days:1,3,5,7,8,10,12
                  30 days:4.6.9,11
 */

public class DaysInMonth {
    public static void main(String[] args) {

        int month = 3;

        boolean days28 = month==2;
        boolean days30 = month == 4 || month ==6 ||month == 9 ||month == 11;
             // for the month that has 30 days

        boolean invalid = month < 1 || month > 12;
       // boolean days31 =  !days28 ||  !days30 || !invalid

        String result = "";

        if(days28){
            result = " 28 days";
        }else if (days30){
            result = " 30 days";
        }else if(invalid){
            result = "Invalid";
        }else {
            result = "31 days";
        }
        System.out.println(result);
            //   ternary methood

        String output = (days28) ? "28 days": (days30) ? "30 days" : (invalid)?"Invalid": "31 days";
        System.out.println(output);




    }
}
