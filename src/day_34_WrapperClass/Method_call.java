package day_34_WrapperClass;
import Library.Util_1;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Method_call {
    public static void main(String[] args) {


        Integer[] arr1 = {1, 2, 3, 4};
        Integer[] arr2 = {5, 6, 7};
        Integer[] newArr = Util_1.combine2Arrays(arr1, arr2);

        System.out.println(Arrays.toString(newArr));

        Integer max = Util_1.maxNum(newArr);
        System.out.println(max);

        int min = Util_1.minNum(newArr);   // unboxing
        System.out.println(min);
    }
}
