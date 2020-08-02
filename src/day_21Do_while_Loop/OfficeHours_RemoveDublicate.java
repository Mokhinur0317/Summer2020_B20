package day_21Do_while_Loop;

import java.util.Scanner;

public class OfficeHours_RemoveDublicate {
    public static void main(String[] args) {
        Scanner user =new Scanner(System.in);
            String str = user.nextLine();
        String result = "";
        for (int i = 0 ; i <= str.length()-1; i++){
         String s="" + str.charAt(i);
         if (result.contains(s)){   // n a l a n
             continue;
         }else{
             result += s;
         }
        }

        System.out.println(result);
    }
}

// if (!result.contains(S)){
        //  result += s;