package day_28Recap_continue;

public class LoopShort_Quiz {
    public static void main(String[] args) {
        int a = 0;
        while (a <= 6){   // true a = 2     true a = 4   true a = 6,   true a = 8;
            a += 2;
        }
        System.out.println(a);    // 8


        System.out.println("============ Next ====================");
        int i = 0;
        int j = 7;
        for (i = 0; i < j -1; i+=2){     // i: 0 ,  2  , 4, 6

            System.out.print(i + " ");  //    0 , 2 , 4
        }


        System.out.println();
        System.out.println("===============     next ====================");

        for (int k = 0; i <= 4;){   // if iterator in the same line i would get ( 0 1 2 3 4 )
            k++;                        // k : 1 2 3 4 5
            System.out.print(k+ " ");
        }

        System.out.println();
        System.out.println("=========================   next  ================");

        int z = 5;    // 5+5+4+3+2+1 = 20
          for(int q = 5; q > 0; q--){ //Q: 5 4 3 2 1
            z += q;
        }
    }
}
