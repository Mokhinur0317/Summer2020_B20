package day_31_Recap_CostumM;

public class String_Frequency {

    public static int frequency(String str, char ch){
        int count = 0;
        for (char each : str.toCharArray()){
            if (each == ch){
                  count++;
            }
        }
        return count;
    }
//=========================================================================




    public static void main(String[] args) {
        String str = "aabccda";
        String uniques = "";

     for (int i = 0; i <= str.length() -1; i++) {
         char ch = str.charAt(i);
         int count = frequency(str, ch);
         if (count == 1) {
             uniques += ch;
         }
     }

        System.out.println("Unique char is : " + uniques);


        System.out.println("================ next approach =============");
        String unique_2 = "";
        for (char each : str.toCharArray()){
            int count = frequency(str,each);
            if (count == 1){
                unique_2 += each;
            }
        }

        System.out.println(unique_2);


        System.out.println("=================   new approach  ===================");

             String str2 = "aaccb";
             String unique_char = uniques(str2);
        System.out.println(unique_char);
    }

//=================================================================================

    public  static String uniques(String str){
        String unique_2 = "";
        for (char each : str.toCharArray()){
            int count = frequency(str,each);
            if (count == 1){
                unique_2 += each;
            }
        }
        return unique_2;

    }




}
