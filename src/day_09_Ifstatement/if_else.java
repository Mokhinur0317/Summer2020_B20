package day_09_Ifstatement;

public class if_else {
    public static void main(String[] args) {
        String country = "USA";
        int age = 21;

        boolean eligible = country == "USA" && age  > 18;
         String  message = "";

        if (eligible){
            message = " eligible to vote ";
        }
        else{
            message =" not eligible to vote";

        }
        System.out.println(message);

        System.out.println("==================================");



        int age1 = 26;

        if (age1 >= 21){
            System.out.println(" you can buy alcohol");
        }else{
            System.out.println( " you cannot buy alcohol ");
        }
        System.out.println("====================================");




        int even = 101;

        if (even%2== 0){
            System.out.println("even num");
        }else {
            System.out.println(" odd num");
        }
        System.out.println("========================================");

           boolean break_time = false;

           if (break_time){
               System.out.println( " Its break time !");
           } else{
               System.out.println( " Its too early for break ...");
           }
        System.out.println("==========================================");


           int a= 100;
           int b = 200;



           if (a < b){
               System.out.println( b + " is greater");
           }else{
               System.out.println(a + "is greater");
           }



    }
}
