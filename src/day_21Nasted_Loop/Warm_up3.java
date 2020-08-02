package day_21Nasted_Loop;

import java.util.Scanner;

public class Warm_up3 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = user.next();
        char ch = user.next().charAt(0);

        String result = "";

        for (int i = 0; i <= str.length()-1; i++){
            String s  =""+ str.charAt(i);

            if ( !result.contains(s)){
                result += s;
            }
        }
        System.out.println(result);


        int count = 0 ; // 1+1 = 2, frequency of ch in str


        for(int i=0; i <= str.length()-1; i++){
            //ababc
            char each = str.charAt(i);  // a  b a b c

            if( each == ch ){  // if true, means ch is occured in str
                count += 1;
             }
           }
        System.out.println(count);
        }
    }

