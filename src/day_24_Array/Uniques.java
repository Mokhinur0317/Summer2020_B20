package day_24_Array;

import java.util.Arrays;

public class Uniques {
    public static void main(String[] args) {
        String str ="aabcc";
        String uniques = "";
        for (int i = 0; i <= str.length() -1; i++){
         char ch  =    str.charAt(i);      //  a a b c c
         int first =  str.indexOf(ch);   //  0 0  2  3  3
         int last = str.lastIndexOf(ch); //  1 1  2  4  4   last number from the String

            if (first == last){
                uniques += ch;
            }
        }
        System.out.println(uniques);
        System.out.println("=====================================");








    }




}
