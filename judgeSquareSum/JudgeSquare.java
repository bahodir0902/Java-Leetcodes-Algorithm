class Solution {
    public boolean judgeSquareSum(int c) {
        long end = (long) Math.sqrt(c);
        long start = 0;
        while (start <= end){
            if((start * start) + (end * end) > c){
                --end;
            }else if((start * start) + (end * end) == c){
                return true;
            }else if((end * end) < c && ((start * start) + (end * end) < c) ){
                ++start;
            }
        }
        return false;
    }
}

public class JudgeSquare {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.judgeSquareSum(36));
        System.out.println(sol.judgeSquareSum(3));
    }
}
