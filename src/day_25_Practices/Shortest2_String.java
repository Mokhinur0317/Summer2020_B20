package day_25_Practices;

public class Shortest2_String {
    public static void main(String[] args) {
        String[] languages = {"java", "C++" , "python", "javascript"};
        int minLength = languages[0].length();
        int maxLength = languages[0].length();

        for (String each : languages){                   // to fimd out the minimum length of string
            int eachElements =each.length();               //  element 0 ; 4      // element 1 ; 3      // element 2 : 6  // element 3 : 10
            if (eachElements < minLength){
                minLength = eachElements;

            }
        }
        System.out.println(minLength);


        for (String each : languages){
            if (each.length() == minLength){
                System.out.println(each);
            }
        }

    }
}


