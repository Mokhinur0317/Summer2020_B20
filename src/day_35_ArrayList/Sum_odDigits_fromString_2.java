package day_35_ArrayList;

public class Sum_odDigits_fromString_2 {
    public static void main(String[] args) {
        String str = "a1b2c3";
        int sum = 0;
        for (char each :str.toCharArray()){
            if(Character.isDigit(each)){
                sum +=Integer.parseInt(""+each);
            }
        }

        System.out.println(sum);

    }
}

/*
isDigit(char): verifies if the char is digit, returns boolean ;
isLatter(char): verifies if the char is latter, returns boolean ;
 */