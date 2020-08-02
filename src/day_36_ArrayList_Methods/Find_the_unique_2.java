package day_36_ArrayList_Methods;

import java.util.ArrayList;
import java.util.Collections;

public class Find_the_unique_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(4);

        ArrayList<Integer> unique = new ArrayList<>();
        for (Integer each : list){
            if(Collections.frequency(list,each) == 1){
                unique.add(each);
            }

        }
        System.out.println(unique);
    }
}
