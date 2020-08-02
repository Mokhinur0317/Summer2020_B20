package day_21Nasted_Loop;

public class Nasted_LoopFor {
    public static void main(String[] args) {

        for (int j = 1; j <= 7; ++j) {

            for (int k = 1; k <= j; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("==================");


        for (int j = 7; j >= 1; j--) {
            for (int k = j; k >= 1; k--) {
                System.out.print("*");
            }
            System.out.println();


        }
    }
}
