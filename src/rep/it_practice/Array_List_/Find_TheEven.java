package rep.it_practice;
import  java.util.*;
import java.util.function.Predicate;

public class Find_TheEven {
    public static void main(String[] args) {

       ArrayList<Integer> nums = new ArrayList<>();
       nums.addAll( Arrays.asList(1,2,3,-4,-7,-9));

       ArrayList<Integer> sumOfEven = appendPosSum(nums);
        System.out.println(sumOfEven);

    }

public  static ArrayList<Integer> appendPosSum(ArrayList<Integer> arrList){
    Predicate<Integer> oddNums = p -> p < 0;
    arrList.removeIf(oddNums);
    int sum = 0;
    for (int i = 0; i <= arrList.size()-1 ; i++){
        sum += arrList.get(i);
    }
    arrList.add(sum);
    return  arrList;

}


}
