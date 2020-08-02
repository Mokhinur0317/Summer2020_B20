package Library_Void_Methods;

public class find_max_min_Number {


    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3,4,5};

        Max_number(numbers);
        Min_number(numbers);
    }






    public static void  Max_number(int[] numbers){
        int max = numbers[0];

        for (int eachNum : numbers){
            if (eachNum > max){
                max = eachNum;
            }
        }

        System.out.println("max number is : " + max);
    }




    public static  void Min_number (int[] numbers){
        int min = numbers[0];

        for (int eachNum : numbers){
            if (eachNum <  min){
                min = eachNum;
            }
        }

        System.out.println("Min number is : " + min);
    }

}

