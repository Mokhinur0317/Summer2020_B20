package day_35_ArrayList;

import java.util.ArrayList;

public class List_des_Order {
    public static void main(String[] args) {


        ArrayList<Integer>number = new ArrayList<Integer>();
        number.add(1);       // autoBoxing
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);


       for (int i = number.size() -1; i >= 0; i--){
           System.out.print(number.get(i) + " ");
       }
// list length is list.size() -1 == dont forget moki


 //===============================================================


    }
}
