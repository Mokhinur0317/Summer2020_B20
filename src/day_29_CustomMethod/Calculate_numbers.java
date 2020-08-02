package day_29_CustomMethod;

public class Calculate_numbers {

    public static void calculator (double num, char operator , double num2){
        switch (operator){
            case'+':
                System.out.println("Addition: " + (num + num2));
                break;

            case'-':
                System.out.println("Subtraction : " + (num - num2));
                break;

            case'*':
                System.out.println("Multiplication  : " + (num * num2));
                break;

            case'/':
                System.out.println("Division : " + (num / num2));
                break;

            case'%':
                System.out.println("Remainder: " + (num % num2));
                break;

            default:
                System.out.println("invalid operator ");
                break;
        }
    }
//=============================================================================================

    public static void main(String[] args) {
        calculator(100, '/', 20);

    }
}
