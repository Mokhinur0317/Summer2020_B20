package day_12Switch_Scanner;

public class Switch_practice2 {
    public static void main(String[] args) {

        String productName = "iphone";

        switch (productName){

            case "galaxy":
                System.out.println("Samsung");
                break;

          // case "iphone":
               // System.out.println("Apple");
               // break;
            case "iphone":
            case "Macbook":
            case "ipad":
                    System.out.println("Apple");
                    break;
        }
        System.out.println("==========================================================");
                                            //   or logic here
                  int daysInMonths = 21;
              String result2 = "";
        switch (daysInMonths) {
            case 2:
                result2 = " 28 days";
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                result2 = "30 days";
                break;

            case 1:
            case 3:        // im noot using boolean were just giving the options
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                result2 = " 31 days";
                break;

            default:
                result2 = "Invalid ";
                break;
        }

        System.out.println(result2);




    }
}
