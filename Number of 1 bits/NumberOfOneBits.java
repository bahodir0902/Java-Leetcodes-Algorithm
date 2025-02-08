import java.util.Stack;

class Solution {
    public int hammingWeight(int n) {
        Stack<Integer> stack = new Stack<>();
        while(n > 0){
            stack.push(n % 2);
            n /= 2;
        }
        
        String str_int = "";
        while(!stack.empty()){
            str_int += Integer.toString(stack.pop());
        }
        int count = 0;
        for (int i = 0; i < str_int.length(); i++) {
            if(Integer.parseInt(str_int.charAt(i) + "") == 1){
                count++;
            }
        }
        return count;
    }
}

public class NumberOfOneBits {
    public static void main(String[] args){
        Solution sol = new Solution();
        System.out.println(sol.hammingWeight(128));
        

    }
}
