import java.lang.reflect.Array;
import java.util.Arrays;

class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
        for (; j < nums.length; ++j) {
            if(nums[j] == 0){
                ++j;
                continue;
            }
            if(nums[j] != 0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                ++i;
                ++j;
            }if(nums[i] == 0){
                continue;
            }
        }
    }
}


public class MovesZeros {
    public static void main(String[] args) {
        Solution sol =new Solution();
        int[] arr = {0,1,0,3,12};
        sol.moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}
