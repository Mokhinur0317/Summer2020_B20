package day_06;

public class Relational_operation {
    public static void main(String[] args) {

     boolean m1 = 10 > 9;
        System.out.println(m1);   // output is true

        boolean m2 = 100 < 9000;
        System.out.println(m2);  // output is true

        //   >=  greater or equal

        boolean m3 = 87 >= 85;
        System.out.println(m3); // true

        boolean m4 = 90 >= 98;
        System.out.println(m4);  // false
        // m4 = 98 >= 90;   this one is true

        //  <= less than or equal to

        boolean m5 = 200<= 300;
        System.out.println(m5);  // true

               //  == equal
        boolean m6 = 100 == 100;
        System.out.println(m6);  // true

        boolean m7 = 900 == 800;
        System.out.println(m7);  // false

        boolean m8 = "moki" == "moki";
        System.out.println(m8);  // true


       //. boolean m9 = "112" == 112;  different data type;


                  // != not equal
        boolean a1 = "moki" != "not moki";
        System.out.println(a1);  // true

        boolean a2 = true != false;
        System.out.println(a2); // true

        boolean a3 = 'A' == 65;
        System.out.println(a3);  //true    this one is char

        boolean a4 = 100 == 100.0;
        System.out.println(a4);  //   output will be true

        boolean a5 = 100 == 100.1;
        System.out.println(a5);  // in this case output  false

        System.out.println("==========================================================");

        boolean a6 = 10 ==  (int) 10.9999999;
        System.out.println(a6);     // true

        System.out.println("============ self practice================");

            boolean  b1 = 100%2 == 0;
        System.out.println(b1);    // true

            boolean b2 = 1000%2 ==0;
        System.out.println(b2);  // true



        int number =100;
        boolean even = number%2==0;
        System.out.println(even);  //  even is true


        int number1 = 101;
        boolean even1 = 101%2 == 0;
        System.out.println(even1);   // false

        boolean odd = number != 0;
        System.out.println(odd);     //  odd is  true



        int n1 = 1000;
        boolean s1 = n1 %2  == 0;
        System.out.println(s1);  // true


        int x1 = 1000;
         boolean x2 = x1 % 2  != 0;
        System.out.println(x2);  // false






    }
}
