package day_32_Methods_Overloading;
import Library.Util_1;

import java.util.Arrays;

public class Methods_call {
    public static void main(String[] args) {
        String str = "MoKi";
        String str2 = "ALI";

      String togetherName =  Util_1.Regular_Format(str,str2);
        System.out.println(togetherName);


      String unique = Util_1.uniques(togetherName);
        System.out.println(unique);


      String reverse_Name = Util_1.reverse_string(togetherName);
        System.out.println(reverse_Name);


        System.out.println("===================================");

        int[] number = {1,2,3};
        int newNum = 5;

        int[] Finalresult = Util_1.Add_numberTo_Array(number,newNum);
        System.out.println(Arrays.toString(Finalresult));


    }
}
