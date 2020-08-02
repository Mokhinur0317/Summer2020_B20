package day_16String;
import java.util.Scanner;
public class Practice_EqualsOrNot {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println( "are u employed");
        String answer = "yes";//user.next().toLowerCase      this one option

        if(answer.equalsIgnoreCase("Yes")){
            System.out.println("Employed");
        }else {
            System.out.println("Not Employed");
        }



    }
}
