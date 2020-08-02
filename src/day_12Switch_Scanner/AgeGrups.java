package day_12Switch_Scanner;

public class AgeGrups {
    public static void main(String[] args) {

   int age = 15;

   String ageGroup = "";

    if (age > 1  && age <= 150){
        if (age  < 21 ){
            ageGroup = "Teeneger";
        }else if (age  <= 55){
            ageGroup = "Adult";
        }else  {
            ageGroup = "Senior";
        }
    }else{
        ageGroup = "Invalid";
    }
        System.out.println(ageGroup);



















    }
}
