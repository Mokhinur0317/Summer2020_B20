package day_12Switch_Scanner;

public class BiggerNumber {
    public static void main(String[] args) {
        double n1 = 100;
        double n2 = 200;
        double n3 = 300;

        boolean  n1bigger= n1 > n2 && n1 >n3;
        boolean  n2bigger = n2 > n1 && n2 > n3;
        boolean n3bigger = !n1bigger && !n2bigger;


        String result = (n1bigger)? n1 + "is bigger" : (n2bigger)? n2 + " is bigger " : n3 + " is bigger";
        System.out.println( result);
        System.out.println("==========================================================================");


    }
}
