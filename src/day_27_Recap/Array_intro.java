package day_27_Recap;

import java.util.Arrays;
import java.util.Scanner;

public class Array_intro {
    public static void main(String[] args) {


        //   single   and  multi dimensional Arrays
               /*
               1, Single dimensional = : a variables that contains elements (collection of elements)
                                          Note: each elements  has index number
                      declare_
                               DataType[] name = {data1 ,   data2 ,   data3.....};
                                         index     0         1          2

                        declare only size
                                         DataType[] numbers = new int {data number};


                      Arrays.toString
                */

        String[]   names = {"Moki",  "Ali",  "Dots "};
        // index :
        System.out.println(names[0]);            //   output:  Moki


        // using for loop
        for (int i = 0; i <= names.length -1; i++){
            //System.out.println(names[i]);                 // output:   Moki, Ali , Dots
            if ( !names[i].startsWith("A")){
               continue;
            }
            System.out.println(names[i]);
        }


        System.out.println("=================================================================");
        int [] number = new int [5];    //  defolt value  is 0
        System.out.println(number);    //   output :  { 0, 0 ,0 , 0 ,0 }

        number[3] = 25;                //  output: { 0, 0 , 0, 25, o }
        System.out.println(Arrays.toString(number));

        System.out.println("==================================================================");
        Scanner user = new Scanner(System.in);

        System.out.println("How many numbers do u want to enter ");
        int num = user.nextInt();
        String[] students = new String[num];   //   that would be size of the arrray

//        System.out.println("Enter a name: ");
//        students[0] = user.next();    // moki
//        students[1] = user.next();     // ali

        for (int i =0; i <= students.length -1; i++){
            System.out.println("Enter a name: ");
            students[i] = user.next();
        }
        System.out.println( Arrays.toString(students));

    }
}
