package day_11NestedIf_Ternary;

public class NumberToWords {
    public static void main(String[] args) {
        int num = 8;

        String result ="";

        if(num == 0){
            result = "zero";
        }else if(num == 1){
            result ="one";
        }else if(num == 2){
            result = "two";
        }else if(num== 3){
            result= "tree";
        }else if (num == 4){
            result = "four";
        }else if(num == 5){
            result = "five";
        }else if(num == 6){
            result = "six";
        }else if (num== 7){
            result = "seven";
        }else if (num== 8){
            result = "eigth";
        }else if(num== 9){
            result = "nine";
        }else{
            result = " invalid";
        }
        System.out.println(result);





    }
}
