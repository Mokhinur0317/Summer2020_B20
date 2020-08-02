package day_16String;
import  java.util.Scanner;
public class equalsWords {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("Enter your first word");
        String   word1 = user.next();

        System.out.println("enter your second word");
        String  word2 = user.next();

        String result = (word1.equalsIgnoreCase(word2))? "equals" :"not equals";
        System.out.println(result);
    }
}
