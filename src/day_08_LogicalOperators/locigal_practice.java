package day_08_LogicalOperators;

public class locigal_practice {
    public static void main(String[] args) {
        //
        String first_name = " Moki ";
        String last_name =   " Vafoeva ";
        String  full_name = first_name + last_name;
         int age = 23;
          String  citizinship = " USA ";

          boolean  eligible_vote = age >= 19  && citizinship == "USA ";  // true
         //                          19 >= 18 &&  " usa " == " usa ""
                //                       true   &&     true
      //  System.out.println(eligible_vote);
        System.out.println( full_name + " is eligible to vote :" + eligible_vote );




        //    or logic     ||  it means eatheir

      String fullName = " Moki Vafoeva ";
      int Age = 15;
      String country = " USA ";

      boolean Eligible_toVote = age >= 18 || country == " USA ";
          //                        false ||     true === true
        System.out.println(full_name + " is eligible to vote : " + Eligible_toVote);

        System.out.println(" =========================================================================");

         boolean r8 = true == !false || false == true;
        System.out.println( r8);

        boolean r9 = !false == false || true == !false;
                     //   false   ||    true

        //  r9 = !false == false  &&  true == !false;
        //                     //   false   ||    true
        System.out.println( r9);


    }
}
