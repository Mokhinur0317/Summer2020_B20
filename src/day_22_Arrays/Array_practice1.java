package day_22_Arrays;

public class Array_practice1 {
    public static void main(String[] args) {
        // regular String
        String str = "Moki";

        //   Arrays String
        String[] students =  {"Moki" , "Ali" , "Dots"};
        //                      0        1        3
        String  name1  =   students[1];
        System.out.println(name1);
        System.out.println("=================================");

        int [] scores = { 85 , 70 , 95 , 90 , 100};       // 5
        //                0     1    2   3      4
        String [] names = {"Mike", "Adam", "Tonny", "John", "Amy"};     // size 5
        //                   0       1        2       3       4

//        System.out.println(names[0] + " : " +  scores[0]);
//        System.out.println(names[1] + " : " + scores[1]);
//        System.out.println(names[2] + " : " + scores[2]);
//        System.out.println(names[3] + " : " + scores[3]);
//        System.out.println(names[4] + " : " + scores[4]);

        for(int  i = 0 ; i <= 4; i++ ){     // i: 0 , 1 , 2, 3, 4
            System.out.println(names[i] + " : " + scores[i]);
        }

        System.out.println("=========================================");

        String [] classmate = new String[4];  // size is 5
        classmate[0] = "Moki";
        classmate[1] = "Ali";
        classmate[2] = "Dudka";
        classmate[3] = "Dots";

        for (int i = 0 ; i <= classmate.length - 1; i++){
            System.out.println(classmate[i]);
        }
        System.out.println("==========================================");

        String[] grocery = {"apple", "banana" , "strawberry" , "mango"};
        double [] price = {   5.99,    2.99 ,   6.99,       4.99};

        for (int i = 0; i <= 3; i++){
            System.out.println(grocery[i] + ": $" + price[i]);
        }



    }
}
