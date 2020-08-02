package day_24_Array;

import java.util.Arrays;

public class String_methoods {
    public static void main(String[] args) {
        String str = "ABCDHGYTH";
        char [] ch = str.toCharArray();
        System.out.println(Arrays.toString( ch ) );
        System.out.println("=======================");

        String str1 = "DCEBA";
        String str2 = "ADCBE";

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean both = Arrays.equals(ch2 , ch1);
        System.out.println(both);


        System.out.println("=======================   Sliplit()  ========================= ");
        String sentence = "I love Programming Language ";
        //    Language ,Programming, Love ,
       String [] word =  sentence.split(" ");     //   {"I", "Love", "Programming", "Language"}
        System.out.println(Arrays.toString(word));

        for (int i = word.length -1; i >= 0; i--){
            System.out.print(word[i]+ " ");
        }

        System.out.println("=============================");
        String s = "Java";
        String [] arr =  s.split("");  // every single elements are string
        System.out.println(Arrays.toString(arr));

        char[] arr1 =s.toCharArray();    // every single element are char




    }
}
