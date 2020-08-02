package day_16String;

public class String_Index_Methods {
    public static void main(String[] args) {
        //    indexOf();    finding the index number it gives  int

        String s5 =" I like to stay in Cybertek, we are learning java";
                                        // r       //re
        int r1 =   s5.indexOf("r");
        System.out.println(r1);        // 23
        System.out.println(s5.charAt(r1));      // r

        int r2 = s5.indexOf("re");
        System.out.println(r2);                    // 33
        System.out.println(s5.charAt(r2));         //  r


        // ===============================================================================================

        // lastIndexOf();

        String  s6 = "Jave is programming language, and Java is fun";
        int  r3 =   s6.lastIndexOf("J");   // last matching character
        System.out.println(r3);

        String s7 = "Java";
        int a1 = s7.indexOf("A");
        System.out.println(a1);     // gives u  negative number    it means its doesnt excist in the String

    }
}
