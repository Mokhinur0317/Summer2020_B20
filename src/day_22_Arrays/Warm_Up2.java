package day_22_Arrays;

import javax.swing.*;

public class Warm_Up2 {
    public static void main(String[] args) {
        String[] languages = {"Java", "C++", "python",};
        String longest_name = "";
        String smallest_name = languages[0];

//        Array is a collection type it has lenght/count
        for (int i = 0; i <= languages.length - 1; i++){
            String language = languages[i];
            if (language.length() > longest_name.length()){
                 longest_name = language;
            }

            if (language.length() < smallest_name.length()){
                smallest_name = language;

            }
//            if (languages[i].equals(languages[i].toLowerCase())) {
//                System.out.println(languages[i]);
//            } else {
//                System.out.println(languages[i] + " Contains capital letter");
//            }
        }
        System.out.println("This is the longest lang from Array " + longest_name);
        System.out.println("This is the smallest lang from Array " + smallest_name);

    }
}
