package day_30Recap_Costum_Methods;

public class Return_Methods {

    public static void additional(int num1, int num2){
        int sum = num1+num2;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        additional(2,5);

      int sum =  addition2(20,50);
        System.out.println(sum);
    }



    //=============================================

    public static int addition2(int num1, int num2){
        int sum =  num1 + num2;
        return sum;
    }
}
