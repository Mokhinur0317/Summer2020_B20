package rep.it_practice;

public class String_practice {
    public static void main(String[] args) {
         String  str  = "abXabXa";
         int num = 3;
         int count =0;

         String FirstTwoChar = str.substring(0,2);
        System.out.println(FirstTwoChar);

        for (int i =0; i <= str.length() -1; i++){
            if (str.contains(FirstTwoChar)){
                count++;
                str = str.replaceFirst(FirstTwoChar, "");
            }
        }

        if (count >= num){
            System.out.println("true");
        }else {
            System.out.println("false");
        }



    }
}
