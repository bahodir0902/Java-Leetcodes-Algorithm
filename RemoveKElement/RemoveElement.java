import java.util.Arrays;

class Solution {
    public int removeElement(int[] nums, int val) {
        // if(nums.length == 0){
        //     return 0;
        // }
        // int right = nums.length - 1;
        // for (int i = 0; i <= right; i++) {
        //     if(nums[i] == val){
        //         while(right > i &&nums[right] == val){
        //             --right;
        //         }
        //         if (right > i) {
        //             nums[i] = nums[right];
        //             right--;
        //         }
        //     }
        // }
        // System.out.println(Arrays.toString(nums));
        // return right + 1;
        int k = 0;  // index to place the next non-val element

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not equal to val, move it to the front
            if (nums[i] != val) {
                nums[k++] = nums[i];
            }
        }

        // The array is now modified such that the first k elements are not equal to val
        System.out.println("Modified array: " + Arrays.toString(nums));
        return k;  // k represents the number of elements that are not equal to val
    }
}

public class RemoveElement {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {2};
        System.out.println(sol.removeElement(arr, 3));
    }    
}
