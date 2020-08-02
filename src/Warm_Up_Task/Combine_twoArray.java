package Warm_Up_Task;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Combine_twoArray {
    public static int[]  combine_intArray (int[] arr , int[] arr2){
        int[] arr3 = new int[arr.length + arr2.length];

        int i = 0;
        for(int each  :  arr){
            arr3[i] = each;
            i++;
        }

        for(int each : arr2){
            arr3[i]= each;
            i++;
        }

    return arr3;
    }

    public  static double[] combine_doubleArray(double[] arr, double[]arr2){
        double[] newArr = new double[arr.length + arr2.length];
        int  index = 0;

        for (double eachNumber : arr){
            newArr[index] = eachNumber;
            index++;
        }

        for (double eachNumber : arr2){
            newArr[index] = eachNumber;
            index++;
        }

       return newArr;
    }


    public  static String[]  combine_StringArray(String[] arr , String[]arr2){
        String[] newString_arr = new String[arr.length + arr2.length];
        int index = 0;

        for (String EachElement : arr){
            newString_arr[index] = EachElement;
            index++;
        }

        for (String EachElement : arr2){
            newString_arr[index] = EachElement;
            index++;
        }

        return newString_arr;
    }

    public static char[] combine_charArray(char[] arr , char[] arr2){

        char[] newChar_arr = new char[arr.length + arr2.length];
        int index = 0;

        for (char EachElement : arr){
            newChar_arr[index] = EachElement;
            index++;
        }

        for (char EachElement : arr2){
            newChar_arr[index] = EachElement;
            index++;
        }

       return newChar_arr;
    }

 //==========================================================================================================================

    public static void combine_Array(int[]arr, int[]arr2){
        int[] arr3 = new int[arr.length + arr2.length];

        int i = 0;
        for(int each  :  arr){
            arr3[i] = each;
            i++;
        }

        for(int each : arr2){
            arr3[i]= each;
            i++;
        }

        System.out.println(Arrays.toString(arr3));
    }

    public static void combine_Array(double[]arr, double[]arr2){
            double[] newArr = new double[arr.length + arr2.length];
            int  index = 0;

            for (double eachNumber : arr){
                newArr[index] = eachNumber;
                index++;
            }

            for (double eachNumber : arr2){
                newArr[index] = eachNumber;
                index++;
            }

            System.out.println(Arrays.toString(newArr));
        }


    public static void combine_Array(String[]arr, String[]arr2){
            String[] newString_arr = new String[arr.length + arr2.length];
            int index = 0;

            for (String EachElement : arr){
                newString_arr[index] = EachElement;
                index++;
            }

            for (String EachElement : arr2){
                newString_arr[index] = EachElement;
                index++;
            }

        System.out.println(Arrays.toString(newString_arr));
        }



    public static void combine_Array(char[]arr, char[]arr2){

        char[] newChar_arr = new char[arr.length + arr2.length];
        int index = 0;

        for (char EachElement : arr){
            newChar_arr[index] = EachElement;
            index++;
        }

        for (char EachElement : arr2){
            newChar_arr[index] = EachElement;
            index++;
        }

        System.out.println(Arrays.toString(newChar_arr));
    }




}



