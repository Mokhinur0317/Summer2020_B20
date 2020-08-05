package rep.it_practice;


import java.util.Arrays;

public class Reverse_Order {
    public static void main(String[] args) {
        String str = "java is fun";
        String[] newStr = str.split(" ");
        System.out.println( Arrays.toString(newStr));
          for (int i = newStr.length -1; i >= 0; i--){
              String newStr2 = newStr[i];
              System.out.println(newStr2);
          }




        }

    }

