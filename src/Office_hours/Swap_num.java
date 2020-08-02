package Office_hours;
import java.util.Arrays;
public class Swap_num {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 44, 1, 100, 55};

        int middle = nums.length / 2;
        int left = 0;
        int right  = nums.length - 1;

        for (int i = 0; i < middle; i++){
            int swapping_element = nums[right];
            nums[right] = nums[left];
            nums[left] = swapping_element;
            right--;
            left++;

        }
        System.out.print(Arrays.toString(nums));
        System.out.println();
    }
}
