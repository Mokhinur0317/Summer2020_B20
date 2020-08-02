package day_07_Unary_shorthand;

public class Unary {
    public static void main(String[] args) {

        System.out.println( -1 + -10 );
                 //   -1 - 10 == -11

        System.out.println( -1 - -10 );
                // -1 + 10 = 9

        System.out.println("==============");

        //  -- decrement

         int  a = 20;
         a = a + 1;       // 21
        System.out.println(a);

        // a = a- 1 = 19
        -- a;
        System.out.println(a);



        // ++ increment
        int b = 10;
        b = b+ 1; // 11
           // or
        ++ b;     // 12

        System.out.println(b);


         int y = 200;
        System.out.println( ++y );    // 201

         int d = 100;
        System.out.println( --d);    // 99


    }
}
