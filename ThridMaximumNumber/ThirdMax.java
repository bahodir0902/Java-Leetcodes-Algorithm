import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {  
    public int thirdMax(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if(nums[j] > nums[j + 1]){
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i - 1]){
                nums[j++] = nums[i];
            }
        }
        
        int[] arr = new int[j];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = nums[i];
        }
        System.out.println(Arrays.toString(arr));

        if(arr.length == 3){
            return arr[0];
        }else if(arr.length < 3){
            return arr[arr.length - 1];
        }else{
            return arr[arr.length - 3];
        }
    }
}

public class ThirdMax {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {2,2,1};
        System.out.println(sol.thirdMax(arr));
    }
}
