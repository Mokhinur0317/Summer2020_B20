package day_28Recap_continue;

public class Count_word_fromArray {
    public static void main(String[] args) {
        String[] languages = {"java" , "python" , "java", "Java"};
        int count = 0;
        for (String eachElement : languages){
            eachElement = eachElement.toLowerCase();
            if (eachElement.equals("java")){                       //    ( ! eachElement.equals("java" ){  continue;   }
                count++;                                           // count++;
            }
        }

        System.out.println("frequency of java : " + count);
    }
}
