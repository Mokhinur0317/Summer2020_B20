package day_11NestedIf_Ternary;

public class ternary_practice1 {
    public static void main(String[] args) {

        int age = 16;
        String citizen = "USA";

        String result = "";

        if(age >=18 && citizen == "USA"){
            result = "can vote";
        }else {
            result = "can not vote";
        }
        System.out.println(result);

        String result2 = (age >=18 && citizen == "USA") ? "can vote": "can not vote";
        System.out.println(result2);

        System.out.println("========================================================");

            int num1 = 100;
            int num2 = 200;

            String equal = (num1 == num2)? "Equal":" not Equal";
        System.out.println(equal);

        System.out.println("============================================================");

             int num = 100;
             String output = "";

             if (num > 0){
                 output = "positive";
             }else  if (num < 0){
                 output = "negative";
             }else{
                 output = "zero";
             }
        System.out.println( output);


             String output2 =( num > 0)? "positive" :  (num < 0)  ? "negative" : "zero";
        System.out.println( output2);


        // write a program that can compare two number
          //   a = 10; b =20
        // output = a is greater

    /*
           a  = 30, b = 10
           output = a is greater

           a = 20 , b = 20;
           output; a is equal to b
     */

                 int a = 14;
                 int b = 22;

         String result1 = (a < b ) ? "b is greater": (a > b) ? " a is greater" : "a is equal to b";
        System.out.println(result1);


    }
}
