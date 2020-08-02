package Library_Void_Methods;

public class find_Max {
    public static void  max(int num1, int num2){
        int max = 0;
        if (num1 > num2){
            max = num1;
        }else if (num1 < num2){
            max = num2;
        }
        System.out.println("Max number is : "+ max);

    }

    public static void main(String[] args) {
        max(9, 5);
    }
}
