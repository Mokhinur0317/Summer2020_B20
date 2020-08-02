package day_18Loop;

public class warm_UP_ {
    public static void main(String[] args) {
        for ( int num = 1; num <= 100; num++){
            if((num % 3 == 0 )  && (num % 5 == 0) ){
                System.out.print("Finra ");
            }else  if (num % 3 == 0){
                System.out.print("FIN ");
            }else  if(num % 5 == 0){
                System.out.print("RA ");
            }else {
                System.out.print(num + " ");
            }
        }
        System.out.println();


      //  System.out.println("* * * * * *"+"\n* * * * * *" + "\n* * * * * *"+"\n* * * * * *" + "\n* * * * * *" + "\n* * * * * *" + "\n* * * * * *" +"\n* * * * * *");

        System.out.println();

       // System.out.println("* * * * * *"+"\n*         *" + "\n*         *"+"\n*         *" + "\n*         *" + "\n*         *" + "\n*         *" +"\n* * * * * *");

        System.out.println();

        int sum = 0;
        int num = 100;
        for ( int i = 0;  i <= num; ++i ){
            sum = sum + i;
            System.out.print( sum + " ");
        }

        System.out.println();

         int sum1 = 0;
         for(int i = 2; i <= 100; ++i){
             if (i % 2 == 0){
                 sum1 = sum1+ i;
                 System.out.print(sum1 + " ");
             }
         }

        System.out.println();


         int sum2 = 0;
         for (int i = 1; i <= 100; i++){
             if (i % 2 != 0){
                 sum2 = sum2 + i;
                 System.out.print(sum2 + " ");
             }
         }

    }
}
