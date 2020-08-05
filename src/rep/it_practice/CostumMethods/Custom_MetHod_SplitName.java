package rep.it_practice;

public class Custom_MetHod_SplitName {

    public static  void person(String str){
        int index  = str.indexOf(',');
        int index2 = str.lastIndexOf(',');

        String name = str.substring(0, index);
        String last = str.substring(index+1,index2);
        String age = str.substring(index2+1);

        System.out.println("person name:" + name+" last name:"+ last+ " age:" +age);

    }

    public static void main(String[] args) {
          String str = "jon,doe,30";
          person(str);
    }
}
