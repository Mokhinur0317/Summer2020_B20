package day_19For_Loop;

public class Characters_A_to_Z {
    public static void main(String[] args) {

        for(char ch = 'A'; ch <= 'Z'; ++ch){
            System.out.print(ch+ " ,");
        }
             System.out.println();

        for (char ch = 97; ch <= 122; ch++){
            System.out.print(ch + " ,");
        }

        //==================================================================================================
        System.out.println();

        for (char ch = 'Z'; ch >= 'A'; --ch){
            System.out.print(ch + " ,");          // back       first way
        }
        System.out.println();


        for (int i = 90; i >= 65; --i){
            System.out.print((char)i + " ,");        //   back   same output but different way
        }
        System.out.println();





    }
}
