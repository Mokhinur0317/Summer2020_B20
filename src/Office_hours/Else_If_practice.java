package Office_hours;

public class Else_If_practice {
    public static void main(String[] args) {
        int score = 80;
        char grade = ' ';

        if(score >= 90 && score <= 100){
            grade = 'A';
        }else if(score >= 80){
            grade = 'B';
        }else  if(score >= 70){
            grade = 'c';
        }else  if (score >= 60){
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println(grade);

        // turnary

        char grade2 = (score >= 90 && score <= 100)? 'A': (score >= 80)? 'B': (score >= 70)? 'C'
                : (score >= 60)? 'D' : 'F';
        System.out.println(grade);   // same exact value

    }

}
