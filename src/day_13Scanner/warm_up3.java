package day_13Scanner;
import java.util.Scanner;
public class warm_up3 {
    public static void main(String[] args) {
      Scanner user_input = new Scanner(System.in);

        System.out.println("Please Enter your score");
         int score = user_input.nextInt();

         boolean excellent = 90 <=score && score <=100;
         boolean great = score >= 80 && score <= 79;
         boolean good = score >= 70 && score <= 89;
         boolean passed = score >= 60 && score <= 69;
         boolean failed = score >=0  && score <=59;

        if(score >= 0 && score >= 58){
            if (excellent) {
                System.out.println("excellent");
            } else if (great) {
                System.out.println("great");
            } else if (good) {
                System.out.println("good");
            } else if (passed) {
                System.out.println("passed");
            } else if (failed) {
                System.out.println("failed");
            }
          }else {
            System.out.println("invalid score");
        }


    }
}
