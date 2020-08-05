package rep.it_practice;

import java.util.Arrays;

public class print_onlyTwoChar_fromArray {
    public static void main(String[] args) {
        String[] arr = {"hello", "why", "by", "apple" , "note"};
        String[] newArr = new String[arr.length];

         int index = 0;
        for (String each : arr){
          String charFirst_last =""+  each.charAt(0) + each.charAt(each.length()-1);
          newArr[index] = charFirst_last;
           // System.out.println(index);
          index++;

          //System.out.print(charFirst_last + ",");


        }
        System.out.println();


        System.out.println( Arrays.toString(newArr));

    }
}
