package day_06;

public class salary_calculater {
    public static void main(String[] args) {
         double rate = 50;
         double state_tax = 0.04;
         double federal_tax = 0.2;
          int weekly_hours = 45;

          double salary = rate * weekly_hours * 48;
          double total_tax = salary *( state_tax+ federal_tax);


        System.out.println(salary);
        System.out.println(total_tax);

    }
}
