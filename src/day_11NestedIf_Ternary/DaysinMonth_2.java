package day_11NestedIf_Ternary;

public class DaysinMonth_2 {
    public static void main(String[] args) {

        int month = 15;
        boolean validNumber = month >= 1 && month <= 12;

        boolean days28 = month==2;
        boolean days30 = month == 4 || month ==6 ||month == 9 ||month == 11;
        // for the month that has 30 days

        boolean invalid = month < 1 || month > 12;
        // boolean days31 =  !days28 ||  !days30 || !invalid


        String result = "";

        if (validNumber){  // for 28 days or 30 days or 31 days
            if(days28){
                result = "28 days";
            }else if (days30){
                result = "30 days";
            }else if (invalid){
                result = "Invalid";
            }else {
                result = "31 days";
            }

        }else{
            result = " there is such a month";
        }
        System.out.println(result);





    }
}
