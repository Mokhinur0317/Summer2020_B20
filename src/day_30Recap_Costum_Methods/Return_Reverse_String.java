package day_30Recap_Costum_Methods;

public class Return_Reverse_String {

    public static void Reverse(String str){
        for (int i = str.length()-1; i>=0 ; i--){
            String result = "";
            result += str.charAt(i);
            System.out.print(result);
        }
    }

    public static void main(String[] args) {
        String str = "Level";
        Reverse(str);


         String newName = Reverse_2(str);

         if (str.equalsIgnoreCase(newName)){
             System.out.println("they are polandrome");
         }



    }




    //===============================================

    public static String Reverse_2(String str){
        String result = "";
        for (int i =str.length()-1; i >=0; i--){
            result += str.charAt(i);
        }
        return result;
    }
}
