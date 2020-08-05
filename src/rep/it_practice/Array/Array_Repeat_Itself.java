package rep.it_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_Repeat_Itself {
    public static void main(String[] args) {
        ArrayList<Boolean> arr = new ArrayList<>();
        arr.addAll(Arrays.asList(true, true, false));
         repeatAL(arr);

           int[] nums = new int[3];
           nums[1] = nums[1];
          // nums = populate(nums);
           System.out.println( Arrays.toString(nums));

    }

    public static  void repeatAL(ArrayList<Boolean> list){
       ArrayList<Boolean> newArr = new ArrayList<>();
        for (int i = 0; i <= list.size() -1; i++){
            newArr.add(list.get(i)) ;
        }
        for (int i = 0; i <= list.size() -1; i++){
            newArr.add(list.get(i)) ;
        }


        System.out.println(newArr);

    }


//        public static int[] populate(int[] r)
//        {
//            for(int i=0; i< r.length; i++){
//                for (int z = 0; z<= 2; z++){
//                  r[i] = r[z];
//                  z++;
//                }
//              //  System.out.println("current element is: " + r[i]);
//            }
//
//          return r;
//        }


    }
