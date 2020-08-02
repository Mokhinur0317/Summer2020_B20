package day_37Array_List;

import java.util.ArrayList;
import java.util.Arrays;

public class Interview_task {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Moki", "Ali", "Moki", "Dudka", "Sabin"));
        System.out.println(names); //   [Moki, ali, Moki, Dudka, sabin]

        names.removeAll(  Arrays.asList("Moki")  );
        System.out.println(names);     //    [ali, Dudka, sabin]


//        names.retainAll(  Arrays.asList("Moki")  );
//        System.out.println(names);     //    ["Moki", "Moki"]



    }
}
