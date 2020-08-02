package day_36_ArrayList_Methods;

import java.util.ArrayList;
import java.util.Arrays;

public class Remove_Duplicate {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();
           list.addAll(Arrays.asList('a','b','a','b','a'));

        System.out.println(list);

        ArrayList<Character> newList = new ArrayList<>();

        for (char each : list){
            if (!newList.contains(each)){    //  a, b, a, b, a
                newList.add(each);
            }
        }

        System.out.println(newList);
    }
}
