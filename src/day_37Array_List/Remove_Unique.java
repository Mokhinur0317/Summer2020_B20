package day_37Array_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Remove_Unique {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList( 1,2,3,4,4,5,5,6,6));

        nums.removeIf(p -> Collections.frequency(nums, p ) == 1);
        System.out.println(nums);

  //========================================================================

        ArrayList<String> names = new ArrayList<>();
        names.addAll( Arrays.asList("Moki", "Dudka", "Ali" , "Anna", "Bob", "David"));
        names.removeIf(p -> p.toLowerCase().charAt(0) != p.charAt(p.length() -1));
        // image p is the string and u are getting first and last char from it
        System.out.println(names);
        // output :  [Anna, Bob, David]  we keep the names that stars and ends with same letter


  //==========================================================================

             ArrayList<Integer> grades = new ArrayList<>();
             grades.addAll( Arrays.asList(100,90,80,70, 55,85,35,66,69, 71, 81 , 31,21));

             ArrayList<Integer> gradesOfA = new ArrayList<>();  // 90 -100
             gradesOfA.addAll(grades);
             gradesOfA.removeIf(numbers -> numbers <= 89 || numbers >= 101 );
             System.out.println(gradesOfA);
             System.out.println("Grade of A: "+gradesOfA.size());



             ArrayList<Integer> gradesOfB = new ArrayList<>();  // 80 - 89
             gradesOfB.addAll(grades);
             gradesOfB.removeIf(numbers -> numbers <= 79 || numbers >= 90 );
             System.out.println(gradesOfB);
             System.out.println("Grade of B: "+gradesOfB.size());



            ArrayList<Integer> gradesOfC = new ArrayList<>();  // 70 - 79
            gradesOfC.addAll(grades);
            gradesOfC.removeIf(numbers -> numbers <= 69 || numbers >= 80 );
            System.out.println(gradesOfC);
            System.out.println("Grade of C: "+gradesOfC.size());



            ArrayList<Integer> gradesOfD = new ArrayList<>();  // 60 - 69
            gradesOfD.addAll(grades);
            gradesOfD.removeIf(numbers -> numbers <= 59 || numbers >= 70 );
            System.out.println(gradesOfD);
            System.out.println("Grade of D: "+gradesOfD.size());


            ArrayList<Integer> gradesOfF = new ArrayList<>();  // below 60
            gradesOfF.addAll(grades);
            gradesOfF.removeIf(numbers -> numbers >= 59  );
            System.out.println(gradesOfF);
            System.out.println("Grade of F: "+gradesOfF.size());

            /*
            how many student made :
                A?
                B?
                C?
                D?
             How many failed ?
             */

















    }
}
