package rep.it_practice;

public class String_OfDigits {
    public static void main(String[] args) {
        String str = "aa10aa";
        String strOfNum = extractNum(str);
        System.out.println(strOfNum);


    }

    public static String extractNum(String s) {
        String strOfNum = "";

        for (int i = 0; i <= s.length()-1; i++){
            boolean b = Character.isDigit(s.charAt(i));
            if (b == true){
                strOfNum += "" + s.charAt(i);
            }
        }

       return strOfNum;
    }


    }




