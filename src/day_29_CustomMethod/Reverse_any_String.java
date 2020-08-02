package day_29_CustomMethod;

import javax.print.DocFlavor;
import java.util.Scanner;

public class Reverse_any_String {

    public static void  reverse_string(String str){
        String result = "";
        for (int i = str.length()-1 ; i >= 0; i--){
            result  += str.charAt(i);
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter a  word ");
        String str = user.next();

        reverse_string(str);

    }
}
