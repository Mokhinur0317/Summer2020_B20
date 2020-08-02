package day_19For_Loop;

public class Odd_Even {
    public static void main(String[] args) {
       for ( int i = 1; i <= 99; i +=2){
          // if (i % 2 != 0){
               System.out.print(i + " ");
           }
 //      }

        System.out.println();
        for (int i = 1; i <= 99; i +=2){
            if(i % 5 == 0 && i % 3== 0){
                System.out.print(i + " ,");
            }
        }

        // nasted if statement
        System.out.println();

         for (int i = 1; i <= 99; i +=2){
             if (i % 2 != 0){                    // pre: Must be odd number
                 if(i % 5 == 0 && i % 3== 0) {      // sub: MUst be divisible by 3 && 5     ( i % 15 == 0)  its same thing  output will be  the same
                     System.out.print(i + " ");
                   }
                }
             }
         System.out.println();
         System.out.println("=====================================================================================================");

             // Even numbers

          for  (int i = 0; i <= 100; i += 2){
              if(i % 5 == 0 && i % 3 == 0){
                  System.out.print(i + " ");        //      output  will be 0 30 60 90
               }
          }
        System.out.println();

          for (int i = 0; i <= 100;  ++i){
              if (i % 2 == 0){                            // pre condition: must be even
                  if(i % 5 == 0 && i % 3 == 0){            //  sub: must be divisible by 3 and 5
                      System.out.print(i+" ");           //      output  will be 0 30 60 90
                  }
              }
          }







    }
}
