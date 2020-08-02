package day_29_CustomMethod;

public class Find_uniques_fromArray {
    public static void main(String[] args) {

        String[] arr = {"a", "b", "b", "c"};

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
    }
}
