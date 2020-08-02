package Library;

import java.util.Arrays;

public class Util_1 {
    //                              STRING METHODS

    public static String Remove(String str) {


        String nonDublicate = "";
        for (int i = 0; i <= str.length() - 1; i++) {
            String s = "" + str.charAt(i); // a, a, b, b
            if (!nonDublicate.contains(s)) {     // if the character is already contained in result, we will no
                nonDublicate += s;
            }
        }
        //  System.out.println(nonDublicate);
        return nonDublicate;
    }
//========================================================================

    public static String reverse_string(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        // System.out.println(result);
        return result;
    }

//================================================================================

    public static int frequency(String str, char ch) {
        int count = 0;
        for (char each : str.toCharArray()) {
            if (each == ch) {
                count++;
            }
        }
        return count;
    }

    //=============================================================================

    public static String uniques(String str) {
        String unique_2 = "";
        for (char each : str.toCharArray()) {
            int count = frequency(str, each);
            if (count == 1) {
                unique_2 += each;
            }
        }
        return unique_2;

    }

//===================================================================================

    public static String frequency_of_eachChar(String str) {

        String ExpectedResult = "";

        String nonDup = Util_1.Remove(str);

        for (char each : nonDup.toCharArray()) {
            int count = Util_1.frequency(str, each);   //3
            ExpectedResult += "" + each + count;//    a3


        }

        return ExpectedResult;
    }

//========================================================================


    public static String Regular_Format(String str, String str2) {

        str = str.toUpperCase();
        str2 = str2.toUpperCase();

        char First = str.charAt(0);
        String rest = str.substring(1).toLowerCase();
        String full = "" + First + rest;


        char Second = str2.charAt(0);
        String rest2 = str2.substring(1).toLowerCase();
        String full2 = "" + Second + rest2;
        return full + " " + full2;

    }


//=========================================================================


//===============================================================================
    //     FOR ARRAY METHODS


    public static int maxNum(int[] arr) {
        int max = arr[0];

        for (int each : arr) {
            if (each > max) {
                max = each;
            }
        }

        return max;
    }

    public static double maxNum(double[] arr) {
       double max = arr[0];

        for (double each : arr) {
            if (each > max) {
                max = each;
            }
        }

        return max;
    }

    public static Integer maxNum(Integer[] arr) {
        Integer max = arr[0];

        for (Integer each : arr) {
            if (each > max) {
                max = each;
            }
        }

        return max;
    }

    public static Double maxNum(Double[] arr) {
        Double max = arr[0];

        for (Double each : arr) {
            if (each > max) {
                max = each;
            }
        }

        return max;
    }





    //=========================================================================


    public static Integer minNum(Integer[] arr) {
        int min = arr[0];

        for (int each : arr) {
            if (each < min) {
                min = each;
            }
        }

        return min;
    }

    public static int minNum(int[] arr) {
       Integer min = arr[0];

        for (Integer each : arr) {
            if (each < min) {
                min = each;
            }
        }

        return min;
    }

    public static double minNum(double[] arr) {
        double min = arr[0];

        for (double each : arr) {
            if (each < min) {
                min = each;
            }
        }

        return min;
    }

    public static Double minNum(Double[] arr) {
       Double min = arr[0];

        for (Double each : arr) {
            if (each < min) {
                min = each;
            }
        }

        return min;
    }

    //========================================================================


    public static int[] combine2Arrays(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];

        int i = 0;
        for (int each : arr1) {
            arr3[i] = each;
            i++;
        }

        for (int each : arr2) {
            arr3[i] = each;
            i++;
        }

        return arr3;
    }

    //==============================================================================

    //    insert the   element  to the end of the array
    public static int[] Add_numberTo_Array(int[] arr, int number) {
        int[] newArr = new int[arr.length + 1];
        newArr[newArr.length - 1] = number;
        //  System.out.println(Arrays.toString(newArr));
        int index = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            newArr[index] = arr[i];
            index++;
        }
        return newArr;
    }

//===========================================================================

    public static double[] sortDesc(double[] arr){
        Arrays.sort(arr);

        double[] arr2 = new double[arr.length];

        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++  ){
            arr2[i]  =  arr[k];
            k--;
        }

        return arr2;

    }

//===========================================================================

    public static char[] sortDesc(char[] arr){
        Arrays.sort(arr);

        char[] arr2 = new char[arr.length];

        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++  ){
            arr2[i]  =  arr[k];
            k--;
        }

        return arr2;

    }

//===========================================================================

    public static String[] sortDesc(String[] arr){
        Arrays.sort(arr);

        String[] arr2 = new String[arr.length];

        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++  ){
            arr2[i]  =  arr[k];
            k--;
        }

        return arr2;

    }
    // sorts String array in descending order and returns it

//=========================================================================

    public static int[]  sortDesc(int[] arr){
        Arrays.sort(arr);

        int[] arr2 = new int[arr.length];  //{5,4,3,2,1};

        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++  ){
            arr2[i]  =  arr[k];
            k--;
        }

        return arr2;
    }
    // sorts int array in descending order and returns it


//===========================================================================

    public static Integer[] sortDesc(Integer[] arr){
        Arrays.sort(arr);

       Integer[] arr2 = new Integer[arr.length];

        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++  ){
            arr2[i]  =  arr[k];
            k--;
        }

        return arr2;

    }

    public static Double[] sortDesc(Double[] arr){
        Arrays.sort(arr);

        Double[] arr2 = new Double[arr.length];

        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++  ){
            arr2[i]  =  arr[k];
            k--;
        }

        return arr2;

    }

    public static Character[] sortDesc(Character[] arr){
        Arrays.sort(arr);

        Character[] arr2 = new Character[arr.length];

        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++  ){
            arr2[i]  =  arr[k];
            k--;
        }

        return arr2;

    }

    //======================================================================

    public static String[] combine2Arrays(String[] arr1, String[] arr2) {
       String[] arr3 = new String[arr1.length + arr2.length];

        int i = 0;
        for (String each : arr1) {
            arr3[i] = each;
            i++;
        }

        for (String each : arr2) {
            arr3[i] = each;
            i++;
        }

        return arr3;
    }

    public static Integer[] combine2Arrays(Integer[] arr1, Integer[] arr2) {
        Integer[] arr3 = new Integer[arr1.length + arr2.length];

        int i = 0;
        for (int each : arr1) {
            arr3[i] = each;
            i++;
        }

        for (int each : arr2) {
            arr3[i] = each;
            i++;
        }

        return arr3;
    }

    public static Character[] combine2Arrays(Character[] arr1,Character[] arr2) {
       Character[] arr3 = new Character[arr1.length + arr2.length];

        int i = 0;
        for (Character each : arr1) {
            arr3[i] = each;
            i++;
        }

        for (Character each : arr2) {
            arr3[i] = each;
            i++;
        }

        return arr3;
    }

    public static Double[] combine2Arrays(Double[] arr1, Double[] arr2) {
       Double[] arr3 = new Double[arr1.length + arr2.length];

        int i = 0;
        for (Double each : arr1) {
            arr3[i] = each;
            i++;
        }

        for (Double each : arr2) {
            arr3[i] = each;
            i++;
        }

        return arr3;
    }
}