package Library_Void_Methods;

import javax.naming.PartialResultException;

public class Given_number_Negative_Positive {

    public static void  Positive_Negative(int num){
        if (num == 0){
            System.out.println("Its zero");
        }else if (num >= 1){
            System.out.println("positive");
        }else {
            System.out.println("negative");
        }
    }

    public static void main(String[] args) {
         Positive_Negative(-1);

         int[]num = {1,2,3};
         Positive_Negative_Arrays(num);
    }





   //=================================================

    public static void Positive_Negative_Arrays(int[] arr){
        for (int eachNum : arr){
            if (eachNum == 0){
                System.out.println("zero");
            }else if (eachNum >=1 ){
                System.out.println("positive");
            }else {
                System.out.println("negative");
            }
        }
    }
}
