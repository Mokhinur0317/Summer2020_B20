package day_17String_Review;
import java.util.Scanner;
public class warm_up {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter first word");
        String  word ="one";// user.next();
        System.out.println("Enter second  word");
        String second ="two";// user.next();

        System.out.println(""+word + second);
        System.out.println("====================================");



        System.out.println("Enter ur first name?");
        String  firstName ="MOKI"; //user.next();
        System.out.println("Enter ur last  name?");
        String  lastName ="kiki"; // user.next();
        System.out.println(firstName.substring(0,1) + lastName.substring(0,1) );
        System.out.println("=============================================");


        String str = "Java";
        System.out.println(str.substring(0 +1) + str.charAt(0));
        System.out.println("=================================================");

        String email =user.next();
         email = email.toLowerCase();

        if (email.contains("gmail")){
            System.out.println("the domain of the email is : gmail");
        }else  if (email.contains("yahoo")){
            System.out.println("the domain of the email is : yahoo");
        }

       // in this one when i dont know user input but i can stiil get domain of email
        int index1 = email.indexOf("@");
        int index2 = email.lastIndexOf(".");
        System.out.println(""+ index1+index2);
        System.out.println("===================================================");

        








    }
}
