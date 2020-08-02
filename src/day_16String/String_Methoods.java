package day_16String;

public class String_Methoods {
    public static void main(String[] args) {

        // replace

        String  email = "cybertek@gmail.com";
        email = email.replace("gmail", "yahoo");
        System.out.println(email);


        String word = "java";
        word =  word.replace("a", "e");   // jeve
        System.out.println(word);


        String sentence = "I like to lear Java, Java is cool, Java is fun";
        sentence.replace("Java" , "C#");
        System.out.println(sentence);


        String s1 = "I like to stay in Cybertek, Cybertek is nice place";
        s1  = s1.replace("Cybertek" , "MIT");
        System.out.println(s1);
        s1 = s1.replace("MIT", "Cybertek");
        System.out.println(s1);


        String s2 = "I like to leaRn Java";   // r
        s2 = s2.replace("R" ,  "r");   // i like to learn java
        System.out.println(s2);


        String s3 = "I like to  drink tea and tea";
        s3= s3.replaceFirst("tea" , "cola");     // it will changed to  first old value
        System.out.println(s3);


        String s4 = "I like to Watch Game of Thrones , and Wolking dead";
        s4 =   s4.replace(", and Wolking dead" , "");    //I like to Watch Game of Thrones
        System.out.println(s4);      //I like to Watch Game of Thrones
    }
}
