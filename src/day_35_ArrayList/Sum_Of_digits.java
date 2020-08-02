package day_35_ArrayList;

public class Sum_Of_digits {
    public static void main(String[] args) {
        String str = "a1b2c3";
        int sum = 0;
        for (int i = 0; i <= str.length()-1; i++){
            char each = str.charAt(i); // a, 1, b , 2 ,c, 3
            if(each >=48 && each <= 57){
             sum += Integer.parseInt(""+each); // convert the char to integer then addit to the sum
            }
        }
// if statement : if  the char is between 48_57,then its digit
        System.out.println(sum);

    }
}
