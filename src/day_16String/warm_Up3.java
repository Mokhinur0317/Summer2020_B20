package day_16String;
import java.util.Scanner;
public class warm_Up3 {
    public static void main(String[] args) {
         Scanner user = new Scanner(System.in);
        System.out.println("Enter a word");
        String  str = "I like java";  //user.nextLine();

        //last index = length - 1;
        //second index = length - 2;
        //third index = length - 3;

        if(str.length() == 0){
            System.out.println("String is empty");
        }else  if (str.length() > 3){
            System.out.println(str.substring(str.length() -3) );   // thats how u can get characters from the end
        }else {
            System.out.println(str);
        }

        String result = (str.length() == 0) ? "String is empty": (str.length() > 3) ? ""+str.substring(str.length() -3):str;
        System.out.println(result);
        System.out.println("===============================================================================");

        String str1 = "abcd";
        String str2  = "ab";
        String str3  = "abc";

        boolean allSame = str1.length() == str2.length() && str1.length() == str3.length();
        boolean allDifferent = str1.length() != str2.length() && str2.length() != str3.length() && str1.length() != str3.length();

        if( allSame ){
            System.out.println("All words are same length");
        }else if(allDifferent){
            System.out.println("All different length");
        }else{
            System.out.println("Not Same nor Different lengths");
        }
    }
}
