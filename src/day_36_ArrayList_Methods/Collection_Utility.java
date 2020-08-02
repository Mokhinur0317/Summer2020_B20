package day_36_ArrayList_Methods;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Collection_Utility {
    /*
    Arrays : utility class for array
    Collection : utility for collection
     */


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(40);
        list.add(50);

        Collections.sort(list);
        System.out.println(list);

        System.out.println("Max number is : " + list.get(list.size()-1));
        System.out.println("Min number is  : "+ list.get(0));


//============================================================================


        ArrayList<String> strList = new ArrayList<>();
        strList.add("a");
        strList.add("b");
        strList.add("c");
        strList.add("d");

        System.out.println(strList);   //  [ a, b, c, d]

        Collections.swap(strList,1,2);
        System.out.println(strList);     //   a, c, b, d]

        Collections.swap(strList,0, strList.size() -1 );
        System.out.println(strList);      //    d, c, b, a]
        // we swap first elemnt with last element :


 //================================================================================

          // FREQUENCY OF  CHAR

      ArrayList<Character> charList = new ArrayList<>();
        charList.add('a');  //1
        charList.add('b');
        charList.add('a');  //2
        charList.add('b');
        charList.add('a');  //3

      int count =  Collections.frequency(charList,'a');
        System.out.println(count);   // frequency of a is 3

    }
}
