package rep.it_practice;

import java.util.Arrays;

public class Shortes_String_into_Array {
    public static void main(String[] args) {
        String str =" olive, fish, pursuit, warning, old, python, java, coffee, cat, ray";
        String[] newString = str.split(",");


        int shortWord = newString[0].length();
        String  newStr = "";
        for (String eachWord : newString) {
            String word_no_space = eachWord.replaceAll(" ", "");
            if (word_no_space.length() <= shortWord) {
                newStr += word_no_space;
                newStr += ",";
                shortWord = eachWord.length();
            }
        }

        String[] newArr =newStr.split(",");
        Arrays.sort(newArr);
        System.out.println(Arrays.toString(newArr));


        System.out.println("================   Next try =================================");


//[fish, java, part, volt]



    }
    }

