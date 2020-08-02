package day_08_LogicalOperators;

public class practice_03 {
    public static void main(String[] args) {
        int b = 2;
        boolean res = ++b == 2 || --b ==2 && --b ==2;
        //             3== 2 ==||   2==2    &&   1==2
        //               false || true       &&  false
        //                      true ==  false
        //                          false
        System.out.println(res);
        System.out.println(b);




        int c = 5 ;
        boolean r2 = c++ == 6 ||c -- == 5|| c== 5;
        //            5 == 6  || 6== 5   || 5 ==5
        //             false || false     || true   ======true
        System.out.println( r2 );

        boolean a = true;
        boolean b1 = !a;

        boolean d = a  != b1 &&  a == !b1  && !a ==b1;
        //      true != false && true == true && false == false
        //            true     &&      true  &&     true
        System.out.println(d);    // true



        double num = 20;
        double num2 = 80;
        double both = num + num2 * 25; // 2500
        double remainder = both % 40;

        boolean re = remainder <= num;     // true
        System.out.println(re);












    }
}
