package day_36_ArrayList_Methods;

import java.util.ArrayList;

public class Warm_Up_Recap {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);   // index 0
        list.add(2);  // index 1
        list.add(3);   // index 2
        list.add(4);  // index 3
        list.add(5); // index 4
//    here i changed index 4 which is element 5 to 0;
        list.set(4,0);
        System.out.println(list);
//            output   [1, 2, 3, 4, 0]
//============================================================
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);   // index 0
        list2.add(2);  // index 1
        list2.add(3);   // index 2
        list2.add(4);  // index 3
        list2.add(5); // index 4

// original list : 1,2,3,4,5;

        for (int i = 0; i <=list.size() -1; i++){
         int each =  list2.get(i);  // unboxing
          if (each % 2 != 0){
              list2.set(i,each*2);    // 2,2,6,4,10;
          } else {
              list2.set(i,each*3);   // 2,6,6,12,10;
          }
        }

         System.out.println(list2);

 //===============================================================

    }
}
