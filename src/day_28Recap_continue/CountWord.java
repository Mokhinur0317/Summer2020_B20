package day_28Recap_continue;

public class CountWord {
    public static void main(String[] args) {
        String str = "javaJavajavajava".toLowerCase();    // 4 java
        int count = 0;

        for (int i = 0; i <= str.length() - 4 ; i++) {   // i :0 , 1 , 2, 4
            String newStr = str.substring(i, i + 4);
            if (newStr.equals("java")){
                count++;
            }
        }

        System.out.println(count);            // 4 java






    }
}
