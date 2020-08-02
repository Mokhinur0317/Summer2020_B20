package day_19For_Loop;

public class Odd_Even_Cantinue {
    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++){
            if (i % 2 != 0){
                continue;
            }
            System.out.print(i+" ");       // even
        }


        System.out.println();

        for (int i = 1; i <= 50; i +=2){    // in order to print odd, we can chose skip even number
            if (i % 2 == 0){
                continue;        // if the number is even, then skip
            }
            System.out.print(i + " ");     // odd
        }




    }
}
