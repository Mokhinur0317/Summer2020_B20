package Office_hours;
import java.util.Arrays;
import java.util.Scanner;
public class Array_practice {
    public static void main(String[] args) {
        /*
        String[] name = {"apple" , "banana"};
        for( String names :  name){
          //  System.out.print(names + " , ");
            System.out.println();
          String ch1 = names.substring(0 , 3);
            System.out.println(ch1);

        }

         */
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextLine();
        }
        for (String text : arr) {
           System.out.print(text + " , ");
            System.out.println();
            String ch = text.substring(0 , 3);
            System.out.println(ch);
          //  char first = text.charAt(0);
          //  char last = text.charAt(text.length()-1);
          //  System.out.println("" + first + last);
        }


    }
}
