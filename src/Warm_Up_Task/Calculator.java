package Warm_Up_Task;

public class Calculator {
    public static void main(String[] args) {
     int result  =   Calculator(5,9,'+');
        System.out.println(result);
    }

    public  static int Calculator(int num, int num2, char ch){
          int  result = 0;
        switch (ch) {

            case '+':
             result  =  (num + num2);
                break;

            case '-':
               result = (num - num2);
                break;

            case '*':
              result = (num * num2);
                break;

            case '/':
               result = (num / num2);
                break;

            case '%':
               result = (num % num2);
                break;

            default:
                result = 0;
        }

        return  result;

    }
}
