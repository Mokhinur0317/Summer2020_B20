package day_09_Ifstatement;

public class if_statement {
    public static void main(String[] args) {

        boolean hasID = true;
        int age = 21;

        boolean eligible = hasID && age >= 21;
        //                   true &&  false ==== false

        String result = "";

        if (eligible == true ){
           // System.out.println(" Costumer can get a drink ");
            result ="Costumer can get a drink";
        }
        if (eligible == false){
           // System.out.println("Sorry, ur too young to buy alcohol");
            result = "Sorry, ur too young to buy alcohol";
        }
        System.out.println(result);




    }
}
