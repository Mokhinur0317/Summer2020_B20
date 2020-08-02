package Warm_Up_Task;

public class ReUgral_farmat {
    public static void main(String[] args) {
        String str = "cyBertek";
        String str2 = "scHool";

        String NewStr = ReUgral_Farnat(str,str2);
        System.out.println(NewStr);

    }

    public static String ReUgral_Farnat(String str, String str2){

        str =  str.toUpperCase();
        str2 =  str2.toUpperCase();

        char First = str.charAt(0);
        String rest = str.substring(1).toLowerCase();
        String full = ""+First + rest;



        char Second = str2.charAt(0);
        String rest2 = str2.substring(1).toLowerCase();
        String full2 = ""+Second + rest2;
        return  full + " " + full2;

           }

    }

