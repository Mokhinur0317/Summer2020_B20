package day_08_LogicalOperators;

public class logical_operators {
    public static void main(String[] args) {

      //   !: opposite boolean;    means basically   (  not  )

      boolean r1 = 9 > 7 ; // true
      boolean r2 = !r1 ;    // false
        System.out.println( r1 + " : " + r2 );

        System.out.println( ! false ); // true
        System.out.println( ! true ); // false


        boolean r3 = !false == true;
           // true == true == true

        System.out.println(r3);



        boolean r4 = true == !true;  // false
        System.out.println( r4 );


        System.out.println("=============================================");

         //     && === and logic

        boolean r5 = 9 >  5  &&    9 > 10;
          //          true     and   false

        boolean r6 = !true  &&  false;  // false

        boolean r7 = !false && 9 > 8;     // true
        //            true &&   true === true

        System.out.println("================================================");
        //






    }
}
