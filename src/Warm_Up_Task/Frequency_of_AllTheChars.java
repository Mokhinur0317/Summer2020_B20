package Warm_Up_Task;

public class Frequency_of_AllTheChars {
    public static void Frequency_All(String str) {

        String nonDup = "";
        String result = "";

        // Remove duplicates:
            for(int i =0; i <= str.length()-1; i++ ){
                String newStr = ""+str.charAt(i);
                if( ! nonDup.contains(newStr)){   //   if nondub doesnt contain  newStr
                    nonDup += newStr;                 // then assign newStr to nonDup
                }
            }
            for(int j = 0; j <= nonDup.length()-1; j++){

                char ch1 = nonDup.charAt(j);
                int count1 = 0;
                for(int i = 0; i <= str.length()-1; i++){
                    char each = str.charAt(i);
                    if(each == ch1){
                        count1 += 1;
                    }
                }
                result +=  ""+ch1+count1;

            }
            System.out.println(result);



      }

    public static void main(String[] args) {
        Frequency_All("abcabbabcc");
    }
   }
