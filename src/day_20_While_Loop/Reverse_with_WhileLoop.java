package day_20_While_Loop;

public class Reverse_with_WhileLoop {
    public static void main(String[] args) {
        //     while loop
        String name = "Cybertek";
        int i = name.length()-1;
        while (i >= 0 ){
            System.out.print(""+name.charAt(i));
            i--;
        }
    }
}
