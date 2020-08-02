package day_31_Recap_CostumM;

public class RevErse_String {

    public static String Reverse_str(String str){
        String newStr = "";
        for (int i = str.length() -1; i >= 0; i--){
             newStr +=  str.charAt(i);
        }
        return newStr;
    }


    public static void main(String[] args) {
         String name = "madam";
        String Reverse_str =  Reverse_str(name);   // its reversing the original String  which is name
        System.out.println(Reverse_str);
        System.out.println(name.equals(Reverse_str));   // true
    }
}
