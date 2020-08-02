package day_29_CustomMethod;

public class odd_even_numbers {


    public static void main(String[] args) {
        print_even();
        print_odd();
    }

//==============================================================
    public  static void print_even(){

        for (int i =0; i <= 100; i++){
            if (i % 2 == 0){
                System.out.print(i + " , ");
            }
        }
        System.out.println();
    }
//============================================================
    public static void print_odd(){
        for (int i= 0; i <= 100; i++){
            if (i % 2 != 0){
                System.out.print(i + " , ");
            }
        }
        System.out.println();
    }
 //===========================================================

}
