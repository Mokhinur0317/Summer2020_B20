package day_22_Arrays;

public class Interview_task {
    public static void main(String[] args) {

        String str  = "ABAB";   //A2B2   should be the output
        String nonDublicate ="";              // AB
        String result = "";     // "A2B2";

        for(int i = 0; i <= str.length()-1; i++){
          String  eachChar = "" + str.charAt(i);   // A, B , A , B
            if ( ! nonDublicate.contains(eachChar)) {
                nonDublicate += eachChar;
            }
        }

        System.out.println(nonDublicate);

        // str = "ABAB"    nondup = AB

        char ch = nonDublicate.charAt(0);  // A
            int count = 0;
            for(int i = 0; i <= str.length()-1; i++){
                if(str.charAt(i) == ch ) {
                    count += 1;
                }
                result += "" + ch + count;
            }

        //    result += "" + ch + count;


        System.out.println(result);

    }
}
