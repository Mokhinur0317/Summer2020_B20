package day_37Array_List;

import java.util.ArrayList;
import java.util.Arrays;

public class Break_Task {
    public static void main(String[] args) {


        ArrayList<Character> list = new ArrayList<>();
        list.addAll(Arrays.asList('a','b','a','c','d','h','h','k','k'));
        System.out.println(list);

        // [a, b, a, c, d, h, h, k, k]  here my output and
        // i want to remove  all   a  and k:

        list.removeAll( Arrays.asList('k','a'));
        System.out.println(list);
        // output after removing the a and k   : [b, c, d, h, h]

        //  i want to keep only  c and d :
        list.retainAll( Arrays.asList('c', 'd'));
        System.out.println(list);
        // thats how my final output is looks like : [c, d]


        /*
        we can apply the same methods to Double ,String , Integer and so on...
         */


    }
}
