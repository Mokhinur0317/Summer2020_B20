package day_34_WrapperClass;

import java.util.Arrays;

public class break_task {
    public static Integer[] sort_Array(Integer[]arr){
        Arrays.sort(arr);
        Integer[] newArr = new Integer[arr.length];
        Integer index = 0;

       for (int i = arr.length -1 ; i >= 0; i--){
          newArr[index] = arr[i];
          index++;
       }
      return newArr;
    }
//=========================================================

    public static Double[] sort_Array(Double[]arr){
        Arrays.sort(arr);
        Double[] newArr = new Double[arr.length];
        int index = 0;

        for (int i = arr.length -1 ; i >= 0; i--){
            newArr[index] = arr[i];
            index++;
        }
        return newArr;
    }

 //======================================================

    public static Character[] sort_Array(Character[]arr){
        Arrays.sort(arr);
        Character[] newArr = new Character[arr.length];
        Integer index = 0;

        for (int i = arr.length -1 ; i >= 0; i--){
            newArr[index] = arr[i];
            index++;
        }
        return newArr;
    }

    public static void main(String[] args) {
        Character[] arr ={'b', 'd','a'};
        Character[] newArr = sort_Array(arr);
        System.out.println(Arrays.toString(newArr));
    }
}
