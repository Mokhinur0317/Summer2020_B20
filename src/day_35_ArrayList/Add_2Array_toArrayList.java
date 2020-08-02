package day_35_ArrayList;

import java.util.ArrayList;

public class Add_2Array_toArrayList {
    public static void main(String[] args) {
        String[] arr = {"moki" , "dots"};
        String[] arr2 = {"dudka"};

        ArrayList<String> name = new ArrayList<>();

        for (String each : arr){
            name.add(each);
        }
        for (String each : arr2){
            name.add(each);
        }

        System.out.println(name);
    }
}
