package day_29_CustomMethod;

import day_12Switch_Scanner.Switch_;

import java.util.Scanner;

public class Grade_basedOn_score {
    public static void main(String[] args){
        Scanner user = new Scanner(System.in);
        System.out.println("Enter your overall score");
        int score = user.nextInt();

        Grade(score);
    }





    public static void  Grade(int score){
       String grade = "";

       if  (score < 0  ||  score > 100){
           System.out.println("invalid score");
           return;
       }


       if (score <= 100 && score >= 90){
           grade = "A";
       }else if(score >= 80  && score <= 89) {
             grade += "B";
        }else  if (score >= 70 && score <= 79){
           grade  += "C";
       }else {
            grade += "Fail";
       }
        System.out.println("Your grade is : " + grade);
    }
}
