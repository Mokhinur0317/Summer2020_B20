package day_22_Arrays;

public class MorningWarm_Up {
    public static void main(String[] args) {
        while(true){
            System.out.println("Enter a number");
            int num1 = 1;
            System.out.println("Enter second number");
            int num2 = 2;
            int sum = 0;
            sum += num1 +num2;
            System.out.println("Sum of the numbers : " + sum);
            System.out.println();
            System.out.println("Do u wanna continue");
            String a = "yes";

            while( ! (a.equals("yes")) || (a.equals("no")) ){    // while answers is invalid
                System.out.println("Invalid answer please re-enter");
                System.out.println("Do u wanna continue");
                String an = "no";

            }


            if(a.equals("no")){
                break;
            }

        }


        System.out.println("Thanks for using Cybertek' Calculator");

        System.exit(0);






       }
    }

