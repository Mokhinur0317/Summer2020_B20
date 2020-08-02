package day_21Nasted_Loop;

import java.util.Scanner;

public class Warm_Up2 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        while (true){
            int King = 120;
            int Queen = 100;
            int Single = 80;
            int TotalPrice = 0;
            System.out.println("Which bedroom do u wanna reserve?");
            String bedroomType = user.nextLine();
            System.out.println("How many days: ");
            short days = user.nextShort();

            if (bedroomType.equalsIgnoreCase("king bed")){
                TotalPrice += (King * days);
            }else if (bedroomType.equalsIgnoreCase("queen bed")){
                TotalPrice += (Queen * days);
            }else if (bedroomType.equalsIgnoreCase("Single bed")){
                TotalPrice += (Single * days);
            }
            System.out.println("Your total is: " + TotalPrice);

            while (true){
                System.out.println("Do you want to reserve another");
                String ans = user.next();
                if (ans.equalsIgnoreCase("yes")){
                    break;
                }else if (ans.equalsIgnoreCase("no")){
                    System.out.println(" You have a good day");
                    System.exit(0);
                }else {
                    System.out.println("Please re-enter yes or no");
                    continue;
                }
            }
        }


    }
}
