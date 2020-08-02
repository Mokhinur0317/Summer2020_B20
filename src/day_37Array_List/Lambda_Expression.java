package day_37Array_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Lambda_Expression {
    public static void main(String[] args) {
        ArrayList<Integer> listOfNums = new ArrayList<>();
        listOfNums.addAll(Arrays.asList(1,1,2,3,4,4,5,6,7,8,9));

        Predicate<Integer> lessThan5 = p -> p < 5;
        listOfNums.removeIf(lessThan5);
        System.out.println(listOfNums); // [5, 6, 7, 8, 9]


 //    ==================================================================

 // create predicate that can print only returns odd numbers
         Predicate<Integer> oddNumbers = p -> p % 2 == 0;
         listOfNums.removeIf(oddNumbers);
         System.out.println(listOfNums);   // [5, 7, 9]

  // ======================================================================

  // create predicate that can only even numbers ;

     Predicate<Integer> evenNumbers = p -> p % 2 != 0;
     ArrayList<Integer> list = new ArrayList<>();
     for (int i = 0; i <= 100; i++){
         list.add(i);
     }
     list.removeIf(evenNumbers);
     System.out.println(list);

     //====================================

        Predicate<Integer> oddNumbers2 = p -> p % 2 == 0;
        list.removeIf(oddNumbers);
        System.out.println(list);   // now my array list would be empty











    }
}
