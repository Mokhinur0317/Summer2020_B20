package Office_hours;
import  java.util.Arrays;
import  java.util.Scanner;
public class Array_findMax {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
////        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
////
////       for (int numbers : nums){
////           Arrays.sort(nums);
////       }
////        System.out.println("max num is : " + nums[nums.length -1 ]);
//         int[] nums = {1, 2, 3 ,4, 5, 6, 7, 8, 9, 10};
//         int counteven = 0;
//         for (int eachElement : nums){
//             if(eachElement % 2 == 0){
//                 counteven +=1;
//             }
//         }
//
//        System.out.println("Even nums : " + counteven);
//
//
//
//
//         char start = 'A';
//         char end = 'Z';
//
//         for (char i = start; i <=  end; i++){
//             System.out.print(i);
//         }
//
//        System.out.println();
//
//         String str = "have a good day";
//         String vowels ="";
//         char[] arr = {'a','o', 'u','i','e', };
//          for (int i = 0; i <= str.length() -1 ; i++){
//            for (char eachChar : arr){
//                if (str.charAt(i) == eachChar){
//                    vowels += ""+str.charAt(i);
//                }
//            }
//
//            //  System.out.println(vowels);
//          }
//
//        System.out.println(vowels);
//
//
//        System.out.println("===================================");
//
        String str2 = "catcatcatcatdogdogdogco";
         int  countcat = 0;
         int countdog = 0;

        for (int i = 0; i <= str2.length() - 2; i++){
               if ( str2.charAt(i) == 'c'  && str2.charAt(i + 1) == 'a'  && str2.charAt( i+ 2) == 't') {
                   countcat ++;
               }

               if (str2.charAt(i) == 'd' && str2.charAt(i+1) == 'o' && str2.charAt(i+2) == 'g'){
                   countdog++;
               }
            }



        System.out.println("count cat " + countcat);
        System.out.println("count dog " + countdog);



//        Static variable java
        String  java = "jsdfgh";
//        check  if  variable length greater or equal to 4
        if (java.length() >= 4){
            // check if first character equal to j
            if (java.charAt(0) == 'j'){
                //  get next 3 characters
                String rest = java.substring(1,4);
                //   create full word java
                String check_rest = java.charAt(0) + rest;
                // print  if the state
                System.out.println(check_rest.contains("java"));
            } else if (java.charAt(1) == 'j'){
                String rest = java.substring(2,5);
                System.out.println(rest);
                String check_rest = java.charAt(1) + rest;
                System.out.println(check_rest);
                System.out.println(check_rest.contains("java"));
            } else {
                System.out.println(false);
            }
        } else {
            System.out.println(false);
        }
//
//
//        System.out.println( countJava );

        }

    }

