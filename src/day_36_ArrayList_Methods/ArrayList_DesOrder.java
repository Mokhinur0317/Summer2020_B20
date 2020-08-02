package day_36_ArrayList_Methods;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_DesOrder {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(50);
        list.add(15);

        Collections.sort(list);
        System.out.println(list);
     ArrayList<Integer> newlist = new ArrayList<>();

     for (int i = list.size() -1; i >= 0; i--){
         newlist.add(list.get(i));
     }

        System.out.println(newlist);

    }
}
