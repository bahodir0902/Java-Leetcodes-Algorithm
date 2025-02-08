import java.util.HashMap;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        if(nums == null) return false;
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                return true;
            }else{
                map.put(nums[i], 1);
            }
        }
        return false;
    }
}

public class ContainsDuplicate {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr1 = {1,2,3,1};
        int[] arr2 = {1,2,3,4};
        System.out.println(sol.containsDuplicate(arr1));
        System.out.println(sol.containsDuplicate(arr2));
    }
}
