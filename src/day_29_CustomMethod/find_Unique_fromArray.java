package day_29_CustomMethod;

public class find_Unique_fromArray {

    public static void Unique(String[] arr) {

        for (String each : arr) {
            int count = 0;
            for (String eachElement : arr) {    // gets frequency of the String
                if (eachElement.equals(each)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(each);
            }
        }
        System.out.println();
        }



    public static void main(String[] args) {
      String[] a = {"moki", "ali", "moki"};
      Unique(a);
    }
}
