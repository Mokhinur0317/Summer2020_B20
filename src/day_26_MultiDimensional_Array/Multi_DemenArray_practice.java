package day_26_MultiDimensional_Array;

import java.util.Arrays;

public class Multi_DemenArray_practice {
    public static void main(String[] args) {
        String[] testers = {"Moki" , "David"};
        String[] devOps = {"Ali", "Adrial"};
        String[]  SM = {"Alin"};
        String[]  PO = {"Clay"};

        String[][] ScrumTeam = {testers,  devOps ,  SM,   PO};
        //                        0         1        2     3

      //  if i wanna change Alian to Adam;
        ScrumTeam[2][0] = "Adam";

        // if i wanna change whole testers to someone else
        // here i have new team
        String [] tasters2 = {"Dots", "Micel"};
         ScrumTeam[0] = tasters2;

        System.out.println(Arrays.deepToString(ScrumTeam));   // this new Array methood


        for (String[] EachArray : ScrumTeam){
            for (String eachElement : EachArray ){
                System.out.println(eachElement);      // thats how to print each element (which is names )
            }
            System.out.println( Arrays.toString(EachArray));    //   thats how to print each array from ScrumTeam

        }


        System.out.println("===========================   next task ===========================");


          // in this case     14 and    13 should not print
        int[][] scores = {{14, 20, 30, 40,}, {60, 55, 75, 105} , {93, 48, 125,135 , 13}};
        // print out numbers that are divisibly by 3 or 5

        for(int[] eachArray : scores){
            for (int eachElemenet: eachArray ){
                if (eachElemenet % 3 == 0 || eachElemenet % 5 ==0){
                    System.out.print( eachElemenet + " , ");
                }
            }
        }









    }
}
