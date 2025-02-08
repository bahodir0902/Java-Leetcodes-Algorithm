class Solution {
    public double myPow(double x, int n) {
        Long l = new Long(n);
        if(n == 0){
            return 1;
        }
        double result = 1;
        if(l <= -1){
            for (int i = 0; i < l * -1; i++) {
                result = x * result;
            }
            result = 1 / result;
        }else{
            for (int i = 0; i < l; i++) {
                result = x * result;
            }
        }
        
        return result;
    }
}

public class power {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.myPow(2.00000, -2));
    }
}
