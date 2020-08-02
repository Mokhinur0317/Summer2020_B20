package day_15_String;
import java.lang.String;

public class String_methods {
    public static void main(String[] args) {


        String nAme = "Cybertek School";

        // charAt(index)
        nAme.charAt(0);
        char ch1 = nAme.charAt(0);
        System.out.println(ch1);   // output is C
        char ch2 =nAme.charAt(5);
        System.out.println(ch2);    // output is t

        System.out.println("===========================================");

        // lenght() ====> int

         int l = nAme.length();
        System.out.println(l);

        // last index : length of  String - 1
        int lastIndixNum = nAme.length() - 1 ;    // 15 char - 1
        System.out.println(lastIndixNum);     // 14 characters

        char lastChar = nAme.charAt(14);
        System.out.println(lastChar);      // l

        System.out.println("=============================================");

        // concact(str):
        //   "Cybertek".concat("School") =======> " Cybertek school "

        String schoolName = "Cybertek";
        schoolName.concat("School");
        System.out.println(schoolName);   // Cybertek

        schoolName = schoolName.concat(" School");     // Cybertek school
        System.out.println(schoolName);

        String r1 = "Cybertek " +123 + 'A' + true ;
        System.out.println(r1);        // concat Cybertek123Atrue output


        System.out.println("=======================================");


        // toLowerCase();
        String name1 = "CYBERTEK SCHOOL";
                name1 = name1.toLowerCase();    // "cybertel school"
        System.out.println(name1);

        System.out.println("=======================================");



        //   toUpperCase();
        String name2 = "moki";
        name2=name2.toUpperCase();     // MOKI
        System.out.println(name2);

        System.out.println("==============================================");


          // trim(); removes the unused space .  (new ) return new string

        String p = "        Cybertek School        ";
        System.out.println(p);  //    "        Cybertek school             "
              p = p.trim(); // "Cybertek School"   all the unused space will be removed
        System.out.println(p);    //  "Cybertek school"

    }
}
