package day_24_Array;
import  java.util.Arrays;
public class Array_Ulitility {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        System.out.println(arr);
        System.out.println(Arrays.toString(arr) );

        String s1 = Arrays.toString(arr);
        System.out.println(s1);


        System.out.println("======================================");


        String[] names = {"moki", "ali", "dots"};
        System.out.println(names);//
        System.out.println(Arrays.toString(names));

        System.out.println("                      Arrays.sort() _ Methood            ");

        int[] nums = {5 , 4, 6, 4, 3, 10};
        Arrays.sort(nums);   // [3 , 4, 4, 5, 5, 6, 10]
        System.out.println(Arrays.toString(nums));
        System.out.println("Max number: "+ nums[names.length-1]);
        System.out.println("Min number: "+ nums[0]);


        System.out.println("==================================");

        String[] student = {"Moki", "Ali" , "Dots,"};
        Arrays.sort(student);
        System.out.println(Arrays.toString(student));

        System.out.println("==================================");
        System.out.println("");
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};

        boolean r1 = Arrays.equals(arr1,arr2);  //  true
        System.out.println(r1);
        int[] arr3 = {2, 1, 3};
        boolean r2 = Arrays.equals(arr1,arr3);   // false
        System.out.println(r2);

        Arrays.sort(arr2);
        Arrays.sort(arr3);
        boolean r3 = Arrays.equals(arr2, arr3);
        System.out.println(r3);                 // true







    }
}
