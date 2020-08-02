package day_18Loop;

public class ForLoop_Practice {
    public static void main(String[] args) {

        //  System.out.println("Cybertek Batch 20");

        for (int i = 1; i <= 5; ++i) {       // 5 times
            System.out.println("Cybertek Batch 20");
        }

        for (int i1 = 1; i1 <= 10; i1++) {
            System.out.print(i1 + " ");        //1 to 10 printed   and we used just print not println
        }
        System.out.println();
        System.out.println("==========================================================");

        for (int i1 = 100; i1 >= 1; i1--) {
            System.out.print(i1 + " ");
        }
        System.out.println("===========================================================");
        //     Ascii table

        for (char i = 65; i <= 90; ++i) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (char i = 97; i <= 122; ++i) {
            System.out.print(i + " ");
        }
        System.out.println();
        //===========================================================================================

        for (int i = 1; i <= 100; ++i) {
            if (i % 2 == 0) {
                System.out.print(i + " ");   // even
            }
        }
        System.out.println();

        for ( int num = 1; num <= 100; ++num) {
            if (num % 2 != 0){
                System.out.print(num + " ");    // odd
            }

        }

    }


}

