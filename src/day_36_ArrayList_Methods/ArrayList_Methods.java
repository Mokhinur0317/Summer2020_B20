package day_36_ArrayList_Methods;

import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);   // index 0
        list.add(2);   // index 1
        list.add(3);   // index 2
        list.add(4);   // index 3
        list.add(5);   // index 4
        list.add(6);   // index 5

     int index = list.indexOf(4);   // index number  3
     // it gives we index number
        System.out.println(index);


     boolean result = list.contains(6);
        System.out.println(result);    // true   it checks if number is in the list or not


 //===============================================================================

         ArrayList<String> StrList = new ArrayList<>();
         StrList.add("Cybertek");

        ArrayList<String> StrList2 = new ArrayList<>();
        StrList2.add("Cybertek");

        System.out.println(StrList);
        System.out.println(StrList2);

         // checking the equality of two list
        System.out.println(StrList.equals(StrList2));   // true



//================================================================================


        ArrayList<Integer> arrList = new ArrayList<>();
        // now its empty list
        System.out.println(arrList.isEmpty());
        // it gives me true cause list is empty


        // if i add element to the list
           arrList.add(0);
         // now if i check its empty or not
        System.out.println(arrList.isEmpty());
        // it gives me false cause i added 0 to the list;





    }
}
