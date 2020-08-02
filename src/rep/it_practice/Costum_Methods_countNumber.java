package rep.it_practice;

public class Costum_Methods_countNumber {

    public static void plus_mines(int [] arr){
        int countNegative= 0;
        int countPasitive = 0;
        int countZero = 0;

        for (int EachNumber : arr){
            if (EachNumber == 0){
                countZero++;
            }else  if (EachNumber >= 1){
                countPasitive++;
            }else if (EachNumber < 0){
                countNegative++;
            };
        }
        System.out.println("positives:" + countPasitive +", negatives:" +countNegative  + ", zeros:" + countZero);
    }

    public static void main(String[] args) {
        int[] number = {1 , 0, 0 ,2, 3, -4};
        plus_mines(number);
    }
}
