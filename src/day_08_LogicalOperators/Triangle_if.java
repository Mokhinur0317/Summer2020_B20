package day_08_LogicalOperators;

public class Triangle_if {
    public static void main(String[] args) {

        double angel1 = 100;
        double angel2 = 60;
        double angel3 = 20;

        boolean valid = angel1 + angel2 +angel3 == 180;
        boolean invalid = !valid;

        if (valid  ){
            System.out.println(" valid triange ");
        }
        if (invalid){
            System.out.println(" invalid triange ");
        }


        int num1 = 101;
        boolean even = num1 % 2 ==0;
        boolean odd = !even;
        if (even) {
            System.out.println( num1 + " is  even number");
        }
         if (odd){
             System.out.println( num1 + " is odd number ");
         }





    }
}
