package rep.it_practice;

public class StringLimit {
    public static void main(String[] args) {
        String str = "longgggWord";
        String str2 = "foo";
//        String newStr = limit(str,2);
//        System.out.println(newStr);

        String allTogether = at3(str,str2);
        System.out.println(allTogether);

    }


    public static String at3(String target,String word){
        String wordHalf = target.substring(0,3);
        String rest = target.substring(wordHalf.length());;
        String allTogether = wordHalf +word +rest;
        return  allTogether;



    }









//    public static String limit(String text, int maxLength)
//    {
//     String newStr = "";
//     newStr = text.substring(0,maxLength);
//     return  newStr;
//
//    }



}
