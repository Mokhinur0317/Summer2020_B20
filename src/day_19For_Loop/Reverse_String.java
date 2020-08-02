package day_19For_Loop;

import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        String str = "Cybertek" ;//user.nextLine();

        //   01234

       // String  result =" "+ str.charAt(str.length()-1) + str.charAt(3)+ str.charAt(2) + str.charAt(1) + str.charAt(0);
      //  System.out.println(result);

        String result = "";
        for (int i = str.length()-1;  i >= 0; i --){   // 4 , 3 2 1 0
            result += str.charAt(i);
        }
        System.out.println(result);

        System.out.println();

     //     while loop
              String name = "Cybertek";
            int i = name.length()-1;
        while (i >= 0 ){
            System.out.print(""+name.charAt(i));
          i--;
        }
    }
}
