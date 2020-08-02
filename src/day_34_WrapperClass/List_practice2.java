package day_34_WrapperClass;

import java.util.ArrayList;

public class List_practice2 {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        list.add(90);
        list.add(20);
        list.add(99);
        list.add(10);


        for (int EachNum : list){
            if(EachNum > max){
                max = EachNum;
            }

            if (EachNum < min){
                min = EachNum;
            }
        }

        System.out.println("max is " + max);
        System.out.println("min is " + min);
    }
}
