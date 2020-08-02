package day_16String;

public class String_EmptyMethods {
    public static void main(String[] args) {

        //   isEmpty()  checks if the string has same text with  the given string and it returns boolean

        String name1 = "Cybertek";
        System.out.println(name1.isEmpty() );    // false

        String name2 ="";
        System.out.println(name1.isEmpty());    // true

        String str1 = "Java";   // string pool
        String str2 = new String("Java");  // heap


        System.out.println(str1 + "" + str2);
        System.out.println(str1 == str2);   //    output will be  false because two variable located in Different place
        System.out.println(str1.equals(str2) );    // output is equals which is true



        String str3 = new String("Java");    // new object
        String str4 = new String("Java");    // new object
        System.out.println(str3 == str4);   // false
        System.out.println(str3.equals(str4));      //   true


        String str5 = "Java";    // they have the same object becouse
                                                  //they are located in the spring pool
        String str6 = "Java";
        System.out.println(str5 == str6);    // true


        String str7 = "JAVA";    // in this case we get false because of the key sensitivity
        String str8 = "Java";
        System.out.println(str7 == str8);     // false
        //========================================================================================================================
                //     equalsIgnoreCase(str);
        //    yes ,Yes, YES , in order to ignore keys sensitivity

        System.out.println(str7.equalsIgnoreCase(str8));     // true


    }
}
