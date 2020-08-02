package day_37Array_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Find_Unique {
    public static void main(String[] args) {
        String str = "abbacda";
        String unique ="";

//        ArrayList<Character> list = new ArrayList<>();
//        for (char eachChar : str.toCharArray()){
//            list.add(eachChar);
//        }



        ArrayList<String> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(str.split("")));

//        for (String each : str.split("")){
//              list2.add(each);
//        }
//        System.out.println(list2);

        for (String eachElement :list2) {
            int count = Collections.frequency(list2, eachElement);
            if (count == 1) {
               unique += eachElement;
            }
        }


        System.out.println(unique);



    }
}
