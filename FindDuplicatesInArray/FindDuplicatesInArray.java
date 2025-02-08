import java.util.ArrayList;
import java.util.List;
import java.util.LinkedHashMap;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        System.out.println(map);
        List<Integer> lst = new ArrayList<Integer>();
        for(int i : map.keySet()){
            if(map.get(i) >= 2){
                lst.add(i);
            }
        }
        return lst;
    }
}

public class FindDuplicatesInArray {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> lst = new ArrayList<Integer>();
        lst = sol.findDuplicates(arr);
        System.out.println(lst);
    }   
}
