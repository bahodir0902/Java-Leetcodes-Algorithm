class Solution {

    private int sqrt(int n){
        int left = 0;
        int right = n;
        while(left <= right){
            int middle = left + (right - left) / 2;
            int value = middle * middle;
            if(value == n){
                return middle;
            }else if(value > n){
                right = middle - 1;
            }else{
                left = middle + 1;
            }
        }
        return right;
    }

    public boolean isPowerOfTwo(int n) {
        for (int i = 0; i < sqrt(n) + 1; i++) {
            
            if(Math.pow(2, i) == n){
                return true;
            }
        }
        return false;
    }
}

public class isPowerOfTwo {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.isPowerOfTwo(1));
        System.out.println(sol.isPowerOfTwo(16));
        System.out.println(sol.isPowerOfTwo(3));
    }
}
