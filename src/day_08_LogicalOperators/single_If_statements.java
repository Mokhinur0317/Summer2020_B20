package day_08_LogicalOperators;

public class single_If_statements {
    public static void main(String[] args) {
      int   person_age = 20;
      boolean can_getDrink = person_age >= 18;

       if( can_getDrink == true ) {
            System.out.println("Costumer can buy the drink");
        }

       int a = 20;
       int b = 20;

        if (a > b ){
            System.out.println(a +" is the larger number");
        }
        if( b > a ) {
            System.out.println( b + " is the larger number");
        }

        if ( a == b ){
            System.out.println(" both are equil ;");
        }


        boolean breakTime = false;
        if (breakTime==true ){
            System.out.println( " take 15 mins break .");     // true
        }
        if (breakTime == false){
            System.out.println( " keep studying");
        }







    }
}
