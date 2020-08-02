package day_21Nasted_Loop;

import java.util.Scanner;

public class Warm_Up {
    public static void main(String[] args) {
        Scanner user= new Scanner(System.in);
        System.out.println("Enter a string");
        String  word = user.next();

        char first =   word.charAt(0);
        char last = word.charAt((word.length()-1));

        boolean start = first >= 'A' && first <= 'Z';    // upperCase character
        boolean end = last >= 'a'  && last <= 'z';

        System.out.println(start && end);


        System.out.println("============================================");
                            //   ababaca
             String str = user.next();
             char ch = user.next().charAt(0);
             //2
          int count = 0;   // icrease by 1 + 1 == 2, frequency of ch in str
        for (int i = 0; i <=str.length()-1; i++){
            char each =  str.charAt(i);  //  a b a b c

            if (each == ch){
                count += 1;
            }
        }



    }
}