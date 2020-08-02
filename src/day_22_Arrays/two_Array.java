package day_22_Arrays;
import  java.util.Arrays;
public class two_Array {
    public static void main(String[] args) {


      int[] arr1 = { 1,2,3,4};
      int[] arr2 = {5,6,7,8};
      int both = arr1.length + arr2.length;
      int [] newList  = new int[both];
      int  count=0;

     for (int i = 0; i < arr1.length; i++){
           newList[i] = arr1[i];
           count++;
     }

     for (int j = 0; j < arr2.length; j++ ){
         newList[count++] = arr2[j];
     }
               int max = 0;
     for (int i = 0; i < newList.length;i++){
         if (newList[i] > max )
             max = newList[i];
         System.out.print(newList[i] +" , ");
     }

        System.out.println("max number is : " + max);

    }
}
