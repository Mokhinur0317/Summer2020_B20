package day_10;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class warm_up {
    public static void main(String[] args) {

        char character = 'A';

        boolean is_Alfabatic =( character >= 65 && character <= 90) || (character >= 97 && character <=122);
              //                upper case latters || lower case letter

        boolean is_digit = character >= 48 && character <= 57;
        boolean special_char = (is_Alfabatic = !is_Alfabatic) && (is_digit = !is_digit) ;


        String digit ="";
        String result ="";
        String special = "";

        if(is_Alfabatic){
            result = character + " is alphabetic character";
          //  System.out.println(character + " is alphabetic character");
        }else{
            result = character +  " is not alphabetic character ";
           // System.out.println(character + " is not alphabetic character ");
        }
        System.out.println(result);

        if(is_digit == true){
            digit = character + " is digit";
        }else {
            digit = character + " is not a digit ";
        }

        System.out.println( digit);
        if (special_char) {
            special = character + " is special character ";
        } else{
                special = character + " is not special character ";
            }
        System.out.println(special);





      //   moki if u wanna check the  char u  need the use aski table
    }
}
