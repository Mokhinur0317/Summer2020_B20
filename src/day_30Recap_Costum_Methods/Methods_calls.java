package day_30Recap_Costum_Methods;
import Library.Util_1;
public class Methods_calls {
    public static void main(String[] args) {
        String str = "abcdbbbabbababababa";
       String newStr =  Util_1.Remove(str);
        System.out.println(newStr);
    }
}
