package day_25_Practices;

public class Shortest_String {
    public static void main(String[] args) {
        String[] languages = {"java", "C++" , "python", "javascript"};
        int minLength = languages[0].length();
        for (int i =0; i <= languages.length -1 ; i++){       // to fimd out the minimum length of string
            int eachElements = languages[i].length();               //  element 0 ; 4
                                                         // element 1 ; 3      // element 2 : 6       // element 3 : 10
           if (eachElements < minLength){
               minLength = eachElements;

           }

        }

           System.out.println(minLength);

        for (int i = 0; i <= languages.length -1; i++){
            if (languages[i].length() == minLength){
                System.out.println(languages[i]);
            }
        }

    }
}
