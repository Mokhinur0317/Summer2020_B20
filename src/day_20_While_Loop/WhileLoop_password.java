package day_20_While_Loop;

import java.util.Scanner;

public class WhileLoop_password {
    public static void main(String[] args) {

        String password = "Cybertek123";

        Scanner user = new Scanner(System.in);
        System.out.println("Enter ur password");
        String input = user.nextLine();

        while (!input.equals(password)){
            System.out.println("Please re-enter ur password");
            input = user.nextLine();
        }
            System.out.println("Logged in");




    }
}
