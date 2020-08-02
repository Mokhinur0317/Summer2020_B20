package day_07_Unary_shorthand;

public class short_hand {
    public static void main(String[] args) {

        // =: assigment
        int a = 200;
            a = 400;

            //      += addition assignment

        int b =200;
        b = b +100;     // ======300

        b += 100;   // 300 short_hand


        //     -=  subtraction assignment

        int  c = 200;
        c = c -50;
        c -= 50;    // 150 shorthand


              // *= multiplication assignment
         int d = 10;
         d = d * 2 ;   // 20
         d *= 2;    // same output


        System.out.println("==================================================================");

        int n1 = 100;
        //  n1 = n1 * 100;
        n1 *=100;
        System.out.println(n1);   //10000

        int n2 = 2;
        n2 *= 3;
        System.out.println ( n2 );  // 6


        int n3 = 300;
        n3 -= 100;
        System.out.println(n3);    // 200

        System.out.println("==============================================");

        // += ;

        int n4 = 300;
        n4 += 200;
        System.out.println(n4);   // 500


        String school = "Cybertek";
      //  school= school + " School";

          school += " school";
       System.out.println(school);    // Cybertek school

        String fullname = " Moki";
            fullname += " Vafoeva";
        System.out.println(fullname);    // Moki Vafoeva

        System.out.println(" ============================================== ");

        //  /= division assignment

        int bud = 100000;
        // bud = bud /2               // 50000
        bud /= 2;
        System.out.println(bud);     // 50.0002134
















    }
}
