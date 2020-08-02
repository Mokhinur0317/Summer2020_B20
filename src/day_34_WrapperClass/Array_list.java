package day_34_WrapperClass;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_list {
    public static void main(String[] args) {
        /*
         ArrayList ; part of collection
                    size is dynamic(automatically adjusted)
                    doesnt support pirimative
         */

        ArrayList<Integer>scores = new ArrayList<Integer>();
        scores.add(95);         // autoBoxing  index 0
        scores.add(100);    // autoboxing       index 1
        scores.add(90);    // autoboxing       index 2
        scores.add(1,65);   // in this case 65 will be added to index one
        scores.add(4,99);   //  99 will added to index 5

        System.out.println(scores);

        /*
        add (Value)
         */

        System.out.println(scores.get(2) );   // in this case i can get 100 from the list by giving the index number








    }
}
