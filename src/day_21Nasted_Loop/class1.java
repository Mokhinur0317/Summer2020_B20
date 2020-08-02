package day_21Nasted_Loop;

public class class1 {
    public static void main(String[] args) {
        String a = "ababcc";
         a = a.toUpperCase();

        a = a.toLowerCase();
        for ( char Char = 'a'; Char <= 'z'; Char++) {
            int count = 0;
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == Char) {
                    count++;
                }
            }
            System.out.println("Number of occurences of " + Char + " is " + count);
        }
    }

}
