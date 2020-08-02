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

        //======================================================

        //    Next Medhoods    RemoveAll

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll( Arrays.asList(1,2,3,4,5,6,1,2,3));  // original list
        // remove all 1,2,3,5,
        list.removeAll( Arrays.asList(1,2,3,5));   // remove all the 1,2,3,5
        System.out.println(list);  // output 4 ,6



        //========================================================

        //RetainAll methods

        ArrayList<Integer> newNumbers = new ArrayList<>();
        newNumbers.addAll( Arrays.asList(1,2,1,1,3,3,3,3,4,4,6,7,8,8,8));
        System.out.println(newNumbers);
        // output is  [1, 2, 1, 1, 3, 3, 3, 3, 4, 4, 6, 7, 8, 8, 8]

        // task  only keep the elements that either  1,or 2 ,or 3,
        newNumbers.retainAll( Arrays.asList( 1,2,3));
        System.out.println(newNumbers);
        // output looks like this [1, 2, 1, 1, 3, 3, 3, 3]


        //============================================================













    }
}
