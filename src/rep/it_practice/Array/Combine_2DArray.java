package rep.it_practice;

import java.util.Arrays;
import java.util.Collections;

public class Combine_2DArray {
    public static void main(String[] args) {
//        int[] arr = {1,2,3};
//        int[] arr2 = {4,5,6};
//        int[] newArr = mergR(arr,arr2);
//        System.out.println(Arrays.toString(newArr));
//
//        String[] r1 = {"m", "k","v"};
//        String[] r2 = {"v","s"};
//        String combineAll = combineRs(r1 , r2);
//        System.out.println(combineAll);

        int[] nums = {1,2, 5, 6, 7, 8, 9, 3,4};
        int [] newNums = do_switch(nums);
        System.out.println( Arrays.toString(newNums));
    }


    public static int[] mergR(int[] a,int[] b) {
        int[] newArr = new int[a.length + b.length];
        int index = 0;
        for (int i = 0; i <= a.length -1; i++){
            newArr[index]  = a[i];
            index++;
        }
        for (int z = 0; z <= b.length -1; z++){
            newArr[index] = b[z];
            index++;
        }
        return newArr;


    }//end mergR

//=============================================================================================================
    public static String combineRs(String[] r1,String[] r2)
    {
     String combineAll ="";
     for (String each : r1){
         combineAll += each;
     }
     for (String each :r2){
         combineAll += each;
     }


      return combineAll;
    }

//============================================================================================================
    public static int[] do_switch(int[] i)
    {

        int first_element = i[0];
        int last_element = i[i.length - 1];
        i[0] = last_element;
        i[i.length -1] = first_element;
        return i;





//        for (int z = 0 ; z <= i.length - 1; z++){
//            if (index == 0) {
//                newArr[index] = last_element;
//            } else if (index == i.length - 1) {
//                newArr[index] = first_element;
//            } else {
//                newArr[index] = i[z];
//            }
//            index++;
//        }

    }






}
