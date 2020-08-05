package rep.it_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_List_RemoveAll {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<>();
        arrList.addAll( Arrays.asList("hi","hey","hi","yo"));
        String str = "hi";
        removeAll(arrList,str);

    }






 public static void  removeAll (ArrayList<String> wordList ,  String targetWord){
        wordList.removeAll(Arrays.asList(targetWord));
        System.out.println(wordList);
 }

}
