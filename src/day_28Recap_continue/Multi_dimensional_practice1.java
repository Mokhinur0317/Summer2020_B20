package day_28Recap_continue;

import java.util.Arrays;

public class Multi_dimensional_practice1 {
    public static void main(String[] args) {

        String[] group1 = {"moki", "ali"};
        String[] group2 = {"Alian", "David"};
        String[] group3 = {"Ismail", "Dudka"};

        String[][] Cybertek  =  { group1,   group2,   group3 };

        for (int i = 0; i <= Cybertek.length -1 ; i++){
            String[] eachGroup = Cybertek[i];
           // System.out.println( Arrays.toString(eachGroup) );

            for (int j = 0; j <= eachGroup.length -1 ; j++ ){
             String   eachName  = eachGroup[j];
             if(eachName.toLowerCase().contains("m")) {
                 System.out.print(eachName + " , ");
                }
            }
            System.out.println();
        }

    }
}
