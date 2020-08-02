package day_17String_Review;

public class Pool_Vs_Heap {
    public static void main(String[] args) {
        String s1 = "Cybertek";  // String pool
        String s2 = "Cybertek";  // String pool

        String s3 = new String("Cybertek"); // heap
        String s4 = new String("Cybertek"); // heap

        String s5 = "cybertek";  // String pool

        System.out.println( s1 == s2); // true

        System.out.println(s1.equalsIgnoreCase(s3) ); // true

        System.out.println( s3 == s4); // false

        System.out.println(s5 == s2) ;  // false

        System.out.println(s5 == s1); // false

        System.out.println("s1 == s2 is:" + s1 == s2);
    }
}
