package day_24_Array;

public class Unique_words2 {
    public static void main(String[] args) {
        String[] words = {"C#","C#", "Java", "C#" , "C++"};
        for (String each : words) {

          //  String firstStep = words[0];
            int count = 0;

            for (String languages : words) { // b represents each elements in the array
                if (each.equals(languages)) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println(each);
            }
        }


        System.out.println("=================================");


    }


    public static void printUniqueWords(String[] words){

        for (String each : words) {

            //  String firstStep = words[0];
            int count = 0;

            for (String languages : words) { // b represents each elements in the array
                if (each.equals(languages)) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println(each);
            }
        }

    }
}
