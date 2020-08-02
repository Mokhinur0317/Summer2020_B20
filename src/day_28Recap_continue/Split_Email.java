package day_28Recap_continue;

public class Split_Email {
    public static void main(String[] args) {
        String str = "cybertek@gmail.com";
        String name = str.substring(0, str.indexOf('@'));
        System.out.println(name);
        String domain = str.substring(str.indexOf('@') + 1, str.indexOf('.')) ;
        System.out.println(domain);


    }
}
