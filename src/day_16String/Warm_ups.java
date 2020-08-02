package day_16String;
import java.util.Scanner;
public class Warm_ups {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("enter uy first word");
        String first = user.next();

        System.out.println("enter ur next word");
        String second = user.next();

        boolean result = first.length()== 5 &&second.length() == 5;
      /*
        if(result){
            char ch1 = first.charAt(first.length()-1);// this one is last char of the first word
            char ch2 = second.charAt(0);  // firstchar of the second word
            if (ch1 ==ch2){
                System.out.println("fiiz");
            }else {
                System.out.println("buzz");
            }
        }else {
            System.out.println("need to be exactly 5 letter");
        }
        */


        if(result){   //  first char of
            if(first.endsWith(""+second.charAt(0))   && second.startsWith(""+ first.charAt(first.length() -1 ))){
                System.out.println("fizz");
            }else {
                System.out.println("buzz");
            }

        }else {
            System.out.println("need to be exactly 5 letter");
        }

    }
}
