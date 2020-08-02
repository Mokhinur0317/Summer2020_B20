package day_22_Arrays;

public class Warm_Up3 {
    public static void main(String[] args) {
        String [] languages = new String[5];
        languages[0] = "Java";
        languages[1] = "Ruby";
        languages[2] = "C++";
        languages[3] = "Python";
        languages[4] = "JavaScript";

        for (int i = 0; i <= languages.length-1; i++){
          //  System.out.println(languages[i]);
            System.out.println();
            System.out.print(languages[i].substring(0,3));
        }
    }
}
