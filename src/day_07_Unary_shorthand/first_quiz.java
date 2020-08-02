package day_07_Unary_shorthand;

public class first_quiz {
    public static void main(String[] args) {

        int num1= 100;
        double num2 = 200;
        float num3 = 300;

       // num1 = num3; doesnt work
        num1 = (int) num3;    // this would work


        num3 = num1;
        // float can assign to int

        num2 = num3;
        //===================================================================================


        System.out.println( "result A" +  0 + 1) ;    // output will be A 01

        System.out.println("resolt A" + (1) + (2) );  // output will be A 12






    }
}
