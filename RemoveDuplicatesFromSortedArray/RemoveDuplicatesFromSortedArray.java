import java.util.Arrays;

class Solution {
    public int removeDuplicates(int[] nums) {
        int idx = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i - 1]){
                nums[idx++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        return idx;
    }
}

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(sol.removeDuplicates(arr));
    }
}
