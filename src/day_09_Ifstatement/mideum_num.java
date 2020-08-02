package day_09_Ifstatement;

public class mideum_num {
    public static void main(String[] args) {
        double a =100;
        double b = 200;
        double c = 150;

        boolean a_mideum =(a > b && a < b ) || (a > c && a < b );
        boolean b_mideum = (a >c && b < a) || ( b < c && b > a);
        boolean c_mideum = !a_mideum && !b_mideum;

        double message = 0;

        if (a_mideum) {
            message=a;
        }
        if (b_mideum){
            message=b;
        }
        if (c_mideum){
            message = c;
        }
        System.out.println(message + " is the medium number");
    }
}
