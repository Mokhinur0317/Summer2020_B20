package day_13Scanner;
import java.util.Scanner;

public class SalaryAfterTax {
    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in);
        System.out.println("Please enter your annual salary: ");

        int annualSalary = user_input.nextInt();
        System.out.println("Enter your state rate:");
        double stateTax = user_input.nextDouble();

        double totalStateTax = annualSalary * stateTax;
        System.out.println("Enter your fedaral tax rate:");
        double federalTaxRate = user_input.nextDouble();
        double federalTax = annualSalary *federalTaxRate;

        double salaryAfterTax = annualSalary - stateTax -federalTax;

        System.out.println("your salary: $ "+ annualSalary);
        System.out.println("your state tax : $ " + stateTax);
        System.out.println("your federal tax: $ "+ federalTax);
        System.out.println("your salary after tax: $" + salaryAfterTax);
    }
}
