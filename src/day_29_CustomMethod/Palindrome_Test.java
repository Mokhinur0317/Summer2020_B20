package day_29_CustomMethod;

public class Palindrome_Test {

    public static void palindrome (String word){

        String reversed = "";
        for (int i = word.length() -1; i >= 0; i--){
            reversed += word.charAt(i);
        }

        if (word.equalsIgnoreCase(reversed)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }


    public static void main(String[] args) {
        palindrome("Madam");
    }
}
