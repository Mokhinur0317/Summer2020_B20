package day_13Scanner;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Morning_warmUp {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        System.out.println("Please enter a number");
      int num = 9;// user_input.nextInt();
      String result = "";

      if ((num <= 9 ) && (num >= 0)){
          if (num== 0){
              result = "zero";
          }else if (num == 1){
              result= "one";
          }else if(num == 2){
              result ="two";
          }else if (num == 3){
              result = "three";
          }else if (num == 4){
              result = "four";
          }else if (num ==5){
              result = "five";
          }else if( num == 6 ){
              result = "six";
          }else if (num == 7){
              result = "seven";
          }else if (num == 8){
              result = "eight";
          }else{
              result= "nine";
          }
      }else{
          result = "Invalid number";
      }

        System.out.println(result);
        System.out.println("========================================================================");

        System.out.println("Enter your building number");
        int building = user_input.nextInt();


        user_input.nextLine();
        System.out.println("Enter your street address");
        String street = user_input.nextLine();

       // user_input.nextLine();
        System.out.println("Enter name of the city");
        String  city = user_input.nextLine();

        System.out.println("Enter state ");
        String state = user_input.next();

        System.out.println("ENter zip code ");
        int zip = user_input.nextInt();


        user_input.nextLine();
        System.out.println("Please enter your full name");
        String  fullName = user_input.nextLine();


        System.out.println(" Ship To : "  + fullName);
        System.out.println( building +" "+ street);
        System.out.println( city + " " + state+ ", " + zip);
    }
}
