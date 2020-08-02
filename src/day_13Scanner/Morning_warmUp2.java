package day_13Scanner;
import java.util.Scanner;
public class Morning_warmUp2 {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
/*
        System.out.println("Please Enter your age");
        int age = user_input.nextInt();

        if((age >= 10) && (age <=100)){
            if (age >=21){
                System.out.println("Here is ur wine");
            }else if (age < 21)  {
                System.out.println("get out kid");
            }
        }else {
            System.out.println("Invalid  age");
        }*/


        System.out.println("Please enter month number");
        int month = user_input.nextInt();

        boolean validNumber = month >= 1 && month <= 12;
        boolean days28 = month==2;
        boolean days30 = month == 4 || month ==6 ||month == 9 ||month == 11;


        String result = "";

        if(validNumber){
            if(days28){
                result = "28 days";
            }else if(days30){
                result = "30 days";
            }else{
                result = "31 days";
            }
        }else{
            result = "Invalid month";
        }

        System.out.println( result);





    }
}
