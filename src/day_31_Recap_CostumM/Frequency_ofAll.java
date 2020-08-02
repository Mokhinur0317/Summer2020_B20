package day_31_Recap_CostumM;

import Library.Util_1;

public class Frequency_ofAll {
    public static void main(String[] args) {
        String str = "abbacca";
        String ExpectedResult = "";

        String nonDup = Util_1.Remove(str);

       for (char each : nonDup.toCharArray()) {
           int count = Util_1.frequency(str, each);   //3
           ExpectedResult += "" + each + count;//    a3


       }

        System.out.println(ExpectedResult);

       String name = "moki";
       String newStr = frequency_of_eachChar(name);
        System.out.println(newStr);

    }


    public static  String frequency_of_eachChar (String str){

        String ExpectedResult = "";

        String nonDup = Util_1.Remove(str);

        for (char each : nonDup.toCharArray()) {
            int count = Util_1.frequency(str, each);   //3
            ExpectedResult += "" + each + count;//    a3


        }

      return ExpectedResult;


    }
}
