package Office_hours;

public class If_Else_practice {
    public static void main(String[] args) {
        int num = 305;
        String result ="";

        if(num % 2 == 0){
         //   System.out.println(num + " is even number");
            result = num + " is even number";
        }else{
         //   System.out.println(num + " is odd number");
            result = num + " is even number";
        }
        System.out.println(result);

        // ternary
        String result2 = (num % 2 == 0) ?  num + " is even number": num + " is even number";
        System.out.println(result2);       // same result
    }
}
