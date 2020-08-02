package day_08_LogicalOperators;

public class practice_02 {
    public static void main(String[] args) {
        String first_name = "Conar";
        String last_name = " McNugget";
        String full_name= first_name + last_name;
      int age = 45;
      String citizen1 = " Irland";
      String citizen2 = " France";

      boolean eligible_age = age >= 18;
                       //   21  >= 18 ==== true

       boolean  usCitizen = citizen1 == " USA" ||  citizen2 ==" USA ";
                    //         irland == USA  ||       France == USA
               //                 false     ||        folse      ====== false

       boolean eligible_vote = eligible_age && usCitizen ;
       //                         true   &&  false   ======== false
        System.out.println( eligible_vote);
        System.out.println(full_name + " is eligible ti vote for Trump " + eligible_vote);





    }
}
