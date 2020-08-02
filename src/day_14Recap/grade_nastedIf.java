package day_14Recap;
import java.util.Scanner;
public class grade_nastedIf {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        double score = user.nextInt();
        user.close(); // closes the scanner and we will  be able to use it again

        String result = "";

        if (score >=0 && score<=100){ // 5 possible outcomes
            if (score >= 90){
                result = "excellant";
            }else if(score >= 80 && score< 90){
                result = "great";
            }else if(score >= 70 ){
                result = "good";
            }else  if (score >=60 ){
                result = "passed";
            }else {
                result = "failed";
            }
        }else{     // one possible outcomes
            result = "Invalid";

            System.out.println(result);


        }
    }
}
