package rep.it_practice;

import java.util.Arrays;

public class Array_MakeLast {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int [] newArr = new int[nums.length * 2];
        newArr[newArr.length-1] = nums.length;
        System.out.println(Arrays.toString(newArr));


        int[] nums2 = {1};
        if(nums2.length == 1){
            System.out.println( Arrays.toString(nums2));
        } else {
            int index = 0;
            int[] newArr2 = new int[2];

            newArr2[0] = nums2[0];
            newArr2[1] = nums2[1];

            System.out.println(Arrays.toString(newArr2));
        }


    }

}
