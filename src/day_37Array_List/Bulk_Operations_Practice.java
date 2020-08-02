package day_37Array_List;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_Operations_Practice {
    public static void main(String[] args) {

        ArrayList<String> listOfNames = new ArrayList<>();
        listOfNames.add("moki");
        listOfNames.add("dudka");
        listOfNames.add("ali");
        listOfNames.add("dots");

        // verify that the names dudka, moki, contained  in ListOfNames ;

        boolean Contained_ =  listOfNames.containsAll( Arrays.asList("moki", "dudka"));
        System.out.println(Contained_);     // if i give the name which is not in list
        // it will return us false

//==============================================================================

        ArrayList<String> group1 = new ArrayList<>();
        // add all the names from ur group
        String[] arr = {"Ali","Alian","Jeyson","Clay"};
        group1.addAll(  Arrays.asList(arr)  );
        System.out.println(group1);

        // verify one of the name that contained in the list
        boolean Contained_Names  =  group1.containsAll( Arrays.asList("Ali", "Clay") );
        System.out.println(Contained_Names);  // true

//==============================================================================

        ArrayList<String> newList = new ArrayList<>();
        newList.addAll( Arrays.asList("Moki", "Dudka ", "Sabin", "Marsel"));
        System.out.println(newList);

        boolean check = newList.containsAll(Arrays.asList("Moki", "Sabin"));
        System.out.println(check);  // true becouse moki, sabin  are in the list

        boolean check2 = newList.containsAll(Arrays.asList("Xana", "Sabin"));
        System.out.println(check2);  // false becouse xana is not in the list even Sabin is in the list well get false



    }
}
