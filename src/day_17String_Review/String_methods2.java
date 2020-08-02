package day_17String_Review;

public class String_methods2 {
    public static void main(String[] args) {
        String str = "Cat";     // String pool
        String str2 = new String("Cat");// heap   they are two differnt object
        String str3 = new String("Cat");

        // equals
        System.out.println(str == str2);   // false
        System.out.println(str.equals(str2));       /// true

        System.out.println(str2 == str3);    // false
        System.out.println(str2.equals(str3));     // true

        //

        String str4 = "java";
        String str5 = "Java";
        System.out.println(str4 == str5);  // false because its keys sensetive
        System.out.println(str4.equals(str5));   // false  same reazone

        // equalsIgnoreCase      is not case sensitivity
        System.out.println(str4.equalsIgnoreCase(str5));    // true

        String name = "MOKI";
        String name1 = "Moki";
        System.out.println(name.equalsIgnoreCase(name1));    // true

     //   ===================================================================================================
        // is Empty : checks if the length of string is 0
             String  s = " ";
             s  =  s.trim();
             System.out.println(s.isEmpty());   // true

        String school = "Cybertek";
        System.out.println(school.isEmpty());    // false

              String s1 = "";
        System.out.println(s1.isEmpty());     // true

      //===================================================================================================
          // contains()
        String languages = "Java , C++, Python, Ruby";
        System.out.println(languages.contains("Java"));  // true
        System.out.println(languages.contains("jav"));    // false
        System.out.println(languages.equalsIgnoreCase("java"));   // false
    }
}
