package day_09_Ifstatement;

public class maximum_num {
    public static void main(String[] args) {

  /*
  1. write a java program that accepts three numbers and returns the maximum number
       (assume that none of them are equal)
   */

         double a = 500;
         double b = 200;
         double c = 1000;

         boolean a_isMax = a > b && a > c;
            //               true &&  false =====false
        boolean b_isMax = a_isMax == false && b > c;
              //      b > a && b > c;

        boolean c_isMax = b_isMax == false && a_isMax == false;
        //     c > a && c > b;

        String message = "";

        // double max = 0;       we want to assign the maximum number to variable max

        if( a_isMax  ){
            message = "  a is max";    // max = a
        }
         if (b_isMax ){
             message =" b is max";     // max = b
         }
         if (c_isMax ){
             message =" c is max";     // max = c
         }
        System.out.println(message);
     //   System.out.println(  max );    output shows the number only




    }
}
