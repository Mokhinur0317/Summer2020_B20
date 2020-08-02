package day_3_sequenses_variables;
/*
       tatal tax= salary * tax
       salaryafter tax = salary - tax
 */

public class Salary_Calculater {
    public static void main(String[] args) {

        int salary = 100000;
        double tax = 0.28;
     //   System.out.println(salary * tax);
        double tatal_tax= salary * tax;// 28000
      //  System.out.println(tatal_tax);
        double salaryAftertax = salary-tatal_tax;//7200

        System.out.println(salaryAftertax);
        System.out.println("==========================");


    }
}
