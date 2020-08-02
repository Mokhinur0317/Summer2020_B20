package day_36_ArrayList_Methods;

import java.util.ArrayList;

public class Find_the_Unique {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(4);

        ArrayList<Integer> unique = new ArrayList<>();

        for (int FirstLoop = 0; FirstLoop <= list.size() - 1; FirstLoop++) {
            Integer element = list.get(FirstLoop);
            int count = 0;
            for (Integer each : list) {
                if (each == element) {
                    count++;
                }
            }
            if (count == 1) {
                unique.add(element);
            }
        }

            System.out.println(unique);

    }
}
