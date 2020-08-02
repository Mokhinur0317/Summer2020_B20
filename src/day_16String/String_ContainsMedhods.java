package day_16String;

public class String_ContainsMedhods {
    public static void main(String[] args) {

        //     contains();  check if the given string in the string contains or not

        String str = "I like to learn java programming";
        System.out.println(str.contains("python"));   // false
        System.out.println(!str.contains("python"));   //   true

        System.out.println( str.contains("java"));   // true
        System.out.println(str.contains("Java"));    //   false
    }
}
