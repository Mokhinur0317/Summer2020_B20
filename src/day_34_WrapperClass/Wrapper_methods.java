package day_34_WrapperClass;

public class Wrapper_methods {
    public static void main(String[] args) {
        String str = "123";
        // in order to get 123 as a number from String
        int num =  Integer.parseInt(str);
        System.out.println(num);

        Double num1 =  Double.parseDouble("7.5");
        System.out.println(num1 - 1);

        String str1 = "true";
        boolean b =  Boolean.parseBoolean(str1);
        System.out.println(b);    // true


//=============================================================
        System.out.println("           NEXT METHODS        ");

        String str2 = "100.5";
        Double d =   Double.valueOf(str2);
        System.out.println(d);

        String str3 = "False";
        boolean b1 =   Boolean.valueOf(str3);
        System.out.println(b1);    // unbox



    }
}
