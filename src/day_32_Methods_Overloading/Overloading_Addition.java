package day_32_Methods_Overloading;

public class Overloading_Addition {

    public static void  addition(double num, double num2){
        System.out.println(num + num2);
    }

    public static void addition(double num, double num2, double num3){
        System.out.println(num + num2 + num3);
    }

    public static void addition(double num, double num2, double num3, double num4){
        System.out.println(num + num2 + num3 + num4);
    }

//==========================================================================
    public static void main(String[] args) {
        addition(10,5);
        addition(3,4,5);
        addition(1,3,5,4);

    }
}
