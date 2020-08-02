package day_05_ArifmatikOperation;

public class E_info_newFuture {
    public static void main(String[] args) {

        String first_name = "Moki";
        String last_name = "vf";
        char gender = 'F';
        byte age = 23;
        String company_name ="Tesla";
        String job_title = "SDET";
        boolean isFull_time = false;
        boolean is_Married = true;
        double salary = 120000.50;

        //==========================================================

       String  full_name = first_name + " "+ last_name;

       //==========================================================

        System.out.println("Employee full name is: " + full_name);
        System.out.println(full_name +"  gender is "+ gender);
        System.out.println(full_name  + " age is :" + age +" years old");
        System.out.println(full_name + " job title is::"+job_title );
        System.out.println(full_name +  " salary is " + salary);
        System.out.println(full_name + "  is:" + isFull_time);
        System.out.println(full_name + " is " + is_Married);


    }
}
