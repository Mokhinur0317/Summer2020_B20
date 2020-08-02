package day_09_Ifstatement;

public class warm_upNight {
    public static void main(String[] args) {

        int angel1 = 60;
        int angel2 = 20;
        int angel3 = 100;

        int triangle = angel1 + angel2 +angel3;
        String message = "";

         if(triangle == 180){
            message = "This is valid triangle";
         }else{
             message = "not valid triangle";
         }
        System.out.println(message);
        System.out.println("========================================");


        char character = 'a';
        char character2 = 'b';

        String message_2 = "";
        if(character == character2){
            message = "same characters";
        }else{
            message_2 ="different characters";
        }
        System.out.println(message_2);
        System.out.println("=========================================");


        int vehicle = 2009;

        boolean eligible = (vehicle < 2004) && (vehicle < 2006);
        String message_3 = "";

        if(eligible){
            message_3 =" true ";
        }else{
            message_3 = " false ";
        }
        System.out.println(message_3);



    }
}
