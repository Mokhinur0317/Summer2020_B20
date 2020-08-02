package day_19For_Loop;

import java.util.Scanner;

public class PalinDrome_Test {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        String str = user.nextLine();
        String reversedStr = "";

        for(int i = str.length()-1;  i >= 0; i--){
          reversedStr  +=  str.charAt(i);       // str.substring(i. i + 1)
        }
        System.out.println(str.equals(reversedStr));


    }
}
