package day_07_Unary_shorthand;

public class Leap_year_warmup {
    public static void main(String[] args) {

        int year =2021;
        boolean result = year % 4== 0;

        System.out.println(result);

        System.out.println("2020 is a leap year: " + result);  // in this case my year wont change in the output
                                            // bacause i didnt use the variable as a year

        System.out.println(year + " is a leap  year: " + result);


        System.out.println("=====================================================================");

        int number = 25;
        boolean divisibleBy2 = number % 2 == 0;  // try to use variables
        System.out.println(divisibleBy2);

        boolean divisibleBy3 = number  % 3 == 0;
        System.out.println(divisibleBy3);

        boolean divisibleBy5 = number  % 5 == 0;
        System.out.println(divisibleBy5);

        System.out.println(number +" is evenly divisible by 2: " + divisibleBy2);
    }
}
