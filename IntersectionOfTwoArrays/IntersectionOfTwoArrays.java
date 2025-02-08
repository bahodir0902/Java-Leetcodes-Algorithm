import java.util.Arrays;
import java.util.HashSet;


class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if(set.contains(nums2[i])){
                result.add(nums2[i]);
            }
        }  
        int[] arr = new int[result.size()];
        int i = 0;
        for(int val : result){
            arr[i++] = val;
        }
        return arr;

    }
}

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr1 = {1};
        int[] arr2 = {1};
        System.out.println(Arrays.toString(sol.intersection(arr1, arr2)));
    }
}
