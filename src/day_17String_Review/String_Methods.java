package day_17String_Review;

public class String_Methods {
    public static void main(String[] args) {

        //    charAt(index); ====>  char
       String str = "Cybertek";
   //                01234567
        char ch1 =  str.charAt(7);
        System.out.println(ch1);


        // +
        String str2 = "Cybertek";
              str2 = str2 + " "+ "School";
        System.out.println(str2);


     //  lenght() ====> int
        String str3 = "Cybertek School";
        int l = str3.length();     // 15 -1 ====>  14
        System.out.println(l);                              //   output 15 int
        //     lastIndex: length -1

        char ch2 =str3.charAt(l-1); //  str3.length()-1
        System.out.println("last index :"+ (l-1));                 //     just gives numbers


  //     upperCase();
          String str4 = "cybertek";
               str4 =  str4.toUpperCase();     // "CYBERTEK"
        System.out.println(str4);

 //      lowerCase();
         String str5 = "JAVA";
           str5 = str5.toLowerCase();     // java
        System.out.println(str5);

  //    trim();
        String str6 = "         Cybertek    School      ";      //  back and front    it doesnt take spaces from the middle
        System.out.println(str6);
        str6 = str6.trim();   // "Cybertek"
        System.out.println(str6);

   // Substring:  Ending index is excluded .Beginning is included.
        String str7 = "I like Java languages";
        //             0123456789
        String word =str7.substring(7, 10 +1 );   // java     if i dont give one i would get only jav
        System.out.println(word);    // java

        String word2 =  str7.substring(12,str7.length());
        String word3 = str7.substring(12 );
        System.out.println(word2);       // languages
        System.out.println(word3);       // languages

        String word4 = str7.substring(2, 5 +1);
        System.out.println(word4);      //   like

//    indexOf() && lastIndexOf();   =======> int
        String str8 = "Hello Batch 20, Have a wonderful day , We are happy to see you ";
           int i1 = str8.indexOf("W");
        System.out.println(i1);   // 39   number of w
        System.out.println(str8.charAt(i1));   //   now i get  value of the number


  //    replace & replaceFirst
      String  s1 = "I like Java, Java is programming languages";
      s1= s1.replace("Java" ,"C#");
        System.out.println();    //  i like  C#, C# is a programming languages;
   //   s1   =   s1.replaceFirst("Java","C#");
      //  System.out.println(s1);
        String s3 = "I like Java, Java is programming languages";
        s3= s3.replaceFirst("Java","C#");
        System.out.println(s3);   // i like C#,.............   only first one   however we can  make it unique by adding  more chars after or before
    }
}
