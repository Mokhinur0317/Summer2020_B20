package day_21Do_while_Loop;

import java.util.Scanner;

public class Office_hours_StringReverse {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        String str = user.nextLine(); //"Batch20";
        //            0123456

        str.charAt(6);  // "0"
        str.charAt(5); // '2'
        str.charAt(4); // 'h'
        str.charAt(3); // 'c'
        str.charAt(2); // 't'
        str.charAt(1); // 'a'
        str.charAt(0); // 'B'

        // 02hctaB

        String result = "";
    for (int i = str.length()-1;  i >= 0; --i){
        result  += str.charAt(i);
      //  System.out.println(str.charAt(i));
    }
        System.out.println(result);

        System.out.println("==============================");

        String result2 = "";
        int index = str.length()-1;

        while (index >= 0){
          result2 +=  str.charAt(index);
            index--;
        }
        System.out.println(result2);
    }
}
