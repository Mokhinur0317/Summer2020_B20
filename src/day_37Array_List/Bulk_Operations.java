package day_37Array_List;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_Operations {
    public static void main(String[] args) {

        ArrayList<Integer> list  = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);


        boolean b = list.contains(1);
        System.out.println(b);  // this one gives me true


        ArrayList<Integer> elements = new ArrayList<>();
        elements.add(1);
        elements.add(2);
        elements.add(5);
        // here i wanna verify list  contains same numbers as element list does
        boolean containAll_Element = list.containsAll(elements);
        System.out.println(containAll_Element);

        System.out.println("==============================");


        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);

        // verify that 1, 2, 4 are contained in the list2
        // Integer[] arr = {10,20,30}                     arr
        boolean b3  =   list2.containsAll( Arrays.asList(1,2,4)  ); // it will return boolean
        System.out.println(b3);   // true



    }
}
