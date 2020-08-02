package day_10;

public class grade_calculater {
    public static void main(String[] args) {
        int score =  95;

        String grade ="";

     if(score >= 90 && score  <= 100){   // 90 <= score <= 100
         grade = "a";
     }else if(score >= 80 && score <=89){
         grade = "b";
     }else if(score >=70 && score <= 79){
         grade = "c";
     }else if (score >= 60 && score <= 69){
         grade = "d";
     }else {
         grade = "fail";
     }
        System.out.println(grade);


    }
}
