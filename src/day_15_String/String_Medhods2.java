package day_15_String;
import java.lang.String;
public class String_Medhods2 {
    public static void main(String[] args) {

        // substring();

        String sentence = "Java is fun";
        //                 012345678910......     we wanna get only Java from the sentence

        // substring (beg index . end index)
        String word1 = sentence.substring(0 ,3 + 1);
        System.out.println(word1);                    // Java

        String word2 = sentence.substring(8,10+1);
        System.out.println(word2);

        System.out.println("==========================================");

         String sentence1 = "I like Movies and Tv Series";
         //                  123456789.....
        String word3 = sentence1.substring(7,14);
        System.out.println(word3);       // Movie

        System.out.println("========================================");

        String name = "mOKINUR";
         String firstChar = name.substring(0,1);
        System.out.println(firstChar);           // M

         String restName = name.substring(1 ,name.length() );  //    firstname : lastIndex + 1 ;
        System.out.println(restName);           //okhinur

        name = firstChar.toUpperCase() + restName.toLowerCase();
      //  name = restName.toLowerCase();
        System.out.println(name);

//================================================================================================================
        String word  = "school";

        String firstChar1 =  word.substring(0 , 1);
        String  restChar = word.substring(word.length());

        restChar = firstChar1.toUpperCase() + restChar.toLowerCase();

  //==============================================================================================================

        String s = "I like Game of Thrones";
        String series = s.substring(7);    // it gives output till end which is From Game to of Thrones
        System.out.println(series);

        String s2 = "I like Java programming Languages";
        String  languages =s2.substring (7);
        System.out.println(languages);









    }
}
