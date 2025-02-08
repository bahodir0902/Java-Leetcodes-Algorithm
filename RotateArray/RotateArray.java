import java.util.Arrays;

class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length == 0 || nums.length == 1 || k == 0){
            return;
        }
        int size = nums.length;
        k = k % size;
        if(k == 0){
            return;
        }
        int to_rotate_index = size - k;
        int[] start_array = new int[to_rotate_index];
        int[] end_array = new int[k];
        for (int i = 0; i < to_rotate_index; i++) {
            start_array[i] = nums[i];
        }
        int j = 0;
        for (int i = to_rotate_index; i < nums.length; i++, j++) {
            end_array[j] = nums[i];
        }

        for (int i = 0; i < j; i++) {
            nums[i] = end_array[i];
        }
        int n = 0;
        for (int i = j; i < nums.length; i++, n++) {
            nums[i] = start_array[n];
        }
    }
}

public class RotateArray {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1,2,3,4,5,6,7};
        sol.rotate(arr, 3);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i != arr.length - 1){
                System.out.print("->");
            }
        }
    }
}
