package rep.it_practice;

public class Polindrome {
    public static void main(String[] args) {
        String str = "Nurses Run";
        String newStr = "";
        boolean b = isPalindrome(str);
        System.out.println(b);

    }



    public static boolean isPalindrome(String check) {
        check = check.replaceAll(" ", "");
        String newStr = "";
        boolean b ;
        for (int i = check.length() -1; i >= 0; i--){
            newStr +="" + check.charAt(i);
        }
        if ( check.equalsIgnoreCase(newStr)){
            b = true;
        }else {
            b = false;
        }
        return b;

    }



}
