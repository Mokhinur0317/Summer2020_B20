package day_06;

public class implicit_explicit {
    public static void main(String[] args) {

        short s1 =100;
        long l1 = s1;  // implicit casting : aotamatically done

        long l2 = (long)s1; //  if we implicit manually

         int I1 = 300;
         double d1 = I1;  // 300.0

        System.out.println(d1);

        System.out.println("====================Explicit=================");


         double m1 = 400.55555;
         int n1 = (int)m1;

        System.out.println(n1);  // output is 400 which mean double changed  to the int
                               // from the larger to the smaller


        long a1 = 4400;
        short a2 = (short)a1;

        System.out.println(a2); // same thing output will be 4400 even its not changed

        int a3 = (int)a1;
        System.out.println(a3);  //   we can assigned long numbers to int and short as well


        int k1 =1000;
        byte k2 = (byte)1000;
        System.out.println(k2);  // in this case   we get negative number  -24

        double p1 = 34.5;
        float p2 = (long)p1;
        System.out.println(p2);   // output will be 34.0

        float p3 = (int)p1;
        System.out.println(p3);  // we get 34.4 so we can assinged  float to int and doesnt change the output


        System.out.println("====== negative numbers ==================================");

        long r1 = -500;
        int r2 = (short)r1;
        System.out.println(r2);   // output is -500

        int r3 = (int)r1;
        System.out.println(r3);    // never change output - 500

        long t1 = 13;
        byte t2 =(byte)t1;
        System.out.println(t2);    // this all call explicit casting  in this example output is 13 which mean









    }
}
