package day_36_ArrayList_Methods;

import java.util.ArrayList;
import java.util.Collections;

public class Task_afterClass {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");

        ArrayList<String> newList = new ArrayList<>();
        for (String each : list){
            if (!newList.contains(each)){    //  a, a, , b, b
                newList.add(each);
            }
        }
        System.out.println(newList);

        int count =  Collections.frequency(list,"a");
        System.out.println(count);
        int count2 =  Collections.frequency(list,"b");
        System.out.println(count2);


       ArrayList<String> finalList = new ArrayList<>();
       finalList.add(newList.get(0) + "" + count);
       finalList.add(newList.get(1) + "" + count2);

        System.out.println(finalList);

    }
}
