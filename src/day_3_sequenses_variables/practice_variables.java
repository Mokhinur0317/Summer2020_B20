package day_3_sequenses_variables;

public class practice_variables {
    public static void main(String[] args) {
        //100 ,200
        byte num1 = 100;  //if u care about useg memory
        short num2 =200;
        int sum = num1 +num2;


        System.out.println(num1);
        System.out.println(num2);
        //100
        //200

        System.out.println(num1+num2);
        //300

        System.out.println(sum);
          // 300


        // if i have num 15000,100000
        int number1 = 15000;
        int number2 = 100000;
        long sum_1= number1 + number2;

        System.out.println( sum_1 );


       // =============================
        float n1 = 3.5f;
        double a =n1;
        // long b =n1

        long x = 100;
        float y =x;
        double z = x;

        System.out.println(x); //100
        System.out.println(y); //100.0
        System.out.println(z);//100.0


        System.out.println("===========================");

               int salary = 100000;
               float tax = .25f;
        System.out.println(salary * tax);





    }
}
