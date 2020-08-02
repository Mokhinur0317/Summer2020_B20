package day_29_CustomMethod;

public class Remove_duplicate {

    public static void Remove(String str){


             String result = "";
            for(int i = 0; i <= str.length()-1; i++){
                String s = ""+str.charAt(i); // a, a, b, b
                if ( !result.contains(s)){     // if the character is already contained in result, we will no
                    result += s;
                }
            }
            System.out.println(result);
        }


    public static void main(String[] args) {
        Remove("ababababababa");
    }
    }

