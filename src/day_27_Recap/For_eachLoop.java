package day_27_Recap;

import org.w3c.dom.ls.LSOutput;

public class For_eachLoop {
    public static void main(String[] args) {
        /*
        for each loop  : you must a  have data structure !
             declare_
                        for (dataType  [] name  : collection of data)     // name representance each element from array
         */
           int [] arr = {1, 2, 3, 4, 5,};
        for (int i = 0; i <= arr.length -1; i++){
            System.out.print(arr[i] + " ,");
        }
        System.out.println();
        System.out.println("============ need to get same resolt ==========================");

        for (int eachNumber : arr){
            System.out.print(eachNumber+" ,");
        }



        System.out.println();
        System.out.println("===========================   reverse order =====================");


        for (int i = arr.length -1; i >= 0; i--){
            System.out.print(arr[i] + " ,");
        }


        System.out.println();
        System.out.println("===========================   new task =============================");

        int [] num = {10, 20 , 30 , 40, 50};
        int countdivisibly = 0;
        for (int eachNum : num){
            if ( eachNum % 3 != 0  ){
                continue;
            }
            countdivisibly++;
            System.out.print (eachNum + " ");

        }

        System.out.println();
        System.out.println("==========================    String =======================");

        String [] name  = {"moki", "ali" , "dot"};
             for ( String eachElement : name){
                 if ( eachElement.contains("m")){
                     continue;
                 }
                 System.out.println(eachElement+ " ,");    // ali and dots
             }


        System.out.println();
        System.out.println("==============+===============   more task =======================");
        int [] score = {80, 74 , 65 , 45, 90};
        int max = score[0];
        int min = score[0];
        for (int eachScore : score){
            if (eachScore > max){
                max = eachScore;
            }

            if (eachScore < max){
                min = eachScore;
            }
        }
        System.out.println("Max num : " + max);
        System.out.println("Minimum num :" + min);


    }
}
