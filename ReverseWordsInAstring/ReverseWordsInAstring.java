class Solution {
    public String reverseWords(String s) {
        if(s.length() == 0){
            return s;
        }
        int left = 0;
        int right = s.length() - 1;
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length()- 1; i++) {
            if(s.charAt(i) != ' '){
                str.append(s.charAt(i));
                if(s.charAt(i + 1) == ' '){
                    str.append(' ');
                }
            }
        }
        System.out.println(str);
        return "";
    }
}
public class ReverseWordsInAstring {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.reverseWords("the sky is blue"));
        System.out.println(sol.reverseWords("  hello world  "));
    }
}
