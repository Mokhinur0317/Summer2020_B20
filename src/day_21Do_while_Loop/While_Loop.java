package day_21Do_while_Loop;

public class While_Loop {
    public static void main(String[] args) {

        boolean  result = false;
        while (result) {
            System.out.println("hello");
        }

        System.out.println();

        do {
            System.out.println("Hello world");
        }while (result);

        System.out.println("====================================");
             int num = 1;
        do{
            System.out.print(num + " ");
            num++;
        }while(num <= 20);

        System.out.println();




      char  ch = 'Z';

      do{
          System.out.println(ch+" ");
          ch--;
      }while( ch >= 'A');
    }
}
