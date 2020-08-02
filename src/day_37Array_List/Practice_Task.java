package day_37Array_List;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice_Task {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,8,9,5,5));

        for (int i = 0; i <= list.size() -1; i++){
            if (list.get(i) < 5){
                list.removeAll(Arrays.asList(i)); // it did removed the numbers
                // that smaller then 5
            }
        }

        System.out.println(list);


        // final summery is dont use remove methods inside loop becouse  it  doesnt give us accurat result







    }
}
