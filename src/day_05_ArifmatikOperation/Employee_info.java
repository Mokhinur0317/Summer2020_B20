package day_05_ArifmatikOperation;

public class Employee_info {
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

   // if change the variable data to something else  output will also changed to the ne one

        System.out.println("First_Name: "+ first_name);
        System.out.println("Last_name: " + last_name);
        System.out.println("Gender; " + gender);
        System.out.println("E_age : " + age);
        System.out.println("J_title:" + job_title);
        System.out.println("Full_or_Part: " +isFull_time );
        System.out.println("E_status :" +is_Married);
        System.out.println("E_salary: " + salary);


        System.out.println("Employee full name is: " + first_name+" " +last_name);
        System.out.println(first_name +last_name +"  gender is "+ gender);
        System.out.println(first_name+" " +last_name  + " age is :" + age +" years old");
        System.out.println(first_name + " "+ last_name+ " job title is::"+job_title );
        System.out.println(first_name + " "+ last_name+  " salary is " + salary);
        System.out.println(first_name + " "+ last_name+ "  is:" + isFull_time);
        System.out.println(first_name + " "+ last_name+ " is " + is_Married);

    }
}
