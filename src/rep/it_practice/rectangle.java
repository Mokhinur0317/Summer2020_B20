package rep.it_practice;

public class rectangle {

    public static void regtangle() {
        for (int i = 0; i <= 4; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i <= 2; i++) {
            System.out.println("*" + "   " + "*") ;
        }

        for (int i = 0; i <= 4; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        regtangle();
    }

}