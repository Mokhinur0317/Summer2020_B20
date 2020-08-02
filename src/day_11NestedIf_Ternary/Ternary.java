package day_11NestedIf_Ternary;

public class Ternary {
    public static void main(String[] args) {

        int num = 100;
        String result = "";

        if( num %2 == 0){
            result = "even";
        }else {
            result = "odd";
        }
        System.out.println(result);
        System.out.println("==========================");

       String result2 =  (num % 2 == 0) ? "Even" : "Odd";
            //.                         (?)if     (:)  else
        System.out.println(result2);
        System.out.println("============================");


            int num1 = 10;
            int num2 = 20;
            int max1 = 0;

            if( num1 > num2){
                max1 = num1;
            }else{
                max1 = num2;
            }
        System.out.println(max1);
        System.out.println("==============");

         int max2 =(num1> num2) ? num1 : num2 ;
         //                   ( ? ) if   (:) else
        System.out.println(max2);
        System.out.println("==========================");

                int age = 20;
                boolean eligible = false;

            if (age > 21){
                eligible = true;
            }else{
                eligible= false;
            }
        System.out.println( eligible);
        System.out.println("=======================================");

         Boolean   eligible2 = (age> 21) ? true : false;
        System.out.println(eligible2);


        System.out.println("===================================");
                int age2  = 18;
                String vote1 = "can vote";
                String vote2 = "can not vote";
        String eligible3   = (age2 > 21) ? vote1 : vote2;
        System.out.println(eligible3);


    }
}
