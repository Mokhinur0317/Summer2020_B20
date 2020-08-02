package day_19For_Loop;

public class SumOf_Even_Odd {
    public static void main(String[] args) {

        int sum = 0;
    for (int i = 0; i <= 100; i += 2){
        sum = sum + i;
        System.out.print(sum + " ,");
    }
        System.out.println();
        System.out.println(sum);   // sum of all even numbers



        //===============================================================================
             int sumOfEven = 0;

        for (int i = 0 ; i <= 100; i++){
            if (i % 2 == 0){
                sumOfEven += i;
            }
        }
        System.out.println(sumOfEven + " ,");       // SUM OF ALL EVEN NUMBERS
        System.out.println();
        //=================================================================================
                  int sumOFOdd = 0;
         for (int i = 1 ;  i <= 99; i += 2){
             sumOFOdd += i;
         }
        System.out.println(sumOFOdd);    // matematical way to do it



         for (int i = 0 ; i <= 100; ++i){
             if (i % 2 != 0){
                 sumOFOdd += i;    // sumOdOdd = sumOfOdd + i ;
             }
         }
          System.out.println(sumOFOdd);





    }
}
