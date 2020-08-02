package rep.it_practice;

import java.util.Arrays;

public class Count_Java_python {
    public static void main(String[] args) {
        String sentence = " What's the difference between java, javascript and python?";
        String[] words = sentence.split(" ");
      //  System.out.print(Arrays.toString(words));
        int java = 0;

        for (String eachElement : words){
            if( eachElement.contains("java")){
                java++;
            }
        }
        System.out.println(java);

    }
}
