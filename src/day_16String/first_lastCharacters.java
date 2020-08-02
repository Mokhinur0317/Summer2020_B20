package day_16String;
import java.util.Scanner;
public class first_lastCharacters {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("enter a word");
        String  word = user.next();
        user.close();

        char firstChar = word.charAt(0);
        char lastChar = word.charAt(word.length() - 1);

        String result = (firstChar == lastChar) ? "true" : "false";
        System.out.println(result);
    }
}
