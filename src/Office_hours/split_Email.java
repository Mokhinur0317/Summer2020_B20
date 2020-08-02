package Office_hours;

public class split_Email {
    public static void main(String[] args) {
        String email  = "moki@cybertek.com";
        int count = 0;

           int num = email.indexOf('@');
           if (email.contains("@")) {

               for (int i = 0; i <= email.length()-1;i++) {
                   if (email.charAt(i) == '@') {
                       count++;
                   }
               }
               if (count > 1){
                   System.out.println("invalid email");
               } else {
                   System.out.println("email id: " + email.substring(0, num));
                   System.out.println("domain: " + email.substring(num + 1));
               }

           } else if (!email.contains("@")) {
               System.out.println("invalid email");
           }






    }
}
