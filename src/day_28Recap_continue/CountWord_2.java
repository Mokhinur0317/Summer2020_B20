package day_28Recap_continue;

public class CountWord_2 {
    public static void main(String[] args) {
        String str = "catdogcatdogcat".toLowerCase();
        int  countCat = 0;
        int countDog = 0;

        // (0 , 3 )

        for (int i = 0; i <= str.length() - 3; i++){
            String  newStr = str.substring(i, i + 3);
            if(newStr.equals("cat")){
                countCat++;
            }else  if (newStr.equals("dog")){
                countDog++;
            }
        }

        System.out.println("number of cats : " + countCat);
        System.out.println("number of dogs : " + countDog);

        System.out.println("===================   Python  ================================");

        String python = "pythonjavapythonjava".toLowerCase();
        int countPython = 0;

        for (int i =0; i <= python.length() - 6; i++) {
            String newPython = python.substring(i, i + 6);
            if (newPython.equals("python")) {
                countPython++;
            }
        }
        System.out.println("Count of python : " + countPython);
    }
}
