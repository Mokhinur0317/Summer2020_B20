public class self_PRACTICE {
    public static void main(String[] args) {

        int a = 200;
        int b = -a++ + - --a * a--  % 2;
        //     -200 +   200 * 200 % 2
        //                40,000 % 2
                             // 0
        //   -200
        System.out.println( b );


         int x = 300;
         int y = 400;
         int z = x + y -x * y+ x /y;
         //        //  120000 + 0.75
        //       700        //   120000.75
           // 119, 300.75
        System.out.println(z);


        /*
        1. write java program that convers gallons to litters
           1 gallon = 3.785 l
           1 litters = 1/ 3.785

         */
        double  gallons = 15;
        double litters = gallons * 3.785;

        System.out.println(gallons + " gallons equil to " + litters + " litters");



        /*
                               1 gallons = 3.785
        LITTERS TO GALLONS
         */
       double Litters =  200;
       double  Gallons = litters/ 3.785;
        System.out.println( Litters + " litters equil to "+(int) Gallons + " gallons .");



    }
}


