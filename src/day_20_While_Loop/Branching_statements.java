package day_20_While_Loop;

public class Branching_statements {
    public static void main(String[] args) {

        char ch = 'A';
      while(ch <= 'E'){
          if(ch == 'C'){
              ch++;
              continue;  // skipps everything even the iterator
              // break;
          }
          System.out.print(ch+ " ");

          ch++;
      }



    }
}
