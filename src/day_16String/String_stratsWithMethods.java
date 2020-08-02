package day_16String;

public class String_stratsWithMethods {
    public static void main(String[] args) {

        // stratsWith():
        String s1 = "Muhtar";
        System.out.println(  s1.startsWith("M") ); // true
        System.out.println( s1.startsWith("J"));  // false

        System.out.println( s1.startsWith("Mu")  ); // true

        System.out.println( s1.toLowerCase().contains("mu") ); // true
        //                      "muhtar".contains("mu")

    }
}
