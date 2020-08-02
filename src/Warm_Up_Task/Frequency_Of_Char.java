package Warm_Up_Task;

import java.util.Arrays;

public class Frequency_Of_Char {

    public static void Frequency_ofChar(String str, String ch) {
        int count = 0;
        String[] newArr = str.split("");
        for (String eachChar : newArr) {
            if (eachChar.equals(ch)) {
                count++;
            }
        }
        System.out.println(count);
    }



  //===========================================================================


    public static void main(String[] args) {
     Frequency_ofChar("abcasa" , "a");

     Frequency_ofChar_2("abacd",'a');
        int count = Frequency_ofChar_2("abacd",'a');
        System.out.println(count);
    }


      public static int  Frequency_ofChar_2 (String str, char ch){
          str = str.toLowerCase();
          int count = 0;
          for (int i = 0; i <= str.length() -1 ; i++){
              if (str.charAt(i) == ch ){
                  count++;
              }
          }
         return count;
      }

      }






