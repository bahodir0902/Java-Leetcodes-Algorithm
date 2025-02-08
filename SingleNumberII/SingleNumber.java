import java.util.HashMap;

class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        System.out.println(map);
        for(int i : map.keySet()){
            if(map.get(i) == 1){
                return i;
            }
        }
        return 0;
    }
}
public class SingleNumber {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {2,2,3,2};
        int[] arr2 = {0,1,0,1,0,1,99};
        System.out.println(sol.singleNumber(arr));
        System.out.println(sol.singleNumber(arr2));
    }
}
