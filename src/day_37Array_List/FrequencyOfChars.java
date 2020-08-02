package day_37Array_List;

import Library.Util_1;

import java.util.ArrayList;
import java.util.Collections;

public class FrequencyOfChars {
    public static void main(String[] args) {
        String str = "aaabbc";

        ArrayList<String> list = new ArrayList<>();
        for (String each : str.split("")){
            list.add(each);
        }

        String  nonDup  = Util_1.Remove(str);   // a b c  we used for avoid  duplication
        for (String each :nonDup.split("")) {
            int count = Collections.frequency(list, each);
            System.out.print(each + count);

        }







    }
}
