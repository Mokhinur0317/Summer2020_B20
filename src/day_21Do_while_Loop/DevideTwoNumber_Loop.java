package day_21Do_while_Loop;

public class DevideTwoNumber_Loop {
    public static void main(String[] args) {

        int a = 50;
        int b = 3;

        if(b == 0 ){
            System.out.println("invalid num");
            System.exit(0);
        }

        int count= 0;
        while( a >= b ){
            a -= b;
            count++;
        }
        System.out.println(count + " wiht a reminder of " + a);
    }
}
