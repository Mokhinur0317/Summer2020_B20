package day_10;

public class multi_brunch_IFstatement {
    public static void main(String[] args) {
          int number = 100;


      if(number > 0){
          System.out.println(number + " is positive ");
      }
      if(number < 0 ){
          System.out.println(number + " is negative");
      }
      if(number == 0 ){
          System.out.println(number + " is zero");
      }
        System.out.println("=======================================");

      //   multi brunch if statement.

        if(number>0){
            System.out.println(number + " is positive");
        }else if(number< 0){
            System.out.println(number + " is negative");
        }else{  // number == 0
            System.out.println( number + " is zero");
        }

    }
}
