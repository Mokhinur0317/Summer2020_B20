package rep.it_practice;

public class String_Bigger {
    public static void main(String[] args) {
        String str = "orange";
        String str2 = "apple";

        String bigger = "";
        if (str.length() > str2.length()){
            bigger = str;
        } else {
            bigger = str2;
        }
        System.out.println(bigger);

    }
}
