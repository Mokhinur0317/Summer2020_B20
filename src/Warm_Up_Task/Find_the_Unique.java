package Warm_Up_Task;

public class Find_the_Unique {
    public static void main(String[] args) {
       String name =   Unique("Cybertek");
        System.out.println(name);


    }


    public static String Unique(String str){
    String unique  = "";
    for (int j = 0; j <= str.length() -1; j++) {
        char ch1 = str.charAt(j);
        int count = 0;
        for (int i = 0; i <= str.length() - 1; i++) {
            char eachChar = str.charAt(i);
            if (ch1 == eachChar) {
                count += 1;
            }
        }

        if (count == 1) {
            unique += ch1;
        }
    }
    return unique;
}

}
