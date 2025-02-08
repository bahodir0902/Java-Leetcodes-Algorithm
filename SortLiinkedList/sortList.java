class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 0){
            return false;
        }
        StringBuilder str = new StringBuilder();
        int i = 0;
        while(i < s.length()){
            Character ch = s.charAt(i);
            if(!(ch >= 32 && ch <= 47) && !(ch >= 58 && ch <= 64) && !(ch >= 91 && ch <= 96) && !(ch >= 123 && ch <= 126)){
                if(ch >= 65 && ch <= 90){
                    ch = Character.toLowerCase(ch);
                }
                str.append(ch);
            }
            ++i;
        }
        System.out.println(str);
        int left = 0;
        int right = str.length() - 1;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

public class sortList {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(sol.isPalindrome("race a car"));
    }
    
}
