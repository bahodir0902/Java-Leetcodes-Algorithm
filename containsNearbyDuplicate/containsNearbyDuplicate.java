import java.util.HashMap;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])){
                map.put(nums[i], i);
            }else{
                if(Math.abs(i - map.get(nums[i])) <= k){
                    return true;
                }else{
                    map.put(nums[i], i);
                }
            }
        }
        return false;
    }
}

public class containsNearbyDuplicate {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr1 = {1,2,3,1};
        int[] arr2 = {1,0,1,1};
        int[] arr3 = {1,2,3,1,2,3};
        System.out.println(sol.containsNearbyDuplicate(arr1, 3));
        System.out.println(sol.containsNearbyDuplicate(arr2, 1));
        System.out.println(sol.containsNearbyDuplicate(arr3, 2));
    }
}
