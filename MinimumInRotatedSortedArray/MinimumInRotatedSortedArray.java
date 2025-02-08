class Solution {
    public int findMin(int[] nums, int target) {
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            if(nums[0] == target){
                return 0;
            }else{
                return -1; 
            }
        }
        int left_pivot = 0;
        int right_pivot = nums.length - 1;
        while(left_pivot < right_pivot){
            int middle = left_pivot + (right_pivot - left_pivot) / 2;
            if(nums[middle] > nums[right_pivot]){
                left_pivot = middle + 1;
            }else if(nums[middle] <= nums[right_pivot]){
                right_pivot = middle;
            }
        }
        int left = left_pivot;
        int right = nums.length - 1;
        while(left <= right){
            int middle = left + (right - left) / 2;
            if(nums[middle] == target){
                return middle;
            }else if(nums[middle] > target){
                right = middle - 1;
            }else{
                left = middle + 1;
            }
        }
        left = 0;
        right = left;
        while(left <= right){
            int middle = left + (right - left) / 2;
            if(nums[middle] == target){
                return middle;
            }else if(nums[middle] > target){
                right = middle - 1; 
            } else{
                left = middle +1 ;
            }
        }
        return -1;
    }
}
public class MinimumInRotatedSortedArray {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(sol.findMin(arr, 1));
    }
}
