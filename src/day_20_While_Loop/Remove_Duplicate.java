package day_20_While_Loop;

import java.util.Scanner;

/*
  Write a program that can remove the duplicates from any given String
 */
public class Remove_Duplicate {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        String str = user.next();
        String result = "";     // a  b

        for(int i = 0; i <= str.length()-1; i++){
            String s = ""+str.charAt(i); // a, a, b, b
            if ( !result.contains(s)){     // if the character is already contained in result, we will no
                result += s;
            }
        }
        System.out.println(result);
    }
}
