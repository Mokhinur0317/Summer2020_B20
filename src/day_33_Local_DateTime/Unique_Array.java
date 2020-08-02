package day_33_Local_DateTime;

public class Unique_Array {
    public static void main(String[] args) {
        int[] arr = {2 , 2 , 1, 3, 3, 6};
        Unique_ArrayElements(arr);
    }


//=================================================================================
  public static void Unique_ArrayElements(int[] arr){
      for (int element : arr) {
          int count = 0;

          for (int eachNum : arr) {
              if (eachNum == element) {
                  count++;
              }
          }
          if (count == 1) {
              System.out.print(element + " ");
          }
      }
      System.out.println();
    }


//==========================================================================

    public static void Unique_ArrayElements(char[] arr){
        for (char element : arr) {
            char count = 0;

            for (char eachNum : arr) {
                if (eachNum == element) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(element + " ");
            }
        }
        System.out.println();
    }


//==========================================================================
public static void Unique_ArrayElements(String[] arr){
    for (String element : arr) {
        char count = 0;

        for (String eachNum : arr) {
            if (eachNum.equals(element)){
                count++;
            }
        }
        if (count == 1) {
            System.out.print(element + " ");
        }
    }
    System.out.println();
}

}


