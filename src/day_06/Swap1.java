package day_06;

public class Swap1 {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        int c = b; // c = 15

        b = a; // b =10
        a =b; // a = 10

        System.out.println(a);  // 15
        System.out.println(b); // 10
    }
}
