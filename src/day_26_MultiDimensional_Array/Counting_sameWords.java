package day_26_MultiDimensional_Array;
import java.util.Arrays;
public class Counting_sameWords {
    public static void main(String[] args) {
        String str = "Im learning Java , and i think python is much easier java java";
        String[] arr =  str.split(" ");
        System.out.println(Arrays.toString(arr));
        int countJava = 0;
        int countPython = 0;
        for (String eachElement : arr){
            if(eachElement.toLowerCase().contains("java")){
                countJava ++;
            }else if (eachElement.toLowerCase().contains("python")){
                countPython ++;
            }
        }

        System.out.println("Number of java: " + countJava);
        System.out.println("Number of python: " + countPython);

    }
}
