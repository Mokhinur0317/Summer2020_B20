package day_09_Ifstatement;

public class minimum_num {
    public static void main(String[] args) {

       double a = 100;
       double b = 200;
       double c = 300;

       boolean a_minimum = a < b && a < c ;
       boolean b_minimum = a_minimum == false && b < c ;
       boolean c_minimum = b_minimum == false && a_minimum == false;

       double minimum = 0;

        if (a_minimum){
            minimum = a;
        }
        if (b_minimum){
            minimum = b;
        }
        if (c_minimum){
            minimum =c;
        }
        System.out.println(minimum +" is the minimum number");




    }
}
