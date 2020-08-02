package day_35_ArrayList;

import java.beans.beancontext.BeanContext;
import java.util.ArrayList;

public class Late_warmUp {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        list.set(4,0);
        System.out.println(list);

//=======================================================
        ArrayList<Integer> list_2 = new ArrayList<>();
        list_2.add(1);
        list_2.add(2);
        list_2.add(3);
        list_2.add(4);
        list_2.add(5);
        System.out.println(list_2);

        for(Integer each : list_2){

            if(each  % 2 != 0){
                int each_multiplied = each * 2;
                int index_of_item = list_2.indexOf(each);
                list_2.set(index_of_item, each_multiplied);

            }
        }
        System.out.println();
        System.out.println(list_2);


// =======================================================

        ArrayList<Integer> list_ofNumbers = new ArrayList<>();
        list_ofNumbers.add(1);
        list_ofNumbers.add(1);
        list_ofNumbers.add(2);
        list_ofNumbers.add(3);
        list_ofNumbers.add(5);
        list_ofNumbers.add(4);
        list_ofNumbers.add(1);
        System.out.println(list_ofNumbers);

        ArrayList<Integer> unique_numbers_list = new ArrayList<>();

        for ( int each : list_ofNumbers){
            int count = 0;
            for (int eachNum : list_ofNumbers){
                if (each == eachNum){
                    count++;
                }
            }
         if (count == 1){
             unique_numbers_list.add(each);
         }

        }
        System.out.println(unique_numbers_list);
    }
}
