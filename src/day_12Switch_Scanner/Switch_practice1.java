package day_12Switch_Scanner;

public class Switch_practice1 {
    public static void main(String[] args) {

        int day = 1;
        String result ="";

        switch (day){
            case 1:
                result = "monday";
              //  System.out.println("monday");
               // System.out.println("hey its monday");    it works
                break;

            case 2:
              result =( "tuesday");
                break;

            case 3:
               result =("wednesday");
                break;

            case(4):
                result = ("thursday");
                break;

            case(5):
                result =("Friday");
                break;

            case(6):
                result = ("saturday");
                break;

            case (7):
                result= ("sunday");
                break;

            default:
                result = ("there is no such a day");
                break;

//     without break : there wont be any error but u get bug which is output will be more then one
        }
        System.out.println( result);
        // switch doesnt except   -- float = double = boolean = long; in these cases we get campile error;

        int num =  15 ;
        String message = "";

        switch (num){
            case 1:
                message = "January";
                break;

            case 2 :
                message = "February";
                break;

            case 3:
                message = "March";
                break;

            case  4:
                message = "April";
                break;

            case 5:
                message = "May";
                break;

            case 6 :
                message = "June";
                break;

            case 7:
                message = "July";
                break;

            case 8 :
                message = "August";
                break;

            case 9:
                message = "September";
                break;

            case 10:
                message = " October";
                break;

            case 11:
                message = "November";
                break;

            case 12:
                message = "December";
                break;

            default:
                message = "Invalid number";


        }
        System.out.println(message);


    }
}
