package day_37Array_List;

import java.util.ArrayList;
import java.util.Arrays;

public class Add_AllMethods {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);


        System.out.println();
        ArrayList<Integer> newList = new ArrayList<>();

        Integer[] arr = {20,30,40,50,60};
        newList.addAll (  Arrays.asList(arr)  );
        System.out.println(newList);









    }
}
