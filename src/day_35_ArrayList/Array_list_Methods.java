package day_35_ArrayList;

import java.util.ArrayList;

public class Array_list_Methods {
    public static void main(String[] args) {
        /*
        set(index , new element) : replaces the old element at the given index




         */

        ArrayList<String> list  = new ArrayList<>();
            list.add("moki");
            list.add("dots");
            list.add("dudka");

        // so in this arraylist i have 3 names
        System.out.println(list);

        // if i wanna change some of the names i neeed to use for example
        //          moki change to ali:

        list.set(0,"ali");
        System.out.println(list);

        // first we need to give index number then element u wanna change
        // basically it would update the element ;

        //===================================================================
                //              CLEAR() METHODS

        list.clear();
        System.out.println(list);
        // this methods clears the whole list if  i use clear my list will be empthy


        //======================================================================
                  //               REMOVE() METHODS

         ArrayList<Integer> list2 = new ArrayList<>();
         list2.add(1);   // index number 0
         list2.add(2);    //   index number 1
         list2.add(3);  // index number 2
         list2.add(4);    // index number 3

        // if i wanna remove number 3 from the list i need to call remove methods
        list2.remove(2);   // i need to give index number
        //   after size of list   would  be   2;

        // if we had 4 index  of Arraylist after removing one  index number would 3
          // if u try index 4 it gives compile error;

//=============================================================================


        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);   // index number 0
        list3.add(2);    //   index number 1
        list3.add(3);  // index number 2
        list3.add(4);    // index number 3
        //            [1, 2, 3, 4]

        Integer a = 1;
        list3.remove(a);
        System.out.println(list3);
        // in this case it would remove not index but number   [2, 3, 4]

        int b = 2;
        list3.remove(b);
        System.out.println(list3);
        // in this case it would remove not number but index     [2, 3]
        // index 2 == number 4

// this remove methods work in the same  with Strings , Characters , Double as Integer;
     //   for String we can use remove ("name") instead of  index number;


    // boolean b = list.remove(" " )   element does  not match with element in the list it gives us false
        // this we dont really use in the future ;
    }
}
