package day_19For_Loop;

public class Finra_practice {
    public static void main(String[] args) {
        for (int num = 1; num <= 100; num++) {
            if ((num % 3 == 0) && (num % 5 == 0)) {
                System.out.print("Finra ");
            } else if (num % 3 == 0) {
                System.out.print("FIN ");
            } else if (num % 5 == 0) {
                System.out.print("RA ");
            } else {
                System.out.print(num + " ");
            }
        }







    }
}