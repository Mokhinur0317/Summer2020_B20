package day_24_Array;

public class UniqueWords {
    public static void main(String[] args) {
        String[] words = {"C#","C#", "Java", "C#" , "C++"};
        for (int j = 0; j <= words.length -1; j++) {

            String first = words[j];
            int count = 0;  // to assign the frequency of first
            //  1 + 1
            for (int i = 0; i <= words.length - 1; i++) {
                String each = words[i];  // C#, java, C#, C++
                if (first.equals(each)) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println(first);
            }

        }

    }
}
