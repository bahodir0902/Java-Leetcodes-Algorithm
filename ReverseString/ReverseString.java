class Solution {
    public void reverseString(char[] s) {
        int len = s.length;
        int i = 0;
        int j = len - 1;
        while(i <= j){
            char temp = s[i];
            s[i++] = s[j];
            s[j--] = temp;
        }
        
    }
    
}

public class ReverseString {
    public static void main(String[] args) {
        Solution sol = new Solution();
        char[] arr = {'h', 'e', 'l', 'l', 'o'};
        sol.reverseString(arr);
        System.out.println(arr);
    }
}
