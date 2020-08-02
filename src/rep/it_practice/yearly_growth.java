package rep.it_practice;

class Main {
    public static void main(String[] args) {
        int growth = 0;
        int year = 1;
        // while growth is less then 10 growth++;
        while(year < 11){

            if (year <= 3){
                System.out.println("year " + year + " - growth 1 cm" );
                System.out.println("tree size:" + growth+"cm");
                growth += 1;

            } else {
                growth =  growth += 2;
                System.out.println("year " + year + " growth 2cm" );
                System.out.println("tree size:" + growth+"cm");
            }
            year++;
        }



    }
}