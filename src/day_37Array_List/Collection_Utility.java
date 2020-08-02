package day_37Array_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collection_Utility {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,20,30,40,50,-1,-3,-50));

        int max =   Collections.max(list);
        System.out.println("Max number is : " + max);

        int min = Collections.min(list);
        System.out.println("Min number is : " + min);




 //   ==================    Replace_All Methods ================================

      ArrayList<String> names = new ArrayList<>();
      names.addAll( Arrays.asList("Moki", "Ali", "Dudka", "Dots", "Moki"));
      Collections.replaceAll(names, "Moki","Sabin");
      System.out.println(names);

    }
}
