package Library_Void_Methods;

import java.util.Arrays;

public class Desending_order_ArreyInt {

    public static void  Descending(int [] arr){
        Arrays.sort(arr);
        for (int i = arr.length -1; i >=0;  i--){
            int eachNumber = arr[i];
            System.out.print(eachNumber + " , ");
        }

    }

    public static void main(String[] args) {
        int[] num = {1, 2, 3};
        Descending(num);
    }

}
