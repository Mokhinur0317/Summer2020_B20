package day_16String;
import java.util.Scanner;
public class Substring_Practice {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
      //  user.close();

        System.out.println("Enter first string");
        String  word = user.next();                // apple

        System.out.println("Enter second word");
        String  word2 = user.next();             // banana
//       outpput    ppleanana
       //  String  result= word.substring(1).concat(word2.substring (1) );
        String result = word.substring(1)+word2.substring(1);
        System.out.println(result);
// ======================================================================================================

        String str = "I like to drink Pepsi";
        String drink = str.substring(16);
        System.out.println(drink);

        int wordlength = str.length();
        System.out.println(wordlength);

    }
}
