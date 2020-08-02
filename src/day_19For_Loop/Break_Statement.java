package day_19For_Loop;

public class Break_Statement {
    public static void main(String[] args) {
        for (int i = 0; i < 5 ; i++){
            System.out.println("Hello");
            break;
        }
        System.out.println("=========================");

        for (char ch = 'A'; ch <= 'H'; ch++ ){
            System.out.print(ch+ " ");
            if (ch == 'C'){
                break;
            }
        }
        System.out.println();
        System.out.println("===========================");


        for (int i = 10; i <= 50; i += 10){
            System.out.print(i +" ");
            if(i == 30){
                break;
            }
        }
        System.out.println();
        System.out.println("============================");

        for (int x = 1000; x >= 100; x -=100){    //  x== 10000, 900, 800,700, 600, 500,
            System.out.print(x + " ,");
            if (x == 500){
                break;    // exits the Loop
            }
        //    System.out.print(x + " ,"); // 1000,900,800,700,600, it doesnt give 500
        }







    }
}
