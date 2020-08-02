package day_20_While_Loop;

public class While_Loop_Practice {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            System.out.print(i+" ");
        }
        System.out.println();     // same task    different solution

        int num = 1;
        while(num <= 10){
            System.out.print(num + " ");
            num++;     // when we use while loop we need to iteration at  the end
        }

        System.out.println();

        for (int i = 1; i <= 10; i++){
            System.out.print("moki  ");
        }


        System.out.println();
        int num1 = 10;
        while (num < 15){
            System.out.print("Cybertek ");// it will be printed 5 times
            num++;
        }
    }
}
