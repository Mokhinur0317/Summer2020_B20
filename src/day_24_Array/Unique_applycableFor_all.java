package day_24_Array;

import java.util.Scanner;

public class Unique_applycableFor_all {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        String str = user.next();
        String unique = "";

        for (int j = 0; j <= str.length() -1; j++) { // because we need the frequency of every single character

            char ch1 = str.charAt(j);    // a
            int count = 0;     // 1

            for (int i = 0; i <= str.length() - 1; i++) { // used for finding the frequincy of ch and assign to count
                char eachChar = str.charAt(i);   //  a a b c c
                if (ch1 == eachChar) {
                    count += 1;
                }
            }
                                                                  // System.out.println(count);

            if (count == 1) {    // if it only occured one time
                unique += ch1;
            }

                                                                // System.out.println(ch1);

        }
        System.out.println(unique);
    }

    }

