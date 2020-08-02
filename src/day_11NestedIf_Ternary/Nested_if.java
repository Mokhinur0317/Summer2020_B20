package day_11NestedIf_Ternary;

public class Nested_if {
    public static void main(String[] args) {

        int salary = 20000;
        int job_history = 3;

        String result ="";

        if(salary >= 30000){
            if (job_history >= 2){
               result = "eligible";
            }else {
                result= "not eligible due to job history";
            }
        }else {
            result = "not eligible due to salary";
        }
        System.out.println(result);



        System.out.println("===================================================================================");

           int score = 100;
           String output = "";

           if (score >= 0 && score <= 100){
               if (score >= 90){
                   output = "A";
               }else if (score >= 80){
                   output = "B";
               }else if (score >= 70 ){
                   output = "C";
               }else if(score >= 60){
                   output = "D";
               }else {
                   output = "Fail";
               }

           }else {
               output ="Invalid";
           }
        System.out.println(output);
        System.out.println("============================================================");


                      int day = 1;                                  // Monday
                      String result1 = "";

                      if (day > 0 && day <= 7){       // this one way
                          if (day == 1){
                              result1 = "Monday";
                          }else  if (day == 2){
                              result1 = "Tuesday";
                          }else  if (day == 3){
                              result1 = "Wednesday";
                          }else if (day == 4){
                              result1 = "Thursday";
                          }else  if (day == 5){
                              result1 = "Friday";
                          }else if (day == 6){
                              result1 = "Saturday";
                          }else{
                              result1 = "Sanday";
                          }

                      }else {
                          result1 = "there is no such a day";

                      }
        System.out.println(result1);
        System.out.println("=======================================");
                    //  int day2 = 8;                                     // this other way;
                       boolean validNum = day>=1 && day <= 7;    // we can also use boolean to make it easy

          if (validNum){

              if(day == 1){
                  result1 = "Monday";
              }else  if (day == 2){
                  result1 = "Tuesday";
              }else  if (day == 3){
                  result1 = "Wednesday";
              }else if (day == 4){
                  result1 = "Thursday";
              }else  if (day == 5){
                  result1 = "Friday";
              }else if (day == 6){
                  result1 = "Saturday";
              }else{
                  result1 = "Sanday";
              }
          }else {

          }
        System.out.println(result1);     //     i get same output which is  Monday









    }
}
