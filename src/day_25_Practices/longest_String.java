package day_25_Practices;

public class longest_String {
    public static void main(String[] args) {
        String[] languages = {"java", "C++" , "python", "javascript"};
        int minLength = languages[0].length();
        int maxLength = languages[0].length();

        for (String each : languages){
            int eachElement = each.length();
            if (eachElement > maxLength){
                maxLength = eachElement;
            }
        }
        System.out.println(maxLength);

        for (String each : languages){
            if (each.length() == maxLength){
                System.out.println(each);
            }
        }

    }
}
