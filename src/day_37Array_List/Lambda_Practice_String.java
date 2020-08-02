package day_37Array_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Lambda_Practice_String {
    public static void main(String[] args) {


        ArrayList<String> strList =  new ArrayList<>();
        strList.addAll(Arrays.asList("Moki", "Dudka", "Sabin", "Marsela", "Albina"));

     // in this task i just wanna remove the names that start with M latter
        Predicate<String> each = p -> p.startsWith("M");
        strList.removeIf(each);
        System.out.println(strList);
     //  my output : [Dudka, Sabin, Albina]   there is no name that startsWith M anymore









    }
}
