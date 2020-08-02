package day_37Array_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class challenging_Task {
    public static void main(String[] args) {
        /*
        write a program that remove the element that are not unique from the Arraylist
         */

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,1,2,4,5,6));
        Predicate<Integer> unique = p -> Collections.frequency(list, p) != 1;
        list.removeIf(unique);
        System.out.println(list);  // it return me : [3, 4, 5, 6]

        /*
         remove the Elements that Matching with the if condition : RemoveIf methods
         Predicate :   applyed to the CollectionTypes
         */



//====================== Character array List =========================================

        ArrayList<Character> charList = new ArrayList<>();
        charList.addAll( Arrays.asList('a','b','c','1','2','$','%','*'));

        Predicate<Character> removeNums = p -> p >= 48 && p <=57;
        charList.removeIf(removeNums);
        System.out.println(charList);


        Predicate<Character> removeLatter = p -> p >= 97 && p <=122;
        charList.removeIf(removeLatter);
        System.out.println(charList);







    }
}
