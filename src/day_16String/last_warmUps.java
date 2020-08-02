package day_16String;
import java.util.Scanner;
public class last_warmUps {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter a word");

        String  word ="hey";//user.next();


        if(word.contains("ly")){
            System.out.println("really?");
        }else {
            System.out.println("never mind");
        }


        String gmail="@icloud.com";//user.next();

        if(gmail.contains("@gmail.com")){
            System.out.println("valid");
        }else{
            System.out.println("Invalid");
        }


        String web =user.next();

        if(web.startsWith("www")){
            System.out.println("valid web");
        }else {
            System.out.println("invalid web");
        }


    }
}
