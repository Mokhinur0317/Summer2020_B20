package day_21Nasted_Loop;

import java.util.Scanner;

public class Password_withLoop {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("Enter your username");
        String  u = user.next();
        System.out.println("Enter your password");
        String p = user.next();

        int attempt = 0;

        while ( !u.equals("cyber") && p.equals("tek123")){

            if (attempt == 3){
                System.out.println("ur account is locked");
                System.exit(0);
            }

            System.out.println("Invalid username , please enter again");
            System.out.println("enter ur username");
            u = user.next();


            System.out.println("Enter ur password");
            p = user.next();

            attempt++;

        }

        System.out.println("logged in ");
    }
}
