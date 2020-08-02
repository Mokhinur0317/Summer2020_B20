package day_07_Unary_shorthand;

public class post_VS_pre {
    public static void main(String[] args) {

        int a = 10;
        System.out.println( ++a);    // 11
        System.out.println(a);    // also 11


        int b = 10;
        System.out.println( b++ );   // here the differences // output is 10
        System.out.println( b );     // here 11

        System.out.println("===========================");
         int c = 25 ;
         int d = c++; // this one is post and out put will be 25
           // 26
        System.out.println("==================================");

        int e = 25;
        e++;
        System.out.println(e);   // output 26

        System.out.println("========================================");

        int x= 8;
      int y =   x--;    // y still 8
        System.out.println(y);  //  y = 8
        System.out.println(x);    // here output will be 7

        System.out.println("=============================================");

        int A = 1;
        A  = -A-- + A ++ / -A -- * --A;
        // A = -1 + 0 / -1 - -1
        // A = -1 + 0  * -1
        // A = -1 + 0 = -1

        System.out.println(A);    // -1

        System.out.println("===================================================");


        int m = 50;
        m = --m + m++ + m-- + m++;
         // a = 49 + 49  + 50 + 49
        //    a = 98 + 99
         //         197

        System.out.println( m );






    }
}
