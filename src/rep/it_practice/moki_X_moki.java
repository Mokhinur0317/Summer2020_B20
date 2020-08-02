package rep.it_practice;
import  java.util.Scanner;
public class moki_X_moki {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = "moki";//scan.next();
        String separator = "X"; //scan.next();
        int count = 3; //scan.nextInt();
        System.out.println("this is given string " + word);
        String new_word = word;
        System.out.println(new_word + " This is new word clone of word");
        for (int i = 0; i <= count -2 ; i++){
            if (count == 1){
                System.out.println(word);
            }else{
                System.out.println("this is index " + i + " and new word before changing " + new_word);
                new_word += separator + word;
                System.out.println("this is index " + i + " and new word after changing " + new_word);
            }
        }
        System.out.println(new_word);
    }
}
